package cn.ever.cloud.sdk;

import cn.ever.cloud.sdk.entity.EpUserInfo;
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
import p003X.AbstractC521596jB;
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.sdk.UserSdkProxy$buildSdkComponent$tokenProvider$1$getNewToken$userInfo$1", m135f = "UserSdkProxy.kt", m134i = {}, m133l = {203}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* renamed from: cn.ever.cloud.sdk.UserSdkProxy$buildSdkComponent$tokenProvider$1$getNewToken$userInfo$1 */
/* loaded from: classes23.dex */
public final class C0741xcc8383e0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EpUserInfo>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int label;
    public final /* synthetic */ UserSdkProxy$buildSdkComponent$tokenProvider$1 this$0;

    static {
        Covode.recordClassIndex(3316);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0741xcc8383e0(UserSdkProxy$buildSdkComponent$tokenProvider$1 userSdkProxy$buildSdkComponent$tokenProvider$1, Continuation continuation) {
        super(2, continuation);
        this.this$0 = userSdkProxy$buildSdkComponent$tokenProvider$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        return new C0741xcc8383e0(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super EpUserInfo> continuation) {
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
            AbstractC521596jB authDelegate = this.this$0.this$0.dependConfig.getAuthDelegate();
            this.label = 1;
            obj = authDelegate.LIZ(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }
}
