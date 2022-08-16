package com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin;

import com.bytedance.android.live.broadcastgame.api.model.PageDataV2;
import com.bytedance.android.live.broadcastgame.api.p282a.C3330f;
import com.bytedance.android.live.broadcastgame.opengame.service.ReportService;
import com.bytedance.android.live.broadcastgame.opengame.service.TrackCommonService;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.TrackMiniCardService;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bdp.live.livecontainer.miniapp.MiniAppPluginEventManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.bridge.p1355js.delegate.JsBridgeDelegate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C4574547f;
import p003X.C521876jd;
import p003X.C87010KQi;
import p003X.C87659KgP;
import p003X.C87811Kir;
import p003X.C87823Kj3;
import p003X.C88440Kt0;
import p003X.KM9;

/* loaded from: classes5.dex */
public final class MiniAppPlugin$onEvent$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ JSONObject $event;
    public final /* synthetic */ C87823Kj3 this$0;

    static {
        Covode.recordClassIndex(21704);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppPlugin$onEvent$1(C87823Kj3 c87823Kj3, JSONObject jSONObject) {
        super(0);
        this.this$0 = c87823Kj3;
        this.$event = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        String optString;
        PageDataV2.C3362b c3362b;
        String str;
        String str2;
        boolean z;
        String str3;
        String str4;
        PageDataV2.C3362b c3362b2;
        AbstractC5436a abstractC5436a;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (optString = this.$event.optString(JsBridgeDelegate.TYPE_EVENT)) != null) {
            LiveMode liveMode = null;
            String str5 = "";
            switch (optString.hashCode()) {
                case -1965264643:
                    if (optString.equals("clickMore")) {
                        TrackCommonService trackCommonService = (TrackCommonService) this.this$0.LJIIJJI.LIZ((Class<AbstractC3719c>) TrackMiniCardService.class);
                        if (!PatchProxy.proxy(new Object[0], trackCommonService, TrackMiniCardService.LIZLLL, false, 12).isSupported) {
                            C4574547f LIZ = C4574547f.LIZ();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.putAll(trackCommonService.LJII());
                            trackCommonService.LIZIZ(linkedHashMap);
                            LIZ.LIZ("livesdk_live_small_program_more_click", linkedHashMap, Room.class);
                        }
                        TrackCommonService trackCommonService2 = (TrackCommonService) this.this$0.LJIIJJI.LIZ((Class<AbstractC3719c>) TrackMiniCardService.class);
                        if (!PatchProxy.proxy(new Object[0], trackCommonService2, TrackMiniCardService.LIZLLL, false, 13).isSupported) {
                            C4574547f LIZ2 = C4574547f.LIZ();
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            linkedHashMap2.putAll(trackCommonService2.LJII());
                            trackCommonService2.LIZIZ(linkedHashMap2);
                            LIZ2.LIZ("livesdk_live_small_program_more_panel_show", linkedHashMap2, Room.class);
                            break;
                        }
                    }
                    break;
                case -1957639083:
                    if (optString.equals("openSettingPage")) {
                        if (this.this$0.LIZ()) {
                            PageDataV2 LIZ3 = C87811Kir.LIZ();
                            if (LIZ3 != null && (c3362b = LIZ3.f26017LJ) != null && (str = c3362b.LIZIZ) != null) {
                                str5 = str;
                            }
                            this.this$0.LIZIZ(str5);
                            TrackCommonService trackCommonService3 = (TrackCommonService) this.this$0.LJIIJJI.LIZ((Class<AbstractC3719c>) TrackMiniCardService.class);
                            if (!PatchProxy.proxy(new Object[0], trackCommonService3, TrackMiniCardService.LIZLLL, false, 8).isSupported) {
                                C4574547f LIZ4 = C4574547f.LIZ();
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                linkedHashMap3.putAll(trackCommonService3.LJII());
                                LIZ4.LIZ("livesdk_live_small_program_more_panel_set_click", linkedHashMap3, Room.class);
                            }
                            C87811Kir.LIZLLL = C87811Kir.LIZ();
                            C87811Kir.LJI.LIZ(this.this$0.LJIIJJI.LIZLLL, this.this$0.LJIIJJI.LJIIIIZZ(), this.this$0.LJIIJJI.LJIIIIZZ.LJII, str5);
                            break;
                        } else {
                            C88440Kt0.LIZ("将此页添加到直播后才可设置");
                            break;
                        }
                    }
                    break;
                case -312511232:
                    if (optString.equals("unMount")) {
                        if (this.this$0.LJIIJJI.LJIIJJI) {
                            C87010KQi.LIZ().LIZ(new C3330f(null));
                        }
                        TrackCommonService trackCommonService4 = (TrackCommonService) this.this$0.LJIIJJI.LIZ((Class<AbstractC3719c>) TrackMiniCardService.class);
                        boolean z2 = !this.this$0.LJIIJJI.LJIIJJI ? 1 : 0;
                        long j = this.this$0.LJIIJJI.LJIIIIZZ.LIZIZ;
                        PageDataV2 LIZ5 = C87811Kir.LIZ();
                        if (LIZ5 == null || (c3362b2 = LIZ5.f26017LJ) == null || (str2 = c3362b2.LIZIZ) == null) {
                            str2 = str5;
                        }
                        PageDataV2 LIZ6 = C87811Kir.LIZ();
                        if (LIZ6 != null) {
                            z = LIZ6.LJIIJJI;
                        } else {
                            z = false;
                        }
                        byte b = z ? (byte) 1 : (byte) 0;
                        byte b2 = z ? (byte) 1 : (byte) 0;
                        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z2 ? (byte) 1 : (byte) 0), new Long(j), str2, Byte.valueOf(b)}, trackCommonService4, TrackMiniCardService.LIZLLL, false, 15).isSupported) {
                            C106862S5w.LIZ(str2);
                            C4574547f LIZ7 = C4574547f.LIZ();
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            linkedHashMap4.put("duration", String.valueOf(System.currentTimeMillis() - trackCommonService4.LIZIZ));
                            linkedHashMap4.putAll(trackCommonService4.LJII());
                            if (j != -1) {
                                str5 = String.valueOf(j);
                            }
                            linkedHashMap4.put("room_id", str5);
                            linkedHashMap4.put("anchor_id", String.valueOf(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ()));
                            if (z2) {
                                str3 = "in_live";
                            } else {
                                str3 = "before_live";
                            }
                            linkedHashMap4.put("live_status", str3);
                            linkedHashMap4.put("page_path", str2);
                            if (z) {
                                str4 = "1";
                            } else {
                                str4 = "0";
                            }
                            linkedHashMap4.put("is_auto", str4);
                            linkedHashMap4.put("close_source", "settings");
                            LIZ7.LIZ("livesdk_small_program_page_close", linkedHashMap4, Room.class);
                        }
                        C87811Kir.LJII();
                        C87659KgP.LIZ(this.this$0.LJIIJJI.LJI, null, false, false, 7, null);
                        C88440Kt0.LIZ(2131586318);
                        break;
                    }
                    break;
                case 472057516:
                    if (optString.equals("miniAppHide")) {
                        if (!this.this$0.LJIIJ) {
                            this.this$0.LJIIJJI.LJI.LIZJ();
                            if (this.this$0.LJIIJJI.LJIIJJI) {
                                MiniAppPluginEventManager.INSTANCE.removeCustomEventListener(this.this$0.LJIIJJI.LJIIIIZZ.LJII);
                                break;
                            }
                        } else {
                            AbstractC5436a abstractC5436a2 = this.this$0.LJIIJJI.LJIIL;
                            if (abstractC5436a2 != null) {
                                abstractC5436a2.LIZJ();
                                break;
                            }
                        }
                    }
                    break;
                case 472384615:
                    if (optString.equals("miniAppShow")) {
                        this.this$0.LJIIJJI.LJI.LIZJ((Map<String, String>) null);
                        Room LJIILIIL = this.this$0.LJIIJJI.LJIILIIL();
                        if (LJIILIIL != null) {
                            liveMode = LJIILIIL.getStreamType();
                        }
                        if (liveMode != LiveMode.SCREEN_RECORD && (abstractC5436a = this.this$0.LJIIJJI.LJIIL) != null) {
                            abstractC5436a.LIZIZ();
                            break;
                        }
                    }
                    break;
                case 902209485:
                    if (optString.equals("openReportPage")) {
                        String jSONObject = this.$event.optJSONObject("param").toString();
                        Intrinsics.checkNotNullExpressionValue(jSONObject, str5);
                        ((ReportService) this.this$0.LJIIJJI.LIZ((Class<AbstractC3719c>) ReportService.class)).LIZ((C521876jd) GsonProtectorUtils.fromJson(KM9.LIZ(), jSONObject, (Class<Object>) C521876jd.class));
                        break;
                    }
                    break;
            }
        }
        return Unit.INSTANCE;
    }
}
