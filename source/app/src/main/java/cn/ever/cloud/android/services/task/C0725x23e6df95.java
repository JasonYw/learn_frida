package cn.ever.cloud.android.services.task;

import cn.ever.cloud.android.services.task.entity.Command;
import cn.ever.cloud.android.services.task.entity.ScheduleTaskItemAction;
import cn.ever.cloud.android.services.task.entity.TaskItem;
import cn.ever.cloud.android.services.task.entity.TaskState;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* renamed from: cn.ever.cloud.android.services.task.TaskService$startCommandLoop$1$invokeSuspend$$inlined$forEach$lambda$1 */
/* loaded from: classes23.dex */
public final class C0725x23e6df95 extends Lambda implements Function1<TaskItem, TaskItem> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Command $command$inlined;
    public final /* synthetic */ ScheduleTaskItemAction $scheduleItemAction$inlined;
    public final /* synthetic */ TaskService$startCommandLoop$1 this$0;

    static {
        Covode.recordClassIndex(3064);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0725x23e6df95(TaskService$startCommandLoop$1 taskService$startCommandLoop$1, Command command, ScheduleTaskItemAction scheduleTaskItemAction) {
        super(1);
        this.this$0 = taskService$startCommandLoop$1;
        this.$command$inlined = command;
        this.$scheduleItemAction$inlined = scheduleTaskItemAction;
    }

    @Override // kotlin.jvm.functions.Function1
    public final TaskItem invoke(TaskItem taskItem) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (TaskItem) proxy.result;
        }
        C106862S5w.LIZ(taskItem);
        if (taskItem.ableToResume(((Command.TaskItemResumeCommand) this.$command$inlined).getReason())) {
            return TaskItem.copy$default(taskItem, 0L, 0, null, null, null, null, null, null, TaskState.Waiting, null, null, null, 2303, null);
        }
        return null;
    }
}
