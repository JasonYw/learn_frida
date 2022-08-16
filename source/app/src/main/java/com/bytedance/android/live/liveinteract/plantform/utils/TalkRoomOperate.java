package com.bytedance.android.live.liveinteract.plantform.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes3.dex */
public enum TalkRoomOperate {
    INVITE("invite"),
    PERMIT("permit"),
    SILENCE("silence"),
    UNSILENCE("unsilence"),
    DISCONNECT("disconnect");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String operate;

    public static TalkRoomOperate valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (TalkRoomOperate) (proxy.isSupported ? proxy.result : Enum.valueOf(TalkRoomOperate.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static TalkRoomOperate[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (TalkRoomOperate[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(29504);
    }

    TalkRoomOperate(String str) {
        this.operate = str;
    }
}
