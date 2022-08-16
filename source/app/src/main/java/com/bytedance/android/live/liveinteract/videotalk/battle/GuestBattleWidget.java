package com.bytedance.android.live.liveinteract.videotalk.battle;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.UserAttr;
import com.bytedance.android.live.browser.jsbridge.event.C3953an;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.fulllink.LinkMonitorData;
import com.bytedance.android.live.liveinteract.doublepk.core.C4398a;
import com.bytedance.android.live.liveinteract.plantform.api.LinkGuestBattleApi;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleWidget;
import com.bytedance.android.live.liveinteract.videotalk.battle.h$a;
import com.bytedance.android.live.profit.dress.p411a.d$b;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.model.interact.C6166j;
import com.bytedance.android.livesdk.chatroom.p517u.AbstractC6302f;
import com.bytedance.android.livesdk.chatroom.p517u.AbstractC6303g;
import com.bytedance.android.livesdk.chatroom.p517u.C6305j;
import com.bytedance.android.livesdk.chatroom.p517u.C6306l;
import com.bytedance.android.livesdk.chatroom.p517u.C6307m;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar_behavior.p528a.C6532d;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.config.C6840aw;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.ktvapi.IKtvService;
import com.bytedance.android.livesdk.message.model.C8811de;
import com.bytedance.android.livesdk.message.model.LinkMicGuideMessage;
import com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler;
import com.bytedance.android.livesdk.utils.C9303cy;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.LinkerDetail;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C9605p;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC103391QnZ;
import p003X.AbstractC413392Xt;
import p003X.AbstractC78986HBs;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC81976ISs;
import p003X.C100839PnV;
import p003X.C103385QnT;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C148062fT6;
import p003X.C16J;
import p003X.C2WC;
import p003X.C3VF;
import p003X.C409882Kg;
import p003X.C413202Xa;
import p003X.C421792mb;
import p003X.C423702pg;
import p003X.C439993ar;
import p003X.C77279GdN;
import p003X.C77540Gha;
import p003X.C78369Gux;
import p003X.C78538Gxg;
import p003X.C78636GzG;
import p003X.C78820H5i;
import p003X.C78823H5l;
import p003X.C78824H5m;
import p003X.C78825H5n;
import p003X.C78826H5o;
import p003X.C78827H5p;
import p003X.C78828H5q;
import p003X.C79111HGn;
import p003X.C79242HLo;
import p003X.C80302Hl2;
import p003X.C80303Hl3;
import p003X.C80304Hl4;
import p003X.C80305Hl5;
import p003X.C80306Hl6;
import p003X.C80307Hl7;
import p003X.C80308Hl8;
import p003X.C80309Hl9;
import p003X.C80311HlB;
import p003X.C80312HlC;
import p003X.C80314HlE;
import p003X.C80315HlF;
import p003X.C80317HlH;
import p003X.C80318HlI;
import p003X.C80322HlM;
import p003X.C80323HlN;
import p003X.C80327HlR;
import p003X.C80328HlS;
import p003X.C80329HlT;
import p003X.C80331HlV;
import p003X.C80332HlW;
import p003X.C80333HlX;
import p003X.C80334HlY;
import p003X.C80335HlZ;
import p003X.C80336Hla;
import p003X.C80337Hlb;
import p003X.C80338Hlc;
import p003X.C80344Hli;
import p003X.C87010KQi;
import p003X.C87308Kak;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.DialogC77484Ggg;
import p003X.DialogC77516GhC;
import p003X.HH8;
import p003X.IQV;
import p003X.IQX;
import p003X.KDS;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class GuestBattleWidget extends RoomWidget implements Observer<KVData>, AbstractC4909l, OnMessageListener, OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;
    public Disposable LIZJ;
    public C80318HlI LIZLLL;
    public C4891b LJFF;
    public IMessageManager LJII;
    public Disposable LJIIIIZZ;
    public Disposable LJIIIZ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public final CompositeDisposable LJIIJ = new CompositeDisposable();
    public Map<Long, Boolean> LJIILIIL = new LinkedHashMap();
    public int LJIIZILJ = 21;
    public final ArrayList<LinkPlayerInfo> LJIJ = new ArrayList<>();

    /* renamed from: LJ */
    public final C80323HlN f26439LJ = new C80323HlN(new GuestBattleWidget$stateMachine$1(this));
    public C80315HlF LJIJI = new C80315HlF(this);
    public final AbstractC6524y.AbstractView$OnClickListenerC6525b LJI = new C78369Gux(this);

    static {
        Covode.recordClassIndex(29867);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 70).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    private final boolean LIZ(Disposable disposable) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 4);
        return proxy.isSupported ? ((Boolean) proxy.result).booleanValue() : this.LJIIJ.add(disposable);
    }

    public final void LIZ(AbstractC103391QnZ<? extends h$c, ? extends h$a, ? extends h$b> abstractC103391QnZ) {
        h$b h_b;
        C5923dp LIZ2;
        AbstractC413392Xt<C6305j> LJJJJZ;
        C6305j LIZIZ;
        C2WC<Long> LJFF;
        Long LIZ3;
        AbstractC413392Xt<C6305j> LJJJJZ2;
        C6305j LIZIZ2;
        if (PatchProxy.proxy(new Object[]{abstractC103391QnZ}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C103385QnT c103385QnT = (C103385QnT) (!(abstractC103391QnZ instanceof C103385QnT) ? null : abstractC103391QnZ);
        if (c103385QnT == null || (h_b = (h$b) c103385QnT.LIZJ) == null) {
            return;
        }
        h$c h_c = (h$c) ((C103385QnT) abstractC103391QnZ).LIZIZ;
        h$c LIZ4 = abstractC103391QnZ.LIZ();
        C6166j c6166j = h_c.LIZ;
        ALogger.m15800e("GuestBattleWidget", "transition fromState=" + LIZ4 + " toState=" + h_c + " action=" + c103385QnT.LIZIZ() + " effect=" + h_b);
        C4891b c4891b = this.LJFF;
        if (c4891b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c4891b.LJI().LIZ(c6166j);
        if (h_c.LIZIZ()) {
            C5923dp LIZ5 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
            if (LIZ5 != null && (LJJJJZ2 = LIZ5.LJJJJZ()) != null && (LIZIZ2 = LJJJJZ2.LIZIZ()) != null) {
                LIZIZ2.LIZIZ(5);
            }
        } else if (h_c.LIZ() && (LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null)) != null && (LJJJJZ = LIZ2.LJJJJZ()) != null && (LIZIZ = LJJJJZ.LIZIZ()) != null) {
            LIZIZ.LIZ(5);
        }
        if (!LIZ()) {
            if (LIZ4.LIZ() && h_c.LIZIZ()) {
                C78828H5q.LIZ((String) null, (String) null, (Integer) 5, (Map) null, 11, (Object) null);
            } else if (LIZ4.LIZIZ() && h_c.LIZ()) {
                C78828H5q.LIZIZ(null, null, 5, null, 11, null);
            }
        } else if (LIZ4.LIZ() && h_c.LIZIZ()) {
            C78828H5q.LIZ((String) null, (String) null, (Integer) 5, 3, (Object) null);
        } else if (LIZ4.LIZIZ() && h_c.LIZ()) {
            C78828H5q.LIZIZ((String) null, (String) null, (Integer) 5, 3, (Object) null);
        }
        if (Intrinsics.areEqual(h_b, C80335HlZ.LIZIZ)) {
            LIZ(this, c6166j, false, 2, null);
            C80318HlI c80318HlI = this.LIZLLL;
            if (c80318HlI != null) {
                C80318HlI.LIZ(c80318HlI, c6166j, false, 2, (Object) null);
            }
            C78827H5p.f6578LJ.LIZ(c6166j);
        } else if (Intrinsics.areEqual(h_b, C80338Hlc.LIZIZ)) {
            LIZJ(c6166j);
        } else if (Intrinsics.areEqual(h_b, C80337Hlb.LIZIZ)) {
            C4891b c4891b2 = this.LJFF;
            if (c4891b2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c4891b2.m15690LJ().LIZ(2);
            LJIILIIL();
            this.LJIIIZ = Observable.timer(c6166j.LJIIIIZZ, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new C80322HlM(this));
            C80318HlI c80318HlI2 = this.LIZLLL;
            if (c80318HlI2 != null) {
                c80318HlI2.LIZ(c6166j);
            }
        } else if (Intrinsics.areEqual(h_b, C80332HlW.LIZIZ)) {
            m15691LJ(LIZ4.LIZ);
            LIZ(this, c6166j, false, 2, null);
            C80318HlI c80318HlI3 = this.LIZLLL;
            if (c80318HlI3 != null && !PatchProxy.proxy(new Object[]{c6166j}, c80318HlI3, C80318HlI.LIZ, false, 7).isSupported) {
                C106862S5w.LIZ(c6166j);
                if (!c80318HlI3.f7278LJ) {
                    ALogger.m15800e(c80318HlI3.LJIILIIL, "restartGuestBattle battle not showing, showGuestBattleView");
                    C80318HlI.LIZ(c80318HlI3, c6166j, false, 2, (Object) null);
                } else {
                    c80318HlI3.LIZJ.setVisibility(0);
                    String LIZIZ3 = C6840aw.LIZIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZIZ3, "");
                    C80318HlI.LIZ(c80318HlI3, LIZIZ3, true, null, 4, null);
                    c80318HlI3.LIZIZ(c6166j);
                    C4891b LIZ6 = C4891b.LIZJ.LIZ();
                    long longValue = (LIZ6 == null || (LJFF = LIZ6.LJFF()) == null || (LIZ3 = LJFF.LIZ()) == null) ? 0L : LIZ3.longValue();
                    long j = c6166j.LJII;
                    c80318HlI3.LJIIIIZZ = j - longValue;
                    String str = c80318HlI3.LJIILIIL;
                    ALogger.m15797i(str, "view restartGuestBattle countDown=" + c80318HlI3.LJIIIIZZ + " start=" + longValue + " finish=" + j);
                    c80318HlI3.LIZIZ();
                    c80318HlI3.LJIIIZ = null;
                    c80318HlI3.LJIIJ = null;
                }
            }
            C78827H5p.f6578LJ.LIZ(c6166j);
        } else if (Intrinsics.areEqual(h_b, C80329HlT.LIZIZ)) {
            this.LJIIJJI = false;
            this.LJIIL = false;
            C4891b c4891b3 = this.LJFF;
            if (c4891b3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c4891b3.m15690LJ().LIZ(3);
            if (!PatchProxy.proxy(new Object[]{c6166j}, this, LIZ, false, 10).isSupported) {
                if (c6166j.LJIIJJI == 2 && LIZ()) {
                    C88440Kt0.LIZ(2131583906);
                } else {
                    String str2 = c6166j.LJIIL;
                    if (str2 != null && str2.length() != 0) {
                        C88440Kt0.LIZ(c6166j.LJIIL);
                    }
                }
                LJIILIIL();
                C80318HlI c80318HlI4 = this.LIZLLL;
                if (c80318HlI4 != null) {
                    c80318HlI4.LIZ("SideEffect.Reset");
                }
                m15691LJ(c6166j);
            }
        } else if (h_b instanceof C80333HlX) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
                C88440Kt0.LIZ(2131583907);
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = this.LJIILL;
                this.LJIILLIIL = currentTimeMillis < j2 ? (j2 - currentTimeMillis) / 1000 : -1L;
                LJIILIIL();
                C80318HlI c80318HlI5 = this.LIZLLL;
                if (c80318HlI5 != null && !PatchProxy.proxy(new Object[0], c80318HlI5, C80318HlI.LIZ, false, 12).isSupported && !PatchProxy.proxy(new Object[0], c80318HlI5, C80318HlI.LIZ, false, 9).isSupported) {
                    Disposable disposable = c80318HlI5.LJI;
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    Disposable disposable2 = c80318HlI5.LJII;
                    if (disposable2 != null) {
                        disposable2.dispose();
                    }
                    Disposable disposable3 = c80318HlI5.LJI;
                    if (disposable3 != null) {
                        disposable3.dispose();
                    }
                }
                ALogger.m15797i("GuestBattleWidget", "pause guestBattle");
            }
            if (((C80333HlX) h_b).LIZIZ) {
                LIZJ(c6166j);
            }
        } else if (h_b instanceof C80334HlY) {
            if (!PatchProxy.proxy(new Object[]{c6166j}, this, LIZ, false, 11).isSupported) {
                C88440Kt0.LIZ(2131583908);
                LIZLLL(c6166j);
                C80318HlI c80318HlI6 = this.LIZLLL;
                if (c80318HlI6 != null && !PatchProxy.proxy(new Object[]{c6166j}, c80318HlI6, C80318HlI.LIZ, false, 13).isSupported) {
                    C106862S5w.LIZ(c6166j);
                    long j3 = c6166j.LJI / 1000;
                    long j4 = c6166j.LJII;
                    c80318HlI6.LJIIIIZZ = j4 - j3;
                    String str3 = c80318HlI6.LJIILIIL;
                    ALogger.m15797i(str3, "view resumeGuestBattle countDown=" + c80318HlI6.LJIIIIZZ + " start=" + j3 + " finish=" + j4);
                    c80318HlI6.LIZIZ();
                }
                ALogger.m15797i("GuestBattleWidget", "resume guestBattle");
            }
            if (((C80334HlY) h_b).LIZIZ) {
                LIZJ(c6166j);
            }
        } else if (Intrinsics.areEqual(h_b, C80336Hla.LIZIZ)) {
            LIZ(c6166j, false);
            C80318HlI c80318HlI7 = this.LIZLLL;
            if (c80318HlI7 != null) {
                c80318HlI7.LIZ(c6166j, false);
            }
        } else {
            Intrinsics.areEqual(h_b, C80328HlS.LIZIZ);
        }
        C87010KQi.LIZ().LIZ(new C3953an());
    }

    public final void LIZ(boolean z) {
        IUserService iUserService;
        C3VF user;
        IUser LIZ2;
        UserAttr userAttr;
        List<Integer> list;
        boolean z2 = true;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 15).isSupported) {
            return;
        }
        boolean mo22927LJ = ((IUserService) ServiceManager.getService(IUserService.class)).user().mo22927LJ();
        boolean z3 = z || !((iUserService = (IUserService) ServiceManager.getService(IUserService.class)) == null || (user = iUserService.user()) == null || (LIZ2 = user.LIZ()) == null || (userAttr = LIZ2.getUserAttr()) == null || (list = userAttr.LIZLLL) == null || !list.contains(Integer.valueOf(C421792mb.LJIIIIZZ().LIZIZ)));
        if (C413202Xa.LIZIZ().LIZJ(ToolbarButton.GUEST_BATTLE_ADMIN) == null) {
            z2 = false;
        }
        ALogger.m15797i("GuestBattleWidget", "isAdmin " + mo22927LJ + ", hasPrivilege:" + z3 + ", exit:" + z2);
        C413202Xa.LIZIZ().LIZ(ToolbarButton.GUEST_BATTLE_ADMIN, this.LJI);
        if (!mo22927LJ || !z3) {
            if (!z2) {
                return;
            }
            C413202Xa.LIZIZ().LIZIZ(ToolbarButton.GUEST_BATTLE_ADMIN, this.LJI);
        } else if (z2) {
        } else {
            C413202Xa.LIZIZ().LIZ(ToolbarButton.GUEST_BATTLE_ADMIN, this.LJI);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.battle.AbstractC4909l
    public final String LIZ(int i, boolean z, int i2) {
        Boolean LIZ2;
        AbstractC78986HBs<LinkPlayerInfo> linkUserInfoCenter;
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2)}, this, LIZ, false, 19);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (!PatchProxy.proxy(new Object[0], C78827H5p.f6578LJ, C78827H5p.LIZ, false, 1).isSupported) {
            C78827H5p.LIZJ = true;
            C78827H5p.LIZLLL = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            C79111HGn.LIZ(C79111HGn.LIZJ, LinkMonitorData.StartCreateGuestBattle, jSONObject, C78827H5p.LIZIZ, 0, (String) null, 24, (Object) null);
            String format = String.format("startCreateGuestBattle, extra: %s", Arrays.copyOf(new Object[]{jSONObject}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "");
            ALogger.m15801d("GuestBattleFullLinkMonitor", format);
        }
        if (LIZIZ().isLiveTypeAudio()) {
            C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f6987aO;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            LIZ2 = c87308Kak.LIZ();
        } else {
            C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.f6983aK;
            Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
            LIZ2 = c87308Kak2.LIZ();
        }
        if (!LIZ2.booleanValue()) {
            C88440Kt0.LIZ(2131585396);
            return "gift";
        } else if (C79242HLo.LJIJ()) {
            C88440Kt0.LIZ(LK5.LIZ(2131584975, LK5.LIZ(2131583893)));
            return "link_room_fight";
        } else if (C79242HLo.LJIILL() && C78538Gxg.LJI()) {
            C88440Kt0.LIZ(2131585398);
            return "paid_link";
        } else if (C79242HLo.LJIILL() && C78538Gxg.LJII()) {
            C88440Kt0.LIZ(2131585398);
            return "bid_link";
        } else if (C79242HLo.LJIILL() && ((IKtvService) ServiceManager.getService(IKtvService.class)).isKtvChallengeModeOpen()) {
            C88440Kt0.LIZ(2131585679);
            return "ktv_challenge";
        } else if (C79242HLo.LJIILL() && C4398a.LIZJ.LIZJ()) {
            C88440Kt0.LIZ(LK5.LIZ(2131582950, LK5.LIZ(2131583893)));
            return "double_pk";
        } else {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 55);
            if (proxy2.isSupported) {
                linkUserInfoCenter = (AbstractC78986HBs) proxy2.result;
            } else {
                IService service = ServiceManager.getService(IInteractService.class);
                Intrinsics.checkNotNullExpressionValue(service, "");
                linkUserInfoCenter = ((IInteractService) service).getLinkUserInfoCenter();
            }
            int i3 = z ? 1 : 2;
            if (linkUserInfoCenter == null || linkUserInfoCenter.LJIIJJI() < i3) {
                C88440Kt0.LIZ(this.context.getString(2131583910, Integer.valueOf(i3)));
                return "cnt";
            }
            ALogger.m15797i("GuestBattleWidget", "start guest battle duration=" + i + ",anchorEnable：" + z);
            if (C4891b.LIZJ.LIZJ()) {
                str = "stop";
            } else {
                C4891b LIZ3 = C4891b.LIZJ.LIZ();
                str = (LIZ3 == null || LIZ3.LJIIJJI() != 2) ? "new_game" : "restart_game";
            }
            long currentTimeMillis = System.currentTimeMillis();
            Disposable subscribe = ((LinkGuestBattleApi) C88306Kqq.LIZ().LIZ(LinkGuestBattleApi.class)).openBattle(LIZIZ().getId(), i, z, i2).compose(C100839PnV.LIZJ()).subscribe(new C80304Hl4(this, i, i2, str, currentTimeMillis), new C78820H5i<>(this, i, i2, str, currentTimeMillis));
            Intrinsics.checkNotNullExpressionValue(subscribe, "");
            LIZ(subscribe);
            return "";
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.battle.AbstractC4909l
    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 22).isSupported) {
            return;
        }
        ALogger.m15795w("GuestBattleWidget", "try finish guest battle reason=" + i);
        if (!this.f26439LJ.LIZ().LIZIZ()) {
            ALogger.m15800e("GuestBattleWidget", "battle already finished " + m15692LJ());
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ((KDS) ((LinkGuestBattleApi) C88306Kqq.LIZ().LIZ(LinkGuestBattleApi.class)).finishBattle(LIZIZ().getId(), i).compose(C100839PnV.LIZJ()).m149as(C148062fT6.LIZ(C439993ar.LIZIZ(this.context)))).LIZ(new C80303Hl3(this, i, currentTimeMillis), new C78824H5m(this, i, currentTimeMillis));
    }

    public final void LIZ(C6166j c6166j) {
        C4891b LIZ2;
        C2WC<String> LJIIJ;
        if (PatchProxy.proxy(new Object[]{c6166j}, this, LIZ, false, 25).isSupported || c6166j.LJIIJ == null || (LIZ2 = C4891b.LIZJ.LIZ()) == null || (LJIIJ = LIZ2.LJIIJ()) == null) {
            return;
        }
        String str = c6166j.LJIIJ;
        Intrinsics.checkNotNull(str);
        LJIIJ.LIZ(str);
    }

    public final void LIZ(C6166j c6166j, C8811de.C8812a c8812a) {
        C6166j m15692LJ;
        C2WC<Integer> LJIIIZ;
        if (!PatchProxy.proxy(new Object[]{c6166j, c8812a}, this, LIZ, false, 29).isSupported && c6166j != null) {
            long j = c6166j.LIZIZ;
            C6166j m15692LJ2 = m15692LJ();
            long j2 = 0;
            if ((m15692LJ2 == null || j != m15692LJ2.LIZIZ) && (m15692LJ = m15692LJ()) != null && m15692LJ.LIZIZ > 0) {
                ALogger.m15800e("GuestBattleWidget", "onBattleUpdateMsg not same battle, msg:" + c6166j + " current:" + m15692LJ());
                return;
            }
            C6166j m15692LJ3 = m15692LJ();
            if (m15692LJ3 != null) {
                j2 = m15692LJ3.LJI;
            }
            if (j2 > c6166j.LJI) {
                ALogger.m15800e("GuestBattleWidget", "onBattleUpdateMsg timestamp invalid, msg:" + c6166j + " current:" + m15692LJ());
                return;
            }
            if (!LIZLLL() && !LJIIL() && !LIZ()) {
                C80308Hl8.LIZJ.LIZ(c6166j, LIZJ().toString());
            }
            ALogger.m15801d("GuestBattleWidget", "#GuestBattleDebug# [onBattleUpdateMsg] push IM battleInfo: " + c6166j + ". updateContent: " + c8812a);
            C4891b LIZ2 = C4891b.LIZJ.LIZ();
            if (LIZ2 != null && (LJIIIZ = LIZ2.LJIIIZ()) != null) {
                LJIIIZ.LIZ(Integer.valueOf((int) c6166j.LJIIIZ));
            }
            LIZ(this, c6166j, false, c8812a, 2, null);
            LIZIZ(c6166j);
            this.f26439LJ.LIZ(new h$a.C4903l(c6166j));
        }
    }

    private final boolean LIZ(C6166j.C6167a c6167a, boolean z, ArrayList<LinkPlayerInfo> arrayList) {
        User LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c6167a, Byte.valueOf(z ? (byte) 1 : (byte) 0), arrayList}, this, LIZ, false, 43);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        long j = c6167a.LIZIZ;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 44);
        if (j == (proxy2.isSupported ? ((Long) proxy2.result).longValue() : LIZIZ().ownerUserId)) {
            return C78636GzG.LIZIZ.LIZIZ();
        }
        if (arrayList.isEmpty() || z) {
            return true;
        }
        Iterator<T> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) next;
            if (c6167a.LIZIZ > 0 && (LIZ2 = linkPlayerInfo.LIZ()) != null && LIZ2.getId() == c6167a.LIZIZ) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.battle.AbstractC4909l
    public final void LIZ(List<? extends LinkPlayerInfo> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 46).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        List<? extends LinkPlayerInfo> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.LJIJ);
        this.LJIJ.clear();
        this.LJIJ.addAll(list);
        if (!LIZJ().LIZIZ()) {
            return;
        }
        if (list.size() < 3) {
            ALogger.m15800e("GuestBattleWidget", "windowListChanged size invalid " + list.size());
            return;
        }
        C6166j m15692LJ = m15692LJ();
        if (m15692LJ == null) {
            return;
        }
        ArrayList<C6166j.C6167a> LIZ2 = C80302Hl2.LIZ(m15692LJ);
        LIZ(this, m15692LJ, LIZJ().m15689LJ(), null, 4, null);
        if (LIZJ().LIZJ() || LIZJ().LIZLLL()) {
            LIZIZ(m15692LJ);
        }
        List<C6166j.C6167a> list2 = m15692LJ.LJFF;
        C4891b c4891b = this.LJFF;
        if (c4891b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c4891b.LJI().LIZ(m15692LJ);
        this.f26439LJ.LIZ(new h$a.C4898g(m15692LJ));
        if (LIZJ().m15689LJ()) {
            ALogger.m15797i("GuestBattleWidget", "windowListChanged when showResult, " + m15692LJ);
            C80318HlI c80318HlI = this.LIZLLL;
            if (c80318HlI == null || PatchProxy.proxy(new Object[]{m15692LJ}, c80318HlI, C80318HlI.LIZ, false, 16).isSupported) {
                return;
            }
            C106862S5w.LIZ(m15692LJ);
            c80318HlI.LIZIZ(m15692LJ);
            return;
        }
        Intrinsics.checkNotNullExpressionValue(list2, "");
        if (LIZ(m15692LJ, LIZ2, list2)) {
            ALogger.m15797i("GuestBattleWidget", "windowListChanged needRefresh " + m15692LJ);
            return;
        }
        LIZIZ(m15692LJ, mutableList, list);
    }

    public final void LIZ(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 51).isSupported) {
            return;
        }
        Disposable subscribe = ((LinkGuestBattleApi) C88306Kqq.LIZ().LIZ(LinkGuestBattleApi.class)).fetchGuestBattleConfig(j).compose(C100839PnV.LIZJ()).subscribe(new C77279GdN(this), C16J.LIZIZ);
        Intrinsics.checkNotNullExpressionValue(subscribe, "");
        LIZ(subscribe);
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 57).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        ALogger.m15795w("GuestBattleWidget", "resetBattleStatus reason=" + str + " currentState=" + LIZJ());
        if (LIZJ().LIZIZ() && LIZ()) {
            LIZ(4);
        }
        LJIILIIL();
    }

    private final boolean LIZ(C6166j c6166j, List<? extends C6166j.C6167a> list, List<? extends C6166j.C6167a> list2) {
        Object obj;
        Object obj2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c6166j, list, list2}, this, LIZ, false, 47);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (((C6166j.C6167a) obj2).LJIIJJI) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        C6166j.C6167a c6167a = (C6166j.C6167a) obj2;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (((C6166j.C6167a) obj3).LJIILJJIL) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator<T> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((C6166j.C6167a) next).LJIIJJI) {
                obj = next;
                break;
            }
        }
        C6166j.C6167a c6167a2 = (C6166j.C6167a) obj;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : list2) {
            if (((C6166j.C6167a) obj4).LJIILJJIL) {
                arrayList3.add(obj4);
            }
        }
        ArrayList arrayList4 = new ArrayList(arrayList3);
        boolean z = c6167a == null ? c6167a2 != null : c6167a2 == null || c6167a.LIZIZ != c6167a2.LIZIZ;
        boolean z2 = !C80302Hl2.LIZ(arrayList4, arrayList2);
        if (z || z2) {
            StringBuilder sb = new StringBuilder("refresh battle ui when list changed ");
            String str = "";
            sb.append(z ? "crown old=" + c6167a + " new=" + c6167a2 + ';' : str);
            if (z2) {
                str = "poop old=" + C80302Hl2.LIZ(arrayList2) + " new=" + C80302Hl2.LIZ(arrayList4) + ';';
            }
            sb.append(str);
            ALogger.m15797i("GuestBattleWidget", sb.toString());
            C80318HlI c80318HlI = this.LIZLLL;
            if (c80318HlI != null) {
                c80318HlI.LIZ(c6166j, "listChanged");
            }
            if (z || z2) {
                return true;
            }
        } else {
            ALogger.m15797i("GuestBattleWidget", "no need to refresh battle ui when list changed");
        }
        return false;
    }

    private final boolean LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return LIZJ().LIZLLL();
    }

    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C423702pg.LIZIZ(this.dataCenter, false, 1, null);
    }

    public final Room LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (Room) proxy.result;
        }
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        return C423702pg.LIZIZ(dataCenter);
    }

    public final h$c LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (h$c) proxy.result;
        }
        return this.f26439LJ.LIZ();
    }

    public final boolean LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return LIZJ().LIZJ();
    }

    /* renamed from: LJ */
    public final C6166j m15692LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (C6166j) proxy.result;
        }
        return C4891b.LIZJ.LJFF();
    }

    public final void LJIIIIZZ() {
        C80318HlI c80318HlI;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 64).isSupported && this.isViewValid && (c80318HlI = this.LIZLLL) != null) {
            c80318HlI.LIZJ();
        }
    }

    public GuestBattleWidget() {
        new ArrayList();
    }

    private final void LJIILIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 52).isSupported) {
            return;
        }
        Disposable disposable = this.LJIIIIZZ;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.LIZJ;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        Disposable disposable3 = this.LJIIIZ;
        if (disposable3 != null) {
            disposable3.dispose();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.battle.AbstractC4909l
    public final void LJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 66).isSupported) {
            return;
        }
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        C116971W2r.LIZJ(new DialogC77516GhC(context, dataCenter));
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.battle.AbstractC4909l
    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        if (this.f26439LJ.LIZ().LIZLLL()) {
            ALogger.m15800e("GuestBattleWidget", "battle already paused " + m15692LJ());
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ((KDS) ((LinkGuestBattleApi) C88306Kqq.LIZ().LIZ(LinkGuestBattleApi.class)).pauseBattle(LIZIZ().getId()).compose(C100839PnV.LIZJ()).m149as(C148062fT6.LIZ(C439993ar.LIZIZ(this.context)))).LIZ(new C80305Hl5(this, currentTimeMillis), new C78825H5n(this, currentTimeMillis));
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.battle.AbstractC4909l
    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        if (!this.f26439LJ.LIZ().LIZLLL()) {
            ALogger.m15800e("GuestBattleWidget", "battle already resumed " + m15692LJ());
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ((KDS) ((LinkGuestBattleApi) C88306Kqq.LIZ().LIZ(LinkGuestBattleApi.class)).resumeBattle(LIZIZ().getId(), (int) this.LJIILLIIL).compose(C100839PnV.LIZJ()).m149as(C148062fT6.LIZ(C439993ar.LIZIZ(this.context)))).LIZ(new C80306Hl6(this, currentTimeMillis), new C78826H5o(this, currentTimeMillis));
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.battle.AbstractC4909l
    public final void LJIIIZ() {
        long j;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 65).isSupported) {
            return;
        }
        SettingKey<String> settingKey = LiveConfigSettingKeys.LIVE_GUEST_BATTLE_RANK_URL;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        String value = settingKey.getValue();
        if (value == null) {
            return;
        }
        C9303cy c9303cy = new C9303cy("sslocal://webcast_lynxview");
        c9303cy.LIZ(PushConstants.WEB_URL, value);
        C9303cy LIZJ = c9303cy.LIZJ(PushConstants.WEB_URL);
        C4891b c4891b = this.LJFF;
        if (c4891b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C6166j LIZ2 = c4891b.LJI().LIZ();
        if (LIZ2 != null) {
            j = LIZ2.LIZIZ;
        } else {
            j = 0;
        }
        LIZJ.LIZ("battle_id", String.valueOf(j));
        c9303cy.LIZ("gravity", "bottom");
        c9303cy.LIZ("type", "popup");
        ((ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class)).handle(this.context, c9303cy.LIZ());
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.battle.AbstractC4909l
    public final void LJIIJJI() {
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ;
        C6307m LIZIZ2;
        boolean z = false;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 67).isSupported) {
            return;
        }
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ2 != null && (LJJZZIII = LIZ2.LJJZZIII()) != null && (LIZIZ = LJJZZIII.LIZIZ()) != null && (LIZIZ2 = LIZIZ.LIZIZ()) != null && LIZIZ2.LIZIZ == 8) {
            z = true;
        }
        if (this.context != null) {
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "");
            C116971W2r.LIZJ(new DialogC77484Ggg(context, z));
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0078 -> B:11:0x0055). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void LJIILJJIL() {
        /*
            r7 = this;
            r4 = 0
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleWidget.LIZ
            r0 = 62
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r7, r1, r4, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L10
            return
        L10:
            X.HlC r3 = p003X.C80312HlC.LIZIZ
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = p003X.C80312HlC.LIZ
            r0 = 10
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r3, r1, r4, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L80
            java.lang.Object r0 = r1.result
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r6 = r0.intValue()
        L28:
            X.HlC r0 = p003X.C80312HlC.LIZIZ
            java.lang.String r0 = r0.LIZJ(r4)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "#GuestBattleDebug# [downloadCrownEffectNew] useDefault: "
            r1.<init>(r0)
            r1.append(r5)
            java.lang.String r0 = ", count: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", defaultCount: 4"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "GuestBattleWidget"
            com.bytedance.android.live.core.log.ALogger.m15797i(r0, r1)
            if (r5 == 0) goto L78
            r6 = 4
        L55:
            X.HlC r0 = p003X.C80312HlC.LIZIZ
            java.lang.String r3 = r0.LIZJ(r4)
            X.Hli r0 = p003X.C80344Hli.LIZJ
            java.lang.String r1 = "ttlive_guest_battle_loki_crown"
            java.lang.String r2 = r0.LIZIZ(r1, r4)
            X.Hli r0 = p003X.C80344Hli.LIZJ
            java.lang.String r1 = r0.LIZ(r1, r4)
            X.Hli r0 = p003X.C80344Hli.LIZJ
            if (r5 == 0) goto L7b
            r3 = r2
        L6e:
            r0.LIZ(r1, r3)
            X.HlF r0 = r7.LJIJI
            p003X.C80344Hli.LIZ(r1, r0)
            int r4 = r4 + 1
        L78:
            if (r4 < r6) goto L55
            return
        L7b:
            if (r3 != 0) goto L6e
            java.lang.String r3 = ""
            goto L6e
        L80:
            java.lang.String r1 = r3.LIZ()
            java.lang.String r0 = "GuestBattleResource: getLevelCount"
            X.HlB r0 = r3.LIZ(r1, r0)
            if (r0 == 0) goto L99
            X.HlU r0 = r0.LIZLLL
            if (r0 == 0) goto L99
            java.util.List<com.bytedance.android.live.profit.dress.a.d$b> r0 = r0.LIZIZ
            if (r0 == 0) goto L99
            int r6 = r0.size()
            goto L28
        L99:
            r6 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleWidget.LJIILJJIL():void");
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 68).isSupported) {
            return;
        }
        super.onDestroy();
        ALogger.m15800e("GuestBattleWidget", "onDestroy state=" + LIZJ() + LoggerUtil.BLANK_TAG + m15692LJ());
        C413202Xa.LIZIZ().LIZIZ(ToolbarButton.GUEST_BATTLE_ADMIN, this.LJI);
        if (LIZJ().LIZIZ()) {
            m15691LJ(LIZJ().LIZ);
        }
        LIZ("onDestroy");
        IMessageManager iMessageManager = this.LJII;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        if (!LIZ()) {
            C78828H5q.LIZIZ(null, null, 5, null, 11, null);
        } else {
            C78828H5q.LIZIZ((String) null, (String) null, (Integer) 5, 3, (Object) null);
        }
        this.LJIIJ.dispose();
        this.dataCenter.removeObserver(this);
    }

    public final void LJII() {
        String str;
        C80327HlR c80327HlR;
        d$b d_b;
        String LIZIZ;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 58).isSupported && !PatchProxy.proxy(new Object[0], this, LIZ, false, 59).isSupported) {
            if (!C79242HLo.LJIILL()) {
                ALogger.m15795w("GuestBattleWidget", "#GuestBattleDebug# [initGuestBattleSticker] skipped, scene: " + C79242HLo.LJIIJ() + LoggerUtil.BLANK_TAG);
                return;
            }
            if (!C80302Hl2.LIZIZ() && !C80302Hl2.LIZLLL()) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 61).isSupported) {
                    C80344Hli.LIZ("ttlive_guest_battle_loki_crown", this.LJIJI);
                }
            } else {
                LJIILJJIL();
            }
            if (!C80302Hl2.LIZJ() && !C80302Hl2.LIZLLL()) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 60).isSupported) {
                    C80344Hli.LIZ("ttlive_guest_battle_loki_heart_break", this.LJIJI);
                }
            } else if (PatchProxy.proxy(new Object[0], this, LIZ, false, 63).isSupported) {
            } else {
                boolean isEmpty = TextUtils.isEmpty(C80312HlC.LIZIZ.LIZJ(0));
                C80312HlC c80312HlC = C80312HlC.LIZIZ;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], c80312HlC, C80312HlC.LIZ, false, 8);
                if (proxy.isSupported) {
                    str = (String) proxy.result;
                } else {
                    C80311HlB LIZ2 = c80312HlC.LIZ(c80312HlC.LIZ(), "GuestBattleResource: heartBrokenBeautyEffectId");
                    if (LIZ2 != null && (c80327HlR = LIZ2.f7277LJ) != null && (d_b = c80327HlR.LIZ) != null) {
                        str = d_b.LIZLLL;
                    } else {
                        str = null;
                    }
                    if (c80312HlC.LIZ(c80312HlC.LIZ()) && !TextUtils.isEmpty(str)) {
                        ALogger.m15801d("GuestBattleResource", "#GuestBattleDebug# [heartBrokenBeautyEffectId] id: " + str);
                    } else {
                        str = null;
                    }
                }
                C80344Hli c80344Hli = C80344Hli.LIZJ;
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c80344Hli, "ttlive_guest_battle_loki_heart_break", 0, 2, null}, null, C80344Hli.LIZ, true, 4);
                if (proxy2.isSupported) {
                    LIZIZ = (String) proxy2.result;
                } else {
                    LIZIZ = c80344Hli.LIZIZ("ttlive_guest_battle_loki_heart_break", 0);
                }
                String LIZ3 = C80344Hli.LIZ(C80344Hli.LIZJ, "ttlive_guest_battle_loki_heart_break", 0, 2, null);
                C80344Hli c80344Hli2 = C80344Hli.LIZJ;
                if (isEmpty) {
                    str = LIZIZ;
                } else if (str == null) {
                    str = "";
                }
                c80344Hli2.LIZ(LIZ3, str);
                C80344Hli.LIZ(LIZ3, this.LJIJI);
            }
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ;
        Observable<C6307m> mo15536LJ;
        Disposable subscribe;
        List<Long> list;
        boolean mo22927LJ;
        List<Long> list2;
        C3VF user;
        Observable<UserAttr> LJIIJ;
        Observable<UserAttr> observeOn;
        Disposable subscribe2;
        AbstractC413392Xt<AbstractC6303g> LJJLL;
        AbstractC6303g LIZIZ2;
        Observable<C6306l> LIZIZ3;
        Disposable subscribe3;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        super.onCreate();
        this.LJII = (IMessageManager) this.dataCenter.get("data_message_manager");
        IMessageManager iMessageManager = this.LJII;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(MessageType.LINK_GUEST_BATTLE_MESSAGE.LIZ(), this);
        }
        IMessageManager iMessageManager2 = this.LJII;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(MessageType.LINK_MIC_GUIDE_MESSAGE.LIZ(), this);
        }
        if (!C78636GzG.LIZIZ.LIZIZ()) {
            C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7136dE;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            c87308Kak.LIZ(Boolean.FALSE);
        }
        Pair LIZ2 = IQV.LIZ((Function0) GuestBattleWidget$onCreate$pair$1.INSTANCE);
        C4891b c4891b = (C4891b) LIZ2.getFirst();
        c4891b.LIZLLL().LIZIZ(this);
        IQX.LIZ(c4891b, AbstractC81976ISs.class);
        this.LJIIJ.add((Disposable) LIZ2.getSecond());
        this.LJFF = c4891b;
        if (LIZIZ().isLiveTypeAudio()) {
            Object obj = this.dataCenter.get("data_room_audio_chat_ui_layout", (String) 21);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            this.LJIIZILJ = ((Number) obj).intValue();
            this.dataCenter.observe("data_room_audio_chat_ui_layout", this);
            C5923dp LJJJI = LJJJI();
            if (LJJJI != null && (LJJLL = LJJJI.LJJLL()) != null && (LIZIZ2 = LJJLL.LIZIZ()) != null && (LIZIZ3 = LIZIZ2.LIZIZ()) != null && (subscribe3 = LIZIZ3.subscribe(new C80331HlV(new GuestBattleWidget$onCreate$1(this)))) != null) {
                LIZ(subscribe3);
            }
        } else {
            C5923dp LJJJI2 = LJJJI();
            if (LJJJI2 != null && (LJJZZIII = LJJJI2.LJJZZIII()) != null && (LIZIZ = LJJZZIII.LIZIZ()) != null && (mo15536LJ = LIZIZ.mo15536LJ()) != null && (subscribe = mo15536LJ.subscribe(new C80331HlV(new GuestBattleWidget$onCreate$2(this)))) != null) {
                LIZ(subscribe);
            }
        }
        this.LIZIZ = C79242HLo.LJIIJ();
        if (LIZ()) {
            LIZ(LIZIZ().getId());
        } else {
            StringBuilder sb = new StringBuilder("room playModes = ");
            LinkerDetail linkerDetail = LIZIZ().linkerDetail;
            if (linkerDetail != null) {
                list = linkerDetail.LIZIZ;
            } else {
                list = null;
            }
            sb.append(list);
            ALogger.m15797i("GuestBattleWidget", sb.toString());
            LinkerDetail linkerDetail2 = LIZIZ().linkerDetail;
            if (linkerDetail2 != null && (list2 = linkerDetail2.LIZIZ) != null && list2.contains(5L) && !PatchProxy.proxy(new Object[]{this, (byte) 0, 1, null}, null, LIZ, true, 24).isSupported) {
                LIZIZ(false);
            }
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
            if (proxy.isSupported) {
                mo22927LJ = ((Boolean) proxy.result).booleanValue();
            } else {
                mo22927LJ = ((IUserService) ServiceManager.getService(IUserService.class)).user().mo22927LJ();
            }
            if (mo22927LJ) {
                LIZ(LIZIZ().getId());
            }
        }
        if (!LIZ() && C78636GzG.LIZJ()) {
            LIZ(false);
            IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
            if (iUserService != null && (user = iUserService.user()) != null && (LJIIJ = user.LJIIJ()) != null && (observeOn = LJIIJ.observeOn(AndroidSchedulers.mainThread())) != null && (subscribe2 = observeOn.subscribe(new Consumer<UserAttr>() { // from class: X.2qR
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(29875);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(UserAttr userAttr) {
                    List<Integer> list3;
                    UserAttr userAttr2 = userAttr;
                    boolean z = true;
                    if (!PatchProxy.proxy(new Object[]{userAttr2}, this, LIZ, false, 1).isSupported) {
                        if (userAttr2 == null || (list3 = userAttr2.LIZLLL) == null || !list3.contains(Integer.valueOf(C421792mb.LJIIIIZZ().LIZIZ))) {
                            z = false;
                        }
                        GuestBattleWidget.this.LIZ(z);
                        boolean mo22927LJ2 = ((IUserService) ServiceManager.getService(IUserService.class)).user().mo22927LJ();
                        if (z) {
                            C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.f7182dy;
                            Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                            Boolean LIZ3 = c87308Kak2.LIZ();
                            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                            if (LIZ3.booleanValue()) {
                                if (mo22927LJ2) {
                                    C87308Kak<Boolean> c87308Kak3 = AbstractC80293Hkt.f7182dy;
                                    Intrinsics.checkNotNullExpressionValue(c87308Kak3, "");
                                    c87308Kak3.LIZ(Boolean.FALSE);
                                    AbstractC6524y LIZ4 = C413202Xa.LIZ();
                                    ToolbarButton toolbarButton = ToolbarButton.MORE;
                                    C422462ng c422462ng = C6532d.LJIIJJI;
                                    String LIZ5 = LK5.LIZ(2131586450);
                                    Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                                    LIZ4.LIZ(toolbarButton, c422462ng.LIZ(LIZ5));
                                    GuestBattleWidget guestBattleWidget = GuestBattleWidget.this;
                                    guestBattleWidget.LIZ(guestBattleWidget.LIZIZ().getId());
                                }
                                return;
                            }
                        }
                        if (!mo22927LJ2) {
                            return;
                        }
                        GuestBattleWidget guestBattleWidget2 = GuestBattleWidget.this;
                        guestBattleWidget2.LIZ(guestBattleWidget2.LIZIZ().getId());
                    }
                }
            })) != null) {
                LIZ(subscribe2);
            }
        }
        C4891b c4891b2 = this.LJFF;
        if (c4891b2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        Disposable subscribe4 = c4891b2.LJIIIIZZ().LIZIZ().subscribe(new C80314HlE(this));
        Intrinsics.checkNotNullExpressionValue(subscribe4, "");
        LIZ(subscribe4);
        StringBuilder sb2 = new StringBuilder("#GuestBattleDebug# [onCreate] experiment");
        sb2.append(" crown: ");
        sb2.append(C80302Hl2.LIZIZ());
        sb2.append(", heartbreak: ");
        sb2.append(C80302Hl2.LIZJ());
        sb2.append(", control: ");
        sb2.append(C80302Hl2.LIZ());
        sb2.append(", all: ");
        sb2.append(C80302Hl2.LIZLLL());
        sb2.append(", ExpSet: ");
        sb2.append(C80302Hl2.m23720LJ());
        sb2.append(", Setting: ");
        SettingKey<Integer> settingKey = LiveSettingKeys.LIVE_GUEST_BATTLE_ENHANCE_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        sb2.append(settingKey.getValue());
        ALogger.m15801d("GuestBattleWidget", sb2.toString());
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.battle.AbstractC4909l
    public final void LIZ(C80318HlI c80318HlI) {
        this.LIZLLL = c80318HlI;
    }

    public static final /* synthetic */ C4891b LIZ(GuestBattleWidget guestBattleWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{guestBattleWidget}, null, LIZ, true, 69);
        if (proxy.isSupported) {
            return (C4891b) proxy.result;
        }
        C4891b c4891b = guestBattleWidget.LJFF;
        if (c4891b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c4891b;
    }

    private final void LIZJ(C6166j c6166j) {
        if (PatchProxy.proxy(new Object[]{c6166j}, this, LIZ, false, 13).isSupported) {
            return;
        }
        LIZ(c6166j);
        C4891b c4891b = this.LJFF;
        if (c4891b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c4891b.m15690LJ().LIZ(Integer.valueOf(c6166j.LIZLLL));
        C80318HlI c80318HlI = this.LIZLLL;
        if (c80318HlI != null) {
            c80318HlI.LIZIZ(c6166j, LIZJ().m15689LJ());
        }
    }

    private final void LIZLLL(C6166j c6166j) {
        if (PatchProxy.proxy(new Object[]{c6166j}, this, LIZ, false, 49).isSupported) {
            return;
        }
        LJIILIIL();
        long j = c6166j.LJII - (c6166j.LJI / 1000);
        this.LJIILL = System.currentTimeMillis() + (1000 * j);
        this.LJIIIIZZ = Observable.timer(j, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new C80309Hl9(this));
    }

    /* renamed from: LJ */
    private final void m15691LJ(C6166j c6166j) {
        long j;
        if (PatchProxy.proxy(new Object[]{c6166j}, this, LIZ, false, 54).isSupported || LIZ()) {
            return;
        }
        if (this.LJIILJJIL > 0) {
            j = System.currentTimeMillis() - this.LJIILJJIL;
        } else {
            j = 0;
        }
        C77540Gha.LIZJ.LIZ(j / 1000, c6166j.LIZIZ);
        this.LJIILJJIL = 0L;
    }

    private final void LIZIZ(List<? extends C6166j.C6167a> list) {
        Object obj;
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 42).isSupported) {
            return;
        }
        if (LIZJ().LIZJ() || LIZJ().LIZLLL()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    long j = ((C6166j.C6167a) obj).LIZIZ;
                    Room LIZIZ = LIZIZ();
                    if (LIZIZ != null && j == LIZIZ.ownerUserId) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj == null) {
                z = false;
            }
            C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7136dE;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            c87308Kak.LIZ(Boolean.valueOf(z));
            ALogger.m15797i("GuestBattleWidget", "#GuestBattleDebug# [checkAnchorEnable] enable: " + z);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        String str;
        Integer num;
        int intValue;
        int i;
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZ, false, 16).isSupported) {
            if (kVData2 != null) {
                str = kVData2.getKey();
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str, "data_room_audio_chat_ui_layout") && (num = (Integer) kVData2.getData()) != null && (intValue = num.intValue()) != (i = this.LJIIZILJ)) {
                this.LJIIZILJ = intValue;
                if (LIZJ().LIZIZ()) {
                    LIZ("voiceChatPlayMode " + i + " -> " + intValue);
                    C6166j c6166j = LIZJ().LIZ;
                    c6166j.LJIIL = LK5.LIZ(2131583906);
                    this.f26439LJ.LIZ(new h$a.C4895d(c6166j));
                }
            }
        }
    }

    public final void LIZIZ(C6166j c6166j) {
        List<C6166j.C6167a> list;
        Object obj;
        C6166j.C6167a c6167a;
        if (PatchProxy.proxy(new Object[]{c6166j}, this, LIZ, false, 45).isSupported || (list = c6166j.LJFF) == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C6166j.C6167a) obj).LJIIJJI) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C6166j.C6167a c6167a2 = (C6166j.C6167a) obj;
        if (c6167a2 != null && this.LJIIJJI) {
            c6167a2.LJIILLIIL = true;
            this.LJIIJJI = false;
        }
        ListIterator<C6166j.C6167a> listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                c6167a = listIterator.previous();
                if (c6167a.LJIILJJIL) {
                    break;
                }
            } else {
                c6167a = null;
                break;
            }
        }
        C6166j.C6167a c6167a3 = c6167a;
        if (c6167a3 != null && this.LJIIL) {
            c6167a3.LJIILLIIL = true;
            this.LJIIL = false;
        }
    }

    public final void LIZIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 23).isSupported) {
            return;
        }
        ALogger.m15797i("GuestBattleWidget", "#GuestBattleDebug# [fetchGuestBattleInfo] try fetch timeout=" + z);
        Disposable subscribe = ((LinkGuestBattleApi) C88306Kqq.LIZ().LIZ(LinkGuestBattleApi.class)).getPlayModeInfo(LIZIZ().getId()).compose(C100839PnV.LIZJ()).subscribe(new C80307Hl7(this, z), new C78823H5l<>(this, z));
        Intrinsics.checkNotNullExpressionValue(subscribe, "");
        LIZ(subscribe);
    }

    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        String str;
        List<C6166j.C6167a> arrayList;
        C9605p c9605p;
        String LIZ2;
        if (PatchProxy.proxy(new Object[]{iMessage}, this, LIZ, false, 26).isSupported) {
            return;
        }
        if (iMessage instanceof LinkMicGuideMessage) {
            LinkMicGuideMessage linkMicGuideMessage = (LinkMicGuideMessage) iMessage;
            if (linkMicGuideMessage.LIZJ == 7) {
                LinkMicGuideMessage.C8706f c8706f = linkMicGuideMessage.LJIIIIZZ;
                if (c8706f != null) {
                    c9605p = c8706f.LIZ;
                } else {
                    c9605p = null;
                }
                if (!PatchProxy.proxy(new Object[]{c9605p}, this, LIZ, false, 27).isSupported) {
                    if (c9605p != null && (LIZ2 = c9605p.LIZ()) != null) {
                        LIZ2.toString();
                    } else {
                        LIZ2 = LK5.LIZ(2131583895);
                    }
                    this.dataCenter.put("cmd_show_self_bubble_on_openplatform_behavior", new C6532d(LIZ2, null, null, 0, null, null, 1001, 0, MapsKt__MapsJVMKt.mapOf(TuplesKt.m137to(PushMessageHelper.MESSAGE_TYPE, "fight")), 0, 702));
                }
            }
        }
        if (!(iMessage instanceof C8811de)) {
            return;
        }
        C8811de c8811de = (C8811de) iMessage;
        C6166j c6166j = c8811de.LIZJ;
        switch (c8811de.LIZ) {
            case 1:
                str = "create_msg";
                break;
            case 2:
                str = "update_msg";
                break;
            case 3:
                str = "show_result_msg";
                break;
            case 4:
                str = "finish_msg";
                break;
            case 5:
                str = "pause_msg";
                break;
            case 6:
                str = "resume_msg";
                break;
            default:
                str = "";
                break;
        }
        c6166j.LJIILIIL = str;
        C6166j c6166j2 = c8811de.LIZJ;
        List<C6166j.C6167a> list = c8811de.LIZJ.f26898LJ;
        if (list == null || (arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) list)) == null) {
            arrayList = new ArrayList<>();
        }
        c6166j2.LJFF = arrayList;
        switch (c8811de.LIZ) {
            case 1:
                C6166j c6166j3 = c8811de.LIZJ;
                Intrinsics.checkNotNullExpressionValue(c6166j3, "");
                if (PatchProxy.proxy(new Object[]{c6166j3}, this, LIZ, false, 28).isSupported) {
                    return;
                }
                C6166j m15692LJ = m15692LJ();
                if (m15692LJ != null && m15692LJ.LIZIZ == c6166j3.LIZIZ && this.f26439LJ.LIZ().LIZIZ()) {
                    ALogger.m15800e("GuestBattleWidget", "battle has created " + c6166j3 + " current=" + m15692LJ());
                    return;
                }
                List<C6166j.C6167a> list2 = c6166j3.f26898LJ;
                if (list2 != null) {
                    LIZIZ(list2);
                }
                ALogger.m15797i("GuestBattleWidget", "onBattleCreateMsg " + c6166j3);
                C80308Hl8 c80308Hl8 = C80308Hl8.LIZJ;
                String h_c = LIZJ().toString();
                if (!PatchProxy.proxy(new Object[]{c6166j3, h_c}, c80308Hl8, C80308Hl8.LIZ, false, 11).isSupported) {
                    C106862S5w.LIZ(c6166j3, h_c);
                    if (c80308Hl8.LIZ()) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("battle_info", c6166j3);
                        jSONObject.put("current_state", h_c);
                        c80308Hl8.LIZ("receive_battle_create_msg", jSONObject);
                        HH8.LIZ("receive_battle_create_msg", MapsKt__MapsKt.mutableMapOf(TuplesKt.m137to("extra", jSONObject.toString())), false, 4, (Object) null);
                    }
                }
                this.f26439LJ.LIZ(new h$a.C4892a(c6166j3));
                return;
            case 2:
                LIZ(c8811de.LIZJ, c8811de.LIZLLL);
                return;
            case 3:
                C6166j c6166j4 = c8811de.LIZJ;
                Intrinsics.checkNotNullExpressionValue(c6166j4, "");
                if (!PatchProxy.proxy(new Object[]{c6166j4}, this, LIZ, false, 31).isSupported) {
                    this.LJIIJJI = false;
                    this.LJIIL = false;
                    LIZ(this, c6166j4, true, null, 4, null);
                    ALogger.m15797i("GuestBattleWidget", "onBattleShowResultMsg " + c6166j4);
                    C80308Hl8 c80308Hl82 = C80308Hl8.LIZJ;
                    String h_c2 = LIZJ().toString();
                    if (!PatchProxy.proxy(new Object[]{c6166j4, h_c2}, c80308Hl82, C80308Hl8.LIZ, false, 12).isSupported) {
                        C106862S5w.LIZ(c6166j4, h_c2);
                        if (c80308Hl82.LIZ()) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("battle_info", c6166j4);
                            jSONObject2.put("current_state", h_c2);
                            c80308Hl82.LIZ("receive_show_result_msg", jSONObject2);
                            HH8.LIZ("receive_show_result_msg", MapsKt__MapsKt.mutableMapOf(TuplesKt.m137to("extra", jSONObject2.toString())), false, 4, (Object) null);
                        }
                    }
                    this.f26439LJ.LIZ(new h$a.C4900i(c6166j4));
                    return;
                }
                return;
            case 4:
                if (!PatchProxy.proxy(new Object[]{c8811de}, this, LIZ, false, 32).isSupported) {
                    C6166j c6166j5 = c8811de.LIZJ;
                    if (c6166j5 == null) {
                        c6166j5 = new C6166j();
                    }
                    C6166j m15692LJ2 = m15692LJ();
                    if (m15692LJ2 != null && m15692LJ2.LIZIZ == c6166j5.LIZIZ) {
                        ALogger.m15797i("GuestBattleWidget", "onBattleFinishMsg " + c6166j5);
                        C80308Hl8 c80308Hl83 = C80308Hl8.LIZJ;
                        String h_c3 = LIZJ().toString();
                        if (!PatchProxy.proxy(new Object[]{c6166j5, h_c3}, c80308Hl83, C80308Hl8.LIZ, false, 13).isSupported) {
                            C106862S5w.LIZ(c6166j5, h_c3);
                            if (c80308Hl83.LIZ()) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("battle_info", c6166j5);
                                jSONObject3.put("current_state", h_c3);
                                c80308Hl83.LIZ("receive_battle_finish_msg", jSONObject3);
                                HH8.LIZ("receive_battle_finish_msg", MapsKt__MapsKt.mutableMapOf(TuplesKt.m137to("extra", jSONObject3.toString())), false, 4, (Object) null);
                            }
                        }
                        c6166j5.LJIIL = c8811de.LIZIZ;
                        this.f26439LJ.LIZ(new h$a.C4894c(c6166j5));
                        return;
                    }
                    ALogger.m15797i("GuestBattleWidget", "battle finish id different " + c6166j5 + "  current=" + m15692LJ());
                    return;
                }
                return;
            case 5:
                if (!PatchProxy.proxy(new Object[]{c8811de}, this, LIZ, false, 33).isSupported) {
                    C6166j c6166j6 = c8811de.LIZJ;
                    if (c6166j6 == null) {
                        c6166j6 = new C6166j();
                    }
                    C6166j m15692LJ3 = m15692LJ();
                    if (m15692LJ3 != null && m15692LJ3.LIZIZ == c6166j6.LIZIZ) {
                        ALogger.m15797i("GuestBattleWidget", "onBattlePauseMsg " + c6166j6);
                        C80308Hl8 c80308Hl84 = C80308Hl8.LIZJ;
                        String h_c4 = LIZJ().toString();
                        if (!PatchProxy.proxy(new Object[]{c6166j6, h_c4}, c80308Hl84, C80308Hl8.LIZ, false, 14).isSupported) {
                            C106862S5w.LIZ(c6166j6, h_c4);
                            if (c80308Hl84.LIZ()) {
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("battle_info", c6166j6);
                                jSONObject4.put("current_state", h_c4);
                                c80308Hl84.LIZ("receive_battle_pause_msg", jSONObject4);
                            }
                        }
                        this.f26439LJ.LIZ(new h$a.C4897f(c6166j6));
                        return;
                    }
                    ALogger.m15797i("GuestBattleWidget", "battle pause id different " + c6166j6 + "  current=" + m15692LJ());
                    return;
                }
                return;
            case 6:
                if (PatchProxy.proxy(new Object[]{c8811de}, this, LIZ, false, 34).isSupported) {
                    return;
                }
                C6166j c6166j7 = c8811de.LIZJ;
                if (c6166j7 == null) {
                    c6166j7 = new C6166j();
                }
                C6166j m15692LJ4 = m15692LJ();
                if (m15692LJ4 != null && m15692LJ4.LIZIZ == c6166j7.LIZIZ) {
                    ALogger.m15797i("GuestBattleWidget", "onBattleResumeMsg " + c6166j7);
                    C80308Hl8 c80308Hl85 = C80308Hl8.LIZJ;
                    String h_c5 = LIZJ().toString();
                    if (!PatchProxy.proxy(new Object[]{c6166j7, h_c5}, c80308Hl85, C80308Hl8.LIZ, false, 15).isSupported) {
                        C106862S5w.LIZ(c6166j7, h_c5);
                        if (c80308Hl85.LIZ()) {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("battle_info", c6166j7);
                            jSONObject5.put("current_state", h_c5);
                            c80308Hl85.LIZ("receive_battle_resume_msg", jSONObject5);
                        }
                    }
                    this.f26439LJ.LIZ(new h$a.C4899h(c6166j7));
                    return;
                }
                ALogger.m15797i("GuestBattleWidget", "battle resume id different " + c6166j7 + "  current=" + m15692LJ());
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ArrayList<C6166j.C6167a> LIZIZ(C6166j c6166j, boolean z) {
        C6166j.C6167a c6167a;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c6166j, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 39);
        if (proxy.isSupported) {
            return (ArrayList) proxy.result;
        }
        ArrayList<C6166j.C6167a> arrayList = new ArrayList<>();
        List<C6166j.C6167a> list = c6166j.f26898LJ;
        Intrinsics.checkNotNullExpressionValue(list, "");
        for (C6166j.C6167a c6167a2 : list) {
            Intrinsics.checkNotNullExpressionValue(c6167a2, "");
            if (LIZ(c6167a2, z, this.LJIJ)) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c6167a2, C6166j.C6167a.LIZ, false, 2);
                if (proxy2.isSupported) {
                    c6167a = proxy2.result;
                } else {
                    C6166j.C6167a c6167a3 = new C6166j.C6167a();
                    c6167a3.LIZIZ = c6167a2.LIZIZ;
                    c6167a3.LIZJ = c6167a2.LIZJ;
                    c6167a3.LIZLLL = c6167a2.LIZLLL;
                    c6167a3.f26899LJ = c6167a2.f26899LJ;
                    c6167a3.LJFF = c6167a2.LJFF;
                    c6167a3.LJI = c6167a2.LJI;
                    c6167a3.LJII = c6167a2.LJII;
                    c6167a3.LJIIIIZZ = c6167a2.LJIIIIZZ;
                    c6167a = c6167a3;
                }
                arrayList.add(c6167a);
            } else {
                ALogger.m15800e("GuestBattleWidget", "filter out " + c6167a2 + " showResult=" + z);
            }
        }
        CollectionsKt__MutableCollectionsJVMKt.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void LIZ(com.bytedance.android.livesdk.chatroom.model.interact.C6166j r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleWidget.LIZ(com.bytedance.android.livesdk.chatroom.model.interact.j, boolean):void");
    }

    private final void LIZ(ArrayList<C6166j.C6167a> arrayList, boolean z) {
        C4891b LIZ2;
        C2WC<Integer> LJIIIZ;
        Integer LIZ3;
        int intValue;
        List<C6166j.C6167a> list;
        Object obj;
        if (PatchProxy.proxy(new Object[]{arrayList, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 41).isSupported) {
            return;
        }
        int size = arrayList.size();
        if ((C80302Hl2.LIZJ() || C80302Hl2.LIZLLL()) && (LIZ2 = C4891b.LIZJ.LIZ()) != null && (LJIIIZ = LIZ2.LJIIIZ()) != null && (LIZ3 = LJIIIZ.LIZ()) != null) {
            intValue = LIZ3.intValue();
        } else {
            intValue = 1;
        }
        int min = Math.min(intValue, size - 1);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (Intrinsics.areEqual(((C6166j.C6167a) obj2).LIZJ, "0")) {
                arrayList2.add(obj2);
            }
        }
        ArrayList<C6166j.C6167a> arrayList3 = arrayList2;
        int size2 = arrayList3.size();
        if (size2 <= min) {
            for (int i = size - min; i < size; i++) {
                C6166j.C6167a c6167a = arrayList.get(i);
                Intrinsics.checkNotNullExpressionValue(c6167a, "");
                C6166j.C6167a c6167a2 = c6167a;
                c6167a2.LJIILJJIL = true;
                C6166j m15692LJ = m15692LJ();
                if (m15692LJ != null && (list = m15692LJ.LJFF) != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((C6166j.C6167a) obj).LIZIZ == c6167a2.LIZIZ) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    C6166j.C6167a c6167a3 = (C6166j.C6167a) obj;
                    if (c6167a3 != null && !c6167a3.LJIILJJIL) {
                        c6167a2.LJIILL = true;
                    }
                }
            }
        }
        if (z) {
            for (C6166j.C6167a c6167a4 : arrayList3) {
                c6167a4.LJIILJJIL = true;
            }
        }
        ALogger.m15801d("GuestBattleWidget", "#GuestBattleDebug# [processLoserNewPlan] onlineLoserNum " + intValue + ", zeroUserNum: " + size2 + ", loserActualNum: " + min + ", userNum: " + size + ", results: " + arrayList);
    }

    private final void LIZIZ(C6166j c6166j, List<? extends LinkPlayerInfo> list, List<? extends LinkPlayerInfo> list2) {
        C80318HlI c80318HlI;
        C80317HlH c80317HlH;
        Integer num;
        Object obj;
        Integer num2;
        Object obj2;
        Integer num3;
        Object obj3;
        Integer num4;
        Object obj4;
        if (!PatchProxy.proxy(new Object[]{c6166j, list, list2}, this, LIZ, false, 48).isSupported && (c80318HlI = this.LIZLLL) != null && (c80317HlH = c80318HlI.LJIIJJI) != null && c80317HlH.LIZIZ != null) {
            C6166j.C6167a first = c80317HlH.LIZIZ.getFirst();
            Iterator<T> it = list.iterator();
            while (true) {
                num = null;
                if (it.hasNext()) {
                    obj = it.next();
                    User LIZ2 = ((LinkPlayerInfo) obj).LIZ();
                    if (LIZ2 != null && LIZ2.getId() == first.LIZIZ) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
            if (linkPlayerInfo != null) {
                num2 = Integer.valueOf(linkPlayerInfo.LJIIJJI);
            } else {
                num2 = null;
            }
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    User LIZ3 = ((LinkPlayerInfo) obj2).LIZ();
                    if (LIZ3 != null && LIZ3.getId() == first.LIZIZ) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) obj2;
            if (linkPlayerInfo2 != null) {
                num3 = Integer.valueOf(linkPlayerInfo2.LJIIJJI);
            } else {
                num3 = null;
            }
            boolean z = !Intrinsics.areEqual(num2, num3);
            C6166j.C6167a second = c80317HlH.LIZIZ.getSecond();
            Iterator<T> it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj3 = it3.next();
                    User LIZ4 = ((LinkPlayerInfo) obj3).LIZ();
                    if (LIZ4 != null && LIZ4.getId() == second.LIZIZ) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo3 = (LinkPlayerInfo) obj3;
            if (linkPlayerInfo3 != null) {
                num4 = Integer.valueOf(linkPlayerInfo3.LJIIJJI);
            } else {
                num4 = null;
            }
            Iterator<T> it4 = list2.iterator();
            while (true) {
                if (it4.hasNext()) {
                    obj4 = it4.next();
                    User LIZ5 = ((LinkPlayerInfo) obj4).LIZ();
                    if (LIZ5 != null && LIZ5.getId() == second.LIZIZ) {
                        break;
                    }
                } else {
                    obj4 = null;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo4 = (LinkPlayerInfo) obj4;
            if (linkPlayerInfo4 != null) {
                num = Integer.valueOf(linkPlayerInfo4.LJIIJJI);
            }
            if (!(!Intrinsics.areEqual(num4, num)) && !z) {
                return;
            }
            ALogger.m15795w("GuestBattleWidget", "needStopCrownTransition, old=[" + num2 + " to " + num4 + "] new=[" + num3 + " to " + num + LoggerUtil.M_RIGHT_TAG);
            C80318HlI c80318HlI2 = this.LIZLLL;
            if (c80318HlI2 != null) {
                c80318HlI2.LIZ(c6166j, "needStopCrownTransition");
            }
        }
    }

    private final void LIZ(C6166j c6166j, boolean z, C8811de.C8812a c8812a) {
        long j;
        C6166j.C6169c c6169c;
        boolean z2 = false;
        boolean z3 = true;
        if (PatchProxy.proxy(new Object[]{c6166j, Byte.valueOf(z ? (byte) 1 : (byte) 0), c8812a}, this, LIZ, false, 37).isSupported) {
            return;
        }
        ArrayList<C6166j.C6167a> LIZIZ = LIZIZ(c6166j, z);
        if (!PatchProxy.proxy(new Object[]{LIZIZ, c8812a}, this, LIZ, false, 40).isSupported) {
            C6166j.C6167a c6167a = (C6166j.C6167a) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) LIZIZ);
            if (c6167a != null) {
                if (c6167a.LJFF <= 0 || !(!Intrinsics.areEqual(c6167a.LIZJ, "0"))) {
                    z3 = false;
                }
                c6167a.LJIIJJI = z3;
                if (c6167a.LJIIJJI) {
                    C6166j.C6170d c6170d = c6167a.LJII;
                    if (c6170d != null && (c6169c = c6170d.LIZIZ) != null) {
                        j = c6169c.LIZIZ;
                    } else {
                        j = 0;
                    }
                    c6167a.LJIIL = (int) j;
                    if (c8812a != null) {
                        z2 = c8812a.LIZIZ;
                    }
                    c6167a.LJIILIIL = z2;
                }
            }
            ALogger.m15801d("GuestBattleWidget", "#GuestBattleDebug# [processWinnerNewPlan] winner: " + CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) LIZIZ));
        }
        LIZ(LIZIZ, z);
        LIZIZ(LIZIZ);
        c6166j.LJFF = LIZIZ;
    }

    public static /* synthetic */ void LIZ(GuestBattleWidget guestBattleWidget, C6166j c6166j, boolean z, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{guestBattleWidget, c6166j, (byte) 0, 2, null}, null, LIZ, true, 36).isSupported) {
            return;
        }
        guestBattleWidget.LIZ(c6166j, true);
    }

    public static /* synthetic */ void LIZ(GuestBattleWidget guestBattleWidget, C6166j c6166j, boolean z, C8811de.C8812a c8812a, int i, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        if (PatchProxy.proxy(new Object[]{guestBattleWidget, c6166j, Byte.valueOf(b), c8812a, Integer.valueOf(i), null}, null, LIZ, true, 38).isSupported) {
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            c8812a = null;
        }
        guestBattleWidget.LIZ(c6166j, z, c8812a);
    }
}
