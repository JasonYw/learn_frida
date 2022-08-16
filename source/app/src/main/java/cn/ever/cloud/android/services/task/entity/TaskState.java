package cn.ever.cloud.android.services.task.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes23.dex */
public enum TaskState {
    Waiting { // from class: cn.ever.cloud.android.services.task.entity.TaskState.Waiting
        @Override // cn.ever.cloud.android.services.task.entity.TaskState
        public final boolean ableToSchedule() {
            return true;
        }
    },
    Running { // from class: cn.ever.cloud.android.services.task.entity.TaskState.Running
        @Override // cn.ever.cloud.android.services.task.entity.TaskState
        public final boolean ableToSchedule() {
            return true;
        }
    },
    Deleted(2),
    Failed { // from class: cn.ever.cloud.android.services.task.entity.TaskState.Failed
        @Override // cn.ever.cloud.android.services.task.entity.TaskState
        public final boolean ableToRetry() {
            return true;
        }
    },
    Succeeded(4),
    Pause { // from class: cn.ever.cloud.android.services.task.entity.TaskState.Pause
        @Override // cn.ever.cloud.android.services.task.entity.TaskState
        public final boolean ableToResume() {
            return true;
        }

        @Override // cn.ever.cloud.android.services.task.entity.TaskState
        public final boolean ableToRetry() {
            return true;
        }
    };
    
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int intVal;

    public static TaskState valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 5);
        return (TaskState) (proxy.isSupported ? proxy.result : Enum.valueOf(TaskState.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static TaskState[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 4);
        return (TaskState[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    public boolean ableToResume() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return false;
    }

    public boolean ableToRetry() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return false;
    }

    public boolean ableToSchedule() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return false;
    }

    /* loaded from: classes23.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3119);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TaskState from(int i) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (TaskState) proxy.result;
            }
            if (i == TaskState.Waiting.getIntVal()) {
                return TaskState.Waiting;
            }
            if (i == TaskState.Running.getIntVal()) {
                return TaskState.Running;
            }
            if (i == TaskState.Deleted.getIntVal()) {
                return TaskState.Deleted;
            }
            if (i == TaskState.Failed.getIntVal()) {
                return TaskState.Failed;
            }
            if (i == TaskState.Succeeded.getIntVal()) {
                return TaskState.Succeeded;
            }
            if (i == TaskState.Pause.getIntVal()) {
                return TaskState.Pause;
            }
            return null;
        }
    }

    public final int getIntVal() {
        return this.intVal;
    }

    static {
        Covode.recordClassIndex(3118);
    }

    TaskState(int i) {
        this.intVal = i;
    }

    /* synthetic */ TaskState(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
