package com.benchmark.bytemonitor.nativePort;

import com.benchmark.bytemonitor.BatteryMonitor;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C116971W2r;

/* loaded from: classes10.dex */
public class ByteMonitorPort {
    public static ChangeQuickRedirect LIZ;

    public static native void nativeInit(BatteryMonitor batteryMonitor);

    static {
        Covode.recordClassIndex(9632);
        C116971W2r.LIZIZ("bytemonitor");
    }
}
