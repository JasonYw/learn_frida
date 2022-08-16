package cn.ever.cloud.android.services.task.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public class TaskItemEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String groupKey;
    public final long itemId;
    public final String itemKey;
    public final TaskState state;
    public final int taskKind;

    static {
        Covode.recordClassIndex(3116);
    }

    public final String getGroupKey() {
        return this.groupKey;
    }

    public final long getItemId() {
        return this.itemId;
    }

    public final String getItemKey() {
        return this.itemKey;
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
        return "itemId=" + this.itemId + ", itemKey='" + this.itemKey + "', groupKey=" + this.groupKey + ", taskKind=" + this.taskKind + ", state=" + this.state;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaskItemEvent(EventBag eventBag) {
        this(eventBag.getItemId(), eventBag.getItemKey(), eventBag.getGroupKey(), eventBag.getTaskKind(), eventBag.getState());
        C106862S5w.LIZ(eventBag);
    }

    public TaskItemEvent(long j, String str, String str2, int i, TaskState taskState) {
        this.itemId = j;
        this.itemKey = str;
        this.groupKey = str2;
        this.taskKind = i;
        this.state = taskState;
    }
}
