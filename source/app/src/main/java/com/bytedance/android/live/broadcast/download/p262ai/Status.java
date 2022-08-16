package com.bytedance.android.live.broadcast.download.p262ai;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: com.bytedance.android.live.broadcast.download.ai.Status */
/* loaded from: classes5.dex */
public enum Status {
    ENABLE(1),
    DISABLE(0);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int code;

    public static Status valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (Status) (proxy.isSupported ? proxy.result : Enum.valueOf(Status.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static Status[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (Status[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(15540);
    }

    Status(int i) {
        this.code = i;
    }
}
