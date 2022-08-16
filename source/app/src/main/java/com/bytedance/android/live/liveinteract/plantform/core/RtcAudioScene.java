package com.bytedance.android.live.liveinteract.plantform.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes3.dex */
public enum RtcAudioScene {
    NORMAL("IES_normal"),
    CHAT_ROOM("IES_chatroom"),
    KTV("IES_KTV"),
    PK("IES_PK");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String value;

    public static RtcAudioScene valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (RtcAudioScene) (proxy.isSupported ? proxy.result : Enum.valueOf(RtcAudioScene.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static RtcAudioScene[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (RtcAudioScene[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(29226);
    }

    RtcAudioScene(String str) {
        this.value = str;
    }
}
