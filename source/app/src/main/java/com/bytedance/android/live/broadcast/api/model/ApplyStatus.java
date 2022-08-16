package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes5.dex */
public enum ApplyStatus {
    CanNotApply(1),
    CanApply(2),
    Submitted(3),
    AlreadyHasPermission(99);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public int code;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ApplyStatus[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (ApplyStatus[]) proxy.result;
        }
        return (ApplyStatus[]) values().clone();
    }

    static {
        Covode.recordClassIndex(14490);
    }

    public static ApplyStatus valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (ApplyStatus) proxy.result;
        }
        return (ApplyStatus) Enum.valueOf(ApplyStatus.class, str);
    }

    ApplyStatus(int i) {
        this.code = i;
    }
}
