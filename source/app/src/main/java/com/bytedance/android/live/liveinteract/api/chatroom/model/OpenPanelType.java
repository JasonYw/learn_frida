package com.bytedance.android.live.liveinteract.api.chatroom.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes3.dex */
public enum OpenPanelType {
    NONE(0),
    LINK_METHOD_SETTING_PANEL(1),
    PAID_LINK_SETTING_PANEL(2);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int value;

    public static OpenPanelType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (OpenPanelType) (proxy.isSupported ? proxy.result : Enum.valueOf(OpenPanelType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static OpenPanelType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (OpenPanelType[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(25145);
    }

    OpenPanelType(int i) {
        this.value = i;
    }
}
