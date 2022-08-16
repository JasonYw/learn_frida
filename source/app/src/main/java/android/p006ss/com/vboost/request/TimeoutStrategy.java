package android.p006ss.com.vboost.request;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: android.ss.com.vboost.request.TimeoutStrategy */
/* loaded from: classes19.dex */
public enum TimeoutStrategy {
    USE_PROVIDERS,
    USE_OURS,
    USER_CANCEL,
    ONE_TIME,
    ETERNAL;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static TimeoutStrategy[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (TimeoutStrategy[]) proxy.result;
        }
        return (TimeoutStrategy[]) values().clone();
    }

    static {
        Covode.recordClassIndex(97);
    }

    public static TimeoutStrategy valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (TimeoutStrategy) proxy.result;
        }
        return (TimeoutStrategy) Enum.valueOf(TimeoutStrategy.class, str);
    }
}
