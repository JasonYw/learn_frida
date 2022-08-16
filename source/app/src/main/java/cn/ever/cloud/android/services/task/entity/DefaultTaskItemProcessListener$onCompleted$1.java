package cn.ever.cloud.android.services.task.entity;

import cn.ever.cloud.android.services.task.entity.Command;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.android.services.task.entity.DefaultTaskItemProcessListener$onCompleted$1", m135f = "DefaultTaskItemProcessListener.kt", m134i = {}, m133l = {32}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class DefaultTaskItemProcessListener$onCompleted$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ EventBag $bag;
    public int label;
    public final /* synthetic */ DefaultTaskItemProcessListener this$0;

    static {
        Covode.recordClassIndex(3085);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultTaskItemProcessListener$onCompleted$1(DefaultTaskItemProcessListener defaultTaskItemProcessListener, EventBag eventBag, Continuation continuation) {
        super(2, continuation);
        this.this$0 = defaultTaskItemProcessListener;
        this.$bag = eventBag;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        return new DefaultTaskItemProcessListener$onCompleted$1(this.this$0, this.$bag, continuation);
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
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Channel<Command> channel = this.this$0.commandChannel;
            Command.TaskItemCompleteCommand taskItemCompleteCommand = new Command.TaskItemCompleteCommand(CollectionsKt__CollectionsJVMKt.listOf(this.$bag));
            this.label = 1;
            if (channel.send(taskItemCompleteCommand, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
