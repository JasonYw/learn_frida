package com.bef.effectsdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes9.dex */
public final class RequirementResourceMapper {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(9542);
    }

    public static native String[] nativePeekResourcesNeededByRequirements(String[] strArr);

    public static String[] peekResourcesNeededByRequirements(String[] strArr) {
        MethodCollector.m14708i(646);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{strArr}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            String[] strArr2 = (String[]) proxy.result;
            MethodCollector.m14707o(646);
            return strArr2;
        }
        String[] nativePeekResourcesNeededByRequirements = nativePeekResourcesNeededByRequirements(strArr);
        MethodCollector.m14707o(646);
        return nativePeekResourcesNeededByRequirements;
    }
}
