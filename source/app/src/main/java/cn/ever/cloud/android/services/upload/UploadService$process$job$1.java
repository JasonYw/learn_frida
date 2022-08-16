package cn.ever.cloud.android.services.upload;

import cn.ever.cloud.android.services.task.entity.TaskItem;
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
import p003X.AbstractC521266ie;
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.android.services.upload.UploadService$process$job$1", m135f = "UploadService.kt", m134i = {}, m133l = {219}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class UploadService$process$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC521266ie $listener;
    public final /* synthetic */ TaskItem $taskItem;
    public final /* synthetic */ UploadTaskItem $uploadItem;
    public int label;
    public final /* synthetic */ UploadService this$0;

    static {
        Covode.recordClassIndex(3149);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadService$process$job$1(UploadService uploadService, UploadTaskItem uploadTaskItem, AbstractC521266ie abstractC521266ie, TaskItem taskItem, Continuation continuation) {
        super(2, continuation);
        this.this$0 = uploadService;
        this.$uploadItem = uploadTaskItem;
        this.$listener = abstractC521266ie;
        this.$taskItem = taskItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        return new UploadService$process$job$1(this.this$0, this.$uploadItem, this.$listener, this.$taskItem, continuation);
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
            Uploader uploader = this.this$0.uploader;
            UploadMedia media = this.$uploadItem.getMedia();
            UploadService$process$job$1$cloudId$1 uploadService$process$job$1$cloudId$1 = new UploadService$process$job$1$cloudId$1(this);
            this.label = 1;
            obj = uploader.uploadWithGuardPath(media, uploadService$process$job$1$cloudId$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.this$0.repo.markTaskItemComplete(this.$uploadItem.getId(), ((Number) obj).longValue());
        this.$listener.onCompleted(UploadEventBag.Companion.complete(this.$taskItem));
        return Unit.INSTANCE;
    }
}
