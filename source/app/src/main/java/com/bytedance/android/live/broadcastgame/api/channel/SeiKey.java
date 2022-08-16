package com.bytedance.android.live.broadcastgame.api.channel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes5.dex */
public enum SeiKey {
    HEART_KEY("anchor_audience_game_heartbeat_sei"),
    SEI_KEY_V1("anchor_audience_game_communication_sei"),
    SEI_KEY_V2("game_aagc_sei");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String value;

    public static SeiKey valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (SeiKey) (proxy.isSupported ? proxy.result : Enum.valueOf(SeiKey.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SeiKey[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (SeiKey[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(19041);
    }

    SeiKey(String str) {
        this.value = str;
    }
}
