package cn.ever.cloud.android.services.task;

import cn.ever.cloud.android.services.task.entity.PauseReason;
import cn.ever.cloud.android.services.task.entity.TaskItem;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class TaskService$schedule$groupsToRefresh$1 extends Lambda implements Function1<Pair<? extends TaskItem, ? extends PauseReason>, TaskItem> {
    public static final TaskService$schedule$groupsToRefresh$1 INSTANCE = new TaskService$schedule$groupsToRefresh$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3056);
    }

    public TaskService$schedule$groupsToRefresh$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ TaskItem invoke(Pair<? extends TaskItem, ? extends PauseReason> pair) {
        return invoke2((Pair<TaskItem, ? extends PauseReason>) pair);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final TaskItem invoke2(Pair<TaskItem, ? extends PauseReason> pair) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pair}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (TaskItem) proxy.result;
        }
        C106862S5w.LIZ(pair);
        return pair.getFirst();
    }
}
