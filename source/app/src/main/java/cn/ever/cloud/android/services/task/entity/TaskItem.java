package cn.ever.cloud.android.services.task.entity;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import cn.ever.cloud.utils.error.EpError;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.C521306ii;

/* loaded from: classes23.dex */
public final class TaskItem {
    public static final C521306ii Companion = new C521306ii((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final Resource cost;
    public final List<Long> dependencies;
    public final EpError error;
    public final Long groupId;
    public final String groupKey;

    /* renamed from: id */
    public final long f21060id;
    public final String itemKey;
    public final int kind;
    public final TaskParam params;
    public final ProviderKey providerKey;
    public final PauseReason reason;
    public final TaskState state;

    static {
        Covode.recordClassIndex(3114);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaskItem copy$default(TaskItem taskItem, long j, int i, String str, ProviderKey providerKey, Long l, String str2, TaskParam taskParam, Resource resource, TaskState taskState, PauseReason pauseReason, EpError epError, List list, int i2, Object obj) {
        long j2 = j;
        Long l2 = l;
        ProviderKey providerKey2 = providerKey;
        int i3 = i;
        String str3 = str;
        TaskState taskState2 = taskState;
        Resource resource2 = resource;
        String str4 = str2;
        TaskParam taskParam2 = taskParam;
        List<Long> list2 = list;
        PauseReason pauseReason2 = pauseReason;
        EpError epError2 = epError;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem, new Long(j2), Integer.valueOf(i3), str3, providerKey2, l2, str4, taskParam2, resource2, taskState2, pauseReason2, epError2, list2, Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (TaskItem) proxy.result;
        }
        if ((i2 & 1) != 0) {
            j2 = taskItem.f21060id;
        }
        if ((i2 & 2) != 0) {
            i3 = taskItem.kind;
        }
        if ((i2 & 4) != 0) {
            str3 = taskItem.itemKey;
        }
        if ((i2 & 8) != 0) {
            providerKey2 = taskItem.providerKey;
        }
        if ((i2 & 16) != 0) {
            l2 = taskItem.groupId;
        }
        if ((i2 & 32) != 0) {
            str4 = taskItem.groupKey;
        }
        if ((i2 & 64) != 0) {
            taskParam2 = taskItem.params;
        }
        if ((i2 & 128) != 0) {
            resource2 = taskItem.cost;
        }
        if ((i2 & 256) != 0) {
            taskState2 = taskItem.state;
        }
        if ((i2 & 512) != 0) {
            pauseReason2 = taskItem.reason;
        }
        if ((i2 & AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END) != 0) {
            epError2 = taskItem.error;
        }
        if ((i2 & AccessibilityEventCompat.TYPE_WINDOW_CONTENT_CHANGED) != 0) {
            list2 = taskItem.dependencies;
        }
        return taskItem.copy(j2, i3, str3, providerKey2, l2, str4, taskParam2, resource2, taskState2, pauseReason2, epError2, list2);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.f21060id), Integer.valueOf(this.kind), this.itemKey, this.providerKey, this.groupId, this.groupKey, this.params, this.cost, this.state, this.reason, this.error, this.dependencies};
    }

    public final long component1() {
        return this.f21060id;
    }

    public final PauseReason component10() {
        return this.reason;
    }

    public final EpError component11() {
        return this.error;
    }

    public final List<Long> component12() {
        return this.dependencies;
    }

    public final int component2() {
        return this.kind;
    }

    public final String component3() {
        return this.itemKey;
    }

    public final ProviderKey component4() {
        return this.providerKey;
    }

    public final Long component5() {
        return this.groupId;
    }

    public final String component6() {
        return this.groupKey;
    }

    public final TaskParam component7() {
        return this.params;
    }

    public final Resource component8() {
        return this.cost;
    }

    public final TaskState component9() {
        return this.state;
    }

    public final TaskItem copy(long j, int i, String str, ProviderKey providerKey, Long l, String str2, TaskParam taskParam, Resource resource, TaskState taskState, PauseReason pauseReason, EpError epError, List<Long> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), str, providerKey, l, str2, taskParam, resource, taskState, pauseReason, epError, list}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (TaskItem) proxy.result;
        }
        C106862S5w.LIZ(str, providerKey, taskParam, resource, taskState, list);
        return new TaskItem(j, i, str, providerKey, l, str2, taskParam, resource, taskState, pauseReason, epError, list);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof TaskItem) {
            return C106862S5w.LIZ(((TaskItem) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("TaskItem:%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", getObjects());
    }

    public final Resource getCost() {
        return this.cost;
    }

    public final List<Long> getDependencies() {
        return this.dependencies;
    }

    public final EpError getError() {
        return this.error;
    }

    public final Long getGroupId() {
        return this.groupId;
    }

    public final String getGroupKey() {
        return this.groupKey;
    }

    public final long getId() {
        return this.f21060id;
    }

    public final String getItemKey() {
        return this.itemKey;
    }

    public final int getKind() {
        return this.kind;
    }

    public final TaskParam getParams() {
        return this.params;
    }

    public final ProviderKey getProviderKey() {
        return this.providerKey;
    }

    public final PauseReason getReason() {
        return this.reason;
    }

    public final TaskState getState() {
        return this.state;
    }

    public final boolean ableToResume(PauseReason pauseReason) {
        PauseReason pauseReason2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pauseReason}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.state.ableToResume()) {
            return false;
        }
        if (pauseReason == null || (pauseReason2 = this.reason) == null) {
            return true;
        }
        return pauseReason2.isAbleToResumeBy(pauseReason);
    }

    public static /* synthetic */ boolean ableToResume$default(TaskItem taskItem, PauseReason pauseReason, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem, pauseReason, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if ((i & 1) != 0) {
            pauseReason = null;
        }
        return taskItem.ableToResume(pauseReason);
    }

    public TaskItem(long j, int i, String str, ProviderKey providerKey, Long l, String str2, TaskParam taskParam, Resource resource, TaskState taskState, PauseReason pauseReason, EpError epError, List<Long> list) {
        C106862S5w.LIZ(str, providerKey, taskParam, resource, taskState, list);
        this.f21060id = j;
        this.kind = i;
        this.itemKey = str;
        this.providerKey = providerKey;
        this.groupId = l;
        this.groupKey = str2;
        this.params = taskParam;
        this.cost = resource;
        this.state = taskState;
        this.reason = pauseReason;
        this.error = epError;
        this.dependencies = list;
    }
}
