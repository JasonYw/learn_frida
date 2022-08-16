package cn.ever.cloud.android.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public class Task {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final List<String> completePath;
    public final List<String> failedAddTaskList;
    public final List<TaskItem> failedList;
    public final TaskProgress progress;
    public final int state;
    public final String taskKey;
    public final int taskType;

    static {
        Covode.recordClassIndex(2867);
    }

    public final List<String> getCompletePath() {
        return this.completePath;
    }

    public final List<String> getFailedAddTaskList() {
        return this.failedAddTaskList;
    }

    public final List<TaskItem> getFailedList() {
        return this.failedList;
    }

    public final TaskProgress getProgress() {
        return this.progress;
    }

    public final int getState() {
        return this.state;
    }

    public final String getTaskKey() {
        return this.taskKey;
    }

    public final int getTaskType() {
        return this.taskType;
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "Task(taskKey='" + this.taskKey + "', taskType=" + this.taskType + ", state=" + this.state + ", progress=" + this.progress + ", failedList=" + this.failedList + ", completePath=" + this.completePath + ", failedAddTaskList=" + this.failedAddTaskList + LoggerUtil.S_RIGHT_TAG;
    }

    public Task(String str, int i, int i2, TaskProgress taskProgress, List<TaskItem> list, List<String> list2, List<String> list3) {
        C106862S5w.LIZ(str, taskProgress);
        this.taskKey = str;
        this.taskType = i;
        this.state = i2;
        this.progress = taskProgress;
        this.failedList = list;
        this.completePath = list2;
        this.failedAddTaskList = list3;
    }

    public /* synthetic */ Task(String str, int i, int i2, TaskProgress taskProgress, List list, List list2, List list3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, taskProgress, list, list2, (i3 & 64) != 0 ? null : list3);
    }
}
