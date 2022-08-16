package com.benchmark.port.nativePort;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C65725BwV;

/* loaded from: classes26.dex */
public class LogcatInvoker {
    public static ChangeQuickRedirect LIZ;

    public static native void nativeSetLogLevel(byte b);

    static {
        Covode.recordClassIndex(9713);
        C65725BwV.LIZ();
        if (!C65725BwV.LIZIZ()) {
            C65725BwV.LIZ();
        }
    }

    public static void LIZ(byte b) {
        MethodCollector.m14708i(790);
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(b)}, null, LIZ, true, 1).isSupported) {
            MethodCollector.m14707o(790);
            return;
        }
        if (C65725BwV.LIZIZ()) {
            nativeSetLogLevel(b);
        }
        MethodCollector.m14707o(790);
    }
}
