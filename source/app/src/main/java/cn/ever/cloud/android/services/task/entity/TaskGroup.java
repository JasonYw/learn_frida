package cn.ever.cloud.android.services.task.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class TaskGroup {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: id */
    public final long f21059id;
    public final String key;
    public final int kind;
    public final TaskParam params;
    public final List<Long> taskItems;

    static {
        Covode.recordClassIndex(3109);
    }

    private final List<Long> component4() {
        return this.taskItems;
    }

    public static /* synthetic */ TaskGroup copy$default(TaskGroup taskGroup, long j, String str, int i, List list, TaskParam taskParam, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskGroup, new Long(j), str, Integer.valueOf(i), list, taskParam, Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (TaskGroup) proxy.result;
        }
        if ((i2 & 1) != 0) {
            j = taskGroup.f21059id;
        }
        if ((i2 & 2) != 0) {
            str = taskGroup.key;
        }
        if ((i2 & 4) != 0) {
            i = taskGroup.kind;
        }
        if ((i2 & 8) != 0) {
            list = taskGroup.taskItems;
        }
        if ((i2 & 16) != 0) {
            taskParam = taskGroup.params;
        }
        return taskGroup.copy(j, str, i, list, taskParam);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.f21059id), this.key, Integer.valueOf(this.kind), this.taskItems, this.params};
    }

    public final long component1() {
        return this.f21059id;
    }

    public final String component2() {
        return this.key;
    }

    public final int component3() {
        return this.kind;
    }

    public final TaskParam component5() {
        return this.params;
    }

    public final TaskGroup copy(long j, String str, int i, List<Long> list, TaskParam taskParam) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str, Integer.valueOf(i), list, taskParam}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (TaskGroup) proxy.result;
        }
        C106862S5w.LIZ(str, list, taskParam);
        return new TaskGroup(j, str, i, list, taskParam);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof TaskGroup) {
            return C106862S5w.LIZ(((TaskGroup) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("TaskGroup:%s,%s,%s,%s,%s", getObjects());
    }

    public final long getId() {
        return this.f21059id;
    }

    public final String getKey() {
        return this.key;
    }

    public final int getKind() {
        return this.kind;
    }

    public final TaskParam getParams() {
        return this.params;
    }

    public final ArrayList<Long> getTaskItems() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (ArrayList) proxy.result;
        }
        return new ArrayList<>(this.taskItems);
    }

    public final void attachTask(long j) {
        if (!PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 2).isSupported && !this.taskItems.contains(Long.valueOf(j))) {
            this.taskItems.add(Long.valueOf(j));
        }
    }

    public TaskGroup(long j, String str, int i, List<Long> list, TaskParam taskParam) {
        C106862S5w.LIZ(str, list, taskParam);
        this.f21059id = j;
        this.key = str;
        this.kind = i;
        this.taskItems = list;
        this.params = taskParam;
    }

    public /* synthetic */ TaskGroup(long j, String str, int i, List list, TaskParam taskParam, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, i, list, (i2 & 16) != 0 ? new TaskParam() : taskParam);
    }
}
