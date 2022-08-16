package com.bef.effectsdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes.dex */
public class ModelnamesAssigner {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(9538);
    }

    public static native int nativeSetAssignedModelNames(long j, String[] strArr, String[] strArr2);

    public static native int nativeSetAssignedModelNamesWithPriority(long j, String[] strArr, String[] strArr2, int[] iArr);

    public static int setAssignedModelNames(long j, String[] strArr, String[] strArr2) {
        MethodCollector.m14708i(642);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), strArr, strArr2}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(642);
            return intValue;
        }
        int nativeSetAssignedModelNames = nativeSetAssignedModelNames(j, strArr, strArr2);
        MethodCollector.m14707o(642);
        return nativeSetAssignedModelNames;
    }

    public static int setAssignedModelNamesWithPriority(long j, String[] strArr, String[] strArr2, int[] iArr) {
        MethodCollector.m14708i(643);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), strArr, strArr2, iArr}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(643);
            return intValue;
        }
        int nativeSetAssignedModelNamesWithPriority = nativeSetAssignedModelNamesWithPriority(j, strArr, strArr2, iArr);
        MethodCollector.m14707o(643);
        return nativeSetAssignedModelNamesWithPriority;
    }
}
