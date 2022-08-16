package cn.ever.cloud.android.services.task.entity;

import cn.ever.cloud.android.services.upload.FailedItem;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.util.List;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public class TaskGroupEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final List<FailedItem> failedItems;
    public final long groupId;
    public final String groupKey;
    public final int itemDone;
    public final ItemProgress itemProgress;
    public final int itemTotal;
    public final List<String> pausedItems;
    public final List<String> runningItems;
    public final TaskState state;
    public final int taskKind;

    static {
        Covode.recordClassIndex(3110);
    }

    public final List<FailedItem> getFailedItems() {
        return this.failedItems;
    }

    public final long getGroupId() {
        return this.groupId;
    }

    public final String getGroupKey() {
        return this.groupKey;
    }

    public final int getItemDone() {
        return this.itemDone;
    }

    public final ItemProgress getItemProgress() {
        return this.itemProgress;
    }

    public final int getItemTotal() {
        return this.itemTotal;
    }

    public final List<String> getPausedItems() {
        return this.pausedItems;
    }

    public final List<String> getRunningItems() {
        return this.runningItems;
    }

    public final TaskState getState() {
        return this.state;
    }

    public final int getTaskKind() {
        return this.taskKind;
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "TaskGroupEvent(groupId=" + this.groupId + ", groupKey='" + this.groupKey + "', itemProgress=" + this.itemProgress + ", taskKind=" + this.taskKind + ", state=" + this.state + ", itemTotal=" + this.itemTotal + LoggerUtil.S_RIGHT_TAG;
    }

    public TaskGroupEvent(long j, String str, ItemProgress itemProgress, int i, TaskState taskState, int i2, int i3, List<String> list, List<FailedItem> list2, List<String> list3) {
        C106862S5w.LIZ(str, itemProgress, taskState, list, list2, list3);
        this.groupId = j;
        this.groupKey = str;
        this.itemProgress = itemProgress;
        this.taskKind = i;
        this.state = taskState;
        this.itemTotal = i2;
        this.itemDone = i3;
        this.runningItems = list;
        this.failedItems = list2;
        this.pausedItems = list3;
    }
}
