package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6521s;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar_behavior.p528a.C6532d;
import com.bytedance.android.livesdk.popup.manager.AbstractC9164c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC80293Hkt;
import p003X.C4574547f;
import p003X.C86861KKp;
import p003X.C86862KKq;
import p003X.C87308Kak;
import p003X.C88300Kqk;
import p003X.KKR;
import p003X.LK1;
import p003X.M0O;

/* loaded from: classes5.dex */
public final class PreviewActivityZoneWidget$onCreate$1 extends Lambda implements Function1<RoomCreateInfo, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewActivityZoneWidget this$0;

    static {
        Covode.recordClassIndex(18398);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewActivityZoneWidget$onCreate$1(PreviewActivityZoneWidget previewActivityZoneWidget) {
        super(1);
        this.this$0 = previewActivityZoneWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(RoomCreateInfo roomCreateInfo) {
        KKR kkr;
        C87308Kak<String> c87308Kak;
        KKR kkr2;
        String str;
        RoomCreateInfo roomCreateInfo2 = roomCreateInfo;
        if (!PatchProxy.proxy(new Object[]{roomCreateInfo2}, this, changeQuickRedirect, false, 1).isSupported) {
            PreviewActivityZoneWidget previewActivityZoneWidget = this.this$0;
            String str2 = null;
            if (!PatchProxy.proxy(new Object[]{roomCreateInfo2}, previewActivityZoneWidget, PreviewActivityZoneWidget.LIZ, false, 3).isSupported && roomCreateInfo2 != null && (kkr2 = roomCreateInfo2.LJJIIJZLJL) != null && kkr2.LIZIZ != null) {
                View view = previewActivityZoneWidget.contentView;
                Intrinsics.checkNotNullExpressionValue(view, "");
                HSImageView hSImageView = (HSImageView) view.findViewById(2131192771);
                if (hSImageView != null) {
                    KKR kkr3 = roomCreateInfo2.LJJIIJZLJL;
                    if (kkr3 != null) {
                        str = kkr3.LIZIZ;
                    } else {
                        str = null;
                    }
                    M0O.LIZ(hSImageView, str);
                }
            }
            PreviewActivityZoneWidget previewActivityZoneWidget2 = this.this$0;
            if (!PatchProxy.proxy(new Object[]{roomCreateInfo2}, previewActivityZoneWidget2, PreviewActivityZoneWidget.LIZ, false, 4).isSupported) {
                View view2 = previewActivityZoneWidget2.contentView;
                Intrinsics.checkNotNullExpressionValue(view2, "");
                TextView textView = (TextView) view2.findViewById(2131193080);
                if (textView != null) {
                    LK1.LIZ(textView);
                }
                if (roomCreateInfo2 == null) {
                    ALogger.m15795w(previewActivityZoneWidget2.LIZ(), "null roomCreateInfo,skip show reward dot");
                } else {
                    ALogger.m15801d(previewActivityZoneWidget2.LIZ(), C0002O.m25086C("get messageId:", roomCreateInfo2.LJJIJLIJ));
                    if (roomCreateInfo2.LJJIJLIJ.length() == 0) {
                        ALogger.m15795w(previewActivityZoneWidget2.LIZ(), "empty messageId,skip show reward dot");
                    } else {
                        String LIZ = previewActivityZoneWidget2.LIZ();
                        C87308Kak<String> c87308Kak2 = AbstractC80293Hkt.f7146dO;
                        Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                        ALogger.m15801d(LIZ, C0002O.m25086C("get local LastMessageId:", c87308Kak2.LIZ()));
                        Intrinsics.checkNotNullExpressionValue(AbstractC80293Hkt.f7146dO, "");
                        if (!Intrinsics.areEqual(c87308Kak.LIZ(), roomCreateInfo2.LJJIJLIJ)) {
                            C87308Kak<String> c87308Kak3 = AbstractC80293Hkt.f7146dO;
                            Intrinsics.checkNotNullExpressionValue(c87308Kak3, "");
                            c87308Kak3.LIZ(roomCreateInfo2.LJJIJLIJ);
                            View view3 = previewActivityZoneWidget2.contentView;
                            Intrinsics.checkNotNullExpressionValue(view3, "");
                            TextView textView2 = (TextView) view3.findViewById(2131193080);
                            if (textView2 != null) {
                                LK1.LIZJ(textView2);
                            }
                            C4574547f.LIZ().LIZ("livesdk_anchor_awardtag_show", MapsKt__MapsKt.hashMapOf(TuplesKt.m137to("anchor_id", String.valueOf(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ()))), new Object[0]);
                            ALogger.m15801d(previewActivityZoneWidget2.LIZ(), C0002O.m25086C("show zone reward for messageId:", roomCreateInfo2.LJJIJLIJ));
                        }
                    }
                }
            }
            PreviewActivityZoneWidget previewActivityZoneWidget3 = this.this$0;
            if (roomCreateInfo2 != null && (kkr = roomCreateInfo2.LJJIIJZLJL) != null) {
                str2 = kkr.LJFF;
            }
            if (!PatchProxy.proxy(new Object[]{str2}, previewActivityZoneWidget3, PreviewActivityZoneWidget.LIZ, false, 6).isSupported) {
                ALogger.m15797i(previewActivityZoneWidget3.LIZ(), C0002O.m25086C("resolve bubble, ", str2));
                if (str2 != null && str2.length() != 0) {
                    JSONObject jSONObject = new JSONObject(str2);
                    String optString = jSONObject.optString("key");
                    String optString2 = jSONObject.optString("content");
                    if (optString != null && optString.length() != 0 && optString2 != null && optString2.length() != 0) {
                        C87308Kak c87308Kak4 = new C87308Kak(C0002O.m25086C("preview_activity_bubble_", optString), Boolean.FALSE);
                        T LIZ2 = c87308Kak4.LIZ();
                        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                        if (!((Boolean) LIZ2).booleanValue()) {
                            C6532d c6532d = new C6532d(optString2, null, null, 0, null, null, 1001, 0, null, 0, 958);
                            Context context = previewActivityZoneWidget3.context;
                            Intrinsics.checkNotNullExpressionValue(context, "");
                            ViewGroup viewGroup = previewActivityZoneWidget3.containerView;
                            Intrinsics.checkNotNullExpressionValue(viewGroup, "");
                            new C88300Kqk(context, viewGroup).LIZ(c6532d, (AbstractC6521s) new C86862KKq(previewActivityZoneWidget3), (AbstractC9164c) new C86861KKp(c87308Kak4));
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
