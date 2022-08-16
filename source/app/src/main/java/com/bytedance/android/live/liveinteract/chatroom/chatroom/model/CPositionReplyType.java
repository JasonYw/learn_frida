package com.bytedance.android.live.liveinteract.chatroom.chatroom.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes3.dex */
public enum CPositionReplyType {
    Accept(1),
    Reject(2);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int value;

    public static CPositionReplyType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (CPositionReplyType) (proxy.isSupported ? proxy.result : Enum.valueOf(CPositionReplyType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static CPositionReplyType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (CPositionReplyType[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(26280);
    }

    CPositionReplyType(int i) {
        this.value = i;
    }
}
