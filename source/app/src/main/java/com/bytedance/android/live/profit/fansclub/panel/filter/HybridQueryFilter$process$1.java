package com.bytedance.android.live.profit.fansclub.panel.filter;

import android.text.TextUtils;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.profit.fansclub.FansClubEntranceParams;
import com.bytedance.android.live.profit.privilege.AbstractC5365a;
import com.bytedance.android.live.profit.privilege.model.C5372g;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.utils.C9303cy;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomAuthStatus;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC109985TRz;
import p003X.C106862S5w;
import p003X.C2OY;
import p003X.C2WC;
import p003X.C409202Hq;
import p003X.C458444Ba;
import p003X.C4AX;

/* loaded from: classes12.dex */
public final class HybridQueryFilter$process$1 extends Lambda implements Function1<C9303cy, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ FansClubEntranceParams $entranceParams;
    public final /* synthetic */ C4AX this$0;

    static {
        Covode.recordClassIndex(33313);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HybridQueryFilter$process$1(C4AX c4ax, FansClubEntranceParams fansClubEntranceParams) {
        super(1);
        this.this$0 = c4ax;
        this.$entranceParams = fansClubEntranceParams;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C9303cy c9303cy) {
        LIZ(c9303cy);
        return Unit.INSTANCE;
    }

    public final void LIZ(C9303cy c9303cy) {
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C2WC<? extends C5372g> LJIIIIZZ;
        if (PatchProxy.proxy(new Object[]{c9303cy}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(c9303cy);
        Room LIZ = this.this$0.LIZIZ.LIZ().LIZ();
        User LIZ2 = this.this$0.LIZIZ.LIZIZ().LIZ();
        c9303cy.LIZ("room_id", String.valueOf(LIZ.getId()));
        c9303cy.LIZ("anchor_id", String.valueOf(LIZ.ownerUserId));
        User owner = LIZ.getOwner();
        if (owner == null || (str = owner.getSecUid()) == null) {
            str = "";
        }
        c9303cy.LIZ("sec_anchor_id", str);
        c9303cy.LIZ("user_id", String.valueOf(LIZ2.getId()));
        String secUid = LIZ2.getSecUid();
        if (secUid == null) {
            secUid = "";
        }
        c9303cy.LIZ("sec_user_id", secUid);
        c9303cy.LIZ("enter_from", C4AX.f1140LJ.LJFF());
        String str8 = this.$entranceParams.LIZLLL;
        if (!Intrinsics.areEqual(str8, "mini_card") && !Intrinsics.areEqual(str8, "mini_card_medal")) {
            z = false;
        } else {
            z = true;
        }
        C5372g c5372g = null;
        if (!z) {
            str8 = null;
        }
        c9303cy.LIZ("source", str8);
        c9303cy.LIZ("event_module", this.$entranceParams.LIZLLL);
        c9303cy.LIZ("is_fans", C4AX.f1140LJ.LIZ(this.this$0.LIZJ));
        c9303cy.LIZ("request_page", this.$entranceParams.LIZJ);
        this.this$0.LIZIZ.LLIIL().LIZ(this.$entranceParams.LIZJ);
        AbstractC109985TRz LIZIZ = C409202Hq.LIZIZ();
        String str9 = "1";
        if (LIZIZ == null || !LIZIZ.LIZ()) {
            str2 = "0";
        } else {
            str2 = str9;
        }
        c9303cy.LIZ("hide_nickname", str2);
        c9303cy.LIZ("video_id", C4AX.f1140LJ.LIZ());
        if (!LIZ.allowGift()) {
            str3 = "0";
        } else {
            str3 = str9;
        }
        c9303cy.LIZ("allow_gift", str3);
        c9303cy.LIZ("video_point_type", C4AX.f1140LJ.LIZIZ());
        c9303cy.LIZ("enter_from_merge", C4AX.f1140LJ.m24861LJ());
        c9303cy.LIZ("enter_method", C4AX.f1140LJ.LJFF());
        c9303cy.LIZ("log_pb", C4AX.f1140LJ.LJI());
        String requestId = LIZ.getRequestId();
        if (requestId == null) {
            requestId = "0";
        }
        c9303cy.LIZ("request_id", requestId);
        c9303cy.LIZ("action_type", C4AX.f1140LJ.LIZ(this.$entranceParams));
        c9303cy.LIZ("IESLiveEffectAdTrackExtraServiceKey", C4AX.f1140LJ.LIZJ());
        c9303cy.LIZ("is_other_channel", C4AX.f1140LJ.LIZLLL());
        String str10 = this.this$0.LIZLLL.get("live_ad");
        if (str10 != null && str10.length() != 0) {
            c9303cy.LIZ("live_ad", this.this$0.LIZLLL.get("live_ad"));
        }
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        c9303cy.LIZ("connection_type", ((IInteractService) service).getLinkConnectionType());
        IService service2 = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service2, "");
        c9303cy.LIZ("anchor_cnt", ((IInteractService) service2).getLinkAnchorCount());
        AbstractC5365a m24858LJ = C458444Ba.m24858LJ();
        if (m24858LJ != null && (LJIIIIZZ = m24858LJ.LJIIIIZZ()) != null) {
            c5372g = LJIIIIZZ.LIZ();
        }
        if (this.$entranceParams.LJFF != FansClubEntranceParams.Entrance.UserInfoFansClubWidget) {
            if (!this.$entranceParams.LJI) {
                str7 = "0";
            } else {
                str7 = str9;
            }
            c9303cy.LIZ("is_subscription", str7);
        } else {
            String LIZ3 = this.this$0.LIZ("top_left_entrance_last_panel_tab");
            if (TextUtils.equals(LIZ3, "fansclub") || (!TextUtils.equals(LIZ3, "subscribe") && !this.$entranceParams.LJI)) {
                str4 = "0";
            } else {
                str4 = str9;
            }
            c9303cy.LIZ("is_subscription", str4);
        }
        c9303cy.LIZ("is_club_member", C4AX.f1140LJ.LIZ(this.this$0.LIZJ));
        if (c5372g == null || !c5372g.LIZLLL) {
            str5 = "0";
        } else {
            str5 = str9;
        }
        c9303cy.LIZ("is_vip_member", str5);
        if (c5372g == null || !c5372g.LJI) {
            str9 = "0";
        }
        c9303cy.LIZ("subscription_tab", str9);
        RoomAuthStatus roomAuthStatus = LIZ.getRoomAuthStatus();
        if (roomAuthStatus == null || (str6 = String.valueOf(roomAuthStatus.fansClubAuth)) == null) {
            str6 = "0";
        }
        c9303cy.LIZ("fansclub_auth", str6);
        String LIZIZ2 = C2OY.LIZIZ();
        if (LIZIZ2 != null && LIZIZ2 != null && LIZIZ2.length() != 0) {
            c9303cy.LIZ("is_vr", LIZIZ2);
        }
    }
}
