package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C4574547f;
import p003X.KLB;

/* loaded from: classes5.dex */
public final class PreviewPaidLiveWidget$onCreate$1 extends Lambda implements Function1<RoomCreateInfo, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewPaidLiveWidget this$0;

    static {
        Covode.recordClassIndex(18634);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewPaidLiveWidget$onCreate$1(PreviewPaidLiveWidget previewPaidLiveWidget) {
        super(1);
        this.this$0 = previewPaidLiveWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(RoomCreateInfo roomCreateInfo) {
        ArrayList<Integer> arrayList;
        KLB klb;
        RoomCreateInfo roomCreateInfo2 = roomCreateInfo;
        if (!PatchProxy.proxy(new Object[]{roomCreateInfo2}, this, changeQuickRedirect, false, 1).isSupported && roomCreateInfo2 != null) {
            ALogger.m15801d(this.this$0.LIZ(), "receive roomCreateInfo");
            KLB klb2 = roomCreateInfo2.LJJJJJ;
            if (klb2 != null && (arrayList = klb2.LIZJ) != null && (klb = roomCreateInfo2.LJJJJJ) != null && klb.LIZ()) {
                this.this$0.LIZIZ().LJJJJZ().LIZ(arrayList);
                this.this$0.LJIILJJIL();
                C4574547f.LIZ().LIZ("livesdk_paidlive_activity_icon_show", this.this$0.LIZLLL(), new Object[0]);
                PreviewPaidLiveWidget previewPaidLiveWidget = this.this$0;
                previewPaidLiveWidget.LIZJ = roomCreateInfo2;
                String LIZ = previewPaidLiveWidget.LIZ();
                ALogger.m15801d(LIZ, "receive paidLiveRights " + arrayList + ", show container");
                if (this.this$0.LIZLLL) {
                    ALogger.m15801d(this.this$0.LIZ(), "auto open panel by roomCreateInfo change");
                    this.this$0.LIZJ();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
