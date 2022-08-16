package cn.ever.cloud.android.services.download;

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

@DebugMetadata(m136c = "cn.ever.cloud.android.services.download.DownloadService$process$job$1", m135f = "DownloadService.kt", m134i = {}, m133l = {156}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class DownloadService$process$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC521266ie $listener;
    public final /* synthetic */ DownloadMedia $media;
    public final /* synthetic */ TaskItem $taskItem;
    public int label;
    public final /* synthetic */ DownloadService this$0;

    static {
        Covode.recordClassIndex(3014);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadService$process$job$1(DownloadService downloadService, DownloadMedia downloadMedia, AbstractC521266ie abstractC521266ie, TaskItem taskItem, Continuation continuation) {
        super(2, continuation);
        this.this$0 = downloadService;
        this.$media = downloadMedia;
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
        return new DownloadService$process$job$1(this.this$0, this.$media, this.$listener, this.$taskItem, continuation);
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
            Downloader downloader = this.this$0.downloader;
            DownloadMedia downloadMedia = this.$media;
            DownloadService$process$job$1$path$1 downloadService$process$job$1$path$1 = new DownloadService$process$job$1$path$1(this);
            this.label = 1;
            obj = downloader.downloadWithRetry(downloadMedia, downloadService$process$job$1$path$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.$listener.onCompleted(DownloadEventBag.Companion.complete(this.$taskItem, (String) obj));
        return Unit.INSTANCE;
    }
}
