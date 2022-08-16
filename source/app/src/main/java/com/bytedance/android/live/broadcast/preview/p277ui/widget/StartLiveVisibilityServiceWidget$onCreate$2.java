package com.bytedance.android.live.broadcast.preview.p277ui.widget;

import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.widget.StartLiveVisibilityServiceWidget$onCreate$2 */
/* loaded from: classes3.dex */
public final class StartLiveVisibilityServiceWidget$onCreate$2 extends Lambda implements Function1<RoomCreateInfo, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ StartLiveVisibilityServiceWidget this$0;

    static {
        Covode.recordClassIndex(17444);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveVisibilityServiceWidget$onCreate$2(StartLiveVisibilityServiceWidget startLiveVisibilityServiceWidget) {
        super(1);
        this.this$0 = startLiveVisibilityServiceWidget;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.ui.widget.StartLiveVisibilityServiceWidget$onCreate$2$1 */
    /* loaded from: classes3.dex */
    public static final class C31971 extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(17445);
        }

        public C31971() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Unit mo30099invoke() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && StartLiveVisibilityServiceWidget$onCreate$2.this.this$0.LIZJ && StartLiveVisibilityServiceWidget$onCreate$2.this.this$0.LIZIZ().LJJIZ().LIZ().intValue() == 0) {
                StartLiveVisibilityServiceWidget$onCreate$2.this.this$0.LIZIZ().LJJIZ().LIZ(1);
                ALogger.m15801d(StartLiveVisibilityServiceWidget$onCreate$2.this.this$0.LIZ(), "change selectedStartLiveVisibility for secretAccount to ONLY_FANS_CAN");
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(RoomCreateInfo roomCreateInfo) {
        RoomCreateInfo roomCreateInfo2 = roomCreateInfo;
        if (!PatchProxy.proxy(new Object[]{roomCreateInfo2}, this, changeQuickRedirect, false, 1).isSupported && roomCreateInfo2 != null) {
            this.this$0.LIZIZ().LJJIZ().LIZ(Integer.valueOf(roomCreateInfo2.LJJIJL));
            this.this$0.LIZ(new C31971());
            String LIZ = this.this$0.LIZ();
            ALogger.m15801d(LIZ, "get visibilityRange:" + roomCreateInfo2.LJJIJL + " from createInfo");
            int intValue = this.this$0.LIZIZ().LJJIZ().LIZ().intValue();
            if (intValue != 3) {
                if (intValue == 4) {
                    this.this$0.LIZJ().LJIIIIZZ();
                }
            } else {
                this.this$0.LIZJ().LJII();
            }
            this.this$0.LIZIZ().LJJJ().LIZ(Boolean.valueOf(roomCreateInfo2.LJJJJI));
            this.this$0.LIZIZ().LJJJI().LIZ(Long.valueOf(roomCreateInfo2.LJJJJ));
            String LIZ2 = this.this$0.LIZ();
            ALogger.m15795w(LIZ2, "set startLiveVisibilityRange to " + roomCreateInfo2.LJJIJL + " from roomCreateInfo");
        }
        return Unit.INSTANCE;
    }
}
