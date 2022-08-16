package com.bytedance.android.live.liveinteract.api.chatroom.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.H61;

/* loaded from: classes3.dex */
public enum LinkMatchType {
    NONE("none"),
    MATCH("match"),
    AGAIN_MATCH("again_match"),
    SHAKE_MATCH("shake_match"),
    AGAIN_SHAKE("again_shake"),
    SING_MATCH("sing_match");
    
    public static final H61 Companion = new H61((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String value;

    public static LinkMatchType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (LinkMatchType) (proxy.isSupported ? proxy.result : Enum.valueOf(LinkMatchType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LinkMatchType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (LinkMatchType[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(25143);
    }

    LinkMatchType(String str) {
        this.value = str;
    }
}
