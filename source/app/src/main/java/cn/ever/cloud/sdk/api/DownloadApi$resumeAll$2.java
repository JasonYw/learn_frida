package cn.ever.cloud.sdk.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.sdk.api.DownloadApi$resumeAll$2", m135f = "DownloadApi.kt", m134i = {}, m133l = {75}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class DownloadApi$resumeAll$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ int $reason;
    public int label;
    public final /* synthetic */ DownloadApi this$0;

    static {
        Covode.recordClassIndex(3360);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadApi$resumeAll$2(DownloadApi downloadApi, int i, Continuation continuation) {
        super(1, continuation);
        this.this$0 = downloadApi;
        this.$reason = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        return new DownloadApi$resumeAll$2(this.this$0, this.$reason, continuation);
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
            cn.ever.cloud.android.api.DownloadApi downloadApi = this.this$0.component.downloadApi();
            Integer boxInt = Boxing.boxInt(this.$reason);
            this.label = 1;
            if (downloadApi.resumeAll(boxInt, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
