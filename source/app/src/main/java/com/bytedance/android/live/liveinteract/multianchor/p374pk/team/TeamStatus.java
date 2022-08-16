package com.bytedance.android.live.liveinteract.multianchor.p374pk.team;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.team.TeamStatus */
/* loaded from: classes3.dex */
public enum TeamStatus {
    LEFT,
    RIGHT;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(28287);
    }

    public static TeamStatus valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (TeamStatus) (proxy.isSupported ? proxy.result : Enum.valueOf(TeamStatus.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static TeamStatus[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (TeamStatus[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
