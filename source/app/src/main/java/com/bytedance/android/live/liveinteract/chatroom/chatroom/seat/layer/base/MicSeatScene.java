package com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes3.dex */
public enum MicSeatScene {
    AUDIO_LINK,
    AUDIO_LINK_LARGE,
    VIDEO_LINK,
    VIDEO_LINK_EQUAL,
    KTV;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(26315);
    }

    public static MicSeatScene valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (MicSeatScene) (proxy.isSupported ? proxy.result : Enum.valueOf(MicSeatScene.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static MicSeatScene[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (MicSeatScene[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
