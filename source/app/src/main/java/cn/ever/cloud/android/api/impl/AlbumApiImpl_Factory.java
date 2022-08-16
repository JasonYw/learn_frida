package cn.ever.cloud.android.api.impl;

import cn.ever.cloud.android.services.AlbumService;
import cn.ever.cloud.android.services.AssetService;
import cn.ever.cloud.android.services.task.TaskService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC80193HjH;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class AlbumApiImpl_Factory implements K8J<AlbumApiImpl> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC80193HjH<AlbumService> albumServiceProvider;
    public final AbstractC80193HjH<AssetService> assetServiceProvider;
    public final AbstractC80193HjH<TaskService> taskServiceProvider;

    static {
        Covode.recordClassIndex(2773);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final AlbumApiImpl mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (AlbumApiImpl) proxy.result;
        }
        return provideInstance(this.albumServiceProvider, this.taskServiceProvider, this.assetServiceProvider);
    }

    public AlbumApiImpl_Factory(AbstractC80193HjH<AlbumService> abstractC80193HjH, AbstractC80193HjH<TaskService> abstractC80193HjH2, AbstractC80193HjH<AssetService> abstractC80193HjH3) {
        this.albumServiceProvider = abstractC80193HjH;
        this.taskServiceProvider = abstractC80193HjH2;
        this.assetServiceProvider = abstractC80193HjH3;
    }

    public static AlbumApiImpl_Factory create(AbstractC80193HjH<AlbumService> abstractC80193HjH, AbstractC80193HjH<TaskService> abstractC80193HjH2, AbstractC80193HjH<AssetService> abstractC80193HjH3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (AlbumApiImpl_Factory) proxy.result;
        }
        return new AlbumApiImpl_Factory(abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3);
    }

    public static AlbumApiImpl newAlbumApiImpl(AlbumService albumService, TaskService taskService, AssetService assetService) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{albumService, taskService, assetService}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (AlbumApiImpl) proxy.result;
        }
        return new AlbumApiImpl(albumService, taskService, assetService);
    }

    public static AlbumApiImpl provideInstance(AbstractC80193HjH<AlbumService> abstractC80193HjH, AbstractC80193HjH<TaskService> abstractC80193HjH2, AbstractC80193HjH<AssetService> abstractC80193HjH3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (AlbumApiImpl) proxy.result;
        }
        return new AlbumApiImpl(abstractC80193HjH.mo28680get(), abstractC80193HjH2.mo28680get(), abstractC80193HjH3.mo28680get());
    }
}
