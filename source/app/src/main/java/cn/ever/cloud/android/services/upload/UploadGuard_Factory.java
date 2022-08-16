package cn.ever.cloud.android.services.upload;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class UploadGuard_Factory implements K8J<UploadGuard> {
    public static final UploadGuard_Factory INSTANCE = new UploadGuard_Factory();
    public static ChangeQuickRedirect changeQuickRedirect;

    public static UploadGuard_Factory create() {
        return INSTANCE;
    }

    static {
        Covode.recordClassIndex(3140);
    }

    public static UploadGuard newUploadGuard() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (UploadGuard) proxy.result;
        }
        return new UploadGuard();
    }

    public static UploadGuard provideInstance() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (UploadGuard) proxy.result;
        }
        return new UploadGuard();
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final UploadGuard mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (UploadGuard) proxy.result;
        }
        return provideInstance();
    }
}
