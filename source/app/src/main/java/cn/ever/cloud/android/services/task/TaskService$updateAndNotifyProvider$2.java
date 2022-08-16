package cn.ever.cloud.android.services.task;

import cn.ever.cloud.android.services.task.entity.EventBagWrapper;
import cn.ever.cloud.android.services.task.entity.TaskItem;
import cn.ever.cloud.android.services.task.entity.TaskState;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class TaskService$updateAndNotifyProvider$2 extends Lambda implements Function2<TaskState, TaskItem, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ EventBagWrapper $eventBag;
    public final /* synthetic */ TaskProvider $provider;

    static {
        Covode.recordClassIndex(3066);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskService$updateAndNotifyProvider$2(TaskProvider taskProvider, EventBagWrapper eventBagWrapper) {
        super(2);
        this.$provider = taskProvider;
        this.$eventBag = eventBagWrapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Unit invoke(TaskState taskState, TaskItem taskItem) {
        invoke2(taskState, taskItem);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(TaskState taskState, TaskItem taskItem) {
        if (PatchProxy.proxy(new Object[]{taskState, taskItem}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(taskState, taskItem);
        TaskProvider taskProvider = this.$provider;
        if (taskProvider != null) {
            taskProvider.onItemStateChanged(taskState, taskItem);
            this.$eventBag.sendTaskItemEvent(taskProvider, taskItem);
        }
    }
}
