package com.bytedance.android.live.liveinteract.bid;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p354vm.C4378a;
import com.bytedance.android.live.liveinteract.plantform.api.LinkAudienceApi;
import com.bytedance.android.live.liveinteract.plantform.api.LinkPaidLinkApi;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.event.C5984am;
import com.bytedance.android.livesdk.chatroom.p517u.AbstractC6302f;
import com.bytedance.android.livesdk.chatroom.p517u.C6307m;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.message.model.BidPaidLinkmicStatus;
import com.bytedance.android.livesdk.message.model.C9030z;
import com.bytedance.android.livesdk.message.model.LinkmicProfitMessage;
import com.bytedance.android.livesdk.widget.v$a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.live.datacontext.C13491f;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413392Xt;
import p003X.AbstractC413402Xu;
import p003X.AbstractC4569445g;
import p003X.AbstractC78050Gpo;
import p003X.AbstractC78489Gwt;
import p003X.AbstractC80293Hkt;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2WC;
import p003X.C3VF;
import p003X.C409882Kg;
import p003X.C4574547f;
import p003X.C78362Guq;
import p003X.C78503Gx7;
import p003X.C78506GxA;
import p003X.C78508GxC;
import p003X.C78509GxD;
import p003X.C78510GxE;
import p003X.C78511GxF;
import p003X.C78530GxY;
import p003X.C78531GxZ;
import p003X.C78532Gxa;
import p003X.C78571GyD;
import p003X.C78579GyL;
import p003X.C78828H5q;
import p003X.C79046HEa;
import p003X.C79169HIt;
import p003X.C79242HLo;
import p003X.C87010KQi;
import p003X.C87308Kak;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.DialogC78477Gwh;
import p003X.DialogInterface$OnClickListenerC78507GxB;
import p003X.DialogInterface$OnClickListenerC78512GxG;
import p003X.DialogInterface$OnClickListenerC78513GxH;
import p003X.DialogInterface$OnClickListenerC78514GxI;
import p003X.DialogInterface$OnClickListenerC78515GxJ;
import p003X.DialogInterface$OnClickListenerC78516GxK;
import p003X.DialogInterface$OnClickListenerC78518GxM;
import p003X.GY4;
import p003X.GY5;
import p003X.GY6;
import p003X.IQV;
import p003X.IQX;
import p003X.QB4;

/* loaded from: classes3.dex */
public final class BidLinkMicWidget extends RoomWidget implements AbstractC4289e, AbstractC4569445g, OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public C4378a LIZIZ;
    public boolean LIZJ;
    public Room LIZLLL;

    /* renamed from: LJ */
    public final CompositeDisposable f26258LJ = new CompositeDisposable();
    public DialogC78477Gwh LJFF;
    public C78508GxC LJI;

    static {
        Covode.recordClassIndex(25212);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 38).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    private final boolean LJIJ() {
        AbstractC413402Xu<Boolean> LJIILJJIL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 15);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI == null || (LJIILJJIL = LJJJI.LJIILJJIL()) == null || !LJIILJJIL.LIZIZ().booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.bid.AbstractC4289e
    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 18);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C4378a c4378a = this.LIZIZ;
        if (c4378a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c4378a.LJFF();
    }

    @Override // com.bytedance.android.live.liveinteract.bid.AbstractC4289e
    public final boolean LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 19);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C4378a c4378a = this.LIZIZ;
        if (c4378a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c4378a.LJI();
    }

    @Override // com.bytedance.android.live.liveinteract.bid.AbstractC4289e
    /* renamed from: LJ */
    public final void mo15775LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        DialogC78477Gwh dialogC78477Gwh = this.LJFF;
        if (dialogC78477Gwh == null || !dialogC78477Gwh.isShowing()) {
            C4378a c4378a = this.LIZIZ;
            if (c4378a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "");
            this.LJFF = new DialogC78477Gwh(context, c4378a);
            DialogC78477Gwh dialogC78477Gwh2 = this.LJFF;
            if (dialogC78477Gwh2 != null) {
                C116971W2r.LIZJ(dialogC78477Gwh2);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.bid.AbstractC4289e
    public final C78532Gxa LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 22);
        if (proxy.isSupported) {
            return (C78532Gxa) proxy.result;
        }
        C4378a c4378a = this.LIZIZ;
        if (c4378a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        long LJIILJJIL = c4378a.LJIILJJIL();
        C4378a c4378a2 = this.LIZIZ;
        if (c4378a2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        long LJIILIIL = c4378a2.LJIILIIL();
        C4378a c4378a3 = this.LIZIZ;
        if (c4378a3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return new C78532Gxa(LJIILJJIL, LJIILIIL, c4378a3.LJIILL());
    }

    @Override // com.bytedance.android.live.liveinteract.bid.AbstractC4289e
    public final long LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 23);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        C4378a c4378a = this.LIZIZ;
        if (c4378a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c4378a.LJIILLIIL();
    }

    @Override // com.bytedance.android.live.liveinteract.bid.AbstractC4289e
    public final long LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 25);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        C4378a c4378a = this.LIZIZ;
        if (c4378a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c4378a.LJIILIIL();
    }

    public final boolean LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 29);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C4378a c4378a = this.LIZIZ;
        if (c4378a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c4378a.LIZLLL();
    }

    @Override // com.bytedance.android.live.liveinteract.bid.AbstractC4289e
    public final boolean LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 30);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C4378a c4378a = this.LIZIZ;
        if (c4378a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c4378a.m15744LJ();
    }

    @Override // com.bytedance.android.live.liveinteract.bid.AbstractC4289e
    public final BidPaidLinkmicStatus LJIILIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 32);
        if (proxy.isSupported) {
            return (BidPaidLinkmicStatus) proxy.result;
        }
        C4378a c4378a = this.LIZIZ;
        if (c4378a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        NextLiveData<BidPaidLinkmicStatus> nextLiveData = c4378a.LJIIZILJ;
        if (nextLiveData != null) {
            return nextLiveData.getValue();
        }
        return null;
    }

    public final Long LJIILLIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 35);
        if (proxy.isSupported) {
            return (Long) proxy.result;
        }
        C78508GxC c78508GxC = this.LJI;
        if (c78508GxC != null) {
            return Long.valueOf(c78508GxC.LIZJ);
        }
        return null;
    }

    public final Long LJIIZILJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 36);
        if (proxy.isSupported) {
            return (Long) proxy.result;
        }
        C78508GxC c78508GxC = this.LJI;
        if (c78508GxC != null) {
            return Long.valueOf(c78508GxC.LIZLLL);
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.bid.AbstractC4289e
    public final boolean LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C4378a c4378a = this.LIZIZ;
        if (c4378a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c4378a, C4378a.LIZ, false, 23);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        if (c4378a.LJIIZILJ.getValue() != BidPaidLinkmicStatus.BidPaid_Finish) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.bid.AbstractC4289e
    public final long LJII() {
        int LJIILJJIL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 24);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        C4378a c4378a = this.LIZIZ;
        if (c4378a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c4378a, C4378a.LIZ, false, 51);
        if (proxy2.isSupported) {
            LJIILJJIL = ((Integer) proxy2.result).intValue();
        } else {
            Integer value = c4378a.LJII.getValue();
            if (value != null) {
                LJIILJJIL = value.intValue();
            } else {
                LJIILJJIL = (int) c4378a.LJIILJJIL();
            }
        }
        return LJIILJJIL;
    }

    @Override // com.bytedance.android.live.liveinteract.bid.AbstractC4289e
    public final long LJIIIZ() {
        Long l;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 26);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        C4378a c4378a = this.LIZIZ;
        if (c4378a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c4378a, C4378a.LIZ, false, 52);
        if (proxy2.isSupported) {
            return ((Long) proxy2.result).longValue();
        }
        C9030z value = c4378a.LJIJI.getValue();
        if (value != null && (l = value.LIZ) != null) {
            return l.longValue();
        }
        return 0L;
    }

    @Override // com.bytedance.android.live.liveinteract.bid.AbstractC4289e
    public final boolean LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 31);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C4378a c4378a = this.LIZIZ;
        if (c4378a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c4378a, C4378a.LIZ, false, 20);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        if (c4378a.LJIIZILJ.getValue() != BidPaidLinkmicStatus.BidPaid_Unknown) {
            return false;
        }
        return true;
    }

    public final void LJIILJJIL() {
        NextLiveData<C9030z> nextLiveData;
        C9030z value;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 33).isSupported) {
            return;
        }
        C4378a c4378a = this.LIZIZ;
        if (c4378a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!PatchProxy.proxy(new Object[0], c4378a, C4378a.LIZ, false, 35).isSupported && c4378a.LIZJ() && c4378a.LJJII != null && (nextLiveData = c4378a.LJIJI) != null && (value = nextLiveData.getValue()) != null && Intrinsics.areEqual(value.LIZJ, c4378a.LJIIJJI)) {
            QB4.LIZ(((LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class)).applyCallbackReq(c4378a.LJJII.getRoomId(), 1).compose(C100839PnV.LIZJ()).subscribe(GY4.LIZIZ, GY5.LIZIZ), c4378a.LJJIII);
        }
    }

    public final boolean LJIILL() {
        Long l;
        C3VF user;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 34);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C78508GxC c78508GxC = this.LJI;
        Long l2 = null;
        if (c78508GxC != null) {
            l = Long.valueOf(c78508GxC.LIZIZ);
        } else {
            l = null;
        }
        IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
        if (iUserService != null && (user = iUserService.user()) != null) {
            l2 = Long.valueOf(user.LIZIZ());
        }
        return Intrinsics.areEqual(l, l2);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 37).isSupported) {
            return;
        }
        super.onDestroy();
        C4378a c4378a = this.LIZIZ;
        if (c4378a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c4378a.LJIIJ();
        C78530GxY.LIZIZ.LIZIZ();
        if (LIZIZ() && LJIJ()) {
            C78530GxY.LIZIZ.LIZ();
        }
        if (!this.f26258LJ.isDisposed()) {
            this.f26258LJ.clear();
        }
        DialogC78477Gwh dialogC78477Gwh = this.LJFF;
        if (dialogC78477Gwh != null && dialogC78477Gwh.isShowing()) {
            DialogC78477Gwh dialogC78477Gwh2 = this.LJFF;
            if (dialogC78477Gwh2 != null) {
                C116971W2r.LIZ(dialogC78477Gwh2);
            }
            this.LJFF = null;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.bid.AbstractC4289e
    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 17);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C4378a c4378a = this.LIZIZ;
        if (c4378a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c4378a.LIZJ();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        Room room;
        AbstractC413392Xt<IMessageManager> LJIILLIIL;
        C2WC<Room> LIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LIZ2 = LJJJI.LIZ()) != null) {
            room = LIZ2.LIZ();
        } else {
            room = null;
        }
        this.LIZLLL = room;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            this.LIZIZ = new C4378a();
            Pair LIZ3 = IQV.LIZ((Function0) BidLinkMicWidget$initBidLinkMicDataContext$pair$1.INSTANCE);
            ((C4287a) LIZ3.getFirst()).LIZ().LIZIZ(this);
            IQX.LIZ((C13491f) LIZ3.getFirst(), AbstractC78489Gwt.class);
            AbstractC413392Xt<C4378a> LIZIZ = ((C4287a) LIZ3.getFirst()).LIZIZ();
            C4378a c4378a = this.LIZIZ;
            if (c4378a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LIZIZ.LIZIZ(c4378a);
            this.f26258LJ.add((Disposable) LIZ3.getSecond());
            C4378a c4378a2 = this.LIZIZ;
            if (c4378a2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c4378a2.LJIILJJIL.observe(this, new C78510GxE(this));
        }
        if (!LJIJ() && C4378a.LJJIJIL.LIZJ() && C78571GyD.LIZIZ(this.LIZLLL)) {
            StringBuilder sb = new StringBuilder("onCreate viewMode: ");
            C4378a c4378a3 = this.LIZIZ;
            if (c4378a3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            sb.append(c4378a3);
            ALogger.m15801d("BidLinkMicWidget", sb.toString());
            C4378a c4378a4 = this.LIZIZ;
            if (c4378a4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (!PatchProxy.proxy(new Object[0], c4378a4, C4378a.LIZ, false, 34).isSupported && c4378a4.LJJII != null) {
                QB4.LIZ(((LinkPaidLinkApi) C88306Kqq.LIZ().LIZ(LinkPaidLinkApi.class)).getPlayModeInfo(c4378a4.LJJII.getId()).compose(C100839PnV.LIZJ()).subscribe(new C78506GxA(c4378a4), GY6.LIZIZ), c4378a4.LJJIII);
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            LIZ(C5984am.class);
            LIZ(C78509GxD.class);
            LIZ(C78503Gx7.class);
        }
        C13491f LIZ4 = IQV.LIZ(C5923dp.class);
        if (!(LIZ4 instanceof C5923dp)) {
            LIZ4 = null;
        }
        C5923dp c5923dp = (C5923dp) LIZ4;
        if (c5923dp != null && (LJIILLIIL = c5923dp.LJIILLIIL()) != null) {
            LJIILLIIL.LIZ(new BidLinkMicWidget$onCreate$1(this));
        }
    }

    private final <T> void LIZ(Class<T> cls) {
        if (PatchProxy.proxy(new Object[]{cls}, this, LIZ, false, 7).isSupported) {
            return;
        }
        this.f26258LJ.add(C87010KQi.LIZ().LIZ((Class) cls).subscribe(new C78511GxF(this)));
    }

    public final void LIZ(Function0<Unit> function0) {
        if (PatchProxy.proxy(new Object[]{function0}, this, LIZ, false, 16).isSupported) {
            return;
        }
        new v$a(getContext(), 4).mo15264LJ(2131585457).LIZLLL(2131585456).LIZIZ(0, 2131586570, new DialogInterface$OnClickListenerC78512GxG(function0)).LIZIZ(1, 2131582393, DialogInterface$OnClickListenerC78518GxM.LIZIZ).LIZJ();
    }

    public final <T> void onEvent(T t) {
        List<Integer> emptyList;
        boolean contains;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ;
        C6307m LIZIZ2;
        if (PatchProxy.proxy(new Object[]{t}, this, LIZ, false, 8).isSupported || !LJIJ()) {
            return;
        }
        if ((t instanceof C5984am) && ((C5984am) t).LIZ == 18) {
            mo15775LJ();
        } else if (t instanceof C78509GxD) {
            C78509GxD c78509GxD = (C78509GxD) t;
            if (!PatchProxy.proxy(new Object[]{c78509GxD}, this, LIZ, false, 9).isSupported) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, C78531GxZ.LIZ, true, 8);
                if (proxy.isSupported) {
                    contains = ((Boolean) proxy.result).booleanValue();
                } else {
                    C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                    if (LIZ2 == null || (LJJZZIII = LIZ2.LJJZZIII()) == null || (LIZIZ = LJJZZIII.LIZIZ()) == null || (LIZIZ2 = LIZIZ.LIZIZ()) == null || (emptyList = LIZIZ2.LIZJ) == null) {
                        emptyList = CollectionsKt__CollectionsKt.emptyList();
                    }
                    contains = emptyList.contains(4);
                }
                if (contains && C79242HLo.m23751LJ() > 0) {
                    C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f6966U;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                    Boolean LIZ3 = c87308Kak.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                    if (LIZ3.booleanValue()) {
                        if (!PatchProxy.proxy(new Object[]{c78509GxD}, this, LIZ, false, 10).isSupported) {
                            new v$a(getContext(), 4).LIZLLL(2131585218).LIZIZ(0, 2131586570, new DialogInterface$OnClickListenerC78507GxB(this, c78509GxD)).LIZIZ(1, 2131582393, DialogInterface$OnClickListenerC78516GxK.LIZIZ).LIZJ();
                            C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.f6966U;
                            Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                            c87308Kak2.LIZ(Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                }
                C4378a c4378a = this.LIZIZ;
                if (c4378a == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                c4378a.LIZ(c78509GxD.LIZIZ, c78509GxD.LIZJ, c78509GxD.LIZLLL, c78509GxD.f6520LJ);
            }
        } else if (!(t instanceof C78503Gx7)) {
        } else {
            C4378a c4378a2 = this.LIZIZ;
            if (c4378a2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            C4378a.LIZ(c4378a2, ((C78503Gx7) t).LIZIZ, null, 2, null);
        }
    }

    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j;
        Long l;
        AbstractC413392Xt<C4378a> LIZIZ;
        C4378a LIZIZ2;
        AbstractC413392Xt<C4378a> LIZIZ3;
        C4378a LIZIZ4;
        C9030z c9030z;
        Long l2;
        C9030z c9030z2;
        Long l3;
        C78579GyL c78579GyL;
        C9030z c9030z3;
        Long l4;
        C3VF user;
        LinkmicProfitMessage.C8716c c8716c;
        LinkmicProfitMessage.C8716c value;
        String str;
        LinkmicProfitMessage.C8716c value2;
        if (!PatchProxy.proxy(new Object[]{iMessage}, this, LIZ, false, 4).isSupported && (iMessage instanceof LinkmicProfitMessage)) {
            LinkmicProfitMessage linkmicProfitMessage = (LinkmicProfitMessage) iMessage;
            int i = linkmicProfitMessage.LIZ;
            Long l5 = null;
            r1 = null;
            String str2 = null;
            l5 = null;
            l5 = null;
            if (i == LinkmicProfitMessage.LinkmicProfitMessageType.TypeProfit_BidPaidLinkmicAbort.ordinal()) {
                if (!PatchProxy.proxy(new Object[]{linkmicProfitMessage}, this, LIZ, false, 5).isSupported && (c8716c = linkmicProfitMessage.LIZLLL) != null) {
                    if (LJIJ()) {
                        if (!PatchProxy.proxy(new Object[]{c8716c}, this, LIZ, false, 12).isSupported) {
                            v$a v_a = new v$a(this.context);
                            v_a.LIZ(1);
                            v$a mo15264LJ = v_a.mo15264LJ(2131584102);
                            mo15264LJ.LIZIZ(c8716c.LIZIZ);
                            v$a LIZIZ5 = mo15264LJ.LIZIZ(2, 2131584101, DialogInterface$OnClickListenerC78513GxH.LIZIZ);
                            LIZIZ5.LIZ(false);
                            LIZIZ5.LIZIZ(false);
                            LIZIZ5.LIZJ();
                        }
                    } else if (!PatchProxy.proxy(new Object[]{c8716c}, this, LIZ, false, 14).isSupported) {
                        C79046HEa LIZ2 = C79046HEa.LIZ();
                        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                        Integer num = (Integer) LIZ2.LJJIIZI;
                        if (num == null || num.intValue() != 2) {
                            Long l6 = c8716c.LIZ;
                            C4378a c4378a = this.LIZIZ;
                            if (c4378a == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                            }
                            if (Intrinsics.areEqual(l6, c4378a.LJIIJJI)) {
                                v$a v_a2 = new v$a(this.context);
                                v_a2.LIZ(4);
                                v_a2.LIZ(false);
                                v$a mo15264LJ2 = v_a2.mo15264LJ(2131585082);
                                C4378a c4378a2 = this.LIZIZ;
                                if (c4378a2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                }
                                NextLiveData<LinkmicProfitMessage.C8716c> nextLiveData = c4378a2.LJJ;
                                if (nextLiveData != null && (value2 = nextLiveData.getValue()) != null) {
                                    str = value2.LIZJ;
                                } else {
                                    str = null;
                                }
                                mo15264LJ2.LIZIZ(str);
                                mo15264LJ2.LIZIZ(0, 2131584101, DialogInterface$OnClickListenerC78515GxJ.LIZIZ).LIZJ();
                                if (PatchProxy.proxy(new Object[0], C78530GxY.LIZIZ, C78530GxY.LIZ, false, 9).isSupported) {
                                    return;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                C78828H5q.LIZIZ((Map<String, String>) linkedHashMap, C79242HLo.LJIIJ());
                                C78828H5q.LIZIZ(linkedHashMap, (Integer) null, (Integer) null, 6, (Object) null);
                                C78828H5q.LIZIZ(linkedHashMap);
                                C4574547f.LIZ().LIZ("livesdk_guest_connection_rechargeable_auction_fail_popup_show", linkedHashMap, C8668v.class, Room.class);
                                return;
                            }
                            C4378a c4378a3 = this.LIZIZ;
                            if (c4378a3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                            }
                            NextLiveData<LinkmicProfitMessage.C8716c> nextLiveData2 = c4378a3.LJJ;
                            if (nextLiveData2 != null && (value = nextLiveData2.getValue()) != null) {
                                str2 = value.LIZLLL;
                            }
                            C88440Kt0.LIZ(str2);
                        }
                    }
                }
            } else if (i == LinkmicProfitMessage.LinkmicProfitMessageType.TypeProfit_BidPaidLinkmicDeal.ordinal()) {
                if (!PatchProxy.proxy(new Object[]{linkmicProfitMessage}, this, LIZ, false, 6).isSupported) {
                    if (!LJIJ() && C79242HLo.LJIILL() && (c78579GyL = linkmicProfitMessage.LIZJ) != null && (c9030z3 = c78579GyL.LIZ) != null) {
                        IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
                        if (iUserService != null && (user = iUserService.user()) != null) {
                            l4 = Long.valueOf(user.LIZIZ());
                        } else {
                            l4 = null;
                        }
                        if (Intrinsics.areEqual(c9030z3.LIZJ, l4)) {
                            QB4.LIZ(Observable.timer(3L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(C78362Guq.LIZIZ), this.f26258LJ);
                        }
                    }
                    long j2 = 0;
                    C78579GyL c78579GyL2 = linkmicProfitMessage.LIZJ;
                    if (c78579GyL2 != null && (c9030z2 = c78579GyL2.LIZ) != null && (l3 = c9030z2.LIZJ) != null) {
                        j = l3.longValue();
                    } else {
                        j = 0;
                    }
                    C78579GyL c78579GyL3 = linkmicProfitMessage.LIZJ;
                    if (c78579GyL3 != null && (c9030z = c78579GyL3.LIZ) != null && (l2 = c9030z.LIZ) != null) {
                        j2 = l2.longValue();
                    }
                    if (LJIJ()) {
                        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
                            C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f6965T;
                            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                            Boolean LIZ3 = c87308Kak.LIZ();
                            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                            if (LIZ3.booleanValue()) {
                                v$a v_a3 = new v$a(this.context);
                                v_a3.LIZ(1);
                                v$a LIZIZ6 = v_a3.LIZLLL(2131585085).LIZIZ(2, 2131585084, DialogInterface$OnClickListenerC78514GxI.LIZIZ);
                                LIZIZ6.LIZ(false);
                                LIZIZ6.LIZIZ(false);
                                LIZIZ6.LIZJ();
                                C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.f6965T;
                                Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                                c87308Kak2.LIZ(Boolean.FALSE);
                            }
                        }
                        if (!PatchProxy.proxy(new Object[]{new Long(j), new Long(j2)}, C78530GxY.LIZIZ, C78530GxY.LIZ, false, 3).isSupported) {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            C78828H5q.LIZIZ((Map<String, String>) linkedHashMap2, C79242HLo.LJIIJ());
                            C78828H5q.LIZIZ(linkedHashMap2, (Integer) null, (Integer) null, 6, (Object) null);
                            C78828H5q.LIZIZ(linkedHashMap2);
                            linkedHashMap2.put("recharge_user_id", String.valueOf(j));
                            C4287a LIZ4 = C4287a.LIZJ.LIZ();
                            if (LIZ4 != null && (LIZIZ3 = LIZ4.LIZIZ()) != null && (LIZIZ4 = LIZIZ3.LIZIZ()) != null) {
                                l = Long.valueOf(LIZIZ4.LJIILJJIL());
                            } else {
                                l = null;
                            }
                            linkedHashMap2.put("origin_price", String.valueOf(l));
                            linkedHashMap2.put("recharge_price", String.valueOf(j2));
                            C4287a LIZ5 = C4287a.LIZJ.LIZ();
                            if (LIZ5 != null && (LIZIZ = LIZ5.LIZIZ()) != null && (LIZIZ2 = LIZIZ.LIZIZ()) != null) {
                                l5 = Long.valueOf(LIZIZ2.LJIILIIL());
                            }
                            linkedHashMap2.put("time", String.valueOf(l5));
                            C4574547f.LIZ().LIZ("livesdk_anchor_connection_rechargeable_auction_anchor_success", linkedHashMap2, Room.class);
                        }
                    }
                    if (!LJIJ()) {
                        this.LJI = new C78508GxC(j, j2, LJIIIIZZ());
                    }
                }
            } else if (i == LinkmicProfitMessage.LinkmicProfitMessageType.TypeProfit_BidPaidLinkmicTurnOn.ordinal()) {
                this.LJI = null;
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.bid.AbstractC4289e
    public final void LIZ(Long l, String str) {
        int i = 0;
        if (PatchProxy.proxy(new Object[]{l, str}, this, LIZ, false, 27).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        C4378a c4378a = this.LIZIZ;
        if (c4378a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c4378a.f26297LJ.add(new Pair<>(str, Boolean.FALSE));
        if (!LJIJ()) {
            return;
        }
        AbstractC4774i LIZ2 = AbstractC78050Gpo.LIZ();
        if (LIZ2 != null) {
            i = LIZ2.LJJIFFI();
        }
        if (!C79169HIt.LIZIZ(i, 32)) {
            return;
        }
        C4378a c4378a2 = this.LIZIZ;
        if (c4378a2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (c4378a2.LJI() && l != null && l.longValue() != 0) {
            C4378a c4378a3 = this.LIZIZ;
            if (c4378a3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (l.longValue() == c4378a3.LJIILLIIL()) {
                C4378a c4378a4 = this.LIZIZ;
                if (c4378a4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                int size = c4378a4.f26297LJ.size() - 1;
                C4378a c4378a5 = this.LIZIZ;
                if (c4378a5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                c4378a5.f26297LJ.set(size, new Pair<>(str, Boolean.TRUE));
            }
        }
    }
}
