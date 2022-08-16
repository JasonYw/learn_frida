package cn.ever.cloud.android.services;

import cn.ever.cloud.android.p039a.AbstractC0680b;
import cn.ever.cloud.android.p039a.AbstractC0681c;
import cn.ever.cloud.android.p039a.AbstractC0684f;
import cn.ever.cloud.android.remote.SyncRemoteRepo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC80193HjH;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class SyncService_Factory implements K8J<SyncService> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC80193HjH<AlbumService> albumServiceProvider;
    public final AbstractC80193HjH<AbstractC0680b> assetRepositoryProvider;
    public final AbstractC80193HjH<AbstractC0681c> kvRepoProvider;
    public final AbstractC80193HjH<SyncRemoteRepo> remoteRepoProvider;
    public final AbstractC80193HjH<AbstractC0684f> userRepositoryProvider;

    static {
        Covode.recordClassIndex(2997);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final SyncService mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (SyncService) proxy.result;
        }
        return provideInstance(this.assetRepositoryProvider, this.albumServiceProvider, this.remoteRepoProvider, this.kvRepoProvider, this.userRepositoryProvider);
    }

    public SyncService_Factory(AbstractC80193HjH<AbstractC0680b> abstractC80193HjH, AbstractC80193HjH<AlbumService> abstractC80193HjH2, AbstractC80193HjH<SyncRemoteRepo> abstractC80193HjH3, AbstractC80193HjH<AbstractC0681c> abstractC80193HjH4, AbstractC80193HjH<AbstractC0684f> abstractC80193HjH5) {
        this.assetRepositoryProvider = abstractC80193HjH;
        this.albumServiceProvider = abstractC80193HjH2;
        this.remoteRepoProvider = abstractC80193HjH3;
        this.kvRepoProvider = abstractC80193HjH4;
        this.userRepositoryProvider = abstractC80193HjH5;
    }

    public static SyncService_Factory create(AbstractC80193HjH<AbstractC0680b> abstractC80193HjH, AbstractC80193HjH<AlbumService> abstractC80193HjH2, AbstractC80193HjH<SyncRemoteRepo> abstractC80193HjH3, AbstractC80193HjH<AbstractC0681c> abstractC80193HjH4, AbstractC80193HjH<AbstractC0684f> abstractC80193HjH5) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3, abstractC80193HjH4, abstractC80193HjH5}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (SyncService_Factory) proxy.result;
        }
        return new SyncService_Factory(abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3, abstractC80193HjH4, abstractC80193HjH5);
    }

    public static SyncService newSyncService(AbstractC0680b abstractC0680b, AlbumService albumService, SyncRemoteRepo syncRemoteRepo, AbstractC0681c abstractC0681c, AbstractC0684f abstractC0684f) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC0680b, albumService, syncRemoteRepo, abstractC0681c, abstractC0684f}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (SyncService) proxy.result;
        }
        return new SyncService(abstractC0680b, albumService, syncRemoteRepo, abstractC0681c, abstractC0684f);
    }

    public static SyncService provideInstance(AbstractC80193HjH<AbstractC0680b> abstractC80193HjH, AbstractC80193HjH<AlbumService> abstractC80193HjH2, AbstractC80193HjH<SyncRemoteRepo> abstractC80193HjH3, AbstractC80193HjH<AbstractC0681c> abstractC80193HjH4, AbstractC80193HjH<AbstractC0684f> abstractC80193HjH5) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3, abstractC80193HjH4, abstractC80193HjH5}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (SyncService) proxy.result;
        }
        return new SyncService(abstractC80193HjH.mo28680get(), abstractC80193HjH2.mo28680get(), abstractC80193HjH3.mo28680get(), abstractC80193HjH4.mo28680get(), abstractC80193HjH5.mo28680get());
    }
}
