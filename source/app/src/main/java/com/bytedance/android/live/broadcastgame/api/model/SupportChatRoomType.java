package com.bytedance.android.live.broadcastgame.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes12.dex */
public enum SupportChatRoomType {
    ALL_ROLE(-1),
    ALL_TYPE(0),
    AUDIENCE_LINK(1),
    VIDEO_TALK_ROOM(2),
    AUDIO_CHAT_ROOM(3),
    KTV_ROOM(4);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int value;

    public static SupportChatRoomType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (SupportChatRoomType) (proxy.isSupported ? proxy.result : Enum.valueOf(SupportChatRoomType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SupportChatRoomType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (SupportChatRoomType[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(19162);
    }

    SupportChatRoomType(int i) {
        this.value = i;
    }
}
