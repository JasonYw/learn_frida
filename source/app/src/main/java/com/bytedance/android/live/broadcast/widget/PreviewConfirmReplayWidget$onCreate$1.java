package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.view.DialogC3254g;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC425302sG;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C3L8;
import p003X.C4574547f;

/* loaded from: classes12.dex */
public final class PreviewConfirmReplayWidget$onCreate$1 extends Lambda implements Function1<RoomCreateInfo, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewConfirmReplayWidget this$0;

    static {
        Covode.recordClassIndex(18474);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewConfirmReplayWidget$onCreate$1(PreviewConfirmReplayWidget previewConfirmReplayWidget) {
        super(1);
        this.this$0 = previewConfirmReplayWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(RoomCreateInfo roomCreateInfo) {
        C3L8 c3l8;
        Object mo27335getValue;
        String str;
        RoomCreateInfo roomCreateInfo2 = roomCreateInfo;
        if (!PatchProxy.proxy(new Object[]{roomCreateInfo2}, this, changeQuickRedirect, false, 1).isSupported && roomCreateInfo2 != null && (c3l8 = roomCreateInfo2.LIZIZ) != null && c3l8.LIZ) {
            PreviewConfirmReplayWidget previewConfirmReplayWidget = this.this$0;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], previewConfirmReplayWidget, PreviewConfirmReplayWidget.LIZ, false, 1);
            if (proxy.isSupported) {
                mo27335getValue = proxy.result;
            } else {
                mo27335getValue = previewConfirmReplayWidget.LIZIZ.mo27335getValue();
            }
            final DialogC3254g dialogC3254g = (DialogC3254g) mo27335getValue;
            AbstractC425302sG abstractC425302sG = new AbstractC425302sG() { // from class: X.2sD
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(18475);
                }

                @Override // p003X.AbstractC425302sG
                public final void LIZ() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    this.this$0.LIZIZ(true);
                    this.this$0.LIZ(true);
                    C116971W2r.LIZ(DialogC3254g.this);
                }

                @Override // p003X.AbstractC425302sG
                public final void LIZIZ() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
                        return;
                    }
                    this.this$0.LIZIZ(false);
                    this.this$0.LIZ(false);
                    C116971W2r.LIZ(DialogC3254g.this);
                }
            };
            if (!PatchProxy.proxy(new Object[]{abstractC425302sG}, dialogC3254g, DialogC3254g.LIZ, false, 1).isSupported) {
                C106862S5w.LIZ(abstractC425302sG);
                dialogC3254g.LIZIZ = abstractC425302sG;
            }
            if (!PatchProxy.proxy(new Object[0], this.this$0, PreviewConfirmReplayWidget.LIZ, false, 5).isSupported) {
                C4574547f LIZ = C4574547f.LIZ();
                Pair[] pairArr = new Pair[6];
                pairArr[0] = TuplesKt.m137to("request_page", "live_start");
                IUser LIZ2 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                if (LIZ2.isEnableShowCommerceSale()) {
                    str = "1";
                } else {
                    str = "0";
                }
                pairArr[1] = TuplesKt.m137to("is_ecom", str);
                pairArr[2] = TuplesKt.m137to("anchor_id", String.valueOf(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ()));
                pairArr[3] = TuplesKt.m137to("live_status_type", "live_before");
                pairArr[4] = TuplesKt.m137to("room_id", "");
                pairArr[5] = TuplesKt.m137to("_param_live_platform", "live");
                LIZ.LIZ("livesdk_show_explain_replay_toggle_confirm_window", MapsKt__MapsKt.mapOf(pairArr), new Object[0]);
            }
            C116971W2r.LIZJ(dialogC3254g);
        }
        return Unit.INSTANCE;
    }
}
