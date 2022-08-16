package com.bytedance.accountseal.domain;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;

/* loaded from: classes17.dex */
public enum RegionType {
    REGION_CN(AdvanceSetting.CLEAR_NOTIFICATION),
    REGION_SINGAPOER("sg"),
    REGION_USA_EAST("va"),
    REGION_BOE("boe");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String region;

    public static RegionType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (RegionType) (proxy.isSupported ? proxy.result : Enum.valueOf(RegionType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static RegionType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (RegionType[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(9869);
    }

    RegionType(String str) {
        this.region = str;
    }
}
