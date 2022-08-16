package com.bytedance.android.live.liveinteract.multianchor.constant;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;

/* loaded from: classes3.dex */
public enum PlayMode {
    PERSONAL_PK,
    TEAM_PK;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(27933);
    }

    public static PlayMode valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (PlayMode) (proxy.isSupported ? proxy.result : Enum.valueOf(PlayMode.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static PlayMode[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (PlayMode[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    @Override // java.lang.Enum
    public final String toString() {
        if (this == PERSONAL_PK) {
            return "personal_pk";
        }
        if (this == TEAM_PK) {
            return "team_pk";
        }
        return LoggerUtil.UNKNOWN;
    }
}
