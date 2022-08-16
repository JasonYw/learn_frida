package cn.ever.cloud.android.services.download;

import cn.ever.cloud.android.coroutine.SdkScope;
import cn.ever.cloud.android.services.task.entity.EventBag;
import cn.ever.cloud.android.services.task.entity.TaskEventProcessor;
import cn.ever.cloud.android.services.task.entity.TaskGroupEventAggregator;
import cn.ever.cloud.android.services.task.entity.TaskItem;
import cn.ever.cloud.android.services.task.entity.TaskState;
import cn.ever.cloud.utils.Result;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.C521246ic;

/* loaded from: classes23.dex */
public final class DownloadEventProcessor extends TaskEventProcessor<DownloadGroupEvent, DownloadItemEvent> {
    public static final C521246ic Companion = new C521246ic((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3004);
    }

    @Override // cn.ever.cloud.android.services.task.entity.TaskEventProcessor
    public final TaskGroupEventAggregator<DownloadGroupEvent> groupEventAggregator() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (TaskGroupEventAggregator) proxy.result;
        }
        return new DownloadEventAggregator();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadEventProcessor(SdkScope sdkScope) {
        super(sdkScope, null, null, null, 14, null);
        C106862S5w.LIZ(sdkScope);
    }

    @Override // cn.ever.cloud.android.services.task.entity.TaskEventProcessor
    public final Result<DownloadItemEvent> createItemEventFrom(EventBag eventBag) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{eventBag}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Result) proxy.result;
        }
        C106862S5w.LIZ(eventBag);
        if (eventBag instanceof DownloadEventBag) {
            return Result.Companion.success(new DownloadItemEvent((DownloadEventBag) eventBag));
        }
        Result.Companion companion = Result.Companion;
        return companion.failure(new IllegalStateException("send task item event but bag is not a DownloadEventBag, found " + eventBag));
    }

    @Override // cn.ever.cloud.android.services.task.entity.TaskEventProcessor
    public final Result<DownloadItemEvent> createItemEventFrom(TaskItem taskItem) {
        Object obj;
        DownloadCompleteExtra downloadCompleteExtra;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (Result) proxy.result;
        }
        C106862S5w.LIZ(taskItem);
        String str = null;
        if (taskItem.getState() == TaskState.Succeeded && (obj = taskItem.getParams().getInner().get(DownloadCompleteExtra.class)) != null && (downloadCompleteExtra = (DownloadCompleteExtra) obj) != null) {
            str = downloadCompleteExtra.getPath();
        }
        return createItemEventFrom(new DownloadEventBag(taskItem.getId(), taskItem.getItemKey(), taskItem.getGroupId(), taskItem.getGroupKey(), taskItem.getKind(), taskItem.getProviderKey(), taskItem.getState(), taskItem.getError(), str));
    }
}
