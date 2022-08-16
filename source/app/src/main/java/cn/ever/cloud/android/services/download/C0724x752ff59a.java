package cn.ever.cloud.android.services.download;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: cn.ever.cloud.android.services.download.Downloader$encryptDownloadChunkToFile$3$job$1$invokeSuspend$$inlined$runCatching$lambda$1 */
/* loaded from: classes23.dex */
public final class C0724x752ff59a extends Lambda implements Function1<Long, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Downloader$encryptDownloadChunkToFile$3$job$1 this$0;

    static {
        Covode.recordClassIndex(3035);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0724x752ff59a(Downloader$encryptDownloadChunkToFile$3$job$1 downloader$encryptDownloadChunkToFile$3$job$1) {
        super(1);
        this.this$0 = downloader$encryptDownloadChunkToFile$3$job$1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Long l) {
        invoke(l.longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        this.this$0.$throttledProgressFn.invoke(Long.valueOf(this.this$0.this$0.$downloadedSize.addAndGet(j)));
    }
}
