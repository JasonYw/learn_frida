package cn.ever.cloud.android.services.task;

import cn.ever.cloud.android.services.task.entity.ProviderKey;
import cn.ever.cloud.android.services.task.entity.TaskItem;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class TaskService$schedule$groupsToRefresh$2 extends Lambda implements Function1<TaskItem, Pair<? extends Long, ? extends Pair<? extends Long, ? extends ProviderKey>>> {
    public static final TaskService$schedule$groupsToRefresh$2 INSTANCE = new TaskService$schedule$groupsToRefresh$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3057);
    }

    public TaskService$schedule$groupsToRefresh$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Pair<Long, Pair<Long, ProviderKey>> invoke(TaskItem taskItem) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Pair) proxy.result;
        }
        C106862S5w.LIZ(taskItem);
        Long groupId = taskItem.getGroupId();
        if (groupId != null) {
            long longValue = groupId.longValue();
            return TuplesKt.m137to(Long.valueOf(longValue), TuplesKt.m137to(Long.valueOf(longValue), taskItem.getProviderKey()));
        }
        return null;
    }
}
