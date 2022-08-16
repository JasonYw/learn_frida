package com.bytedance.android.live.liveinteract.chatroom.chatroom.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes25.dex */
public enum CPositionInviteType {
    Enlarge(1),
    Reduce(2);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int value;

    public static CPositionInviteType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (CPositionInviteType) (proxy.isSupported ? proxy.result : Enum.valueOf(CPositionInviteType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static CPositionInviteType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (CPositionInviteType[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(26279);
    }

    CPositionInviteType(int i) {
        this.value = i;
    }
}
