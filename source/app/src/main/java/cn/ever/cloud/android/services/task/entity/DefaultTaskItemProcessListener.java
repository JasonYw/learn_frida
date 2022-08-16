package cn.ever.cloud.android.services.task.entity;

import cn.ever.cloud.android.coroutine.SdkScope;
import cn.ever.cloud.android.services.task.TaskRepository;
import cn.ever.cloud.utils.LogHelper;
import cn.ever.cloud.utils.error.EpError;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.Channel;
import p003X.AbstractC521266ie;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class DefaultTaskItemProcessListener implements AbstractC521266ie {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean closed;
    public final Channel<Command> commandChannel;
    public final TaskRepository repo;
    public final SdkScope scope;
    public final Function1<TaskItem, Unit> updateProgressAndSendGroupProgress;

    static {
        Covode.recordClassIndex(3083);
    }

    @Override // p003X.AbstractC521266ie
    public final void onCancelled(EventBag eventBag) {
        if (PatchProxy.proxy(new Object[]{eventBag}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(eventBag);
        LogHelper logHelper = LogHelper.INSTANCE;
        logHelper.m20553i("TaskService", "onCancelled, bag=" + eventBag);
        if (eventBag.getState() != TaskState.Deleted) {
            LogHelper logHelper2 = LogHelper.INSTANCE;
            logHelper2.m20554e("TaskService", "state of event bag inconsistent, required: " + TaskState.Deleted + ", found: " + eventBag.getState());
        }
        this.closed = true;
        SdkScope.launch$default(this.scope, null, new DefaultTaskItemProcessListener$onCancelled$1(this, eventBag, null), 1, null);
    }

    @Override // p003X.AbstractC521266ie
    public final void onCompleted(EventBag eventBag) {
        if (PatchProxy.proxy(new Object[]{eventBag}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(eventBag);
        LogHelper logHelper = LogHelper.INSTANCE;
        logHelper.m20553i("TaskService", "onComplete, bag=" + eventBag);
        if (eventBag.getState() != TaskState.Succeeded) {
            LogHelper logHelper2 = LogHelper.INSTANCE;
            logHelper2.m20554e("TaskService", "state of event bag inconsistent, required: " + TaskState.Succeeded + ", found: " + eventBag.getState());
        }
        this.closed = true;
        SdkScope.launch$default(this.scope, null, new DefaultTaskItemProcessListener$onCompleted$1(this, eventBag, null), 1, null);
    }

    @Override // p003X.AbstractC521266ie
    public final void onError(EventBag eventBag, EpError epError) {
        if (PatchProxy.proxy(new Object[]{eventBag, epError}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(eventBag, epError);
        LogHelper logHelper = LogHelper.INSTANCE;
        logHelper.m20554e("TaskService", "onError, bag=" + eventBag + ", error=" + epError);
        if (eventBag.getState() != TaskState.Failed) {
            LogHelper logHelper2 = LogHelper.INSTANCE;
            logHelper2.m20554e("TaskService", "state of event bag inconsistent, required: " + TaskState.Failed + ", found: " + eventBag.getState());
        }
        this.closed = true;
        SdkScope.launch$default(this.scope, null, new DefaultTaskItemProcessListener$onError$1(this, eventBag, null), 1, null);
    }

    @Override // p003X.AbstractC521266ie
    public final void onProgress(EventBag eventBag, ItemProgress itemProgress) {
        TaskParam params;
        if (PatchProxy.proxy(new Object[]{eventBag, itemProgress}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(eventBag, itemProgress);
        LogHelper logHelper = LogHelper.INSTANCE;
        logHelper.m20555d("TaskService", "onProgress, bag=" + eventBag + ". progress: " + itemProgress);
        if (eventBag.getState() != TaskState.Running) {
            LogHelper logHelper2 = LogHelper.INSTANCE;
            logHelper2.m20554e("TaskService", "state of event bag inconsistent, required: " + TaskState.Running + ", found: " + eventBag.getState());
        }
        TaskItem taskItem = this.repo.get(eventBag.getItemId());
        if (taskItem != null && (params = taskItem.getParams()) != null) {
            params.getInner().put(ItemProgress.class, itemProgress);
        }
        if (this.closed) {
            LogHelper.INSTANCE.m20555d("TaskService", "listener closed, skip notify.");
        } else if (taskItem != null) {
            this.updateProgressAndSendGroupProgress.invoke(taskItem);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultTaskItemProcessListener(SdkScope sdkScope, Channel<Command> channel, TaskRepository taskRepository, Function1<? super TaskItem, Unit> function1) {
        C106862S5w.LIZ(sdkScope, channel, taskRepository, function1);
        this.scope = sdkScope;
        this.commandChannel = channel;
        this.repo = taskRepository;
        this.updateProgressAndSendGroupProgress = function1;
    }
}
