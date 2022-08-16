package com.bytedance.android.live.liveinteract.plantform.permission.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes3.dex */
public enum OperateType {
    APPLY,
    REPLY,
    PRE_APPLY;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(29493);
    }

    public static OperateType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (OperateType) (proxy.isSupported ? proxy.result : Enum.valueOf(OperateType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static OperateType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (OperateType[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
