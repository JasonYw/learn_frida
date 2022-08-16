package com.bytedance.android.live.broadcastgame.api.channel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes5.dex */
public enum MessageTarget {
    ANCHOR,
    AUDIENCE;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19038);
    }

    public static MessageTarget valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (MessageTarget) (proxy.isSupported ? proxy.result : Enum.valueOf(MessageTarget.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static MessageTarget[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (MessageTarget[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
