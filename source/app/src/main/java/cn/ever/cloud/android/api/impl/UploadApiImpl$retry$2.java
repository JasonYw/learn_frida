package cn.ever.cloud.android.api.impl;

import cn.ever.cloud.android.services.task.TaskService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.android.api.impl.UploadApiImpl$retry$2", m135f = "UploadApiImpl.kt", m134i = {}, m133l = {134, 136}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class UploadApiImpl$retry$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ List $assetIds;
    public final /* synthetic */ String $taskKey;
    public int label;
    public final /* synthetic */ UploadApiImpl this$0;

    static {
        Covode.recordClassIndex(2826);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadApiImpl$retry$2(UploadApiImpl uploadApiImpl, List list, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = uploadApiImpl;
        this.$assetIds = list;
        this.$taskKey = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        return new UploadApiImpl$retry$2(this.this$0, this.$assetIds, this.$taskKey, continuation);
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
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            List list = this.$assetIds;
            if (list != null && !list.isEmpty()) {
                TaskService taskService = this.this$0.taskService;
                int i2 = this.this$0.kind;
                String str = this.$taskKey;
                List<String> list2 = this.$assetIds;
                this.label = 2;
                if (taskService.retryItems(i2, str, list2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                TaskService taskService2 = this.this$0.taskService;
                int i3 = this.this$0.kind;
                String str2 = this.$taskKey;
                this.label = 1;
                if (taskService2.retryByGroupKey(i3, str2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
