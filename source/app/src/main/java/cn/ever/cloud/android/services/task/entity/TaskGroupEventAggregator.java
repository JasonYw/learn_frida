package cn.ever.cloud.android.services.task.entity;

import cn.ever.cloud.android.services.task.entity.TaskGroupEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public interface TaskGroupEventAggregator<GroupEvent extends TaskGroupEvent> {

    /* loaded from: classes23.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            Covode.recordClassIndex(3113);
            int[] iArr = new int[TaskState.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[TaskState.Waiting.ordinal()] = 1;
            $EnumSwitchMapping$0[TaskState.Running.ordinal()] = 2;
            $EnumSwitchMapping$0[TaskState.Pause.ordinal()] = 3;
            $EnumSwitchMapping$0[TaskState.Deleted.ordinal()] = 4;
            $EnumSwitchMapping$0[TaskState.Failed.ordinal()] = 5;
            $EnumSwitchMapping$0[TaskState.Succeeded.ordinal()] = 6;
        }
    }

    static {
        Covode.recordClassIndex(3111);
    }

    /* renamed from: aggregateGroupEvent */
    GroupEvent mo25254aggregateGroupEvent(TaskGroup taskGroup, List<TaskItem> list);

    /* loaded from: classes23.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3112);
        }

        public static <GroupEvent extends TaskGroupEvent> ItemProgress aggregateProgress(TaskGroupEventAggregator<? extends GroupEvent> taskGroupEventAggregator, List<TaskItem> list) {
            ItemProgress itemProgress;
            ItemProgress itemProgress2;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskGroupEventAggregator, list}, null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (ItemProgress) proxy.result;
            }
            C106862S5w.LIZ(list);
            ItemProgress itemProgress3 = new ItemProgress(0L, 0L);
            for (TaskItem taskItem : list) {
                Object obj = taskItem.getParams().getInner().get(ItemProgress.class);
                if (obj != null && (itemProgress = (ItemProgress) obj) != null) {
                    switch (WhenMappings.$EnumSwitchMapping$0[taskItem.getState().ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            itemProgress2 = itemProgress;
                            break;
                        case 5:
                            itemProgress2 = new ItemProgress(itemProgress.getTotalBytes(), 0L);
                            break;
                        case 6:
                            itemProgress2 = new ItemProgress(itemProgress.getTotalBytes(), itemProgress.getTotalBytes());
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    itemProgress3 = new ItemProgress(itemProgress3.getTotalBytes() + itemProgress2.getTotalBytes(), itemProgress3.getDoneBytes() + itemProgress2.getDoneBytes());
                }
            }
            return itemProgress3;
        }
    }
}
