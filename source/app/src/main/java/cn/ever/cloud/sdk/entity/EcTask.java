package cn.ever.cloud.sdk.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class EcTask {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final List<String> completePath;
    public final List<String> failedAddTaskList;
    public final List<EcTaskItem> failedList;
    public final EcTaskProgress progress;
    public final int state;
    public final String taskKey;
    public final int taskType;

    static {
        Covode.recordClassIndex(3400);
    }

    public static /* synthetic */ EcTask copy$default(EcTask ecTask, String str, int i, int i2, EcTaskProgress ecTaskProgress, List list, List list2, List list3, int i3, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ecTask, str, Integer.valueOf(i), Integer.valueOf(i2), ecTaskProgress, list, list2, list3, Integer.valueOf(i3), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (EcTask) proxy.result;
        }
        if ((i3 & 1) != 0) {
            str = ecTask.taskKey;
        }
        if ((i3 & 2) != 0) {
            i = ecTask.taskType;
        }
        if ((i3 & 4) != 0) {
            i2 = ecTask.state;
        }
        if ((i3 & 8) != 0) {
            ecTaskProgress = ecTask.progress;
        }
        if ((i3 & 16) != 0) {
            list = ecTask.failedList;
        }
        if ((i3 & 32) != 0) {
            list2 = ecTask.completePath;
        }
        if ((i3 & 64) != 0) {
            list3 = ecTask.failedAddTaskList;
        }
        return ecTask.copy(str, i, i2, ecTaskProgress, list, list2, list3);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.taskKey, Integer.valueOf(this.taskType), Integer.valueOf(this.state), this.progress, this.failedList, this.completePath, this.failedAddTaskList};
    }

    public final String component1() {
        return this.taskKey;
    }

    public final int component2() {
        return this.taskType;
    }

    public final int component3() {
        return this.state;
    }

    public final EcTaskProgress component4() {
        return this.progress;
    }

    public final List<EcTaskItem> component5() {
        return this.failedList;
    }

    public final List<String> component6() {
        return this.completePath;
    }

    public final List<String> component7() {
        return this.failedAddTaskList;
    }

    public final EcTask copy(String str, int i, int i2, EcTaskProgress ecTaskProgress, List<EcTaskItem> list, List<String> list2, List<String> list3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), ecTaskProgress, list, list2, list3}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (EcTask) proxy.result;
        }
        C106862S5w.LIZ(str, ecTaskProgress);
        return new EcTask(str, i, i2, ecTaskProgress, list, list2, list3);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof EcTask) {
            return C106862S5w.LIZ(((EcTask) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("EcTask:%s,%s,%s,%s,%s,%s,%s", getObjects());
    }

    public final List<String> getCompletePath() {
        return this.completePath;
    }

    public final List<String> getFailedAddTaskList() {
        return this.failedAddTaskList;
    }

    public final List<EcTaskItem> getFailedList() {
        return this.failedList;
    }

    public final EcTaskProgress getProgress() {
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

    public EcTask(String str, int i, int i2, EcTaskProgress ecTaskProgress, List<EcTaskItem> list, List<String> list2, List<String> list3) {
        C106862S5w.LIZ(str, ecTaskProgress);
        this.taskKey = str;
        this.taskType = i;
        this.state = i2;
        this.progress = ecTaskProgress;
        this.failedList = list;
        this.completePath = list2;
        this.failedAddTaskList = list3;
    }
}
