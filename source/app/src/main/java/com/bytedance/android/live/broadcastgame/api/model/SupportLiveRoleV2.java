package com.bytedance.android.live.broadcastgame.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes12.dex */
public enum SupportLiveRoleV2 {
    DEFAULT(-1),
    ANCHOR_TO_ANCHOR(1),
    ANCHOR_TO_AUDIENCE(2);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int value;

    public static SupportLiveRoleV2 valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (SupportLiveRoleV2) (proxy.isSupported ? proxy.result : Enum.valueOf(SupportLiveRoleV2.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SupportLiveRoleV2[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (SupportLiveRoleV2[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(19165);
    }

    SupportLiveRoleV2(int i) {
        this.value = i;
    }
}
