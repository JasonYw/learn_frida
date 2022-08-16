package cn.ever.cloud.android.services.download;

import cn.ever.cloud.utils.IOUtils;
import cn.ever.cloud.utils.LogHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.RandomAccessFile;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes23.dex */
public final class Downloader$encryptDownloadChunkToFile$2 extends Lambda implements Function1<Throwable, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DownloadMedia $media;
    public final /* synthetic */ RandomAccessFile $targetFile;

    static {
        Covode.recordClassIndex(3032);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Downloader$encryptDownloadChunkToFile$2(DownloadMedia downloadMedia, RandomAccessFile randomAccessFile) {
        super(1);
        this.$media = downloadMedia;
        this.$targetFile = randomAccessFile;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        if (th instanceof CancellationException) {
            LogHelper logHelper = LogHelper.INSTANCE;
            logHelper.m20553i("Downloader", "job cancelled, media=" + this.$media.getCloudId());
        } else if (th != null) {
            LogHelper logHelper2 = LogHelper.INSTANCE;
            logHelper2.m20554e("Downloader", "job got error. media=" + this.$media.getCloudId());
        } else {
            LogHelper logHelper3 = LogHelper.INSTANCE;
            logHelper3.m20555d("Downloader", "job complete normally. media=" + this.$media.getCloudId());
        }
        IOUtils.close(this.$targetFile);
    }
}
