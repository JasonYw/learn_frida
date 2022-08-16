package com.benchmark.strategy.nativePort;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C108862Stc;
import p003X.C83583Iwr;

/* loaded from: classes10.dex */
public class ByteBenchStrategyPort {
    public static ChangeQuickRedirect LIZ;
    public C83583Iwr LIZIZ;
    public int LIZJ;

    static {
        Covode.recordClassIndex(9737);
    }

    private native boolean native_obtainStaticBoolStrategy(int i, String str, boolean z);

    private native float native_obtainStaticFloatStrategy(int i, String str, float f);

    private native int native_obtainStaticIntStrategy(int i, String str, int i2);

    private native long native_obtainStaticLongStrategy(int i, String str, long j);

    private native void native_openRepo(int i);

    private native void native_release(int i);

    public native boolean native_contains(int i, String str);

    public native void native_init(long j);

    public native boolean native_obtainBoolStrategy(int i, String str, boolean z, boolean z2);

    public native float native_obtainFloatStrategy(int i, String str, float f, boolean z);

    public native int native_obtainIntStrategy(int i, String str, int i2, boolean z);

    public native long native_obtainLongStrategy(int i, String str, long j, boolean z);

    public native String native_obtainStaticStrStrategy(int i, String str, String str2);

    public native String native_obtainStrStrategy(int i, String str, String str2, boolean z);

    public final int LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int i = this.LIZJ;
        if (i > 0) {
            return i;
        }
        C108862Stc LIZIZ = C108862Stc.LIZIZ();
        if (LIZIZ == null) {
            return 0;
        }
        return LIZIZ.f12291LJ;
    }
}
