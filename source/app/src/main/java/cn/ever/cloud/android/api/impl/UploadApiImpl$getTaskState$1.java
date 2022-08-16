package cn.ever.cloud.android.api.impl;

import cn.ever.cloud.android.services.task.entity.ItemProgress;
import cn.ever.cloud.android.services.task.entity.TaskState;
import cn.ever.cloud.android.services.upload.C0728b;
import cn.ever.cloud.utils.LogHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.android.api.impl.UploadApiImpl$getTaskState$1", m135f = "UploadApiImpl.kt", m134i = {}, m133l = {40}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class UploadApiImpl$getTaskState$1 extends SuspendLambda implements Function2<FlowCollector<? super C0728b>, Continuation<? super Unit>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $taskKey;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ UploadApiImpl this$0;

    static {
        Covode.recordClassIndex(2821);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadApiImpl$getTaskState$1(UploadApiImpl uploadApiImpl, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = uploadApiImpl;
        this.$taskKey = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        UploadApiImpl$getTaskState$1 uploadApiImpl$getTaskState$1 = new UploadApiImpl$getTaskState$1(this.this$0, this.$taskKey, continuation);
        uploadApiImpl$getTaskState$1.L$0 = obj;
        return uploadApiImpl$getTaskState$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super C0728b> flowCollector, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{flowCollector, continuation}, this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? proxy.result : ((BaseContinuationImpl) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
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
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            boolean triggerTaskGroupEvent = this.this$0.taskService.triggerTaskGroupEvent(this.this$0.kind, this.$taskKey);
            LogHelper logHelper = LogHelper.INSTANCE;
            logHelper.m20553i("UploadApi", "getTaskState triggered = " + triggerTaskGroupEvent + ", taskKey: " + this.$taskKey);
            if (!triggerTaskGroupEvent) {
                C0728b c0728b = new C0728b(-1L, this.$taskKey, new ItemProgress(0L, 0L), this.this$0.kind, TaskState.Waiting, 0, 0, CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
                this.label = 1;
                if (flowCollector.emit(c0728b, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
