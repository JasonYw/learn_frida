package cn.ever.cloud.sdk.api;

import androidx.core.view.MotionEventCompat;
import cn.ever.cloud.android.entity.TaskReq;
import cn.ever.cloud.sdk.entity.EcTaskReq;
import cn.ever.cloud.sdk.mapper.MapperKt;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.sdk.api.DownloadApi$download$2", m135f = "DownloadApi.kt", m134i = {}, m133l = {MotionEventCompat.AXIS_GENERIC_4}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class DownloadApi$download$2 extends SuspendLambda implements Function1<Continuation<? super Pair<? extends String, ? extends List<? extends String>>>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ EcTaskReq $downloadReq;
    public int label;
    public final /* synthetic */ DownloadApi this$0;

    static {
        Covode.recordClassIndex(3352);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadApi$download$2(DownloadApi downloadApi, EcTaskReq ecTaskReq, Continuation continuation) {
        super(1, continuation);
        this.this$0 = downloadApi;
        this.$downloadReq = ecTaskReq;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        return new DownloadApi$download$2(this.this$0, this.$downloadReq, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Pair<? extends String, ? extends List<? extends String>>> continuation) {
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
            TaskReq taskReq = MapperKt.toTaskReq(this.$downloadReq);
            this.label = 1;
            obj = downloadApi.download(taskReq, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }
}
