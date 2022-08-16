package com.bytedance.android.live.broadcast.download;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class DownloadActionHelper$clickDownload$startDownloadWithoutWifi$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function0 $action;
    public final /* synthetic */ C3002c $downloadInfo;

    static {
        Covode.recordClassIndex(15503);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadActionHelper$clickDownload$startDownloadWithoutWifi$1(C3002c c3002c, Function0 function0) {
        super(0);
        this.$downloadInfo = c3002c;
        this.$action = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.$downloadInfo.LJJIJIL = false;
            this.$action.mo30099invoke();
        }
        return Unit.INSTANCE;
    }
}
