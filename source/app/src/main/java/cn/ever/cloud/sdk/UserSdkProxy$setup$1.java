package cn.ever.cloud.sdk;

import cn.ever.cloud.android.services.download.DownloadService;
import cn.ever.cloud.android.services.task.TaskService;
import cn.ever.cloud.android.services.upload.UploadService;
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
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.sdk.UserSdkProxy$setup$1", m135f = "UserSdkProxy.kt", m134i = {}, m133l = {237, 238}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class UserSdkProxy$setup$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int label;
    public final /* synthetic */ UserSdkProxy this$0;

    static {
        Covode.recordClassIndex(3317);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSdkProxy$setup$1(UserSdkProxy userSdkProxy, Continuation continuation) {
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
        return new UserSdkProxy$setup$1(this.this$0, continuation);
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
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            TaskService taskService = this.this$0.sdkComponent.taskService();
            UploadService uploadService = this.this$0.sdkComponent.uploadService();
            this.label = 1;
            if (taskService.register(uploadService, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        TaskService taskService2 = this.this$0.sdkComponent.taskService();
        DownloadService downloadService = this.this$0.sdkComponent.downloadService();
        this.label = 2;
        if (taskService2.register(downloadService, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
