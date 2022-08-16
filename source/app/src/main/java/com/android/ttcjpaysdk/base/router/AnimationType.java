package com.android.ttcjpaysdk.base.router;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public enum AnimationType {
    SlideLeftAndRigth,
    FadeInAndOut;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static AnimationType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (AnimationType[]) proxy.result;
        }
        return (AnimationType[]) values().clone();
    }

    static {
        Covode.recordClassIndex(6375);
    }

    public static AnimationType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (AnimationType) proxy.result;
        }
        return (AnimationType) Enum.valueOf(AnimationType.class, str);
    }
}