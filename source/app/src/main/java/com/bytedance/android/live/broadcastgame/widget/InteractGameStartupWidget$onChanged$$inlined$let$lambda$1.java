package com.bytedance.android.live.broadcastgame.widget;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C442103eG;

/* loaded from: classes12.dex */
public final class InteractGameStartupWidget$onChanged$$inlined$let$lambda$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3384q $game$inlined;
    public final /* synthetic */ InteractGameStartupWidget this$0;

    static {
        Covode.recordClassIndex(21833);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractGameStartupWidget$onChanged$$inlined$let$lambda$1(InteractGameStartupWidget interactGameStartupWidget, C3384q c3384q) {
        super(0);
        this.this$0 = interactGameStartupWidget;
        this.$game$inlined = c3384q;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        C2WD<String> m24900LJ;
        String LIZ;
        C2WD<String> m24900LJ2;
        C2WD<String> LIZLLL;
        C2WC<String> LIZIZ;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            if (!PatchProxy.proxy(new Object[0], this.this$0, InteractGameStartupWidget.LIZ, false, 13).isSupported) {
                C442103eG LIZ2 = C442103eG.LIZJ.LIZ();
                if (LIZ2 != null && (m24900LJ = LIZ2.m24900LJ()) != null && (LIZ = m24900LJ.LIZ()) != null) {
                    C442103eG LIZ3 = C442103eG.LIZJ.LIZ();
                    if (LIZ3 != null && (LIZIZ = LIZ3.LIZIZ()) != null) {
                        LIZIZ.LIZ("guide");
                    }
                    C442103eG LIZ4 = C442103eG.LIZJ.LIZ();
                    if (LIZ4 != null && (LIZLLL = LIZ4.LIZLLL()) != null) {
                        LIZLLL.LIZ(LIZ);
                    }
                    C442103eG LIZ5 = C442103eG.LIZJ.LIZ();
                    if (LIZ5 != null && (m24900LJ2 = LIZ5.m24900LJ()) != null) {
                        m24900LJ2.LIZ(null);
                    }
                } else {
                    C442103eG LIZ6 = C442103eG.LIZJ.LIZ();
                    if (LIZ6 != null) {
                        LIZ6.LJIJI();
                    }
                }
            }
            this.this$0.LIZ(this.$game$inlined);
            ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).justReportRoomEvent(9, this.$game$inlined.f26027LJ, 15, "");
        }
        return Unit.INSTANCE;
    }
}
