package cn.ever.cloud.android.services.download;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m136c = "cn.ever.cloud.android.services.download.Downloader", m135f = "Downloader.kt", m134i = {0, 0, 0, 0, 0, 0, 0}, m133l = {299}, m132m = "encryptDownloadChunkToFile", m131n = {"this", "aesKey", "targetFile", "downloadedChunks", "chunksToDecrypt", "sortedPendingChunks", "realDownloadedSize"}, m130s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0"})
/* loaded from: classes23.dex */
public final class Downloader$encryptDownloadChunkToFile$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Downloader this$0;

    static {
        Covode.recordClassIndex(3031);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Downloader$encryptDownloadChunkToFile$1(Downloader downloader, Continuation continuation) {
        super(continuation);
        this.this$0 = downloader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.encryptDownloadChunkToFile(null, 0L, null, null, null, null, this);
    }
}