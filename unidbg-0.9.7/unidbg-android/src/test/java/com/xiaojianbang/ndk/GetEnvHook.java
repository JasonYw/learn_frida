package com.xiaojianbang.ndk;

import com.github.unidbg.Emulator;
import com.github.unidbg.arm.Arm64Hook;
import com.github.unidbg.arm.ArmHook;
import com.github.unidbg.arm.HookStatus;
import com.github.unidbg.arm.backend.BackendException;
import com.github.unidbg.arm.context.RegisterContext;
import com.github.unidbg.hook.HookListener;
import com.github.unidbg.memory.SvcMemory;
import com.sun.jna.Pointer;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GetEnvHook implements HookListener {

    private static final Log log = LogFactory.getLog(GetEnvHook.class);


    private final Emulator<?> emulator;

    public GetEnvHook(Emulator<?> emulator) {
        this.emulator = emulator;
    }

    @Override
    public long hook(SvcMemory svcMemory, String libraryName, String symbolName, final long old) {
        //old代表原函数
        if ("libc.so".equals(libraryName)) {
            if ("getenv".equals(symbolName)) {
                // if (log.isDebugEnabled()) {
                //     log.debug("Hook " + symbolName);
                // }
                if (emulator.is64Bit()) {
                    //hook分为64位或者32位
                    return svcMemory.registerSvc(new Arm64Hook() {
                        @Override
                        protected HookStatus hook(Emulator<?> emulator) {
                            //取参数
                            RegisterContext context = emulator.getContext();
                            int index = 0;
                            Pointer pointer = context.getPointerArg(index);
                            String key = pointer.getString(0);
                            log.info("Hook " + key);
                            //返回原函数
                            return HookStatus.RET(emulator, old);
                        }
                    }).peer;
                } else {
                    return svcMemory.registerSvc(new ArmHook() {
                        @Override
                        protected HookStatus hook(Emulator<?> emulator) {
                            RegisterContext context = emulator.getContext();
                            int index = 0;
                            Pointer pointer = context.getPointerArg(index);
                            String key = pointer.getString(0);
                            log.info("Hook " + key);
                            return HookStatus.RET(emulator, old);
                        }
                    }).peer;
                }
            }
           
        }
        return 0;
    }


}
