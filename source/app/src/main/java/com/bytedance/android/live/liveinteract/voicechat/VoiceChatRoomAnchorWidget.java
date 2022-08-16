package com.bytedance.android.live.liveinteract.voicechat;

import android.content.DialogInterface;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.MediaOperation;
import com.bytedance.android.live.liveinteract.api.chatroom.model.OpenPanelType;
import com.bytedance.android.live.liveinteract.api.chatroom.p339b.C4268e;
import com.bytedance.android.live.liveinteract.api.chatroom.p339b.C4271i;
import com.bytedance.android.live.liveinteract.api.fulllink.TalkRoomBusinessFullLinkMonitor;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkControlWidget;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p350d.d$a;
import com.bytedance.android.live.liveinteract.linkroomfight.core.VoiceLinkRoomFightWidget;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.android.live.liveinteract.plantform.api.LinkAudienceApi;
import com.bytedance.android.live.liveinteract.plantform.core.C4806x;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.plantform.model.RoomLinkerContent;
import com.bytedance.android.live.liveinteract.plantform.p385a.r$d;
import com.bytedance.android.live.liveinteract.videotalk.battle.C4891b;
import com.bytedance.android.live.liveinteract.videotalk.battle.GuestBattleWidget;
import com.bytedance.android.live.liveinteract.videotalk.quickinteract.QuickInteractWidget;
import com.bytedance.android.live.liveinteract.voicechat.VoiceChatRoomAnchorWidget;
import com.bytedance.android.live.liveinteract.voicechat.fight.C5056a;
import com.bytedance.android.live.liveinteract.voicechat.fight.LinkMicTeamFightWidget;
import com.bytedance.android.live.liveinteract.voicechat.k$a;
import com.bytedance.android.live.liveinteract.voicechat.match.ChatMatchWidget;
import com.bytedance.android.live.liveinteract.voicechat.p392b.C5001e;
import com.bytedance.android.live.liveinteract.voicechat.p395wm.AbstractC5142y;
import com.bytedance.android.live.liveinteract.voicechat.p395wm.LinkRoomFightAudioWidget;
import com.bytedance.android.live.liveinteract.voicechat.paid.AudioPaidLinkWidget;
import com.bytedance.android.live.liveinteract.voicechat.video.d$c;
import com.bytedance.android.live.network.response.C5171b;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.platform.IHostAction;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.event.C5984am;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6069p;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6071r;
import com.bytedance.android.livesdk.chatroom.interact.model.C6068x;
import com.bytedance.android.livesdk.chatroom.model.interact.C6152aj;
import com.bytedance.android.livesdk.chatroom.model.interact.KTVLiveCoreInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.MultiLiveCoreInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.MultiRtcInfo;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.log.p723a.AbstractC8644i;
import com.bytedance.android.livesdk.message.linker.C8690o;
import com.bytedance.android.livesdk.message.model.C8854es;
import com.bytedance.android.livesdk.message.model.KtvMusic;
import com.bytedance.android.livesdk.message.model.LinkMicGuideMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p1594ss.avframework.livestreamv2.core.Client;
import com.p1594ss.avframework.livestreamv2.core.interact.model.Config;
import com.p1594ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.p3021tt.miniapp.debug.devtool.BdpDebugHttpRequest;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p002O.C0002O;
import p003X.AbstractC416582eC;
import p003X.AbstractC4569445g;
import p003X.AbstractC78050Gpo;
import p003X.AbstractC78116Gqs;
import p003X.AbstractC78720H1m;
import p003X.AbstractC78986HBs;
import p003X.AbstractC79061HEp;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC81278I1w;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C148062fT6;
import p003X.C2WC;
import p003X.C3E8;
import p003X.C422242nK;
import p003X.C449933qt;
import p003X.C4574547f;
import p003X.C78374Gv2;
import p003X.C78377Gv5;
import p003X.C78627Gz7;
import p003X.C78828H5q;
import p003X.C78833H5v;
import p003X.C78837H5z;
import p003X.C78997HCd;
import p003X.C79007HCn;
import p003X.C79046HEa;
import p003X.C79055HEj;
import p003X.C79100HGc;
import p003X.C79188HJm;
import p003X.C79242HLo;
import p003X.C80478Hns;
import p003X.C80608Hpy;
import p003X.C81173Hz5;
import p003X.C87010KQi;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.C88469KtT;
import p003X.DialogC77516GhC;
import p003X.DialogC77935Gnx;
import p003X.DialogC78738H2e;
import p003X.H05;
import p003X.H0W;
import p003X.HAA;
import p003X.HDJ;
import p003X.HDP;
import p003X.HEQ;
import p003X.HGR;
import p003X.HGX;
import p003X.HGZ;
import p003X.HH8;
import p003X.HHB;
import p003X.HHR;
import p003X.HKH;
import p003X.IOU;
import p003X.KDS;
import p003X.LK5;

/* loaded from: classes3.dex */
public class VoiceChatRoomAnchorWidget extends BaseVoiceChatWidget implements Observer<KVData>, d$a, AbstractC4998a, AbstractC5004d, k$a, AbstractC5142y, WeakHandler.IHandler, AbstractC4569445g {
    public static ChangeQuickRedirect LIZJ;
    public C78997HCd LIZLLL;

    /* renamed from: LJ */
    public VoiceChatMuteManager f26473LJ;
    public C4806x LJFF;
    public C79188HJm LJI;
    public HHB LJII;
    public Room LJIIIIZZ;
    public long LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public C80478Hns LJIILL;
    public C78833H5v LJIILLIIL;
    public Disposable LJIJ;
    public boolean LJIJJ;
    public WeakHandler LJIJJLI;
    public AbstractC5436a LJIL;
    public FragmentManager LJJ;
    public AbstractC6069p LJJI;
    public final AbstractC6071r LJJIFFI;
    public HGZ LJJII;
    public boolean LJJIII;
    public HKH LJJIIJ;
    public C78377Gv5 LJJIIZ;
    public AbstractC78116Gqs LJJIIZI;
    public HDJ LJJIJ;
    public C5001e LJJIJIIJIL;
    public GuestBattleWidget LJJIJL;
    public LinkMicTeamFightWidget LJJIJLIJ;
    public QuickInteractWidget LJJIL;
    public VoiceLinkRoomFightWidget LJJIZ;
    public boolean LJJJ;
    public boolean LJJJI;
    public AudioPaidLinkWidget LJJJIL;
    public final C78374Gv2 LJJIIJZLJL = new C78374Gv2();
    public final CompositeDisposable LJIIZILJ = new CompositeDisposable();
    public final HashSet<Long> LJIJI = new HashSet<>();
    public Map<String, Integer> LJJIJIIJI = new HashMap();
    public ChatMatchWidget LJJIJIL = null;
    public final r$d LJJJJIZL = new r$d() { // from class: com.bytedance.android.live.liveinteract.voicechat.VoiceChatRoomAnchorWidget.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(30836);
        }

        @Override // com.bytedance.android.live.liveinteract.plantform.p385a.r$d, p003X.AbstractC79253HLz
        public final void LIZ(List<LinkPlayerInfo> list) {
            if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 1).isSupported) {
                return;
            }
            VoiceChatRoomAnchorWidget.this.dataCenter.put("data_online_changed_list", new ArrayList(list));
            if (list.size() > C79007HCn.LJII().LIZIZ) {
                C79007HCn.LJII().LIZIZ = list.size();
            }
        }
    };
    public C5001e.AbstractC5002a LJJJJJ = new C5001e.AbstractC5002a(this) { // from class: X.HDM
        public static ChangeQuickRedirect LIZ;
        public final VoiceChatRoomAnchorWidget LIZIZ;

        static {
            Covode.recordClassIndex(31870);
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
            VoiceChatRoomAnchorWidget voiceChatRoomAnchorWidget = this.LIZIZ;
            if (PatchProxy.proxy(new Object[]{Byte.valueOf((byte) z)}, voiceChatRoomAnchorWidget, VoiceChatRoomAnchorWidget.LIZJ, false, 91).isSupported) {
                return;
            }
            if (z != 0) {
                voiceChatRoomAnchorWidget.LIZ(true, HCD.LIZ);
                if (voiceChatRoomAnchorWidget.f26473LJ.LJFF() != 0) {
                    return;
                }
                voiceChatRoomAnchorWidget.LJFF.LIZ(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ(), C79007HCn.LJII().LIZLLL, 3);
                voiceChatRoomAnchorWidget.f26473LJ.LIZ("onPause");
            } else if (voiceChatRoomAnchorWidget.LJJIIJ() != 3) {
            } else {
                voiceChatRoomAnchorWidget.f26473LJ.LIZIZ(HCD.LIZIZ);
            }
        }
    };

    static {
        Covode.recordClassIndex(30835);
    }

    public static boolean LIZ(int i, int i2) {
        return i == 16 || i2 == 16;
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final void LIZIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZJ, false, BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS).isSupported) {
            return;
        }
        AbstractC416582eC.LIZ(this, th);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    /* renamed from: LJ */
    public final boolean mo15654LJ() {
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final void LJI() {
        this.LJJIIZI = null;
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final String LJJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 100);
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
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZJ, false, 102).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget
    public final int LIZIZ() {
        return this.LJIIJ;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final AbstractC78720H1m LJFF() {
        return this.f26473LJ;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final AbstractC78986HBs<LinkPlayerInfo> LJII() {
        return this.LJFF;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final boolean LJIIL() {
        return this.LJIILJJIL;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final AbstractC79061HEp LJIILIIL() {
        return this.LJIILL;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final HHB LJIILJJIL() {
        return this.LJII;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final HDJ LJIILL() {
        return this.LJJIJ;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5004d
    public final int LJIJI() {
        return this.LJIIJ;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5004d
    public final C78833H5v LJIJJ() {
        return this.LJIILLIIL;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5004d
    public final AbstractC5436a LJIJJLI() {
        return this.LJIL;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.k$a
    public final void LIZ(List<AnchorLinkUser> list, long j, String str) {
        if (PatchProxy.proxy(new Object[]{list, new Long(j), str}, this, LIZJ, false, 33).isSupported) {
            return;
        }
        this.LJFF.LIZ(list, j, str);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final void LIZ(boolean z, String str, int i) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Integer.valueOf(i)}, this, LIZJ, false, 36).isSupported) {
            return;
        }
        LIZ(z, str, i, "");
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final void LIZ(boolean z, String str, int i, String str2) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Integer.valueOf(i), str2}, this, LIZJ, false, 37).isSupported && isViewValid()) {
            if (!this.LJIIL) {
                this.dataCenter.put("data_task_name_when_open_invite_panel", str2);
                AbstractC78050Gpo.LIZ().LIZ(str, i, new DialogInterface.OnDismissListener(this) { // from class: X.HFy
                    public static ChangeQuickRedirect LIZ;
                    public final VoiceChatRoomAnchorWidget LIZIZ;

                    static {
                        Covode.recordClassIndex(30860);
                    }

                    {
                        this.LIZIZ = this;
                    }

                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        if (PatchProxy.proxy(new Object[]{dialogInterface}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        this.LIZIZ.LJIIL = false;
                    }
                });
                this.LJIIL = true;
            }
            C79188HJm c79188HJm = this.LJI;
            if (c79188HJm != null) {
                c79188HJm.LJFF();
            }
            if (!z) {
                return;
            }
            this.LJIILLIIL.LIZIZ("anchor");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final void LIZ(C8854es c8854es) {
        if (!PatchProxy.proxy(new Object[]{c8854es}, this, LIZJ, false, 38).isSupported && c8854es != null) {
            int i = c8854es.LJJJJ;
            int i2 = c8854es.LJJJJJL;
            ALogger.m15797i("link_room_fight", "onSwitchSceneMessage: msgScene = " + i + ", msgUILayout = " + i2 + ", msgId = " + c8854es.getMessageId());
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
            LIZ(c6152aj, "switchSceneMsg");
        }
    }

    public void LIZ(C6152aj c6152aj, String str) {
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{c6152aj, str}, this, LIZJ, false, 39).isSupported) {
            return;
        }
        int i = c6152aj.LJIIL;
        int i2 = c6152aj.LJIILIIL;
        if (LJJJI() != null && LJJJI().LJJLL().LIZIZ() != null && LJJJI().LJJLL().LIZIZ().LIZ(i, i2)) {
            ALogger.m15797i("ttlive_link_audio", "onSwitchSceneMessage already same layout, current scene = " + i + " layout = " + i2);
            return;
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI == null) {
            return;
        }
        AbstractC5003c LIZ = AbstractC5003c.LIZ.LIZ();
        if (LIZ != null && c6152aj.LJII != null) {
            ALogger.m15797i("ttlive_link_audio", "realSwitchScene ListUser=" + C79242HLo.LIZIZ(c6152aj.LJII));
            if (LIZ.LJII() instanceof C4806x) {
                LIZ.LJII().LIZ(c6152aj.LJII, c6152aj.LJIIIZ, str, c6152aj.LJIIIIZZ);
            }
        }
        LIZ(c6152aj.f26891LJ, c6152aj.LIZLLL, c6152aj.LIZJ, c6152aj.LIZIZ);
        C2WC<Boolean> LJJLIIIJLLLLLLLZ = LJJJI.LJJLIIIJLLLLLLLZ();
        if (i != 9) {
            z = false;
        }
        LJJLIIIJLLLLLLLZ.LIZ(Boolean.valueOf(z));
        if (LJJJI.LJJLL().LIZIZ() != null) {
            ALogger.m15797i("ttlive_link_audio", "realSwitchScene by " + str + ", to: " + c6152aj + " current= " + LJJJI().LJJLL().LIZIZ().LIZ());
            int i3 = c6152aj.LJIILIIL;
            String str2 = "";
            String str3 = TextUtils.isEmpty(c6152aj.LIZIZ) ? str2 : c6152aj.LIZIZ;
            if (!TextUtils.isEmpty(c6152aj.LIZJ)) {
                str2 = c6152aj.LIZJ;
            }
            LJJJI.LJJLL().LIZIZ().LIZ(new HHR(i, i3, false, str3, str2, c6152aj.f26891LJ));
        }
        LJJJI.LJJZ().LIZ(new C3E8(0, c6152aj.LJFF));
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.BaseVoiceChatWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LIZJ, false, 44).isSupported) {
            return;
        }
        C78997HCd c78997HCd = this.LIZLLL;
        if (!PatchProxy.proxy(new Object[0], c78997HCd, C78997HCd.LIZ, false, 4).isSupported) {
            c78997HCd.LIZLLL = false;
            c78997HCd.LJIIL.clear();
            c78997HCd.LJIILIIL.clear();
            c78997HCd.LIZ("stop_on_rtc_error");
            C79046HEa.LIZ().LIZ((Integer) 0);
        }
        C88440Kt0.LIZ(2131585641);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.BaseVoiceChatWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, long j) {
        if (PatchProxy.proxy(new Object[]{str, new Long(j)}, this, LIZJ, false, 49).isSupported) {
            return;
        }
        this.LJFF.LIZ(str);
        this.LJI.LIZIZ(0L, str);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.BaseVoiceChatWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String[] strArr, boolean[] zArr, int[] iArr) {
        if (PatchProxy.proxy(new Object[]{strArr, zArr, iArr}, this, LIZJ, false, 50).isSupported) {
            return;
        }
        this.LJI.LIZ(strArr, zArr, iArr, false);
        for (int i = 0; i < strArr.length; i++) {
            this.LJJIJIIJI.put(strArr[i], Integer.valueOf(IOU.LIZ(iArr[i], this.LJJJ)));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.BaseVoiceChatWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, int i, int i2) {
        if (!PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZJ, false, 51).isSupported && i > 64 && i2 > 64) {
            LIZ(str, i, i2, "remoteVideoSizeChanged");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5004d
    public final void LIZ(String str, int i, int i2, String str2) {
        if (!PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), str2}, this, LIZJ, false, 52).isSupported && this.LJIIJ == 9 && !TextUtils.isEmpty(str) && this.LJJJI) {
            int LJII = this.LJII.LJII();
            int LJIIIIZZ = this.LJII.LJIIIIZZ();
            if (LJII >= 720 || LJIIIIZZ >= 540) {
                ALogger.m15795w("ttlive_link_video", "ktv stream already adapted, w=" + LJII + " h=" + LJIIIIZZ + " from=" + str2);
                return;
            }
            long LJIL = C79242HLo.LJIL();
            String LIZIZ = this.LJFF.LIZIZ(LJIL);
            d$c LJIIJ = this.LJIILL.LJIIJ();
            KTVLiveCoreInfo LJI = this.LJII.LJI();
            String str3 = null;
            if (LJI != null && LJI.liveCoreExtInfoMap != null) {
                str3 = LJI.getLiveCoreInfo("2");
            }
            HH8.LIZ(LJIL, str, i, i2, str2, str3);
            if (!TextUtils.isEmpty(str3)) {
                this.LJII.LIZLLL(str3);
            } else {
                this.LJII.LIZ(720, 540);
            }
            ALogger.m15795w("ttlive_link_video", "ktvAdaptStreamSize from:" + str2 + " singer:" + LJIL + " " + LIZIZ + " " + LJIIJ);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.BaseVoiceChatWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(long j, long j2) {
        HGZ hgz;
        if (!PatchProxy.proxy(new Object[]{new Long(j), new Long(j2)}, this, LIZJ, false, 53).isSupported && (hgz = this.LJJII) != null) {
            hgz.LIZ(j, j2);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.k$a
    public final boolean LIZ(int i, LinkMicGuideMessage.C8701a c8701a) {
        int LIZLLL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), c8701a}, this, LIZJ, false, 60);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LJFF.LJIIJJI() >= i) {
            ALogger.m15801d("ttlive_link", "intercept guide since online count hits limit");
            return false;
        } else if (((Integer) this.dataCenter.get("data_member_count", (String) 0)).intValue() <= 0 || this.LJI == null) {
            return false;
        } else {
            if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 58).isSupported && (LIZLLL = this.LJI.LIZLLL()) >= 0) {
                this.LJI.LIZJ(LIZLLL);
                this.LJIILLIIL.LIZ("anchor");
            }
            return true;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final void LIZ(long j, String str) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str}, this, LIZJ, false, 61).isSupported) {
            return;
        }
        if (!LJIIJ()) {
            this.LIZLLL.LIZ(j, str);
            this.LIZLLL.LIZIZ();
            return;
        }
        this.LIZLLL.LIZIZ(j, str);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final void LIZ(boolean z, List<AnchorLinkUser> list, long j, Map<Long, ? extends RoomLinkerContent> map) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), list, new Long(j), map}, this, LIZJ, false, 63).isSupported) {
            return;
        }
        LIZ(z, "normal");
        this.f26473LJ.LIZIZ(z);
        this.LJFF.LIZ(list, j, z ? "silence" : "unsilence", map);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final void LIZ(User user) {
        if (PatchProxy.proxy(new Object[]{user}, this, LIZJ, false, 64).isSupported) {
            return;
        }
        final C78997HCd c78997HCd = this.LIZLLL;
        if (PatchProxy.proxy(new Object[]{user}, c78997HCd, C78997HCd.LIZ, false, 13).isSupported || c78997HCd.LJI) {
            return;
        }
        final long id = user.getId();
        final String secUid = user.getSecUid();
        final String nickName = user.getNickName();
        c78997HCd.LJI = true;
        final long currentTimeMillis = System.currentTimeMillis();
        HDP.LIZJ(id);
        ((KDS) ((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).kickOut(c78997HCd.LJIIIIZZ.getId(), id, secUid, "anchor_stop_normal").m149as(c78997HCd.LJIIJJI())).LIZ(new Consumer(c78997HCd, id, currentTimeMillis, secUid, nickName) { // from class: X.HDl
            public static ChangeQuickRedirect LIZ;
            public final C78997HCd LIZIZ;
            public final long LIZJ;
            public final long LIZLLL;

            /* renamed from: LJ */
            public final String f6701LJ;
            public final String LJFF;

            static {
                Covode.recordClassIndex(31732);
            }

            {
                this.LIZIZ = c78997HCd;
                this.LIZJ = id;
                this.LIZLLL = currentTimeMillis;
                this.f6701LJ = secUid;
                this.LJFF = nickName;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                C78997HCd c78997HCd2 = this.LIZIZ;
                long j = this.LIZJ;
                long j2 = this.LIZLLL;
                String str = this.f6701LJ;
                String str2 = this.LJFF;
                C5171b c5171b = (C5171b) obj;
                if (PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), str, str2, c5171b}, c78997HCd2, C78997HCd.LIZ, false, 19).isSupported) {
                    return;
                }
                c78997HCd2.LJI = false;
                c78997HCd2.LJII = j;
                HDP.LIZJ(j, System.currentTimeMillis() - j2, c5171b.f26526LJ);
                TalkRoomBusinessFullLinkMonitor.LIZIZ.LIZ(j, str, j2, c5171b.f26526LJ);
                HH8.LIZIZ(j);
                if (c78997HCd2.mo21780LJ() == 0) {
                    return;
                }
                ((k$a) c78997HCd2.mo21780LJ()).LIZLLL(str2);
            }
        }, new Consumer(c78997HCd, id, currentTimeMillis, secUid) { // from class: X.HDi
            public static ChangeQuickRedirect LIZ;
            public final C78997HCd LIZIZ;
            public final long LIZJ;
            public final long LIZLLL;

            /* renamed from: LJ */
            public final String f6700LJ;

            static {
                Covode.recordClassIndex(31601);
            }

            {
                this.LIZIZ = c78997HCd;
                this.LIZJ = id;
                this.LIZLLL = currentTimeMillis;
                this.f6700LJ = secUid;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                C78997HCd c78997HCd2 = this.LIZIZ;
                long j = this.LIZJ;
                long j2 = this.LIZLLL;
                String str = this.f6700LJ;
                Throwable th = (Throwable) obj;
                if (PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), str, th}, c78997HCd2, C78997HCd.LIZ, false, 18).isSupported) {
                    return;
                }
                c78997HCd2.LIZIZ(th);
                c78997HCd2.LJI = false;
                HDP.LIZJ(j, System.currentTimeMillis() - j2, th);
                TalkRoomBusinessFullLinkMonitor.LIZIZ.LIZIZ(j, str, j2, th);
                HH8.LIZIZ(j, th);
                if (c78997HCd2.mo21780LJ() == 0) {
                    return;
                }
                ((k$a) c78997HCd2.mo21780LJ()).LIZ(j, th);
            }
        });
        C78828H5q.LIZ(id, "anchor", Boolean.valueOf(c78997HCd.LJIIJJI != null && c78997HCd.LJIIJJI.LJJLIIIJLLLLLLLZ().LIZ().booleanValue()), C79242HLo.LIZ(id));
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.k$a
    public final void LIZ(long j, Throwable th) {
        if (PatchProxy.proxy(new Object[]{new Long(j), th}, this, LIZJ, false, 66).isSupported) {
            return;
        }
        C88469KtT.LIZ(getContext(), th, 2131585533);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final void LIZ(final HAA haa) {
        if (PatchProxy.proxy(new Object[]{haa}, this, LIZJ, false, 71).isSupported) {
            return;
        }
        if (C5056a.LJIILIIL() && haa.LIZLLL <= 0 && haa.f6620LJ == 0) {
            C116971W2r.LIZJ(new DialogC77935Gnx(this.context, haa));
            return;
        }
        final User user = haa.LIZJ;
        final Long valueOf = Long.valueOf(user.getId());
        if (this.LJIJI.contains(valueOf)) {
            ALogger.m15800e("ttlive_link", "invite request already sent for " + valueOf);
            return;
        }
        this.LJIJI.add(valueOf);
        int i = this.LJIIJ == 9 ? 64 : 8;
        final long currentTimeMillis = System.currentTimeMillis();
        HDP.LIZ(valueOf.longValue(), user.getSecUid());
        this.LJIIZILJ.add(((LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class)).invite(this.LJIIIIZZ.getId(), user.getSecUid(), i, haa.LIZLLL, haa.f6620LJ, haa.LJI).compose(C100839PnV.LIZJ()).subscribe(new Consumer(this, valueOf, user, currentTimeMillis, haa) { // from class: X.HAM
            public static ChangeQuickRedirect LIZ;
            public final VoiceChatRoomAnchorWidget LIZIZ;
            public final Long LIZJ;
            public final User LIZLLL;

            /* renamed from: LJ */
            public final long f6627LJ;
            public final HAA LJFF;

            static {
                Covode.recordClassIndex(30864);
            }

            {
                this.LIZIZ = this;
                this.LIZJ = valueOf;
                this.LIZLLL = user;
                this.f6627LJ = currentTimeMillis;
                this.LJFF = haa;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                VoiceChatRoomAnchorWidget voiceChatRoomAnchorWidget = this.LIZIZ;
                Long l = this.LIZJ;
                User user2 = this.LIZLLL;
                long j = this.f6627LJ;
                HAA haa2 = this.LJFF;
                C5176i<C6068x> c5176i = (C5176i) obj;
                if (PatchProxy.proxy(new Object[]{l, user2, new Long(j), haa2, c5176i}, voiceChatRoomAnchorWidget, VoiceChatRoomAnchorWidget.LIZJ, false, 88).isSupported) {
                    return;
                }
                voiceChatRoomAnchorWidget.LJIJI.remove(l);
                voiceChatRoomAnchorWidget.LJFF.LJFF(l.longValue());
                if (c5176i != null && c5176i.LIZJ != null) {
                    C88440Kt0.LIZ(2131584497);
                    C79007HCn.LJII().LIZ(c5176i.LIZJ.LIZIZ);
                    HDP.LIZ(l.longValue(), user2.getSecUid(), C79242HLo.LIZIZ(j), c5176i.f26526LJ);
                    HH8.LIZ(user2.getId(), C79242HLo.LIZIZ(j), haa2.toString());
                    TalkRoomBusinessFullLinkMonitor.LIZIZ.LIZ(l.longValue(), user2.getSecUid(), c5176i, j);
                    if (haa2.LJI != 0) {
                        C87010KQi.LIZ().LIZ(new C4268e(true));
                    }
                }
                C87010KQi.LIZ().LIZ(new C4271i(3));
            }
        }, new Consumer(this, valueOf, user, currentTimeMillis, haa) { // from class: X.HAK
            public static ChangeQuickRedirect LIZ;
            public final VoiceChatRoomAnchorWidget LIZIZ;
            public final Long LIZJ;
            public final User LIZLLL;

            /* renamed from: LJ */
            public final long f6625LJ;
            public final HAA LJFF;

            static {
                Covode.recordClassIndex(30865);
            }

            {
                this.LIZIZ = this;
                this.LIZJ = valueOf;
                this.LIZLLL = user;
                this.f6625LJ = currentTimeMillis;
                this.LJFF = haa;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                VoiceChatRoomAnchorWidget voiceChatRoomAnchorWidget = this.LIZIZ;
                Long l = this.LIZJ;
                User user2 = this.LIZLLL;
                long j = this.f6625LJ;
                HAA haa2 = this.LJFF;
                Throwable th = (Throwable) obj;
                if (PatchProxy.proxy(new Object[]{l, user2, new Long(j), haa2, th}, voiceChatRoomAnchorWidget, VoiceChatRoomAnchorWidget.LIZJ, false, 87).isSupported) {
                    return;
                }
                voiceChatRoomAnchorWidget.LJIJI.remove(l);
                if (th instanceof ApiServerException) {
                    C88440Kt0.LIZ(((ApiServerException) th).mPrompt);
                }
                HDP.LIZ(l.longValue(), user2.getSecUid(), C79242HLo.LIZIZ(j), th);
                HH8.LIZ(user2.getId(), th, C79242HLo.LIZIZ(j), haa2.toString());
                TalkRoomBusinessFullLinkMonitor.LIZIZ.LIZ(l.longValue(), user2.getSecUid(), th, j);
                if (haa2.LJI == 0) {
                    return;
                }
                C87010KQi.LIZ().LIZ(new C4268e(false));
            }
        }));
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC4998a
    public final void LIZ(boolean z, String str) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str}, this, LIZJ, false, 72).isSupported) {
            return;
        }
        if (this.LJIL != null) {
            if (z) {
                this.LJII.LJFF(str);
            } else {
                this.LJII.LJI(str);
            }
            this.f26473LJ.LJIIIIZZ = System.currentTimeMillis();
        }
        this.LJJIFFI.LIZ(C79242HLo.LIZ(), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final void LIZ(String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZJ, false, 79).isSupported) {
            return;
        }
        C78833H5v c78833H5v = this.LJIILLIIL;
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf((byte) z)}, c78833H5v, C78833H5v.LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        c78833H5v.LIZ(str, z, "0", false, "", (List<? extends KtvMusic>) null);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC4998a
    public final boolean LIZJ() {
        return this.LJII.LJIILIIL;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final boolean LJIIJ() {
        return this.LJII.LJIILIIL;
    }

    private boolean LJJIIZI() {
        if (this.LJIIIIZZ.linkInitResult != null) {
            if (this.LJIIIIZZ.linkMicScene == 5 || this.LJIIIIZZ.linkMicScene == 9) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final List<LinkPlayerInfo> LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 69);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        return this.LJFF.LJFF();
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final List<LinkPlayerInfo> LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 70);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        return this.LJFF.LIZJ();
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5004d
    public final long LJIIZILJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 67);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        return this.LIZLLL.LIZLLL();
    }

    public final void LJJIII() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 34).isSupported) {
            return;
        }
        LIZ(false, "bottom", -1);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.VoiceChatRoomAnchorWidget$2 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C49912 {
        public static final /* synthetic */ int[] LIZ = new int[MediaOperation.Action.valuesCustom().length];

        static {
            Covode.recordClassIndex(30837);
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

    private C5001e LJJIIJZLJL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 24);
        if (proxy.isSupported) {
            return (C5001e) proxy.result;
        }
        if (this.LJJIJIIJIL == null) {
            this.LJJIJIIJIL = new C5001e();
            this.LJJIJIIJIL.LIZ(this.LJJJJJ);
        }
        return this.LJJIJIIJIL;
    }

    private void LJJIIZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 76).isSupported && ((Boolean) this.dataCenter.get("data_talk_room_admin_allowed_flag", (String) Boolean.FALSE)).booleanValue()) {
            C78828H5q.LIZ("live_chat", AbstractC80293Hkt.f6958M.LIZ().booleanValue());
            this.dataCenter.put("data_talk_room_admin_allowed_flag", Boolean.FALSE);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC4998a
    public final Boolean LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 73);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        AbstractC5436a abstractC5436a = this.LJIL;
        if (abstractC5436a != null) {
            return Boolean.valueOf(abstractC5436a.LJFF());
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final boolean LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 77);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C79188HJm c79188HJm = this.LJI;
        if (c79188HJm == null || !c79188HJm.LJIIIIZZ()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5004d
    public final int LJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 68);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (!LJIIJ()) {
            return 0;
        }
        return LJJIIJ();
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.k$a
    public final void LJJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 42).isSupported) {
            return;
        }
        if (this.LJII.LJIILIIL) {
            this.LJII.LIZ();
        } else {
            this.LIZLLL.LIZ();
        }
    }

    public int LJJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 59);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        LinkPlayerInfo LIZIZ = LJII().LIZIZ(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ(), C79007HCn.LJII().LIZLLL);
        if (LIZIZ != null) {
            return LIZIZ.LJIIL;
        }
        return -1;
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 21).isSupported) {
            return;
        }
        super.onStop();
        if (LiveSettingKeys.INTERACT_ACTIVITY_PERMISSION_GUARANTOR_ENABLE.getValue().booleanValue()) {
            LJJIIJZLJL().LIZJ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5004d
    public final void LJIILLIIL() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 74).isSupported) {
            return;
        }
        C78833H5v c78833H5v = this.LJIILLIIL;
        int i = this.LJIIJ;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, c78833H5v, C78833H5v.LIZ, false, 21).isSupported) {
            HashMap hashMap = new HashMap();
            if (i != 9) {
                if (i != 10) {
                    str = "chat_room";
                } else {
                    str = "watch_room";
                }
            } else {
                str = "sing_room";
            }
            hashMap.put("before_function", str);
            hashMap.put("interact_function", "live_room");
            C4574547f.LIZ().LIZ("anchor_switch_room_type", hashMap, Room.class, C8668v.class);
        }
        this.dataCenter.put("data_audio_talk_dot_with_number_show", "");
        this.LIZLLL.LIZ("stop_normally");
        LJJIIZ();
    }

    public void LJJII() {
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 30).isSupported && LJJJI() != null && LJJJI().LLLILZJ().LIZ().intValue() == OpenPanelType.PAID_LINK_SETTING_PANEL.value) {
            IInteractService iInteractService = (IInteractService) ServiceManager.getService(IInteractService.class);
            if (iInteractService.audioPaidLinkService() != null && iInteractService.audioPaidLinkService().LIZIZ()) {
                iInteractService.getAudioTalkService().LIZ(this.context, LJJJI().LLLIZZ().LIZ());
            }
            LJJJI().LLLILZJ().LIZ(Integer.valueOf(OpenPanelType.NONE.value));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.BaseVoiceChatWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: W_ */
    public final void mo15659W_() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 45).isSupported) {
            return;
        }
        HKH hkh = this.LJJIIJ;
        if (hkh != null) {
            hkh.LIZ();
        }
        if (this.dataCenter != null) {
            this.dataCenter.put("cmd_interact_state_change", new C5984am(11));
        }
        this.LJII.LIZIZ(this);
        C78997HCd c78997HCd = this.LIZLLL;
        if (c78997HCd != null) {
            c78997HCd.LIZ();
        }
        this.LJIILJJIL = false;
        if (this.LJIL != null) {
            this.LJII.LJI("anchor_finish_link");
        }
        LJJI();
    }

    public void LJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 17).isSupported) {
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

    @Override // com.bytedance.android.live.liveinteract.voicechat.BaseVoiceChatWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: V_ */
    public final void mo15660V_() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 43).isSupported || !isViewValid()) {
            return;
        }
        if (this.LJIIJ == 16) {
            ALogger.m15801d("link_room_fight", "start engin suc, start forward");
            LJJIFFI();
        }
        LinkControlWidget.LIZIZ(BaseVoiceChatWidget.LIZ(this.LJIIJ), true);
        C78997HCd c78997HCd = this.LIZLLL;
        if (!PatchProxy.proxy(new Object[0], c78997HCd, C78997HCd.LIZ, false, 3).isSupported) {
            c78997HCd.LIZJ = true;
            c78997HCd.LIZLLL = false;
            Iterator<User> it = c78997HCd.LJIIL.iterator();
            while (it.hasNext()) {
                User next = it.next();
                c78997HCd.LIZIZ(next.getId(), next.getSecUid());
            }
            c78997HCd.LJIIL.clear();
        }
        C5984am c5984am = new C5984am(10);
        c5984am.LIZIZ = this.LJJI;
        this.dataCenter.put("cmd_interact_state_change", c5984am);
        C78997HCd c78997HCd2 = this.LIZLLL;
        if (!PatchProxy.proxy(new Object[0], c78997HCd2, C78997HCd.LIZ, false, 17).isSupported) {
            c78997HCd2.LJIILLIIL.add(((LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class)).notifyJoinRtc(c78997HCd2.LJIIIIZZ.getId(), c78997HCd2.LJIILL).subscribe(new HEQ(c78997HCd2), new C79055HEj(c78997HCd2)));
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 25).isSupported) {
            return;
        }
        this.LJIILIIL = false;
        this.LJII.m23768LJ();
        if (LiveSettingKeys.INTERACT_ACTIVITY_PERMISSION_GUARANTOR_ENABLE.getValue().booleanValue()) {
            LJJIIJZLJL().LIZIZ();
        }
        this.LJIILL.LJIIIZ();
        if (((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).broadcastFloatWindowManager() != null && ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).broadcastFloatWindowManager().LIZ(this.LJIIIIZZ)) {
            this.LJJIII = true;
            super.onPause();
            ALogger.m15797i("voice_chat", "anchor onPause interceptByBroadcastFloatWindow");
            return;
        }
        this.LJJIII = false;
        if (LJIIJ() && this.LJIL != null) {
            if (!((IInteractService) ServiceManager.getService(IInteractService.class)).enableCaptureAudioOnBackground(true)) {
                LIZ(true, "onPause");
                if (this.f26473LJ.LJFF() == 0) {
                    this.LJFF.LIZ(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ(), C79007HCn.LJII().LIZLLL, 3);
                    this.f26473LJ.LIZ("onPause");
                }
                AbstractC6069p abstractC6069p = this.LJJI;
                if (abstractC6069p != null) {
                    abstractC6069p.mo15547y_();
                }
            } else {
                HH8.LJFF();
            }
        }
        this.LJFF.LJIIIZ();
        this.LJI.LJFF();
        super.onPause();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 23).isSupported) {
            return;
        }
        super.onResume();
        this.LJIILIIL = true;
        this.LJII.LIZLLL();
        this.LJIILL.LJIIIIZZ();
        if (this.LJJIII) {
            ALogger.m15797i("voice_chat", "anchor onResume interceptByBroadcastFloatWindow");
            return;
        }
        this.LJIJJLI.removeCallbacksAndMessages(null);
        if (LiveSettingKeys.INTERACT_ACTIVITY_PERMISSION_GUARANTOR_ENABLE.getValue().booleanValue()) {
            LJJIIJZLJL().LIZ();
        }
        if (LJIIJ() && this.LJIL != null) {
            AbstractC6069p abstractC6069p = this.LJJI;
            if (abstractC6069p != null) {
                abstractC6069p.mo15546z_();
            }
            if ((!LiveSettingKeys.INTERACT_ACTIVITY_PERMISSION_GUARANTOR_ENABLE.getValue().booleanValue() || !LJJIIJZLJL().LJIIIIZZ) && LJJIIJ() == 3) {
                this.f26473LJ.LIZIZ("onResume");
            }
            this.LJII.LIZ(false, "onResume");
        }
        this.LJFF.LJIIJ();
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.k$a
    public final void LJIL() {
        Config.InteractMode interactMode;
        Config.MixStreamType mixStreamType;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 41).isSupported || !isViewValid()) {
            return;
        }
        C422242nK.LIZ(this.context, 5);
        C79046HEa.LIZ().f6716LJ = SystemClock.currentThreadTimeMillis();
        String str = this.LJII.LJI;
        this.LJII.LIZLLL(this.LJII.LJII);
        if (LiveConfigSettingKeys.VOICE_CHAT_ROOM_INTERACT_MODE_ENABLE.getValue().booleanValue()) {
            interactMode = this.LJII.LIZ((Integer) null);
        } else {
            interactMode = Config.InteractMode.FM;
        }
        this.LJJIIJ = new HKH(this, this.LJJIJIIJI);
        InteractConfig interactConfig = new InteractConfig();
        interactConfig.setStreamMixer(this.LJJIIJ);
        interactConfig.setBackgroundColor("#1F212C");
        interactConfig.setContext(this.context);
        interactConfig.setRtcExtInfo(str);
        interactConfig.setLogReportInterval(5);
        Config videoQuality = interactConfig.setVideoQuality(Config.VideoQuality.GUEST_NORMAL);
        videoQuality.setProjectKey(LK5.LIZ(2131587904));
        videoQuality.setInteractMode(interactMode);
        videoQuality.setVolumeCallbackInterval(300);
        videoQuality.setCharacter(Config.Character.ANCHOR);
        videoQuality.setSeiVersion(3);
        videoQuality.setUpdateTalkSeiAB(LiveConfigSettingKeys.TALK_ROOM_RTC_SEI_ENABLE.getValue().booleanValue());
        videoQuality.setUpdateTalkSeiInterval(LiveConfigSettingKeys.LIVE_SEI_UPDATE_INTERVAL.getValue().intValue());
        this.LJJIIJ.LIZIZ = interactConfig;
        ((HGX) this.LJJI).setOutputFormat(3553);
        interactConfig.setMixStreamRtmpUrl(this.LJIIIIZZ.getStreamUrl().LIZ());
        interactConfig.setAutoUpdateSeiForTalk(true);
        interactConfig.setMixStreamType(Config.MixStreamType.SERVER_MIX);
        interactConfig.setType(Config.Type.VIDEO);
        if (LiveConfigSettingKeys.LIVE_ENABLE_CONTROL_CLIENT_MIX_STREAM.getValue().booleanValue()) {
            boolean booleanValue = LiveConfigSettingKeys.LIVE_CONTROL_CLIENT_MIX_STREAM.getValue().booleanValue();
            interactConfig.setNeedCheckClientMixerParams(false);
            if (booleanValue) {
                mixStreamType = Config.MixStreamType.CLIENT_MIX;
            } else {
                mixStreamType = Config.MixStreamType.SERVER_MIX;
            }
            interactConfig.setMixStreamType(mixStreamType);
        }
        this.LJJIIJ.LIZIZ = interactConfig;
        this.LJII.LIZ(this);
        this.LJII.LIZ(this.LJIL, interactConfig);
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null) {
            ((AbstractC81278I1w) LJJJI.LJJLIIIJLLLLLLLZ().LIZIZ().observeOn(AndroidSchedulers.mainThread()).m151as(autoDispose())).LIZ(new Consumer(this) { // from class: X.HFJ
                public static ChangeQuickRedirect LIZ;
                public final VoiceChatRoomAnchorWidget LIZIZ;

                static {
                    Covode.recordClassIndex(30862);
                }

                {
                    this.LIZIZ = this;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    VoiceChatRoomAnchorWidget voiceChatRoomAnchorWidget = this.LIZIZ;
                    if (PatchProxy.proxy(new Object[]{obj}, voiceChatRoomAnchorWidget, VoiceChatRoomAnchorWidget.LIZJ, false, 89).isSupported) {
                        return;
                    }
                    voiceChatRoomAnchorWidget.LJII.LIZJ();
                }
            }, C79100HGc.LIZIZ);
        }
    }

    public void LJJIFFI() {
        Map<Long, String> map;
        Long l;
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 18).isSupported) {
            return;
        }
        ALogger.m15801d("link_room_fight", "startForwardStreamToRooms enginOn = " + LJIILJJIL().LJIILIIL + " rtcinfo " + C79007HCn.LJII().LJIIIZ);
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

    /* JADX WARN: Removed duplicated region for block: B:41:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02f3  */
    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDestroy() {
        /*
            Method dump skipped, instructions count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.voicechat.VoiceChatRoomAnchorWidget.onDestroy():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x049c  */
    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate() {
        /*
            Method dump skipped, instructions count: 1357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.voicechat.VoiceChatRoomAnchorWidget.onCreate():void");
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final void LIZ(AbstractC78116Gqs abstractC78116Gqs) {
        this.LJJIIZI = abstractC78116Gqs;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5004d
    public final void LIZIZ(long j) {
        this.LIZLLL.LJII = 0L;
    }

    public final void LIZ(C78377Gv5 c78377Gv5) {
        if (PatchProxy.proxy(new Object[]{c78377Gv5}, this, LIZJ, false, 81).isSupported) {
            return;
        }
        this.LJJIIZ = c78377Gv5;
        LIZIZ(this.LJIIJ);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.BaseVoiceChatWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: d_ */
    public final void mo15658d_(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 47).isSupported) {
            return;
        }
        ALogger.m15795w("voice_chat", C0002O.m25086C("onWarn: ", str));
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (PatchProxy.proxy(new Object[]{message}, this, LIZJ, false, 35).isSupported) {
            return;
        }
        isViewValid();
    }

    public void LIZIZ(int i) {
        C78377Gv5 c78377Gv5;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZJ, false, 82).isSupported && (c78377Gv5 = this.LJJIIZ) != null) {
            if (i == 5) {
                c78377Gv5.LIZ(1.0f);
            } else if (i == 9) {
                c78377Gv5.LIZ(0.34f);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5004d
    /* renamed from: e_ */
    public final void mo15653e_(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZJ, false, 80).isSupported && this.LJJIJIL != null) {
            ChatMatchWidget.LJIIIIZZ.LIZ("live_end");
            new C78837H5z(this.LJIIIIZZ).LIZ(false, 0);
            this.LJJIJIL.LIZ(null, null, false, true, "live_end", Boolean.FALSE);
        }
    }

    /* renamed from: LJ */
    private void m15662LJ(String str) {
        String LIZ;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 9).isSupported) {
            return;
        }
        if (TextUtils.equals(str, "ktv")) {
            LIZ = LK5.LIZ(2131584583);
        } else {
            LIZ = LK5.LIZ(2131584584);
        }
        AbstractC8644i LIZ2 = C4574547f.LIZ().LIZ(C8668v.class);
        if ((LIZ2 instanceof C81173Hz5) && ((C81173Hz5) LIZ2).LJII) {
            ((IHostAction) ServiceManager.getService(IHostAction.class)).showInvitePanel(this.context, this.LJIIIIZZ, LIZ, "homepage_familiar", str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p350d.d$a
    public final int LIZIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 56);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C79188HJm c79188HJm = this.LJI;
        if (c79188HJm == null) {
            return -1;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str}, c79188HJm, C79188HJm.LIZ, false, 54);
        if (proxy2.isSupported) {
            return ((Integer) proxy2.result).intValue();
        }
        if (!c79188HJm.LJIIIZ() || c79188HJm.LJIIL == null) {
            return -1;
        }
        LinkRoomFightAudioWidget linkRoomFightAudioWidget = c79188HJm.LJIIL;
        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{str}, linkRoomFightAudioWidget, LinkRoomFightAudioWidget.LIZJ, false, 11);
        if (proxy3.isSupported) {
            return ((Integer) proxy3.result).intValue();
        }
        C80608Hpy c80608Hpy = linkRoomFightAudioWidget.LIZLLL;
        if (c80608Hpy == null) {
            return -1;
        }
        return c80608Hpy.LIZLLL(str);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.k$a
    public final void LIZLLL(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 65).isSupported) {
            return;
        }
        if (ServiceManager.getService(IInteractService.class) != null && ((IInteractService) ServiceManager.getService(IInteractService.class)).isAnonymousUser(Long.valueOf(this.LIZLLL.LIZLLL()))) {
            C88440Kt0.LIZ(LK5.LIZ(2131585437));
        } else {
            C88440Kt0.LIZ(LK5.LIZ(2131585493, LinkPlayerInfo.LIZ(str)));
        }
        this.LJI.LIZIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.BaseVoiceChatWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: e_ */
    public final void mo15661e_(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 19).isSupported) {
            return;
        }
        super.mo15661e_(str);
        ALogger.m15801d("link_room_fight", C0002O.m25086C("onFirstRemoteAudioFrame linkId ", str));
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p350d.d$a
    public final long LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZJ, false, 54);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        return this.LJFF.LIZJ(str);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p350d.d$a
    public final String LIZ(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZJ, false, 55);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return this.LJFF.LIZIZ(j);
    }

    @Override // androidx.lifecycle.Observer
    public /* synthetic */ void onChanged(KVData kVData) {
        MediaOperation mediaOperation;
        Client client;
        C79188HJm c79188HJm;
        KVData kVData2 = kVData;
        boolean z = false;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZJ, false, 57).isSupported && isViewValid() && kVData2 != null && !TextUtils.isEmpty(kVData2.getKey()) && kVData2.getData() != null) {
            String key = kVData2.getKey();
            if (key.equals("cmd_open_interact_manage_dialog_by_anchor")) {
                if (((IInteractService) ServiceManager.getService(IInteractService.class)).isEnableTalkRoomEmoji()) {
                    LinkPlayerInfo LIZIZ = this.LJFF.LIZIZ(C79242HLo.LIZ(), C79007HCn.LJII().LIZLLL);
                    if (LIZIZ != null) {
                        DataCenter dataCenter = this.dataCenter;
                        if (LIZIZ.LJIIL != 0) {
                            z = true;
                        }
                        dataCenter.put("data_self_is_silenced", Boolean.valueOf(z));
                    }
                    C116971W2r.LIZJ(new H05().LIZ(this.context).LIZ(this.dataCenter).LIZ(true).LIZ("seat").LIZIZ());
                    return;
                }
                C116971W2r.LIZJ(new DialogC78738H2e(this.context, this.f26473LJ));
            } else if (key.equals("cmd_audio_talk_invite")) {
                User user = (User) kVData2.getData();
                LIZ(new HAA(this.LJIIIIZZ, user, -1));
                C78828H5q.LIZ("anchor", user.getId(), "card", -1);
            } else if (key.equals("data_member_count")) {
                if (((Integer) kVData2.getData()).intValue() == 0 && (c79188HJm = this.LJI) != null) {
                    c79188HJm.LJFF();
                }
            } else if (key.equals("data_interact_anchor_param_change")) {
                HHB hhb = this.LJII;
                String str = (String) kVData2.getData("");
                if (!PatchProxy.proxy(new Object[]{str}, hhb, HHB.LIZ, false, 32).isSupported && (client = hhb.LIZJ) != null) {
                    client.sendSdkControlMsg(str);
                }
            } else if (key.equals("data_room_audio_chat_anchor_uilayout_switch_time")) {
                long longValue = ((Long) kVData2.getData(0L)).longValue();
                if (longValue > this.LJIIIZ) {
                    ALogger.m15801d("audio_talk_context", "update starttime : " + this.LJIIIZ + "->" + longValue);
                    this.LJIIIZ = longValue;
                }
            } else if (key.equals("cmd_auto_join_channel")) {
                if (LiveConfigSettingKeys.LIVE_ENABLE_AUDIO_CHAT_ROOM_AUTO_JOIN.getValue().booleanValue()) {
                    this.LIZLLL.LIZIZ();
                }
            } else if (key.equals("cmd_video_talk_guest_battle_open_panel")) {
                if (C4891b.LIZJ.m23816LJ() && C4891b.LIZJ.LIZIZ() != null) {
                    C4891b.LIZJ.LIZIZ().LJIIIZ();
                } else {
                    C116971W2r.LIZJ(new DialogC77516GhC(this.context, this.dataCenter));
                }
            } else if (key.equals("cmd_operate_interact_media") && (mediaOperation = (MediaOperation) kVData2.getData()) != null && mediaOperation.LIZ == MediaOperation.Type.MIC) {
                int i = C49912.LIZ[mediaOperation.LIZIZ.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        this.f26473LJ.LIZ(false, mediaOperation.LIZJ);
                        return;
                    }
                    return;
                }
                this.f26473LJ.LIZ(mediaOperation.LIZJ);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.p395wm.AbstractC5142y
    /* renamed from: a_ */
    public final void mo15635a_(String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZJ, false, 78).isSupported) {
            return;
        }
        this.LJII.LIZ(str, z);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.BaseVoiceChatWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZJ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LIZJ, false, 48).isSupported) {
            return;
        }
        C88440Kt0.LIZ(2131585643);
        this.LIZLLL.LIZ("stop_on_rtc_error");
    }

    private <T> void LIZ(Class<T> cls, Consumer<T> consumer) {
        if (PatchProxy.proxy(new Object[]{cls, consumer}, this, LIZJ, false, 26).isSupported) {
            return;
        }
        ((AbstractC81278I1w) C87010KQi.LIZ().LIZ((Class) cls).observeOn(AndroidSchedulers.mainThread()).m151as(C148062fT6.LIZ(this))).LIZ(consumer);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.k$a
    public final void LIZJ(long j, String str) {
        AbstractC78116Gqs abstractC78116Gqs;
        if (!PatchProxy.proxy(new Object[]{new Long(j), str}, this, LIZJ, false, 31).isSupported && (abstractC78116Gqs = this.LJJIIZI) != null) {
            abstractC78116Gqs.LIZ(j);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.BaseVoiceChatWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZIZ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LIZJ, false, 46).isSupported) {
            return;
        }
        HKH hkh = this.LJJIIJ;
        if (hkh != null) {
            hkh.LIZ();
        }
        C78997HCd c78997HCd = this.LIZLLL;
        if (c78997HCd != null && !PatchProxy.proxy(new Object[0], c78997HCd, C78997HCd.LIZ, false, 6).isSupported) {
            c78997HCd.f6666LJ = false;
            c78997HCd.LIZJ = false;
            C79046HEa.LIZ().LIZ((Integer) 0);
            if (c78997HCd.LJIIJ != null) {
                c78997HCd.LJIIJ.put("cmd_interact_state_change", new C5984am(8));
            }
            C87010KQi.LIZ().LIZ(new C4271i(1));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c
    public final void LIZIZ(long j, String str) {
        C4806x c4806x;
        if (!PatchProxy.proxy(new Object[]{new Long(j), str}, this, LIZJ, false, 83).isSupported && (c4806x = this.LJFF) != null) {
            LinkPlayerInfo LIZ = c4806x.LIZ(j, "");
            if (str == null) {
                str = "seat";
            }
            C116971W2r.LIZJ(H0W.LIZ(this.context, this.dataCenter, LIZ, str));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.k$a
    public final void LIZIZ(long j, Throwable th) {
        AbstractC78116Gqs abstractC78116Gqs;
        if (!PatchProxy.proxy(new Object[]{new Long(j), th}, this, LIZJ, false, 32).isSupported && (abstractC78116Gqs = this.LJJIIZI) != null) {
            abstractC78116Gqs.LIZ(j, th);
        }
    }

    public final void LIZ(int i, C8690o c8690o) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c8690o}, this, LIZJ, false, 62).isSupported) {
            return;
        }
        this.LJII.LIZ(new HHR(i, c8690o.LJIIIZ, true, c8690o.LIZLLL.LIZ, c8690o.LJII, null));
        this.LIZLLL.LIZIZ();
    }

    public VoiceChatRoomAnchorWidget(FragmentManager fragmentManager, AbstractC5436a abstractC5436a, AbstractC6071r abstractC6071r) {
        this.LJJ = fragmentManager;
        this.LJIL = abstractC5436a;
        this.LJJIFFI = abstractC6071r;
    }

    private void LIZ(MultiLiveCoreInfo multiLiveCoreInfo, MultiRtcInfo multiRtcInfo, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{multiLiveCoreInfo, multiRtcInfo, str, str2}, this, LIZJ, false, 40).isSupported) {
            return;
        }
        C79007HCn LJII = C79007HCn.LJII();
        LJII.LJIIJJI = multiLiveCoreInfo;
        LJII.LJIIIZ = multiRtcInfo;
        LJII.LJII = str2;
        LJII.LJIIIIZZ = str;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.AbstractC5004d
    public final void LIZ(final int i, final int i2, int i3, final String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, this, LIZJ, false, 75).isSupported || this.LJIJJ) {
            return;
        }
        this.LJIJJ = true;
        if (LJJJI() != null && this.LJIIIIZZ != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            this.LJIIZILJ.add(((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).switchScene(this.LJIIIIZZ.getId(), this.LJIIIIZZ.getId(), i, i2, i3, str).subscribeOn(Schedulers.m138io()).flatMap(HGR.LIZIZ).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer(this, i, i2, str, currentTimeMillis) { // from class: X.HD4
                public static ChangeQuickRedirect LIZ;
                public final VoiceChatRoomAnchorWidget LIZIZ;
                public final int LIZJ;
                public final int LIZLLL;

                /* renamed from: LJ */
                public final String f6680LJ;
                public final long LJFF;

                static {
                    Covode.recordClassIndex(30867);
                }

                {
                    this.LIZIZ = this;
                    this.LIZJ = i;
                    this.LIZLLL = i2;
                    this.f6680LJ = str;
                    this.LJFF = currentTimeMillis;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    VoiceChatRoomAnchorWidget voiceChatRoomAnchorWidget = this.LIZIZ;
                    int i4 = this.LIZJ;
                    int i5 = this.LIZLLL;
                    String str2 = this.f6680LJ;
                    long j = this.LJFF;
                    C5176i<C6152aj> c5176i = (C5176i) obj;
                    if (PatchProxy.proxy(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), str2, new Long(j), c5176i}, voiceChatRoomAnchorWidget, VoiceChatRoomAnchorWidget.LIZJ, false, 85).isSupported) {
                        return;
                    }
                    voiceChatRoomAnchorWidget.LJIJJ = false;
                    if (c5176i.LIZJ == null) {
                        HH8.LIZ(i4, i5, (Throwable) new Exception("params invalid"));
                        return;
                    }
                    TalkRoomBusinessFullLinkMonitor.LIZIZ.LIZ(i4, i5, 0, str2, j, c5176i);
                    if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5)}, null, HH8.LIZ, true, 110).isSupported && !PatchProxy.proxy(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), null, null, 12, null}, null, HH8.LIZ, true, 108).isSupported) {
                        HH8.LIZ(i4, i5, (Integer) null, (List<Integer>) null);
                    }
                    HashMap hashMap = new HashMap();
                    if (i4 == 5) {
                        hashMap.put("before_function", "chat_room");
                    } else if (i4 == 9) {
                        hashMap.put("before_function", "sing_room");
                    }
                    if (i5 == 5) {
                        if (i4 != i5) {
                            C88440Kt0.LIZ(2131585433);
                        }
                        hashMap.put("interact_function", "chat_room");
                    } else if (i5 == 9) {
                        C88440Kt0.LIZ(2131585434);
                        hashMap.put("interact_function", "sing_room");
                        C4574547f.LIZ().LIZ("anchor_ktv_open_success", Collections.emptyMap(), Room.class, C8668v.class);
                    }
                    C4574547f.LIZ().LIZ("anchor_switch_room_type", hashMap, Room.class, C8668v.class);
                    voiceChatRoomAnchorWidget.LIZ(c5176i.LIZJ, "switchSceneApi");
                    C78828H5q.LIZ(c5176i.LIZJ.LJIIJ, c5176i.LIZJ.LJIIJJI, i4);
                }
            }, new Consumer(this, i, i2, str, currentTimeMillis) { // from class: X.HEB
                public static ChangeQuickRedirect LIZ;
                public final VoiceChatRoomAnchorWidget LIZIZ;
                public final int LIZJ;
                public final int LIZLLL;

                /* renamed from: LJ */
                public final String f6711LJ;
                public final long LJFF;

                static {
                    Covode.recordClassIndex(30868);
                }

                {
                    this.LIZIZ = this;
                    this.LIZJ = i;
                    this.LIZLLL = i2;
                    this.f6711LJ = str;
                    this.LJFF = currentTimeMillis;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    VoiceChatRoomAnchorWidget voiceChatRoomAnchorWidget = this.LIZIZ;
                    int i4 = this.LIZJ;
                    int i5 = this.LIZLLL;
                    String str2 = this.f6711LJ;
                    long j = this.LJFF;
                    Throwable th = (Throwable) obj;
                    if (PatchProxy.proxy(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), str2, new Long(j), th}, voiceChatRoomAnchorWidget, VoiceChatRoomAnchorWidget.LIZJ, false, 84).isSupported) {
                        return;
                    }
                    voiceChatRoomAnchorWidget.LJIJJ = false;
                    TalkRoomBusinessFullLinkMonitor talkRoomBusinessFullLinkMonitor = TalkRoomBusinessFullLinkMonitor.LIZIZ;
                    if (str2 == null) {
                        str2 = "";
                    }
                    talkRoomBusinessFullLinkMonitor.LIZ(i4, i5, 0, str2, j, th);
                    HH8.LIZ(i4, i5, th);
                    C88469KtT.LIZ(voiceChatRoomAnchorWidget.context, th);
                }
            }));
        }
    }
}
