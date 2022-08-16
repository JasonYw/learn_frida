package com.bytedance.android.live.liveinteract.chatroom.chatroom.dialog;

import android.view.View;
import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.live.core.network.CustomApiServerException;
import com.bytedance.android.live.liveinteract.plantform.api.LinkAudienceApi;
import com.bytedance.android.live.liveinteract.plantform.model.C4824t;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.p517u.AbstractC6302f;
import com.bytedance.android.livesdk.chatroom.p517u.C6307m;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.functions.Consumer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC413392Xt;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C4574547f;
import p003X.C78536Gxe;
import p003X.C78538Gxg;
import p003X.C78828H5q;
import p003X.C79007HCn;
import p003X.C79242HLo;
import p003X.C87010KQi;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.C89918Lbk;
import p003X.DialogC77758Gl6;
import p003X.LK5;
import p003X.QB4;

/* loaded from: classes3.dex */
public final class IncreasePriceApplyDialog$onCreate$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC77758Gl6 this$0;

    static {
        Covode.recordClassIndex(25437);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncreasePriceApplyDialog$onCreate$1(DialogC77758Gl6 dialogC77758Gl6) {
        super(1);
        this.this$0 = dialogC77758Gl6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        Room room;
        Long l;
        Long l2;
        Long l3;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ;
        C6307m LIZIZ2;
        C2WC<Room> LIZ;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
            if (LIZ2 != null && (LIZ = LIZ2.LIZ()) != null) {
                room = LIZ.LIZ();
            } else {
                room = null;
            }
            C79007HCn LJII = C79007HCn.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII, "");
            C4824t c4824t = LJII.LJJIII;
            if (c4824t == null || c4824t.LJIJJLI != 0) {
                C78536Gxe c78536Gxe = C78536Gxe.LIZJ;
                if (room != null) {
                    l = Long.valueOf(room.ownerUserId);
                } else {
                    l = null;
                }
                String valueOf = String.valueOf(l);
                if (room != null) {
                    l2 = Long.valueOf(room.getId());
                } else {
                    l2 = null;
                }
                String valueOf2 = String.valueOf(l2);
                String valueOf3 = String.valueOf(this.this$0.LIZJ);
                String valueOf4 = String.valueOf(this.this$0.LIZLLL);
                C79007HCn LJII2 = C79007HCn.LJII();
                Intrinsics.checkNotNullExpressionValue(LJII2, "");
                C4824t c4824t2 = LJII2.LJJIII;
                if (c4824t2 != null) {
                    l3 = Long.valueOf(c4824t2.LJIJJLI);
                } else {
                    l3 = null;
                }
                String valueOf5 = String.valueOf(l3);
                if (!PatchProxy.proxy(new Object[]{valueOf, valueOf2, valueOf3, valueOf4, valueOf5}, c78536Gxe, C78536Gxe.LIZ, false, 20).isSupported) {
                    C106862S5w.LIZ(valueOf, valueOf2, valueOf3, valueOf4, valueOf5);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C78828H5q.LIZIZ((Map<String, String>) linkedHashMap, C79242HLo.LJIIJ());
                    linkedHashMap.put("anchor_id", valueOf);
                    linkedHashMap.put("room_id", valueOf2);
                    C78828H5q.LIZIZ(linkedHashMap, (Integer) null, (Integer) null, 6, (Object) null);
                    C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                    if (LIZ3 != null && (LJJZZIII = LIZ3.LJJZZIII()) != null && (LIZIZ = LJJZZIII.LIZIZ()) != null && (LIZIZ2 = LIZIZ.LIZIZ()) != null && LIZIZ2.LIZJ != null) {
                        C78828H5q.LIZIZ(linkedHashMap);
                    } else {
                        linkedHashMap.put("seat_fit_status", "off");
                    }
                    linkedHashMap.put("play_mode", C78536Gxe.LIZIZ.LIZ());
                    linkedHashMap.put("time", String.valueOf(C78536Gxe.LIZIZ.LIZLLL()));
                    linkedHashMap.put("recharge_price", String.valueOf(C78536Gxe.LIZIZ.LIZIZ()));
                    linkedHashMap.put("line_up", valueOf5);
                    linkedHashMap.put("add_price", valueOf3);
                    linkedHashMap.put("expected_line_up", valueOf4);
                    C4574547f.LIZ().LIZ("livesdk_guest_connection_rechargeble_premium_click", linkedHashMap, Room.class, C8668v.class);
                }
            }
            QB4.LIZ(((LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class)).increasePriceApply(this.this$0.f6446LJ, this.this$0.LIZJ).compose(C100839PnV.LIZJ()).subscribe(new Consumer<C5176i<Void>>() { // from class: com.bytedance.android.live.liveinteract.chatroom.chatroom.dialog.IncreasePriceApplyDialog$onCreate$1.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(25438);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(C5176i<Void> c5176i) {
                    if (!PatchProxy.proxy(new Object[]{c5176i}, this, LIZ, false, 1).isSupported) {
                        IncreasePriceApplyDialog$onCreate$1.this.this$0.LJFF.LIZ();
                        C78538Gxg.LIZIZ.LIZ(IncreasePriceApplyDialog$onCreate$1.this.this$0.LIZJ);
                        C116971W2r.LIZ(IncreasePriceApplyDialog$onCreate$1.this.this$0);
                    }
                }
            }, new Consumer<Throwable>() { // from class: com.bytedance.android.live.liveinteract.chatroom.chatroom.dialog.IncreasePriceApplyDialog$onCreate$1.2
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(25439);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Throwable th) {
                    Throwable th2 = th;
                    if (!PatchProxy.proxy(new Object[]{th2}, this, LIZ, false, 1).isSupported) {
                        if (th2 instanceof CustomApiServerException) {
                            ApiServerException apiServerException = (ApiServerException) th2;
                            if (apiServerException.mErrorCode == 40001) {
                                C88440Kt0.LIZ(apiServerException.mPrompt);
                                C87010KQi.LIZ().LIZ(new C89918Lbk(1, "live_detail"));
                            } else if (apiServerException.mErrorCode == 4004243) {
                                C88440Kt0.LIZ(LK5.LIZ(2131588459));
                            }
                        }
                        IncreasePriceApplyDialog$onCreate$1.this.this$0.LJFF.LIZIZ();
                    }
                }
            }), this.this$0.LIZIZ);
        }
        return Unit.INSTANCE;
    }
}
