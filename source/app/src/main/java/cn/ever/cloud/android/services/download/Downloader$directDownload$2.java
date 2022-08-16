package cn.ever.cloud.android.services.download;

import cn.ever.cloud.android.services.task.entity.ItemProgress;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes23.dex */
public final class Downloader$directDownload$2 extends Lambda implements Function1<Long, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DownloadMedia $media;
    public final /* synthetic */ long $offset;
    public final /* synthetic */ Function1 $progressFn;

    static {
        Covode.recordClassIndex(3022);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Downloader$directDownload$2(Function1 function1, DownloadMedia downloadMedia, long j) {
        super(1);
        this.$progressFn = function1;
        this.$media = downloadMedia;
        this.$offset = j;
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
        this.$progressFn.invoke(new ItemProgress(this.$media.getSize(), this.$offset));
    }
}
