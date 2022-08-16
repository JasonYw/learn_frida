package com.bytedance.android.live.broadcastgame.api.channel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.KXX;

/* loaded from: classes5.dex */
public enum ChannelType {
    NONE(-1000),
    IM(1),
    SEI(2),
    LOOP_SEI(3),
    IM_V2(4),
    SEI_BEAT(-100);
    
    public static final KXX Companion = new KXX((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final long value;

    public static ChannelType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (ChannelType) (proxy.isSupported ? proxy.result : Enum.valueOf(ChannelType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ChannelType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (ChannelType[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(19032);
    }

    ChannelType(long j) {
        this.value = j;
    }
}
