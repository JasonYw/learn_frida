package cn.ever.cloud.android.services.download;

import cn.ever.cloud.android.coroutine.SdkScope;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC80193HjH;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class DownloadService_Factory implements K8J<DownloadService> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC80193HjH<Downloader> downloaderProvider;
    public final AbstractC80193HjH<SdkScope> scopeProvider;

    static {
        Covode.recordClassIndex(3016);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final DownloadService mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (DownloadService) proxy.result;
        }
        return provideInstance(this.scopeProvider, this.downloaderProvider);
    }

    public DownloadService_Factory(AbstractC80193HjH<SdkScope> abstractC80193HjH, AbstractC80193HjH<Downloader> abstractC80193HjH2) {
        this.scopeProvider = abstractC80193HjH;
        this.downloaderProvider = abstractC80193HjH2;
    }

    public static DownloadService_Factory create(AbstractC80193HjH<SdkScope> abstractC80193HjH, AbstractC80193HjH<Downloader> abstractC80193HjH2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (DownloadService_Factory) proxy.result;
        }
        return new DownloadService_Factory(abstractC80193HjH, abstractC80193HjH2);
    }

    public static DownloadService newDownloadService(SdkScope sdkScope, Downloader downloader) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sdkScope, downloader}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (DownloadService) proxy.result;
        }
        return new DownloadService(sdkScope, downloader);
    }

    public static DownloadService provideInstance(AbstractC80193HjH<SdkScope> abstractC80193HjH, AbstractC80193HjH<Downloader> abstractC80193HjH2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (DownloadService) proxy.result;
        }
        return new DownloadService(abstractC80193HjH.mo28680get(), abstractC80193HjH2.mo28680get());
    }
}
