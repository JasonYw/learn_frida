package cn.ever.cloud.android.services.task;

import cn.ever.cloud.android.services.task.entity.TaskItem;
import cn.ever.cloud.android.services.task.entity.TaskState;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class TaskService$schedule$2$updated$1 extends Lambda implements Function1<TaskItem, TaskItem> {
    public static final TaskService$schedule$2$updated$1 INSTANCE = new TaskService$schedule$2$updated$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3054);
    }

    public TaskService$schedule$2$updated$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final TaskItem invoke(TaskItem taskItem) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (TaskItem) proxy.result;
        }
        C106862S5w.LIZ(taskItem);
        return TaskItem.copy$default(taskItem, 0L, 0, null, null, null, null, null, null, TaskState.Deleted, null, null, null, 3839, null);
    }
}
