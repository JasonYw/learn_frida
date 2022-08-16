package com.bytedance.android.live.liveinteract.chatroom.chatroom.seat;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes3.dex */
public enum SeatAnimTaskState {
    IDLE,
    LINK_SUC_ANIM,
    CITY_ANIM,
    DYNAMIC_EMOJI,
    KTV_SINGER_ANIMA,
    GUEST_BATTLE_ANIM;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    public static SeatAnimTaskState valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (SeatAnimTaskState) (proxy.isSupported ? proxy.result : Enum.valueOf(SeatAnimTaskState.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SeatAnimTaskState[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (SeatAnimTaskState[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(26296);
    }
}
