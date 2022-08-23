package com.xiaojianbang.ndk;
import com.alibaba.fastjson.util.IOUtils;
import com.github.unidbg.AndroidEmulator;
import com.github.unidbg.Emulator;
import com.github.unidbg.Module;
import com.github.unidbg.Symbol;
import com.github.unidbg.arm.HookStatus;
import com.github.unidbg.arm.backend.Backend;
import com.github.unidbg.arm.backend.CodeHook;
import com.github.unidbg.arm.backend.UnHook;
import com.github.unidbg.arm.backend.Unicorn2Factory;
import com.github.unidbg.arm.context.Arm64RegisterContext;
// import com.github.unidbg.arm.context.Arm32RegisterContext;

import com.github.unidbg.arm.context.RegisterContext;
import com.github.unidbg.debugger.Debugger;
import com.github.unidbg.debugger.DebuggerType;
import com.github.unidbg.file.FileResult;
import com.github.unidbg.file.IOResolver;
import com.github.unidbg.hook.HookContext;
import com.github.unidbg.hook.IHook;
import com.github.unidbg.hook.ReplaceCallback;
import com.github.unidbg.hook.hookzz.Dobby;
import com.github.unidbg.hook.hookzz.HookEntryInfo;
import com.github.unidbg.hook.hookzz.HookZz;
import com.github.unidbg.hook.hookzz.HookZzArm64RegisterContext;
import com.github.unidbg.hook.hookzz.IHookZz;
import com.github.unidbg.hook.hookzz.InstrumentCallback;
import com.github.unidbg.hook.hookzz.WrapCallback;
import com.github.unidbg.hook.xhook.IxHook;
import com.github.unidbg.linux.android.AndroidEmulatorBuilder;
import com.github.unidbg.linux.android.AndroidResolver;
import com.github.unidbg.linux.android.XHookImpl;
import com.github.unidbg.linux.android.dvm.AbstractJni;
import com.github.unidbg.linux.android.dvm.BaseVM;
import com.github.unidbg.linux.android.dvm.DalvikModule;
import com.github.unidbg.linux.android.dvm.DvmClass;
import com.github.unidbg.linux.android.dvm.DvmObject;
import com.github.unidbg.linux.android.dvm.StringObject;
import com.github.unidbg.linux.android.dvm.VM;
import com.github.unidbg.linux.android.dvm.VaList;
import com.github.unidbg.linux.android.dvm.array.ByteArray;
import com.github.unidbg.linux.file.ByteArrayFileIO;
import com.github.unidbg.linux.file.SimpleFileIO;
import com.github.unidbg.memory.Memory;
import com.github.unidbg.pointer.UnidbgPointer;
import com.github.unidbg.utils.Inspector;
import com.sun.jna.Pointer;

import javafx.geometry.Orientation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import javax.jws.WebParam.Mode;
import javax.print.DocFlavor.STRING;

import org.omg.CORBA.REBIND;
import org.omg.PortableInterceptor.Interceptor;



public class NativeHelper extends AbstractJni implements IOResolver {
    
    //unidbg 支持dobby hookzz whale xhook
    //hookzz是dobby的前身 hookzz 对32位支持较好 dobby对64位支持较好
    //unidbg 支持unicorn 自带的hook
    //需要掌握原生unicorn hook 以及console debugger
    //原生unicorn hook不容易被检测
    //console debugger 可下多个断点 用于快速验证
    //hook的作用 和 frida差不多 unidbg hook 不容易被检测
    //unidbg没办法模拟子线程中 
    //hookzz支持 符号hook 地址hook 但是本质都是地址hook
    private final AndroidEmulator emulator;
    private final VM vm;
    private final Module module;

    private final DvmClass NativeHelper;

    private final boolean logging;
    Pointer md5_ctx;


    NativeHelper(boolean logging) {
        this.logging = logging;
        emulator = AndroidEmulatorBuilder.for64Bit()
                .setProcessName("com.xiaojianbang.app")
                .addBackendFactory(new Unicorn2Factory(true))
                //创建虚拟文件系统 给一个文件路径 指定根目录路径  虚拟文件系统的优先级比IOResolver io重定向的优先级低
                //但是要注意对于maps这种文件来说 依然不生效 unidbg内部给了maps 并且使用的是IOResolver io重定向
                .setRootDir(new File("unidbg-0.9.7/unidbg-android/src/test/java/com/xiaojianbang/ndk/rootfs")) 
                .build(); // 创建模拟器实例，要模拟32位或者64位，在这里区分
        System.out.println(emulator.getFileSystem().getRootDir()); //获取当前模拟器的root路径
        System.out.println(emulator.getPid()); //获取pid 但是pid每次都不一样 所以最好固定下来或者将文件中的pid改掉
        final Memory memory = emulator.getMemory(); // 模拟器的内存操作接口
        memory.setLibraryResolver(new AndroidResolver(23)); // 设置系统类库解析 19或者23 目前只有这两个 获取内存操作接口
        // emulator.set(key, value); 设置系统的环境变量
        // emulator.get(key); 获取系统的环境变量
        //修改环境变量
        //unidbg-0.9.7\unidbg-android\src\main\java\com\github\unidbg\linux\AndroidElfLoader.java AndroidElfLoader 中添加了环境变量
        //所以修改环境变量 AndroidElfLoader.java文件 中的这块代码 this.environ = initializeTLS 直接改就行
        //unidbg对于多线程目前没有处理的
        //所以要hook pthrea
        //https://github.com/asmjmp0/unidbgMutilThread 支持多线程的arm32版本的unidbg
        //也可以通过getenv 获取环境变量
        vm = emulator.createDalvikVM(); // 创建Android虚拟机
        // vm.setJni(new AbstractJni() {});
        // vm.setJni(new AbstractJni() {
        //    //处理so调用系统
        //     @Override
        //     public DvmObject<?> callObjectMethodV(BaseVM vm, DvmObject<?> dvmObject,String signature,VaList vaList){
        //         //自己补环境自己去写调用的so方法
        //         //通过signature 知道so 调用的是啥方法 java/lang/String->getBytes(Ljava/lang/String;)[B
        //         System.out.println("signature:"+signature);
        //         if(signature.equals("java/lang/String->getBytes(Ljava/lang/String;)[B")){
        //             String args = (String)dvmObject.getValue();
        //             System.out.println("args:"+args);
        //             byte[] strBytes = args.getBytes();
        //             return new ByteArray(vm, strBytes);

        //         }
        //         //直接调用父类的方法 最偷懒的办法
        //         return super.callObjectMethodV(vm, dvmObject, signature, vaList);
        //     }
        // });
        //当类继承了 AbstractJni 可以直接这样写 向上转型 在后面又重写了callObjectMethodV方法，上面与下面两种方式均可
        vm.setJni(this);
        vm.setVerbose(logging); // 设置是否打印Jni调用细节
        // 加载libxiaojianbang到unicorn虚拟内存，加载成功以后会默认调用init_array等函数
        //若目标函数还引用了其他so中的函数，需要把导入表中的函数所在的so也找到 也进行导入即可
        //枚举导入表，拿到地址，通过地址获取so基址即可找到so
        //unidbg 已经处理dlopen 加载了libl.so
        //unidbg 首先加载了一些系统函数 在加载我们的so之前
        DalvikModule dmA = vm.loadLibrary(new File("unidbg-0.9.7/unidbg-android/src/test/java/com/xiaojianbang/ndk/libxiaojianbangA.so"), false);
        //遇到so依赖可以 loadLibrary加载 也可以使用虚拟module
        // new XIAOJIANBANGAModule(emulator,vm).register(memory); //相当于加载so，把自己写的so实现注册到内存中去
        DalvikModule dm = vm.loadLibrary(new File("unidbg-0.9.7\\unidbg-android\\src\\test\\java\\com\\xiaojianbang\\ndk\\libxiaojianbang.so"), false); 
        dm.callJNI_OnLoad(emulator); // 手动执行JNI_OnLoad函数 看自己的函数需要不需要jnionload 如果需要就需要调用不需要注释掉即可 动态注册就需要jnionload
        module = dm.getModule(); // 加载好的libxiaojianbang.so对应为一个模块
        // module.callFunction(emulator, symbolName, args) 针对so做操作
        //可以resolve多个类
        NativeHelper = vm.resolveClass("com/xiaojianbang/ndk/NativeHelper"); //加载类的一个过程
        emulator.getSyscallHandler().addIOResolver(this); //进行注册 要实现io重定向的话
    
    }
  
    void destroy() {
        IOUtils.close(emulator);
        if (logging) {
            System.out.println("destroy");
        }
    }



    //j开头是通过定位java中的native方法来调用
    int jadd() {
        int retval = NativeHelper.callStaticJniMethodInt(emulator, "add(III)I", 0x100,0x200,0x300);
        return retval;
    }

    void jmd5() {
        //需要补环境 因为md5 这个方法 在so层 还调用了其他so方法
        StringObject retval = NativeHelper.callStaticJniMethodObject(emulator,"md5(Ljava/lang/String;)Ljava/lang/String;",new StringObject(vm, "xiaojianbang"));
        System.out.println("md5 =>"+retval.getValue());
    }

    void jencode() {
        //动态注册 需要调用jni，只有调用了jni 才会放到unidb中的nativemaps，才会被解析到

        StringObject retval = NativeHelper.callStaticJniMethodObject(emulator, "encode()Ljava/lang/String;");
        System.out.println("encode =>" + retval.getValue());
    }


    //c开头是通过定位so中的方法来调用,并且一定要是在汇编中的名字
    //这种方式时是最本质的方式
    void cadd() {
        //以下的步骤封装在callStaticJniMethodInt
        //获取到symble后先判断一下 symble是否为null
        Symbol symbol= module.findSymbolByName("Java_com_xiaojianbang_ndk_NativeHelper_add");
        DvmObject dvm = NativeHelper.newObject(null);
        System.out.println("dvm =>" + vm.addLocalObject(dvm));
        System.out.println("obj hashcode =>" + dvm.hashCode());
        //vm.addLocalObject(NativeHelper) 相当于jclass， vm.addLocalObject(NativeHelper.newObject(null)) 相当于jobject 不管是 jclass还是jobject 都需要丢入到 vm.addLocalObject 以引用的方式传入
        int retval = symbol.call(emulator, vm.getJNIEnv(), vm.addLocalObject(NativeHelper), 100,200,300).intValue();
        System.out.println("retval =>" + retval);
    }

    void cstrcat(){
        //以下的步骤封装在callStaticJniMethodObject
        Symbol symbol = module.findSymbolByName("_Z7_strcatP7_JNIEnvP7_jclass");
        //如果返回的是int类型 则intValue已经返回的是结果了
        int retval = symbol.call(emulator, vm.getJNIEnv(),vm.addLocalObject(NativeHelper)).intValue();
        //如果是java的object对象，则需要vm.getObject获取对象之后再获取value
        //如果返回的是地址 通过 emulator.getMemory().pointer(retval).getByteArray(offset, arraySize)
        System.out.println("retval =>" + vm.getObject(retval).getValue());
    }

    void mstrcat(){
        //本质和上面没区别
        Number result = module.callFunction(emulator, "_Z7_strcatP7_JNIEnvP7_jclass",vm.getJNIEnv(),vm.addLocalObject(NativeHelper));
        int retval = result.intValue();
        System.out.println("retval =>" + vm.getObject(retval).getValue());

    }


    void pstrcat(){
        //通过偏移调用函数
        //偏移地址也有加1不加1 的问题
        Number result =  module.callFunction(emulator, 0x1B4C, vm.getJNIEnv(),vm.addLocalObject(NativeHelper));
        int retval = result.intValue();
        System.out.println("retval =>" + vm.getObject(retval).getValue());
    }


    void pmd5(){
        //结构体本质上 是一段连续的数据，但是由于结构体里面数据类型不一致，存在内存对齐，所以给出足够的内存就行，所以要构造内存数据
        //所以可以直接调用MD5.INIT方法,第一个参数是结构体
        //申请内存
        UnidbgPointer md5ctx = emulator.getMemory().malloc(200, false).getPointer();
        //只需要调用帮我们初始化结构体，不需要返回值
        module.callFunction(emulator, 0x2230, md5ctx);
        //构建明文数据
        UnidbgPointer plaintext = emulator.getMemory().malloc(200, false).getPointer();
        byte[] buffer = "xiaojianbang".getBytes();
        plaintext.write(buffer);
        //md5 的update方法
        module.callFunction(emulator, 0x22A0,md5ctx,plaintext,buffer.length);
        //取结果 final 
        //final 第二个参数是密文 也是指针需要空间
        UnidbgPointer ciphertext = emulator.getMemory().malloc(16, false).getPointer();
        //也不需要返回值 返回值就在内存里面
        module.callFunction(emulator, 0x3A78,md5ctx,ciphertext);
        //直接读内存获取密文
        byte[] byteArray = ciphertext.getByteArray(0,16);
        Inspector.inspect(byteArray,"md5result");
    }


    void hookzz_md5(){
        IHookZz hookzz  = HookZz.getInstance(emulator);
        // hookzz.enable_arm_arm64_b_branch(); // 可有可无
        //RegisterContext 是 Arm32RegisterContext Arm64RegisterContext 的父类 访问寄存器用的
        //先执行precall，执行原函数，在执行postcall

        hookzz.wrap(module.findSymbolByName("_Z9MD5UpdateP7MD5_CTXPhj"),new WrapCallback<RegisterContext>() {
            @Override
            public void preCall(Emulator<?> emulator,RegisterContext ctx,HookEntryInfo info){
                //获取 参数
                md5_ctx = ctx.getPointerArg(0);
                Pointer md5_plain = ctx.getPointerArg(1);
                int len_ = ctx.getIntArg(2);
                Inspector.inspect(md5_ctx.getByteArray(0, 64),"md5_ctx");
                Inspector.inspect(md5_plain.getByteArray(0, len_), "preCall md5_plain");
            }
            @Override
            public void postCall(Emulator<?> enmulator, RegisterContext ctx,HookEntryInfo info){
                Inspector.inspect(md5_ctx.getByteArray(0, 64),"postCall md5_ctx");
            }

        });
        StringObject md5_result = NativeHelper.callStaticJniMethodObject(emulator, "md5(Ljava/lang/String;)Ljava/lang/String;", new StringObject(vm, "xiaojianbang"));
        System.out.println(md5_result.getValue());
    }


    void hookzz_inlinehook(){
        //汇编级别的hook 可以hook函数的中间部分
        IHookZz hookzz = HookZz.getInstance(emulator);
        //使用偏移地址进行hook，也要有+1 不加1 的问题
        hookzz.instrument(module.base+0x1AEC,new InstrumentCallback<Arm64RegisterContext>() {
            @Override
            //dbiCall 我们指令执行的时候 可以操作模拟器 寄存器
            public void dbiCall(Emulator<?> emulator,Arm64RegisterContext ctx,HookEntryInfo info){
                System.out.println("w8:" + Integer.toHexString(ctx.getXInt(8)) + "w9:" + Integer.toHexString(ctx.getXInt(9)) );
                
            }
            
        });

        //主动调用
        int retval = NativeHelper.callStaticJniMethodInt(emulator, "add(III)I", 0x100,0x200,0x300);
        System.out.println(retval);

    }

    void get_arg(){
        //HOOK 无修改
        IHookZz hookzz = HookZz.getInstance(emulator);
        hookzz.wrap(module.findSymbolByName("_Z12jstring2cstrP7_JNIEnvP8_jstring"),new WrapCallback<RegisterContext>() {
            @Override
            public void preCall(Emulator<?> emulator,RegisterContext ctx,HookEntryInfo hookinfo){
                //获取第2个参数 得到stringobject
                StringObject arg0 = vm.getObject(ctx.getIntArg(1));
                System.out.println("arg0 =>" + arg0.getValue());
            } 
            @Override
            public void postCall(Emulator<?> emulator,RegisterContext ctx,HookEntryInfo hookinfo){
                //获取返回值 获取w0或者x0
                byte[] revtal = ctx.getPointerArg(0).getByteArray(0, 16);
                Inspector.inspect(revtal, "revtal => ");
                //也可以
                // Arm64RegisterContext CTX.getXPointer.getByteArray

            }
        });
        //主动调用
        Number result =  module.callFunction(emulator, "_Z12jstring2cstrP7_JNIEnvP8_jstring", vm.getJNIEnv(),vm.addLocalObject(new StringObject(vm, "xiaojianbang")));
        //获取结果
        long cstringaddr = result.longValue(); //获得是c语言的string 是个指针
        //直接读内存
        byte[] revtal = emulator.getMemory().pointer(cstringaddr).getByteArray(0, 16);
        Inspector.inspect(revtal, "get_arg");
    }


    void get_arg_set_xlong(){
        //修改寄存器
        //HOOK
        IHookZz hookzz = HookZz.getInstance(emulator);
        hookzz.wrap(module.findSymbolByName("_Z12jstring2cstrP7_JNIEnvP8_jstring"),new WrapCallback<HookZzArm64RegisterContext>() {
            @Override
            public void preCall(Emulator<?> emulator,HookZzArm64RegisterContext ctx,HookEntryInfo hookinfo){
                //获取第2个参数 得到stringobject
                StringObject arg0 = vm.getObject(ctx.getIntArg(1));
                System.out.println("arg0 =>" + arg0.getValue());
            } 
            @Override
            public void postCall(Emulator<?> emulator,HookZzArm64RegisterContext ctx,HookEntryInfo hookinfo){
                //读取返回值
                String revtal = ctx.getXPointer(0).getString(0);
                System.out.println("result =>" + revtal);
                //修改返回
                int hashcode = vm.addLocalObject(new StringObject(vm, "xiaojianbang_replcae"));
                ctx.setXLong(0, hashcode);
                //由于上面修改返回值返回的是jsting，所以下面主动调用时取返回值要变
                //获取返回值 获取w0或者x0
                // byte[] revtal = ctx.getXPointer(0).getByteArray(0, 16);
                // Inspector.inspect(revtal, "revtal => ");
            }
        });
        //主动调用
        Number result =  module.callFunction(emulator, "_Z12jstring2cstrP7_JNIEnvP8_jstring", vm.getJNIEnv(),vm.addLocalObject(new StringObject(vm, "xiaojianbang")));
        //获取结果
        int hashcode = result.intValue(); //获得是c语言的string 是个指针
        StringObject jstring =  vm.getObject(hashcode);
        System.out.println(jstring);
        
    }

    void hook_replace(){
        //hook代码 替换之后依然可以调用原函数

        IHookZz hookzz = HookZz.getInstance(emulator);
        hookzz.replace(module.findSymbolByName("Java_com_xiaojianbang_ndk_NativeHelper_md5"), new ReplaceCallback(){
            @Override
            public HookStatus onCall(Emulator<?> emulator,HookContext context,long orginFunction){
                //自己的函数
                System.out.println("replaced");
                //又调用了原函数 也可以不调用 调用原函数有两种方式
                // return HookStatus.RET(emulator, orginFunction); //调用原函数
                // return super.onCall(emulator,context,orginFunction); //调用原函数

                //如果不调用原函数 就要这样返回，如果自己给了返回值 在主动调用时需要去改
                return HookStatus.LR(emulator, 100);

            }
        });

        //主动触发
        int md5result = NativeHelper.callStaticJniMethodInt(emulator, "md5(Ljava/lang/String;)Ljava/lang/String;", new StringObject(vm, "xiaojianbang"));
        System.out.println(md5result);
    }

    //Unicorn api 进行hook时 不需要考虑地址+1问题，会自己转换
    //Unicorn 原生的hook功能强大，而且不容易被检测
    void unicorn_hook(){
        //hook 代码
        emulator.getBackend().hook_add_new(new CodeHook() {
            @Override
            public void hook(Backend backend,long address,int size,Object user){
                //从module.base + 0x1FE8, module.base + 0x1FF8 两条指令之间 每执行一条指令 会执行此块中的代码
                // System.out.println(user); 
                //打印调用栈
                //栈只有一层是无法打印的

                emulator.getUnwinder().unwind();
                RegisterContext context = emulator.getContext();
                if(address == 0x1FF4){
                    UnidbgPointer md5_ctx = context.getPointerArg(0);
                    Inspector.inspect(md5_ctx.getByteArray(0, 20),"md5_ctx");
                    UnidbgPointer plain = context.getPointerArg(1);
                    Inspector.inspect(plain.getByteArray(0, context.getIntArg(2)),"plain");
                }else if (address == module.base + 0x2004){
    
                    UnidbgPointer ciphertext = context.getPointerArg(1);
                    Inspector.inspect(ciphertext.getByteArray(0, 16),"ciphertext");

                }
            }
            @Override
            public void onAttach(UnHook unhook){

            }
            @Override
            public void detach(){

            }
            //user_data的作用 当需要外部的值传递时 可以使用user_data进行传递
            //module.base + 0x1FE8, module.base + 0x2004, "xiaojianbang"
        }, module.base + 0x22A0, module.base + 0x22A0, "xiaojianbang");

        //主动调用
        StringObject retval = NativeHelper.callStaticJniMethodObject(emulator,"md5(Ljava/lang/String;)Ljava/lang/String;",new StringObject(vm, "xiaojianbang"));
        System.out.println("md5 =>"+retval.getValue());

    }


    void unicorn_debug(){
        //unicorn 动态调试 断点触发后 会显示寄存器信息汇编指令
        //先打断点
        //到达断点后 可以输入指令 按两下回车 指令提示
        //c 继续执行到下一个断点 bt 打印堆栈 n 步进 mx0查看寄存器x0的内存 m(address) 查看地址内容 b(address) 下在address下断点
        Debugger debugger = emulator.attach();
        debugger.addBreakPoint(module.base+0x1FF4);
        // debugger.addBreakPoint(module.base+0x1AEC);

        //主动调用
        StringObject retval = NativeHelper.callStaticJniMethodObject(emulator,"md5(Ljava/lang/String;)Ljava/lang/String;",new StringObject(vm, "xiaojianbang"));
        System.out.println("md5 =>"+retval.getValue());
        
    }

    void unicorn_monitor(){
        //定义文件名字
        //监控内存读写
        String traceFile = "yourpath";
        PrintStream traceStream = null;
        //构建输出流
        try{
            //默认在项目根目录
            traceStream = new PrintStream(new FileOutputStream(traceFile),true);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        //监控读 参数 起始地址 结束地址 
        //setRedirect 用来做重定向
        emulator.traceRead(module.base,module.base+module.size).setRedirect(traceStream);
        //监控写 参数 起始地址 结束地址 
        emulator.traceWrite(module.base,module.base+module.size).setRedirect(traceStream);


        //
        //主动调用
        StringObject retval = NativeHelper.callStaticJniMethodObject(emulator,"md5(Ljava/lang/String;)Ljava/lang/String;",new StringObject(vm, "xiaojianbang"));
        System.out.println("md5 =>"+retval.getValue());
    }

    void unidbg_trace(){
        //记录执行了哪些汇编语句
        //基本写法 无法打印寄存器的值
        //通过修改源码达到打印变动的寄存器的值
        String traceFile = "yourpath";
        PrintStream traceStream = null;
        try{
            traceStream = new PrintStream(new FileOutputStream(traceFile),true);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

        emulator.traceCode(module.base,module.base+module.size).setRedirect(traceStream);
        //也可以增加内存读写
        emulator.traceRead(module.base,module.base+module.size).setRedirect(traceStream);
        //监控写 参数 起始地址 结束地址 
        emulator.traceWrite(module.base,module.base+module.size).setRedirect(traceStream);
        
        //主动调用
        int retval = NativeHelper.callStaticJniMethodInt(emulator, "add(III)I", 0x100,0x200,0x300);
        System.out.println(retval);

    }


    void read_something(){
        //处理系统读取文件
        //自己补maps
        //实现io重定向要去实现IOResolver 
        //还可以使用虚拟文件系统
        //主动带哦用
        NativeHelper.callStaticJniMethod(emulator, "readSomething()");
        System.out.println("1");
    }

    @Override
    public FileResult resolve(Emulator emulator, String pathname, int oflags) {
        //实现io重定向要去实现IOResolver
        //当需要读取文件时 会转到这个地方执行
        //推荐任何时候都去处理一下这个问题
        //resolve优先级高于虚拟文件系统
    
        if(pathname.equals("/proc/self/maps")){
            //第一种方式以文件的形式返回
            return FileResult.success(new SimpleFileIO(oflags, new File("unidbg-0.9.7\\unidbg-android\\src\\test\\java\\com\\xiaojianbang\\ndk\\maps"), pathname));
            //第二种以字符串常量的方式返回 适合字符串短的时候
            //从内存种返回文件读取之后的结果
            //如果每次运行 文件中的值不一样 那最好 固定下来读取进来改掉在返回 比如pid
            // return FileResult.success(new ByteArrayFileIO(oflags, pathname, "xiaojianbangmaps".getBytes()));
        }
        System.out.println(pathname);
        return null;
    }


    void solve_env(){
    
        
        // emulator.set(key, value); 设置系统的环境变量
        // emulator.get(key); 获取系统的环境变量
        //修改环境变量
        //unidbg-0.9.7\unidbg-android\src\main\java\com\github\unidbg\linux\AndroidElfLoader.java AndroidElfLoader 中添加了环境变量
        //所以修改环境变量 AndroidElfLoader.java文件 中的这块代码 this.environ = initializeTLS 直接改就行
        //通过hook 也可以修改环境变量
        Symbol setenv = module.findSymbolByName("setenv",true);
        setenv.call(emulator,"path","xxx",0);

    }



    //由于继承了AbstractJni 所以直接在后面进行补环境即可
    @Override
    public DvmObject<?> callObjectMethodV(BaseVM vm, DvmObject<?> dvmObject,String signature,VaList vaList){
        //自己补环境自己去写调用的so方法
        //通过signature 知道so 调用的是啥方法 java/lang/String->getBytes(Ljava/lang/String;)[
        System.out.println("signature:"+signature);
        if(signature.equals("java/lang/String->getBytes(Ljava/lang/String;)[B")){
            String args = (String)dvmObject.getValue();
            System.out.println("args:"+args);
            byte[] strBytes = args.getBytes();
            return new ByteArray(vm, strBytes);

        }
        //直接调用父类的方法 最偷懒的办法
        return super.callObjectMethodV(vm, dvmObject, signature, vaList);
    }


    
    public static void main(String[] args) throws Exception {
        NativeHelper test = new NativeHelper(true);
        // int retval = test.jadd();
        // test.jmd5();
        // test.jencode();
        // test.cadd();
        // test.cstrcat();
        // test.mstrcat();
        // test.pstrcat();
        // test.pmd5();
        // System.out.println("retval =>" + retval + " hex =>" + Integer.toHexString(retval));
        // test.destroy();
        // test.hookzz_md5();
        // test.hookzz_inlinehook();
        // test.get_arg();
        // test.get_arg_set_xlong();
        // test.hook_replace();
        // test.unicorn_hook();
        // test.unicorn_debug();
        // test.unicorn_monitor();
        // test.read_something();
    }



}
