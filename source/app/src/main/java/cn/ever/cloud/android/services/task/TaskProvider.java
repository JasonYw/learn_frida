package cn.ever.cloud.android.services.task;

import cn.ever.cloud.android.services.task.entity.ProviderKey;
import cn.ever.cloud.android.services.task.entity.ScheduleSignal;
import cn.ever.cloud.android.services.task.entity.TaskBag;
import cn.ever.cloud.android.services.task.entity.TaskEventProcessor;
import cn.ever.cloud.android.services.task.entity.TaskGroupEvent;
import cn.ever.cloud.android.services.task.entity.TaskItem;
import cn.ever.cloud.android.services.task.entity.TaskItemEvent;
import cn.ever.cloud.android.services.task.entity.TaskState;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.jvm.functions.Function0;
import p003X.AbstractC521266ie;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public interface TaskProvider {

    /* loaded from: classes23.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3043);
        }

        public static void onRegistered(TaskProvider taskProvider, ScheduleSignal scheduleSignal) {
            if (PatchProxy.proxy(new Object[]{taskProvider, scheduleSignal}, null, changeQuickRedirect, true, 1).isSupported) {
                return;
            }
            C106862S5w.LIZ(scheduleSignal);
        }
    }

    static {
        Covode.recordClassIndex(3042);
    }

    boolean cancelItem(TaskItem taskItem, boolean z);

    List<TaskItem> createTaskItems(TaskBag taskBag, Function0<Long> function0);

    TaskEventProcessor<TaskGroupEvent, TaskItemEvent> getTaskEventProcessor();

    void onItemStateChanged(TaskState taskState, TaskItem taskItem);

    void onRegistered(ScheduleSignal scheduleSignal);

    boolean process(TaskItem taskItem, AbstractC521266ie abstractC521266ie);

    int taskKind();

    ProviderKey uniqueKey();
}
