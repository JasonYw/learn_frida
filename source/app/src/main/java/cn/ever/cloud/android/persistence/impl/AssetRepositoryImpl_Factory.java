package cn.ever.cloud.android.persistence.impl;

import cn.ever.cloud.android.persistence.SdkDatabase;
import cn.ever.cloud.android.services.AlbumChangeEventBus;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC80193HjH;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class AssetRepositoryImpl_Factory implements K8J<AssetRepositoryImpl> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC80193HjH<AlbumChangeEventBus> albumChangeEventBusProvider;
    public final AbstractC80193HjH<SdkDatabase> dbProvider;

    static {
        Covode.recordClassIndex(2926);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final AssetRepositoryImpl mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (AssetRepositoryImpl) proxy.result;
        }
        return provideInstance(this.dbProvider, this.albumChangeEventBusProvider);
    }

    public AssetRepositoryImpl_Factory(AbstractC80193HjH<SdkDatabase> abstractC80193HjH, AbstractC80193HjH<AlbumChangeEventBus> abstractC80193HjH2) {
        this.dbProvider = abstractC80193HjH;
        this.albumChangeEventBusProvider = abstractC80193HjH2;
    }

    public static AssetRepositoryImpl_Factory create(AbstractC80193HjH<SdkDatabase> abstractC80193HjH, AbstractC80193HjH<AlbumChangeEventBus> abstractC80193HjH2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (AssetRepositoryImpl_Factory) proxy.result;
        }
        return new AssetRepositoryImpl_Factory(abstractC80193HjH, abstractC80193HjH2);
    }

    public static AssetRepositoryImpl newAssetRepositoryImpl(SdkDatabase sdkDatabase, AlbumChangeEventBus albumChangeEventBus) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sdkDatabase, albumChangeEventBus}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (AssetRepositoryImpl) proxy.result;
        }
        return new AssetRepositoryImpl(sdkDatabase, albumChangeEventBus);
    }

    public static AssetRepositoryImpl provideInstance(AbstractC80193HjH<SdkDatabase> abstractC80193HjH, AbstractC80193HjH<AlbumChangeEventBus> abstractC80193HjH2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (AssetRepositoryImpl) proxy.result;
        }
        return new AssetRepositoryImpl(abstractC80193HjH.mo28680get(), abstractC80193HjH2.mo28680get());
    }
}
