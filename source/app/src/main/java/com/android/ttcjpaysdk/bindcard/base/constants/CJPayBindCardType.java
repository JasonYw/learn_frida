package com.android.ttcjpaysdk.bindcard.base.constants;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public enum CJPayBindCardType {
    ALL("ALL", "储蓄卡,信用卡"),
    CREDIT("CREDIT", "信用卡"),
    DEBIT("DEBIT", "储蓄卡");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String mDesc;
    public final String mType;

    public static CJPayBindCardType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (CJPayBindCardType) (proxy.isSupported ? proxy.result : Enum.valueOf(CJPayBindCardType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static CJPayBindCardType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (CJPayBindCardType[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(7044);
    }

    CJPayBindCardType(String str, String str2) {
        this.mType = str;
        this.mDesc = str2;
    }
}
