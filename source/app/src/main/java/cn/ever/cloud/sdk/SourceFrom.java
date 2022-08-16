package cn.ever.cloud.sdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes22.dex */
public enum SourceFrom {
    DOUYIN(12);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int intVal;

    public static SourceFrom valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (SourceFrom) (proxy.isSupported ? proxy.result : Enum.valueOf(SourceFrom.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SourceFrom[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (SourceFrom[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    public final int getIntVal() {
        return this.intVal;
    }

    static {
        Covode.recordClassIndex(3299);
    }

    SourceFrom(int i) {
        this.intVal = i;
    }
}
