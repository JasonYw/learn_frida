package cn.ever.cloud.android.api.impl;

import cn.ever.cloud.android.services.task.TaskService;
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
import kotlin.jvm.functions.Function1;
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.android.api.impl.UploadApiImpl$resumeAll$2", m135f = "UploadApiImpl.kt", m134i = {}, m133l = {162}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class UploadApiImpl$resumeAll$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Integer $reason;
    public int label;
    public final /* synthetic */ UploadApiImpl this$0;

    static {
        Covode.recordClassIndex(2825);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadApiImpl$resumeAll$2(UploadApiImpl uploadApiImpl, Integer num, Continuation continuation) {
        super(1, continuation);
        this.this$0 = uploadApiImpl;
        this.$reason = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        return new UploadApiImpl$resumeAll$2(this.this$0, this.$reason, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? proxy.result : ((BaseContinuationImpl) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            TaskService taskService = this.this$0.taskService;
            int i2 = this.this$0.kind;
            Integer num = this.$reason;
            this.label = 1;
            if (taskService.resumeKind(i2, num, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
