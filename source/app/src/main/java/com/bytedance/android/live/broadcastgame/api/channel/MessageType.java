package com.bytedance.android.live.broadcastgame.api.channel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.KWZ;

/* loaded from: classes5.dex */
public enum MessageType {
    BIZ_MESSAGE(1),
    GAME_MESSAGE(2),
    BOLL_MESSAGE(3),
    CHAT_ROOM_ICON(5),
    CHAT_ROOM_BUBBLE(6);
    
    public static final KWZ Companion = new KWZ((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final long value;

    public static MessageType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (MessageType) (proxy.isSupported ? proxy.result : Enum.valueOf(MessageType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static MessageType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (MessageType[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(19039);
    }

    MessageType(long j) {
        this.value = j;
    }
}
