package com.bytedance.android.live.liveinteract.multianchor;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.utils.rxutils.autodispose.C4154a;
import com.bytedance.android.live.linkpk.AbstractC4254a;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.intercomment.InteractCommentWidget;
import com.bytedance.android.live.liveinteract.multianchor.constant.PlayMode;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.multianchor.p367e.C4518a;
import com.bytedance.android.live.liveinteract.multianchor.p368f.C4520a;
import com.bytedance.android.live.liveinteract.multianchor.p374pk.C4535h;
import com.bytedance.android.live.liveinteract.multianchor.p374pk.C4536j;
import com.bytedance.android.live.liveinteract.multianchor.p374pk.widget.MultiAnchorPkWidget;
import com.bytedance.android.live.liveinteract.multianchor.p374pk.widget.MultiAnchorTeamPkWidget;
import com.bytedance.android.live.liveinteract.multianchor.p376ui.C4569d;
import com.bytedance.android.live.liveinteract.multianchor.pklaunch.C4566a;
import com.bytedance.android.live.liveinteract.multianchor.presenter.AbstractC4568i;
import com.bytedance.android.live.liveinteract.multianchor.widget.MultiPKLastResultWidget;
import com.bytedance.android.live.liveinteract.multianchor.widget.MultiPkActivityWidget;
import com.bytedance.android.live.liveinteract.multianchor.widget.MultiPkExtraResultAnimWidget;
import com.bytedance.android.live.liveinteract.plantform.api.LinkAnchorApi;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4780t;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4781u;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v;
import com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.event.C5984am;
import com.bytedance.android.livesdk.chatroom.event.C5986ap;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q;
import com.bytedance.android.livesdk.chatroom.model.interact.C6173m;
import com.bytedance.android.livesdk.chatroom.model.interact.MultiAnchorLinkmicLiveCoreInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.MultiLiveCoreInfo;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.message.linker.C8691p;
import com.bytedance.android.livesdk.message.linker.C8693r;
import com.bytedance.android.livesdk.message.model.C8847el;
import com.bytedance.android.livesdk.message.model.LinkMicBattleInviteMessage;
import com.bytedance.android.livesdk.widget.AbstractDialogC9363b;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import com.bytedance.live.datacontext.C13491f;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.p1594ss.avframework.livestreamv2.core.ILayerControl;
import com.p1594ss.avframework.livestreamv2.core.LiveCore;
import com.p1594ss.avframework.livestreamv2.core.interact.model.Config;
import com.p1594ss.avframework.mixer.VideoMixer;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import p002O.C0002O;
import p003X.AbstractC416582eC;
import p003X.AbstractC4569445g;
import p003X.AbstractC78050Gpo;
import p003X.AbstractC80293Hkt;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C109391T5d;
import p003X.C116971W2r;
import p003X.C117876Wac;
import p003X.C148062fT6;
import p003X.C1W2;
import p003X.C2IN;
import p003X.C2WC;
import p003X.C3811017o;
import p003X.C4574547f;
import p003X.C4580049i;
import p003X.C458454Bb;
import p003X.C536537Hj;
import p003X.C64868Big;
import p003X.C77093GaN;
import p003X.C77094GaO;
import p003X.C79112HGo;
import p003X.C79199HJx;
import p003X.C79313HOh;
import p003X.C79317HOl;
import p003X.C79345HPn;
import p003X.C79347HPp;
import p003X.C79353HPv;
import p003X.C79359HQb;
import p003X.C79365HQh;
import p003X.C79367HQj;
import p003X.C79368HQk;
import p003X.C79372HQo;
import p003X.C79374HQq;
import p003X.C79378HQu;
import p003X.C79379HQv;
import p003X.C79381HQx;
import p003X.C79391HRh;
import p003X.C79413HSd;
import p003X.C79503HVp;
import p003X.C79506HVs;
import p003X.C79910Hei;
import p003X.C7KL;
import p003X.C87010KQi;
import p003X.C87308Kak;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.DialogC79387HRd;
import p003X.DialogC79392HRi;
import p003X.DialogC88906L1g;
import p003X.DialogInterface$OnClickListenerC79362HQe;
import p003X.DialogInterface$OnClickListenerC79363HQf;
import p003X.H04;
import p003X.H3F;
import p003X.HH8;
import p003X.HNG;
import p003X.HNR;
import p003X.HP8;
import p003X.HQ6;
import p003X.HQ9;
import p003X.HQG;
import p003X.HQJ;
import p003X.HQL;
import p003X.HQO;
import p003X.HQU;
import p003X.HQX;
import p003X.HR4;
import p003X.HRZ;
import p003X.HW5;
import p003X.HWW;
import p003X.IQV;
import p003X.IQX;
import p003X.KDS;
import p003X.LK1;
import p003X.LK5;
import p003X.QB4;

/* loaded from: classes3.dex */
public final class MultiAnchorLinkWidget extends BaseEqualLinkWidget<AnchorLinkUser> implements Observer<KVData>, AbstractC4568i, C4569d.AbstractC4570a, AbstractC4780t, AbstractC4569445g {
    public static ChangeQuickRedirect LIZIZ;
    public C4518a LIZJ;
    public C79374HQq LIZLLL;

    /* renamed from: LJ */
    public C4520a f26339LJ;
    public C79379HQv LJFF;
    public C79353HPv LJI;
    public long LJIIIIZZ;
    public H3F LJIIJJI;
    public C79368HQk LJIIL;
    public HQ6 LJIILIIL;
    public C4536j LJIILJJIL;
    public long LJIILL;
    public AbstractC6070q LJIILLIIL;
    public long LJJI;
    public DialogC88906L1g LJJIFFI;
    public Runnable LJJII;
    public long LJJIII;
    public boolean LJJIIJ;
    public int LJJIIJZLJL;
    public AbstractDialogC9363b LJJIIZ;
    public InteractCommentWidget LJJIIZI;
    public C79372HQo LJJIJ;
    public MultiPkActivityWidget LJJIJIL;
    public MultiAnchorPkWidget LJJIJLIJ;
    public ViewGroup LJJIL;
    public MultiAnchorTeamPkWidget LJJIZ;
    public ViewGroup LJJJ;
    public MultiPKLastResultWidget LJJJI;
    public MultiPkExtraResultAnimWidget LJJJIL;
    public ViewGroup LJJJJIZL;
    public Disposable LJJJJJ;
    public Configuration LJJJJJL;
    public String LJII = "";
    public String LJIIIZ = "";
    public int LJIIJ = 1;
    public final HQL LJJIJIIJI = new HQL();
    public final CompositeDisposable LJJIJIIJIL = new CompositeDisposable();
    public final HQO LJJIJL = new HQO(this);
    public final HP8 LJJJJL = new HP8(this);

    static {
        Covode.recordClassIndex(27821);
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget
    public final int LIZIZ() {
        return 7;
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final void LIZIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZIZ, false, 51).isSupported) {
            return;
        }
        AbstractC416582eC.LIZ(this, th);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final String LJJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 50);
        return proxy.isSupported ? (String) proxy.result : AbstractC416582eC.LIZ(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699382;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a199";
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 52).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget
    /* renamed from: LJ */
    public final HQG mo15702LJ() {
        return this.f26339LJ;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget
    public final AbstractC6070q LJFF() {
        return this.LJIILLIIL;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        Map<String, Object> LIZJ;
        List<String> emptyList;
        C4518a c4518a;
        C79199HJx c79199HJx;
        Config LJIIJ;
        LiveCore liveCore;
        ILayerControl layerControl;
        C79199HJx c79199HJx2;
        Config LJIIJ2;
        C2WC<Room> LIZ;
        Room LIZ2;
        C79317HOl LIZJ2;
        C4536j c4536j;
        C4536j c4536j2;
        C79379HQv c79379HQv;
        AbstractC4781u LIZ3;
        List<AnchorLinkUser> LIZLLL;
        NextLiveData<Integer> nextLiveData;
        List<AnchorLinkUser> LIZLLL2;
        NextLiveData<Integer> nextLiveData2;
        C2WC<Integer> LLFFF;
        Observable<Integer> LIZIZ2;
        Disposable subscribe;
        HWW hww;
        Integer valueOf;
        NextLiveData<Integer> nextLiveData3;
        Room room;
        StreamUrlExtra streamUrlExtra;
        MethodCollector.m14708i(1900);
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 5).isSupported) {
            MethodCollector.m14707o(1900);
        } else if (this.widgetCallback == null) {
            MethodCollector.m14707o(1900);
        } else {
            super.onCreate();
            C5923dp LJJJI = LJJJI();
            if (LJJJI != null) {
                Pair LIZ4 = IQV.LIZ((Function0) new MultiAnchorLinkWidget$onCreate$1$dataPair$1(LJJJI));
                this.LJIILJJIL = (C4536j) LIZ4.getFirst();
                IQX.LIZ((C13491f) LIZ4.getFirst(), HW5.LIZ());
                this.LJJJJJ = (Disposable) LIZ4.getSecond();
            }
            Pair LIZ5 = IQV.LIZ((Function0) MultiAnchorLinkWidget$onCreate$pairs$1.INSTANCE);
            ((C4535h) LIZ5.getFirst()).LIZ().LIZIZ(this);
            IQX.LIZ((C13491f) LIZ5.getFirst(), "IMultiAnchorLinkService");
            this.LJJIJIIJIL.add((Disposable) LIZ5.getSecond());
            AbstractC4782v LIZ6 = AbstractC4782v.LJIIL.LIZ();
            this.LIZJ = LIZ6 != null ? LIZ6.LIZ() : null;
            C4536j c4536j3 = this.LJIILJJIL;
            if (c4536j3 != null) {
                c4536j3.LJIILJJIL = this.LIZJ;
            }
            this.LJI = new C79353HPv(this.LJIILJJIL);
            C79353HPv c79353HPv = this.LJI;
            if (c79353HPv == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c79353HPv.LIZ((AbstractC4568i) this);
            DataCenter dataCenter = this.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter, "");
            this.LJJIJ = new C79372HQo(dataCenter, this.LIZJ);
            AbstractC4782v LIZ7 = AbstractC4782v.LJIIL.LIZ();
            this.f26339LJ = LIZ7 != null ? LIZ7.mo15709LJ() : null;
            C4520a c4520a = this.f26339LJ;
            if (c4520a != null) {
                c4520a.LIZ(this.LJJIJL);
            }
            this.dataCenter.observe("data_pk_renderview_width", this);
            View view = this.contentView;
            if (view == null) {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                MethodCollector.m14707o(1900);
                throw nullPointerException;
            }
            C5923dp LJJJI2 = LJJJI();
            DataCenter dataCenter2 = this.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter2, "");
            this.LJFF = new C79379HQv((FrameLayout) view, LJJJI2, dataCenter2, this.f26339LJ, this.LJIJJLI, this);
            C79379HQv c79379HQv2 = this.LJFF;
            if (c79379HQv2 != null && !PatchProxy.proxy(new Object[0], c79379HQv2, C79379HQv.LIZ, false, 12).isSupported) {
                ALogger.m15797i("ttlive_anchor_link_wm", "start");
                c79379HQv2.LJJJJIZL.observe("cmd_gift_dialog_switch", c79379HQv2.LJJJIL);
                c79379HQv2.LJJJJIZL.observe("data_video_size_pair", c79379HQv2.LJJJIL);
                c79379HQv2.LJJIJIIJI = c79379HQv2.mo15729LJ();
                boolean z = c79379HQv2.LJJIJIIJI;
                if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, c79379HQv2, C79379HQv.LIZ, false, 13).isSupported) {
                    Context context = c79379HQv2.LJJJJ.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    boolean z2 = c79379HQv2.LJJJJJL;
                    LiveMode liveMode = (LiveMode) c79379HQv2.LJJJJIZL.get("data_live_mode");
                    if (liveMode == null) {
                        liveMode = LiveMode.UNDEFINED;
                    }
                    Intrinsics.checkNotNullExpressionValue(liveMode, "");
                    c79379HQv2.LJJIL = new C79378HQu(context, z2, liveMode, c79379HQv2.LJJJJIZL);
                    C79378HQu c79378HQu = c79379HQv2.LJJIL;
                    if (c79378HQu != null) {
                        c79378HQu.LIZ(z);
                    }
                    C79378HQu c79378HQu2 = c79379HQv2.LJJIL;
                    if (c79378HQu2 != null) {
                        c79378HQu2.LIZJ = c79379HQv2;
                    }
                    C79378HQu c79378HQu3 = c79379HQv2.LJJIL;
                    c79379HQv2.LJIIIIZZ = c79378HQu3 != null ? c79378HQu3.LIZIZ : null;
                }
                int i = c79379HQv2.LJIIIZ;
                c79379HQv2.LJJ = (Room) c79379HQv2.LJJJJIZL.get("data_room", (String) new Room());
                if ((c79379HQv2.LJJJJJL ^ true ? c79379HQv2 : null) != null && (room = c79379HQv2.LJJ) != null && (streamUrlExtra = room.getStreamUrlExtra()) != null) {
                    if (c79379HQv2.LIZ(c79379HQv2.LJJIII)) {
                        Object obj = c79379HQv2.LJJJJIZL.get("data_pk_renderview_width", (String) 0);
                        Intrinsics.checkNotNullExpressionValue(obj, "");
                        c79379HQv2.LJIIIZ = ((Number) obj).intValue();
                    } else {
                        c79379HQv2.LJIIIZ = RangesKt___RangesKt.coerceAtMost(UIUtils.getScreenWidth(LK5.LJIIJ()), UIUtils.getScreenHeight(LK5.LJIIJ()));
                    }
                    c79379HQv2.LJIIJ = (c79379HQv2.LJIIIZ * streamUrlExtra.LIZ()) / streamUrlExtra.LIZIZ();
                    c79379HQv2.LJII();
                }
                C4520a c4520a2 = c79379HQv2.LJJJJJ;
                if (c4520a2 != null) {
                    c4520a2.LIZ(c79379HQv2);
                }
                c79379HQv2.LJIL.add(C87010KQi.LIZ().LIZ(C5986ap.class).subscribe(new C79367HQj(c79379HQv2)));
                DataCenter dataCenter3 = c79379HQv2.LJJJJIZL;
                if (dataCenter3 != null) {
                    dataCenter3.observeForever("DATA_IS_HIDE_INTERACTION", c79379HQv2);
                }
                Context context2 = c79379HQv2.LJJJJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                c79379HQv2.LJIJI = new HWW(context2);
                HWW hww2 = c79379HQv2.LJIJI;
                if (hww2 != null) {
                    hww2.LIZIZ = c79379HQv2.LJJJJJL;
                }
                int LIZ8 = ((int) c79379HQv2.LJIILIIL) + ((!c79379HQv2.LJIILIIL() || !c79379HQv2.mo15729LJ()) ? 0 : LK5.LIZ(c79379HQv2.LIZIZ)) + C79379HQv.LIZ(c79379HQv2.LJJIJLIJ);
                c79379HQv2.LJIJJ = new FrameLayout(c79379HQv2.LJJJJ.getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LK5.LIZ(28.0f), LK5.LIZ(28.0f));
                layoutParams.gravity = 8388613;
                layoutParams.topMargin = LIZ8 + LK5.LIZ(6.0f);
                layoutParams.rightMargin = LK5.LIZ(44.0f);
                c79379HQv2.LJIJJLI = layoutParams;
                c79379HQv2.LJJJJ.addView(c79379HQv2.LJIJJ, c79379HQv2.LJIJJLI);
                if (i != c79379HQv2.LJIIIZ) {
                    c79379HQv2.LJIILLIIL();
                }
                if (!c79379HQv2.LJJJJJL) {
                    c79379HQv2.LJIILL();
                    HWW hww3 = c79379HQv2.LJIJI;
                    if (hww3 != null) {
                        LK1.LIZIZ(hww3);
                    }
                }
                if (C4580049i.LIZIZ && C4580049i.LIZJ && !c79379HQv2.LJJJJJL && C4580049i.LIZIZ()) {
                    UIUtils.updateLayoutMargin(c79379HQv2.LJJJJ, -3, -C4580049i.LIZ(c79379HQv2.LJJJJ.getContext()), -3, -3);
                    SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_MULTI_ANCHOR_BOTTOM_BG_MISS_PART_COMPACT;
                    Intrinsics.checkNotNullExpressionValue(settingKey, "");
                    Boolean value = settingKey.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "");
                    if (value.booleanValue()) {
                        ViewParent parent = c79379HQv2.LJJJJ.getParent();
                        if (!(parent instanceof ViewGroup)) {
                            parent = null;
                        }
                        ViewGroup viewGroup = (ViewGroup) parent;
                        if (viewGroup != null) {
                            viewGroup.setClipChildren(false);
                        }
                        c79379HQv2.LJJIZ = true;
                    }
                }
                Object obj2 = c79379HQv2.LJJJJIZL.get("data_first_frame_sei", "");
                if (obj2 instanceof String) {
                    SettingKey<Boolean> settingKey2 = LiveConfigSettingKeys.LIVE_PK_LOAD_OPT_ENABLE;
                    Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                    Boolean value2 = settingKey2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "");
                    if (value2.booleanValue()) {
                        String str = (String) obj2;
                        if (!TextUtils.isEmpty(str)) {
                            c79379HQv2.LIZ(str);
                        }
                    }
                }
                if (!c79379HQv2.LJJJJJL && (hww = c79379HQv2.LJIJI) != null) {
                    boolean LIZ9 = C79359HQb.LIZIZ.LIZ();
                    C4536j LJIIL = c79379HQv2.LJIIL();
                    if (LJIIL == null || (nextLiveData3 = LJIIL.LJI) == null || (valueOf = nextLiveData3.getValue()) == null) {
                        valueOf = Integer.valueOf(C79506HVs.LIZLLL());
                    }
                    Intrinsics.checkNotNullExpressionValue(valueOf, "");
                    hww.LIZ(LIZ9, valueOf.intValue());
                }
                C5923dp c5923dp = c79379HQv2.LJJJJI;
                if (c5923dp != null && (LLFFF = c5923dp.LLFFF()) != null && (LIZIZ2 = LLFFF.LIZIZ()) != null && (subscribe = LIZIZ2.subscribe(new C79381HQx(c79379HQv2))) != null) {
                    QB4.LIZ(subscribe, c79379HQv2.LJIL);
                }
            }
            C79379HQv c79379HQv3 = this.LJFF;
            if (c79379HQv3 != null && !TextUtils.isEmpty(this.LJII)) {
                c79379HQv3.LIZ(this.LJII);
            }
            C4536j c4536j4 = this.LJIILJJIL;
            if (c4536j4 != null && (nextLiveData2 = c4536j4.LJI) != null) {
                nextLiveData2.observe(this, new HQX(this));
            }
            C79379HQv c79379HQv4 = this.LJFF;
            if (c79379HQv4 != null) {
                c79379HQv4.LJJIJIIJIL = this;
            }
            C79379HQv c79379HQv5 = this.LJFF;
            if (c79379HQv5 != null) {
                this.LJJIIZI = new InteractCommentWidget(c79379HQv5.LJIJJ, this.containerView, 7);
                enableSubWidgetManager();
                this.subWidgetManager.load(this.LJJIIZI);
            }
            ALogger.m15797i("ttlive_anchor_link", "MultiAnchorLinkWidget onCreate " + this.LIZJ);
            if (!this.LJIJJLI) {
                SettingKey<Boolean> settingKey3 = LiveConfigSettingKeys.MULTI_ANCHOR_MESSAGE_REQUEST_ENABLE;
                Intrinsics.checkNotNullExpressionValue(settingKey3, "");
                Boolean value3 = settingKey3.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "");
                if (value3.booleanValue()) {
                    C4520a c4520a3 = this.f26339LJ;
                    if (c4520a3 != null && (LIZLLL2 = c4520a3.LIZLLL()) != null && (LIZLLL2 == null || LIZLLL2.isEmpty())) {
                        C4520a c4520a4 = this.f26339LJ;
                        if (c4520a4 != null) {
                            c4520a4.LIZ(2, "multi_anchor_link_widget_create");
                        }
                    } else {
                        C4536j c4536j5 = this.LJIILJJIL;
                        if (c4536j5 != null && (nextLiveData = c4536j5.LJI) != null) {
                            nextLiveData.setValue(Integer.valueOf(C79506HVs.LIZ()));
                        }
                    }
                } else {
                    C4520a c4520a5 = this.f26339LJ;
                    if (c4520a5 != null) {
                        c4520a5.LIZ(2, "multi_anchor_link_widget_create");
                    }
                }
                C4520a c4520a6 = this.f26339LJ;
                if (c4520a6 != null) {
                    c4520a6.LJIIL();
                }
                this.LJJIII = System.currentTimeMillis();
            } else {
                C4520a c4520a7 = this.f26339LJ;
                if (c4520a7 != null) {
                    c4520a7.LIZ(2, "multi_anchor_link_widget_create");
                }
                AbstractC4782v LIZ10 = AbstractC4782v.LJIIL.LIZ();
                if (LIZ10 != null && (LIZJ2 = LIZ10.LIZJ()) != null) {
                    LIZJ2.LIZ(this.LJJJJL);
                }
                this.LJJI = System.currentTimeMillis();
                C79372HQo c79372HQo = this.LJJIJ;
                if (c79372HQo != null && !PatchProxy.proxy(new Object[0], c79372HQo, C79372HQo.LIZ, false, 1).isSupported) {
                    HashMap hashMap = new HashMap();
                    C5923dp LIZ11 = C5923dp.LJIIJ.LIZ(c79372HQo.LIZIZ, 0L);
                    hashMap.put("enter_from", LIZ11 != null ? LIZ11.LLFF().LIZ() : "connection_panel");
                    if (AbstractC4782v.LJIIL.LIZ() != null) {
                        AbstractC4782v LIZ12 = AbstractC4782v.LJIIL.LIZ();
                        Intrinsics.checkNotNull(LIZ12);
                        int LJIIL2 = LIZ12.mo15709LJ().LJIIL() + 1;
                        hashMap.put("anchor_connect_status", String.valueOf(LJIIL2));
                        hashMap.put("connection_anchor_cnt", String.valueOf(LJIIL2));
                    }
                    hashMap.put("invitee_id", String.valueOf(LinkCrossRoomDataHolder.LJII().LJJJLIIL));
                    hashMap.put("invitee_list", C79910Hei.LIZIZ.LIZIZ((int) LinkCrossRoomDataHolder.LJII().LJII));
                    hashMap.put("channel_id", String.valueOf(LinkCrossRoomDataHolder.LJII().LIZLLL));
                    hashMap.put("anchor_connection_type", LinkCrossRoomDataHolder.LJII().LJJLJ);
                    hashMap.put("is_transform", "0");
                    hashMap.put("from_room_status", "live");
                    if (LIZ11 != null && (LIZ = LIZ11.LIZ()) != null && (LIZ2 = LIZ.LIZ()) != null) {
                        hashMap.put("audience_num", String.valueOf(LIZ2.getUserCount()));
                    }
                    hashMap.put("is_oncemore", "0");
                    C4518a c4518a2 = c79372HQo.LIZJ;
                    if (c4518a2 != null) {
                        boolean z3 = c4518a2.LIZJ == 4;
                        hashMap.put("anchor_type", HQJ.LIZIZ(c4518a2.LJII));
                        hashMap.put("npk_link_type", HQJ.LIZIZ(c4518a2.LJI, z3));
                        hashMap.put("source", c4518a2.LJIIIZ);
                        hashMap.put("connection_type", !z3 ? "manual_link" : "");
                    }
                    C4574547f LIZ13 = C4574547f.LIZ();
                    LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
                    Intrinsics.checkNotNullExpressionValue(LJII, "");
                    LIZ13.LIZ("livesdk_connection_success", hashMap, LJII.LJIIIIZZ(), Room.class, C8668v.class);
                }
                LinkCrossRoomDataHolder.LJII().LJJIIJZLJL = false;
                C79199HJx c79199HJx3 = this.LJIJJ;
                if (c79199HJx3 != null && !c79199HJx3.LJIIIIZZ) {
                    HQ9 hq9 = this.LJIJI;
                    if (hq9 != null) {
                        hq9.LIZ(this.LJJ.mo15779LJ(), 0);
                    }
                } else {
                    this.dataCenter.put("cmd_interact_state_change", new C5984am(7));
                    C79199HJx c79199HJx4 = this.LJIJJ;
                    if (c79199HJx4 != null && (LJIIJ2 = c79199HJx4.LJIIJ()) != null) {
                        LJIIJ2.setSeiVersion(6);
                    }
                    C79199HJx c79199HJx5 = this.LJIJJ;
                    if (c79199HJx5 != null) {
                        c79199HJx5.LIZ(Config.InteractMode.MULTI_ANCHOR);
                    }
                    if (this.LIZLLL == null) {
                        C79199HJx c79199HJx6 = this.LJIJJ;
                        this.LIZLLL = new C79374HQq(c79199HJx6 != null ? c79199HJx6.LJIIJ() : null, this.LJFF);
                    }
                    C79374HQq c79374HQq = this.LIZLLL;
                    if (c79374HQq != null && (c79199HJx2 = this.LJIJJ) != null) {
                        c79199HJx2.LIZ(c79374HQq);
                    }
                    C79199HJx c79199HJx7 = this.LJIJJ;
                    if (c79199HJx7 != null) {
                        c79199HJx7.LIZ(this);
                    }
                    if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 18).isSupported) {
                        C79199HJx c79199HJx8 = this.LJIJJ;
                        if (c79199HJx8 != null && (LJIIJ = c79199HJx8.LJIIJ()) != null && LJIIJ.isSingleViewMode()) {
                            C79379HQv c79379HQv6 = this.LJFF;
                            if (c79379HQv6 != null) {
                                String LIZIZ3 = this.LJJ.LIZIZ();
                                AbstractC6070q abstractC6070q = this.LJIILLIIL;
                                c79379HQv6.LIZ(LIZIZ3, (abstractC6070q == null || (liveCore = abstractC6070q.getLiveCore()) == null || (layerControl = liveCore.getLayerControl()) == null) ? null : layerControl.getLocalOriginLayer());
                            }
                        } else {
                            C79379HQv c79379HQv7 = this.LJFF;
                            if (c79379HQv7 != null) {
                                c79379HQv7.LIZ(this.LJJ.LIZIZ(), (SurfaceView) null);
                            }
                        }
                        StringBuilder sb = new StringBuilder("onRtcAlreadyStartedOnCreate ");
                        LinkCrossRoomDataHolder LJII2 = LinkCrossRoomDataHolder.LJII();
                        Intrinsics.checkNotNullExpressionValue(LJII2, "");
                        sb.append(LJII2.LJLJJLL);
                        ALogger.m15797i("ttlive_anchor_link", sb.toString());
                        LinkCrossRoomDataHolder LJII3 = LinkCrossRoomDataHolder.LJII();
                        Intrinsics.checkNotNullExpressionValue(LJII3, "");
                        C79112HGo c79112HGo = LJII3.LJLJJLL;
                        if (c79112HGo != null && c79112HGo.LIZIZ && (c79199HJx = this.LJIJJ) != null) {
                            c79199HJx.LIZIZ(c79112HGo.LIZJ, "onCreateRtcOn");
                        }
                    }
                    StringBuilder sb2 = new StringBuilder("rtc removeViewMap ");
                    C79199HJx c79199HJx9 = this.LJIJJ;
                    sb2.append(c79199HJx9 != null ? c79199HJx9.LIZJ() : null);
                    ALogger.m15795w("ttlive_anchor_link", sb2.toString());
                    C79199HJx c79199HJx10 = this.LJIJJ;
                    if (c79199HJx10 != null && (LIZJ = c79199HJx10.LIZJ()) != null) {
                        for (String str2 : LIZJ.keySet()) {
                            Object obj3 = LIZJ.get(str2);
                            LIZIZ(str2);
                            if (obj3 instanceof SurfaceView) {
                                SurfaceView surfaceView = (SurfaceView) obj3;
                                LIZ(str2, surfaceView, 0, 0);
                                LIZIZ(str2, surfaceView, 0, 0);
                            } else if (obj3 instanceof TextureView) {
                                TextureView textureView = (TextureView) obj3;
                                LIZ(str2, textureView, 0, 0);
                                LIZIZ(str2, textureView, 0, 0);
                            } else if (obj3 instanceof ILayerControl.ILayer) {
                                LIZIZ(str2, (ILayerControl.ILayer) obj3, 0, 0);
                            }
                        }
                        C79199HJx c79199HJx11 = this.LJIJJ;
                        if (c79199HJx11 == null || (emptyList = c79199HJx11.LIZLLL()) == null) {
                            emptyList = CollectionsKt__CollectionsKt.emptyList();
                        }
                        if (!PatchProxy.proxy(new Object[]{LIZJ, emptyList}, this, LIZIZ, false, 6).isSupported && (c4518a = this.LIZJ) != null && emptyList.size() != LIZJ.size()) {
                            C79313HOh c79313HOh = C79313HOh.f6779LJ;
                            String c4518a3 = c4518a.toString();
                            boolean z4 = c4518a.LJI;
                            if (!PatchProxy.proxy(new Object[]{c4518a3, Byte.valueOf(z4 ? (byte) 1 : (byte) 0), LIZJ, emptyList}, c79313HOh, C79313HOh.LIZLLL, false, 46).isSupported) {
                                C106862S5w.LIZ(c4518a3, LIZJ, emptyList);
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.put("error_msg", "view:" + LIZJ.size() + ",user:" + emptyList.size());
                                linkedHashMap.put("connection_context", c4518a3);
                                linkedHashMap.put("remote_views", LIZJ);
                                linkedHashMap.put("remote_users", emptyList);
                                linkedHashMap.put("is_multi_to_multi", Boolean.valueOf(z4));
                                c79313HOh.LIZIZ(linkedHashMap);
                                c79313HOh.LIZ(linkedHashMap);
                                C2IN.LIZIZ().LIZJ("ttlive_anchor_link", "link_init_remote_view_error: " + linkedHashMap);
                                HNG.LIZ("link_init_remote_view_error", (Map<String, Object>) linkedHashMap, (AbstractC4254a) LinkCrossRoomDataHolder.LJII(), false);
                            }
                        }
                    }
                }
            }
            DataCenter dataCenter4 = this.dataCenter;
            if (dataCenter4 != null) {
                dataCenter4.put("cmd_update_sticker_visible", Boolean.FALSE);
            }
            if (this.LJIJJLI) {
                this.LJIILIIL = new HQ6(this.LJIJJ, LinkCrossRoomDataHolder.LJII().LIZLLL);
                HQL hql = this.LJJIJIIJI;
                if (!PatchProxy.proxy(new Object[0], hql, HQL.LIZ, false, 4).isSupported) {
                    C4520a c4520a8 = hql.LIZJ;
                    if (c4520a8 != null) {
                        c4520a8.LIZ(hql.LJFF);
                    }
                    C4520a c4520a9 = hql.LIZJ;
                    if (c4520a9 != null && (LIZLLL = c4520a9.LIZLLL()) != null) {
                        hql.f6799LJ.addAll(LIZLLL);
                    }
                }
            }
            AbstractC4781u LIZ14 = C4566a.LIZJ.LIZ();
            if (LIZ14 != null && LIZ14.LIZ() && this.LJIJJLI && LinkCrossRoomDataHolder.LJII().LJLJJL == 2 && (LIZ3 = C4566a.LIZJ.LIZ()) != null) {
                LIZ3.LIZ(true, "npk_connect");
            }
            if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 30).isSupported && (c4536j2 = this.LJIILJJIL) != null && (c79379HQv = this.LJFF) != null) {
                this.LJJJI = new MultiPKLastResultWidget(c4536j2, this.f26339LJ, c79379HQv);
                enableSubWidgetManager();
                WidgetManager widgetManager = this.subWidgetManager;
                if (!(widgetManager instanceof C458454Bb)) {
                    widgetManager = null;
                }
                C458454Bb c458454Bb = (C458454Bb) widgetManager;
                if (c458454Bb != null) {
                    c458454Bb.LIZLLL = true;
                }
                this.subWidgetManager.load((Widget) this.LJJJI, false);
            }
            if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 31).isSupported && (c4536j = this.LJIILJJIL) != null) {
                this.LJJJIL = new MultiPkExtraResultAnimWidget(c4536j);
                if (this.LJJJJIZL == null) {
                    this.LJJJJIZL = new FrameLayout(this.context);
                    this.containerView.addView(this.LJJJJIZL, -1, -1);
                }
                enableSubWidgetManager();
                WidgetManager widgetManager2 = this.subWidgetManager;
                if (!(widgetManager2 instanceof C458454Bb)) {
                    widgetManager2 = null;
                }
                C458454Bb c458454Bb2 = (C458454Bb) widgetManager2;
                if (c458454Bb2 != null) {
                    c458454Bb2.LIZLLL = true;
                }
                this.subWidgetManager.load(this.LJJJJIZL, (Widget) this.LJJJIL, false);
            }
            if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 32).isSupported) {
                enableSubWidgetManager();
                this.LJJIJIL = new MultiPkActivityWidget();
                WidgetManager widgetManager3 = this.subWidgetManager;
                if (!(widgetManager3 instanceof C458454Bb)) {
                    widgetManager3 = null;
                }
                C458454Bb c458454Bb3 = (C458454Bb) widgetManager3;
                if (c458454Bb3 != null) {
                    c458454Bb3.LIZLLL = true;
                }
                this.subWidgetManager.load(this.LJJIJIL);
            }
            MethodCollector.m14707o(1900);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        r0 = r0.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        r0.setPublishPlanarRender(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        r0 = r7.LJIJJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        r0 = r0.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        r0.setDisplayPlanarRender(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        r8.setSingleViewMode(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        r7.LIZLLL = new p003X.C79374HQq(r8, r7.LJFF);
        r8.setStreamMixer(r7.LIZLLL);
        r8.setBackgroundColor("#1F212C");
        r0 = LJIIIZ().getStreamUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
        r2 = r0.LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
        r8.setMixStreamRtmpUrl(r2);
        r1 = com.bytedance.hotfix.PatchProxy.proxy(new java.lang.Object[0], r7, com.bytedance.android.live.liveinteract.multianchor.MultiAnchorLinkWidget.LIZIZ, false, 16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
        if (r1.isSupported == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
        r6 = (com.p1594ss.avframework.livestreamv2.core.interact.model.Config.VideoQuality) r1.result;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
        r8.setVideoQuality(r6);
        r8.setCharacter(com.p1594ss.avframework.livestreamv2.core.interact.model.Config.Character.ANCHOR);
        r8.setInteractMode(com.p1594ss.avframework.livestreamv2.core.interact.model.Config.InteractMode.MULTI_ANCHOR);
        r8.setSeiVersion(6);
        r8.setType(com.p1594ss.avframework.livestreamv2.core.interact.model.Config.Type.VIDEO);
        r8.setInteractMode(com.p1594ss.avframework.livestreamv2.core.interact.model.Config.InteractMode.MULTI_ANCHOR);
        r8.setVolumeCallbackInterval(300);
        r0 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.ANCHOR_SEI_UPDATE_ENABLE.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
        if (r0.booleanValue() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
        r8.setUpdateTalkSeiAB(true);
        r8.setUpdateTalkSeiInterval(1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b7, code lost:
        r6 = new com.p1594ss.avframework.livestreamv2.core.interact.model.Config.VideoQuality(272, 480, 15, 500);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
        if (r0.booleanValue() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
        r0 = r7.LJIJJ;
     */
    @Override // com.bytedance.android.live.liveinteract.newpk.AbstractC4585d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(com.p1594ss.avframework.livestreamv2.core.interact.model.InteractConfig r8) {
        /*
            r7 = this;
            r4 = 1
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r3 = 0
            r2[r3] = r8
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.multianchor.MultiAnchorLinkWidget.LIZIZ
            r0 = 14
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r7, r1, r3, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L13
            return
        L13:
            java.lang.Object[] r5 = new java.lang.Object[r3]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = p003X.C79242HLo.LIZ
            r0 = 43
            r2 = 0
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r5, r2, r1, r4, r0)
            boolean r0 = r1.isSupported
            java.lang.String r5 = ""
            if (r0 == 0) goto Lc5
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L47
        L2e:
            X.HJx r0 = r7.LJIJJ
            if (r0 == 0) goto L39
            com.ss.avframework.livestreamv2.core.LiveCore r0 = r0.LIZJ
            if (r0 == 0) goto L39
            r0.setPublishPlanarRender(r4)
        L39:
            X.HJx r0 = r7.LJIJJ
            if (r0 == 0) goto L44
            com.ss.avframework.livestreamv2.core.LiveCore r0 = r0.LIZJ
            if (r0 == 0) goto L44
            r0.setDisplayPlanarRender(r4)
        L44:
            r8.setSingleViewMode(r4)
        L47:
            X.HQq r1 = new X.HQq
            X.HQv r0 = r7.LJFF
            r1.<init>(r8, r0)
            r7.LIZLLL = r1
            X.HQq r0 = r7.LIZLLL
            r8.setStreamMixer(r0)
            java.lang.String r0 = "#1F212C"
            r8.setBackgroundColor(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.LJIIIZ()
            com.bytedance.android.livesdkapi.depend.model.live.StreamUrl r0 = r0.getStreamUrl()
            if (r0 == 0) goto L68
            java.lang.String r2 = r0.LIZ()
        L68:
            r8.setMixStreamRtmpUrl(r2)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.multianchor.MultiAnchorLinkWidget.LIZIZ
            r0 = 16
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r7, r1, r3, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto Lb7
            java.lang.Object r6 = r1.result
            com.ss.avframework.livestreamv2.core.interact.model.Config$VideoQuality r6 = (com.p1594ss.avframework.livestreamv2.core.interact.model.Config.VideoQuality) r6
        L7d:
            r8.setVideoQuality(r6)
            com.ss.avframework.livestreamv2.core.interact.model.Config$Character r0 = com.p1594ss.avframework.livestreamv2.core.interact.model.Config.Character.ANCHOR
            r8.setCharacter(r0)
            com.ss.avframework.livestreamv2.core.interact.model.Config$InteractMode r0 = com.p1594ss.avframework.livestreamv2.core.interact.model.Config.InteractMode.MULTI_ANCHOR
            r8.setInteractMode(r0)
            r0 = 6
            r8.setSeiVersion(r0)
            com.ss.avframework.livestreamv2.core.interact.model.Config$Type r0 = com.p1594ss.avframework.livestreamv2.core.interact.model.Config.Type.VIDEO
            r8.setType(r0)
            com.ss.avframework.livestreamv2.core.interact.model.Config$InteractMode r0 = com.p1594ss.avframework.livestreamv2.core.interact.model.Config.InteractMode.MULTI_ANCHOR
            r8.setInteractMode(r0)
            r0 = 300(0x12c, float:4.2E-43)
            r8.setVolumeCallbackInterval(r0)
            com.bytedance.android.live.core.setting.SettingKey<java.lang.Boolean> r0 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.ANCHOR_SEI_UPDATE_ENABLE
            java.lang.Object r0 = r0.getValue()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb6
            r8.setUpdateTalkSeiAB(r4)
            r0 = 1000(0x3e8, float:1.401E-42)
            r8.setUpdateTalkSeiInterval(r0)
        Lb6:
            return
        Lb7:
            com.ss.avframework.livestreamv2.core.interact.model.Config$VideoQuality r6 = new com.ss.avframework.livestreamv2.core.interact.model.Config$VideoQuality
            r3 = 272(0x110, float:3.81E-43)
            r2 = 480(0x1e0, float:6.73E-43)
            r1 = 15
            r0 = 500(0x1f4, float:7.0E-43)
            r6.<init>(r3, r2, r1, r0)
            goto L7d
        Lc5:
            com.bytedance.android.live.core.setting.SettingKey<java.lang.Boolean> r0 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_MULTI_ANCHOR_SINGLE_VIEW
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            java.lang.Object r0 = r0.getValue()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L47
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multianchor.MultiAnchorLinkWidget.LIZ(com.ss.avframework.livestreamv2.core.interact.model.InteractConfig):void");
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.presenter.AbstractC4568i
    public final void LIZ(C8693r c8693r) {
        C4518a c4518a;
        String str;
        C79199HJx c79199HJx;
        if (PatchProxy.proxy(new Object[]{c8693r}, this, LIZIZ, false, 19).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8693r);
        C8691p c8691p = c8693r.LJIIIIZZ;
        if (c8691p != null) {
            LinkCrossRoomDataHolder.LJII().LJIJJLI = c8691p.LIZJ;
            if (C79347HPp.LIZIZ(c8691p.LIZIZ)) {
                LinkCrossRoomDataHolder.LJII().LJJJLL = "null";
            }
        }
        C79345HPn c79345HPn = C4518a.LJIIJ;
        C4518a c4518a2 = this.LIZJ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c8693r, c4518a2}, c79345HPn, C79345HPn.LIZ, false, 3);
        if (proxy.isSupported) {
            c4518a = (C4518a) proxy.result;
        } else {
            C106862S5w.LIZ(c8693r);
            C8691p c8691p2 = c8693r.LJIIIIZZ;
            if (c8691p2 == null) {
                c8691p2 = new C8691p();
            }
            boolean LIZ = c8693r.LIZ();
            int i = c8691p2.LIZJ;
            String LIZ2 = c79345HPn.LIZ(c8691p2.LIZIZ);
            boolean z = LIZ || C79347HPp.LIZ(c8691p2.LIZJ);
            int i2 = c8691p2.LIZIZ;
            if (c4518a2 == null || (str = c4518a2.LJIIIZ) == null) {
                str = "link_banner";
            }
            c4518a = new C4518a("linkSwitchChannel", i, LIZ2, false, LIZ, z, i2, null, str, 136);
        }
        this.LIZJ = c4518a;
        C4536j c4536j = this.LJIILJJIL;
        if (c4536j != null) {
            c4536j.LJIILJJIL = this.LIZJ;
        }
        LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        C79112HGo c79112HGo = LJII.LJLJJLL;
        if (c79112HGo != null && c79112HGo.LIZIZ && (c79199HJx = this.LJIJJ) != null) {
            c79199HJx.LIZIZ(c79112HGo.LIZJ, "switchChannel");
        }
        C79313HOh.f6779LJ.LIZ(c8693r, true);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget, com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZ(String str, SurfaceView surfaceView, int i, int i2) {
        C79379HQv c79379HQv;
        if (PatchProxy.proxy(new Object[]{str, surfaceView, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 20).isSupported) {
            return;
        }
        super.LIZ(str, surfaceView, i, i2);
        if (surfaceView == null || str == null || (c79379HQv = this.LJFF) == null) {
            return;
        }
        c79379HQv.LIZ(str, surfaceView);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget, com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZ(String str, ILayerControl.ILayer iLayer, int i, int i2) {
        C79379HQv c79379HQv;
        if (PatchProxy.proxy(new Object[]{str, iLayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 23).isSupported) {
            return;
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.MULTI_LINK_FIRST_FRAME_FIX;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (!settingKey.getValue().booleanValue() || iLayer == null || str == null || (c79379HQv = this.LJFF) == null) {
            return;
        }
        c79379HQv.LIZ(str, iLayer);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget, com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZ(String str, long j) {
        AbstractDialogC9363b abstractDialogC9363b;
        AnchorLinkUser LIZ;
        HashMap<Long, String> hashMap;
        C79317HOl LIZJ;
        if (PatchProxy.proxy(new Object[]{str, new Long(j)}, this, LIZIZ, false, 24).isSupported) {
            return;
        }
        super.LIZ(str, j);
        try {
            ALogger.m15800e("ttlive_anchor_link", "onUserLeaved " + str + " reason=" + j);
            long j2 = 0;
            String str2 = j == 0 ? "rtc_offline_callback_0" : "rtc_offline_callback_1";
            C79379HQv c79379HQv = this.LJFF;
            if (c79379HQv != null && !PatchProxy.proxy(new Object[]{str}, c79379HQv, C79379HQv.LIZ, false, 24).isSupported) {
                C4569d LIZ2 = c79379HQv.LIZ(0L, str);
                ArrayList<C4569d> arrayList = c79379HQv.LJI;
                if (arrayList == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                }
                TypeIntrinsics.asMutableCollection(arrayList).remove(LIZ2);
                ILayerControl.ILayer iLayer = c79379HQv.LJII.get(str);
                if (iLayer != null) {
                    VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
                    videoMixerDescription.setVisibility(false);
                    iLayer.updateDescription(videoMixerDescription);
                    HashMap<String, ILayerControl.ILayer> hashMap2 = c79379HQv.LJII;
                    if (hashMap2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                    }
                    TypeIntrinsics.asMutableMap(hashMap2).remove(str);
                }
                c79379HQv.LJIIJ();
                if (LinkCrossRoomDataHolder.LJII().LJJIJ.contains(str)) {
                    LinkCrossRoomDataHolder.LJII().LJJIJ.remove(str);
                }
            }
            C4520a c4520a = this.f26339LJ;
            if (c4520a != null && (LIZ = c4520a.LIZ(0L, str)) != null) {
                AbstractC4782v LIZ3 = AbstractC4782v.LJIIL.LIZ();
                if (LIZ3 != null && (LIZJ = LIZ3.LIZJ()) != null) {
                    long mo15779LJ = this.LJJ.mo15779LJ();
                    User LIZ4 = LIZ.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                    long id = LIZ4.getId();
                    User LIZ5 = LIZ.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                    LIZJ.LIZ(mo15779LJ, id, LIZ5.getSecUid(), str2);
                }
                C79199HJx c79199HJx = this.LJIJJ;
                if (c79199HJx != null) {
                    User user = LIZ.LIZIZ;
                    c79199HJx.LIZ(user != null ? user.getLiveRoomId() : 0L);
                }
                LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
                Intrinsics.checkNotNullExpressionValue(LJII, "");
                C79112HGo c79112HGo = LJII.LJLJJLL;
                if (c79112HGo != null && c79112HGo.LIZIZ && (hashMap = c79112HGo.LIZJ) != null) {
                    User user2 = LIZ.LIZIZ;
                    if (user2 != null) {
                        j2 = user2.getLiveRoomId();
                    }
                    hashMap.remove(Long.valueOf(j2));
                }
                HQ6 hq6 = this.LJIILIIL;
                if (hq6 != null) {
                    hq6.LIZ();
                }
            }
        } catch (Exception e) {
            C2IN.LIZIZ().LIZ("ttlive_anchor", e);
        }
        AbstractDialogC9363b abstractDialogC9363b2 = this.LJJIIZ;
        if (abstractDialogC9363b2 == null || !abstractDialogC9363b2.isShowing() || (abstractDialogC9363b = this.LJJIIZ) == null) {
            return;
        }
        C116971W2r.LIZ(abstractDialogC9363b);
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.presenter.AbstractC4568i
    public final void LIZ(Runnable runnable, String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{runnable, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 25).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (this.LJIJJLI && this.LJJ.mo15779LJ() > 0) {
            this.LJJII = runnable;
            LIZIZ(str, z);
            this.LJIIIIZZ = this.LJJ.mo15779LJ();
            String str2 = LinkCrossRoomDataHolder.LJII().LJJJLL;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            this.LJIIIZ = str2;
            return;
        }
        AbstractC4774i LIZ = AbstractC78050Gpo.LIZ();
        if (LIZ == null) {
            return;
        }
        LIZ.LIZLLL(64);
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.presenter.AbstractC4568i
    public final void LIZ(String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 26).isSupported) {
            return;
        }
        StringBuilder sb = new StringBuilder("onAnchorStateChanged ");
        sb.append(str);
        sb.append(LoggerUtil.BLANK_TAG);
        sb.append(z ? C109391T5d.LJI : "background");
        ALogger.m15795w("ttlive_anchor_link", sb.toString());
        C79199HJx c79199HJx = this.LJIJJ;
        if (c79199HJx != null && c79199HJx.LJIIIIZZ && str != null) {
            C79374HQq c79374HQq = this.LIZLLL;
            if (c79374HQq != null) {
                Boolean valueOf = Boolean.valueOf(z);
                if (!PatchProxy.proxy(new Object[]{str, valueOf}, c79374HQq, C79374HQq.LIZ, false, 7).isSupported) {
                    C106862S5w.LIZ(str);
                    HashMap<String, Boolean> hashMap = c79374HQq.LIZIZ;
                    Intrinsics.checkNotNull(valueOf);
                    hashMap.put(str, Boolean.valueOf(!valueOf.booleanValue()));
                }
            }
            c79199HJx.LJIIIZ();
        }
        if (!TextUtils.equals(str, LinkCrossRoomDataHolder.LJII().LJIILL)) {
            this.LJJIIJZLJL = !z ? 1 : 0;
        }
        C79379HQv c79379HQv = this.LJFF;
        if (c79379HQv == null) {
            return;
        }
        c79379HQv.LIZ(str, z);
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.presenter.AbstractC4568i
    public final void LIZ(String str, String str2) {
        List<AnchorLinkUser> LIZLLL;
        C7KL LIZ;
        List<AnchorLinkUser> LIZLLL2;
        String str3;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZIZ, false, 34).isSupported) {
            return;
        }
        this.LJJIIJ = true;
        LinkCrossRoomDataHolder.LJII().LJLIIL = true;
        LinkCrossRoomDataHolder.LJII().LJJZ = false;
        C4520a c4520a = this.f26339LJ;
        if (c4520a != null && (LIZLLL2 = c4520a.LIZLLL()) != null) {
            for (AnchorLinkUser anchorLinkUser : LIZLLL2) {
                User LIZ2 = anchorLinkUser.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                if (LIZ2.getId() != LJIIIZ().ownerUserId) {
                    if (LinkCrossRoomDataHolder.LJII().LJJIJ.contains(anchorLinkUser.LIZLLL)) {
                        LinkCrossRoomDataHolder.LJII().LJJJJLL = true;
                    }
                    LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
                    C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.LLILZIL;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                    Integer LIZ3 = c87308Kak.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                    LJII.LJIIJJI = LIZ3.intValue();
                    LinkCrossRoomDataHolder LJII2 = LinkCrossRoomDataHolder.LJII();
                    User LIZ4 = anchorLinkUser.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                    LJII2.LJFF = LIZ4.getId();
                    LinkCrossRoomDataHolder.LJII().LJJJJL = anchorLinkUser.LIZIZ;
                    LinkCrossRoomDataHolder.LJII().LJIIIIZZ = anchorLinkUser.LIZIZ();
                    LinkCrossRoomDataHolder LJII3 = LinkCrossRoomDataHolder.LJII();
                    User LIZ5 = anchorLinkUser.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                    LJII3.LJIIZILJ = LIZ5.getLiveRoomId();
                }
            }
            if (LIZLLL2.size() != 2) {
                C79313HOh c79313HOh = C79313HOh.f6779LJ;
                if (!PatchProxy.proxy(new Object[0], c79313HOh, C79313HOh.LIZLLL, false, 42).isSupported) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    User user = LinkCrossRoomDataHolder.LJII().LJJJJL;
                    if (user == null || (str3 = user.toString()) == null) {
                        str3 = "";
                    }
                    linkedHashMap.put("pk_guest_user", str3);
                    c79313HOh.LIZIZ(linkedHashMap);
                    c79313HOh.LIZ(linkedHashMap);
                    C2IN LIZIZ2 = C2IN.LIZIZ();
                    LIZIZ2.LIZJ("ttlive_anchor_link", "switch_to_pk_state_error: " + linkedHashMap);
                    HNG.LIZ("switch_to_pk_state_error", (Map<String, Object>) linkedHashMap, (AbstractC4254a) LinkCrossRoomDataHolder.LJII(), false);
                }
            }
        }
        C79199HJx c79199HJx = this.LJIJJ;
        if (c79199HJx != null) {
            c79199HJx.LIZ(str2);
        }
        C79199HJx c79199HJx2 = this.LJIJJ;
        if (c79199HJx2 != null) {
            c79199HJx2.LIZIZ(str);
        }
        C4520a c4520a2 = this.f26339LJ;
        if (c4520a2 != null && (LIZLLL = c4520a2.LIZLLL()) != null && LIZLLL.size() == 2) {
            C79353HPv c79353HPv = this.LJI;
            if (c79353HPv == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                int i = this.LJJIIJZLJL;
                if (!PatchProxy.proxy(new Object[]{"0,1", Integer.valueOf(i)}, c79353HPv, C79353HPv.LIZ, false, 5).isSupported) {
                    C106862S5w.LIZ("0,1");
                    LinkAnchorApi linkAnchorApi = (LinkAnchorApi) C88306Kqq.LIZ().LIZ(LinkAnchorApi.class);
                    long j = LinkCrossRoomDataHolder.LJII().LIZLLL;
                    Room room = c79353HPv.LIZJ;
                    Single<C5176i<Void>> updateCrossRoomInfo = linkAnchorApi.updateCrossRoomInfo(j, room != null ? room.getRoomId() : 0L, LinkCrossRoomDataHolder.LJII().LJIIZILJ, 1, "0,1", LinkCrossRoomDataHolder.LJII().LJJJJLL ? 1 : 0, i);
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[0], c79353HPv, HNR.LJIJJLI, false, 6);
                    if (proxy.isSupported) {
                        LIZ = (C7KL) proxy.result;
                    } else {
                        if (c79353HPv.LJIL == null) {
                            c79353HPv.LJIL = new C117876Wac();
                        }
                        LIZ = C148062fT6.LIZ(C4154a.LIZ((LifecycleOwner) ((AbstractC6416aw) c79353HPv.mo21780LJ()).getContext(), Lifecycle.Event.ON_DESTROY), c79353HPv.LJIL);
                    }
                    ((KDS) updateCrossRoomInfo.m149as(LIZ)).LIZ(C77093GaN.LIZ, C77094GaO.LIZ);
                }
            }
        }
        LIZJ("switchToPk");
        AbstractC4774i LIZ6 = AbstractC78050Gpo.LIZ();
        if (LIZ6 == null) {
            return;
        }
        LIZ6.LIZJ(4);
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.p376ui.C4569d.AbstractC4570a
    public final void LIZ(String str, boolean z, long j) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)}, this, LIZIZ, false, 36).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (LinkCrossRoomDataHolder.LJII().LJJIJ.contains(str) && !z) {
            LinkCrossRoomDataHolder.LJII().LJJIJ.remove(str);
        } else if (!LinkCrossRoomDataHolder.LJII().LJJIJ.contains(str) && z) {
            LinkCrossRoomDataHolder.LJII().LJJIJ.add(str);
        }
        C79199HJx c79199HJx = this.LJIJJ;
        if (c79199HJx != null) {
            c79199HJx.LIZ(str, z);
        }
        if (!z) {
            return;
        }
        ((KDS) ((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).mute(LJIIIZ().getId(), 7, j, this.LJJ.mo15779LJ()).m149as(autoDisposeWithTransformer())).LIZ(C1W2.LIZ, C3811017o.LIZ);
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.presenter.AbstractC4568i
    public final void LIZ(LinkMicBattleInviteMessage linkMicBattleInviteMessage) {
        List<AnchorLinkUser> LIZLLL;
        Pair<List<Long>, List<Long>> m137to;
        List<AnchorLinkUser> LIZLLL2;
        String LJIIJJI;
        NextLiveData<PlayMode> nextLiveData;
        H3F h3f;
        String str;
        C4518a c4518a;
        DialogC79392HRi dialogC79392HRi;
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{linkMicBattleInviteMessage}, this, LIZIZ, false, 37).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkMicBattleInviteMessage);
        String str2 = "";
        if (linkMicBattleInviteMessage.LIZ == LinkMicBattleInviteMessage.BattleInviteType.BattleInviteType_Multiple_Activity.ordinal()) {
            MultiPkActivityWidget multiPkActivityWidget = this.LJJIJIL;
            if (multiPkActivityWidget == null || PatchProxy.proxy(new Object[]{linkMicBattleInviteMessage}, multiPkActivityWidget, MultiPkActivityWidget.LIZ, false, 3).isSupported) {
                return;
            }
            C106862S5w.LIZ(linkMicBattleInviteMessage);
            ALogger.m15800e("ttlive_anchor_link", "show activity invite dialog");
            DialogC79392HRi dialogC79392HRi2 = multiPkActivityWidget.LIZIZ;
            if (dialogC79392HRi2 != null && dialogC79392HRi2.isShowing() && (dialogC79392HRi = multiPkActivityWidget.LIZIZ) != null) {
                C116971W2r.LIZ(dialogC79392HRi);
            }
            C4536j m23737LJ = C4536j.LJJIJIIJI.m23737LJ();
            if (m23737LJ == null || (c4518a = m23737LJ.LJIILJJIL) == null || (str = c4518a.LJIIIIZZ) == null) {
                str = "anchor";
            }
            int ordinal = LinkMicBattleInviteMessage.BattleInviteType.BattleInviteType_Multiple_Activity.ordinal();
            boolean LIZ = HQJ.LIZIZ.LIZ(ordinal);
            C79391HRh c79391HRh = DialogC79392HRi.f6810LJ;
            Context context = multiPkActivityWidget.context;
            Intrinsics.checkNotNullExpressionValue(context, str2);
            multiPkActivityWidget.LIZIZ = c79391HRh.LIZ(context, linkMicBattleInviteMessage.LJI, LIZ, str, new HQU(multiPkActivityWidget, linkMicBattleInviteMessage, ordinal));
            multiPkActivityWidget.LIZJ = C536537Hj.LIZ(1L, TimeUnit.SECONDS).take(10L).compose(C100839PnV.LIZJ()).subscribe(new C79365HQh(multiPkActivityWidget));
        } else if (PatchProxy.proxy(new Object[]{linkMicBattleInviteMessage}, this, LIZIZ, false, 38).isSupported) {
        } else {
            H3F h3f2 = this.LJIIJJI;
            if (h3f2 != null && h3f2.isShowing() && (h3f = this.LJIIJJI) != null) {
                C116971W2r.LIZ(h3f);
            }
            Context context2 = this.context;
            Intrinsics.checkNotNullExpressionValue(context2, str2);
            H04 h04 = new H04(context2);
            h04.LIZLLL = LK5.LIZ(2131582393);
            h04.LIZJ = new DialogInterface$OnClickListenerC79362HQe(this, linkMicBattleInviteMessage);
            h04.LJFF = LK5.LIZ(2131581979);
            h04.f6532LJ = new DialogInterface$OnClickListenerC79363HQf(this, linkMicBattleInviteMessage);
            h04.LJI = false;
            h04.LIZ(linkMicBattleInviteMessage.f27840LJ);
            this.LJIIJJI = h04.LIZ();
            if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 39).isSupported) {
                return;
            }
            C13491f LIZ2 = IQV.LIZ(HW5.LIZ());
            PlayMode playMode = null;
            if (!(LIZ2 instanceof C4536j)) {
                LIZ2 = null;
            }
            C4536j c4536j = (C4536j) LIZ2;
            if (c4536j != null && (nextLiveData = c4536j.f26358LJ) != null) {
                playMode = nextLiveData.getValue();
            }
            if (playMode != PlayMode.TEAM_PK) {
                z = false;
            }
            if (c4536j != null && (LJIIJJI = c4536j.LJIIJJI()) != null) {
                str2 = LJIIJJI;
            }
            if (z) {
                if (c4536j == null || (m137to = c4536j.LJIIJ()) == null) {
                    m137to = TuplesKt.m137to(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
                }
                List<Long> component1 = m137to.component1();
                List<Long> component2 = m137to.component2();
                C79413HSd c79413HSd = C79413HSd.LIZIZ;
                C4520a c4520a = this.f26339LJ;
                c79413HSd.LIZ((c4520a == null || (LIZLLL2 = c4520a.LIZLLL()) == null) ? 0 : LIZLLL2.size(), c4536j != null ? c4536j.LJIIIIZZ() : 0, str2, Integer.valueOf(component1.size()), Integer.valueOf(component2.size()));
                return;
            }
            C79413HSd c79413HSd2 = C79413HSd.LIZIZ;
            C4520a c4520a2 = this.f26339LJ;
            c79413HSd2.LIZ((c4520a2 == null || (LIZLLL = c4520a2.LIZLLL()) == null) ? 0 : LIZLLL.size(), c4536j != null ? c4536j.LJIIIIZZ() : 0, str2, (Integer) null, (Integer) null);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.presenter.AbstractC4568i
    public final void LIZ(C8847el c8847el) {
        H3F h3f;
        if (PatchProxy.proxy(new Object[]{c8847el}, this, LIZIZ, false, 42).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8847el);
        C88440Kt0.LIZ(c8847el.LIZLLL);
        H3F h3f2 = this.LJIIJJI;
        if (h3f2 != null && h3f2.isShowing() && (h3f = this.LJIIJJI) != null) {
            C116971W2r.LIZ(h3f);
        }
        MultiPkActivityWidget multiPkActivityWidget = this.LJJIJIL;
        if (multiPkActivityWidget == null || PatchProxy.proxy(new Object[]{multiPkActivityWidget, "receiveReject", (byte) 0, 2, null}, null, MultiPkActivityWidget.LIZ, true, 5).isSupported || PatchProxy.proxy(new Object[]{"receiveReject", (byte) 0}, multiPkActivityWidget, MultiPkActivityWidget.LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ("receiveReject");
        DialogC79392HRi dialogC79392HRi = multiPkActivityWidget.LIZIZ;
        if (dialogC79392HRi == null || !dialogC79392HRi.isShowing()) {
            return;
        }
        DialogC79392HRi dialogC79392HRi2 = multiPkActivityWidget.LIZIZ;
        if (dialogC79392HRi2 != null) {
            C116971W2r.LIZ(dialogC79392HRi2);
        }
        ALogger.m15800e("ttlive_anchor_link", C0002O.m25086C("dismiss PkActivityInviteDialog from ", "receiveReject"));
        Disposable disposable = multiPkActivityWidget.LIZJ;
        if (disposable == null) {
            return;
        }
        disposable.dispose();
    }

    public final C79353HPv LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 1);
        if (proxy.isSupported) {
            return (C79353HPv) proxy.result;
        }
        C79353HPv c79353HPv = this.LJI;
        if (c79353HPv == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c79353HPv;
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.p376ui.C4569d.AbstractC4570a
    public final void LJI() {
        C79199HJx c79199HJx;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 45).isSupported && (c79199HJx = this.LJIJJ) != null && c79199HJx.LJIIIIZZ) {
            c79199HJx.LJIIIZ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.presenter.AbstractC4568i
    public final void LJIIIIZZ() {
        C79199HJx c79199HJx;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 48).isSupported) {
            return;
        }
        LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        C79112HGo c79112HGo = LJII.LJLJJLL;
        if (c79112HGo != null && c79112HGo.LIZIZ && (c79199HJx = this.LJIJJ) != null) {
            c79199HJx.LIZIZ(c79112HGo.LIZJ, "updateMultiChannelMsg");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        C79199HJx c79199HJx;
        C79199HJx c79199HJx2;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 10).isSupported) {
            return;
        }
        super.onResume();
        if (this.LJIJJLI && (c79199HJx = this.LJIJJ) != null && c79199HJx.LJIIIIZZ) {
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.PK_ANCHOR_BACKGROUND_OPT;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue() && (c79199HJx2 = this.LJIJJ) != null) {
                c79199HJx2.LIZ(false);
            }
        }
    }

    private final void LJIIJ() {
        Integer valueOf;
        String str;
        int i;
        List<AnchorLinkUser> LIZLLL;
        NextLiveData<Integer> nextLiveData;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 8).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("channel_id", String.valueOf(LinkCrossRoomDataHolder.LJII().LIZLLL));
        C4536j c4536j = this.LJIILJJIL;
        if (c4536j == null || (nextLiveData = c4536j.LJI) == null || (valueOf = nextLiveData.getValue()) == null) {
            valueOf = Integer.valueOf(C79506HVs.LIZ());
        }
        int LIZ = C79506HVs.LIZ();
        if (valueOf != null && valueOf.intValue() == LIZ) {
            str = "connection";
        } else {
            str = "npk";
        }
        hashMap.put("room_status", str);
        C4520a c4520a = this.f26339LJ;
        if (c4520a != null && (LIZLLL = c4520a.LIZLLL()) != null) {
            i = LIZLLL.size();
        } else {
            i = 0;
        }
        hashMap.put("anchor_cnt", String.valueOf(i));
        C4574547f.LIZ().LIZ("livesdk_interact_icon_click", hashMap, Room.class);
    }

    public final void LIZLLL() {
        Integer valueOf;
        NextLiveData<Integer> nextLiveData;
        AbstractDialogC9363b abstractDialogC9363b;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 7).isSupported) {
            return;
        }
        AbstractDialogC9363b abstractDialogC9363b2 = this.LJJIIZ;
        if (abstractDialogC9363b2 != null && abstractDialogC9363b2.isShowing() && (abstractDialogC9363b = this.LJJIIZ) != null) {
            C116971W2r.LIZ(abstractDialogC9363b);
        }
        LJIIJ();
        C4536j c4536j = this.LJIILJJIL;
        if (c4536j == null || (nextLiveData = c4536j.LJI) == null || (valueOf = nextLiveData.getValue()) == null) {
            valueOf = Integer.valueOf(C79506HVs.LIZ());
        }
        int LIZ = C79506HVs.LIZ();
        if (valueOf != null && valueOf.intValue() == LIZ) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            DataCenter dataCenter = this.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter, "");
            this.LJJIIZ = new HRZ(context, dataCenter);
            AbstractDialogC9363b abstractDialogC9363b3 = this.LJJIIZ;
            if (abstractDialogC9363b3 != null) {
                C116971W2r.LIZJ(abstractDialogC9363b3);
                return;
            }
            return;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.LJJIIZ = new DialogC79387HRd(context2);
        AbstractDialogC9363b abstractDialogC9363b4 = this.LJJIIZ;
        if (abstractDialogC9363b4 != null) {
            C116971W2r.LIZJ(abstractDialogC9363b4);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget
    public final void LJII() {
        C79368HQk c79368HQk;
        MultiLiveCoreInfo multiLiveCoreInfo;
        MultiAnchorLinkmicLiveCoreInfo multiAnchorLinkmicLiveCoreInfo;
        Map<Long, String> map;
        String str;
        C79199HJx c79199HJx;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 46).isSupported) {
            return;
        }
        super.LJII();
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_MULTI_CHANGE_STREAM_LIVE_CORE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue() && (c79368HQk = this.LJIIL) != null && (multiLiveCoreInfo = c79368HQk.LIZIZ) != null && (multiAnchorLinkmicLiveCoreInfo = multiLiveCoreInfo.multiAnchorLiveCoreInfo) != null && (map = multiAnchorLinkmicLiveCoreInfo.liveCoreExtInfoMap) != null && (str = map.get(0L)) != null && (c79199HJx = this.LJIJJ) != null) {
            c79199HJx.LIZ(str);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onPause() {
        C79199HJx c79199HJx;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 9).isSupported) {
            return;
        }
        if (this.LJIJJLI && !this.LJJIIJ) {
            C79199HJx c79199HJx2 = this.LJIJJ;
            if (c79199HJx2 != null && !PatchProxy.proxy(new Object[0], c79199HJx2, C79199HJx.LIZ, false, 19).isSupported && c79199HJx2.LJIIIIZZ) {
                c79199HJx2.LIZIZ(false);
                HH8.LIZ(c79199HJx2.LJIILL, false, "onPause");
            }
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.PK_ANCHOR_BACKGROUND_OPT;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue() && (c79199HJx = this.LJIJJ) != null) {
                c79199HJx.LIZ(true);
            }
            HQG mo15702LJ = mo15702LJ();
            if (mo15702LJ != null) {
                mo15702LJ.LJI();
            }
        }
        super.onPause();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget, com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    /* renamed from: Z_ */
    public final void mo15698Z_() {
        Config LJIIJ;
        LiveCore liveCore;
        ILayerControl layerControl;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 17).isSupported) {
            return;
        }
        super.mo15698Z_();
        C79199HJx c79199HJx = this.LJIJJ;
        ILayerControl.ILayer iLayer = null;
        if (c79199HJx != null && (LJIIJ = c79199HJx.LJIIJ()) != null && LJIIJ.isSingleViewMode()) {
            C79379HQv c79379HQv = this.LJFF;
            if (c79379HQv != null) {
                String LIZIZ2 = this.LJJ.LIZIZ();
                AbstractC6070q abstractC6070q = this.LJIILLIIL;
                if (abstractC6070q != null && (liveCore = abstractC6070q.getLiveCore()) != null && (layerControl = liveCore.getLayerControl()) != null) {
                    iLayer = layerControl.getLocalOriginLayer();
                }
                c79379HQv.LIZ(LIZIZ2, iLayer);
            }
        } else {
            C79379HQv c79379HQv2 = this.LJFF;
            if (c79379HQv2 != null) {
                c79379HQv2.LIZ(this.LJJ.LIZIZ(), (SurfaceView) null);
            }
        }
        LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        C79112HGo c79112HGo = LJII.LJLJJLL;
        if (c79112HGo != null) {
            ALogger.m15797i("ttlive_anchor_link", "MultiAnchorLinkWidget onRtcStartSuccess " + c79112HGo);
            if (c79112HGo.LIZIZ) {
                C79199HJx c79199HJx2 = this.LJIJJ;
                if (c79199HJx2 == null || !c79199HJx2.LJIIIZ) {
                    C79199HJx c79199HJx3 = this.LJIJJ;
                    if (c79199HJx3 != null) {
                        c79199HJx3.LIZ(c79112HGo.LIZJ, "multiLinkRtcStartSuccess");
                    }
                    HQ6 hq6 = this.LJIILIIL;
                    if (hq6 != null) {
                        hq6.LIZ();
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        C4520a c4520a;
        String str;
        String str2;
        String str3;
        C79368HQk c79368HQk;
        MultiLiveCoreInfo multiLiveCoreInfo;
        MultiAnchorLinkmicLiveCoreInfo multiAnchorLinkmicLiveCoreInfo;
        Map<Long, String> map;
        String str4;
        C79199HJx c79199HJx;
        LiveCore liveCore;
        ILayerControl layerControl;
        ILayerControl.ILayer localOriginLayer;
        AbstractDialogC9363b abstractDialogC9363b;
        C79317HOl LIZJ;
        MethodCollector.m14708i(1901);
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 12).isSupported) {
            MethodCollector.m14707o(1901);
            return;
        }
        super.onDestroy();
        this.LJJIJIIJIL.dispose();
        if (this.LJIJJLI) {
            AbstractC4782v LIZ = AbstractC4782v.LJIIL.LIZ();
            if (LIZ != null && (LIZJ = LIZ.LIZJ()) != null) {
                LIZJ.LIZIZ(this.LJJJJL);
            }
            HQ6 hq6 = this.LJIILIIL;
            if (hq6 != null && !PatchProxy.proxy(new Object[0], hq6, HQ6.LIZ, false, 4).isSupported) {
                C79199HJx c79199HJx2 = hq6.LJII;
                if (c79199HJx2 != null) {
                    c79199HJx2.LIZIZ(hq6.LJI);
                }
                hq6.LJFF.dispose();
            }
            C4520a c4520a2 = this.f26339LJ;
            if (c4520a2 != null) {
                c4520a2.LJIIIZ = this.LJIIIIZZ;
            }
            C4520a c4520a3 = this.f26339LJ;
            if (c4520a3 != null) {
                c4520a3.LJIIJ = System.currentTimeMillis();
            }
            HQL hql = this.LJJIJIIJI;
            if (!PatchProxy.proxy(new Object[0], hql, HQL.LIZ, false, 5).isSupported) {
                hql.f6799LJ.clear();
                C4520a c4520a4 = hql.LIZJ;
                if (c4520a4 != null) {
                    c4520a4.LIZIZ(hql.LJFF);
                }
                hql.LIZIZ.dispose();
            }
        }
        C4520a c4520a5 = this.f26339LJ;
        if (c4520a5 != null) {
            c4520a5.LJIIJJI();
        }
        Disposable disposable = this.LJJJJJ;
        if (disposable != null) {
            disposable.dispose();
        }
        AbstractDialogC9363b abstractDialogC9363b2 = this.LJJIIZ;
        if (abstractDialogC9363b2 != null && abstractDialogC9363b2.isShowing() && (abstractDialogC9363b = this.LJJIIZ) != null) {
            C116971W2r.LIZ(abstractDialogC9363b);
        }
        if (!this.LJJIIJ && this.LJIJJLI) {
            AbstractC6070q abstractC6070q = this.LJIILLIIL;
            if (abstractC6070q != null && (liveCore = abstractC6070q.getLiveCore()) != null && (layerControl = liveCore.getLayerControl()) != null && (localOriginLayer = layerControl.getLocalOriginLayer()) != null) {
                VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
                videoMixerDescription.setVisibility(true);
                videoMixerDescription.setLeft(0.0f);
                videoMixerDescription.setTop(0.0f);
                videoMixerDescription.setRight(1.0f);
                videoMixerDescription.setBottom(1.0f);
                videoMixerDescription.setMode(2);
                localOriginLayer.updateDescription(videoMixerDescription);
            }
            C79199HJx c79199HJx3 = this.LJIJJ;
            if (c79199HJx3 != null && c79199HJx3.LJIIIIZZ) {
                c79199HJx3.LJIIIIZZ();
                SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_MULTI_CHANGE_STREAM_LIVE_CORE;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue() && (c79368HQk = this.LJIIL) != null && (multiLiveCoreInfo = c79368HQk.LIZIZ) != null && (multiAnchorLinkmicLiveCoreInfo = multiLiveCoreInfo.multiAnchorLiveCoreInfo) != null && (map = multiAnchorLinkmicLiveCoreInfo.liveCoreExtInfoMap) != null && (str4 = map.get(0L)) != null && (c79199HJx = this.LJIJJ) != null) {
                    c79199HJx.LIZ(str4);
                }
            }
            if (!this.LJIL) {
                BaseEqualLinkWidget.LIZ(this, "unusual_leave", false, 2, null);
            }
        }
        if (this.LJJ.mo15779LJ() > 0 && this.LJIJJLI && LinkCrossRoomDataHolder.LJII().LJJIIJZLJL) {
            Map hashMap = new HashMap();
            C5923dp LIZ2 = C5923dp.LJIIJ.LIZ(this.dataCenter, 0L);
            if (LIZ2 != null) {
                str = LIZ2.LLFF().LIZ();
            } else {
                str = "connection_panel";
            }
            hashMap.put("enter_from", str);
            long currentTimeMillis = (System.currentTimeMillis() - this.LJJI) / 1000;
            if (AbstractC4782v.LJIIL.LIZ() != null) {
                AbstractC4782v LIZ3 = AbstractC4782v.LJIIL.LIZ();
                Intrinsics.checkNotNull(LIZ3);
                hashMap.put("anchor_connect_status", String.valueOf(LIZ3.mo15709LJ().LJIIL()));
            }
            hashMap.put("diamond", String.valueOf(LinkCrossRoomDataHolder.LJII().LJJLJLI));
            hashMap.put("connection_time", String.valueOf(currentTimeMillis));
            C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f6992aT;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            Boolean LIZ4 = c87308Kak.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ4, "");
            if (LIZ4.booleanValue()) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            hashMap.put("gift_guest_switch_type", str2);
            hashMap.put("end_type", "room_close");
            hashMap.put("pk_id", String.valueOf(LinkCrossRoomDataHolder.LJII().f26249LJ));
            if (LinkCrossRoomDataHolder.LJII().LJJIIJZLJL) {
                str3 = C64868Big.LIZLLL;
            } else {
                str3 = "passive";
            }
            hashMap.put("end_reason", str3);
            hashMap.put("connection_anchor_cnt", String.valueOf(this.LJIIJ));
            C4574547f LIZ5 = C4574547f.LIZ();
            C8668v c8668v = new C8668v();
            c8668v.LIZIZ("live");
            c8668v.LJFF("other");
            LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII, "");
            LIZ5.LIZ("connection_over", hashMap, c8668v, LJII.LJIIIIZZ(), Room.class);
        }
        C79353HPv c79353HPv = this.LJI;
        if (c79353HPv == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c79353HPv.LIZJ();
        if (!this.LJIJJLI) {
            if (this.LJJIII != 0) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("watch_connection_duration", String.valueOf((System.currentTimeMillis() - this.LJJIII) / 1000));
                hashMap2.put("connection_type", "anchor");
                hashMap2.put("anchor_cnt", String.valueOf(this.LJIIJ));
                hashMap2.put("anchor_connect_status", String.valueOf(this.LJIIJ));
                C4574547f LIZ6 = C4574547f.LIZ();
                LinkCrossRoomDataHolder LJII2 = LinkCrossRoomDataHolder.LJII();
                Intrinsics.checkNotNullExpressionValue(LJII2, "");
                LIZ6.LIZ("livesdk_connection_watch_duration", hashMap2, LJII2.LJIIIZ(), Room.class);
            }
            LinkCrossRoomDataHolder.LJII().LJI();
        }
        if (this.LJJ.mo15779LJ() == 0 && (c4520a = this.f26339LJ) != null) {
            c4520a.LJFF();
        }
        C4520a c4520a6 = this.f26339LJ;
        if (c4520a6 != null) {
            c4520a6.LIZIZ(this.LJJIJL);
        }
        C79379HQv c79379HQv = this.LJFF;
        if (c79379HQv != null) {
            boolean z = this.LJJIIJ;
            if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, c79379HQv, C79379HQv.LIZ, false, 16).isSupported) {
                ALogger.m15797i("ttlive_anchor_link_wm", "end switchToPK=" + z);
                Disposable disposable2 = c79379HQv.LJJJ;
                if (disposable2 != null) {
                    disposable2.dispose();
                }
                CompositeDisposable compositeDisposable = c79379HQv.LJIL;
                if (compositeDisposable != null) {
                    compositeDisposable.dispose();
                }
                DataCenter dataCenter = c79379HQv.LJJJJIZL;
                if (dataCenter != null) {
                    dataCenter.put("data_first_frame_sei", "");
                }
                DataCenter dataCenter2 = c79379HQv.LJJJJIZL;
                if (dataCenter2 != null) {
                    dataCenter2.removeObserver(c79379HQv);
                }
                C4520a c4520a7 = c79379HQv.LJJJJJ;
                if (c4520a7 != null) {
                    c4520a7.LIZIZ(c79379HQv);
                }
                c79379HQv.LJI.clear();
                c79379HQv.LJJJJ.removeAllViews();
                c79379HQv.LJJIJIL.clear();
                LinkCrossRoomDataHolder.LJII().LJJIJ.clear();
                if (!z) {
                    HR4 hr4 = new HR4();
                    hr4.LIZJ = 2;
                    c79379HQv.LJJJJIZL.put("cmd_multi_state_change", hr4);
                }
                c79379HQv.LJJJJIZL.removeObserver("cmd_gift_dialog_switch", c79379HQv.LJJJIL);
                c79379HQv.LJJJJIZL.removeObserver("data_video_size_pair", c79379HQv.LJJJIL);
            }
        }
        DataCenter dataCenter3 = this.dataCenter;
        if (dataCenter3 != null) {
            dataCenter3.put("cmd_update_sticker_visible", Boolean.TRUE);
        }
        DataCenter dataCenter4 = this.dataCenter;
        if (dataCenter4 != null) {
            dataCenter4.removeObserver(this);
        }
        AbstractC4781u LIZ7 = C4566a.LIZJ.LIZ();
        if (LIZ7 != null) {
            LIZ7.LIZIZ();
            MethodCollector.m14707o(1901);
            return;
        }
        MethodCollector.m14707o(1901);
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 13).isSupported) {
            return;
        }
        this.LJII = str;
        C79379HQv c79379HQv = this.LJFF;
        if (c79379HQv != null) {
            c79379HQv.LIZ(str);
        }
    }

    private final void LIZ(View view) {
        ViewParent parent;
        MethodCollector.m14708i(1904);
        if (PatchProxy.proxy(new Object[]{view}, this, LIZIZ, false, 44).isSupported) {
            MethodCollector.m14707o(1904);
        } else if (view != null && (parent = view.getParent()) != null) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            MethodCollector.m14707o(1904);
        } else {
            MethodCollector.m14707o(1904);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget
    public final void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 27).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        ALogger.m15797i("ttlive_anchor_link", C0002O.m25086C("unloadModule reason=", str));
        DialogC88906L1g dialogC88906L1g = this.LJJIFFI;
        if (dialogC88906L1g != null && dialogC88906L1g.isShowing()) {
            C116971W2r.LIZ(dialogC88906L1g);
        }
        AbstractC4774i LIZ = AbstractC78050Gpo.LIZ();
        if (LIZ != null) {
            LIZ.LIZLLL(64);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        C79379HQv c79379HQv;
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZIZ, false, 4).isSupported && kVData2 != null) {
            String key = kVData2.getKey();
            if (key.hashCode() == 1797384049 && key.equals("data_pk_renderview_width") && (c79379HQv = this.LJFF) != null) {
                c79379HQv.LIZIZ(this.LJJJJJL);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.presenter.AbstractC4568i
    public final void LIZIZ(C79503HVp c79503HVp) {
        MethodCollector.m14708i(1903);
        if (PatchProxy.proxy(new Object[]{c79503HVp}, this, LIZIZ, false, 29).isSupported) {
            MethodCollector.m14707o(1903);
            return;
        }
        C106862S5w.LIZ(c79503HVp);
        C79379HQv c79379HQv = this.LJFF;
        if (c79379HQv == null) {
            MethodCollector.m14707o(1903);
            return;
        }
        C4536j c4536j = this.LJIILJJIL;
        if (c4536j == null) {
            MethodCollector.m14707o(1903);
            return;
        }
        C79374HQq c79374HQq = this.LIZLLL;
        if (this.LJJIZ == null && c79503HVp.LIZJ > 0) {
            this.LJJIZ = new MultiAnchorTeamPkWidget(c79379HQv, c79374HQq, c4536j);
            if (this.LJJJ == null) {
                this.LJJJ = new FrameLayout(this.context);
                this.containerView.addView(this.LJJJ, -1, -1);
            }
            enableSubWidgetManager();
            WidgetManager widgetManager = this.subWidgetManager;
            if (!(widgetManager instanceof C458454Bb)) {
                widgetManager = null;
            }
            C458454Bb c458454Bb = (C458454Bb) widgetManager;
            if (c458454Bb != null) {
                c458454Bb.LIZLLL = true;
            }
            this.subWidgetManager.load(this.LJJJ, (Widget) this.LJJIZ, false);
        }
        MethodCollector.m14707o(1903);
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.presenter.AbstractC4568i
    public final void LIZ(C79503HVp c79503HVp) {
        MethodCollector.m14708i(1902);
        if (PatchProxy.proxy(new Object[]{c79503HVp}, this, LIZIZ, false, 28).isSupported) {
            MethodCollector.m14707o(1902);
            return;
        }
        C106862S5w.LIZ(c79503HVp);
        C79379HQv c79379HQv = this.LJFF;
        if (c79379HQv == null) {
            MethodCollector.m14707o(1902);
            return;
        }
        C4536j c4536j = this.LJIILJJIL;
        if (c4536j == null) {
            MethodCollector.m14707o(1902);
            return;
        }
        C79374HQq c79374HQq = this.LIZLLL;
        if (this.LJJIJLIJ == null && c79503HVp.LIZJ > 0) {
            this.LJJIJLIJ = new MultiAnchorPkWidget(c79379HQv, c79374HQq, c4536j);
            if (this.LJJIL == null) {
                this.LJJIL = new FrameLayout(this.context);
                this.containerView.addView(this.LJJIL, -1, -1);
            }
            enableSubWidgetManager();
            WidgetManager widgetManager = this.subWidgetManager;
            if (!(widgetManager instanceof C458454Bb)) {
                widgetManager = null;
            }
            C458454Bb c458454Bb = (C458454Bb) widgetManager;
            if (c458454Bb != null) {
                c458454Bb.LIZLLL = true;
            }
            this.subWidgetManager.load(this.LJJIL, (Widget) this.LJJIJLIJ, false);
        }
        MethodCollector.m14707o(1902);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4780t
    public final void LIZLLL(String str) {
        String str2;
        int i;
        int i2;
        List<AnchorLinkUser> LIZLLL;
        Pair<List<Long>, List<Long>> m137to;
        int i3;
        int i4;
        List<AnchorLinkUser> LIZLLL2;
        NextLiveData<PlayMode> nextLiveData;
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 40).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        C13491f LIZ = IQV.LIZ(HW5.LIZ());
        PlayMode playMode = null;
        if (!(LIZ instanceof C4536j)) {
            LIZ = null;
        }
        C4536j c4536j = (C4536j) LIZ;
        if (c4536j != null && (nextLiveData = c4536j.f26358LJ) != null) {
            playMode = nextLiveData.getValue();
        }
        if (playMode != PlayMode.TEAM_PK) {
            z = false;
        }
        if (c4536j == null || (str2 = c4536j.LJIIJJI()) == null) {
            str2 = "";
        }
        if (z) {
            if (c4536j == null || (m137to = c4536j.LJIIJ()) == null) {
                m137to = TuplesKt.m137to(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
            }
            List<Long> component1 = m137to.component1();
            List<Long> component2 = m137to.component2();
            C79413HSd c79413HSd = C79413HSd.LIZIZ;
            C4520a c4520a = this.f26339LJ;
            if (c4520a != null && (LIZLLL2 = c4520a.LIZLLL()) != null) {
                i3 = LIZLLL2.size();
            } else {
                i3 = 0;
            }
            if (c4536j != null) {
                i4 = c4536j.LJIIIIZZ();
            } else {
                i4 = 0;
            }
            c79413HSd.LIZ(str, i3, i4, str2, Integer.valueOf(component1.size()), Integer.valueOf(component2.size()));
            return;
        }
        C79413HSd c79413HSd2 = C79413HSd.LIZIZ;
        C4520a c4520a2 = this.f26339LJ;
        if (c4520a2 != null && (LIZLLL = c4520a2.LIZLLL()) != null) {
            i = LIZLLL.size();
        } else {
            i = 0;
        }
        if (c4536j != null) {
            i2 = c4536j.LJIIIIZZ();
        } else {
            i2 = 0;
        }
        c79413HSd2.LIZ(str, i, i2, str2, null, null);
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.presenter.AbstractC4568i
    public final void LIZ(PlayMode playMode) {
        if (PatchProxy.proxy(new Object[]{playMode}, this, LIZIZ, false, 43).isSupported) {
            return;
        }
        if (this.LJJIJLIJ != null && playMode != PlayMode.PERSONAL_PK) {
            enableSubWidgetManager();
            this.subWidgetManager.unload(this.LJJIJLIJ);
            LIZ(this.LJJIL);
            this.LJJIJLIJ = null;
            this.LJJIL = null;
        }
        if (this.LJJIZ != null && playMode != PlayMode.TEAM_PK) {
            enableSubWidgetManager();
            this.subWidgetManager.unload(this.LJJIZ);
            LIZ(this.LJJJ);
            this.LJJIZ = null;
            this.LJJJ = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r2 < 4) goto L54;
     */
    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4769b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(com.bytedance.android.live.network.response.C5176i<com.bytedance.android.livesdk.chatroom.model.C6089a> r9) {
        /*
            r8 = this;
            r0 = 1
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r2 = 0
            r3[r2] = r9
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.multianchor.MultiAnchorLinkWidget.LIZIZ
            r0 = 47
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r8, r1, r2, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L13
            return
        L13:
            p003X.C106862S5w.LIZ(r9)
            X.HQG r0 = r8.mo15702LJ()
            if (r0 == 0) goto L2d
            java.util.List r0 = r0.LIZLLL()
            if (r0 == 0) goto L2d
            int r0 = r0.size()
            long r2 = (long) r0
            r4 = 4
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L2f
        L2d:
            r2 = 3
        L2f:
            com.bytedance.android.live.core.setting.SettingKey<java.lang.Boolean> r0 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_MULTI_CHANGE_STREAM_PARAMS
            java.lang.String r6 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
            java.lang.Object r0 = r0.getValue()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6a
            T r0 = r9.LIZJ
            com.bytedance.android.livesdk.chatroom.model.a r0 = (com.bytedance.android.livesdk.chatroom.model.C6089a) r0
            if (r0 == 0) goto L6a
            X.HQk r0 = r0.LIZ
            if (r0 == 0) goto L6a
            com.bytedance.android.livesdk.chatroom.model.interact.MultiRtcInfo r0 = r0.LIZ
            com.bytedance.android.livesdk.chatroom.model.interact.MultiAnchorLinkmicRtcInfo r0 = r0.multiAnchorLinkmicRtcInfo
            if (r0 == 0) goto L6a
            java.util.Map<java.lang.Long, java.lang.String> r1 = r0.rtcInfoMap
            if (r1 == 0) goto L6a
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L6a
            com.bytedance.android.live.linkpk.a r0 = r8.LJJ
            r0.LIZJ(r1)
        L6a:
            com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder r0 = com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder.LJII()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
            X.HGo r7 = r0.LJLJJLL
            if (r7 == 0) goto Lac
            boolean r0 = r7.LIZIZ
            if (r0 == 0) goto Lac
            java.util.HashMap<java.lang.Long, java.lang.String> r4 = r7.LIZJ
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r8.LJIIIZ()
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lac
            com.bytedance.android.live.linkpk.a r5 = r8.LJJ
            java.util.HashMap<java.lang.Long, java.lang.String> r4 = r7.LIZJ
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r8.LJIIIZ()
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r5.LIZJ(r0)
        Lac:
            super.LIZ(r9)
            com.bytedance.android.live.core.setting.SettingKey<java.lang.Boolean> r0 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_MULTI_CHANGE_STREAM_LIVE_CORE
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
            java.lang.Object r0 = r0.getValue()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lea
            T r0 = r9.LIZJ
            com.bytedance.android.livesdk.chatroom.model.a r0 = (com.bytedance.android.livesdk.chatroom.model.C6089a) r0
            if (r0 == 0) goto Lea
            X.HQk r0 = r0.LIZ
            if (r0 == 0) goto Lea
            com.bytedance.android.livesdk.chatroom.model.interact.MultiLiveCoreInfo r0 = r0.LIZIZ
            com.bytedance.android.livesdk.chatroom.model.interact.MultiAnchorLinkmicLiveCoreInfo r0 = r0.multiAnchorLiveCoreInfo
            if (r0 == 0) goto Lea
            java.util.Map<java.lang.Long, java.lang.String> r1 = r0.liveCoreExtInfoMap
            if (r1 == 0) goto Lea
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Lea
            X.HJx r0 = r8.LJIJJ
            if (r0 == 0) goto Lea
            r0.LIZ(r1)
        Lea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multianchor.MultiAnchorLinkWidget.LIZ(com.bytedance.android.live.network.response.i):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x019e, code lost:
        if (r8 > 2) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a6, code lost:
        if (r10 >= p003X.LK5.LIZ(r9.f6804LJ)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a8, code lost:
        r6.height = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ac, code lost:
        if (p003X.C4580049i.LIZIZ == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b0, code lost:
        if (p003X.C4580049i.LIZJ == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b6, code lost:
        if (p003X.C4580049i.LIZIZ() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b8, code lost:
        r6.topMargin += p003X.LK5.m23418LJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d3, code lost:
        if (r7 > 1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01db, code lost:
        r11 = r11 / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d9, code lost:
        if (r7 == 1) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    @Override // com.bytedance.ies.sdk.widgets.Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onConfigurationChanged(android.content.res.Configuration r23) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multianchor.MultiAnchorLinkWidget.onConfigurationChanged(android.content.res.Configuration):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiAnchorLinkWidget(AbstractC6070q abstractC6070q, AbstractC4254a abstractC4254a) {
        super(abstractC4254a);
        C106862S5w.LIZ(abstractC4254a);
        this.LJIILLIIL = abstractC6070q;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4769b
    public final void LIZ(C5176i<C6173m> c5176i, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        Integer num;
        String str5;
        C4520a c4520a;
        NextLiveData<Integer> nextLiveData;
        if (PatchProxy.proxy(new Object[]{c5176i, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 35).isSupported) {
            return;
        }
        long currentTimeMillis = (System.currentTimeMillis() - this.LJJI) / 1000;
        HashMap hashMap = new HashMap();
        C5923dp LIZ = C5923dp.LJIIJ.LIZ(this.dataCenter, 0L);
        if (LIZ != null) {
            str = LIZ.LLFF().LIZ();
        } else {
            str = "connection_panel";
        }
        hashMap.put("enter_from", str);
        if (AbstractC4782v.LJIIL.LIZ() != null) {
            AbstractC4782v LIZ2 = AbstractC4782v.LJIIL.LIZ();
            Intrinsics.checkNotNull(LIZ2);
            hashMap.put("anchor_connect_status", String.valueOf(LIZ2.mo15709LJ().LJIIL()));
        }
        hashMap.put("channel_id", String.valueOf(this.LJIIIIZZ));
        hashMap.put("connection_time", String.valueOf(currentTimeMillis));
        C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f6992aT;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Boolean LIZ3 = c87308Kak.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
        if (LIZ3.booleanValue()) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        hashMap.put("gift_guest_switch_type", str2);
        hashMap.put("diamond", String.valueOf(LinkCrossRoomDataHolder.LJII().LJJLJLI));
        hashMap.put("end_type", "disconnect");
        hashMap.put("invitee_list", this.LJIIIZ);
        if (LinkCrossRoomDataHolder.LJII().LJJIIJZLJL) {
            str3 = C64868Big.LIZLLL;
        } else {
            str3 = "passive";
        }
        hashMap.put("end_reason", str3);
        hashMap.put("connection_anchor_cnt", String.valueOf(this.LJIIJ));
        if (this.LJJIJLIJ == null) {
            str4 = "0";
        } else {
            str4 = "1";
        }
        hashMap.put("is_npk", str4);
        hashMap.put("pk_cnt", "0");
        C4536j c4536j = this.LJIILJJIL;
        if (c4536j != null) {
            i = c4536j.LJIJI;
        } else {
            i = 0;
        }
        hashMap.put("pk_n_cnt", String.valueOf(i));
        C4536j c4536j2 = this.LJIILJJIL;
        if (c4536j2 != null && (nextLiveData = c4536j2.LJI) != null) {
            num = nextLiveData.getValue();
        } else {
            num = null;
        }
        int LIZ4 = C79506HVs.LIZ();
        if (num != null && num.intValue() == LIZ4) {
            str5 = "connection";
        } else {
            str5 = "npk";
        }
        hashMap.put("room_status", str5);
        C4574547f LIZ5 = C4574547f.LIZ();
        LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        LIZ5.LIZ("livesdk_connection_over", hashMap, LJII.LJIIIIZZ(), Room.class);
        if (z && (c4520a = this.f26339LJ) != null) {
            c4520a.LJFF();
        }
        this.LJJ.LJI();
        Runnable runnable = this.LJJII;
        if (runnable != null) {
            runnable.run();
        }
        this.LJJII = null;
        super.LIZ(c5176i, z);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget, com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZIZ(String str, ILayerControl.ILayer iLayer, int i, int i2) {
        C79379HQv c79379HQv;
        if (PatchProxy.proxy(new Object[]{str, iLayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 21).isSupported) {
            return;
        }
        super.LIZIZ(str, iLayer, i, i2);
        if (iLayer != null && str != null && (c79379HQv = this.LJFF) != null) {
            c79379HQv.LIZ(str, iLayer);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4780t
    public final void LIZ(long j, int i, String str, int i2) {
        if (PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), str, Integer.valueOf(i2)}, this, LIZIZ, false, 41).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        ALogger.m15800e("ttlive_anchor_link", "replay battle inviteUid: " + j + ", status: " + i + ", source: " + str + ", invite: " + i2);
        C79353HPv c79353HPv = this.LJI;
        if (c79353HPv == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            c79353HPv.LIZ(j, i, i2);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseEqualLinkWidget, com.bytedance.android.live.liveinteract.newpk.AbstractC4584c
    public final void LIZIZ(String str, SurfaceView surfaceView, int i, int i2) {
        C79379HQv c79379HQv;
        if (PatchProxy.proxy(new Object[]{str, surfaceView, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 22).isSupported) {
            return;
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.MULTI_LINK_FIRST_FRAME_FIX;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (settingKey.getValue().booleanValue() && surfaceView != null && str != null && (c79379HQv = this.LJFF) != null) {
            c79379HQv.LIZ(str, surfaceView);
        }
    }
}
