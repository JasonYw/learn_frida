package cn.ever.cloud.android.services.task.entity;

import cn.ever.cloud.android.services.task.TaskProvider;
import cn.ever.cloud.utils.LogHelper;
import cn.ever.cloud.utils.Result;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import p003X.AbstractC521266ie;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class SafeTaskProvider implements TaskProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final TaskProvider inner;
    public final TaskEventProcessor<TaskGroupEvent, TaskItemEvent> taskEventProcessor;

    static {
        Covode.recordClassIndex(3101);
    }

    @Override // cn.ever.cloud.android.services.task.TaskProvider
    public final TaskEventProcessor<TaskGroupEvent, TaskItemEvent> getTaskEventProcessor() {
        return this.taskEventProcessor;
    }

    @Override // cn.ever.cloud.android.services.task.TaskProvider
    public final int taskKind() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return this.inner.taskKind();
    }

    @Override // cn.ever.cloud.android.services.task.TaskProvider
    public final ProviderKey uniqueKey() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (ProviderKey) proxy.result;
        }
        return this.inner.uniqueKey();
    }

    public SafeTaskProvider(TaskProvider taskProvider) {
        C106862S5w.LIZ(taskProvider);
        this.inner = taskProvider;
        this.taskEventProcessor = this.inner.getTaskEventProcessor();
    }

    @Override // cn.ever.cloud.android.services.task.TaskProvider
    public final void onRegistered(ScheduleSignal scheduleSignal) {
        if (PatchProxy.proxy(new Object[]{scheduleSignal}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(scheduleSignal);
        TaskProvider.DefaultImpls.onRegistered(this, scheduleSignal);
    }

    @Override // cn.ever.cloud.android.services.task.TaskProvider
    public final void onItemStateChanged(TaskState taskState, TaskItem taskItem) {
        if (PatchProxy.proxy(new Object[]{taskState, taskItem}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(taskState, taskItem);
        try {
            Result.Companion companion = Result.Companion;
            this.inner.onItemStateChanged(taskState, taskItem);
            companion.success(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion.failure(th);
        }
    }

    @Override // cn.ever.cloud.android.services.task.TaskProvider
    public final boolean cancelItem(TaskItem taskItem, boolean z) {
        Result failure;
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(taskItem);
        try {
            failure = Result.Companion.success(Boolean.valueOf(this.inner.cancelItem(taskItem, z)));
        } catch (Throwable th) {
            failure = Result.Companion.failure(th);
        }
        Throwable exceptionOrNull = failure.exceptionOrNull();
        if (exceptionOrNull == null) {
            obj = failure.getValue();
        } else {
            LogHelper logHelper = LogHelper.INSTANCE;
            logHelper.m20554e("SafeTaskProvider", "provider catch error: " + exceptionOrNull + ", inner:" + this.inner);
            obj = Boolean.FALSE;
        }
        return ((Boolean) obj).booleanValue();
    }

    @Override // cn.ever.cloud.android.services.task.TaskProvider
    public final List<TaskItem> createTaskItems(TaskBag taskBag, Function0<Long> function0) {
        Result failure;
        Object emptyList;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskBag, function0}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        C106862S5w.LIZ(taskBag, function0);
        try {
            failure = Result.Companion.success(this.inner.createTaskItems(taskBag, function0));
        } catch (Throwable th) {
            failure = Result.Companion.failure(th);
        }
        Throwable exceptionOrNull = failure.exceptionOrNull();
        if (exceptionOrNull == null) {
            emptyList = failure.getValue();
        } else {
            LogHelper logHelper = LogHelper.INSTANCE;
            logHelper.m20554e("SafeTaskProvider", "provider catch error: " + exceptionOrNull + ", inner:" + this.inner);
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        return (List) emptyList;
    }

    @Override // cn.ever.cloud.android.services.task.TaskProvider
    public final boolean process(TaskItem taskItem, AbstractC521266ie abstractC521266ie) {
        Result failure;
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem, abstractC521266ie}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(taskItem, abstractC521266ie);
        try {
            failure = Result.Companion.success(Boolean.valueOf(this.inner.process(taskItem, abstractC521266ie)));
        } catch (Throwable th) {
            failure = Result.Companion.failure(th);
        }
        Throwable exceptionOrNull = failure.exceptionOrNull();
        if (exceptionOrNull == null) {
            obj = failure.getValue();
        } else {
            LogHelper logHelper = LogHelper.INSTANCE;
            logHelper.m20554e("SafeTaskProvider", "provider catch error: " + exceptionOrNull + ", inner:" + this.inner);
            obj = Boolean.FALSE;
        }
        return ((Boolean) obj).booleanValue();
    }
}
