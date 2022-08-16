package cn.ever.cloud.android.services.download;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes23.dex */
public final class Downloader$downloadAndCheckIntegrity$2 extends Lambda implements Function1<Throwable, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DownloadMedia $media;
    public final /* synthetic */ Downloader this$0;

    static {
        Covode.recordClassIndex(3026);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Downloader$downloadAndCheckIntegrity$2(Downloader downloader, DownloadMedia downloadMedia) {
        super(1);
        this.this$0 = downloader;
        this.$media = downloadMedia;
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
        this.this$0.monitorDownload(th, this.$media);
    }
}
