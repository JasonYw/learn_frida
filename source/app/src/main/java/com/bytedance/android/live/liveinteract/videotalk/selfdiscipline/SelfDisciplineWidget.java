package com.bytedance.android.live.liveinteract.videotalk.selfdiscipline;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.doublepk.core.C4398a;
import com.bytedance.android.live.liveinteract.p357f.AbstractC4411b;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah;
import com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m;
import com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.C4949a;
import com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.api.SelfDisciplineApi;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.model.interact.SelfDisciplineInfo;
import com.bytedance.android.livesdk.chatroom.p517u.C6305j;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.dynamic.C6514m;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.reddot.C9225a;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.LinkerDetail;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
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
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413392Xt;
import p003X.AbstractC4569445g;
import p003X.AbstractC78986HBs;
import p003X.AbstractC80293Hkt;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C30K;
import p003X.C409882Kg;
import p003X.C423702pg;
import p003X.C4574547f;
import p003X.C78571GyD;
import p003X.C78656Gza;
import p003X.C78828H5q;
import p003X.C79046HEa;
import p003X.C79120HGw;
import p003X.C79121HGx;
import p003X.C79122HGy;
import p003X.C79242HLo;
import p003X.C87308Kak;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.DialogC448093nv;
import p003X.HDQ;
import p003X.HDZ;
import p003X.HH0;
import p003X.HH1;
import p003X.HH3;
import p003X.HH4;
import p003X.HH5;
import p003X.HH7;
import p003X.IQV;
import p003X.IQX;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class SelfDisciplineWidget extends RoomWidget implements AbstractC4411b, AbstractC4569445g, OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public Disposable LIZIZ;
    public C4949a LIZJ;
    public IMessageManager LIZLLL;

    /* renamed from: LJ */
    public final CompositeDisposable f26453LJ = new CompositeDisposable();
    public final C30K<Integer> LJFF = HH3.LIZIZ;
    public final C79122HGy LJI = new C79122HGy(this);

    static {
        Covode.recordClassIndex(30386);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 37).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    private final Room LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (Room) proxy.result;
        }
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        return C423702pg.LIZIZ(dataCenter);
    }

    private final boolean LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C423702pg.LIZIZ(this.dataCenter, false, 1, null);
    }

    @Override // com.bytedance.android.live.liveinteract.p357f.AbstractC4411b
    public final AbstractC6524y.AbstractView$OnClickListenerC6525b LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 27);
        if (proxy.isSupported) {
            return (AbstractC6524y.AbstractView$OnClickListenerC6525b) proxy.result;
        }
        return new AbstractC6524y.AbstractView$OnClickListenerC6525b() { // from class: X.3oM
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(30424);
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZ(C2TD c2td) {
                boolean z = PatchProxy.proxy(new Object[]{c2td}, this, LIZ, false, 6).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZ(View view, DataCenter dataCenter) {
                boolean z = PatchProxy.proxy(new Object[]{view, dataCenter}, this, LIZ, false, 2).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZ(C6514m c6514m) {
                boolean z = PatchProxy.proxy(new Object[]{c6514m}, this, LIZ, false, 4).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZ(boolean z) {
                boolean z2 = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 5).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final C9225a LIZIZ() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
                if (proxy2.isSupported) {
                    return (C9225a) proxy2.result;
                }
                return null;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZIZ(View view, DataCenter dataCenter) {
                boolean z = PatchProxy.proxy(new Object[]{view, dataCenter}, this, LIZ, false, 3).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final void LIZIZ(C6514m c6514m) {
                boolean z = PatchProxy.proxy(new Object[]{c6514m}, this, LIZ, false, 9).isSupported;
            }

            @Override // com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y.AbstractView$OnClickListenerC6525b
            public final boolean aK_() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
                if (proxy2.isSupported) {
                    return ((Boolean) proxy2.result).booleanValue();
                }
                return false;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC4411b LIZJ;
                if (!PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported && (LIZJ = C4949a.f26454LJ.LIZJ()) != null) {
                    LIZJ.LIZ("interaction_button");
                }
            }
        };
    }

    @Override // com.bytedance.android.live.liveinteract.p357f.AbstractC4411b
    public final boolean LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 31);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C4949a.f26454LJ.LIZLLL();
    }

    @Override // com.bytedance.android.live.liveinteract.p357f.AbstractC4411b
    /* renamed from: LJ */
    public final void mo15681LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 34).isSupported) {
            return;
        }
        LJIIJJI();
    }

    private final boolean LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC4767ah LIZ2 = AbstractC4767ah.LIZIZ.LIZ();
        if (LIZ2 == null || !LIZ2.LJIIIZ()) {
            return false;
        }
        return true;
    }

    private final void LJIIL() {
        int i;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        if (C79120HGw.LIZ()) {
            i = 4;
        } else {
            i = 1;
        }
        C87308Kak<SelfDisciplineInfo> c87308Kak = AbstractC80293Hkt.f6989aQ;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        String str = c87308Kak.LIZ().currentTarget;
        if (str != null) {
            LIZ(i, str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.p357f.AbstractC4411b
    public final boolean LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 30);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!C4949a.f26454LJ.LIZLLL()) {
            return false;
        }
        Object obj = this.dataCenter.get("data_big_party_support_send_gift_to_linker", (String) Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        if (!((Boolean) obj).booleanValue()) {
            return false;
        }
        return true;
    }

    public final AbstractC4964m LJFF() {
        AbstractC4964m ae_;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
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

    public final AbstractC78986HBs<LinkPlayerInfo> LJI() {
        AbstractC78986HBs<LinkPlayerInfo> LIZLLL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (AbstractC78986HBs) proxy.result;
        }
        AbstractC4766ag LIZ2 = AbstractC4766ag.LIZ.LIZ();
        if (LIZ2 == null || (LIZLLL = LIZ2.LIZLLL()) == null) {
            AbstractC4767ah LIZ3 = AbstractC4767ah.LIZIZ.LIZ();
            if (LIZ3 != null) {
                return LIZ3.LJIIIIZZ();
            }
            return null;
        }
        return LIZLLL;
    }

    private final boolean LJIIJ() {
        C2WD<ArrayList<Integer>> LLLIIII;
        C2WD<ArrayList<Integer>> LLLIIII2;
        ArrayList<Integer> LIZ2;
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C5923dp c5923dp = this.LJJJJI;
        if (c5923dp != null && (LLLIIII2 = c5923dp.LLLIIII()) != null && (LIZ2 = LLLIIII2.LIZ()) != null && LIZ2.contains(17)) {
            z = true;
        }
        C5923dp c5923dp2 = this.LJJJJI;
        if (c5923dp2 != null && (LLLIIII = c5923dp2.LLLIIII()) != null) {
            LLLIIII.LIZ(null);
        }
        ALogger.m15801d("SelfDisciplineWidget", "isFastStart " + z);
        return z;
    }

    private final void LJIILIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        if (LJIIIIZZ()) {
            C79121HGx c79121HGx = C79121HGx.LIZJ;
            C4949a c4949a = this.LIZJ;
            if (c4949a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c79121HGx.LIZIZ(c4949a.LIZIZ().LIZ());
        } else if (LJIIIZ()) {
            C79121HGx.LIZJ.m23774LJ();
        } else {
            C79121HGx.LIZJ.LIZJ();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 35).isSupported) {
            return;
        }
        super.onDestroy();
        if (C4949a.f26454LJ.LIZLLL()) {
            LJIILIIL();
        }
        C79121HGx.LIZ().LIZIZ("null");
        C79046HEa.LIZ().LIZ((C30K) this.LJFF);
        AbstractC78986HBs<LinkPlayerInfo> LJI = LJI();
        if (LJI != null) {
            LJI.LIZIZ(this.LJI);
        }
        IMessageManager iMessageManager = this.LIZLLL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.f26453LJ.dispose();
        Disposable disposable = this.LIZIZ;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    private final void LJIIJJI() {
        Disposable subscribe;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported && LJIIIIZZ()) {
            if (C4949a.f26454LJ.LIZLLL()) {
                C88440Kt0.LIZ(2131587643);
                return;
            }
            C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.f6990aR;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            Integer LIZ2 = c87308Kak.LIZ();
            if (LIZ2 != null && LIZ2.intValue() == 0) {
                if (LJIIJ() && (subscribe = Observable.timer(1L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new HH4(this))) != null) {
                    LIZ(subscribe);
                }
            } else if (LIZ2 == null) {
            } else {
                if (LIZ2.intValue() == 1) {
                    if (LJIIJ()) {
                        LJIIL();
                        C79121HGx.LIZ().LIZ("convenient_discipline_page");
                        C79121HGx.LIZ().LIZIZ("convenient_discipline_page");
                        return;
                    }
                    SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_VIDEO_SELF_DISCIPLINE_AUTO_START;
                    Intrinsics.checkNotNullExpressionValue(settingKey, "");
                    Boolean value = settingKey.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "");
                    if (value.booleanValue()) {
                        LJIIL();
                        C79121HGx.LIZ().LIZ("auto_start");
                    }
                } else if (LIZ2.intValue() == 2 && LJIIJ()) {
                    LJIIL();
                    C79121HGx.LIZ().LIZIZ("convenient_discipline_page");
                    C79121HGx.LIZ().LIZ("convenient_discipline_page");
                }
            }
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        List<Long> list;
        AbstractC413392Xt<C6305j> LJJJJZ;
        C6305j LIZIZ;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onCreate();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            Pair LIZ2 = IQV.LIZ((Function0) SelfDisciplineWidget$initDataContext$pair$1.INSTANCE);
            C4949a c4949a = (C4949a) LIZ2.getFirst();
            c4949a.LIZ().LIZIZ(this);
            IQX.LIZ(c4949a, HH7.class);
            this.LIZJ = c4949a;
            this.f26453LJ.add((Disposable) LIZ2.getSecond());
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
                this.LIZLLL = (IMessageManager) this.dataCenter.get("data_message_manager", (String) null);
                IMessageManager iMessageManager = this.LIZLLL;
                if (iMessageManager != null) {
                    iMessageManager.addMessageListener(MessageType.SELF_DISCIPLINE_MESSAGE.LIZ(), this);
                }
                AbstractC78986HBs<LinkPlayerInfo> LJI = LJI();
                if (LJI != null) {
                    LJI.LIZ(this.LJI);
                }
            }
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported && !LJIIIIZZ()) {
                C79046HEa.LIZ().LIZIZ(this.LJFF);
                C4949a c4949a2 = this.LIZJ;
                if (c4949a2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                Disposable subscribe = c4949a2.LIZLLL().LIZIZ().subscribe(new HH1(this));
                if (subscribe != null) {
                    LIZ(subscribe);
                }
            }
        }
        LJIIJJI();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported && !LJIIIIZZ()) {
            LinkerDetail linkerDetail = LJII().linkerDetail;
            if (linkerDetail != null) {
                list = linkerDetail.LIZIZ;
            } else {
                list = null;
            }
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, null, C78571GyD.LIZ, true, 10);
            if (proxy.isSupported) {
                if (!((Boolean) proxy.result).booleanValue()) {
                    return;
                }
            } else if (list == null || !list.contains(17L)) {
                return;
            }
            C4949a c4949a3 = this.LIZJ;
            if (c4949a3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c4949a3.LIZJ().LIZ(1);
            C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
            if (LIZ3 != null && (LJJJJZ = LIZ3.LJJJJZ()) != null && (LIZIZ = LJJJJZ.LIZIZ()) != null) {
                LIZIZ.LIZIZ(17);
            }
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
                Disposable subscribe2 = ((SelfDisciplineApi) C88306Kqq.LIZ().LIZ(SelfDisciplineApi.class)).getPlayModeInfo(LJII().getId()).compose(C100839PnV.LIZJ()).subscribe(new HH0(this), new HH5<>(this));
                Intrinsics.checkNotNullExpressionValue(subscribe2, "");
                LIZ(subscribe2);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.p357f.AbstractC4411b
    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 26);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!C79242HLo.LJIILLIIL() || !C4949a.f26454LJ.m23775LJ()) {
            return false;
        }
        return true;
    }

    public static final /* synthetic */ C4949a LIZ(SelfDisciplineWidget selfDisciplineWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{selfDisciplineWidget}, null, LIZ, true, 36);
        if (proxy.isSupported) {
            return (C4949a) proxy.result;
        }
        C4949a c4949a = selfDisciplineWidget.LIZJ;
        if (c4949a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c4949a;
    }

    private final boolean LIZ(Disposable disposable) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return this.f26453LJ.add(disposable);
    }

    @Override // com.bytedance.android.live.liveinteract.p357f.AbstractC4411b
    public final void LIZIZ(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 32).isSupported && !PatchProxy.proxy(new Object[]{str}, C79121HGx.LIZJ, C79121HGx.LIZ, false, 5).isSupported) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C78828H5q.LIZIZ(linkedHashMap, 0, 2, (Object) null);
            C78828H5q.LIZIZ(linkedHashMap, (Integer) null, (Integer) null, 6, (Object) null);
            C78828H5q.LIZIZ(linkedHashMap);
            linkedHashMap.put("play_mode", C78656Gza.LIZ());
            linkedHashMap.put("room_info", String.valueOf(str));
            linkedHashMap.put("edit_time", C79121HGx.LIZIZ.LIZLLL());
            C4574547f.LIZ().LIZ("livesdk_anchor_set_discipline_room_info_click", linkedHashMap, Room.class);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.p357f.AbstractC4411b
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 25).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        C79121HGx.LIZ().LIZ(str);
        if (C4398a.LIZJ.LIZJ()) {
            C88440Kt0.LIZ(LK5.LIZ(2131582950, LK5.LIZ(2131587639)));
            return;
        }
        if (Intrinsics.areEqual(str, "interaction_button") && !PatchProxy.proxy(new Object[]{str}, C79121HGx.LIZJ, C79121HGx.LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C78828H5q.LIZIZ(linkedHashMap, 0, 2, (Object) null);
            C78828H5q.LIZIZ(linkedHashMap, (Integer) null, (Integer) null, 6, (Object) null);
            C78828H5q.LIZIZ(linkedHashMap);
            linkedHashMap.put("playmode_type", "8");
            linkedHashMap.put("source", str);
            linkedHashMap.put("request_page", str);
            C4574547f.LIZ().LIZ("livesdk_live_function_interact_playmode_panel_item_click", linkedHashMap, Room.class);
        }
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        C116971W2r.LIZJ(new DialogC448093nv(context));
    }

    @Override // com.bytedance.android.live.liveinteract.p357f.AbstractC4411b
    public final void LIZ(Map<String, String> map) {
        C2WC<String> LIZIZ;
        String str;
        if (PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 33).isSupported) {
            return;
        }
        C106862S5w.LIZ(map);
        C79121HGx c79121HGx = C79121HGx.LIZJ;
        if (!PatchProxy.proxy(new Object[]{map}, c79121HGx, C79121HGx.LIZ, false, 6).isSupported) {
            C106862S5w.LIZ(map);
            C78828H5q.m23787LJ(map);
            String str2 = null;
            C78828H5q.LIZIZ(map, 0, 2, (Object) null);
            C78828H5q.LIZIZ(map, (Integer) null, (Integer) null, 6, (Object) null);
            C78828H5q.LIZIZ(map);
            if (!PatchProxy.proxy(new Object[]{map}, c79121HGx, C79121HGx.LIZ, false, 7).isSupported) {
                C106862S5w.LIZ(map);
                if (C79242HLo.LJJIIJZLJL()) {
                    str = "anchor";
                } else {
                    C79046HEa LIZ2 = C79046HEa.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                    if (LIZ2.LIZJ()) {
                        str = "link_user";
                    } else {
                        str = "audience";
                    }
                }
                map.put("user_type", str);
            }
            map.put("play_mode", C78656Gza.LIZ());
            C4949a LIZIZ2 = C4949a.f26454LJ.LIZIZ();
            if (LIZIZ2 != null && (LIZIZ = LIZIZ2.LIZIZ()) != null) {
                str2 = LIZIZ.LIZ();
            }
            map.put("discipline_theme", String.valueOf(str2));
            map.put("room_info", C79121HGx.LIZIZ.LIZ());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0236, code lost:
        if (r2.LIZJ().LIZ().intValue() == 1) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
        if (r5 != 4) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMessage(com.p1594ss.ugc.live.sdk.message.data.IMessage r14) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.SelfDisciplineWidget.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    @Override // com.bytedance.android.live.liveinteract.p357f.AbstractC4411b
    public final void LIZ(int i, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, LIZ, false, 28).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        long currentTimeMillis = System.currentTimeMillis();
        Disposable subscribe = ((SelfDisciplineApi) C88306Kqq.LIZ().LIZ(SelfDisciplineApi.class)).setStatus(LJII().getId(), i, str).compose(C100839PnV.LIZJ()).subscribe(new HDZ(this, i, currentTimeMillis, str), new HDQ<>(this, i, currentTimeMillis));
        Intrinsics.checkNotNullExpressionValue(subscribe, "");
        LIZ(subscribe);
    }
}
