package cn.ever.cloud.android.services.upload;

import cn.ever.cloud.android.coroutine.SdkScope;
import cn.ever.cloud.android.p039a.AbstractC0683e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC80193HjH;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class UploadService_Factory implements K8J<UploadService> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC80193HjH<AbstractC0683e> repoProvider;
    public final AbstractC80193HjH<SdkScope> scopeProvider;
    public final AbstractC80193HjH<Uploader> uploaderProvider;

    static {
        Covode.recordClassIndex(3152);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final UploadService mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (UploadService) proxy.result;
        }
        return provideInstance(this.uploaderProvider, this.repoProvider, this.scopeProvider);
    }

    public UploadService_Factory(AbstractC80193HjH<Uploader> abstractC80193HjH, AbstractC80193HjH<AbstractC0683e> abstractC80193HjH2, AbstractC80193HjH<SdkScope> abstractC80193HjH3) {
        this.uploaderProvider = abstractC80193HjH;
        this.repoProvider = abstractC80193HjH2;
        this.scopeProvider = abstractC80193HjH3;
    }

    public static UploadService_Factory create(AbstractC80193HjH<Uploader> abstractC80193HjH, AbstractC80193HjH<AbstractC0683e> abstractC80193HjH2, AbstractC80193HjH<SdkScope> abstractC80193HjH3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (UploadService_Factory) proxy.result;
        }
        return new UploadService_Factory(abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3);
    }

    public static UploadService newUploadService(Uploader uploader, AbstractC0683e abstractC0683e, SdkScope sdkScope) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uploader, abstractC0683e, sdkScope}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (UploadService) proxy.result;
        }
        return new UploadService(uploader, abstractC0683e, sdkScope);
    }

    public static UploadService provideInstance(AbstractC80193HjH<Uploader> abstractC80193HjH, AbstractC80193HjH<AbstractC0683e> abstractC80193HjH2, AbstractC80193HjH<SdkScope> abstractC80193HjH3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (UploadService) proxy.result;
        }
        return new UploadService(abstractC80193HjH.mo28680get(), abstractC80193HjH2.mo28680get(), abstractC80193HjH3.mo28680get());
    }
}
