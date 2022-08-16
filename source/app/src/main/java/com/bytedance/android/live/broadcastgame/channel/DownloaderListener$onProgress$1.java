package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p1594ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class DownloaderListener$onProgress$1 extends Lambda implements Function1<AbsDownloadListener, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DownloadInfo $entity;

    static {
        Covode.recordClassIndex(19356);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloaderListener$onProgress$1(DownloadInfo downloadInfo) {
        super(1);
        this.$entity = downloadInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbsDownloadListener absDownloadListener) {
        AbsDownloadListener absDownloadListener2 = absDownloadListener;
        if (!PatchProxy.proxy(new Object[]{absDownloadListener2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(absDownloadListener2);
            absDownloadListener2.onProgress(this.$entity);
        }
        return Unit.INSTANCE;
    }
}
