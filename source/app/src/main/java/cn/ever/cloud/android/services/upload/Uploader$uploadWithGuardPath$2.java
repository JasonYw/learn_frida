package cn.ever.cloud.android.services.upload;

import androidx.core.view.MotionEventCompat;
import cn.ever.cloud.android.services.task.entity.ItemProgress;
import cn.ever.cloud.utils.ThrottleKt;
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

@DebugMetadata(m136c = "cn.ever.cloud.android.services.upload.Uploader$uploadWithGuardPath$2", m135f = "Uploader.kt", m134i = {}, m133l = {MotionEventCompat.AXIS_GENERIC_16}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class Uploader$uploadWithGuardPath$2 extends SuspendLambda implements Function1<Continuation<? super Long>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ UploadMedia $media;
    public final /* synthetic */ Function1 $progressFn;
    public int label;
    public final /* synthetic */ Uploader this$0;

    static {
        Covode.recordClassIndex(3162);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uploader$uploadWithGuardPath$2(Uploader uploader, UploadMedia uploadMedia, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.this$0 = uploader;
        this.$media = uploadMedia;
        this.$progressFn = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        return new Uploader$uploadWithGuardPath$2(this.this$0, this.$media, this.$progressFn, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Long> continuation) {
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
            Uploader uploader = this.this$0;
            UploadMedia uploadMedia = this.$media;
            Function1<? super ItemProgress, Unit> throttleLatest = ThrottleKt.throttleLatest(500L, uploader.scope, this.$progressFn);
            this.label = 1;
            obj = uploader.upload(uploadMedia, throttleLatest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }
}
