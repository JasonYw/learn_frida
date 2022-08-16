package com.bytedance.android.live.broadcast.welfare.packs.detail;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes5.dex */
public enum DetailDialogType {
    TYPE_NORMAL,
    TYPE_RECEIVE_SUCCESS,
    TYPE_RECEIVE;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(18252);
    }

    public static DetailDialogType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (DetailDialogType) (proxy.isSupported ? proxy.result : Enum.valueOf(DetailDialogType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static DetailDialogType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (DetailDialogType[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
