package com.bytedance.android.live.broadcastgame.openplatform.miniapp.service;

import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcastgame.api.model.C3371aa;
import com.bytedance.android.live.broadcastgame.api.p282a.C3328d;
import com.bytedance.android.live.broadcastgame.opengame.message.C3515al;
import com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3662k;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.C3795b;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.C3797m;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.message.model.C8733af;
import com.bytedance.android.livesdk.message.model.C8906gu;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bdp.live.livecontainer.base.schema.LiveSchemaInfo;
import com.bytedance.bdp.live.livecontainer.miniapp.PageConfig;
import com.bytedance.bdp.live.livecontainer.miniapp.PageStatus;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.minigame.appbase.base.event.BdpAppEventConstant;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC87170KWm;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C37E;
import p003X.C409882Kg;
import p003X.C413202Xa;
import p003X.C423702pg;
import p003X.C4306532d;
import p003X.C4317436i;
import p003X.C4574547f;
import p003X.C87010KQi;
import p003X.C87549Ked;
import p003X.C87767Ki9;
import p003X.C87806Kim;
import p003X.C87807Kin;
import p003X.C87890Kk8;
import p003X.C87911KkT;
import p003X.C88335KrJ;

/* loaded from: classes5.dex */
public final class AudienceMiniCardService extends MiniCardService implements Observer<KVData>, AbstractC3662k {
    public static ChangeQuickRedirect LIZ;
    public static final C87807Kin LIZLLL = new C87807Kin((byte) 0);
    public final Room LIZJ;

    /* renamed from: LJ */
    public Disposable f26113LJ;
    public String LJFF;
    public final Lazy LJI;
    public C3682x LJII;
    public final /* synthetic */ C87549Ked LJIIIZ = new C87549Ked();
    public final DataCenter LIZIZ = LJIIJJI().f26082LJ;

    static {
        Covode.recordClassIndex(21803);
    }

    private void LIZ(Disposable disposable) {
        if (PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 18).isSupported) {
            return;
        }
        C106862S5w.LIZ(disposable);
        this.LJIIIZ.LIZ(disposable);
    }

    public final C3795b LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3795b) (proxy.isSupported ? proxy.result : this.LJI.mo27335getValue());
    }

    @Override // com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.MiniCardService
    public final C3682x LJIIJJI() {
        return this.LJII;
    }

    @Override // com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.MiniCardService
    public final PageConfig LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (PageConfig) proxy.result;
        }
        return new PageConfig(PageStatus.HIDE, false);
    }

    private final boolean LJIIIIZZ() {
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        DataCenter dataCenter = this.LIZIZ;
        if (dataCenter != null) {
            obj = dataCenter.get("cmd_commerce_ad_show", (String) Boolean.FALSE);
        } else {
            obj = null;
        }
        return Intrinsics.areEqual(obj, Boolean.TRUE);
    }

    @Override // com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.MiniCardService, com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    /* renamed from: LJ */
    public final void mo15832LJ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported && !PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported && !LJIIIIZZ()) {
            Object obj = LJIIJJI().LJIIIZ.get("mini_card_info");
            if (!(obj instanceof C8906gu)) {
                obj = null;
            }
            C8906gu c8906gu = (C8906gu) obj;
            if (c8906gu != null) {
                C413202Xa.LIZ().LIZ(ToolbarButton.OPEN_PLATFORM_MINI_APP, new C4317436i(c8906gu));
                if (!PatchProxy.proxy(new Object[]{this, c8906gu, (byte) 0, (byte) 0, 6, null}, null, LIZ, true, 9).isSupported) {
                    LIZ(c8906gu, false, false);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        C3795b LJII = LJII();
        if (!PatchProxy.proxy(new Object[0], LJII, C3795b.LIZ, false, 7).isSupported) {
            C3795b.LIZ(LJII, true, null, 2, null);
            LJII.LIZIZ = null;
            Disposable disposable = LJII.LIZJ;
            if (disposable != null) {
                disposable.dispose();
            }
        }
        Disposable disposable2 = this.f26113LJ;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            this.LJIIIZ.LIZ();
        }
        DataCenter dataCenter = this.LIZIZ;
        if (dataCenter != null) {
            dataCenter.removeObserver(this);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.MiniCardService
    public final String LJIIIZ() {
        String str;
        String m14930LJ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String str2 = this.LJFF;
        if (str2 == null) {
            str2 = LJIIJJI().LJIIIIZZ.LJIIL;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str2}, this, LIZ, false, 12);
        if (proxy2.isSupported) {
            return (String) proxy2.result;
        }
        LiveSchemaInfo LIZ2 = LiveSchemaInfo.LJII.LIZ(str2);
        if (LIZ2 != null) {
            str = LIZ2.LIZ("bdp_log");
        } else {
            str = null;
        }
        LiveSchemaInfo LIZ3 = new LiveSchemaInfo.C11515a(str2).LIZ(LIZIZ(str)).LIZ();
        if (LIZ3 == null || (m14930LJ = LIZ3.m14930LJ()) == null) {
            C87911KkT.LIZ(C87911KkT.LIZIZ, "schema result = null", null, 2, null);
            return str2;
        }
        return m14930LJ;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.AudienceMiniCardService$2 */
    /* loaded from: classes5.dex */
    public static final class C38662 extends Lambda implements Function1<C3797m, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21805);
        }

        public C38662() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C3797m c3797m) {
            C3797m c3797m2 = c3797m;
            if (!PatchProxy.proxy(new Object[]{c3797m2}, this, changeQuickRedirect, false, 1).isSupported) {
                String str = c3797m2.LIZ;
                if (str.hashCode() == 1127105834 && str.equals("countdown_time_out")) {
                    C3795b.LIZ(AudienceMiniCardService.this.LJII(), false, null, 3, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.MiniCardService, com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3662k
    public final void LIZ(Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(obj);
        if (obj instanceof C3515al) {
            C87767Ki9.LIZ().LIZ("AudienceMiniCardService_MiniCardMessage");
            C3515al c3515al = (C3515al) obj;
            LIZ(c3515al.LIZIZ, c3515al.LIZJ, c3515al.LIZLLL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceMiniCardService(C3682x c3682x) {
        super(c3682x);
        Room room;
        C106862S5w.LIZ(c3682x);
        this.LJII = c3682x;
        DataCenter dataCenter = this.LIZIZ;
        if (dataCenter != null) {
            room = C423702pg.LIZIZ(dataCenter);
        } else {
            room = null;
        }
        this.LIZJ = room;
        this.LJI = LazyKt__LazyJVMKt.lazy(new AudienceMiniCardService$audienceMiniCardHelper$2(this));
        Observable LIZ2 = C87010KQi.LIZ().LIZ(C3328d.class);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        LIZ(C87890Kk8.LIZ(LIZ2, new C38651()));
        Observable LIZ3 = C87010KQi.LIZ().LIZ(C3797m.class);
        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
        LIZ(C87890Kk8.LIZ(LIZ3, new C38662()));
    }

    private final JSONObject LIZIZ(String str) {
        JSONObject jSONObject;
        String str2 = "";
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        try {
            try {
                if (str == null) {
                    str = str2;
                }
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            Map<String, String> LIZ2 = C87890Kk8.LIZ(jSONObject);
            LIZLLL.LIZ(this.LIZJ, LIZ2);
            Pair[] pairArr = new Pair[2];
            pairArr[0] = TuplesKt.m137to("program_id", LJIIJJI().LJIIIIZZ.LJII);
            String LIZJ = LJIIJJI().LJIIIIZZ.LIZJ();
            if (LIZJ != null) {
                str2 = LIZJ;
            }
            pairArr[1] = TuplesKt.m137to("program_name", str2);
            LIZ2.putAll(MapsKt__MapsKt.mapOf(pairArr));
            return C87890Kk8.LIZ(LIZ2);
        } catch (Throwable unused2) {
            return new JSONObject();
        }
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        String key;
        Object obj;
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZ, false, 5).isSupported && kVData2 != null && (key = kVData2.getKey()) != null && key.hashCode() == 1579247770 && key.equals("cmd_commerce_ad_show")) {
            if (!LJIIIIZZ()) {
                DataCenter dataCenter = this.LIZIZ;
                if (dataCenter != null) {
                    obj = dataCenter.get("DATA_AUDIENCE_TRANSFORM_WIDGET_MORE_SHOW", (String) Boolean.FALSE);
                } else {
                    obj = null;
                }
                if (!Intrinsics.areEqual(obj, Boolean.TRUE)) {
                    return;
                }
            }
            C3795b.LIZ(LJII(), false, null, 3, null);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.AudienceMiniCardService$1 */
    /* loaded from: classes5.dex */
    public static final class C38651 extends Lambda implements Function1<C3328d, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21804);
        }

        public C38651() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C3328d c3328d) {
            String str;
            String str2;
            String str3;
            Object obj;
            C2WC<Boolean> LLFII;
            C2WD<C3371aa> LJJII;
            C3371aa LIZ;
            C2WD<C3371aa> LJJII2;
            C3371aa LIZ2;
            C3328d c3328d2 = c3328d;
            if (!PatchProxy.proxy(new Object[]{c3328d2}, this, changeQuickRedirect, false, 1).isSupported && Intrinsics.areEqual(c3328d2.LIZ, "from_toolbar")) {
                TrackMiniCardService trackMiniCardService = (TrackMiniCardService) AudienceMiniCardService.this.LJIIJJI().LIZ((Class<AbstractC3719c>) TrackMiniCardService.class);
                if (!PatchProxy.proxy(new Object[0], trackMiniCardService, TrackMiniCardService.LIZLLL, false, 20).isSupported) {
                    C4574547f LIZ3 = C4574547f.LIZ();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("source", "bottom_bar");
                    linkedHashMap.putAll(trackMiniCardService.LJII());
                    AudienceMiniCardService.LIZLLL.LIZ(trackMiniCardService.LJFF, linkedHashMap);
                    LIZ3.LIZ("livesdk_small_program_audience_icon_click", linkedHashMap, Room.class);
                    HashMap hashMap = new HashMap();
                    AbstractC87170KWm LIZ4 = AbstractC87170KWm.LJI.LIZ();
                    if (LIZ4 == null || (LJJII2 = LIZ4.LJJII()) == null || (LIZ2 = LJJII2.LIZ()) == null || (str = LIZ2.LIZJ) == null) {
                        str = "";
                    }
                    hashMap.put("mp_id", str);
                    AbstractC87170KWm LIZ5 = AbstractC87170KWm.LJI.LIZ();
                    if (LIZ5 == null || (LJJII = LIZ5.LJJII()) == null || (LIZ = LJJII.LIZ()) == null || (str2 = LIZ.LIZLLL) == null) {
                        str2 = "";
                    }
                    hashMap.put("mp_name", str2);
                    hashMap.put("launch_from", "live");
                    hashMap.put("location", "in_live_link");
                    hashMap.put("position", "live");
                    hashMap.put("_param_for_special", BdpAppEventConstant.MICRO_APP);
                    hashMap.put("scene", C88335KrJ.LIZ());
                    C5923dp LIZ6 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                    if (LIZ6 != null && (LLFII = LIZ6.LLFII()) != null && LLFII.LIZ().booleanValue()) {
                        str3 = "1";
                    } else {
                        str3 = "0";
                    }
                    hashMap.put("if_clear_mode", str3);
                    hashMap.put("entrance_form", "live");
                    hashMap.put("enter_position", "live_link");
                    hashMap.put("live_enter_method", C87806Kim.LIZIZ.LIZIZ());
                    hashMap.put("live_action_type", C87806Kim.LIZIZ.LIZJ());
                    hashMap.put("is_ad_channel", C4306532d.m24943LJ(trackMiniCardService.f26114LJ));
                    DataCenter dataCenter = trackMiniCardService.f26114LJ;
                    if (dataCenter != null && (obj = dataCenter.get("data_mini_app_log_extra", (String) null)) != null) {
                        hashMap.put("log_extra", obj);
                    }
                    C4574547f.LIZ().LIZ("mp_click", false, (Map<String, String>) hashMap, Room.class, C8668v.class);
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final void LIZ(C8906gu c8906gu, boolean z, boolean z2) {
        String str;
        Integer num;
        Integer num2;
        if (PatchProxy.proxy(new Object[]{c8906gu, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        if (c8906gu == null) {
            C3795b.LIZ(LJII(), false, null, 3, null);
            return;
        }
        C8733af c8733af = c8906gu.LIZJ;
        if (c8733af != null) {
            str = c8733af.LIZIZ;
        } else {
            str = null;
        }
        this.LJFF = str;
        C87911KkT c87911KkT = C87911KkT.LIZIZ;
        StringBuilder sb = new StringBuilder("cardService on StampMessage card status: ");
        C8733af c8733af2 = c8906gu.LIZJ;
        if (c8733af2 != null) {
            num = c8733af2.LIZ;
        } else {
            num = null;
        }
        sb.append(num);
        c87911KkT.LIZ(sb.toString(), "MiniAppCard");
        C8733af c8733af3 = c8906gu.LIZJ;
        if (c8733af3 != null) {
            num2 = c8733af3.LIZ;
        } else {
            num2 = null;
        }
        int LIZIZ = C37E.LIZIZ();
        if (num2 != null && num2.intValue() == LIZIZ) {
            LJII().LIZ(c8906gu.LIZJ, z, z2);
            return;
        }
        int LIZ2 = C37E.LIZ();
        if (num2 != null && num2.intValue() == LIZ2) {
            C3795b.LIZ(LJII(), false, null, 3, null);
            return;
        }
        int LIZJ = C37E.LIZJ();
        if (num2 != null && num2.intValue() == LIZJ) {
            C3795b.LIZ(LJII(), false, null, 3, null);
        }
    }
}
