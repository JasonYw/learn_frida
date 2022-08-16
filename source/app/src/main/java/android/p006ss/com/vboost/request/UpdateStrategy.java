package android.p006ss.com.vboost.request;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: android.ss.com.vboost.request.UpdateStrategy */
/* loaded from: classes19.dex */
public enum UpdateStrategy {
    FIFO,
    LIFO,
    SMALL,
    LAGER;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static UpdateStrategy[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (UpdateStrategy[]) proxy.result;
        }
        return (UpdateStrategy[]) values().clone();
    }

    static {
        Covode.recordClassIndex(98);
    }

    public static UpdateStrategy valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (UpdateStrategy) proxy.result;
        }
        return (UpdateStrategy) Enum.valueOf(UpdateStrategy.class, str);
    }
}
