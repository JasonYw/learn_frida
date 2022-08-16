package com.benchmark.runtime.nativePort;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes10.dex */
public class BXStrategyManagePort {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(9725);
    }

    private native void native_releaseByteBenchStrategy(int i);

    public native void native_createBenchStrategy(int i);
}
