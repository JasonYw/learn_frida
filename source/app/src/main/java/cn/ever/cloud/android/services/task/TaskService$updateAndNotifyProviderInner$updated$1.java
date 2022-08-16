package cn.ever.cloud.android.services.task;

import cn.ever.cloud.android.services.task.entity.TaskItem;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class TaskService$updateAndNotifyProviderInner$updated$1 extends Lambda implements Function1<TaskItem, TaskItem> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Ref.ObjectRef $newTaskItem;
    public final /* synthetic */ Ref.ObjectRef $oldState;
    public final /* synthetic */ Function1 $updateFn;

    static {
        Covode.recordClassIndex(3067);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskService$updateAndNotifyProviderInner$updated$1(Ref.ObjectRef objectRef, Function1 function1, Ref.ObjectRef objectRef2) {
        super(1);
        this.$oldState = objectRef;
        this.$updateFn = function1;
        this.$newTaskItem = objectRef2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, cn.ever.cloud.android.services.task.entity.TaskState] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, cn.ever.cloud.android.services.task.entity.TaskItem] */
    @Override // kotlin.jvm.functions.Function1
    public final TaskItem invoke(TaskItem taskItem) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (TaskItem) proxy.result;
        }
        C106862S5w.LIZ(taskItem);
        this.$oldState.element = taskItem.getState();
        ?? r1 = (TaskItem) this.$updateFn.invoke(taskItem);
        this.$newTaskItem.element = r1;
        return r1;
    }
}
