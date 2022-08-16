package android.p006ss.com.vboost.request;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: android.ss.com.vboost.request.NotifyStrategy */
/* loaded from: classes13.dex */
public enum NotifyStrategy {
    DIRECT,
    ASYNC;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static NotifyStrategy[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (NotifyStrategy[]) proxy.result;
        }
        return (NotifyStrategy[]) values().clone();
    }

    static {
        Covode.recordClassIndex(96);
    }

    public static NotifyStrategy valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (NotifyStrategy) proxy.result;
        }
        return (NotifyStrategy) Enum.valueOf(NotifyStrategy.class, str);
    }
}
