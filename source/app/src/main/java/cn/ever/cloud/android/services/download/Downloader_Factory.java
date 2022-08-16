package cn.ever.cloud.android.services.download;

import cn.ever.cloud.android.coroutine.SdkScope;
import cn.ever.cloud.android.runtime.DigestHasher;
import cn.ever.cloud.network.api.AbstractC0729a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC80193HjH;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class Downloader_Factory implements K8J<Downloader> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC80193HjH<AbstractC0729a> apiClientProvider;
    public final AbstractC80193HjH<DigestHasher> digestHasherProvider;
    public final AbstractC80193HjH<SdkScope> scopeProvider;

    static {
        Covode.recordClassIndex(3040);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final Downloader mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Downloader) proxy.result;
        }
        return provideInstance(this.digestHasherProvider, this.apiClientProvider, this.scopeProvider);
    }

    public Downloader_Factory(AbstractC80193HjH<DigestHasher> abstractC80193HjH, AbstractC80193HjH<AbstractC0729a> abstractC80193HjH2, AbstractC80193HjH<SdkScope> abstractC80193HjH3) {
        this.digestHasherProvider = abstractC80193HjH;
        this.apiClientProvider = abstractC80193HjH2;
        this.scopeProvider = abstractC80193HjH3;
    }

    public static Downloader_Factory create(AbstractC80193HjH<DigestHasher> abstractC80193HjH, AbstractC80193HjH<AbstractC0729a> abstractC80193HjH2, AbstractC80193HjH<SdkScope> abstractC80193HjH3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (Downloader_Factory) proxy.result;
        }
        return new Downloader_Factory(abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3);
    }

    public static Downloader newDownloader(DigestHasher digestHasher, AbstractC0729a abstractC0729a, SdkScope sdkScope) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{digestHasher, abstractC0729a, sdkScope}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (Downloader) proxy.result;
        }
        return new Downloader(digestHasher, abstractC0729a, sdkScope);
    }

    public static Downloader provideInstance(AbstractC80193HjH<DigestHasher> abstractC80193HjH, AbstractC80193HjH<AbstractC0729a> abstractC80193HjH2, AbstractC80193HjH<SdkScope> abstractC80193HjH3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (Downloader) proxy.result;
        }
        return new Downloader(abstractC80193HjH.mo28680get(), abstractC80193HjH2.mo28680get(), abstractC80193HjH3.mo28680get());
    }
}
