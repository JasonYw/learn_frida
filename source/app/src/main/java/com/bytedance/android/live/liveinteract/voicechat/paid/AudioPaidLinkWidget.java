package com.bytedance.android.live.liveinteract.voicechat.paid;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.api.data.C4284f;
import com.bytedance.android.live.liveinteract.linkroomfight.core.C4492d;
import com.bytedance.android.live.liveinteract.p356e.AbstractC4408a;
import com.bytedance.android.live.liveinteract.plantform.api.LinkPaidLinkApi;
import com.bytedance.android.live.liveinteract.videotalk.battle.C4891b;
import com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e;
import com.bytedance.android.live.liveinteract.voicechat.fight.C5056a;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.event.C5984am;
import com.bytedance.android.livesdk.chatroom.model.interact.C6180u;
import com.bytedance.android.livesdk.chatroom.model.interact.NormalPaidLinkmicAddPriceStrategy;
import com.bytedance.android.livesdk.chatroom.p517u.AbstractC6302f;
import com.bytedance.android.livesdk.chatroom.p517u.AbstractC6303g;
import com.bytedance.android.livesdk.chatroom.p517u.C6305j;
import com.bytedance.android.livesdk.chatroom.p517u.C6306l;
import com.bytedance.android.livesdk.chatroom.p517u.C6307m;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.LinkmicProfitMessage;
import com.bytedance.android.livesdkapi.depend.model.live.LinkerDetail;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413392Xt;
import p003X.AbstractC416582eC;
import p003X.AbstractC4569445g;
import p003X.AbstractC78548Gxq;
import p003X.AbstractC80293Hkt;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C409882Kg;
import p003X.C78536Gxe;
import p003X.C78538Gxg;
import p003X.C78555Gxx;
import p003X.C78556Gxy;
import p003X.C78561Gy3;
import p003X.C78571GyD;
import p003X.C78577GyJ;
import p003X.C78581GyN;
import p003X.C78586GyS;
import p003X.C78589GyV;
import p003X.C78746H2m;
import p003X.C79046HEa;
import p003X.C79242HLo;
import p003X.C87308Kak;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.GYY;
import p003X.IQV;
import p003X.IQX;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class AudioPaidLinkWidget extends RoomWidget implements AbstractC4408a, b$a, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public long f26496LJ;
    public Integer LJFF;
    public boolean LJI;
    public Room LJII;
    public C78556Gxy LJIIIZ;
    public final CompositeDisposable LJIIIIZZ = new CompositeDisposable();
    public List<Long> LJIIJ = new ArrayList();

    static {
        Covode.recordClassIndex(31604);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final void LIZIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 19).isSupported) {
            return;
        }
        AbstractC416582eC.LIZ(this, th);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final String LJJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 18);
        return proxy.isSupported ? (String) proxy.result : AbstractC416582eC.LIZ(this);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 20).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4408a
    public final boolean LIZJ() {
        return this.LIZLLL;
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4408a
    public final long LIZLLL() {
        return this.f26496LJ;
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4408a
    public final boolean LJI() {
        return this.LJI;
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4408a
    public final boolean LIZ() {
        return this.LIZJ;
    }

    public AudioPaidLinkWidget() {
        C78746H2m.LJI.LIZ();
    }

    private final void LJII() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported && !this.LIZIZ) {
            C78536Gxe.LIZIZ(C78536Gxe.LIZJ, 0, null, 3, null);
        }
    }

    private final void LJIIIIZZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported && this.LIZIZ) {
            C78536Gxe.LIZ(C78536Gxe.LIZJ, 0, (Integer) null, 3, (Object) null);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4408a
    /* renamed from: LJ */
    public final void mo15642LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        this.LJIIJ.clear();
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4408a
    public final List<Long> LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        this.LJIIJ = C78538Gxg.LIZIZ.LIZ(this.LJIIJ);
        return this.LJIIJ;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onDestroy();
        if (LIZ()) {
            LJIIIIZZ();
            LJII();
        }
        this.LJIIIIZZ.dispose();
        this.LIZLLL = false;
        this.f26496LJ = 0L;
        this.LJIIJ.clear();
        C78538Gxg.LIZIZ.LIZ(0L);
        this.LIZJ = false;
        C5923dp LJJJI = LJJJI();
        Intrinsics.checkNotNull(LJJJI);
        LJJJI.LJLI().LIZ(null);
        this.dataCenter.put("data_paid_link_profile_show", Boolean.FALSE);
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4408a
    public final boolean LIZIZ() {
        List<Integer> list;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ;
        C6307m LIZIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 17);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ2 != null && (LJJZZIII = LIZ2.LJJZZIII()) != null && (LIZIZ = LJJZZIII.LIZIZ()) != null && (LIZIZ2 = LIZIZ.LIZIZ()) != null) {
            list = LIZIZ2.LIZJ;
        } else {
            list = null;
        }
        if (C78571GyD.LIZIZ(list)) {
            C88440Kt0.LIZ(2131585752);
            return false;
        } else if (C4891b.LIZJ.m23816LJ()) {
            C88440Kt0.LIZ(2131585753);
            return false;
        } else if (C5056a.LIZJ.LJFF()) {
            C88440Kt0.LIZ(LK5.LIZ(2131587993, LK5.LIZ(2131586743)));
            return false;
        } else if (!C4492d.LIZLLL.LIZJ()) {
            return true;
        } else {
            C88440Kt0.LIZ(LK5.LIZ(2131584975, LK5.LIZ(2131586743)));
            return false;
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        boolean z;
        List<Long> list;
        AbstractC413392Xt<AbstractC6303g> LJJLL;
        AbstractC6303g LIZIZ;
        Observable<C6306l> LIZIZ2;
        Disposable subscribe;
        List<Long> list2;
        AbstractC413392Xt<C6305j> LJJJJZ;
        C6305j LIZIZ3;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        Object obj = this.dataCenter.get("data_room", (String) new Room());
        Intrinsics.checkNotNullExpressionValue(obj, "");
        this.LJII = (Room) obj;
        Boolean bool = (Boolean) this.dataCenter.get("data_is_anchor");
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LIZIZ = z;
        this.LJIIIZ = new C78556Gxy();
        C78556Gxy c78556Gxy = this.LJIIIZ;
        if (c78556Gxy != null) {
            c78556Gxy.LIZ((b$a) this);
        }
        this.LJFF = C79242HLo.LJIIL();
        Pair LIZ2 = IQV.LIZ((Function0) AudioPaidLinkWidget$onCreate$pair$1.INSTANCE);
        ((C5077a) LIZ2.getFirst()).LIZ().LIZIZ(this);
        IQX.LIZ((C13491f) LIZ2.getFirst(), AbstractC78548Gxq.class);
        this.LJIIIIZZ.add((Disposable) LIZ2.getSecond());
        StringBuilder sb = new StringBuilder("room playModes = ");
        Room room = this.LJII;
        if (room == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        LinkerDetail linkerDetail = room.linkerDetail;
        if (linkerDetail != null) {
            list = linkerDetail.LIZIZ;
        } else {
            list = null;
        }
        sb.append(list);
        ALogger.m15797i("ttlive_link_video", sb.toString());
        Room room2 = this.LJII;
        if (room2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        LinkerDetail linkerDetail2 = room2.linkerDetail;
        if (linkerDetail2 != null && (list2 = linkerDetail2.LIZIZ) != null && list2.contains(11L)) {
            C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
            if (LIZ3 != null && (LJJJJZ = LIZ3.LJJJJZ()) != null && (LIZIZ3 = LJJJJZ.LIZIZ()) != null) {
                LIZIZ3.LIZIZ(11);
            }
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
                LinkPaidLinkApi linkPaidLinkApi = (LinkPaidLinkApi) C88306Kqq.LIZ().LIZ(LinkPaidLinkApi.class);
                Room room3 = this.LJII;
                if (room3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                Disposable subscribe2 = linkPaidLinkApi.getPlayModeInfo(room3.getId()).compose(C100839PnV.LIZJ()).subscribe(new C78555Gxx(this), GYY.LIZIZ);
                Intrinsics.checkNotNullExpressionValue(subscribe2, "");
                this.LJIIIIZZ.add(subscribe2);
            }
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_PAID_LINK_OPTIMIZE_GUEST_EXPERIMENT_OPEN;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue() && C4284f.LJIIIIZZ.LIZLLL().LIZLLL && !this.LIZIZ) {
            this.dataCenter.put("data_paid_link_profile_show", Boolean.TRUE);
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJJLL = LJJJI.LJJLL()) != null && (LIZIZ = LJJLL.LIZIZ()) != null && (LIZIZ2 = LIZIZ.LIZIZ()) != null && (subscribe = LIZIZ2.subscribe(new C78561Gy3(new AudioPaidLinkWidget$onCreate$1(this)))) != null) {
            this.LJIIIIZZ.add(subscribe);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4408a
    public final void LIZ(boolean z) {
        this.LJI = z;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.paid.b$a
    public final void LIZIZ(LinkmicProfitMessage linkmicProfitMessage) {
        if (PatchProxy.proxy(new Object[]{linkmicProfitMessage}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkmicProfitMessage);
        if (this.LIZJ) {
            LJII();
            LJIIIIZZ();
        }
        this.LIZJ = false;
        this.LIZLLL = false;
        this.f26496LJ = 0L;
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        Intrinsics.checkNotNull(LIZ2);
        C6305j LIZIZ = LIZ2.LJJJJZ().LIZIZ();
        Intrinsics.checkNotNull(LIZIZ);
        LIZIZ.LIZ(11);
        C78586GyS c78586GyS = linkmicProfitMessage.LJI;
        if (c78586GyS != null) {
            LIZ(c78586GyS.LIZ, c78586GyS.LIZIZ);
        }
        this.dataCenter.put("data_paid_link_profile_show", Boolean.FALSE);
        this.LJIIJ.clear();
        C78538Gxg.LIZIZ.LIZ(0L);
        if (!this.LIZIZ) {
            C88440Kt0.LIZ(2131585040);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.paid.b$a
    public final void LIZJ(LinkmicProfitMessage linkmicProfitMessage) {
        long j;
        C5077a LIZ2;
        C2WD<C6180u> LIZJ;
        C6180u c6180u;
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{linkmicProfitMessage}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkmicProfitMessage);
        C78581GyN c78581GyN = linkmicProfitMessage.LJII;
        if (c78581GyN == null) {
            return;
        }
        if (c78581GyN.LIZJ == null || ((c6180u = c78581GyN.LIZJ) != null && c6180u.LIZLLL == NormalPaidLinkmicAddPriceStrategy.Unkown.ordinal())) {
            z = false;
        }
        this.LIZLLL = z;
        C6180u c6180u2 = c78581GyN.LIZJ;
        if (c6180u2 != null && (LIZ2 = C5077a.LIZJ.LIZ()) != null && (LIZJ = LIZ2.LIZJ()) != null) {
            LIZJ.LIZ(c6180u2);
        }
        C6180u c6180u3 = c78581GyN.LIZJ;
        if (c6180u3 != null) {
            j = c6180u3.f26904LJ;
        } else {
            j = 0;
        }
        this.f26496LJ = j;
        Boolean bool = c78581GyN.LIZ;
        if (bool != null) {
            bool.booleanValue();
            Boolean bool2 = c78581GyN.LIZ;
            Intrinsics.checkNotNull(bool2);
            LIZ(Boolean.valueOf(bool2.booleanValue()), c78581GyN.LIZIZ);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.paid.b$a
    public final void LIZLLL(LinkmicProfitMessage linkmicProfitMessage) {
        C5077a LIZ2;
        C2WC<Boolean> LIZIZ;
        C5077a LIZ3;
        C2WC<Boolean> LIZIZ2;
        if (PatchProxy.proxy(new Object[]{linkmicProfitMessage}, this, LIZ, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkmicProfitMessage);
        C78589GyV c78589GyV = linkmicProfitMessage.LJIIL;
        if (c78589GyV != null) {
            if (!PatchProxy.proxy(new Object[]{new Long(c78589GyV.LIZ), new Long(c78589GyV.LIZIZ)}, this, LIZ, false, 11).isSupported) {
                if (this.LIZIZ) {
                    C79046HEa LIZ4 = C79046HEa.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                    if (LIZ4.LIZJ() && (LIZ3 = C5077a.LIZJ.LIZ()) != null && (LIZIZ2 = LIZ3.LIZIZ()) != null) {
                        LIZIZ2.LIZ(Boolean.TRUE);
                    }
                } else {
                    C79046HEa LIZ5 = C79046HEa.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                    if (LIZ5.LIZLLL() && (LIZ2 = C5077a.LIZJ.LIZ()) != null && (LIZIZ = LIZ2.LIZIZ()) != null) {
                        LIZIZ.LIZ(Boolean.TRUE);
                    }
                }
            }
            if (!this.LJIIJ.contains(Long.valueOf(c78589GyV.LIZ))) {
                this.LJIIJ.add(Long.valueOf(c78589GyV.LIZ));
                C78538Gxg c78538Gxg = C78538Gxg.LIZIZ;
                c78538Gxg.LIZ(c78538Gxg.LJIIL(), this.dataCenter);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.paid.b$a
    public final void LIZ(LinkmicProfitMessage linkmicProfitMessage) {
        long j;
        C5077a LIZ2;
        C2WD<C6180u> LIZJ;
        C6180u c6180u;
        AbstractC413392Xt<C6305j> LJJJJZ;
        C6305j LIZIZ;
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{linkmicProfitMessage}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkmicProfitMessage);
        C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ3 != null && (LJJJJZ = LIZ3.LJJJJZ()) != null && (LIZIZ = LJJJJZ.LIZIZ()) != null) {
            LIZIZ.LIZIZ(11);
        }
        if (linkmicProfitMessage.LJFF != null) {
            C78577GyJ c78577GyJ = linkmicProfitMessage.LJFF;
            Intrinsics.checkNotNull(c78577GyJ);
            C6180u c6180u2 = c78577GyJ.LIZ;
            if (c6180u2 != null) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported && this.LIZIZ) {
                    C78536Gxe.LIZ().LJFF();
                }
                this.LIZJ = true;
                C78577GyJ c78577GyJ2 = linkmicProfitMessage.LJFF;
                if (c78577GyJ2 != null) {
                    LIZ(c78577GyJ2.LIZIZ, c78577GyJ2.LIZJ);
                    if (c78577GyJ2.LIZ == null || ((c6180u = c78577GyJ2.LIZ) != null && c6180u.LIZLLL == NormalPaidLinkmicAddPriceStrategy.Unkown.ordinal())) {
                        z = false;
                    }
                    this.LIZLLL = z;
                    C6180u c6180u3 = c78577GyJ2.LIZ;
                    if (c6180u3 != null) {
                        j = c6180u3.f26904LJ;
                    } else {
                        j = 0;
                    }
                    this.f26496LJ = j;
                    C6180u c6180u4 = c78577GyJ2.LIZ;
                    if (c6180u4 != null && (LIZ2 = C5077a.LIZJ.LIZ()) != null && (LIZJ = LIZ2.LIZJ()) != null) {
                        LIZJ.LIZ(c6180u4);
                    }
                }
                C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7007ai;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                c87308Kak.LIZ(Boolean.TRUE);
                C87308Kak<Integer> c87308Kak2 = AbstractC80293Hkt.f7005ag;
                Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                c87308Kak2.LIZ(Integer.valueOf((int) c6180u2.LIZIZ));
                C87308Kak<Integer> c87308Kak3 = AbstractC80293Hkt.f7006ah;
                Intrinsics.checkNotNullExpressionValue(c87308Kak3, "");
                c87308Kak3.LIZ(Integer.valueOf((int) c6180u2.LIZJ));
                SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_PAID_LINK_OPTIMIZE_GUEST_EXPERIMENT_OPEN;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue() && C4284f.LJIIIIZZ.LIZLLL().LIZLLL && !this.LIZIZ) {
                    this.dataCenter.put("data_paid_link_profile_show", Boolean.TRUE);
                }
                if (!this.LIZIZ) {
                    C88440Kt0.LIZ(2131585044);
                }
            }
        }
    }

    private void LIZ(Boolean bool, String str) {
        if (PatchProxy.proxy(new Object[]{bool, str}, this, LIZ, false, 12).isSupported) {
            return;
        }
        Intrinsics.checkNotNull(bool);
        if (bool.booleanValue()) {
            C79046HEa LIZ2 = C79046HEa.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            if (LIZ2.LIZLLL()) {
                this.dataCenter.put("cmd_interact_state_change", new C5984am(9));
                AbstractC5015e LIZ3 = AbstractC5015e.LIZIZ.LIZ();
                if (LIZ3 != null) {
                    LIZ3.LJJI();
                }
                Intrinsics.checkNotNull(str);
                if (str.length() != 0) {
                    C88440Kt0.LIZ(str);
                }
            }
        }
    }
}
