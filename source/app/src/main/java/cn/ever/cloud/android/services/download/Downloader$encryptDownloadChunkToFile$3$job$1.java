package cn.ever.cloud.android.services.download;

import cn.ever.cloud.network.entity.NEncChunk;
import cn.ever.cloud.utils.LogHelper;
import cn.ever.cloud.utils.Result;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.sync.Semaphore;
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.android.services.download.Downloader$encryptDownloadChunkToFile$3$job$1", m135f = "Downloader.kt", m134i = {}, m133l = {265, 281}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class Downloader$encryptDownloadChunkToFile$3$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ NEncChunk $chunk;
    public final /* synthetic */ Semaphore $semaphore;
    public final /* synthetic */ Function1 $throttledProgressFn;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ Downloader$encryptDownloadChunkToFile$3 this$0;

    static {
        Covode.recordClassIndex(3034);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Downloader$encryptDownloadChunkToFile$3$job$1(Downloader$encryptDownloadChunkToFile$3 downloader$encryptDownloadChunkToFile$3, NEncChunk nEncChunk, Function1 function1, Semaphore semaphore, Continuation continuation) {
        super(2, continuation);
        this.this$0 = downloader$encryptDownloadChunkToFile$3;
        this.$chunk = nEncChunk;
        this.$throttledProgressFn = function1;
        this.$semaphore = semaphore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        Downloader$encryptDownloadChunkToFile$3$job$1 downloader$encryptDownloadChunkToFile$3$job$1 = new Downloader$encryptDownloadChunkToFile$3$job$1(this.this$0, this.$chunk, this.$throttledProgressFn, this.$semaphore, continuation);
        downloader$encryptDownloadChunkToFile$3$job$1.L$0 = obj;
        return downloader$encryptDownloadChunkToFile$3$job$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{coroutineScope, continuation}, this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? proxy.result : ((BaseContinuationImpl) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Result failure;
        Result.Companion companion;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            failure = Result.Companion.failure(th);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    LogHelper.INSTANCE.m20552v("Downloader", "send chunk");
                    this.$semaphore.release();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion = (Result.Companion) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            companion = Result.Companion;
            Downloader downloader = this.this$0.this$0;
            NEncChunk nEncChunk = this.$chunk;
            C0724x752ff59a c0724x752ff59a = new C0724x752ff59a(this);
            this.L$0 = companion;
            this.label = 1;
            obj = downloader.encryptDownloadInternal(nEncChunk, c0724x752ff59a, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        failure = companion.success((byte[]) obj);
        Throwable exceptionOrNull = failure.exceptionOrNull();
        if (exceptionOrNull == null) {
            Object orNull = failure.getOrNull();
            if (orNull != null) {
                LogHelper logHelper = LogHelper.INSTANCE;
                logHelper.m20553i("Downloader", "chunk offset=" + this.$chunk.getOffset() + " download success. media=" + this.this$0.$media.getCloudId());
                Map map = this.this$0.$downloadedChunks;
                Intrinsics.checkNotNullExpressionValue(map, "");
                map.put(this.$chunk, orNull);
                Channel channel = this.this$0.$chunksToDecrypt;
                this.L$0 = null;
                this.label = 2;
                if (channel.send(orNull, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                LogHelper.INSTANCE.m20552v("Downloader", "send chunk");
            }
            this.$semaphore.release();
            return Unit.INSTANCE;
        }
        LogHelper logHelper2 = LogHelper.INSTANCE;
        logHelper2.m20553i("Downloader", "got error, cancel all jobs. media=" + this.this$0.$media.getCloudId() + ", chunk offset=" + this.$chunk.getOffset());
        throw exceptionOrNull;
    }
}
