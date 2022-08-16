package cn.ever.cloud.android.services.task;

import cn.ever.cloud.android.services.task.entity.TaskItem;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class TaskService$schedule$processListener$1 extends Lambda implements Function1<TaskItem, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ TaskProvider $provider;
    public final /* synthetic */ TaskService this$0;

    static {
        Covode.recordClassIndex(3058);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskService$schedule$processListener$1(TaskService taskService, TaskProvider taskProvider) {
        super(1);
        this.this$0 = taskService;
        this.$provider = taskProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Unit invoke(TaskItem taskItem) {
        invoke2(taskItem);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(TaskItem taskItem) {
        if (PatchProxy.proxy(new Object[]{taskItem}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(taskItem);
        Long groupId = taskItem.getGroupId();
        if (groupId != null) {
            this.this$0.updateProgressAndSendGroupProgress(groupId.longValue(), this.$provider, true);
        }
    }
}
