package cn.ever.cloud.network.auth;

import androidx.core.view.MotionEventCompat;
import cn.ever.cloud.network.auth.DependToken;
import cn.ever.cloud.utils.error.ClientError;
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
import kotlinx.coroutines.flow.MutableSharedFlow;
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.network.auth.SessionTokenProvider$getNewToken$1", m135f = "SessionTokenProvider.kt", m134i = {}, m133l = {MotionEventCompat.AXIS_GENERIC_16}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class SessionTokenProvider$getNewToken$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ClientError $error;
    public final /* synthetic */ DependToken.SessionToken $sessionToken;
    public int label;
    public final /* synthetic */ SessionTokenProvider this$0;

    static {
        Covode.recordClassIndex(3178);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionTokenProvider$getNewToken$1(SessionTokenProvider sessionTokenProvider, DependToken.SessionToken sessionToken, ClientError clientError, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sessionTokenProvider;
        this.$sessionToken = sessionToken;
        this.$error = clientError;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        return new SessionTokenProvider$getNewToken$1(this.this$0, this.$sessionToken, this.$error, continuation);
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
            MutableSharedFlow<UserInconsistentEvent> mutableSharedFlow = this.this$0.userInconsistentFlow;
            UserInconsistentEvent userInconsistentEvent = new UserInconsistentEvent(this.$sessionToken.getUserId(), this.this$0.userId, this.$error);
            this.label = 1;
            if (mutableSharedFlow.emit(userInconsistentEvent, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
