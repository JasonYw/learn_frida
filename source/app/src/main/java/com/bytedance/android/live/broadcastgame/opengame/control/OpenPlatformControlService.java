package com.bytedance.android.live.broadcastgame.opengame.control;

import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcastgame.api.openplatform.PluginType;
import com.bytedance.android.live.broadcastgame.opengame.message.AbstractC3512ag;
import com.bytedance.android.live.broadcastgame.opengame.message.ap$a;
import com.bytedance.android.live.broadcastgame.opengame.runtime.BootInfoService;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3657d;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3658f;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3717a;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3718b;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.wrds.p758a.C9416a;
import com.bytedance.android.livesdk.wrds.p758a.C9418b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC87785KiR;
import p003X.C102885QfP;
import p003X.C106862S5w;
import p003X.C3808516p;
import p003X.C387291Vj;
import p003X.C390501dE;
import p003X.C437933Ud;
import p003X.C443233g5;
import p003X.C87549Ked;
import p003X.C87659KgP;
import p003X.C87755Khx;
import p003X.C87768KiA;
import p003X.C87770KiC;
import p003X.C87771KiD;
import p003X.C87783KiP;
import p003X.C87784KiQ;
import p003X.C87786KiS;
import p003X.C87788KiU;
import p003X.C87911KkT;
import p003X.C90651LnZ;
import p003X.LK1;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class OpenPlatformControlService implements Observer<KVData>, AbstractC3717a, AbstractC3718b {
    public static ChangeQuickRedirect LIZ;
    public C9418b LIZIZ;
    public C9416a.C9417a LIZLLL;
    public C3682x LJIIJ;
    public static final C87788KiU LJIIIIZZ = new C87788KiU((byte) 0);
    public static final Map<Long, String> LJII = MapsKt__MapsKt.mapOf(TuplesKt.m137to(3L, "adult"), TuplesKt.m137to(2L, "teen_within_regulated_time"), TuplesKt.m137to(1L, ""));
    public final /* synthetic */ C87549Ked LJIIJJI = new C87549Ked();
    public C87784KiQ LIZJ = new C87786KiS(this, LJIIIIZZ().LJIILL());

    /* renamed from: LJ */
    public LinkedList<Pair<String, C9416a.C9417a>> f26052LJ = new LinkedList<>();
    public LinkedList<Pair<String, C9416a.C9417a>> LJFF = new LinkedList<>();
    public final Lazy LJIIIZ = LazyKt__LazyJVMKt.lazy(new OpenPlatformControlService$roomContext$2(this));
    public final C87755Khx LJI = new C87755Khx(this);

    private void LIZ(Disposable disposable) {
        if (PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 21).isSupported) {
            return;
        }
        C106862S5w.LIZ(disposable);
        this.LJIIJJI.LIZ(disposable);
    }

    private void LJIILIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
            return;
        }
        this.LJIIJJI.LIZ();
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(Map<String, String> map) {
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZLLL() {
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    /* renamed from: LJ */
    public final void mo15832LJ() {
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJI() {
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJII() {
    }

    public final C3682x LJIIIIZZ() {
        return this.LJIIJ;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        C387291Vj.LIZ(this);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJIIIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        C387291Vj.LIZIZ(this);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        C387291Vj.LIZJ(this);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJIIJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        C387291Vj.LIZLLL(this);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3610e
    public final void LJIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            return;
        }
        C387291Vj.m25034LJ(this);
    }

    public final void LIZ() {
        Pair<String, C9416a.C9417a> pop;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported && (!this.f26052LJ.isEmpty()) && (pop = this.f26052LJ.pop()) != null) {
            LIZ(pop.getFirst(), pop.getSecond());
        }
    }

    public final void LIZJ() {
        Integer num;
        String str;
        C87783KiP c87783KiP;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        C9416a.C9417a c9417a = this.LIZLLL;
        if (c9417a != null && (num = c9417a.LIZIZ) != null && num.intValue() == 3) {
            C9416a.C9417a c9417a2 = this.LIZLLL;
            if (c9417a2 == null || (c87783KiP = c9417a2.LIZJ) == null || (str = c87783KiP.LIZ()) == null) {
                str = LoggerUtil.UNKNOWN;
            }
            LIZIZ(str);
        }
        LIZ();
    }

    static {
        Covode.recordClassIndex(20004);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        C9418b c9418b = this.LIZIZ;
        if (c9418b != null) {
            c9418b.LIZIZ();
        }
        this.f26052LJ.clear();
        if (!this.LJFF.isEmpty()) {
            Iterator<T> it = this.LJFF.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                LIZ((String) pair.getFirst(), (C9416a.C9417a) pair.getSecond());
            }
        }
        this.LJFF.clear();
        DataCenter dataCenter = LJIIIIZZ().f26082LJ;
        if (dataCenter != null) {
            dataCenter.removeObserver(this);
        }
        LJIILIIL();
    }

    private final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 9).isSupported) {
            return;
        }
        if ((!Intrinsics.areEqual(str, "live_scene_limit")) && (true ^ Intrinsics.areEqual(str, "anchor_close"))) {
            C390501dE.f263LJ.LIZ(LJIIIIZZ().LJIIIIZZ.LJII, str, ((BootInfoService) LJIIIIZZ().LIZ((Class<AbstractC3719c>) BootInfoService.class)).LIZLLL());
        }
        C87659KgP.LIZ(LJIIIIZZ().LJI, str, false, false, 6, null);
        PluginType LJIILJJIL = LJIIIIZZ().LJIILJJIL();
        if (LJIILJJIL != null) {
            C87771KiD.LIZ.LIZ(LJIILJJIL, MapsKt__MapsKt.emptyMap());
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        C9418b c9418b = this.LIZIZ;
        if (c9418b != null) {
            c9418b.LIZIZ();
        }
        this.f26052LJ.clear();
        LJIILIIL();
    }

    public OpenPlatformControlService(C3682x c3682x) {
        Object mo27335getValue;
        Observable LIZ2;
        Disposable subscribe;
        Object LIZ3;
        Observable<T> observable;
        Disposable subscribe2;
        C106862S5w.LIZ(c3682x);
        this.LJIIJ = c3682x;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            mo27335getValue = proxy.result;
        } else {
            mo27335getValue = this.LJIIIZ.mo27335getValue();
        }
        C5923dp c5923dp = (C5923dp) mo27335getValue;
        if (c5923dp != null) {
            this.LIZIZ = (C9418b) C437933Ud.LIZ(C90651LnZ.LIZ(c5923dp, 0L, 2, null), OpenPlatformControlService$1$1.INSTANCE);
            C9418b c9418b = this.LIZIZ;
            if (c9418b != null) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c9418b, C9418b.LIZ, false, 1);
                if (proxy2.isSupported) {
                    LIZ3 = proxy2.result;
                } else {
                    LIZ3 = c9418b.LIZJ.LIZ(c9418b, C9418b.LIZIZ[0]);
                }
                C102885QfP c102885QfP = (C102885QfP) LIZ3;
                if (c102885QfP != null && (observable = c102885QfP.LIZLLL) != 0 && (subscribe2 = observable.subscribe(new C87770KiC(this))) != null) {
                    LIZ(subscribe2);
                }
            }
        }
        AbstractC3512ag abstractC3512ag = LJIIIIZZ().LJII;
        if (abstractC3512ag != null && (LIZ2 = abstractC3512ag.LIZ(ap$a.class)) != null && (subscribe = LIZ2.subscribe(new C87768KiA(this), C3808516p.LIZ)) != null) {
            LIZ(subscribe);
        }
        DataCenter dataCenter = LJIIIIZZ().f26082LJ;
        if (dataCenter != null) {
            dataCenter.observe("data_live_mode", this);
        }
        DataCenter dataCenter2 = LJIIIIZZ().f26082LJ;
        if (dataCenter2 != null) {
            dataCenter2.observe("data_link_state", this);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        String key;
        int i;
        C3658f c3658f;
        List<Integer> list;
        boolean contains;
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZ, false, 12).isSupported && kVData2 != null && (key = kVData2.getKey()) != null) {
            int hashCode = key.hashCode();
            if (hashCode != 872172481) {
                if (hashCode != 1691407041 || !key.equals("data_live_mode")) {
                    return;
                }
            } else if (!key.equals("data_link_state")) {
                return;
            }
            if (LJIIIIZZ().LJIIIIZZ.LJIILIIL != PluginType.MINI_APP) {
                DataCenter dataCenter = LJIIIIZZ().f26082LJ;
                if (dataCenter != null) {
                    i = C443233g5.LIZIZ.LIZ(dataCenter);
                } else {
                    i = -1;
                }
                BootInfoService bootInfoService = (BootInfoService) LJIIIIZZ().LIZ((Class<AbstractC3719c>) BootInfoService.class);
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, bootInfoService, BootInfoService.LIZ, false, 7);
                if (proxy.isSupported) {
                    contains = ((Boolean) proxy.result).booleanValue();
                } else {
                    C3657d LIZ2 = bootInfoService.LIZ();
                    if (LIZ2 == null || (c3658f = LIZ2.LIZJ) == null || (list = c3658f.LJFF) == null) {
                        return;
                    }
                    contains = list.contains(Integer.valueOf(i));
                }
                if (!contains) {
                    C87783KiP c87783KiP = new C87783KiP();
                    if (LJIIIIZZ().LJIIJ) {
                        c87783KiP.LIZJ = 3;
                        c87783KiP.f8576LJ = LK5.LIZ(2131586634);
                        c87783KiP.LIZIZ = 3;
                    } else {
                        c87783KiP.f8576LJ = LK5.LIZ(2131586635);
                        c87783KiP.LIZIZ = 2;
                    }
                    if (!PatchProxy.proxy(new Object[]{"live_scene_limit"}, c87783KiP, C87783KiP.LIZ, false, 1).isSupported) {
                        C106862S5w.LIZ("live_scene_limit");
                        c87783KiP.LJIIIIZZ = "live_scene_limit";
                    }
                    c87783KiP.LJI = 45;
                    c87783KiP.LIZLLL = LK5.LIZ(2131586636);
                    c87783KiP.LJII = LK5.LIZ(2131586632);
                    C9416a.C9417a c9417a = new C9416a.C9417a();
                    c9417a.LIZJ = c87783KiP;
                    c9417a.LIZ = LJIIIIZZ().LJIIIIZZ.LJII;
                    c9417a.LIZIZ = 3;
                    c9417a.LIZLLL = 1;
                    LIZ(String.valueOf(LJIIIIZZ().LJIIIIZZ()), c9417a);
                }
            }
        }
    }

    private final void LIZ(String str, C9416a.C9417a c9417a) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C87783KiP c87783KiP;
        C87783KiP c87783KiP2;
        if (PatchProxy.proxy(new Object[]{str, c9417a}, this, LIZ, false, 7).isSupported) {
            return;
        }
        String str7 = null;
        if (!(!Intrinsics.areEqual(String.valueOf(LJIIIIZZ().LJIIIIZZ()), str))) {
            String str8 = LJIIIIZZ().LJIIIIZZ.LJII;
            if (c9417a != null) {
                str3 = c9417a.LIZ;
            } else {
                str3 = null;
            }
            if (!(!Intrinsics.areEqual(str8, str3)) && c9417a.LIZIZ != null && c9417a.LIZJ != null) {
                Integer num = c9417a.LIZLLL;
                if (num != null && num.intValue() == 2) {
                    c9417a.LIZIZ = 1;
                }
                AbstractC87785KiR abstractC87785KiR = this.LIZJ.LIZLLL;
                if ((abstractC87785KiR == null || !abstractC87785KiR.isShowing()) && !this.LJI.LIZ()) {
                    this.LIZLLL = c9417a;
                    C87783KiP c87783KiP3 = c9417a.LIZJ;
                    if (c87783KiP3 != null) {
                        LK1.LIZ(0L, false, false, new C3488xfd0f91d9(c87783KiP3, this, c9417a), 7, null);
                    }
                    Integer num2 = c9417a.LIZIZ;
                    if (num2 != null && num2.intValue() == 2) {
                        C87783KiP c87783KiP4 = c9417a.LIZJ;
                        if (c87783KiP4 == null || (str4 = c87783KiP4.LIZ()) == null) {
                            str4 = LoggerUtil.UNKNOWN;
                        }
                        LIZIZ(str4);
                        return;
                    }
                    return;
                }
                C9416a.C9417a c9417a2 = this.LIZLLL;
                if (c9417a2 != null && (c87783KiP2 = c9417a2.LIZJ) != null) {
                    str5 = c87783KiP2.LIZ();
                } else {
                    str5 = null;
                }
                if (Intrinsics.areEqual(str5, "live_scene_limit")) {
                    C9416a.C9417a c9417a3 = this.LIZLLL;
                    if (c9417a3 != null && (c87783KiP = c9417a3.LIZJ) != null) {
                        str6 = c87783KiP.LIZ();
                    } else {
                        str6 = null;
                    }
                    C87783KiP c87783KiP5 = c9417a.LIZJ;
                    if (c87783KiP5 != null) {
                        str7 = c87783KiP5.LIZ();
                    }
                    if (Intrinsics.areEqual(str6, str7)) {
                        return;
                    }
                }
                this.f26052LJ.add(TuplesKt.m137to(str, c9417a));
                return;
            }
        }
        LIZ();
        C87911KkT c87911KkT = C87911KkT.LIZIZ;
        if (c9417a != null) {
            str2 = c9417a.LIZ;
        } else {
            str2 = null;
        }
        C87911KkT.LIZ(c87911KkT, C0002O.m25084C("process InteractControlData error dataRoomId:", str, ", dataAppId:", str2), null, 2, null);
    }

    public final void LIZ(String str, List<C9416a.C9417a> list) {
        if (PatchProxy.proxy(new Object[]{str, list}, this, LIZ, false, 5).isSupported) {
            return;
        }
        if (!Intrinsics.areEqual(String.valueOf(LJIIIIZZ().LJIIIIZZ()), str)) {
            C87911KkT.LIZ(C87911KkT.LIZIZ, C0002O.m25086C("enqueue operationList error dataRoomId:", str), null, 2, null);
        } else if (list != null) {
            for (C9416a.C9417a c9417a : list) {
                Integer num = c9417a.LIZLLL;
                if (num != null) {
                    if (num.intValue() == 1) {
                        LIZ(str, c9417a);
                    } else if (num.intValue() == 2) {
                        this.LJFF.add(TuplesKt.m137to(str, c9417a));
                    }
                }
            }
        }
    }
}
