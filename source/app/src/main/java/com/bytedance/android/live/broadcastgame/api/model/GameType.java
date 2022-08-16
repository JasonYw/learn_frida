package com.bytedance.android.live.broadcastgame.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes12.dex */
public enum GameType {
    EffectGame(1),
    WMiniGame(2),
    WGameX(3),
    CloudGame(4);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int value;

    public static GameType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (GameType) (proxy.isSupported ? proxy.result : Enum.valueOf(GameType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static GameType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (GameType[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(19146);
    }

    GameType(int i) {
        this.value = i;
    }
}
