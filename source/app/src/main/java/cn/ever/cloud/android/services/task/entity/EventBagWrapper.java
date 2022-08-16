package cn.ever.cloud.android.services.task.entity;

import cn.ever.cloud.android.services.task.TaskProvider;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.C521336il;

/* loaded from: classes23.dex */
public final class EventBagWrapper {
    public static final C521336il Companion = new C521336il((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final EventBag eventBag;
    public final boolean notifyItemEvent;

    static {
        Covode.recordClassIndex(3088);
    }

    public final EventBag getEventBag() {
        return this.eventBag;
    }

    public final boolean getNotifyItemEvent() {
        return this.notifyItemEvent;
    }

    public EventBagWrapper(EventBag eventBag, boolean z) {
        this.eventBag = eventBag;
        this.notifyItemEvent = z;
    }

    public final void sendTaskItemEvent(TaskProvider taskProvider, TaskItem taskItem) {
        if (PatchProxy.proxy(new Object[]{taskProvider, taskItem}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(taskProvider, taskItem);
        if (this.notifyItemEvent) {
            if (this.eventBag != null) {
                taskProvider.getTaskEventProcessor().sendTaskItemEvent(this.eventBag);
            } else {
                taskProvider.getTaskEventProcessor().sendTaskItemEvent(taskItem);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ EventBagWrapper(cn.ever.cloud.android.services.task.entity.EventBag r2, boolean r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L7
            if (r2 == 0) goto Lb
            r3 = 1
        L7:
            r1.<init>(r2, r3)
            return
        Lb:
            r3 = 0
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.task.entity.EventBagWrapper.<init>(cn.ever.cloud.android.services.task.entity.EventBag, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
