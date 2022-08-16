package com.bytedance.android.live.broadcastgame.opengame.service;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C390501dE;
import p003X.LK1;

/* loaded from: classes.dex */
public final class ReportService$catchVideoShot$2 extends Lambda implements Function1<Bitmap, Unit> {
    public static final ReportService$catchVideoShot$2 INSTANCE = new ReportService$catchVideoShot$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21027);
    }

    public ReportService$catchVideoShot$2() {
        super(1);
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.ReportService$catchVideoShot$2$1 */
    /* loaded from: classes.dex */
    public static final class C37071 extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ Bitmap $it;

        static {
            Covode.recordClassIndex(21028);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37071(Bitmap bitmap) {
            super(0);
            this.$it = bitmap;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Unit mo30099invoke() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                C390501dE.f263LJ.LIZ(this.$it);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (!PatchProxy.proxy(new Object[]{bitmap2}, this, changeQuickRedirect, false, 1).isSupported && bitmap2 != null) {
            LK1.LIZ(0L, false, false, new C37071(bitmap2), 7, null);
        }
        return Unit.INSTANCE;
    }
}
