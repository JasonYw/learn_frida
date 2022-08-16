package com.bytedance.android.live.liveinteract.voicechat;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.alipay.sdk.app.OpenAuthTask;
import com.alipay.sdk.p082m.p121u.C1399n;
import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.p255g.AbstractC2885g;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.MediaOperation;
import com.bytedance.android.live.liveinteract.api.chatroom.model.LinkApplyType;
import com.bytedance.android.live.liveinteract.api.chatroom.model.LinkMatchType;
import com.bytedance.android.live.liveinteract.api.chatroom.p339b.C4269g;
import com.bytedance.android.live.liveinteract.api.chatroom.p339b.C4271i;
import com.bytedance.android.live.liveinteract.api.data.C4284f;
import com.bytedance.android.live.liveinteract.api.fulllink.TalkRoomBusinessFullLinkMonitor;
import com.bytedance.android.live.liveinteract.api.p338b.AbstractC4264a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkControlWidget;
import com.bytedance.android.live.liveinteract.digitavatar.C4382d;
import com.bytedance.android.live.liveinteract.digitavatar.ktvavatar.KtvSingMode;
import com.bytedance.android.live.liveinteract.linkroomfight.core.VoiceLinkRoomFightWidget;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.android.live.liveinteract.plantform.api.LinkAudienceApi;
import com.bytedance.android.live.liveinteract.plantform.api.LinkPaidLinkApi;
import com.bytedance.android.live.liveinteract.plantform.core.C4806x;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.plantform.model.MessageBoardInfo;
import com.bytedance.android.live.liveinteract.plantform.model.MicPosTagInfo;
import com.bytedance.android.live.liveinteract.plantform.model.RoomLinkerContent;
import com.bytedance.android.live.liveinteract.plantform.p385a.r$d;
import com.bytedance.android.live.liveinteract.plantform.permission.model.BaseCheckException;
import com.bytedance.android.live.liveinteract.plantform.permission.model.C4825a;
import com.bytedance.android.live.liveinteract.plantform.permission.model.C4826b;
import com.bytedance.android.live.liveinteract.plantform.permission.model.OperateType;
import com.bytedance.android.live.liveinteract.plantform.utils.TalkRoomOperate;
import com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleWidget;
import com.bytedance.android.live.liveinteract.videotalk.quickinteract.QuickInteractWidget;
import com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c;
import com.bytedance.android.live.liveinteract.voicechat.VoiceChatMuteManager;
import com.bytedance.android.live.liveinteract.voicechat.VoiceChatRoomGuestWidget;
import com.bytedance.android.live.liveinteract.voicechat.ax$a;
import com.bytedance.android.live.liveinteract.voicechat.fight.C5056a;
import com.bytedance.android.live.liveinteract.voicechat.fight.LinkMicTeamFightWidget;
import com.bytedance.android.live.liveinteract.voicechat.fight.VoiceTeamFightWidget;
import com.bytedance.android.live.liveinteract.voicechat.match.C5074d;
import com.bytedance.android.live.liveinteract.voicechat.match.ChatMatchWidget;
import com.bytedance.android.live.liveinteract.voicechat.p392b.C5001e;
import com.bytedance.android.live.liveinteract.voicechat.p395wm.AbstractC5142y;
import com.bytedance.android.live.liveinteract.voicechat.p395wm.LinkRoomFightAudioWidget;
import com.bytedance.android.live.liveinteract.voicechat.paid.AudioPaidLinkWidget;
import com.bytedance.android.live.liveinteract.voicechat.toolbar.a$b;
import com.bytedance.android.live.network.response.C5171b;
import com.bytedance.android.live.network.response.C5173e;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.event.C5984am;
import com.bytedance.android.livesdk.chatroom.event.C5986ap;
import com.bytedance.android.livesdk.chatroom.event.C5987ar;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6071r;
import com.bytedance.android.livesdk.chatroom.interact.model.C6068x;
import com.bytedance.android.livesdk.chatroom.model.C6094ae;
import com.bytedance.android.livesdk.chatroom.model.C6095af;
import com.bytedance.android.livesdk.chatroom.model.C6119b;
import com.bytedance.android.livesdk.chatroom.model.interact.C6160b;
import com.bytedance.android.livesdk.chatroom.model.interact.C6179t;
import com.bytedance.android.livesdk.chatroom.model.interact.C6182x;
import com.bytedance.android.livesdk.chatroom.model.interact.C6183z;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkInitResult;
import com.bytedance.android.livesdk.chatroom.p517u.C6306l;
import com.bytedance.android.livesdk.config.C6858bo;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.ktvapi.IKtvService;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.log.p723a.AbstractC8644i;
import com.bytedance.android.livesdk.message.model.C8854es;
import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.android.livesdk.message.model.KtvMusic;
import com.bytedance.android.livesdk.message.model.LinkMicGuideMessage;
import com.bytedance.android.livesdk.message.model.ReplyType;
import com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler;
import com.bytedance.android.livesdk.widget.v$a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.audio.VoiceLiveTheme;
import com.bytedance.android.livesdkapi.depend.model.live.circleinfo.CircleInfo;
import com.bytedance.android.livesdkapi.message.C9605p;
import com.bytedance.android.livesdkapi.service.ILiveVideoFloatWindowService;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p1594ss.avframework.livestreamv2.core.Client;
import com.p1594ss.avframework.livestreamv2.core.interact.model.Config;
import com.p1594ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.p1594ss.avframework.livestreamv2.utils.StringUtils;
import com.p1594ss.ttm.player.MediaPlayer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.json.JSONArray;
import p002O.C0002O;
import p003X.AbstractC416582eC;
import p003X.AbstractC418632hV;
import p003X.AbstractC4569445g;
import p003X.AbstractC77890GnE;
import p003X.AbstractC78116Gqs;
import p003X.AbstractC78720H1m;
import p003X.AbstractC78986HBs;
import p003X.AbstractC79061HEp;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC80546Hoy;
import p003X.AbstractC81278I1w;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C148062fT6;
import p003X.C2WC;
import p003X.C414642b4;
import p003X.C422242nK;
import p003X.C448583oi;
import p003X.C449933qt;
import p003X.C4574547f;
import p003X.C77679Gjp;
import p003X.C77681Gjr;
import p003X.C77917Gnf;
import p003X.C77919Gnh;
import p003X.C77956GoI;
import p003X.C78393GvL;
import p003X.C78536Gxe;
import p003X.C78537Gxf;
import p003X.C78538Gxg;
import p003X.C78627Gz7;
import p003X.C78656Gza;
import p003X.C78673Gzr;
import p003X.C78674Gzs;
import p003X.C78828H5q;
import p003X.C78832H5u;
import p003X.C78833H5v;
import p003X.C78837H5z;
import p003X.C78958HAq;
import p003X.C78998HCe;
import p003X.C79007HCn;
import p003X.C79046HEa;
import p003X.C79054HEi;
import p003X.C79101HGd;
import p003X.C79102HGe;
import p003X.C79104HGg;
import p003X.C79108HGk;
import p003X.C79119HGv;
import p003X.C79188HJm;
import p003X.C79189HJn;
import p003X.C79220HKs;
import p003X.C79242HLo;
import p003X.C80478Hns;
import p003X.C80517HoV;
import p003X.C80608Hpy;
import p003X.C81173Hz5;
import p003X.C87010KQi;
import p003X.C87308Kak;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.C88469KtT;
import p003X.DialogC418702hc;
import p003X.DialogC77887GnB;
import p003X.DialogC77935Gnx;
import p003X.DialogC78012GpC;
import p003X.DialogC88906L1g;
import p003X.DialogInterface$OnClickListenerC79087HFp;
import p003X.DialogInterface$OnClickListenerC79088HFq;
import p003X.DialogInterface$OnClickListenerC79089HFr;
import p003X.DialogInterface$OnClickListenerC79090HFs;
import p003X.H03;
import p003X.H04;
import p003X.H05;
import p003X.H0W;
import p003X.H1Q;
import p003X.HAA;
import p003X.HBE;
import p003X.HD9;
import p003X.HDJ;
import p003X.HDP;
import p003X.HE3;
import p003X.HEP;
import p003X.HFT;
import p003X.HGZ;
import p003X.HH8;
import p003X.HHA;
import p003X.HHB;
import p003X.HHG;
import p003X.IQV;
import p003X.IQX;
import p003X.KDS;
import p003X.LK5;
import p003X.QB4;
import p003X.RunnableC63251Axh;
import p003X.View$OnClickListenerC77779GlR;
import p003X.View$OnClickListenerC78717H1j;

/* loaded from: classes3.dex */
public class VoiceChatRoomGuestWidget extends BaseVoiceChatWidget implements Observer<KVData>, AbstractC2885g.AbstractC2886a, AbstractC4998a, ax$a, AbstractC5015e, a$b, AbstractC5142y, WeakHandler.IHandler, AbstractC4569445g {
    public static ChangeQuickRedirect LIZJ;
    public C78998HCe LIZLLL;

    /* renamed from: LJ */
    public VoiceChatMuteManager f26474LJ;
    public C4806x LJFF;
    public C79220HKs LJI;
    public DialogC418702hc LJII;
    public C79188HJm LJIIIIZZ;
    public HHB LJIIIZ;
    public AbstractC5436a LJIIJ;
    public Runnable LJIIJJI;
    public C448583oi LJIIL;
    public Room LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public String LJIJJLI;
    public KtvMusic LJIL;
    public String LJJ;
    public String LJJI;
    public boolean LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public boolean LJJIIJZLJL;
    public C80478Hns LJJIIZ;
    public C78833H5v LJJIIZI;
    public HD9 LJJIJIIJI;
    public ChatMatchWidget LJJIJIL;
    public DialogC88906L1g LJJIJL;
    public C78958HAq LJJIJLIJ;
    public C79220HKs LJJIL;
    public HFT LJJIZ;
    public WeakHandler LJJJ;
    public final AbstractC6071r LJJJI;
    public HGZ LJJJIL;
    public LinkApplyType LJJJJIZL;
    public Boolean LJJJJJ;
    public boolean LJJJJLI;
    public C5001e LJJJJLL;
    public AbstractC78116Gqs LJJJJZ;
    public HDJ LJJJJZI;
    public AudioPaidLinkWidget LJJL;
    public GuestBattleWidget LJJLIIIJJIZ;
    public LinkMicTeamFightWidget LJJLIIIJL;
    public QuickInteractWidget LJJLIIIJLJLI;
    public VoiceLinkRoomFightWidget LJJLIIIJLLLLLLLZ;
    public int LJJJJJL = 200;
    public boolean LJJJJL = true;
    public final CompositeDisposable LJJJLIIL = new CompositeDisposable();
    public final HashSet<Long> LJJIJ = new HashSet<>();
    public boolean LJJJLL = false;
    public H03 LJJJLZIJ = new H03(false);
    public String LJJJZ = "";
    public int LJJIJIIJIL = -1;
    public String LJJLI = "";
    public String LJJLIIIIJ = "";
    public MicPosTagInfo LJJLIIIJ = null;
    public MessageBoardInfo LJJLIIIJILLIZJL = null;
    public final r$d LJJLIIIJJI = new r$d() { // from class: com.bytedance.android.live.liveinteract.voicechat.VoiceChatRoomGuestWidget.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(30839);
        }

        @Override // com.bytedance.android.live.liveinteract.plantform.p385a.r$d, p003X.AbstractC79253HLz
        public final void LIZ(List<LinkPlayerInfo> list) {
            if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 1).isSupported) {
                return;
            }
            VoiceChatRoomGuestWidget.this.dataCenter.put("data_online_changed_list", new ArrayList(list));
            if (list.size() > C79007HCn.LJII().LIZIZ) {
                C79007HCn.LJII().LIZIZ = list.size();
            }
        }
    };
    public final HE3 LJJLIIJ = new HE3();
    public C5001e.AbstractC5002a LJJLIL = new C5001e.AbstractC5002a(this) { // from class: X.HCy
        public static ChangeQuickRedirect LIZ;
        public final VoiceChatRoomGuestWidget LIZIZ;

        static {
            Covode.recordClassIndex(30924);
        }

        {
            this.LIZIZ = this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bytedance.android.live.liveinteract.voicechat.p392b.C5001e.AbstractC5002a
        public final void LIZ(boolean z) {
            if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1).isSupported) {
                return;
            }
            VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = this.LIZIZ;
            if (PatchProxy.proxy(new Object[]{Byte.valueOf((byte) z)}, voiceChatRoomGuestWidget, VoiceChatRoomGuestWidget.LIZJ, false, 140).isSupported) {
                return;
            }
            if (z != 0) {
                voiceChatRoomGuestWidget.LIZ(true, HCD.LIZ);
                if (voiceChatRoomGuestWidget.f26474LJ.LJFF() == 0) {
                    voiceChatRoomGuestWidget.LJFF.LIZ(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ(), C79007HCn.LJII().LIZLLL, 3);
                    voiceChatRoomGuestWidget.f26474LJ.LIZ("onPause");
                }
                if (C4382d.LIZLLL.LIZ() == null || C4382d.LIZLLL.LIZ().LIZ().LIZ().type != KtvSingMode.VIDEO.type) {
                    return;
                }
                AbstractC5003c.LIZ.LIZ().LJIILIIL().LIZ(C80374HmC.LJFF);
            } else if (!voiceChatRoomGuestWidget.LJIIJ() || voiceChatRoomGuestWidget.LJIIJ == null) {
            } else {
                if (voiceChatRoomGuestWidget.f26474LJ.LJFF() == 3) {
                    voiceChatRoomGuestWidget.f26474LJ.LIZIZ(HCD.LIZIZ);
                }
                if (C4382d.LIZLLL.LIZ() == null || C4382d.LIZLLL.LIZ().LIZ().LIZ() == null || C4382d.LIZLLL.LIZ().LIZ().LIZ().type != KtvSingMode.VIDEO.type) {
                    return;
                }
                AbstractC5003c.LIZ.LIZ().LJIILIIL().LIZIZ("on_resume");
            }
        }
    };

    static {
        Covode.recordClassIndex(30838);
    }

    @Override // com.bytedance.android.live.broadcast.api.p255g.AbstractC2885g.AbstractC2886a
    public final void LIZ() {
        this.LJJJJLI = true;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.BaseVoiceChatWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, SurfaceView surfaceView, int i, int i2) {
        boolean z = PatchProxy.proxy(new Object[]{str, surfaceView, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZJ, false, 77).isSupported;
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final void LIZIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZJ, false, 150).isSupported) {
            return;
        }
        AbstractC416582eC.LIZ(this, th);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final void LJI() {
        this.LJJJJZ = null;
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final String LJJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 149);
        return proxy.isSupported ? (String) proxy.result : AbstractC416582eC.LIZ(this);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.BaseVoiceChatWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: f_ */
    public final void mo15657f_(String str) {
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public int getLayoutId() {
        return 2131700439;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.BaseVoiceChatWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZJ, false, 151).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget
    public final int LIZIZ() {
        return this.LJIIZILJ;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final AbstractC78720H1m LJFF() {
        return this.f26474LJ;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final AbstractC78986HBs<LinkPlayerInfo> LJII() {
        return this.LJFF;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final boolean LJIIL() {
        return this.LJJIIJ;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final AbstractC79061HEp LJIILIIL() {
        return this.LJJIIZ;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final HHB LJIILJJIL() {
        return this.LJIIIZ;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final HDJ LJIILL() {
        return this.LJJJJZI;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final AbstractC5436a LJIJ() {
        return this.LJIIJ;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final int LJIJJLI() {
        return this.LJIIZILJ;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final C78833H5v LJIL() {
        return this.LJJIIZI;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final HFT LJJ() {
        return this.LJJIZ;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final H03 LJJII() {
        return this.LJJJLZIJ;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    public final boolean LJJIIJ() {
        return this.LJJIII;
    }

    public final boolean LIZ(final Runnable runnable, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{runnable, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZJ, false, 35);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C5074d c5074d = (C5074d) IQV.LIZ(ChatMatchWidget.LJI, C5074d.class);
        if (c5074d != null && c5074d.LIZIZ != null && c5074d.LIZIZ.getValue() != null) {
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
        if (((Integer) C79046HEa.LIZ().LJJIIZI).intValue() == 0 || 2 != ((Integer) C79046HEa.LIZ().LJJIIZI).intValue()) {
            return false;
        }
        new v$a(getContext(), 4).LIZLLL(2131585597).LIZIZ(0, 2131586570, new DialogInterface.OnClickListener(this, runnable) { // from class: X.HDo
            public static ChangeQuickRedirect LIZ;
            public final VoiceChatRoomGuestWidget LIZIZ;
            public final Runnable LIZJ;

            static {
                Covode.recordClassIndex(30933);
            }

            {
                this.LIZIZ = this;
                this.LIZJ = runnable;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = this.LIZIZ;
                Runnable runnable2 = this.LIZJ;
                if (PatchProxy.proxy(new Object[]{runnable2, dialogInterface, Integer.valueOf(i)}, voiceChatRoomGuestWidget, VoiceChatRoomGuestWidget.LIZJ, false, 142).isSupported) {
                    return;
                }
                ALogger.m15797i("voice_chat", "interceptCloseRoom");
                dialogInterface.dismiss();
                voiceChatRoomGuestWidget.LJIIJJI = runnable2;
                voiceChatRoomGuestWidget.LIZLLL.LIZ("leave_normally");
                C79046HEa.LIZ().LJII.removeObservers(voiceChatRoomGuestWidget);
            }
        }).LIZIZ(1, 2131582393, DialogInterface$OnClickListenerC79087HFp.LIZIZ).LIZJ();
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    public final void LIZ(C6160b c6160b, int i) {
        if (PatchProxy.proxy(new Object[]{c6160b, Integer.valueOf(i)}, this, LIZJ, false, 41).isSupported) {
            return;
        }
        C78958HAq c78958HAq = this.LJJIJLIJ;
        if (PatchProxy.proxy(new Object[0], c78958HAq, C78958HAq.LIZ, false, 3).isSupported) {
            return;
        }
        Dialog dialog = c78958HAq.getDialog();
        if (dialog != null) {
            C116971W2r.LIZ(dialog);
        }
        c78958HAq.LIZLLL.dispose();
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final void LIZ(boolean z, String str, int i) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Integer.valueOf(i)}, this, LIZJ, false, 44).isSupported) {
            return;
        }
        LIZ(z, str, i, "");
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final void LIZ(boolean z, String str, int i, String str2) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Integer.valueOf(i), str2}, this, LIZJ, false, 45).isSupported && isViewValid()) {
            if (((IUserService) ServiceManager.getService(IUserService.class)).user().LJI() && !this.LJJIFFI) {
                this.dataCenter.put("data_task_name_when_open_invite_panel", str2);
                this.LJI = C79220HKs.LIZ(this.dataCenter, this).LIZ(0, str, i);
                this.LJI.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
                this.LJI.setOnDismissListener(new DialogInterface.OnDismissListener(this) { // from class: X.HFz
                    public static ChangeQuickRedirect LIZ;
                    public final VoiceChatRoomGuestWidget LIZIZ;

                    static {
                        Covode.recordClassIndex(30935);
                    }

                    {
                        this.LIZIZ = this;
                    }

                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        if (PatchProxy.proxy(new Object[]{dialogInterface}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        this.LIZIZ.LJJIFFI = false;
                    }
                });
                this.LJJIFFI = true;
            }
            if (!z) {
                return;
            }
            this.LJJIIZI.LIZIZ("administrator");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final void LIZIZ(boolean z, String str, int i) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Integer.valueOf(i)}, this, LIZJ, false, 46).isSupported) {
            return;
        }
        LIZIZ(z, str, i, "");
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final void LIZIZ(boolean z, String str, int i, String str2) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Integer.valueOf(i), str2}, this, LIZJ, false, 47).isSupported && isViewValid() && !this.LJJIFFI) {
            this.dataCenter.put("data_task_name_when_open_invite_panel", str2);
            this.LJJIL = C79220HKs.LIZ(this.dataCenter, this).LIZ(str, i);
            this.LJJIL.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
            this.LJJIL.setOnDismissListener(new DialogInterface.OnDismissListener(this) { // from class: X.HG0
                public static ChangeQuickRedirect LIZ;
                public final VoiceChatRoomGuestWidget LIZIZ;

                static {
                    Covode.recordClassIndex(30936);
                }

                {
                    this.LIZIZ = this;
                }

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    this.LIZIZ.LJJIFFI = false;
                }
            });
            this.LJJIFFI = true;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    public final void LIZ(C6119b c6119b, int i, int i2) {
        ChatMatchWidget chatMatchWidget;
        String LIZIZ;
        Integer intOrNull;
        if (!PatchProxy.proxy(new Object[]{c6119b, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZJ, false, 51).isSupported && isViewValid()) {
            this.LJIJI = c6119b.f26877LJ;
            this.LJJI = "apply";
            int LIZ = C79242HLo.LIZ(this.LJFF);
            this.LJIJJ = c6119b.LJI;
            Long l = null;
            MicPosTagInfo micPosTagInfo = (MicPosTagInfo) this.dataCenter.get("data_link_mic_pos_tag_info", (String) null);
            if (micPosTagInfo != null) {
                l = Long.valueOf(micPosTagInfo.getTagType());
            }
            MicPosTagInfo micPosTagInfo2 = c6119b.LJIIJ;
            if ((l == null || l.longValue() == 0) && micPosTagInfo2 != null) {
                this.LJJLIIIJ = micPosTagInfo2;
                l = Long.valueOf(this.LJJLIIIJ.getTagType());
            }
            C79007HCn.LJII().LJIJJLI = "";
            this.LJJIIZI.LIZ(this.LJIJJLI, this.LJIJI, LIZ, LJIIJJI(), this.LJIL, this.LJJ, this.LJIJJ, this.LJJIII, this.LJIILIIL.circleInfo, i, this.LJJI, l);
            LIZ(false);
            C79046HEa.LIZ().LJFF = System.currentTimeMillis();
            if (!TextUtils.isEmpty(c6119b.LIZIZ) && !this.LJJJLL) {
                C88440Kt0.LIZJ(c6119b.LIZIZ, 0);
            }
            if ((c6119b.f26877LJ && !c6119b.LJI) || i2 == LinkApplyType.MATCH.value) {
                return;
            }
            boolean LJI = ((IUserService) ServiceManager.getService(IUserService.class)).user().LJI();
            if (C5056a.LJIILIIL()) {
                ALogger.m15795w("ttlive_link", "intercept apply success dialog teamFight");
            } else if (C77919Gnh.LIZ(this.LJIILIIL) && !LJI) {
                C116971W2r.LIZJ(new DialogC77887GnB(this.context, this.dataCenter, new AbstractC77890GnE(this) { // from class: X.HEu
                    public static ChangeQuickRedirect LIZ;
                    public final VoiceChatRoomGuestWidget LIZIZ;

                    static {
                        Covode.recordClassIndex(30937);
                    }

                    {
                        this.LIZIZ = this;
                    }

                    @Override // p003X.AbstractC77890GnE
                    public final void LIZ() {
                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = this.LIZIZ;
                        if (PatchProxy.proxy(new Object[0], voiceChatRoomGuestWidget, VoiceChatRoomGuestWidget.LIZJ, false, 139).isSupported || voiceChatRoomGuestWidget.LJJIJIL == null) {
                            return;
                        }
                        voiceChatRoomGuestWidget.LJJIJIL.LIZ(null, null, false, true, "", Boolean.FALSE);
                    }
                }));
            } else if (C77917Gnf.LIZ(this.LJIILIIL)) {
                if (((IUserService) ServiceManager.getService(IUserService.class)).user().LJI()) {
                    this.LJIIIIZZ.LIZ(false, "bottom", -1);
                    return;
                }
                C79188HJm c79188HJm = this.LJIIIIZZ;
                C9605p c9605p = c6119b.LJIIIIZZ;
                C78828H5q c78828H5q = C78828H5q.LJFF;
                String str = this.LJIJJLI;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, c78828H5q, C78828H5q.LIZ, false, 65);
                if (proxy.isSupported) {
                    LIZIZ = (String) proxy.result;
                } else {
                    LIZIZ = (str == null || (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(str)) == null) ? null : C78828H5q.LIZIZ(intOrNull.intValue());
                }
                c79188HJm.LIZ(c9605p, LIZIZ);
            } else if (!C77919Gnh.LIZ() || i2 == LinkApplyType.KTV_PRIORITY_SING.value || (chatMatchWidget = this.LJJIJIL) == null) {
            } else {
                chatMatchWidget.LIZ(null, c6119b.LJIIIIZZ, false, false, "", Boolean.FALSE);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    public final void LIZ(Throwable th) {
        if (!PatchProxy.proxy(new Object[]{th}, this, LIZJ, false, 52).isSupported && isViewValid()) {
            LIZ(false);
            if (th instanceof ApiServerException) {
                ApiServerException apiServerException = (ApiServerException) th;
                if (apiServerException.mErrorCode != 4004091 || !apiServerException.mPrompt.replaceAll("\n", "").isEmpty()) {
                    C88440Kt0.LIZ(apiServerException.mPrompt);
                }
                if (apiServerException.mErrorCode == 31101) {
                    ChatMatchWidget chatMatchWidget = this.LJJIJIL;
                    if (chatMatchWidget != null) {
                        chatMatchWidget.LIZ(null, null, false, false, "", Boolean.FALSE);
                    }
                } else if (apiServerException.mErrorCode == 4004091 && C4284f.LIZJ().LIZLLL) {
                    LJJIL();
                }
            } else {
                C88440Kt0.LIZ(2131585441);
            }
            this.LJJIII = false;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    public final void LIZ(C6095af c6095af) {
        if (PatchProxy.proxy(new Object[]{c6095af}, this, LIZJ, false, 53).isSupported) {
            return;
        }
        if (this.dataCenter != null) {
            this.dataCenter.put("DATA_DISCONNECT_LINK", Boolean.TRUE);
            this.dataCenter.put("DATA_DISCONNECT_LINK_BYSELF", Boolean.TRUE);
        }
        if (!isViewValid()) {
            return;
        }
        this.LJJLIIIIJ = String.valueOf(c6095af.LIZLLL);
        this.LJJLI = String.valueOf(c6095af.f26867LJ);
        if (c6095af.LIZ == 1) {
            LJII("leave");
        }
        this.LJJIIJ = false;
        this.f26474LJ.LIZIZ(false);
        if (this.LJJJJL) {
            C88440Kt0.LIZ(2131585491);
        }
        this.LJJJJL = true;
        this.LJJJJJL = this.LIZLLL.LIZLLL;
        C79188HJm c79188HJm = this.LJIIIIZZ;
        if (c79188HJm == null) {
            return;
        }
        c79188HJm.LJII();
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    public final void LIZ(C8874fl c8874fl) {
        if (!PatchProxy.proxy(new Object[]{c8874fl}, this, LIZJ, false, 55).isSupported && c8874fl.LJIIJJI != null) {
            this.LJJLI = String.valueOf(c8874fl.LJIIJJI.LIZJ);
            this.LJJLIIIIJ = String.valueOf(c8874fl.LJIIJJI.LIZIZ);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    public final void LIZ(long j, Throwable th) {
        if (PatchProxy.proxy(new Object[]{new Long(j), th}, this, LIZJ, false, 58).isSupported) {
            return;
        }
        C88469KtT.LIZ(getContext(), th, 2131585533);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    public final void LIZ(Throwable th, String str) {
        if (!PatchProxy.proxy(new Object[]{th, str}, this, LIZJ, false, 61).isSupported && isViewValid() && str != "paid_change") {
            C88469KtT.LIZ(getContext(), th, 2131585594);
        }
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZJ, false, 62).isSupported) {
            return;
        }
        if (z) {
            if (this.LJJIJL == null) {
                this.LJJIJL = new v$a(getContext(), 2).LIZLLL(2131585443).LIZLLL();
            }
            if (this.LJJIJL.isShowing()) {
                return;
            }
            C116971W2r.LIZJ(this.LJJIJL);
            return;
        }
        DialogC88906L1g dialogC88906L1g = this.LJJIJL;
        if (dialogC88906L1g == null || !dialogC88906L1g.isShowing()) {
            return;
        }
        C116971W2r.LIZ(this.LJJIJL);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    public final void LIZ(C6094ae c6094ae) {
        MethodCollector.m14708i(2072);
        if (PatchProxy.proxy(new Object[]{c6094ae}, this, LIZJ, false, 63).isSupported) {
            MethodCollector.m14707o(2072);
        } else if (!isViewValid()) {
            MethodCollector.m14707o(2072);
        } else {
            C422242nK.LIZ(this.context, 5);
            C79046HEa.LIZ().f6716LJ = SystemClock.currentThreadTimeMillis();
            String str = C79007HCn.LJII().LJII;
            HHB hhb = this.LJIIIZ;
            if (!PatchProxy.proxy(new Object[]{str}, hhb, HHB.LIZ, false, 4).isSupported) {
                if (str == null || str.length() == 0) {
                    ALogger.m15800e(hhb.LJJ, "guestRtcExtInfo is empty");
                }
                String str2 = "";
                hhb.LJIIIIZZ = str == null ? str2 : str;
                if (str != null) {
                    str2 = str;
                }
                hhb.LJI = str2;
            }
            HHA.LJIL.LIZ();
            Config.InteractMode LIZ = LiveConfigSettingKeys.VOICE_CHAT_ROOM_INTERACT_MODE_ENABLE.getValue().booleanValue() ? this.LJIIIZ.LIZ((Integer) null) : Config.InteractMode.FM;
            InteractConfig interactConfig = new InteractConfig();
            interactConfig.setBackgroundColor("#1F212C");
            interactConfig.setContext(this.context);
            interactConfig.setRtcExtInfo(str);
            interactConfig.setLogReportInterval(5);
            Config videoQuality = interactConfig.setVideoQuality(Config.VideoQuality.GUEST_NORMAL);
            videoQuality.setProjectKey(LK5.LIZ(2131587904));
            videoQuality.setInteractMode(LIZ);
            videoQuality.setVolumeCallbackInterval(300);
            videoQuality.setCharacter(Config.Character.GUEST);
            videoQuality.setSeiVersion(3);
            videoQuality.setType(Config.Type.VIDEO);
            this.LJJIZ = ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).createVoiceRoomVideoView(this.context, c6094ae.f26866LJ);
            this.LJIIJ = this.LJJIZ.getLiveStream();
            this.LJIIJ.LJIIIIZZ();
            if (this.LJIIZILJ == 9) {
                this.LJIIJ.LJI();
            }
            ((SurfaceView) this.LJJIZ).setVisibility(8);
            ((ViewGroup) findViewById(2131196798)).addView((View) this.LJJIZ);
            HHB hhb2 = this.LJIIIZ;
            AbstractC5436a abstractC5436a = this.LJIIJ;
            hhb2.LIZIZ = abstractC5436a;
            hhb2.LIZ(abstractC5436a, interactConfig);
            this.LJIIIZ.LIZ(this);
            this.LJJIZ.LIZ(this);
            MethodCollector.m14707o(2072);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.BaseVoiceChatWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LIZJ, false, 71).isSupported) {
            return;
        }
        this.LJIL = null;
        final C78998HCe c78998HCe = this.LIZLLL;
        if (!PatchProxy.proxy(new Object[0], c78998HCe, C78998HCe.LIZ, false, 7).isSupported) {
            c78998HCe.LJIIJ = false;
            c78998HCe.LJIJ.clear();
            final long currentTimeMillis = System.currentTimeMillis();
            HDP.LIZ("leave_on_rtc_error");
            ((KDS) ((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).leave(c78998HCe.LJIILJJIL.getId(), "leave_on_rtc_error").m149as(c78998HCe.LJIIJJI())).LIZ(new Consumer(currentTimeMillis) { // from class: X.HEf
                public static ChangeQuickRedirect LIZ;
                public final long LIZIZ;

                static {
                    Covode.recordClassIndex(30919);
                }

                {
                    this.LIZIZ = currentTimeMillis;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    long j2 = this.LIZIZ;
                    C5171b c5171b = (C5171b) obj;
                    if (PatchProxy.proxy(new Object[]{new Long(j2), c5171b}, null, C78998HCe.LIZ, true, 42).isSupported) {
                        return;
                    }
                    HDP.LIZ("leave_on_rtc_error", C79242HLo.LIZIZ(j2), c5171b.f26526LJ);
                }
            }, new Consumer(c78998HCe, currentTimeMillis) { // from class: X.HEO
                public static ChangeQuickRedirect LIZ;
                public final C78998HCe LIZIZ;
                public final long LIZJ;

                static {
                    Covode.recordClassIndex(30920);
                }

                {
                    this.LIZIZ = c78998HCe;
                    this.LIZJ = currentTimeMillis;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    C78998HCe c78998HCe2 = this.LIZIZ;
                    long j2 = this.LIZJ;
                    Throwable th = (Throwable) obj;
                    if (PatchProxy.proxy(new Object[]{new Long(j2), th}, c78998HCe2, C78998HCe.LIZ, false, 41).isSupported) {
                        return;
                    }
                    c78998HCe2.LIZIZ(th);
                    HDP.LIZ("leave_on_rtc_error", C79242HLo.LIZIZ(j2), th);
                }
            });
            C79046HEa.LIZ().LIZ((Integer) 0);
        }
        C88440Kt0.LIZ(2131585641);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.BaseVoiceChatWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, long j) {
        if (PatchProxy.proxy(new Object[]{str, new Long(j)}, this, LIZJ, false, 76).isSupported) {
            return;
        }
        this.LJFF.LIZ(str);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.BaseVoiceChatWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String[] strArr, boolean[] zArr, int[] iArr) {
        if (PatchProxy.proxy(new Object[]{strArr, zArr, iArr}, this, LIZJ, false, 78).isSupported) {
            return;
        }
        C79188HJm c79188HJm = this.LJIIIIZZ;
        if (c79188HJm != null) {
            c79188HJm.LIZ(strArr, zArr, iArr, false);
        }
        this.LJJLIIJ.LIZ(strArr, zArr, iArr);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.BaseVoiceChatWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(long j, long j2) {
        HGZ hgz;
        if (!PatchProxy.proxy(new Object[]{new Long(j), new Long(j2)}, this, LIZJ, false, 79).isSupported && (hgz = this.LJJJIL) != null) {
            hgz.LIZ(j, j2);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    public final boolean LIZ(int i, LinkMicGuideMessage.C8701a c8701a) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), c8701a}, this, LIZJ, false, 83);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LJFF.LJIIJJI() >= i) {
            ALogger.m15801d("ttlive_link", "intercept guide since online count hits limit");
            return false;
        }
        C78958HAq c78958HAq = this.LJJIJLIJ;
        if (c78958HAq != null && c78958HAq.LJIILIIL()) {
            ALogger.m15801d("ttlive_link", "intercept guide since guest is being invited");
            return false;
        } else if (LJIIJJI()) {
            return false;
        } else {
            if (!LIZ(c8701a) && this.LJIIIIZZ != null) {
                LJJIJLIJ();
                return true;
            }
            this.dataCenter.put("data_audio_talk_show_guide", c8701a);
            if (!PatchProxy.proxy(new Object[0], this.LJJIIZI, C78833H5v.LIZ, false, 72).isSupported) {
                C4574547f.LIZ().LIZ("anchor_head_toast_show", new LinkedHashMap(), Room.class);
            }
            return true;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final void LIZ(final long j, final String str) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str}, this, LIZJ, false, 86).isSupported) {
            return;
        }
        final C78998HCe c78998HCe = this.LIZLLL;
        if (PatchProxy.proxy(new Object[]{new Long(j), str}, c78998HCe, C78998HCe.LIZ, false, 14).isSupported) {
            return;
        }
        if (c78998HCe.LJIJ.contains(Long.valueOf(j))) {
            C88440Kt0.LIZ(2131584968);
            ALogger.m15800e("voice_chat", "permit request already sent for " + j);
            return;
        }
        c78998HCe.LJIJ.add(Long.valueOf(j));
        final long currentTimeMillis = System.currentTimeMillis();
        HDP.LIZIZ(j, str);
        ((KDS) ((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).permit(c78998HCe.LJIILJJIL.getId(), j, str).m149as(c78998HCe.LJIIJJI())).LIZ(new Consumer(c78998HCe, j, currentTimeMillis, str) { // from class: X.HBd
            public static ChangeQuickRedirect LIZ;
            public final C78998HCe LIZIZ;
            public final long LIZJ;
            public final long LIZLLL;

            /* renamed from: LJ */
            public final String f6660LJ;

            static {
                Covode.recordClassIndex(30906);
            }

            {
                this.LIZIZ = c78998HCe;
                this.LIZJ = j;
                this.LIZLLL = currentTimeMillis;
                this.f6660LJ = str;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                C78998HCe c78998HCe2 = this.LIZIZ;
                long j2 = this.LIZJ;
                long j3 = this.LIZLLL;
                String str2 = this.f6660LJ;
                C5176i<LinkInitResult> c5176i = (C5176i) obj;
                if (PatchProxy.proxy(new Object[]{new Long(j2), new Long(j3), str2, c5176i}, c78998HCe2, C78998HCe.LIZ, false, 36).isSupported) {
                    return;
                }
                c78998HCe2.LJIJ.remove(Long.valueOf(j2));
                HH8.LIZIZ(j2, c78998HCe2.LIZ(j3));
                HDP.LIZIZ(j2, str2, c78998HCe2.LIZ(j3), c5176i.f26526LJ);
                TalkRoomBusinessFullLinkMonitor.LIZIZ.LIZ(j2, str2, j3, c5176i);
                ((ax$a) c78998HCe2.mo21780LJ()).LIZJ(j2, str2);
            }
        }, new Consumer(c78998HCe, j, str, currentTimeMillis) { // from class: X.HBe
            public static ChangeQuickRedirect LIZ;
            public final C78998HCe LIZIZ;
            public final long LIZJ;
            public final String LIZLLL;

            /* renamed from: LJ */
            public final long f6661LJ;

            static {
                Covode.recordClassIndex(30907);
            }

            {
                this.LIZIZ = c78998HCe;
                this.LIZJ = j;
                this.LIZLLL = str;
                this.f6661LJ = currentTimeMillis;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                C78998HCe c78998HCe2 = this.LIZIZ;
                long j2 = this.LIZJ;
                String str2 = this.LIZLLL;
                long j3 = this.f6661LJ;
                Throwable th = (Throwable) obj;
                if (PatchProxy.proxy(new Object[]{new Long(j2), str2, new Long(j3), th}, c78998HCe2, C78998HCe.LIZ, false, 35).isSupported) {
                    return;
                }
                c78998HCe2.LJIJ.remove(Long.valueOf(j2));
                c78998HCe2.LIZIZ(th);
                HDP.LIZIZ(j2, str2, c78998HCe2.LIZ(j3), th);
                HH8.LIZ(j2, th, c78998HCe2.LIZ(j3));
                TalkRoomBusinessFullLinkMonitor.LIZIZ.LIZ(j2, str2, j3, th);
                ((ax$a) c78998HCe2.mo21780LJ()).LIZIZ(j2, th);
            }
        });
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final void LIZ(KtvMusic ktvMusic, String str, LinkApplyType linkApplyType, AbstractC4264a abstractC4264a) {
        if (PatchProxy.proxy(new Object[]{ktvMusic, str, linkApplyType, abstractC4264a}, this, LIZJ, false, 87).isSupported) {
            return;
        }
        this.LJIL = ktvMusic;
        this.LJJ = str;
        this.LJJJJIZL = linkApplyType;
        this.LJJJJJ = LJJJJI();
        this.LJIJJLI = String.valueOf(C78832H5u.LIZJ);
        ALogger.m15797i("ttlive_ktv", C0002O.m25086C("ktvApply:", ktvMusic == null ? null : ktvMusic.LIZJ));
        this.LIZLLL.LIZ(-1, this.LJIJJLI, linkApplyType, false, "ktv_apply", abstractC4264a);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final void LIZ(String str, LinkApplyType linkApplyType) {
        if (PatchProxy.proxy(new Object[]{str, linkApplyType}, this, LIZJ, false, 88).isSupported) {
            return;
        }
        this.LJIJJLI = String.valueOf(C78832H5u.LIZJ);
        this.LJJJJIZL = linkApplyType;
        this.LJJJJJ = LJJJJI();
        ALogger.m15797i("ttlive_ktv", "applyType:" + linkApplyType);
        C78998HCe c78998HCe = this.LIZLLL;
        if (c78998HCe == null) {
            return;
        }
        c78998HCe.LIZ(-1, this.LJIJJLI, linkApplyType, false, str, null);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final void LIZ(String str, int i, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), str2, str3}, this, LIZJ, false, 90).isSupported) {
            return;
        }
        LIZ(-1, str, i, LinkMatchType.NONE, str2, str3);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final void LIZ(int i, String str, int i2, String str2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), str2}, this, LIZJ, false, 91).isSupported) {
            return;
        }
        LIZ(i, str, i2, LinkMatchType.NONE, str2, str2);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final void LIZ(int i, String str, int i2, LinkMatchType linkMatchType, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), linkMatchType, str2, str3}, this, LIZJ, false, 93).isSupported) {
            return;
        }
        LIZ(i, str, i2, linkMatchType, str2, str3, 0, false, 0, 0, false, false, 0);
    }

    public void LIZ(final int i, final String str, final int i2, final LinkMatchType linkMatchType, final String str2, final String str3, final int i3, boolean z, final int i4, final int i5, final boolean z2, final boolean z3, final int i6) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, Integer.valueOf(i2), linkMatchType, str2, str3, Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i4), Integer.valueOf(i5), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Integer.valueOf(i6)}, this, LIZJ, false, 94).isSupported) {
            return;
        }
        this.LJIJJLI = str;
        this.LJJJJIZL = HBE.LIZ(i2);
        this.LJJJJJ = null;
        C79188HJm c79188HJm = this.LJIIIIZZ;
        if (c79188HJm != null) {
            c79188HJm.LJFF();
        }
        if (AbstractC80293Hkt.f6994aV.LIZ().booleanValue() && !this.LJIILIIL.getOwner().isFollowing() && !z) {
            LJJJJIZL();
            LIZ(false, new AbstractC418632hV(this, i, str, i2, linkMatchType, str2, str3, i3, z3, i6) { // from class: X.HF5
                public static ChangeQuickRedirect LIZ;
                public final VoiceChatRoomGuestWidget LIZIZ;
                public final int LIZJ;
                public final String LIZLLL;

                /* renamed from: LJ */
                public final int f6717LJ;
                public final LinkMatchType LJFF;
                public final String LJI;
                public final String LJII;
                public final int LJIIIIZZ;
                public final boolean LJIIIZ;
                public final int LJIIJ;

                static {
                    Covode.recordClassIndex(30943);
                }

                {
                    this.LIZIZ = this;
                    this.LIZJ = i;
                    this.LIZLLL = str;
                    this.f6717LJ = i2;
                    this.LJFF = linkMatchType;
                    this.LJI = str2;
                    this.LJII = str3;
                    this.LJIIIIZZ = i3;
                    this.LJIIIZ = z3;
                    this.LJIIJ = i6;
                }

                @Override // p003X.AbstractC418632hV
                public final void LIZ() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = this.LIZIZ;
                    int i7 = this.LIZJ;
                    String str4 = this.LIZLLL;
                    int i8 = this.f6717LJ;
                    LinkMatchType linkMatchType2 = this.LJFF;
                    String str5 = this.LJI;
                    String str6 = this.LJII;
                    int i9 = this.LJIIIIZZ;
                    boolean z4 = this.LJIIIZ;
                    int i10 = this.LJIIJ;
                    if (PatchProxy.proxy(new Object[]{Integer.valueOf(i7), str4, Integer.valueOf(i8), linkMatchType2, str5, str6, Integer.valueOf(i9), Byte.valueOf(z4 ? (byte) 1 : (byte) 0), Integer.valueOf(i10)}, voiceChatRoomGuestWidget, VoiceChatRoomGuestWidget.LIZJ, false, 136).isSupported) {
                        return;
                    }
                    voiceChatRoomGuestWidget.LJJIII = true;
                    voiceChatRoomGuestWidget.LIZ(i7, str4, i8, linkMatchType2, str5, str6, i9, true, 0, 0, false, z4, i10);
                }
            });
        } else if (C5056a.LJIILIIL() && i <= 0 && i3 == 0) {
            ALogger.m15800e("ttlive_link", "team fight apply " + C5056a.LJIILJJIL());
            C116971W2r.LIZJ(new DialogC78012GpC(this.context, this.dataCenter, i, str));
            LJJJJIZL();
        } else {
            LIZ(OperateType.APPLY, 2, new AbstractC80546Hoy<C4826b>() { // from class: com.bytedance.android.live.liveinteract.voicechat.VoiceChatRoomGuestWidget.3
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(30841);
                }

                @Override // p003X.AbstractC80546Hoy
                public final void LIZ(BaseCheckException baseCheckException) {
                    if (PatchProxy.proxy(new Object[]{baseCheckException}, this, LIZ, false, 2).isSupported) {
                        return;
                    }
                    TalkRoomBusinessFullLinkMonitor.LIZIZ.LIZ(baseCheckException);
                    HH8.LIZ(baseCheckException);
                    HDP.LIZ(OperateType.APPLY.ordinal(), 2, (Throwable) baseCheckException);
                }

                @Override // p003X.AbstractC80546Hoy
                public final /* synthetic */ void LIZ(C4825a c4825a, C4826b c4826b) {
                    if (!PatchProxy.proxy(new Object[]{c4825a, c4826b}, this, LIZ, false, 1).isSupported) {
                        TalkRoomBusinessFullLinkMonitor.LIZIZ.LIZ();
                        HH8.m23773LJ();
                        HDP.LIZ(OperateType.APPLY.ordinal(), 2);
                        VoiceChatRoomGuestWidget.this.LIZ(true);
                        if (C4284f.LIZJ().LIZLLL && !"paid_link".equals(str3) && i2 != LinkApplyType.STRONG_REACH.value) {
                            VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = VoiceChatRoomGuestWidget.this;
                            voiceChatRoomGuestWidget.LJJIJIIJIL = i;
                            voiceChatRoomGuestWidget.LJJIL();
                        } else if (VoiceChatRoomGuestWidget.this.LIZLLL != null) {
                            if ("paid_link".equals(str3) && i == -1) {
                                VoiceChatRoomGuestWidget.this.LIZLLL.LIZ(VoiceChatRoomGuestWidget.this.LJJIJIIJIL, str, i2, linkMatchType, VoiceChatRoomGuestWidget.this.LJJIII, str2, str3, i3, i4, i5, z2, z3, i6, null);
                                VoiceChatRoomGuestWidget.this.LJJIJIIJIL = -1;
                                return;
                            }
                            VoiceChatRoomGuestWidget.this.LIZLLL.LIZ(i, str, i2, linkMatchType, VoiceChatRoomGuestWidget.this.LJJIII, str2, str3, i3, i4, i5, z2, z3, i6, null);
                        }
                    }
                }
            });
            this.LJJIIZI.LIZ(this.LJIILIIL);
            if (!TextUtils.equals(str2, "linkin_empty_stub_click") || !LiveConfigSettingKeys.LIVE_LINK_GUEST_CLEAN_SCREEN_OPTIMIZE.getValue().booleanValue()) {
                return;
            }
            this.LJJIIZI.LIZ(LJJJI());
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final void LIZ(boolean z, AbstractC418632hV abstractC418632hV) {
        C5923dp LJJJI;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), abstractC418632hV}, this, LIZJ, false, 95).isSupported && (LJJJI = LJJJI()) != null) {
            LJJJI.LJJLJLI().LIZ(Boolean.TRUE);
            DialogC418702hc dialogC418702hc = this.LJII;
            if (dialogC418702hc != null && dialogC418702hc.isShowing()) {
                return;
            }
            this.LJII = new DialogC418702hc(this.context, LJJJI, this, z, abstractC418632hV);
            C116971W2r.LIZJ(this.LJII);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final void LIZ(boolean z, List<AnchorLinkUser> list, long j, Map<Long, ? extends RoomLinkerContent> map) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), list, new Long(j), map}, this, LIZJ, false, 100).isSupported) {
            return;
        }
        LIZ(z, "normal");
        this.f26474LJ.LIZIZ(z);
        this.LJFF.LIZ(list, j, z ? "silence" : "unsilence", map);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final void LIZ(final int i, boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZJ, false, 102).isSupported) {
            return;
        }
        this.LJJJJL = z2;
        if (LJIIJJI() && !C77917Gnf.LIZ(false)) {
            v$a v_a = new v$a(getContext());
            v_a.LIZ(5);
            v_a.LIZ(false);
            v_a.LIZ(LK5.LIZ(2131585932));
            v_a.LIZIZ(LK5.LIZ(2131585682));
            v_a.LIZIZ(0, LK5.LIZ(2131585473), new DialogInterface.OnClickListener(this, i) { // from class: X.GoO
                public static ChangeQuickRedirect LIZ;
                public final VoiceChatRoomGuestWidget LIZIZ;
                public final int LIZJ;

                static {
                    Covode.recordClassIndex(30946);
                }

                {
                    this.LIZIZ = this;
                    this.LIZJ = i;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = this.LIZIZ;
                    int i3 = this.LIZJ;
                    if (PatchProxy.proxy(new Object[]{Integer.valueOf(i3), dialogInterface, Integer.valueOf(i2)}, voiceChatRoomGuestWidget, VoiceChatRoomGuestWidget.LIZJ, false, 133).isSupported) {
                        return;
                    }
                    if (voiceChatRoomGuestWidget.dataCenter != null) {
                        C5984am c5984am = new C5984am(5);
                        c5984am.LIZIZ = Integer.valueOf(i3);
                        voiceChatRoomGuestWidget.dataCenter.put("cmd_interact_state_change", c5984am);
                    }
                    dialogInterface.dismiss();
                }
            }).LIZIZ(1, LK5.LIZ(2131582393), DialogInterface$OnClickListenerC79089HFr.LIZIZ).LIZJ();
        } else if (!z) {
            if (this.dataCenter == null) {
                return;
            }
            C5984am c5984am = new C5984am(5);
            c5984am.LIZIZ = Integer.valueOf(i);
            this.dataCenter.put("cmd_interact_state_change", c5984am);
        } else {
            H04 h04 = new H04(getContext());
            h04.LIZ(LK5.LIZ(2131585932));
            h04.LIZ(LK5.LIZ(2131585473), new DialogInterface.OnClickListener(this, i) { // from class: X.GoP
                public static ChangeQuickRedirect LIZ;
                public final VoiceChatRoomGuestWidget LIZIZ;
                public final int LIZJ;

                static {
                    Covode.recordClassIndex(30948);
                }

                {
                    this.LIZIZ = this;
                    this.LIZJ = i;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = this.LIZIZ;
                    int i3 = this.LIZJ;
                    if (PatchProxy.proxy(new Object[]{Integer.valueOf(i3), dialogInterface, Integer.valueOf(i2)}, voiceChatRoomGuestWidget, VoiceChatRoomGuestWidget.LIZJ, false, 131).isSupported) {
                        return;
                    }
                    dialogInterface.dismiss();
                    if (voiceChatRoomGuestWidget.dataCenter == null) {
                        return;
                    }
                    C5984am c5984am2 = new C5984am(5);
                    c5984am2.LIZIZ = Integer.valueOf(i3);
                    voiceChatRoomGuestWidget.dataCenter.put("cmd_interact_state_change", c5984am2);
                }
            }).LIZIZ(LK5.LIZ(2131582393), DialogInterface$OnClickListenerC79090HFs.LIZIZ).LIZ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final void LIZ(User user) {
        if (PatchProxy.proxy(new Object[]{user}, this, LIZJ, false, 105).isSupported) {
            return;
        }
        final C78998HCe c78998HCe = this.LIZLLL;
        if (PatchProxy.proxy(new Object[]{user}, c78998HCe, C78998HCe.LIZ, false, 22).isSupported || c78998HCe.LJIIL) {
            return;
        }
        final long id = user.getId();
        final String secUid = user.getSecUid();
        final String nickName = user.getNickName();
        c78998HCe.LJIIL = true;
        final long currentTimeMillis = System.currentTimeMillis();
        HDP.LIZJ(id);
        ((KDS) ((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).kickOut(c78998HCe.LJIILJJIL.getId(), id, secUid, "admin_stop_normal").m149as(c78998HCe.LJIIJJI())).LIZ(new Consumer(c78998HCe, id, currentTimeMillis, secUid, nickName) { // from class: X.HBG
            public static ChangeQuickRedirect LIZ;
            public final C78998HCe LIZIZ;
            public final long LIZJ;
            public final long LIZLLL;

            /* renamed from: LJ */
            public final String f6651LJ;
            public final String LJFF;

            static {
                Covode.recordClassIndex(30912);
            }

            {
                this.LIZIZ = c78998HCe;
                this.LIZJ = id;
                this.LIZLLL = currentTimeMillis;
                this.f6651LJ = secUid;
                this.LJFF = nickName;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                C78998HCe c78998HCe2 = this.LIZIZ;
                long j = this.LIZJ;
                long j2 = this.LIZLLL;
                String str = this.f6651LJ;
                String str2 = this.LJFF;
                C5171b c5171b = (C5171b) obj;
                if (PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), str, str2, c5171b}, c78998HCe2, C78998HCe.LIZ, false, 30).isSupported) {
                    return;
                }
                c78998HCe2.LJIIL = false;
                HDP.LIZJ(j, System.currentTimeMillis() - j2, c5171b.f26526LJ);
                TalkRoomBusinessFullLinkMonitor.LIZIZ.LIZ(j, str, j2, c5171b.f26526LJ);
                HH8.LIZIZ(j);
                if (c78998HCe2.mo21780LJ() == 0) {
                    return;
                }
                ((ax$a) c78998HCe2.mo21780LJ()).mo15656LJ(str2);
            }
        }, new Consumer(c78998HCe, id, currentTimeMillis, secUid) { // from class: X.HBf
            public static ChangeQuickRedirect LIZ;
            public final C78998HCe LIZIZ;
            public final long LIZJ;
            public final long LIZLLL;

            /* renamed from: LJ */
            public final String f6662LJ;

            static {
                Covode.recordClassIndex(30913);
            }

            {
                this.LIZIZ = c78998HCe;
                this.LIZJ = id;
                this.LIZLLL = currentTimeMillis;
                this.f6662LJ = secUid;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                C78998HCe c78998HCe2 = this.LIZIZ;
                long j = this.LIZJ;
                long j2 = this.LIZLLL;
                String str = this.f6662LJ;
                Throwable th = (Throwable) obj;
                if (PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), str, th}, c78998HCe2, C78998HCe.LIZ, false, 29).isSupported) {
                    return;
                }
                c78998HCe2.LIZIZ(th);
                c78998HCe2.LJIIL = false;
                HDP.LIZJ(j, System.currentTimeMillis() - j2, th);
                TalkRoomBusinessFullLinkMonitor.LIZIZ.LIZIZ(j, str, j2, th);
                HH8.LIZIZ(j, th);
                if (c78998HCe2.mo21780LJ() == 0) {
                    return;
                }
                ((ax$a) c78998HCe2.mo21780LJ()).LIZ(j, th);
            }
        });
        C78828H5q.LIZ(id, "administrator", Boolean.valueOf(c78998HCe.LJIILL != null && c78998HCe.LJIILL.LJJLIIIJLLLLLLLZ().LIZ().booleanValue()), C79242HLo.LIZ(id));
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final void LIZ(final HAA haa) {
        if (PatchProxy.proxy(new Object[]{haa}, this, LIZJ, false, 106).isSupported) {
            return;
        }
        if (C5056a.LJIILIIL() && haa.LIZLLL <= 0 && haa.f6620LJ == 0) {
            C116971W2r.LIZJ(new DialogC77935Gnx(this.context, haa));
            return;
        }
        final User user = haa.LIZJ;
        final Long valueOf = Long.valueOf(user.getId());
        if (this.LJJIJ.contains(valueOf)) {
            ALogger.m15800e("ttlive_link", "invite request already sent for " + user.getId());
            return;
        }
        this.LJJIJ.add(valueOf);
        int i = this.LJIIZILJ == 9 ? 64 : 8;
        final long currentTimeMillis = System.currentTimeMillis();
        HDP.LIZ(valueOf.longValue(), user.getSecUid());
        this.LJJJLIIL.add(((LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class)).invite(this.LJIILIIL.getId(), user.getSecUid(), i, haa.LIZLLL, haa.f6620LJ, haa.LJI).compose(C100839PnV.LIZJ()).subscribe(new Consumer(this, valueOf, user, currentTimeMillis, haa) { // from class: X.HAN
            public static ChangeQuickRedirect LIZ;
            public final VoiceChatRoomGuestWidget LIZIZ;
            public final Long LIZJ;
            public final User LIZLLL;

            /* renamed from: LJ */
            public final long f6628LJ;
            public final HAA LJFF;

            static {
                Covode.recordClassIndex(30951);
            }

            {
                this.LIZIZ = this;
                this.LIZJ = valueOf;
                this.LIZLLL = user;
                this.f6628LJ = currentTimeMillis;
                this.LJFF = haa;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = this.LIZIZ;
                Long l = this.LIZJ;
                User user2 = this.LIZLLL;
                long j = this.f6628LJ;
                HAA haa2 = this.LJFF;
                C5176i<C6068x> c5176i = (C5176i) obj;
                if (PatchProxy.proxy(new Object[]{l, user2, new Long(j), haa2, c5176i}, voiceChatRoomGuestWidget, VoiceChatRoomGuestWidget.LIZJ, false, 129).isSupported) {
                    return;
                }
                voiceChatRoomGuestWidget.LJJIJ.remove(l);
                voiceChatRoomGuestWidget.LJFF.LJFF(l.longValue());
                if (c5176i != null && c5176i.LIZJ != null) {
                    C88440Kt0.LIZ(2131584497);
                    C79007HCn.LJII().LIZ(c5176i.LIZJ.LIZIZ);
                    HDP.LIZ(l.longValue(), user2.getSecUid(), C79242HLo.LIZIZ(j), c5176i.f26526LJ);
                    HH8.LIZ(user2.getId(), C79242HLo.LIZIZ(j), haa2.toString());
                    TalkRoomBusinessFullLinkMonitor.LIZIZ.LIZ(l.longValue(), user2.getSecUid(), c5176i, j);
                }
                C87010KQi.LIZ().LIZ(new C4271i(3));
            }
        }, new Consumer(this, valueOf, user, currentTimeMillis, haa) { // from class: X.HAL
            public static ChangeQuickRedirect LIZ;
            public final VoiceChatRoomGuestWidget LIZIZ;
            public final Long LIZJ;
            public final User LIZLLL;

            /* renamed from: LJ */
            public final long f6626LJ;
            public final HAA LJFF;

            static {
                Covode.recordClassIndex(30952);
            }

            {
                this.LIZIZ = this;
                this.LIZJ = valueOf;
                this.LIZLLL = user;
                this.f6626LJ = currentTimeMillis;
                this.LJFF = haa;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = this.LIZIZ;
                Long l = this.LIZJ;
                User user2 = this.LIZLLL;
                long j = this.f6626LJ;
                HAA haa2 = this.LJFF;
                Throwable th = (Throwable) obj;
                if (PatchProxy.proxy(new Object[]{l, user2, new Long(j), haa2, th}, voiceChatRoomGuestWidget, VoiceChatRoomGuestWidget.LIZJ, false, 128).isSupported) {
                    return;
                }
                voiceChatRoomGuestWidget.LJJIJ.remove(l);
                if (th instanceof ApiServerException) {
                    C88440Kt0.LIZ(((ApiServerException) th).mPrompt);
                }
                HDP.LIZ(l.longValue(), user2.getSecUid(), C79242HLo.LIZIZ(j), th);
                HH8.LIZ(user2.getId(), th, C79242HLo.LIZIZ(j), haa2.toString());
                TalkRoomBusinessFullLinkMonitor.LIZIZ.LIZ(l.longValue(), user2.getSecUid(), th, j);
            }
        }));
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final void LIZ(final long j, final String str, final int i) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str, Integer.valueOf(i)}, this, LIZJ, false, 107).isSupported) {
            return;
        }
        if (i == ReplyType.Reject.ordinal()) {
            this.LIZLLL.LIZ(j, str, i);
        } else {
            LIZ(OperateType.REPLY, 2, new AbstractC80546Hoy<C4826b>() { // from class: com.bytedance.android.live.liveinteract.voicechat.VoiceChatRoomGuestWidget.4
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(30842);
                }

                @Override // p003X.AbstractC80546Hoy
                public final void LIZ(BaseCheckException baseCheckException) {
                    if (PatchProxy.proxy(new Object[]{baseCheckException}, this, LIZ, false, 2).isSupported) {
                        return;
                    }
                    VoiceChatRoomGuestWidget.this.LIZLLL.LIZ(j, str, ReplyType.Reject.ordinal());
                    TalkRoomBusinessFullLinkMonitor.LIZIZ.LIZ(baseCheckException);
                    HH8.LIZ(baseCheckException);
                    HDP.LIZ(OperateType.REPLY.ordinal(), 2, (Throwable) baseCheckException);
                }

                @Override // p003X.AbstractC80546Hoy
                public final /* synthetic */ void LIZ(C4825a c4825a, C4826b c4826b) {
                    if (!PatchProxy.proxy(new Object[]{c4825a, c4826b}, this, LIZ, false, 1).isSupported) {
                        VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = VoiceChatRoomGuestWidget.this;
                        voiceChatRoomGuestWidget.LJJIII = false;
                        voiceChatRoomGuestWidget.LIZLLL.LIZ(j, str, i);
                        TalkRoomBusinessFullLinkMonitor.LIZIZ.LIZ();
                        HH8.m23773LJ();
                        HDP.LIZ(OperateType.REPLY.ordinal(), 2);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC4998a
    public final void LIZ(boolean z, String str) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str}, this, LIZJ, false, 112).isSupported && this.LJIIJ != null) {
            if (z) {
                this.LJIIIZ.LJFF(str);
                this.dataCenter.put("data_self_is_silenced", Boolean.TRUE);
            } else {
                this.LJIIIZ.LJI(str);
                this.dataCenter.put("data_self_is_silenced", Boolean.FALSE);
            }
            this.f26474LJ.LJIIIIZZ = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final void LIZIZ(String str) {
        ChatMatchWidget chatMatchWidget;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 116).isSupported && (chatMatchWidget = this.LJJIJIL) != null) {
            chatMatchWidget.LIZ(null, null, false, false, str, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final void LIZIZ(String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZJ, false, 117).isSupported) {
            return;
        }
        ChatMatchWidget.LJIIIIZZ.LIZ(str);
        new C78837H5z(this.LJIILIIL).LIZ((z ? LinkMatchType.SING_MATCH : LinkMatchType.MATCH).value);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final void LIZ(String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZJ, false, 120).isSupported) {
            return;
        }
        this.LJJIIZI.LIZ(str, z, this.LJIJJLI, this.LJIJI, this.LJJI, C79242HLo.LIZLLL());
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final void LIZ(String str, int i, String str2) {
        if (PatchProxy.proxy(new Object[]{str, 113, str2}, this, LIZJ, false, 123).isSupported) {
            return;
        }
        int intValue = ((Integer) C79046HEa.LIZ().LJJIIZI).intValue();
        if (intValue == 0) {
            LIZ(-1, "113", LinkApplyType.NORMAL.value, str2);
        } else if (intValue == 1) {
            LIZLLL(1);
        } else if (intValue != 2) {
        } else {
            C88440Kt0.LIZ(2131588275);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final void LIZ(C8854es c8854es) {
        if (!PatchProxy.proxy(new Object[]{c8854es}, this, LIZJ, false, 124).isSupported && !PatchProxy.proxy(new Object[]{c8854es}, this, LIZJ, false, C1399n.f22430f).isSupported) {
            C79007HCn LJII = C79007HCn.LJII();
            LJII.LJIIJJI = c8854es.LJJIJIIJI;
            LJII.LJIIIIZZ = c8854es.LJJIJIIJIL;
            LJII.LJIIIZ = c8854es.LJJIJ;
            LJII.LJII = c8854es.LJJIIZI;
            C5923dp LJJJI = LJJJI();
            if (LJJJI == null) {
                return;
            }
            AbstractC5003c LIZ = AbstractC5003c.LIZ.LIZ();
            if (LIZ != null && c8854es.LJJJJL != null) {
                ALogger.m15797i("ttlive_link_audio", C0002O.m25086C("realSwitchScene ListUser=", C79242HLo.LIZIZ(c8854es.LJJJJL)));
                if (LIZ.LJII() instanceof C4806x) {
                    LIZ.LJII().LIZ(c8854es.LJJJJL, c8854es.LJJL, "switchSceneMsg", c8854es.LJJLIIIJJIZ);
                }
            }
            LJJJI.LJJLL().LIZIZ().LIZ(new C6306l(c8854es.LIZ(), c8854es.LJJJJJL, false, false));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC4998a
    public final boolean LIZJ() {
        return this.LJIIIZ.LJIILIIL;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final boolean LJIIJ() {
        return this.LJIIIZ.LJIILIIL;
    }

    private String LJJJIL() {
        String str;
        if (this.LIZLLL.LIZIZ) {
            str = "anchor";
        } else {
            str = "audience";
        }
        if (this.LIZLLL.LIZJ) {
            return "game";
        }
        return str;
    }

    private void LJJJJIZL() {
        C79220HKs c79220HKs;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 97).isSupported && (c79220HKs = this.LJI) != null && c79220HKs.LJIILIIL()) {
            this.LJI.dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    /* renamed from: LJ */
    public final boolean mo15654LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 99);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return LJIIJ();
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final List<LinkPlayerInfo> LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 103);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        return this.LJFF.LJFF();
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final List<LinkPlayerInfo> LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 104);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        return this.LJFF.LIZJ();
    }

    public void LJJIJIIJI() {
        ChatMatchWidget chatMatchWidget;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 11).isSupported && (chatMatchWidget = this.LJJIJIL) != null) {
            chatMatchWidget.LIZIZ();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.VoiceChatRoomGuestWidget$6 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C49976 {
        public static final /* synthetic */ int[] LIZ = new int[MediaOperation.Action.valuesCustom().length];

        static {
            Covode.recordClassIndex(30844);
            try {
                LIZ[MediaOperation.Action.CLOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LIZ[MediaOperation.Action.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private int LJJJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 25);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (LJIIJJI()) {
            return 9;
        }
        return 5;
    }

    private C5001e LJJJJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 37);
        if (proxy.isSupported) {
            return (C5001e) proxy.result;
        }
        if (this.LJJJJLL == null) {
            this.LJJJJLL = new C5001e();
            this.LJJJJLL.LIZ(this.LJJLIL);
        }
        return this.LJJJJLL;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC4998a
    public final Boolean LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 114);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        AbstractC5436a abstractC5436a = this.LJIIJ;
        if (abstractC5436a != null) {
            return Boolean.valueOf(abstractC5436a.LJFF());
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final boolean LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 109);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C79188HJm c79188HJm = this.LJIIIIZZ;
        if (c79188HJm == null || !c79188HJm.LJIIIIZZ()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final void LJIIZILJ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 98).isSupported && this.dataCenter != null) {
            this.dataCenter.put("cmd_interact_state_change", new C5984am(9));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final boolean LJIJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 110);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return "invite".equals(this.LJJI);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final int LJIJJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 111);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (LJIIJ()) {
            return this.f26474LJ.LJFF();
        }
        return -1;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final void LJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 50).isSupported) {
            return;
        }
        if (C77917Gnf.LIZ(this.LJIILIIL)) {
            C79188HJm c79188HJm = this.LJIIIIZZ;
            if (!PatchProxy.proxy(new Object[0], c79188HJm, C79188HJm.LIZ, false, 29).isSupported && c79188HJm.LJIILIIL != null) {
                c79188HJm.LJIILIIL.dismiss();
                return;
            }
            return;
        }
        ChatMatchWidget chatMatchWidget = this.LJJIJIL;
        if (chatMatchWidget != null) {
            chatMatchWidget.LIZ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final void LJJIFFI() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 121).isSupported) {
            return;
        }
        ChatMatchWidget.LJIIIIZZ.LIZ("apply_panel");
        this.LJJIJIL.LIZ(null, null, false, true, "apply_panel", Boolean.FALSE);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    public final void LJJIII() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 64).isSupported) {
            return;
        }
        if (LJIILJJIL().LJIILIIL) {
            this.LJIIJ.LJII();
            this.LJIIIZ.LIZ();
            return;
        }
        this.LIZLLL.ao_();
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    public final void LJJIIJZLJL() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 36).isSupported) {
            return;
        }
        Runnable runnable = this.LJIIJJI;
        if (runnable != null) {
            runnable.run();
            this.LJIIJJI = null;
        }
        C79188HJm c79188HJm = this.LJIIIIZZ;
        if (c79188HJm != null) {
            c79188HJm.LJII();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    public final void LJJIIZ() {
        HHB hhb;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 4).isSupported && (hhb = this.LJIIIZ) != null && !PatchProxy.proxy(new Object[]{(byte) 0}, hhb, HHB.LIZ, false, 41).isSupported) {
            Client client = hhb.LIZJ;
            if (client != null) {
                client.switchAudio(false);
            }
            AbstractC5436a abstractC5436a = hhb.LIZIZ;
            if (abstractC5436a != null) {
                abstractC5436a.LIZ(true);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 28).isSupported) {
            return;
        }
        super.onStop();
        if (LiveSettingKeys.INTERACT_ACTIVITY_PERMISSION_GUARANTOR_ENABLE.getValue().booleanValue()) {
            LJJJJ().LIZJ();
        }
    }

    private Boolean LJJJJI() {
        IInteractService iInteractService;
        List<LinkPlayerInfo> LIZJ2;
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 70);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        if (this.LJJJJIZL == LinkApplyType.KTV_PRIORITY_SING && (iInteractService = (IInteractService) ServiceManager.getService(IInteractService.class)) != null && iInteractService.getLinkUserInfoCenter() != null && (LIZJ2 = iInteractService.getLinkUserInfoCenter().LIZJ()) != null) {
            if (LIZJ2.size() >= 9) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final void LJIILLIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 96).isSupported) {
            return;
        }
        H04 h04 = new H04(getContext());
        h04.LIZ(LK5.LIZ(2131585934));
        h04.LIZ(LK5.LIZ(2131582651), new DialogInterface.OnClickListener(this) { // from class: X.GoM
            public static ChangeQuickRedirect LIZ;
            public final VoiceChatRoomGuestWidget LIZIZ;

            static {
                Covode.recordClassIndex(30944);
            }

            {
                this.LIZIZ = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = this.LIZIZ;
                if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i)}, voiceChatRoomGuestWidget, VoiceChatRoomGuestWidget.LIZJ, false, 135).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
                if (voiceChatRoomGuestWidget.dataCenter == null) {
                    return;
                }
                voiceChatRoomGuestWidget.dataCenter.put("cmd_interact_state_change", new C5984am(9));
            }
        }).LIZIZ(LK5.LIZ(2131582393), DialogInterface$OnClickListenerC79088HFq.LIZIZ).LIZ();
    }

    public void LJJIIZI() {
        boolean booleanValue;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 5).isSupported) {
            return;
        }
        if (this.LJIIZILJ != 5 && !C79242HLo.LJIJI()) {
            if (this.LJIIZILJ == 9) {
                booleanValue = LiveSettingKeys.FASTMATCH_OPTIMIZE_V2_ENABLE.getValue().LIZ();
            } else {
                return;
            }
        } else {
            booleanValue = LiveSettingKeys.VOICE_CHAT_FASTMATCH_ENABLE.getValue().booleanValue();
        }
        if (booleanValue && this.LJJIJIL == null) {
            ALogger.m15801d("voice_chat", "loadMatchWidget");
            enableSubWidgetManager();
            this.LJJIJIL = new ChatMatchWidget();
            this.subWidgetManager.load(this.LJJIJIL);
        }
    }

    public Long LJJIJL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 24);
        if (proxy.isSupported) {
            return (Long) proxy.result;
        }
        Long l = null;
        MicPosTagInfo micPosTagInfo = (MicPosTagInfo) this.dataCenter.get("data_link_mic_pos_tag_info", (String) null);
        if (micPosTagInfo == null || (l = Long.valueOf(micPosTagInfo.getTagType())) == null || l.longValue() == 0) {
            MicPosTagInfo micPosTagInfo2 = this.LJJLIIIJ;
            if (micPosTagInfo2 != null) {
                return Long.valueOf(micPosTagInfo2.getTagType());
            }
            return l;
        }
        return l;
    }

    public void LJJIJLIJ() {
        C79188HJm c79188HJm;
        int LIZLLL;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 82).isSupported || (c79188HJm = this.LJIIIIZZ) == null || (LIZLLL = c79188HJm.LIZLLL()) < 0) {
            return;
        }
        this.LJIIIIZZ.LIZJ(LIZLLL);
        if (((IUserService) ServiceManager.getService(IUserService.class)).user().LJI()) {
            this.LJJIIZI.LIZ("administrator");
        } else {
            this.LJJIIZI.LIZIZ();
        }
    }

    public final void LJJIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, OpenAuthTask.f22015g).isSupported) {
            return;
        }
        if (LiveSettingKeys.LIVE_LYNX_PAYFORLINK_APPLY_PAYINFO_REQUEST.getValue().booleanValue()) {
            C78538Gxg.LIZ(this.context, this.LJIJJLI, "voice_live");
            return;
        }
        this.LJJJLIIL.add(((LinkPaidLinkApi) C88306Kqq.LIZ().LIZ(LinkPaidLinkApi.class)).getPaidInfoBeforeApply(this.LJIILIIL.getId()).compose(C100839PnV.LIZJ()).subscribe(new Consumer<C5176i<C6182x>>() { // from class: com.bytedance.android.live.liveinteract.voicechat.VoiceChatRoomGuestWidget.5
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(30843);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(C5176i<C6182x> c5176i) {
                C5176i<C6182x> c5176i2 = c5176i;
                if (!PatchProxy.proxy(new Object[]{c5176i2}, this, LIZ, false, 1).isSupported) {
                    C6182x c6182x = c5176i2.LIZJ;
                    if (c6182x.LIZJ != null) {
                        AbstractC80293Hkt.f7005ag.LIZ(Integer.valueOf(c6182x.LIZJ.intValue()));
                    }
                    if (c6182x.LIZLLL != null) {
                        AbstractC80293Hkt.f7006ah.LIZ(Integer.valueOf(c6182x.LIZLLL.intValue()));
                    }
                    ArrayList arrayList = new ArrayList();
                    for (C6183z c6183z : c6182x.f26905LJ) {
                        arrayList.add(c6183z.LIZIZ);
                    }
                    C6179t LIZ2 = AbstractC80293Hkt.f7010al.LIZ();
                    LIZ2.LIZIZ = c6182x.f26905LJ;
                    LIZ2.LIZJ = c6182x.LJFF;
                    VoiceChatRoomGuestWidget.this.LIZ(false);
                    Context context = VoiceChatRoomGuestWidget.this.context;
                    int intValue = c6182x.LIZJ.intValue();
                    int intValue2 = c6182x.LIZLLL.intValue();
                    String str = c6182x.LJFF;
                    if (!PatchProxy.proxy(new Object[]{context, "voice_live", Integer.valueOf(intValue), Integer.valueOf(intValue2), arrayList, str}, null, C78538Gxg.LIZ, true, 21).isSupported) {
                        C106862S5w.LIZ(context, "voice_live");
                        SettingKey<C6858bo> settingKey = LiveSettingKeys.LINK_PAYMENT_CONFIG;
                        Intrinsics.checkNotNullExpressionValue(settingKey, "");
                        String str2 = settingKey.getValue().LIZJ;
                        if (!TextUtils.isEmpty(str2)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("live_type", "voice_live");
                            hashMap.put("paid_count", String.valueOf(intValue));
                            hashMap.put("limit_time", String.valueOf(intValue2));
                            C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.f6999aa;
                            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                            hashMap.put("reason_required", String.valueOf(c87308Kak.LIZ().intValue()));
                            C87308Kak<String> c87308Kak2 = AbstractC80293Hkt.f7000ab;
                            Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                            String LIZ3 = c87308Kak2.LIZ();
                            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                            hashMap.put("reason_template_manual", LIZ3);
                            C87308Kak<String> c87308Kak3 = AbstractC80293Hkt.f7001ac;
                            Intrinsics.checkNotNullExpressionValue(c87308Kak3, "");
                            String LIZ4 = c87308Kak3.LIZ();
                            Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                            hashMap.put("reason_template_default", LIZ4);
                            String joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "|", null, null, 0, null, null, 62, null);
                            if (String.valueOf(joinToString$default).length() > 0) {
                                hashMap.put("linkmic_tag", String.valueOf(joinToString$default));
                            }
                            if (str != null && str.length() > 0) {
                                hashMap.put("paid_desc", str);
                            }
                            if (C78538Gxg.LIZ()) {
                                hashMap.put("live_anonymous_paid_link_mic", "1");
                            }
                            C78828H5q.LIZIZ(hashMap, (Integer) null, (Integer) null, 6, (Object) null);
                            String LIZIZ = C414642b4.LIZIZ(str2, hashMap);
                            ALogger.m15797i("ttlive_link_paid", C0002O.m25086C("applySchema = ", LIZIZ));
                            ((ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class)).handle(context, LIZIZ);
                        }
                    }
                }
            }
        }, new Consumer(this) { // from class: X.GoL
            public static ChangeQuickRedirect LIZ;
            public final VoiceChatRoomGuestWidget LIZIZ;

            static {
                Covode.recordClassIndex(30953);
            }

            {
                this.LIZIZ = this;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = this.LIZIZ;
                Throwable th = (Throwable) obj;
                if (PatchProxy.proxy(new Object[]{th}, voiceChatRoomGuestWidget, VoiceChatRoomGuestWidget.LIZJ, false, 127).isSupported) {
                    return;
                }
                voiceChatRoomGuestWidget.LIZ(false);
                ALogger.m15800e("ttlive_link_paid", C0002O.m25086C("getPaidInfoBeforeApply failed ", th.getMessage()));
            }
        }));
    }

    private void LJJIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 23).isSupported) {
            return;
        }
        long j = 0;
        if (this.LJIILJJIL > 0) {
            j = (System.currentTimeMillis() - this.LJIILJJIL) / 1000;
        }
        String LJJJIL = LJJJIL();
        this.LJJIIZI.LIZ(LJJJ(), this.LJIJJLI, this.LJJJJJL, this.LJIJI, this.LJJI, LJJJIL, j, this.LJJIIZ.LJI(), C79242HLo.LIZLLL(), this.LJJIIJZLJL, this.LJJIIZ.LJIIZILJ, this.LJJLIIJ.LIZIZ, this.LJIILIIL.circleInfo, false, this.LJIILJJIL, this.LJIILLIIL, LJJIJL(), null, null, this.LJJJJIZL, this.LJJJJJ, this.LJJLIIIJILLIZJL);
        C79007HCn.LJII().LJIJI = "";
    }

    public void LJJIJIIJIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 19).isSupported) {
            return;
        }
        String str = C79007HCn.LJII().LJII;
        ALogger.m15801d("link_room_fight", "livecore version " + ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).getLiveCoreVersion());
        ALogger.m15801d("link_room_fight", "stopForwardStreamCrossRoom isEngineOn: " + LJIILJJIL().LJIILIIL + " isForwardCrossRoom: " + LJIILJJIL().LJIILJJIL + " localInfo: " + str);
        if (LJIILJJIL().LJIILIIL && LJIILJJIL().LJIILJJIL) {
            ALogger.m15801d("link_room_fight", "stopForwardStreamCrossRoom");
            C78627Gz7.LIZIZ.LIZIZ(str);
            LJIILJJIL().LIZ(str);
        }
    }

    public void LJJIJIL() {
        Map<Long, String> map;
        Long l;
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 20).isSupported) {
            return;
        }
        ALogger.m15801d("link_room_fight", "startForwardStreamToRooms rtcinfo " + C79007HCn.LJII().LJIIIZ);
        if (LJIILJJIL().LJIILIIL && !LJIILJJIL().LJIILJJIL) {
            String str2 = C79007HCn.LJII().LJII;
            String str3 = null;
            if (C79007HCn.LJII().LJIIIZ != null && C79007HCn.LJII().LJIIIZ.crossRoomLinkmicRtcInfo != null && C79007HCn.LJII().LJIIIZ.crossRoomLinkmicRtcInfo.getRtcInfoMap() != null) {
                map = C79007HCn.LJII().LJIIIZ.crossRoomLinkmicRtcInfo.getRtcInfoMap();
            } else {
                map = null;
            }
            if (C79007HCn.LJII().LJIIJ != null) {
                l = C79007HCn.LJII().LJIIJ.getKey();
            } else {
                l = null;
            }
            if (map != null && C449933qt.LIZ((Map) map) != null) {
                str3 = (String) C449933qt.LIZ((Map) map).getValue();
            }
            ALogger.m15801d("link_room_fight", "startForwardStreamToRooms roomId " + l + " localRtc " + str2 + " remoteInfo " + str3);
            C78627Gz7 c78627Gz7 = C78627Gz7.LIZIZ;
            if (l != null) {
                str = l.toString();
            } else {
                str = "";
            }
            c78627Gz7.LIZIZ(str, str2, str3);
            if (l != null && l.longValue() > 0 && str2 != null && str3 != null) {
                LJIILJJIL().LIZIZ();
                ALogger.m15801d("link_room_fight", "startForwardStreamToRooms result " + LJIILJJIL().LIZ(l.toString(), str2, str3));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.BaseVoiceChatWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: W_ */
    public final void mo15659W_() {
        C80608Hpy c80608Hpy;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 72).isSupported) {
            return;
        }
        LJJIZ();
        if (this.LJIIJ != null) {
            this.dataCenter.put("cmd_linker_live_core_release", Boolean.TRUE);
            this.LJIIJ.mo15611LJ();
            this.LJIIJ = null;
        }
        C78998HCe c78998HCe = this.LIZLLL;
        if (c78998HCe != null) {
            c78998HCe.ao_();
        }
        this.LJIIIZ.LIZIZ(this);
        this.LJJIZ.LJFF();
        this.LJJIZ = null;
        this.LJJJJLI = false;
        HDJ hdj = this.LJJJJZI;
        hdj.LIZIZ = 0L;
        hdj.LIZJ = 0L;
        this.LJJLIIJ.LIZ();
        LJJIJIIJIL();
        if (this.LJIIZILJ == 16) {
            C79188HJm c79188HJm = this.LJIIIIZZ;
            if (!PatchProxy.proxy(new Object[0], c79188HJm, C79188HJm.LIZ, false, 56).isSupported && c79188HJm.LJIIIZ()) {
                LinkRoomFightAudioWidget linkRoomFightAudioWidget = c79188HJm.LJIIL;
                if (!PatchProxy.proxy(new Object[0], linkRoomFightAudioWidget, LinkRoomFightAudioWidget.LIZJ, false, 13).isSupported && (c80608Hpy = linkRoomFightAudioWidget.LIZLLL) != null) {
                    c80608Hpy.LJIIJJI();
                }
            }
        }
        QuickInteractWidget quickInteractWidget = this.LJJLIIIJLJLI;
        if (quickInteractWidget != null) {
            quickInteractWidget.m15683LJ();
        }
        LinkControlWidget.LIZIZ(BaseVoiceChatWidget.LIZ(this.LJIIZILJ), false);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 27).isSupported) {
            return;
        }
        this.LJIIIZ.m23768LJ();
        boolean isPipOpen = ((ILiveVideoFloatWindowService) ServiceManager.getService(ILiveVideoFloatWindowService.class)).isPipOpen();
        boolean isFloatOpen = ((ILiveVideoFloatWindowService) ServiceManager.getService(ILiveVideoFloatWindowService.class)).isFloatOpen();
        if (LJIIJ() && this.LJIIJ != null) {
            if (LiveSettingKeys.INTERACT_ACTIVITY_PERMISSION_GUARANTOR_ENABLE.getValue().booleanValue()) {
                LJJJJ().LIZIZ();
            }
            boolean enableCaptureAudioOnBackground = ((IInteractService) ServiceManager.getService(IInteractService.class)).enableCaptureAudioOnBackground(true);
            if (!isFloatOpen && enableCaptureAudioOnBackground) {
                HH8.LJFF();
            } else {
                LIZ(true, "onPause");
                if (isFloatOpen && !isPipOpen) {
                    this.LJIIIZ.LIZ(true, "onPause");
                }
                int LJFF = this.f26474LJ.LJFF();
                if (LJFF == 0) {
                    this.LJFF.LIZ(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ(), C79007HCn.LJII().LIZLLL, 3);
                    this.f26474LJ.LIZ("onPause");
                } else if (LJFF == 3 && !PatchProxy.proxy(new Object[]{Integer.valueOf(LJFF)}, null, HH8.LIZ, true, 37).isSupported) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("list_status", Integer.valueOf(LJFF));
                    HH8.LIZ("on_pause_mute_error", (Map) linkedHashMap, false, 4, (Object) null);
                }
            }
            this.LJFF.LJIIIZ();
            this.LJJIIZ.LJIIIZ();
        }
        this.LJJII = false;
        this.LJIIIIZZ.LJFF();
        super.onPause();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 26).isSupported) {
            return;
        }
        super.onResume();
        this.LJJJ.removeCallbacksAndMessages(null);
        this.LJJII = true;
        this.LJIIIZ.LIZLLL();
        this.LJJIIZ.LJIIIIZZ();
        if (LJIIJ() && this.LJIIJ != null) {
            if (LiveSettingKeys.INTERACT_ACTIVITY_PERMISSION_GUARANTOR_ENABLE.getValue().booleanValue()) {
                LJJJJ().LIZ();
            }
            this.LJFF.LJIIJ();
            if ((!LiveSettingKeys.INTERACT_ACTIVITY_PERMISSION_GUARANTOR_ENABLE.getValue().booleanValue() || !LJJJJ().LJIIIIZZ) && this.f26474LJ.LJFF() == 3) {
                this.f26474LJ.LIZIZ("onResume");
            }
            this.LJIIIZ.LIZ(false, "onResume");
            this.dataCenter.put("cmd_interact_state_change", new C5984am(3));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.BaseVoiceChatWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: V_ */
    public final void mo15660V_() {
        C80608Hpy c80608Hpy;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 69).isSupported || !isViewValid()) {
            return;
        }
        C78998HCe c78998HCe = this.LIZLLL;
        if (!PatchProxy.proxy(new Object[0], c78998HCe, C78998HCe.LIZ, false, 25).isSupported) {
            c78998HCe.LJIJJ.add(((LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class)).notifyJoinRtc(c78998HCe.LJIILJJIL.getId(), c78998HCe.LJIJI).subscribe(new HEP(c78998HCe), new C79054HEi(c78998HCe)));
        }
        if (this.LJIIZILJ == 16) {
            LJJIJIL();
            C79188HJm c79188HJm = this.LJIIIIZZ;
            if (!PatchProxy.proxy(new Object[0], c79188HJm, C79188HJm.LIZ, false, 55).isSupported && c79188HJm.LJIIIZ()) {
                LinkRoomFightAudioWidget linkRoomFightAudioWidget = c79188HJm.LJIIL;
                if (!PatchProxy.proxy(new Object[0], linkRoomFightAudioWidget, LinkRoomFightAudioWidget.LIZJ, false, 12).isSupported && (c80608Hpy = linkRoomFightAudioWidget.LIZLLL) != null) {
                    c80608Hpy.LJIIJ();
                }
            }
        }
        if (C79007HCn.LJII().LJIILLIIL && this.LJIIJ != null) {
            VoiceChatMuteManager voiceChatMuteManager = this.f26474LJ;
            if (!PatchProxy.proxy(new Object[0], voiceChatMuteManager, VoiceChatMuteManager.LIZ, false, 27).isSupported) {
                ALogger.m15797i("voice_chat", "silenceSelfByServer");
                voiceChatMuteManager.LJIILIIL.put("data_self_is_silenced", Boolean.TRUE);
                voiceChatMuteManager.LJIILJJIL.LIZ(true, "silenceSelfByServer");
                voiceChatMuteManager.LJFF.postValue(Boolean.TRUE);
                Iterator<VoiceChatMuteManager.AbstractC4989a> it = voiceChatMuteManager.f26472LJ.iterator();
                while (it.hasNext()) {
                    it.next().LIZ(C79242HLo.LIZ());
                }
            }
            C79007HCn.LJII().LJIILLIIL = false;
        }
        LinkControlWidget.LIZIZ(BaseVoiceChatWidget.LIZ(this.LJIIZILJ), false);
        this.LJIILJJIL = System.currentTimeMillis();
        this.LJJIIZI.LIZ(this.LJIJJLI, this.LJIJI, this.LJJI, C79242HLo.LIZ(this.LJFF), LJIIJJI(), C79242HLo.LIZLLL(), this.LJJ, this.LJIJJ, this.LJJIII, this.LJJIIJZLJL, this.LJIILIIL.circleInfo, this.LJIILLIIL, LJJIJL(), null, null, this.LJJJJIZL, this.LJJJJJ, this.LJJLIIIJILLIZJL);
        this.LJJIII = false;
        this.LJIL = null;
        if (!this.LJJII) {
            int LJFF = this.f26474LJ.LJFF();
            ALogger.m15797i("voice_chat", "start link when background, try mute self silenceState=" + LJFF);
            if (LJFF <= 0) {
                this.LJFF.LIZ(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ(), C79007HCn.LJII().LIZLLL, 3);
                this.f26474LJ.LIZ("start on background");
                LIZ(true, "start on background");
            }
            this.LJFF.LJIIIZ();
        }
        C78998HCe c78998HCe2 = this.LIZLLL;
        if (!PatchProxy.proxy(new Object[0], c78998HCe2, C78998HCe.LIZ, false, 6).isSupported) {
            c78998HCe2.LJIIIIZZ = true;
            c78998HCe2.LIZIZ = false;
            c78998HCe2.LIZJ = false;
            c78998HCe2.LIZLLL = 200;
            c78998HCe2.LJIIJ = false;
            c78998HCe2.LJIIZILJ.put("cmd_interact_state_change", new C5984am(3));
            C79046HEa.LIZ().LIZ((Integer) 2);
        }
        this.LJJJJZI.LIZ();
        String LIZIZ = C79007HCn.LJII().LIZIZ();
        if (!TextUtils.isEmpty(LIZIZ)) {
            this.LJJLIIJ.LIZ(LIZIZ, HHG.LIZJ(this.LJIILIIL));
        } else {
            this.LJJLIIJ.LIZ();
        }
        Room room = this.LJIILIIL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{room}, null, HHG.LIZ, true, 6);
        if (proxy.isSupported) {
            if (!((Boolean) proxy.result).booleanValue()) {
                return;
            }
        } else {
            C106862S5w.LIZ(room);
            if (!HHG.LIZ(room) || !HHG.LIZIZ.LIZJ) {
                return;
            }
        }
        if (LJIIJJI() && C79242HLo.LJIL() != C79242HLo.LIZ() && this.LJIIJ != null) {
            ALogger.m15795w("ttlive_link", "stopVideoCapture since not singer! " + this.LJJJJLI);
            if (this.LJJJJLI) {
                this.LJIIJ.LJII();
            }
            boolean z = this.LJJJJLI;
            long LJIL = C79242HLo.LJIL();
            if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(LJIL)}, null, HH8.LIZ, true, 53).isSupported) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("singerId", Long.valueOf(LJIL));
                if (z) {
                    HH8.LIZ("ktv_stop_capture_on_start", (Map) linkedHashMap, false, 4, (Object) null);
                } else {
                    HH8.LIZ("ktv_stop_capture_on_start_failed", (Map) linkedHashMap, false, 4, (Object) null);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        C78393GvL c78393GvL;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 22).isSupported) {
            return;
        }
        if (LiveSettingKeys.INTERACT_ACTIVITY_PERMISSION_GUARANTOR_ENABLE.getValue().booleanValue()) {
            LJJJJ().LIZLLL();
        }
        if (LJIIJ()) {
            LJJIZ();
            C78538Gxg.LIZIZ.LIZIZ(false);
            C78536Gxe.LIZ().LJIIJ();
            HH8.LIZLLL();
        }
        if (LJIIJJI()) {
            this.LJJIIZI.LIZ(this.LJIILL);
        }
        C78833H5v c78833H5v = this.LJJIIZI;
        if (!PatchProxy.proxy(new Object[0], c78833H5v, C78833H5v.LIZ, false, 44).isSupported && !PatchProxy.proxy(new Object[]{c78833H5v, null, null, 3, null}, null, C78833H5v.LIZ, true, 42).isSupported) {
            c78833H5v.LIZIZ(null, null);
        }
        int i = this.LJIIZILJ;
        if (i != 0) {
            C78833H5v c78833H5v2 = this.LJJIIZI;
            long j = this.LJIILL;
            CircleInfo circleInfo = this.LJIILIIL.circleInfo;
            boolean LJIIJ = this.LJIIIIZZ.LJIIJ();
            C79188HJm c79188HJm = this.LJIIIIZZ;
            if (c79188HJm != null) {
                c78393GvL = c79188HJm.m23756LJ(true);
            } else {
                c78393GvL = null;
            }
            c78833H5v2.LIZ(j, i, (Integer) null, circleInfo, LJIIJ, c78393GvL);
            this.dataCenter.put("data_enter_room_is_quick_invite", Boolean.FALSE);
        }
        this.dataCenter.put("data_self_is_silenced", Boolean.FALSE);
        this.dataCenter.removeObserver(this);
        C79007HCn.LJII().LIZ(Boolean.FALSE);
        this.f26474LJ.LIZLLL();
        this.LJIIIIZZ.LIZ();
        this.LJJIIZ.LJIIJJI();
        this.LJIIIZ.LJFF();
        H03 h03 = this.LJJJLZIJ;
        if (!PatchProxy.proxy(new Object[0], h03, H03.LIZ, false, 5).isSupported) {
            RunnableC63251Axh.LIZIZ.LIZIZ(h03);
            h03.LIZLLL = false;
            h03.LIZIZ = 0L;
            h03.LIZJ = 0L;
            h03.f6531LJ.clear();
        }
        this.LIZLLL.LIZJ();
        this.LJJLIIJ.LIZ();
        HD9 hd9 = this.LJJIJIIJI;
        if (hd9 != null) {
            hd9.LIZ(this.LJIIZILJ);
        }
        this.LJFF.LIZIZ(this.LJJLIIIJJI);
        this.LJFF.LIZIZ();
        C79220HKs c79220HKs = this.LJI;
        if (c79220HKs != null && c79220HKs.LJIILIIL()) {
            this.LJI.dismiss();
        }
        DialogC418702hc dialogC418702hc = this.LJII;
        if (dialogC418702hc != null && dialogC418702hc.isShowing()) {
            C116971W2r.LIZ(this.LJII);
        }
        C78958HAq c78958HAq = this.LJJIJLIJ;
        if (c78958HAq != null) {
            c78958HAq.dismiss();
        }
        if (this.LJIIJ != null) {
            this.dataCenter.put("cmd_linker_live_core_release", Boolean.TRUE);
            this.LJIIJ.mo15611LJ();
            this.LJIIJ = null;
            HFT hft = this.LJJIZ;
            if (hft != null) {
                hft.LIZ();
            }
        }
        CompositeDisposable compositeDisposable = this.LJJJLIIL;
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            this.LJJJLIIL.dispose();
        }
        C79046HEa.LIZ().LIZ((Integer) 0);
        if (LJJJI() != null && LJJJI().LJJLIIIJLLLLLLLZ().LIZ().booleanValue()) {
            LJJJI().LJJLIIIJLLLLLLLZ().LIZ(Boolean.FALSE);
        }
        if (LJJJI() != null && LJJJI().LJJLL().LIZIZ() != null) {
            LJJJI().LJJLL().LIZIZ().LIZJ();
        }
        LinkControlWidget.LJJIIZ();
        C79007HCn.LJII().LJIJI = "";
        if (LiveConfigSettingKeys.LIVE_OPEN_FIX_VOICE_GUEST_CRASH.getValue().booleanValue() && this.widgetCallback != null && this.widgetCallback.getWidgetManager() != null && this.widgetCallback.getWidgetManager().getContext() == null) {
            this.subWidgetManager = null;
        }
        super.onDestroy();
        int i2 = this.LJIIZILJ;
        if (i2 == 16) {
            LIZ(i2, this.LJIJ, 0, 0);
        }
        C5923dp LLLLII = C5923dp.LLLLII();
        if (LLLLII != null && LLLLII.LJJJJZ() != null && LLLLII.LJJJJZ().LIZIZ() != null) {
            LLLLII.LJJJJZ().LIZIZ().LIZJ();
        }
        C79108HGk.LIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        IKtvService iKtvService;
        C2WC<Integer> ktvPlayModeChangedObservable;
        String str;
        int i;
        int i2;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        C79007HCn.LJII().LIZJ(5);
        Pair LIZ = IQV.LIZ(C78674Gzs.LIZIZ);
        C78673Gzr c78673Gzr = (C78673Gzr) LIZ.getFirst();
        c78673Gzr.LIZ().LIZIZ(this);
        IQX.LIZ(c78673Gzr, "voice_chat_guest_context");
        this.LJJJLIIL.add((Disposable) LIZ.getSecond());
        Pair LIZ2 = IQV.LIZ(C79104HGg.LIZIZ);
        C79189HJn c79189HJn = (C79189HJn) LIZ2.getFirst();
        c79189HJn.LIZ().LIZIZ(this);
        IQX.LIZ(c79189HJn, "voice_chat_admin_context");
        this.LJJJLIIL.add((Disposable) LIZ2.getSecond());
        this.LJIILL = SystemClock.elapsedRealtime();
        this.LJIILLIIL = System.currentTimeMillis();
        this.LJIILIIL = (Room) this.dataCenter.get("data_room");
        this.LJFF = new C4806x(this.LJIILIIL, this.dataCenter, 5);
        c79189HJn.LIZIZ().LIZIZ(this.LJFF);
        this.LIZLLL = new C78998HCe(this.LJIILIIL, this.dataCenter, LJJJI());
        this.f26474LJ = new VoiceChatMuteManager(this.LJIILIIL, false, this.LJFF, this.dataCenter, this, this);
        this.f26474LJ.LIZJ();
        VoiceChatMuteManager voiceChatMuteManager = this.f26474LJ;
        Observer<? super Boolean> observer = new Observer(this) { // from class: X.HFQ
            public static ChangeQuickRedirect LIZ;
            public final VoiceChatRoomGuestWidget LIZIZ;

            static {
                Covode.recordClassIndex(30949);
            }

            {
                this.LIZIZ = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = this.LIZIZ;
                Boolean bool = (Boolean) obj;
                if (PatchProxy.proxy(new Object[]{bool}, voiceChatRoomGuestWidget, VoiceChatRoomGuestWidget.LIZJ, false, 148).isSupported || voiceChatRoomGuestWidget.LJIIL == null) {
                    return;
                }
                voiceChatRoomGuestWidget.LJIIL.LIZIZ(!bool.booleanValue());
            }
        };
        if (!PatchProxy.proxy(new Object[]{this, observer}, voiceChatMuteManager, VoiceChatMuteManager.LIZ, false, 9).isSupported) {
            C106862S5w.LIZ(this, observer);
            voiceChatMuteManager.LJFF.observe(this, observer);
        }
        this.LJJJJZI = new HDJ(this.dataCenter, this.LJFF, this.f26474LJ);
        this.LJJJ = new WeakHandler(this);
        this.LJIIIZ = new HHB(this.LJIILIIL, false, this.dataCenter);
        this.LJJIIZI = new C78833H5v(this.dataCenter, LJJJI());
        this.LJJIIZ = new C80478Hns(this.context, this.LJIILIIL, false, this.dataCenter, this.LJIIIZ, this.LJFF);
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 6).isSupported && this.LJJLIIIJJIZ == null) {
            enableSubWidgetManager();
            this.LJJLIIIJJIZ = new GuestBattleWidget();
            this.subWidgetManager.load(this.LJJLIIIJJIZ);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 7).isSupported && this.LJJLIIIJL == null) {
            enableSubWidgetManager();
            this.LJJLIIIJL = new VoiceTeamFightWidget();
            this.subWidgetManager.load(this.LJJLIIIJL);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 8).isSupported && this.LJJL == null) {
            enableSubWidgetManager();
            this.LJJL = new AudioPaidLinkWidget();
            this.subWidgetManager.load(this.LJJL);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 9).isSupported && this.LJJLIIIJLJLI == null) {
            enableSubWidgetManager();
            this.LJJLIIIJLJLI = new QuickInteractWidget();
            this.subWidgetManager.load(this.LJJLIIIJLJLI);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 10).isSupported && this.LJJLIIIJLLLLLLLZ == null) {
            enableSubWidgetManager();
            this.LJJLIIIJLLLLLLLZ = new VoiceLinkRoomFightWidget();
            this.subWidgetManager.load(this.LJJLIIIJLLLLLLLZ);
        }
        this.LJFF.LIZ();
        enableSubWidgetManager();
        c79189HJn.LIZJ().LIZIZ(this.subWidgetManager);
        this.LJIIIIZZ = new C79188HJm(this.subWidgetManager, null, this.LJIILIIL, false, (FrameLayout) this.containerView, this, this.LJFF, this.context, this.LJJJI, this, this.dataCenter, LJJJI(), null);
        this.LIZLLL.LIZ((ax$a) this);
        this.dataCenter.observe("cmd_open_interact_manage_dialog_by_anchor", this);
        this.dataCenter.observe("cmd_audio_talk_invite", this);
        this.dataCenter.observe("cmd_show_guest_apply_dialog", this);
        this.dataCenter.observe("cmd_operate_interact_media", this);
        this.LJFF.LIZ(this.LJJLIIIJJI);
        H03 h03 = this.LJJJLZIJ;
        C4806x c4806x = this.LJFF;
        if (!PatchProxy.proxy(new Object[]{c4806x}, h03, H03.LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(c4806x);
            c4806x.LIZ(h03);
        }
        LIZ(C79119HGv.class, new Consumer(this) { // from class: X.HEn
            public static ChangeQuickRedirect LIZ;
            public final VoiceChatRoomGuestWidget LIZIZ;

            static {
                Covode.recordClassIndex(30954);
            }

            {
                this.LIZIZ = this;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = this.LIZIZ;
                if (PatchProxy.proxy(new Object[]{obj}, voiceChatRoomGuestWidget, VoiceChatRoomGuestWidget.LIZJ, false, 29).isSupported || voiceChatRoomGuestWidget.LJIIIIZZ == null || !voiceChatRoomGuestWidget.LJJII || voiceChatRoomGuestWidget.LIZLLL.LIZIZ()) {
                    return;
                }
                voiceChatRoomGuestWidget.LJJIJLIJ();
            }
        });
        LIZ(C5986ap.class, new Consumer(this) { // from class: X.HF8
            public static ChangeQuickRedirect LIZ;
            public final VoiceChatRoomGuestWidget LIZIZ;

            static {
                Covode.recordClassIndex(30955);
            }

            {
                this.LIZIZ = this;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = this.LIZIZ;
                C5986ap c5986ap = (C5986ap) obj;
                if (!PatchProxy.proxy(new Object[]{c5986ap}, voiceChatRoomGuestWidget, VoiceChatRoomGuestWidget.LIZJ, false, 31).isSupported) {
                    int i3 = c5986ap.LIZ;
                    if (i3 == 30) {
                        if (voiceChatRoomGuestWidget.LJIIIIZZ != null) {
                            voiceChatRoomGuestWidget.LJIIIIZZ.LIZLLL(true);
                        }
                    } else if (i3 != 31 || voiceChatRoomGuestWidget.LJIIIIZZ == null) {
                    } else {
                        voiceChatRoomGuestWidget.LJIIIIZZ.LIZLLL(false);
                    }
                }
            }
        });
        LIZ(C5987ar.class, new Consumer(this) { // from class: X.HFL
            public static ChangeQuickRedirect LIZ;
            public final VoiceChatRoomGuestWidget LIZIZ;

            static {
                Covode.recordClassIndex(30956);
            }

            {
                this.LIZIZ = this;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = this.LIZIZ;
                C5987ar c5987ar = (C5987ar) obj;
                if (PatchProxy.proxy(new Object[]{c5987ar}, voiceChatRoomGuestWidget, VoiceChatRoomGuestWidget.LIZJ, false, 32).isSupported || voiceChatRoomGuestWidget.LJIIIIZZ == null) {
                    return;
                }
                voiceChatRoomGuestWidget.LJIIIIZZ.LIZJ(c5987ar.LIZIZ);
            }
        });
        LIZ(C4269g.class, new Consumer(this) { // from class: X.HEs
            public static ChangeQuickRedirect LIZ;
            public final VoiceChatRoomGuestWidget LIZIZ;

            static {
                Covode.recordClassIndex(30957);
            }

            {
                this.LIZIZ = this;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = this.LIZIZ;
                C4269g c4269g = (C4269g) obj;
                if (PatchProxy.proxy(new Object[]{c4269g}, voiceChatRoomGuestWidget, VoiceChatRoomGuestWidget.LIZJ, false, 30).isSupported || c4269g.LIZ != 1 || !voiceChatRoomGuestWidget.LJIILIIL().LIZIZ() || voiceChatRoomGuestWidget.LJIIIIZZ == null) {
                    return;
                }
                voiceChatRoomGuestWidget.LJIIIIZZ.LIZ(c4269g);
            }
        });
        ((ILiveSDKService) ServiceManager.getService(ILiveSDKService.class)).getAudienceThemeManager().LIZ(this, new Observer(this) { // from class: X.HFO
            public static ChangeQuickRedirect LIZ;
            public final VoiceChatRoomGuestWidget LIZIZ;

            static {
                Covode.recordClassIndex(30958);
            }

            {
                this.LIZIZ = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = this.LIZIZ;
                VoiceLiveTheme voiceLiveTheme = (VoiceLiveTheme) obj;
                if (PatchProxy.proxy(new Object[]{voiceLiveTheme}, voiceChatRoomGuestWidget, VoiceChatRoomGuestWidget.LIZJ, false, MediaPlayer.MEDIA_PLAYER_OPTION_ABR_STREAM_INFO).isSupported || voiceLiveTheme == null) {
                    return;
                }
                voiceChatRoomGuestWidget.LJIIIIZZ.LIZ(voiceLiveTheme, 2);
            }
        }, 2);
        ((ILiveSDKService) ServiceManager.getService(ILiveSDKService.class)).getAudienceThemeManager().LIZ(this, new Observer(this) { // from class: X.HFP
            public static ChangeQuickRedirect LIZ;
            public final VoiceChatRoomGuestWidget LIZIZ;

            static {
                Covode.recordClassIndex(30962);
            }

            {
                this.LIZIZ = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = this.LIZIZ;
                VoiceLiveTheme voiceLiveTheme = (VoiceLiveTheme) obj;
                if (PatchProxy.proxy(new Object[]{voiceLiveTheme}, voiceChatRoomGuestWidget, VoiceChatRoomGuestWidget.LIZJ, false, 146).isSupported || voiceLiveTheme == null) {
                    return;
                }
                voiceChatRoomGuestWidget.LJIIIIZZ.LIZ(voiceLiveTheme, 1);
            }
        }, 1);
        C79046HEa.LIZ().LJII.observe(this, new Observer<Boolean>(this) { // from class: com.bytedance.android.live.liveinteract.voicechat.VoiceChatRoomGuestWidget.2
            public static ChangeQuickRedirect LIZ;
            public boolean LIZIZ;

            static {
                Covode.recordClassIndex(30840);
            }

            @Override // androidx.lifecycle.Observer
            public final /* synthetic */ void onChanged(Boolean bool) {
                Boolean bool2 = bool;
                if (!PatchProxy.proxy(new Object[]{bool2}, this, LIZ, false, 1).isSupported && bool2 != null && this.LIZIZ != bool2.booleanValue()) {
                    this.LIZIZ = bool2.booleanValue();
                    if (this.LIZIZ && LiveSettingKeys.LIVE_VOICE_CHAT_AUDIENCE_SHOW_PRE_ONLINE.getValue().booleanValue() && !PatchProxy.proxy(new Object[0], null, C78828H5q.LIZ, true, 139).isSupported) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("live_type", "voice_live");
                        linkedHashMap.put("function_type", "party");
                        linkedHashMap.put("seat_fit_status", "off");
                        C4574547f.LIZ().LIZ("livesdk_guest_connection_pre_link_show", linkedHashMap, Room.class, C8668v.class);
                    }
                }
            }
        });
        C4806x c4806x2 = this.LJFF;
        if (c4806x2 != null) {
            this.LJJIJIIJI = new HD9(c4806x2);
        }
        if (LiveSettingKeys.INTERACT_ACTIVITY_PERMISSION_GUARANTOR_ENABLE.getValue().booleanValue() && (getContext() instanceof FragmentActivity)) {
            LJJJJ().LIZ((FragmentActivity) getContext());
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null) {
            C2WC<Boolean> currentIsSinger = ((IKtvService) ServiceManager.getService(IKtvService.class)).getCurrentIsSinger();
            if (currentIsSinger != null) {
                this.LJJJLIIL.add(currentIsSinger.LIZIZ().subscribe(new Consumer(this) { // from class: X.HCt
                    public static ChangeQuickRedirect LIZ;
                    public final VoiceChatRoomGuestWidget LIZIZ;

                    static {
                        Covode.recordClassIndex(30926);
                    }

                    {
                        this.LIZIZ = this;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        Client client;
                        boolean z = true;
                        if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = this.LIZIZ;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, voiceChatRoomGuestWidget, VoiceChatRoomGuestWidget.LIZJ, false, 21).isSupported) {
                            return;
                        }
                        ALogger.m15797i("voice_chat", "onIsSingerChanged " + booleanValue + " mute=" + voiceChatRoomGuestWidget.f26474LJ.m15663LJ() + " shouldRestore=" + voiceChatRoomGuestWidget.LJJIIJ + " isResumed=" + voiceChatRoomGuestWidget.LJJII + " rtcOn=" + voiceChatRoomGuestWidget.LJIIJ());
                        if (!voiceChatRoomGuestWidget.LJIIJ()) {
                            return;
                        }
                        if (booleanValue) {
                            if (voiceChatRoomGuestWidget.f26474LJ.m15663LJ() && voiceChatRoomGuestWidget.LJJII) {
                                voiceChatRoomGuestWidget.f26474LJ.LIZ(true, null);
                                voiceChatRoomGuestWidget.LJJIIJ = true;
                            } else {
                                voiceChatRoomGuestWidget.LJJIIJ = false;
                            }
                            if (HHG.LIZ(voiceChatRoomGuestWidget.LJIILIIL)) {
                                HHB hhb = voiceChatRoomGuestWidget.LJIIIZ;
                                if (!PatchProxy.proxy(new Object[]{"become singer"}, hhb, HHB.LIZ, false, 25).isSupported && (client = hhb.LIZJ) != null) {
                                    client.muteLocalVideo(false);
                                    String str2 = hhb.LJJ;
                                    ALogger.m15797i(str2, "unMuteLocalVideo become singer");
                                    HH8 hh8 = HH8.LIZIZ;
                                    C79007HCn c79007HCn = hhb.f6723LJ;
                                    Intrinsics.checkNotNullExpressionValue(c79007HCn, "");
                                    hh8.LIZIZ(c79007HCn, "become singer");
                                }
                            }
                            if (voiceChatRoomGuestWidget.LJIIJ == null) {
                                return;
                            }
                            KtvSingMode LIZIZ = H99.LIZIZ();
                            ALogger.m15797i("ttlive_link_rtc", "ktv singer startVideoCapture singMode:" + LIZIZ);
                            voiceChatRoomGuestWidget.LJIIJ.LJI();
                            HHB hhb2 = voiceChatRoomGuestWidget.LJIIIZ;
                            if (LIZIZ == KtvSingMode.AUDIO) {
                                z = false;
                            }
                            hhb2.LIZIZ(z, "guestBecomeSinger " + LIZIZ);
                            return;
                        }
                        if (voiceChatRoomGuestWidget.LJJIIJ) {
                            if (((Integer) C79046HEa.LIZ().LJJIIZI).intValue() == 2) {
                                voiceChatRoomGuestWidget.f26474LJ.LJI();
                                if (!voiceChatRoomGuestWidget.LJJII) {
                                    voiceChatRoomGuestWidget.dataCenter.put("data_talk_room_capture_audio_notification_show_state", Boolean.FALSE);
                                }
                            }
                            voiceChatRoomGuestWidget.LJJIIJ = false;
                        }
                        if (HHG.LIZ(voiceChatRoomGuestWidget.LJIILIIL)) {
                            voiceChatRoomGuestWidget.LJIIIZ.LIZIZ("song end");
                        }
                        if (voiceChatRoomGuestWidget.LJIIJ == null) {
                            return;
                        }
                        ALogger.m15797i("ttlive_link_rtc", "ktv not singer stopVideoCapture");
                        voiceChatRoomGuestWidget.LJIIJ.LJII();
                    }
                }));
            }
            if (LJJJI.LJJLL().LIZIZ() != null) {
                this.LJJJLIIL.add(LJJJI.LJJLL().LIZIZ().LIZIZ().subscribe(new Consumer(this) { // from class: X.HCg
                    public static ChangeQuickRedirect LIZ;
                    public final VoiceChatRoomGuestWidget LIZIZ;

                    static {
                        Covode.recordClassIndex(30927);
                    }

                    {
                        this.LIZIZ = this;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:122:0x0456, code lost:
                        if (r3 == 16) goto L123;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:100:0x01f3  */
                    /* JADX WARN: Removed duplicated region for block: B:101:0x0205  */
                    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
                    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
                    /* JADX WARN: Removed duplicated region for block: B:49:0x013c  */
                    /* JADX WARN: Removed duplicated region for block: B:93:0x01dd  */
                    /* JADX WARN: Removed duplicated region for block: B:96:0x01eb  */
                    /* JADX WARN: Type inference failed for: r0v108, types: [byte, boolean] */
                    /* JADX WARN: Type inference failed for: r0v110, types: [byte, boolean] */
                    /* JADX WARN: Type inference failed for: r0v111, types: [byte, boolean] */
                    /* JADX WARN: Type inference failed for: r0v112, types: [byte, boolean] */
                    /* JADX WARN: Type inference failed for: r26v0, types: [byte, boolean] */
                    @Override // io.reactivex.functions.Consumer
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void accept(java.lang.Object r44) {
                        /*
                            Method dump skipped, instructions count: 1213
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p003X.C79000HCg.accept(java.lang.Object):void");
                    }
                }));
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 2).isSupported) {
            C5173e c5173e = (C5173e) this.dataCenter.get("data_room_enter_info");
            if (this.LJIILIIL != null && c5173e != null && c5173e.LJFF == this.LJIILIIL.getRoomId() && LJJJI() != null && LJJJI().LJJLL().LIZIZ() != null) {
                LJJJI().LJJLL().LIZIZ().LIZ(new C6306l(c5173e.LIZJ, c5173e.LIZLLL, false, false));
            }
        }
        if (LJIIJJI()) {
            this.LJJIIZI.LIZ();
        }
        if (!LJIIJJI() || (LJIIJJI() && LiveSettingKeys.FASTMATCH_OPTIMIZE_V2_ENABLE.getValue().LIZ())) {
            LJJIIZI();
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 12).isSupported) {
            C78536Gxe.LIZ().LJIIJ();
            AbstractC8644i LIZ3 = C4574547f.LIZ().LIZ(C8668v.class);
            if (LIZ3 instanceof C81173Hz5) {
                C81173Hz5 c81173Hz5 = (C81173Hz5) LIZ3;
                String str2 = c81173Hz5.LJIILIIL;
                if (!TextUtils.isEmpty(str2)) {
                    this.LJIJJLI = str2;
                }
                if (TextUtils.isEmpty(this.LJIJJLI)) {
                    str = String.valueOf(C78832H5u.LJFF);
                } else {
                    str = this.LJIJJLI;
                }
                String str3 = c81173Hz5.LIZLLL;
                int i3 = c81173Hz5.LJIIL;
                if (str3 != null && TextUtils.equals(str3, "true")) {
                    ALogger.m15795w("ttlive_link", "voice_auto_apply from " + this.LJIJJLI + " " + i3);
                    if (LJIIJJI()) {
                        if (i3 > 0) {
                            i2 = i3;
                        } else {
                            i2 = LinkApplyType.CITYSONG.value;
                        }
                        LIZ(-1, str, i2, "voice_auto_apply");
                    } else {
                        if (i3 > 0) {
                            i = i3;
                        } else {
                            i = LinkApplyType.CITY.value;
                        }
                        LIZ(-1, str, i, "voice_auto_apply");
                    }
                }
                if (TextUtils.equals(c81173Hz5.LJIIIZ, "true")) {
                    ALogger.m15795w("ttlive_link", "voice_auto_linkmic from " + this.LJIJJLI + " " + i3);
                    this.LJJJLL = true;
                    if (LJIIJJI()) {
                        if (i3 <= 0) {
                            i3 = LinkApplyType.NORMAL.value;
                        }
                        LIZ(-1, str, i3, "voice_auto_linkmic");
                    } else {
                        if (i3 <= 0) {
                            i3 = LinkApplyType.STRONG_REACH.value;
                        }
                        LIZ(-1, str, i3, "voice_auto_linkmic");
                    }
                }
            }
        }
        C2WC<Boolean> hasBgm = ((IKtvService) ServiceManager.getService(IKtvService.class)).getHasBgm();
        if (hasBgm != null) {
            this.LJJJLIIL.add(hasBgm.LIZIZ().subscribe(new Consumer(this) { // from class: X.HFW
                public static ChangeQuickRedirect LIZ;
                public final VoiceChatRoomGuestWidget LIZIZ;

                static {
                    Covode.recordClassIndex(30928);
                }

                {
                    this.LIZIZ = this;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = this.LIZIZ;
                    Boolean bool = (Boolean) obj;
                    if (PatchProxy.proxy(new Object[]{bool}, voiceChatRoomGuestWidget, VoiceChatRoomGuestWidget.LIZJ, false, 145).isSupported) {
                        return;
                    }
                    voiceChatRoomGuestWidget.LJIILJJIL().LIZIZ(bool.booleanValue());
                }
            }));
        }
        if (LiveSettingKeys.RELEASE_AV_PERMISSION_WHEN_CLOSE_NOTIFICATION_ON_BACKGROUND.getValue().booleanValue() && C5923dp.LLLLII() != null && C5923dp.LLLLII().LJJJJZI() != null) {
            this.LJJJLIIL.add(QB4.LIZ(C5923dp.LLLLII().LJJJJZI().LIZIZ(), "voice_chat_guest_context", new Function1(this) { // from class: X.HCz
                public static ChangeQuickRedirect LIZ;
                public final VoiceChatRoomGuestWidget LIZIZ;

                static {
                    Covode.recordClassIndex(30929);
                }

                {
                    this.LIZIZ = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1);
                    if (proxy.isSupported) {
                        return proxy.result;
                    }
                    VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = this.LIZIZ;
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj}, voiceChatRoomGuestWidget, VoiceChatRoomGuestWidget.LIZJ, false, 144);
                    if (proxy2.isSupported) {
                        return proxy2.result;
                    }
                    voiceChatRoomGuestWidget.LIZ(true, HCD.LIZ);
                    if (voiceChatRoomGuestWidget.f26474LJ.LJFF() == 0) {
                        voiceChatRoomGuestWidget.LJFF.LIZ(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ(), C79007HCn.LJII().LIZLLL, 3);
                        voiceChatRoomGuestWidget.f26474LJ.LIZ("onPause");
                    }
                    if (C4382d.LIZLLL.LIZ() != null && C4382d.LIZLLL.LIZ().LIZ().LIZ().type == KtvSingMode.VIDEO.type) {
                        AbstractC5003c.LIZ.LIZ().LJIILIIL().LIZ(C80374HmC.LJFF);
                    }
                    return Unit.INSTANCE;
                }
            }));
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 3).isSupported && (iKtvService = (IKtvService) ServiceManager.getService(IKtvService.class)) != null && (ktvPlayModeChangedObservable = iKtvService.getKtvPlayModeChangedObservable()) != null) {
            this.LJJJLIIL.add(ktvPlayModeChangedObservable.LIZIZ().subscribe(new Consumer(this) { // from class: X.HEd
                public static ChangeQuickRedirect LIZ;
                public final VoiceChatRoomGuestWidget LIZIZ;

                static {
                    Covode.recordClassIndex(30930);
                }

                {
                    this.LIZIZ = this;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = this.LIZIZ;
                    if (PatchProxy.proxy(new Object[]{obj}, voiceChatRoomGuestWidget, VoiceChatRoomGuestWidget.LIZJ, false, 143).isSupported) {
                        return;
                    }
                    voiceChatRoomGuestWidget.LJIIIZ.LIZ(((IInteractService) ServiceManager.getService(IInteractService.class)).getCurrentScene(), "ktvPlayModeChanged");
                }
            }));
        }
        C78828H5q.LJI();
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final void LIZ(AbstractC78116Gqs abstractC78116Gqs) {
        this.LJJJJZ = abstractC78116Gqs;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    public final void LIZ(C77681Gjr c77681Gjr) {
        if (PatchProxy.proxy(new Object[]{c77681Gjr}, this, LIZJ, false, 84).isSupported) {
            return;
        }
        C77679Gjp.LIZJ.LIZ(this.context, c77681Gjr);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZJ, false, 48).isSupported) {
            return;
        }
        this.LJIIIIZZ.LIZIZ(i);
    }

    public final void LJI(String str) {
        C79188HJm c79188HJm;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 34).isSupported && (c79188HJm = this.LJIIIIZZ) != null) {
            c79188HJm.LIZ(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.BaseVoiceChatWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: d_ */
    public final void mo15658d_(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 74).isSupported) {
            return;
        }
        ALogger.m15795w("voice_chat", C0002O.m25086C("onWarn: ", str));
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (PatchProxy.proxy(new Object[]{message}, this, LIZJ, false, 43).isSupported) {
            return;
        }
        isViewValid();
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    /* renamed from: LJ */
    public final void mo15656LJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 59).isSupported) {
            return;
        }
        C88440Kt0.LIZ(LK5.LIZ(2131585493, LinkPlayerInfo.LIZ(str)));
        C79188HJm c79188HJm = this.LJIIIIZZ;
        if (c79188HJm != null) {
            c79188HJm.LIZIZ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    public final void LJFF(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 60).isSupported || !isViewValid() || str == "paid_change") {
            return;
        }
        this.LJJIII = false;
        C79007HCn.LJII().LJIJI = "";
        C88440Kt0.LIZIZ(2131584550, 0);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    /* renamed from: f_ */
    public final void mo15650f_(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZJ, false, 118).isSupported) {
            return;
        }
        new C78837H5z(this.LJIILIIL).LIZ(false, i);
    }

    public VoiceChatRoomGuestWidget(AbstractC6071r abstractC6071r) {
        this.LJJJI = abstractC6071r;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final void LIZLLL(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 49).isSupported) {
            return;
        }
        if (C77917Gnf.LIZ(this.LJIILIIL)) {
            this.LJIIIIZZ.LIZ((C9605p) null, str);
            return;
        }
        ChatMatchWidget chatMatchWidget = this.LJJIJIL;
        if (chatMatchWidget != null) {
            chatMatchWidget.LIZ(null, null, false, false, "", Boolean.FALSE);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    /* renamed from: LJ */
    public final void mo15655LJ(Throwable th) {
        if (!PatchProxy.proxy(new Object[]{th}, this, LIZJ, false, 42).isSupported && isViewValid() && (th instanceof ApiServerException)) {
            C88440Kt0.LIZ(((ApiServerException) th).mPrompt);
        }
    }

    private boolean LIZ(LinkMicGuideMessage.C8701a c8701a) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c8701a}, this, LIZJ, false, 81);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        for (LinkMicGuideMessage.C8702b c8702b : c8701a.LIZ) {
            if (c8702b != null && !TextUtils.isEmpty(c8702b.LIZ)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (r7 != 4) goto L20;
     */
    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZJ(int r7) {
        /*
            r6 = this;
            r3 = 1
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r4 = 0
            r2[r4] = r0
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.voicechat.VoiceChatRoomGuestWidget.LIZJ
            r0 = 68
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r6, r1, r4, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L17
            return
        L17:
            boolean r0 = r6.isViewValid()
            if (r0 != 0) goto L1e
            return
        L1e:
            boolean r0 = r6.LJIIJ()
            if (r0 == 0) goto L48
            com.bytedance.android.live.pushstream.a r0 = r6.LJIIJ
            if (r0 == 0) goto L48
            if (r7 == 0) goto L7c
            if (r7 == r3) goto L65
            r0 = 2
            if (r7 == r0) goto L65
            r5 = 3
            if (r7 == r5) goto L49
            r0 = 4
            if (r7 == r0) goto L65
        L35:
            r1 = r4 ^ 1
            com.bytedance.android.live.liveinteract.voicechat.VoiceChatMuteManager r0 = r6.f26474LJ
            r0.LIZIZ(r1)
            java.lang.String r0 = "silence message"
            r6.LIZ(r1, r0)
            X.3oi r0 = r6.LJIIL
            if (r0 == 0) goto L48
            r0.LIZIZ(r4)
        L48:
            return
        L49:
            com.bytedance.android.live.liveinteract.plantform.core.x r3 = r6.LJFF
            java.lang.Class<com.bytedance.android.live.user.IUserService> r0 = com.bytedance.android.live.user.IUserService.class
            com.bytedance.android.live.base.IService r0 = com.bytedance.android.live.utility.ServiceManager.getService(r0)
            com.bytedance.android.live.user.IUserService r0 = (com.bytedance.android.live.user.IUserService) r0
            X.3VF r0 = r0.user()
            long r1 = r0.LIZIZ()
            X.HCn r0 = p003X.C79007HCn.LJII()
            java.lang.String r0 = r0.LIZLLL
            r3.LIZ(r1, r0, r5)
            goto L35
        L65:
            r0 = 2131585611(0x7f0d6a4b, float:1.8797305E38)
            p003X.C88440Kt0.LIZ(r0)
            boolean r0 = r6.LJJII
            if (r0 != 0) goto L35
            p003X.HH8.LJI()
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r6.dataCenter
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r0 = "data_talk_room_capture_audio_notification_show_state"
            r2.put(r0, r1)
            goto L35
        L7c:
            r0 = 2131585645(0x7f0d6a6d, float:1.8797374E38)
            p003X.C88440Kt0.LIZ(r0)
            r4 = 1
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.voicechat.VoiceChatRoomGuestWidget.LIZJ(int):void");
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    public final void LIZLLL(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZJ, false, 66).isSupported || !isViewValid()) {
            return;
        }
        if (this.LJIJJ) {
            C88440Kt0.LIZ(2131585448);
        } else {
            C88469KtT.LIZ(this.context, th);
        }
    }

    private void LJII(String str) {
        String obj;
        String obj2;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 54).isSupported) {
            return;
        }
        String str2 = LiveSettingKeys.LINK_PAYMENT_CONFIG.getValue().f27217LJ;
        AbstractC8644i LIZ = C4574547f.LIZ().LIZ(C8668v.class);
        String str3 = "";
        if (LIZ.LIZ().get("enter_from_merge") == null) {
            obj = str3;
        } else {
            obj = LIZ.LIZ().get("enter_from_merge").toString();
        }
        if (LIZ.LIZ().get("enter_method") == null) {
            obj2 = str3;
        } else {
            obj2 = LIZ.LIZ().get("enter_method").toString();
        }
        if (LIZ.LIZ().get("action_type") != null) {
            str3 = LIZ.LIZ().get("action_type").toString();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("service_provider_id", String.valueOf(this.LJIILIIL.ownerUserId));
        hashMap.put("service_order_id", this.LJJJZ);
        hashMap.put("room_id", String.valueOf(this.LJIILIIL.getId()));
        hashMap.put("anchor_id", String.valueOf(this.LJIILIIL.ownerUserId));
        hashMap.put("live_type", "voice_live");
        hashMap.put("enter_from_merge", obj);
        hashMap.put("enter_method", obj2);
        hashMap.put("action_type", str3);
        C78828H5q.LIZLLL(hashMap);
        hashMap.put("connection_time", this.LJJLI);
        hashMap.put("connection_cost", this.LJJLIIIIJ);
        hashMap.put("limited_time", String.valueOf(C4284f.LIZJ().LIZJ));
        hashMap.put("play_mode", "rechargeable_normal");
        String LIZIZ = C414642b4.LIZIZ(str2, hashMap);
        ALogger.m15797i("ttlive_link_paid", C0002O.m25084C("showPaidLinkCommentDialog from=", str, " commentSchema=", LIZIZ));
        ((ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class)).handle(this.context, LIZIZ);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    public final void LIZIZ(C6094ae c6094ae) {
        if (PatchProxy.proxy(new Object[]{c6094ae}, this, LIZJ, false, 67).isSupported) {
            return;
        }
        C79188HJm c79188HJm = this.LJIIIIZZ;
        if (c79188HJm != null) {
            c79188HJm.m23757LJ();
        }
        ChatMatchWidget chatMatchWidget = this.LJJIJIL;
        if (chatMatchWidget != null) {
            chatMatchWidget.LIZJ();
        }
        if (this.LJFF != null && LiveSettingKeys.LIST_USER_VERSION_CONFIG.getValue().LJI) {
            this.LJFF.LIZ(c6094ae);
        }
        JSONArray jSONArray = new JSONArray();
        this.LJJJZ = c6094ae.LIZJ;
        jSONArray.put(7);
        ((KDS) ((LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class)).getAudienceSettings(jSONArray.toString(), this.LJIILIIL.getId()).compose(C100839PnV.LIZJ()).m149as(autoDispose())).LIZ(C77956GoI.LIZIZ, C79101HGd.LIZ);
        ((AbstractC81278I1w) ((LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class)).fetchInteractEntrances(this.LJIILIIL.getRoomId(), 0L).compose(C100839PnV.LIZJ()).m151as(autoDispose())).LIZ(H1Q.LIZIZ, C79102HGe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZJ(com.bytedance.android.livesdk.message.model.C8854es r9) {
        /*
            r8 = this;
            r4 = 1
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r3 = 0
            r2[r3] = r9
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.voicechat.VoiceChatRoomGuestWidget.LIZJ
            r0 = 40
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r8, r1, r3, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L13
            return
        L13:
            X.HAq r0 = r8.LJJIJLIJ
            if (r0 == 0) goto L1e
            boolean r0 = r0.LJIILIIL()
            if (r0 == 0) goto L1e
            return
        L1e:
            if (r9 == 0) goto L98
            com.bytedance.android.live.liveinteract.plantform.model.GameInviteInfo r0 = r9.LJJLIIIJ
            if (r0 == 0) goto L8b
            com.bytedance.android.live.liveinteract.plantform.model.GameInviteInfo r0 = r9.LJJLIIIJ
            boolean r0 = r0.isGameInvite()
            if (r0 == 0) goto L8b
            java.lang.String r0 = "game_invite"
            r8.LJJI = r0
        L30:
            X.Gxf r0 = p003X.C78536Gxe.LIZ()
            r0.LJIIJ()
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r8.LJIILIIL
            r7 = 2
            java.lang.Object[] r6 = new java.lang.Object[r7]
            r6[r3] = r5
            r6[r4] = r9
            r2 = 0
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = p003X.C78958HAq.LIZ
            r0 = 13
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r6, r2, r1, r4, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L69
            java.lang.Object r0 = r1.result
        L4f:
            X.HAq r0 = (p003X.C78958HAq) r0
        L51:
            r8.LJJIJLIJ = r0
            X.HKE r1 = p003X.HKE.LIZIZ
            android.content.Context r0 = r8.context
            androidx.fragment.app.FragmentActivity r0 = r1.LIZ(r0)
            if (r0 == 0) goto L68
            X.HAq r2 = r8.LJJIJLIJ
            androidx.fragment.app.FragmentManager r1 = r0.getSupportFragmentManager()
            java.lang.String r0 = "AudioTalkBeInvitedDialog"
            r2.show(r1, r0)
        L68:
            return
        L69:
            X.HAv r2 = p003X.C78958HAq.LJIIJ
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r3] = r5
            r1[r4] = r9
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = p003X.C78963HAv.LIZ
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r2, r0, r3, r4)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r1.result
            goto L4f
        L7e:
            p003X.C106862S5w.LIZ(r5, r9)
            X.HAq r0 = new X.HAq
            r0.<init>()
            r0.f6640LJ = r5
            r0.LJFF = r9
            goto L51
        L8b:
            com.bytedance.android.live.liveinteract.plantform.model.MessageBoardInfo r0 = r9.LJJLIIIJL
            if (r0 == 0) goto L98
            java.lang.String r0 = "gift_message_invite"
            r8.LJJI = r0
            com.bytedance.android.live.liveinteract.plantform.model.MessageBoardInfo r0 = r9.LJJLIIIJL
            r8.LJJLIIIJILLIZJL = r0
            goto L30
        L98:
            java.lang.String r0 = "invite"
            r8.LJJI = r0
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.voicechat.VoiceChatRoomGuestWidget.LIZJ(com.bytedance.android.livesdk.message.model.es):void");
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.toolbar.a$b
    public final void LIZLLL(int i) {
        final C79188HJm c79188HJm;
        boolean z = false;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZJ, false, 85).isSupported && (c79188HJm = this.LJIIIIZZ) != null && !PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, c79188HJm, C79188HJm.LIZ, false, 27).isSupported && !c79188HJm.LJIIIIZZ) {
            if (((IUserService) ServiceManager.getService(IUserService.class)).user().LJI()) {
                c79188HJm.LIZ(false, "bottom", -1);
            } else if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        LinkPlayerInfo LIZIZ = c79188HJm.LJFF.LIZIZ(c79188HJm.LJIIJJI(), C79007HCn.LJII().LIZLLL);
                        if (LIZIZ != null) {
                            DataCenter dataCenter = c79188HJm.LJIIIZ;
                            if (LIZIZ.LJIIL != 0) {
                                z = true;
                            }
                            dataCenter.put("data_self_is_silenced", Boolean.valueOf(z));
                        }
                        if (((IInteractService) ServiceManager.getService(IInteractService.class)).isEnableTalkRoomEmoji()) {
                            c79188HJm.f6740LJ = new H05().LIZ(c79188HJm.LIZIZ).LIZ(c79188HJm.LJIIIZ).LIZ(true).LIZ("bottom").LIZIZ();
                            C116971W2r.LIZJ(c79188HJm.f6740LJ);
                        } else if (LIZIZ != null) {
                            View$OnClickListenerC78717H1j view$OnClickListenerC78717H1j = new View$OnClickListenerC78717H1j(c79188HJm.LIZIZ, c79188HJm.LJIIIZ, LIZIZ, c79188HJm.LJIIIIZZ);
                            view$OnClickListenerC78717H1j.LIZ("bottom");
                            c79188HJm.LIZLLL = view$OnClickListenerC78717H1j;
                            C116971W2r.LIZJ(c79188HJm.LIZLLL);
                        } else {
                            ALogger.m15800e("ttlive_link", "try show dialog when user info is null");
                        }
                    }
                } else if (C5056a.LJIILL()) {
                    c79188HJm.LIZJ();
                } else if (C77919Gnh.LIZ(c79188HJm.LJI)) {
                    C116971W2r.LIZJ(new DialogC77887GnB(c79188HJm.LIZIZ, c79188HJm.LJIIIZ, new AbstractC77890GnE(c79188HJm) { // from class: X.HG2
                        public static ChangeQuickRedirect LIZ;
                        public final C79188HJm LIZIZ;

                        static {
                            Covode.recordClassIndex(31923);
                        }

                        {
                            this.LIZIZ = c79188HJm;
                        }

                        @Override // p003X.AbstractC77890GnE
                        public final void LIZ() {
                            if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            C79188HJm c79188HJm2 = this.LIZIZ;
                            if (PatchProxy.proxy(new Object[0], c79188HJm2, C79188HJm.LIZ, false, 60).isSupported) {
                                return;
                            }
                            c79188HJm2.LIZIZ(true);
                        }
                    }));
                } else if (C77917Gnf.LIZ(c79188HJm.LJI)) {
                    if (((IUserService) ServiceManager.getService(IUserService.class)).user().LJI()) {
                        c79188HJm.LIZ(false, "bottom", -1);
                    } else {
                        c79188HJm.LIZ((C9605p) null, "bottom");
                    }
                } else if (C77919Gnh.LIZ()) {
                    c79188HJm.LIZIZ(false);
                } else {
                    C116971W2r.LIZJ(new View$OnClickListenerC77779GlR(c79188HJm.LIZIZ, c79188HJm.LJIIIZ, c79188HJm.LJI));
                }
            } else {
                c79188HJm.LIZ(-1, C78832H5u.LIZJ, "guest_tool_bar_click");
            }
        }
    }

    @Override // androidx.lifecycle.Observer
    public /* synthetic */ void onChanged(KVData kVData) {
        MediaOperation mediaOperation;
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZJ, false, 80).isSupported && isViewValid() && kVData2 != null && !TextUtils.isEmpty(kVData2.getKey()) && kVData2.getData() != null) {
            String key = kVData2.getKey();
            if (key.equals("cmd_open_interact_manage_dialog_by_anchor")) {
                if (C79242HLo.LJII() && C79046HEa.LIZ().LIZJ()) {
                    LinkPlayerInfo LIZ = this.LJFF.LIZ(this.LJIILIIL.getOwnerUserId(), "");
                    if (LIZ != null) {
                        C116971W2r.LIZJ(H0W.LIZ(this.context, this.dataCenter, LIZ, "seat"));
                        return;
                    }
                    return;
                }
                C87010KQi LIZ2 = C87010KQi.LIZ();
                UserProfileEvent userProfileEvent = new UserProfileEvent(this.LJIILIIL.getOwner());
                userProfileEvent.setReportType("data_card_linked_anchor");
                LIZ2.LIZ(userProfileEvent);
            } else if (key.equals("cmd_audio_talk_invite")) {
                if (((IUserService) ServiceManager.getService(IUserService.class)).user().LJI()) {
                    User user = (User) kVData2.getData();
                    LIZ(new HAA(this.LJIILIIL, user, -1));
                    C78828H5q.LIZ("administrator", user.getId(), "card", -1);
                    return;
                }
                if (((IUserService) ServiceManager.getService(IUserService.class)).user().mo22927LJ()) {
                    C88440Kt0.LIZ(2131581829);
                } else {
                    C88440Kt0.LIZ(2131583931);
                }
                HH8.LIZ(TalkRoomOperate.INVITE);
            } else if (key.equals("cmd_show_guest_apply_dialog")) {
                if (((Boolean) kVData2.getData()).booleanValue()) {
                    this.LJIIIIZZ.LIZ((C9605p) null, (String) null);
                }
            } else if (key.equals("cmd_operate_interact_media") && (mediaOperation = (MediaOperation) kVData2.getData()) != null && mediaOperation.LIZ == MediaOperation.Type.MIC) {
                int i = C49976.LIZ[mediaOperation.LIZIZ.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        this.f26474LJ.LIZ(false, mediaOperation.LIZJ);
                        return;
                    }
                    return;
                }
                this.f26474LJ.LIZ(mediaOperation.LIZJ);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    public final void LIZIZ(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LIZJ, false, 65).isSupported) {
            return;
        }
        if (ServiceManager.getService(IInteractService.class) != null && ServiceManager.getService(IUserService.class) != null && ((IUserService) ServiceManager.getService(IUserService.class)).user() != null && ((IInteractService) ServiceManager.getService(IInteractService.class)).isAnonymousUser(Long.valueOf(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ()))) {
            C88440Kt0.LIZ(LK5.LIZ(2131585438));
        } else {
            C88440Kt0.LIZ(2131585949);
        }
        this.LJJJJL = false;
        if (isViewValid() && !this.LJJII) {
            LIZ(true, "kicked out");
            this.dataCenter.put("data_talk_room_capture_audio_notification_show_state", Boolean.FALSE);
        }
        if (c8854es.LJJJLZIJ == 1) {
            LJII("kickout");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    public final void LIZJ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZJ, false, 57).isSupported || !isViewValid()) {
            return;
        }
        this.LJJJJL = true;
        C88469KtT.LIZ(getContext(), th, 2131585599);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    public final void LIZIZ(C8874fl c8874fl) {
        if (!PatchProxy.proxy(new Object[]{c8874fl}, this, LIZJ, false, 56).isSupported && c8874fl.LJIIJJI != null) {
            this.LJJLI = String.valueOf(c8874fl.LJIIJJI.LIZJ);
            this.LJJLIIIIJ = String.valueOf(c8874fl.LJIIJJI.LIZIZ);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.p395wm.AbstractC5142y
    /* renamed from: a_ */
    public final void mo15635a_(String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZJ, false, 119).isSupported) {
            return;
        }
        this.LJIIIZ.LIZ(str, z);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.BaseVoiceChatWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZIZ(long j, Exception exc) {
        C78998HCe c78998HCe;
        if (!PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LIZJ, false, 73).isSupported && (c78998HCe = this.LIZLLL) != null) {
            c78998HCe.LJIIJJI = false;
            c78998HCe.LJIIIIZZ = false;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.BaseVoiceChatWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZJ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LIZJ, false, 75).isSupported) {
            return;
        }
        C88440Kt0.LIZ(2131585643);
        C78998HCe c78998HCe = this.LIZLLL;
        if (!PatchProxy.proxy(new Object[0], c78998HCe, C78998HCe.LIZ, false, 11).isSupported) {
            c78998HCe.LJIIIZ = true;
            c78998HCe.LJIIJJI = false;
            c78998HCe.LIZ("leave_on_rtc_error");
        }
    }

    private <T> void LIZ(Class<T> cls, Consumer<T> consumer) {
        if (PatchProxy.proxy(new Object[]{cls, consumer}, this, LIZJ, false, 33).isSupported) {
            return;
        }
        ((AbstractC81278I1w) C87010KQi.LIZ().LIZ((Class) cls).observeOn(AndroidSchedulers.mainThread()).m151as(C148062fT6.LIZ(this))).LIZ(consumer);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final void LIZIZ(long j, String str) {
        C4806x c4806x;
        if (!PatchProxy.proxy(new Object[]{new Long(j), str}, this, LIZJ, false, 126).isSupported && (c4806x = this.LJFF) != null) {
            LinkPlayerInfo LIZ = c4806x.LIZ(j, "");
            if (str == null) {
                str = "seat";
            }
            C116971W2r.LIZJ(H0W.LIZ(this.context, this.dataCenter, LIZ, str));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    public final void LIZJ(long j, String str) {
        AbstractC78116Gqs abstractC78116Gqs;
        if (!PatchProxy.proxy(new Object[]{new Long(j), str}, this, LIZJ, false, 38).isSupported && (abstractC78116Gqs = this.LJJJJZ) != null) {
            abstractC78116Gqs.LIZ(j);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.ax$a
    public final void LIZIZ(long j, Throwable th) {
        AbstractC78116Gqs abstractC78116Gqs;
        if (!PatchProxy.proxy(new Object[]{new Long(j), th}, this, LIZJ, false, 39).isSupported && (abstractC78116Gqs = this.LJJJJZ) != null) {
            abstractC78116Gqs.LIZ(j, th);
        }
    }

    private void LIZ(OperateType operateType, int i, AbstractC80546Hoy<C4826b> abstractC80546Hoy) {
        if (PatchProxy.proxy(new Object[]{operateType, 2, abstractC80546Hoy}, this, LIZJ, false, 108).isSupported) {
            return;
        }
        C80517HoV.LIZ().LIZ(new C4825a(this.context, 8, operateType, 2, this.LJIILIIL), abstractC80546Hoy);
    }

    public void LIZ(int i, int i2, int i3, int i4) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZJ, false, 17).isSupported || C78828H5q.LJFF.LIZ(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4))) {
            return;
        }
        String LIZ = C78828H5q.LIZ(Integer.valueOf(i), Integer.valueOf(i2));
        String LIZ2 = C78828H5q.LIZ(Integer.valueOf(i3), Integer.valueOf(i4));
        String LIZ3 = C78656Gza.LIZ(Integer.valueOf(i2));
        String LIZ4 = C78656Gza.LIZ(Integer.valueOf(i4));
        if (StringUtils.equalsIgnoreCase(LIZ, LIZ2) && i != 0) {
            if (!StringUtils.equalsIgnoreCase(LIZ3, LIZ4) && LIZ3 != null) {
                this.LJJIIZI.LIZIZ(null, LIZ3);
                return;
            }
            return;
        }
        if (C79046HEa.LIZ().LIZJ()) {
            if (LIZ == null || i == 0) {
                return;
            }
            if (this.LJIILJJIL > 0) {
                this.LJIILJJIL = 0L;
                this.LJJIIZI.LIZ(LJJJ(), this.LJIJJLI, this.LJJJJJL, this.LJIJI, this.LJJI, LJJJIL(), (System.currentTimeMillis() - this.LJIILJJIL) / 1000, this.LJJIIZ.LJI(), C79242HLo.LIZLLL(), this.LJJIIJZLJL, this.LJJIIZ.LJIIZILJ, this.LJJLIIJ.LIZIZ, this.LJIILIIL.circleInfo, false, this.LJIILJJIL, this.LJIILLIIL, LJJIJL(), LIZ, LIZ3, null);
                this.LJJIIZI.LIZIZ(LIZ, LIZ3);
            }
        }
        if (LIZ == null || i == 0) {
            return;
        }
        this.LJJIIZI.LIZIZ(LIZ, LIZ3);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final void LIZ(int i, int i2, String str, int i3, String str2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), str2}, this, LIZJ, false, 89).isSupported) {
            return;
        }
        LIZ(i2, str, i3, LinkMatchType.NONE, "", "fromSource_teamFight", i, false, 0, 0, false, false, 0);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e
    public final void LIZ(int i, int i2, String str, int i3, int i4, boolean z, boolean z2, int i5) {
        boolean z3 = false;
        if (PatchProxy.proxy(new Object[]{-1, Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i5)}, this, LIZJ, false, 92).isSupported) {
            return;
        }
        C78537Gxf LIZ = C78536Gxe.LIZ();
        if (i3 > 0) {
            z3 = true;
        }
        LIZ.LIZLLL = z3;
        C78536Gxe.LIZ().LIZ(z2, i5);
        LIZ(-1, this.LJIJJLI, i2, LinkMatchType.NONE, "", str, 0, false, i3, i4, z, z2, i5);
    }
}
