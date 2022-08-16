package com.bytedance.android.live.broadcastgame.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes5.dex */
public enum GameOrientation {
    Portrait(1),
    Landscape(2);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int value;

    public static GameOrientation valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (GameOrientation) (proxy.isSupported ? proxy.result : Enum.valueOf(GameOrientation.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static GameOrientation[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (GameOrientation[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(19145);
    }

    GameOrientation(int i) {
        this.value = i;
    }
}
