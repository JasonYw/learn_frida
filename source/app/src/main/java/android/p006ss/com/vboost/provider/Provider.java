package android.p006ss.com.vboost.provider;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: android.ss.com.vboost.provider.Provider */
/* loaded from: classes19.dex */
public enum Provider {
    VENDOR(1),
    PLATFORM(2);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public int provider;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static Provider[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (Provider[]) proxy.result;
        }
        return (Provider[]) values().clone();
    }

    static {
        Covode.recordClassIndex(67);
    }

    public static Provider valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (Provider) proxy.result;
        }
        return (Provider) Enum.valueOf(Provider.class, str);
    }

    Provider(int i) {
        this.provider = i;
    }
}
