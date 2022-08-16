package cn.ever.cloud.android;

import cn.ever.cloud.android.p039a.AbstractC0680b;
import cn.ever.cloud.android.runtime.RuntimeExtManager;
import cn.ever.cloud.android.services.AssetService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC80193HjH;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class MediaUploadCompleterImpl_Factory implements K8J<MediaUploadCompleterImpl> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC80193HjH<AbstractC0680b> assetRepositoryProvider;
    public final AbstractC80193HjH<AssetService> assetServiceProvider;
    public final AbstractC80193HjH<RuntimeExtManager> runtimeExtManagerProvider;

    static {
        Covode.recordClassIndex(2742);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final MediaUploadCompleterImpl mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (MediaUploadCompleterImpl) proxy.result;
        }
        return provideInstance(this.assetRepositoryProvider, this.assetServiceProvider, this.runtimeExtManagerProvider);
    }

    public MediaUploadCompleterImpl_Factory(AbstractC80193HjH<AbstractC0680b> abstractC80193HjH, AbstractC80193HjH<AssetService> abstractC80193HjH2, AbstractC80193HjH<RuntimeExtManager> abstractC80193HjH3) {
        this.assetRepositoryProvider = abstractC80193HjH;
        this.assetServiceProvider = abstractC80193HjH2;
        this.runtimeExtManagerProvider = abstractC80193HjH3;
    }

    public static MediaUploadCompleterImpl_Factory create(AbstractC80193HjH<AbstractC0680b> abstractC80193HjH, AbstractC80193HjH<AssetService> abstractC80193HjH2, AbstractC80193HjH<RuntimeExtManager> abstractC80193HjH3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (MediaUploadCompleterImpl_Factory) proxy.result;
        }
        return new MediaUploadCompleterImpl_Factory(abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3);
    }

    public static MediaUploadCompleterImpl newMediaUploadCompleterImpl(AbstractC0680b abstractC0680b, AssetService assetService, RuntimeExtManager runtimeExtManager) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC0680b, assetService, runtimeExtManager}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (MediaUploadCompleterImpl) proxy.result;
        }
        return new MediaUploadCompleterImpl(abstractC0680b, assetService, runtimeExtManager);
    }

    public static MediaUploadCompleterImpl provideInstance(AbstractC80193HjH<AbstractC0680b> abstractC80193HjH, AbstractC80193HjH<AssetService> abstractC80193HjH2, AbstractC80193HjH<RuntimeExtManager> abstractC80193HjH3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (MediaUploadCompleterImpl) proxy.result;
        }
        return new MediaUploadCompleterImpl(abstractC80193HjH.mo28680get(), abstractC80193HjH2.mo28680get(), abstractC80193HjH3.mo28680get());
    }
}
