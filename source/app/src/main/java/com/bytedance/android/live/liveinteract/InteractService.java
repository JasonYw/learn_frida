package com.bytedance.android.live.liveinteract;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget;
import com.bytedance.android.live.liveinteract.api.BaseLinkMultiControlWidget;
import com.bytedance.android.live.liveinteract.api.BaseLinkRevControlWidget;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.data.p341a.p342a.a$a;
import com.bytedance.android.live.liveinteract.api.data.p341a.p342a.a$c;
import com.bytedance.android.live.liveinteract.api.p338b.AbstractC4265b;
import com.bytedance.android.live.liveinteract.bid.AbstractC4289e;
import com.bytedance.android.live.liveinteract.bid.C4287a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkControlWidget;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkMultiControlWidget;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkRevControlWidget;
import com.bytedance.android.live.liveinteract.doublepk.core.C4398a;
import com.bytedance.android.live.liveinteract.interact.audience.paid.C4441a;
import com.bytedance.android.live.liveinteract.linkroomfight.core.C4492d;
import com.bytedance.android.live.liveinteract.newpk.p377d.p378a.C4587a;
import com.bytedance.android.live.liveinteract.p343b.AbstractC4286c;
import com.bytedance.android.live.liveinteract.p356e.AbstractC4408a;
import com.bytedance.android.live.liveinteract.p356e.AbstractC4409d;
import com.bytedance.android.live.liveinteract.p356e.AbstractC4410g;
import com.bytedance.android.live.liveinteract.p357f.AbstractC4411b;
import com.bytedance.android.live.liveinteract.p382pk.AbstractC4725a;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.android.live.liveinteract.plantform.api.LinkAudienceApi;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.plantform.model.UserType;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4761ab;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4765af;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4770d;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4771e;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4772f;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4773g;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4776n;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4777o;
import com.bytedance.android.live.liveinteract.plantform.utils.InteractBusinessDegradeTask;
import com.bytedance.android.live.liveinteract.videotalk.battle.C4891b;
import com.bytedance.android.live.liveinteract.videotalk.paid.C4935a;
import com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.C4949a;
import com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c;
import com.bytedance.android.live.liveinteract.voicechat.AbstractC5004d;
import com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e;
import com.bytedance.android.live.liveinteract.voicechat.fight.C5056a;
import com.bytedance.android.live.liveinteract.voicechat.paid.C5077a;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.room.IMicRoomService;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.AbstractC5925ds;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.model.interact.C6163g;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y;
import com.bytedance.android.livesdk.config.C7013k;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.p723a.AbstractC8645j;
import com.bytedance.android.livesdk.rank.model.C9215d;
import com.bytedance.android.livesdk.widget.AbstractDialogC9363b;
import com.bytedance.android.livesdkapi.depend.live.ILiveRoomService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p763d.AbstractC9437e;
import com.bytedance.android.scope.generated.liveinteract__impl.__RunInScopeImpl$registerScopeServicesInModule$1;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.p1594ss.avframework.livestreamv2.core.Client;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p003X.AbstractC412712Vd;
import p003X.AbstractC413392Xt;
import p003X.AbstractC434073Fh;
import p003X.AbstractC77617Gip;
import p003X.AbstractC78050Gpo;
import p003X.AbstractC78380Gv8;
import p003X.AbstractC78986HBs;
import p003X.AbstractC79150HIa;
import p003X.AbstractC79168HIs;
import p003X.AbstractC79424HSo;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC81976ISs;
import p003X.AbstractC94837NXj;
import p003X.C101797Q7b;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C3BK;
import p003X.C3BL;
import p003X.C3BM;
import p003X.C444573iF;
import p003X.C447313mf;
import p003X.C4AR;
import p003X.C4CB;
import p003X.C78320GuA;
import p003X.C78359Gun;
import p003X.C78411Gvd;
import p003X.C78465GwV;
import p003X.C78466GwW;
import p003X.C78538Gxg;
import p003X.C78542Gxk;
import p003X.C78543Gxl;
import p003X.C78563Gy5;
import p003X.C78571GyD;
import p003X.C78613Gyt;
import p003X.C78669Gzn;
import p003X.C78748H2o;
import p003X.C78828H5q;
import p003X.C79108HGk;
import p003X.C79169HIt;
import p003X.C79242HLo;
import p003X.C79397HRn;
import p003X.C79399HRp;
import p003X.C80594Hpk;
import p003X.C80612Hq2;
import p003X.C80631HqL;
import p003X.C80690HrI;
import p003X.C80691HrJ;
import p003X.C80692HrK;
import p003X.C80693HrL;
import p003X.C80694HrM;
import p003X.C80695HrN;
import p003X.C80972Hvq;
import p003X.C80973Hvr;
import p003X.C88306Kqq;
import p003X.DialogC77613Gil;
import p003X.H05;
import p003X.H5N;
import p003X.H5O;
import p003X.H5P;
import p003X.H5Q;
import p003X.H5S;
import p003X.HHA;
import p003X.HIZ;
import p003X.HP5;
import p003X.HSG;
import p003X.IQV;

/* loaded from: classes3.dex */
public class InteractService implements IInteractService {
    public static ChangeQuickRedirect changeQuickRedirect;
    public C3BL audienceImp;
    public AbstractC4265b audioTalkImp;
    public C3BM commonImp;
    public AbstractC79424HSo multiAnchorOutService;
    public C3BK pkImp;
    public AbstractC412712Vd profileCardImp;
    public AbstractC434073Fh videoTalkImp;
    public InteractBusinessDegradeTask mVerticalDegradeTask = new InteractBusinessDegradeTask();
    public String FunctionTypeLogInjectorId = "FunctionTypeLogInjectorId";
    public String SubscribeLogInjectorId = "SubscribeLogInjectorId";

    static {
        Covode.recordClassIndex(25082);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public AbstractC4408a audioPaidLinkService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 55);
        if (proxy.isSupported) {
            return (AbstractC4408a) proxy.result;
        }
        return C5077a.LIZJ.LIZIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public AbstractC4725a doublePkService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51);
        if (proxy.isSupported) {
            return (AbstractC4725a) proxy.result;
        }
        return C4398a.LIZJ.LIZIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public AbstractC4289e getBidLinkMicService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 52);
        if (proxy.isSupported) {
            return (AbstractC4289e) proxy.result;
        }
        return C4287a.LIZJ.LIZIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public String getCurrentFunctionType() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return C78828H5q.LIZLLL();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public AbstractC6524y.AbstractView$OnClickListenerC6525b getDigitAvatarBehavior() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 61);
        if (proxy.isSupported) {
            return (AbstractC6524y.AbstractView$OnClickListenerC6525b) proxy.result;
        }
        return new C78748H2o();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public String getFunctionType2() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 57);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return C78828H5q.LIZIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public String getFunctionType2BeforeReset() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 72);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return C78828H5q.LIZIZ;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public AbstractC4411b getSelfDisciplineService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 59);
        if (proxy.isSupported) {
            return (AbstractC4411b) proxy.result;
        }
        return C4949a.f26454LJ.LIZJ();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public AbstractC81976ISs guestBattleContext() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48);
        if (proxy.isSupported) {
            return (AbstractC81976ISs) proxy.result;
        }
        return C4891b.LJIIL();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public void handleInteractClick() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31).isSupported && AbstractC78050Gpo.LIZ() != null) {
            AbstractC78050Gpo.LIZ().LJJIII();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public AbstractC4409d interactPaidLinkService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 53);
        if (proxy.isSupported) {
            return (AbstractC4409d) proxy.result;
        }
        return C4441a.LIZJ.LIZIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public AbstractC78380Gv8 linkRoomFightService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50);
        if (proxy.isSupported) {
            return (AbstractC78380Gv8) proxy.result;
        }
        return C4492d.LIZLLL.LIZIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public Pair<String, AbstractC8645j> provideFunctionType2LogInjector() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 64);
        if (proxy.isSupported) {
            return (Pair) proxy.result;
        }
        return Pair.create("CommonParamsLogInjectorId", C78563Gy5.LIZIZ);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public Pair<String, AbstractC8645j> provideFunctionTypeLogInjector() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 62);
        if (proxy.isSupported) {
            return (Pair) proxy.result;
        }
        return Pair.create(this.FunctionTypeLogInjectorId, C78466GwW.LIZIZ);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public Pair<String, AbstractC8645j> providePlayModeLogInjector() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 63);
        if (proxy.isSupported) {
            return (Pair) proxy.result;
        }
        return Pair.create("LivePlayModeLogInjectorId", C78465GwV.LIZIZ);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public Pair<String, AbstractC8645j> provideSubscribeLogInjector() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 70);
        if (proxy.isSupported) {
            return (Pair) proxy.result;
        }
        return Pair.create(this.SubscribeLogInjectorId, C4AR.LIZIZ);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public AbstractC4410g videoPaidLinkService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 54);
        if (proxy.isSupported) {
            return (AbstractC4410g) proxy.result;
        }
        return C4935a.LIZJ.LIZIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public SurfaceView getAnchorLinkmicSurfaceView() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24);
        if (proxy.isSupported) {
            return (SurfaceView) proxy.result;
        }
        if (AbstractC4773g.LJIIJJI.LIZ() != null) {
            return AbstractC4773g.LJIIJJI.LIZ().LJI();
        }
        if (AbstractC4767ah.LIZIZ.LIZ() != null) {
            return AbstractC4767ah.LIZIZ.LIZ().LJIIJJI();
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public AbstractC4265b getAudioTalkService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return (AbstractC4265b) proxy.result;
        }
        if (this.audioTalkImp == null) {
            this.audioTalkImp = new C78669Gzn();
        }
        return this.audioTalkImp;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public List<Integer> getCurrentPlayModes() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        C5923dp c5923dp = (C5923dp) IQV.LIZ(C5923dp.class);
        if (c5923dp != null && c5923dp.LJJZZIII().LIZIZ() != null) {
            return c5923dp.LJJZZIII().LIZIZ().LIZIZ().LIZJ;
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public int getCurrentUiLayout() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C5923dp c5923dp = (C5923dp) IQV.LIZ(C5923dp.class);
        if (c5923dp == null || c5923dp.LJJZZIII().LIZIZ() == null) {
            return 0;
        }
        return c5923dp.LJJZZIII().LIZIZ().LJI().LIZIZ;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public C3BL getInteractAudienceService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return (C3BL) proxy.result;
        }
        if (this.audienceImp == null) {
            this.audienceImp = new C78542Gxk();
        }
        return this.audienceImp;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public int getLinkMode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC4774i LIZ = AbstractC78050Gpo.LIZ();
        if (LIZ == null) {
            return 0;
        }
        return LIZ.LJJIFFI();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public AbstractC79424HSo getMultiAnchorService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return (AbstractC79424HSo) proxy.result;
        }
        if (this.multiAnchorOutService == null) {
            this.multiAnchorOutService = new HP5();
        }
        return this.multiAnchorOutService;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public ArrayList<LinkPlayerInfo> getOnlineList() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34);
        if (proxy.isSupported) {
            return (ArrayList) proxy.result;
        }
        if (AbstractC4766ag.LIZ.LIZ() != null) {
            return AbstractC4766ag.LIZ.LIZ().LJI();
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public C3BK getPkService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return (C3BK) proxy.result;
        }
        if (this.pkImp == null) {
            this.pkImp = new C79397HRn();
        }
        return this.pkImp;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public AbstractC412712Vd getProfileCardOutService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13);
        if (proxy.isSupported) {
            return (AbstractC412712Vd) proxy.result;
        }
        if (this.profileCardImp == null) {
            this.profileCardImp = new C78359Gun();
        }
        return this.profileCardImp;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public AbstractC434073Fh getVideoTalkService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return (AbstractC434073Fh) proxy.result;
        }
        if (this.videoTalkImp == null) {
            this.videoTalkImp = new C78543Gxl();
        }
        return this.videoTalkImp;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public boolean isLiveShakeEnable() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 60);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return AbstractC80293Hkt.f7073bv.LIZ().booleanValue();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public boolean isPaidInteractAudienceOnOrBiddingOpen() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 69);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!C78538Gxg.LJI() && !C78320GuA.LIZ()) {
            return false;
        }
        return true;
    }

    public InteractService() {
        ServiceManager.registerService(IInteractService.class, this);
        if (!PatchProxy.proxy(new Object[0], null, H5P.LIZ, true, 1).isSupported && !PatchProxy.proxy(new Object[0], null, H5Q.LIZ, true, 1).isSupported) {
            C444573iF.LIZ(C101797Q7b.LIZJ, AbstractC5925ds.class, C4587a.class, null, __RunInScopeImpl$registerScopeServicesInModule$1.INSTANCE, null, 20, null);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public C3BM getCommonService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return (C3BM) proxy.result;
        }
        int linkMode = getLinkMode();
        if (C79169HIt.LIZIZ(linkMode, 32)) {
            return getVideoTalkService();
        }
        if (C79169HIt.LIZIZ(linkMode, 8)) {
            return getAudioTalkService();
        }
        if (C79169HIt.LIZIZ(linkMode, 4)) {
            return getPkService();
        }
        if (C79169HIt.LIZIZ(linkMode, 64)) {
            return getMultiAnchorService();
        }
        if (C79169HIt.LIZIZ(linkMode, 2)) {
            return getInteractAudienceService();
        }
        if (this.commonImp == null) {
            this.commonImp = new H5O();
        }
        return this.commonImp;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public String getFunctionTypeForLog() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 66);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        int currentScene = getCurrentScene();
        if (currentScene != 4) {
            if (currentScene != 5) {
                if (currentScene == 8) {
                    return "radio";
                }
                if (currentScene != 9) {
                    if (currentScene != 12) {
                        if (currentScene != 13) {
                            return "live";
                        }
                        return "ktv";
                    }
                    return "party";
                }
                return "ktv";
            }
            C5923dp c5923dp = (C5923dp) IQV.LIZ(C5923dp.class);
            if (c5923dp == null || c5923dp.LIZ().LIZ() == null || !C78571GyD.LIZ(c5923dp.LIZ().LIZ())) {
                return "radio";
            }
            return "party";
        }
        return "audience";
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public Client getGuestRtcClient() {
        HHA LJIJI;
        HHA LJIILIIL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 71);
        if (proxy.isSupported) {
            return (Client) proxy.result;
        }
        if (getPkService().LJIIIZ() == 1) {
            AbstractC4761ab LIZ = AbstractC4761ab.LIZ.LIZ();
            if (LIZ != null && (LJIILIIL = LIZ.LJIILIIL()) != null) {
                return LJIILIIL.LIZIZ;
            }
            return null;
        }
        AbstractC4770d LIZ2 = AbstractC4770d.LIZ.LIZ();
        if (LIZ2 != null && (LJIJI = LIZ2.LJIJI()) != null) {
            return LJIJI.LIZIZ;
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public String getLinkAnchorCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        int linkMode = getLinkMode();
        if (C79169HIt.LIZIZ(linkMode, 64)) {
            AbstractC79424HSo multiAnchorService = getMultiAnchorService();
            if (multiAnchorService.LIZJ() == 2) {
                return "2";
            }
            if (multiAnchorService.LIZJ() == 3) {
                return PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START;
            }
            if (multiAnchorService.LIZJ() != 4) {
                return "1";
            }
            return "4";
        } else if (!C79169HIt.LIZIZ(linkMode, 4)) {
            return "1";
        } else {
            return "2";
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public String getLinkConnectionType() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        int linkMode = getLinkMode();
        if (C79169HIt.LIZIZ(linkMode, 64)) {
            return "anchor";
        }
        if (C79169HIt.LIZIZ(linkMode, 4)) {
            if (LinkCrossRoomDataHolder.LJII().LJIJJLI == 0) {
                return "manual_pk";
            }
            if (LinkCrossRoomDataHolder.LJII().LJIJJLI == 1) {
                return "random_pk";
            }
            if (LinkCrossRoomDataHolder.LJII().LJIJJLI == 3) {
                return "match_bell";
            }
            return "";
        } else if (!C79169HIt.LIZIZ(linkMode, 2) && !C79169HIt.LIZIZ(linkMode, 8) && !C79169HIt.LIZIZ(linkMode, 32)) {
            if (C79169HIt.LIZIZ(linkMode, 128)) {
                return "game_anchor_connection";
            }
            return "";
        } else {
            return "audience";
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public String getLiveTypeForLog() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 65);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C5923dp c5923dp = (C5923dp) IQV.LIZ(C5923dp.class);
        if (c5923dp == null || c5923dp.LIZ().LIZ() == null) {
            return "";
        }
        if (c5923dp.LIZ().LIZ().getStreamType() == LiveMode.VIDEO) {
            return "video_live";
        }
        if (c5923dp.LIZ().LIZ().getStreamType() == LiveMode.AUDIO) {
            return "voice_live";
        }
        if (c5923dp.LIZ().LIZ().getStreamType() == LiveMode.SCREEN_RECORD) {
            return "game";
        }
        if (c5923dp.LIZ().LIZ().getStreamType() != LiveMode.THIRD_PARTY) {
            return "";
        }
        return "third_party";
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public AbstractC78986HBs<LinkPlayerInfo> getPkLinkUserInfoCenter() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16);
        if (proxy.isSupported) {
            return (AbstractC78986HBs) proxy.result;
        }
        if (C79169HIt.LIZIZ(getLinkMode(), 4)) {
            if (AbstractC4777o.LIZ.LIZ() != null) {
                return AbstractC4777o.LIZ.LIZ().LIZJ();
            }
            if (AbstractC4776n.LIZ.LIZ() != null) {
                return AbstractC4776n.LIZ.LIZ().LIZLLL();
            }
            return null;
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService, p003X.AbstractC91338Lye
    public boolean isAudienceLinkEngineOn() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (AbstractC4773g.LJIIJJI.LIZ() != null) {
            return AbstractC4773g.LJIIJJI.LIZ().LJIILIIL();
        }
        AbstractC5003c LIZ = AbstractC5003c.LIZ.LIZ();
        if (LIZ != null) {
            return LIZ.LJIIJ();
        }
        if (AbstractC4767ah.LIZIZ.LIZ() == null) {
            return false;
        }
        return AbstractC4767ah.LIZIZ.LIZ().LJIIIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public boolean isEnableTalkRoomEmoji() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (LiveSettingKeys.LIVE_INTERACT_EMOJI_DISABLE.getValue().booleanValue()) {
            return false;
        }
        int linkMode = getLinkMode();
        if (C79169HIt.LIZIZ(linkMode, 32)) {
            return AbstractC80293Hkt.f6963R.LIZ().booleanValue();
        }
        if (!C79169HIt.LIZIZ(linkMode, 8)) {
            return false;
        }
        return AbstractC80293Hkt.f6977aE.LIZ().booleanValue();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public AbstractC4286c teamFightService() {
        AbstractC413392Xt<AbstractC4286c> LIZLLL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49);
        if (proxy.isSupported) {
            return (AbstractC4286c) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], null, C5056a.LIZ, true, 14);
        if (proxy2.isSupported) {
            return (AbstractC4286c) proxy2.result;
        }
        C78411Gvd c78411Gvd = C5056a.LIZJ;
        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], c78411Gvd, C78411Gvd.LIZ, false, 2);
        if (proxy3.isSupported) {
            return (AbstractC4286c) proxy3.result;
        }
        C5056a LIZ = c78411Gvd.LIZ();
        if (LIZ == null || (LIZLLL = LIZ.LIZLLL()) == null) {
            return null;
        }
        return LIZLLL.LIZIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService, p003X.AbstractC91338Lye
    public int getCurrentScene() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (AbstractC5004d.LIZIZ.LIZ() != null) {
            return AbstractC5004d.LIZIZ.LIZ().LJIJI();
        }
        if (AbstractC5015e.LIZIZ.LIZ() != null) {
            return AbstractC5015e.LIZIZ.LIZ().LJIJJLI();
        }
        if (AbstractC4772f.LIZ.LIZ() != null || AbstractC4773g.LJIIJJI.LIZ() != null) {
            return 4;
        }
        if (AbstractC4766ag.LIZ.LIZ() == null && AbstractC4767ah.LIZIZ.LIZ() == null) {
            AbstractC4774i LIZ = AbstractC78050Gpo.LIZ();
            if (LIZ == null) {
                return 0;
            }
            if (C79169HIt.LIZIZ(LIZ.LJJIFFI(), 4)) {
                return 1;
            }
            if (!C79169HIt.LIZIZ(LIZ.LJJIFFI(), 64)) {
                return 0;
            }
            return 7;
        }
        C5923dp c5923dp = (C5923dp) IQV.LIZ(C5923dp.class);
        if (c5923dp != null) {
            if (c5923dp.LJJZZIII().LIZIZ() != null && c5923dp.LJJZZIII().LIZIZ().LIZIZ().LIZIZ == 12) {
                return 12;
            }
            if (c5923dp.LJJZZIII().LIZIZ() != null && c5923dp.LJJZZIII().LIZIZ().LIZIZ().LIZIZ == 13) {
                return 13;
            }
            if (c5923dp.LJJZZIII().LIZIZ() != null && c5923dp.LJJZZIII().LIZIZ().LIZIZ().LIZIZ == 16) {
                return 16;
            }
            return 8;
        }
        return 8;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public AbstractC78986HBs<LinkPlayerInfo> getLinkUserInfoCenter() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15);
        if (proxy.isSupported) {
            return (AbstractC78986HBs) proxy.result;
        }
        int linkMode = getLinkMode();
        if (C79169HIt.LIZIZ(linkMode, 32)) {
            if (AbstractC4766ag.LIZ.LIZ() != null) {
                return AbstractC4766ag.LIZ.LIZ().LIZLLL();
            }
            if (AbstractC4765af.LIZ.LIZ() != null) {
                return AbstractC4765af.LIZ.LIZ().LJIIIIZZ();
            }
            return null;
        } else if (C79169HIt.LIZIZ(linkMode, 8)) {
            if (AbstractC5003c.LIZ.LIZ() != null) {
                return AbstractC5003c.LIZ.LIZ().LJII();
            }
            if (AbstractC5004d.LIZIZ.LIZ() != null) {
                return AbstractC5004d.LIZIZ.LIZ().LJII();
            }
            return null;
        } else if (C79169HIt.LIZIZ(linkMode, 2)) {
            if (AbstractC4772f.LIZ.LIZ() != null) {
                return AbstractC4772f.LIZ.LIZ().LJFF();
            }
            if (AbstractC4771e.LIZ.LIZ() != null) {
                return AbstractC4771e.LIZ.LIZ().LIZ();
            }
            return null;
        } else {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r4 != 9) goto L13;
     */
    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean hasEmptySeatForLink() {
        /*
            r5 = this;
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.InteractService.changeQuickRedirect
            r0 = 40
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r3, r5, r1, r2, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L18:
            int r4 = r5.getCurrentScene()
            r1 = 5
            r0 = 1
            r3 = 9
            if (r4 == r1) goto L4b
            r0 = 12
            if (r4 == r0) goto L68
            r0 = 8
            if (r4 == r0) goto L2d
            if (r4 == r3) goto L4b
        L2c:
            return r2
        L2d:
            X.Gy9 r0 = com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah.LIZIZ
            com.bytedance.android.live.liveinteract.plantform.a.ah r1 = r0.LIZ()
            if (r1 == 0) goto L84
            X.HBs r0 = r1.LJIIIIZZ()
            if (r0 == 0) goto L84
            X.HBs r0 = r1.LJIIIIZZ()
            java.util.List r0 = r0.LIZJ()
            int r1 = r0.size()
            r0 = 7
            if (r1 >= r0) goto L2c
            goto L84
        L4b:
            X.Gzq r0 = com.bytedance.android.live.liveinteract.voicechat.AbstractC5015e.LIZIZ
            com.bytedance.android.live.liveinteract.voicechat.e r1 = r0.LIZ()
            if (r1 == 0) goto L84
            X.HBs r0 = r1.LJII()
            if (r0 == 0) goto L84
            X.HBs r0 = r1.LJII()
            java.util.List r0 = r0.LIZJ()
            int r0 = r0.size()
            if (r0 >= r3) goto L2c
            goto L84
        L68:
            X.Gy9 r0 = com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah.LIZIZ
            com.bytedance.android.live.liveinteract.plantform.a.ah r1 = r0.LIZ()
            if (r1 == 0) goto L84
            X.HBs r0 = r1.LJIIIIZZ()
            if (r0 == 0) goto L84
            X.HBs r0 = r1.LJIIIIZZ()
            java.util.List r0 = r0.LIZJ()
            int r0 = r0.size()
            if (r0 >= r3) goto L2c
        L84:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.InteractService.hasEmptySeatForLink():boolean");
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public void updateFunctionType2(Room room) {
        if (!PatchProxy.proxy(new Object[]{room}, this, changeQuickRedirect, false, 56).isSupported && room.linkerDetail != null) {
            C79108HGk.LIZ(room.linkerDetail);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public void updateSwitchSceneSource(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 58).isSupported) {
            return;
        }
        C78828H5q.LIZ(str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public void addBusinessDegradeStrategy(C7013k c7013k) {
        if (PatchProxy.proxy(new Object[]{c7013k}, this, changeQuickRedirect, false, 4).isSupported || c7013k == null) {
            return;
        }
        if (!this.mVerticalDegradeTask.isInit) {
            this.mVerticalDegradeTask.init();
        }
        this.mVerticalDegradeTask.addBusinessDegradeStrategy(c7013k);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public boolean isMicRoomHost(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 21);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (AbstractC78050Gpo.LIZ() == null) {
            return false;
        }
        return AbstractC78050Gpo.LIZ().LIZ(j);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public void resetAnchorLinkmicSurfaceView(SurfaceView surfaceView) {
        if (PatchProxy.proxy(new Object[]{surfaceView}, this, changeQuickRedirect, false, 25).isSupported) {
            return;
        }
        if (AbstractC4773g.LJIIJJI.LIZ() != null) {
            AbstractC4773g.LJIIJJI.LIZ().LIZ(surfaceView);
        } else if (AbstractC4767ah.LIZIZ.LIZ() != null) {
            AbstractC4767ah.LIZIZ.LIZ().LIZ(surfaceView);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public void clickLinkRoomFightIcon(String str) {
        C4492d LIZ;
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 29).isSupported && (LIZ = C4492d.LIZLLL.LIZ()) != null && LIZ.LIZ().LIZIZ() != null) {
            if (LIZ.LIZJ().LIZ().LIZ()) {
                LIZ.LIZ().LIZIZ().LIZ(str);
            } else {
                LIZ.LIZ().LIZIZ().LIZLLL();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public boolean isAnonymousUser(Long l) {
        List<LinkPlayerInfo> arrayList;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{l}, this, changeQuickRedirect, false, 17);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (((IInteractService) ServiceManager.getService(IInteractService.class)).getLinkUserInfoCenter() != null) {
            arrayList = ((IInteractService) ServiceManager.getService(IInteractService.class)).getLinkUserInfoCenter().LIZJ();
        } else {
            arrayList = new ArrayList<>();
        }
        ArrayList arrayList2 = new ArrayList();
        if (C447313mf.LIZ((Collection) arrayList)) {
            for (LinkPlayerInfo linkPlayerInfo : arrayList) {
                if (linkPlayerInfo != null && linkPlayerInfo.LIZ() != null && linkPlayerInfo.LJJJIL) {
                    arrayList2.add(Long.valueOf(linkPlayerInfo.LIZ().getId()));
                }
            }
        }
        return arrayList2.contains(l);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public String changeMode2String(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 20);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C5923dp c5923dp = (C5923dp) IQV.LIZ(C5923dp.class);
        if (c5923dp != null && c5923dp.LJJLIIIJLLLLLLLZ().LIZ().booleanValue()) {
            return "voice_sing_room";
        }
        if (C79169HIt.LIZIZ(i, 64)) {
            return "video_anchor_connect";
        }
        if (C79169HIt.LIZIZ(i, 32)) {
            if (getCurrentScene() == 12) {
                return "video_friend_room";
            }
            if (getCurrentScene() == 13) {
                return "video_sing_room";
            }
            return "video_audience_multi";
        } else if (C79169HIt.LIZIZ(i, 8)) {
            return "voice_audience_multi";
        } else {
            if (C79169HIt.LIZIZ(i, 4)) {
                return "video_anchor_pk";
            }
            if (C79169HIt.LIZIZ(i, 2)) {
                return "video_audience_double";
            }
            if (c5923dp != null && ((IMicRoomService) ServiceManager.getService(IMicRoomService.class)).isMicRoom(c5923dp.LIZ().LIZ())) {
                return "video_anchor_order";
            }
            return "";
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public void openInvitePanel(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41).isSupported) {
            return;
        }
        if (C79169HIt.LIZIZ(getLinkMode(), 32)) {
            if (AbstractC4766ag.LIZ.LIZ() != null) {
                AbstractC4766ag.LIZ.LIZ().LIZ(1, "", -1, str);
            } else if (((IUserService) ServiceManager.getService(IUserService.class)).user().LJI() && AbstractC4765af.LIZ.LIZ() != null) {
                AbstractC4765af.LIZ.LIZ().LIZ(1, "", -1, str);
            } else if (AbstractC4767ah.LIZIZ.LIZ() != null) {
                AbstractC4767ah.LIZIZ.LIZ().LIZ("", -1, str);
            }
        } else if (C79169HIt.LIZIZ(getLinkMode(), 8)) {
            if (AbstractC5004d.LIZIZ.LIZ() != null) {
                AbstractC5004d.LIZIZ.LIZ().LIZ(false, "", -1, str);
            } else if (((IUserService) ServiceManager.getService(IUserService.class)).user().LJI() && AbstractC5003c.LIZ.LIZ() != null) {
                AbstractC5003c.LIZ.LIZ().LIZ(false, "", -1, str);
            } else if (AbstractC5015e.LIZIZ.LIZ() != null) {
                AbstractC5015e.LIZIZ.LIZ().LIZIZ(false, "", -1, str);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public UserType tryGetTargetUserType(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 45);
        if (proxy.isSupported) {
            return (UserType) proxy.result;
        }
        Room currentRoom = ((ILiveRoomService) ServiceManager.getService(IRoomService.class)).getCurrentRoom();
        if (currentRoom != null && currentRoom.ownerUserId == j) {
            return UserType.ANCHOR;
        }
        if (C79169HIt.LIZIZ(getLinkMode(), 32)) {
            if (AbstractC4766ag.LIZ.LIZ() != null) {
                AbstractC4766ag LIZ = AbstractC4766ag.LIZ.LIZ();
                if (LIZ.LIZLLL() != null && LIZ.LIZLLL().LIZIZ(j, "") != null) {
                    return UserType.AUDIENCE;
                }
                return UserType.GUEST;
            } else if (AbstractC4767ah.LIZIZ.LIZ() != null) {
                AbstractC4767ah LIZ2 = AbstractC4767ah.LIZIZ.LIZ();
                if (LIZ2.LJIIIIZZ() != null && LIZ2.LJIIIIZZ().LIZIZ(j, "") != null) {
                    return UserType.AUDIENCE;
                }
                return UserType.GUEST;
            }
        } else if (C79169HIt.LIZIZ(getLinkMode(), 8)) {
            if (AbstractC5004d.LIZIZ.LIZ() != null) {
                AbstractC5004d LIZ3 = AbstractC5004d.LIZIZ.LIZ();
                if (LIZ3.LJII() != null && LIZ3.LJII().LIZIZ(j, "") != null) {
                    return UserType.AUDIENCE;
                }
                return UserType.GUEST;
            } else if (AbstractC5015e.LIZIZ.LIZ() != null) {
                AbstractC5015e LIZ4 = AbstractC5015e.LIZIZ.LIZ();
                if (LIZ4.LJII() != null && LIZ4.LJII().LIZIZ(j, "") != null) {
                    return UserType.AUDIENCE;
                }
                return UserType.GUEST;
            }
        }
        return UserType.UNKNOWN;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean enableCaptureAudioOnBackground(boolean r11) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.InteractService.enableCaptureAudioOnBackground(boolean):boolean");
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public void resetBusinessDegradeStrategy(int i, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        this.mVerticalDegradeTask.resetBusinessDegradeStrategy(i, str);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public void onDownGradeInfo(boolean z, int i) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        this.mVerticalDegradeTask.onDownGradeInfo(z, i);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public void openEmojiDialog(long j, String str) {
        String liveTypeForLog;
        if (!PatchProxy.proxy(new Object[]{new Long(j), str}, this, changeQuickRedirect, false, 42).isSupported && (liveTypeForLog = getLiveTypeForLog()) != null) {
            if (TextUtils.equals(liveTypeForLog, "voice_live")) {
                getAudioTalkService().LIZ(j, str);
            } else if (TextUtils.equals(liveTypeForLog, "video_live")) {
                getVideoTalkService().LIZ(j, str);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public BaseLinkControlWidget createLinkControlWidget(HIZ hiz, ViewGroup viewGroup, Boolean bool) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{hiz, viewGroup, bool}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (BaseLinkControlWidget) proxy.result;
        }
        return new LinkControlWidget(hiz, viewGroup, bool);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public BaseLinkMultiControlWidget createLinkMultiControlWidget(AbstractC79168HIs abstractC79168HIs, ViewGroup viewGroup, Boolean bool) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC79168HIs, viewGroup, bool}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (BaseLinkMultiControlWidget) proxy.result;
        }
        return new LinkMultiControlWidget(abstractC79168HIs, bool);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public BaseLinkRevControlWidget createLinkRevControlWidget(AbstractC79150HIa abstractC79150HIa, ViewGroup viewGroup, Boolean bool) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC79150HIa, viewGroup, bool}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (BaseLinkRevControlWidget) proxy.result;
        }
        return new LinkRevControlWidget(abstractC79150HIa, viewGroup, bool.booleanValue());
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public AbstractC94837NXj createLiveSeiHelper(a$a a_a, HSG hsg, a$c a_c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{a_a, hsg, a_c}, this, changeQuickRedirect, false, 14);
        if (proxy.isSupported) {
            return (AbstractC94837NXj) proxy.result;
        }
        return new C79399HRp(a_a, hsg, a_c);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public Single<C5176i<C6163g>> getUserWaitingRankPosition(long j, long j2, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 32);
        if (proxy.isSupported) {
            return (Single) proxy.result;
        }
        return ((LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class)).getUserWaitingRankPosition(j, j2, i, 0);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public void showLynxGuestContributionRankList(Context context, User user, Room room) {
        if (PatchProxy.proxy(new Object[]{context, user, room}, this, changeQuickRedirect, false, 68).isSupported) {
            return;
        }
        C78613Gyt c78613Gyt = C78613Gyt.LIZIZ;
        if (!PatchProxy.proxy(new Object[]{context, user, room}, c78613Gyt, C78613Gyt.LIZ, false, 6).isSupported) {
            C78613Gyt.LIZ(c78613Gyt, context, user, room, false, 8, (Object) null);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public AbstractC9437e getInteractFeedView(Context context, int i, int i2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 47);
        if (proxy.isSupported) {
            return (AbstractC9437e) proxy.result;
        }
        if (i == 6) {
            return new C4CB(context, i2);
        }
        if (i == 9) {
            return new C80692HrK(context, i2);
        }
        if (i == 17) {
            return new C80612Hq2(context, i2);
        }
        if (i == 13) {
            return new C80691HrJ(context, i2);
        }
        if (i == 12) {
            return new C80972Hvq(context, i2);
        }
        if (i == 15) {
            return new C80694HrM(context, i2);
        }
        if (i == 11) {
            return new C80693HrL(context, i2);
        }
        if (i == 10) {
            return new C80973Hvr(context, i2);
        }
        if (i == 10 && (i2 == 1 || i2 == 5)) {
            return new C80695HrN(context, i2);
        }
        if (i == 10) {
            if (i2 == 4) {
                return new C80695HrN(context, i2);
            }
            return null;
        }
        if (i == -1 || i == 3) {
            if (i2 == 5) {
                return new C80594Hpk(context, i2);
            }
            if (i2 == 4 && LiveSettingKeys.SEARCH_PREVIEW_AUDIO_ROOM_ENABLE.getValue().booleanValue()) {
                return new C80594Hpk(context, i2);
            }
        }
        if (i == 16) {
            return new C80631HqL(context, i2);
        }
        if (i == 18) {
            return new C80690HrI(context, i2);
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public void handleInteractState(DataCenter dataCenter, String str, H5N h5n) {
        int i = 2;
        if (PatchProxy.proxy(new Object[]{dataCenter, str, h5n}, this, changeQuickRedirect, false, 18).isSupported || dataCenter == null) {
            return;
        }
        int intValue = ((Integer) dataCenter.get("data_link_state", (String) 0)).intValue();
        if (!getPkService().LJII() && LinkCrossRoomDataHolder.LJII().LIZLLL == 0) {
            if (intValue == 0) {
                h5n.LIZ();
                return;
            }
            if (intValue == 2) {
                if (!getInteractAudienceService().LIZIZ()) {
                    if (AbstractC4772f.LIZ.LIZ() != null) {
                        if (AbstractC4772f.LIZ.LIZ().LJIIIIZZ()) {
                            AbstractC4772f.LIZ.LIZ().LIZ(h5n);
                            AbstractC4772f.LIZ.LIZ().mo15718LJ("intimate_exclude");
                            return;
                        }
                        h5n.LIZ();
                        return;
                    }
                    return;
                }
            } else if (LinkCrossRoomDataHolder.LJII().LJIIJJI > 0) {
                i = 1;
            }
            h5n.LIZ(i);
            return;
        }
        if (LinkCrossRoomDataHolder.LJII().LJIIJJI > 0) {
            i = 1;
        }
        h5n.LIZ(i);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public void kickOutLinkUserInChatRoom(long j, String str, String str2) {
        boolean z;
        User user;
        if (!PatchProxy.proxy(new Object[]{new Long(j), str, str2}, this, changeQuickRedirect, false, 23).isSupported && ServiceManager.getService(IUserService.class) != null && ServiceManager.getService(IRoomService.class) != null && ((ILiveRoomService) ServiceManager.getService(IRoomService.class)).getCurrentRoom() != null) {
            if (((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ() == ((ILiveRoomService) ServiceManager.getService(IRoomService.class)).getCurrentRoom().ownerUserId) {
                z = true;
            } else {
                z = false;
            }
            int linkMode = getLinkMode();
            if (C79169HIt.LIZIZ(linkMode, 32)) {
                if (z) {
                    if (AbstractC4766ag.LIZ.LIZ() != null) {
                        AbstractC4766ag.LIZ.LIZ().LIZ(j, str);
                    }
                } else if (((IUserService) ServiceManager.getService(IUserService.class)).user().LJI() && AbstractC4765af.LIZ.LIZ() != null) {
                    AbstractC4765af.LIZ.LIZ().LIZ(j, str);
                }
            } else if (C79169HIt.LIZIZ(linkMode, 8) || C79169HIt.LIZIZ(linkMode, 2)) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str, str2}, null, C79242HLo.LIZ, true, 28);
                if (proxy.isSupported) {
                    user = (User) proxy.result;
                } else {
                    C106862S5w.LIZ(str, str2);
                    user = new User();
                    user.setId(j);
                    user.setSecUid(str);
                    user.setNickName(str2);
                }
                if (z) {
                    if (AbstractC4772f.LIZ.LIZ() != null) {
                        AbstractC4772f.LIZ.LIZ().LIZ(j, str, "anchor_stop_normal");
                    } else if (AbstractC4777o.LIZ.LIZ() != null) {
                        AbstractC4777o.LIZ.LIZ().LIZ(j, str, "anchor_stop_normal");
                    } else {
                        AbstractC5003c LIZ = AbstractC5003c.LIZ.LIZ();
                        if (LIZ != null) {
                            LIZ.LIZ(user);
                        }
                    }
                } else if (((IUserService) ServiceManager.getService(IUserService.class)).user().LJI()) {
                    if (AbstractC4771e.LIZ.LIZ() != null) {
                        AbstractC4771e.LIZ.LIZ().LIZ(j, str, "admin_stop_normal");
                    } else if (AbstractC4776n.LIZ.LIZ() != null) {
                        AbstractC4776n.LIZ.LIZ().LIZ(j, str, "anchor_stop_normal");
                    } else {
                        AbstractC5003c LIZ2 = AbstractC5003c.LIZ.LIZ();
                        if (LIZ2 != null) {
                            LIZ2.LIZ(user);
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public String getDisplayTicketStr(long j, List<Long> list, String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), list, str, str2}, this, changeQuickRedirect, false, 67);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return H5S.LIZIZ.LIZ(Long.valueOf(j), list, str, str2);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public Observable<C5176i<C9215d>> syncLinkerRankList(long j, String str, String str2, long j2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str, str2, new Long(j2)}, this, changeQuickRedirect, false, 22);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        return ((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).getLinkerRankList(j, str, str2, j2);
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public AbstractDialogC9363b getDynamicEmojiDialog(Context context, DataCenter dataCenter, String str, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, dataCenter, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 28);
        if (proxy.isSupported) {
            return (AbstractDialogC9363b) proxy.result;
        }
        H05 LIZ = new H05().LIZ(context).LIZ(dataCenter).LIZ(false).LIZ(str);
        LIZ.f6533LJ = false;
        LIZ.LJFF = z;
        return LIZ.LIZJ();
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public void setCposition(long j, long j2, boolean z, Function1<Boolean, Unit> function1) {
        if (!PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0), function1}, this, changeQuickRedirect, false, 35).isSupported && AbstractC4766ag.LIZ.LIZ() != null) {
            AbstractC4766ag.LIZ.LIZ().LIZ(j, j2, z, function1);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public void switchScene(int i, int i2, String str, Integer num) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, num}, this, changeQuickRedirect, false, 33).isSupported) {
            return;
        }
        if (AbstractC5004d.LIZIZ.LIZ() != null) {
            if (num == null) {
                num = 0;
            }
            if (AbstractC5004d.LIZIZ.LIZ() != null) {
                AbstractC5004d.LIZIZ.LIZ().LIZ(i, i2, num.intValue(), str);
            }
        } else if (AbstractC4766ag.LIZ.LIZ() != null) {
            AbstractC4766ag.LIZ.LIZ().LIZ(i2, num, str);
        } else if (AbstractC4767ah.LIZIZ.LIZ() != null) {
            AbstractC4767ah.LIZIZ.LIZ().LIZ(i2, num, str, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.IInteractService
    public void showLinkDistributeSetting(Context context, int i, String str, Boolean bool, AbstractC77617Gip abstractC77617Gip) {
        if (PatchProxy.proxy(new Object[]{context, Integer.valueOf(i), str, bool, abstractC77617Gip}, this, changeQuickRedirect, false, 46).isSupported || context == null) {
            return;
        }
        DialogC77613Gil dialogC77613Gil = new DialogC77613Gil(context, i, str, bool.booleanValue(), abstractC77617Gip);
        dialogC77613Gil.LIZIZ();
        C116971W2r.LIZJ(dialogC77613Gil);
    }
}
