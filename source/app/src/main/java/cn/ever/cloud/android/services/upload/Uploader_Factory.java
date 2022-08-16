package cn.ever.cloud.android.services.upload;

import cn.ever.cloud.android.coroutine.SdkScope;
import cn.ever.cloud.android.p039a.AbstractC0682d;
import cn.ever.cloud.android.runtime.DigestHasher;
import cn.ever.cloud.android.runtime.RuntimeExtManager;
import cn.ever.cloud.android.runtime.SandboxManager;
import cn.ever.cloud.network.api.AbstractC0729a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC80193HjH;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class Uploader_Factory implements K8J<Uploader> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC80193HjH<AbstractC0729a> apiClientProvider;
    public final AbstractC80193HjH<DigestHasher> hasherProvider;
    public final AbstractC80193HjH<AbstractC0682d> repoProvider;
    public final AbstractC80193HjH<RuntimeExtManager> runtimeExtManagerProvider;
    public final AbstractC80193HjH<SandboxManager> sandboxManagerProvider;
    public final AbstractC80193HjH<SdkScope> scopeProvider;
    public final AbstractC80193HjH<AbstractC0727a> uploadCompleterProvider;
    public final AbstractC80193HjH<UploadGuard> uploadGuardProvider;

    static {
        Covode.recordClassIndex(3163);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final Uploader mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Uploader) proxy.result;
        }
        return provideInstance(this.apiClientProvider, this.hasherProvider, this.sandboxManagerProvider, this.uploadCompleterProvider, this.scopeProvider, this.uploadGuardProvider, this.runtimeExtManagerProvider, this.repoProvider);
    }

    public Uploader_Factory(AbstractC80193HjH<AbstractC0729a> abstractC80193HjH, AbstractC80193HjH<DigestHasher> abstractC80193HjH2, AbstractC80193HjH<SandboxManager> abstractC80193HjH3, AbstractC80193HjH<AbstractC0727a> abstractC80193HjH4, AbstractC80193HjH<SdkScope> abstractC80193HjH5, AbstractC80193HjH<UploadGuard> abstractC80193HjH6, AbstractC80193HjH<RuntimeExtManager> abstractC80193HjH7, AbstractC80193HjH<AbstractC0682d> abstractC80193HjH8) {
        this.apiClientProvider = abstractC80193HjH;
        this.hasherProvider = abstractC80193HjH2;
        this.sandboxManagerProvider = abstractC80193HjH3;
        this.uploadCompleterProvider = abstractC80193HjH4;
        this.scopeProvider = abstractC80193HjH5;
        this.uploadGuardProvider = abstractC80193HjH6;
        this.runtimeExtManagerProvider = abstractC80193HjH7;
        this.repoProvider = abstractC80193HjH8;
    }

    public static Uploader_Factory create(AbstractC80193HjH<AbstractC0729a> abstractC80193HjH, AbstractC80193HjH<DigestHasher> abstractC80193HjH2, AbstractC80193HjH<SandboxManager> abstractC80193HjH3, AbstractC80193HjH<AbstractC0727a> abstractC80193HjH4, AbstractC80193HjH<SdkScope> abstractC80193HjH5, AbstractC80193HjH<UploadGuard> abstractC80193HjH6, AbstractC80193HjH<RuntimeExtManager> abstractC80193HjH7, AbstractC80193HjH<AbstractC0682d> abstractC80193HjH8) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3, abstractC80193HjH4, abstractC80193HjH5, abstractC80193HjH6, abstractC80193HjH7, abstractC80193HjH8}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (Uploader_Factory) proxy.result;
        }
        return new Uploader_Factory(abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3, abstractC80193HjH4, abstractC80193HjH5, abstractC80193HjH6, abstractC80193HjH7, abstractC80193HjH8);
    }

    public static Uploader newUploader(AbstractC0729a abstractC0729a, DigestHasher digestHasher, SandboxManager sandboxManager, AbstractC0727a abstractC0727a, SdkScope sdkScope, UploadGuard uploadGuard, RuntimeExtManager runtimeExtManager, AbstractC0682d abstractC0682d) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC0729a, digestHasher, sandboxManager, abstractC0727a, sdkScope, uploadGuard, runtimeExtManager, abstractC0682d}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (Uploader) proxy.result;
        }
        return new Uploader(abstractC0729a, digestHasher, sandboxManager, abstractC0727a, sdkScope, uploadGuard, runtimeExtManager, abstractC0682d);
    }

    public static Uploader provideInstance(AbstractC80193HjH<AbstractC0729a> abstractC80193HjH, AbstractC80193HjH<DigestHasher> abstractC80193HjH2, AbstractC80193HjH<SandboxManager> abstractC80193HjH3, AbstractC80193HjH<AbstractC0727a> abstractC80193HjH4, AbstractC80193HjH<SdkScope> abstractC80193HjH5, AbstractC80193HjH<UploadGuard> abstractC80193HjH6, AbstractC80193HjH<RuntimeExtManager> abstractC80193HjH7, AbstractC80193HjH<AbstractC0682d> abstractC80193HjH8) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3, abstractC80193HjH4, abstractC80193HjH5, abstractC80193HjH6, abstractC80193HjH7, abstractC80193HjH8}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (Uploader) proxy.result;
        }
        return new Uploader(abstractC80193HjH.mo28680get(), abstractC80193HjH2.mo28680get(), abstractC80193HjH3.mo28680get(), abstractC80193HjH4.mo28680get(), abstractC80193HjH5.mo28680get(), abstractC80193HjH6.mo28680get(), abstractC80193HjH7.mo28680get(), abstractC80193HjH8.mo28680get());
    }
}
