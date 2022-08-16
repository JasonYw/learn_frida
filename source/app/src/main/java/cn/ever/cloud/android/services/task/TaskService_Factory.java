package cn.ever.cloud.android.services.task;

import cn.ever.cloud.android.coroutine.SdkScope;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC80193HjH;
import p003X.K8J;

/* loaded from: classes20.dex */
public final class TaskService_Factory implements K8J<TaskService> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC80193HjH<SdkScope> scopeProvider;

    static {
        Covode.recordClassIndex(3068);
    }

    @Override // p003X.AbstractC80193HjH
    /* renamed from: get */
    public final TaskService mo28680get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (TaskService) proxy.result;
        }
        return provideInstance(this.scopeProvider);
    }

    public TaskService_Factory(AbstractC80193HjH<SdkScope> abstractC80193HjH) {
        this.scopeProvider = abstractC80193HjH;
    }

    public static TaskService_Factory create(AbstractC80193HjH<SdkScope> abstractC80193HjH) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (TaskService_Factory) proxy.result;
        }
        return new TaskService_Factory(abstractC80193HjH);
    }

    public static TaskService newTaskService(SdkScope sdkScope) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sdkScope}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (TaskService) proxy.result;
        }
        return new TaskService(sdkScope);
    }

    public static TaskService provideInstance(AbstractC80193HjH<SdkScope> abstractC80193HjH) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC80193HjH}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (TaskService) proxy.result;
        }
        return new TaskService(abstractC80193HjH.mo28680get());
    }
}
