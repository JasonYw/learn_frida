package cn.ever.cloud.android.services;

import cn.ever.cloud.android.p039a.AbstractC0680b;
import cn.ever.cloud.network.api.AbstractC0729a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC80193HjH;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class AssetService_Factory implements K8J<AssetService> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC80193HjH<AbstractC0729a> apiClientProvider;
    public final AbstractC80193HjH<AbstractC0680b> assetRepositoryProvider;

    static {
        Covode.recordClassIndex(2986);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final AssetService mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (AssetService) proxy.result;
        }
        return provideInstance(this.assetRepositoryProvider, this.apiClientProvider);
    }

    public AssetService_Factory(AbstractC80193HjH<AbstractC0680b> abstractC80193HjH, AbstractC80193HjH<AbstractC0729a> abstractC80193HjH2) {
        this.assetRepositoryProvider = abstractC80193HjH;
        this.apiClientProvider = abstractC80193HjH2;
    }

    public static AssetService_Factory create(AbstractC80193HjH<AbstractC0680b> abstractC80193HjH, AbstractC80193HjH<AbstractC0729a> abstractC80193HjH2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (AssetService_Factory) proxy.result;
        }
        return new AssetService_Factory(abstractC80193HjH, abstractC80193HjH2);
    }

    public static AssetService newAssetService(AbstractC0680b abstractC0680b, AbstractC0729a abstractC0729a) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC0680b, abstractC0729a}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (AssetService) proxy.result;
        }
        return new AssetService(abstractC0680b, abstractC0729a);
    }

    public static AssetService provideInstance(AbstractC80193HjH<AbstractC0680b> abstractC80193HjH, AbstractC80193HjH<AbstractC0729a> abstractC80193HjH2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (AssetService) proxy.result;
        }
        return new AssetService(abstractC80193HjH.mo28680get(), abstractC80193HjH2.mo28680get());
    }
}
