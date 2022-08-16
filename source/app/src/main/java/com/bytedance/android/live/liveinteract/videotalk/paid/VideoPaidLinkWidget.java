package com.bytedance.android.live.liveinteract.videotalk.paid;

import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.api.data.C4284f;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p346c.c$b;
import com.bytedance.android.live.liveinteract.doublepk.core.C4398a;
import com.bytedance.android.live.liveinteract.linkroomfight.core.C4492d;
import com.bytedance.android.live.liveinteract.p356e.AbstractC4410g;
import com.bytedance.android.live.liveinteract.plantform.api.LinkPaidLinkApi;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah;
import com.bytedance.android.live.liveinteract.videotalk.battle.C4891b;
import com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m;
import com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.C4949a;
import com.bytedance.android.live.liveinteract.voicechat.fight.C5056a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.model.interact.C6180u;
import com.bytedance.android.livesdk.chatroom.model.interact.NormalPaidLinkmicAddPriceStrategy;
import com.bytedance.android.livesdk.chatroom.p517u.AbstractC6302f;
import com.bytedance.android.livesdk.chatroom.p517u.C6305j;
import com.bytedance.android.livesdk.chatroom.p517u.C6307m;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.ktvapi.IKtvService;
import com.bytedance.android.livesdk.message.model.LinkMicGuideMessage;
import com.bytedance.android.livesdk.message.model.LinkmicProfitMessage;
import com.bytedance.android.livesdk.message.model.NormalPaidLinkmicOpenSource;
import com.bytedance.android.livesdkapi.depend.model.live.LinkerDetail;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.live.datacontext.C13491f;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413392Xt;
import p003X.AbstractC416582eC;
import p003X.AbstractC4569445g;
import p003X.AbstractC77996Gow;
import p003X.AbstractC78550Gxs;
import p003X.AbstractC80293Hkt;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C409882Kg;
import p003X.C419012i7;
import p003X.C77018GYa;
import p003X.C78320GuA;
import p003X.C78531GxZ;
import p003X.C78536Gxe;
import p003X.C78538Gxg;
import p003X.C78552Gxu;
import p003X.C78554Gxw;
import p003X.C78559Gy1;
import p003X.C78560Gy2;
import p003X.C78571GyD;
import p003X.C78577GyJ;
import p003X.C78581GyN;
import p003X.C78586GyS;
import p003X.C78589GyV;
import p003X.C78746H2m;
import p003X.C78999HCf;
import p003X.C79046HEa;
import p003X.C79242HLo;
import p003X.C87308Kak;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.DialogInterface$OnClickListenerC77905GnT;
import p003X.DialogInterface$OnClickListenerC78558Gy0;
import p003X.IQV;
import p003X.IQX;
import p003X.LK5;
import p003X.QB4;

/* loaded from: classes3.dex */
public final class VideoPaidLinkWidget extends RoomWidget implements c$b, AbstractC4410g, b$a, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public long f26445LJ;
    public Integer LJFF;
    public int LJI;
    public Room LJIIIZ;
    public C78554Gxw LJIIL;
    public boolean LJIILJJIL;
    public static final C78559Gy1 LJIIIIZZ = new C78559Gy1((byte) 0);
    public static final long LJII = 1;
    public final CompositeDisposable LJIIJ = new CompositeDisposable();
    public final C78746H2m LJIIJJI = C78746H2m.LJI.LIZ();
    public List<Long> LJIILIIL = new ArrayList();

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.p346c.c$b
    public final void LIZ(long j) {
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final void LIZIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 28).isSupported) {
            return;
        }
        AbstractC416582eC.LIZ(this, th);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final String LJJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 27);
        return proxy.isSupported ? (String) proxy.result : AbstractC416582eC.LIZ(this);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 29).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4410g
    public final boolean LIZJ() {
        return this.LIZLLL;
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4410g
    public final long LIZLLL() {
        return this.f26445LJ;
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4410g
    public final boolean LJII() {
        return this.LJIILJJIL;
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4410g
    public final boolean LIZ() {
        return this.LIZJ;
    }

    static {
        Covode.recordClassIndex(30312);
    }

    private final void LJIIJJI() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported && !this.LIZIZ) {
            C78536Gxe.LIZIZ(C78536Gxe.LIZJ, 0, null, 3, null);
        }
    }

    private final void LJIIL() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported && this.LIZIZ) {
            C78536Gxe.LIZ(C78536Gxe.LIZJ, 0, (Integer) null, 3, (Object) null);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4410g
    /* renamed from: LJ */
    public final void mo15685LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        this.LJIILIIL.clear();
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4410g
    public final List<Long> LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        this.LJIILIIL = C78538Gxg.LIZIZ.LIZ(this.LJIILIIL);
        return this.LJIILIIL;
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4410g
    public final boolean LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 25);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C78538Gxg.LJII();
    }

    public final void LJIIIZ() {
        AbstractC4964m LJIIIIZZ2;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported && C78538Gxg.LJI() && (LJIIIIZZ2 = LJIIIIZZ()) != null) {
            LJIIIIZZ2.LJIILJJIL();
        }
    }

    private final boolean LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LIZIZ) {
            return false;
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_PAID_LINK_OPTIMIZE_GUEST_EXPERIMENT_OPEN;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (!value.booleanValue()) {
            return false;
        }
        return true;
    }

    public final AbstractC4964m LJIIIIZZ() {
        AbstractC4964m ae_;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (AbstractC4964m) proxy.result;
        }
        AbstractC4767ah LIZ2 = AbstractC4767ah.LIZIZ.LIZ();
        if (LIZ2 == null || (ae_ = LIZ2.ae_()) == null) {
            AbstractC4766ag LIZ3 = AbstractC4766ag.LIZ.LIZ();
            if (LIZ3 != null) {
                return LIZ3.LJIIJJI();
            }
            return null;
        }
        return ae_;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        super.onDestroy();
        if (this.LIZJ) {
            LJIIL();
            LJIIJJI();
        }
        this.LIZJ = false;
        this.LIZLLL = false;
        this.f26445LJ = 0L;
        this.LJIILIIL.clear();
        C78538Gxg.LIZIZ.LIZ(0L);
        C78746H2m c78746H2m = this.LJIIJJI;
        if (c78746H2m != null) {
            c78746H2m.LIZIZ(this);
        }
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("data_paid_link_profile_show", Boolean.FALSE);
        }
        C78554Gxw c78554Gxw = this.LJIIL;
        if (c78554Gxw != null) {
            c78554Gxw.LIZJ();
        }
        this.LJIIL = null;
        this.LJIIJ.clear();
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4410g
    public final boolean LIZIZ() {
        List<Integer> list;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ;
        C6307m LIZIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 26);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (C4949a.f26454LJ.LIZLLL()) {
            C88440Kt0.LIZ(LK5.LIZ(2131587641, LK5.LIZ(2131586743)));
            return false;
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
        } else if (((IKtvService) ServiceManager.getService(IKtvService.class)).isKtvChallengeModeOpen()) {
            C88440Kt0.LIZ(2131585754);
            return false;
        } else if (C5056a.LIZJ.LJFF()) {
            C88440Kt0.LIZ(LK5.LIZ(2131587993, LK5.LIZ(2131586743)));
            return false;
        } else if (C4492d.LIZLLL.LIZJ()) {
            C88440Kt0.LIZ(LK5.LIZ(2131584975, LK5.LIZ(2131586743)));
            return false;
        } else if (!C4398a.LIZJ.LIZJ()) {
            return true;
        } else {
            C88440Kt0.LIZ(LK5.LIZ(2131582950, LK5.LIZ(2131586743)));
            return false;
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        boolean z;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ;
        Observable<C6307m> mo15536LJ;
        Disposable subscribe;
        List<Long> list;
        DataCenter dataCenter;
        List<Long> list2;
        AbstractC413392Xt<C6305j> LJJJJZ;
        C6305j LIZIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onCreate();
        Object obj = this.dataCenter.get("data_room", (String) new Room());
        Intrinsics.checkNotNullExpressionValue(obj, "");
        this.LJIIIZ = (Room) obj;
        Boolean bool = (Boolean) this.dataCenter.get("data_is_anchor");
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LIZIZ = z;
        this.LJIIL = new C78554Gxw();
        C78554Gxw c78554Gxw = this.LJIIL;
        if (c78554Gxw != null) {
            c78554Gxw.LIZ((b$a) this);
        }
        this.LJFF = C79242HLo.LJIIL();
        this.LJI = C79242HLo.LJIIJ();
        Pair LIZ2 = IQV.LIZ((Function0) VideoPaidLinkWidget$onCreate$pair$1.INSTANCE);
        ((C4935a) LIZ2.getFirst()).LIZ().LIZIZ(this);
        IQX.LIZ((C13491f) LIZ2.getFirst(), AbstractC78550Gxs.class);
        this.LJIIJ.add((Disposable) LIZ2.getSecond());
        C78746H2m c78746H2m = this.LJIIJJI;
        if (c78746H2m != null) {
            c78746H2m.LIZ(this);
        }
        if (C4284f.LJIIIIZZ.LIZ()) {
            StringBuilder sb = new StringBuilder("room playModes = ");
            Room room = this.LJIIIZ;
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
            Room room2 = this.LJIIIZ;
            if (room2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LinkerDetail linkerDetail2 = room2.linkerDetail;
            if (linkerDetail2 != null && (list2 = linkerDetail2.LIZIZ) != null && list2.contains(11L)) {
                C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                if (LIZ3 != null && (LJJJJZ = LIZ3.LJJJJZ()) != null && (LIZIZ2 = LJJJJZ.LIZIZ()) != null) {
                    LIZIZ2.LIZIZ(11);
                }
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
                    LinkPaidLinkApi linkPaidLinkApi = (LinkPaidLinkApi) C88306Kqq.LIZ().LIZ(LinkPaidLinkApi.class);
                    Room room3 = this.LJIIIZ;
                    if (room3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    QB4.LIZ(linkPaidLinkApi.getPlayModeInfo(room3.getId()).compose(C100839PnV.LIZJ()).subscribe(new C78552Gxu(this), C77018GYa.LIZIZ), this.LJIIJ);
                }
            }
            Room room4 = this.LJIIIZ;
            if (room4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (C78571GyD.LIZIZ(room4) && C78531GxZ.LIZJ() && LJIIJ()) {
                DataCenter dataCenter2 = this.dataCenter;
                if (dataCenter2 != null) {
                    dataCenter2.put("data_paid_link_profile_show", Boolean.TRUE);
                }
            } else if (C78320GuA.LIZ() && LJIIJ() && !C78531GxZ.LIZJ() && (dataCenter = this.dataCenter) != null) {
                dataCenter.put("data_paid_link_profile_show", Boolean.TRUE);
            }
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJJZZIII = LJJJI.LJJZZIII()) != null && (LIZIZ = LJJZZIII.LIZIZ()) != null && (mo15536LJ = LIZIZ.mo15536LJ()) != null && (subscribe = mo15536LJ.subscribe(new C78560Gy2(new VideoPaidLinkWidget$onCreate$1(this)))) != null) {
            this.LJIIJ.add(subscribe);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4410g
    public final void LIZ(boolean z) {
        this.LJIILJJIL = z;
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.p346c.c$b
    public final void LIZ(Map<String, Long> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(map);
        AbstractC4964m LJIIIIZZ2 = LJIIIIZZ();
        if (LJIIIIZZ2 != null) {
            LJIIIIZZ2.LIZ(map);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.paid.b$a
    public final void LIZIZ(LinkmicProfitMessage linkmicProfitMessage) {
        AbstractC413392Xt<C6305j> LJJJJZ;
        C6305j LIZIZ;
        if (PatchProxy.proxy(new Object[]{linkmicProfitMessage}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkmicProfitMessage);
        if (this.LIZJ) {
            LJIIL();
            LJIIJJI();
        }
        this.LIZJ = false;
        this.LIZLLL = false;
        this.f26445LJ = 0L;
        C78586GyS c78586GyS = linkmicProfitMessage.LJI;
        if (c78586GyS != null) {
            LIZ(c78586GyS.LIZ, c78586GyS.LIZIZ);
        }
        AbstractC4964m LJIIIIZZ2 = LJIIIIZZ();
        if (LJIIIIZZ2 != null) {
            LJIIIIZZ2.LJIILL();
        }
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("data_paid_link_profile_show", Boolean.FALSE);
        }
        this.LJIILIIL.clear();
        C78538Gxg.LIZIZ.LIZ(0L);
        if (!this.LIZIZ) {
            C88440Kt0.LIZ(2131585040);
        }
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ2 != null && (LJJJJZ = LIZ2.LJJJJZ()) != null && (LIZIZ = LJJJJZ.LIZIZ()) != null) {
            LIZIZ.LIZ(11);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.paid.b$a
    public final void LIZJ(LinkmicProfitMessage linkmicProfitMessage) {
        long j;
        C2WD<C6180u> LIZJ;
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{linkmicProfitMessage}, this, LIZ, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkmicProfitMessage);
        C78581GyN c78581GyN = linkmicProfitMessage.LJII;
        if (c78581GyN != null) {
            C6180u c6180u = c78581GyN.LIZJ;
            if (c6180u != null && c6180u.LIZLLL == NormalPaidLinkmicAddPriceStrategy.Unkown.ordinal()) {
                z = false;
            }
            this.LIZLLL = z;
            C6180u c6180u2 = c78581GyN.LIZJ;
            if (c6180u2 != null) {
                j = c6180u2.f26904LJ;
            } else {
                j = 0;
            }
            this.f26445LJ = j;
            LIZ(c78581GyN.LIZ, c78581GyN.LIZIZ);
            C6180u c6180u3 = c78581GyN.LIZJ;
            if (c6180u3 != null) {
                C4935a LIZ2 = C4935a.LIZJ.LIZ();
                if (LIZ2 != null && (LIZJ = LIZ2.LIZJ()) != null) {
                    LIZJ.LIZ(c6180u3);
                }
                ALogger.m15801d("VideoPaidLinkWidget", "onNormalPaidLinkmicConfigUpdate, addPriceStrategy: " + c6180u3.LIZLLL + ", addPriceValue: " + c6180u3.f26904LJ + ", addPriceMultiple: " + c6180u3.LJFF);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.paid.b$a
    public final void LIZ(LinkMicGuideMessage linkMicGuideMessage) {
        LinkMicGuideMessage.C8712k c8712k;
        String str;
        if (PatchProxy.proxy(new Object[]{linkMicGuideMessage}, this, LIZ, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkMicGuideMessage);
        if (this.LIZIZ && (c8712k = linkMicGuideMessage.LJIIJ) != null && (str = c8712k.LIZ) != null && !TextUtils.isEmpty(str) && !PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 21).isSupported) {
            AbstractC77996Gow mo15264LJ = C419012i7.LIZ().LIZ(getContext(), 4).mo15264LJ(2131588186);
            mo15264LJ.LIZJ(str);
            mo15264LJ.LIZIZ(0, 2131586570, new DialogInterface$OnClickListenerC77905GnT(this)).LIZIZ(1, 2131582393, DialogInterface$OnClickListenerC78558Gy0.LIZIZ).LIZJ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.paid.b$a
    public final void LIZLLL(LinkmicProfitMessage linkmicProfitMessage) {
        C4935a LIZ2;
        C2WC<Boolean> LIZIZ;
        C4935a LIZ3;
        C2WC<Boolean> LIZIZ2;
        if (PatchProxy.proxy(new Object[]{linkmicProfitMessage}, this, LIZ, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkmicProfitMessage);
        C78589GyV c78589GyV = linkmicProfitMessage.LJIIL;
        if (c78589GyV != null) {
            if (!PatchProxy.proxy(new Object[]{new Long(c78589GyV.LIZ), new Long(c78589GyV.LIZIZ)}, this, LIZ, false, 15).isSupported) {
                if (this.LIZIZ) {
                    C79046HEa LIZ4 = C79046HEa.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                    if (LIZ4.LIZJ() && (LIZ3 = C4935a.LIZJ.LIZ()) != null && (LIZIZ2 = LIZ3.LIZIZ()) != null) {
                        LIZIZ2.LIZ(Boolean.TRUE);
                    }
                } else {
                    C79046HEa LIZ5 = C79046HEa.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                    if (LIZ5.LIZLLL() && (LIZ2 = C4935a.LIZJ.LIZ()) != null && (LIZIZ = LIZ2.LIZIZ()) != null) {
                        LIZIZ.LIZ(Boolean.TRUE);
                    }
                }
            }
            if (!this.LJIILIIL.contains(Long.valueOf(c78589GyV.LIZ))) {
                this.LJIILIIL.add(Long.valueOf(c78589GyV.LIZ));
                C78538Gxg c78538Gxg = C78538Gxg.LIZIZ;
                c78538Gxg.LIZ(c78538Gxg.LJIIL(), this.dataCenter);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.paid.b$a
    public final void LIZ(LinkmicProfitMessage linkmicProfitMessage) {
        C6180u c6180u;
        C2WD<C6180u> LIZJ;
        AbstractC413392Xt<C6305j> LJJJJZ;
        C6305j LIZIZ;
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{linkmicProfitMessage}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkmicProfitMessage);
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ2 != null && (LJJJJZ = LIZ2.LJJJJZ()) != null && (LIZIZ = LJJJJZ.LIZIZ()) != null) {
            LIZIZ.LIZIZ(11);
        }
        this.LIZJ = true;
        C78577GyJ c78577GyJ = linkmicProfitMessage.LJFF;
        if (c78577GyJ != null && (c6180u = c78577GyJ.LIZ) != null) {
            C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.f7005ag;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            c87308Kak.LIZ(Integer.valueOf((int) c6180u.LIZIZ));
            C87308Kak<Integer> c87308Kak2 = AbstractC80293Hkt.f7006ah;
            Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
            c87308Kak2.LIZ(Integer.valueOf((int) c6180u.LIZJ));
            if (c6180u.LIZLLL == NormalPaidLinkmicAddPriceStrategy.Unkown.ordinal()) {
                z = false;
            }
            this.LIZLLL = z;
            this.f26445LJ = c6180u.f26904LJ;
            C4935a LIZ3 = C4935a.LIZJ.LIZ();
            if (LIZ3 != null && (LIZJ = LIZ3.LIZJ()) != null) {
                LIZJ.LIZ(c6180u);
            }
            ALogger.m15801d("VideoPaidLinkWidget", "onNormalPaidLinkmicOpen, addPriceStrategy: " + c6180u.LIZLLL + ", addPriceValue: " + c6180u.f26904LJ + ", addPriceMultiple: " + c6180u.LJFF);
        }
        C78577GyJ c78577GyJ2 = linkmicProfitMessage.LJFF;
        if (c78577GyJ2 != null) {
            LIZ(c78577GyJ2.LIZIZ, c78577GyJ2.LIZJ);
            if (this.LIZIZ && c78577GyJ2.LIZLLL == NormalPaidLinkmicOpenSource.BID_TO_NORMAL.ordinal()) {
                C78536Gxe.LIZ(C78536Gxe.LIZJ, (String) null, (String) null, 3, (Object) null);
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported && this.LIZIZ) {
            C78536Gxe.LIZ().LJFF();
        }
        AbstractC4964m LJIIIIZZ2 = LJIIIIZZ();
        if (LJIIIIZZ2 != null) {
            LJIIIIZZ2.LJIILJJIL();
        }
        if (!this.LIZIZ) {
            C88440Kt0.LIZ(2131585044);
        }
    }

    private final void LIZ(Boolean bool, String str) {
        C78999HCf mo15671LJ;
        if (PatchProxy.proxy(new Object[]{bool, str}, this, LIZ, false, 23).isSupported) {
            return;
        }
        ALogger.m15797i("ttlive_link_paid", "onNormalPaidLinkmicConfigUpdate " + bool + LoggerUtil.BLANK_TAG + str);
        if (!this.LIZIZ) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                C79046HEa LIZ2 = C79046HEa.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                if (LIZ2.LIZLLL()) {
                    AbstractC4767ah LIZ3 = AbstractC4767ah.LIZIZ.LIZ();
                    if (LIZ3 != null && (mo15671LJ = LIZ3.mo15671LJ()) != null) {
                        mo15671LJ.LIZIZ("paid_change");
                    }
                    if (str != null && str.length() != 0) {
                        C88440Kt0.LIZ(str);
                    }
                }
            }
            AbstractC4767ah LIZ4 = AbstractC4767ah.LIZIZ.LIZ();
            if (LIZ4 != null) {
                LIZ4.LJFF();
            }
        }
    }
}
