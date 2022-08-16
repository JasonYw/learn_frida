package cn.ever.cloud.android.services.task.entity;

import cn.ever.cloud.android.coroutine.SdkScope;
import cn.ever.cloud.android.services.task.entity.TaskGroupEvent;
import cn.ever.cloud.android.services.task.entity.TaskItemEvent;
import cn.ever.cloud.utils.KotlinExtKt;
import cn.ever.cloud.utils.LogHelper;
import cn.ever.cloud.utils.Result;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public abstract class TaskEventProcessor<GroupEvent extends TaskGroupEvent, ItemEvent extends TaskItemEvent> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final SharedFlow<GroupEvent> droppableGroupEvent;
    public final MutableSharedFlow<GroupEvent> droppableGroupEventFlow;
    public final SharedFlow<GroupEvent> groupEvent;
    public final MutableSharedFlow<GroupEvent> groupEventFlow;
    public final SharedFlow<ItemEvent> itemEvent;
    public final MutableSharedFlow<ItemEvent> itemEventFlow;
    public final SdkScope scope;

    static {
        Covode.recordClassIndex(3106);
    }

    public abstract Result<ItemEvent> createItemEventFrom(EventBag eventBag);

    public abstract Result<ItemEvent> createItemEventFrom(TaskItem taskItem);

    public abstract TaskGroupEventAggregator<GroupEvent> groupEventAggregator();

    public final SharedFlow<GroupEvent> getDroppableGroupEvent() {
        return this.droppableGroupEvent;
    }

    public final SharedFlow<GroupEvent> getGroupEvent() {
        return this.groupEvent;
    }

    public final SharedFlow<ItemEvent> getItemEvent() {
        return this.itemEvent;
    }

    private final void sendTaskItemEvent(ItemEvent itemevent) {
        if (PatchProxy.proxy(new Object[]{itemevent}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        LogHelper logHelper = LogHelper.INSTANCE;
        logHelper.m20553i("TaskEventProcessor", "send item event " + itemevent);
        SdkScope.launch$default(this.scope, null, new TaskEventProcessor$sendTaskItemEvent$5(this, itemevent, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void sendTaskItemEvent(EventBag eventBag) {
        if (PatchProxy.proxy(new Object[]{eventBag}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(eventBag);
        Result createItemEventFrom = createItemEventFrom(eventBag);
        if (createItemEventFrom.isSuccess()) {
            sendTaskItemEvent((TaskEventProcessor<GroupEvent, ItemEvent>) ((TaskItemEvent) createItemEventFrom.getValue()));
        }
        Throwable exceptionOrNull = createItemEventFrom.exceptionOrNull();
        if (exceptionOrNull != null) {
            LogHelper.INSTANCE.m20554e("TaskEventProcessor", KotlinExtKt.getOrDefault(exceptionOrNull.getMessage()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void sendTaskItemEvent(TaskItem taskItem) {
        if (PatchProxy.proxy(new Object[]{taskItem}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(taskItem);
        Result createItemEventFrom = createItemEventFrom(taskItem);
        if (createItemEventFrom.isSuccess()) {
            sendTaskItemEvent((TaskEventProcessor<GroupEvent, ItemEvent>) ((TaskItemEvent) createItemEventFrom.getValue()));
        }
        Throwable exceptionOrNull = createItemEventFrom.exceptionOrNull();
        if (exceptionOrNull != null) {
            LogHelper.INSTANCE.m20554e("TaskEventProcessor", KotlinExtKt.getOrDefault(exceptionOrNull.getMessage()));
        }
    }

    public final void sendTaskGroupEvent(GroupEvent groupevent, boolean z) {
        if (PatchProxy.proxy(new Object[]{groupevent, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(groupevent);
        SdkScope.launch$default(this.scope, null, new TaskEventProcessor$sendTaskGroupEvent$1(this, z, groupevent, null), 1, null);
    }

    public TaskEventProcessor(SdkScope sdkScope, MutableSharedFlow<GroupEvent> mutableSharedFlow, MutableSharedFlow<GroupEvent> mutableSharedFlow2, MutableSharedFlow<ItemEvent> mutableSharedFlow3) {
        C106862S5w.LIZ(sdkScope, mutableSharedFlow, mutableSharedFlow2, mutableSharedFlow3);
        this.scope = sdkScope;
        this.groupEventFlow = mutableSharedFlow;
        this.droppableGroupEventFlow = mutableSharedFlow2;
        this.itemEventFlow = mutableSharedFlow3;
        this.groupEvent = FlowKt.asSharedFlow(this.groupEventFlow);
        this.droppableGroupEvent = FlowKt.asSharedFlow(this.droppableGroupEventFlow);
        this.itemEvent = FlowKt.asSharedFlow(this.itemEventFlow);
    }

    public /* synthetic */ TaskEventProcessor(SdkScope sdkScope, MutableSharedFlow mutableSharedFlow, MutableSharedFlow mutableSharedFlow2, MutableSharedFlow mutableSharedFlow3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sdkScope, (i & 2) != 0 ? SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null) : mutableSharedFlow, (i & 4) != 0 ? SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null) : mutableSharedFlow2, (i & 8) != 0 ? SharedFlowKt.MutableSharedFlow(0, 20, BufferOverflow.DROP_OLDEST) : mutableSharedFlow3);
    }
}
