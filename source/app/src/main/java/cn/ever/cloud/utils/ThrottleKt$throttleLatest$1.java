package cn.ever.cloud.utils;

import androidx.core.view.MotionEventCompat;
import cn.ever.cloud.android.coroutine.SdkScope;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class ThrottleKt$throttleLatest$1 extends Lambda implements Function1<T, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ SdkScope $coroutineScope;
    public final /* synthetic */ Function1 $destinationFunction;
    public final /* synthetic */ long $intervalMs;
    public final /* synthetic */ Ref.ObjectRef $latestParam;
    public final /* synthetic */ Ref.ObjectRef $throttleJob;

    static {
        Covode.recordClassIndex(3445);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThrottleKt$throttleLatest$1(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, SdkScope sdkScope, long j, Function1 function1) {
        super(1);
        this.$latestParam = objectRef;
        this.$throttleJob = objectRef2;
        this.$coroutineScope = sdkScope;
        this.$intervalMs = j;
        this.$destinationFunction = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2((ThrottleKt$throttleLatest$1) obj);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [T, kotlinx.coroutines.Job] */
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(T t) {
        if (PatchProxy.proxy(new Object[]{t}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        this.$latestParam.element = t;
        Job job = (Job) this.$throttleJob.element;
        if (job == null || job.isCompleted()) {
            this.$throttleJob.element = SdkScope.launch$default(this.$coroutineScope, null, new C07601(null), 1, null);
        }
    }

    @DebugMetadata(m136c = "cn.ever.cloud.utils.ThrottleKt$throttleLatest$1$1", m135f = "throttle.kt", m134i = {}, m133l = {MotionEventCompat.AXIS_GENERIC_5}, m132m = "invokeSuspend", m131n = {}, m130s = {})
    /* renamed from: cn.ever.cloud.utils.ThrottleKt$throttleLatest$1$1 */
    /* loaded from: classes23.dex */
    public static final class C07601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int label;

        static {
            Covode.recordClassIndex(3446);
        }

        public C07601(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, continuation}, this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return (Continuation) proxy.result;
            }
            C106862S5w.LIZ(continuation);
            return new C07601(continuation);
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
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.ResultKt.throwOnFailure(obj);
                long j = ThrottleKt$throttleLatest$1.this.$intervalMs;
                this.label = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            ThrottleKt$throttleLatest$1.this.$destinationFunction.invoke(ThrottleKt$throttleLatest$1.this.$latestParam.element);
            return Unit.INSTANCE;
        }
    }
}
