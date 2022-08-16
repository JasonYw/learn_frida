package cn.ever.cloud.android.services.download;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.android.services.download.Downloader$encryptDownloadChunkToFile$3", m135f = "Downloader.kt", m134i = {0, 0, 0, 0}, m133l = {259, 288}, m132m = "invokeSuspend", m131n = {"semaphore", "jobs", "throttledProgressFn", "chunk"}, m130s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes23.dex */
public final class Downloader$encryptDownloadChunkToFile$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Channel $chunksToDecrypt;
    public final /* synthetic */ List $chunksToDownload;
    public final /* synthetic */ CoroutineContext $coroutineContext;
    public final /* synthetic */ Map $downloadedChunks;
    public final /* synthetic */ AtomicLong $downloadedSize;
    public final /* synthetic */ DownloadMedia $media;
    public final /* synthetic */ Function1 $progressFn;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ Downloader this$0;

    static {
        Covode.recordClassIndex(3033);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Downloader$encryptDownloadChunkToFile$3(Downloader downloader, Function1 function1, DownloadMedia downloadMedia, AtomicLong atomicLong, List list, CoroutineContext coroutineContext, Map map, Channel channel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = downloader;
        this.$progressFn = function1;
        this.$media = downloadMedia;
        this.$downloadedSize = atomicLong;
        this.$chunksToDownload = list;
        this.$coroutineContext = coroutineContext;
        this.$downloadedChunks = map;
        this.$chunksToDecrypt = channel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        return new Downloader$encryptDownloadChunkToFile$3(this.this$0, this.$progressFn, this.$media, this.$downloadedSize, this.$chunksToDownload, this.$coroutineContext, this.$downloadedChunks, this.$chunksToDecrypt, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{coroutineScope, continuation}, this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? proxy.result : ((BaseContinuationImpl) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0086 -> B:21:0x00a0). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r10 = r15
            r6 = 1
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r2 = 0
            r1[r2] = r16
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = cn.ever.cloud.android.services.download.Downloader$encryptDownloadChunkToFile$3.changeQuickRedirect
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r10, r0, r2, r6)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L14
            java.lang.Object r0 = r1.result
            return r0
        L14:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r10.label
            r4 = 2
            r3 = 0
            if (r0 == 0) goto L48
            if (r0 == r6) goto L89
            if (r0 != r4) goto Ld6
            java.lang.Object r1 = r10.L$0
            java.util.Iterator r1 = (java.util.Iterator) r1
            kotlin.ResultKt.throwOnFailure(r16)
        L29:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Ld3
            java.lang.Object r0 = r1.next()
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            r10.L$0 = r1
            r10.L$1 = r3
            r10.L$2 = r3
            r10.L$3 = r3
            r10.L$4 = r3
            r10.label = r4
            java.lang.Object r0 = r0.join(r10)
            if (r0 != r5) goto L29
            return r5
        L48:
            kotlin.ResultKt.throwOnFailure(r16)
            r0 = 3
            kotlinx.coroutines.sync.Semaphore r13 = kotlinx.coroutines.sync.SemaphoreKt.Semaphore$default(r0, r2, r4, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0 = 300(0x12c, double:1.48E-321)
            cn.ever.cloud.android.services.download.Downloader r7 = r10.this$0
            cn.ever.cloud.android.coroutine.SdkScope r8 = r7.scope
            cn.ever.cloud.android.services.download.Downloader$encryptDownloadChunkToFile$3$throttledProgressFn$1 r7 = new cn.ever.cloud.android.services.download.Downloader$encryptDownloadChunkToFile$3$throttledProgressFn$1
            r7.<init>(r10)
            kotlin.jvm.functions.Function1 r12 = cn.ever.cloud.utils.ThrottleKt.throttleLatest(r0, r8, r7)
            java.util.List r0 = r10.$chunksToDownload
            java.util.Iterator r7 = r0.iterator()
        L6a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lcd
            java.lang.Object r11 = r7.next()
            cn.ever.cloud.network.entity.NEncChunk r11 = (cn.ever.cloud.network.entity.NEncChunk) r11
            r10.L$0 = r13
            r10.L$1 = r2
            r10.L$2 = r12
            r10.L$3 = r11
            r10.L$4 = r7
            r10.label = r6
            java.lang.Object r0 = r13.acquire(r10)
            if (r0 != r5) goto La0
            return r5
        L89:
            java.lang.Object r7 = r10.L$4
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r11 = r10.L$3
            cn.ever.cloud.network.entity.NEncChunk r11 = (cn.ever.cloud.network.entity.NEncChunk) r11
            java.lang.Object r12 = r10.L$2
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            java.lang.Object r2 = r10.L$1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r13 = r10.L$0
            kotlinx.coroutines.sync.Semaphore r13 = (kotlinx.coroutines.sync.Semaphore) r13
            kotlin.ResultKt.throwOnFailure(r16)
        La0:
            cn.ever.cloud.utils.LogHelper r8 = cn.ever.cloud.utils.LogHelper.INSTANCE
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "start download chunk="
            r9.<init>(r0)
            long r0 = r11.getOffset()
            r9.append(r0)
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "Downloader"
            r8.m20552v(r0, r1)
            cn.ever.cloud.android.services.download.Downloader r0 = r10.this$0
            cn.ever.cloud.android.coroutine.SdkScope r1 = r0.scope
            kotlin.coroutines.CoroutineContext r0 = r10.$coroutineContext
            cn.ever.cloud.android.services.download.Downloader$encryptDownloadChunkToFile$3$job$1 r9 = new cn.ever.cloud.android.services.download.Downloader$encryptDownloadChunkToFile$3$job$1
            r14 = 0
            r9.<init>(r10, r11, r12, r13, r14)
            kotlinx.coroutines.Job r0 = r1.launch(r0, r9)
            r2.add(r0)
            goto L6a
        Lcd:
            java.util.Iterator r1 = r2.iterator()
            goto L29
        Ld3:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Ld6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.download.Downloader$encryptDownloadChunkToFile$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
