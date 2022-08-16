package cn.ever.cloud.android.services.upload;

import cn.ever.cloud.android.services.task.entity.ItemProgress;
import cn.ever.cloud.android.services.task.entity.TaskGroup;
import cn.ever.cloud.android.services.task.entity.TaskGroupEventAggregator;
import cn.ever.cloud.android.services.task.entity.TaskItem;
import cn.ever.cloud.android.services.task.entity.TaskState;
import cn.ever.cloud.utils.LogHelper;
import cn.ever.cloud.utils.error.EpError;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import p003X.C106862S5w;
import p003X.C521236ib;

/* loaded from: classes23.dex */
public final class UploadGroupEventAggregator implements TaskGroupEventAggregator<C0728b> {
    public static final C521236ib Companion = new C521236ib((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;

    /* loaded from: classes23.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            Covode.recordClassIndex(3134);
            int[] iArr = new int[TaskState.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[TaskState.Running.ordinal()] = 1;
            $EnumSwitchMapping$0[TaskState.Failed.ordinal()] = 2;
            $EnumSwitchMapping$0[TaskState.Pause.ordinal()] = 3;
            $EnumSwitchMapping$0[TaskState.Deleted.ordinal()] = 4;
            $EnumSwitchMapping$0[TaskState.Succeeded.ordinal()] = 5;
        }
    }

    static {
        Covode.recordClassIndex(3133);
    }

    public final ItemProgress aggregateProgress(List<TaskItem> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (ItemProgress) proxy.result;
        }
        C106862S5w.LIZ(list);
        return TaskGroupEventAggregator.DefaultImpls.aggregateProgress(this, list);
    }

    @Override // cn.ever.cloud.android.services.task.entity.TaskGroupEventAggregator
    /* renamed from: aggregateGroupEvent */
    public final /* bridge */ /* synthetic */ C0728b mo25254aggregateGroupEvent(TaskGroup taskGroup, List list) {
        return mo25254aggregateGroupEvent(taskGroup, (List<TaskItem>) list);
    }

    @Override // cn.ever.cloud.android.services.task.entity.TaskGroupEventAggregator
    /* renamed from: aggregateGroupEvent  reason: collision with other method in class */
    public final C0728b mo25254aggregateGroupEvent(TaskGroup taskGroup, List<TaskItem> list) {
        boolean z;
        TaskState taskState;
        Integer num;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskGroup, list}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (C0728b) proxy.result;
        }
        C106862S5w.LIZ(taskGroup, list);
        long id = taskGroup.getId();
        ItemProgress aggregateProgress = aggregateProgress(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (TaskItem taskItem : list) {
            Long groupId = taskItem.getGroupId();
            if (groupId != null && groupId.longValue() == id) {
                int i3 = WhenMappings.$EnumSwitchMapping$0[taskItem.getState().ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                if (i3 == 5) {
                                    i2++;
                                }
                            } else {
                                i++;
                                LogHelper.INSTANCE.m20554e("UploadGroupEventAggregator", "consider item deleted as abnormal state, deleted items should not reach here.");
                            }
                        } else {
                            arrayList3.add(taskItem.getItemKey());
                        }
                    } else {
                        String itemKey = taskItem.getItemKey();
                        EpError error = taskItem.getError();
                        String str = null;
                        if (error != null) {
                            num = Integer.valueOf(error.getCode());
                        } else {
                            num = null;
                        }
                        EpError error2 = taskItem.getError();
                        if (error2 != null) {
                            str = error2.getHumanMessage();
                        }
                        arrayList2.add(new FailedItem(itemKey, num, str));
                    }
                } else {
                    arrayList.add(taskItem.getItemKey());
                }
            } else {
                LogHelper.INSTANCE.m20554e("UploadGroupEventAggregator", "param: taskGroup.id=" + id + ", found item.groupId=" + taskItem.getGroupId());
            }
        }
        if (arrayList2.size() + i2 + i + arrayList3.size() == list.size()) {
            z = true;
        } else {
            z = false;
        }
        if (list.isEmpty()) {
            taskState = TaskState.Succeeded;
        } else if (!z) {
            taskState = TaskState.Running;
        } else if (i2 == list.size()) {
            taskState = TaskState.Succeeded;
        } else if (!arrayList3.isEmpty()) {
            taskState = TaskState.Pause;
        } else if (!arrayList2.isEmpty()) {
            taskState = TaskState.Failed;
        } else {
            LogHelper.INSTANCE.m20554e("UploadGroupEventAggregator", "unreachable state");
            taskState = TaskState.Failed;
        }
        return new C0728b(id, taskGroup.getKey(), aggregateProgress, taskGroup.getKind(), taskState, list.size(), i2, arrayList, arrayList2, arrayList3);
    }
}
