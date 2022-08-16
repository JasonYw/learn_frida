package com.bytedance.android.live.broadcastgame.opengame.service;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C390501dE;

/* loaded from: classes.dex */
public final class ReportService$catchVideoShot$1 extends Lambda implements Function1<Bitmap, Unit> {
    public static final ReportService$catchVideoShot$1 INSTANCE = new ReportService$catchVideoShot$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21026);
    }

    public ReportService$catchVideoShot$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (!PatchProxy.proxy(new Object[]{bitmap2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(bitmap2);
            C390501dE.f263LJ.LIZ(bitmap2);
        }
        return Unit.INSTANCE;
    }
}
