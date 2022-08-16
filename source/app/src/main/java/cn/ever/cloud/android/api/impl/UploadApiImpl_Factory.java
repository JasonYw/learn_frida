package cn.ever.cloud.android.api.impl;

import cn.ever.cloud.android.services.task.TaskService;
import cn.ever.cloud.android.services.upload.UploadService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC80193HjH;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class UploadApiImpl_Factory implements K8J<UploadApiImpl> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC80193HjH<TaskService> taskServiceProvider;
    public final AbstractC80193HjH<UploadService> uploadServiceProvider;

    static {
        Covode.recordClassIndex(2827);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final UploadApiImpl mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (UploadApiImpl) proxy.result;
        }
        return provideInstance(this.uploadServiceProvider, this.taskServiceProvider);
    }

    public UploadApiImpl_Factory(AbstractC80193HjH<UploadService> abstractC80193HjH, AbstractC80193HjH<TaskService> abstractC80193HjH2) {
        this.uploadServiceProvider = abstractC80193HjH;
        this.taskServiceProvider = abstractC80193HjH2;
    }

    public static UploadApiImpl_Factory create(AbstractC80193HjH<UploadService> abstractC80193HjH, AbstractC80193HjH<TaskService> abstractC80193HjH2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (UploadApiImpl_Factory) proxy.result;
        }
        return new UploadApiImpl_Factory(abstractC80193HjH, abstractC80193HjH2);
    }

    public static UploadApiImpl newUploadApiImpl(UploadService uploadService, TaskService taskService) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uploadService, taskService}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (UploadApiImpl) proxy.result;
        }
        return new UploadApiImpl(uploadService, taskService);
    }

    public static UploadApiImpl provideInstance(AbstractC80193HjH<UploadService> abstractC80193HjH, AbstractC80193HjH<TaskService> abstractC80193HjH2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH, abstractC80193HjH2}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (UploadApiImpl) proxy.result;
        }
        return new UploadApiImpl(abstractC80193HjH.mo28680get(), abstractC80193HjH2.mo28680get());
    }
}
