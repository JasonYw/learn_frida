package com.bytedance.android.live.profit.fansclub;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C4BN;

/* loaded from: classes12.dex */
public enum XTFansClubStatus {
    Default(1),
    NotCreate(1),
    Review(2),
    Created(3);
    
    public static final C4BN Companion = new C4BN((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int value;

    public static XTFansClubStatus valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (XTFansClubStatus) (proxy.isSupported ? proxy.result : Enum.valueOf(XTFansClubStatus.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static XTFansClubStatus[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (XTFansClubStatus[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(33269);
    }

    XTFansClubStatus(int i) {
        this.value = i;
    }
}
