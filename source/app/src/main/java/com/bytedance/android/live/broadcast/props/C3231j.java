package com.bytedance.android.live.broadcast.props;

import android.content.Context;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.broadcast.api.AbstractC2891l;
import com.bytedance.android.live.broadcast.api.GamePromoteApi;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.gamedetail.audience.c$b;
import com.bytedance.android.live.broadcast.p267g.C3017a;
import com.bytedance.android.live.broadcast.p267g.C3018b;
import com.bytedance.android.live.broadcast.props.p278a.C3216a;
import com.bytedance.android.live.broadcast.props.p278a.C3217b;
import com.bytedance.android.live.broadcast.props.p278a.C3219d;
import com.bytedance.android.live.broadcast.props.p278a.C3221f;
import com.bytedance.android.live.broadcast.props.p278a.C3223h;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.jsbridge.event.C3952am;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler;
import com.bytedance.android.livesdk.widget.DialogC9362aa;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.eventbus.C9571d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC100834PnQ;
import p003X.AbstractC89174LBo;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C425332sJ;
import p003X.C438153Uz;
import p003X.C440033av;
import p003X.C87010KQi;
import p003X.C89160LBa;
import p003X.C89161LBb;
import p003X.C89163LBd;
import p003X.C89164LBe;
import p003X.C89168LBi;
import p003X.C89172LBm;
import p003X.LBY;
import p003X.QB4;

/* renamed from: com.bytedance.android.live.broadcast.props.j */
/* loaded from: classes5.dex */
public final class C3231j {
    public static ChangeQuickRedirect LIZ;
    public C3223h LIZJ;
    public long LIZLLL;

    /* renamed from: LJ */
    public final Context f25937LJ;
    public final AbstractC89174LBo LJFF;
    public final CompositeDisposable LJI;
    public final long LJII;
    public final long LJIIIIZZ;
    public final long LJIIIZ;
    public String LJIIJ;
    public final DialogC9362aa LJIIL;
    public final String LIZIZ = "PropDetailPresenter";
    public Long LJIIJJI = 0L;

    static {
        Covode.recordClassIndex(17661);
    }

    public final void LIZ(boolean z, C3217b c3217b) {
        C3221f c3221f;
        C3221f c3221f2;
        C2WC<Boolean> LIZJ;
        Boolean LIZ2;
        int i = 2;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c3217b}, this, LIZ, false, 8).isSupported) {
            return;
        }
        if (z) {
            C87010KQi.LIZ().LIZ(new C3018b());
            C87010KQi.LIZ().LIZ(new c$b());
            C87010KQi.LIZ().LIZ(new C3017a());
            C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
            if (LIZ3 != null && (LIZJ = LIZ3.LIZJ()) != null && (LIZ2 = LIZJ.LIZ()) != null && !LIZ2.booleanValue()) {
                C9571d c9571d = new C9571d(1);
                c9571d.f28186LJ = 0;
                C87010KQi.LIZ().LIZ(c9571d);
            }
            Observable<C3952am> observeOn = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).registerJsEventSubscriber("ticket_buy_result_jump_room").observeOn(AndroidSchedulers.mainThread());
            Intrinsics.checkNotNullExpressionValue(observeOn, "");
            QB4.LIZ(observeOn, new PropDetailPresenter$onQueryOrderStatusResult$1(this));
            Observable<C3952am> observeOn2 = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).registerJsEventSubscriber("ticket_buy_result_close").observeOn(AndroidSchedulers.mainThread());
            Intrinsics.checkNotNullExpressionValue(observeOn2, "");
            QB4.LIZ(observeOn2, new PropDetailPresenter$onQueryOrderStatusResult$2(this));
            Observable<C3952am> observeOn3 = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).registerJsEventSubscriber("ticket_order_detail_close").observeOn(AndroidSchedulers.mainThread());
            Intrinsics.checkNotNullExpressionValue(observeOn3, "");
            QB4.LIZ(observeOn3, new PropDetailPresenter$onQueryOrderStatusResult$3(this));
            ILiveActionHandler iLiveActionHandler = (ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class);
            if (iLiveActionHandler != null) {
                iLiveActionHandler.handle(this.f25937LJ, c3217b.LJFF);
            }
            AbstractC89174LBo abstractC89174LBo = this.LJFF;
            if (abstractC89174LBo != null) {
                abstractC89174LBo.LIZIZ();
            }
        } else {
            ILiveActionHandler iLiveActionHandler2 = (ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class);
            if (iLiveActionHandler2 != null) {
                iLiveActionHandler2.handle(this.f25937LJ, c3217b.LJI);
            }
        }
        C440033av c440033av = C440033av.LIZIZ;
        JSONObject jSONObject = new JSONObject();
        C3223h c3223h = this.LIZJ;
        Object obj = null;
        jSONObject.put("game_id", c3223h != null ? c3223h.LIZ : null);
        C3223h c3223h2 = this.LIZJ;
        jSONObject.put("game_name", c3223h2 != null ? c3223h2.LIZIZ : null);
        C3223h c3223h3 = this.LIZJ;
        jSONObject.put("prop_id", (c3223h3 == null || (c3221f2 = c3223h3.f25934LJ) == null) ? null : c3221f2.LIZ);
        C3223h c3223h4 = this.LIZJ;
        if (c3223h4 != null && (c3221f = c3223h4.f25934LJ) != null) {
            obj = c3221f.LIZJ;
        }
        jSONObject.put("prop_name", obj);
        if (z) {
            i = 1;
        }
        jSONObject.put("jump_type", i);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("jump_link", z ? c3217b.LJFF : c3217b.LJI);
        C440033av.LIZ(c440033av, 1334, jSONObject, jSONObject2, null, 8, null);
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        C116971W2r.LIZJ(this.LJIIL);
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        C116971W2r.LIZ(this.LJIIL);
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        long j = this.LJII;
        if (j != 1 && j != 3) {
            SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_GAME_PROMOTE_ADD_PLAYER_LIST_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            if (!Intrinsics.areEqual(settingKey.getValue(), Boolean.FALSE) && C438153Uz.LIZIZ().getInt("live.pref.SHOW_PLAYER_RANK_SETTING_PROP_DIALOG", 1) == 1) {
                C438153Uz.LIZ().putInt("live.pref.SHOW_PLAYER_RANK_SETTING_PROP_DIALOG", 0).apply();
                IService service = ServiceManager.getService(IBroadcastService.class);
                Intrinsics.checkNotNullExpressionValue(service, "");
                AbstractC2891l gamePromoteService = ((IBroadcastService) service).getGamePromoteService();
                if (gamePromoteService != null) {
                    gamePromoteService.LIZ("live_prop", new C89172LBm(this));
                }
            }
        }
    }

    /* renamed from: LJ */
    public final JSONObject m15887LJ() {
        String str;
        String str2;
        String str3;
        C3221f c3221f;
        C3221f c3221f2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        C3223h c3223h = this.LIZJ;
        String str4 = null;
        if (c3223h != null) {
            str = c3223h.LIZ;
        } else {
            str = null;
        }
        jSONObject.put("game_id", str);
        C3223h c3223h2 = this.LIZJ;
        if (c3223h2 != null) {
            str2 = c3223h2.LIZIZ;
        } else {
            str2 = null;
        }
        jSONObject.put("game_name", str2);
        C3223h c3223h3 = this.LIZJ;
        if (c3223h3 != null && (c3221f2 = c3223h3.f25934LJ) != null) {
            str3 = c3221f2.LIZ;
        } else {
            str3 = null;
        }
        jSONObject.put("prop_id", str3);
        C3223h c3223h4 = this.LIZJ;
        if (c3223h4 != null && (c3221f = c3223h4.f25934LJ) != null) {
            str4 = c3221f.LIZJ;
        }
        jSONObject.put("prod_name", str4);
        return jSONObject;
    }

    public final void LIZ() {
        Room room;
        Long l;
        Long l2;
        Disposable subscribe;
        C3221f c3221f;
        C3221f c3221f2;
        C2WC<Room> LIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        LIZJ();
        C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        Long l3 = null;
        if (LIZ3 != null && (LIZ2 = LIZ3.LIZ()) != null) {
            room = LIZ2.LIZ();
        } else {
            room = null;
        }
        GamePromoteApi gamePromoteApi = (GamePromoteApi) C425332sJ.LIZIZ.LIZ(GamePromoteApi.class);
        Long valueOf = Long.valueOf(this.LJIIIIZZ);
        C3223h c3223h = this.LIZJ;
        if (c3223h != null && (c3221f2 = c3223h.f25934LJ) != null) {
            l = c3221f2.LIZIZ;
        } else {
            l = null;
        }
        if (room != null) {
            l2 = Long.valueOf(room.getRoomId());
        } else {
            l2 = null;
        }
        C3223h c3223h2 = this.LIZJ;
        if (c3223h2 != null && (c3221f = c3223h2.f25934LJ) != null) {
            l3 = c3221f.LJIIL;
        }
        Observable<AbstractC100834PnQ<C3217b>> observeOn = gamePromoteApi.buyGoods(valueOf, l, l2, 1L, l3, Long.valueOf(this.LJIIIZ), this.LJIIJ, this.LJIIJJI).observeOn(AndroidSchedulers.mainThread());
        if (observeOn != null && (subscribe = observeOn.subscribe(new C89161LBb(this, room), new C89160LBa(this, room))) != null) {
            QB4.LIZ(subscribe, this.LJI);
        }
    }

    private final Map<String, String> LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 17);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        HashMap hashMap = new HashMap();
        if (str == null) {
            return hashMap;
        }
        JSONObject jSONObject = new JSONObject(str);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            String optString = jSONObject.optString(next);
            Intrinsics.checkNotNullExpressionValue(optString, "");
            hashMap.put(next, optString);
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0074, code lost:
        if (r9.intValue() != 2) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(com.bytedance.android.live.broadcast.props.p278a.C3217b r17) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.props.C3231j.LIZ(com.bytedance.android.live.broadcast.props.a.b):void");
    }

    public final void LIZ(String str, Long l) {
        this.LJIIJ = str;
        this.LJIIJJI = l;
    }

    public final void LIZ(String str, String str2) {
        Room room;
        Disposable subscribe;
        C2WC<Room> LIZ2;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZLLL = System.currentTimeMillis();
        C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        Long l = null;
        if (LIZ3 != null && (LIZ2 = LIZ3.LIZ()) != null) {
            room = LIZ2.LIZ();
        } else {
            room = null;
        }
        GamePromoteApi gamePromoteApi = (GamePromoteApi) C425332sJ.LIZIZ.LIZ(GamePromoteApi.class);
        Long valueOf = Long.valueOf(this.LJIIIIZZ);
        if (room != null) {
            l = Long.valueOf(room.getRoomId());
        }
        Observable<AbstractC100834PnQ<C3223h>> observeOn = gamePromoteApi.getPropDetail(valueOf, str, l, str2, Long.valueOf(this.LJII)).observeOn(AndroidSchedulers.mainThread());
        if (observeOn != null && (subscribe = observeOn.subscribe(new C89168LBi(this), new LBY(this, str2, str))) != null) {
            QB4.LIZ(subscribe, this.LJI);
        }
    }

    public final void LIZ(C3219d c3219d, Boolean bool, String str) {
        Disposable subscribe;
        if (PatchProxy.proxy(new Object[]{c3219d, bool, str}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3219d);
        LIZJ();
        Observable<AbstractC100834PnQ<C3216a>> observeOn = ((GamePromoteApi) C425332sJ.LIZIZ.LIZ(GamePromoteApi.class)).bindAccountInfo(c3219d.LIZ, c3219d.LIZIZ, c3219d.LIZJ, c3219d.LJFF, c3219d.LIZLLL, c3219d.f25932LJ, c3219d.LJI, str).observeOn(AndroidSchedulers.mainThread());
        if (observeOn != null && (subscribe = observeOn.subscribe(new C89164LBe(this, c3219d, bool), new C89163LBd(this, c3219d))) != null) {
            QB4.LIZ(subscribe, this.LJI);
        }
    }

    public C3231j(Context context, AbstractC89174LBo abstractC89174LBo, DialogC9362aa dialogC9362aa, CompositeDisposable compositeDisposable, long j, long j2, long j3) {
        C106862S5w.LIZ(context, dialogC9362aa, compositeDisposable);
        this.f25937LJ = context;
        this.LJFF = abstractC89174LBo;
        this.LJIIL = dialogC9362aa;
        this.LJI = compositeDisposable;
        this.LJII = j;
        this.LJIIIIZZ = j2;
        this.LJIIIZ = j3;
    }
}
