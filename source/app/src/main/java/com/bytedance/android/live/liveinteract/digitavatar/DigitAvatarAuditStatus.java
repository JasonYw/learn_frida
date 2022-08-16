package com.bytedance.android.live.liveinteract.digitavatar;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes3.dex */
public enum DigitAvatarAuditStatus {
    PASS,
    NOT_PASS,
    AUDITING;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(26584);
    }

    public static DigitAvatarAuditStatus valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (DigitAvatarAuditStatus) (proxy.isSupported ? proxy.result : Enum.valueOf(DigitAvatarAuditStatus.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static DigitAvatarAuditStatus[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (DigitAvatarAuditStatus[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
