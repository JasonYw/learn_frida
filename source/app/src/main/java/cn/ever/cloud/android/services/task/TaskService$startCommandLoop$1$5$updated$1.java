package cn.ever.cloud.android.services.task;

import cn.ever.cloud.android.services.task.TaskService;
import cn.ever.cloud.android.services.task.entity.TaskItem;
import cn.ever.cloud.android.services.task.entity.TaskState;
import cn.ever.cloud.utils.LogHelper;
import cn.ever.cloud.utils.error.EpError;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class TaskService$startCommandLoop$1$5$updated$1 extends Lambda implements Function1<TaskItem, TaskItem> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ EpError $error;

    static {
        Covode.recordClassIndex(3062);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskService$startCommandLoop$1$5$updated$1(EpError epError) {
        super(1);
        this.$error = epError;
    }

    @Override // kotlin.jvm.functions.Function1
    public final TaskItem invoke(TaskItem taskItem) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (TaskItem) proxy.result;
        }
        C106862S5w.LIZ(taskItem);
        int i = TaskService.WhenMappings.$EnumSwitchMapping$0[taskItem.getState().ordinal()];
        if (i != 1 && i != 2) {
            return TaskItem.copy$default(taskItem, 0L, 0, null, null, null, null, null, null, TaskState.Failed, null, this.$error, null, 2303, null);
        }
        LogHelper logHelper = LogHelper.INSTANCE;
        logHelper.m20554e("TaskService", "We cannot change taskItem state to failed, because taskItem state is " + taskItem.getState());
        return null;
    }
}
