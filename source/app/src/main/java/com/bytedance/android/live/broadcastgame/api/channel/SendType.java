package com.bytedance.android.live.broadcastgame.api.channel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.KXT;

/* loaded from: classes5.dex */
public enum SendType {
    SEND_TYPE_1(1),
    SEND_TYPE_2(2),
    SEND_TYPE_3(3);
    
    public static final KXT Companion = new KXT((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final long value;

    public static SendType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (SendType) (proxy.isSupported ? proxy.result : Enum.valueOf(SendType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SendType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (SendType[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(19042);
    }

    SendType(long j) {
        this.value = j;
    }
}
