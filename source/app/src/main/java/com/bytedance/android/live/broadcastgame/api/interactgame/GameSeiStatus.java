package com.bytedance.android.live.broadcastgame.api.interactgame;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes5.dex */
public enum GameSeiStatus {
    GAME_START,
    GAME_STOP,
    GAME_IN_CAST_GAME;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19097);
    }

    public static GameSeiStatus valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (GameSeiStatus) (proxy.isSupported ? proxy.result : Enum.valueOf(GameSeiStatus.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static GameSeiStatus[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (GameSeiStatus[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
