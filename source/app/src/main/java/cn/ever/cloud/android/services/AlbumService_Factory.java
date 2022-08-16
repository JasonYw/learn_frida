package cn.ever.cloud.android.services;

import cn.ever.cloud.android.p039a.AbstractC0679a;
import cn.ever.cloud.android.p039a.AbstractC0680b;
import cn.ever.cloud.android.services.task.TaskService;
import cn.ever.cloud.android.services.upload.UploadService;
import cn.ever.cloud.network.api.AbstractC0729a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC80193HjH;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class AlbumService_Factory implements K8J<AlbumService> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC80193HjH<AlbumChangeEventBus> albumChangeEventBusProvider;
    public final AbstractC80193HjH<AbstractC0679a> albumRepositoryProvider;
    public final AbstractC80193HjH<AbstractC0729a> apiClientProvider;
    public final AbstractC80193HjH<AbstractC0680b> assetRepositoryProvider;
    public final AbstractC80193HjH<AssetService> assetServiceProvider;
    public final AbstractC80193HjH<TaskService> taskServiceProvider;
    public final AbstractC80193HjH<UploadService> uploadServiceProvider;

    static {
        Covode.recordClassIndex(2982);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final AlbumService mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (AlbumService) proxy.result;
        }
        return provideInstance(this.albumRepositoryProvider, this.assetRepositoryProvider, this.assetServiceProvider, this.uploadServiceProvider, this.taskServiceProvider, this.apiClientProvider, this.albumChangeEventBusProvider);
    }

    public AlbumService_Factory(AbstractC80193HjH<AbstractC0679a> abstractC80193HjH, AbstractC80193HjH<AbstractC0680b> abstractC80193HjH2, AbstractC80193HjH<AssetService> abstractC80193HjH3, AbstractC80193HjH<UploadService> abstractC80193HjH4, AbstractC80193HjH<TaskService> abstractC80193HjH5, AbstractC80193HjH<AbstractC0729a> abstractC80193HjH6, AbstractC80193HjH<AlbumChangeEventBus> abstractC80193HjH7) {
        this.albumRepositoryProvider = abstractC80193HjH;
        this.assetRepositoryProvider = abstractC80193HjH2;
        this.assetServiceProvider = abstractC80193HjH3;
        this.uploadServiceProvider = abstractC80193HjH4;
        this.taskServiceProvider = abstractC80193HjH5;
        this.apiClientProvider = abstractC80193HjH6;
        this.albumChangeEventBusProvider = abstractC80193HjH7;
    }

    public static AlbumService_Factory create(AbstractC80193HjH<AbstractC0679a> abstractC80193HjH, AbstractC80193HjH<AbstractC0680b> abstractC80193HjH2, AbstractC80193HjH<AssetService> abstractC80193HjH3, AbstractC80193HjH<UploadService> abstractC80193HjH4, AbstractC80193HjH<TaskService> abstractC80193HjH5, AbstractC80193HjH<AbstractC0729a> abstractC80193HjH6, AbstractC80193HjH<AlbumChangeEventBus> abstractC80193HjH7) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3, abstractC80193HjH4, abstractC80193HjH5, abstractC80193HjH6, abstractC80193HjH7}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (AlbumService_Factory) proxy.result;
        }
        return new AlbumService_Factory(abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3, abstractC80193HjH4, abstractC80193HjH5, abstractC80193HjH6, abstractC80193HjH7);
    }

    public static AlbumService newAlbumService(AbstractC0679a abstractC0679a, AbstractC0680b abstractC0680b, AssetService assetService, UploadService uploadService, TaskService taskService, AbstractC0729a abstractC0729a, AlbumChangeEventBus albumChangeEventBus) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC0679a, abstractC0680b, assetService, uploadService, taskService, abstractC0729a, albumChangeEventBus}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (AlbumService) proxy.result;
        }
        return new AlbumService(abstractC0679a, abstractC0680b, assetService, uploadService, taskService, abstractC0729a, albumChangeEventBus);
    }

    public static AlbumService provideInstance(AbstractC80193HjH<AbstractC0679a> abstractC80193HjH, AbstractC80193HjH<AbstractC0680b> abstractC80193HjH2, AbstractC80193HjH<AssetService> abstractC80193HjH3, AbstractC80193HjH<UploadService> abstractC80193HjH4, AbstractC80193HjH<TaskService> abstractC80193HjH5, AbstractC80193HjH<AbstractC0729a> abstractC80193HjH6, AbstractC80193HjH<AlbumChangeEventBus> abstractC80193HjH7) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3, abstractC80193HjH4, abstractC80193HjH5, abstractC80193HjH6, abstractC80193HjH7}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (AlbumService) proxy.result;
        }
        return new AlbumService(abstractC80193HjH.mo28680get(), abstractC80193HjH2.mo28680get(), abstractC80193HjH3.mo28680get(), abstractC80193HjH4.mo28680get(), abstractC80193HjH5.mo28680get(), abstractC80193HjH6.mo28680get(), abstractC80193HjH7.mo28680get());
    }
}
