package com.bytedance.android.live.liveinteract.interact.audience.paid;

import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.api.data.C4284f;
import com.bytedance.android.live.liveinteract.p356e.AbstractC4409d;
import com.bytedance.android.live.liveinteract.plantform.api.LinkPaidLinkApi;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4772f;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4773g;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.model.interact.C6180u;
import com.bytedance.android.livesdk.chatroom.model.interact.NormalPaidLinkmicAddPriceStrategy;
import com.bytedance.android.livesdk.chatroom.p517u.C6305j;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
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
import p003X.AbstractC77996Gow;
import p003X.AbstractC78549Gxr;
import p003X.AbstractC80293Hkt;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C409882Kg;
import p003X.C419012i7;
import p003X.C78320GuA;
import p003X.C78536Gxe;
import p003X.C78538Gxg;
import p003X.C78551Gxt;
import p003X.C78553Gxv;
import p003X.C78577GyJ;
import p003X.C78581GyN;
import p003X.C78586GyS;
import p003X.C78589GyV;
import p003X.C78999HCf;
import p003X.C79007HCn;
import p003X.C79046HEa;
import p003X.C87308Kak;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.DialogInterface$OnClickListenerC77557Ghr;
import p003X.DialogInterface$OnClickListenerC78557Gxz;
import p003X.GYZ;
import p003X.HEV;
import p003X.IQV;
import p003X.IQX;

/* loaded from: classes3.dex */
public final class InteractPaidLinkWidget extends RoomWidget implements AbstractC4409d, b$a, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public long f26323LJ;
    public ImageModel LJFF;
    public boolean LJI;
    public Room LJII;
    public C78553Gxv LJIIIIZZ;
    public final CompositeDisposable LJIIIZ = new CompositeDisposable();
    public List<Long> LJIIJ = new ArrayList();

    static {
        Covode.recordClassIndex(27393);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final void LIZIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 24).isSupported) {
            return;
        }
        AbstractC416582eC.LIZ(this, th);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final String LJJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 23);
        return proxy.isSupported ? (String) proxy.result : AbstractC416582eC.LIZ(this);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 25).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4409d
    public final boolean LIZIZ() {
        return this.LIZLLL;
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4409d
    public final long LIZJ() {
        return this.f26323LJ;
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4409d
    public final ImageModel LJFF() {
        return this.LJFF;
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4409d
    public final boolean LJI() {
        return this.LJI;
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4409d
    public final boolean LJIIIZ() {
        return this.LIZJ;
    }

    private final void LJIIJJI() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported && !this.LIZIZ) {
            C78536Gxe.LIZIZ(C78536Gxe.LIZJ, 0, null, 3, null);
        }
    }

    private final void LJIIL() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported && this.LIZIZ) {
            C78536Gxe.LIZ(C78536Gxe.LIZJ, 0, (Integer) null, 3, (Object) null);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4409d
    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LJIIJ.clear();
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4409d
    /* renamed from: LJ */
    public final List<Long> mo15734LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        this.LJIIJ = C78538Gxg.LIZIZ.LIZ(this.LJIIJ);
        return this.LJIIJ;
    }

    public final void LJIIIIZZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported && this.LIZIZ) {
            C78536Gxe.LIZ().LJFF();
        }
    }

    public final HEV LIZ() {
        HEV LJII;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (HEV) proxy.result;
        }
        AbstractC4773g LIZ2 = AbstractC4773g.LJIIJJI.LIZ();
        if (LIZ2 == null || (LJII = LIZ2.LJII()) == null) {
            AbstractC4772f LIZ3 = AbstractC4772f.LIZ.LIZ();
            if (LIZ3 != null) {
                return LIZ3.LJIIJ();
            }
            return null;
        }
        return LJII;
    }

    public final boolean LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!C4284f.LJIIIIZZ.LIZ()) {
            return false;
        }
        if (!this.LIZIZ) {
            SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_PAID_LINK_OPTIMIZE_GUEST_EXPERIMENT_OPEN;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (!value.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4409d
    public final boolean LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 22);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f6968W;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Boolean LIZ2 = c87308Kak.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        if (!LIZ2.booleanValue() || this.LIZJ) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        super.onDestroy();
        if (this.LIZJ) {
            LJIIL();
            LJIIJJI();
        } else if (C78320GuA.LIZ() && !this.LIZIZ) {
            C78536Gxe.LIZJ.m23799LJ();
        }
        this.LIZJ = false;
        this.LIZLLL = false;
        this.f26323LJ = 0L;
        this.LJIIJ.clear();
        C78538Gxg.LIZIZ.LIZ(0L);
        C78553Gxv c78553Gxv = this.LJIIIIZZ;
        if (c78553Gxv != null) {
            c78553Gxv.LIZJ();
        }
        this.LJIIIIZZ = null;
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("data_paid_link_profile_show", Boolean.FALSE);
        }
        this.LJIIIZ.clear();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        boolean z;
        List<Long> list;
        DataCenter dataCenter;
        List<Long> list2;
        AbstractC413392Xt<C6305j> LJJJJZ;
        C6305j LIZIZ;
        HEV LIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
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
        this.LJIIIIZZ = new C78553Gxv();
        C78553Gxv c78553Gxv = this.LJIIIIZZ;
        if (c78553Gxv != null) {
            c78553Gxv.LIZ((b$a) this);
        }
        C79007HCn.LJII();
        Pair LIZ3 = IQV.LIZ((Function0) InteractPaidLinkWidget$onCreate$pair$1.INSTANCE);
        ((C4441a) LIZ3.getFirst()).LIZ().LIZIZ(this);
        IQX.LIZ((C13491f) LIZ3.getFirst(), AbstractC78549Gxr.class);
        this.LJIIIZ.add((Disposable) LIZ3.getSecond());
        if (LJII() && C78538Gxg.LIZIZ() && (LIZ2 = LIZ()) != null) {
            LIZ2.LIZLLL(true);
        }
        if (C4284f.LJIIIIZZ.LIZ()) {
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
            ALogger.m15797i("ttlive_link_paid", sb.toString());
            Room room2 = this.LJII;
            if (room2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LinkerDetail linkerDetail2 = room2.linkerDetail;
            if (linkerDetail2 != null && (list2 = linkerDetail2.LIZIZ) != null && list2.contains(11L)) {
                C5923dp LIZ4 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                if (LIZ4 != null && (LJJJJZ = LIZ4.LJJJJZ()) != null && (LIZIZ = LJJJJZ.LIZIZ()) != null) {
                    LIZIZ.LIZIZ(11);
                }
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
                    LinkPaidLinkApi linkPaidLinkApi = (LinkPaidLinkApi) C88306Kqq.LIZ().LIZ(LinkPaidLinkApi.class);
                    Room room3 = this.LJII;
                    if (room3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    this.LJIIIZ.add(linkPaidLinkApi.getPlayModeInfo(room3.getId()).compose(C100839PnV.LIZJ()).subscribe(new C78551Gxt(this), GYZ.LIZIZ));
                }
            }
            if (C78320GuA.LIZ() && !this.LIZIZ) {
                SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_PAID_LINK_OPTIMIZE_GUEST_EXPERIMENT_OPEN;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue() && (dataCenter = this.dataCenter) != null) {
                    dataCenter.put("data_paid_link_profile_show", Boolean.TRUE);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4409d
    public final void LIZ(ImageModel imageModel) {
        this.LJFF = imageModel;
    }

    @Override // com.bytedance.android.live.liveinteract.p356e.AbstractC4409d
    public final void LIZ(boolean z) {
        this.LJI = z;
    }

    public final void LIZIZ(boolean z) {
        DataCenter dataCenter;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 21).isSupported && !z && (dataCenter = this.dataCenter) != null) {
            dataCenter.put("data_paid_link_profile_show", Boolean.FALSE);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.interact.audience.paid.b$a
    public final void LIZJ(LinkmicProfitMessage linkmicProfitMessage) {
        long j;
        C4441a LIZ2;
        C2WD<C6180u> LIZJ;
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{linkmicProfitMessage}, this, LIZ, false, 11).isSupported) {
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
            this.f26323LJ = j;
            LIZ(c78581GyN.LIZ, c78581GyN.LIZIZ);
            C6180u c6180u3 = c78581GyN.LIZJ;
            if (c6180u3 != null && (LIZ2 = C4441a.LIZJ.LIZ()) != null && (LIZJ = LIZ2.LIZJ()) != null) {
                LIZJ.LIZ(c6180u3);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.interact.audience.paid.b$a
    public final void LIZ(LinkMicGuideMessage linkMicGuideMessage) {
        LinkMicGuideMessage.C8712k c8712k;
        String str;
        if (PatchProxy.proxy(new Object[]{linkMicGuideMessage}, this, LIZ, false, 19).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkMicGuideMessage);
        if (this.LIZIZ && (c8712k = linkMicGuideMessage.LJIIJ) != null && (str = c8712k.LIZ) != null && !TextUtils.isEmpty(str) && !PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 20).isSupported) {
            AbstractC77996Gow mo15264LJ = C419012i7.LIZ().LIZ(getContext(), 4).mo15264LJ(2131588186);
            mo15264LJ.LIZJ(str);
            mo15264LJ.LIZIZ(0, 2131586570, new DialogInterface$OnClickListenerC77557Ghr(this)).LIZIZ(1, 2131582393, DialogInterface$OnClickListenerC78557Gxz.LIZIZ).LIZJ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.interact.audience.paid.b$a
    public final void LIZIZ(LinkmicProfitMessage linkmicProfitMessage) {
        AbstractC413392Xt<C6305j> LJJJJZ;
        C6305j LIZIZ;
        HEV LIZ2;
        if (PatchProxy.proxy(new Object[]{linkmicProfitMessage}, this, LIZ, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkmicProfitMessage);
        if (this.LIZJ) {
            LJIIJJI();
            LJIIL();
        }
        this.LIZJ = false;
        this.LIZLLL = false;
        this.f26323LJ = 0L;
        C78586GyS c78586GyS = linkmicProfitMessage.LJI;
        if (c78586GyS != null) {
            LIZ(c78586GyS.LIZ, c78586GyS.LIZIZ);
        }
        if (LJII() && (LIZ2 = LIZ()) != null) {
            LIZ2.LIZLLL(false);
        }
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("data_paid_link_profile_show", Boolean.FALSE);
        }
        this.LJIIJ.clear();
        C78538Gxg.LIZIZ.LIZ(0L);
        if (!this.LIZIZ) {
            C88440Kt0.LIZ(2131585040);
        }
        C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ3 != null && (LJJJJZ = LIZ3.LJJJJZ()) != null && (LIZIZ = LJJJJZ.LIZIZ()) != null) {
            LIZIZ.LIZ(11);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.interact.audience.paid.b$a
    public final void LIZLLL(LinkmicProfitMessage linkmicProfitMessage) {
        C4441a LIZ2;
        C2WC<Boolean> LIZIZ;
        C4441a LIZ3;
        C2WC<Boolean> LIZIZ2;
        if (PatchProxy.proxy(new Object[]{linkmicProfitMessage}, this, LIZ, false, 17).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkmicProfitMessage);
        C78589GyV c78589GyV = linkmicProfitMessage.LJIIL;
        if (c78589GyV != null) {
            if (!PatchProxy.proxy(new Object[]{new Long(c78589GyV.LIZ), new Long(c78589GyV.LIZIZ)}, this, LIZ, false, 18).isSupported) {
                if (this.LIZIZ) {
                    C79046HEa LIZ4 = C79046HEa.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                    if (LIZ4.LIZJ() && (LIZ3 = C4441a.LIZJ.LIZ()) != null && (LIZIZ2 = LIZ3.LIZIZ()) != null) {
                        LIZIZ2.LIZ(Boolean.TRUE);
                    }
                } else {
                    C79046HEa LIZ5 = C79046HEa.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                    if (LIZ5.LIZLLL() && (LIZ2 = C4441a.LIZJ.LIZ()) != null && (LIZIZ = LIZ2.LIZIZ()) != null) {
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

    @Override // com.bytedance.android.live.liveinteract.interact.audience.paid.b$a
    public final void LIZ(LinkmicProfitMessage linkmicProfitMessage) {
        HEV LIZ2;
        C6180u c6180u;
        C2WD<C6180u> LIZJ;
        AbstractC413392Xt<C6305j> LJJJJZ;
        C6305j LIZIZ;
        boolean z = false;
        if (PatchProxy.proxy(new Object[]{linkmicProfitMessage}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkmicProfitMessage);
        C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ3 != null && (LJJJJZ = LIZ3.LJJJJZ()) != null && (LIZIZ = LJJJJZ.LIZIZ()) != null) {
            LIZIZ.LIZIZ(11);
        }
        this.LIZJ = true;
        LJIIIIZZ();
        C78577GyJ c78577GyJ = linkmicProfitMessage.LJFF;
        if (c78577GyJ != null && (c6180u = c78577GyJ.LIZ) != null) {
            C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.f6969X;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            c87308Kak.LIZ(Integer.valueOf((int) c6180u.LIZIZ));
            C87308Kak<Integer> c87308Kak2 = AbstractC80293Hkt.f6970Y;
            Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
            c87308Kak2.LIZ(Integer.valueOf((int) c6180u.LIZJ));
            if (c6180u.LIZLLL != NormalPaidLinkmicAddPriceStrategy.Unkown.ordinal()) {
                z = true;
            }
            this.LIZLLL = z;
            this.f26323LJ = c6180u.f26904LJ;
            C4441a LIZ4 = C4441a.LIZJ.LIZ();
            if (LIZ4 != null && (LIZJ = LIZ4.LIZJ()) != null) {
                LIZJ.LIZ(c6180u);
            }
        }
        C78577GyJ c78577GyJ2 = linkmicProfitMessage.LJFF;
        if (c78577GyJ2 != null) {
            LIZ(c78577GyJ2.LIZIZ, c78577GyJ2.LIZJ);
            if (this.LIZIZ && c78577GyJ2.LIZLLL == NormalPaidLinkmicOpenSource.BID_TO_NORMAL.ordinal()) {
                C78536Gxe.LIZ(C78536Gxe.LIZJ, (String) null, (String) null, 3, (Object) null);
            }
        }
        if (LJII() && (LIZ2 = LIZ()) != null) {
            LIZ2.LIZLLL(true);
        }
        if (!this.LIZIZ) {
            C88440Kt0.LIZ(2131585044);
        }
    }

    private final void LIZ(Boolean bool, String str) {
        C78999HCf LJFF;
        if (PatchProxy.proxy(new Object[]{bool, str}, this, LIZ, false, 16).isSupported) {
            return;
        }
        ALogger.m15797i("ttlive_link_paid", "onNormalPaidLinkmicConfigUpdate " + bool + LoggerUtil.BLANK_TAG + str);
        if (!this.LIZIZ) {
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                C79046HEa LIZ2 = C79046HEa.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                if (LIZ2.LIZLLL()) {
                    AbstractC4773g LIZ3 = AbstractC4773g.LJIIJJI.LIZ();
                    if (LIZ3 != null && (LJFF = LIZ3.LJFF()) != null) {
                        LJFF.LIZIZ("paid_change");
                    }
                    if (str != null && str.length() != 0) {
                        C88440Kt0.LIZ(str);
                    }
                }
            }
            AbstractC4773g LIZ4 = AbstractC4773g.LJIIJJI.LIZ();
            if (LIZ4 != null) {
                LIZ4.LJIIIIZZ();
            }
        }
    }
}
