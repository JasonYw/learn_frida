package com.bytedance.android.live.liveinteract.voicechat.fight;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.UserAttr;
import com.bytedance.android.live.browser.jsbridge.event.C3953an;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.bid.AbstractC4289e;
import com.bytedance.android.live.liveinteract.bid.C4287a;
import com.bytedance.android.live.liveinteract.doublepk.core.C4398a;
import com.bytedance.android.live.liveinteract.linkroomfight.core.C4492d;
import com.bytedance.android.live.liveinteract.p343b.AbstractC4286c;
import com.bytedance.android.live.liveinteract.plantform.api.LinkProfitApi;
import com.bytedance.android.live.liveinteract.plantform.model.C4816k;
import com.bytedance.android.live.liveinteract.videotalk.battle.C4891b;
import com.bytedance.android.live.liveinteract.videotalk.quickinteract.AbstractC4936a;
import com.bytedance.android.live.liveinteract.voicechat.AbstractC5004d;
import com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e;
import com.bytedance.android.live.liveinteract.voicechat.fight.LinkMicTeamFightWidget;
import com.bytedance.android.live.liveinteract.voicechat.fight.b$a;
import com.bytedance.android.live.profit.vote.AbstractC5417b;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.model.interact.C6156ao;
import com.bytedance.android.livesdk.chatroom.model.interact.C6158ap;
import com.bytedance.android.livesdk.chatroom.model.interact.C6174n;
import com.bytedance.android.livesdk.chatroom.p517u.AbstractC6302f;
import com.bytedance.android.livesdk.chatroom.p517u.C6305j;
import com.bytedance.android.livesdk.chatroom.p517u.C6307m;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar_behavior.p528a.C6532d;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.ktvapi.IKtvService;
import com.bytedance.android.livesdk.message.model.C8866fg;
import com.bytedance.android.livesdk.message.model.C8869fh;
import com.bytedance.android.livesdk.message.model.LinkMicGuideMessage;
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
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC103391QnZ;
import p003X.AbstractC413392Xt;
import p003X.AbstractC81988ITe;
import p003X.C100839PnV;
import p003X.C103385QnT;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C148062fT6;
import p003X.C2WC;
import p003X.C30K;
import p003X.C3VF;
import p003X.C409882Kg;
import p003X.C413202Xa;
import p003X.C421792mb;
import p003X.C423702pg;
import p003X.C439993ar;
import p003X.C458444Ba;
import p003X.C77264Gd8;
import p003X.C77278GdM;
import p003X.C77524GhK;
import p003X.C77525GhL;
import p003X.C77543Ghd;
import p003X.C77544Ghe;
import p003X.C77866Gmq;
import p003X.C78370Guy;
import p003X.C78389GvH;
import p003X.C78390GvI;
import p003X.C78391GvJ;
import p003X.C78411Gvd;
import p003X.C78629Gz9;
import p003X.C78630GzA;
import p003X.C78631GzB;
import p003X.C78632GzC;
import p003X.C78633GzD;
import p003X.C78634GzE;
import p003X.C78635GzF;
import p003X.C78636GzG;
import p003X.C78637GzH;
import p003X.C78638GzI;
import p003X.C78639GzJ;
import p003X.C78640GzK;
import p003X.C78641GzL;
import p003X.C78644GzO;
import p003X.C78645GzP;
import p003X.C78646GzQ;
import p003X.C78647GzR;
import p003X.C78648GzS;
import p003X.C78649GzT;
import p003X.C78650GzU;
import p003X.C78651GzV;
import p003X.C78828H5q;
import p003X.C78833H5v;
import p003X.C79046HEa;
import p003X.C79242HLo;
import p003X.C87010KQi;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.DialogC77522GhI;
import p003X.IQV;
import p003X.IQX;
import p003X.KDS;
import p003X.LK5;

/* loaded from: classes3.dex */
public abstract class LinkMicTeamFightWidget extends RoomWidget implements Observer<KVData>, AbstractC4286c, OnMessageListener, OnMessageListener {
    public static ChangeQuickRedirect LIZIZ;
    public Disposable LIZ;
    public int LIZJ;
    public IMessageManager LIZLLL;
    public Disposable LJFF;
    public long LJI;
    public boolean LJII;
    public C78389GvH LJIIIZ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public C5056a LJIILIIL;
    public Disposable LJIILLIIL;

    /* renamed from: LJ */
    public final CompositeDisposable f26484LJ = new CompositeDisposable();
    public String LJIIIIZZ = "";
    public long LJIIJ = 5;
    public final C78641GzL LJIILJJIL = new C78641GzL(new LinkMicTeamFightWidget$stateMachine$1(this));
    public final C30K<Integer> LJIIZILJ = C77866Gmq.LIZIZ;
    public final AbstractC6524y.AbstractView$OnClickListenerC6525b LJIILL = new C78370Guy(this);

    static {
        Covode.recordClassIndex(31248);
    }

    public void LIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZIZ, false, 17).isSupported) {
            return;
        }
        C106862S5w.LIZ(th);
    }

    public void LJI() {
    }

    public abstract boolean LJII();

    public abstract boolean LJIIIIZZ();

    public abstract boolean LJIIIZ();

    public abstract boolean LJIIJ();

    public abstract boolean LJIIJJI();

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 48).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.p343b.AbstractC4286c
    public final C78389GvH LIZ() {
        return this.LJIIIZ;
    }

    public final boolean LIZ(Disposable disposable) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{disposable}, this, LIZIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(disposable);
        return this.f26484LJ.add(disposable);
    }

    public void LIZ(AbstractC103391QnZ<? extends b$c, ? extends b$a, ? extends b$b> abstractC103391QnZ) {
        b$b b_b;
        C5923dp LIZ;
        AbstractC413392Xt<C6305j> LJJJJZ;
        C6305j LIZIZ2;
        C2WC<Room> LIZ2;
        Room LIZ3;
        AbstractC5004d LIZ4;
        C78833H5v LJIJJ;
        C2WC<Room> LIZ5;
        Room LIZ6;
        AbstractC5004d LIZ7;
        C78833H5v LJIJJ2;
        AbstractC413392Xt<C6305j> LJJJJZ2;
        C6305j LIZIZ3;
        if (PatchProxy.proxy(new Object[]{abstractC103391QnZ}, this, LIZIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC103391QnZ);
        C103385QnT c103385QnT = (C103385QnT) (!(abstractC103391QnZ instanceof C103385QnT) ? null : abstractC103391QnZ);
        if (c103385QnT == null || (b_b = (b$b) c103385QnT.LIZJ) == null) {
            return;
        }
        b$c b_c = (b$c) ((C103385QnT) abstractC103391QnZ).LIZIZ;
        b$c LIZ8 = abstractC103391QnZ.LIZ();
        C6174n c6174n = b_c.LIZ;
        ALogger.m15800e("TeamFightWidget", "transition fromState=" + LIZ8 + " toState=" + b_c + " action=" + c103385QnT.LIZIZ() + " effect=" + b_b);
        C5056a c5056a = this.LJIILIIL;
        if (c5056a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c5056a.LJIIIIZZ().LIZ(c6174n);
        if (b_c.LIZIZ()) {
            C5923dp LIZ9 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
            if (LIZ9 != null && (LJJJJZ2 = LIZ9.LJJJJZ()) != null && (LIZIZ3 = LJJJJZ2.LIZIZ()) != null) {
                LIZIZ3.LIZIZ(7);
            }
        } else if (b_c.LIZ() && (LIZ = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null)) != null && (LJJJJZ = LIZ.LJJJJZ()) != null && (LIZIZ2 = LJJJJZ.LIZIZ()) != null) {
            LIZIZ2.LIZ(7);
        }
        if (!LJIIL()) {
            if (LIZ8.LIZ() && b_c.LIZIZ()) {
                if (!PatchProxy.proxy(new Object[0], C78391GvJ.LIZIZ, C78391GvJ.LIZ, false, 9).isSupported) {
                    System.currentTimeMillis();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("seat_fit_status", "off");
                    C5923dp LIZ10 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                    if (LIZ10 != null && (LIZ5 = LIZ10.LIZ()) != null && (LIZ6 = LIZ5.LIZ()) != null && LIZ6.isLiveTypeAudio()) {
                        AbstractC5015e LIZ11 = AbstractC5015e.LIZIZ.LIZ();
                        if ((LIZ11 != null && (LJIJJ2 = LIZ11.LJIL()) != null) || ((LIZ7 = AbstractC5004d.LIZIZ.LIZ()) != null && (LJIJJ2 = LIZ7.LJIJJ()) != null)) {
                            C78833H5v.LIZ(LJIJJ2, (String) null, (String) null, (Integer) 7, (Map) linkedHashMap, 3, (Object) null);
                        }
                    } else {
                        C78828H5q.LIZ((String) null, (String) null, (Integer) 7, (Map) linkedHashMap, 3, (Object) null);
                    }
                }
            } else if (LIZ8.LIZIZ() && b_c.LIZ()) {
                C78391GvJ.LIZIZ.LIZIZ();
            }
        } else if (LIZ8.LIZ() && b_c.LIZIZ()) {
            if (!PatchProxy.proxy(new Object[0], C78391GvJ.LIZIZ, C78391GvJ.LIZ, false, 11).isSupported) {
                C5923dp LIZ12 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                if (LIZ12 != null && (LIZ2 = LIZ12.LIZ()) != null && (LIZ3 = LIZ2.LIZ()) != null && LIZ3.isLiveTypeAudio()) {
                    AbstractC5015e LIZ13 = AbstractC5015e.LIZIZ.LIZ();
                    if ((LIZ13 != null && (LJIJJ = LIZ13.LJIL()) != null) || ((LIZ4 = AbstractC5004d.LIZIZ.LIZ()) != null && (LJIJJ = LIZ4.LJIJJ()) != null)) {
                        C78833H5v.LIZ(LJIJJ, (String) null, (String) null, (Integer) 7, 3, (Object) null);
                    }
                } else {
                    C78828H5q.LIZ((String) null, (String) null, (Integer) 7, 3, (Object) null);
                }
            }
        } else if (LIZ8.LIZIZ() && b_c.LIZ()) {
            C78391GvJ.LIZIZ.LIZJ();
        }
        if (Intrinsics.areEqual(b_b, C78644GzO.LIZIZ)) {
            C5056a c5056a2 = this.LJIILIIL;
            if (c5056a2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c5056a2.m15647LJ().LIZ(1);
            this.LJI = System.currentTimeMillis();
        } else if (Intrinsics.areEqual(b_b, C78648GzS.LIZIZ)) {
            C5056a c5056a3 = this.LJIILIIL;
            if (c5056a3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c5056a3.m15647LJ().LIZ(2);
            LIZ(c6174n);
        } else if (!Intrinsics.areEqual(b_b, C78649GzT.LIZIZ)) {
            if (Intrinsics.areEqual(b_b, C78647GzR.LIZIZ)) {
                C5056a c5056a4 = this.LJIILIIL;
                if (c5056a4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                c5056a4.m15647LJ().LIZ(3);
                if (!PatchProxy.proxy(new Object[]{c6174n}, this, LIZIZ, false, 41).isSupported) {
                    LJIIZILJ();
                    this.LJIILLIIL = Observable.timer(c6174n.LIZJ() + this.LJIIJ, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new C78640GzK(this));
                }
            } else if (Intrinsics.areEqual(b_b, C78645GzP.LIZIZ)) {
                C5056a c5056a5 = this.LJIILIIL;
                if (c5056a5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                c5056a5.m15647LJ().LIZ(1);
                LJIIZILJ();
                if (LJIIL()) {
                    this.LJII = true;
                    C78391GvJ.LIZIZ.LIZ("continue", System.currentTimeMillis() - this.LJI, this.LJIIIIZZ);
                }
            } else if (Intrinsics.areEqual(b_b, C78646GzQ.LIZIZ)) {
                C5056a c5056a6 = this.LJIILIIL;
                if (c5056a6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                c5056a6.m15647LJ().LIZ(2);
                LIZ(c6174n);
            } else if (b_b instanceof C78651GzV) {
                C5056a c5056a7 = this.LJIILIIL;
                if (c5056a7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                c5056a7.m15647LJ().LIZ(4);
                this.LJII = false;
                LIZ(LIZ8, ((C78651GzV) b_b).LIZIZ);
            } else {
                Intrinsics.areEqual(b_b, C78650GzU.LIZIZ);
            }
        }
        C5056a c5056a8 = this.LJIILIIL;
        if (c5056a8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c5056a8.LJFF().LIZ(b_b);
        C87010KQi.LIZ().LIZ(new C3953an());
    }

    public final void LIZ(boolean z) {
        IUserService iUserService;
        C3VF user;
        IUser LIZ;
        UserAttr userAttr;
        List<Integer> list;
        boolean z2 = true;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 10).isSupported) {
            return;
        }
        boolean mo22927LJ = ((IUserService) ServiceManager.getService(IUserService.class)).user().mo22927LJ();
        boolean z3 = z || !((iUserService = (IUserService) ServiceManager.getService(IUserService.class)) == null || (user = iUserService.user()) == null || (LIZ = user.LIZ()) == null || (userAttr = LIZ.getUserAttr()) == null || (list = userAttr.LIZLLL) == null || !list.contains(Integer.valueOf(C421792mb.LJIIIZ().LIZIZ)));
        if (C413202Xa.LIZIZ().LIZJ(ToolbarButton.TEAM_FIGHT_ADMIN) == null) {
            z2 = false;
        }
        ALogger.m15797i("GuestBattleWidget", "isAdmin " + mo22927LJ + ", hasPrivilege:" + z3 + ", exit:" + z2);
        if (!mo22927LJ || !z3) {
            if (!z2) {
                return;
            }
            C413202Xa.LIZIZ().LIZIZ(ToolbarButton.TEAM_FIGHT_ADMIN, this.LJIILL);
        } else if (z2) {
        } else {
            C413202Xa.LIZIZ().LIZ(ToolbarButton.TEAM_FIGHT_ADMIN, this.LJIILL);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.p343b.AbstractC4286c
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        C116971W2r.LIZJ(new DialogC77522GhI(context, dataCenter, str, new C78390GvI(this)));
    }

    public final void LIZ(int i, long j) {
        C5923dp LJJJI;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ2;
        C6307m LIZIZ3;
        C2WC<Room> LIZ;
        Room LIZ2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), new Long(j)}, this, LIZIZ, false, 16).isSupported) {
            return;
        }
        ALogger.m15797i("TeamFightWidget", "create team fight option=" + i + " duration=" + j);
        boolean mo22927LJ = ((IUserService) ServiceManager.getService(IUserService.class)).user().mo22927LJ();
        if (this.LJIIJJI) {
            return;
        }
        if (LJIIL() || mo22927LJ) {
            this.LJIIJJI = true;
            C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
            boolean z = (LIZ3 == null || (LIZ = LIZ3.LIZ()) == null || (LIZ2 = LIZ.LIZ()) == null || !LIZ2.isLiveTypeAudio()) && ((LJJJI = LJJJI()) == null || (LJJZZIII = LJJJI.LJJZZIII()) == null || (LIZIZ2 = LJJZZIII.LIZIZ()) == null || (LIZIZ3 = LIZIZ2.LIZIZ()) == null || !LIZIZ3.LIZIZ());
            long currentTimeMillis = System.currentTimeMillis();
            boolean z2 = i == 0;
            Disposable subscribe = ((LinkProfitApi) C88306Kqq.LIZ().LIZ(LinkProfitApi.class)).createTeamFight(LJIILIIL().getId(), j, i, z).compose(C100839PnV.LIZJ()).subscribe(new C78629Gz9(this, z2, currentTimeMillis, i, j), new C78631GzB<>(this, z2, currentTimeMillis, i, j));
            Intrinsics.checkNotNullExpressionValue(subscribe, "");
            LIZ(subscribe);
        }
    }

    public void LIZ(b$c b_c, Object obj) {
        if (PatchProxy.proxy(new Object[]{b_c, obj}, this, LIZIZ, false, 42).isSupported) {
            return;
        }
        C106862S5w.LIZ(b_c);
        LJIIZILJ();
        if (!(obj instanceof C8866fg.C8868b)) {
            obj = null;
        }
        C8866fg.C8868b c8868b = (C8866fg.C8868b) obj;
        if (c8868b != null && c8868b.f27898LJ) {
            if (!LJIIL() && LJIIJJI()) {
                String str = c8868b.LIZJ;
                if (str != null && str.length() != 0) {
                    C88440Kt0.LIZ(c8868b.LIZJ);
                    return;
                } else {
                    C88440Kt0.LIZ(2131587999);
                    return;
                }
            }
            String str2 = c8868b.LIZIZ;
            if (str2 != null && str2.length() != 0) {
                C88440Kt0.LIZ(c8868b.LIZIZ);
            } else {
                C88440Kt0.LIZ(2131588000);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.p343b.AbstractC4286c
    public final boolean LIZ(DataCenter dataCenter) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dataCenter}, this, LIZIZ, false, 46);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(dataCenter);
        SettingKey<Integer[]> settingKey = LiveConfigSettingKeys.LINK_TEAM_FIGHT_SUPPORT_SCENE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Integer[] value = settingKey.getValue();
        if (value == null) {
            return false;
        }
        return ArraysKt___ArraysKt.contains(value, Integer.valueOf(C79242HLo.LJIIJ()));
    }

    @Override // com.bytedance.android.live.liveinteract.p343b.AbstractC4286c
    public final AbstractC81988ITe LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 24);
        if (proxy.isSupported) {
            return (AbstractC81988ITe) proxy.result;
        }
        C5056a c5056a = this.LJIILIIL;
        if (c5056a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c5056a;
    }

    @Override // com.bytedance.android.live.liveinteract.p343b.AbstractC4286c
    public final String LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 47);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return C78391GvJ.LIZIZ.LIZLLL();
    }

    public final boolean LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C423702pg.LIZIZ(this.dataCenter, false, 1, null);
    }

    public final Room LJIILIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 2);
        if (proxy.isSupported) {
            return (Room) proxy.result;
        }
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        return C423702pg.LIZIZ(dataCenter);
    }

    public final C5056a LJIILJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 4);
        if (proxy.isSupported) {
            return (C5056a) proxy.result;
        }
        C5056a c5056a = this.LJIILIIL;
        if (c5056a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c5056a;
    }

    public final b$c LJIILL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 6);
        if (proxy.isSupported) {
            return (b$c) proxy.result;
        }
        return this.LJIILJJIL.LIZ();
    }

    public final C6174n LJIILLIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 7);
        if (proxy.isSupported) {
            return (C6174n) proxy.result;
        }
        return LJIILL().LIZ;
    }

    private final void LJIIZILJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 44).isSupported) {
            return;
        }
        Disposable disposable = this.LIZ;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.LJFF;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        Disposable disposable3 = this.LJIILLIIL;
        if (disposable3 != null) {
            disposable3.dispose();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.p343b.AbstractC4286c
    public final C6174n LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 25);
        if (proxy.isSupported) {
            return (C6174n) proxy.result;
        }
        C5056a c5056a = this.LJIILIIL;
        if (c5056a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c5056a.LIZJ();
    }

    @Override // com.bytedance.android.live.liveinteract.p343b.AbstractC4286c
    public final boolean LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 26);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return LJIILL().LIZIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.p343b.AbstractC4286c
    /* renamed from: LJ */
    public final boolean mo15648LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 28);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!LJIILL().LIZJ() && !LJIILL().LIZLLL()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 45).isSupported) {
            return;
        }
        super.onDestroy();
        ALogger.m15800e("TeamFightWidget", "onDestroy state=" + LJIILL() + LoggerUtil.BLANK_TAG + LJIILLIIL());
        C413202Xa.LIZIZ().LIZIZ(ToolbarButton.TEAM_FIGHT_ADMIN, this.LJIILL);
        LJIIZILJ();
        this.dataCenter.removeObserver(this);
        IMessageManager iMessageManager = this.LIZLLL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        if (!LJIIL()) {
            C78391GvJ.LIZIZ.LIZIZ();
        } else {
            C78391GvJ.LIZIZ.LIZJ();
        }
        this.f26484LJ.dispose();
        C79046HEa.LIZ().LIZ((C30K) this.LJIIZILJ);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        List<Long> list;
        List<Long> list2;
        C3VF user;
        Observable<UserAttr> LJIIJ;
        Disposable subscribe;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 9).isSupported) {
            return;
        }
        super.onCreate();
        this.LIZLLL = (IMessageManager) this.dataCenter.get("data_message_manager");
        IMessageManager iMessageManager = this.LIZLLL;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(MessageType.LINK_TEAM_FIGHT_MESSAGE.LIZ(), this);
        }
        IMessageManager iMessageManager2 = this.LIZLLL;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(MessageType.LINK_TEAM_FIGHT_SCORE_MESSAGE.LIZ(), this);
        }
        IMessageManager iMessageManager3 = this.LIZLLL;
        if (iMessageManager3 != null) {
            iMessageManager3.addMessageListener(MessageType.LINK_MIC_GUIDE_MESSAGE.LIZ(), this);
        }
        LJI();
        C79046HEa.LIZ().LIZIZ(this.LJIIZILJ);
        Pair LIZ = IQV.LIZ((Function0) LinkMicTeamFightWidget$onCreate$pair$1.INSTANCE);
        C5056a c5056a = (C5056a) LIZ.getFirst();
        c5056a.LIZLLL().LIZIZ(this);
        IQX.LIZ(c5056a, AbstractC81988ITe.class);
        this.f26484LJ.add((Disposable) LIZ.getSecond());
        this.LJIILIIL = c5056a;
        if (LJIIL()) {
            if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 43).isSupported) {
                Disposable subscribe2 = ((LinkProfitApi) C88306Kqq.LIZ().LIZ(LinkProfitApi.class)).fetchTeamFightConfig().compose(C100839PnV.LIZJ()).subscribe(new C77278GdM(this), C77264Gd8.LIZIZ);
                Intrinsics.checkNotNullExpressionValue(subscribe2, "");
                LIZ(subscribe2);
            }
        } else {
            StringBuilder sb = new StringBuilder("room playModes = ");
            LinkerDetail linkerDetail = LJIILIIL().linkerDetail;
            if (linkerDetail != null) {
                list = linkerDetail.LIZIZ;
            } else {
                list = null;
            }
            sb.append(list);
            ALogger.m15797i("TeamFightWidget", sb.toString());
            LinkerDetail linkerDetail2 = LJIILIIL().linkerDetail;
            if (linkerDetail2 != null && (list2 = linkerDetail2.LIZIZ) != null && list2.contains(7L) && !PatchProxy.proxy(new Object[]{this, null, 1, null}, null, LIZIZ, true, 20).isSupported) {
                LIZIZ("");
            }
        }
        if (!LJIIL() && C78636GzG.LIZJ()) {
            LIZ(false);
            IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
            if (iUserService != null && (user = iUserService.user()) != null && (LJIIJ = user.LJIIJ()) != null && (subscribe = LJIIJ.subscribe(new Consumer<UserAttr>() { // from class: X.2qQ
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(31258);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(UserAttr userAttr) {
                    List<Integer> list3;
                    UserAttr userAttr2 = userAttr;
                    boolean z = true;
                    if (!PatchProxy.proxy(new Object[]{userAttr2}, this, LIZ, false, 1).isSupported) {
                        if (userAttr2 == null || (list3 = userAttr2.LIZLLL) == null || !list3.contains(Integer.valueOf(C421792mb.LJIIIZ().LIZIZ))) {
                            z = false;
                        }
                        LinkMicTeamFightWidget.this.LIZ(z);
                        if (z) {
                            C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7135dD;
                            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                            Boolean LIZ2 = c87308Kak.LIZ();
                            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                            if (LIZ2.booleanValue()) {
                                C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.f7135dD;
                                Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                                c87308Kak2.LIZ(Boolean.FALSE);
                                AbstractC6524y LIZ3 = C413202Xa.LIZ();
                                ToolbarButton toolbarButton = ToolbarButton.MORE;
                                C422462ng c422462ng = C6532d.LJIIJJI;
                                String LIZ4 = LK5.LIZ(2131586450);
                                Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                                LIZ3.LIZ(toolbarButton, c422462ng.LIZ(LIZ4));
                            }
                        }
                    }
                }
            })) != null) {
                LIZ(subscribe);
            }
        }
    }

    private final void LIZ(C6174n c6174n) {
        if (PatchProxy.proxy(new Object[]{c6174n}, this, LIZIZ, false, 38).isSupported) {
            return;
        }
        C5056a c5056a = this.LJIILIIL;
        if (c5056a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c5056a.LJII().LIZ(Long.valueOf(c6174n.LJIIL / 1000));
        this.LJI = System.currentTimeMillis();
        LJIIZILJ();
        LIZIZ(c6174n);
    }

    private final void LIZIZ(C6174n c6174n) {
        if (PatchProxy.proxy(new Object[]{c6174n}, this, LIZIZ, false, 39).isSupported) {
            return;
        }
        this.LIZ = Observable.timer(c6174n.LIZ(), TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new C78637GzH(this));
    }

    private final void LIZ(C8869fh c8869fh) {
        C4816k c4816k;
        C6174n c6174n;
        List<C6158ap> list;
        List<C6156ao> list2;
        Object obj;
        if (!PatchProxy.proxy(new Object[]{c8869fh}, this, LIZIZ, false, 30).isSupported && AbstractC4936a.LIZ.LIZIZ() && (c4816k = c8869fh.LIZJ) != null && (c6174n = c8869fh.LIZIZ) != null && (list = c6174n.LJIIJ) != null) {
            for (C6158ap c6158ap : list) {
                if (c6158ap != null && (list2 = c6158ap.LJIIIIZZ) != null) {
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            C6156ao c6156ao = (C6156ao) obj;
                            if (c6156ao != null && c6156ao.LIZIZ == C79242HLo.LIZ()) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    C6156ao c6156ao2 = (C6156ao) obj;
                    if (c6156ao2 != null) {
                        c6156ao2.LJI = c4816k;
                        return;
                    }
                }
            }
        }
    }

    public void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 21).isSupported) {
            return;
        }
        ALogger.m15795w("TeamFightWidget", "try finish team fight reason=" + i);
        if (!this.LJIILJJIL.LIZ().LIZIZ()) {
            ALogger.m15800e("TeamFightWidget", "team fight already finished " + LJIILLIIL());
            return;
        }
        LIZJ(i);
    }

    public final void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 23).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        ALogger.m15795w("TeamFightWidget", "forceFinishTeamFight reason=" + str + " currentState=" + LJIILL());
        if (LJIILL().LIZIZ() && LJIIL()) {
            LIZIZ(4);
        }
        LJIIZILJ();
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 19).isSupported) {
            return;
        }
        ALogger.m15797i("TeamFightWidget", C0002O.m25086C("try fetchTeamFightInfo reqFrom=", str));
        Disposable subscribe = ((LinkProfitApi) C88306Kqq.LIZ().LIZ(LinkProfitApi.class)).getPlayModeInfo(LJIILIIL().getId()).compose(C100839PnV.LIZJ()).subscribe(new C78635GzF(this, str), new C78638GzI<>(this, str));
        Intrinsics.checkNotNullExpressionValue(subscribe, "");
        LIZ(subscribe);
    }

    public final void LIZJ(int i) {
        long j;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 22).isSupported || this.LJIIL) {
            return;
        }
        this.LJIIL = true;
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_BATTLE_SWITCH_BY_SERVER;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        if (i == 3) {
            j = LJIILLIIL().LIZJ;
        } else {
            j = 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long id = LJIILIIL().getId();
        Intrinsics.checkNotNullExpressionValue(value, "");
        ((KDS) ((LinkProfitApi) C88306Kqq.LIZ().LIZ(LinkProfitApi.class)).finishTeamFight(id, i, j, value.booleanValue()).compose(C100839PnV.LIZJ()).m149as(C148062fT6.LIZ(C439993ar.LIZIZ(this.context)))).LIZ(new C78630GzA(this, currentTimeMillis, i), new C78634GzE(this, i, currentTimeMillis));
    }

    @Override // com.bytedance.android.live.liveinteract.p343b.AbstractC4286c
    public final C77543Ghd LIZ(C77525GhL c77525GhL) {
        AbstractC4289e LIZIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c77525GhL}, this, LIZIZ, false, 13);
        if (proxy.isSupported) {
            return (C77543Ghd) proxy.result;
        }
        C106862S5w.LIZ(c77525GhL);
        if (c77525GhL.LIZLLL) {
            int i = this.LIZJ;
            if (i == 9) {
                C77544Ghe c77544Ghe = C77543Ghd.f6432LJ;
                String LIZ = LK5.LIZ(2131588014, LK5.LIZ(2131584795));
                Intrinsics.checkNotNullExpressionValue(LIZ, "");
                return c77544Ghe.LIZ(6, "fail_play", LIZ);
            } else if (i == 13) {
                C77544Ghe c77544Ghe2 = C77543Ghd.f6432LJ;
                String LIZ2 = LK5.LIZ(2131588014, LK5.LIZ(2131588206));
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                return c77544Ghe2.LIZ(6, "fail_play", LIZ2);
            } else if (!LJIIIZ()) {
                return C77543Ghd.f6432LJ.LIZIZ();
            }
        }
        if (!LJII() && c77525GhL.LIZIZ) {
            C77544Ghe c77544Ghe3 = C77543Ghd.f6432LJ;
            String LIZ3 = LK5.LIZ(2131588003);
            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
            return c77544Ghe3.LIZ(2, "fail_no_gift", LIZ3);
        }
        if (c77525GhL.LIZJ) {
            AbstractC5417b LIZLLL = C458444Ba.LIZLLL();
            if (LIZLLL != null && LIZLLL.LIZ()) {
                C77544Ghe c77544Ghe4 = C77543Ghd.f6432LJ;
                String LIZ4 = LK5.LIZ(2131588014, LK5.LIZ(2131585074));
                Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                return c77544Ghe4.LIZ(5, "fail_play", LIZ4);
            } else if (C4891b.LIZJ.m23816LJ()) {
                C77544Ghe c77544Ghe5 = C77543Ghd.f6432LJ;
                String LIZ5 = LK5.LIZ(2131588014, LK5.LIZ(2131583893));
                Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                return c77544Ghe5.LIZ(3, "fail_play", LIZ5);
            } else if (LJIIIIZZ() || ((LIZIZ2 = C4287a.LIZJ.LIZIZ()) != null && LIZIZ2.LIZ())) {
                C77544Ghe c77544Ghe6 = C77543Ghd.f6432LJ;
                String LIZ6 = LK5.LIZ(2131588014, LK5.LIZ(2131586743));
                Intrinsics.checkNotNullExpressionValue(LIZ6, "");
                return c77544Ghe6.LIZ(4, "fail_play", LIZ6);
            } else if (!LJIILIIL().isLiveTypeAudio() && ((IKtvService) ServiceManager.getService(IKtvService.class)).currentIsMultipleKtvMode()) {
                C77544Ghe c77544Ghe7 = C77543Ghd.f6432LJ;
                String LIZ7 = LK5.LIZ(2131588014, LK5.LIZ(2131584885));
                Intrinsics.checkNotNullExpressionValue(LIZ7, "");
                return c77544Ghe7.LIZ(7, "fail_play", LIZ7);
            } else if (C4492d.LIZLLL.LIZJ()) {
                C77544Ghe c77544Ghe8 = C77543Ghd.f6432LJ;
                String LIZ8 = LK5.LIZ(2131588014, LK5.LIZ(2131584970));
                Intrinsics.checkNotNullExpressionValue(LIZ8, "");
                return c77544Ghe8.LIZ(9, "fail_play", LIZ8);
            } else if (C4398a.LIZJ.LIZJ()) {
                C77544Ghe c77544Ghe9 = C77543Ghd.f6432LJ;
                String LIZ9 = LK5.LIZ(2131588014, LK5.LIZ(2131582949));
                Intrinsics.checkNotNullExpressionValue(LIZ9, "");
                return c77544Ghe9.LIZ(10, "fail_play", LIZ9);
            }
        }
        return C77543Ghd.f6432LJ.LIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.p343b.AbstractC4286c
    public final String LIZ(int i) {
        C6174n LIZJ;
        boolean m15545LJ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 18);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C78411Gvd c78411Gvd = C5056a.LIZJ;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c78411Gvd, C78411Gvd.LIZ, false, 9);
        if (proxy2.isSupported) {
            m15545LJ = ((Boolean) proxy2.result).booleanValue();
        } else {
            C5056a LIZ = c78411Gvd.LIZ();
            if (LIZ != null && (LIZJ = LIZ.LIZJ()) != null) {
                m15545LJ = LIZJ.m15545LJ();
            }
            C88440Kt0.LIZ(2131588011);
            C78391GvJ.LIZIZ.LIZ("fail_member_cnt", i, this.LJIIIIZZ);
            return "cnt";
        }
        if (m15545LJ) {
            boolean mo22927LJ = ((IUserService) ServiceManager.getService(IUserService.class)).user().mo22927LJ();
            if (!LJIIL() && !mo22927LJ) {
                return "";
            }
            ALogger.m15797i("TeamFightWidget", "start team fight duration=" + i);
            long currentTimeMillis = System.currentTimeMillis();
            Disposable subscribe = ((LinkProfitApi) C88306Kqq.LIZ().LIZ(LinkProfitApi.class)).startTeamFight(LJIILIIL().getId(), i).compose(C100839PnV.LIZJ()).subscribe(new C78633GzD(this, currentTimeMillis, i), new C78632GzC<>(this, i, currentTimeMillis));
            Intrinsics.checkNotNullExpressionValue(subscribe, "");
            LIZ(subscribe);
            return "";
        }
        C88440Kt0.LIZ(2131588011);
        C78391GvJ.LIZIZ.LIZ("fail_member_cnt", i, this.LJIIIIZZ);
        return "cnt";
    }

    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public void onMessage(IMessage iMessage) {
        C9605p c9605p;
        String LIZ;
        C6174n c6174n;
        C6174n c6174n2;
        C6174n LJIILLIIL;
        String str;
        C6174n c6174n3;
        C6174n c6174n4;
        C6174n c6174n5;
        C6174n c6174n6;
        if (PatchProxy.proxy(new Object[]{iMessage}, this, LIZIZ, false, 29).isSupported) {
            return;
        }
        if (iMessage instanceof C8866fg) {
            C8866fg c8866fg = (C8866fg) iMessage;
            C6174n c6174n7 = c8866fg.LIZJ;
            Intrinsics.checkNotNullExpressionValue(c6174n7, "");
            if (!c6174n7.LJFF()) {
                return;
            }
            ALogger.m15797i("TeamFightWidget", "onReceive " + iMessage);
            int i = c8866fg.LIZIZ;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5 && !PatchProxy.proxy(new Object[]{c8866fg}, this, LIZIZ, false, 35).isSupported && (c6174n6 = c8866fg.LIZJ) != null) {
                                C78639GzJ c78639GzJ = C78639GzJ.LIZIZ;
                                String b_c = LJIILL().toString();
                                if (!PatchProxy.proxy(new Object[]{c6174n6, b_c}, c78639GzJ, C78639GzJ.LIZ, false, 12).isSupported) {
                                    C106862S5w.LIZ(c6174n6, b_c);
                                    if (c78639GzJ.LIZ()) {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("fight_info", c6174n6);
                                        jSONObject.put("current_state", b_c);
                                        C78639GzJ.LIZ(c78639GzJ, "receive_fight_finish_msg", jSONObject, false, 4, null);
                                    }
                                }
                                this.LJIILJJIL.LIZ(new b$a.C5060d(c6174n6, c8866fg.LIZLLL));
                            }
                        } else if (!PatchProxy.proxy(new Object[]{c8866fg}, this, LIZIZ, false, 34).isSupported && (c6174n5 = c8866fg.LIZJ) != null) {
                            C78639GzJ c78639GzJ2 = C78639GzJ.LIZIZ;
                            String b_c2 = LJIILL().toString();
                            if (!PatchProxy.proxy(new Object[]{c6174n5, b_c2}, c78639GzJ2, C78639GzJ.LIZ, false, 11).isSupported) {
                                C106862S5w.LIZ(c6174n5, b_c2);
                                if (c78639GzJ2.LIZ()) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("fight_info", c6174n5);
                                    jSONObject2.put("current_state", b_c2);
                                    C78639GzJ.LIZ(c78639GzJ2, "receive_punish_msg", jSONObject2, false, 4, null);
                                }
                            }
                            this.LJIILJJIL.LIZ(new b$a.C5063g(c6174n5));
                        }
                    } else if (!PatchProxy.proxy(new Object[]{c8866fg}, this, LIZIZ, false, 33).isSupported && (c6174n4 = c8866fg.LIZJ) != null) {
                        this.LJIILJJIL.LIZ(new b$a.C5066j(c6174n4));
                    }
                } else if (!PatchProxy.proxy(new Object[]{c8866fg}, this, LIZIZ, false, 32).isSupported && (c6174n3 = c8866fg.LIZJ) != null) {
                    C78639GzJ c78639GzJ3 = C78639GzJ.LIZIZ;
                    String b_c3 = LJIILL().toString();
                    if (!PatchProxy.proxy(new Object[]{c6174n3, b_c3}, c78639GzJ3, C78639GzJ.LIZ, false, 10).isSupported) {
                        C106862S5w.LIZ(c6174n3, b_c3);
                        if (c78639GzJ3.LIZ()) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("fight_info", c6174n3);
                            jSONObject3.put("current_state", b_c3);
                            C78639GzJ.LIZ(c78639GzJ3, "receive_team_fight_start_msg", jSONObject3, false, 4, null);
                        }
                    }
                    this.LJIILJJIL.LIZ(new b$a.C5065i(c6174n3));
                }
            } else if (!PatchProxy.proxy(new Object[]{c8866fg}, this, LIZIZ, false, 31).isSupported && (c6174n2 = c8866fg.LIZJ) != null) {
                if (LJIILLIIL().LIZJ == c6174n2.LIZJ && LJIILL().LIZIZ()) {
                    StringBuilder sb = new StringBuilder("fight has created current=");
                    sb.append(LJIILL());
                    sb.append(LoggerUtil.BLANK_TAG);
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[0], LJIILLIIL(), C6174n.LIZ, false, 8);
                    if (proxy.isSupported) {
                        str = (String) proxy.result;
                    } else {
                        str = "TeamFightInfo{fightId=" + LJIILLIIL.LIZJ + ", status=" + LJIILLIIL.LJFF + ", duration=" + LJIILLIIL.LJII + '}';
                    }
                    sb.append(str);
                    ALogger.m15800e("TeamFightWidget", sb.toString());
                } else {
                    C78639GzJ c78639GzJ4 = C78639GzJ.LIZIZ;
                    String b_c4 = LJIILL().toString();
                    if (!PatchProxy.proxy(new Object[]{c6174n2, b_c4}, c78639GzJ4, C78639GzJ.LIZ, false, 9).isSupported) {
                        C106862S5w.LIZ(c6174n2, b_c4);
                        if (c78639GzJ4.LIZ()) {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("fight_info", c6174n2);
                            jSONObject4.put("current_state", b_c4);
                            C78639GzJ.LIZ(c78639GzJ4, "receive_team_fight_create_msg", jSONObject4, false, 4, null);
                        }
                    }
                    this.LJIILJJIL.LIZ(new b$a.C5058b(c6174n2));
                }
            }
        }
        if (iMessage instanceof C8869fh) {
            C8869fh c8869fh = (C8869fh) iMessage;
            C6174n c6174n8 = c8869fh.LIZIZ;
            Intrinsics.checkNotNullExpressionValue(c6174n8, "");
            if (!c6174n8.LJFF()) {
                ALogger.m15797i("TeamFightWidget", "intercept: fightType = " + c8869fh.LIZIZ.f26902LJ);
                return;
            } else if (LJIIJ()) {
                ALogger.m15797i("TeamFightWidget", "intercept " + this.LIZJ + LoggerUtil.BLANK_TAG + iMessage);
                return;
            } else {
                ALogger.m15797i("TeamFightWidget", "onReceive " + iMessage);
                LIZ(c8869fh);
                if (!PatchProxy.proxy(new Object[]{c8869fh}, this, LIZIZ, false, 36).isSupported && (c6174n = c8869fh.LIZIZ) != null) {
                    if (LJIILL().LIZLLL() && c6174n.LIZJ == LJIILLIIL().LIZJ) {
                        ALogger.m15800e("TeamFightWidget", "not consume score message when " + LJIILL() + LoggerUtil.BLANK_TAG + LJIILLIIL());
                    } else {
                        this.LJIILJJIL.LIZ(new b$a.C5066j(c6174n));
                    }
                }
            }
        }
        if (iMessage instanceof LinkMicGuideMessage) {
            LinkMicGuideMessage linkMicGuideMessage = (LinkMicGuideMessage) iMessage;
            if (linkMicGuideMessage.LIZJ == 8 && linkMicGuideMessage.LJIIJJI != null) {
                LinkMicGuideMessage.C8715n c8715n = linkMicGuideMessage.LJIIJJI;
                if (c8715n != null) {
                    c9605p = c8715n.LIZ;
                } else {
                    c9605p = null;
                }
                if (!PatchProxy.proxy(new Object[]{c9605p}, this, LIZIZ, false, 37).isSupported) {
                    if (c9605p != null && (LIZ = c9605p.LIZ()) != null) {
                        LIZ.toString();
                    } else {
                        LIZ = LK5.LIZ(2131587991);
                    }
                    C6532d c6532d = new C6532d(LIZ, null, null, 0, null, null, 1001, 0, MapsKt__MapsJVMKt.mapOf(TuplesKt.m137to(PushMessageHelper.MESSAGE_TYPE, "grouppk")), 0, 702);
                    if (!LJIILIIL().isLiveTypeAudio()) {
                        DataCenter dataCenter = this.dataCenter;
                        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
                        if (LIZ(dataCenter)) {
                            ALogger.m15795w("TeamFightWidget", "onGuideBubbleShow " + c9605p + LoggerUtil.BLANK_TAG + c6532d);
                            this.dataCenter.put("cmd_show_self_bubble_on_openplatform_behavior", c6532d);
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.p343b.AbstractC4286c
    public final void LIZ(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 14).isSupported) {
            return;
        }
        this.LJIIIZ = new C78389GvH(i, i2);
        ALogger.m15797i("TeamFightWidget", "markStateBeforeFight: scene=" + i + " playMode=" + i2);
    }

    public C77543Ghd LIZ(int i, long j, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), new Long(j), str}, this, LIZIZ, false, 15);
        if (proxy.isSupported) {
            return (C77543Ghd) proxy.result;
        }
        C106862S5w.LIZ(str);
        C77543Ghd LIZ = C77524GhK.LIZ(this, null, 1, null);
        if (LIZ.LIZ()) {
            LIZ(i, j);
        }
        return LIZ;
    }
}
