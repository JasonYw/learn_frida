package cn.ever.cloud.android.api.impl;

import cn.ever.cloud.android.p039a.AbstractC0680b;
import cn.ever.cloud.android.services.download.DownloadService;
import cn.ever.cloud.android.services.task.TaskService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC80193HjH;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class DownloadApiImpl_Factory implements K8J<DownloadApiImpl> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC80193HjH<AbstractC0680b> assetRepositoryProvider;
    public final AbstractC80193HjH<DownloadService> downloadServiceProvider;
    public final AbstractC80193HjH<TaskService> taskServiceProvider;

    static {
        Covode.recordClassIndex(2799);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final DownloadApiImpl mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (DownloadApiImpl) proxy.result;
        }
        return provideInstance(this.downloadServiceProvider, this.assetRepositoryProvider, this.taskServiceProvider);
    }

    public DownloadApiImpl_Factory(AbstractC80193HjH<DownloadService> abstractC80193HjH, AbstractC80193HjH<AbstractC0680b> abstractC80193HjH2, AbstractC80193HjH<TaskService> abstractC80193HjH3) {
        this.downloadServiceProvider = abstractC80193HjH;
        this.assetRepositoryProvider = abstractC80193HjH2;
        this.taskServiceProvider = abstractC80193HjH3;
    }

    public static DownloadApiImpl_Factory create(AbstractC80193HjH<DownloadService> abstractC80193HjH, AbstractC80193HjH<AbstractC0680b> abstractC80193HjH2, AbstractC80193HjH<TaskService> abstractC80193HjH3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (DownloadApiImpl_Factory) proxy.result;
        }
        return new DownloadApiImpl_Factory(abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3);
    }

    public static DownloadApiImpl newDownloadApiImpl(DownloadService downloadService, AbstractC0680b abstractC0680b, TaskService taskService) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{downloadService, abstractC0680b, taskService}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (DownloadApiImpl) proxy.result;
        }
        return new DownloadApiImpl(downloadService, abstractC0680b, taskService);
    }

    public static DownloadApiImpl provideInstance(AbstractC80193HjH<DownloadService> abstractC80193HjH, AbstractC80193HjH<AbstractC0680b> abstractC80193HjH2, AbstractC80193HjH<TaskService> abstractC80193HjH3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2, abstractC80193HjH3}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (DownloadApiImpl) proxy.result;
        }
        return new DownloadApiImpl(abstractC80193HjH.mo28680get(), abstractC80193HjH2.mo28680get(), abstractC80193HjH3.mo28680get());
    }
}
