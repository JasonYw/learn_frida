package com.bytedance.android.annie.bridge.method;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes5.dex */
public enum StorageDataType {
    Null,
    Boolean,
    Number,
    Int,
    String,
    Map,
    List;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10533);
    }

    public static StorageDataType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (StorageDataType) (proxy.isSupported ? proxy.result : Enum.valueOf(StorageDataType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static StorageDataType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (StorageDataType[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
