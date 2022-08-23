package com.xiaojianbang.ndk;

import com.github.unidbg.Emulator;
import com.github.unidbg.arm.context.EditableArm32RegisterContext;
import com.github.unidbg.linux.ARM64SyscallHandler;
import com.github.unidbg.memory.SvcMemory;
import com.github.unidbg.pointer.UnidbgPointer;

public class MySyscallHandler extends ARM64SyscallHandler {
    //自己处理syscall 继承ARM64SyscallHandler

    public MySyscallHandler(SvcMemory svcMemory){
        //一定要实现构造函数，用父类直接初始化
        super(svcMemory);
    }

    @Override
    protected boolean handleUnknownSyscall(Emulator<?> emulator, int NR) {
        //要复写此方法
        EditableArm32RegisterContext context = emulator.getContext();
        //在父类没有匹配到的 就会在我们这处理
        if(NR == 14){
            int pid = context.getR0Int();
            UnidbgPointer wstatus = context.getR1Pointer();
            int options = context.getR2Int();
            UnidbgPointer rusage = context.getR3Pointer();
            System.out.println("pid:"+pid);
            System.out.println("wstatus:"+wstatus);
            System.out.println("options:"+ Integer.toHexString(options));
            System.out.println("options:"+options);
            System.out.println("rusage:"+rusage);
            return true;
        }
        return super.handleUnknownSyscall(emulator, NR);
    }

    
}
