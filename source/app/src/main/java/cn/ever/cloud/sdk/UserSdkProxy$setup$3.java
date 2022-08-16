package cn.ever.cloud.sdk;

import cn.ever.cloud.network.auth.UserInconsistentEvent;
import cn.ever.cloud.utils.LogHelper;
import cn.ever.cloud.utils.error.EpError;
import cn.ever.cloud.utils.error.ErrorCode;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.sdk.UserSdkProxy$setup$3", m135f = "UserSdkProxy.kt", m134i = {}, m133l = {333}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class UserSdkProxy$setup$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int label;
    public final /* synthetic */ UserSdkProxy this$0;

    static {
        Covode.recordClassIndex(3319);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSdkProxy$setup$3(UserSdkProxy userSdkProxy, Continuation continuation) {
        super(2, continuation);
        this.this$0 = userSdkProxy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        return new UserSdkProxy$setup$3(this.this$0, continuation);
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
            Flow<UserInconsistentEvent> userInconsistent = this.this$0.sdkComponent.userApi().userInconsistent();
            FlowCollector<UserInconsistentEvent> flowCollector = new FlowCollector<UserInconsistentEvent>() { // from class: cn.ever.cloud.sdk.UserSdkProxy$setup$3$invokeSuspend$$inlined$collect$1
                public static ChangeQuickRedirect changeQuickRedirect;

                static {
                    Covode.recordClassIndex(3320);
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(UserInconsistentEvent userInconsistentEvent, Continuation continuation) {
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{userInconsistentEvent, continuation}, this, changeQuickRedirect, false, 1);
                    if (proxy2.isSupported) {
                        return proxy2.result;
                    }
                    UserInconsistentEvent userInconsistentEvent2 = userInconsistentEvent;
                    LogHelper logHelper = LogHelper.INSTANCE;
                    logHelper.m20553i("UserSdkProxy", "userInconsistent ---> " + userInconsistentEvent2);
                    EpError error = userInconsistentEvent2.getError();
                    if (error != null && error.getCode() == ErrorCode.CLIENT_AUTH_EP_UID_MISMATCH.getCode()) {
                        UserSdkProxy$setup$3.this.this$0.clearOldDbAndUpdateSdkConfig(userInconsistentEvent2.getNewUser());
                    }
                    Object emit = UserSdkProxy$setup$3.this.this$0.userInconsistentFlow.emit(userInconsistentEvent2, continuation);
                    if (emit == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return emit;
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (userInconsistent.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
