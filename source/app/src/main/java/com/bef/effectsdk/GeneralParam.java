package com.bef.effectsdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;

/* loaded from: classes25.dex */
public class GeneralParam {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(9535);
    }

    public static native String nativeGetParamByKey(String str);

    public static native void nativeSetParamWithKey(String str, String str2);

    public static native void nativeSetParams(HashMap<String, String> hashMap);

    public static String getParamByKey(String str) {
        MethodCollector.m14708i(638);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            String str2 = (String) proxy.result;
            MethodCollector.m14707o(638);
            return str2;
        }
        String nativeGetParamByKey = nativeGetParamByKey(str);
        MethodCollector.m14707o(638);
        return nativeGetParamByKey;
    }

    public static void setParams(HashMap<String, String> hashMap) {
        MethodCollector.m14708i(636);
        if (PatchProxy.proxy(new Object[]{hashMap}, null, changeQuickRedirect, true, 1).isSupported) {
            MethodCollector.m14707o(636);
            return;
        }
        nativeSetParams(hashMap);
        MethodCollector.m14707o(636);
    }

    public static void setParamWithKey(String str, String str2) {
        MethodCollector.m14708i(637);
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 2).isSupported) {
            MethodCollector.m14707o(637);
            return;
        }
        nativeSetParamWithKey(str, str2);
        MethodCollector.m14707o(637);
    }
}
