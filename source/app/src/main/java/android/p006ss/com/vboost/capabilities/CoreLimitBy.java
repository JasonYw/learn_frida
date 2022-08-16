package android.p006ss.com.vboost.capabilities;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: android.ss.com.vboost.capabilities.CoreLimitBy */
/* loaded from: classes25.dex */
public enum CoreLimitBy {
    USER_SPECIFIED,
    BIND_CLUSTER;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static CoreLimitBy[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (CoreLimitBy[]) proxy.result;
        }
        return (CoreLimitBy[]) values().clone();
    }

    static {
        Covode.recordClassIndex(46);
    }

    public static CoreLimitBy valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (CoreLimitBy) proxy.result;
        }
        return (CoreLimitBy) Enum.valueOf(CoreLimitBy.class, str);
    }
}
