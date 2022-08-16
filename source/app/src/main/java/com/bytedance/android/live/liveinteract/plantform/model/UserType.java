package com.bytedance.android.live.liveinteract.plantform.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes3.dex */
public enum UserType {
    UNKNOWN(0),
    ANCHOR(1),
    AUDIENCE(2),
    GUEST(3);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int value;

    public static UserType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (UserType) (proxy.isSupported ? proxy.result : Enum.valueOf(UserType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static UserType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (UserType[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(29413);
    }

    UserType(int i) {
        this.value = i;
    }
}
