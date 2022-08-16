package cn.ever.cloud.android.services.download;

import cn.ever.cloud.android.services.task.entity.ItemProgress;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes23.dex */
public final class Downloader$encryptDownloadChunkToFile$3$throttledProgressFn$1 extends Lambda implements Function1<Long, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Downloader$encryptDownloadChunkToFile$3 this$0;

    static {
        Covode.recordClassIndex(3036);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Downloader$encryptDownloadChunkToFile$3$throttledProgressFn$1(Downloader$encryptDownloadChunkToFile$3 downloader$encryptDownloadChunkToFile$3) {
        super(1);
        this.this$0 = downloader$encryptDownloadChunkToFile$3;
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
        this.this$0.$progressFn.invoke(new ItemProgress(this.this$0.$media.getSize(), this.this$0.$downloadedSize.get()));
    }
}
