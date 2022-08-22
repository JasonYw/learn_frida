package com.xiaojianbang.ndkdemo;
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
// import com.github.unidbg.arm.context.Arm64RegisterContext;
import com.github.unidbg.arm.context.RegisterContext;
import com.github.unidbg.debugger.Debugger;
import com.github.unidbg.debugger.DebuggerType;
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
import com.github.unidbg.linux.android.dvm.DvmField;
import com.github.unidbg.linux.android.dvm.DvmMethod;
import com.github.unidbg.linux.android.dvm.DvmObject;
import com.github.unidbg.linux.android.dvm.StringObject;
import com.github.unidbg.linux.android.dvm.VM;
import com.github.unidbg.linux.android.dvm.VaList;
import com.github.unidbg.linux.android.dvm.VarArg;
import com.github.unidbg.linux.android.dvm.array.ArrayObject;
import com.github.unidbg.linux.android.dvm.array.ByteArray;
import com.github.unidbg.linux.android.dvm.array.IntArray;
import com.github.unidbg.memory.Memory;
import com.github.unidbg.pointer.UnidbgPointer;
import com.github.unidbg.utils.Inspector;
import com.sun.jna.Pointer;

import javafx.geometry.Orientation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.channels.NonWritableChannelException;
import java.util.Arrays;

import javax.jws.WebParam.Mode;
import javax.print.DocFlavor.STRING;

import org.omg.CORBA.REBIND;
import org.omg.PortableInterceptor.Interceptor;



public class CallNDKDemo extends AbstractJni  {
    
    private final AndroidEmulator emulator;
    private final VM vm;
    private final Module module;
    private final DvmClass CallNDKDemo;

    private final boolean logging;
    Pointer md5_ctx;


    CallNDKDemo(boolean logging) {
        this.logging = logging;

        emulator = AndroidEmulatorBuilder.for64Bit()
                .setProcessName("com.xiaojianbang.ndkdemo")
                .addBackendFactory(new Unicorn2Factory(true))
                .build(); // 创建模拟器实例，要模拟32位或者64位，在这里区分
        final Memory memory = emulator.getMemory(); // 模拟器的内存操作接口
        memory.setLibraryResolver(new AndroidResolver(23)); // 设置系统类库解析 19或者23 目前只有这两个 获取内存操作接口
        vm = emulator.createDalvikVM(); // 创建Android虚拟机
        // vm.setJni(new AbstractJni() {});
        vm.setJni(new AbstractJni() {
            //主要是补环境
            //当涉及到自己开发的java类需要把java类放到unidbg工程中
            //如果类中有android的东西的话 需要用java去实现
            //包名最后与原先一致
            //resolveClass 时全部是app中的路径
            //访问修饰符的问题 可以把private改成public 还可以使用反射
            //参数的获取
            //vaList.getObjectArg(index);
            //vaList.getIntArg(index);
            @Override
            public DvmObject<?> callObjectMethodV(BaseVM vm, DvmObject<?> dvmObject,String signature,VaList vaList){
                //自己补环境自己去写调用的so方法
                //通过signature 知道so 调用的是啥方法 java/lang/String->getBytes(Ljava/lang/String;)[B
                System.out.println("signature:"+signature);
                if(signature.equals("java/lang/Class->getClassLoader()Ljava/lang/ClassLoader;")){
                    return vm.resolveClass("java/lang/ClassLoader").newObject(null);

                }else if(signature.equals("com/xiaojianbang/ndkdemo/NDKDemo->privateFunc(Ljava/lang/String;I)Ljava/lang/String;")){
                    //由于非静态方法 所以先获取对象
                    NDKDemo ndkdemo = (NDKDemo) dvmObject.getValue();
                    //获取参数
                    StringObject args0 = vaList.getObjectArg(0);
                    int args1 = vaList.getIntArg(1);
                    return new StringObject(vm,ndkdemo.privateFunc(args0.getValue(), args1));
                    
                }
                //直接调用父类的方法 最偷懒的办法
                return super.callObjectMethodV(vm, dvmObject, signature, vaList);
            }

            @Override
            public DvmObject<?> allocObject(BaseVM vm, DvmClass dvmClass, String signature) {
                // so调用java类 
                // 首先要补全类
                if(signature.equals("com/xiaojianbang/ndkdemo/NDKDemo->allocObject")){
                    // new NDKDemo()
                    return vm.resolveClass("com/xiaojianbang/ndkdemo/NDKDemo").newObject(null);
                }

                return super.allocObject(vm, dvmClass, signature);
            }

            @Override
            //根据报错看需要补什么
            public DvmObject<?> newObjectV(BaseVM vm, DvmClass dvmClass, String signature, VaList vaList) {
                // TODO Auto-generated method stub
                if(signature.equals("com/xiaojianbang/ndkdemo/NDKDemo-><init>(Ljava/lang/String;I)V")){
                    //获取参数
                    StringObject args0 =  vaList.getObjectArg(0);
                    int args1 =  vaList.getIntArg(1);
                    //创建自己写的好的java类的对象
                    com.xiaojianbang.ndkdemo.NDKDemo ndkdemo =  new NDKDemo(args0.getValue(),args1);
                    //将创建好的对象包装成dvm obj
                    return vm.resolveClass("com/xiaojianbang/ndkdemo/NDKDemo").newObject(ndkdemo);
                }
                return super.newObjectV(vm, dvmClass, signature, vaList);
                
            }
            
            @Override
            public DvmObject<?> getStaticObjectField(BaseVM vm, DvmClass dvmClass, String signature) {
                // TODO Auto-generated method stub
                if(signature.equals("com/xiaojianbang/ndkdemo/NDKDemo->privateStaticStringField:Ljava/lang/String;")){
                    //String要记得包装成string object 由于这个变量是static 跟这类走的 所以可以直接这么搞
                    return new StringObject(vm,NDKDemo.privateStaticStringField);
                }
                return super.getStaticObjectField(vm, dvmClass, signature);
            }

            @Override
            public void setObjectField(BaseVM vm, DvmObject<?> dvmObject, String signature, DvmObject<?> value) {
                // TODO Auto-generated method stub
                if(signature.equals("com/xiaojianbang/ndkdemo/NDKDemo->privateStringField:Ljava/lang/String;")){
                    //遇到非静态的变量 需要跟着对象走
                    //获取当前对象,我们不知道dvmObject.getValue() 获取到的对象类型，但是报错信息中告诉我们了 所以可以强行转换
                    NDKDemo ndkdemo = (NDKDemo)dvmObject.getValue();
                    //setObjectField 是要改变值，所以要将变量的值指向value
                    ndkdemo.privateStringField = (String) value.getValue();
                    //如果不return 将会执行super
                    return;
                }
                super.setObjectField(vm, dvmObject, signature, value);
            }
            
            @Override
            public DvmObject<?> getObjectField(BaseVM vm, DvmObject<?> dvmObject, String signature) {
                // TODO Auto-generated method stub
                if(signature.equals("com/xiaojianbang/ndkdemo/NDKDemo->privateStringField:Ljava/lang/String;")){
                    NDKDemo ndkdemo = (NDKDemo)dvmObject.getValue();
                    return new StringObject(vm,ndkdemo.privateStringField);

                }else if(signature.equals("com/xiaojianbang/ndkdemo/NDKDemo->byteArray:[B")){
                    NDKDemo ndkdemo = (NDKDemo)dvmObject.getValue();
                    return new ByteArray(vm, ndkdemo.byteArray);
                }
                return super.getObjectField(vm, dvmObject, signature);
            }

            @Override
            public void callStaticVoidMethodV(BaseVM vm, DvmClass dvmClass, String signature, VaList vaList) {
                // TODO Auto-generated method stub
                if(signature.equals("com/xiaojianbang/ndkdemo/NDKDemo->publicStaticFunc()V")){
                    //因为是static 方法 所以可以直接待用
                    NDKDemo.publicStaticFunc();
                    return;

                }
                super.callStaticVoidMethodV(vm, dvmClass, signature, vaList);
            }

            @Override
            public DvmObject<?> callStaticObjectMethodV(BaseVM vm, DvmClass dvmClass, String signature, VaList vaList) {
                // TODO Auto-generated method stub
                if(signature.equals("com/xiaojianbang/ndkdemo/NDKDemo->privateStaticFunc([Ljava/lang/String;)[I")){
                    //获取的是strinobj的数组
                    ArrayObject args0 =  vaList.getObjectArg(0);
                    //stringobj的数组getvalue得到的时候dvmobject的数组
                    DvmObject[] stringobjarray = args0.getValue();
                    //创建一个空数组
                    String[] srtingarray = new String[stringobjarray.length];
                    //得到sting数组获取到所有的成员
                    for(int i =0;i<stringobjarray.length;i++){
                        srtingarray[i] =(String)stringobjarray[i].getValue();
                    }
                    System.out.print(Arrays.toString(srtingarray));
                    return new IntArray(vm, NDKDemo.privateStaticFunc(srtingarray));
                    
                }
                return super.callStaticObjectMethodV(vm, dvmClass, signature, vaList);
            }

        

           
        });

        //当类继承了 AbstractJni 可以直接这样写 向上转型 在后面又重写了callObjectMethodV方法，上面与下面两种方式均可
        // vm.setJni(this);


        vm.setVerbose(logging); // 设置是否打印Jni调用细节
        // 加载libxiaojianbang到unicorn虚拟内存，加载成功以后会默认调用init_array等函数
        //若目标函数还引用了其他so中的函数，需要把导入表中的函数所在的so也找到 也进行导入即可
        //枚举导入表，拿到地址，通过地址获取so基址即可找到so
        //unidbg 已经处理dlopen 加载了libl.so
        //unidbg 首先加载了一些系统函数 在加载我们的so之前
        DalvikModule dmB = vm.loadLibrary(new File("unidbg-master/unidbg-android/src/test/java/com/xiaojianbang/ndkdemo/libxiaojianbangB.so"), false); 
        DalvikModule dm = vm.loadLibrary(new File("unidbg-master/unidbg-android/src/test/java/com/xiaojianbang/ndkdemo/libxiaojianbangA.so"), false); 
        dm.callJNI_OnLoad(emulator); // 手动执行JNI_OnLoad函数 看自己的函数需要不需要jnionload 如果需要就需要调用不需要注释掉即可 动态注册就需要jnionload
        module = dm.getModule(); // 加载好的libxiaojianbang.so对应为一个模块
        // module.callFunction(emulator, symbolName, args) 针对so做操作
        //可以resolve多个类
        CallNDKDemo = vm.resolveClass("com/xiaojianbang/ndkdemo/MainActivity"); //加载类的一个过程 因为testJniFunc是在这个类下面
    
    }
  
    void destroy() {
        IOUtils.close(emulator);
        if (logging) {
            System.out.println("destroy");
        }
    }

    void call(){
        StringObject retval =  CallNDKDemo.callStaticJniMethodObject(emulator, "testJniFunc()Ljava/lang/String;");
        System.out.println(retval.getValue());
    }



    
    public static void main(String[] args) throws Exception {
        CallNDKDemo test = new CallNDKDemo(false);      
        test.call(); 
    }



}
