package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p1594ss.android.socialbase.downloader.exception.BaseException;
import com.p1594ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class DownloaderListener$onFailed$1 extends Lambda implements Function1<AbsDownloadListener, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: $e */
    public final /* synthetic */ BaseException f26035$e;
    public final /* synthetic */ DownloadInfo $entity;

    static {
        Covode.recordClassIndex(19355);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloaderListener$onFailed$1(DownloadInfo downloadInfo, BaseException baseException) {
        super(1);
        this.$entity = downloadInfo;
        this.f26035$e = baseException;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbsDownloadListener absDownloadListener) {
        AbsDownloadListener absDownloadListener2 = absDownloadListener;
        if (!PatchProxy.proxy(new Object[]{absDownloadListener2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(absDownloadListener2);
            absDownloadListener2.onFailed(this.$entity, this.f26035$e);
        }
        return Unit.INSTANCE;
    }
}
