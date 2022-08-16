package com.benchmark.port.nativePort;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p002O.C0002O;
import p003X.C108306Ske;
import p003X.C108868Sti;
import p003X.C65725BwV;

/* loaded from: classes10.dex */
public class ApplogUtilsInvoker {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static native void nativeInit();

    static {
        Covode.recordClassIndex(9712);
        C65725BwV.LIZ();
        if (!C65725BwV.LIZIZ()) {
            C65725BwV.LIZ();
        }
    }

    public static void Init() {
        MethodCollector.m14708i(789);
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 2).isSupported) {
            MethodCollector.m14707o(789);
            return;
        }
        if (C65725BwV.LIZIZ()) {
            nativeInit();
        }
        MethodCollector.m14707o(789);
    }

    public static void onNativeCallback_onAppLogJson(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        C108868Sti.LIZ(str, str2);
        C108306Ske.LIZIZ("ApplogUtilsInvoker", C0002O.m25084C("Event:", str, ",json: ", str2));
    }
}
