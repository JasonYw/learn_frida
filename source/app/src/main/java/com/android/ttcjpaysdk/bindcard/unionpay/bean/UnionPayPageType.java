package com.android.ttcjpaysdk.bindcard.unionpay.bean;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public enum UnionPayPageType {
    TYPE_IDENTITY_VERIFY,
    TYPE_FACE_VERIFY,
    TYPE_UNION_PAY_SIGN,
    TYPE_UNION_CARD_LIST,
    TYPE_DEFAULT;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(7334);
    }

    public static UnionPayPageType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (UnionPayPageType) (proxy.isSupported ? proxy.result : Enum.valueOf(UnionPayPageType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static UnionPayPageType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (UnionPayPageType[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
