package cn.ever.cloud.android.api.impl;

import cn.ever.cloud.android.services.AssetService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC80193HjH;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class AssetApiImpl_Factory implements K8J<AssetApiImpl> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC80193HjH<AssetService> clientProvider;

    static {
        Covode.recordClassIndex(2781);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final AssetApiImpl mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (AssetApiImpl) proxy.result;
        }
        return provideInstance(this.clientProvider);
    }

    public AssetApiImpl_Factory(AbstractC80193HjH<AssetService> abstractC80193HjH) {
        this.clientProvider = abstractC80193HjH;
    }

    public static AssetApiImpl_Factory create(AbstractC80193HjH<AssetService> abstractC80193HjH) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (AssetApiImpl_Factory) proxy.result;
        }
        return new AssetApiImpl_Factory(abstractC80193HjH);
    }

    public static AssetApiImpl newAssetApiImpl(AssetService assetService) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{assetService}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (AssetApiImpl) proxy.result;
        }
        return new AssetApiImpl(assetService);
    }

    public static AssetApiImpl provideInstance(AbstractC80193HjH<AssetService> abstractC80193HjH) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (AssetApiImpl) proxy.result;
        }
        return new AssetApiImpl(abstractC80193HjH.mo28680get());
    }
}
