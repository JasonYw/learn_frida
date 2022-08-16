package cn.ever.cloud.android.services.task;

import cn.ever.cloud.android.services.task.TaskService;
import cn.ever.cloud.android.services.task.entity.PauseReason;
import cn.ever.cloud.android.services.task.entity.TaskItem;
import cn.ever.cloud.android.services.task.entity.TaskState;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class TaskService$schedule$$inlined$let$lambda$1 extends Lambda implements Function1<TaskItem, TaskItem> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ long $itemId$inlined;
    public final /* synthetic */ Pair $itemToPause$inlined;
    public final /* synthetic */ PauseReason $reason$inlined;
    public final /* synthetic */ TaskService this$0;

    static {
        Covode.recordClassIndex(3053);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskService$schedule$$inlined$let$lambda$1(TaskService taskService, long j, PauseReason pauseReason, Pair pair) {
        super(1);
        this.this$0 = taskService;
        this.$itemId$inlined = j;
        this.$reason$inlined = pauseReason;
        this.$itemToPause$inlined = pair;
    }

    @Override // kotlin.jvm.functions.Function1
    public final TaskItem invoke(TaskItem taskItem) {
        PauseReason reason;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (TaskItem) proxy.result;
        }
        C106862S5w.LIZ(taskItem);
        int i = TaskService.WhenMappings.$EnumSwitchMapping$3[taskItem.getState().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 || (reason = taskItem.getReason()) == null || !reason.isAbleToResumeBy(this.$reason$inlined)) {
                return null;
            }
            return TaskItem.copy$default(taskItem, 0L, 0, null, null, null, null, null, null, null, this.$reason$inlined, null, null, 3583, null);
        }
        return TaskItem.copy$default(taskItem, 0L, 0, null, null, null, null, null, null, TaskState.Pause, this.$reason$inlined, null, null, 2303, null);
    }
}
