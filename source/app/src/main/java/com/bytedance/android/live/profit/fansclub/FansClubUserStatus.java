package com.bytedance.android.live.profit.fansclub;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C438173Vb;

/* loaded from: classes12.dex */
public enum FansClubUserStatus {
    Unknown(0),
    Active(1),
    Inactive(2);
    
    public static final C438173Vb Companion = new C438173Vb((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int value;

    public static FansClubUserStatus valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (FansClubUserStatus) (proxy.isSupported ? proxy.result : Enum.valueOf(FansClubUserStatus.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static FansClubUserStatus[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (FansClubUserStatus[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(33267);
    }

    FansClubUserStatus(int i) {
        this.value = i;
    }
}
