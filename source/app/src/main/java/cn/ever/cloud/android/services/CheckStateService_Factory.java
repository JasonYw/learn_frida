package cn.ever.cloud.android.services;

import cn.ever.cloud.android.p039a.AbstractC0682d;
import cn.ever.cloud.network.api.AbstractC0729a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC80193HjH;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class CheckStateService_Factory implements K8J<CheckStateService> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC80193HjH<AbstractC0729a> apiClientProvider;
    public final AbstractC80193HjH<AssetService> assetServiceProvider;
    public final AbstractC80193HjH<AbstractC0682d> toDelAssetRepositoryProvider;

    static {
        Covode.recordClassIndex(2991);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final CheckStateService mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (CheckStateService) proxy.result;
        }
        return provideInstance(this.apiClientProvider, this.assetServiceProvider, this.toDelAssetRepositoryProvider);
    }

    public CheckStateService_Factory(AbstractC80193HjH<AbstractC0729a> abstractC80193HjH, AbstractC80193HjH<AssetService> abstractC80193HjH2, AbstractC80193HjH<AbstractC0682d> abstractC80193HjH3) {
        this.apiClientProvider = abstractC80193HjH;
        this.assetServiceProvider = abstractC80193HjH2;
        this.toDelAssetRepositoryProvider = abstractC80193HjH3;
    }

    public static CheckStateService_Factory create(AbstractC80193HjH<AbstractC0729a> abstractC80193HjH, AbstractC80193HjH<AssetService> abstractC80193HjH2, AbstractC80193HjH<AbstractC0682d> abstractC80193HjH3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (CheckStateService_Factory) proxy.result;
        }
        return new CheckStateService_Factory(abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3);
    }

    public static CheckStateService newCheckStateService(AbstractC0729a abstractC0729a, AssetService assetService, AbstractC0682d abstractC0682d) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC0729a, assetService, abstractC0682d}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (CheckStateService) proxy.result;
        }
        return new CheckStateService(abstractC0729a, assetService, abstractC0682d);
    }

    public static CheckStateService provideInstance(AbstractC80193HjH<AbstractC0729a> abstractC80193HjH, AbstractC80193HjH<AssetService> abstractC80193HjH2, AbstractC80193HjH<AbstractC0682d> abstractC80193HjH3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (CheckStateService) proxy.result;
        }
        return new CheckStateService(abstractC80193HjH.mo28680get(), abstractC80193HjH2.mo28680get(), abstractC80193HjH3.mo28680get());
    }
}
