package com.bytedance.android.live.broadcastgame.api.channel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.KYM;

/* loaded from: classes5.dex */
public enum DelayType {
    NO_DELAY(0),
    DELAY_FLOW_STREAM(1);
    
    public static final KYM Companion = new KYM((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int value;

    public static DelayType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (DelayType) (proxy.isSupported ? proxy.result : Enum.valueOf(DelayType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static DelayType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (DelayType[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(19034);
    }

    DelayType(int i) {
        this.value = i;
    }
}
