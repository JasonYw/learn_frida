package cn.ever.cloud.android.services.task.entity;

import androidx.core.view.MotionEventCompat;
import cn.ever.cloud.utils.LogHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.android.services.task.entity.TaskEventProcessor$sendTaskGroupEvent$1", m135f = "TaskEventProcessor.kt", m134i = {}, m133l = {MotionEventCompat.AXIS_GENERIC_7, MotionEventCompat.AXIS_GENERIC_10}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class TaskEventProcessor$sendTaskGroupEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ boolean $dropIfOverflow;
    public final /* synthetic */ TaskGroupEvent $groupEvent;
    public int label;
    public final /* synthetic */ TaskEventProcessor this$0;

    static {
        Covode.recordClassIndex(3107);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskEventProcessor$sendTaskGroupEvent$1(TaskEventProcessor taskEventProcessor, boolean z, TaskGroupEvent taskGroupEvent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = taskEventProcessor;
        this.$dropIfOverflow = z;
        this.$groupEvent = taskGroupEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        return new TaskEventProcessor$sendTaskGroupEvent$1(this.this$0, this.$dropIfOverflow, this.$groupEvent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{coroutineScope, continuation}, this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? proxy.result : ((BaseContinuationImpl) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            if (this.$dropIfOverflow) {
                FlowCollector flowCollector = this.this$0.droppableGroupEventFlow;
                TaskGroupEvent taskGroupEvent = this.$groupEvent;
                this.label = 1;
                if (flowCollector.emit(taskGroupEvent, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                LogHelper logHelper = LogHelper.INSTANCE;
                logHelper.m20553i("TaskEventProcessor", "send group event event " + this.$groupEvent);
                FlowCollector flowCollector2 = this.this$0.groupEventFlow;
                TaskGroupEvent taskGroupEvent2 = this.$groupEvent;
                this.label = 2;
                if (flowCollector2.emit(taskGroupEvent2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
