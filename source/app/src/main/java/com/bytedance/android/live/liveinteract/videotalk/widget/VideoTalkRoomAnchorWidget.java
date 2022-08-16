package com.bytedance.android.live.liveinteract.videotalk.widget;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.MotionEventCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.alipay.sdk.app.OpenAuthTask;
import com.alipay.sdk.p082m.p121u.C1399n;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.tetris.layer.core.event.LayerEventDispatcher;
import com.bytedance.android.live.effect.event.C4201f;
import com.bytedance.android.live.effect.event.ReleaseStatus;
import com.bytedance.android.live.linkpk.AbstractC4254a;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.chatroom.model.OpenPanelType;
import com.bytedance.android.live.liveinteract.api.data.C4284f;
import com.bytedance.android.live.liveinteract.api.fulllink.TalkRoomBusinessFullLinkMonitor;
import com.bytedance.android.live.liveinteract.bid.BidLinkMicWidget;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p350d.e$a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.model.CPositionInviteType;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.model.CPositionReplyType;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p354vm.C4378a;
import com.bytedance.android.live.liveinteract.digitavatar.C4382d;
import com.bytedance.android.live.liveinteract.digitavatar.videoavatar.VideoDigitAvatarWidget;
import com.bytedance.android.live.liveinteract.digitavatar.videoavatar.VideoShowMode;
import com.bytedance.android.live.liveinteract.doublepk.widget.DoublePkBusinessWidget;
import com.bytedance.android.live.liveinteract.linkroomfight.core.VideoLinkRoomFightWidget;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.multianchor.model.LinkmicPositionItem;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.android.live.liveinteract.plantform.api.LinkAudienceApi;
import com.bytedance.android.live.liveinteract.plantform.camera.AbstractC4791d;
import com.bytedance.android.live.liveinteract.plantform.camera.AbstractC4792e;
import com.bytedance.android.live.liveinteract.plantform.core.C4806x;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.plantform.model.RoomLinkerContent;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i;
import com.bytedance.android.live.liveinteract.plantform.permission.model.C4825a;
import com.bytedance.android.live.liveinteract.plantform.permission.model.OperateType;
import com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget;
import com.bytedance.android.live.liveinteract.videotalk.C4930f;
import com.bytedance.android.live.liveinteract.videotalk.battle.C4891b;
import com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleWidget;
import com.bytedance.android.live.liveinteract.videotalk.dialog.VideoTalkCPositionBeInvitedDialog;
import com.bytedance.android.live.liveinteract.videotalk.fight.VideoTeamFightWidget;
import com.bytedance.android.live.liveinteract.videotalk.p387b.a$a;
import com.bytedance.android.live.liveinteract.videotalk.p388c.AbstractC4912d;
import com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m;
import com.bytedance.android.live.liveinteract.videotalk.p391ui.C4966r;
import com.bytedance.android.live.liveinteract.videotalk.paid.VideoPaidLinkWidget;
import com.bytedance.android.live.liveinteract.videotalk.quickinteract.QuickInteractWidget;
import com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.C4949a;
import com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.SelfDisciplineWidget;
import com.bytedance.android.live.liveinteract.voicechat.fight.C5056a;
import com.bytedance.android.live.liveinteract.voicechat.match.ChatMatchWidget;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.event.C5986ap;
import com.bytedance.android.livesdk.chatroom.event.C6008ch;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q;
import com.bytedance.android.livesdk.chatroom.interact.model.C6068x;
import com.bytedance.android.livesdk.chatroom.model.C6092ad;
import com.bytedance.android.livesdk.chatroom.model.C6094ae;
import com.bytedance.android.livesdk.chatroom.model.interact.C6152aj;
import com.bytedance.android.livesdk.chatroom.model.interact.CrossRoomLinkmicRtcInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkInitResult;
import com.bytedance.android.livesdk.chatroom.model.interact.MultiLiveCoreInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.MultiRtcInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.SingingChallengeLiveCoreInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.SingingChallengeRtcInfo;
import com.bytedance.android.livesdk.chatroom.p517u.AbstractC6302f;
import com.bytedance.android.livesdk.chatroom.p517u.C6305j;
import com.bytedance.android.livesdk.chatroom.p517u.C6307m;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.ktvapi.IKtvService;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.log.p723a.AbstractC8644i;
import com.bytedance.android.livesdk.message.linker.ChangePlayModeData;
import com.bytedance.android.livesdk.message.linker.LinkerChangePlayModeContent;
import com.bytedance.android.livesdk.message.model.C8854es;
import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.android.livesdk.widget.v$a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.depend.model.live.circleinfo.CircleInfo;
import com.bytedance.android.livesdkapi.model.C9650r;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.live.datacontext.C13491f;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.p1594ss.avframework.livestreamv2.core.ILayerControl;
import com.p1594ss.avframework.livestreamv2.core.LiveCore;
import com.p1594ss.avframework.livestreamv2.core.interact.model.Config;
import com.p1594ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.p1594ss.avframework.livestreamv2.core.interact.model.Region;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.p3021tt.miniapp.debug.devtool.BdpDebugHttpRequest;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONArray;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC413392Xt;
import p003X.AbstractC78050Gpo;
import p003X.AbstractC78986HBs;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC80636HqQ;
import p003X.AbstractC81278I1w;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C148062fT6;
import p003X.C2RL;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C409882Kg;
import p003X.C411622Qy;
import p003X.C439993ar;
import p003X.C449933qt;
import p003X.C4574547f;
import p003X.C77834GmK;
import p003X.C77835GmL;
import p003X.C78305Gtv;
import p003X.C78336GuQ;
import p003X.C78363Gur;
import p003X.C78377Gv5;
import p003X.C78379Gv7;
import p003X.C78395GvN;
import p003X.C78467GwX;
import p003X.C78538Gxg;
import p003X.C78595Gyb;
import p003X.C78627Gz7;
import p003X.C78653GzX;
import p003X.C78656Gza;
import p003X.C78684H0c;
import p003X.C78743H2j;
import p003X.C78746H2m;
import p003X.C78828H5q;
import p003X.C78883H7t;
import p003X.C78947HAf;
import p003X.C78970HBc;
import p003X.C78981HBn;
import p003X.C79004HCk;
import p003X.C79006HCm;
import p003X.C79007HCn;
import p003X.C79009HCp;
import p003X.C79046HEa;
import p003X.C79056HEk;
import p003X.C79069HEx;
import p003X.C79072HFa;
import p003X.C79073HFb;
import p003X.C79074HFc;
import p003X.C79075HFd;
import p003X.C79076HFe;
import p003X.C79077HFf;
import p003X.C79078HFg;
import p003X.C79079HFh;
import p003X.C79080HFi;
import p003X.C79083HFl;
import p003X.C79084HFm;
import p003X.C79085HFn;
import p003X.C79086HFo;
import p003X.C79108HGk;
import p003X.C79220HKs;
import p003X.C79242HLo;
import p003X.C7HK;
import p003X.C80517HoV;
import p003X.C80607Hpx;
import p003X.C80627HqH;
import p003X.C80630HqK;
import p003X.C80635HqP;
import p003X.C80641HqV;
import p003X.C80642HqW;
import p003X.C80644HqY;
import p003X.C80645HqZ;
import p003X.C80646Hqa;
import p003X.C80650Hqe;
import p003X.C81173Hz5;
import p003X.C81280I1y;
import p003X.C87010KQi;
import p003X.C87308Kak;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.C88469KtT;
import p003X.DialogC77516GhC;
import p003X.DialogC77790Glc;
import p003X.DialogC77827GmD;
import p003X.DialogC77857Gmh;
import p003X.DialogC77935Gnx;
import p003X.DialogC88906L1g;
import p003X.H0V;
import p003X.HAA;
import p003X.HAY;
import p003X.HBX;
import p003X.HDI;
import p003X.HDT;
import p003X.HDV;
import p003X.HE6;
import p003X.HE9;
import p003X.HED;
import p003X.HEI;
import p003X.HEN;
import p003X.HES;
import p003X.HF2;
import p003X.HF9;
import p003X.HFF;
import p003X.HFS;
import p003X.HFV;
import p003X.HFZ;
import p003X.HG4;
import p003X.HGO;
import p003X.HH8;
import p003X.HHA;
import p003X.HKI;
import p003X.IQV;
import p003X.IQX;
import p003X.LK5;
import p003X.QB4;
import p003X.RunnableC79095HFx;

/* loaded from: classes3.dex */
public final class VideoTalkRoomAnchorWidget extends BaseAnchorLinkWidget<LinkPlayerInfo> implements Observer<KVData>, e$a, AbstractC4766ag, AbstractC4792e, a$a, com.bytedance.android.live.liveinteract.videotalk.p388c.e$a, AbstractC4964m.AbstractC4965a, OnMessageListener, OnMessageListener {
    public static ChangeQuickRedirect LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public int f26462LJ;
    public int LJFF;
    public AbstractC4964m LJIIL;
    public AbstractC78986HBs<LinkPlayerInfo> LJIILIIL;
    public Disposable LJIILJJIL;
    public Disposable LJIILL;
    public BidLinkMicWidget LJIILLIIL;
    public C78377Gv5 LJIJJ;
    public C79004HCk LJIJJLI;
    public boolean LJIL;
    public final AbstractC6070q LJJ;
    public final AbstractC5436a LJJI;
    public int LJJIFFI;
    public long LJJIII;
    public HDI LJJIIJ;
    public HKI LJJIIJZLJL;
    public DialogC88906L1g LJJIIZ;
    public C79220HKs LJJIIZI;
    public boolean LJJIJ;
    public HAY LJJIJIIJI;
    public GuestBattleWidget LJJIJIIJIL;
    public QuickInteractWidget LJJIJIL;
    public VideoTeamFightWidget LJJIJL;
    public VideoLinkRoomFightWidget LJJIJLIJ;
    public VideoPaidLinkWidget LJJIL;
    public SelfDisciplineWidget LJJIZ;
    public DoublePkBusinessWidget LJJJ;
    public VideoTalkCPositionBeInvitedDialog LJJJI;
    public C78395GvN LJJJIL;
    public ChatMatchWidget LJJJJJL;
    public VideoDigitAvatarWidget LJJJJL;
    public boolean LJJJJLI;
    public boolean LJJJJZI;
    public boolean LJJJLL;
    public long LJJJLZIJ;
    public final CompositeDisposable LJJII = new CompositeDisposable();
    public final C78746H2m LJIIZILJ = new C78746H2m(true);
    public final ArrayList<LinkPlayerInfo> LJIJ = new ArrayList<>();
    public final ArrayList<LinkPlayerInfo> LJIJI = new ArrayList<>();
    public final HashMap<String, View> LJJJJIZL = new HashMap<>();
    public final HashMap<String, Boolean> LJJJJJ = new HashMap<>();
    public boolean LJJJJLL = true;
    public boolean LJJJJZ = true;
    public C79006HCm LJJJLIIL = new C79006HCm(this);

    static {
        Covode.recordClassIndex(30640);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.camera.AbstractC4792e
    public final void LIZ(boolean z, boolean z2, boolean z3, boolean z4, AbstractC4791d abstractC4791d) {
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget
    public final int LIZIZ() {
        return 8;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p387b.a$a
    public final void LIZIZ(int i) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget
    /* renamed from: LJ */
    public final int mo15674LJ() {
        return 16;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.camera.AbstractC4792e
    public final boolean LJIIZILJ() {
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m.AbstractC4965a
    public final SurfaceView LJJIJ() {
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m.AbstractC4965a
    public final String LJJIJIIJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 141);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return null;
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131700304;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 142).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final AbstractC78986HBs<LinkPlayerInfo> LIZLLL() {
        return this.LJIILIIL;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag, com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m.AbstractC4965a
    public final ArrayList<LinkPlayerInfo> LJI() {
        return this.LJIJ;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget
    public final AbstractC6070q LJII() {
        return this.LJJ;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final AbstractC5436a LJIIIZ() {
        return this.LJJI;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final C78746H2m LJIIL() {
        return this.LJIIZILJ;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final boolean LJIILJJIL() {
        return this.LJJJJLI;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m.AbstractC4965a
    public final ArrayList<LinkPlayerInfo> LJJIIZI() {
        return this.LJIJI;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m.AbstractC4965a
    public final HashMap<String, Boolean> ah_() {
        return this.LJJJJJ;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m.AbstractC4965a
    public final HashMap<String, View> ai_() {
        return this.LJJJJIZL;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p388c.e$a
    public final void LIZ(AbstractC4964m abstractC4964m) {
        if (PatchProxy.proxy(new Object[]{abstractC4964m}, this, LIZIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC4964m);
        this.LJIIL = abstractC4964m;
    }

    public final AbstractC4964m LIZ(Class<? extends AbstractC4964m> cls) {
        View findViewById;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, LIZIZ, false, 16);
        if (proxy.isSupported) {
            return (AbstractC4964m) proxy.result;
        }
        View view = this.contentView;
        if (view != null && (findViewById = view.findViewById(2131168962)) != null) {
            findViewById.setVisibility(0);
        }
        if (Intrinsics.areEqual(cls, C80646Hqa.class)) {
            Room LJIJI = LJIJI();
            View view2 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            View findViewById2 = view2.findViewById(2131168962);
            if (findViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
            }
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "");
            DataCenter dataCenter = this.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter, "");
            AbstractC5436a abstractC5436a = this.LJJI;
            ViewGroup viewGroup = this.containerView;
            Intrinsics.checkNotNullExpressionValue(viewGroup, "");
            FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(2131197173);
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            return new C80646Hqa(LJIJI, true, (ConstraintLayout) findViewById2, context, dataCenter, this, this, abstractC5436a, frameLayout);
        }
        Room LJIJI2 = LJIJI();
        View view3 = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view3, "");
        View findViewById3 = view3.findViewById(2131168962);
        if (findViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
        }
        Context context2 = this.context;
        Intrinsics.checkNotNullExpressionValue(context2, "");
        DataCenter dataCenter2 = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter2, "");
        AbstractC5436a abstractC5436a2 = this.LJJI;
        ViewGroup viewGroup2 = this.containerView;
        Intrinsics.checkNotNullExpressionValue(viewGroup2, "");
        FrameLayout frameLayout2 = (FrameLayout) viewGroup2.findViewById(2131197173);
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
        return new C80650Hqe(LJIJI2, true, (ConstraintLayout) findViewById3, context2, dataCenter2, this, this, abstractC5436a2, frameLayout2);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, p003X.AbstractC78977HBj
    public final void LIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZIZ, false, 24).isSupported) {
            return;
        }
        super.LIZ(th);
        if (this.LJJIFFI != 12) {
            return;
        }
        C78336GuQ.LIZ(this, null, 1, null);
        this.LJJIFFI = 0;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LIZIZ, false, 25).isSupported) {
            return;
        }
        super.LIZ(j, exc);
        mo15673LJ("rtcStartFailed_" + j);
        if (this.LJJIFFI == 12) {
            this.LJJIFFI = 0;
        }
        if (this.f26462LJ != 12) {
            return;
        }
        this.f26462LJ = 0;
    }

    @Override // p003X.HHU
    public final void LIZ(InteractConfig interactConfig) {
        Config.VideoQuality videoQuality;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ2;
        C6307m LIZIZ3;
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{interactConfig}, this, LIZIZ, false, 27).isSupported) {
            return;
        }
        this.LJJIIJZLJL = new HKI(this);
        C79007HCn LJII = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        Config.InteractMode interactMode = C78467GwX.LIZ(true, LJII.LJIJ) ? Config.InteractMode.VIDEO_TALK_CAMERA : Config.InteractMode.VIDEO_TALK;
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJJZZIII = LJJJI.LJJZZIII()) != null && (LIZIZ2 = LJJZZIII.LIZIZ()) != null && (LIZIZ3 = LIZIZ2.LIZIZ()) != null && LIZIZ3.LIZIZ == 12) {
            interactMode = Config.InteractMode.EQUAL_TALK_ROOM;
        }
        Config.MixStreamType mixStreamType = null;
        if (interactConfig != null) {
            interactConfig.setStreamMixer(this.LJJIIJZLJL);
            StreamUrl streamUrl = LJIJI().getStreamUrl();
            interactConfig.setMixStreamRtmpUrl(streamUrl != null ? streamUrl.LIZ() : null);
            interactConfig.setBackgroundColor("#1F212C");
            interactConfig.setInteractMode(interactMode);
            interactConfig.setViewType(Config.ViewType.TEXTURE_VIEW);
            interactConfig.setVolumeCallbackInterval(300);
            interactConfig.setCharacter(Config.Character.ANCHOR);
            interactConfig.setType(Config.Type.VIDEO);
            interactConfig.setSeiVersion(LIZ());
            interactConfig.setAutoUpdateSeiForTalk(true);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 28);
            if (proxy.isSupported) {
                videoQuality = (Config.VideoQuality) proxy.result;
            } else {
                StreamUrlExtra streamUrlExtraSafely = LJIJI().getStreamUrlExtraSafely();
                Intrinsics.checkNotNullExpressionValue(streamUrlExtraSafely, "");
                if (streamUrlExtraSafely.anchorInteractProfile > 0) {
                    videoQuality = Config.VideoQuality.ANCHOR_HIGH;
                    Intrinsics.checkNotNullExpressionValue(videoQuality, "");
                } else {
                    videoQuality = Config.VideoQuality.ANCHOR_NORMAL;
                    Intrinsics.checkNotNullExpressionValue(videoQuality, "");
                }
            }
            Config videoQuality2 = interactConfig.setVideoQuality(videoQuality);
            if (videoQuality2 != null) {
                videoQuality2.setType(Config.Type.VIDEO);
            }
            SettingKey<Long> settingKey = LiveConfigSettingKeys.LIVE_SEI_UPDATE_INTERVAL;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            interactConfig.setUpdateTalkSeiInterval((int) settingKey.getValue().longValue());
            SettingKey<Boolean> settingKey2 = LiveConfigSettingKeys.TALK_ROOM_RTC_SEI_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            Boolean value = settingKey2.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            interactConfig.setUpdateTalkSeiAB(value.booleanValue());
        }
        HKI hki = this.LJJIIJZLJL;
        if (hki != null && !PatchProxy.proxy(new Object[]{interactConfig}, hki, HKI.LIZ, false, 1).isSupported) {
            hki.LIZIZ = interactConfig;
            hki.LIZJ.LIZ("rtc_init");
        }
        C79007HCn LJII2 = C79007HCn.LJII();
        if (interactConfig != null) {
            mixStreamType = interactConfig.getMixStreamType();
        }
        if (mixStreamType != Config.MixStreamType.CLIENT_MIX) {
            z = false;
        }
        LJII2.LJJIFFI = z;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final void LIZ(LinkPlayerInfo linkPlayerInfo) {
        if (PatchProxy.proxy(new Object[]{linkPlayerInfo}, this, LIZIZ, false, 33).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkPlayerInfo);
        User LIZ = linkPlayerInfo.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        super.LIZ(LIZ);
        LIZIZ(true);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4772f
    public final void LIZ(User user) {
        if (PatchProxy.proxy(new Object[]{user}, this, LIZIZ, false, 34).isSupported) {
            return;
        }
        C106862S5w.LIZ(user);
        super.LIZ(user);
        LIZIZ(true);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4797h
    public final void LIZ(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZIZ, false, 35).isSupported) {
            return;
        }
        super.LIZ(j);
        LIZIZ(false);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4797h
    public final void LIZ(long j, Throwable th) {
        if (PatchProxy.proxy(new Object[]{new Long(j), th}, this, LIZIZ, false, 36).isSupported) {
            return;
        }
        super.LIZ(j, th);
        LIZIZ(false);
        C88469KtT.LIZ(this.context, th, 2131585534);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, p003X.AbstractC78977HBj
    public final void LIZ(C5176i<C6094ae> c5176i) {
        AbstractC78986HBs<LinkPlayerInfo> LJFF;
        if (PatchProxy.proxy(new Object[]{c5176i}, this, LIZIZ, false, 37).isSupported) {
            return;
        }
        C106862S5w.LIZ(c5176i);
        if (LinkCrossRoomDataHolder.LJII().LIZLLL != 0) {
            C88440Kt0.LIZ(2131584120);
            C78336GuQ.LIZ(this, null, 1, null);
            return;
        }
        super.LIZ(c5176i);
        LIZIZ(false);
        if (!"2".equals(LJIJI().anchorAbMap.get("audience_linkmic_continue")) || (LJFF = LJFF()) == null) {
            return;
        }
        LJFF.LJIIJ();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final void LIZ(HAA haa) {
        if (PatchProxy.proxy(new Object[]{haa}, this, LIZIZ, false, 38).isSupported) {
            return;
        }
        C106862S5w.LIZ(haa);
        if (C5056a.LIZJ.LJFF() && haa.LIZLLL <= 0 && haa.f6620LJ == 0) {
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "");
            C116971W2r.LIZJ(new DialogC77935Gnx(context, haa));
            return;
        }
        HBX LJIJJ = LJIJJ();
        long LIZ = haa.LIZ();
        long LIZIZ2 = haa.LIZIZ();
        String LIZJ = haa.LIZJ();
        Intrinsics.checkNotNullExpressionValue(LIZJ, "");
        LJIJJ.LIZ(LIZ, LIZIZ2, LIZJ, 16, haa.LIZLLL, haa.f6620LJ, haa.LJI);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4797h
    public final void LIZ(long j, C6068x c6068x) {
        if (PatchProxy.proxy(new Object[]{new Long(j), c6068x}, this, LIZIZ, false, 39).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6068x);
        super.LIZ(j, c6068x);
        AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs = this.LJIILIIL;
        if (abstractC78986HBs != null) {
            abstractC78986HBs.LJFF(j);
        }
        C88440Kt0.LIZ(2131584497);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, ILayerControl.ILayer iLayer, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, iLayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 41).isSupported) {
            return;
        }
        ALogger.m15801d("link_room_fight", "onFirstRemoteVideoFrame linkId " + str + " layer " + iLayer);
        super.LIZ(str, iLayer, i, i2);
        AbstractC4964m abstractC4964m = this.LJIIL;
        if (abstractC4964m == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC4964m.LIZ(str, (View) null);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, TextureView textureView, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, textureView, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 42).isSupported) {
            return;
        }
        ALogger.m15801d("link_room_fight", "onFirstRemoteVideoFrame linkId " + str + " textureView " + textureView);
        super.LIZ(str, textureView, i, i2);
        this.LJJJJIZL.put(str, textureView);
        AbstractC4964m abstractC4964m = this.LJIIL;
        if (abstractC4964m == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC4964m.LIZ(str, textureView);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZIZ(String str, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{str, bool}, this, LIZIZ, false, 43).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        super.LIZIZ(str, bool);
        AbstractC4964m abstractC4964m = this.LJIIL;
        if (abstractC4964m == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC4964m.LIZIZ(str, Intrinsics.areEqual(bool, Boolean.TRUE));
        HHA LJIL = LJIL();
        if (LJIL == null) {
            return;
        }
        LJIL.LJI();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final void LIZ(long j, boolean z) {
        HDI hdi;
        if (!PatchProxy.proxy(new Object[]{new Long(j), (byte) 0}, this, LIZIZ, false, 44).isSupported && (hdi = this.LJJIIJ) != null && !PatchProxy.proxy(new Object[]{hdi, new Long(j), null, 2, null}, null, HDI.LIZ, true, 6).isSupported) {
            hdi.LIZ(j, null);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final void LIZIZ(long j, boolean z) {
        HDI hdi;
        if (!PatchProxy.proxy(new Object[]{new Long(j), (byte) 0}, this, LIZIZ, false, 47).isSupported && (hdi = this.LJJIIJ) != null) {
            HDI.LIZ(hdi, j, null, 2, null);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final void LIZ(boolean z, List<AnchorLinkUser> list, long j, Map<Long, ? extends RoomLinkerContent> map) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), list, new Long(j), map}, this, LIZIZ, false, 48).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        LIZIZ(!z ? 1 : 0, "self_panel");
        LJFF().LIZ(list, j, z ? "silence" : "unSilence", map);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final void LIZ(long j, String str) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str}, this, LIZIZ, false, 49).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (this.LJJJLL) {
            return;
        }
        this.LJJJLL = true;
        LJIJJ().LIZ(j, str, "anchor_stop_normal");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final void LIZ(int i, String str, int i2, String str2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), str2}, this, LIZIZ, false, 50).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.dataCenter.put("data_task_name_when_open_invite_panel", str2);
        this.LJJIIZI = C79220HKs.LIZ(this.dataCenter, this).LIZ(i, str, i2, LJIJI());
        C79220HKs c79220HKs = this.LJJIIZI;
        if (c79220HKs != null) {
            Context context = this.context;
            if (context == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            c79220HKs.show(((FragmentActivity) context).getSupportFragmentManager(), "LinkDialog");
        }
        AbstractC4774i LIZ = AbstractC78050Gpo.LIZ();
        if (LIZ == null) {
            return;
        }
        LIZ.LJIIL();
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p388c.AbstractC4911b
    public final void LIZ(AbstractC4912d abstractC4912d, AbstractC4912d abstractC4912d2, HFV hfv) {
        C5923dp LIZ;
        AbstractC413392Xt<C6305j> LJJJJZ;
        C6305j LIZIZ2;
        AbstractC413392Xt<C6305j> LJJJJZ2;
        C6305j LIZIZ3;
        AbstractC413392Xt<C6305j> LJJJJZ3;
        C6305j LIZIZ4;
        AbstractC413392Xt<C6305j> LJJJJZ4;
        C6305j LIZIZ5;
        String str;
        CircleInfo circleInfo;
        String str2;
        if (PatchProxy.proxy(new Object[]{abstractC4912d, abstractC4912d2, hfv}, this, LIZIZ, false, 52).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC4912d2, hfv);
        if (abstractC4912d == null) {
            return;
        }
        if (!PatchProxy.proxy(new Object[]{abstractC4912d, abstractC4912d2}, this, LIZIZ, false, 54).isSupported && !C78828H5q.LJFF.LIZ(Integer.valueOf(abstractC4912d.LIZIZ), Integer.valueOf(abstractC4912d.LIZJ), Integer.valueOf(abstractC4912d2.LIZIZ), Integer.valueOf(abstractC4912d2.LIZJ))) {
            String LIZ2 = C78828H5q.LIZ(Integer.valueOf(abstractC4912d.LIZIZ), Integer.valueOf(abstractC4912d.LIZJ));
            String LIZ3 = C78828H5q.LIZ(Integer.valueOf(abstractC4912d2.LIZIZ), Integer.valueOf(abstractC4912d2.LIZJ));
            String LIZ4 = C78656Gza.LIZ(Integer.valueOf(abstractC4912d.LIZJ));
            String LIZ5 = C78656Gza.LIZ(Integer.valueOf(abstractC4912d2.LIZJ));
            boolean z = !Intrinsics.areEqual(LIZ2, LIZ3);
            String str3 = "layout_type_close";
            if (z) {
                if (LIZ2 != null) {
                    if (Intrinsics.areEqual(LIZ4, LIZ5)) {
                        str3 = "function_switch";
                    }
                    C78828H5q.LIZ(LIZ2, LIZ4, str3);
                }
            } else if ((!Intrinsics.areEqual(LIZ4, LIZ5)) && LIZ4 != null) {
                C78828H5q.LIZ((String) null, LIZ4, str3, 1, (Object) null);
            }
        }
        if (LIZ(abstractC4912d, abstractC4912d2)) {
            int i = abstractC4912d.LIZIZ;
            int i2 = abstractC4912d.LIZJ;
            if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 66).isSupported) {
                HashMap hashMap = new HashMap();
                C78828H5q.LIZ(hashMap);
                C78828H5q.LIZIZ(hashMap, Integer.valueOf(i), (Integer) null, 4, (Object) null);
                C78828H5q.LIZ((Map<String, String>) hashMap, i2);
                C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f6959N;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                Boolean LIZ6 = c87308Kak.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ6, "");
                String str4 = "on";
                hashMap.put("is_camera_allow", LIZ6.booleanValue() ? str4 : "off");
                this.LJJIII = System.currentTimeMillis();
                hashMap.put("duration", String.valueOf((System.currentTimeMillis() - this.LJJIII) / 1000));
                int i3 = this.LJFF;
                hashMap.put("connect_pcu", String.valueOf(i3 != 0 ? i3 - 1 : 0));
                Object obj = this.dataCenter.get("data_big_party_support_send_gift_to_linker", (String) Boolean.FALSE);
                Intrinsics.checkNotNullExpressionValue(obj, "");
                hashMap.put("gift_guest_switch_type", ((Boolean) obj).booleanValue() ? str4 : "off");
                hashMap.put("send_gift_scene", "video_audience_multi");
                C78828H5q.LIZIZ((Map<String, String>) hashMap, true);
                AbstractC8644i LIZ7 = C4574547f.LIZ().LIZ(C8668v.class);
                if ((LIZ7 instanceof C81173Hz5) && ((C81173Hz5) LIZ7).LJIILJJIL) {
                    hashMap.put("is_continue", "continue");
                }
                hashMap.put("is_avatar_used", this.LJIL ? "1" : "0");
                Room LJIJI = LJIJI();
                if (LJIJI != null && (circleInfo = LJIJI.circleInfo) != null && (str2 = circleInfo.circleName) != null) {
                    hashMap.put("circle_name", str2);
                }
                Object obj2 = "null";
                if (!this.LIZLLL) {
                    obj2 = this.dataCenter.get("data_room_shoot_way_exact", (String) obj2);
                    Intrinsics.checkNotNullExpressionValue(obj2, "");
                }
                hashMap.put("shoot_way", obj2);
                C78828H5q.LIZJ(hashMap, Integer.valueOf(C79242HLo.LJIIJ()));
                DataCenter dataCenter = this.dataCenter;
                if (dataCenter != null && (str = (String) dataCenter.get("data_room_video_talk_log_over_for_over_path", "")) != null && !TextUtils.isEmpty(str)) {
                    hashMap.put("over_path", str);
                    this.dataCenter.put("data_room_video_talk_log_over_for_over_path", "");
                }
                BidLinkMicWidget bidLinkMicWidget = this.LJIILLIIL;
                hashMap.put("auction_mode_status", (bidLinkMicWidget == null || !bidLinkMicWidget.LIZJ) ? "off" : str4);
                Integer num = (Integer) this.dataCenter.get("data_ktv_mode_before_close", (String) (-1));
                if (num == null || num.intValue() != -1) {
                    int LJJJJI = LJJJJI();
                    C5923dp LIZ8 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                    if (LIZ8 != null && (LJJJJZ4 = LIZ8.LJJJJZ()) != null && (LIZIZ5 = LJJJJZ4.LIZIZ()) != null) {
                        LIZIZ5.LIZ(LJJJJI);
                    }
                    C5923dp LIZ9 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                    if (LIZ9 != null && (LJJJJZ3 = LIZ9.LJJJJZ()) != null && (LIZIZ4 = LJJJJZ3.LIZIZ()) != null) {
                        Object obj3 = this.dataCenter.get("data_ktv_mode_before_close", (String) (-1));
                        Intrinsics.checkNotNullExpressionValue(obj3, "");
                        LIZIZ4.LIZIZ(((Number) obj3).intValue());
                    }
                    hashMap.put("play_mode", C78656Gza.LIZ());
                    C5923dp LIZ10 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                    if (LIZ10 != null && (LJJJJZ2 = LIZ10.LJJJJZ()) != null && (LIZIZ3 = LJJJJZ2.LIZIZ()) != null) {
                        Object obj4 = this.dataCenter.get("data_ktv_mode_before_close", (String) (-1));
                        Intrinsics.checkNotNullExpressionValue(obj4, "");
                        LIZIZ3.LIZ(((Number) obj4).intValue());
                    }
                    if (LJJJJI != -1 && (LIZ = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null)) != null && (LJJJJZ = LIZ.LJJJJZ()) != null && (LIZIZ2 = LJJJJZ.LIZIZ()) != null) {
                        LIZIZ2.LIZIZ(LJJJJI);
                    }
                    this.dataCenter.put("data_ktv_mode_before_close", -1);
                } else {
                    hashMap.put("play_mode", C78656Gza.LIZ());
                }
                if (!C4284f.LJIIIIZZ.LIZIZ().LIZLLL) {
                    str4 = "off";
                }
                hashMap.put("rechargeable_mode_status", str4);
                C4574547f.LIZ().LIZ("livesdk_anchor_audience_connection_over", hashMap, Room.class);
            }
        }
        if (abstractC4912d.LIZLLL() || abstractC4912d2.LIZLLL()) {
            return;
        }
        LJFF().LIZ((List<LinkmicPositionItem>) null);
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p388c.AbstractC4911b
    public final void LIZIZ(AbstractC4912d abstractC4912d, AbstractC4912d abstractC4912d2, HFV hfv) {
        C5923dp LIZ;
        AbstractC413392Xt<C6305j> LJJJJZ;
        C6305j LIZIZ2;
        C5923dp LIZ2;
        AbstractC413392Xt<C6305j> LJJJJZ2;
        C6305j LIZIZ3;
        String str;
        String str2;
        if (PatchProxy.proxy(new Object[]{abstractC4912d, abstractC4912d2, hfv}, this, LIZIZ, false, 53).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC4912d2, hfv);
        if (abstractC4912d == null) {
            return;
        }
        if (!PatchProxy.proxy(new Object[]{abstractC4912d, abstractC4912d2}, this, LIZIZ, false, 55).isSupported && !C78828H5q.LJFF.LIZ(Integer.valueOf(abstractC4912d.LIZIZ), Integer.valueOf(abstractC4912d.LIZJ), Integer.valueOf(abstractC4912d2.LIZIZ), Integer.valueOf(abstractC4912d2.LIZJ))) {
            String LIZ3 = C78828H5q.LIZ(Integer.valueOf(abstractC4912d.LIZIZ), Integer.valueOf(abstractC4912d.LIZJ));
            String LIZ4 = C78828H5q.LIZ(Integer.valueOf(abstractC4912d2.LIZIZ), Integer.valueOf(abstractC4912d2.LIZJ));
            String LIZ5 = C78656Gza.LIZ(Integer.valueOf(abstractC4912d.LIZJ));
            String LIZ6 = C78656Gza.LIZ(Integer.valueOf(abstractC4912d2.LIZJ));
            if (!Intrinsics.areEqual(LIZ3, LIZ4)) {
                C78828H5q.LIZ(LIZ4, LIZ6, (LIZ3 == null || !Intrinsics.areEqual(LIZ5, LIZ6)) ? null : "function_switch", abstractC4912d.LIZJ == 6 || abstractC4912d.LIZJ == 3 || abstractC4912d2.LIZJ == 6 || abstractC4912d2.LIZJ == 3);
            } else if (!Intrinsics.areEqual(LIZ5, LIZ6)) {
                C78828H5q.LIZ((String) null, LIZ6, (String) null, abstractC4912d.LIZJ == 6 || abstractC4912d.LIZJ == 3 || abstractC4912d2.LIZJ == 6 || abstractC4912d2.LIZJ == 3, 5, (Object) null);
            }
        }
        if (LIZ(abstractC4912d, abstractC4912d2)) {
            HEI hei = (HEI) (!(hfv instanceof HEI) ? null : hfv);
            String str3 = hei != null ? hei.f6712LJ : null;
            int i = abstractC4912d2.LIZIZ;
            Integer valueOf = Integer.valueOf(abstractC4912d2.LIZJ);
            if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), valueOf, str3}, this, LIZIZ, false, 68).isSupported) {
                HashMap hashMap = new HashMap();
                C78828H5q.LIZIZ(hashMap, Integer.valueOf(i), (Integer) null, 4, (Object) null);
                C78828H5q.LIZIZ(hashMap);
                C78828H5q.LIZ(hashMap);
                C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f6959N;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                Boolean LIZ7 = c87308Kak.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ7, "");
                hashMap.put("is_camera_allow", LIZ7.booleanValue() ? "on" : "off");
                CircleInfo circleInfo = LJIJI().circleInfo;
                if (circleInfo != null && (str2 = circleInfo.circleName) != null) {
                    hashMap.put("circle_name", str2);
                }
                hashMap.put("shoot_way", "null");
                if (valueOf != null && valueOf.intValue() == 4) {
                    hashMap.put("grouppk_stage", "prepare");
                }
                DataCenter dataCenter = this.dataCenter;
                if (dataCenter != null && (str = (String) dataCenter.get("data_room_video_talk_log_open_success_for_enter_from", "")) != null && !TextUtils.isEmpty(str)) {
                    hashMap.put("enter_from", str);
                    this.dataCenter.put("data_room_video_talk_log_open_success_for_enter_from", "");
                }
                if (((valueOf != null && valueOf.intValue() == 9) || Intrinsics.areEqual(str3, "SingChallengeOpen")) && (LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null)) != null && (LJJJJZ2 = LIZ2.LJJJJZ()) != null && (LIZIZ3 = LJJJJZ2.LIZIZ()) != null) {
                    LIZIZ3.LIZIZ(6);
                }
                String LIZ8 = C78828H5q.LIZ();
                if (LIZ8 != null) {
                    hashMap.put("source", LIZ8);
                }
                if (Intrinsics.areEqual("SingChallengeOpen", str3) && (LIZ = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null)) != null && (LJJJJZ = LIZ.LJJJJZ()) != null && (LIZIZ2 = LJJJJZ.LIZIZ()) != null) {
                    LIZIZ2.LIZIZ(10);
                }
                C4574547f.LIZ().LIZ("anchor_audience_connection_open_success", hashMap, Room.class, C8668v.class);
            }
        }
        if (!abstractC4912d.LIZIZ() && abstractC4912d2.LIZIZ()) {
            C88440Kt0.LIZ(2131585434);
        }
        if (abstractC4912d.LIZLLL() && abstractC4912d2.LIZJ()) {
            C88440Kt0.LIZ(2131584218);
        }
        LJII(hfv.toString());
        if (!abstractC4912d.LIZJ() && abstractC4912d2.LIZJ()) {
            LJJJJ();
        } else if (abstractC4912d.LIZJ() && !abstractC4912d2.LIZJ()) {
            LJJJIL();
        }
        LJIL().LIZ(abstractC4912d2.LIZ() ? Config.InteractMode.EQUAL_TALK_ROOM : Config.InteractMode.VIDEO_TALK_CAMERA);
        LJIL().LIZ(abstractC4912d2.LIZIZ, "videoAnchor#afterSwitchWindowLayout");
        LJIL().LJI();
        if (abstractC4912d2.LIZ()) {
            C87308Kak<Integer> c87308Kak2 = AbstractC80293Hkt.f6984aL;
            Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
            c87308Kak2.LIZ(12);
        } else if (abstractC4912d2.LIZIZ == 8) {
            C87308Kak<Integer> c87308Kak3 = AbstractC80293Hkt.f6984aL;
            Intrinsics.checkNotNullExpressionValue(c87308Kak3, "");
            c87308Kak3.LIZ(8);
        }
        LJJJ();
    }

    public final void LIZ(C6152aj c6152aj, String str, String str2) {
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ2;
        if (PatchProxy.proxy(new Object[]{c6152aj, str, str2}, this, LIZIZ, false, 60).isSupported) {
            return;
        }
        ALogger.m15797i("ttlive_link_video", "realSwitchScene by " + str + ", to:" + c6152aj + " current=" + LJJIL());
        int i = c6152aj.LJIIL;
        List<Integer> list = c6152aj.LJI;
        int i2 = c6152aj.LJIILIIL;
        List<AnchorLinkUser> list2 = c6152aj.LJII;
        if (list2 != null) {
            ALogger.m15797i("ttlive_link_video", "realSwitchScene " + C79242HLo.LIZIZ(list2));
            LJFF().LIZ(list2, c6152aj.LJIIIZ, str, c6152aj.LJIIIIZZ);
        }
        LIZ(c6152aj.f26891LJ, c6152aj.LIZLLL, c6152aj.LIZJ, c6152aj.LIZIZ);
        LJII(str);
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJJZZIII = LJJJI.LJJZZIII()) != null && (LIZIZ2 = LJJZZIII.LIZIZ()) != null) {
            LIZIZ2.LIZ(LIZIZ2.LIZIZ());
            LIZIZ2.LIZIZ(new C6307m(i, list, i2));
        }
        C79004HCk c79004HCk = this.LJIJJLI;
        if (c79004HCk == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c79004HCk.LIZ(new HEI(i, i2, str, str2));
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final void LIZ(int i, Integer num, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), num, str}, this, LIZIZ, false, 62).isSupported) {
            return;
        }
        LIZ(i, num, str, false);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final void LIZ(long j, long j2, boolean z, Function1<? super Boolean, Unit> function1) {
        if (PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0), function1}, this, LIZIZ, false, 71).isSupported) {
            return;
        }
        LIZ(z, j2);
        long currentTimeMillis = System.currentTimeMillis();
        this.LJJII.add(((LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class)).setCPosition(j, j2, (z ? CPositionInviteType.Enlarge : CPositionInviteType.Reduce).value).compose(C100839PnV.LIZJ()).subscribe(new C78305Gtv(j2, z, currentTimeMillis, function1), new HDV<>(j2, z, currentTimeMillis, function1, j)));
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final void LIZ(long j, long j2, boolean z) {
        if (PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 72).isSupported) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.LJJII.add(((LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class)).replyCPosition(j, j2, (z ? CPositionReplyType.Accept : CPositionReplyType.Reject).value).compose(C100839PnV.LIZJ()).subscribe(new HES(j2, z, currentTimeMillis), new HDT<>(j2, z, currentTimeMillis, j)));
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final void LIZ(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, LIZIZ, false, 80).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        AbstractC4964m abstractC4964m = this.LJIIL;
        if (abstractC4964m == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC4964m.LIZ(view);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final void LIZ(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 82).isSupported) {
            return;
        }
        HBX LJIJJ = LJIJJ();
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        LJIJJ.LIZ(context, i, i2);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final void LIZ(boolean z, String str) {
        int i = 2;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str}, this, LIZIZ, false, 83).isSupported) {
            return;
        }
        ALogger.m15797i("ttlive_link_video", "enableDynamic " + z + " reason=" + str + "  scene:" + C79242HLo.LJIIJ());
        int LJIIJ = C79242HLo.LJIIJ();
        if (LJIIJ == 8) {
            i = z ? 7 : 1;
        } else if (LJIIJ != 12) {
            i = 0;
        } else if (!z) {
            i = 5;
        }
        LIZ(LJIIJ, Integer.valueOf(i), "enableDynamic", true);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    @Deprecated(message = "仅打Log作为参考，后续可以删除")
    public final void LIZ(C8874fl c8874fl) {
        ChangePlayModeData changePlayModeData;
        C106862S5w.LIZ(c8874fl);
        LinkerChangePlayModeContent linkerChangePlayModeContent = c8874fl.LJJIIJZLJL;
        List<Integer> list = (linkerChangePlayModeContent == null || (changePlayModeData = linkerChangePlayModeContent.changePlayModeData) == null) ? null : changePlayModeData.playModes;
        ALogger.m15797i("ttlive_link_video", "playModeChangeMsg(id=" + c8874fl.getMessageId() + "), current=" + LJJI() + ", new=" + list);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String[] strArr, boolean[] zArr, int[] iArr) {
        if (PatchProxy.proxy(new Object[]{strArr, zArr, iArr}, this, LIZIZ, false, 91).isSupported) {
            return;
        }
        super.LIZ(strArr, zArr, iArr);
        AbstractC4964m abstractC4964m = this.LJIIL;
        if (abstractC4964m == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC4964m.LIZ(strArr, zArr);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, long j) {
        if (PatchProxy.proxy(new Object[]{str, new Long(j)}, this, LIZIZ, false, 93).isSupported) {
            return;
        }
        super.LIZ(str, j);
        if (str == null) {
            return;
        }
        this.LJJJJIZL.remove(str);
        AbstractC4964m abstractC4964m = this.LJIIL;
        if (abstractC4964m == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC4964m.LIZ(str);
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 97).isSupported) {
            return;
        }
        StringBuilder sb = new StringBuilder("onIsSingerChanged ");
        sb.append(z);
        sb.append(" mute=");
        HDI hdi = this.LJJIIJ;
        sb.append(hdi != null ? Integer.valueOf(hdi.LIZ()) : null);
        sb.append(" shouldRestore=");
        sb.append(this.LJJJJLI);
        sb.append(" isOnBackground=");
        sb.append(this.LJJIJ);
        ALogger.m15797i("video_talk", sb.toString());
        if (z) {
            HDI hdi2 = this.LJJIIJ;
            if ((hdi2 == null || hdi2.LIZ() != 0) && !this.LJJIJ) {
                HDI hdi3 = this.LJJIIJ;
                if (hdi3 != null) {
                    hdi3.LIZ(C79242HLo.LIZ());
                }
                this.LJJJJLI = true;
                return;
            }
            this.LJJJJLI = false;
        } else if (!this.LJJJJLI) {
        } else {
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_ANCHOR_AUDIO_SWITCH_OPTIMIZE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                HHA.LIZ(LJIL(), false, null, 2, null);
            }
            HDI hdi4 = this.LJJIIJ;
            if (hdi4 != null) {
                hdi4.LIZIZ();
            }
            if (this.LJJIJ) {
                this.dataCenter.put("data_talk_room_capture_audio_notification_show_state", Boolean.FALSE);
            }
            this.LJJJJLI = false;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4797h
    public final void LIZIZ(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LIZIZ, false, 105).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        super.LIZIZ(c8854es);
        User user = new User();
        user.setId(c8854es.LJJI);
        user.setSecUid(c8854es.LJJIFFI);
        LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
        linkPlayerInfo.LIZLLL = user;
        LIZ(linkPlayerInfo);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p350d.e$a
    public final long LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 106);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        User LIZIZ2 = LJFF().LIZIZ(str);
        if (LIZIZ2 == null) {
            return 0L;
        }
        return LIZIZ2.getId();
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p350d.e$a
    public final boolean LIZIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 108);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC4964m abstractC4964m = this.LJIIL;
        if (abstractC4964m == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC4964m.LIZJ(str);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.camera.AbstractC4792e
    public final void LIZ(VideoShowMode videoShowMode, VideoShowMode videoShowMode2, AbstractC4791d abstractC4791d) {
        int i = 2;
        if (PatchProxy.proxy(new Object[]{videoShowMode, videoShowMode2, abstractC4791d}, this, LIZIZ, false, 115).isSupported) {
            return;
        }
        C106862S5w.LIZ(videoShowMode, videoShowMode2);
        int i2 = C78743H2j.LIZ[videoShowMode.ordinal()];
        if (i2 == 1) {
            i = 1;
        } else if (i2 != 2) {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = 3;
        }
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        C80517HoV.LIZJ().LIZ(new C4825a(context, 16, OperateType.APPLY, i, LJIJI(), C79242HLo.LIZ(), null, null, 192), new C78947HAf(abstractC4791d));
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m.AbstractC4965a
    public final void LIZ(String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 124).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        LJIL().LIZJ(str, z);
    }

    public final void LIZ(View view, MotionEvent motionEvent) {
        if (PatchProxy.proxy(new Object[]{view, motionEvent}, this, LIZIZ, false, 129).isSupported) {
            return;
        }
        C106862S5w.LIZ(view, motionEvent);
        AbstractC4964m abstractC4964m = this.LJIIL;
        if (abstractC4964m == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            abstractC4964m.LIZ(view, motionEvent);
        }
    }

    public final void LIZ(C78377Gv5 c78377Gv5) {
        if (PatchProxy.proxy(new Object[]{c78377Gv5}, this, LIZIZ, false, 135).isSupported) {
            return;
        }
        C106862S5w.LIZ(c78377Gv5);
        this.LJIJJ = c78377Gv5;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final long LJIIIIZZ() {
        if (this.LJJJLL) {
            return -1L;
        }
        return this.LJJJLZIJ;
    }

    private final void LJJJ() {
        VideoPaidLinkWidget videoPaidLinkWidget;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 23).isSupported && (videoPaidLinkWidget = this.LJJIL) != null) {
            videoPaidLinkWidget.LJIIIZ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final HBX LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 30);
        if (proxy.isSupported) {
            return (HBX) proxy.result;
        }
        return LJIJJ();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final AbstractC4964m LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 120);
        if (proxy.isSupported) {
            return (AbstractC4964m) proxy.result;
        }
        AbstractC4964m abstractC4964m = this.LJIIL;
        if (abstractC4964m == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC4964m;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final boolean LJIILIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 86);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return LJIL().LJI;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final void LJIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 58).isSupported) {
            return;
        }
        AbstractC4964m abstractC4964m = this.LJIIL;
        if (abstractC4964m == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            abstractC4964m.LJIJI();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m.AbstractC4965a
    public final void LJJIJIIJIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 119).isSupported) {
            return;
        }
        LJIL().LJI();
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m.AbstractC4965a
    public final LiveCore LJJIJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 123);
        if (proxy.isSupported) {
            return (LiveCore) proxy.result;
        }
        return this.LJJI.LJIILL();
    }

    public final void LJJIJL() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 116).isSupported) {
            return;
        }
        LJIJJ().LIZIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: W_ */
    public final void mo15659W_() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 89).isSupported) {
            return;
        }
        super.mo15659W_();
        HKI hki = this.LJJIIJZLJL;
        if (hki != null) {
            hki.LIZ();
        }
        this.LJJJJLI = false;
        LJJJIL();
    }

    private AbstractC4912d LJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 3);
        if (proxy.isSupported) {
            return (AbstractC4912d) proxy.result;
        }
        C79004HCk c79004HCk = this.LJIJJLI;
        if (c79004HCk == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        AbstractC4912d abstractC4912d = c79004HCk.LIZIZ;
        if (abstractC4912d == null) {
            return C79072HFa.LJII;
        }
        return abstractC4912d;
    }

    private final int LJJIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C79004HCk c79004HCk = this.LJIJJLI;
        if (c79004HCk == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c79004HCk.LIZ();
    }

    private final boolean LJJJJIZL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 75);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return Intrinsics.areEqual(LJJIL(), C79074HFc.LJII);
    }

    private final boolean LJJJJJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 76);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return Intrinsics.areEqual(LJJIL(), C79079HFh.LJII);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4772f
    public final AbstractC78986HBs<LinkPlayerInfo> LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 26);
        if (proxy.isSupported) {
            return (AbstractC78986HBs) proxy.result;
        }
        if (this.LJIILIIL == null) {
            Room LJIJI = LJIJI();
            DataCenter dataCenter = this.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter, "");
            this.LJIILIIL = new C4806x(LJIJI, dataCenter, 8);
        }
        AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs = this.LJIILIIL;
        if (abstractC78986HBs != null) {
            return abstractC78986HBs;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.plantform.base.ILinkUserInfoCenter<com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo>");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final Config.MixStreamType LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 121);
        if (proxy.isSupported) {
            return (Config.MixStreamType) proxy.result;
        }
        HHA LJIL = LJIL();
        if (LJIL == null) {
            return null;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], LJIL, HHA.LIZ, false, 43);
        if (proxy2.isSupported) {
            return (Config.MixStreamType) proxy2.result;
        }
        Config config = LJIL.LJIILL;
        if (config == null) {
            return null;
        }
        return config.getMixStreamType();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final void LJIILLIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 131).isSupported) {
            return;
        }
        Boolean bool = (Boolean) this.dataCenter.get("cmd_ready_starting_live", (String) Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bool, "");
        if (bool.booleanValue()) {
            LJJIJLIJ();
        }
    }

    public final C6307m LJJI() {
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 5);
        if (proxy.isSupported) {
            return (C6307m) proxy.result;
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJJZZIII = LJJJI.LJJZZIII()) != null && (LIZIZ2 = LJJZZIII.LIZIZ()) != null) {
            return LIZIZ2.LIZIZ();
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p387b.a$a
    public final void ad_() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 88).isSupported) {
            return;
        }
        SettingKey<C9650r> settingKey = LiveConfigSettingKeys.LIVE_AUDIO_LINK_INVITE_GUIDE_CONFIG_ANCHOR;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (settingKey.getValue().LIZ == 1) {
            AbstractC4964m abstractC4964m = this.LJIIL;
            if (abstractC4964m == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            abstractC4964m.LJIILIIL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int LJJJJI() {
        /*
            r6 = this;
            r3 = 0
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomAnchorWidget.LIZIZ
            r0 = 67
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r6, r1, r3, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.result
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L18:
            X.2Kg r0 = com.bytedance.android.livesdk.chatroom.C5923dp.LJIIJ
            r1 = 0
            r2 = 0
            r4 = 3
            r5 = 0
            com.bytedance.android.livesdk.chatroom.dp r0 = p003X.C409882Kg.LIZ(r0, r1, r2, r4, r5)
            r3 = -1
            if (r0 == 0) goto L70
            X.2Xt r0 = r0.LJJJJZ()
            if (r0 == 0) goto L70
            java.lang.Object r1 = r0.LIZIZ()
            com.bytedance.android.livesdk.chatroom.u.j r1 = (com.bytedance.android.livesdk.chatroom.p517u.C6305j) r1
            if (r1 == 0) goto L70
            X.2WC r0 = r1.LIZ()
            java.lang.Object r0 = r0.LIZ()
            java.util.Set r0 = (java.util.Set) r0
            int r0 = r0.size()
            if (r0 > 0) goto L45
            return r3
        L45:
            X.2WC r0 = r1.LIZ()
            java.lang.Object r0 = r0.LIZ()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r2 = r0.iterator()
        L53:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 9
            if (r1 == r0) goto L6f
            r0 = 8
            if (r1 == r0) goto L6f
            r0 = 10
            if (r1 != r0) goto L53
        L6f:
            return r1
        L70:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomAnchorWidget.LJJJJI():int");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final String LJIILL() {
        List<LinkPlayerInfo> LIZJ;
        Object obj;
        User LIZ;
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 73);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C6307m LJJI = LJJI();
        if (LJJI != null) {
            i = LJJI.LIZLLL;
        }
        if (C78653GzX.LIZ(i)) {
            AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs = this.LJIILIIL;
            if (abstractC78986HBs != null && (LIZJ = abstractC78986HBs.LIZJ()) != null) {
                Iterator<T> it = LIZJ.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((LinkPlayerInfo) obj).LJJJI) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
                if (linkPlayerInfo != null && (LIZ = linkPlayerInfo.LIZ()) != null && LIZ.getId() == LJIJI().ownerUserId) {
                    return "anchor";
                }
                return "guest";
            }
            return "guest";
        }
        return "normal";
    }

    public final void LJJIFFI() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 32).isSupported) {
            return;
        }
        Object obj = this.dataCenter.get("data_talk_room_admin_allowed_flag", (String) Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        if (((Boolean) obj).booleanValue()) {
            C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f6958M;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            Boolean LIZ = c87308Kak.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            C78828H5q.LIZ("live_chat", LIZ.booleanValue());
            this.dataCenter.put("data_talk_room_admin_allowed_flag", Boolean.FALSE);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p387b.a$a
    public final void ac_() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 22).isSupported) {
            return;
        }
        int i = this.LJIIJ;
        int LJJIZ = LJJIZ();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), "stop_normally", Integer.valueOf(LJJIZ)}, this, LIZIZ, false, 112).isSupported) {
            long currentTimeMillis = System.currentTimeMillis();
            ((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).finishV1(LJIJI().getId(), i, "stop_normally").compose(C100839PnV.LIZJ()).subscribe(new C78970HBc(currentTimeMillis, LJJIZ), new C78981HBn(currentTimeMillis));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p388c.e$a
    public final void ag_() {
        View findViewById;
        View findViewById2;
        View findViewById3;
        View findViewById4;
        View findViewById5;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 8).isSupported) {
            return;
        }
        View view = this.contentView;
        if (view != null && (findViewById5 = view.findViewById(2131168961)) != null) {
            findViewById5.setVisibility(8);
        }
        View view2 = this.contentView;
        if (view2 != null && (findViewById4 = view2.findViewById(2131168962)) != null) {
            findViewById4.setVisibility(8);
        }
        View view3 = this.contentView;
        if (view3 != null && (findViewById3 = view3.findViewById(2131173812)) != null) {
            findViewById3.setVisibility(8);
        }
        View view4 = this.contentView;
        if (view4 != null && (findViewById2 = view4.findViewById(2131184133)) != null) {
            findViewById2.setVisibility(8);
        }
        View view5 = this.contentView;
        if (view5 != null && (findViewById = view5.findViewById(2131172771)) != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 96).isSupported) {
            return;
        }
        this.LJJIJ = true;
        Activity LIZ = C439993ar.LIZ(this.context);
        if (LIZ != null && !LIZ.isFinishing() && LJIL().LJI) {
            if (!((IInteractService) ServiceManager.getService(IInteractService.class)).enableCaptureAudioOnBackground(true)) {
                HDI hdi = this.LJJIIJ;
                if (hdi != null && hdi.LIZ() == 0) {
                    HDI hdi2 = this.LJJIIJ;
                    if (hdi2 != null) {
                        hdi2.f6685LJ = true;
                    }
                    HDI hdi3 = this.LJJIIJ;
                    if (hdi3 != null) {
                        HDI.LIZ(hdi3, ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ(), 1, null, 4, null);
                    }
                } else {
                    HDI hdi4 = this.LJJIIJ;
                    if (hdi4 != null) {
                        hdi4.f6685LJ = false;
                    }
                }
                LIZIZ(false, "onPause");
            } else {
                HH8.LJFF();
            }
            LJFF().LJIIIZ();
        }
        super.onPause();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        HDI hdi;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 95).isSupported) {
            return;
        }
        super.onResume();
        AbstractC4964m abstractC4964m = this.LJIIL;
        if (abstractC4964m == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            abstractC4964m.LIZJ();
        }
        this.LJJIJ = false;
        if (LJIL().LJI) {
            LJIL().LIZIZ(false, "onResume");
            HDI hdi2 = this.LJJIIJ;
            if ((hdi2 != null && hdi2.LIZ() == 3) || ((hdi = this.LJJIIJ) != null && hdi.f6685LJ)) {
                if (this.LJJJJZ) {
                    LIZIZ(true, "onResume");
                    this.LJJ.setAudioMute(false);
                } else {
                    this.LJJJJZI = true;
                }
                HDI hdi3 = this.LJJIIJ;
                if (hdi3 != null) {
                    HDI.LIZ(hdi3, ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ(), null, 2, null);
                }
            }
            HDI hdi4 = this.LJJIIJ;
            if (hdi4 != null) {
                hdi4.f6685LJ = false;
            }
            LJFF().LJIIJ();
        }
    }

    private final void LJJJIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 56).isSupported) {
            return;
        }
        String str = C79007HCn.LJII().LJII;
        StringBuilder sb = new StringBuilder("livecore version ");
        IService service = ServiceManager.getService(IBroadcastService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        sb.append(((IBroadcastService) service).getLiveCoreVersion());
        ALogger.m15801d("link_room_fight", sb.toString());
        ALogger.m15801d("link_room_fight", "stopForwardStreamCrossRoom isEngineOn: " + LJIL().LJI + " isForwardCrossRoom: " + LJIL().LJII + " localInfo: " + str);
        if (LJIL().LJI && LJIL().LJII) {
            C78627Gz7.LIZIZ.LIZIZ(str);
            LJIL().LIZLLL(str);
            ALogger.m15801d("link_room_fight", "stopForwardStreamCrossRoom localInfo " + str);
        }
    }

    public final void LJJIJLIJ() {
        C5923dp LJJJI;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 132).isSupported && (LJJJI = LJJJI()) != null) {
            ALogger.m15801d("open_panel_for_schema", "params : openPanelType = " + LJJJI.LLLILZJ().LIZ().intValue() + ", platformActivityId = " + LJJJI.LLLIZZ().LIZ());
            HH8.LIZIZ(LJJJI.LLLILZJ().LIZ().intValue(), LJJJI.LLLIZZ().LIZ());
            int intValue = LJJJI.LLLILZJ().LIZ().intValue();
            if (intValue == OpenPanelType.LINK_METHOD_SETTING_PANEL.value) {
                LJIIIIZZ(LJJJI.LLLIZZ().LIZ());
            } else if (intValue == OpenPanelType.PAID_LINK_SETTING_PANEL.value) {
                LJIIIZ(LJJJI.LLLIZZ().LIZ());
            }
            LJJJI.LLLILZJ().LIZ(Integer.valueOf(OpenPanelType.NONE.value));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: V_ */
    public final void mo15660V_() {
        GuestBattleWidget guestBattleWidget;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 87).isSupported) {
            return;
        }
        super.mo15660V_();
        int i = this.f26462LJ;
        int i2 = this.LJJIFFI;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, HH8.LIZ, true, 226).isSupported) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("switch_to_scene", Integer.valueOf(i));
            linkedHashMap.put("init_scene", Integer.valueOf(i2));
            HH8.LIZ("before_update_livecore_and_rtc_info", (Map) linkedHashMap, false, 4, (Object) null);
        }
        C6307m LJJI = LJJI();
        if (LJJI != null && LJJI.LIZIZ == 16) {
            LJJJJ();
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_GUEST_BATTLE_ANCHOR_EFFECT_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue() && (guestBattleWidget = this.LJJIJIIJIL) != null) {
            guestBattleWidget.LJII();
        }
        if (this.f26462LJ == 12 || this.LJJIFFI == 12) {
            if (this.LJJIFFI == 12) {
                LJIL().LIZ(Config.InteractMode.EQUAL_TALK_ROOM);
                LJIL().LIZ(this.LJJIFFI, "onStartSuccess");
            }
            LJIL().LJI();
            LJII("rtcStartSuccess");
            this.LJJIFFI = 0;
            this.f26462LJ = 0;
        }
        SettingKey<Boolean> settingKey2 = LiveConfigSettingKeys.LIVE_ANCHOR_START_RTC_UPDATE_OPEN;
        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
        if (Intrinsics.areEqual(settingKey2.getValue(), Boolean.TRUE)) {
            this.containerView.post(new RunnableC79095HFx(this));
        }
    }

    private final void LJJJJ() {
        CrossRoomLinkmicRtcInfo crossRoomLinkmicRtcInfo;
        Map<Long, String> map;
        Long l;
        String str;
        Map.Entry LIZ;
        CrossRoomLinkmicRtcInfo crossRoomLinkmicRtcInfo2;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 57).isSupported) {
            return;
        }
        StringBuilder sb = new StringBuilder("livecore version ");
        IService service = ServiceManager.getService(IBroadcastService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        sb.append(((IBroadcastService) service).getLiveCoreVersion());
        ALogger.m15801d("link_room_fight", sb.toString());
        StringBuilder sb2 = new StringBuilder("startForwardStreamToRooms rtcinfo ");
        MultiRtcInfo multiRtcInfo = C79007HCn.LJII().LJIIIZ;
        String str2 = null;
        if (multiRtcInfo != null) {
            crossRoomLinkmicRtcInfo = multiRtcInfo.crossRoomLinkmicRtcInfo;
        } else {
            crossRoomLinkmicRtcInfo = null;
        }
        sb2.append(crossRoomLinkmicRtcInfo);
        ALogger.m15801d("link_room_fight", sb2.toString());
        if (LJIL().LJI && !LJIL().LJII) {
            String str3 = C79007HCn.LJII().LJII;
            MultiRtcInfo multiRtcInfo2 = C79007HCn.LJII().LJIIIZ;
            if (multiRtcInfo2 != null && (crossRoomLinkmicRtcInfo2 = multiRtcInfo2.crossRoomLinkmicRtcInfo) != null) {
                map = crossRoomLinkmicRtcInfo2.getRtcInfoMap();
            } else {
                map = null;
            }
            C79007HCn LJII = C79007HCn.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII, "");
            Map.Entry<Long, RoomLinkerContent> entry = LJII.LJIIJ;
            if (entry != null) {
                l = entry.getKey();
            } else {
                l = null;
            }
            if (map != null && (LIZ = C449933qt.LIZ((Map) map)) != null) {
                str = (String) LIZ.getValue();
            } else {
                str = null;
            }
            ALogger.m15801d("link_room_fight", "startForwardStreamToRooms roomId " + l + " localRtc " + str3 + " remoteInfo " + str);
            C78627Gz7 c78627Gz7 = C78627Gz7.LIZIZ;
            if (l != null) {
                str2 = String.valueOf(l.longValue());
            }
            c78627Gz7.LIZIZ(str2, str3, str);
            if (l != null && l.longValue() > 0 && str3 != null && str != null) {
                LJIL().LJII();
                ALogger.m15801d("link_room_fight", "startForwardStreamToRooms result " + LJIL().LIZ(String.valueOf(l.longValue()), str3, str));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p350d.e$a
    public final int LIZ() {
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ2;
        C6307m LIZIZ3;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 29);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (LJJIL().LJFF()) {
            return LJJIL().LIZLLL;
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJJZZIII = LJJJI.LJJZZIII()) != null && (LIZIZ2 = LJJZZIII.LIZIZ()) != null && (LIZIZ3 = LIZIZ2.LIZIZ()) != null) {
            if (LIZIZ3.LIZIZ == 12) {
                if (LIZIZ3.LIZLLL == 10) {
                    return 18;
                }
                return 9;
            } else if (LIZIZ3.LIZIZ == 8) {
                return 8;
            } else {
                if (LIZIZ3.LIZIZ != 13 && LIZIZ3.LIZIZ == 16) {
                    return 17;
                }
            }
        }
        return 10;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        AbstractC413392Xt<C6305j> LJJJJZ;
        C6305j LIZIZ2;
        C2WD<List<C6092ad.C6093a>> LJL;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ3;
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        C5923dp LIZ;
        AbstractC413392Xt<C6305j> LJJJJZ2;
        C6305j LIZIZ4;
        AbstractC413392Xt<C6305j> LJJJJZ3;
        C6305j LIZIZ5;
        AbstractC413392Xt<C6305j> LJJJJZ4;
        C6305j LIZIZ6;
        AbstractC413392Xt<C6305j> LJJJJZ5;
        C6305j LIZIZ7;
        LayerEventDispatcher LIZ2;
        String str5;
        String str6;
        CircleInfo circleInfo;
        String str7;
        AbstractC413392Xt<IMessageManager> LJIILLIIL;
        IMessageManager LIZIZ8;
        MethodCollector.m14708i(2064);
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 98).isSupported) {
            MethodCollector.m14707o(2064);
            return;
        }
        super.onDestroy();
        C78395GvN c78395GvN = this.LJJJIL;
        if (c78395GvN != null) {
            c78395GvN.LIZIZ();
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJIILLIIL = LJJJI.LJIILLIIL()) != null && (LIZIZ8 = LJIILLIIL.LIZIZ()) != null) {
            LIZIZ8.removeMessageListener(this);
        }
        this.LJIJ.clear();
        this.LJJJJIZL.clear();
        HAY hay = this.LJJIJIIJI;
        if (hay != null) {
            hay.LIZLLL();
        }
        HKI hki = this.LJJIIJZLJL;
        if (hki != null) {
            hki.LIZ();
        }
        AbstractC4964m abstractC4964m = this.LJIIL;
        if (abstractC4964m == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC4964m.LJI();
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        C78828H5q.LIZ((String) null, (String) null, "layout_type_close", 3, (Object) null);
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 99).isSupported) {
            HashMap hashMap = new HashMap();
            hashMap.put("live_type", "video_live");
            C78828H5q.LIZIZ(hashMap, Integer.valueOf(LJJIZ()), (Integer) null, 4, (Object) null);
            C78828H5q.LIZIZ(hashMap);
            C78828H5q.LIZ(hashMap);
            C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f6959N;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            Boolean LIZ3 = c87308Kak.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
            String str8 = "on";
            if (!LIZ3.booleanValue()) {
                str = "off";
            } else {
                str = str8;
            }
            hashMap.put("is_camera_allow", str);
            hashMap.put("duration", String.valueOf((System.currentTimeMillis() - this.LJJIII) / 1000));
            int i2 = this.LJFF;
            if (i2 != 0) {
                i = i2 - 1;
            } else {
                i = 0;
            }
            hashMap.put("connect_pcu", String.valueOf(i));
            Object obj = this.dataCenter.get("data_big_party_support_send_gift_to_linker", (String) Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            if (!((Boolean) obj).booleanValue()) {
                str2 = "off";
            } else {
                str2 = str8;
            }
            hashMap.put("gift_guest_switch_type", str2);
            hashMap.put("send_gift_scene", "video_audience_multi");
            Object obj2 = "null";
            hashMap.put("shoot_way", obj2);
            C78828H5q.LIZIZ((Map<String, String>) hashMap, true);
            LJJIFFI();
            AbstractC8644i LIZ4 = C4574547f.LIZ().LIZ(C8668v.class);
            if ((LIZ4 instanceof C81173Hz5) && ((C81173Hz5) LIZ4).LJIILJJIL) {
                hashMap.put("is_continue", "continue");
            }
            if (this.LJIL) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            hashMap.put("is_avatar_used", str3);
            Room LJIJI = LJIJI();
            if (LJIJI != null && (circleInfo = LJIJI.circleInfo) != null && (str7 = circleInfo.circleName) != null) {
                hashMap.put("circle_name", str7);
            }
            if (!this.LIZLLL) {
                obj2 = this.dataCenter.get("data_room_shoot_way_exact", (String) obj2);
                Intrinsics.checkNotNullExpressionValue(obj2, "");
            }
            hashMap.put("shoot_way", obj2);
            boolean LJJJJIZL = LJJJJIZL();
            int LJJIZ = LJJIZ();
            if (LJJIZ != 8) {
                if (LJJIZ != 12) {
                    if (LJJIZ == 13) {
                        hashMap.put("function_type", "ktv");
                    }
                } else {
                    hashMap.put("function_type", "party");
                    if (!LJJJJIZL) {
                        str6 = "off";
                    } else {
                        str6 = str8;
                    }
                    hashMap.put("seat_fit_status", str6);
                }
            } else {
                hashMap.put("function_type", "radio");
            }
            C78828H5q.LIZJ(hashMap, Integer.valueOf(C79242HLo.LJIIJ()));
            hashMap.put("over_path", "live_over");
            BidLinkMicWidget bidLinkMicWidget = this.LJIILLIIL;
            if (bidLinkMicWidget == null || !bidLinkMicWidget.LIZJ) {
                str4 = "off";
            } else {
                str4 = str8;
            }
            hashMap.put("auction_mode_status", str4);
            DataCenter dataCenter = this.dataCenter;
            if (dataCenter != null && (str5 = (String) dataCenter.get("data_room_video_talk_log_over_for_over_path", "")) != null && !TextUtils.isEmpty(str5)) {
                hashMap.put("over_path", str5);
                this.dataCenter.put("data_room_video_talk_log_over_for_over_path", "");
            }
            Integer num = (Integer) this.dataCenter.get("data_ktv_mode_before_close", (String) (-1));
            if (num != null && num.intValue() == -1) {
                hashMap.put("play_mode", C78656Gza.LIZ());
            } else {
                int LJJJJI = LJJJJI();
                C5923dp LIZ5 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                if (LIZ5 != null && (LJJJJZ5 = LIZ5.LJJJJZ()) != null && (LIZIZ7 = LJJJJZ5.LIZIZ()) != null) {
                    LIZIZ7.LIZ(LJJJJI);
                }
                C5923dp LIZ6 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                if (LIZ6 != null && (LJJJJZ4 = LIZ6.LJJJJZ()) != null && (LIZIZ6 = LJJJJZ4.LIZIZ()) != null) {
                    Object obj3 = this.dataCenter.get("data_ktv_mode_before_close", (String) (-1));
                    Intrinsics.checkNotNullExpressionValue(obj3, "");
                    LIZIZ6.LIZIZ(((Number) obj3).intValue());
                }
                hashMap.put("play_mode", C78656Gza.LIZ());
                C5923dp LIZ7 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                if (LIZ7 != null && (LJJJJZ3 = LIZ7.LJJJJZ()) != null && (LIZIZ5 = LJJJJZ3.LIZIZ()) != null) {
                    Object obj4 = this.dataCenter.get("data_ktv_mode_before_close", (String) (-1));
                    Intrinsics.checkNotNullExpressionValue(obj4, "");
                    LIZIZ5.LIZ(((Number) obj4).intValue());
                }
                if (LJJJJI != -1 && (LIZ = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null)) != null && (LJJJJZ2 = LIZ.LJJJJZ()) != null && (LIZIZ4 = LJJJJZ2.LIZIZ()) != null) {
                    LIZIZ4.LIZIZ(LJJJJI);
                }
                this.dataCenter.put("data_ktv_mode_before_close", -1);
            }
            if (!C4284f.LJIIIIZZ.LIZIZ().LIZLLL) {
                str8 = "off";
            }
            hashMap.put("rechargeable_mode_status", str8);
            C4574547f.LIZ().LIZ("livesdk_anchor_audience_connection_over", hashMap, Room.class);
            if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 100).isSupported) {
                SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_ENABLE_ANCHOR_MUTE_SELF;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue() && (LIZ2 = C411622Qy.LIZ(Integer.valueOf(this.dataCenter.hashCode()))) != null) {
                    LIZ2.LIZ(new C2RL(false));
                }
            }
        }
        Disposable disposable = this.LJIILJJIL;
        if (disposable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        disposable.dispose();
        Disposable disposable2 = this.LJIILL;
        if (disposable2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        disposable2.dispose();
        this.LJIIZILJ.LIZIZ();
        C79220HKs c79220HKs = this.LJJIIZI;
        if (c79220HKs != null && c79220HKs.LJIILIIL()) {
            c79220HKs.dismiss();
        }
        this.dataCenter.put("data_self_is_silenced", Boolean.FALSE);
        this.dataCenter.removeObserver(this);
        if (!PatchProxy.proxy(new Object[]{1}, this, LIZIZ, false, 111).isSupported) {
            this.dataCenter.put("cmd_video_talkroom_state_change", new C6008ch(1));
        }
        C79046HEa.LIZ().LIZ((Integer) 0);
        this.LJJII.dispose();
        C5923dp LJJJI2 = LJJJI();
        if (LJJJI2 != null && (LJJZZIII = LJJJI2.LJJZZIII()) != null && (LIZIZ3 = LJJZZIII.LIZIZ()) != null) {
            LIZIZ3.LJIIJ();
        }
        C5923dp LJJJI3 = LJJJI();
        if (LJJJI3 != null && (LJL = LJJJI3.LJL()) != null) {
            LJL.LIZ(null);
        }
        HDI hdi = this.LJJIIJ;
        if (hdi != null) {
            hdi.LIZJ();
        }
        C79004HCk c79004HCk = this.LJIJJLI;
        if (c79004HCk == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c79004HCk.LIZIZ();
        C5923dp LIZ8 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ8 != null && (LJJJJZ = LIZ8.LJJJJZ()) != null && (LIZIZ2 = LJJJJZ.LIZIZ()) != null) {
            LIZIZ2.LIZJ();
        }
        C79108HGk.LIZ();
        MethodCollector.m14707o(2064);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        C2WC<Integer> ktvPlayModeChangedObservable;
        Observable<Integer> LIZIZ2;
        Disposable subscribe;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ3;
        Observable<C6307m> mo15536LJ;
        Disposable subscribe2;
        AbstractC413392Xt<IMessageManager> LJIILLIIL;
        C2WD<DataCenter> LLJILLL;
        DataCenter LIZ;
        LinkInitResult linkInitResult;
        C2WC<Boolean> LJFF;
        Observable<Boolean> LIZIZ4;
        AbstractC81278I1w abstractC81278I1w;
        DataCenter dataCenter;
        Boolean bool;
        C2WC<Boolean> currentIsSinger;
        Observable<Boolean> LIZIZ5;
        Disposable subscribe3;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII2;
        AbstractC6302f LIZIZ6;
        C6307m LIZIZ7;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII3;
        AbstractC6302f LIZIZ8;
        C6307m LIZIZ9;
        Observable<Boolean> LIZIZ10;
        Disposable subscribe4;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII4;
        AbstractC6302f LIZIZ11;
        Observable<C6307m> mo15536LJ2;
        Disposable subscribe5;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 10).isSupported) {
            return;
        }
        super.onCreate();
        this.LJIIJJI.LIZJ(8);
        Pair LIZ2 = IQV.LIZ((Function0) VideoTalkRoomAnchorWidget$onCreate$pair$1.INSTANCE);
        ((C4930f) LIZ2.getFirst()).LIZ().LIZIZ(this);
        IQX.LIZ((C13491f) LIZ2.getFirst(), "anchor_video_talk");
        this.LJIILJJIL = (Disposable) LIZ2.getSecond();
        DataCenter dataCenter2 = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter2, "");
        ViewGroup viewGroup = this.containerView;
        Intrinsics.checkNotNullExpressionValue(viewGroup, "");
        this.LJIJJLI = new C79004HCk(dataCenter2, viewGroup, LJJJI(), this);
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 15).isSupported) {
            C79004HCk c79004HCk = this.LJIJJLI;
            if (c79004HCk == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c79004HCk.LIZ(C79075HFd.LJII, new VideoTalkRoomAnchorWidget$registerWindowMangers$1(this));
            C79004HCk c79004HCk2 = this.LJIJJLI;
            if (c79004HCk2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c79004HCk2.LIZ(C79074HFc.LJII, new VideoTalkRoomAnchorWidget$registerWindowMangers$2(this));
            C79004HCk c79004HCk3 = this.LJIJJLI;
            if (c79004HCk3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c79004HCk3.LIZ(C79073HFb.LJII, new VideoTalkRoomAnchorWidget$registerWindowMangers$3(this));
            C79004HCk c79004HCk4 = this.LJIJJLI;
            if (c79004HCk4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c79004HCk4.LIZ(C79086HFo.LJII, new VideoTalkRoomAnchorWidget$registerWindowMangers$4(this));
            C79004HCk c79004HCk5 = this.LJIJJLI;
            if (c79004HCk5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c79004HCk5.LIZ(C79084HFm.LJII, new VideoTalkRoomAnchorWidget$registerWindowMangers$5(this));
            C79004HCk c79004HCk6 = this.LJIJJLI;
            if (c79004HCk6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c79004HCk6.LIZ(C79078HFg.LJII, new VideoTalkRoomAnchorWidget$registerWindowMangers$6(this));
            C79004HCk c79004HCk7 = this.LJIJJLI;
            if (c79004HCk7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c79004HCk7.LIZ(C79077HFf.LJII, new VideoTalkRoomAnchorWidget$registerWindowMangers$7(this));
            C79004HCk c79004HCk8 = this.LJIJJLI;
            if (c79004HCk8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c79004HCk8.LIZ(C79076HFe.LJII, new VideoTalkRoomAnchorWidget$registerWindowMangers$8(this));
            C79004HCk c79004HCk9 = this.LJIJJLI;
            if (c79004HCk9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c79004HCk9.LIZ(C79079HFh.LJII, new VideoTalkRoomAnchorWidget$registerWindowMangers$9(this));
            C79004HCk c79004HCk10 = this.LJIJJLI;
            if (c79004HCk10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c79004HCk10.LIZ(C79085HFn.LJII, new VideoTalkRoomAnchorWidget$registerWindowMangers$10(this));
            C79004HCk c79004HCk11 = this.LJIJJLI;
            if (c79004HCk11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c79004HCk11.LIZ(HFZ.LJII, new VideoTalkRoomAnchorWidget$registerWindowMangers$11(this));
            C79004HCk c79004HCk12 = this.LJIJJLI;
            if (c79004HCk12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c79004HCk12.LIZ(C79083HFl.LJII, new VideoTalkRoomAnchorWidget$registerWindowMangers$12(this));
        }
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        DataCenter dataCenter3 = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter3, "");
        this.LJJIJIIJI = new HAY(context, dataCenter3, this.LJIILIIL, this);
        HAY hay = this.LJJIJIIJI;
        if (hay != null) {
            hay.LIZJ();
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 77).isSupported) {
            if (this.LJJIJIIJIL == null) {
                SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_VIDEO_GUEST_BATTLE_OPEN;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue()) {
                    enableSubWidgetManager();
                    this.LJJIJIIJIL = new GuestBattleWidget();
                    this.subWidgetManager.load(this.LJJIJIIJIL);
                }
            }
            if (this.LJJIJL == null) {
                enableSubWidgetManager();
                this.LJJIJL = new VideoTeamFightWidget();
                this.subWidgetManager.load(this.LJJIJL);
            }
            if (this.LJJIJLIJ == null) {
                enableSubWidgetManager();
                this.LJJIJLIJ = new VideoLinkRoomFightWidget();
                this.subWidgetManager.load(this.LJJIJLIJ);
            }
            if (this.LJJIL == null) {
                enableSubWidgetManager();
                this.LJJIL = new VideoPaidLinkWidget();
                this.subWidgetManager.load(this.LJJIL);
            }
            if (this.LJIILLIIL == null && C4378a.LJJIJIL.LIZJ()) {
                enableSubWidgetManager();
                this.LJIILLIIL = new BidLinkMicWidget();
                this.subWidgetManager.load(this.LJIILLIIL);
            }
            if (this.LJJJ == null) {
                enableSubWidgetManager();
                this.LJJJ = new DoublePkBusinessWidget();
                this.subWidgetManager.load(this.LJJJ);
            }
            if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 78).isSupported && C4949a.f26454LJ.m23775LJ() && this.LJJIZ == null) {
                enableSubWidgetManager();
                this.LJJIZ = new SelfDisciplineWidget();
                this.subWidgetManager.load(this.LJJIZ);
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 79).isSupported && this.LJJIJIL == null) {
            enableSubWidgetManager();
            this.LJJIJIL = new QuickInteractWidget();
            this.subWidgetManager.load(this.LJJIJIL);
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJJZZIII4 = LJJJI.LJJZZIII()) != null && (LIZIZ11 = LJJZZIII4.LIZIZ()) != null && (mo15536LJ2 = LIZIZ11.mo15536LJ()) != null && (subscribe5 = mo15536LJ2.subscribe(new C78379Gv7(this))) != null) {
            QB4.LIZ(subscribe5, this.LJJII);
        }
        C2WC<Boolean> currentIsMultipleKtvModeObservable = ((IKtvService) ServiceManager.getService(IKtvService.class)).getCurrentIsMultipleKtvModeObservable();
        if (currentIsMultipleKtvModeObservable != null && (LIZIZ10 = currentIsMultipleKtvModeObservable.LIZIZ()) != null && (subscribe4 = LIZIZ10.subscribe(new HG4(new VideoTalkRoomAnchorWidget$onCreate$2(this)))) != null) {
            this.LJJII.add(subscribe4);
        }
        C5923dp LJJJI2 = LJJJI();
        if (LJJJI2 != null && (LJJZZIII3 = LJJJI2.LJJZZIII()) != null && (LIZIZ8 = LJJZZIII3.LIZIZ()) != null && (LIZIZ9 = LIZIZ8.LIZIZ()) != null) {
            C79004HCk c79004HCk13 = this.LJIJJLI;
            if (c79004HCk13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c79004HCk13.LIZ(new HEN(LIZIZ9.LIZIZ, LIZIZ9.LIZLLL));
            if (LIZIZ9.LIZIZ == 12) {
                this.LJIIJJI.LIZJ(12);
                this.LJJIFFI = 12;
            } else if (LIZIZ9.LIZIZ == 8) {
                this.LJJIFFI = 8;
            }
            LJIJJ().LIZIZ();
        }
        LJJJ();
        this.LJJIIJ = new HDI(LJIJI(), true, this.dataCenter);
        HDI hdi = this.LJJIIJ;
        if (hdi != null) {
            hdi.LIZ((a$a) this);
        }
        C5923dp LJJJI3 = LJJJI();
        if (LJJJI3 != null && (LJJZZIII2 = LJJJI3.LJJZZIII()) != null && (LIZIZ6 = LJJZZIII2.LIZIZ()) != null && (LIZIZ7 = LIZIZ6.LIZIZ()) != null) {
            AbstractC8644i LIZ3 = C4574547f.LIZ().LIZ(C8668v.class);
            if (LIZIZ7.LIZIZ == 13) {
                C88440Kt0.LIZ(2131585434);
            } else {
                if (this.LJJJJLL) {
                    Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                    if (Intrinsics.areEqual("convenient_page_ktv", LIZ3.LIZ().get("enter_method"))) {
                        this.LJJJJLL = false;
                    }
                }
                C88440Kt0.LIZ(2131585436);
            }
        }
        LJFF().LIZ(this.LJJJLIIL);
        this.LJIIZILJ.LIZ();
        this.LJJIII = System.currentTimeMillis();
        this.dataCenter.observe("cmd_video_talk_invite", this);
        this.dataCenter.observe("cmd_video_talk_guest_battle_open_panel", this);
        this.dataCenter.observe("cmd_open_paid_link_setting_panel_after_fetch_audience_setting", this);
        Disposable subscribe6 = C7HK.LIZIZ.LIZ(1L, 1L, TimeUnit.MINUTES).subscribe(new C78363Gur(this));
        Intrinsics.checkNotNullExpressionValue(subscribe6, "");
        this.LJIILL = subscribe6;
        if (LJJJI() != null && (currentIsSinger = ((IKtvService) ServiceManager.getService(IKtvService.class)).getCurrentIsSinger()) != null && (LIZIZ5 = currentIsSinger.LIZIZ()) != null && (subscribe3 = LIZIZ5.subscribe(new HF9(this))) != null) {
            QB4.LIZ(subscribe3, this.LJJII);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 21).isSupported) {
            SettingKey<Boolean> settingKey2 = LiveSettingKeys.LIVE_BIG_PARTY_ENABLE_FAST_MATCH;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            if (settingKey2.getValue().booleanValue() && this.LJJJJJL == null) {
                enableSubWidgetManager();
                this.LJJJJJL = new ChatMatchWidget(false, 1);
                this.subWidgetManager.load(this.LJJJJJL);
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 117).isSupported && (dataCenter = this.dataCenter) != null && (bool = (Boolean) dataCenter.get("data_need_restore_video_interact", (String) Boolean.FALSE)) != null && bool.booleanValue()) {
            SettingKey<Boolean> settingKey3 = LiveSettingKeys.LIVE_INTIMATE_CHAT_USE_NEW_PANEL;
            Intrinsics.checkNotNullExpressionValue(settingKey3, "");
            Boolean value2 = settingKey3.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "");
            if (value2.booleanValue()) {
                HashMap hashMap = new HashMap();
                hashMap.put("scene", 4);
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", 8);
                jSONObject.put("value", 1);
                jSONArray.put(jSONObject);
                hashMap.put("incremental_update", jSONArray);
                ((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).updateSetting(LJIJI().getId(), hashMap).compose(C100839PnV.LIZJ()).subscribe(new C81280I1y());
                ALogger.m15797i("ttlive_link", "update setting when finish");
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 20).isSupported) {
            enableSubWidgetManager();
            this.LJJJJL = new VideoDigitAvatarWidget();
            this.subWidgetManager.load(this.LJJJJL);
            C4382d LIZ4 = C4382d.LIZLLL.LIZ();
            if (LIZ4 != null && (LJFF = LIZ4.LJFF()) != null && (LIZIZ4 = LJFF.LIZIZ()) != null && (abstractC81278I1w = (AbstractC81278I1w) LIZIZ4.m151as(C148062fT6.LIZ(this))) != null) {
                abstractC81278I1w.LIZ(new HF2(this), HFS.LIZ);
            }
        }
        C5923dp LJJJI4 = LJJJI();
        if (LJJJI4 != null) {
            if (LJJJI4.LLLILZJ().LIZ().intValue() == OpenPanelType.NONE.value && LJJJI4.LLLILZLLLI().LIZ().intValue() != 10 && !PatchProxy.proxy(new Object[0], this, LIZIZ, false, 130).isSupported && C78883H7t.LIZIZ.LIZJ(LJIJI())) {
                Room LJIJI = LJIJI();
                if (LJIJI != null && (linkInitResult = LJIJI.linkInitResult) != null && linkInitResult.LJIIZILJ) {
                    Context context2 = this.context;
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    DataCenter dataCenter4 = this.dataCenter;
                    Intrinsics.checkNotNullExpressionValue(dataCenter4, "");
                    C116971W2r.LIZJ(new DialogC77857Gmh(context2, dataCenter4));
                } else {
                    LIZ(0, "integration", -1, (String) null);
                }
            }
            if (LJJJI4.LLLILZLLLI().LIZ().intValue() == 10) {
                AbstractC8644i LIZ5 = C4574547f.LIZ().LIZ(C8668v.class);
                C5923dp LIZ6 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                if (LIZ6 != null && (LLJILLL = LIZ6.LLJILLL()) != null && (LIZ = LLJILLL.LIZ()) != null) {
                    Boolean bool2 = Boolean.TRUE;
                    Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                    LIZ.put("cmd_open_ktv_component_with_link_check", new Pair(bool2, LIZ5.LIZ().get("enter_method")));
                }
            }
        }
        AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs = this.LJIILIIL;
        if (abstractC78986HBs != null) {
            this.LJJJIL = new C78395GvN(abstractC78986HBs, true);
        }
        C5923dp LJJJI5 = LJJJI();
        if (LJJJI5 != null && (LJIILLIIL = LJJJI5.LJIILLIIL()) != null) {
            LJIILLIIL.LIZ(new VideoTalkRoomAnchorWidget$onCreate$10(this));
        }
        LIZLLL(C4201f.class);
        LIZLLL(C5986ap.class);
        C5923dp LJJJI6 = LJJJI();
        if (LJJJI6 != null && (LJJZZIII = LJJJI6.LJJZZIII()) != null && (LIZIZ3 = LJJZZIII.LIZIZ()) != null && (mo15536LJ = LIZIZ3.mo15536LJ()) != null && (subscribe2 = mo15536LJ.subscribe(new C79069HEx(this))) != null) {
            QB4.LIZ(subscribe2, this.LJJII);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 11).isSupported && (ktvPlayModeChangedObservable = ((IKtvService) ServiceManager.getService(IKtvService.class)).getKtvPlayModeChangedObservable()) != null && (LIZIZ2 = ktvPlayModeChangedObservable.LIZIZ()) != null && (subscribe = LIZIZ2.subscribe(new HE9(this))) != null) {
            QB4.LIZ(subscribe, this.LJJII);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final void LIZIZ(long j) {
        this.LJJJLZIJ = 0L;
    }

    public static final /* synthetic */ AbstractC4964m LIZ(VideoTalkRoomAnchorWidget videoTalkRoomAnchorWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{videoTalkRoomAnchorWidget}, null, LIZIZ, true, 139);
        if (proxy.isSupported) {
            return (AbstractC4964m) proxy.result;
        }
        AbstractC4964m abstractC4964m = videoTalkRoomAnchorWidget.LJIIL;
        if (abstractC4964m == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC4964m;
    }

    private final <T> void LIZLLL(Class<T> cls) {
        if (PatchProxy.proxy(new Object[]{cls}, this, LIZIZ, false, 12).isSupported) {
            return;
        }
        this.LJJII.add(C87010KQi.LIZ().LIZ((Class) cls).subscribe(new C79056HEk(this)));
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p350d.e$a
    public final int LIZJ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 109);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC4964m abstractC4964m = this.LJIIL;
        if (abstractC4964m == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC4964m.LIZLLL(str);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: f_ */
    public final void mo15657f_(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 92).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        super.mo15657f_(str);
        AbstractC4964m abstractC4964m = this.LJIIL;
        if (abstractC4964m == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            abstractC4964m.LIZIZ(str);
        }
    }

    public final void onEvent(C4201f c4201f) {
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{c4201f}, this, LIZIZ, false, 13).isSupported) {
            return;
        }
        if (c4201f.LIZ == ReleaseStatus.End && this.LJJJJZI) {
            LIZIZ(true, "onResume");
            this.LJJ.setAudioMute(false);
            this.LJJJJZI = false;
        }
        if (c4201f.LIZ != ReleaseStatus.End) {
            z = false;
        }
        this.LJJJJZ = z;
    }

    private final void LIZIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 113).isSupported) {
            return;
        }
        if (z) {
            if (this.LJJIIZ == null) {
                this.LJJIIZ = new v$a(getContext(), 2).LIZLLL(2131585443).LIZLLL();
            }
            DialogC88906L1g dialogC88906L1g = this.LJJIIZ;
            if (dialogC88906L1g != null && !dialogC88906L1g.isShowing()) {
                C116971W2r.LIZJ(dialogC88906L1g);
                return;
            }
            return;
        }
        DialogC88906L1g dialogC88906L1g2 = this.LJJIIZ;
        if (dialogC88906L1g2 != null && dialogC88906L1g2.isShowing()) {
            C116971W2r.LIZ(dialogC88906L1g2);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final void LIZJ(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZIZ, false, 81).isSupported) {
            return;
        }
        AbstractC4964m abstractC4964m = this.LJIIL;
        if (abstractC4964m == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (abstractC4964m instanceof AbstractC80636HqQ) {
            AbstractC4964m abstractC4964m2 = this.LJIIL;
            if (abstractC4964m2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.videotalk.ui.BaseEqualTalkRoomWindowManager");
            }
            ((AbstractC80636HqQ) abstractC4964m2).LIZJ(j);
        }
        AbstractC4964m abstractC4964m3 = this.LJIIL;
        if (abstractC4964m3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (abstractC4964m3 instanceof C80607Hpx) {
            AbstractC4964m abstractC4964m4 = this.LJIIL;
            if (abstractC4964m4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.linkroomfight.ui.LinkRoomFightWindowManager");
            }
            ((C80607Hpx) abstractC4964m4).LIZIZ(j);
        }
        AbstractC4964m abstractC4964m5 = this.LJIIL;
        if (abstractC4964m5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (abstractC4964m5 instanceof C80630HqK) {
            AbstractC4964m abstractC4964m6 = this.LJIIL;
            if (abstractC4964m6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.videotalk.ui.VideoDoubleCenterWindowManager");
            } else {
                ((C80630HqK) abstractC4964m6).LIZIZ(j);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4797h
    /* renamed from: LJ */
    public final void mo15670LJ(long j) {
        LinkPlayerInfo LIZ;
        User LIZ2;
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZIZ, false, 84).isSupported) {
            return;
        }
        super.mo15670LJ(j);
        this.LJJJLL = false;
        this.LJJJLZIJ = j;
        IInteractService iInteractService = (IInteractService) ServiceManager.getService(IInteractService.class);
        if (iInteractService != null && iInteractService.isAnonymousUser(Long.valueOf(j))) {
            C88440Kt0.LIZ(LK5.LIZ(2131585437));
            return;
        }
        Object[] objArr = new Object[1];
        AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs = this.LJIILIIL;
        String str = null;
        if (abstractC78986HBs != null && (LIZ = abstractC78986HBs.LIZ(j, abstractC78986HBs.LIZIZ(j))) != null && (LIZ2 = LIZ.LIZ()) != null) {
            str = LIZ2.getNickName();
        }
        objArr[0] = LinkPlayerInfo.LIZ(str);
        C88440Kt0.LIZ(LK5.LIZ(2131585493, objArr));
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final void LJFF(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, OpenAuthTask.f22015g).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        C78336GuQ.LIZ(this, 0, str, 0, (String) null, 12, (Object) null);
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m.AbstractC4965a
    public final ILayerControl.ILayer LJI(String str) {
        ILayerControl layerControl;
        ILayerControl layerControl2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 118);
        if (proxy.isSupported) {
            return (ILayerControl.ILayer) proxy.result;
        }
        C79007HCn LJII = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        if (TextUtils.equals(str, LJII.LIZIZ())) {
            LiveCore LJJIJIL = LJJIJIL();
            if (LJJIJIL == null || (layerControl2 = LJJIJIL.getLayerControl()) == null) {
                return null;
            }
            return layerControl2.getLocalOriginLayer();
        }
        LiveCore LJJIJIL2 = LJJIJIL();
        if (LJJIJIL2 == null || (layerControl = LJJIJIL2.getLayerControl()) == null) {
            return null;
        }
        return layerControl.getLayer(str);
    }

    public final void onEvent(C5986ap c5986ap) {
        if (!PatchProxy.proxy(new Object[]{c5986ap}, this, LIZIZ, false, 14).isSupported && c5986ap.LIZ == 3) {
            Observable.timer(500L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new HFF(this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.Object] */
    private final void LJIIIIZZ(String str) {
        boolean z;
        Boolean bool;
        C2WD<List<C6092ad.C6093a>> LJL;
        ?? LIZ;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 133).isSupported) {
            return;
        }
        if (C78883H7t.LIZIZ.LIZJ(LJIJI())) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            C5923dp LIZ2 = C5923dp.LJIIJ.LIZ(this.dataCenter, LJIJI().getRoomId());
            if (LIZ2 != null && (LJL = LIZ2.LJL()) != null && (LIZ = LJL.LIZ()) != 0) {
                objectRef.element = LIZ;
                Context context = this.context;
                Intrinsics.checkNotNullExpressionValue(context, "");
                Room LJIJI = LJIJI();
                DataCenter dataCenter = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter, "");
                C116971W2r.LIZJ(new DialogC77827GmD(context, LJIJI, dataCenter, (List) objectRef.element, str, 1));
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.LJJII.add(((LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class)).interactList(LJIJI().getId()).compose(C100839PnV.LIZJ()).subscribe(new C77834GmK(currentTimeMillis, this, objectRef, str), new C77835GmL<>(currentTimeMillis)));
            return;
        }
        Context context2 = this.context;
        if (context2 != null) {
            Room LJIJI2 = LJIJI();
            FragmentActivity fragmentActivity = (FragmentActivity) context2;
            DataCenter dataCenter2 = this.dataCenter;
            if (dataCenter2 != null && (bool = (Boolean) dataCenter2.get("data_is_portrait", (String) Boolean.TRUE)) != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
            C116971W2r.LIZJ(new DialogC77790Glc(LJIJI2, context2, fragmentActivity, true, z, -1, this.dataCenter, false, 128));
        }
    }

    private final void LJIIIZ(String str) {
        C2WC<Integer> LLLILZJ;
        boolean z;
        Boolean bool;
        C2WC<Integer> LLLILZJ2;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 134).isSupported) {
            return;
        }
        if (C78538Gxg.LJIIIIZZ()) {
            if (C4284f.LJIIIIZZ.LIZ()) {
                VideoPaidLinkWidget videoPaidLinkWidget = this.LJJIL;
                if (videoPaidLinkWidget != null && videoPaidLinkWidget.LIZIZ()) {
                    IService service = ServiceManager.getService(IInteractService.class);
                    Intrinsics.checkNotNullExpressionValue(service, "");
                    ((IInteractService) service).getVideoTalkService().LIZ(this.context, str);
                    return;
                }
                C5923dp LJJJI = LJJJI();
                if (LJJJI != null && (LLLILZJ2 = LJJJI.LLLILZJ()) != null) {
                    LLLILZJ2.LIZ(Integer.valueOf(OpenPanelType.NONE.value));
                    return;
                }
                return;
            }
            Context context = this.context;
            if (context != null) {
                Room LJIJI = LJIJI();
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                DataCenter dataCenter = this.dataCenter;
                if (dataCenter != null && (bool = (Boolean) dataCenter.get("data_is_portrait", (String) Boolean.TRUE)) != null) {
                    z = bool.booleanValue();
                } else {
                    z = true;
                }
                C116971W2r.LIZJ(new DialogC77790Glc(LJIJI, context, fragmentActivity, true, z, -1, this.dataCenter, C78538Gxg.LJI()));
                return;
            }
            return;
        }
        C5923dp LJJJI2 = LJJJI();
        if (LJJJI2 != null && (LLLILZJ = LJJJI2.LLLILZJ()) != null) {
            LLLILZJ.LIZ(Integer.valueOf(OpenPanelType.NONE.value));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final boolean LIZLLL(long j) {
        int i;
        AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs;
        List<LinkPlayerInfo> LIZJ;
        Object obj;
        User LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZIZ, false, 74);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C6307m LJJI = LJJI();
        if (LJJI != null) {
            i = LJJI.LIZLLL;
        } else {
            i = 0;
        }
        if (C78653GzX.LIZ(i) && (abstractC78986HBs = this.LJIILIIL) != null && (LIZJ = abstractC78986HBs.LIZJ()) != null) {
            Iterator<T> it = LIZJ.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((LinkPlayerInfo) obj).LJJJI) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
            if (linkPlayerInfo != null && (LIZ = linkPlayerInfo.LIZ()) != null && LIZ.getId() == j) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    /* renamed from: LJ */
    public final void mo15673LJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 31).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("data_video_talk_dot_with_number_show", "");
        }
        LIZ(this.LJIIJ, str);
        LJJIFFI();
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p387b.a$a
    public final void LJFF(long j) {
        AbstractC78986HBs<LinkPlayerInfo> LIZLLL;
        User LIZ;
        if (!PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZIZ, false, 102).isSupported && ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ() != j && (LIZLLL = LIZLLL()) != null && (LIZ = LIZLLL.LIZ(j)) != null) {
            if (!TextUtils.isEmpty(LIZ.getNickName()) && LIZ.getNickName().length() > 10) {
                new StringBuilder();
                C88440Kt0.LIZ(LK5.LIZ(2131588248, C0002O.m25086C(LIZ.getNickName().subSequence(0, 10).toString(), "...")));
                return;
            }
            C88440Kt0.LIZ(LK5.LIZ(2131588248, LIZ.getNickName()));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p387b.a$a
    public final void LJI(long j) {
        User LIZ;
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZIZ, false, 104).isSupported) {
            return;
        }
        if (((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ() == j) {
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_ANCHOR_AUDIO_SWITCH_OPTIMIZE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                HHA.LIZ(LJIL(), true, null, 2, null);
                return;
            }
            return;
        }
        AbstractC78986HBs<LinkPlayerInfo> LIZLLL = LIZLLL();
        if (LIZLLL != null && (LIZ = LIZLLL.LIZ(j)) != null) {
            if (!TextUtils.isEmpty(LIZ.getNickName()) && LIZ.getNickName().length() > 10) {
                new StringBuilder();
                C88440Kt0.LIZ(LK5.LIZ(2131588255, C0002O.m25086C(LIZ.getNickName().subSequence(0, 10).toString(), "...")));
                return;
            }
            C88440Kt0.LIZ(LK5.LIZ(2131588255, LIZ.getNickName()));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    /* renamed from: a_ */
    public final void mo15672a_(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LIZIZ, false, 59).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        int i = c8854es.LJJJJ;
        int i2 = c8854es.LJJJJJL;
        C6152aj c6152aj = new C6152aj();
        c6152aj.LJIIL = c8854es.LIZ();
        c6152aj.LJI = c8854es.LJJJJJ;
        c6152aj.LJIILIIL = c8854es.LJJJJJL;
        c6152aj.LJII = c8854es.LJJJJL;
        c6152aj.LJIIIZ = c8854es.LJJL;
        c6152aj.f26891LJ = c8854es.LJJIJIIJI;
        c6152aj.LIZLLL = c8854es.LJJIJ;
        c6152aj.LIZJ = c8854es.LJJIJIIJIL;
        c6152aj.LIZIZ = c8854es.LJJIIZI;
        c6152aj.LJIIIIZZ = c8854es.LJJLIIIJJIZ;
        C79004HCk c79004HCk = this.LJIJJLI;
        if (c79004HCk == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (c79004HCk.LIZ(i, i2)) {
            List<AnchorLinkUser> list = c8854es.LJJJJL;
            if (list != null) {
                LJFF().LIZ(list, c8854es.LJJL, "switchSceneMsg");
                LIZ(c6152aj.f26891LJ, c6152aj.LIZLLL, c6152aj.LIZJ, c6152aj.LIZIZ);
                LJII("");
            }
            ALogger.m15795w("ttlive_link_video", "onSwitchSceneMessage already same layout, current=" + LJJIL() + LoggerUtil.BLANK_TAG + LJJI());
        } else if (!PatchProxy.proxy(new Object[]{this, c6152aj, "switchSceneMsg", null, 4, null}, null, LIZIZ, true, 61).isSupported) {
            LIZ(c6152aj, "switchSceneMsg", (String) null);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        String str;
        String str2;
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZIZ, false, 114).isSupported) {
            String str3 = null;
            if (kVData2 != null) {
                str = kVData2.getKey();
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str, "cmd_video_talk_invite")) {
                User user = (User) kVData2.getData();
                if (user != null) {
                    LIZ(new HAA(LJIJI(), user, -1));
                    C78828H5q.LIZ("anchor", user.getId(), "card", 0, 8, (Object) null);
                    return;
                }
                return;
            }
            if (kVData2 != null) {
                str2 = kVData2.getKey();
            } else {
                str2 = null;
            }
            if (Intrinsics.areEqual(str2, "cmd_video_talk_guest_battle_open_panel")) {
                if (C4891b.LIZJ.m23816LJ()) {
                    GuestBattleWidget guestBattleWidget = this.LJJIJIIJIL;
                    if (guestBattleWidget != null) {
                        guestBattleWidget.LJIIIZ();
                        return;
                    }
                    return;
                }
                Context context = this.context;
                Intrinsics.checkNotNullExpressionValue(context, "");
                DataCenter dataCenter = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter, "");
                C116971W2r.LIZJ(new DialogC77516GhC(context, dataCenter));
                return;
            }
            if (kVData2 != null) {
                str3 = kVData2.getKey();
            }
            if (Intrinsics.areEqual(str3, "cmd_open_paid_link_setting_panel_after_fetch_audience_setting")) {
                LJIILLIIL();
            }
        }
    }

    public final AbstractC4964m LIZIZ(Class<? extends AbstractC4964m> cls) {
        View findViewById;
        View findViewById2;
        View findViewById3;
        View findViewById4;
        View findViewById5;
        View findViewById6;
        View findViewById7;
        View findViewById8;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, LIZIZ, false, 18);
        if (proxy.isSupported) {
            return (AbstractC4964m) proxy.result;
        }
        if (Intrinsics.areEqual(cls, C80644HqY.class)) {
            View view = this.contentView;
            if (view != null && (findViewById8 = view.findViewById(2131168962)) != null) {
                findViewById8.setVisibility(0);
            }
            View view2 = this.contentView;
            if (view2 != null && (findViewById7 = view2.findViewById(2131168961)) != null) {
                findViewById7.setVisibility(8);
            }
            Room LJIJI = LJIJI();
            View view3 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view3, "");
            View findViewById9 = view3.findViewById(2131168962);
            if (findViewById9 != null) {
                Context context = this.context;
                Intrinsics.checkNotNullExpressionValue(context, "");
                DataCenter dataCenter = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter, "");
                AbstractC5436a abstractC5436a = this.LJJI;
                ViewGroup viewGroup = this.containerView;
                Intrinsics.checkNotNullExpressionValue(viewGroup, "");
                FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(2131197173);
                Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                return new C80644HqY(LJIJI, true, (ConstraintLayout) findViewById9, context, dataCenter, this, this, abstractC5436a, frameLayout);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
        } else if (Intrinsics.areEqual(cls, C80645HqZ.class)) {
            View view4 = this.contentView;
            if (view4 != null && (findViewById6 = view4.findViewById(2131168961)) != null) {
                findViewById6.setVisibility(0);
            }
            View view5 = this.contentView;
            if (view5 != null && (findViewById5 = view5.findViewById(2131168962)) != null) {
                findViewById5.setVisibility(8);
            }
            Room LJIJI2 = LJIJI();
            View view6 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view6, "");
            View findViewById10 = view6.findViewById(2131168961);
            if (findViewById10 != null) {
                Context context2 = this.context;
                Intrinsics.checkNotNullExpressionValue(context2, "");
                DataCenter dataCenter2 = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter2, "");
                AbstractC5436a abstractC5436a2 = this.LJJI;
                ViewGroup viewGroup2 = this.containerView;
                Intrinsics.checkNotNullExpressionValue(viewGroup2, "");
                FrameLayout frameLayout2 = (FrameLayout) viewGroup2.findViewById(2131197173);
                Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
                return new C80645HqZ(LJIJI2, true, (ConstraintLayout) findViewById10, context2, dataCenter2, this, this, abstractC5436a2, frameLayout2);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
        } else if (Intrinsics.areEqual(cls, C79080HFi.class)) {
            View view7 = this.contentView;
            if (view7 != null && (findViewById4 = view7.findViewById(2131168962)) != null) {
                findViewById4.setVisibility(0);
            }
            View view8 = this.contentView;
            if (view8 != null && (findViewById3 = view8.findViewById(2131168961)) != null) {
                findViewById3.setVisibility(8);
            }
            Room LJIJI3 = LJIJI();
            View view9 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view9, "");
            View findViewById11 = view9.findViewById(2131168962);
            if (findViewById11 != null) {
                Context context3 = this.context;
                Intrinsics.checkNotNullExpressionValue(context3, "");
                DataCenter dataCenter3 = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter3, "");
                AbstractC5436a abstractC5436a3 = this.LJJI;
                ViewGroup viewGroup3 = this.containerView;
                Intrinsics.checkNotNullExpressionValue(viewGroup3, "");
                FrameLayout frameLayout3 = (FrameLayout) viewGroup3.findViewById(2131197173);
                Intrinsics.checkNotNullExpressionValue(frameLayout3, "");
                return new C79080HFi(LJIJI3, true, (ConstraintLayout) findViewById11, context3, dataCenter3, this, this, abstractC5436a3, frameLayout3, new VideoTalkRoomAnchorWidget$createVideoTalkSceneWindowManager$1(this));
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
        } else {
            View view10 = this.contentView;
            if (view10 != null && (findViewById2 = view10.findViewById(2131168962)) != null) {
                findViewById2.setVisibility(0);
            }
            View view11 = this.contentView;
            if (view11 != null && (findViewById = view11.findViewById(2131168961)) != null) {
                findViewById.setVisibility(8);
            }
            Room LJIJI4 = LJIJI();
            View view12 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view12, "");
            View findViewById12 = view12.findViewById(2131168962);
            if (findViewById12 != null) {
                Context context4 = this.context;
                Intrinsics.checkNotNullExpressionValue(context4, "");
                DataCenter dataCenter4 = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter4, "");
                AbstractC5436a abstractC5436a4 = this.LJJI;
                ViewGroup viewGroup4 = this.containerView;
                Intrinsics.checkNotNullExpressionValue(viewGroup4, "");
                FrameLayout frameLayout4 = (FrameLayout) viewGroup4.findViewById(2131197173);
                Intrinsics.checkNotNullExpressionValue(frameLayout4, "");
                return new C4966r(LJIJI4, true, (ConstraintLayout) findViewById12, context4, dataCenter4, this, this, abstractC5436a4, frameLayout4);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
        }
    }

    public final AbstractC4964m LIZJ(Class<? extends AbstractC4964m> cls) {
        View findViewById;
        View findViewById2;
        View findViewById3;
        View findViewById4;
        View findViewById5;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, LIZIZ, false, 19);
        if (proxy.isSupported) {
            return (AbstractC4964m) proxy.result;
        }
        if (Intrinsics.areEqual(cls, C80641HqV.class)) {
            View view = this.contentView;
            if (view != null && (findViewById5 = view.findViewById(2131184133)) != null) {
                findViewById5.setVisibility(0);
            }
            Room LJIJI = LJIJI();
            View view2 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            View findViewById6 = view2.findViewById(2131184133);
            if (findViewById6 != null) {
                Context context = this.context;
                Intrinsics.checkNotNullExpressionValue(context, "");
                DataCenter dataCenter = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter, "");
                AbstractC5436a abstractC5436a = this.LJJI;
                ViewGroup viewGroup = this.containerView;
                Intrinsics.checkNotNullExpressionValue(viewGroup, "");
                FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(2131197173);
                Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                return new C80641HqV(LJIJI, true, (ConstraintLayout) findViewById6, context, dataCenter, this, this, abstractC5436a, frameLayout);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
        } else if (Intrinsics.areEqual(cls, C80635HqP.class)) {
            View view3 = this.contentView;
            if (view3 != null && (findViewById4 = view3.findViewById(2131184133)) != null) {
                findViewById4.setVisibility(0);
            }
            Room LJIJI2 = LJIJI();
            View view4 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view4, "");
            View findViewById7 = view4.findViewById(2131184133);
            if (findViewById7 != null) {
                Context context2 = this.context;
                Intrinsics.checkNotNullExpressionValue(context2, "");
                DataCenter dataCenter2 = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter2, "");
                AbstractC5436a abstractC5436a2 = this.LJJI;
                ViewGroup viewGroup2 = this.containerView;
                Intrinsics.checkNotNullExpressionValue(viewGroup2, "");
                FrameLayout frameLayout2 = (FrameLayout) viewGroup2.findViewById(2131197173);
                Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
                return new C80635HqP(LJIJI2, true, (ConstraintLayout) findViewById7, context2, dataCenter2, this, this, abstractC5436a2, frameLayout2);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
        } else if (Intrinsics.areEqual(cls, C80627HqH.class)) {
            View view5 = this.contentView;
            if (view5 != null && (findViewById3 = view5.findViewById(2131173812)) != null) {
                findViewById3.setVisibility(0);
            }
            Room LJIJI3 = LJIJI();
            View view6 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view6, "");
            View findViewById8 = view6.findViewById(2131173812);
            if (findViewById8 != null) {
                Context context3 = this.context;
                Intrinsics.checkNotNullExpressionValue(context3, "");
                DataCenter dataCenter3 = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter3, "");
                AbstractC5436a abstractC5436a3 = this.LJJI;
                ViewGroup viewGroup3 = this.containerView;
                Intrinsics.checkNotNullExpressionValue(viewGroup3, "");
                FrameLayout frameLayout3 = (FrameLayout) viewGroup3.findViewById(2131197173);
                Intrinsics.checkNotNullExpressionValue(frameLayout3, "");
                return new C80627HqH(LJIJI3, true, (ConstraintLayout) findViewById8, context3, dataCenter3, this, this, abstractC5436a3, frameLayout3);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
        } else if (Intrinsics.areEqual(cls, C80630HqK.class)) {
            View view7 = this.contentView;
            if (view7 != null && (findViewById2 = view7.findViewById(2131172771)) != null) {
                findViewById2.setVisibility(0);
            }
            Room LJIJI4 = LJIJI();
            View view8 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view8, "");
            View findViewById9 = view8.findViewById(2131172771);
            if (findViewById9 != null) {
                Context context4 = this.context;
                Intrinsics.checkNotNullExpressionValue(context4, "");
                DataCenter dataCenter4 = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter4, "");
                AbstractC5436a abstractC5436a4 = this.LJJI;
                ViewGroup viewGroup4 = this.containerView;
                Intrinsics.checkNotNullExpressionValue(viewGroup4, "");
                FrameLayout frameLayout4 = (FrameLayout) viewGroup4.findViewById(2131197173);
                Intrinsics.checkNotNullExpressionValue(frameLayout4, "");
                return new C80630HqK(LJIJI4, true, (ConstraintLayout) findViewById9, context4, dataCenter4, this, this, abstractC5436a4, frameLayout4);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
        } else {
            View view9 = this.contentView;
            if (view9 != null && (findViewById = view9.findViewById(2131184133)) != null) {
                findViewById.setVisibility(0);
            }
            Room LJIJI5 = LJIJI();
            View view10 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view10, "");
            View findViewById10 = view10.findViewById(2131184133);
            if (findViewById10 != null) {
                Context context5 = this.context;
                Intrinsics.checkNotNullExpressionValue(context5, "");
                DataCenter dataCenter5 = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter5, "");
                AbstractC5436a abstractC5436a5 = this.LJJI;
                ViewGroup viewGroup5 = this.containerView;
                Intrinsics.checkNotNullExpressionValue(viewGroup5, "");
                FrameLayout frameLayout5 = (FrameLayout) viewGroup5.findViewById(2131197173);
                Intrinsics.checkNotNullExpressionValue(frameLayout5, "");
                return new C80642HqW(LJIJI5, true, (ConstraintLayout) findViewById10, context5, dataCenter5, this, this, abstractC5436a5, frameLayout5);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p350d.e$a
    public final boolean LIZLLL(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 110);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC4964m abstractC4964m = this.LJIIL;
        if (abstractC4964m == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC4964m.mo15677LJ(str);
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m.AbstractC4965a
    public final void LJII(String str) {
        int i;
        String str2;
        HHA LJIL;
        HHA LJIL2;
        String LJIJJLI;
        String LJIJJ;
        SingingChallengeLiveCoreInfo singingChallengeLiveCoreInfo;
        Map<Long, String> map;
        String str3;
        SingingChallengeRtcInfo singingChallengeRtcInfo;
        Map<Long, String> map2;
        String LIZIZ2;
        String LJJIII;
        String LJJIIJ;
        MultiRtcInfo multiRtcInfo;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ3;
        C6307m LIZIZ4;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 69).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        ALogger.m15797i("ttlive_link_video", C0002O.m25086C("updateLiveCoreRtcInfo ", str));
        boolean m15688LJ = LJJIL().m15688LJ();
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJJZZIII = LJJJI.LJJZZIII()) != null && (LIZIZ3 = LJJZZIII.LIZIZ()) != null && (LIZIZ4 = LIZIZ3.LIZIZ()) != null) {
            i = LIZIZ4.LIZIZ;
        } else {
            i = 0;
        }
        boolean LJJJJIZL = LJJJJIZL();
        C79007HCn LJII = C79007HCn.LJII();
        if (LJII == null || (multiRtcInfo = LJII.LJIIIZ) == null || (str2 = multiRtcInfo.toString()) == null) {
            str2 = "";
        }
        HH8.LIZ(str, LJJJJIZL, m15688LJ, i, str2);
        if (LJJJJIZL()) {
            AbstractC4964m abstractC4964m = this.LJIIL;
            if (abstractC4964m == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (!(abstractC4964m instanceof C80635HqP)) {
                abstractC4964m = null;
            }
            C80635HqP c80635HqP = (C80635HqP) abstractC4964m;
            if (c80635HqP != null && (LJJIIJ = c80635HqP.LJJIIJ()) != null) {
                LJIL().LIZ(LJJIIJ);
            }
            AbstractC4964m abstractC4964m2 = this.LJIIL;
            if (abstractC4964m2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (!(abstractC4964m2 instanceof C80635HqP)) {
                abstractC4964m2 = null;
            }
            C80635HqP c80635HqP2 = (C80635HqP) abstractC4964m2;
            if (c80635HqP2 != null && (LJJIII = c80635HqP2.LJJIII()) != null) {
                LJIL().LIZIZ(LJJIII);
                return;
            }
            return;
        }
        AbstractC4964m abstractC4964m3 = this.LJIIL;
        if (abstractC4964m3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if ((abstractC4964m3 instanceof C79080HFi) && LJJJJJ()) {
            AbstractC4254a abstractC4254a = this.LJIIJJI;
            if (!(abstractC4254a instanceof C79007HCn)) {
                abstractC4254a = null;
            }
            C79007HCn c79007HCn = (C79007HCn) abstractC4254a;
            if (c79007HCn != null) {
                MultiRtcInfo multiRtcInfo2 = c79007HCn.LJIIIZ;
                if (multiRtcInfo2 != null && (singingChallengeRtcInfo = multiRtcInfo2.singingChallengeRtcInfo) != null && (map2 = singingChallengeRtcInfo.LIZIZ) != null) {
                    AbstractC4964m abstractC4964m4 = this.LJIIL;
                    if (abstractC4964m4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    if (!(abstractC4964m4 instanceof C79080HFi)) {
                        abstractC4964m4 = null;
                    }
                    C79080HFi c79080HFi = (C79080HFi) abstractC4964m4;
                    if (c79080HFi != null && (LIZIZ2 = c79080HFi.LIZIZ(map2)) != null) {
                        LJIL().LIZIZ(LIZIZ2);
                        AbstractC4964m abstractC4964m5 = this.LJIIL;
                        if (abstractC4964m5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                        if (!(abstractC4964m5 instanceof C79080HFi)) {
                            abstractC4964m5 = null;
                        }
                        C79080HFi c79080HFi2 = (C79080HFi) abstractC4964m5;
                        if (c79080HFi2 != null) {
                            c79080HFi2.LJIIIZ = LIZIZ2;
                        }
                    }
                }
                MultiLiveCoreInfo multiLiveCoreInfo = c79007HCn.LJIIJJI;
                if (multiLiveCoreInfo != null && (singingChallengeLiveCoreInfo = multiLiveCoreInfo.singingChallengeLiveCoreInfo) != null && (map = singingChallengeLiveCoreInfo.LIZIZ) != null && (str3 = map.get(1L)) != null) {
                    LJIL().LIZ(str3);
                    AbstractC4964m abstractC4964m6 = this.LJIIL;
                    if (abstractC4964m6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    if (!(abstractC4964m6 instanceof C79080HFi)) {
                        abstractC4964m6 = null;
                    }
                    C79080HFi c79080HFi3 = (C79080HFi) abstractC4964m6;
                    if (c79080HFi3 != null) {
                        c79080HFi3.LJIIIIZZ = str3;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        AbstractC4964m abstractC4964m7 = this.LJIIL;
        if (abstractC4964m7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (abstractC4964m7 instanceof C80630HqK) {
            AbstractC4964m abstractC4964m8 = this.LJIIL;
            if (abstractC4964m8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (!(abstractC4964m8 instanceof C80630HqK)) {
                abstractC4964m8 = null;
            }
            C80630HqK c80630HqK = (C80630HqK) abstractC4964m8;
            if (c80630HqK != null && (LJIJJ = c80630HqK.LJIJJ()) != null) {
                LJIL().LIZ(LJIJJ);
            }
            AbstractC4964m abstractC4964m9 = this.LJIIL;
            if (abstractC4964m9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (!(abstractC4964m9 instanceof C80630HqK)) {
                abstractC4964m9 = null;
            }
            C80630HqK c80630HqK2 = (C80630HqK) abstractC4964m9;
            if (c80630HqK2 != null && (LJIJJLI = c80630HqK2.LJIJJLI()) != null) {
                LJIL().LIZIZ(LJIJJLI);
                return;
            }
            return;
        }
        AbstractC4254a abstractC4254a2 = this.LJIIJJI;
        if (!(abstractC4254a2 instanceof C79007HCn)) {
            abstractC4254a2 = null;
        }
        C79007HCn c79007HCn2 = (C79007HCn) abstractC4254a2;
        if (c79007HCn2 == null) {
            return;
        }
        String str4 = c79007HCn2.LJII;
        if (str4 != null && str4.length() != 0 && (LJIL2 = LJIL()) != null) {
            LJIL2.LIZIZ(c79007HCn2.LJII);
        }
        String str5 = c79007HCn2.LJIIIIZZ;
        if (str5 == null || str5.length() == 0 || (LJIL = LJIL()) == null) {
            return;
        }
        LJIL.LIZ(c79007HCn2.LJIIIIZZ);
    }

    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        C78595Gyb c78595Gyb;
        FragmentManager supportFragmentManager;
        VideoTalkCPositionBeInvitedDialog videoTalkCPositionBeInvitedDialog;
        HED hed;
        FragmentManager supportFragmentManager2;
        VideoTalkCPositionBeInvitedDialog videoTalkCPositionBeInvitedDialog2;
        if (!PatchProxy.proxy(new Object[]{iMessage}, this, LIZIZ, false, C1399n.f22430f).isSupported && (iMessage instanceof C8874fl)) {
            C8874fl c8874fl = (C8874fl) iMessage;
            switch (c8874fl.LIZIZ) {
                case MotionEventCompat.AXIS_GENERIC_5 /* 36 */:
                    if (PatchProxy.proxy(new Object[]{c8874fl}, this, LIZIZ, false, 126).isSupported || !LJIILIIL() || c8874fl.LJJIJL == null) {
                        return;
                    }
                    VideoTalkCPositionBeInvitedDialog videoTalkCPositionBeInvitedDialog3 = this.LJJJI;
                    if (videoTalkCPositionBeInvitedDialog3 != null && videoTalkCPositionBeInvitedDialog3.LJIILIIL() && (videoTalkCPositionBeInvitedDialog2 = this.LJJJI) != null) {
                        videoTalkCPositionBeInvitedDialog2.dismissAllowingStateLoss();
                    }
                    FragmentActivity LIZIZ2 = C439993ar.LIZIZ(getContext());
                    if (LIZIZ2 == null || (supportFragmentManager2 = LIZIZ2.getSupportFragmentManager()) == null) {
                        return;
                    }
                    VideoTalkCPositionBeInvitedDialog LIZ = VideoTalkCPositionBeInvitedDialog.LJIIIIZZ.LIZ(VideoTalkCPositionBeInvitedDialog.ShowType.Invite, LJIJI().getRoomId(), true, c8874fl.LJJIJL.LIZ, c8874fl);
                    this.LJJJI = LIZ;
                    LIZ.show(supportFragmentManager2, "VideoTalkCPositionBeInvitedDialog");
                    return;
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    if (!PatchProxy.proxy(new Object[]{c8874fl}, this, LIZIZ, false, 127).isSupported && (hed = c8874fl.LJJIJLIJ) != null) {
                        TalkRoomBusinessFullLinkMonitor.LIZIZ.LIZ(c8874fl.getMessageId(), hed);
                        if (hed.LIZJ != CPositionReplyType.Reject.value) {
                            return;
                        }
                        String str = hed.LIZLLL;
                        if (str != null && str.length() != 0) {
                            C88440Kt0.LIZ(hed.LIZLLL);
                            return;
                        } else {
                            C88440Kt0.LIZ(2131587946);
                            return;
                        }
                    }
                    return;
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    if (!PatchProxy.proxy(new Object[]{c8874fl}, this, LIZIZ, false, 128).isSupported && LJIILIIL() && (c78595Gyb = c8874fl.LJJIL) != null) {
                        long j = c78595Gyb.LIZ;
                        VideoTalkCPositionBeInvitedDialog videoTalkCPositionBeInvitedDialog4 = this.LJJJI;
                        if (videoTalkCPositionBeInvitedDialog4 != null && videoTalkCPositionBeInvitedDialog4.LJIILIIL() && (videoTalkCPositionBeInvitedDialog = this.LJJJI) != null) {
                            videoTalkCPositionBeInvitedDialog.dismissAllowingStateLoss();
                        }
                        FragmentActivity LIZIZ3 = C439993ar.LIZIZ(getContext());
                        if (LIZIZ3 == null || (supportFragmentManager = LIZIZ3.getSupportFragmentManager()) == null) {
                            return;
                        }
                        VideoTalkCPositionBeInvitedDialog LIZ2 = VideoTalkCPositionBeInvitedDialog.LJIIIIZZ.LIZ(VideoTalkCPositionBeInvitedDialog.ShowType.Apply, LJIJI().getRoomId(), true, j, c8874fl);
                        this.LJJJI = LIZ2;
                        LIZ2.show(supportFragmentManager, "VideoTalkCPositionBeInvitedDialog");
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    private final void LIZIZ(boolean z, String str) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str}, this, LIZIZ, false, 45).isSupported) {
            return;
        }
        IKtvService iKtvService = (IKtvService) ServiceManager.getService(IKtvService.class);
        if (iKtvService != null && iKtvService.isInKtvState(1)) {
            LiveCore liveCore = LJIL().LIZJ;
            if (liveCore != null) {
                liveCore.setAudioMute(!z ? 1 : 0);
                return;
            }
            return;
        }
        LJIL().LIZ(z, str);
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p387b.a$a
    /* renamed from: LJ */
    public final void mo15669LJ(long j, Throwable th) {
        if (!PatchProxy.proxy(new Object[]{new Long(j), th}, this, LIZIZ, false, 103).isSupported && (th instanceof ApiServerException)) {
            C88440Kt0.LIZ(((ApiServerException) th).mPrompt);
        }
    }

    private final boolean LIZ(AbstractC4912d abstractC4912d, AbstractC4912d abstractC4912d2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC4912d, abstractC4912d2}, this, LIZIZ, false, 64);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if ((abstractC4912d != null && abstractC4912d.LIZLLL()) || abstractC4912d2.LIZLLL()) {
            return false;
        }
        if ((abstractC4912d != null && abstractC4912d.LIZJ()) || abstractC4912d2.LIZJ()) {
            return false;
        }
        if ((abstractC4912d != null && abstractC4912d.m15688LJ()) || abstractC4912d2.m15688LJ()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p387b.a$a
    public final void LIZLLL(long j, Throwable th) {
        if (PatchProxy.proxy(new Object[]{new Long(j), th}, this, LIZIZ, false, BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS).isSupported) {
            return;
        }
        C88469KtT.LIZ(this.context, th, 2131585535);
    }

    private final void LIZ(boolean z, long j) {
        int i;
        boolean z2;
        List<LinkPlayerInfo> LIZJ;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)}, this, LIZIZ, false, 70).isSupported) {
            return;
        }
        C6307m LJJI = LJJI();
        if (LJJI != null) {
            i = LJJI.LIZLLL;
        } else {
            i = 0;
        }
        boolean LIZ = C78653GzX.LIZ(i);
        AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs = this.LJIILIIL;
        if (abstractC78986HBs != null && (LIZJ = abstractC78986HBs.LIZJ()) != null && (!(LIZJ instanceof Collection) || !LIZJ.isEmpty())) {
            for (LinkPlayerInfo linkPlayerInfo : LIZJ) {
                if (linkPlayerInfo.LJJJI) {
                    User LIZ2 = linkPlayerInfo.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                    if (LIZ2.getId() == LJIJI().ownerUserId) {
                        z2 = true;
                        break;
                    }
                }
            }
        }
        z2 = false;
        C78828H5q.LIZJ = String.valueOf(j);
        C78828H5q.LJFF.LIZ(z, LIZ, z2, true, j);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZIZ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LIZIZ, false, 90).isSupported) {
            return;
        }
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("cmd_audience_turn_off_engine", Boolean.FALSE);
        }
        super.LIZIZ(j, exc);
        HKI hki = this.LJJIIJZLJL;
        if (hki != null) {
            hki.LIZ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZJ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LIZIZ, false, 94).isSupported) {
            return;
        }
        super.LIZJ(j, exc);
        C88440Kt0.LIZ(2131585643);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag
    public final void LIZIZ(long j, String str) {
        AbstractC78986HBs<LinkPlayerInfo> LIZLLL;
        LinkPlayerInfo LIZ;
        if (!PatchProxy.proxy(new Object[]{new Long(j), str}, this, LIZIZ, false, 51).isSupported && (LIZLLL = LIZLLL()) != null && (LIZ = LIZLLL.LIZ(j, "")) != null) {
            C78684H0c c78684H0c = H0V.LJIILLIIL;
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "");
            DataCenter dataCenter = this.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter, "");
            if (str == null) {
                str = "seat";
            }
            C116971W2r.LIZJ(c78684H0c.LIZ(context, dataCenter, LIZ, str));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4797h
    public final void LIZJ(long j, Throwable th) {
        if (PatchProxy.proxy(new Object[]{new Long(j), th}, this, LIZIZ, false, 85).isSupported) {
            return;
        }
        super.LIZJ(j, th);
        this.LJJJLL = false;
        C88469KtT.LIZ(getContext(), th, 2131585533);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p350d.e$a
    public final int LIZ(List<Region> list, Map<String, Integer> map) {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, map}, this, LIZIZ, false, 107);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C106862S5w.LIZ(list, map);
        if (list.isEmpty()) {
            return 0;
        }
        AbstractC4964m abstractC4964m = this.LJIIL;
        if (abstractC4964m == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (abstractC4964m instanceof C80635HqP) {
            AbstractC4964m abstractC4964m2 = this.LJIIL;
            if (abstractC4964m2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.videotalk.ui.DynamicTalkRoomWindowManager");
            }
            i = ((C80635HqP) abstractC4964m2).LIZ(list, map);
        }
        AbstractC4964m abstractC4964m3 = this.LJIIL;
        if (abstractC4964m3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (abstractC4964m3 instanceof AbstractC80636HqQ) {
            AbstractC4964m abstractC4964m4 = this.LJIIL;
            if (abstractC4964m4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.videotalk.ui.BaseEqualTalkRoomWindowManager");
            }
            i = ((AbstractC80636HqQ) abstractC4964m4).LIZ(list, map);
        }
        AbstractC4964m abstractC4964m5 = this.LJIIL;
        if (abstractC4964m5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (abstractC4964m5 instanceof C80645HqZ) {
            AbstractC4964m abstractC4964m6 = this.LJIIL;
            if (abstractC4964m6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.videotalk.ui.VideoCameraDynamicWindowManager");
            }
            i = ((C80645HqZ) abstractC4964m6).LIZ(list, map);
        }
        AbstractC4964m abstractC4964m7 = this.LJIIL;
        if (abstractC4964m7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (abstractC4964m7 instanceof C80627HqH) {
            AbstractC4964m abstractC4964m8 = this.LJIIL;
            if (abstractC4964m8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.videotalk.ui.VideoTeamFightWindowManager");
            }
            i = ((C80627HqH) abstractC4964m8).LIZ(list, map);
        }
        AbstractC4964m abstractC4964m9 = this.LJIIL;
        if (abstractC4964m9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (abstractC4964m9 instanceof C80607Hpx) {
            AbstractC4964m abstractC4964m10 = this.LJIIL;
            if (abstractC4964m10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.linkroomfight.ui.LinkRoomFightWindowManager");
            }
            i = ((C80607Hpx) abstractC4964m10).LIZ(list, map);
        }
        AbstractC4964m abstractC4964m11 = this.LJIIL;
        if (abstractC4964m11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (abstractC4964m11 instanceof C80630HqK) {
            AbstractC4964m abstractC4964m12 = this.LJIIL;
            if (abstractC4964m12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.videotalk.ui.VideoDoubleCenterWindowManager");
            }
            return ((C80630HqK) abstractC4964m12).LIZ(list, map);
        }
        return i;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAnchorLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4797h
    public final void LIZIZ(long j, Throwable th) {
        Throwable th2;
        if (PatchProxy.proxy(new Object[]{new Long(j), th}, this, LIZIZ, false, 40).isSupported) {
            return;
        }
        super.LIZIZ(j, th);
        if (!(th instanceof ApiServerException)) {
            th2 = null;
        } else {
            th2 = th;
        }
        if (th2 != null) {
            C88440Kt0.LIZ(((ApiServerException) th).mPrompt);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTalkRoomAnchorWidget(AbstractC6070q abstractC6070q, AbstractC5436a abstractC5436a, AbstractC4254a abstractC4254a) {
        super(abstractC4254a);
        C106862S5w.LIZ(abstractC6070q, abstractC5436a, abstractC4254a);
        this.LJJ = abstractC6070q;
        this.LJJI = abstractC5436a;
    }

    private final void LIZ(MultiLiveCoreInfo multiLiveCoreInfo, MultiRtcInfo multiRtcInfo, String str, String str2) {
        AbstractC4254a abstractC4254a = this.LJIIJJI;
        if (!(abstractC4254a instanceof C79007HCn)) {
            abstractC4254a = null;
        }
        C79007HCn c79007HCn = (C79007HCn) abstractC4254a;
        if (c79007HCn != null) {
            c79007HCn.LJIIJJI = multiLiveCoreInfo;
            c79007HCn.LJIIIZ = multiRtcInfo;
            c79007HCn.LJII = str2;
            c79007HCn.LJIIIIZZ = str;
        }
    }

    private void LIZ(int i, Integer num, String str, boolean z) {
        int i2;
        int i3;
        Integer num2;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ2;
        C6307m LIZIZ3;
        int i4;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), num, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 63).isSupported) {
            return;
        }
        ALogger.m15797i("ttlive_link_video", "try switchScene to scene=" + i + " uiLayout=" + num + " reason=" + str + ", current:" + LJJI());
        C6307m LJJI = LJJI();
        if (LJJI != null) {
            i2 = LJJI.LIZIZ;
        } else {
            i2 = 8;
        }
        C6307m LJJI2 = LJJI();
        if (LJJI2 != null) {
            i3 = LJJI2.LIZLLL;
        } else {
            i3 = 0;
        }
        C79004HCk c79004HCk = this.LJIJJLI;
        if (c79004HCk == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (c79004HCk.LIZ(i, num)) {
            ALogger.m15800e("ttlive_link_video", "no switchScene, same layout " + LJJI() + LoggerUtil.BLANK_TAG + LJJIL());
        } else if ((i == 8 || i == 13) && this.LJIJ.size() > 7) {
            C88440Kt0.LIZ(2131582414);
            HashMap hashMap = new HashMap();
            hashMap.put("live_type", "video_live");
            C5923dp LJJJI = LJJJI();
            if (LJJJI != null && (LJJZZIII = LJJJI.LJJZZIII()) != null && (LIZIZ2 = LJJZZIII.LIZIZ()) != null && (LIZIZ3 = LIZIZ2.LIZIZ()) != null) {
                num2 = Integer.valueOf(LIZIZ3.LIZIZ);
            } else {
                num2 = null;
            }
            C78828H5q.LIZIZ(hashMap, num2, (Integer) null, 4, (Object) null);
            C78828H5q.LIZ(hashMap);
            C4574547f.LIZ().LIZ("livesdk_anchor_audience_connection_layout_change_toast_show", hashMap, Room.class);
        } else if (this.LIZJ) {
        } else {
            this.LIZJ = true;
            long currentTimeMillis = System.currentTimeMillis();
            LinkApi linkApi = (LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class);
            long id = LJIJI().getId();
            long id2 = LJIJI().getId();
            if (num != null) {
                i4 = num.intValue();
            } else {
                i4 = 0;
            }
            this.LJJII.add(linkApi.switchScene(id, id2, i2, i, i4, str).subscribeOn(Schedulers.m138io()).flatMap(HGO.LIZIZ).observeOn(AndroidSchedulers.mainThread()).subscribe(new C79009HCp(this, i2, i, num, str, currentTimeMillis, i3, z), new HE6(this, i2, i, num, str, currentTimeMillis)));
        }
    }
}
