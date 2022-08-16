package com.bytedance.android.live.liveinteract.linkroomfight.core;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.UserAttr;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.utils.NetworkUtils;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.fulllink.LinkMonitorData;
import com.bytedance.android.live.liveinteract.linkroomfight.api.LinkRoomFightApi;
import com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightWidget;
import com.bytedance.android.live.liveinteract.linkroomfight.dialog.n$b;
import com.bytedance.android.live.liveinteract.plantform.api.LinkProfitApi;
import com.bytedance.android.live.liveinteract.plantform.model.C4816k;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.videotalk.quickinteract.AbstractC4936a;
import com.bytedance.android.live.liveinteract.voicechat.AbstractC5004d;
import com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.model.interact.C6156ao;
import com.bytedance.android.livesdk.chatroom.model.interact.C6158ap;
import com.bytedance.android.livesdk.chatroom.model.interact.C6174n;
import com.bytedance.android.livesdk.chatroom.p517u.C6305j;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.dynamic.C6514m;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar_behavior.p528a.C6532d;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.C8866fg;
import com.bytedance.android.livesdk.message.model.C8869fh;
import com.bytedance.android.livesdk.reddot.C9225a;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9540m;
import com.bytedance.android.livesdkapi.depend.model.live.linker.CrossRoomLinkType;
import com.bytedance.android.livesdkapi.depend.model.live.linker.FinishReason;
import com.bytedance.android.livesdkapi.depend.model.live.linker.FinishType;
import com.bytedance.android.livesdkapi.depend.model.live.linker.InviteSource;
import com.bytedance.android.livesdkapi.depend.model.live.linker.SelectGuestsType;
import com.bytedance.android.livesdkapi.depend.model.live.linker.StartType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
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
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC103391QnZ;
import p003X.AbstractC413392Xt;
import p003X.AbstractC4569445g;
import p003X.AbstractC78468GwY;
import p003X.AbstractC78986HBs;
import p003X.C100839PnV;
import p003X.C103385QnT;
import p003X.C106862S5w;
import p003X.C1DL;
import p003X.C2TE;
import p003X.C2WC;
import p003X.C3VF;
import p003X.C409882Kg;
import p003X.C413202Xa;
import p003X.C421792mb;
import p003X.C423702pg;
import p003X.C439993ar;
import p003X.C77262Gd6;
import p003X.C77263Gd7;
import p003X.C77266GdA;
import p003X.C77270GdE;
import p003X.C77543Ghd;
import p003X.C78463GwT;
import p003X.C78486Gwq;
import p003X.C78612Gys;
import p003X.C78627Gz7;
import p003X.C78786H4a;
import p003X.C78787H4b;
import p003X.C78788H4c;
import p003X.C78789H4d;
import p003X.C78790H4e;
import p003X.C78793H4h;
import p003X.C78801H4p;
import p003X.C78802H4q;
import p003X.C78803H4r;
import p003X.C78804H4s;
import p003X.C78805H4t;
import p003X.C78806H4u;
import p003X.C78807H4v;
import p003X.C78808H4w;
import p003X.C78828H5q;
import p003X.C78833H5v;
import p003X.C79046HEa;
import p003X.C79111HGn;
import p003X.C79142HHs;
import p003X.C79220HKs;
import p003X.C79242HLo;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.H44;
import p003X.H45;
import p003X.H48;
import p003X.H49;
import p003X.H4A;
import p003X.H4B;
import p003X.H4E;
import p003X.H4F;
import p003X.H4G;
import p003X.H4H;
import p003X.H4I;
import p003X.H4J;
import p003X.H4K;
import p003X.H4L;
import p003X.H4M;
import p003X.H4N;
import p003X.H4O;
import p003X.H4R;
import p003X.H4U;
import p003X.H4Y;
import p003X.H4Z;
import p003X.H5C;
import p003X.H5L;
import p003X.IQV;
import p003X.IQX;
import p003X.QB4;

/* loaded from: classes3.dex */
public class LinkRoomFightWidget extends RoomWidget implements AbstractC4491b, AbstractC4569445g, OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;

    /* renamed from: LJ */
    public C4492d f26335LJ;
    public IMessageManager LJIIIZ;
    public C79220HKs LJIIJJI;
    public C78790H4e LJIIL;
    public H5C LJIILIIL;
    public H4F LJIILJJIL;
    public Disposable LJIILLIIL;
    public Disposable LJIIZILJ;
    public Disposable LJIJ;
    public Disposable LJIJI;
    public String LIZJ = "";
    public InviteSource LJIIIIZZ = InviteSource.UNKNOWN;
    public StartType LIZLLL = StartType.UNKNOWN;
    public final Lazy LJIIJ = LazyKt__LazyJVMKt.lazy(LinkRoomFightWidget$selfRoomId$2.INSTANCE);
    public final C78786H4a LJFF = new C78786H4a(new LinkRoomFightWidget$stateMachine$1(this));
    public long LJI = 5;
    public CompositeDisposable LJIILL = new CompositeDisposable();
    public final AbstractC6524y.AbstractView$OnClickListenerC6525b LJII = new AbstractC6524y.AbstractView$OnClickListenerC6525b() { // from class: X.3cm
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(27630);
        }

        @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
        public final void LIZ(C2TD c2td) {
            if (PatchProxy.proxy(new Object[]{c2td}, this, LIZ, false, 2).isSupported) {
                return;
            }
            C106862S5w.LIZ(c2td);
        }

        @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
        public final void LIZ(View view, DataCenter dataCenter) {
            boolean z = PatchProxy.proxy(new Object[]{view, dataCenter}, this, LIZ, false, 3).isSupported;
        }

        @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
        public final void LIZ(C6514m c6514m) {
            boolean z = PatchProxy.proxy(new Object[]{c6514m}, this, LIZ, false, 5).isSupported;
        }

        @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
        public final void LIZ(boolean z) {
            boolean z2 = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 6).isSupported;
        }

        @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
        public final C9225a LIZIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
            if (proxy.isSupported) {
                return (C9225a) proxy.result;
            }
            return null;
        }

        @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
        public final void LIZIZ(View view, DataCenter dataCenter) {
            boolean z = PatchProxy.proxy(new Object[]{view, dataCenter}, this, LIZ, false, 4).isSupported;
        }

        @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
        public final void LIZIZ(C6514m c6514m) {
            boolean z = PatchProxy.proxy(new Object[]{c6514m}, this, LIZ, false, 9).isSupported;
        }

        @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
        public final boolean aK_() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            return false;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IInteractService iInteractService;
            if (!PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported && (iInteractService = (IInteractService) ServiceManager.getService(IInteractService.class)) != null) {
                iInteractService.clickLinkRoomFightIcon("interact_panel");
            }
        }
    };

    static {
        Covode.recordClassIndex(27603);
    }

    public final long LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Long) proxy.result).longValue() : ((Number) this.LJIIJ.mo27335getValue()).longValue();
    }

    public void LJII() {
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 51).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final boolean LIZ(Disposable disposable) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(disposable);
        return this.LJIILL.add(disposable);
    }

    public final void LIZ(boolean z) {
        IUserService iUserService;
        C3VF user;
        IUser LIZ2;
        UserAttr userAttr;
        List<Integer> list;
        boolean z2 = true;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        boolean mo22927LJ = ((IUserService) ServiceManager.getService(IUserService.class)).user().mo22927LJ();
        boolean z3 = z || !((iUserService = (IUserService) ServiceManager.getService(IUserService.class)) == null || (user = iUserService.user()) == null || (LIZ2 = user.LIZ()) == null || (userAttr = LIZ2.getUserAttr()) == null || (list = userAttr.LIZLLL) == null || !list.contains(Integer.valueOf(C421792mb.LJIIJ().LIZIZ)));
        if (C413202Xa.LIZIZ().LIZJ(ToolbarButton.ROOM_FIGHT_ADMIN) == null) {
            z2 = false;
        }
        ALogger.m15797i("LinkRoomFightWidget", "isAdmin " + mo22927LJ + ", hasPrivilege:" + z3 + ", exit:" + z2);
        if (!mo22927LJ || !z3) {
            if (!z2) {
                return;
            }
            C413202Xa.LIZIZ().LIZIZ(ToolbarButton.ROOM_FIGHT_ADMIN, this.LJII);
        } else if (z2) {
        } else {
            C413202Xa.LIZIZ().LIZ(ToolbarButton.ROOM_FIGHT_ADMIN, this.LJII);
        }
    }

    public final void LIZ(AbstractC103391QnZ<? extends e$c, ? extends e$a, ? extends e$b> abstractC103391QnZ) {
        e$b e_b;
        C5923dp LIZ2;
        AbstractC413392Xt<C6305j> LJJJJZ;
        C6305j LIZIZ;
        C2WC<Room> LIZ3;
        Room LIZ4;
        AbstractC5004d LIZ5;
        C78833H5v LJIJJ;
        C6158ap LIZLLL;
        C2WC<Room> LIZ6;
        Room LIZ7;
        C78833H5v LJIJJ2;
        AbstractC413392Xt<C6305j> LJJJJZ2;
        C6305j LIZIZ2;
        if (PatchProxy.proxy(new Object[]{abstractC103391QnZ}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C103385QnT c103385QnT = (C103385QnT) (!(abstractC103391QnZ instanceof C103385QnT) ? null : abstractC103391QnZ);
        if (c103385QnT == null || (e_b = (e$b) c103385QnT.LIZJ) == null) {
            return;
        }
        e$c e_c = (e$c) ((C103385QnT) abstractC103391QnZ).LIZIZ;
        e$c LIZ8 = abstractC103391QnZ.LIZ();
        C6174n c6174n = e_c.LIZ;
        e$a LIZIZ3 = abstractC103391QnZ.LIZIZ();
        C78627Gz7 c78627Gz7 = C78627Gz7.LIZIZ;
        if (!PatchProxy.proxy(new Object[]{LIZIZ3, LIZ8, e_c}, c78627Gz7, C78627Gz7.LIZ, false, 5).isSupported) {
            C106862S5w.LIZ(LIZIZ3, LIZ8, e_c);
            JSONObject jSONObject = new JSONObject();
            c78627Gz7.LIZ(jSONObject);
            jSONObject.put("from_action", LIZIZ3.LIZ);
            jSONObject.put("from_state", LIZ8.LIZIZ);
            jSONObject.put("to_state", e_c.LIZIZ);
            C78627Gz7.LIZ(c78627Gz7, "state_machine_transition", jSONObject, null, 4, null);
        }
        ALogger.m15797i("LinkRoomFightWidget", "listenState: fromAction = " + LIZIZ3 + ", fromState = " + LIZ8 + ", toState = " + e_c);
        C4492d c4492d = this.f26335LJ;
        if (c4492d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c4492d.LIZIZ().LIZ(c6174n);
        C4492d c4492d2 = this.f26335LJ;
        if (c4492d2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c4492d2.LIZJ().LIZ(e_c);
        if (e_c.m15731LJ()) {
            C5923dp LIZ9 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
            if (LIZ9 != null && (LJJJJZ2 = LIZ9.LJJJJZ()) != null && (LIZIZ2 = LJJJJZ2.LIZIZ()) != null) {
                LIZIZ2.LIZIZ(16);
            }
        } else if (e_c.LIZ() && (LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null)) != null && (LJJJJZ = LIZ2.LJJJJZ()) != null && (LIZIZ = LJJJJZ.LIZIZ()) != null) {
            LIZIZ.LIZ(16);
        }
        if (LIZ8.LIZ() && e_c.m15731LJ()) {
            if (!m15733LJ()) {
                H4B h4b = H4B.LIZIZ;
                if (!PatchProxy.proxy(new Object[0], h4b, H4B.LIZ, false, 27).isSupported) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    h4b.LIZ(linkedHashMap);
                    linkedHashMap.put("seat_fit_status", "off");
                    C5923dp LIZ10 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                    if (LIZ10 != null && (LIZ6 = LIZ10.LIZ()) != null && (LIZ7 = LIZ6.LIZ()) != null && LIZ7.isLiveTypeAudio()) {
                        AbstractC5015e LIZ11 = AbstractC5015e.LIZIZ.LIZ();
                        if (LIZ11 == null || (LJIJJ2 = LIZ11.LJIL()) == null) {
                            AbstractC5004d LIZ12 = AbstractC5004d.LIZIZ.LIZ();
                            if (LIZ12 != null) {
                                LJIJJ2 = LIZ12.LJIJJ();
                            }
                        }
                        if (LJIJJ2 != null) {
                            C78833H5v.LIZ(LJIJJ2, (String) null, (String) null, (Integer) 16, (Map) linkedHashMap, 3, (Object) null);
                        }
                    } else {
                        C78828H5q.LIZ((String) null, (String) null, (Integer) 16, (Map) linkedHashMap, 3, (Object) null);
                    }
                }
                C79046HEa LIZ13 = C79046HEa.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ13, "");
                if (LIZ13.LIZJ() && (LIZLLL = C78612Gys.LIZLLL(c6174n)) != null && LIZLLL.LIZ(C79242HLo.LIZ()) != null) {
                    H4B.LIZIZ.LIZLLL("processing");
                }
            } else if (!PatchProxy.proxy(new Object[0], H4B.LIZIZ, H4B.LIZ, false, 28).isSupported) {
                C5923dp LIZ14 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                if (LIZ14 != null && (LIZ3 = LIZ14.LIZ()) != null && (LIZ4 = LIZ3.LIZ()) != null && LIZ4.isLiveTypeAudio()) {
                    AbstractC5015e LIZ15 = AbstractC5015e.LIZIZ.LIZ();
                    if ((LIZ15 != null && (LJIJJ = LIZ15.LJIL()) != null) || ((LIZ5 = AbstractC5004d.LIZIZ.LIZ()) != null && (LJIJJ = LIZ5.LJIJJ()) != null)) {
                        C78833H5v.LIZ(LJIJJ, (String) null, (String) null, (Integer) 16, 3, (Object) null);
                    }
                } else {
                    C78828H5q.LIZ((String) null, (String) null, (Integer) 16, 3, (Object) null);
                }
            }
        }
        if (Intrinsics.areEqual(e_b, C78806H4u.LIZIZ)) {
            if (!PatchProxy.proxy(new Object[]{c6174n}, this, LIZ, false, 17).isSupported) {
                long LIZ16 = c6174n.LIZ();
                ALogger.m15797i("LinkRoomFightWidget", "startFightingCountDown: state = " + this.LJFF.LIZ().LIZIZ + ", countDownDuration = " + LIZ16);
                Disposable disposable = this.LJIIZILJ;
                if (disposable != null) {
                    disposable.dispose();
                }
                this.LJIIZILJ = Observable.timer(LIZ16, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new H4Y(this, c6174n));
            }
        } else if (!Intrinsics.areEqual(e_b, C78802H4q.LIZIZ)) {
            if (Intrinsics.areEqual(e_b, C78808H4w.LIZIZ)) {
                if (m15733LJ()) {
                    if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
                        ALogger.m15797i("LinkRoomFightWidget", "startWaitingResultCountDown: state = " + this.LJFF.LIZ().LIZIZ);
                        Disposable disposable2 = this.LJIJ;
                        if (disposable2 != null) {
                            disposable2.dispose();
                        }
                        if (!this.LJFF.LIZ().LIZIZ()) {
                            this.LJIJ = Observable.timer(this.LJI, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new H4U(this));
                        }
                    }
                } else if (LJIIJJI()) {
                    LIZJ("guest fighting time up");
                }
            } else if (Intrinsics.areEqual(e_b, C78805H4t.LIZIZ)) {
                if (!PatchProxy.proxy(new Object[]{c6174n}, this, LIZ, false, 19).isSupported) {
                    ALogger.m15797i("LinkRoomFightWidget", "startPunishingCountDown: ");
                    LJIIIZ();
                    this.LJIJI = Observable.timer(c6174n.LIZJ() + this.LJI, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new H4Z(this, c6174n));
                }
            } else if (!Intrinsics.areEqual(e_b, C78807H4v.LIZIZ)) {
                if (e_b instanceof C78803H4r) {
                    C8866fg.C8868b c8868b = ((C78803H4r) e_b).LIZIZ;
                    if (!PatchProxy.proxy(new Object[]{c8868b}, this, LIZ, false, 21).isSupported && c8868b != null && c8868b.f27898LJ) {
                        if (!m15733LJ() && LJIIJJI()) {
                            String str = c8868b.LIZJ;
                            if (str != null && str.length() != 0) {
                                C88440Kt0.LIZ(c8868b.LIZJ);
                            } else {
                                C88440Kt0.LIZ(2131584226);
                            }
                        } else {
                            String str2 = c8868b.LIZIZ;
                            if (str2 != null && str2.length() != 0) {
                                C88440Kt0.LIZ(c8868b.LIZIZ);
                            } else {
                                C88440Kt0.LIZ(2131584225);
                            }
                        }
                    }
                } else {
                    Intrinsics.areEqual(e_b, C78804H4s.LIZIZ);
                }
            }
        }
        C4492d c4492d3 = this.f26335LJ;
        if (c4492d3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c4492d3.m15732LJ().LIZ(e_b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:301:0x06d0  */
    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMessage(com.p1594ss.ugc.live.sdk.message.data.IMessage r22) {
        /*
            Method dump skipped, instructions count: 2776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.linkroomfight.core.LinkRoomFightWidget.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    @Override // com.bytedance.android.live.liveinteract.linkroomfight.core.AbstractC4491b
    public final void LIZ(String str) {
        C79220HKs LIZIZ;
        FragmentManager supportFragmentManager;
        C79220HKs c79220HKs;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 30).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        C77543Ghd LIZ2 = C78486Gwq.LIZ(((IInteractService) service).getCurrentScene());
        if (!LIZ2.LIZ()) {
            C88440Kt0.LIZ(LIZ2.LIZLLL);
            H4B.LIZIZ.LIZ(str, LIZ2.LIZ() ? "fail_layout" : "fail_ongoing");
            H4E h4e = H4E.LJIIIIZZ;
            String str2 = LIZ2.LIZLLL;
            if (PatchProxy.proxy(new Object[]{str2}, h4e, H4E.LIZ, false, 4).isSupported) {
                return;
            }
            C106862S5w.LIZ(str2);
            if (!h4e.LIZ().booleanValue()) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            C78793H4h.LIZ(jSONObject, "failure_reason", str2);
            C79111HGn.LIZ(C79111HGn.LIZJ, LinkMonitorData.CreateRoomBattlePreCheck, jSONObject, H4E.LIZIZ, 0, (String) null, 24, (Object) null);
            return;
        }
        H4B.LIZIZ.LIZ(str, "success");
        C79220HKs c79220HKs2 = this.LJIIJJI;
        if (c79220HKs2 != null && c79220HKs2.LJIILIIL()) {
            return;
        }
        C79142HHs LIZ3 = C79220HKs.LIZ(this.dataCenter, this);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, LIZ3, C79142HHs.LIZ, false, 17);
        if (proxy.isSupported) {
            LIZIZ = (C79220HKs) proxy.result;
        } else {
            LIZ3.LJIIIIZZ = str;
            LIZIZ = LIZ3.LIZIZ(19);
        }
        this.LJIIJJI = LIZIZ;
        FragmentActivity LIZIZ2 = C439993ar.LIZIZ(this.context);
        if (LIZIZ2 == null || (supportFragmentManager = LIZIZ2.getSupportFragmentManager()) == null || (c79220HKs = this.LJIIJJI) == null) {
            return;
        }
        c79220HKs.show(supportFragmentManager, "LinkDialog");
    }

    public final void LIZ(List<C9540m> list, long j, String str) {
        FragmentManager supportFragmentManager;
        H5C h5c;
        if (PatchProxy.proxy(new Object[]{list, new Long(j), str}, this, LIZ, false, 33).isSupported) {
            return;
        }
        H5C h5c2 = this.LJIILIIL;
        if (h5c2 != null && h5c2.LJIILIIL()) {
            return;
        }
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        AbstractC78986HBs<LinkPlayerInfo> linkUserInfoCenter = ((IInteractService) service).getLinkUserInfoCenter();
        Intrinsics.checkNotNullExpressionValue(linkUserInfoCenter, "");
        List<LinkPlayerInfo> LIZJ = linkUserInfoCenter.LIZJ();
        Intrinsics.checkNotNullExpressionValue(LIZJ, "");
        this.LJIILIIL = H5C.LIZLLL.LIZ(new n$b(list, LIZJ, this.LIZJ, j, str));
        FragmentActivity LIZIZ = C439993ar.LIZIZ(this.context);
        if (LIZIZ == null || (supportFragmentManager = LIZIZ.getSupportFragmentManager()) == null || (h5c = this.LJIILIIL) == null) {
            return;
        }
        h5c.show(supportFragmentManager, "LinkRoomFightSelectGuestsDialog");
    }

    @Override // com.bytedance.android.live.liveinteract.linkroomfight.core.AbstractC4491b
    public final void LIZ(C78787H4b c78787H4b) {
        if (PatchProxy.proxy(new Object[]{c78787H4b}, this, LIZ, false, 36).isSupported) {
            return;
        }
        C106862S5w.LIZ(c78787H4b);
        if (!NetworkUtils.LIZIZ(this.context)) {
            C88440Kt0.LIZ(2131584244);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.LJIILL.add(((LinkRoomFightApi) C88306Kqq.LIZ().LIZ(LinkRoomFightApi.class)).reply(c78787H4b.LIZIZ.value, CrossRoomLinkType.TWO_ROOM.value, LJI(), c78787H4b.LIZJ.LIZIZ, c78787H4b.LIZLLL).compose(C100839PnV.LIZJ()).subscribe(new H4J(this, c78787H4b, currentTimeMillis), new H4M<>(this, currentTimeMillis, c78787H4b)));
    }

    @Override // com.bytedance.android.live.liveinteract.linkroomfight.core.AbstractC4491b
    public final void LIZ(FinishType finishType, FinishReason finishReason) {
        if (PatchProxy.proxy(new Object[]{finishType, finishReason}, this, LIZ, false, 41).isSupported) {
            return;
        }
        C106862S5w.LIZ(finishType, finishReason);
        if (finishReason == FinishReason.FALLBACK) {
            C88440Kt0.LIZ(2131584223);
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.LJIILL.add(((LinkRoomFightApi) C88306Kqq.LIZ().LIZ(LinkRoomFightApi.class)).finishRoomBattle(LJI(), finishType.value, finishReason.value).compose(C100839PnV.LIZJ()).subscribe(new H4K(this, finishReason, finishType, currentTimeMillis), new H4N<>(this, finishType, finishReason, currentTimeMillis)));
    }

    public final void LIZ(C6174n c6174n, e$c e_c, FinishReason finishReason) {
        String str;
        String str2;
        C6156ao.C6157a c6157a;
        List<Long> list;
        C6156ao.C6157a c6157a2;
        List<Long> list2;
        if (PatchProxy.proxy(new Object[]{c6174n, e_c, finishReason}, this, LIZ, false, 50).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6174n, e_c, finishReason);
        if (!m15733LJ() && !((IUserService) ServiceManager.getService(IUserService.class)).user().mo22927LJ()) {
            return;
        }
        C4492d c4492d = this.f26335LJ;
        if (c4492d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!c4492d.LIZJ().LIZ().m15731LJ()) {
            return;
        }
        int i = C78463GwT.LIZ[finishReason.ordinal()];
        if (i == 1 || i == 2) {
            str = "chatroom_over";
        } else if (i == 3) {
            str = "over";
        } else if (i != 4) {
            str = i != 5 ? "break" : "peakhour";
        } else {
            str = "again";
        }
        long currentTimeMillis = System.currentTimeMillis();
        C4492d c4492d2 = this.f26335LJ;
        if (c4492d2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        long longValue = (currentTimeMillis - c4492d2.LJFF().LIZ().longValue()) / 1000;
        String str3 = this.LIZJ.equals("invitation") ? "invitee" : "inviter";
        if (e_c.LIZLLL()) {
            str2 = "punish_finish";
        } else {
            str2 = e_c.LIZJ() ? "punish" : "processing";
        }
        H4B h4b = H4B.LIZIZ;
        String str4 = this.LIZJ;
        long j = c6174n.LJII;
        long min = Math.min(longValue, c6174n.LJII);
        C6158ap m23794LJ = C78612Gys.m23794LJ(c6174n);
        long j2 = m23794LJ != null ? m23794LJ.LIZJ : 0L;
        C6158ap LIZLLL = C78612Gys.LIZLLL(c6174n);
        int i2 = LIZLLL != null ? (int) LIZLLL.LIZLLL : 0;
        C6158ap m23794LJ2 = C78612Gys.m23794LJ(c6174n);
        int i3 = m23794LJ2 != null ? (int) m23794LJ2.LIZLLL : 0;
        C6158ap LIZLLL2 = C78612Gys.LIZLLL(c6174n);
        h4b.LIZ(str4, str, j, min, j2, i2, i3, (LIZLLL2 == null || (c6157a2 = LIZLLL2.LJI) == null || (list2 = c6157a2.LIZIZ) == null) ? 0 : list2.size(), str3, str2);
        H4E h4e = H4E.LJIIIIZZ;
        String str5 = this.LIZJ;
        long j3 = c6174n.LJII;
        long min2 = Math.min(longValue, c6174n.LJII);
        C6158ap m23794LJ3 = C78612Gys.m23794LJ(c6174n);
        long j4 = m23794LJ3 != null ? m23794LJ3.LIZJ : 0L;
        C6158ap LIZLLL3 = C78612Gys.LIZLLL(c6174n);
        int i4 = LIZLLL3 != null ? (int) LIZLLL3.LIZLLL : 0;
        C6158ap m23794LJ4 = C78612Gys.m23794LJ(c6174n);
        int i5 = m23794LJ4 != null ? (int) m23794LJ4.LIZLLL : 0;
        C6158ap LIZLLL4 = C78612Gys.LIZLLL(c6174n);
        h4e.LIZ(str5, str, j3, min2, j4, i4, i5, (LIZLLL4 == null || (c6157a = LIZLLL4.LJI) == null || (list = c6157a.LIZIZ) == null) ? 0 : list.size(), str3, str2);
    }

    private final Room LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (Room) proxy.result;
        }
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        return C423702pg.LIZIZ(dataCenter);
    }

    /* renamed from: LJ */
    public final boolean m15733LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C423702pg.LIZIZ(this.dataCenter, false, 1, null);
    }

    public final C4492d LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (C4492d) proxy.result;
        }
        C4492d c4492d = this.f26335LJ;
        if (c4492d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c4492d;
    }

    private final void LJIIIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            return;
        }
        Disposable disposable = this.LJIILLIIL;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.LJIIZILJ;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        Disposable disposable3 = this.LJIJ;
        if (disposable3 != null) {
            disposable3.dispose();
        }
        Disposable disposable4 = this.LJIJI;
        if (disposable4 != null) {
            disposable4.dispose();
        }
    }

    private final boolean LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 42);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (m15733LJ()) {
            return false;
        }
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        return ((IInteractService) service).isAudienceLinkEngineOn();
    }

    private final boolean LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 47);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        C77543Ghd LIZ2 = C78486Gwq.LIZ(((IInteractService) service).getCurrentScene());
        if (!LIZ2.LIZ()) {
            C88440Kt0.LIZ(LIZ2.LIZLLL);
        }
        return LIZ2.LIZ();
    }

    @Override // p003X.AbstractC78380Gv8
    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 46);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C4492d c4492d = this.f26335LJ;
        if (c4492d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c4492d.LIZJ().LIZ().m15731LJ();
    }

    @Override // p003X.AbstractC78380Gv8
    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 43);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        SettingKey<Integer[]> settingKey = LiveConfigSettingKeys.LINK_ROOM_FIGHT_SUPPORT_SCENE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Integer[] value = settingKey.getValue();
        if (value == null) {
            return false;
        }
        return ArraysKt___ArraysKt.contains(value, Integer.valueOf(C79242HLo.LJIIJ()));
    }

    @Override // p003X.AbstractC78380Gv8
    public final C6174n LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 44);
        if (proxy.isSupported) {
            return (C6174n) proxy.result;
        }
        C4492d c4492d = this.f26335LJ;
        if (c4492d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c4492d.LIZIZ().LIZ();
    }

    private final void LJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            return;
        }
        C79220HKs c79220HKs = this.LJIIJJI;
        if (c79220HKs != null && c79220HKs.LJIILIIL()) {
            c79220HKs.dismiss();
        }
        C78790H4e c78790H4e = this.LJIIL;
        if (c78790H4e != null && c78790H4e.LJIILIIL()) {
            c78790H4e.dismiss();
        }
        H5C h5c = this.LJIILIIL;
        if (h5c != null && h5c.LJIILIIL()) {
            h5c.dismiss();
        }
        H4F h4f = this.LJIILJJIL;
        if (h4f != null && h4f.LJIILIIL()) {
            h4f.dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroomfight.core.AbstractC4491b
    public final void LIZLLL() {
        H4F h4f;
        FragmentManager supportFragmentManager;
        H4F h4f2;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 31).isSupported && !PatchProxy.proxy(new Object[0], this, LIZ, false, 34).isSupported) {
            H4F h4f3 = this.LJIILJJIL;
            if (h4f3 != null && h4f3.LJIILIIL()) {
                return;
            }
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], H4F.LIZIZ, C78801H4p.LIZ, false, 1);
            if (proxy.isSupported) {
                h4f = (H4F) proxy.result;
            } else {
                h4f = new H4F();
            }
            this.LJIILJJIL = h4f;
            FragmentActivity LIZIZ = C439993ar.LIZIZ(this.context);
            if (LIZIZ == null || (supportFragmentManager = LIZIZ.getSupportFragmentManager()) == null || (h4f2 = this.LJIILJJIL) == null) {
                return;
            }
            h4f2.show(supportFragmentManager, "LinkRoomFightFinishDialog");
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 45).isSupported) {
            return;
        }
        super.onDestroy();
        LJIIIZ();
        LJIIJ();
        C413202Xa.LIZIZ().LIZIZ(ToolbarButton.ROOM_FIGHT_ADMIN, this.LJII);
        C4492d c4492d = this.f26335LJ;
        if (c4492d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (c4492d.LIZJ().LIZ().m15731LJ()) {
            C4492d c4492d2 = this.f26335LJ;
            if (c4492d2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            C6174n LIZ2 = c4492d2.LIZIZ().LIZ();
            C4492d c4492d3 = this.f26335LJ;
            if (c4492d3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LIZ(LIZ2, c4492d3.LIZJ().LIZ(), FinishReason.LINKMIC_CLOSE);
            if (!m15733LJ()) {
                C79046HEa LIZ3 = C79046HEa.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                if (LIZ3.LIZJ()) {
                    H4B.LIZIZ.LIZJ();
                }
                H4B.LIZIZ.LIZIZ();
            } else {
                H4B.LIZIZ.LIZ();
            }
        }
        this.LJIILL.dispose();
        IMessageManager iMessageManager = this.LJIIIZ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        C3VF user;
        Observable<UserAttr> LJIIJ;
        Observable<UserAttr> observeOn;
        Disposable subscribe;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onCreate();
        this.LJIIIZ = (IMessageManager) this.dataCenter.get("data_message_manager");
        IMessageManager iMessageManager = this.LJIIIZ;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(MessageType.LINKER.LIZ(), this);
        }
        IMessageManager iMessageManager2 = this.LJIIIZ;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(MessageType.LINK_MIC_PROFIT.LIZ(), this);
        }
        IMessageManager iMessageManager3 = this.LJIIIZ;
        if (iMessageManager3 != null) {
            iMessageManager3.addMessageListener(MessageType.LINK_TEAM_FIGHT_MESSAGE.LIZ(), this);
        }
        IMessageManager iMessageManager4 = this.LJIIIZ;
        if (iMessageManager4 != null) {
            iMessageManager4.addMessageListener(MessageType.LINK_TEAM_FIGHT_SCORE_MESSAGE.LIZ(), this);
        }
        IMessageManager iMessageManager5 = this.LJIIIZ;
        if (iMessageManager5 != null) {
            iMessageManager5.addMessageListener(MessageType.LINK_MIC_GUIDE_MESSAGE.LIZ(), this);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            Pair LIZ2 = IQV.LIZ((Function0) LinkRoomFightWidget$initDataContext$pair$1.INSTANCE);
            C4492d c4492d = (C4492d) LIZ2.getFirst();
            c4492d.LIZ().LIZIZ(this);
            IQX.LIZ(c4492d, AbstractC78468GwY.class);
            this.LJIILL.add((Disposable) LIZ2.getSecond());
            this.f26335LJ = c4492d;
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            ALogger.m15797i("LinkRoomFightWidget", "initData, isAnchor = " + m15733LJ() + ", linkMap = " + C1DL.LIZ(LJIIIIZZ().linkMap));
            if (m15733LJ()) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
                    long currentTimeMillis = System.currentTimeMillis();
                    this.LJIILL.add(((LinkProfitApi) C88306Kqq.LIZ().LIZ(LinkProfitApi.class)).fetchTeamFightConfig().compose(C100839PnV.LIZJ()).subscribe(new C77266GdA(this, currentTimeMillis), new C77263Gd7<>(currentTimeMillis)));
                }
            } else {
                Map<String, Long> map = LJIIIIZZ().linkMap;
                if (map != null && map.containsKey("16")) {
                    LIZJ("init");
                }
            }
        }
        LJII();
        H4E.LJIIIIZZ.LIZIZ();
        if (!m15733LJ()) {
            LIZ(false);
            IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
            if (iUserService != null && (user = iUserService.user()) != null && (LJIIJ = user.LJIIJ()) != null && (observeOn = LJIIJ.observeOn(AndroidSchedulers.mainThread())) != null && (subscribe = observeOn.subscribe(new Consumer<UserAttr>() { // from class: X.2qP
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(27617);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(UserAttr userAttr) {
                    List<Integer> list;
                    UserAttr userAttr2 = userAttr;
                    boolean z = true;
                    if (!PatchProxy.proxy(new Object[]{userAttr2}, this, LIZ, false, 1).isSupported) {
                        if (userAttr2 == null || (list = userAttr2.LIZLLL) == null || !list.contains(Integer.valueOf(C421792mb.LJIIJ().LIZIZ))) {
                            z = false;
                        }
                        LinkRoomFightWidget.this.LIZ(z);
                        if (z) {
                            C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7183dz;
                            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                            Boolean LIZ3 = c87308Kak.LIZ();
                            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                            if (LIZ3.booleanValue()) {
                                C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.f7183dz;
                                Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                                c87308Kak2.LIZ(Boolean.FALSE);
                                AbstractC6524y LIZ4 = C413202Xa.LIZ();
                                ToolbarButton toolbarButton = ToolbarButton.MORE;
                                C422462ng c422462ng = C6532d.LJIIJJI;
                                String LIZ5 = LK5.LIZ(2131586450);
                                Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                                LIZ4.LIZ(toolbarButton, c422462ng.LIZ(LIZ5));
                            }
                        }
                    }
                }
            })) != null) {
                LIZ(subscribe);
            }
        }
    }

    private final void LIZ(C78788H4c c78788H4c) {
        FragmentManager supportFragmentManager;
        C78790H4e c78790H4e;
        if (PatchProxy.proxy(new Object[]{c78788H4c}, this, LIZ, false, 32).isSupported) {
            return;
        }
        if (c78788H4c.LIZLLL != StartType.START_AGAIN && !LJIIL()) {
            return;
        }
        C78790H4e c78790H4e2 = this.LJIIL;
        if (c78790H4e2 != null && c78790H4e2.LJIILIIL()) {
            return;
        }
        this.LJIIL = C78790H4e.LIZLLL.LIZ(c78788H4c);
        FragmentActivity LIZIZ = C439993ar.LIZIZ(this.context);
        if (LIZIZ != null && (supportFragmentManager = LIZIZ.getSupportFragmentManager()) != null && (c78790H4e = this.LJIIL) != null) {
            c78790H4e.show(supportFragmentManager, "LinkRoomFightReplyDialog");
        }
    }

    private final void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 15).isSupported) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.LJIILL.add(((LinkProfitApi) C88306Kqq.LIZ().LIZ(LinkProfitApi.class)).getPlayModeInfo(LJIIIIZZ().getId()).compose(C100839PnV.LIZJ()).subscribe(new H4R(this, currentTimeMillis), new C77262Gd6<>(str, currentTimeMillis)));
    }

    @Override // com.bytedance.android.live.liveinteract.linkroomfight.core.AbstractC4491b
    public final void LIZIZ(C78787H4b c78787H4b) {
        if (PatchProxy.proxy(new Object[]{c78787H4b}, this, LIZ, false, 39).isSupported) {
            return;
        }
        C106862S5w.LIZ(c78787H4b);
        if (!NetworkUtils.LIZIZ(this.context)) {
            C88440Kt0.LIZ(2131584244);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        StartType startType = StartType.START_AGAIN;
        this.LJIILL.add(((LinkRoomFightApi) C88306Kqq.LIZ().LIZ(LinkRoomFightApi.class)).replyRoomBattle(c78787H4b.LIZIZ.value, startType.value, LJI(), c78787H4b.LIZJ.LIZIZ, c78787H4b.LIZLLL).compose(C100839PnV.LIZJ()).subscribe(new H4G(this, c78787H4b, startType, currentTimeMillis), new H4H<>(this, c78787H4b, startType, currentTimeMillis)));
    }

    private final void LIZ(C8869fh c8869fh) {
        C4816k c4816k;
        C6174n c6174n;
        List<C6158ap> list;
        List<C6156ao> list2;
        Object obj;
        if (!PatchProxy.proxy(new Object[]{c8869fh}, this, LIZ, false, 13).isSupported && AbstractC4936a.LIZ.LIZIZ() && (c4816k = c8869fh.LIZJ) != null && (c6174n = c8869fh.LIZIZ) != null && (list = c6174n.LJIIJ) != null) {
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

    @Override // com.bytedance.android.live.liveinteract.linkroomfight.core.AbstractC4491b
    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 37).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (!NetworkUtils.LIZIZ(this.context)) {
            C88440Kt0.LIZ(2131584244);
            return;
        }
        this.LIZLLL = StartType.START_WITH_SWITCH_SCENE;
        long currentTimeMillis = System.currentTimeMillis();
        if (!PatchProxy.proxy(new Object[0], H4E.LJIIIIZZ, H4E.LIZ, false, 14).isSupported) {
            H4E.f6566LJ.clear();
            QB4.LIZ(Observable.combineLatest(H4E.LIZJ, H4E.LIZLLL, H5L.LIZIZ).retry(3L).subscribe(C77270GdE.LIZIZ, C78789H4d.LIZIZ), H4E.f6566LJ);
        }
        int i = CrossRoomLinkType.TWO_ROOM.value;
        int i2 = SelectGuestsType.SWITCH_SCENE_AND_UI_LAYOUT.value;
        String substring = str.substring(0, str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "");
        this.LJIILL.add(((LinkRoomFightApi) C88306Kqq.LIZ().LIZ(LinkRoomFightApi.class)).selectGuests(i, i2, substring, 16, 51, LJI()).compose(C100839PnV.LIZJ()).subscribe(new H4L(this, str, currentTimeMillis), new H4O<>(this, currentTimeMillis, str)));
    }

    public final void LIZ(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 20).isSupported) {
            return;
        }
        ALogger.m15797i("LinkRoomFightWidget", "startWaitingSwitchAndStartMsgCountDown: currRoomId + " + LJIIIIZZ().getId());
        this.LJIILLIIL = Observable.timer(j, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new H4I(this, j));
    }

    @Override // com.bytedance.android.live.liveinteract.linkroomfight.core.AbstractC4491b
    public final void LIZ(H4A h4a) {
        Object LIZ2;
        if (PatchProxy.proxy(new Object[]{h4a}, this, LIZ, false, 35).isSupported) {
            return;
        }
        C106862S5w.LIZ(h4a);
        H4E h4e = H4E.LJIIIIZZ;
        String str = h4a.LJFF;
        if (!PatchProxy.proxy(new Object[]{"begin", str}, h4e, H4E.LIZ, false, 3).isSupported) {
            C106862S5w.LIZ("begin", str);
            if (h4e.LIZ().booleanValue()) {
                JSONObject jSONObject = new JSONObject();
                C78793H4h.LIZ(jSONObject, "create_type", "begin");
                C78793H4h.LIZ(jSONObject, "request_page", str);
                C79111HGn.LIZ(C79111HGn.LIZJ, LinkMonitorData.StartCreateRoomBattle, jSONObject, H4E.LIZIZ, 0, (String) null, 24, (Object) null);
            }
        }
        if (!NetworkUtils.LIZIZ(this.context)) {
            C88440Kt0.LIZ(2131584244);
            return;
        }
        C4492d LIZ3 = C4492d.LIZLLL.LIZ();
        if (LIZ3 != null) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], LIZ3, C4492d.LIZ, false, 7);
            if (proxy.isSupported) {
                LIZ2 = proxy.result;
            } else {
                LIZ2 = LIZ3.LIZJ.LIZ(LIZ3, C4492d.LIZIZ[5]);
            }
            C2TE c2te = (C2TE) LIZ2;
            if (c2te != null) {
                c2te.LIZ(h4a.LJFF);
            }
        }
        this.LIZJ = h4a.LJFF;
        long currentTimeMillis = System.currentTimeMillis();
        this.LJIILL.add(((LinkRoomFightApi) C88306Kqq.LIZ().LIZ(LinkRoomFightApi.class)).invite(LJI(), h4a.LIZJ, CrossRoomLinkType.TWO_ROOM.value, h4a.f6565LJ.value).compose(C100839PnV.LIZJ()).subscribe(new H49(h4a, currentTimeMillis), new H48<>(this, currentTimeMillis, h4a)));
    }

    @Override // com.bytedance.android.live.liveinteract.linkroomfight.core.AbstractC4491b
    public final void LIZ(long j, long j2) {
        if (PatchProxy.proxy(new Object[]{new Long(j), new Long(j2)}, this, LIZ, false, 38).isSupported) {
            return;
        }
        if (!NetworkUtils.LIZIZ(this.context)) {
            C88440Kt0.LIZ(2131584244);
            return;
        }
        StartType startType = StartType.START_AGAIN;
        long currentTimeMillis = System.currentTimeMillis();
        this.LJIILL.add(((LinkRoomFightApi) C88306Kqq.LIZ().LIZ(LinkRoomFightApi.class)).inviteRoomBattle(startType.value, LJI(), j).compose(C100839PnV.LIZJ()).subscribe(new H45(j, startType, currentTimeMillis, j2), new H44<>(this, j, startType, currentTimeMillis, j2)));
    }
}
