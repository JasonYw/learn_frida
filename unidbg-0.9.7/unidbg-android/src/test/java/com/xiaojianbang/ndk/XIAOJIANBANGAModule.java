package com.github.unidbg.virtualmodule.android;

import com.github.unidbg.Emulator;
import com.github.unidbg.arm.Arm64Svc;
import com.github.unidbg.arm.ArmSvc;
import com.github.unidbg.arm.backend.BackendException;
import com.github.unidbg.arm.context.RegisterContext;
import com.github.unidbg.linux.android.dvm.DvmObject;
import com.github.unidbg.linux.android.dvm.VM;
import com.github.unidbg.linux.android.dvm.api.Asset;
import com.github.unidbg.memory.SvcMemory;
import com.github.unidbg.pointer.UnidbgPointer;
import com.github.unidbg.virtualmodule.VirtualModule;
import com.sun.jna.Pointer;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Map;

public class XIAOJIANBANGAModule extends VirtualModule<VM> {
    //虚拟so的功能

 

    public XIAOJIANBANGAModule(Emulator<?> emulator, VM vm) {
        //填入依赖的so文件名
        super(emulator, vm, "libxiaojianbangA.so");
    }

    @Override
    protected void onInitialize(Emulator<?> emulator, final VM vm, Map<String, UnidbgPointer> symbols) {
        boolean is64Bit = emulator.is64Bit();
        SvcMemory svcMemory = emulator.getSvcMemory();
        //将要自己实现的so函数名填上，这是ida中的函数名
        symbols.put("_Z7bssFuncv", svcMemory.registerSvc(is64Bit ? new Arm64Svc() {
            @Override
            public long handle(Emulator<?> emulator) {
                //当需要_Z7bssFuncv这个函数时fromJava为具体实现
                fromJava(emulator, vm);
                return 0;
            }
        } : new ArmSvc() {
            @Override
            public long handle(Emulator<?> emulator) {
                fromJava(emulator, vm);
                return 0;
            }
        }));
    }


    private static void fromJava(Emulator<?> emulator, VM vm) {
        //具体实现逻辑
        System.out.println("xiaojianbang");
    }

  

}
