package com.bytedance.android.live.liveinteract.videotalk.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.alipay.sdk.app.OpenAuthTask;
import com.alipay.sdk.p082m.p121u.C1399n;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.p255g.AbstractC2885g;
import com.bytedance.android.live.broadcastgame.api.C3348d;
import com.bytedance.android.live.browser.webview.fragment.AbstractC4054j;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.linkpk.AbstractC4254a;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.MediaOperation;
import com.bytedance.android.live.liveinteract.api.chatroom.model.LinkApplyType;
import com.bytedance.android.live.liveinteract.api.chatroom.model.LinkMatchType;
import com.bytedance.android.live.liveinteract.api.data.C4284f;
import com.bytedance.android.live.liveinteract.api.data.p341a.p342a.a$a;
import com.bytedance.android.live.liveinteract.api.fulllink.LinkMonitorData;
import com.bytedance.android.live.liveinteract.api.fulllink.TalkRoomBusinessFullLinkMonitor;
import com.bytedance.android.live.liveinteract.api.p338b.AbstractC4264a;
import com.bytedance.android.live.liveinteract.bid.AbstractC4289e;
import com.bytedance.android.live.liveinteract.bid.BidLinkMicWidget;
import com.bytedance.android.live.liveinteract.bid.C4287a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.model.CPositionReplyType;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p354vm.C4378a;
import com.bytedance.android.live.liveinteract.digitavatar.C4382d;
import com.bytedance.android.live.liveinteract.digitavatar.DigitAvatarMsgController;
import com.bytedance.android.live.liveinteract.digitavatar.videoavatar.C4387c;
import com.bytedance.android.live.liveinteract.digitavatar.videoavatar.VideoDigitAvatarWidget;
import com.bytedance.android.live.liveinteract.digitavatar.videoavatar.VideoShowMode;
import com.bytedance.android.live.liveinteract.doublepk.widget.DoublePkBusinessWidget;
import com.bytedance.android.live.liveinteract.linkroomfight.core.VideoLinkRoomFightWidget;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.multianchor.model.LinkmicPositionItem;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.android.live.liveinteract.plantform.api.LinkAudienceApi;
import com.bytedance.android.live.liveinteract.plantform.api.LinkPaidLinkApi;
import com.bytedance.android.live.liveinteract.plantform.camera.AbstractC4791d;
import com.bytedance.android.live.liveinteract.plantform.camera.AbstractC4792e;
import com.bytedance.android.live.liveinteract.plantform.core.C4806x;
import com.bytedance.android.live.liveinteract.plantform.model.C4824t;
import com.bytedance.android.live.liveinteract.plantform.model.GameInviteInfo;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.plantform.model.MessageBoardInfo;
import com.bytedance.android.live.liveinteract.plantform.model.MicPosTagInfo;
import com.bytedance.android.live.liveinteract.plantform.model.RoomLinkerContent;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4765af;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i;
import com.bytedance.android.live.liveinteract.plantform.permission.model.C4825a;
import com.bytedance.android.live.liveinteract.plantform.permission.model.OperateType;
import com.bytedance.android.live.liveinteract.plantform.utils.TalkRoomOperate;
import com.bytedance.android.live.liveinteract.plantform.widgt.BaseAdminLinkWidget;
import com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget;
import com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleWidget;
import com.bytedance.android.live.liveinteract.videotalk.dialog.VideoTalkCPositionBeInvitedDialog;
import com.bytedance.android.live.liveinteract.videotalk.fight.VideoTeamFightWidget;
import com.bytedance.android.live.liveinteract.videotalk.p388c.AbstractC4912d;
import com.bytedance.android.live.liveinteract.videotalk.p388c.e$a;
import com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m;
import com.bytedance.android.live.liveinteract.videotalk.p391ui.C4966r;
import com.bytedance.android.live.liveinteract.videotalk.paid.VideoPaidLinkWidget;
import com.bytedance.android.live.liveinteract.videotalk.quickinteract.QuickInteractWidget;
import com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.C4949a;
import com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.SelfDisciplineWidget;
import com.bytedance.android.live.liveinteract.voicechat.dialog.C5011d;
import com.bytedance.android.live.liveinteract.voicechat.fight.C5056a;
import com.bytedance.android.live.liveinteract.voicechat.match.C5074d;
import com.bytedance.android.live.liveinteract.voicechat.match.ChatMatchWidget;
import com.bytedance.android.live.liveinteract.voicechat.p392b.C5001e;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.event.C5984am;
import com.bytedance.android.livesdk.chatroom.event.C6008ch;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q;
import com.bytedance.android.livesdk.chatroom.interact.model.C6068x;
import com.bytedance.android.livesdk.chatroom.model.C6094ae;
import com.bytedance.android.livesdk.chatroom.model.C6095af;
import com.bytedance.android.livesdk.chatroom.model.C6192s;
import com.bytedance.android.livesdk.chatroom.model.interact.C6160b;
import com.bytedance.android.livesdk.chatroom.model.interact.C6179t;
import com.bytedance.android.livesdk.chatroom.model.interact.MultiLiveCoreInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.MultiRtcInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.SingingChallengeLiveCoreInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.SingingChallengeRtcInfo;
import com.bytedance.android.livesdk.chatroom.p517u.AbstractC6302f;
import com.bytedance.android.livesdk.chatroom.p517u.C6305j;
import com.bytedance.android.livesdk.chatroom.p517u.C6307m;
import com.bytedance.android.livesdk.config.C6858bo;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.ktvapi.IKtvService;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.log.p723a.AbstractC8644i;
import com.bytedance.android.livesdk.message.linker.C8681b;
import com.bytedance.android.livesdk.message.linker.C8685f;
import com.bytedance.android.livesdk.message.linker.ChangePlayModeData;
import com.bytedance.android.livesdk.message.linker.LinkerChangePlayModeContent;
import com.bytedance.android.livesdk.message.model.C8854es;
import com.bytedance.android.livesdk.message.model.C8870fj;
import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.android.livesdk.message.model.KtvMusic;
import com.bytedance.android.livesdk.message.model.ReplyType;
import com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler;
import com.bytedance.android.livesdk.user.C9284h;
import com.bytedance.android.livesdk.widget.v$a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.audio.VoiceLiveTheme;
import com.bytedance.android.livesdkapi.depend.model.live.circleinfo.CircleInfo;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9518ac;
import com.bytedance.android.livesdkapi.message.C9605p;
import com.bytedance.android.livesdkapi.model.C9650r;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.p1594ss.avframework.livestreamv2.core.ILayerControl;
import com.p1594ss.avframework.livestreamv2.core.LiveCore;
import com.p1594ss.avframework.livestreamv2.core.interact.model.Config;
import com.p1594ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.p1594ss.avframework.mixer.VideoMixer;
import com.p1594ss.ttm.player.MediaPlayer;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.p3021tt.miniapp.debug.devtool.BdpDebugHttpRequest;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC413392Xt;
import p003X.AbstractC446093kh;
import p003X.AbstractC78050Gpo;
import p003X.AbstractC78986HBs;
import p003X.AbstractC79093HFv;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC80636HqQ;
import p003X.AbstractC81935IRd;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2WC;
import p003X.C3VF;
import p003X.C409882Kg;
import p003X.C414642b4;
import p003X.C439993ar;
import p003X.C43F;
import p003X.C448383oO;
import p003X.C4574547f;
import p003X.C77540Gha;
import p003X.C77562Ghw;
import p003X.C77679Gjp;
import p003X.C77680Gjq;
import p003X.C77917Gnf;
import p003X.C77919Gnh;
import p003X.C78306Gtw;
import p003X.C78352Gug;
import p003X.C78391GvJ;
import p003X.C78395GvN;
import p003X.C78467GwX;
import p003X.C78536Gxe;
import p003X.C78537Gxf;
import p003X.C78538Gxg;
import p003X.C78540Gxi;
import p003X.C78571GyD;
import p003X.C78572GyE;
import p003X.C78596Gyc;
import p003X.C78627Gz7;
import p003X.C78653GzX;
import p003X.C78656Gza;
import p003X.C78684H0c;
import p003X.C78746H2m;
import p003X.C78828H5q;
import p003X.C78832H5u;
import p003X.C78836H5y;
import p003X.C78837H5z;
import p003X.C78883H7t;
import p003X.C78964HAw;
import p003X.C78999HCf;
import p003X.C79001HCh;
import p003X.C79003HCj;
import p003X.C79004HCk;
import p003X.C79007HCn;
import p003X.C79010HCq;
import p003X.C79046HEa;
import p003X.C79058HEm;
import p003X.C79062HEq;
import p003X.C79072HFa;
import p003X.C79074HFc;
import p003X.C79080HFi;
import p003X.C79108HGk;
import p003X.C79111HGn;
import p003X.C79142HHs;
import p003X.C79220HKs;
import p003X.C79242HLo;
import p003X.C79399HRp;
import p003X.C80517HoV;
import p003X.C80607Hpx;
import p003X.C80627HqH;
import p003X.C80630HqK;
import p003X.C80635HqP;
import p003X.C80641HqV;
import p003X.C80642HqW;
import p003X.C80643HqX;
import p003X.C80644HqY;
import p003X.C80645HqZ;
import p003X.C80646Hqa;
import p003X.C80650Hqe;
import p003X.C81173Hz5;
import p003X.C81280I1y;
import p003X.C81980ISw;
import p003X.C87010KQi;
import p003X.C87308Kak;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.C88469KtT;
import p003X.DialogC418702hc;
import p003X.DialogC77613Gil;
import p003X.DialogC77863Gmn;
import p003X.DialogC77870Gmu;
import p003X.DialogC77887GnB;
import p003X.DialogC77935Gnx;
import p003X.DialogC78012GpC;
import p003X.DialogInterface$OnClickListenerC79057HEl;
import p003X.G22;
import p003X.GYW;
import p003X.H05;
import p003X.H0V;
import p003X.H1U;
import p003X.H7C;
import p003X.HAA;
import p003X.HAY;
import p003X.HB4;
import p003X.HBQ;
import p003X.HD9;
import p003X.HDA;
import p003X.HDD;
import p003X.HDI;
import p003X.HDJ;
import p003X.HDU;
import p003X.HDW;
import p003X.HE1;
import p003X.HE3;
import p003X.HE7;
import p003X.HE8;
import p003X.HED;
import p003X.HEI;
import p003X.HET;
import p003X.HF4;
import p003X.HFC;
import p003X.HFH;
import p003X.HFV;
import p003X.HG6;
import p003X.HGP;
import p003X.HGZ;
import p003X.HH8;
import p003X.HHA;
import p003X.HK5;
import p003X.HKC;
import p003X.HKE;
import p003X.IQV;
import p003X.LK5;
import p003X.QB4;
import p003X.QFD;
import p003X.View$OnClickListenerC78344GuY;

/* loaded from: classes3.dex */
public final class VideoTalkRoomGuestWidget extends BaseAdminLinkWidget<LinkPlayerInfo> implements Observer<KVData>, AbstractC2885g.AbstractC2887b, a$a, AbstractC4765af, AbstractC4792e, com.bytedance.android.live.liveinteract.videotalk.p387b.a$a, e$a, AbstractC4964m.AbstractC4965a, OnMessageListener, OnMessageListener {
    public static ChangeQuickRedirect LIZJ;
    public int LIZLLL;
    public AbstractC4964m LJII;
    public C79220HKs LJIIIIZZ;
    public DialogC418702hc LJIIIZ;
    public boolean LJIIJ;
    public Runnable LJJI;
    public boolean LJJIFFI;
    public AbstractC2885g LJJII;
    public GuestBattleWidget LJJIIJZLJL;
    public ChatMatchWidget LJJIIZ;
    public BidLinkMicWidget LJJIIZI;
    public HK5 LJJIJIIJI;
    public VideoTalkRoomPermissionCheckWidget LJJIJIIJIL;
    public boolean LJJIZ;
    public VideoDigitAvatarWidget LJJJ;
    public HGZ LJJJI;
    public boolean LJJJIL;
    public boolean LJJJJIZL;
    public long LJJJJJ;
    public long LJJJJJL;
    public boolean LJJJJZI;
    public HDI LJJJLIIL;
    public AbstractC78986HBs<LinkPlayerInfo> LJJJLL;
    public C78964HAw LJJJZ;
    public C79220HKs LJJL;
    public DialogC77887GnB LJJLI;
    public AbstractC4054j LJJLIIIIJ;
    public HAY LJJLIIIJ;
    public HDJ LJJLIIIJJI;
    public AbstractC81935IRd LJJLIIIJJIZ;
    public C448383oO LJJLIIIJL;
    public VideoTalkCPositionBeInvitedDialog LJJLIIIJLJLI;
    public HD9 LJJLIIJ;
    public C78395GvN LJJLIL;
    public boolean LJJLL;
    public Disposable LJJZ;
    public boolean LJJZZI;
    public VideoTeamFightWidget LJL;
    public VideoLinkRoomFightWidget LJLI;
    public VideoPaidLinkWidget LJLIIIL;
    public QuickInteractWidget LJLIIL;
    public DoublePkBusinessWidget LJLIL;
    public SelfDisciplineWidget LJLILLLLZI;
    public boolean LJLJI;
    public Pair<Boolean, String> LJLJJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public C79004HCk LJLLJ;
    public int LJJJJL = C78832H5u.LIZ;
    public String LJJJJLI = "";

    /* renamed from: LJ */
    public LinkApplyType f26463LJ = LinkApplyType.NORMAL;
    public LinkMatchType LJFF = LinkMatchType.NONE;
    public String LJI = "";
    public int LJJJJLL = 200;
    public boolean LJJJJZ = true;
    public final CompositeDisposable LJJJLZIJ = new CompositeDisposable();
    public HashMap<String, SurfaceView> LJJLIIIJILLIZJL = new HashMap<>();
    public C79399HRp LJJLIIIJLLLLLLLZ = new C79399HRp(this);
    public final ArrayList<LinkPlayerInfo> LJJIII = new ArrayList<>();
    public final ArrayList<LinkPlayerInfo> LJJLJ = new ArrayList<>();
    public final HashMap<String, View> LJJIIJ = new HashMap<>();
    public final HashMap<String, Boolean> LJJLJLI = new HashMap<>();
    public LinkApplyType LJJZZIII = LinkApplyType.STRONG_REACH;
    public final C78746H2m LJJIJ = new C78746H2m(false);
    public final HFH LJLJJI = new HFH();
    public String LJJIJIL = "";
    public String LJJIJL = "";
    public int LJJIJLIJ = -1;
    public final Lazy LJLJJLL = LazyKt__LazyJVMKt.lazy(new VideoTalkRoomGuestWidget$mInteractLiveCorePermissionGuarantor$2(this));
    public final C5001e.AbstractC5002a LJJIL = new C79058HEm(this);
    public C79001HCh LJLJL = new C79001HCh(this);
    public final HE3 LJLLI = new HE3();
    public final Lazy LJLLILLLL = LazyKt__LazyJVMKt.lazy(new VideoTalkRoomGuestWidget$mGuestApplyDialog$2(this));

    static {
        Covode.recordClassIndex(30680);
    }

    private final C5001e LJJJJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 5);
        return (C5001e) (proxy.isSupported ? proxy.result : this.LJLJJLL.mo27335getValue());
    }

    private final C5011d LJJJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 6);
        return (C5011d) (proxy.isSupported ? proxy.result : this.LJLLILLLL.mo27335getValue());
    }

    @Override // com.bytedance.android.live.liveinteract.api.data.p341a.p342a.a$a
    public final boolean LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZJ, false, 157);
        return proxy.isSupported ? ((Boolean) proxy.result).booleanValue() : i == 9 || i == 11 || i == 13 || i == 16 || i == 18 || i == 10 || i == 12 || i == 15 || i == 8 || i == 5 || i == 17;
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget
    public final int LIZIZ() {
        return 8;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget
    public final int LIZJ() {
        return 16;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m.AbstractC4965a
    public final void LJJIJIIJIL() {
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p387b.a$a
    public final void ad_() {
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131700304;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a178";
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAdminLinkWidget, com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZJ, false, 175).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    /* renamed from: LJ */
    public final C78999HCf mo15671LJ() {
        return this.LJIILL;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m.AbstractC4965a
    public final ArrayList<LinkPlayerInfo> LJI() {
        return this.LJJIII;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final AbstractC78986HBs<LinkPlayerInfo> LJIIIIZZ() {
        return this.LJJJLL;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final C78746H2m LJIILL() {
        return this.LJJIJ;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final AbstractC2885g LJIILLIIL() {
        return this.LJJII;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final boolean LJIJJLI() {
        return this.LJLJI;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m.AbstractC4965a
    public final ArrayList<LinkPlayerInfo> LJJIIZI() {
        return this.LJJLJ;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final AbstractC4964m ae_() {
        return this.LJII;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final boolean af_() {
        return this.LJIJI;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m.AbstractC4965a
    public final HashMap<String, Boolean> ah_() {
        return this.LJJLJLI;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m.AbstractC4965a
    public final HashMap<String, View> ai_() {
        return this.LJJIIJ;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final void LIZ(int i, String str) {
        ChatMatchWidget chatMatchWidget;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, LIZJ, false, 4).isSupported && (chatMatchWidget = this.LJJIIZ) != null) {
            ChatMatchWidget.LIZ(chatMatchWidget, null, null, false, true, null, null, 52, null);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p388c.e$a
    public final void LIZ(AbstractC4964m abstractC4964m) {
        if (PatchProxy.proxy(new Object[]{abstractC4964m}, this, LIZJ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC4964m);
        this.LJII = abstractC4964m;
    }

    public final void LIZ(View view, MotionEvent motionEvent) {
        if (PatchProxy.proxy(new Object[]{view, motionEvent}, this, LIZJ, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(view, motionEvent);
        AbstractC4964m abstractC4964m = this.LJII;
        if (abstractC4964m == null) {
            return;
        }
        abstractC4964m.LIZ(view, motionEvent);
    }

    @Override // p003X.HHU
    public final void LIZ(InteractConfig interactConfig) {
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ;
        C6307m LIZIZ2;
        if (PatchProxy.proxy(new Object[]{interactConfig}, this, LIZJ, false, 28).isSupported) {
            return;
        }
        Config.InteractMode interactMode = Config.InteractMode.VIDEO_TALK;
        if (LJJIIJZLJL().isVideoCameraVersion()) {
            interactMode = Config.InteractMode.VIDEO_TALK_CAMERA;
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJJZZIII = LJJJI.LJJZZIII()) != null && (LIZIZ = LJJZZIII.LIZIZ()) != null && (LIZIZ2 = LIZIZ.LIZIZ()) != null && LIZIZ2.LIZIZ == 12) {
            interactMode = Config.InteractMode.EQUAL_TALK_ROOM;
        }
        if (interactConfig == null) {
            return;
        }
        interactConfig.setBackgroundColor("#1F212C");
        interactConfig.setInteractMode(interactMode);
        interactConfig.setVolumeCallbackInterval(300);
        interactConfig.setCharacter(Config.Character.GUEST);
        interactConfig.setType(Config.Type.VIDEO);
        interactConfig.setSeiVersion(8);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4765af
    public final void LIZ(HAA haa) {
        if (PatchProxy.proxy(new Object[]{haa}, this, LIZJ, false, 34).isSupported) {
            return;
        }
        C106862S5w.LIZ(haa);
        if (!LJJIII()) {
            return;
        }
        if (C5056a.LIZJ.LJFF() && haa.LIZLLL <= 0 && haa.f6620LJ == 0) {
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "");
            C116971W2r.LIZJ(new DialogC77935Gnx(context, haa));
            return;
        }
        HBQ LJJII = LJJII();
        if (LJJII == null) {
            return;
        }
        long LIZ = haa.LIZ();
        long LIZIZ = haa.LIZIZ();
        String LIZJ2 = haa.LIZJ();
        Intrinsics.checkNotNullExpressionValue(LIZJ2, "");
        LJJII.LIZ(LIZ, LIZIZ, LIZJ2, 16, haa.LIZLLL, haa.f6620LJ, haa.LJI);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAdminLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4797h
    public final void LIZ(long j, C6068x c6068x) {
        if (PatchProxy.proxy(new Object[]{new Long(j), c6068x}, this, LIZJ, false, 35).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6068x);
        super.LIZ(j, c6068x);
        AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs = this.LJJJLL;
        if (abstractC78986HBs == null) {
            return;
        }
        abstractC78986HBs.LJFF(j);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4765af
    public final void LIZ(LinkPlayerInfo linkPlayerInfo) {
        if (PatchProxy.proxy(new Object[]{linkPlayerInfo}, this, LIZJ, false, 36).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkPlayerInfo);
        User LIZ = linkPlayerInfo.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        LIZ(LIZ);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4765af
    public final void LIZ(long j, String str) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str}, this, LIZJ, false, 37).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        super.LIZ(j, str, "admin_stop_normal");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final void LIZ(long j, AbstractC79093HFv abstractC79093HFv) {
        HHA hha;
        if (PatchProxy.proxy(new Object[]{new Long(j), abstractC79093HFv}, this, LIZJ, false, 38).isSupported) {
            return;
        }
        if (j == ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ() && ((hha = this.LJIIZILJ) == null || !hha.LJI)) {
            C88440Kt0.LIZ(2131585502);
            return;
        }
        this.LJLJLLL = false;
        HDI hdi = this.LJJJLIIL;
        if (hdi == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hdi.LIZ(j, abstractC79093HFv);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final void LIZ(int i, int i2, String str, LinkApplyType linkApplyType, AbstractC4264a abstractC4264a) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, linkApplyType, abstractC4264a}, this, LIZJ, false, 40).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        C78352Gug.LIZ(this, i, i2, str, "", null, linkApplyType, abstractC4264a, 16, null);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final void LIZ(int i, int i2, String str, String str2, Integer num, LinkApplyType linkApplyType, AbstractC4264a abstractC4264a) {
        C5923dp LJJJI;
        C2WC<Integer> LLFFF;
        Integer LIZ;
        int intValue;
        String str3;
        LinkApplyType linkApplyType2 = linkApplyType;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, str2, num, linkApplyType2, abstractC4264a}, this, LIZJ, false, 41).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        this.LIZLLL = i;
        this.LJJJJL = i2;
        this.LJJJJLI = str;
        this.f26463LJ = linkApplyType2 == null ? LinkApplyType.NORMAL : linkApplyType2;
        this.LJFF = LinkMatchType.NONE;
        this.LJI = str2;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 52).isSupported) {
            HashMap hashMap = new HashMap();
            hashMap.put("room_type", LJJIIJZLJL().getStreamType() == LiveMode.AUDIO ? "radio" : "video");
            hashMap.put("audience_connection_type", "voice");
            C4574547f LIZ2 = C4574547f.LIZ();
            C8668v c8668v = new C8668v();
            c8668v.LIZ("live_detail");
            c8668v.LIZIZ("live");
            c8668v.LJFF("click");
            LIZ2.LIZ("audience_connection_apply", hashMap, c8668v, C8668v.class, Room.class);
        }
        if (TextUtils.equals(str, "video_empty_stub_click")) {
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_LINK_GUEST_CLEAN_SCREEN_OPTIMIZE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue() && !PatchProxy.proxy(new Object[0], this, LIZJ, false, 53).isSupported && (LJJJI = LJJJI()) != null && (LLFFF = LJJJI.LLFFF()) != null && (LIZ = LLFFF.LIZ()) != null && (intValue = LIZ.intValue()) > 0) {
                HashMap hashMap2 = new HashMap();
                if (intValue == 1) {
                    str3 = "origin_mode";
                } else if (intValue != 2) {
                    str3 = intValue != 3 ? "unknown_mode" : "simple_mode";
                } else {
                    str3 = "pure_mode";
                }
                hashMap2.put("mode_type", str3);
                hashMap2.put("action_type", "click");
                hashMap2.put("connection_type", "video");
                C4574547f.LIZ().LIZ("livesdk_connection_click_under_screen_clear", hashMap2, new C8668v(), Room.class);
            }
        }
        C79007HCn LJII = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        int LIZJ2 = LIZJ(LIZLLL(C78467GwX.LIZ(2, LJII.LJIJ)));
        if (linkApplyType2 == null) {
            linkApplyType2 = LinkApplyType.NORMAL;
        }
        BaseGuestLinkWidget.LIZ(this, LIZJ2, i, 16, linkApplyType2, str, null, null, num, false, false, 0, abstractC4264a, 1888, null);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final void LIZ(int i, int i2, LinkApplyType linkApplyType, LinkMatchType linkMatchType, String str) {
        int LIZJ2;
        C2WC<VideoShowMode> LIZJ3;
        if (PatchProxy.proxy(new Object[]{-1, Integer.valueOf(i2), linkApplyType, linkMatchType, str}, this, LIZJ, false, 43).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkApplyType, linkMatchType, str);
        this.LIZLLL = -1;
        this.LJJJJL = i2;
        this.f26463LJ = linkApplyType;
        this.LJFF = linkMatchType;
        this.LJI = "";
        C79007HCn LJII = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        int LIZ = C78467GwX.LIZ(2, LJII.LJIJ);
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_BIG_PARTY_FAST_MATCH_AND_STRONG_REACH_AUDIO_APPLY;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            C4382d LIZ2 = C4382d.LIZLLL.LIZ();
            if (LIZ2 != null && (LIZJ3 = LIZ2.LIZJ()) != null) {
                LIZJ3.LIZ(VideoShowMode.AUDIO);
            }
            LIZJ2 = 2;
        } else {
            LIZJ2 = LIZJ(LIZ);
        }
        BaseGuestLinkWidget.LIZ(this, LIZJ2, -1, 16, linkApplyType, str, null, null, null, false, false, 0, null, 4064, null);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final void LIZ(int i, int i2, boolean z, boolean z2, int i3) {
        int LIZJ2;
        C2WC<VideoShowMode> LIZJ3;
        boolean z3 = false;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i3)}, this, LIZJ, false, 44).isSupported) {
            return;
        }
        C79007HCn LJII = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        int LIZ = C78467GwX.LIZ(2, LJII.LJIJ);
        if (z) {
            C4382d LIZ2 = C4382d.LIZLLL.LIZ();
            if (LIZ2 != null && (LIZJ3 = LIZ2.LIZJ()) != null) {
                LIZJ3.LIZ(VideoShowMode.AUDIO);
            }
            LIZJ2 = 2;
        } else {
            LIZJ2 = LIZJ(LIZLLL(LIZ));
        }
        C78537Gxf LIZ3 = C78536Gxe.LIZ();
        if (i > 0) {
            z3 = true;
        }
        LIZ3.LIZLLL = z3;
        C78536Gxe.LIZ().LIZ(z2, i3);
        BaseGuestLinkWidget.LIZ(this, LIZJ2, -1, 16, LinkApplyType.NORMAL, "paid_link", Integer.valueOf(i), Integer.valueOf(i2), null, z, z2, i3, null, 2176, null);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final void LIZ(int i, int i2, int i3, String str) {
        C4382d LIZ;
        C2WC<VideoShowMode> LIZJ2;
        if (PatchProxy.proxy(new Object[]{-1, 2, Integer.valueOf(i3), str}, this, LIZJ, false, 45).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LIZLLL = -1;
        this.LJJJJL = i3;
        this.LJJJJLI = str;
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_VIDEO_TALK_ROOM_BID_APPLY_USE_AUDIO;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue() && C4378a.LJJIJIL.LIZJ() && (LIZ = C4382d.LIZLLL.LIZ()) != null && (LIZJ2 = LIZ.LIZJ()) != null) {
            LIZJ2.LIZ(VideoShowMode.AUDIO);
        }
        BaseGuestLinkWidget.LIZ(this, 2, -1, 16, LinkApplyType.NORMAL, str, null, null, null, false, false, 0, null, 4064, null);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget
    public final void LIZ(int i, int i2, int i3, LinkApplyType linkApplyType, String str, Integer num, Integer num2, Integer num3, boolean z, boolean z2, int i4, AbstractC4264a abstractC4264a) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), linkApplyType, str, num, num2, num3, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i4), abstractC4264a}, this, LIZJ, false, 48).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkApplyType, str);
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = i;
        ALogger.m15795w("ttlive_link_video", "checkAndApply linkType:" + i + " pos:" + i2 + " applyType:" + linkApplyType + LoggerUtil.BLANK_TAG + str);
        LIZ(OperateType.APPLY, intRef.element, new C79003HCj(this, i, linkApplyType, num3, i2, str, intRef, i3, num, num2, z, z2, i4, abstractC4264a));
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget
    public final void LIZIZ(long j, String str, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZJ, false, 49).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (i == ReplyType.Reject.ordinal()) {
            C78999HCf c78999HCf = this.LJIILL;
            if (c78999HCf == null) {
                return;
            }
            c78999HCf.LIZ(j, str, i, i2);
            return;
        }
        LIZ(OperateType.REPLY, i2, new HDD(this, i2, j, str, i));
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final void LIZ(long j, String str, int i, int i2) {
        C2WC<VideoShowMode> LIZJ2;
        VideoShowMode videoShowMode;
        if (PatchProxy.proxy(new Object[]{new Long(j), str, Integer.valueOf(i), 2}, this, LIZJ, false, 54).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJJIZ = false;
        int LIZ = C77562Ghw.LIZ(LIZJ(LIZLLL(2)), C79242HLo.LJIIJ());
        C4382d LIZ2 = C4382d.LIZLLL.LIZ();
        if (LIZ2 != null && (LIZJ2 = LIZ2.LIZJ()) != null) {
            if (LIZ == 1) {
                ALogger.m15795w("KtvDigitAvatar", "link invite reply，reset show mode to video mode");
                videoShowMode = VideoShowMode.VIDEO;
            } else {
                ALogger.m15795w("KtvDigitAvatar", "link invite reply，reset show mode to audio mode");
                videoShowMode = VideoShowMode.AUDIO;
            }
            LIZJ2.LIZ(videoShowMode);
        }
        LIZIZ(j, str, i, LIZ);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final void LIZ(boolean z, List<AnchorLinkUser> list, long j, Map<Long, ? extends RoomLinkerContent> map) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), list, new Long(j), map}, this, LIZJ, false, 56).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        LIZ(!z ? 1 : 0, "self_panel");
        C448383oO c448383oO = this.LJJLIIIJL;
        if (c448383oO != null) {
            c448383oO.LIZIZ(!z);
        }
        LIZ().LIZ(list, j, z ? "silence" : "unSilence", map);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final void LIZ(int i, boolean z) {
        C4949a LIZIZ;
        C2WC<Boolean> LIZLLL;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZJ, false, 57).isSupported) {
            return;
        }
        if (C4949a.f26454LJ.LJI() && (LIZIZ = C4949a.f26454LJ.LIZIZ()) != null && (LIZLLL = LIZIZ.LIZLLL()) != null) {
            LIZLLL.LIZ(Boolean.TRUE);
        }
        this.LJJJJLL = i;
        this.LJJJJZ = z;
        this.LJIIJ = true;
        if (i == 203) {
            LJFF("limit_time_up");
        } else {
            LJFF("leave_normally");
        }
        ALogger.m15797i("ttlive_link", "videoTalk disconnect source=" + i + " isTurningOff=" + this.LJJJJZI);
        if (this.LJJJJZI) {
            return;
        }
        this.LJJJJZI = true;
        HHA hha = this.LJIIZILJ;
        if (hha != null) {
            hha.LIZ();
        }
        C81980ISw c81980ISw = this.LJJ;
        if (c81980ISw == null) {
            return;
        }
        c81980ISw.LIZJ();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    public final void LIZ(C8874fl c8874fl) {
        C4949a LIZIZ;
        C2WC<Boolean> LIZLLL;
        if (PatchProxy.proxy(new Object[]{c8874fl}, this, LIZJ, false, 58).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8874fl);
        C9518ac c9518ac = c8874fl.LJIIJJI;
        String str = null;
        this.LJJIJIL = c9518ac != null ? String.valueOf(c9518ac.LIZJ) : null;
        C9518ac c9518ac2 = c8874fl.LJIIJJI;
        if (c9518ac2 != null) {
            str = String.valueOf(c9518ac2.LIZIZ);
        }
        this.LJJIJL = str;
        if (C4949a.f26454LJ.LJI() && (LIZIZ = C4949a.f26454LJ.LIZIZ()) != null && (LIZLLL = LIZIZ.LIZLLL()) != null) {
            LIZLLL.LIZ(Boolean.TRUE);
        }
        super.LIZ(c8874fl);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    public final void LIZIZ(C8874fl c8874fl) {
        C4949a LIZIZ;
        C2WC<Boolean> LIZLLL;
        if (PatchProxy.proxy(new Object[]{c8874fl}, this, LIZJ, false, 59).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8874fl);
        C9518ac c9518ac = c8874fl.LJIIJJI;
        String str = null;
        this.LJJIJIL = c9518ac != null ? String.valueOf(c9518ac.LIZJ) : null;
        C9518ac c9518ac2 = c8874fl.LJIIJJI;
        if (c9518ac2 != null) {
            str = String.valueOf(c9518ac2.LIZIZ);
        }
        this.LJJIJL = str;
        if (C4949a.f26454LJ.LJI() && (LIZIZ = C4949a.f26454LJ.LIZIZ()) != null && (LIZLLL = LIZIZ.LIZLLL()) != null) {
            LIZLLL.LIZ(Boolean.TRUE);
        }
        super.LIZIZ(c8874fl);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    public final void LIZ(C8870fj c8870fj) {
        if (PatchProxy.proxy(new Object[]{c8870fj}, this, LIZJ, false, 61).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8870fj);
        ALogger.m15797i("ttlive_link_paid", "paidLinkConfigChanged " + c8870fj);
        C8870fj.C8871a c8871a = c8870fj.LIZJ;
        if (c8871a == null) {
            return;
        }
        if (c8871a.LIZ) {
            C79046HEa LIZ = C79046HEa.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            if (LIZ.LIZLLL()) {
                C78999HCf c78999HCf = this.LJIILL;
                if (c78999HCf != null) {
                    c78999HCf.LIZIZ("paid_change");
                }
                String str = c8871a.LIZIZ;
                if (str != null && str.length() != 0) {
                    C88440Kt0.LIZ(c8871a.LIZIZ);
                }
            }
        }
        AbstractC4054j abstractC4054j = this.LJJLIIIIJ;
        if (abstractC4054j == null) {
            return;
        }
        abstractC4054j.dismiss();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final void LIZ(SurfaceView surfaceView) {
        if (PatchProxy.proxy(new Object[]{surfaceView}, this, LIZJ, false, 64).isSupported) {
            return;
        }
        C106862S5w.LIZ(surfaceView);
        AbstractC4964m abstractC4964m = this.LJII;
        if (abstractC4964m == null) {
            return;
        }
        C79007HCn LJII = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        abstractC4964m.LIZ(LJII.LIZ(), surfaceView);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, p003X.AbstractC78977HBj
    public final void LIZ(C6095af c6095af) {
        if (PatchProxy.proxy(new Object[]{c6095af}, this, LIZJ, false, 65).isSupported) {
            return;
        }
        super.LIZ(c6095af);
        C79046HEa.LIZ().LIZ((Integer) 0);
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 82).isSupported) {
            Runnable runnable = this.LJJI;
            if (runnable != null) {
                runnable.run();
            }
            this.LJJI = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c6095af != null ? Integer.valueOf(c6095af.f26867LJ) : "");
        this.LJJIJIL = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c6095af != null ? Integer.valueOf(c6095af.LIZLLL) : "");
        this.LJJIJL = sb2.toString();
        C79007HCn LJII = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        LJII.LJIJI = "";
        this.dataCenter.put("DATA_DISCONNECT_LINK", Boolean.TRUE);
        AbstractC4964m abstractC4964m = this.LJII;
        if (abstractC4964m != null) {
            abstractC4964m.LJIIIZ();
        }
        this.LJJJJZI = false;
        this.LJLJI = false;
        if (this.LJJJJZ) {
            if (Intrinsics.areEqual(this.LJIJJ, "limit_time_up")) {
                C88440Kt0.LIZ(2131585492);
            } else if (this.LJIIJ) {
                C88440Kt0.LIZ(LK5.LIZ(2131588218));
            } else if (C78538Gxg.LIZIZ.LJIILJJIL()) {
                C88440Kt0.LIZ(LK5.LIZ(2131585438));
            } else {
                C88440Kt0.LIZ(LK5.LIZ(2131588237));
            }
            if (c6095af != null && c6095af.LIZ == 1) {
                LJIIIZ("leave");
            }
        }
        this.dataCenter.put("DATA_DISCONNECT_LINK_BYSELF", Boolean.valueOf(this.LJIIJ));
        VideoTalkRoomPermissionCheckWidget videoTalkRoomPermissionCheckWidget = this.LJJIJIIJIL;
        if (videoTalkRoomPermissionCheckWidget != null) {
            videoTalkRoomPermissionCheckWidget.LIZIZ();
        }
        this.LJJJJZ = true;
        HKC linkEffectHelper = ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).linkEffectHelper();
        if (linkEffectHelper != null) {
            linkEffectHelper.LIZIZ();
        }
        HK5 hk5 = this.LJJIJIIJI;
        if (hk5 == null) {
            return;
        }
        hk5.dismiss();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, p003X.AbstractC78977HBj
    public final void LIZIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZJ, false, 66).isSupported) {
            return;
        }
        super.LIZIZ(th);
        this.LJJJJZI = false;
        if (!isViewValid()) {
            return;
        }
        C88469KtT.LIZ(getContext(), th, 2131585594);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    public final void LIZ(String str, Throwable th) {
        if (PatchProxy.proxy(new Object[]{str, th}, this, LIZJ, false, 68).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (Intrinsics.areEqual(str, "paid_change")) {
            return;
        }
        C88469KtT.LIZ(getContext(), th, 2131585594);
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0364, code lost:
        if (r10 != null) goto L138;
     */
    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(com.bytedance.android.livesdk.chatroom.model.C6119b r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 1174
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomGuestWidget.LIZ(com.bytedance.android.livesdk.chatroom.model.b, int, int):void");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    public final void LIZJ(Throwable th) {
        ChatMatchWidget chatMatchWidget;
        AbstractC4774i LIZ;
        if (!PatchProxy.proxy(new Object[]{th}, this, LIZJ, false, 71).isSupported && isViewValid()) {
            if (th instanceof ApiServerException) {
                ApiServerException apiServerException = (ApiServerException) th;
                if (apiServerException.mErrorCode == 4004091 && C78538Gxg.LJI()) {
                    LJJIL();
                    return;
                }
                if (apiServerException.mErrorCode == 4004090 && (LIZ = AbstractC78050Gpo.LIZ()) != null) {
                    LIZ.LJIIL();
                }
                C88440Kt0.LIZ(apiServerException.mPrompt);
                if (apiServerException.mErrorCode != 31101 || (chatMatchWidget = this.LJJIIZ) == null) {
                    return;
                }
                ChatMatchWidget.LIZ(chatMatchWidget, null, null, false, false, null, null, 60, null);
                return;
            }
            C88469KtT.LIZ(this.context, th, LK5.LIZ(2131585441));
        }
    }

    public final void LIZIZ(boolean z) {
        Boolean first;
        Integer valueOf;
        boolean z2 = true;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZJ, false, 75).isSupported) {
            return;
        }
        StringBuilder sb = new StringBuilder("onIsSingerChanged ");
        sb.append(z);
        sb.append(" mute=");
        HDI hdi = this.LJJJLIIL;
        if (hdi == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        sb.append(hdi.LIZ());
        sb.append(" shouldRestore=");
        sb.append(this.LJLJI);
        sb.append(" isOnBackground=");
        sb.append(this.LJJIFFI);
        sb.append(" rtcOn=");
        sb.append(LJIIIZ());
        ALogger.m15797i("video_talk", sb.toString());
        if (!LJIIIZ()) {
            return;
        }
        Integer num = null;
        if (z) {
            HDI hdi2 = this.LJJJLIIL;
            if (hdi2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(hdi2.LIZ());
            }
            if (valueOf.intValue() != 0 && !this.LJJIFFI) {
                HDI hdi3 = this.LJJJLIIL;
                if (hdi3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    hdi3.LIZ(C79242HLo.LIZ());
                }
                this.LJLJI = true;
            } else {
                this.LJLJI = false;
            }
        } else if (this.LJLJI) {
            C79046HEa LIZ = C79046HEa.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            Integer num2 = (Integer) LIZ.LJJIIZI;
            if (num2 != null && num2.intValue() == 2) {
                HDI hdi4 = this.LJJJLIIL;
                if (hdi4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    hdi4.LIZIZ();
                }
                if (this.LJJIFFI) {
                    this.dataCenter.put("data_talk_room_capture_audio_notification_show_state", Boolean.FALSE);
                }
            }
            this.LJLJI = false;
        }
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        int currentScene = ((IInteractService) service).getCurrentScene();
        ALogger.m15797i("video_talk", "curScene:" + currentScene);
        if (currentScene != 13) {
            if (z) {
                AbstractC2885g abstractC2885g = this.LJJII;
                if (abstractC2885g != null && abstractC2885g.getVideoCapture() == 0) {
                    AbstractC2885g abstractC2885g2 = this.LJJII;
                    if (abstractC2885g2 != null) {
                        abstractC2885g2.setVideoCapture(5);
                    }
                    ALogger.m15797i("video_talk", "video ktv startVideoCapture");
                    AbstractC2885g abstractC2885g3 = this.LJJII;
                    if (abstractC2885g3 != null) {
                        abstractC2885g3.LIZ();
                    }
                }
                HHA hha = this.LJIIZILJ;
                if (hha != null) {
                    hha.LIZ(false);
                }
                HHA hha2 = this.LJIIZILJ;
                if (hha2 != null) {
                    HHA.LIZ(hha2, true, null, 2, null);
                }
                Pair<Boolean, String> pair = this.LJLJJL;
                if (pair != null && (first = pair.getFirst()) != null) {
                    boolean booleanValue = first.booleanValue();
                    HHA hha3 = this.LJIIZILJ;
                    if (hha3 != null) {
                        hha3.LIZIZ(booleanValue);
                    }
                }
            } else {
                AbstractC2885g abstractC2885g4 = this.LJJII;
                if (abstractC2885g4 != null && abstractC2885g4.getVideoCapture() == 5) {
                    AbstractC2885g abstractC2885g5 = this.LJJII;
                    if (abstractC2885g5 != null) {
                        abstractC2885g5.setVideoCapture(0);
                    }
                    HHA hha4 = this.LJIIZILJ;
                    if (hha4 != null) {
                        AbstractC2885g abstractC2885g6 = this.LJJII;
                        if (abstractC2885g6 == null || abstractC2885g6.mo15919LJ()) {
                            z2 = false;
                        }
                        hha4.LIZ(z2);
                    }
                }
                Pair<Boolean, String> pair2 = this.LJLJJL;
                Boolean first2 = pair2 != null ? pair2.getFirst() : null;
                Pair<Boolean, String> pair3 = this.LJLJJL;
                String second = pair3 != null ? pair3.getSecond() : null;
                if (first2 != null && second != null) {
                    boolean booleanValue2 = first2.booleanValue();
                    HHA hha5 = this.LJIIZILJ;
                    if (hha5 != null) {
                        hha5.LIZ(booleanValue2, second);
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder("video ktv VideoCapture： ");
        AbstractC2885g abstractC2885g7 = this.LJJII;
        if (abstractC2885g7 != null) {
            num = Integer.valueOf(abstractC2885g7.getVideoCapture());
        }
        sb2.append(num);
        ALogger.m15797i("video_talk", sb2.toString());
    }

    public final boolean LIZ(Runnable runnable, boolean z) {
        MutableLiveData<C6192s> mutableLiveData;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{runnable, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZJ, false, 81);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C5074d c5074d = (C5074d) IQV.LIZ(ChatMatchWidget.LJI, C5074d.class);
        if (c5074d != null && (mutableLiveData = c5074d.LIZIZ) != null && mutableLiveData.getValue() != null) {
            return false;
        }
        AbstractC8644i LIZ = C4574547f.LIZ().LIZ(C8668v.class);
        if (LIZ instanceof C81173Hz5) {
            C81173Hz5 c81173Hz5 = (C81173Hz5) LIZ;
            String str = c81173Hz5.LIZLLL;
            if (str != null && TextUtils.equals(str, "true")) {
                return false;
            }
            String str2 = c81173Hz5.LJIIIZ;
            if (str2 != null && TextUtils.equals(str2, "true")) {
                return false;
            }
        }
        BidLinkMicWidget bidLinkMicWidget = this.LJJIIZI;
        if (bidLinkMicWidget != null && bidLinkMicWidget.LJIIJ()) {
            C79046HEa LIZ2 = C79046HEa.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            Integer num = (Integer) LIZ2.LJJIIZI;
            if (num != null && num.intValue() == 0) {
                BidLinkMicWidget bidLinkMicWidget2 = this.LJJIIZI;
                if (bidLinkMicWidget2 != null) {
                    bidLinkMicWidget2.LIZ(new VideoTalkRoomGuestWidget$interceptCloseRoom$1(this, runnable));
                }
                return true;
            }
        }
        C79046HEa LIZ3 = C79046HEa.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
        Integer num2 = (Integer) LIZ3.LJJIIZI;
        if (num2 == null || num2.intValue() != 0) {
            C79046HEa LIZ4 = C79046HEa.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ4, "");
            Integer num3 = (Integer) LIZ4.LJJIIZI;
            if (num3 != null && 2 == num3.intValue()) {
                new v$a(getContext(), 4).LIZLLL(2131585597).LIZIZ(0, 2131586570, new DialogInterface$OnClickListenerC79057HEl(this, runnable)).LIZIZ(1, 2131582393, HG6.LIZIZ).LIZJ();
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(long j, long j2) {
        if (PatchProxy.proxy(new Object[]{new Long(j), new Long(j2)}, this, LIZJ, false, 83).isSupported) {
            return;
        }
        super.LIZ(j, j2);
        HGZ hgz = this.LJJJI;
        if (hgz == null) {
            return;
        }
        hgz.LIZ(j, j2);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String[] strArr, boolean[] zArr, int[] iArr) {
        if (PatchProxy.proxy(new Object[]{strArr, zArr, iArr}, this, LIZJ, false, 84).isSupported) {
            return;
        }
        super.LIZ(strArr, zArr, iArr);
        AbstractC4964m abstractC4964m = this.LJII;
        if (abstractC4964m != null) {
            abstractC4964m.LIZ(strArr, zArr);
        }
        this.LJLLI.LIZ(strArr, zArr, iArr);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LIZJ, false, 86).isSupported) {
            return;
        }
        super.LIZ(j, exc);
        C88440Kt0.LIZ(2131585641);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
        if (r6 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZIZ(java.lang.String r15, boolean r16) {
        /*
            r14 = this;
            r0 = 2
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r3 = 0
            r4[r3] = r15
            java.lang.Byte r0 = java.lang.Byte.valueOf(r16)
            r2 = 1
            r4[r2] = r0
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomGuestWidget.LIZJ
            r0 = 98
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r4, r14, r1, r3, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L1a
            return
        L1a:
            X.HHA r0 = r14.LJIIZILJ
            if (r0 == 0) goto L82
            boolean r0 = r0.LJI
            if (r0 != r2) goto L82
            java.lang.Class<com.bytedance.android.livesdkapi.service.ILiveVideoFloatWindowService> r0 = com.bytedance.android.livesdkapi.service.ILiveVideoFloatWindowService.class
            com.bytedance.android.live.base.IService r0 = com.bytedance.android.live.utility.ServiceManager.getService(r0)
            com.bytedance.android.livesdkapi.service.ILiveVideoFloatWindowService r0 = (com.bytedance.android.livesdkapi.service.ILiveVideoFloatWindowService) r0
            boolean r3 = r0.isPipOpen()
            java.lang.Class<com.bytedance.android.livesdkapi.service.ILiveVideoFloatWindowService> r0 = com.bytedance.android.livesdkapi.service.ILiveVideoFloatWindowService.class
            com.bytedance.android.live.base.IService r0 = com.bytedance.android.live.utility.ServiceManager.getService(r0)
            com.bytedance.android.livesdkapi.service.ILiveVideoFloatWindowService r0 = (com.bytedance.android.livesdkapi.service.ILiveVideoFloatWindowService) r0
            boolean r1 = r0.isFloatOpen()
            android.content.Context r0 = r14.context
            android.app.Activity r6 = p003X.C439993ar.LIZ(r0)
            if (r1 == 0) goto L4d
            if (r3 != 0) goto L4d
            X.HHA r1 = r14.LJIIZILJ
            if (r1 == 0) goto L4d
            java.lang.String r0 = "onPause"
            r1.LIZIZ(r2, r0)
        L4d:
            java.lang.String r1 = ""
            if (r16 != 0) goto L83
            java.lang.Class<com.bytedance.android.live.liveinteract.api.IInteractService> r0 = com.bytedance.android.live.liveinteract.api.IInteractService.class
            com.bytedance.android.live.base.IService r0 = com.bytedance.android.live.utility.ServiceManager.getService(r0)
            com.bytedance.android.live.liveinteract.api.IInteractService r0 = (com.bytedance.android.live.liveinteract.api.IInteractService) r0
            boolean r0 = r0.enableCaptureAudioOnBackground(r2)
            if (r0 == 0) goto L83
            p003X.HH8.LJFF()
        L62:
            if (r6 == 0) goto L71
        L64:
            boolean r0 = r6.isFinishing()
            if (r0 != 0) goto L71
            X.HBs r0 = r14.LIZ()
            r0.LJIIIZ()
        L71:
            com.bytedance.android.live.broadcast.api.g.g r0 = r14.LJJII
            if (r0 == 0) goto L78
            r0.LIZIZ()
        L78:
            X.HCn r0 = p003X.C79007HCn.LJII()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            p003X.HH8.m23771LJ(r0, r15)
        L82:
            return
        L83:
            int r0 = r14.LJJJJIZL()
            if (r0 != 0) goto L62
            X.HHA r0 = r14.LJIIZILJ
            if (r0 == 0) goto L90
            r0.LIZJ()
        L90:
            if (r6 == 0) goto L71
            boolean r0 = r6.isFinishing()
            if (r0 != 0) goto L64
            r14.LJLJLLL = r2
            X.HBs r5 = r14.LIZ()
            java.lang.Class<com.bytedance.android.live.user.IUserService> r0 = com.bytedance.android.live.user.IUserService.class
            com.bytedance.android.live.base.IService r0 = com.bytedance.android.live.utility.ServiceManager.getService(r0)
            com.bytedance.android.live.user.IUserService r0 = (com.bytedance.android.live.user.IUserService) r0
            X.3VF r0 = r0.user()
            long r2 = r0.LIZIZ()
            X.HCn r0 = p003X.C79007HCn.LJII()
            java.lang.String r4 = r0.LIZLLL
            r0 = 3
            r5.LIZ(r2, r4, r0)
            X.HDI r7 = r14.LJJJLIIL
            if (r7 != 0) goto Lbf
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        Lbf:
            java.lang.Class<com.bytedance.android.live.user.IUserService> r0 = com.bytedance.android.live.user.IUserService.class
            com.bytedance.android.live.base.IService r0 = com.bytedance.android.live.utility.ServiceManager.getService(r0)
            com.bytedance.android.live.user.IUserService r0 = (com.bytedance.android.live.user.IUserService) r0
            X.3VF r0 = r0.user()
            long r8 = r0.LIZIZ()
            r10 = 1
            r11 = 0
            r12 = 4
            r13 = 0
            p003X.HDI.LIZ(r7, r8, r10, r11, r12, r13)
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomGuestWidget.LIZIZ(java.lang.String, boolean):void");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, ILayerControl.ILayer iLayer, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, iLayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZJ, false, 105).isSupported) {
            return;
        }
        ALogger.m15801d("link_room_fight", C0002O.m25085C("onFirstRemoteVideoFrame linkId ", str, " layer"));
        super.LIZ(str, iLayer, i, i2);
        AbstractC4964m abstractC4964m = this.LJII;
        if (abstractC4964m == null) {
            return;
        }
        abstractC4964m.LIZ(str, (View) null);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, SurfaceView surfaceView, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, surfaceView, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZJ, false, 106).isSupported) {
            return;
        }
        ALogger.m15801d("link_room_fight", C0002O.m25085C("onFirstRemoteVideoFrame linkId ", str, " surfaceview"));
        super.LIZ(str, surfaceView, i, i2);
        this.LJJIIJ.put(str, surfaceView);
        if (surfaceView != null) {
            surfaceView.setTag(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
        }
        AbstractC4964m abstractC4964m = this.LJII;
        if (abstractC4964m != null) {
            abstractC4964m.LIZ(str, surfaceView);
        }
        C79007HCn LJII = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        if (Intrinsics.areEqual(str, LJII.LIZ())) {
            this.LJJLIIIJILLIZJL.put(str, surfaceView);
            return;
        }
        C79007HCn LJII2 = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII2, "");
        C8681b LJIIIZ = LJII2.LJIIIZ();
        if (LJIIIZ == null || !Intrinsics.areEqual(str, LJIIIZ.LIZIZ)) {
            return;
        }
        this.LJJLIIIJILLIZJL.put(str, surfaceView);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, p003X.AbstractC78977HBj
    public final void LIZ(C5176i<C6094ae> c5176i) {
        AbstractC4964m abstractC4964m;
        if (PatchProxy.proxy(new Object[]{c5176i}, this, LIZJ, false, 107).isSupported) {
            return;
        }
        C106862S5w.LIZ(c5176i);
        super.LIZ(c5176i);
        HAY hay = this.LJJLIIIJ;
        if (hay != null) {
            hay.LIZJ = false;
        }
        C79007HCn LJII = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        if (!C78467GwX.LIZ(false, LJII.LJIJ)) {
            if (this.LJJIZ) {
                C88440Kt0.LIZ(2131585494);
            } else {
                C88440Kt0.LIZ(2131585664);
            }
        }
        C77680Gjq c77680Gjq = C77679Gjp.LIZJ;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        c77680Gjq.LIZ(context, c5176i.LIZJ.LIZIZ);
        SettingKey<C9650r> settingKey = LiveConfigSettingKeys.LIVE_AUDIO_LINK_INVITE_GUIDE_CONFIG_AUDIENCE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (settingKey.getValue().LIZ == 1 && (abstractC4964m = this.LJII) != null) {
            abstractC4964m.LJIILIIL();
        }
        ChatMatchWidget chatMatchWidget = this.LJJIIZ;
        if (chatMatchWidget == null) {
            return;
        }
        chatMatchWidget.LIZJ();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, p003X.AbstractC78977HBj
    public final void LIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZJ, false, 108).isSupported) {
            return;
        }
        super.LIZ(th);
        if (this.LJLL) {
            C88440Kt0.LIZ(2131585448);
        } else {
            C88469KtT.LIZ(this.context, th);
        }
    }

    public final void LIZ(int i, int i2, List<String> list, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), list, str}, this, LIZJ, false, 111).isSupported) {
            return;
        }
        AbstractC4054j abstractC4054j = this.LJJLIIIIJ;
        if (abstractC4054j != null && abstractC4054j.LJIILIIL()) {
            return;
        }
        SettingKey<C6858bo> settingKey = LiveSettingKeys.LINK_PAYMENT_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        String str2 = settingKey.getValue().LIZJ;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("live_type", "video_live");
        hashMap.put("paid_count", String.valueOf(i));
        hashMap.put("limit_time", String.valueOf(i2));
        C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.f6999aa;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        hashMap.put("reason_required", String.valueOf(c87308Kak.LIZ().intValue()));
        C87308Kak<String> c87308Kak2 = AbstractC80293Hkt.f7000ab;
        Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
        String LIZ = c87308Kak2.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        hashMap.put("reason_template_manual", LIZ);
        C87308Kak<String> c87308Kak3 = AbstractC80293Hkt.f7001ac;
        Intrinsics.checkNotNullExpressionValue(c87308Kak3, "");
        String LIZ2 = c87308Kak3.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        hashMap.put("reason_template_default", LIZ2);
        String joinToString$default = list != null ? CollectionsKt___CollectionsKt.joinToString$default(list, "|", null, null, 0, null, null, 62, null) : null;
        if (String.valueOf(joinToString$default).length() > 0) {
            hashMap.put("linkmic_tag", String.valueOf(joinToString$default));
        }
        if (str != null && str.length() > 0) {
            hashMap.put("paid_desc", str);
        }
        if (C78538Gxg.LIZ()) {
            hashMap.put("live_anonymous_paid_link_mic", "1");
        }
        String LIZIZ = C414642b4.LIZIZ(str2, hashMap);
        ALogger.m15797i("ttlive_link_paid", C0002O.m25086C("applySchema = ", LIZIZ));
        ((ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class)).handle(this.context, LIZIZ);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    public final void LIZ(C6160b c6160b, int i) {
        if (PatchProxy.proxy(new Object[]{c6160b, Integer.valueOf(i)}, this, LIZJ, false, 118).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6160b);
        super.LIZ(c6160b, i);
        AbstractC4254a LJJIIJ = LJJIIJ();
        if (!(LJJIIJ instanceof C79007HCn)) {
            LJJIIJ = null;
        }
        C79007HCn c79007HCn = (C79007HCn) LJJIIJ;
        if (c79007HCn != null) {
            c79007HCn.LJIIIZ = c6160b.LJI;
            c79007HCn.LJIIJJI = c6160b.LJII;
        }
        if (i != ReplyType.Agree.ordinal()) {
            return;
        }
        C88440Kt0.LIZ(2131584456);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4765af
    public final void LIZ(int i, String str, int i2, String str2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), str2}, this, LIZJ, false, 120).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (!((IUserService) ServiceManager.getService(IUserService.class)).user().LJI()) {
            return;
        }
        this.dataCenter.put("data_task_name_when_open_invite_panel", str2);
        this.LJIIIIZZ = C79220HKs.LIZ(this.dataCenter, this).LIZ(i, str, i2, LJJIIJZLJL());
        C79220HKs c79220HKs = this.LJIIIIZZ;
        if (c79220HKs == null) {
            return;
        }
        Context context = this.context;
        if (context != null) {
            c79220HKs.show(((FragmentActivity) context).getSupportFragmentManager(), "LinkDialog");
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4765af
    public final void LIZ(long j, long j2, boolean z) {
        if (PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZJ, false, OpenAuthTask.f22015g).isSupported) {
            return;
        }
        LIZ(z, j2);
        long currentTimeMillis = System.currentTimeMillis();
        this.LJJJLZIJ.add(((LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class)).setCPosition(j, j2, z ? 1 : 2).compose(C100839PnV.LIZJ()).subscribe(new C78306Gtw(j2, z, currentTimeMillis), new HDW<>(j2, z, currentTimeMillis, j)));
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final boolean LIZIZ(long j) {
        AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs;
        List<LinkPlayerInfo> LIZJ2;
        Object obj;
        User LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZJ, false, C1399n.f22430f);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C6307m LJJIJL = LJJIJL();
        if (C78653GzX.LIZ(LJJIJL != null ? LJJIJL.LIZLLL : 0) && (abstractC78986HBs = this.LJJJLL) != null && (LIZJ2 = abstractC78986HBs.LIZJ()) != null) {
            Iterator<T> it = LIZJ2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((LinkPlayerInfo) obj).LJJJI) {
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

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final void LIZ(String str, int i, String str2) {
        C79220HKs LIZIZ;
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), str2}, this, LIZJ, false, 126).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (!isViewValid()) {
            return;
        }
        this.dataCenter.put("data_task_name_when_open_invite_panel", str2);
        C79142HHs LIZ = C79220HKs.LIZ(this.dataCenter, this);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, LIZ, C79142HHs.LIZ, false, 3);
        if (proxy.isSupported) {
            LIZIZ = (C79220HKs) proxy.result;
        } else {
            LIZ.LJIIIIZZ = str;
            LIZ.LJFF = i;
            LIZIZ = LIZ.LIZIZ(17);
        }
        this.LJJL = LIZIZ;
        C79220HKs c79220HKs = this.LJJL;
        if (c79220HKs == null) {
            return;
        }
        Context context = this.context;
        if (context != null) {
            c79220HKs.show(((FragmentActivity) context).getSupportFragmentManager(), "LinkDialog");
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final void LIZIZ(long j, String str) {
        String str2;
        User LIZ;
        int i = 0;
        if (PatchProxy.proxy(new Object[]{new Long(j), str}, this, LIZJ, false, 127).isSupported) {
            return;
        }
        AbstractC78986HBs<LinkPlayerInfo> LJIIIIZZ = LJIIIIZZ();
        LinkPlayerInfo LIZ2 = LJIIIIZZ != null ? LJIIIIZZ.LIZ(j, "") : null;
        AbstractC4964m ae_ = ae_();
        if (ae_ != null) {
            if (LIZ2 == null || (LIZ = LIZ2.LIZ()) == null || (str2 = LIZ.getIdStr()) == null) {
                str2 = "";
            }
            i = ae_.LIZLLL(str2);
        }
        if (LIZ2 == null) {
            return;
        }
        C78684H0c c78684H0c = H0V.LJIILLIIL;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        if (str == null) {
            str = "seat";
        }
        H1U LIZ3 = c78684H0c.LIZ(context, dataCenter, LIZ2, str);
        LIZ3.LIZ(i);
        C116971W2r.LIZJ(LIZ3);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.camera.AbstractC4792e
    public final void LIZ(boolean z, boolean z2, boolean z3, boolean z4, AbstractC4791d abstractC4791d) {
        H7C<Object> LIZIZ;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Byte.valueOf(z4 ? (byte) 1 : (byte) 0), abstractC4791d}, this, LIZJ, false, 129).isSupported) {
            return;
        }
        if (z && z2) {
            if (abstractC4791d != null) {
                abstractC4791d.LIZ();
            }
            AbstractC2885g abstractC2885g = this.LJJII;
            if (abstractC2885g == null) {
                return;
            }
            abstractC2885g.LIZ(true);
            return;
        }
        AbstractC2885g abstractC2885g2 = this.LJJII;
        if (abstractC2885g2 != null && z == abstractC2885g2.mo15919LJ() && !z2) {
            return;
        }
        AbstractC2885g abstractC2885g3 = this.LJJII;
        if (abstractC2885g3 != null && z == abstractC2885g3.mo15919LJ() && !z2) {
            return;
        }
        C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f6959N;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Boolean LIZ = c87308Kak.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        if (LIZ.booleanValue() && !z4 && !PatchProxy.proxy(new Object[0], this, LIZJ, false, 131).isSupported) {
            HashMap hashMap = new HashMap();
            hashMap.put("live_type", "video_live");
            C78828H5q.LIZIZ(hashMap, (Integer) null, (Integer) null, 6, (Object) null);
            C78828H5q.LIZ(hashMap);
            hashMap.put("user_type", "guest");
            hashMap.put("button_type", LJIIZILJ() ? "off" : "on");
            Integer valueOf = Integer.valueOf(LJJIJLIJ());
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, BaseGuestLinkWidget.LJIILIIL, false, 46);
            List<KtvMusic> LIZ2 = C79242HLo.LIZ(proxy.isSupported ? ((Long) proxy.result).longValue() : ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ());
            C78828H5q.LIZ(hashMap, valueOf, !(LIZ2 == null || LIZ2.isEmpty()));
            hashMap.put("connect_type", this.LJLJJI.LIZIZ);
            if (Intrinsics.areEqual(this.LJLJJI.LIZIZ, "apply")) {
                int i = this.LJJJJL;
                if (i == C78832H5u.LIZIZ) {
                    hashMap.put("request_page", "seat");
                } else if (i == C78832H5u.LIZJ) {
                    hashMap.put("request_page", "bottom");
                } else if (i == C78832H5u.LIZLLL) {
                    hashMap.put("request_page", "popup");
                } else if (i == 111) {
                    hashMap.put("request_page", "top");
                } else if (i == 113) {
                    hashMap.put("request_page", "card");
                }
                if (this.LJLJLJ) {
                    hashMap.put("is_approve_needed", "0");
                } else {
                    hashMap.put("is_approve_needed", "1");
                }
            }
            C78828H5q.LIZ(hashMap, C79242HLo.LIZ());
            C4574547f.LIZ().LIZ("livesdk_audience_connection_user_camera_open_click", hashMap, C8668v.class, Room.class);
        }
        int i2 = z ? 1 : 2;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        C4825a c4825a = new C4825a(context, 16, OperateType.APPLY, i2, LJJIIJZLJL(), C79242HLo.LIZ(), null, null, 192);
        if (z3) {
            LIZIZ = C80517HoV.LIZ(false, 1, null);
        } else {
            LIZIZ = C80517HoV.LIZIZ();
        }
        LIZIZ.LIZ(c4825a, new C79010HCq(this, abstractC4791d, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb  */
    @Override // com.bytedance.android.live.liveinteract.plantform.camera.AbstractC4792e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(com.bytedance.android.live.liveinteract.digitavatar.videoavatar.VideoShowMode r30, com.bytedance.android.live.liveinteract.digitavatar.videoavatar.VideoShowMode r31, com.bytedance.android.live.liveinteract.plantform.camera.AbstractC4791d r32) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomGuestWidget.LIZ(com.bytedance.android.live.liveinteract.digitavatar.videoavatar.VideoShowMode, com.bytedance.android.live.liveinteract.digitavatar.videoavatar.VideoShowMode, com.bytedance.android.live.liveinteract.plantform.camera.d):void");
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p388c.AbstractC4911b
    public final void LIZ(AbstractC4912d abstractC4912d, AbstractC4912d abstractC4912d2, HFV hfv) {
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ;
        C6307m LIZIZ2;
        CircleInfo circleInfo;
        String str;
        if (PatchProxy.proxy(new Object[]{abstractC4912d, abstractC4912d2, hfv}, this, LIZJ, false, 138).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC4912d2, hfv);
        int i = abstractC4912d2.LIZIZ;
        List<Integer> list = null;
        if (abstractC4912d != null && abstractC4912d.LIZIZ != abstractC4912d2.LIZIZ) {
            LIZ().LIZ((List<LinkmicPositionItem>) null);
            HD9 hd9 = this.LJJLIIJ;
            if (hd9 != null) {
                hd9.LIZ(abstractC4912d.LIZIZ, i);
            }
        }
        LIZ(abstractC4912d, abstractC4912d2);
        HashMap hashMap = new HashMap();
        hashMap.put("live_type", "video_live");
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.LJJJJJ;
        long j2 = (currentTimeMillis - j) / 1000;
        long j3 = 0;
        if (j2 >= 0 && j > 0) {
            j3 = j2;
        }
        hashMap.put("duration", String.valueOf(j3));
        C78828H5q.LIZIZ(hashMap, Integer.valueOf(LJJIJLIJ()), (Integer) null, 4, (Object) null);
        C78828H5q.LIZ(hashMap, Boolean.valueOf(LJJJIL().m15688LJ()));
        if (this.LJJJJIZL) {
            hashMap.put("play_type", "video_friend");
            this.LJJJJIZL = false;
        }
        AbstractC4964m abstractC4964m = this.LJII;
        if (abstractC4964m != null && abstractC4964m.LJIIL()) {
            C77540Gha.LIZJ.LIZ(hashMap);
        }
        Room LJJIIJZLJL = LJJIIJZLJL();
        if (LJJIIJZLJL != null && (circleInfo = LJJIIJZLJL.circleInfo) != null && (str = circleInfo.circleName) != null) {
            hashMap.put("circle_name", str);
        }
        C78828H5q.LJFF.LJII(hashMap);
        C4806x c4806x = (C4806x) this.LJJJLL;
        String str2 = "1";
        if (c4806x != null) {
            hashMap.put("is_set_seat_name", c4806x.LJIILIIL() > 0 ? str2 : "0");
            hashMap.put("seat_num", String.valueOf(c4806x.LJIILIIL()));
        }
        C78828H5q.LIZ(hashMap, (VoiceLiveTheme) null, 2, (Object) null);
        AbstractC4964m abstractC4964m2 = this.LJII;
        if (abstractC4964m2 instanceof C80627HqH) {
            hashMap.put("grouppk_duration", String.valueOf(j3));
            hashMap.put("grouppk_stage", C78391GvJ.LIZIZ(((C80627HqH) abstractC4964m2).LJFF()));
        }
        C78828H5q.LIZIZ((Map) hashMap, false, 2, (Object) null);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC4912d, abstractC4912d2}, null, C78572GyE.LIZ, true, 6);
        if (!proxy.isSupported) {
            C106862S5w.LIZ(abstractC4912d2);
            if (abstractC4912d == null || abstractC4912d.LIZLLL() || abstractC4912d2.LIZLLL() || abstractC4912d.LIZJ() || abstractC4912d2.LIZJ() || abstractC4912d.m15688LJ() || abstractC4912d2.m15688LJ()) {
                return;
            }
        } else if (!((Boolean) proxy.result).booleanValue()) {
            return;
        }
        if (C78836H5y.LIZ(false, true)) {
            hashMap.put("is_pre_link", str2);
        } else {
            hashMap.put("is_pre_link", "0");
        }
        C5923dp LIZ = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ != null && (LJJZZIII = LIZ.LJJZZIII()) != null && (LIZIZ = LJJZZIII.LIZIZ()) != null && (LIZIZ2 = LIZIZ.LIZIZ()) != null) {
            list = LIZIZ2.LIZJ;
        }
        if (!C78571GyD.LIZIZ(list)) {
            str2 = "0";
        }
        hashMap.put("if_enlarge", str2);
        C4574547f.LIZ().LIZ("voice_room_watch_duration", hashMap, Room.class, C8668v.class, C3348d.class);
        this.LJJJJJ = System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x036d, code lost:
        if (((java.lang.Boolean) r6.result).booleanValue() != false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x036f, code lost:
        r2 = true;
        p003X.C4574547f.LIZ().LIZ("audience_voice_room_show", r3, com.bytedance.android.livesdkapi.depend.model.live.Room.class, com.bytedance.android.livesdk.log.model.C8668v.class, com.bytedance.android.live.broadcastgame.api.C3348d.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03c6, code lost:
        if (r4 == 13) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x040a, code lost:
        if (r25.m15688LJ() == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01aa, code lost:
        if (r8.LJIILL() == true) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023e  */
    @Override // com.bytedance.android.live.liveinteract.videotalk.p388c.AbstractC4911b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZIZ(com.bytedance.android.live.liveinteract.videotalk.p388c.AbstractC4912d r24, com.bytedance.android.live.liveinteract.videotalk.p388c.AbstractC4912d r25, p003X.HFV r26) {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomGuestWidget.LIZIZ(com.bytedance.android.live.liveinteract.videotalk.c.d, com.bytedance.android.live.liveinteract.videotalk.c.d, X.HFV):void");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final void LIZ(C9605p c9605p) {
        if (PatchProxy.proxy(new Object[]{c9605p}, this, LIZJ, false, MediaPlayer.MEDIA_PLAYER_OPTION_ABR_STREAM_INFO).isSupported) {
            return;
        }
        LJJJJI().LIZ(c9605p);
        C5011d LJJJJI = LJJJJI();
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        LJJJJI.LIZ(context, C78828H5q.LIZIZ(this.LJJJJL));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r0.LIZ().booleanValue() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
        if (((java.lang.Boolean) r2.result).booleanValue() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
        if (r0.LJII != true) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008d, code lost:
        if (r0.LJIIIIZZ != true) goto L24;
     */
    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(int r7, p003X.HK9 r8) {
        /*
            r6 = this;
            r0 = 2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r5 = 0
            r3[r5] = r0
            r1 = 1
            r3[r1] = r8
            com.bytedance.hotfix.base.ChangeQuickRedirect r2 = com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomGuestWidget.LIZJ
            r0 = 149(0x95, float:2.09E-43)
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r6, r2, r5, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L1a
            return
        L1a:
            int r2 = p003X.C79242HLo.LJIIJ()
            r0 = 12
            if (r2 == r0) goto L2e
            r0 = 8
            if (r2 == r0) goto L2e
            r0 = 13
            if (r2 == r0) goto L2e
            r0 = 16
            if (r2 != r0) goto Lb0
        L2e:
            if (r7 != r1) goto Lb0
            boolean r0 = p003X.C77562Ghw.LIZ()
            java.lang.String r4 = ""
            if (r0 != 0) goto L49
            X.Kak<java.lang.Boolean> r0 = p003X.AbstractC80293Hkt.f7140dI
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            java.lang.Object r0 = r0.LIZ()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lb0
        L49:
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.bytedance.hotfix.base.ChangeQuickRedirect r2 = com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomGuestWidget.LIZJ
            r0 = 148(0x94, float:2.07E-43)
            com.bytedance.hotfix.PatchProxyResult r2 = com.bytedance.hotfix.PatchProxy.proxy(r3, r6, r2, r5, r0)
            boolean r0 = r2.isSupported
            if (r0 == 0) goto L72
            java.lang.Object r0 = r2.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb0
        L61:
            X.HEa r0 = p003X.C79046HEa.LIZ()
            r0.LJI = r7
            X.HK5 r0 = r6.LJJIJIIJI
            if (r0 == 0) goto L90
            boolean r0 = r0.LJIILIIL()
            if (r0 != r1) goto L90
            return
        L72:
            X.HEa r0 = p003X.C79046HEa.LIZ()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            boolean r0 = r0.LIZLLL()
            if (r0 != 0) goto Lb0
            X.HCf r0 = r6.LJIILL
            if (r0 == 0) goto L87
            boolean r0 = r0.LJII
            if (r0 == r1) goto Lb0
        L87:
            X.HCf r0 = r6.LJIILL
            if (r0 == 0) goto L61
            boolean r0 = r0.LJIIIIZZ
            if (r0 == r1) goto Lb0
            goto L61
        L90:
            X.HFw r0 = p003X.HK5.LJIIIZ
            X.HK5 r2 = r0.LIZ(r8)
            r6.LJJIJIIJI = r2
            android.content.Context r0 = r6.context
            if (r0 == 0) goto La8
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            androidx.fragment.app.FragmentManager r1 = r0.getSupportFragmentManager()
            java.lang.String r0 = "InteractBeautyPreviewDialog"
            r2.show(r1, r0)
            return
        La8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r1.<init>(r0)
            throw r1
        Lb0:
            r8.LIZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomGuestWidget.LIZ(int, X.HK9):void");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final void LIZ(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZJ, false, 152).isSupported) {
            return;
        }
        HBQ LJJII = LJJII();
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        LJJII.LIZ(context, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r0 == false) goto L17;
     */
    @Override // com.bytedance.android.live.liveinteract.api.data.p341a.p342a.a$a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(p003X.C79400HRq r9) {
        /*
            r8 = this;
            r7 = 1
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r6 = 0
            r2[r6] = r9
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomGuestWidget.LIZJ
            r0 = 159(0x9f, float:2.23E-43)
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r8, r1, r6, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L13
            return
        L13:
            if (r9 != 0) goto L16
            return
        L16:
            com.bytedance.android.livesdk.chatroom.u.m r0 = r8.LJJIJL()
            if (r0 == 0) goto L6a
            int r4 = r0.LIZLLL
        L1e:
            X.HCk r5 = r8.LJLLJ
            java.lang.String r3 = ""
            if (r5 != 0) goto L27
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L27:
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r6] = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2[r7] = r0
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = p003X.C79004HCk.LIZ
            r0 = 6
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r5, r1, r6, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L45:
            if (r0 != 0) goto L56
        L47:
            X.HCk r1 = r8.LJLLJ
            if (r1 != 0) goto L4e
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L4e:
            X.HEH r0 = new X.HEH
            r0.<init>(r9, r4)
            r1.LIZ(r0)
        L56:
            com.bytedance.android.live.liveinteract.videotalk.ui.m r0 = r8.LJII
            if (r0 == 0) goto L5d
            r0.LIZ(r9)
        L5d:
            return
        L5e:
            p003X.C106862S5w.LIZ(r9)
            com.bytedance.android.live.liveinteract.videotalk.c.d r0 = r5.LIZIZ
            if (r0 == 0) goto L47
            boolean r0 = r0.LIZ(r9, r4)
            goto L45
        L6a:
            r4 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomGuestWidget.LIZ(X.HRq):void");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final void LIZ(int i, Integer num, String str, Boolean bool) {
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ;
        C6307m LIZIZ2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), num, str, bool}, this, LIZJ, false, 163).isSupported) {
            return;
        }
        ALogger.m15797i("ttlive_link_video", "try switchScene to scene=" + i + " uiLayout=" + num + " reason=" + str + ", current:" + LJJIJL());
        C6307m LJJIJL = LJJIJL();
        int i2 = LJJIJL != null ? LJJIJL.LIZIZ : 8;
        LJJIJL();
        C79004HCk c79004HCk = this.LJLLJ;
        if (c79004HCk == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (c79004HCk.LIZ(i, num)) {
            ALogger.m15800e("ttlive_link_video", "no switchScene, same layout " + LJJIJL() + LoggerUtil.BLANK_TAG + LJJJIL());
        } else if ((i == 8 || i == 13) && this.LJJIII.size() > 7) {
            C88440Kt0.LIZ(2131582414);
            HashMap hashMap = new HashMap();
            hashMap.put("live_type", "video_live");
            C5923dp LJJJI = LJJJI();
            C78828H5q.LIZIZ(hashMap, (LJJJI == null || (LJJZZIII = LJJJI.LJJZZIII()) == null || (LIZIZ = LJJZZIII.LIZIZ()) == null || (LIZIZ2 = LIZIZ.LIZIZ()) == null) ? null : Integer.valueOf(LIZIZ2.LIZIZ), (Integer) null, 4, (Object) null);
            C78828H5q.LIZ(hashMap);
            C4574547f.LIZ().LIZ("livesdk_anchor_audience_connection_layout_change_toast_show", hashMap, Room.class);
        } else if (this.LJJJIL) {
        } else {
            this.LJJJIL = true;
            long currentTimeMillis = System.currentTimeMillis();
            this.LJJJLZIJ.add(((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).switchScene(LJJIIJZLJL().getId(), LJJIIJZLJL().getId(), i2, i, num != null ? num.intValue() : 0, str).subscribeOn(Schedulers.m138io()).flatMap(HGP.LIZIZ).observeOn(AndroidSchedulers.mainThread()).subscribe(new HDA(this, i2, i, num, str, currentTimeMillis, bool), new HE7(this, i2, i, num, str, currentTimeMillis)));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m.AbstractC4965a
    public final void LIZ(String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZJ, false, 167).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        HHA hha = this.LJIIZILJ;
        if (hha == null) {
            return;
        }
        hha.LIZJ(str, z);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final void LIZIZ(String str, int i, String str2) {
        if (PatchProxy.proxy(new Object[]{str, 113, str2}, this, LIZJ, false, 172).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        C79046HEa LIZ = C79046HEa.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        Integer num = (Integer) LIZ.LJJIIZI;
        if (num != null) {
            if (num.intValue() == 2) {
                C88440Kt0.LIZ(2131584123);
            } else if (num.intValue() != 0) {
            } else {
                BidLinkMicWidget bidLinkMicWidget = this.LJJIIZI;
                if (bidLinkMicWidget != null && bidLinkMicWidget.LIZIZ()) {
                    BidLinkMicWidget bidLinkMicWidget2 = this.LJJIIZI;
                    if (bidLinkMicWidget2 == null) {
                        return;
                    }
                    bidLinkMicWidget2.mo15775LJ();
                    return;
                }
                C78352Gug.LIZ(this, -1, 113, str2, null, null, 24, null);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m.AbstractC4965a
    public final String LJJIJIIJI() {
        return this.LJLJJI.LIZIZ;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final boolean LJIIIZ() {
        HHA hha = this.LJIIZILJ;
        if (hha != null) {
            return hha.LJI;
        }
        return false;
    }

    private final String LJJJJLL() {
        if (this.LJIIJ) {
            int i = this.LJJJJLL;
            if (i != 201) {
                if (i == 202) {
                    return "bottom";
                }
                return null;
            }
            return "seat";
        }
        return null;
    }

    private final void LJJJLZIJ() {
        VideoPaidLinkWidget videoPaidLinkWidget;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 145).isSupported && (videoPaidLinkWidget = this.LJLIIIL) != null) {
            videoPaidLinkWidget.LJIIIZ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4765af
    public final HBQ LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 32);
        if (proxy.isSupported) {
            return (HBQ) proxy.result;
        }
        return LJJII();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final void LJFF() {
        AbstractC4054j abstractC4054j;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 33).isSupported && (abstractC4054j = this.LJJLIIIIJ) != null) {
            abstractC4054j.dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final void LJII() {
        C78999HCf c78999HCf;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 55).isSupported && (c78999HCf = this.LJIILL) != null) {
            c78999HCf.LIZIZ("cancel_application");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final SurfaceView LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 63);
        if (proxy.isSupported) {
            return (SurfaceView) proxy.result;
        }
        AbstractC4964m abstractC4964m = this.LJII;
        if (abstractC4964m != null) {
            return abstractC4964m.LJIIIIZZ();
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final AbstractC5436a LJIILIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 150);
        if (proxy.isSupported) {
            return (AbstractC5436a) proxy.result;
        }
        AbstractC2885g abstractC2885g = this.LJJII;
        if (abstractC2885g != null) {
            return abstractC2885g.getLiveStream();
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final void LJJIFFI() {
        AbstractC4964m abstractC4964m;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 173).isSupported && (abstractC4964m = this.LJII) != null) {
            abstractC4964m.LJIJI();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m.AbstractC4965a
    public final SurfaceView LJJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 156);
        if (proxy.isSupported) {
            return (SurfaceView) proxy.result;
        }
        return LJJIIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m.AbstractC4965a
    public final LiveCore LJJIJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 166);
        if (proxy.isSupported) {
            return (LiveCore) proxy.result;
        }
        AbstractC6070q abstractC6070q = this.LJIILLIIL;
        if (abstractC6070q != null) {
            return abstractC6070q.getLiveCore();
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p387b.a$a
    public final void ac_() {
        HHA hha;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 16).isSupported && (hha = this.LJIIZILJ) != null) {
            hha.LIZ(false, "live_end");
        }
    }

    private AbstractC4912d LJJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 3);
        if (proxy.isSupported) {
            return (AbstractC4912d) proxy.result;
        }
        C79004HCk c79004HCk = this.LJLLJ;
        if (c79004HCk == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        AbstractC4912d abstractC4912d = c79004HCk.LIZIZ;
        if (abstractC4912d == null) {
            return C79072HFa.LJII;
        }
        return abstractC4912d;
    }

    private int LJJJJIZL() {
        LinkPlayerInfo LIZIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 25);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs = this.LJJJLL;
        if (abstractC78986HBs != null && (LIZIZ = abstractC78986HBs.LIZIZ(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ(), C79007HCn.LJII().LIZLLL)) != null) {
            return LIZIZ.LJIIL;
        }
        return -1;
    }

    private final void LJJJJZI() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 114).isSupported) {
            return;
        }
        DialogC77887GnB dialogC77887GnB = this.LJJLI;
        if (dialogC77887GnB != null && dialogC77887GnB.isShowing()) {
            return;
        }
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        this.LJJLI = new DialogC77887GnB(context, dataCenter, new HF4(this));
        DialogC77887GnB dialogC77887GnB2 = this.LJJLI;
        if (dialogC77887GnB2 != null) {
            C116971W2r.LIZJ(dialogC77887GnB2);
        }
    }

    private final void LJJJLIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 115).isSupported) {
            return;
        }
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        C116971W2r.LIZJ(new DialogC77863Gmn(context, dataCenter));
    }

    private final boolean LJJJLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 136);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return Intrinsics.areEqual(LJJJIL(), C79074HFc.LJII);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget
    public final AbstractC78986HBs<LinkPlayerInfo> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 29);
        if (proxy.isSupported) {
            return (AbstractC78986HBs) proxy.result;
        }
        if (this.LJJJLL == null) {
            Room LJJIIJZLJL = LJJIIJZLJL();
            DataCenter dataCenter = this.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter, "");
            this.LJJJLL = new C4806x(LJJIIJZLJL, dataCenter, 8);
        }
        AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs = this.LJJJLL;
        if (abstractC78986HBs != null) {
            return abstractC78986HBs;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.plantform.base.ILinkUserInfoCenter<com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo>");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final int LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 62);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (LJIIIZ()) {
            return LJJJJIZL();
        }
        return -1;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final boolean LJIIL() {
        LiveCore liveCore;
        LiveCore.Builder builder;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 133);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC2885g abstractC2885g = this.LJJII;
        if (abstractC2885g == null || (liveCore = abstractC2885g.getLiveCore()) == null || (builder = liveCore.getBuilder()) == null || builder.getVideoCaptureDevice() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final HDJ LJIILJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 160);
        if (proxy.isSupported) {
            return (HDJ) proxy.result;
        }
        AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs = this.LJJJLL;
        if (abstractC78986HBs == null || this.dataCenter == null) {
            return null;
        }
        HDJ hdj = this.LJJLIIIJJI;
        if (hdj == null) {
            DataCenter dataCenter = this.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter, "");
            HDJ hdj2 = new HDJ(dataCenter, (C4806x) abstractC78986HBs, null, 4);
            this.LJJLIIIJJI = hdj2;
            return hdj2;
        }
        return hdj;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.camera.AbstractC4792e
    public final boolean LJIIZILJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 132);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC2885g abstractC2885g = this.LJJII;
        if (abstractC2885g == null || !abstractC2885g.mo15919LJ()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final void LJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 18).isSupported) {
            return;
        }
        ChatMatchWidget.LJIIIIZZ.LIZ("apply_panel");
        ChatMatchWidget chatMatchWidget = this.LJJIIZ;
        if (chatMatchWidget != null) {
            ChatMatchWidget.LIZ(chatMatchWidget, null, null, false, true, "apply_panel", null, 32, null);
        }
    }

    public final C6307m LJJIJL() {
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 1);
        if (proxy.isSupported) {
            return (C6307m) proxy.result;
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJJZZIII = LJJJI.LJJZZIII()) != null && (LIZIZ = LJJZZIII.LIZIZ()) != null) {
            return LIZIZ.LIZIZ();
        }
        return null;
    }

    public final int LJJIJLIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C79004HCk c79004HCk = this.LJLLJ;
        if (c79004HCk == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c79004HCk.LIZ();
    }

    public final void LJJIZ() {
        C79220HKs c79220HKs;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 116).isSupported) {
            return;
        }
        C79220HKs c79220HKs2 = this.LJIIIIZZ;
        if (c79220HKs2 != null && c79220HKs2.LJIILIIL() && (c79220HKs = this.LJIIIIZZ) != null) {
            c79220HKs.dismiss();
        }
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        C116971W2r.LIZJ(new DialogC78012GpC(context, dataCenter, this.LIZLLL, String.valueOf(this.LJJJJL)));
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final void onStop() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS).isSupported) {
            return;
        }
        super.onStop();
        SettingKey<Boolean> settingKey = LiveSettingKeys.INTERACT_ACTIVITY_PERMISSION_GUARANTOR_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            LJJJJ().LIZJ();
        }
    }

    private final Integer LJJJJJ() {
        List<LinkPlayerInfo> LIZJ2;
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 77);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs = this.LJJJLL;
        if (abstractC78986HBs != null && (LIZJ2 = abstractC78986HBs.LIZJ()) != null) {
            Iterator<T> it = LIZJ2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
                    Intrinsics.checkNotNullExpressionValue(linkPlayerInfo, "");
                    User LIZ = linkPlayerInfo.LIZ();
                    if (LIZ != null && LIZ.getId() == C79242HLo.LIZ()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) obj;
            if (linkPlayerInfo2 != null) {
                return Integer.valueOf(linkPlayerInfo2.LJIIJJI);
            }
        }
        return null;
    }

    private final String LJJJJJL() {
        C2WC<Boolean> LLJZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 78);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C78999HCf c78999HCf = this.LJIILL;
        if (c78999HCf != null && c78999HCf.LJIIJ) {
            return "game";
        }
        C78999HCf c78999HCf2 = this.LJIILL;
        if (c78999HCf2 != null && c78999HCf2.LJIIIZ) {
            return "anchor";
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LLJZ = LJJJI.LLJZ()) != null && LLJZ.LIZ().booleanValue()) {
            return "anchor";
        }
        return "audience";
    }

    private final void LJJJJZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 112).isSupported) {
            return;
        }
        AbstractC4054j abstractC4054j = this.LJJLIIIIJ;
        if (abstractC4054j != null && abstractC4054j.LJIILIIL()) {
            return;
        }
        SettingKey<C6858bo> settingKey = LiveSettingKeys.LINK_PAYMENT_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        String str = settingKey.getValue().LIZJ;
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("live_type", "video_live");
            int i = this.LJJJJL;
            if (i == C78832H5u.LIZIZ) {
                hashMap.put("request_page", "seat");
            } else if (i == C78832H5u.LIZJ) {
                hashMap.put("request_page", "bottom");
            } else if (i == 113) {
                hashMap.put("request_page", "card");
            }
            String LIZIZ = C414642b4.LIZIZ(str, hashMap);
            ALogger.m15797i("ttlive_link_paid", C0002O.m25086C("applySchema = ", LIZIZ));
            ((ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class)).handle(this.context, LIZIZ);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4804q
    public final void LJIJ() {
        LiveCore liveCore;
        AbstractC2885g abstractC2885g;
        boolean z = false;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 153).isSupported) {
            return;
        }
        super.LJIJ();
        HHA hha = this.LJIIZILJ;
        if (hha != null) {
            if (LJJIJLIJ() != 13 && !C79242HLo.LJIJJ() && (abstractC2885g = this.LJJII) != null && !abstractC2885g.mo15919LJ()) {
                z = true;
            }
            hha.LIZ(z);
        }
        if (this.LJJIFFI) {
            AbstractC2885g abstractC2885g2 = this.LJJII;
            if (abstractC2885g2 != null && (liveCore = abstractC2885g2.getLiveCore()) != null) {
                liveCore.stopVideoCapture();
            }
            C79007HCn LJII = C79007HCn.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII, "");
            HH8.m23771LJ(LJII, "background_start");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final String LJJ() {
        List<LinkPlayerInfo> LIZJ2;
        Object obj;
        User LIZ;
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 124);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C6307m LJJIJL = LJJIJL();
        if (LJJIJL != null) {
            i = LJJIJL.LIZLLL;
        }
        if (C78653GzX.LIZ(i)) {
            AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs = this.LJJJLL;
            if (abstractC78986HBs != null && (LIZJ2 = abstractC78986HBs.LIZJ()) != null) {
                Iterator<T> it = LIZJ2.iterator();
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
                if (linkPlayerInfo != null && (LIZ = linkPlayerInfo.LIZ()) != null && LIZ.getId() == LJJIIJZLJL().ownerUserId) {
                    return "anchor";
                }
                return "guest";
            }
            return "guest";
        }
        return "normal";
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p388c.e$a
    public final void ag_() {
        View findViewById;
        View findViewById2;
        View findViewById3;
        View findViewById4;
        View findViewById5;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 137).isSupported) {
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
        if (view3 != null && (findViewById3 = view3.findViewById(2131184133)) != null) {
            findViewById3.setVisibility(8);
        }
        View view4 = this.contentView;
        if (view4 != null && (findViewById2 = view4.findViewById(2131173812)) != null) {
            findViewById2.setVisibility(8);
        }
        View view5 = this.contentView;
        if (view5 != null && (findViewById = view5.findViewById(2131172771)) != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 97).isSupported) {
            return;
        }
        if (LJIIIZ()) {
            SettingKey<Boolean> settingKey = LiveSettingKeys.INTERACT_ACTIVITY_PERMISSION_GUARANTOR_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                LJJJJ().LIZIZ();
            }
            SettingKey<Boolean> settingKey2 = LiveSettingKeys.INTERACT_ACTIVITY_PERMISSION_GUARANTOR_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            if ((!settingKey2.getValue().booleanValue() || !LJJJJ().LJIIIIZZ) && !PatchProxy.proxy(new Object[]{this, "pause", (byte) 0, 2, null}, null, LIZJ, true, 99).isSupported) {
                LIZIZ("pause", false);
            }
        }
        this.LJJIFFI = true;
        super.onPause();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 100).isSupported) {
            return;
        }
        super.onResume();
        AbstractC4964m abstractC4964m = this.LJII;
        if (abstractC4964m != null) {
            abstractC4964m.LIZJ();
        }
        this.LJJIFFI = false;
        HHA hha = this.LJIIZILJ;
        if (hha != null && hha.LJI) {
            SettingKey<Boolean> settingKey = LiveSettingKeys.INTERACT_ACTIVITY_PERMISSION_GUARANTOR_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                LJJJJ().LIZ();
            }
            SettingKey<Boolean> settingKey2 = LiveSettingKeys.INTERACT_ACTIVITY_PERMISSION_GUARANTOR_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            if (!settingKey2.getValue().booleanValue() || (!LJJJJ().LJIIIIZZ && !LJJJJ().f26479LJ)) {
                LJIIIIZZ("resume");
            }
            this.dataCenter.put("cmd_interact_state_change", new C5984am(3));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public VideoTalkRoomGuestWidget() {
        /*
            r3 = this;
            X.HCn r0 = p003X.C79007HCn.LJII()
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r3.<init>(r0)
            int r0 = p003X.C78832H5u.LIZ
            r3.LJJJJL = r0
            r3.LJJJJLI = r2
            com.bytedance.android.live.liveinteract.api.chatroom.model.LinkApplyType r0 = com.bytedance.android.live.liveinteract.api.chatroom.model.LinkApplyType.NORMAL
            r3.f26463LJ = r0
            com.bytedance.android.live.liveinteract.api.chatroom.model.LinkMatchType r0 = com.bytedance.android.live.liveinteract.api.chatroom.model.LinkMatchType.NONE
            r3.LJFF = r0
            r3.LJI = r2
            r0 = 200(0xc8, float:2.8E-43)
            r3.LJJJJLL = r0
            r0 = 1
            r3.LJJJJZ = r0
            io.reactivex.disposables.CompositeDisposable r0 = new io.reactivex.disposables.CompositeDisposable
            r0.<init>()
            r3.LJJJLZIJ = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.LJJLIIIJILLIZJL = r0
            X.HRp r1 = new X.HRp
            r0 = r3
            r1.<init>(r0)
            r3.LJJLIIIJLLLLLLLZ = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.LJJIII = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.LJJLJ = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.LJJIIJ = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.LJJLJLI = r0
            com.bytedance.android.live.liveinteract.api.chatroom.model.LinkApplyType r0 = com.bytedance.android.live.liveinteract.api.chatroom.model.LinkApplyType.STRONG_REACH
            r3.LJJZZIII = r0
            X.H2m r1 = new X.H2m
            r0 = 0
            r1.<init>(r0)
            r3.LJJIJ = r1
            X.HFH r0 = new X.HFH
            r0.<init>()
            r3.LJLJJI = r0
            r3.LJJIJIL = r2
            r3.LJJIJL = r2
            r0 = -1
            r3.LJJIJLIJ = r0
            com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomGuestWidget$mInteractLiveCorePermissionGuarantor$2 r0 = new com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomGuestWidget$mInteractLiveCorePermissionGuarantor$2
            r0.<init>(r3)
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r0)
            r3.LJLJJLL = r0
            X.HEm r0 = new X.HEm
            r0.<init>(r3)
            r3.LJJIL = r0
            X.HCh r0 = new X.HCh
            r0.<init>(r3)
            r3.LJLJL = r0
            X.HE3 r0 = new X.HE3
            r0.<init>()
            r3.LJLLI = r0
            com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomGuestWidget$mGuestApplyDialog$2 r0 = new com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomGuestWidget$mGuestApplyDialog$2
            r0.<init>(r3)
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r0)
            r3.LJLLILLLL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomGuestWidget.<init>():void");
    }

    private final void LJJJJL() {
        Boolean bool;
        HHA hha;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 88).isSupported) {
            return;
        }
        String str = C79007HCn.LJII().LJII;
        StringBuilder sb = new StringBuilder("livecore version ");
        IService service = ServiceManager.getService(IBroadcastService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        sb.append(((IBroadcastService) service).getLiveCoreVersion());
        ALogger.m15801d("link_room_fight", sb.toString());
        StringBuilder sb2 = new StringBuilder("stopForwardStreamCrossRoom isEngineOn: ");
        HHA hha2 = this.LJIIZILJ;
        Boolean bool2 = null;
        if (hha2 != null) {
            bool = Boolean.valueOf(hha2.LJI);
        } else {
            bool = null;
        }
        sb2.append(bool);
        sb2.append(" isForwardCrossRoom: ");
        HHA hha3 = this.LJIIZILJ;
        if (hha3 != null) {
            bool2 = Boolean.valueOf(hha3.LJII);
        }
        sb2.append(bool2);
        sb2.append(" localInfo: ");
        sb2.append(str);
        ALogger.m15801d("link_room_fight", sb2.toString());
        HHA hha4 = this.LJIIZILJ;
        if (hha4 != null && hha4.LJI && (hha = this.LJIIZILJ) != null && hha.LJII) {
            C78627Gz7.LIZIZ.LIZIZ(str);
            HHA hha5 = this.LJIIZILJ;
            if (hha5 != null) {
                hha5.LIZLLL(str);
            }
            ALogger.m15801d("link_room_fight", "stopForwardStreamCrossRoom localInfo " + str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final void LJIL() {
        int LIZ;
        C2WC<VideoShowMode> LIZJ2;
        VideoShowMode videoShowMode;
        C2WC<VideoShowMode> LIZJ3;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 17).isSupported && !this.LJJLL && this.LJJZZI) {
            this.LJJLL = true;
            Disposable disposable = this.LJJZ;
            if (disposable != null) {
                disposable.dispose();
            }
            this.LJJZZI = false;
            SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_BIG_PARTY_FAST_MATCH_AND_STRONG_REACH_AUDIO_APPLY;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                C4382d LIZ2 = C4382d.LIZLLL.LIZ();
                if (LIZ2 != null && (LIZJ3 = LIZ2.LIZJ()) != null) {
                    LIZJ3.LIZ(VideoShowMode.AUDIO);
                }
                LIZ = 2;
            } else {
                LIZ = C77562Ghw.LIZ(2, C79242HLo.LJIIJ());
            }
            C4382d LIZ3 = C4382d.LIZLLL.LIZ();
            if (LIZ3 != null && (LIZJ2 = LIZ3.LIZJ()) != null) {
                if (LIZ != 1) {
                    if (LIZ != 2) {
                        ALogger.m15795w("KtvDigitAvatar", " auto apply set show_mode to audio");
                        videoShowMode = VideoShowMode.AUDIO;
                    } else {
                        ALogger.m15795w("KtvDigitAvatar", " auto apply set show_mode to audio");
                        videoShowMode = VideoShowMode.AUDIO;
                    }
                } else {
                    ALogger.m15795w("KtvDigitAvatar", " auto apply set show_mode to video by audience_default_open_camera");
                    videoShowMode = VideoShowMode.VIDEO;
                }
                LIZJ2.LIZ(videoShowMode);
            }
            BaseGuestLinkWidget.LIZ(this, LIZ, -1, 16, this.LJJZZIII, "video_auto_link_mic", null, null, null, false, false, 0, null, 4064, null);
        }
    }

    public final void LJJIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 110).isSupported) {
            return;
        }
        AbstractC4054j abstractC4054j = this.LJJLIIIIJ;
        if (abstractC4054j != null && abstractC4054j.LJIILIIL()) {
            return;
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_LYNX_PAYFORLINK_APPLY_PAYINFO_REQUEST;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            LJJJJZ();
        } else if (C4284f.LJIIIIZZ.LIZ()) {
            Intrinsics.checkNotNullExpressionValue(QB4.LIZ(((LinkPaidLinkApi) C88306Kqq.LIZ().LIZ(LinkPaidLinkApi.class)).getPaidInfoBeforeApply(LJJIIJZLJL().getId()).compose(C100839PnV.LIZJ()).subscribe(new C78540Gxi(this), GYW.LIZIZ), this.LJJJLZIJ), "");
        } else {
            LIZ(C4284f.LJIIIIZZ.m23796LJ(), C4284f.LJIIIIZZ.LJFF(), (List<String>) null, (String) null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fb, code lost:
        if (r1 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void LJJJJLI() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomGuestWidget.LJJJJLI():void");
    }

    public final void LJJJ() {
        LinkPlayerInfo LIZIZ;
        boolean z = false;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 117).isSupported && isViewValid() && this.context != null) {
            if (!((IUserService) ServiceManager.getService(IUserService.class)).user().LIZLLL()) {
                C3VF user = ((IUserService) ServiceManager.getService(IUserService.class)).user();
                Context context = this.context;
                QFD LIZ = C9284h.LIZ();
                LIZ.LIZ(LK5.LIZ(2131585539));
                LIZ.LIZJ("interact");
                LIZ.LIZ(0);
                user.LIZ(context, LIZ.LIZ()).compose(getAutoUnbindTransformer()).subscribe(new C81280I1y());
                return;
            }
            C79046HEa LIZ2 = C79046HEa.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            Integer num = (Integer) LIZ2.LJJIIZI;
            if (num != null && num.intValue() == 0) {
                BidLinkMicWidget bidLinkMicWidget = this.LJJIIZI;
                if (bidLinkMicWidget != null && bidLinkMicWidget.LIZIZ()) {
                    BidLinkMicWidget bidLinkMicWidget2 = this.LJJIIZI;
                    if (bidLinkMicWidget2 != null) {
                        bidLinkMicWidget2.mo15775LJ();
                        return;
                    }
                    return;
                }
                C79007HCn LJII = C79007HCn.LJII();
                Intrinsics.checkNotNullExpressionValue(LJII, "");
                C78467GwX.LIZ(2, LJII.LJIJ);
                C78352Gug.LIZ(this, -1, C78832H5u.LIZJ, "video_interact_icon_click", null, null, 24, null);
                return;
            }
            C79046HEa LIZ3 = C79046HEa.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
            Integer num2 = (Integer) LIZ3.LJJIIZI;
            if (num2 != null && 1 == num2.intValue()) {
                if (C5056a.LIZJ.LJIIIIZZ()) {
                    LJJJLIIL();
                    return;
                } else if (C77919Gnh.LIZ(LJJIIJZLJL())) {
                    LJJJJZI();
                    return;
                } else if (C77917Gnf.LIZ(LJJIIJZLJL())) {
                    LIZ((C9605p) null);
                    return;
                } else if (C77919Gnh.LIZ()) {
                    ChatMatchWidget chatMatchWidget = this.LJJIIZ;
                    if (chatMatchWidget != null) {
                        ChatMatchWidget.LIZ(chatMatchWidget, null, null, false, false, null, null, 60, null);
                        return;
                    }
                    return;
                } else {
                    Context context2 = this.context;
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    C116971W2r.LIZJ(new DialogC77870Gmu(context2, this.dataCenter, -1, false));
                    return;
                }
            }
            C79046HEa LIZ4 = C79046HEa.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ4, "");
            Integer num3 = (Integer) LIZ4.LJJIIZI;
            if (num3 != null && 2 == num3.intValue()) {
                AbstractC78986HBs<LinkPlayerInfo> LJIIIIZZ = LJIIIIZZ();
                if (LJIIIIZZ != null && (LIZIZ = LJIIIIZZ.LIZIZ(C79242HLo.LIZ(), C79007HCn.LJII().LIZLLL)) != null) {
                    DataCenter dataCenter = this.dataCenter;
                    if (LIZIZ.LJIIL != 0) {
                        z = true;
                    }
                    dataCenter.put("data_self_is_silenced", Boolean.valueOf(z));
                }
                BidLinkMicWidget bidLinkMicWidget3 = this.LJJIIZI;
                if (bidLinkMicWidget3 != null && bidLinkMicWidget3.LIZIZ()) {
                    BidLinkMicWidget bidLinkMicWidget4 = this.LJJIIZI;
                    if (bidLinkMicWidget4 != null) {
                        bidLinkMicWidget4.mo15775LJ();
                        return;
                    }
                    return;
                }
                IService service = ServiceManager.getService(IInteractService.class);
                Intrinsics.checkNotNullExpressionValue(service, "");
                if (((IInteractService) service).isEnableTalkRoomEmoji()) {
                    H05 h05 = new H05();
                    Context context3 = this.context;
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    H05 LIZ5 = h05.LIZ(context3);
                    DataCenter dataCenter2 = this.dataCenter;
                    Intrinsics.checkNotNullExpressionValue(dataCenter2, "");
                    C116971W2r.LIZJ(LIZ5.LIZ(dataCenter2).LIZ(true).LIZ("bottom").LIZ());
                    return;
                }
                Context context4 = this.context;
                Intrinsics.checkNotNullExpressionValue(context4, "");
                C116971W2r.LIZJ(new View$OnClickListenerC78344GuY(context4, null, false, ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ()).LIZ("bottom"));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: V_ */
    public final void mo15660V_() {
        boolean z;
        boolean z2;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        String str2;
        String str3;
        Object obj5;
        Object obj6;
        String str4;
        char c;
        String str5;
        String str6;
        Integer num;
        VoiceLiveTheme voiceLiveTheme;
        CircleInfo circleInfo;
        String str7;
        Long l;
        Long l2;
        BidLinkMicWidget bidLinkMicWidget;
        MessageBoardInfo messageBoardInfo;
        AbstractC5436a abstractC5436a;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ;
        C6307m LIZIZ2;
        LiveCore liveCore;
        ILayerControl layerControl;
        ILayerControl.ILayer localOriginLayer;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 87).isSupported) {
            return;
        }
        super.mo15660V_();
        C79007HCn LJII = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        C8681b LJIIIZ = LJII.LJIIIZ();
        if (LJIIIZ != null) {
            if (LJIIIZ.LIZJ) {
                HHA hha = this.LJIIZILJ;
                if (hha != null) {
                    String str8 = LJIIIZ.LIZIZ;
                    Intrinsics.checkNotNullExpressionValue(str8, "");
                    hha.LIZ(str8, false);
                }
                HHA hha2 = this.LJIIZILJ;
                if (hha2 != null) {
                    String str9 = LJIIIZ.LIZIZ;
                    Intrinsics.checkNotNullExpressionValue(str9, "");
                    hha2.LIZIZ(str9, false);
                }
                HHA hha3 = this.LJIIZILJ;
                if (hha3 != null) {
                    String LIZ = LJJIIJ().LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ, "");
                    hha3.LIZ(LIZ, true);
                }
                HHA hha4 = this.LJIIZILJ;
                if (hha4 != null) {
                    String LIZ2 = LJJIIJ().LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                    hha4.LIZIZ(LIZ2, true);
                }
            } else {
                HHA hha5 = this.LJIIZILJ;
                if (hha5 != null) {
                    String str10 = LJIIIZ.LIZIZ;
                    Intrinsics.checkNotNullExpressionValue(str10, "");
                    hha5.LIZ(str10, true);
                }
                HHA hha6 = this.LJIIZILJ;
                if (hha6 != null) {
                    String str11 = LJIIIZ.LIZIZ;
                    Intrinsics.checkNotNullExpressionValue(str11, "");
                    hha6.LIZIZ(str11, true);
                }
                HHA hha7 = this.LJIIZILJ;
                if (hha7 != null) {
                    String LIZ3 = LJJIIJ().LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                    hha7.LIZ(LIZ3, false);
                }
                HHA hha8 = this.LJIIZILJ;
                if (hha8 != null) {
                    String LIZ4 = LJJIIJ().LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                    hha8.LIZIZ(LIZ4, false);
                }
            }
        }
        AbstractC4964m abstractC4964m = this.LJII;
        if (abstractC4964m != null) {
            abstractC4964m.LJIIJ();
        }
        C6307m LJJIJL = LJJIJL();
        if (LJJIJL != null && LJJIJL.LIZIZ == 16) {
            LJJJJLI();
        }
        C79007HCn LJII2 = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII2, "");
        if (LJII2.LJIILLIIL) {
            LIZ(false, "match apply");
            C79007HCn LJII3 = C79007HCn.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII3, "");
            LJII3.LJIILLIIL = false;
        } else if (!LIZ().LIZJ(C79242HLo.LIZ())) {
            LIZ(true, "normal start");
        }
        if (C79007HCn.LJII().LJIIZILJ && this.LJJIFFI) {
            LIZIZ("isOnBackgroundWhenStart", true);
        }
        AbstractC2885g abstractC2885g = this.LJJII;
        if (abstractC2885g != null) {
            C79007HCn LJII4 = C79007HCn.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII4, "");
            String LIZIZ3 = LJII4.LIZIZ();
            if (LIZIZ3 == null) {
                LIZIZ3 = "";
            }
            LIZIZ(LIZIZ3, Boolean.valueOf(!abstractC2885g.mo15919LJ()));
            if (abstractC2885g.mo15919LJ()) {
                HashMap<String, View> hashMap = this.LJJIIJ;
                C79007HCn LJII5 = C79007HCn.LJII();
                Intrinsics.checkNotNullExpressionValue(LJII5, "");
                hashMap.put(LJII5.LIZIZ(), abstractC2885g.getSurfaceView());
                AbstractC4964m abstractC4964m2 = this.LJII;
                if (abstractC4964m2 != null) {
                    C79007HCn LJII6 = C79007HCn.LJII();
                    Intrinsics.checkNotNullExpressionValue(LJII6, "");
                    abstractC4964m2.LIZ(LJII6.LIZIZ(), abstractC2885g.getSurfaceView());
                }
            } else if (C79242HLo.LJIIIZ()) {
                VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
                videoMixerDescription.setLeft(1.0f);
                videoMixerDescription.setTop(1.0f);
                videoMixerDescription.setRight(1.1f);
                videoMixerDescription.setBottom(1.1f);
                videoMixerDescription.setVisibility(false);
                AbstractC6070q abstractC6070q = this.LJIILLIIL;
                if (abstractC6070q != null && (liveCore = abstractC6070q.getLiveCore()) != null && (layerControl = liveCore.getLayerControl()) != null && (localOriginLayer = layerControl.getLocalOriginLayer()) != null) {
                    localOriginLayer.updateDescription(videoMixerDescription);
                }
            }
            if (C79046HEa.LIZ().LJI == 1) {
                C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.LLF;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                Boolean LIZ5 = c87308Kak.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                if (LIZ5.booleanValue() && C78467GwX.LIZ()) {
                    C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.LLF;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                    c87308Kak2.LIZ(Boolean.FALSE);
                    C88440Kt0.LIZ(2131584147);
                }
            }
        }
        this.LJIIJ = false;
        this.LJJJJJL = System.currentTimeMillis();
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJJZZIII = LJJJI.LJJZZIII()) != null && (LIZIZ = LJJZZIII.LIZIZ()) != null && (LIZIZ2 = LIZIZ.LIZIZ()) != null) {
            C79004HCk c79004HCk = this.LJLLJ;
            if (c79004HCk == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            ALogger.m15800e("ttlive_link_video", "rtcStartSuccess switchScene:" + c79004HCk.LIZ(new HEI(LIZIZ2.LIZIZ, LIZIZ2.LIZLLL, "rtcStarted", null, 8)) + ", current:" + LJJIJL() + LoggerUtil.BLANK_TAG + LJJJIL());
        }
        if (C78538Gxg.LJI()) {
            ((AbstractC446093kh) ServiceManager.getService(AbstractC446093kh.class)).rechargeCenter().sync();
            AbstractC4054j abstractC4054j = this.LJJLIIIIJ;
            if (abstractC4054j != null) {
                abstractC4054j.dismiss();
            }
        }
        VideoDigitAvatarWidget videoDigitAvatarWidget = this.LJJJ;
        if (videoDigitAvatarWidget != null && !PatchProxy.proxy(new Object[0], videoDigitAvatarWidget, VideoDigitAvatarWidget.LIZ, false, 3).isSupported) {
            ALogger.m15797i("KtvDigitAvatar", "监听到rtc【开启】成功消息");
            DigitAvatarMsgController digitAvatarMsgController = videoDigitAvatarWidget.LIZLLL;
            if (digitAvatarMsgController == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            AbstractC4767ah LIZ6 = AbstractC4767ah.LIZIZ.LIZ();
            if (LIZ6 != null) {
                abstractC5436a = LIZ6.LJIILIIL();
            } else {
                abstractC5436a = null;
            }
            digitAvatarMsgController.LIZJ = abstractC5436a;
        }
        GuestBattleWidget guestBattleWidget = this.LJJIIJZLJL;
        if (guestBattleWidget != null) {
            guestBattleWidget.LJII();
        }
        C79007HCn LJII7 = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII7, "");
        String LIZIZ4 = LJII7.LIZIZ();
        if (LIZIZ4 != null && LIZIZ4.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            HE3.LIZ(this.LJLLI, LIZIZ4, false, 2, null);
        } else {
            this.LJLLI.LIZ();
        }
        HDJ LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null) {
            LJIILJJIL.LIZ();
        }
        LJII("rtcStartSuccess");
        C78999HCf mo15671LJ = mo15671LJ();
        if (mo15671LJ != null) {
            mo15671LJ.LIZ(true);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("live_type", "video_live");
        if (Intrinsics.areEqual(this.LJLJJI.LIZIZ, "apply")) {
            int i = this.LJJJJL;
            if (i == C78832H5u.LIZIZ) {
                hashMap2.put("request_page", "seat");
            } else if (i == C78832H5u.LIZJ) {
                hashMap2.put("request_page", "bottom");
            } else if (i == C78832H5u.LIZLLL) {
                hashMap2.put("request_page", "popup");
            } else if (i == 110) {
                hashMap2.put("request_page", "task");
            } else if (i == 111) {
                hashMap2.put("request_page", "top");
            } else if (i == 113) {
                hashMap2.put("request_page", "card");
            } else if (i == 112) {
                hashMap2.put("request_page", "apply_panel");
            }
        }
        C79007HCn LJII8 = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII8, "");
        String str12 = LJII8.LJJI;
        if (!TextUtils.isEmpty(str12)) {
            hashMap2.put("is_task", "1");
            Intrinsics.checkNotNullExpressionValue(str12, "");
            hashMap2.put("activity_name", str12);
        }
        C79007HCn LJII9 = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII9, "");
        if (LJII9.LJIL == LinkApplyType.MATCH.value) {
            C79007HCn LJII10 = C79007HCn.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII10, "");
            hashMap2.put("request_page", LJII10.LJJ.value);
        }
        hashMap2.put("connect_type", this.LJLJJI.LIZIZ);
        hashMap2.put("type", this.LJLJJI.LIZIZ);
        if (Intrinsics.areEqual(this.LJLJJI.LIZIZ, "apply")) {
            if (this.LJLJLJ) {
                hashMap2.put("is_approve_needed", "0");
            } else {
                hashMap2.put("is_approve_needed", "1");
            }
        }
        if (Intrinsics.areEqual(this.LJLJJI.LIZIZ, "gift_message_invite") && (messageBoardInfo = this.LJLJJI.f6718LJ) != null) {
            hashMap2.put("message_text", messageBoardInfo.getMsgBoardContent());
        }
        List<KtvMusic> LIZLLL = C79242HLo.LIZLLL();
        Integer valueOf = Integer.valueOf(LJJIJLIJ());
        if (LIZLLL != null && !LIZLLL.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        C78828H5q.LIZ(hashMap2, valueOf, !z2);
        if (LIZLLL != null && !LIZLLL.isEmpty()) {
            hashMap2.put("from_request_type", this.LJJJJLI);
            C78828H5q.LJFF.LIZ(hashMap2, LIZLLL);
        }
        AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs = this.LJJJLL;
        if (abstractC78986HBs == null || (str = String.valueOf(C79242HLo.LIZ(abstractC78986HBs))) == null) {
            str = "0";
        }
        hashMap2.put("link_cnt", str);
        if (this.LJLL) {
            obj = "1";
        } else {
            obj = "0";
        }
        hashMap2.put("is_candidate", obj);
        if (this.LJJIZ) {
            obj2 = "1";
        } else {
            obj2 = "0";
        }
        hashMap2.put("is_fans_guide", obj2);
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        C78828H5q.LIZIZ(hashMap2, Integer.valueOf(((IInteractService) service).getCurrentScene()), (Integer) null, 4, (Object) null);
        C78828H5q.LIZ(hashMap2, Boolean.valueOf(LJJJIL().m15688LJ()));
        C78828H5q.LIZ(hashMap2);
        if (LJIIZILJ()) {
            obj3 = "1";
        } else {
            obj3 = "0";
        }
        hashMap2.put("is_camera_open", obj3);
        if ((C78538Gxg.LJI() || ((bidLinkMicWidget = this.LJJIIZI) != null && bidLinkMicWidget.LJIILL())) && C78536Gxe.LIZ().LIZLLL) {
            obj4 = "1";
        } else {
            obj4 = "0";
        }
        hashMap2.put("is_rechargeble", obj4);
        BidLinkMicWidget bidLinkMicWidget2 = this.LJJIIZI;
        if (bidLinkMicWidget2 != null && bidLinkMicWidget2.LJIILL()) {
            AbstractC4289e LIZIZ5 = C4287a.LIZJ.LIZIZ();
            if (LIZIZ5 != null) {
                l = Long.valueOf(LIZIZ5.LJIIIZ());
            } else {
                l = null;
            }
            hashMap2.put("recharge_price", String.valueOf(l));
            AbstractC4289e LIZIZ6 = C4287a.LIZJ.LIZIZ();
            if (LIZIZ6 != null) {
                l2 = Long.valueOf(LIZIZ6.LJIIIIZZ());
            } else {
                l2 = null;
            }
            hashMap2.put("time", String.valueOf(l2));
            hashMap2.put("recharge_mode", "auction");
        } else if (C78538Gxg.LJI()) {
            if (C78536Gxe.LIZ().LIZLLL) {
                hashMap2.put("recharge_mode", "normal");
            }
            int m23796LJ = C4284f.LJIIIIZZ.m23796LJ();
            if (!C78536Gxe.LIZ().LIZLLL) {
                str2 = "0";
            } else {
                str2 = String.valueOf(m23796LJ);
            }
            hashMap2.put("recharge_price", str2);
            if (C78538Gxg.LIZ(LJJIIJZLJL())) {
                hashMap2.put("add_price", String.valueOf(C78538Gxg.LIZIZ.LJIILIIL()));
            }
            hashMap2.put("time", String.valueOf(C78536Gxe.LIZ().LIZLLL()));
            C87308Kak<C6179t> c87308Kak3 = AbstractC80293Hkt.f7010al;
            Intrinsics.checkNotNullExpressionValue(c87308Kak3, "");
            C6179t LIZ7 = c87308Kak3.LIZ();
            hashMap2.put("rechargeable_label", C78536Gxe.LIZJ.LIZ(LIZ7.LIZIZ));
            hashMap2.put("rechargeable_intro", LIZ7.LIZJ);
            if (C78538Gxg.LIZIZ.LJIILJJIL()) {
                hashMap2.put("anonymous_switch", "on");
            } else {
                hashMap2.put("anonymous_switch", "off");
            }
            int i2 = m23796LJ - C78536Gxe.LIZ().LJIIL;
            if (i2 < 0) {
                str3 = "0";
            } else {
                str3 = String.valueOf(i2);
            }
            hashMap2.put("pay_price", str3);
            if (C78536Gxe.LIZ().LJIIJJI) {
                hashMap2.put("is_vip_recharge_privilege", "1");
            }
        }
        C78828H5q.LJFF.LIZ((Map<String, String>) hashMap2, true);
        hashMap2.put("previous_page", C78837H5z.LIZJ.LIZ());
        if (C78837H5z.LIZJ.LIZIZ()) {
            hashMap2.put("is_homepage_fresh", "1");
            C78828H5q.LJIIIIZZ(hashMap2);
        }
        C78828H5q.LJIIIZ(hashMap2);
        Room LJJIIJZLJL = LJJIIJZLJL();
        if (LJJIIJZLJL != null && (circleInfo = LJJIIJZLJL.circleInfo) != null && (str7 = circleInfo.circleName) != null) {
            hashMap2.put("circle_name", str7);
        }
        if (this.LJLL) {
            obj5 = "1";
        } else {
            obj5 = "0";
        }
        hashMap2.put("is_full", obj5);
        C78828H5q.LJFF.LJII(hashMap2);
        Object obj7 = this.dataCenter.get("data_link_mic_is_quick_invite", (String) Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(obj7, "");
        if (((Boolean) obj7).booleanValue()) {
            obj6 = "1";
        } else {
            obj6 = "0";
        }
        hashMap2.put("is_quick_invite", obj6);
        hashMap2.put("match_enter_from", C78837H5z.LIZJ.LIZJ());
        if (!PatchProxy.proxy(new Object[]{hashMap2}, C78828H5q.LJFF, C78828H5q.LIZ, false, OpenAuthTask.f22015g).isSupported) {
            C106862S5w.LIZ(hashMap2);
            AbstractC8644i LIZ8 = C4574547f.LIZ().LIZ(C8668v.class);
            if (!(LIZ8 instanceof C81173Hz5)) {
                LIZ8 = null;
            }
            C81173Hz5 c81173Hz5 = (C81173Hz5) LIZ8;
            if (c81173Hz5 != null) {
                String str13 = c81173Hz5.LJIIJ;
                if (str13 != null && str13.length() != 0 && str13 != null) {
                    hashMap2.put("from_user_id", str13);
                }
                String str14 = c81173Hz5.LJIIJJI;
                if (str14 != null && str14.length() != 0 && str14 != null) {
                    hashMap2.put("from_user_type", str14);
                }
            }
        }
        C78828H5q.LJIIJ(hashMap2);
        if (Intrinsics.areEqual(this.LJLJJI.LIZIZ, "invite") || Intrinsics.areEqual(this.LJLJJI.LIZIZ, "game_invite") || Intrinsics.areEqual(this.LJLJJI.LIZIZ, "gift_message_invite")) {
            hashMap2.put("from_user_id", String.valueOf(this.LJLJJI.LIZJ));
            if (this.LJLJJI.LIZJ == this.LJLJJI.LIZLLL) {
                hashMap2.put("from_user_type", "anchor");
            } else {
                hashMap2.put("from_user_type", "admin");
            }
        }
        C78828H5q.LIZ((Map) hashMap2, this.LJJJJL, (String) null, false, 12, (Object) null);
        AbstractC81935IRd abstractC81935IRd = this.LJJLIIIJJIZ;
        if (abstractC81935IRd != null) {
            int LIZ9 = abstractC81935IRd.LIZ();
            AbstractC81935IRd abstractC81935IRd2 = this.LJJLIIIJJIZ;
            if (abstractC81935IRd2 != null) {
                voiceLiveTheme = abstractC81935IRd2.LIZ(LIZ9);
            } else {
                voiceLiveTheme = null;
            }
            C78828H5q.LIZ(hashMap2, voiceLiveTheme);
        }
        C78828H5q.LIZIZ((Map) hashMap2, false, 2, (Object) null);
        if (C78836H5y.LIZ(false, true)) {
            hashMap2.put("is_pre_link", "1");
        } else {
            hashMap2.put("is_pre_link", "0");
        }
        C78828H5q.LJIIJJI(hashMap2);
        C87308Kak<Integer> c87308Kak4 = AbstractC80293Hkt.f7203eS;
        Intrinsics.checkNotNullExpressionValue(c87308Kak4, "");
        Integer LIZ10 = c87308Kak4.LIZ();
        if (LIZ10 != null && LIZ10.intValue() == 41) {
            str4 = "money_first";
        } else {
            str4 = "time_first";
        }
        hashMap2.put("ordering_mode", str4);
        C79007HCn LJII11 = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII11, "");
        C4824t c4824t = LJII11.LJJIII;
        if (c4824t != null) {
            String str15 = c4824t.LJIJJ;
            if (str15 == null) {
                str15 = "0";
            }
            hashMap2.put("money", str15);
            long j = c4824t.LJIL;
            if (j == 1) {
                str5 = "top1";
            } else if (j == 2) {
                str5 = "top2";
            } else if (j == 3) {
                str5 = "top3";
            } else {
                str5 = "null";
            }
            hashMap2.put("top_r", str5);
            User user = c4824t.LIZIZ;
            if (user != null) {
                str6 = user.getRelationship();
            } else {
                str6 = null;
            }
            hashMap2.put("relationship", String.valueOf(str6));
            User user2 = c4824t.LIZIZ;
            if (user2 != null) {
                num = Integer.valueOf(user2.getLevel());
            } else {
                num = null;
            }
            hashMap2.put("contribution_level", String.valueOf(num));
            long j2 = this.LJJJJJ;
            long j3 = ((c4824t.LIZLLL * 1000) - j2) / 1000;
            if (j3 < 0 || j2 <= 0) {
                j3 = 0;
            }
            hashMap2.put("watch_duration", String.valueOf(j3));
            long currentTimeMillis = (System.currentTimeMillis() - (c4824t.LIZLLL * 1000)) / 1000;
            if (currentTimeMillis < 0) {
                currentTimeMillis = 0;
            }
            hashMap2.put("waiting_duration", String.valueOf(currentTimeMillis));
            hashMap2.put("connect_order", String.valueOf(c4824t.LJIJJLI));
        }
        MicPosTagInfo micPosTagInfo = (MicPosTagInfo) this.dataCenter.get("data_link_mic_pos_tag_info", (String) null);
        if (micPosTagInfo != null) {
            micPosTagInfo.getTagType();
            if (micPosTagInfo.getTagType() > 0) {
                hashMap2.put("tag_type", String.valueOf(micPosTagInfo.getTagType()));
            }
        }
        C78391GvJ.LIZIZ.LIZ(hashMap2);
        C78828H5q.LIZLLL = System.currentTimeMillis();
        if (this.f26463LJ == LinkApplyType.KTV_PRIORITY_SING) {
            hashMap2.put("is_priority", "1");
        } else {
            hashMap2.put("is_priority", "0");
        }
        hashMap2.put("mic_type", "normal_mic");
        Integer LJJJJJ = LJJJJJ();
        if (LJJJJJ != null) {
            c = 1;
            hashMap2.put("seat_position", String.valueOf(LJJJJJ.intValue() + 1));
        } else {
            c = 1;
        }
        C4574547f LIZ11 = C4574547f.LIZ();
        Object[] objArr = new Object[3];
        objArr[0] = Room.class;
        objArr[c] = C8668v.class;
        objArr[2] = C3348d.class;
        LIZ11.LIZ("livesdk_guest_connection_success", hashMap2, objArr);
        this.LJJIZ = false;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: W_ */
    public final void mo15659W_() {
        long j;
        Object obj;
        Object obj2;
        String str;
        String str2;
        Object obj3;
        String str3;
        Object obj4;
        String str4;
        String str5;
        String str6;
        Integer num;
        Object obj5;
        VoiceLiveTheme voiceLiveTheme;
        C2WC<Boolean> LJFF;
        CircleInfo circleInfo;
        String str7;
        Long l;
        Long l2;
        BidLinkMicWidget bidLinkMicWidget;
        MessageBoardInfo messageBoardInfo;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 90).isSupported) {
            return;
        }
        AbstractC6070q abstractC6070q = this.LJIILLIIL;
        if (abstractC6070q != null) {
            abstractC6070q.LJFF();
        }
        this.LJIILLIIL = null;
        C78999HCf c78999HCf = this.LJIILL;
        if (c78999HCf != null) {
            c78999HCf.LIZ(false);
        }
        super.mo15659W_();
        AbstractC4964m abstractC4964m = this.LJII;
        if (abstractC4964m != null) {
            abstractC4964m.LJIIJJI();
        }
        C78746H2m c78746H2m = this.LJJIJ;
        c78746H2m.LIZIZ = 0L;
        c78746H2m.LIZJ = 0L;
        VideoDigitAvatarWidget videoDigitAvatarWidget = this.LJJJ;
        if (videoDigitAvatarWidget != null && !PatchProxy.proxy(new Object[0], videoDigitAvatarWidget, VideoDigitAvatarWidget.LIZ, false, 4).isSupported) {
            ALogger.m15797i("KtvDigitAvatar", "监听到rtc【关闭】成功消息");
            DigitAvatarMsgController digitAvatarMsgController = videoDigitAvatarWidget.LIZLLL;
            if (digitAvatarMsgController == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            digitAvatarMsgController.LIZJ = null;
        }
        QuickInteractWidget quickInteractWidget = this.LJLIIL;
        if (quickInteractWidget != null) {
            quickInteractWidget.m15683LJ();
        }
        this.LJLLI.LIZ();
        LJJJJL();
        if (!isViewValid() || C78828H5q.LIZJ() <= 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("live_type", "video_live");
        if (this.LJJJJJL > 0) {
            hashMap.put("duration", String.valueOf((System.currentTimeMillis() - this.LJJJJJL) / 1000));
        }
        hashMap.put("over_type", LJJJJJL());
        hashMap.put("connect_type", this.LJLJJI.LIZIZ);
        if (Intrinsics.areEqual(this.LJLJJI.LIZIZ, "apply")) {
            int i = this.LJJJJL;
            if (i == C78832H5u.LIZIZ) {
                hashMap.put("request_page", "seat");
            } else if (i == C78832H5u.LIZJ) {
                hashMap.put("request_page", "bottom");
            } else if (i == C78832H5u.LIZLLL) {
                hashMap.put("request_page", "popup");
            } else if (i == 110) {
                hashMap.put("request_page", "task");
            } else if (i == 111) {
                hashMap.put("request_page", "top");
            } else if (i == 113) {
                hashMap.put("request_page", "card");
            } else if (i == 112) {
                hashMap.put("request_page", "apply_panel");
            }
            C79007HCn LJII = C79007HCn.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII, "");
            if (LJII.LJIL == LinkApplyType.MATCH.value) {
                C79007HCn LJII2 = C79007HCn.LJII();
                Intrinsics.checkNotNullExpressionValue(LJII2, "");
                hashMap.put("request_page", LJII2.LJJ.value);
            }
            if (this.LJLJLJ) {
                hashMap.put("is_approve_needed", "0");
            } else {
                hashMap.put("is_approve_needed", "1");
            }
            C79007HCn LJII3 = C79007HCn.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII3, "");
            String str8 = LJII3.LJJI;
            if (!TextUtils.isEmpty(str8)) {
                hashMap.put("is_task", "1");
                Intrinsics.checkNotNullExpressionValue(str8, "");
                hashMap.put("activity_name", str8);
            }
        }
        if (Intrinsics.areEqual(this.LJLJJI.LIZIZ, "gift_message_invite") && (messageBoardInfo = this.LJLJJI.f6718LJ) != null) {
            hashMap.put("message_text", messageBoardInfo.getMsgBoardContent());
        }
        String LJJJJLL = LJJJJLL();
        if (LJJJJLL != null) {
            hashMap.put("break_page", LJJJJLL);
        }
        AbstractC2885g abstractC2885g = this.LJJII;
        if (abstractC2885g == null || abstractC2885g.getCameraDuration() != 0) {
            AbstractC2885g abstractC2885g2 = this.LJJII;
            if (abstractC2885g2 != null) {
                j = abstractC2885g2.getCameraDuration();
            } else {
                j = 0;
            }
            hashMap.put("camera_duration", String.valueOf(j / 1000));
        }
        if (LJIIZILJ()) {
            obj = "1";
        } else {
            obj = "0";
        }
        hashMap.put("is_camera_open", obj);
        C78828H5q.LJFF.LJII(hashMap);
        hashMap.put("function_type", "radio");
        hashMap.put("talk_duration", String.valueOf(this.LJLLI.LIZIZ));
        hashMap.put("live_type", "video_live");
        if ((C78538Gxg.LJI() || ((bidLinkMicWidget = this.LJJIIZI) != null && bidLinkMicWidget.LJIILL())) && C78536Gxe.LIZ().LIZLLL) {
            obj2 = "1";
        } else {
            obj2 = "0";
        }
        hashMap.put("is_rechargeble", obj2);
        BidLinkMicWidget bidLinkMicWidget2 = this.LJJIIZI;
        if (bidLinkMicWidget2 != null && bidLinkMicWidget2.LJIILL()) {
            BidLinkMicWidget bidLinkMicWidget3 = this.LJJIIZI;
            if (bidLinkMicWidget3 != null) {
                l = bidLinkMicWidget3.LJIILLIIL();
            } else {
                l = null;
            }
            hashMap.put("recharge_price", String.valueOf(l));
            BidLinkMicWidget bidLinkMicWidget4 = this.LJJIIZI;
            if (bidLinkMicWidget4 != null) {
                l2 = bidLinkMicWidget4.LJIIZILJ();
            } else {
                l2 = null;
            }
            hashMap.put("time", String.valueOf(l2));
            hashMap.put("recharge_mode", "auction");
        } else if (C78538Gxg.LJI()) {
            if (C78536Gxe.LIZ().LIZLLL) {
                hashMap.put("recharge_mode", "normal");
            }
            int m23796LJ = C4284f.LJIIIIZZ.m23796LJ();
            if (!C78536Gxe.LIZ().LIZLLL) {
                str = "0";
            } else {
                str = String.valueOf(m23796LJ);
            }
            hashMap.put("recharge_price", str);
            if (C78538Gxg.LIZ(LJJIIJZLJL())) {
                hashMap.put("add_price", String.valueOf(C78538Gxg.LIZIZ.LJIILIIL()));
                C78538Gxg.LIZIZ.LIZ(0L);
            }
            hashMap.put("time", String.valueOf(C78536Gxe.LIZ().LIZLLL()));
            C87308Kak<C6179t> c87308Kak = AbstractC80293Hkt.f7010al;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            C6179t LIZ = c87308Kak.LIZ();
            hashMap.put("rechargeable_label", C78536Gxe.LIZJ.LIZ(LIZ.LIZIZ));
            hashMap.put("rechargeable_intro", LIZ.LIZJ);
            if (C78538Gxg.LIZIZ.LJIILJJIL()) {
                hashMap.put("anonymous_switch", "on");
            } else {
                hashMap.put("anonymous_switch", "off");
            }
            int i2 = m23796LJ - C78536Gxe.LIZ().LJIIL;
            if (i2 < 0) {
                str2 = "0";
            } else {
                str2 = String.valueOf(i2);
            }
            hashMap.put("pay_price", str2);
            if (C78536Gxe.LIZ().LJIIJJI) {
                hashMap.put("is_vip_recharge_privilege", "1");
            }
        }
        C78828H5q.LIZIZ(hashMap, Integer.valueOf(LJJIJLIJ()), (Integer) null, 4, (Object) null);
        C78828H5q.LIZ(hashMap, Boolean.valueOf(LJJJIL().m15688LJ()));
        C78828H5q.LIZ(hashMap);
        C78828H5q.LJFF.LIZ((Map<String, String>) hashMap, true);
        hashMap.put("distribute_status", DialogC77613Gil.f6435LJ.LIZIZ());
        hashMap.put("previous_page", C78837H5z.LIZJ.LIZ());
        if (C78837H5z.LIZJ.LIZIZ()) {
            hashMap.put("is_homepage_fresh", "1");
            C78828H5q.LJIIIIZZ(hashMap);
        }
        C78828H5q.LJIIIZ(hashMap);
        Room LJJIIJZLJL = LJJIIJZLJL();
        if (LJJIIJZLJL != null && (circleInfo = LJJIIJZLJL.circleInfo) != null && (str7 = circleInfo.circleName) != null) {
            hashMap.put("circle_name", str7);
        }
        C4382d LIZ2 = C4382d.LIZLLL.LIZ();
        if (LIZ2 != null && (LJFF = LIZ2.LJFF()) != null && LJFF.LIZ().booleanValue()) {
            obj3 = "1";
        } else {
            obj3 = "0";
        }
        hashMap.put("is_avatar_used", obj3);
        AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs = this.LJJJLL;
        if (abstractC78986HBs == null || (str3 = String.valueOf(C79242HLo.LIZ(abstractC78986HBs))) == null) {
            str3 = "0";
        }
        hashMap.put("link_cnt", str3);
        C78828H5q.LJIIJ(hashMap);
        hashMap.put("guest_connection_type", "live_chat");
        C78828H5q.LIZ((Map) hashMap, this.LJJJJL, (String) null, true, 4, (Object) null);
        C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.f6998aZ;
        Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
        Boolean LIZ3 = c87308Kak2.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
        if (LIZ3.booleanValue()) {
            obj4 = "1";
        } else {
            obj4 = "0";
        }
        hashMap.put("is_invite_only", obj4);
        AbstractC81935IRd abstractC81935IRd = this.LJJLIIIJJIZ;
        if (abstractC81935IRd != null) {
            int LIZ4 = abstractC81935IRd.LIZ();
            AbstractC81935IRd abstractC81935IRd2 = this.LJJLIIIJJIZ;
            if (abstractC81935IRd2 != null) {
                voiceLiveTheme = abstractC81935IRd2.LIZ(LIZ4);
            } else {
                voiceLiveTheme = null;
            }
            C78828H5q.LIZ(hashMap, voiceLiveTheme);
        }
        C78828H5q.LIZIZ((Map) hashMap, false, 2, (Object) null);
        if (C78836H5y.LIZ(false, true)) {
            hashMap.put("is_pre_link", "1");
        } else {
            hashMap.put("is_pre_link", "0");
        }
        C78828H5q.LJIIJJI(hashMap);
        C78395GvN c78395GvN = this.LJJLIL;
        if (c78395GvN != null) {
            if (c78395GvN.LIZIZ) {
                obj5 = "1";
            } else {
                obj5 = "0";
            }
            hashMap.put("is_guest_enlarged_before", obj5);
            hashMap.put("enlarge_duration", String.valueOf((c78395GvN.LIZ() + 500) / 1000));
        }
        C79007HCn LJII4 = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII4, "");
        C4824t c4824t = LJII4.LJJIII;
        if (c4824t != null) {
            C87308Kak<Integer> c87308Kak3 = AbstractC80293Hkt.f7203eS;
            Intrinsics.checkNotNullExpressionValue(c87308Kak3, "");
            Integer LIZ5 = c87308Kak3.LIZ();
            if (LIZ5 != null && LIZ5.intValue() == 41) {
                str4 = "money_first";
            } else {
                str4 = "time_first";
            }
            hashMap.put("ordering_mode", str4);
            String str9 = c4824t.LJIJJ;
            if (str9 == null) {
                str9 = "0";
            }
            hashMap.put("money", str9);
            long j2 = c4824t.LJIL;
            if (j2 == 1) {
                str5 = "top1";
            } else if (j2 == 2) {
                str5 = "top2";
            } else if (j2 == 3) {
                str5 = "top3";
            } else {
                str5 = "null";
            }
            hashMap.put("top_r", str5);
            User user = c4824t.LIZIZ;
            if (user != null) {
                str6 = user.getRelationship();
            } else {
                str6 = null;
            }
            hashMap.put("relationship", String.valueOf(str6));
            User user2 = c4824t.LIZIZ;
            if (user2 != null) {
                num = Integer.valueOf(user2.getLevel());
            } else {
                num = null;
            }
            hashMap.put("contribution_level", String.valueOf(num));
            long j3 = this.LJJJJJ;
            long j4 = ((c4824t.LIZLLL * 1000) - j3) / 1000;
            if (j4 < 0 || j3 <= 0) {
                j4 = 0;
            }
            hashMap.put("watch_duration", String.valueOf(j4));
            long j5 = (this.LJJJJJL - (c4824t.LIZLLL * 1000)) / 1000;
            if (j5 < 0 || this.LJJJJJL <= 0) {
                j5 = 0;
            }
            hashMap.put("waiting_duration", String.valueOf(j5));
        }
        C78391GvJ.LIZIZ.LIZ(hashMap);
        Integer LJJJJJ = LJJJJJ();
        if (LJJJJJ != null) {
            hashMap.put("seat_position", String.valueOf(LJJJJJ.intValue() + 1));
        }
        MicPosTagInfo micPosTagInfo = (MicPosTagInfo) this.dataCenter.get("data_link_mic_pos_tag_info", (String) null);
        if (micPosTagInfo != null) {
            micPosTagInfo.getTagType();
            if (micPosTagInfo.getTagType() > 0) {
                hashMap.put("tag_type", String.valueOf(micPosTagInfo.getTagType()));
            }
        }
        if (this.f26463LJ == LinkApplyType.KTV_PRIORITY_SING) {
            hashMap.put("is_priority", "1");
        } else {
            hashMap.put("is_priority", "0");
        }
        hashMap.put("mic_type", "normal_mic");
        C4574547f.LIZ().LIZ("guest_connection_over", hashMap, Room.class, C8668v.class, C3348d.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x07c5, code lost:
        if (r2 != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02a9, code lost:
        if (((java.lang.Boolean) r3.result).booleanValue() != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02ad, code lost:
        if (r25.LJLILLLLZI != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02af, code lost:
        enableSubWidgetManager();
        r25.LJLILLLLZI = new com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.SelfDisciplineWidget();
        r25.subWidgetManager.load(r25.LJLILLLLZI);
     */
    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAdminLinkWidget, com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate() {
        /*
            Method dump skipped, instructions count: 2037
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomGuestWidget.onCreate():void");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAdminLinkWidget, com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        AbstractC413392Xt<C6305j> LJJJJZ;
        C6305j LIZIZ;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ2;
        DialogC418702hc dialogC418702hc;
        C79220HKs c79220HKs;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII2;
        AbstractC6302f LIZIZ3;
        C6307m LIZIZ4;
        String str;
        CircleInfo circleInfo;
        String str2;
        long j;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        char c;
        String str10;
        String str11;
        String str12;
        Integer num;
        String str13;
        VoiceLiveTheme voiceLiveTheme;
        C2WC<Boolean> LJFF;
        CircleInfo circleInfo2;
        String str14;
        Long l;
        Long l2;
        BidLinkMicWidget bidLinkMicWidget;
        MessageBoardInfo messageBoardInfo;
        HK5 hk5;
        C78964HAw c78964HAw;
        AbstractC413392Xt<IMessageManager> LJIILLIIL;
        IMessageManager LIZIZ5;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 76).isSupported) {
            return;
        }
        if (LJJJJI().LJIILIIL()) {
            LJJJJI().dismiss();
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJIILLIIL = LJJJI.LJIILLIIL()) != null && (LIZIZ5 = LJIILLIIL.LIZIZ()) != null) {
            LIZIZ5.removeMessageListener(this);
        }
        C78964HAw c78964HAw2 = this.LJJJZ;
        if (c78964HAw2 != null && c78964HAw2.LJIILIIL() && (c78964HAw = this.LJJJZ) != null) {
            c78964HAw.dismiss();
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 146).isSupported && (hk5 = this.LJJIJIIJI) != null) {
            if (hk5.LJIILIIL()) {
                hk5.dismiss();
            }
            this.LJJIJIIJI = null;
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.INTERACT_ACTIVITY_PERMISSION_GUARANTOR_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            LJJJJ().LIZLLL();
        }
        C78828H5q.LIZIZ((String) null, (String) null, 3, (Object) null);
        HHA hha = this.LJIIZILJ;
        String str15 = "0";
        if (hha != null && hha.LJI && C78828H5q.LIZJ() > 0) {
            HH8.LIZLLL();
            HashMap hashMap = new HashMap();
            hashMap.put("live_type", "video_live");
            hashMap.put("duration", String.valueOf((System.currentTimeMillis() - C78828H5q.LIZJ()) / 1000));
            hashMap.put("over_type", LJJJJJL());
            hashMap.put("connect_type", this.LJLJJI.LIZIZ);
            if ("apply".equals(this.LJLJJI.LIZIZ)) {
                int i = this.LJJJJL;
                if (i == C78832H5u.LIZIZ) {
                    hashMap.put("request_page", "seat");
                } else if (i == C78832H5u.LIZJ) {
                    hashMap.put("request_page", "bottom");
                } else if (i == C78832H5u.LIZLLL) {
                    hashMap.put("request_page", "popup");
                } else if (i == 110) {
                    hashMap.put("request_page", "task");
                } else if (i == 111) {
                    hashMap.put("request_page", "top");
                } else if (i == 113) {
                    hashMap.put("request_page", "card");
                }
                C79007HCn LJII = C79007HCn.LJII();
                Intrinsics.checkNotNullExpressionValue(LJII, "");
                if (LJII.LJIL == LinkApplyType.MATCH.value) {
                    C79007HCn LJII2 = C79007HCn.LJII();
                    Intrinsics.checkNotNullExpressionValue(LJII2, "");
                    hashMap.put("request_page", LJII2.LJJ.value);
                }
                if (this.LJLJLJ) {
                    hashMap.put("is_approve_needed", str15);
                } else {
                    hashMap.put("is_approve_needed", "1");
                }
            }
            if ("gift_message_invite".equals(this.LJLJJI.LIZIZ) && (messageBoardInfo = this.LJLJJI.f6718LJ) != null) {
                hashMap.put("message_text", messageBoardInfo.getMsgBoardContent());
            }
            String LJJJJLL = LJJJJLL();
            if (LJJJJLL != null) {
                hashMap.put("break_page", LJJJJLL);
            }
            C79007HCn LJII3 = C79007HCn.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII3, "");
            String str16 = LJII3.LJJI;
            if (!TextUtils.isEmpty(str16)) {
                hashMap.put("is_task", "1");
                Intrinsics.checkNotNullExpressionValue(str16, "");
                hashMap.put("activity_name", str16);
            }
            AbstractC2885g abstractC2885g = this.LJJII;
            if (abstractC2885g == null || abstractC2885g.getCameraDuration() != 0) {
                AbstractC2885g abstractC2885g2 = this.LJJII;
                if (abstractC2885g2 != null) {
                    j = abstractC2885g2.getCameraDuration();
                } else {
                    j = 0;
                }
                hashMap.put("camera_duration", String.valueOf(j / 1000));
            }
            hashMap.put("distribute_status", DialogC77613Gil.f6435LJ.LIZIZ());
            hashMap.put("function_type", "radio");
            C78828H5q.LJFF.LJII(hashMap);
            if ((C78538Gxg.LJI() || ((bidLinkMicWidget = this.LJJIIZI) != null && bidLinkMicWidget.LJIILL())) && C78536Gxe.LIZ().LIZLLL) {
                str3 = "1";
            } else {
                str3 = str15;
            }
            hashMap.put("is_rechargeble", str3);
            BidLinkMicWidget bidLinkMicWidget2 = this.LJJIIZI;
            if (bidLinkMicWidget2 != null && bidLinkMicWidget2.LJIILL()) {
                BidLinkMicWidget bidLinkMicWidget3 = this.LJJIIZI;
                if (bidLinkMicWidget3 != null) {
                    l = bidLinkMicWidget3.LJIILLIIL();
                } else {
                    l = null;
                }
                hashMap.put("recharge_price", String.valueOf(l));
                BidLinkMicWidget bidLinkMicWidget4 = this.LJJIIZI;
                if (bidLinkMicWidget4 != null) {
                    l2 = bidLinkMicWidget4.LJIIZILJ();
                } else {
                    l2 = null;
                }
                hashMap.put("time", String.valueOf(l2));
                hashMap.put("recharge_mode", "auction");
            } else if (C78538Gxg.LJI()) {
                if (C78536Gxe.LIZ().LIZLLL) {
                    hashMap.put("recharge_mode", "normal");
                }
                int m23796LJ = C4284f.LJIIIIZZ.m23796LJ();
                if (C78536Gxe.LIZ().LIZLLL) {
                    str4 = String.valueOf(m23796LJ);
                } else {
                    str4 = str15;
                }
                hashMap.put("recharge_price", str4);
                if (C78538Gxg.LIZ(LJJIIJZLJL())) {
                    hashMap.put("add_price", String.valueOf(C78538Gxg.LIZIZ.LJIILIIL()));
                    C78538Gxg.LIZIZ.LIZ(0L);
                }
                hashMap.put("time", String.valueOf(C78536Gxe.LIZ().LIZLLL()));
                C87308Kak<C6179t> c87308Kak = AbstractC80293Hkt.f7010al;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                C6179t LIZ = c87308Kak.LIZ();
                hashMap.put("rechargeable_label", C78536Gxe.LIZJ.LIZ(LIZ.LIZIZ));
                hashMap.put("rechargeable_intro", LIZ.LIZJ);
                if (C78538Gxg.LIZIZ.LJIILJJIL()) {
                    hashMap.put("anonymous_switch", "on");
                } else {
                    hashMap.put("anonymous_switch", "off");
                }
                int i2 = m23796LJ - C78536Gxe.LIZ().LJIIL;
                if (i2 >= 0) {
                    str5 = String.valueOf(i2);
                } else {
                    str5 = str15;
                }
                hashMap.put("pay_price", str5);
                if (C78536Gxe.LIZ().LJIIJJI) {
                    hashMap.put("is_vip_recharge_privilege", "1");
                }
            }
            hashMap.put("talk_duration", String.valueOf(this.LJLLI.LIZIZ));
            hashMap.put("live_type", "video_live");
            C78828H5q.LIZIZ(hashMap, Integer.valueOf(LJJIJLIJ()), (Integer) null, 4, (Object) null);
            C78828H5q.LIZIZ(hashMap);
            C78828H5q.LIZ(hashMap);
            C78828H5q.LJFF.LIZ((Map<String, String>) hashMap, true);
            hashMap.put("previous_page", C78837H5z.LIZJ.LIZ());
            if (C78837H5z.LIZJ.LIZIZ()) {
                hashMap.put("is_homepage_fresh", "1");
                C78828H5q.LJIIIIZZ(hashMap);
            }
            C78828H5q.LJIIIZ(hashMap);
            Room LJJIIJZLJL = LJJIIJZLJL();
            if (LJJIIJZLJL != null && (circleInfo2 = LJJIIJZLJL.circleInfo) != null && (str14 = circleInfo2.circleName) != null) {
                hashMap.put("circle_name", str14);
            }
            C4382d LIZ2 = C4382d.LIZLLL.LIZ();
            if (LIZ2 != null && (LJFF = LIZ2.LJFF()) != null && LJFF.LIZ().booleanValue()) {
                str6 = "1";
            } else {
                str6 = str15;
            }
            hashMap.put("is_avatar_used", str6);
            AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs = this.LJJJLL;
            if (abstractC78986HBs == null || (str7 = String.valueOf(C79242HLo.LIZ(abstractC78986HBs))) == null) {
                str7 = str15;
            }
            hashMap.put("link_cnt", str7);
            if (LJIIZILJ()) {
                str8 = "1";
            } else {
                str8 = str15;
            }
            hashMap.put("is_camera_open", str8);
            C78828H5q.LJIIJ(hashMap);
            hashMap.put("guest_connection_type", "live_chat");
            C78828H5q.LIZ((Map) hashMap, this.LJJJJL, (String) null, true, 4, (Object) null);
            C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.f6998aZ;
            Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
            Boolean LIZ3 = c87308Kak2.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
            if (LIZ3.booleanValue()) {
                str9 = "1";
            } else {
                str9 = str15;
            }
            hashMap.put("is_invite_only", str9);
            AbstractC81935IRd abstractC81935IRd = this.LJJLIIIJJIZ;
            if (abstractC81935IRd != null) {
                int LIZ4 = abstractC81935IRd.LIZ();
                AbstractC81935IRd abstractC81935IRd2 = this.LJJLIIIJJIZ;
                if (abstractC81935IRd2 != null) {
                    voiceLiveTheme = abstractC81935IRd2.LIZ(LIZ4);
                } else {
                    voiceLiveTheme = null;
                }
                C78828H5q.LIZ(hashMap, voiceLiveTheme);
            }
            C78828H5q.LIZIZ((Map) hashMap, false, 2, (Object) null);
            if (C78836H5y.LIZ(false, true)) {
                hashMap.put("is_pre_link", "1");
            } else {
                hashMap.put("is_pre_link", str15);
            }
            C78391GvJ.LIZIZ.LIZ(hashMap);
            C78828H5q.LJIIJJI(hashMap);
            C78395GvN c78395GvN = this.LJJLIL;
            if (c78395GvN != null) {
                if (c78395GvN.LIZIZ) {
                    str13 = "1";
                } else {
                    str13 = str15;
                }
                hashMap.put("is_guest_enlarged_before", str13);
                hashMap.put("enlarge_duration", String.valueOf((c78395GvN.LIZ() + 500) / 1000));
            }
            C79007HCn LJII4 = C79007HCn.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII4, "");
            C4824t c4824t = LJII4.LJJIII;
            if (c4824t != null) {
                C87308Kak<Integer> c87308Kak3 = AbstractC80293Hkt.f7203eS;
                Intrinsics.checkNotNullExpressionValue(c87308Kak3, "");
                Integer LIZ5 = c87308Kak3.LIZ();
                if (LIZ5 != null && LIZ5.intValue() == 41) {
                    str10 = "money_first";
                } else {
                    str10 = "time_first";
                }
                hashMap.put("ordering_mode", str10);
                String str17 = c4824t.LJIJJ;
                if (str17 == null) {
                    str17 = str15;
                }
                hashMap.put("money", str17);
                long j2 = c4824t.LJIL;
                if (j2 == 1) {
                    str11 = "top1";
                } else if (j2 == 2) {
                    str11 = "top2";
                } else if (j2 == 3) {
                    str11 = "top3";
                } else {
                    str11 = "null";
                }
                hashMap.put("top_r", str11);
                User user = c4824t.LIZIZ;
                if (user != null) {
                    str12 = user.getRelationship();
                } else {
                    str12 = null;
                }
                hashMap.put("relationship", String.valueOf(str12));
                User user2 = c4824t.LIZIZ;
                if (user2 != null) {
                    num = Integer.valueOf(user2.getLevel());
                } else {
                    num = null;
                }
                hashMap.put("contribution_level", String.valueOf(num));
                long j3 = this.LJJJJJ;
                long j4 = ((c4824t.LIZLLL * 1000) - j3) / 1000;
                if (j4 < 0 || j3 <= 0) {
                    j4 = 0;
                }
                hashMap.put("watch_duration", String.valueOf(j4));
                long j5 = (this.LJJJJJL - (c4824t.LIZLLL * 1000)) / 1000;
                if (j5 < 0 || this.LJJJJJL <= 0) {
                    j5 = 0;
                }
                hashMap.put("waiting_duration", String.valueOf(j5));
            }
            MicPosTagInfo micPosTagInfo = (MicPosTagInfo) this.dataCenter.get("data_link_mic_pos_tag_info", (String) null);
            if (micPosTagInfo != null) {
                micPosTagInfo.getTagType();
                if (micPosTagInfo.getTagType() > 0) {
                    hashMap.put("tag_type", String.valueOf(micPosTagInfo.getTagType()));
                }
            }
            if (this.f26463LJ == LinkApplyType.KTV_PRIORITY_SING) {
                hashMap.put("is_priority", "1");
            } else {
                hashMap.put("is_priority", str15);
            }
            hashMap.put("mic_type", "normal_mic");
            Integer LJJJJJ = LJJJJJ();
            if (LJJJJJ != null) {
                c = 1;
                hashMap.put("seat_position", String.valueOf(LJJJJJ.intValue() + 1));
            } else {
                c = 1;
            }
            C4574547f LIZ6 = C4574547f.LIZ();
            Object[] objArr = new Object[3];
            objArr[0] = Room.class;
            objArr[c] = C8668v.class;
            objArr[2] = C3348d.class;
            LIZ6.LIZ("guest_connection_over", hashMap, objArr);
            C78538Gxg.LIZIZ.LIZIZ(false);
            C78536Gxe.LIZ().LJIIJ();
        }
        this.LJJIII.clear();
        this.LJJIIJ.clear();
        HAY hay = this.LJJLIIIJ;
        if (hay != null) {
            hay.LIZLLL();
        }
        this.LJJIJ.LIZIZ();
        HD9 hd9 = this.LJJLIIJ;
        if (hd9 != null) {
            HD9.LIZ(hd9, 0, 1, null);
        }
        C78395GvN c78395GvN2 = this.LJJLIL;
        if (c78395GvN2 != null) {
            c78395GvN2.LIZIZ();
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("live_type", "video_live");
        long currentTimeMillis = System.currentTimeMillis();
        long j6 = this.LJJJJJ;
        long j7 = (currentTimeMillis - j6) / 1000;
        long j8 = 0;
        if (j7 >= 0 && j6 > 0) {
            j8 = j7;
        }
        hashMap2.put("duration", String.valueOf(j8));
        hashMap2.put("function_type", "radio");
        C78828H5q.LIZIZ(hashMap2, Integer.valueOf(LJJIJLIJ()), (Integer) null, 4, (Object) null);
        C78828H5q.LIZ(hashMap2, Boolean.valueOf(LJJJIL().m15688LJ()));
        C78828H5q.LIZ(hashMap2);
        AbstractC4964m abstractC4964m = this.LJII;
        if (abstractC4964m != null && abstractC4964m.LJIIL()) {
            C77540Gha.LIZJ.LIZ(hashMap2);
        }
        Room LJJIIJZLJL2 = LJJIIJZLJL();
        if (LJJIIJZLJL2 != null && (circleInfo = LJJIIJZLJL2.circleInfo) != null && (str2 = circleInfo.circleName) != null) {
            hashMap2.put("circle_name", str2);
        }
        C78828H5q.LJFF.LJII(hashMap2);
        C4806x c4806x = (C4806x) this.LJJJLL;
        if (c4806x != null) {
            if (c4806x.LJIILIIL() > 0) {
                str = "1";
            } else {
                str = str15;
            }
            hashMap2.put("is_set_seat_name", str);
            hashMap2.put("seat_num", String.valueOf(c4806x.LJIILIIL()));
        }
        List<Integer> list = null;
        C78828H5q.LIZ(hashMap2, (VoiceLiveTheme) null, 2, (Object) null);
        AbstractC4964m abstractC4964m2 = this.LJII;
        if (abstractC4964m2 instanceof C80627HqH) {
            hashMap2.put("grouppk_duration", String.valueOf(j8));
            hashMap2.put("grouppk_stage", C78391GvJ.LIZIZ(((C80627HqH) abstractC4964m2).LJFF()));
        }
        C78828H5q.LIZJ((Map<String, String>) hashMap2, true);
        if (C78836H5y.LIZ(false, true)) {
            hashMap2.put("is_pre_link", "1");
        } else {
            hashMap2.put("is_pre_link", str15);
        }
        C5923dp LIZ7 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ7 != null && (LJJZZIII2 = LIZ7.LJJZZIII()) != null && (LIZIZ3 = LJJZZIII2.LIZIZ()) != null && (LIZIZ4 = LIZIZ3.LIZIZ()) != null) {
            list = LIZIZ4.LIZJ;
        }
        if (C78571GyD.LIZIZ(list)) {
            str15 = "1";
        }
        hashMap2.put("if_enlarge", str15);
        C4574547f.LIZ().LIZ("voice_room_watch_duration", hashMap2, Room.class, C8668v.class, C3348d.class);
        if (C79242HLo.LJIIJ() == 16) {
            LIZ(LJJJIL(), C79072HFa.LJII);
        }
        super.onDestroy();
        AbstractC6070q abstractC6070q = this.LJIILLIIL;
        if (abstractC6070q != null) {
            abstractC6070q.LJFF();
        }
        ak_();
        AbstractC4964m abstractC4964m3 = this.LJII;
        if (abstractC4964m3 != null) {
            abstractC4964m3.LJI();
        }
        if (!PatchProxy.proxy(new Object[]{1}, this, LIZJ, false, 26).isSupported) {
            this.dataCenter.put("cmd_video_talkroom_state_change", new C6008ch(1));
        }
        C79007HCn.LJII().LIZ(Boolean.FALSE);
        this.LJJJLZIJ.clear();
        this.dataCenter.removeObserver(this);
        C79220HKs c79220HKs2 = this.LJIIIIZZ;
        if (c79220HKs2 != null && c79220HKs2.LJIILIIL() && (c79220HKs = this.LJIIIIZZ) != null) {
            c79220HKs.dismiss();
        }
        DialogC418702hc dialogC418702hc2 = this.LJIIIZ;
        if (dialogC418702hc2 != null && dialogC418702hc2.isShowing() && (dialogC418702hc = this.LJIIIZ) != null) {
            C116971W2r.LIZ(dialogC418702hc);
        }
        DialogC77887GnB dialogC77887GnB = this.LJJLI;
        if (dialogC77887GnB != null) {
            C116971W2r.LIZ(dialogC77887GnB);
        }
        AbstractC4054j abstractC4054j = this.LJJLIIIIJ;
        if (abstractC4054j != null) {
            abstractC4054j.dismiss();
        }
        HKC linkEffectHelper = ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).linkEffectHelper();
        if (linkEffectHelper != null) {
            linkEffectHelper.LIZIZ();
        }
        C78883H7t.LIZIZ.LIZ(this.dataCenter, false);
        C5923dp LJJJI2 = LJJJI();
        if (LJJJI2 != null && (LJJZZIII = LJJJI2.LJJZZIII()) != null && (LIZIZ2 = LJJZZIII.LIZIZ()) != null) {
            LIZIZ2.LJIIJ();
        }
        this.LJLLI.LIZ();
        C79004HCk c79004HCk = this.LJLLJ;
        if (c79004HCk == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c79004HCk.LIZIZ();
        if (C79242HLo.LIZ(false) && !PatchProxy.proxy(new Object[0], this, LIZJ, false, 79).isSupported) {
            AbstractC81935IRd abstractC81935IRd3 = this.LJJLIIIJJIZ;
            if (abstractC81935IRd3 != null) {
                abstractC81935IRd3.LIZ(new VoiceLiveTheme(), 3);
            }
            AbstractC81935IRd abstractC81935IRd4 = this.LJJLIIIJJIZ;
            if (abstractC81935IRd4 != null) {
                abstractC81935IRd4.LIZ(new VoiceLiveTheme(), 4);
            }
        }
        C5923dp LIZ8 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ8 != null && (LJJJJZ = LIZ8.LJJJJZ()) != null && (LIZIZ = LJJJJZ.LIZIZ()) != null) {
            LIZIZ.LIZJ();
        }
        C79108HGk.LIZ();
    }

    public final void LIZ(C448383oO c448383oO) {
        if (PatchProxy.proxy(new Object[]{c448383oO}, this, LIZJ, false, 174).isSupported) {
            return;
        }
        C106862S5w.LIZ(c448383oO);
        this.LJJLIIIJL = c448383oO;
    }

    private final int LIZLLL(int i) {
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ;
        C6307m LIZIZ2;
        int i2 = 1;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZJ, false, 46);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJJZZIII = LJJJI.LJJZZIII()) != null && (LIZIZ = LJJZZIII.LIZIZ()) != null && (LIZIZ2 = LIZIZ.LIZIZ()) != null && LIZIZ2.LIZIZ == 12) {
            List<Integer> list = LIZIZ2.LIZJ;
            if (list == null || !list.contains(1)) {
                i2 = 2;
            }
            Integer LIZ = HE1.LIZIZ.LIZ(2, i2);
            if (LIZ == null) {
                return 2;
            }
            return LIZ.intValue();
        }
        return i;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget
    public final AbstractC6070q LIZIZ(String str) {
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 27);
        if (proxy.isSupported) {
            return (AbstractC6070q) proxy.result;
        }
        if (C79046HEa.LIZ().LJI != 1 && C79046HEa.LIZ().LJI != 3) {
            z = false;
        }
        AbstractC2885g createVideoTalkView = ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).createVideoTalkView(this.context, str, z, this);
        createVideoTalkView.LIZ(new HFC(this));
        this.LJJII = createVideoTalkView;
        VideoTalkRoomPermissionCheckWidget videoTalkRoomPermissionCheckWidget = this.LJJIJIIJIL;
        if (videoTalkRoomPermissionCheckWidget != null) {
            videoTalkRoomPermissionCheckWidget.LIZ(createVideoTalkView);
        }
        return createVideoTalkView;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    @Deprecated(message = "仅打Log作为参考，后续可以删除")
    public final void LIZJ(C8874fl c8874fl) {
        List<Integer> list;
        ChangePlayModeData changePlayModeData;
        C106862S5w.LIZ(c8874fl);
        LinkerChangePlayModeContent linkerChangePlayModeContent = c8874fl.LJJIIJZLJL;
        if (linkerChangePlayModeContent != null && (changePlayModeData = linkerChangePlayModeContent.changePlayModeData) != null) {
            list = changePlayModeData.playModes;
        } else {
            list = null;
        }
        ALogger.m15797i("ttlive_link_video", "playModeChangeMsg(id=" + c8874fl.getMessageId() + "), current=" + LJJIJL() + ", new=" + list);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAdminLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4797h
    /* renamed from: LJ */
    public final void mo15670LJ(long j) {
        LinkPlayerInfo LIZ;
        User LIZ2;
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZJ, false, 69).isSupported) {
            return;
        }
        super.mo15670LJ(j);
        AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs = this.LJJJLL;
        if (abstractC78986HBs != null && (LIZ = abstractC78986HBs.LIZ(j, abstractC78986HBs.LIZIZ(j))) != null && (LIZ2 = LIZ.LIZ()) != null) {
            C88440Kt0.LIZ(LK5.LIZ(2131585493, LinkPlayerInfo.LIZ(LIZ2.getNickName())));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m.AbstractC4965a
    public final ILayerControl.ILayer LJI(String str) {
        LiveCore liveCore;
        ILayerControl layerControl;
        LiveCore liveCore2;
        ILayerControl layerControl2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 155);
        if (proxy.isSupported) {
            return (ILayerControl.ILayer) proxy.result;
        }
        C79007HCn LJII = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        if (TextUtils.equals(str, LJII.LIZIZ())) {
            AbstractC6070q abstractC6070q = this.LJIILLIIL;
            if (abstractC6070q == null || (liveCore2 = abstractC6070q.getLiveCore()) == null || (layerControl2 = liveCore2.getLayerControl()) == null) {
                return null;
            }
            return layerControl2.getLocalOriginLayer();
        }
        AbstractC6070q abstractC6070q2 = this.LJIILLIIL;
        if (abstractC6070q2 == null || (liveCore = abstractC6070q2.getLiveCore()) == null || (layerControl = liveCore.getLayerControl()) == null) {
            return null;
        }
        return layerControl.getLayer(str);
    }

    public final void LJIIIIZZ(String str) {
        HHA hha;
        HHA hha2;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 102).isSupported && (hha = this.LJIIZILJ) != null && hha.LJI) {
            HHA hha3 = this.LJIIZILJ;
            if (hha3 != null) {
                hha3.LIZIZ(false, "onResume");
            }
            LIZ().LJIIJ();
            if (LJJJJIZL() == 3 && (hha2 = this.LJIIZILJ) != null) {
                hha2.LIZIZ();
            }
            if (LJJJJIZL() == 3) {
                HDI hdi = this.LJJJLIIL;
                if (hdi == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                HDI.LIZ(hdi, ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ(), null, 2, null);
            }
            AbstractC2885g abstractC2885g = this.LJJII;
            if (abstractC2885g != null) {
                abstractC2885g.LIZ();
            }
            C79007HCn LJII = C79007HCn.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII, "");
            HH8.LJFF(LJII, "resume");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    /* renamed from: a_ */
    public final void mo15665a_(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZJ, false, 128).isSupported) {
            return;
        }
        AbstractC4964m abstractC4964m = this.LJII;
        if (abstractC4964m instanceof C4966r) {
            if (abstractC4964m != null) {
                ((C4966r) abstractC4964m).LIZJ(j);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.videotalk.ui.VideoCameraRoomWindowManagerV2");
        } else if (abstractC4964m instanceof AbstractC80636HqQ) {
            if (abstractC4964m != null) {
                ((AbstractC80636HqQ) abstractC4964m).LIZJ(j);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.videotalk.ui.BaseEqualTalkRoomWindowManager");
        } else if (abstractC4964m instanceof C80627HqH) {
            if (abstractC4964m != null) {
                ((C80627HqH) abstractC4964m).LIZIZ(j);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.videotalk.ui.VideoTeamFightWindowManager");
        } else if (abstractC4964m instanceof C80607Hpx) {
            if (abstractC4964m != null) {
                ((C80607Hpx) abstractC4964m).LIZIZ(j);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.linkroomfight.ui.LinkRoomFightWindowManager");
        } else if (abstractC4964m instanceof C80630HqK) {
            if (abstractC4964m != null) {
                ((C80630HqK) abstractC4964m).LIZIZ(j);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.videotalk.ui.VideoDoubleCenterWindowManager");
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.proxy(new Object[]{configuration}, this, LIZJ, false, 165).isSupported) {
            return;
        }
        super.onConfigurationChanged(configuration);
        if (G22.LIZLLL()) {
            AbstractC4964m abstractC4964m = this.LJII;
            if (!(abstractC4964m instanceof AbstractC80636HqQ)) {
                abstractC4964m = null;
            }
            AbstractC80636HqQ abstractC80636HqQ = (AbstractC80636HqQ) abstractC4964m;
            if (abstractC80636HqQ != null) {
                abstractC80636HqQ.LJJIJIIJI();
            }
            AbstractC4964m abstractC4964m2 = this.LJII;
            if (!(abstractC4964m2 instanceof C80635HqP)) {
                abstractC4964m2 = null;
            }
            C80635HqP c80635HqP = (C80635HqP) abstractC4964m2;
            if (c80635HqP != null) {
                c80635HqP.LJJIJIIJIL();
            }
            AbstractC4964m abstractC4964m3 = this.LJII;
            if (!(abstractC4964m3 instanceof C80627HqH)) {
                abstractC4964m3 = null;
            }
            C80627HqH c80627HqH = (C80627HqH) abstractC4964m3;
            if (c80627HqH != null) {
                c80627HqH.LIZIZ();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a4, code lost:
        if (r3 != 1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int LIZJ(int r8) {
        /*
            r7 = this;
            r6 = 1
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r4 = 0
            r2[r4] = r0
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomGuestWidget.LIZJ
            r0 = 42
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r7, r1, r4, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r1.result
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L1f:
            X.H2k r0 = com.bytedance.android.live.liveinteract.digitavatar.C4382d.LIZLLL
            com.bytedance.android.live.liveinteract.digitavatar.d r0 = r0.LIZ()
            if (r0 == 0) goto L6e
            X.2WC r0 = r0.LIZJ()
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r0.LIZ()
            com.bytedance.android.live.liveinteract.digitavatar.videoavatar.VideoShowMode r0 = (com.bytedance.android.live.liveinteract.digitavatar.videoavatar.VideoShowMode) r0
            if (r0 == 0) goto L6e
            int r2 = p003X.C79242HLo.LJIIJ()
            int[] r1 = p003X.HE8.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            java.lang.String r5 = "KtvDigitAvatar"
            r3 = 2
            if (r1 == r6) goto Lc1
            if (r1 == r3) goto L6f
            r0 = 3
            if (r1 != r0) goto L69
            int r8 = p003X.C77562Ghw.LIZ(r0, r2)
            if (r8 == r0) goto L69
            java.lang.String r0 = "主播开启默认视频连线，avatar降级为视频，reset audio mode to video mode"
            com.bytedance.android.live.core.log.ALogger.m15795w(r5, r0)
            X.H2k r0 = com.bytedance.android.live.liveinteract.digitavatar.C4382d.LIZLLL
            com.bytedance.android.live.liveinteract.digitavatar.d r0 = r0.LIZ()
            if (r0 == 0) goto L69
            X.2WC r1 = r0.LIZJ()
            if (r1 == 0) goto L69
            com.bytedance.android.live.liveinteract.digitavatar.videoavatar.VideoShowMode r0 = com.bytedance.android.live.liveinteract.digitavatar.videoavatar.VideoShowMode.VIDEO
            r1.LIZ(r0)
        L69:
            X.HH8 r0 = p003X.HH8.LIZIZ
            r0.LIZ(r8, r4)
        L6e:
            return r8
        L6f:
            com.bytedance.android.livesdk.chatroom.dp r0 = r7.LJJJI()
            if (r0 == 0) goto La6
            X.2Xt r0 = r0.LJJZZIII()
            if (r0 == 0) goto La6
            java.lang.Object r0 = r0.LIZIZ()
            com.bytedance.android.livesdk.chatroom.u.f r0 = (com.bytedance.android.livesdk.chatroom.p517u.AbstractC6302f) r0
            if (r0 == 0) goto La6
            com.bytedance.android.livesdk.chatroom.u.m r2 = r0.LIZIZ()
            if (r2 == 0) goto La6
            int r1 = r2.LIZIZ
            r0 = 12
            if (r1 != r0) goto L9e
            java.util.List<java.lang.Integer> r1 = r2.LIZJ
            if (r1 == 0) goto L9e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L9e
            r3 = 1
        L9e:
            int r0 = r2.LIZIZ
            int r3 = p003X.C77562Ghw.LIZ(r3, r0)
            if (r3 == r6) goto Lbf
        La6:
            java.lang.String r0 = "主播关闭默认视频连线，视频降级为语音，reset video mode to audio mode"
            com.bytedance.android.live.core.log.ALogger.m15795w(r5, r0)
            X.H2k r0 = com.bytedance.android.live.liveinteract.digitavatar.C4382d.LIZLLL
            com.bytedance.android.live.liveinteract.digitavatar.d r0 = r0.LIZ()
            if (r0 == 0) goto Lbe
            X.2WC r1 = r0.LIZJ()
            if (r1 == 0) goto Lbe
            com.bytedance.android.live.liveinteract.digitavatar.videoavatar.VideoShowMode r0 = com.bytedance.android.live.liveinteract.digitavatar.videoavatar.VideoShowMode.AUDIO
            r1.LIZ(r0)
        Lbe:
            r4 = 1
        Lbf:
            r8 = r3
            goto L69
        Lc1:
            int r8 = p003X.C77562Ghw.LIZ(r3, r2)
            if (r8 == r3) goto L69
            java.lang.String r0 = "主播开启默认视频连线，reset audio mode to video mode"
            com.bytedance.android.live.core.log.ALogger.m15795w(r5, r0)
            X.H2k r0 = com.bytedance.android.live.liveinteract.digitavatar.C4382d.LIZLLL
            com.bytedance.android.live.liveinteract.digitavatar.d r0 = r0.LIZ()
            if (r0 == 0) goto L69
            X.2WC r1 = r0.LIZJ()
            if (r1 == 0) goto L69
            com.bytedance.android.live.liveinteract.digitavatar.videoavatar.VideoShowMode r0 = com.bytedance.android.live.liveinteract.digitavatar.videoavatar.VideoShowMode.VIDEO
            r1.LIZ(r0)
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomGuestWidget.LIZJ(int):int");
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p387b.a$a
    public final void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZJ, false, 92).isSupported || !isViewValid()) {
            return;
        }
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                } else {
                    LIZ(false, "silence message " + i);
                    LIZ().LIZ(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ(), C79007HCn.LJII().LIZLLL, 3);
                    C448383oO c448383oO = this.LJJLIIIJL;
                    if (c448383oO == null) {
                        return;
                    }
                    c448383oO.LIZIZ(false);
                    return;
                }
            }
            LIZ(false, "silence message " + i);
            C88440Kt0.LIZ(2131585611);
            if (this.LJJIFFI) {
                HH8.LJI();
                this.dataCenter.put("data_talk_room_capture_audio_notification_show_state", Boolean.FALSE);
            }
            C448383oO c448383oO2 = this.LJJLIIIJL;
            if (c448383oO2 != null) {
                c448383oO2.LIZIZ(false);
                return;
            }
            return;
        }
        LIZ(true, "silence message " + i);
        C88440Kt0.LIZ(2131585645);
        C448383oO c448383oO3 = this.LJJLIIIJL;
        if (c448383oO3 != null) {
            c448383oO3.LIZIZ(true);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    public final void LIZLLL(C8854es c8854es) {
        C78964HAw c78964HAw;
        FragmentManager fragmentManager;
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LIZJ, false, 103).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        super.LIZLLL(c8854es);
        HK5 hk5 = this.LJJIJIIJI;
        if (hk5 != null && hk5.LJIILIIL()) {
            return;
        }
        GameInviteInfo gameInviteInfo = c8854es.LJJLIIIJ;
        if (gameInviteInfo != null && gameInviteInfo.isGameInvite()) {
            this.LJLJJI.LIZ("game_invite");
        } else if (c8854es.LJJLIIIJL != null) {
            this.LJLJJI.LIZ("gift_message_invite");
            this.LJLJJI.f6718LJ = c8854es.LJJLIIIJL;
        } else {
            this.LJLJJI.LIZ("invite");
        }
        this.LJLJJI.LIZJ = c8854es.LJJI;
        C78536Gxe.LIZ().LJIIJ();
        HB4 hb4 = C78964HAw.LJIIIZ;
        Room LJJIIJZLJL = LJJIIJZLJL();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{LJJIIJZLJL, c8854es}, hb4, HB4.LIZ, false, 1);
        if (proxy.isSupported) {
            c78964HAw = (C78964HAw) proxy.result;
        } else {
            C106862S5w.LIZ(LJJIIJZLJL, c8854es);
            c78964HAw = new C78964HAw();
            c78964HAw.f6641LJ = LJJIIJZLJL;
            c78964HAw.LJFF = c8854es;
        }
        this.LJJJZ = c78964HAw;
        C78964HAw c78964HAw2 = this.LJJJZ;
        if (c78964HAw2 != null) {
            FragmentActivity LIZ = HKE.LIZIZ.LIZ(getContext());
            if (LIZ != null) {
                fragmentManager = LIZ.getSupportFragmentManager();
            } else {
                fragmentManager = null;
            }
            c78964HAw2.show(fragmentManager, "VideoTalkBeInvitedDialog");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    /* renamed from: LJ */
    public final void mo15668LJ(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LIZJ, false, 60).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        if (isViewValid() && this.LJJIFFI) {
            LIZ(false, "kickout");
            this.dataCenter.put("data_talk_room_capture_audio_notification_show_state", Boolean.FALSE);
        }
        if (c8854es.LJJJLZIJ == 1) {
            LJIIIZ("kickout");
        }
        super.mo15668LJ(c8854es);
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p387b.a$a
    public final void LJFF(long j) {
        User LIZ;
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZJ, false, 95).isSupported) {
            return;
        }
        if (j == ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ()) {
            LIZ(false, "silence success");
            if (!this.LJLJLLL) {
                C88440Kt0.LIZ(LK5.LIZ(2131588249));
                return;
            }
            return;
        }
        AbstractC78986HBs<LinkPlayerInfo> LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null && (LIZ = LJIIIIZZ.LIZ(j)) != null) {
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
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZJ, false, 93).isSupported) {
            return;
        }
        if (j == ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ()) {
            LIZ(true, "unSilence success");
            if (!this.LJLJLLL) {
                C88440Kt0.LIZ(LK5.LIZ(2131588256));
            }
            this.LJLJLLL = false;
            return;
        }
        AbstractC78986HBs<LinkPlayerInfo> LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null && (LIZ = LJIIIIZZ.LIZ(j)) != null) {
            if (!TextUtils.isEmpty(LIZ.getNickName()) && LIZ.getNickName().length() > 10) {
                new StringBuilder();
                C88440Kt0.LIZ(LK5.LIZ(2131588255, C0002O.m25086C(LIZ.getNickName().subSequence(0, 10).toString(), "...")));
                return;
            }
            C88440Kt0.LIZ(LK5.LIZ(2131588255, LIZ.getNickName()));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    /* renamed from: b_ */
    public final void mo15664b_(C8854es c8854es) {
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ;
        List<Integer> list;
        boolean z = false;
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LIZJ, false, 134).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        C6307m LJJIJL = LJJIJL();
        if (LJJIJL != null && (list = LJJIJL.LIZJ) != null) {
            z = list.contains(1);
        }
        this.LJJJJIZL = z;
        AbstractC4254a LJJIIJ = LJJIIJ();
        if (!(LJJIIJ instanceof C79007HCn)) {
            LJJIIJ = null;
        }
        C79007HCn c79007HCn = (C79007HCn) LJJIIJ;
        if (c79007HCn != null) {
            c79007HCn.LJIIJJI = c8854es.LJJIJIIJI;
            c79007HCn.LJIIIIZZ = c8854es.LJJIJIIJIL;
            c79007HCn.LJIIIZ = c8854es.LJJIJ;
            c79007HCn.LJII = c8854es.LJJIIZI;
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJJZZIII = LJJJI.LJJZZIII()) != null && (LIZIZ = LJJZZIII.LIZIZ()) != null) {
            LIZIZ.LIZ(LIZIZ.LIZIZ());
            LIZIZ.LIZIZ(new C6307m(c8854es.LIZ(), c8854es.LJJJJJ, c8854es.LJJJJJL));
        }
        List<AnchorLinkUser> list2 = c8854es.LJJJJL;
        if (list2 != null) {
            ALogger.m15797i("ttlive_link_video", C0002O.m25086C("switchSceneByMessage ListUser=", C79242HLo.LIZIZ(list2)));
            LIZ().LIZ(list2, c8854es.LJJL, "switchSceneMsg", c8854es.LJJLIIIJJIZ);
        }
        if (LJIIIZ()) {
            C79004HCk c79004HCk = this.LJLLJ;
            if (c79004HCk == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c79004HCk.LIZ(new HEI(c8854es.LIZ(), c8854es.LJJJJJL, "switchSceneMessage", null, 8));
            LJII("switchSceneMessage");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: f_ */
    public final void mo15657f_(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 91).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        super.mo15657f_(str);
        AbstractC4964m abstractC4964m = this.LJII;
        if (abstractC4964m != null) {
            abstractC4964m.LIZIZ(str);
        }
        C79007HCn LJII = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        C8681b LJIIIZ = LJII.LJIIIZ();
        if (LJIIIZ != null) {
            if (LJIIIZ.LIZJ) {
                HHA hha = this.LJIIZILJ;
                if (hha != null) {
                    String str2 = LJIIIZ.LIZIZ;
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    hha.LIZ(str2, false);
                }
                HHA hha2 = this.LJIIZILJ;
                if (hha2 != null) {
                    String str3 = LJIIIZ.LIZIZ;
                    Intrinsics.checkNotNullExpressionValue(str3, "");
                    hha2.LIZIZ(str3, false);
                }
                HHA hha3 = this.LJIIZILJ;
                if (hha3 != null) {
                    String LIZ = LJJIIJ().LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ, "");
                    hha3.LIZ(LIZ, true);
                }
                HHA hha4 = this.LJIIZILJ;
                if (hha4 != null) {
                    String LIZ2 = LJJIIJ().LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                    hha4.LIZIZ(LIZ2, true);
                    return;
                }
                return;
            }
            HHA hha5 = this.LJIIZILJ;
            if (hha5 != null) {
                String str4 = LJIIIZ.LIZIZ;
                Intrinsics.checkNotNullExpressionValue(str4, "");
                hha5.LIZ(str4, true);
            }
            HHA hha6 = this.LJIIZILJ;
            if (hha6 != null) {
                String str5 = LJIIIZ.LIZIZ;
                Intrinsics.checkNotNullExpressionValue(str5, "");
                hha6.LIZIZ(str5, true);
            }
            HHA hha7 = this.LJIIZILJ;
            if (hha7 != null) {
                String LIZ3 = LJJIIJ().LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                hha7.LIZ(LIZ3, false);
            }
            HHA hha8 = this.LJIIZILJ;
            if (hha8 == null) {
                return;
            }
            String LIZ4 = LJJIIJ().LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ4, "");
            hha8.LIZIZ(LIZ4, false);
        }
    }

    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        FragmentManager supportFragmentManager;
        VideoTalkCPositionBeInvitedDialog videoTalkCPositionBeInvitedDialog;
        HED hed;
        if (!PatchProxy.proxy(new Object[]{iMessage}, this, LIZJ, false, 169).isSupported && (iMessage instanceof C8874fl)) {
            C8874fl c8874fl = (C8874fl) iMessage;
            int i = c8874fl.LIZIZ;
            if (i != 36) {
                if (i == 37 && !PatchProxy.proxy(new Object[]{c8874fl}, this, LIZJ, false, 171).isSupported && (hed = c8874fl.LJJIJLIJ) != null) {
                    TalkRoomBusinessFullLinkMonitor.LIZIZ.LIZ(c8874fl.getMessageId(), hed);
                    if (hed.LIZJ == CPositionReplyType.Reject.value) {
                        String str = hed.LIZLLL;
                        if (str != null && str.length() != 0) {
                            C88440Kt0.LIZ(hed.LIZLLL);
                        } else {
                            C88440Kt0.LIZ(2131587946);
                        }
                    }
                }
            } else if (PatchProxy.proxy(new Object[]{c8874fl}, this, LIZJ, false, 170).isSupported || !LJIIIZ() || c8874fl.LJJIJL == null) {
            } else {
                TalkRoomBusinessFullLinkMonitor talkRoomBusinessFullLinkMonitor = TalkRoomBusinessFullLinkMonitor.LIZIZ;
                long messageId = c8874fl.getMessageId();
                C78596Gyc c78596Gyc = c8874fl.LJJIJL;
                Intrinsics.checkNotNullExpressionValue(c78596Gyc, "");
                if (!PatchProxy.proxy(new Object[]{new Long(messageId), c78596Gyc}, talkRoomBusinessFullLinkMonitor, TalkRoomBusinessFullLinkMonitor.LIZ, false, 60).isSupported) {
                    C106862S5w.LIZ(c78596Gyc);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("msg_id", messageId);
                    jSONObject.put("from_user_id", c78596Gyc.LIZ);
                    C79111HGn.LIZ(C79111HGn.LIZJ, LinkMonitorData.ReceiveEnlargeInviteMsgMonitorData, jSONObject, 0, null, 12, null);
                }
                VideoTalkCPositionBeInvitedDialog videoTalkCPositionBeInvitedDialog2 = this.LJJLIIIJLJLI;
                if (videoTalkCPositionBeInvitedDialog2 != null && videoTalkCPositionBeInvitedDialog2.LJIILIIL() && (videoTalkCPositionBeInvitedDialog = this.LJJLIIIJLJLI) != null) {
                    videoTalkCPositionBeInvitedDialog.dismissAllowingStateLoss();
                }
                FragmentActivity LIZIZ = C439993ar.LIZIZ(getContext());
                if (LIZIZ == null || (supportFragmentManager = LIZIZ.getSupportFragmentManager()) == null) {
                    return;
                }
                VideoTalkCPositionBeInvitedDialog LIZ = VideoTalkCPositionBeInvitedDialog.LJIIIIZZ.LIZ(VideoTalkCPositionBeInvitedDialog.ShowType.Invite, LJJIIJZLJL().getRoomId(), false, c8874fl.LJJIJL.LIZ, c8874fl);
                this.LJJLIIIJLJLI = LIZ;
                LIZ.show(supportFragmentManager, "VideoTalkCPositionBeInvitedDialog");
            }
        }
    }

    private final void LJIIIZ(String str) {
        String str2;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 113).isSupported) {
            return;
        }
        SettingKey<C6858bo> settingKey = LiveSettingKeys.LINK_PAYMENT_CONFIG;
        String str3 = "";
        Intrinsics.checkNotNullExpressionValue(settingKey, str3);
        String str4 = settingKey.getValue().f27217LJ;
        AbstractC8644i LIZ = C4574547f.LIZ().LIZ(C8668v.class);
        Intrinsics.checkNotNullExpressionValue(LIZ, str3);
        String str5 = LIZ.LIZ().get("enter_from_merge");
        if (str5 == null) {
            str5 = str3;
        }
        String str6 = LIZ.LIZ().get("enter_method");
        if (str6 == null) {
            str6 = str3;
        }
        String str7 = LIZ.LIZ().get("action_type");
        if (str7 != null) {
            str3 = str7;
        }
        Pair[] pairArr = new Pair[10];
        pairArr[0] = TuplesKt.m137to("service_provider_id", String.valueOf(LJJIIJZLJL().ownerUserId));
        pairArr[1] = TuplesKt.m137to("service_order_id", this.LJIJ);
        pairArr[2] = TuplesKt.m137to("room_id", String.valueOf(LJJIIJZLJL().getId()));
        pairArr[3] = TuplesKt.m137to("anchor_id", String.valueOf(LJJIIJZLJL().ownerUserId));
        pairArr[4] = TuplesKt.m137to("live_type", "video_live");
        pairArr[5] = TuplesKt.m137to("enter_from_merge", str5);
        pairArr[6] = TuplesKt.m137to("enter_method", str6);
        pairArr[7] = TuplesKt.m137to("action_type", str3);
        if (C79242HLo.LJIIZILJ()) {
            str2 = "party";
        } else {
            str2 = "radio";
        }
        pairArr[8] = TuplesKt.m137to("function_type", str2);
        pairArr[9] = TuplesKt.m137to("limited_time", String.valueOf(C4284f.LJIIIIZZ.LIZIZ().LIZJ));
        String LIZIZ = C414642b4.LIZIZ(str4, MapsKt__MapsKt.plus(MapsKt__MapsKt.plus(MapsKt__MapsKt.mapOf(pairArr), TuplesKt.m137to("connection_time", String.valueOf(this.LJJIJIL))), TuplesKt.m137to("connection_cost", String.valueOf(this.LJJIJL))));
        ALogger.m15797i("ttlive_link_paid", C0002O.m25084C("showPaidLinkCommentDialog from=", str, " commentSchema=", LIZIZ));
        ((ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class)).handle(this.context, LIZIZ);
    }

    public final AbstractC4964m LIZIZ(Class<? extends AbstractC4964m> cls) {
        View findViewById;
        View findViewById2;
        View findViewById3;
        View findViewById4;
        View findViewById5;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, LIZJ, false, 143);
        if (proxy.isSupported) {
            return (AbstractC4964m) proxy.result;
        }
        if (Intrinsics.areEqual(cls, C80635HqP.class)) {
            View view = this.contentView;
            if (view != null && (findViewById5 = view.findViewById(2131184133)) != null) {
                findViewById5.setVisibility(0);
            }
            Room LJJIIJZLJL = LJJIIJZLJL();
            View view2 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            View findViewById6 = view2.findViewById(2131184133);
            if (findViewById6 != null) {
                Context context = this.context;
                Intrinsics.checkNotNullExpressionValue(context, "");
                DataCenter dataCenter = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter, "");
                ViewGroup viewGroup = this.containerView;
                Intrinsics.checkNotNullExpressionValue(viewGroup, "");
                FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(2131197173);
                Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                return new C80635HqP(LJJIIJZLJL, false, (ConstraintLayout) findViewById6, context, dataCenter, this, this, null, frameLayout);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
        } else if (Intrinsics.areEqual(cls, C80641HqV.class)) {
            View view3 = this.contentView;
            if (view3 != null && (findViewById4 = view3.findViewById(2131184133)) != null) {
                findViewById4.setVisibility(0);
            }
            Room LJJIIJZLJL2 = LJJIIJZLJL();
            View view4 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view4, "");
            View findViewById7 = view4.findViewById(2131184133);
            if (findViewById7 != null) {
                Context context2 = this.context;
                Intrinsics.checkNotNullExpressionValue(context2, "");
                DataCenter dataCenter2 = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter2, "");
                ViewGroup viewGroup2 = this.containerView;
                Intrinsics.checkNotNullExpressionValue(viewGroup2, "");
                FrameLayout frameLayout2 = (FrameLayout) viewGroup2.findViewById(2131197173);
                Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
                return new C80641HqV(LJJIIJZLJL2, false, (ConstraintLayout) findViewById7, context2, dataCenter2, this, this, null, frameLayout2);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
        } else if (Intrinsics.areEqual(cls, C80627HqH.class)) {
            View view5 = this.contentView;
            if (view5 != null && (findViewById3 = view5.findViewById(2131173812)) != null) {
                findViewById3.setVisibility(0);
            }
            Room LJJIIJZLJL3 = LJJIIJZLJL();
            View view6 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view6, "");
            View findViewById8 = view6.findViewById(2131173812);
            if (findViewById8 != null) {
                Context context3 = this.context;
                Intrinsics.checkNotNullExpressionValue(context3, "");
                DataCenter dataCenter3 = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter3, "");
                ViewGroup viewGroup3 = this.containerView;
                Intrinsics.checkNotNullExpressionValue(viewGroup3, "");
                FrameLayout frameLayout3 = (FrameLayout) viewGroup3.findViewById(2131197173);
                Intrinsics.checkNotNullExpressionValue(frameLayout3, "");
                return new C80627HqH(LJJIIJZLJL3, false, (ConstraintLayout) findViewById8, context3, dataCenter3, this, this, null, frameLayout3);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
        } else if (Intrinsics.areEqual(cls, C80630HqK.class)) {
            View view7 = this.contentView;
            if (view7 != null && (findViewById2 = view7.findViewById(2131172771)) != null) {
                findViewById2.setVisibility(0);
            }
            Room LJJIIJZLJL4 = LJJIIJZLJL();
            View view8 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view8, "");
            View findViewById9 = view8.findViewById(2131172771);
            if (findViewById9 != null) {
                Context context4 = this.context;
                Intrinsics.checkNotNullExpressionValue(context4, "");
                DataCenter dataCenter4 = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter4, "");
                ViewGroup viewGroup4 = this.containerView;
                Intrinsics.checkNotNullExpressionValue(viewGroup4, "");
                FrameLayout frameLayout4 = (FrameLayout) viewGroup4.findViewById(2131197173);
                Intrinsics.checkNotNullExpressionValue(frameLayout4, "");
                return new C80630HqK(LJJIIJZLJL4, false, (ConstraintLayout) findViewById9, context4, dataCenter4, this, this, null, frameLayout4);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
        } else if (Intrinsics.areEqual(cls, C80642HqW.class)) {
            View view9 = this.contentView;
            if (view9 != null && (findViewById = view9.findViewById(2131184133)) != null) {
                findViewById.setVisibility(0);
            }
            Room LJJIIJZLJL5 = LJJIIJZLJL();
            View view10 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view10, "");
            View findViewById10 = view10.findViewById(2131184133);
            if (findViewById10 != null) {
                Context context5 = this.context;
                Intrinsics.checkNotNullExpressionValue(context5, "");
                DataCenter dataCenter5 = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter5, "");
                ViewGroup viewGroup5 = this.containerView;
                Intrinsics.checkNotNullExpressionValue(viewGroup5, "");
                FrameLayout frameLayout5 = (FrameLayout) viewGroup5.findViewById(2131197173);
                Intrinsics.checkNotNullExpressionValue(frameLayout5, "");
                return new C80642HqW(LJJIIJZLJL5, false, (ConstraintLayout) findViewById10, context5, dataCenter5, this, this, null, frameLayout5);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
        } else {
            return null;
        }
    }

    public final AbstractC4964m LIZJ(Class<? extends AbstractC4964m> cls) {
        View findViewById;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, LIZJ, false, 144);
        if (proxy.isSupported) {
            return (AbstractC4964m) proxy.result;
        }
        View view = this.contentView;
        if (view != null && (findViewById = view.findViewById(2131168962)) != null) {
            findViewById.setVisibility(0);
        }
        if (Intrinsics.areEqual(cls, C80646Hqa.class)) {
            Room LJJIIJZLJL = LJJIIJZLJL();
            View view2 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            View findViewById2 = view2.findViewById(2131168962);
            if (findViewById2 != null) {
                Context context = this.context;
                Intrinsics.checkNotNullExpressionValue(context, "");
                DataCenter dataCenter = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter, "");
                ViewGroup viewGroup = this.containerView;
                Intrinsics.checkNotNullExpressionValue(viewGroup, "");
                FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(2131197173);
                Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                return new C80646Hqa(LJJIIJZLJL, false, (ConstraintLayout) findViewById2, context, dataCenter, this, this, null, frameLayout);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
        }
        Room LJJIIJZLJL2 = LJJIIJZLJL();
        View view3 = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view3, "");
        View findViewById3 = view3.findViewById(2131168962);
        if (findViewById3 != null) {
            Context context2 = this.context;
            Intrinsics.checkNotNullExpressionValue(context2, "");
            DataCenter dataCenter2 = this.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter2, "");
            ViewGroup viewGroup2 = this.containerView;
            Intrinsics.checkNotNullExpressionValue(viewGroup2, "");
            FrameLayout frameLayout2 = (FrameLayout) viewGroup2.findViewById(2131197173);
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
            return new C80650Hqe(LJJIIJZLJL2, false, (ConstraintLayout) findViewById3, context2, dataCenter2, this, this, null, frameLayout2);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    public final void LIZLLL(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZJ, false, 119).isSupported) {
            return;
        }
        super.LIZLLL(th);
        if (isViewValid()) {
            C88469KtT.LIZ(this.context, th);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAdminLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    /* renamed from: LJ */
    public final void mo15667LJ(C8874fl c8874fl) {
        AbstractC4964m abstractC4964m;
        AbstractC4964m abstractC4964m2;
        if (PatchProxy.proxy(new Object[]{c8874fl}, this, LIZJ, false, 154).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8874fl);
        super.mo15667LJ(c8874fl);
        C8685f c8685f = c8874fl.LJJ;
        if (c8685f != null) {
            C79007HCn LJII = C79007HCn.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII, "");
            C8681b LJIIIZ = LJII.LJIIIZ();
            if (LJIIIZ != null) {
                LJIIIZ.LIZJ = c8685f.LIZ;
                if (c8685f.LIZ) {
                    HHA hha = this.LJIIZILJ;
                    if (hha != null) {
                        String str = LJIIIZ.LIZIZ;
                        Intrinsics.checkNotNullExpressionValue(str, "");
                        hha.LIZ(str, false);
                    }
                    HHA hha2 = this.LJIIZILJ;
                    if (hha2 != null) {
                        String str2 = LJIIIZ.LIZIZ;
                        Intrinsics.checkNotNullExpressionValue(str2, "");
                        hha2.LIZIZ(str2, false);
                    }
                    HHA hha3 = this.LJIIZILJ;
                    if (hha3 != null) {
                        String LIZ = LJJIIJ().LIZ();
                        Intrinsics.checkNotNullExpressionValue(LIZ, "");
                        hha3.LIZ(LIZ, true);
                    }
                    HHA hha4 = this.LJIIZILJ;
                    if (hha4 != null) {
                        String LIZ2 = LJJIIJ().LIZ();
                        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                        hha4.LIZIZ(LIZ2, true);
                    }
                    String str3 = LJIIIZ.LIZIZ;
                    if (str3 != null && this.LJJLIIIJILLIZJL.get(str3) != null && (abstractC4964m2 = this.LJII) != null) {
                        abstractC4964m2.LIZ(str3, this.LJJLIIIJILLIZJL.get(str3));
                        return;
                    }
                    return;
                }
                HHA hha5 = this.LJIIZILJ;
                if (hha5 != null) {
                    String str4 = LJIIIZ.LIZIZ;
                    Intrinsics.checkNotNullExpressionValue(str4, "");
                    hha5.LIZ(str4, true);
                }
                HHA hha6 = this.LJIIZILJ;
                if (hha6 != null) {
                    String str5 = LJIIIZ.LIZIZ;
                    Intrinsics.checkNotNullExpressionValue(str5, "");
                    hha6.LIZIZ(str5, true);
                }
                HHA hha7 = this.LJIIZILJ;
                if (hha7 != null) {
                    String LIZ3 = LJJIIJ().LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                    hha7.LIZ(LIZ3, false);
                }
                HHA hha8 = this.LJIIZILJ;
                if (hha8 != null) {
                    String LIZ4 = LJJIIJ().LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                    hha8.LIZIZ(LIZ4, false);
                }
                String LIZ5 = LJJIIJ().LIZ();
                if (LIZ5 == null || this.LJJLIIIJILLIZJL.get(LIZ5) == null || (abstractC4964m = this.LJII) == null) {
                    return;
                }
                abstractC4964m.LIZ(LIZ5, this.LJJLIIIJILLIZJL.get(LIZ5));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p391ui.AbstractC4964m.AbstractC4965a
    public final void LJII(String str) {
        HHA hha;
        HHA hha2;
        String LJIJJLI;
        HHA hha3;
        String LJIJJ;
        HHA hha4;
        SingingChallengeLiveCoreInfo singingChallengeLiveCoreInfo;
        Map<Long, String> map;
        String LIZIZ;
        SingingChallengeRtcInfo singingChallengeRtcInfo;
        Map<Long, String> map2;
        String LIZIZ2;
        String LJJIII;
        HHA hha5;
        String LJJIIJ;
        HHA hha6;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 135).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        ALogger.m15797i("ttlive_link_video", C0002O.m25086C("updateLiveCoreRtcInfo ", str));
        if (LJJJLL()) {
            AbstractC4964m abstractC4964m = this.LJII;
            if (!(abstractC4964m instanceof C80635HqP)) {
                abstractC4964m = null;
            }
            C80635HqP c80635HqP = (C80635HqP) abstractC4964m;
            if (c80635HqP != null && (LJJIIJ = c80635HqP.LJJIIJ()) != null && (hha6 = this.LJIIZILJ) != null) {
                hha6.LIZ(LJJIIJ);
            }
            AbstractC4964m abstractC4964m2 = this.LJII;
            if (!(abstractC4964m2 instanceof C80635HqP)) {
                abstractC4964m2 = null;
            }
            C80635HqP c80635HqP2 = (C80635HqP) abstractC4964m2;
            if (c80635HqP2 != null && (LJJIII = c80635HqP2.LJJIII()) != null && (hha5 = this.LJIIZILJ) != null) {
                hha5.LIZIZ(LJJIII);
                return;
            }
            return;
        }
        AbstractC4964m abstractC4964m3 = this.LJII;
        if (abstractC4964m3 instanceof C79080HFi) {
            AbstractC4254a LJJIIJ2 = LJJIIJ();
            if (!(LJJIIJ2 instanceof C79007HCn)) {
                LJJIIJ2 = null;
            }
            C79007HCn c79007HCn = (C79007HCn) LJJIIJ2;
            if (c79007HCn != null) {
                MultiRtcInfo multiRtcInfo = c79007HCn.LJIIIZ;
                if (multiRtcInfo != null && (singingChallengeRtcInfo = multiRtcInfo.singingChallengeRtcInfo) != null && (map2 = singingChallengeRtcInfo.LIZIZ) != null) {
                    AbstractC4964m abstractC4964m4 = this.LJII;
                    if (!(abstractC4964m4 instanceof C79080HFi)) {
                        abstractC4964m4 = null;
                    }
                    C79080HFi c79080HFi = (C79080HFi) abstractC4964m4;
                    if (c79080HFi != null && (LIZIZ2 = c79080HFi.LIZIZ(map2)) != null) {
                        HHA hha7 = this.LJIIZILJ;
                        if (hha7 != null) {
                            hha7.LIZIZ(LIZIZ2);
                        }
                        AbstractC4964m abstractC4964m5 = this.LJII;
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
                if (multiLiveCoreInfo != null && (singingChallengeLiveCoreInfo = multiLiveCoreInfo.singingChallengeLiveCoreInfo) != null && (map = singingChallengeLiveCoreInfo.LIZIZ) != null) {
                    AbstractC4964m abstractC4964m6 = this.LJII;
                    if (!(abstractC4964m6 instanceof C79080HFi)) {
                        abstractC4964m6 = null;
                    }
                    C79080HFi c79080HFi3 = (C79080HFi) abstractC4964m6;
                    if (c79080HFi3 == null || (LIZIZ = c79080HFi3.LIZIZ(map)) == null) {
                        return;
                    }
                    HHA hha8 = this.LJIIZILJ;
                    if (hha8 != null) {
                        hha8.LIZ(LIZIZ);
                    }
                    AbstractC4964m abstractC4964m7 = this.LJII;
                    if (!(abstractC4964m7 instanceof C79080HFi)) {
                        abstractC4964m7 = null;
                    }
                    C79080HFi c79080HFi4 = (C79080HFi) abstractC4964m7;
                    if (c79080HFi4 != null) {
                        c79080HFi4.LJIIIIZZ = LIZIZ;
                    }
                }
            }
        } else if (abstractC4964m3 instanceof C80630HqK) {
            if (!(abstractC4964m3 instanceof C80630HqK)) {
                abstractC4964m3 = null;
            }
            C80630HqK c80630HqK = (C80630HqK) abstractC4964m3;
            if (c80630HqK != null && (LJIJJ = c80630HqK.LJIJJ()) != null && (hha4 = this.LJIIZILJ) != null) {
                hha4.LIZ(LJIJJ);
            }
            AbstractC4964m abstractC4964m8 = this.LJII;
            if (!(abstractC4964m8 instanceof C80630HqK)) {
                abstractC4964m8 = null;
            }
            C80630HqK c80630HqK2 = (C80630HqK) abstractC4964m8;
            if (c80630HqK2 != null && (LJIJJLI = c80630HqK2.LJIJJLI()) != null && (hha3 = this.LJIIZILJ) != null) {
                hha3.LIZIZ(LJIJJLI);
            }
        } else {
            AbstractC4254a LJJIIJ3 = LJJIIJ();
            if (!(LJJIIJ3 instanceof C79007HCn)) {
                LJJIIJ3 = null;
            }
            C79007HCn c79007HCn2 = (C79007HCn) LJJIIJ3;
            if (c79007HCn2 == null) {
                return;
            }
            String str2 = c79007HCn2.LJII;
            if (str2 != null && str2.length() != 0 && (hha2 = this.LJIIZILJ) != null) {
                hha2.LIZIZ(c79007HCn2.LJII);
            }
            String str3 = c79007HCn2.LJIIIIZZ;
            if (str3 == null || str3.length() == 0 || (hha = this.LJIIZILJ) == null) {
                return;
            }
            hha.LIZ(c79007HCn2.LJIIIIZZ);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        MediaOperation mediaOperation;
        VideoShowMode videoShowMode;
        VideoShowMode videoShowMode2;
        C2WC<VideoShowMode> LIZJ2;
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZJ, false, 72).isSupported && isViewValid() && kVData2 != null && !TextUtils.isEmpty(kVData2.getKey()) && kVData2.getData() != null) {
            String key = kVData2.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "");
            if (Intrinsics.areEqual(key, "cmd_open_interact_manage_dialog_by_anchor")) {
                C87010KQi.LIZ().LIZ(new UserProfileEvent(LJJIIJZLJL().getOwner()));
            } else if (Intrinsics.areEqual(key, "cmd_video_talk_invite")) {
                User user = (User) kVData2.getData();
                if (user != null) {
                    if (((IUserService) ServiceManager.getService(IUserService.class)).user().LJI()) {
                        LIZ(new HAA(LJJIIJZLJL(), user, -1));
                    } else {
                        if (((IUserService) ServiceManager.getService(IUserService.class)).user().mo22927LJ()) {
                            C88440Kt0.LIZ(2131581829);
                        } else {
                            C88440Kt0.LIZ(2131583931);
                        }
                        HH8.LIZ(TalkRoomOperate.INVITE);
                    }
                    C78828H5q.LIZ("administrator", user.getId(), "card", 0, 8, (Object) null);
                }
            } else if (Intrinsics.areEqual(key, "cmd_show_guest_apply_dialog")) {
                Object data = kVData2.getData();
                Intrinsics.checkNotNull(data);
                Intrinsics.checkNotNullExpressionValue(data, "");
                if (((Boolean) data).booleanValue()) {
                    LIZ((C9605p) null);
                }
            } else if (!Intrinsics.areEqual(key, "cmd_operate_interact_media") || (mediaOperation = (MediaOperation) kVData2.getData()) == null) {
            } else {
                int i = HE8.LIZIZ[mediaOperation.LIZ.ordinal()];
                if (i != 1) {
                    if (i == 2 && !PatchProxy.proxy(new Object[]{mediaOperation}, this, LIZJ, false, 73).isSupported) {
                        int i2 = HE8.LIZJ[mediaOperation.LIZIZ.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                LIZ(C79242HLo.LIZ(), mediaOperation.LIZJ);
                                return;
                            }
                            return;
                        }
                        LIZIZ(C79242HLo.LIZ(), mediaOperation.LIZJ);
                    }
                } else if (!PatchProxy.proxy(new Object[]{mediaOperation}, this, LIZJ, false, 74).isSupported) {
                    C4382d LIZ = C4382d.LIZLLL.LIZ();
                    if (LIZ == null || (LIZJ2 = LIZ.LIZJ()) == null || (videoShowMode = LIZJ2.LIZ()) == null) {
                        videoShowMode = VideoShowMode.AUDIO;
                    }
                    int i3 = HE8.LIZLLL[mediaOperation.LIZIZ.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            videoShowMode2 = VideoShowMode.AUDIO;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        videoShowMode2 = VideoShowMode.VIDEO;
                    }
                    if (videoShowMode2 != videoShowMode) {
                        C4382d LIZ2 = C4382d.LIZLLL.LIZ();
                        if (LIZ2 != null) {
                            C79062HEq c79062HEq = new C79062HEq(mediaOperation);
                            if (!PatchProxy.proxy(new Object[]{videoShowMode2, c79062HEq}, LIZ2, C4382d.LIZ, false, 19).isSupported) {
                                C106862S5w.LIZ(videoShowMode2);
                                LIZ2.LIZLLL().LIZ(new C4387c(videoShowMode2, c79062HEq));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    AbstractC79093HFv abstractC79093HFv = mediaOperation.LIZJ;
                    if (abstractC79093HFv != null) {
                        abstractC79093HFv.LIZ();
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.p255g.AbstractC2885g.AbstractC2887b
    public final int LIZ(boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZJ, false, 164);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (LJJIJLIJ() != 13) {
            boolean currentIsMultipleKtvMode = ((IKtvService) ServiceManager.getService(IKtvService.class)).currentIsMultipleKtvMode();
            if (z) {
                return 1;
            }
            if (!currentIsMultipleKtvMode || !C79242HLo.LJIJJ()) {
                return 0;
            }
            return 5;
        } else if (z) {
            return 1;
        } else {
            return 5;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    public final void LIZJ(C8854es c8854es) {
        Map<Long, String> map;
        Map<Long, String> map2;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ;
        C6307m LIZIZ2;
        SingingChallengeLiveCoreInfo singingChallengeLiveCoreInfo;
        SingingChallengeRtcInfo singingChallengeRtcInfo;
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LIZJ, false, 104).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        StringBuilder sb = new StringBuilder("onReceivePermit rtc multiRtcInfo:");
        MultiRtcInfo multiRtcInfo = c8854es.LJJIJ;
        if (multiRtcInfo == null || (singingChallengeRtcInfo = multiRtcInfo.singingChallengeRtcInfo) == null || (map = singingChallengeRtcInfo.LIZIZ) == null) {
            map = "";
        }
        sb.append(map);
        ALogger.m15797i("link_room_fight", sb.toString());
        StringBuilder sb2 = new StringBuilder("onReceivePermit multiLiveCoreInfo:");
        MultiLiveCoreInfo multiLiveCoreInfo = c8854es.LJJIJIIJI;
        if (multiLiveCoreInfo == null || (singingChallengeLiveCoreInfo = multiLiveCoreInfo.singingChallengeLiveCoreInfo) == null || (map2 = singingChallengeLiveCoreInfo.LIZIZ) == null) {
            map2 = "";
        }
        sb2.append(map2);
        ALogger.m15797i("link_room_fight", sb2.toString());
        AbstractC4254a LJJIIJ = LJJIIJ();
        if (!(LJJIIJ instanceof C79007HCn)) {
            LJJIIJ = null;
        }
        C79007HCn c79007HCn = (C79007HCn) LJJIIJ;
        if (c79007HCn != null) {
            c79007HCn.LJIIIZ = c8854es.LJJIJ;
            c79007HCn.LJIIJJI = c8854es.LJJIJIIJI;
        }
        if (c8854es.LJJJJZ != 0) {
            C79046HEa.LIZ().LJI = c8854es.LJJJJZ;
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJJZZIII = LJJJI.LJJZZIII()) != null && (LIZIZ = LJJZZIII.LIZIZ()) != null && (LIZIZ2 = LIZIZ.LIZIZ()) != null) {
            Integer valueOf = Integer.valueOf(LIZIZ2.LIZIZ);
            if (valueOf.intValue() == 12 && valueOf != null) {
                valueOf.intValue();
                C79046HEa.LIZ().LJI = c8854es.LJJJJZ;
            }
        }
        C79007HCn LJII = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        if (C78467GwX.LIZ(false, LJII.LJIJ)) {
            C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.f7178du;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            if (c87308Kak.LIZ().intValue() > 0) {
                if (C79046HEa.LIZ().LJI == 2) {
                    C88440Kt0.LIZ(2131584135, 1);
                } else if (C79046HEa.LIZ().LJI == 3) {
                    C88440Kt0.LIZ(2131584136, 1);
                } else {
                    C88440Kt0.LIZ(2131584137, 1);
                }
            }
        }
        VideoTalkRoomPermissionCheckWidget videoTalkRoomPermissionCheckWidget = this.LJJIJIIJIL;
        if (videoTalkRoomPermissionCheckWidget != null) {
            videoTalkRoomPermissionCheckWidget.LIZIZ();
        }
        super.LIZJ(c8854es);
    }

    /* renamed from: LJ */
    public final void m15666LJ(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 80).isSupported && this.isViewValid && !LJIIIZ()) {
            this.LJJLIIIJLLLLLLLZ.LIZ(str);
        }
    }

    public final AbstractC4964m LIZ(Class<? extends AbstractC4964m> cls) {
        View findViewById;
        View findViewById2;
        View findViewById3;
        View findViewById4;
        View findViewById5;
        View findViewById6;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, LIZJ, false, 142);
        if (proxy.isSupported) {
            return (AbstractC4964m) proxy.result;
        }
        if (Intrinsics.areEqual(cls, C80644HqY.class)) {
            View view = this.contentView;
            if (view != null && (findViewById6 = view.findViewById(2131168962)) != null) {
                findViewById6.setVisibility(0);
            }
            Room LJJIIJZLJL = LJJIIJZLJL();
            View view2 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            View findViewById7 = view2.findViewById(2131168962);
            if (findViewById7 != null) {
                Context context = this.context;
                Intrinsics.checkNotNullExpressionValue(context, "");
                DataCenter dataCenter = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter, "");
                View view3 = this.contentView;
                Intrinsics.checkNotNullExpressionValue(view3, "");
                FrameLayout frameLayout = (FrameLayout) view3.findViewById(2131197173);
                Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                return new C80644HqY(LJJIIJZLJL, false, (ConstraintLayout) findViewById7, context, dataCenter, this, this, null, frameLayout);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
        } else if (Intrinsics.areEqual(cls, C4966r.class)) {
            View view4 = this.contentView;
            if (view4 != null && (findViewById5 = view4.findViewById(2131168962)) != null) {
                findViewById5.setVisibility(0);
            }
            Room LJJIIJZLJL2 = LJJIIJZLJL();
            View view5 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view5, "");
            View findViewById8 = view5.findViewById(2131168962);
            if (findViewById8 != null) {
                Context context2 = this.context;
                Intrinsics.checkNotNullExpressionValue(context2, "");
                DataCenter dataCenter2 = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter2, "");
                View view6 = this.contentView;
                Intrinsics.checkNotNullExpressionValue(view6, "");
                FrameLayout frameLayout2 = (FrameLayout) view6.findViewById(2131197173);
                Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
                return new C4966r(LJJIIJZLJL2, false, (ConstraintLayout) findViewById8, context2, dataCenter2, this, this, null, frameLayout2);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
        } else if (Intrinsics.areEqual(cls, C80645HqZ.class)) {
            View view7 = this.contentView;
            if (view7 != null && (findViewById4 = view7.findViewById(2131168961)) != null) {
                findViewById4.setVisibility(0);
            }
            View view8 = this.contentView;
            if (view8 != null && (findViewById3 = view8.findViewById(2131168962)) != null) {
                findViewById3.setVisibility(8);
            }
            Room LJJIIJZLJL3 = LJJIIJZLJL();
            View view9 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view9, "");
            View findViewById9 = view9.findViewById(2131168961);
            if (findViewById9 != null) {
                Context context3 = this.context;
                Intrinsics.checkNotNullExpressionValue(context3, "");
                DataCenter dataCenter3 = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter3, "");
                View view10 = this.contentView;
                Intrinsics.checkNotNullExpressionValue(view10, "");
                FrameLayout frameLayout3 = (FrameLayout) view10.findViewById(2131197173);
                Intrinsics.checkNotNullExpressionValue(frameLayout3, "");
                return new C80645HqZ(LJJIIJZLJL3, false, (ConstraintLayout) findViewById9, context3, dataCenter3, this, this, null, frameLayout3);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
        } else if (Intrinsics.areEqual(cls, C79080HFi.class)) {
            View view11 = this.contentView;
            if (view11 != null && (findViewById2 = view11.findViewById(2131168962)) != null) {
                findViewById2.setVisibility(0);
            }
            Room LJJIIJZLJL4 = LJJIIJZLJL();
            View view12 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view12, "");
            View findViewById10 = view12.findViewById(2131168962);
            if (findViewById10 != null) {
                Context context4 = this.context;
                Intrinsics.checkNotNullExpressionValue(context4, "");
                DataCenter dataCenter4 = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter4, "");
                View view13 = this.contentView;
                Intrinsics.checkNotNullExpressionValue(view13, "");
                FrameLayout frameLayout4 = (FrameLayout) view13.findViewById(2131197173);
                Intrinsics.checkNotNullExpressionValue(frameLayout4, "");
                return new C79080HFi(LJJIIJZLJL4, false, (ConstraintLayout) findViewById10, context4, dataCenter4, this, this, null, frameLayout4, new VideoTalkRoomGuestWidget$createFloatWindowManager$1(this));
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
        } else if (Intrinsics.areEqual(cls, C80643HqX.class)) {
            View view14 = this.contentView;
            if (view14 != null && (findViewById = view14.findViewById(2131168961)) != null) {
                findViewById.setVisibility(0);
            }
            Room LJJIIJZLJL5 = LJJIIJZLJL();
            View view15 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view15, "");
            View findViewById11 = view15.findViewById(2131168961);
            if (findViewById11 != null) {
                Context context5 = this.context;
                Intrinsics.checkNotNullExpressionValue(context5, "");
                DataCenter dataCenter5 = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter5, "");
                return new C80643HqX(LJJIIJZLJL5, false, (ConstraintLayout) findViewById11, context5, dataCenter5, this, this, null, 128);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
        } else {
            return null;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    public final void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 67).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        C79046HEa.LIZ().LIZ((Integer) 0);
        C79007HCn LJII = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        LJII.LJIJI = "";
        if (!Intrinsics.areEqual(str, "paid_change") && !Intrinsics.areEqual(str, "low_balance_for_paid_link")) {
            C88440Kt0.LIZ(LK5.LIZ(2131584550));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZIZ(String str, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{str, bool}, this, LIZJ, false, 109).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        super.LIZIZ(str, bool);
        this.LJJLJLI.put(str, bool);
        AbstractC4964m abstractC4964m = this.LJII;
        if (abstractC4964m != null) {
            abstractC4964m.LIZIZ(str, Intrinsics.areEqual(bool, Boolean.TRUE));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZJ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LIZJ, false, 85).isSupported) {
            return;
        }
        super.LIZJ(j, exc);
        C88440Kt0.LIZ(2131585643);
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p387b.a$a
    public final void LIZLLL(long j, Throwable th) {
        if (PatchProxy.proxy(new Object[]{new Long(j), th}, this, LIZJ, false, 94).isSupported) {
            return;
        }
        C88469KtT.LIZ(this.context, th, 2131585535);
    }

    @Override // com.bytedance.android.live.liveinteract.videotalk.p387b.a$a
    /* renamed from: LJ */
    public final void mo15669LJ(long j, Throwable th) {
        if (!PatchProxy.proxy(new Object[]{new Long(j), th}, this, LIZJ, false, 96).isSupported && (th instanceof ApiServerException)) {
            C88440Kt0.LIZ(((ApiServerException) th).mPrompt);
        }
    }

    private final void LIZ(boolean z, long j) {
        int i;
        boolean z2;
        List<LinkPlayerInfo> LIZJ2;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)}, this, LIZJ, false, 121).isSupported) {
            return;
        }
        C6307m LJJIJL = LJJIJL();
        if (LJJIJL != null) {
            i = LJJIJL.LIZLLL;
        } else {
            i = 0;
        }
        boolean LIZ = C78653GzX.LIZ(i);
        AbstractC78986HBs<LinkPlayerInfo> abstractC78986HBs = this.LJJJLL;
        if (abstractC78986HBs != null && (LIZJ2 = abstractC78986HBs.LIZJ()) != null && (!(LIZJ2 instanceof Collection) || !LIZJ2.isEmpty())) {
            for (LinkPlayerInfo linkPlayerInfo : LIZJ2) {
                if (linkPlayerInfo.LJJJI) {
                    User LIZ2 = linkPlayerInfo.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                    if (LIZ2.getId() == LJJIIJZLJL().ownerUserId) {
                        z2 = true;
                        break;
                    }
                }
            }
        }
        z2 = false;
        C78828H5q.LJFF.LIZ(z, LIZ, z2, false, j);
    }

    private final void LIZ(AbstractC4912d abstractC4912d, AbstractC4912d abstractC4912d2) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        if (PatchProxy.proxy(new Object[]{abstractC4912d, abstractC4912d2}, this, LIZJ, false, 140).isSupported) {
            return;
        }
        C78828H5q c78828H5q = C78828H5q.LJFF;
        if (abstractC4912d != null) {
            num = Integer.valueOf(abstractC4912d.LIZIZ);
            num2 = Integer.valueOf(abstractC4912d.LIZJ);
        } else {
            num = null;
            num2 = null;
        }
        if (c78828H5q.LIZ(num, num2, Integer.valueOf(abstractC4912d2.LIZIZ), Integer.valueOf(abstractC4912d2.LIZJ))) {
            return;
        }
        if (abstractC4912d != null) {
            num3 = Integer.valueOf(abstractC4912d.LIZIZ);
            num4 = Integer.valueOf(abstractC4912d.LIZJ);
        } else {
            num3 = null;
            num4 = null;
        }
        String LIZ = C78828H5q.LIZ(num3, num4);
        String LIZ2 = C78828H5q.LIZ(Integer.valueOf(abstractC4912d2.LIZIZ), Integer.valueOf(abstractC4912d2.LIZJ));
        if (abstractC4912d != null) {
            num5 = Integer.valueOf(abstractC4912d.LIZJ);
        } else {
            num5 = null;
        }
        String LIZ3 = C78656Gza.LIZ(num5);
        String LIZ4 = C78656Gza.LIZ(Integer.valueOf(abstractC4912d2.LIZJ));
        if (!Intrinsics.areEqual(LIZ, LIZ2)) {
            C79046HEa LIZ5 = C79046HEa.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ5, "");
            if (LIZ5.LIZJ()) {
                if (LIZ != null) {
                    C78828H5q.LIZ(LJJIJIIJI(), this.LJJJJL, this.LJLJLJ, this.LJJIIZI, LJJIIJZLJL(), LJJJJJL(), LJJJJLL(), LIZ, LIZ3, "live_chat");
                } else {
                    return;
                }
            } else if (LIZ == null) {
                return;
            }
            C78828H5q.LIZIZ(LIZ, LIZ3);
        } else if ((!Intrinsics.areEqual(LIZ3, LIZ4)) && LIZ3 != null) {
            C78828H5q.LIZIZ((String) null, LIZ3, 1, (Object) null);
        }
    }

    private final void LIZ(boolean z, String str) {
        Boolean LIZ;
        boolean z2 = false;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str}, this, LIZJ, false, 161).isSupported) {
            return;
        }
        C2WC<Boolean> currentIsSinger = ((IKtvService) ServiceManager.getService(IKtvService.class)).getCurrentIsSinger();
        if (currentIsSinger != null && (LIZ = currentIsSinger.LIZ()) != null) {
            z2 = LIZ.booleanValue();
        }
        this.LJLJJL = new Pair<>(Boolean.valueOf(z), str);
        if (!C43F.LIZ(LJJIJLIJ()) && !z2) {
            HHA hha = this.LJIIZILJ;
            if (hha != null) {
                hha.LIZ(z, str);
            }
        } else {
            HHA hha2 = this.LJIIZILJ;
            if (hha2 != null) {
                hha2.LIZIZ(z);
            }
        }
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("data_self_is_silenced", Boolean.valueOf(!z ? 1 : 0));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final void LIZIZ(long j, AbstractC79093HFv abstractC79093HFv) {
        HHA hha;
        if (PatchProxy.proxy(new Object[]{new Long(j), abstractC79093HFv}, this, LIZJ, false, 39).isSupported) {
            return;
        }
        if (j == ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ() && ((hha = this.LJIIZILJ) == null || !hha.LJI)) {
            C88440Kt0.LIZ(2131585502);
            return;
        }
        HDI hdi = this.LJJJLIIL;
        if (hdi == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hdi.LIZIZ(j, abstractC79093HFv);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah
    public final void LIZIZ(long j, long j2, boolean z) {
        CPositionReplyType cPositionReplyType;
        if (PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZJ, false, 123).isSupported) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkAudienceApi linkAudienceApi = (LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class);
        if (z) {
            cPositionReplyType = CPositionReplyType.Accept;
        } else {
            cPositionReplyType = CPositionReplyType.Reject;
        }
        this.LJJJLZIJ.add(linkAudienceApi.replyCPosition(j, j2, cPositionReplyType.value).compose(C100839PnV.LIZJ()).subscribe(new HET(j2, z, currentTimeMillis), new HDU<>(j2, z, currentTimeMillis, j)));
    }
}
