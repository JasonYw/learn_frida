package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.android.live.broadcastgame.api.openplatform.PluginType;
import com.bytedance.android.live.broadcastgame.opengame.dialog.OpenGameReportDialog;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class ReportService$showReportDialog$1 extends Lambda implements Function1<OpenGameReportDialog, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ReportService this$0;

    static {
        Covode.recordClassIndex(21035);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportService$showReportDialog$1(ReportService reportService) {
        super(1);
        this.this$0 = reportService;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(OpenGameReportDialog openGameReportDialog) {
        OpenGameReportDialog openGameReportDialog2 = openGameReportDialog;
        if (!PatchProxy.proxy(new Object[]{openGameReportDialog2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(openGameReportDialog2);
            this.this$0.LIZJ = new WeakReference<>(openGameReportDialog2);
            openGameReportDialog2.LJI = new C37081();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.ReportService$showReportDialog$1$1 */
    /* loaded from: classes5.dex */
    public static final class C37081 extends Lambda implements Function1<Integer, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21036);
        }

        public C37081() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Integer num) {
            int intValue = num.intValue();
            if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported) {
                if (intValue == 0 && ReportService$showReportDialog$1.this.this$0.LJIIIIZZ().LJIILJJIL() != PluginType.MINI_APP) {
                    ReportService$showReportDialog$1.this.this$0.LJIIIIZZ().LJI.LIZJ((Map<String, String>) null);
                }
                ReportService$showReportDialog$1.this.this$0.LIZJ = null;
            }
            return Unit.INSTANCE;
        }
    }
}
