package com.xiaojianbang.ndk;
import com.alibaba.fastjson.util.IOUtils;
import com.github.unidbg.AndroidEmulator;
import com.github.unidbg.Emulator;
import com.github.unidbg.Module;
import com.github.unidbg.Symbol;
import com.github.unidbg.arm.HookStatus;
import com.github.unidbg.arm.backend.Unicorn2Factory;
import com.github.unidbg.arm.context.Arm32RegisterContext;
import com.github.unidbg.arm.context.RegisterContext;
import com.github.unidbg.debugger.DebuggerType;
import com.github.unidbg.hook.HookContext;
import com.github.unidbg.hook.ReplaceCallback;
import com.github.unidbg.hook.hookzz.Dobby;
import com.github.unidbg.hook.hookzz.HookEntryInfo;
import com.github.unidbg.hook.hookzz.HookZz;
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
import com.github.unidbg.memory.Memory;
import com.github.unidbg.pointer.UnidbgPointer;
import com.github.unidbg.utils.Inspector;
import com.sun.jna.Pointer;

import java.io.File;

import org.omg.PortableInterceptor.Interceptor;



public class NativeHelper extends AbstractJni  {

    private final AndroidEmulator emulator;
    private final VM vm;
    private final Module module;

    private final DvmClass NativeHelper;

    private final boolean logging;

    NativeHelper(boolean logging) {
        this.logging = logging;

        emulator = AndroidEmulatorBuilder.for64Bit()
                .setProcessName("com.xiaojianbang.app")
                .addBackendFactory(new Unicorn2Factory(true))
                .build(); // 创建模拟器实例，要模拟32位或者64位，在这里区分
        final Memory memory = emulator.getMemory(); // 模拟器的内存操作接口
        memory.setLibraryResolver(new AndroidResolver(23)); // 设置系统类库解析 19或者23 目前只有这两个 获取内存操作接口
        vm = emulator.createDalvikVM(); // 创建Android虚拟机
        // vm.setJni(new AbstractJni() {});
        vm.setJni(new AbstractJni() {
           //处理so调用系统
            @Override
            public DvmObject<?> callObjectMethodV(BaseVM vm, DvmObject<?> dvmObject,String signature,VaList vaList){
                //自己补环境自己去写调用的so方法
                //通过signature 知道so 调用的是啥方法 java/lang/String->getBytes(Ljava/lang/String;)[B
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
        });

        //当类继承了 AbstractJni 可以直接这样写 向上转型 在后面又重写了callObjectMethodV方法，上面与下面两种方式均可
        vm.setJni(this);


        vm.setVerbose(logging); // 设置是否打印Jni调用细节
        // 加载libxiaojianbang到unicorn虚拟内存，加载成功以后会默认调用init_array等函数
        //若目标函数还引用了其他so中的函数，需要把导入表中的函数所在的so也找到 也进行导入即可
        //枚举导入表，拿到地址，通过地址获取so基址即可找到so
        //unidbg 已经处理dlopen 加载了libl.so
        //unidbg 首先加载了一些系统函数 在加载我们的so之前
        DalvikModule dmA = vm.loadLibrary(new File("unidbg-master/unidbg-android/src/test/java/com/xiaojianbang/ndk/libxiaojianbangA.so"), false); 
        DalvikModule dm = vm.loadLibrary(new File("unidbg-master/unidbg-android/src/test/java/com/xiaojianbang/ndk/libxiaojianbang.so"), false); 
        dm.callJNI_OnLoad(emulator); // 手动执行JNI_OnLoad函数 看自己的函数需要不需要jnionload 如果需要就需要调用不需要注释掉即可 动态注册就需要jnionload
        module = dm.getModule(); // 加载好的libxiaojianbang.so对应为一个模块
        // module.callFunction(emulator, symbolName, args) 针对so做操作
        //可以resolve多个类
        NativeHelper = vm.resolveClass("com/xiaojianbang/ndk/NativeHelper"); //加载类的一个过程
    
    }
  
    void destroy() {
        IOUtils.close(emulator);
        if (logging) {
            System.out.println("destroy");
        }
    }

    public static void main(String[] args) throws Exception {
        NativeHelper test = new NativeHelper(false);
        int retval = test.jadd();
        test.jmd5();
        test.jencode();
        test.cadd();
        test.cstrcat();
        test.mstrcat();
        test.pstrcat();
        test.pmd5();
        System.out.println("retval =>" + retval + " hex =>" + Integer.toHexString(retval));
        test.destroy();
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




    //由于继承了AbstractJni 所以直接在后面进行补环境即可
    @Override
    public DvmObject<?> callObjectMethodV(BaseVM vm, DvmObject<?> dvmObject,String signature,VaList vaList){
        //自己补环境自己去写调用的so方法
        //通过signature 知道so 调用的是啥方法 java/lang/String->getBytes(Ljava/lang/String;)[B
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

}
