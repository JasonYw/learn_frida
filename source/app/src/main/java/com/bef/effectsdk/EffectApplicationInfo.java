package com.bef.effectsdk;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C116971W2r;

/* loaded from: classes.dex */
public class EffectApplicationInfo {
    public static Context appContext;
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(9511);
    }

    public static native int nativeSetHomeDir(String str);

    public static Context getAppContext() {
        return appContext;
    }

    public static void onSetAppContext() {
        MethodCollector.m14708i(614);
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 2).isSupported) {
            MethodCollector.m14707o(614);
            return;
        }
        Context context = appContext;
        if (context != null) {
            nativeSetHomeDir(C116971W2r.LIZJ(context).getAbsolutePath());
        }
        MethodCollector.m14707o(614);
    }

    public static void setAppContext(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        appContext = context;
        onSetAppContext();
    }
}
