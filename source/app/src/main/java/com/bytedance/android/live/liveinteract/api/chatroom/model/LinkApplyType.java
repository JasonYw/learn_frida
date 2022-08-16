package com.bytedance.android.live.liveinteract.api.chatroom.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes3.dex */
public enum LinkApplyType {
    NORMAL(0),
    SONG(1),
    MATCH(2),
    CITY(4),
    CITYSONG(5),
    STRONG_REACH(8),
    PREPARE_APPLY(32),
    KTV_PRIORITY_SING(64);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int value;

    public static LinkApplyType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (LinkApplyType) (proxy.isSupported ? proxy.result : Enum.valueOf(LinkApplyType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LinkApplyType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (LinkApplyType[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(25142);
    }

    LinkApplyType(int i) {
        this.value = i;
    }
}
