package cn.ever.cloud.android.services.upload;

import cn.ever.cloud.android.coroutine.SdkScope;
import cn.ever.cloud.android.services.task.entity.EventBag;
import cn.ever.cloud.android.services.task.entity.TaskEventProcessor;
import cn.ever.cloud.android.services.task.entity.TaskGroupEventAggregator;
import cn.ever.cloud.android.services.task.entity.TaskItem;
import cn.ever.cloud.utils.Result;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.C521256id;

/* loaded from: classes23.dex */
public final class UploadEventProcessor extends TaskEventProcessor<C0728b, UploadItemEvent> {
    public static final C521256id Companion = new C521256id((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3131);
    }

    @Override // cn.ever.cloud.android.services.task.entity.TaskEventProcessor
    public final TaskGroupEventAggregator<C0728b> groupEventAggregator() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (TaskGroupEventAggregator) proxy.result;
        }
        return new UploadGroupEventAggregator();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadEventProcessor(SdkScope sdkScope) {
        super(sdkScope, null, null, null, 14, null);
        C106862S5w.LIZ(sdkScope);
    }

    @Override // cn.ever.cloud.android.services.task.entity.TaskEventProcessor
    public final Result<UploadItemEvent> createItemEventFrom(EventBag eventBag) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{eventBag}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Result) proxy.result;
        }
        C106862S5w.LIZ(eventBag);
        if (eventBag instanceof UploadEventBag) {
            return Result.Companion.success(new UploadItemEvent((UploadEventBag) eventBag));
        }
        return Result.Companion.failure(new IllegalStateException("send task item event but bag is not a UploadEventBag, found "));
    }

    @Override // cn.ever.cloud.android.services.task.entity.TaskEventProcessor
    public final Result<UploadItemEvent> createItemEventFrom(TaskItem taskItem) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (Result) proxy.result;
        }
        C106862S5w.LIZ(taskItem);
        return createItemEventFrom(new UploadEventBag(taskItem.getId(), taskItem.getItemKey(), taskItem.getGroupId(), taskItem.getGroupKey(), taskItem.getKind(), taskItem.getProviderKey(), taskItem.getState(), taskItem.getError()));
    }
}
