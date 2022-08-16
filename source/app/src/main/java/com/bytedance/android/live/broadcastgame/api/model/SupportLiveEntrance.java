package com.bytedance.android.live.broadcastgame.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes12.dex */
public enum SupportLiveEntrance {
    ALL_ENTRANCE(0),
    SINGLE(1),
    DOUBLE(2),
    MULTI(3);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int value;

    public static SupportLiveEntrance valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (SupportLiveEntrance) (proxy.isSupported ? proxy.result : Enum.valueOf(SupportLiveEntrance.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SupportLiveEntrance[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (SupportLiveEntrance[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(19163);
    }

    SupportLiveEntrance(int i) {
        this.value = i;
    }
}
