package com.bytedance.android.live.broadcastgame.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes12.dex */
public enum SupportLiveMode {
    UNKNOWN(-1),
    VIDEO(0),
    OBS(1),
    MEDIA(2),
    AUDIO(3),
    SCREEN_RECORD(4);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int value;

    public static SupportLiveMode valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (SupportLiveMode) (proxy.isSupported ? proxy.result : Enum.valueOf(SupportLiveMode.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SupportLiveMode[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (SupportLiveMode[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(19164);
    }

    SupportLiveMode(int i) {
        this.value = i;
    }
}
