package com.bytedance.android.live.liveinteract.chatroom.chatroom;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.alipay.sdk.app.OpenAuthTask;
import com.bytedance.android.live.base.exception.ApiException;
import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.jsbridge.AbstractC3885b;
import com.bytedance.android.live.browser.jsbridge.AbstractC3940c;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.tetris.widgets.LiveWidget;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget;
import com.bytedance.android.live.liveinteract.api.BaseLinkWidget;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.chatroom.model.C4275a;
import com.bytedance.android.live.liveinteract.api.chatroom.model.OpenPanelType;
import com.bytedance.android.live.liveinteract.api.chatroom.p339b.C4272o;
import com.bytedance.android.live.liveinteract.api.chatroom.p339b.C4273p;
import com.bytedance.android.live.liveinteract.api.data.C4284f;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkControlWidget;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.api.LinkPKApi;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.w$a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p354vm.C4378a;
import com.bytedance.android.live.liveinteract.interact.audience.InteractAudienceAnchorWidget;
import com.bytedance.android.live.liveinteract.interact.audience.InteractAudienceGuestWidget;
import com.bytedance.android.live.liveinteract.interact.audience.LinkPkInteractAudienceAnchorWidget;
import com.bytedance.android.live.liveinteract.interact.audience.LinkPkInteractAudienceGuestWidget;
import com.bytedance.android.live.liveinteract.multianchor.MultiAnchorControlWidget;
import com.bytedance.android.live.liveinteract.multianchor.MultiAnchorLinkWidget;
import com.bytedance.android.live.liveinteract.multianchor.livescreen.ScreenLiveLinkWidget;
import com.bytedance.android.live.liveinteract.multianchor.match.MultiPkMatchWidget;
import com.bytedance.android.live.liveinteract.multianchor.pklaunch.C4566a;
import com.bytedance.android.live.liveinteract.multianchor.pklaunch.MultiAnchorPkLaunchControlWidget;
import com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext;
import com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomAnchorWidget;
import com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomAudienceWidget;
import com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomNewWidget;
import com.bytedance.android.live.liveinteract.p382pk.PkControlWidget;
import com.bytedance.android.live.liveinteract.paidlink.profilecard.C4722a;
import com.bytedance.android.live.liveinteract.paidlink.profilecard.PaidProfileCardControlWidget;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4760aa;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4765af;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4783w;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4784x;
import com.bytedance.android.live.liveinteract.plantform.widgt.RtcLinkerWidget;
import com.bytedance.android.live.liveinteract.review.LinkmicReviewWidget;
import com.bytedance.android.live.liveinteract.videotalk.prepareapply.VideoTalkLinkIntegrationWidget;
import com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomAnchorWidget;
import com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomGuestWidget;
import com.bytedance.android.live.liveinteract.voicechat.VoiceChatRoomAnchorWidget;
import com.bytedance.android.live.liveinteract.voicechat.VoiceChatRoomGuestWidget;
import com.bytedance.android.live.network.response.C5171b;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.room.IMicRoomService;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.depend.PluginType;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.p517u.C6304i;
import com.bytedance.android.livesdk.chatroom.p517u.C6306l;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.model.C8657j;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.message.linker.C8690o;
import com.bytedance.android.livesdk.message.model.C8845ej;
import com.bytedance.android.livesdk.message.model.C8854es;
import com.bytedance.android.livesdk.widget.v$a;
import com.bytedance.android.livesdkapi.depend.model.live.BattlePrecisionMatcher;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9532b;
import com.bytedance.android.livesdkapi.service.IPerformanceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import com.bytedance.live.datacontext.C13491f;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import p002O.C0002O;
import p003X.AbstractC416582eC;
import p003X.AbstractC419782jM;
import p003X.AbstractC4569445g;
import p003X.AbstractC77996Gow;
import p003X.AbstractC78050Gpo;
import p003X.AbstractC79154HIe;
import p003X.AbstractC79905Hed;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC81278I1w;
import p003X.AbstractC90419Ljp;
import p003X.AbstractC91058Lu8;
import p003X.C116971W2r;
import p003X.C138182ctN;
import p003X.C149496fqJ;
import p003X.C2IN;
import p003X.C2W3;
import p003X.C3VC;
import p003X.C413202Xa;
import p003X.C419012i7;
import p003X.C421882mk;
import p003X.C437903Ua;
import p003X.C437913Ub;
import p003X.C437923Uc;
import p003X.C439993ar;
import p003X.C448383oO;
import p003X.C448493oZ;
import p003X.C448573oh;
import p003X.C448583oi;
import p003X.C448653op;
import p003X.C4574547f;
import p003X.C64646Bf6;
import p003X.C77588GiM;
import p003X.C77900GnO;
import p003X.C78377Gv5;
import p003X.C78531GxZ;
import p003X.C78571GyD;
import p003X.C78573GyF;
import p003X.C78883H7t;
import p003X.C78927H9l;
import p003X.C78941H9z;
import p003X.C79007HCn;
import p003X.C79046HEa;
import p003X.C79107HGj;
import p003X.C79146HHw;
import p003X.C79169HIt;
import p003X.C79171HIv;
import p003X.C79172HIw;
import p003X.C79173HIx;
import p003X.C79179HJd;
import p003X.C79209HKh;
import p003X.C79220HKs;
import p003X.C79235HLh;
import p003X.C79236HLi;
import p003X.C79242HLo;
import p003X.C79404HRu;
import p003X.C79461HTz;
import p003X.C79615HZx;
import p003X.C79864Hdy;
import p003X.C79915Hen;
import p003X.C80170Hiu;
import p003X.C80273HkZ;
import p003X.C81073HxT;
import p003X.C81074HxU;
import p003X.C81075HxV;
import p003X.C81076HxW;
import p003X.C81077HxX;
import p003X.C81078HxY;
import p003X.C81079HxZ;
import p003X.C81080Hxa;
import p003X.C81081Hxb;
import p003X.C81082Hxc;
import p003X.C81083Hxd;
import p003X.C81084Hxe;
import p003X.C81112Hy6;
import p003X.C81114Hy8;
import p003X.C81116HyA;
import p003X.C81119HyD;
import p003X.C81121HyF;
import p003X.C81123HyH;
import p003X.C81125HyJ;
import p003X.C81527IBl;
import p003X.C81922IQq;
import p003X.C87010KQi;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.C88469KtT;
import p003X.DialogC77846GmW;
import p003X.DialogC77852Gmc;
import p003X.DialogInterface$OnClickListenerC79160HIk;
import p003X.H5N;
import p003X.HA1;
import p003X.HA6;
import p003X.HDP;
import p003X.HH8;
import p003X.HHG;
import p003X.HHZ;
import p003X.HIB;
import p003X.HIC;
import p003X.HIZ;
import p003X.HJ3;
import p003X.HJ4;
import p003X.HJ8;
import p003X.HJE;
import p003X.HJF;
import p003X.HJG;
import p003X.HLS;
import p003X.HOC;
import p003X.HSB;
import p003X.HTD;
import p003X.IQV;
import p003X.IQX;
import p003X.KDS;
import p003X.LK5;
import p003X.PK0;

/* loaded from: classes3.dex */
public class LinkControlWidget extends BaseLinkControlWidget implements Observer<KVData>, cv$a, do$b, w$a, AbstractC4774i, AbstractC4569445g {
    public static ChangeQuickRedirect LIZIZ;
    public VideoTalkLinkIntegrationWidget LIZJ;
    public HHZ LIZLLL;

    /* renamed from: LJ */
    public Room f26263LJ;
    public boolean LJFF;
    public int LJI;
    public C79220HKs LJII;
    public int LJIIJJI;
    public InteractAudienceAnchorWidget LJIIL;
    public InteractAudienceGuestWidget LJIILIIL;
    public LinkPkInteractAudienceAnchorWidget LJIILJJIL;
    public LinkPkInteractAudienceGuestWidget LJIILL;
    public LinkCrossRoomNewWidget LJIILLIIL;
    public VoiceChatRoomAnchorWidget LJIIZILJ;
    public VoiceChatRoomGuestWidget LJIJ;
    public MultiAnchorLinkWidget LJIJI;
    public ScreenLiveLinkWidget LJIJJ;
    public MultiAnchorControlWidget LJIJJLI;
    public VideoTalkRoomAnchorWidget LJIL;
    public VideoTalkRoomGuestWidget LJJ;
    public LiveMode LJJI;
    public boolean LJJIFFI;
    public HIZ LJJII;
    public boolean LJJIII;
    public int LJJIIJ;
    public boolean LJJIIJZLJL;
    public C77900GnO LJJIIZ;
    public C79220HKs LJJIIZI;
    public DialogC77846GmW LJJIJ;
    public C9078n LJJIJIIJI;
    public Disposable LJJIJIL;
    public Disposable LJJIJL;
    public long LJJJI;
    public View LJJJIL;
    public ViewGroup LJJJJIZL;
    public Disposable LJJJJJ;
    public C79209HKh LJJJJL;
    public HLS LJJJJLI;
    public C3VC LJJJJLL;
    public String LJJJJZ;
    public CompositeDisposable LJJIJIIJIL = new CompositeDisposable();
    public C80273HkZ LJIIIIZZ = new C80273HkZ(this, this);
    public C448583oi LJJIJLIJ = new C448583oi(this);
    public C448653op LJJIL = new C448653op(this);
    public C448383oO LJIIIZ = new C448383oO(this, this);
    public C448493oZ LJIIJ = new C448493oZ(this, this);
    public C448573oh LJJIZ = new C448573oh();
    public C78377Gv5 LJJJ = new C78377Gv5();
    public CompositeDisposable LJJJJJL = new CompositeDisposable();
    public boolean LJJJJZI = false;
    public MultiAnchorPkLaunchControlWidget LJJJLIIL = null;
    public AbstractC419782jM LJJJLL = new AbstractC419782jM(this) { // from class: com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkControlWidget.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(25273);
        }

        @Override // p003X.AbstractC419782jM
        public final void LIZ(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
                return;
            }
            C88440Kt0.LIZ(str);
        }
    };
    public Observer<AbstractC4256d> LJJJLZIJ = new Observer<AbstractC4256d>() { // from class: com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkControlWidget.2
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(25274);
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(AbstractC4256d abstractC4256d) {
            if (!PatchProxy.proxy(new Object[]{abstractC4256d}, this, LIZ, false, 1).isSupported) {
                LinkControlWidget linkControlWidget = LinkControlWidget.this;
                if (!PatchProxy.proxy(new Object[]{abstractC4256d}, linkControlWidget, LinkControlWidget.LIZIZ, false, 64).isSupported && linkControlWidget.LJFF) {
                    C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION.extended());
                    if (linkControlWidget.LJJIIZI()) {
                        C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION.extended());
                    }
                    linkControlWidget.LJIIIIZZ.LJII();
                    if (LinkCrossRoomDataHolder.LJII().LIZJ) {
                        if (!(abstractC4256d instanceof AbstractC4256d.C4257a)) {
                            if (((Boolean) linkControlWidget.dataCenter.get("cmd_what_audience_join_self_link", (String) Boolean.FALSE)).booleanValue()) {
                                linkControlWidget.LJIIIZ.LIZ(2130856400, 2130856400, 1.0f);
                            } else {
                                linkControlWidget.LJIIIZ.LIZ(2130856069, 2130856069, 1.0f);
                            }
                            linkControlWidget.LJIIJ.LIZ(0.34f);
                            linkControlWidget.LJIIIIZZ.LIZIZ(2130856479);
                            return;
                        }
                        linkControlWidget.LJIIIZ.LIZ(2130856472, 2130856473, 1.0f);
                        linkControlWidget.LJIIIIZZ.LIZIZ(2130857872);
                        return;
                    }
                    linkControlWidget.LJJI();
                }
            }
        }
    };
    public final int LJJJZ = LiveSettingKeys.LIVE_SEI_LOG_FREQUENCY.getValue().intValue();
    public AbstractC91058Lu8 LJJL = new AbstractC91058Lu8(this) { // from class: com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkControlWidget.6
        static {
            Covode.recordClassIndex(25278);
        }

        @Override // p003X.AbstractC91058Lu8
        public final void LIZ(String str) {
        }

        @Override // p003X.AbstractC91058Lu8
        public final void LIZIZ(String str) {
        }
    };

    static {
        Covode.recordClassIndex(25272);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final void LIZIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZIZ, false, 132).isSupported) {
            return;
        }
        AbstractC416582eC.LIZ(this, th);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final String LJJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 131);
        return proxy.isSupported ? (String) proxy.result : AbstractC416582eC.LIZ(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public int getLayoutId() {
        return 2131700387;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public String getSpm() {
        return "a100.a100.a151";
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 133).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final int LIZJ() {
        return this.LJJIIJ;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final View LJIILL() {
        return this.LJJJIL;
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.do$b, com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.w$a, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final int LJJIFFI() {
        return this.LJI;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final C79220HKs LJJII() {
        return this.LJII;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final C9078n LJJIIJZLJL() {
        return this.LJJIJIIJI;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final void LIZ(Widget widget) {
        if (PatchProxy.proxy(new Object[]{widget}, this, LIZIZ, false, 10).isSupported) {
            return;
        }
        this.LJJII.LIZ(widget);
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget
    public final void LIZ(Room room) {
        if (PatchProxy.proxy(new Object[]{room}, this, LIZIZ, false, 15).isSupported) {
            return;
        }
        this.f26263LJ = room;
        HHZ hhz = this.LIZLLL;
        if (hhz == null) {
            return;
        }
        hhz.LIZ(room);
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget
    public final void LIZ(View view, MotionEvent motionEvent) {
        if (PatchProxy.proxy(new Object[]{view, motionEvent}, this, LIZIZ, false, 17).isSupported) {
            return;
        }
        super.LIZ(view, motionEvent);
        VideoTalkRoomGuestWidget videoTalkRoomGuestWidget = this.LJJ;
        if (videoTalkRoomGuestWidget != null) {
            videoTalkRoomGuestWidget.LIZ(view, motionEvent);
        }
        VideoTalkRoomAnchorWidget videoTalkRoomAnchorWidget = this.LJIL;
        if (videoTalkRoomAnchorWidget == null) {
            return;
        }
        videoTalkRoomAnchorWidget.LIZ(view, motionEvent);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.w$a
    public final void LIZ(C8690o c8690o) {
        if (PatchProxy.proxy(new Object[]{c8690o}, this, LIZIZ, false, 19).isSupported) {
            return;
        }
        VideoTalkRoomAnchorWidget videoTalkRoomAnchorWidget = this.LJIL;
        if (videoTalkRoomAnchorWidget != null) {
            videoTalkRoomAnchorWidget.LJJIJL();
        }
        VoiceChatRoomAnchorWidget voiceChatRoomAnchorWidget = this.LJIIZILJ;
        if (voiceChatRoomAnchorWidget == null) {
            return;
        }
        voiceChatRoomAnchorWidget.LIZ(c8690o.LIZIZ, c8690o);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.w$a
    public final void LIZ(C4284f c4284f) {
        if (!PatchProxy.proxy(new Object[]{c4284f}, this, LIZIZ, false, 20).isSupported && c4284f != null) {
            this.LJJIIZ.LIZJ().LIZ(c4284f);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final void LIZ(String str, int i, DialogInterface.OnDismissListener onDismissListener) {
        if (!PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), onDismissListener}, this, LIZIZ, false, 28).isSupported && this.isViewValid) {
            this.LJJIIZI = C79220HKs.LIZ(this.dataCenter, this).LIZ(0, str, i);
            this.LJJIIZI.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
            if (onDismissListener == null) {
                return;
            }
            this.LJJIIZI.setOnDismissListener(onDismissListener);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.w$a
    public final void LIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZIZ, false, 35).isSupported) {
            return;
        }
        if ((th instanceof ApiServerException) && ((ApiException) th).mErrorCode == 31011) {
            final WeakReference weakReference = new WeakReference(getContext());
            ((KDS) ((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).getLatestBanRecord(13L).m149as(autoDisposeWithTransformer())).LIZ(new Consumer(this, weakReference) { // from class: X.HA9
                public static ChangeQuickRedirect LIZ;
                public final LinkControlWidget LIZIZ;
                public final WeakReference LIZJ;

                static {
                    Covode.recordClassIndex(26286);
                }

                {
                    this.LIZIZ = this;
                    this.LIZJ = weakReference;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    LinkControlWidget linkControlWidget = this.LIZIZ;
                    WeakReference weakReference2 = this.LIZJ;
                    C5176i<C4275a> c5176i = (C5176i) obj;
                    if (PatchProxy.proxy(new Object[]{weakReference2, c5176i}, linkControlWidget, LinkControlWidget.LIZIZ, false, 128).isSupported) {
                        return;
                    }
                    C81922IQq.LIZIZ.LIZ((Context) weakReference2.get(), c5176i, 2131584030, 2131584138, linkControlWidget.f26263LJ.isLiveTypeAudio() ? "radio_live_link" : "video_live_link");
                }
            }, HJ3.LIZIZ);
            return;
        }
        C88469KtT.LIZ(this.context, th, 2131585640);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.w$a
    public final void LIZ(C8854es c8854es) {
        boolean z;
        boolean z2;
        if (!PatchProxy.proxy(new Object[]{c8854es}, this, LIZIZ, false, 41).isSupported && isViewValid() && c8854es != null) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c8854es}, this, LIZIZ, false, 42);
            if (proxy.isSupported) {
                z = ((Boolean) proxy.result).booleanValue();
            } else {
                C9532b c9532b = c8854es.LJJJZ;
                z = c9532b != null && c9532b.LIZ(this.LJFF);
            }
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c8854es}, this, LIZIZ, false, 43);
            if (proxy2.isSupported) {
                z2 = ((Boolean) proxy2.result).booleanValue();
            } else {
                C9532b c9532b2 = c8854es.LJJJZ;
                z2 = c9532b2 != null && c9532b2.LIZ();
            }
            if (C79242HLo.LIZ(c8854es)) {
                if (C79169HIt.LIZIZ(this.LJI, 8) && !this.LJFF) {
                    int i = (LJJJI() == null || LJJJI().LJJLL().LIZIZ() == null) ? 5 : LJJJI().LJJLL().LIZIZ().LIZ().f26940LJ;
                    if (((Integer) C79046HEa.LIZ().LJJIIZI).intValue() == 2) {
                        C88440Kt0.LIZ(LK5.LIZ(2131582156, C79171HIv.LIZ(this.context, i)));
                    } else {
                        C88440Kt0.LIZ(LK5.LIZ(2131582157, C79171HIv.LIZ(this.context, i)));
                    }
                    LJJJI().LJJLL().LIZIZ().LIZ(new C6306l(0, 0, false, false));
                    LIZLLL(8);
                }
                if (!this.LJFF || !z2) {
                    return;
                }
                LIZ(c8854es.LJJJZ, 2131584138);
                LIZLLL(8);
            } else if (C79242HLo.LIZJ(c8854es)) {
                if (!C79169HIt.LIZIZ(this.LJI, 2)) {
                    return;
                }
                if (z && (this.LJFF || C79046HEa.LIZ().LIZJ())) {
                    HH8.LIZ(c8854es.LJJJZ);
                    C81922IQq.LIZIZ.LIZ(this.context, c8854es.LJJJZ, this.LJFF);
                }
                if (this.LJFF && z2) {
                    LIZ(c8854es.LJJJZ, 2131584138);
                }
                if (this.LJFF && !z && !z2) {
                    return;
                }
                LIZLLL(2);
            } else if (!C79242HLo.LIZIZ(c8854es) || !C79169HIt.LIZIZ(this.LJI, 32)) {
            } else {
                int i2 = (LJJJI() == null || LJJJI().LJJZZIII().LIZIZ() == null) ? 8 : LJJJI().LJJZZIII().LIZIZ().LIZIZ().LIZIZ;
                List<Integer> list = (LJJJI() == null || LJJJI().LJJZZIII().LIZIZ() == null) ? null : LJJJI().LJJZZIII().LIZIZ().LIZIZ().LIZJ;
                if (i2 == 13) {
                    if (!this.LJFF && ((Integer) C79046HEa.LIZ().LJJIIZI).intValue() == 2) {
                        C88440Kt0.LIZ(2131585495);
                    } else if (!this.LJFF) {
                        C88440Kt0.LIZ(2131585525);
                    }
                } else if (!this.LJFF && ((Integer) C79046HEa.LIZ().LJJIIZI).intValue() == 2) {
                    C88440Kt0.LIZ(2131585490);
                } else if (!this.LJFF) {
                    C88440Kt0.LIZ(2131585444);
                }
                if (z && (this.LJFF || C79046HEa.LIZ().LIZJ())) {
                    HH8.LIZ(c8854es.LJJJZ);
                    C81922IQq.LIZIZ.LIZ(this.context, c8854es.LJJJZ, this.LJFF);
                }
                if (!this.LJFF || z || z2) {
                    LIZLLL(32);
                }
                if (!this.LJFF) {
                    return;
                }
                if (z2) {
                    LIZ(c8854es.LJJJZ, 2131584138);
                }
                if (i2 != 8 || !C78571GyD.LIZ(list)) {
                    return;
                }
                LIZLLL(32);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.w$a
    public final void LIZ(C8845ej c8845ej) {
        int LJJIFFI;
        int intValue;
        char c = 1;
        boolean z = false;
        if (!PatchProxy.proxy(new Object[]{c8845ej}, this, LIZIZ, false, 45).isSupported && c8845ej.LIZ != null) {
            List<BattlePrecisionMatcher> list = c8845ej.LIZ.LIZIZ;
            String str = "";
            String str2 = (c8845ej.LIZ.LJFF == null || c8845ej.LIZ.LJFF.isEmpty()) ? str : c8845ej.LIZ.LJFF;
            if (c8845ej.LIZ.LJII != null && !c8845ej.LIZ.LJII.isEmpty()) {
                str = c8845ej.LIZ.LJII;
            }
            char c2 = 2;
            if (list.get(0).LIZJ == BattlePrecisionMatcher.Status.StatusReady.ordinal() && list.get(1).LIZJ == BattlePrecisionMatcher.Status.StatusReady.ordinal()) {
                LJJIJLIJ();
                HJ8.LIZ().LIZIZ();
                LinkCrossRoomDataHolder.LJII().LJJJZ = false;
                Disposable disposable = this.LJJIJL;
                if (disposable != null && !disposable.isDisposed()) {
                    this.LJJIJL.dispose();
                }
                this.LJJIJL = ((AbstractC81278I1w) Observable.timer(10L, TimeUnit.SECONDS).m151as(autoDisposeWithTransformer())).LIZ(HIC.LIZIZ);
                for (BattlePrecisionMatcher battlePrecisionMatcher : list) {
                    if (this.f26263LJ.getOwner().getId() != battlePrecisionMatcher.LIZ && c8845ej.LIZ.LIZ == this.f26263LJ.getOwner().getId()) {
                        HHZ hhz = this.LIZLLL;
                        Object[] objArr = new Object[3];
                        char c3 = z ? 1 : 0;
                        char c4 = z ? 1 : 0;
                        objArr[c3] = battlePrecisionMatcher;
                        objArr[c] = str2;
                        objArr[c2] = str;
                        if (!PatchProxy.proxy(objArr, hhz, HHZ.LIZ, z, 47).isSupported) {
                            C2IN LIZIZ2 = C2IN.LIZIZ();
                            LIZIZ2.LIZ("ttlive_pk", "handle precision match invite, toUserId: " + battlePrecisionMatcher.LIZ);
                            hhz.LIZIZ.LJIIJJI = 300;
                            hhz.LIZIZ.LJIIL = LK5.LJIIJ().getString(2131585776);
                            hhz.LIZIZ.LJFF = battlePrecisionMatcher.LIZ;
                            hhz.LIZIZ.LJJJ = battlePrecisionMatcher.LIZIZ;
                            if (AbstractC4784x.LJII.LIZ() != null) {
                                hhz.LJIIIIZZ = AbstractC4784x.LJII.LIZ().LIZIZ();
                            }
                            if (hhz.LJIIIIZZ != null) {
                                hhz.LJIIIIZZ.LIZ(hhz.LJIIJJI);
                                hhz.LJIIIIZZ.LIZ(hhz.LIZJ.getId(), battlePrecisionMatcher.LIZIZ.getId(), 0, 3, battlePrecisionMatcher.LIZIZ.getOwner().getSecUid(), battlePrecisionMatcher.LIZIZ, hhz.LIZIZ.LJIIL, 300, str2, str);
                                Map hashMap = new HashMap();
                                hashMap.put("is_oncemore", "0");
                                hashMap.put("connection_type", "match_bell");
                                hashMap.put("request_id", hhz.LIZIZ.LJJLIIIJLLLLLLLZ);
                                hashMap.put("pk_description", "routine");
                                C4574547f LIZ = C4574547f.LIZ();
                                C8657j c8657j = new C8657j();
                                c8657j.LIZ(300);
                                LIZ.LIZ("connection_invite", hashMap, c8657j, LinkCrossRoomDataHolder.LJII().LJIIIZ(), Room.class);
                            }
                            hhz.LIZIZ.LJIIJ();
                        }
                    }
                    c = 1;
                    z = false;
                    c2 = 2;
                }
                return;
            }
            for (BattlePrecisionMatcher battlePrecisionMatcher2 : list) {
                if (this.f26263LJ.getOwner().getId() == battlePrecisionMatcher2.LIZ && battlePrecisionMatcher2.LIZJ == BattlePrecisionMatcher.Status.StatusRejected.ordinal()) {
                    LJJIJLIJ();
                    return;
                } else if (this.f26263LJ.getOwner().getId() != battlePrecisionMatcher2.LIZ && battlePrecisionMatcher2.LIZJ == BattlePrecisionMatcher.Status.StatusRejected.ordinal()) {
                    LJJIJLIJ();
                    if (LinkCrossRoomDataHolder.LJII().LJJJZ) {
                        C88440Kt0.LIZ(2131584381);
                    }
                    LinkCrossRoomDataHolder.LJII().LJJL = false;
                    LinkCrossRoomDataHolder.LJII().LJIIJ();
                    HJ8.LIZ().LIZIZ();
                    Disposable disposable2 = this.LJJIJL;
                    if (disposable2 != null && !disposable2.isDisposed()) {
                        this.LJJIJL.dispose();
                    }
                    this.LJJIJL = ((AbstractC81278I1w) Observable.timer(10L, TimeUnit.SECONDS).m151as(autoDisposeWithTransformer())).LIZ(HIB.LIZIZ);
                }
            }
            if (LinkCrossRoomDataHolder.LJII().LJJJZ || c8845ej.LIZ.f28181LJ == LinkCrossRoomDataHolder.LJII().LJJLIIIJLJLI) {
                return;
            }
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 46);
            if (!proxy.isSupported ? !(((LJJIFFI = AbstractC78050Gpo.LIZ().LJJIFFI()) == 0 || (LJJIFFI == 2 && (!((IInteractService) ServiceManager.getService(IInteractService.class)).getInteractAudienceService().LIZIZ() || C79179HJd.LIZIZ.LIZJ()))) && !C79615HZx.LIZ().LIZJ() && !C79615HZx.LIZ().LIZLLL() && (intValue = ((Integer) this.dataCenter.get("data_pk_match_state", (String) 0)).intValue()) != 1 && intValue != 2 && intValue != 5 && this.LJJIIJ == 0) : !((Boolean) proxy.result).booleanValue()) {
                ((AbstractC81278I1w) ((LinkPKApi) C88306Kqq.LIZ().LIZ(LinkPKApi.class)).replyPrecisionMatch(2, c8845ej.LIZ.f28181LJ).m151as(autoDisposeWithTransformer())).LIZ(C79172HIw.LIZIZ, C79173HIx.LIZ);
                return;
            }
            LinkCrossRoomDataHolder.LJII().LJJLIIIJLJLI = c8845ej.LIZ.f28181LJ;
            LinkCrossRoomDataHolder.LJII().LJJJZ = true;
            LinkCrossRoomDataHolder.LJII().LJJL = false;
            this.LJII = C79220HKs.LIZ(this.dataCenter, this).LIZ(c8845ej);
            this.LJII.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
            HJ8.LIZ().LIZ(c8845ej);
            LJJIJLIJ();
            this.LJJIJIL = ((AbstractC81278I1w) Observable.timer(20L, TimeUnit.SECONDS).m151as(autoDisposeWithTransformer())).LIZ(C79146HHw.LIZIZ);
        }
    }

    @Override // p003X.AbstractC412722Ve
    public final void LIZ(String str) {
        VideoTalkRoomGuestWidget videoTalkRoomGuestWidget;
        ScreenLiveLinkWidget screenLiveLinkWidget;
        MultiAnchorLinkWidget multiAnchorLinkWidget;
        VoiceChatRoomGuestWidget voiceChatRoomGuestWidget;
        InteractAudienceGuestWidget interactAudienceGuestWidget;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 50).isSupported && !this.LJFF) {
            if (TextUtils.equals(str, this.LJJJJZ) && LiveConfigSettingKeys.SEI_DUPLICATE_REMOVE_ENABLE.getValue().booleanValue()) {
                return;
            }
            if (this.LJIIJJI % this.LJJJZ == 0) {
                C2IN.LIZIZ().LIZ("ttlive_pk", str);
            }
            this.LJIIJJI++;
            if (this.LJJJJLI != null && !this.f26263LJ.isLiveTypeAudio()) {
                this.LJJJJLI.LIZ(str);
            }
            if (this.LJI == 2 && (interactAudienceGuestWidget = this.LJIILIIL) != null) {
                interactAudienceGuestWidget.m15737LJ(str);
                this.LJJJJZ = str;
            }
            if (C79169HIt.LIZIZ(this.LJI, 4)) {
                LinkCrossRoomNewWidget linkCrossRoomNewWidget = this.LJIILLIIL;
                if (linkCrossRoomNewWidget != null && (linkCrossRoomNewWidget instanceof LinkCrossRoomAudienceWidget)) {
                    ((LinkCrossRoomAudienceWidget) linkCrossRoomNewWidget).LIZIZ(str);
                }
                this.LJJJJZ = str;
                LinkPkInteractAudienceGuestWidget linkPkInteractAudienceGuestWidget = this.LJIILL;
                if (linkPkInteractAudienceGuestWidget != null) {
                    linkPkInteractAudienceGuestWidget.m15736LJ(str);
                    this.LJJJJZ = str;
                }
            }
            if (C79169HIt.LIZIZ(this.LJI, 8) && (voiceChatRoomGuestWidget = this.LJIJ) != null) {
                voiceChatRoomGuestWidget.LJI(str);
                this.LJJJJZ = str;
            }
            if (C79169HIt.LIZIZ(this.LJI, 64) && (multiAnchorLinkWidget = this.LJIJI) != null) {
                multiAnchorLinkWidget.LIZ(str);
                this.LJJJJZ = str;
            }
            if (C79169HIt.LIZIZ(this.LJI, 128) && (screenLiveLinkWidget = this.LJIJJ) != null) {
                screenLiveLinkWidget.LIZ(str);
                this.LJJJJZ = str;
            }
            if (C79169HIt.LIZIZ(this.LJI, 32) && (videoTalkRoomGuestWidget = this.LJJ) != null) {
                videoTalkRoomGuestWidget.m15666LJ(str);
                this.LJJJJZ = str;
            }
            if (this.LJJJJL == null || !LiveConfigSettingKeys.LIVE_PK_OPT_ENABLE.getValue().booleanValue()) {
                return;
            }
            this.LJJJJL.LIZ(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.w$a
    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 60).isSupported) {
            return;
        }
        this.LJJIII = z;
        if (AbstractC78050Gpo.LIZ().LJI()) {
            return;
        }
        if (LJJIJIIJI()) {
            if (!this.LJFF) {
                LJJJJZI();
                C413202Xa.LIZ().LIZ(ToolbarButton.RADIO_INTERACTION_AUDIENCE.extended(), this.LJJIL);
                return;
            }
            this.LJJIZ.LIZ(2130856072);
        } else if (!this.LJFF) {
            this.LJJIL.LIZJ();
            C413202Xa.LIZ().LIZIZ(ToolbarButton.RADIO_INTERACTION_AUDIENCE.extended(), this.LJJIL);
            C79046HEa.LIZ().LIZ((Integer) 0);
        } else {
            if (this.dataCenter != null) {
                this.dataCenter.put("data_radio_talk_dot_with_number_show", "0");
            }
            this.LJJIZ.LIZ(2130856402);
        }
    }

    @Override // com.bytedance.android.livesdk.p697l.AbstractC8447a
    public final boolean LIZ(Runnable runnable, boolean z) {
        VoiceChatRoomGuestWidget voiceChatRoomGuestWidget;
        InteractAudienceGuestWidget interactAudienceGuestWidget;
        VideoTalkRoomGuestWidget videoTalkRoomGuestWidget;
        boolean z2 = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{runnable, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 66);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.LJFF && (videoTalkRoomGuestWidget = this.LJJ) != null) {
            boolean LIZ = videoTalkRoomGuestWidget.LIZ(runnable, z);
            LIZJ(LIZ);
            return LIZ;
        }
        if (!this.LJFF && (interactAudienceGuestWidget = this.LJIILIIL) != null) {
            z2 = interactAudienceGuestWidget.LIZ(runnable, z);
        } else if (!this.LJFF && (voiceChatRoomGuestWidget = this.LJIJ) != null) {
            z2 = voiceChatRoomGuestWidget.LIZ(runnable, z);
        } else {
            VideoTalkRoomGuestWidget videoTalkRoomGuestWidget2 = this.LJJ;
            if (videoTalkRoomGuestWidget2 != null) {
                z2 = videoTalkRoomGuestWidget2.LIZ(runnable, z);
            } else {
                LinkPkInteractAudienceGuestWidget linkPkInteractAudienceGuestWidget = this.LJIILL;
                if (linkPkInteractAudienceGuestWidget != null) {
                    z2 = linkPkInteractAudienceGuestWidget.LIZ(runnable, z);
                }
            }
        }
        LIZJ(z2);
        return z2;
    }

    public void LIZ(final DialogInterface.OnDismissListener onDismissListener) {
        C79220HKs c79220HKs;
        if (!PatchProxy.proxy(new Object[]{onDismissListener}, this, LIZIZ, false, 74).isSupported && (c79220HKs = this.LJII) != null) {
            c79220HKs.setOnDismissListener(new DialogInterface.OnDismissListener(this, onDismissListener) { // from class: X.HA7
                public static ChangeQuickRedirect LIZ;
                public final LinkControlWidget LIZIZ;
                public final DialogInterface.OnDismissListener LIZJ;

                static {
                    Covode.recordClassIndex(25617);
                }

                {
                    this.LIZIZ = this;
                    this.LIZJ = onDismissListener;
                }

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    LinkControlWidget linkControlWidget = this.LIZIZ;
                    DialogInterface.OnDismissListener onDismissListener2 = this.LIZJ;
                    if (PatchProxy.proxy(new Object[]{onDismissListener2, dialogInterface}, linkControlWidget, LinkControlWidget.LIZIZ, false, 120).isSupported) {
                        return;
                    }
                    if (onDismissListener2 != null) {
                        onDismissListener2.onDismiss(dialogInterface);
                    }
                    linkControlWidget.LJII = null;
                }
            });
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.w$a
    public final void LIZ(String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 75).isSupported) {
            return;
        }
        this.dataCenter.put(str, Boolean.valueOf(z));
        if (C79169HIt.LIZIZ(this.LJI, 32)) {
            if (TextUtils.equals(str, "data_big_party_support_send_gift_to_linker")) {
                ((AbstractC90419Ljp) ServiceManager.getService(AbstractC90419Ljp.class)).setAllowSendToGuest(z);
            }
            if (!TextUtils.equals(str, "data_video_talk_apply_need_verify")) {
                return;
            }
            C87010KQi.LIZ().LIZ(new C4272o(z));
        } else if (C79169HIt.LIZIZ(this.LJI, 2)) {
            if (!TextUtils.equals(str, "data_intimate_chat_support_send_gift_to_linker")) {
                return;
            }
            ((AbstractC90419Ljp) ServiceManager.getService(AbstractC90419Ljp.class)).setAllowSendToGuest(z);
        } else if (!C79169HIt.LIZIZ(this.LJI, 8)) {
        } else {
            if (TextUtils.equals(str, "data_audio_chat_support_send_gift_to_linker")) {
                ((AbstractC90419Ljp) ServiceManager.getService(AbstractC90419Ljp.class)).setAllowSendToGuest(z);
            }
            if (!TextUtils.equals(str, "data_voice_talk_apply_need_verify")) {
                return;
            }
            C87010KQi.LIZ().LIZ(new C4273p(z));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.do$b
    public final void LIZIZ(boolean z) {
        VideoTalkLinkIntegrationWidget videoTalkLinkIntegrationWidget;
        int i;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 79).isSupported) {
            return;
        }
        if (LJJJJI()) {
            C88440Kt0.LIZ(2131584305);
            return;
        }
        AbstractC4256d abstractC4256d = null;
        if (IQV.LIZ("PkDataContext", PkDataContext.class) != null) {
            abstractC4256d = ((PkDataContext) IQV.LIZ("PkDataContext", PkDataContext.class)).LJIIIZ.getValue();
        }
        if (this.f26263LJ.isPaidLive()) {
            C88440Kt0.LIZ(LK5.LIZ(2131586754));
            return;
        }
        View view = this.LJJJIL;
        if (view != null && view.getParent() == this.LJJJJIZL) {
            C88440Kt0.LIZ(2131585464);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (!C138182ctN.LIZIZ && this.LJJI == LiveMode.VIDEO && !LiveConfigSettingKeys.ENABLE_LIVE_INTERACT.getValue().booleanValue()) {
            C88440Kt0.LIZ(this.context.getString(2131585543));
            return;
        }
        Room room = this.f26263LJ;
        if (room != null && room.getMosaicStatus() == 1) {
            C88440Kt0.LIZ(2131585806);
        } else if (((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).isInDrawGuessGame()) {
            C88440Kt0.LIZ(2131586901);
        } else if (LinkCrossRoomDataHolder.LJII().LIZLLL != 0 && !C79179HJd.LIZIZ.LIZ()) {
            if (z) {
                C88440Kt0.LIZ(2131584449);
            } else {
                C88440Kt0.LIZ(C79179HJd.LIZIZ.LIZIZ());
            }
        } else if (LJJIIJ() && (i = this.LJI) != 0 && i != 2) {
            C88440Kt0.LIZ(2131584269);
        } else if (this.LJFF && ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).isPlayingGame()) {
            C88440Kt0.LIZ(2131584176);
        } else if (this.LJJI == LiveMode.AUDIO) {
            int i3 = this.LJI;
            if (i3 == 0) {
                if (!((IInteractService) ServiceManager.getService(IInteractService.class)).getPkService().LJII()) {
                    LJJIJL();
                } else if (z) {
                    C88440Kt0.LIZ(2131584449);
                } else {
                    C88440Kt0.LIZ(2131585464);
                }
            } else if (C79169HIt.LIZIZ(i3, 4)) {
                C88440Kt0.LIZ(2131585463);
            } else {
                VoiceChatRoomAnchorWidget voiceChatRoomAnchorWidget = this.LJIIZILJ;
                if (voiceChatRoomAnchorWidget == null) {
                    return;
                }
                voiceChatRoomAnchorWidget.LJJIII();
            }
        } else {
            int i4 = this.LJI;
            if (i4 == 0) {
                if (C79615HZx.LIZ().LIZJ()) {
                    C88440Kt0.LIZ(2131585464);
                } else if (this.LJFF) {
                    if (C78883H7t.LIZIZ.LIZ(this.f26263LJ)) {
                        if (LJJJJLL() && C79242HLo.LJIILJJIL()) {
                            this.LJII = C79220HKs.LIZ(this.dataCenter, this).LIZIZ();
                            this.LJII.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
                        } else if (C78883H7t.LIZIZ.LIZ(this.f26263LJ, true)) {
                            this.dataCenter.put("data_room_video_talk_log_open_success_for_enter_from", "link_icon");
                            this.LIZLLL.LIZIZ(true);
                        } else {
                            C419012i7.LIZ().LIZ(getContext(), 4).mo15264LJ(2131588232).LIZLLL(2131588231).LIZIZ(0, 2131588230, new DialogInterface.OnClickListener(this) { // from class: X.H9r
                                public static ChangeQuickRedirect LIZ;
                                public final LinkControlWidget LIZIZ;

                                static {
                                    Covode.recordClassIndex(26144);
                                }

                                {
                                    this.LIZIZ = this;
                                }

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i5) {
                                    if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i5)}, this, LIZ, false, 1).isSupported) {
                                        return;
                                    }
                                    LinkControlWidget linkControlWidget = this.LIZIZ;
                                    if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i5)}, linkControlWidget, LinkControlWidget.LIZIZ, false, 119).isSupported) {
                                        return;
                                    }
                                    linkControlWidget.dataCenter.put("data_room_video_talk_log_open_success_for_enter_from", "chat_room_alert");
                                    linkControlWidget.LIZLLL.LIZIZ(true);
                                    dialogInterface.dismiss();
                                }
                            }).LIZIZ(1, 2131588229, DialogInterface$OnClickListenerC79160HIk.LIZIZ).LIZJ();
                        }
                    } else {
                        this.LJII = C79220HKs.LIZ(this.dataCenter, this).LIZJ();
                        this.LJII.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
                    }
                    LJJJLZIJ();
                } else if (!C78883H7t.LIZIZ.LIZ(this.f26263LJ) || (videoTalkLinkIntegrationWidget = this.LIZJ) == null) {
                } else {
                    videoTalkLinkIntegrationWidget.LIZJ();
                }
            } else if (C79169HIt.LIZIZ(i4, 64)) {
                C88440Kt0.LIZ(2131585514);
            } else if (C79169HIt.LIZIZ(this.LJI, 16)) {
                C88440Kt0.LIZ(2131585465);
            } else {
                String str = "0";
                if (C79169HIt.LIZIZ(this.LJI, 4)) {
                    if (this.LJFF) {
                        if (abstractC4256d != null && !(abstractC4256d instanceof AbstractC4256d.C4257a)) {
                            if (C79179HJd.LIZIZ.LIZ()) {
                                this.dataCenter.put("data_link_pk_interact_show_red_dot", Boolean.TRUE);
                                this.LJII = C79220HKs.LIZ(this.dataCenter, this).LIZIZ();
                                this.LJII.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
                                return;
                            }
                            C88440Kt0.LIZ(C79179HJd.LIZIZ.LIZIZ());
                            return;
                        }
                        LinkCrossRoomNewWidget linkCrossRoomNewWidget = this.LJIILLIIL;
                        if (linkCrossRoomNewWidget == null) {
                            return;
                        }
                        linkCrossRoomNewWidget.LJIIIIZZ();
                    } else if (((IUserService) ServiceManager.getService(IUserService.class)).user().LJI()) {
                        if (LiveSettingKeys.LIVE_INTIMATE_CHAT_USE_NEW_PANEL.getValue().booleanValue()) {
                            this.LJII = C79220HKs.LIZ(this.dataCenter, this).LIZIZ();
                        } else {
                            this.LJII = C79220HKs.LIZ(this.dataCenter, this).LIZ();
                        }
                        this.LJII.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
                    } else if (!C79169HIt.LIZIZ(this.LJI, 2)) {
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("action_type", "click");
                        if (LJJIIJ()) {
                            str = "1";
                        }
                        hashMap.put("is_carousel_room_host", str);
                        hashMap.put("request_page", C79007HCn.LJII().LJIILL);
                        C4574547f.LIZ().LIZ("livesdk_guest_connection", hashMap, Room.class, C8668v.class);
                        InteractAudienceGuestWidget interactAudienceGuestWidget = this.LJIILIIL;
                        if (interactAudienceGuestWidget != null) {
                            interactAudienceGuestWidget.LIZ(false);
                        }
                        LinkPkInteractAudienceGuestWidget linkPkInteractAudienceGuestWidget = this.LJIILL;
                        if (linkPkInteractAudienceGuestWidget == null) {
                            return;
                        }
                        linkPkInteractAudienceGuestWidget.LIZ(false);
                    }
                } else if (C79169HIt.LIZIZ(this.LJI, 2)) {
                    if (this.LJFF) {
                        if (((IInteractService) ServiceManager.getService(IInteractService.class)).getPkService().LJII()) {
                            C88440Kt0.LIZ(2131585464);
                            return;
                        }
                        if (TextUtils.isEmpty((String) this.dataCenter.get("data_interact_number_dot_show"))) {
                            if (C78531GxZ.LIZ()) {
                                C78531GxZ.LIZIZ();
                                return;
                            } else if (C78883H7t.LIZIZ.LIZ(this.f26263LJ)) {
                                if (LJJJJLL() && C79242HLo.LJIILJJIL() && LiveSettingKeys.LIVE_INTIMATE_CHAT_USE_NEW_PANEL.getValue().booleanValue()) {
                                    this.LJII = C79220HKs.LIZ(this.dataCenter, this).LIZIZ();
                                } else {
                                    this.dataCenter.put("data_room_video_talk_log_open_success_for_enter_from", "link_icon");
                                    this.LIZLLL.LIZIZ(true);
                                }
                            } else {
                                this.LJII = C79220HKs.LIZ(this.dataCenter, this).LIZJ();
                            }
                        } else if (LiveSettingKeys.LIVE_INTIMATE_CHAT_USE_NEW_PANEL.getValue().booleanValue()) {
                            this.LJII = C79220HKs.LIZ(this.dataCenter, this).LIZIZ();
                        } else {
                            this.LJII = C79220HKs.LIZ(this.dataCenter, this).LIZ();
                        }
                        C79220HKs c79220HKs = this.LJII;
                        if (c79220HKs == null) {
                            return;
                        }
                        c79220HKs.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
                    } else if (((IUserService) ServiceManager.getService(IUserService.class)).user().LJI()) {
                        if (LiveSettingKeys.LIVE_INTIMATE_CHAT_USE_NEW_PANEL.getValue().booleanValue()) {
                            this.LJII = C79220HKs.LIZ(this.dataCenter, this).LIZIZ();
                        } else {
                            this.LJII = C79220HKs.LIZ(this.dataCenter, this).LIZ();
                        }
                        this.LJII.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
                    } else {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("action_type", "click");
                        hashMap2.put("request_page", C79007HCn.LJII().LJIILL);
                        if (LJJIIJ()) {
                            str = "1";
                        }
                        hashMap2.put("is_carousel_room_host", str);
                        C4574547f.LIZ().LIZ("livesdk_guest_connection", hashMap2, Room.class, C8668v.class);
                        InteractAudienceGuestWidget interactAudienceGuestWidget2 = this.LJIILIIL;
                        if (interactAudienceGuestWidget2 != null) {
                            interactAudienceGuestWidget2.LIZ(true);
                        }
                        LinkPkInteractAudienceGuestWidget linkPkInteractAudienceGuestWidget2 = this.LJIILL;
                        if (linkPkInteractAudienceGuestWidget2 == null) {
                            return;
                        }
                        linkPkInteractAudienceGuestWidget2.LIZ(true);
                    }
                } else if (!C79169HIt.LIZIZ(this.LJI, 32)) {
                } else {
                    if (this.LJFF) {
                        if (C78531GxZ.LIZ()) {
                            C78531GxZ.LIZIZ();
                        } else if (AbstractC4766ag.LIZ.LIZ() == null) {
                        } else {
                            AbstractC4766ag.LIZ.LIZ().LIZ(0, "bottom", -1, "");
                        }
                    } else if (((IUserService) ServiceManager.getService(IUserService.class)).user().LJI()) {
                        if (C78531GxZ.LIZ()) {
                            C78531GxZ.LIZIZ();
                        } else if (AbstractC4765af.LIZ.LIZ() == null) {
                        } else {
                            AbstractC4765af.LIZ.LIZ().LIZ(0, "bottom", -1, "");
                        }
                    } else {
                        this.LJJ.LJJJ();
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final boolean LIZ(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZIZ, false, 81);
        return proxy.isSupported ? ((Boolean) proxy.result).booleanValue() : this.LJJJJLL != null && ((IMicRoomService) ServiceManager.getService(IMicRoomService.class)).isMicRoom(this.f26263LJ) && this.LJJJJLL.LIZ(j);
    }

    public void LIZ(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        if (PatchProxy.proxy(new Object[]{onClickListener, onClickListener2}, this, LIZIZ, false, 108).isSupported) {
            return;
        }
        v$a v_a = new v$a(this.context);
        v_a.LIZ(4);
        AbstractC77996Gow LIZIZ2 = v_a.LIZLLL(2131584187).LIZ(2.0f).LIZIZ(0, 2131584188, onClickListener).LIZIZ(1, 2131584186, onClickListener2);
        LIZIZ2.mo15263LJ(false);
        LIZIZ2.LIZJ();
    }

    private boolean LJJJJIZL() {
        if (this.LJFF && this.LJJI == LiveMode.SCREEN_RECORD) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    /* renamed from: LJ */
    public final boolean mo15717LJ() {
        if (this.LJI == 2) {
            return true;
        }
        return false;
    }

    public static void LJJIIZ() {
        if (PatchProxy.proxy(new Object[0], null, LIZIZ, true, 84).isSupported) {
            return;
        }
        ((IPerformanceManager) ServiceManager.getService(IPerformanceManager.class)).onModuleStop("link_mic");
    }

    private void LJJIJLIJ() {
        Disposable disposable;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 47).isSupported && (disposable = this.LJJIJIL) != null && !disposable.isDisposed()) {
            this.LJJIJIL.dispose();
        }
    }

    private void LJJIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 52).isSupported) {
            return;
        }
        LJJJ();
        AbstractC4760aa LIZIZ2 = C4722a.LIZJ.LIZIZ();
        if (LIZIZ2 != null) {
            LIZIZ2.LIZIZ();
        }
    }

    private boolean LJJJJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 70);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget
    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 16).isSupported) {
            return;
        }
        this.LJJJJZI = true;
        LJJIJIL();
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.w$a
    public final void LJII() {
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 22).isSupported && this.LJI == 2) {
            this.LJIIIZ.LIZJ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final void LJIIJJI() {
        C79220HKs c79220HKs;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 29).isSupported && (c79220HKs = this.LJJIIZI) != null && c79220HKs.LJIILIIL()) {
            this.LJJIIZI.dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final void LJIIL() {
        HHZ hhz;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 31).isSupported && (hhz = this.LIZLLL) != null) {
            hhz.LIZ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.w$a
    public final void LJIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 38).isSupported) {
            return;
        }
        LIZLLL(4);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final void LJJIII() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 78).isSupported) {
            return;
        }
        LIZIZ(false);
    }

    private boolean LJJIJIIJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.LJJIII || !LJJIJIIJIL() || !LiveConfigSettingKeys.LIVE_CURRENT_HOST_ENABLE_RADIO_ROOM_PREAPPLY.getValue().booleanValue()) {
            return false;
        }
        return true;
    }

    private boolean LJJIJIIJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Room room = this.f26263LJ;
        if (room == null || room.anchorAbMap == null || this.f26263LJ.anchorAbMap.get("radio_prepare_apply") == null || !this.f26263LJ.anchorAbMap.get("radio_prepare_apply").equals("1")) {
            return false;
        }
        return true;
    }

    private void LJJIJIL() {
        HHZ hhz;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 18).isSupported && this.LJJJJZI && (hhz = this.LIZLLL) != null) {
            hhz.LIZ(this.f26263LJ.getRoomId());
            this.LJJJJZI = false;
        }
    }

    private void LJJIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 49).isSupported) {
            return;
        }
        try {
            if (this.LJII != null && this.LJII.isVisible()) {
                this.LJII.dismiss();
            }
        } catch (Throwable unused) {
        }
    }

    private void LJJJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 53).isSupported) {
            return;
        }
        boolean mo15717LJ = mo15717LJ();
        if (this.LJFF) {
            InteractAudienceAnchorWidget interactAudienceAnchorWidget = this.LJIIL;
            if (interactAudienceAnchorWidget != null) {
                interactAudienceAnchorWidget.LIZ(mo15717LJ);
                return;
            }
            return;
        }
        InteractAudienceGuestWidget interactAudienceGuestWidget = this.LJIILIIL;
        if (interactAudienceGuestWidget != null) {
            interactAudienceGuestWidget.LIZIZ(mo15717LJ);
        }
    }

    private void LJJJIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 57).isSupported) {
            return;
        }
        this.LJIJJ = (ScreenLiveLinkWidget) this.LJJII.LIZ(8);
        LIZIZ("screen_live_multi_linker", this.LJFF);
        this.LJIIIIZZ.LIZJ(2);
    }

    private boolean LJJJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 71);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C2W3 c2w3 = (C2W3) this.dataCenter.get("data_broadcast_pause_state");
        if (c2w3 == null || (c2w3.LIZ != 1 && c2w3.LIZ != 2)) {
            return false;
        }
        return true;
    }

    private boolean LJJJJJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 88);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.LJFF || !LiveConfigSettingKeys.LIVE_ENABLE_VIDEO_TEAM_FIGHT_TOOLBAR.getValue().booleanValue()) {
            return false;
        }
        return true;
    }

    private boolean LJJJJJL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 89);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.LJFF || !LiveConfigSettingKeys.LIVE_ENABLE_AUDIO_TEAM_FIGHT_TOOLBAR.getValue().booleanValue()) {
            return false;
        }
        return true;
    }

    private boolean LJJJJL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 90);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        IInteractService iInteractService = (IInteractService) ServiceManager.getService(IInteractService.class);
        if (iInteractService == null || this.LJFF || this.LJJI != LiveMode.VIDEO || iInteractService.getCurrentScene() != 0 || !C78883H7t.LIZIZ.m23784LJ(this.f26263LJ)) {
            return false;
        }
        return true;
    }

    private boolean LJJJJLI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 92);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        IInteractService iInteractService = (IInteractService) ServiceManager.getService(IInteractService.class);
        if (iInteractService == null || !this.LJFF || this.LJJI != LiveMode.VIDEO || iInteractService.getCurrentScene() != 0 || C78883H7t.LIZIZ.LIZ(this.f26263LJ, true)) {
            return false;
        }
        return true;
    }

    private C6304i LJJJJZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 96);
        if (proxy.isSupported) {
            return (C6304i) proxy.result;
        }
        if (LJJJI() != null && LJJJI().LJLIIIL() != null) {
            return LJJJI().LJLIIIL().LIZIZ();
        }
        return null;
    }

    private void LJJJJZI() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 102).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", "show");
        hashMap.put("live_type", "voice_live");
        hashMap.put("function_type", "live");
        C4574547f.LIZ().LIZ("livesdk_guest_connection_apply_icon", hashMap, Room.class, C8668v.class);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final int LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 11);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return ((Integer) this.dataCenter.get("data_member_count", (String) 0)).intValue();
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.w$a, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final C4378a LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 23);
        if (proxy.isSupported) {
            return (C4378a) proxy.result;
        }
        InteractAudienceAnchorWidget interactAudienceAnchorWidget = this.LJIIL;
        if (interactAudienceAnchorWidget != null) {
            return interactAudienceAnchorWidget.LIZJ();
        }
        InteractAudienceGuestWidget interactAudienceGuestWidget = this.LJIILIIL;
        if (interactAudienceGuestWidget != null) {
            return interactAudienceGuestWidget.m15738LJ();
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final void LJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 27).isSupported || !this.isViewValid) {
            return;
        }
        DialogC77846GmW dialogC77846GmW = this.LJJIJ;
        if (dialogC77846GmW != null && dialogC77846GmW.isShowing()) {
            return;
        }
        this.LJJIJ = new DialogC77846GmW(this.LJI, this.context, LJJJI(), this.dataCenter, this.LJJIJIIJIL, this.LIZLLL, null);
        C116971W2r.LIZJ(this.LJJIJ);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final boolean LJIILIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 32);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LJFF && this.LJJII.LIZ() == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final boolean LJIILJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 33);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (C4284f.LJIIIIZZ.LIZ()) {
            return AbstractC80293Hkt.f6971Z.LIZ().booleanValue();
        }
        C4378a LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ == null) {
            return false;
        }
        return LJIIIIZZ.LIZIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.w$a
    public final void LJIIZILJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 37).isSupported) {
            return;
        }
        C79220HKs c79220HKs = this.LJII;
        if (c79220HKs != null && c79220HKs.isVisible()) {
            this.LJII.dismiss();
        }
        if (!this.LJFF || LinkCrossRoomDataHolder.LJII().LIZLLL != 0) {
            LIZJ(4);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.w$a
    public final void LJIJI() {
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 39).isSupported && !this.LJFF && LinkCrossRoomDataHolder.LJII().LIZLLL != 0) {
            LIZJ(64);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.w$a
    public final void LJIJJ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 40).isSupported && !this.LJFF && LinkCrossRoomDataHolder.LJII().LIZLLL != 0) {
            LIZJ(128);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.w$a
    public final void LJIJJLI() {
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 48).isSupported && isViewValid() && C79169HIt.LIZIZ(this.LJI, 32) && !this.LJFF) {
            LIZLLL(32);
        }
    }

    public boolean LJJIIZI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 87);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.LJFF || !this.f26263LJ.isLiveTypeAudio()) {
            return false;
        }
        return true;
    }

    private void LJJIJL() {
        Dialog dialogC77852Gmc;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 26).isSupported) {
            return;
        }
        if (LJJIIZI()) {
            LJIIJ();
            dialogC77852Gmc = this.LJJIJ;
        } else {
            dialogC77852Gmc = new DialogC77852Gmc(this.context, this.LIZLLL, null);
            C116971W2r.LIZJ(dialogC77852Gmc);
        }
        final IBroadcastService iBroadcastService = (IBroadcastService) ServiceManager.getService(IBroadcastService.class);
        if (dialogC77852Gmc != null && iBroadcastService != null) {
            if (iBroadcastService.shouldShowGuidePromptBubble(19)) {
                C116971W2r.LIZ(dialogC77852Gmc, new DialogInterface.OnDismissListener(iBroadcastService) { // from class: X.HIQ
                    public static ChangeQuickRedirect LIZ;
                    public final IBroadcastService LIZIZ;

                    static {
                        Covode.recordClassIndex(25427);
                    }

                    {
                        this.LIZIZ = iBroadcastService;
                    }

                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        if (PatchProxy.proxy(new Object[]{dialogInterface}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        IBroadcastService iBroadcastService2 = this.LIZIZ;
                        if (PatchProxy.proxy(new Object[]{iBroadcastService2, dialogInterface}, null, LinkControlWidget.LIZIZ, true, 129).isSupported) {
                            return;
                        }
                        C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION_SCENE, new C4317436i(""));
                        iBroadcastService2.markPopupShown(19);
                    }
                });
            } else {
                C116971W2r.LIZ(dialogC77852Gmc, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    private boolean LJJJJLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 94);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C77900GnO c77900GnO = this.LJJIIZ;
        if (c77900GnO == null || c77900GnO.m23811LJ().LIZ() == null || this.LJJIIZ.m23811LJ().LIZ().LIZIZ == null || this.LJJIIZ.m23811LJ().LIZ().LIZIZ.intValue() != 1) {
            return false;
        }
        return true;
    }

    private void LJJJLIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 103).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", "show");
        hashMap.put("live_type", "voice_live");
        hashMap.put("function_type", "live");
        hashMap.put("source", "bottom");
        C4574547f.LIZ().LIZ("livesdk_anchor_function_icon", hashMap, Room.class, C8668v.class);
    }

    private void LJJJLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 104).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", "show");
        hashMap.put("live_type", "video_live");
        hashMap.put("function_type", "live");
        hashMap.put("source", "bottom");
        C4574547f.LIZ().LIZ("livesdk_anchor_function_icon", hashMap, Room.class, C8668v.class);
    }

    private void LJJJLZIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 105).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", "click");
        hashMap.put("live_type", "video_live");
        hashMap.put("function_type", "live");
        hashMap.put("source", "bottom");
        C4574547f.LIZ().LIZ("livesdk_anchor_function_icon", hashMap, Room.class, C8668v.class);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final boolean LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 13);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C79169HIt.LIZIZ(this.LJI, 32);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final boolean LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 14);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C79169HIt.LIZIZ(this.LJI, 8);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.w$a
    public final void LJIIIZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 24).isSupported && this.LJIIL != null && LJJJJLL()) {
            this.LJIIL.LIZJ().LIZIZ(this.LJJIIZ.m23811LJ().LIZ().LIZJ.intValue(), this.LJJIIZ.m23811LJ().LIZ().LIZLLL.intValue());
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.w$a
    public final void LJIILLIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 36).isSupported) {
            return;
        }
        C79007HCn.LJII().LIZ(Boolean.FALSE);
        if (C79169HIt.LIZIZ(this.LJI, 2)) {
            LIZLLL(2);
        }
        if (C79169HIt.LIZIZ(this.LJI, 8)) {
            LIZLLL(8);
        }
        if (C79169HIt.LIZIZ(this.LJI, 32)) {
            LIZLLL(32);
        }
        if (!this.LJFF) {
            C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION.extended());
        }
    }

    public final void LJJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 56).isSupported) {
            return;
        }
        this.LJIJI = (MultiAnchorLinkWidget) this.LJJII.LIZ(6);
        if (LJJJI() != null) {
            LJJJI().LLJILJILJ().LIZ(Boolean.TRUE);
        }
        LIZIZ("multi_linker", this.LJFF);
        if (this.LJFF) {
            this.LJIIIZ.LIZ(2130856072, 2130856072, 0.34f);
            if (LJJIIZI()) {
                this.LJIIJ.LIZ(0.34f);
            }
        } else {
            this.LJIIIZ.LIZ(2130856069, 2130856069, 0.34f);
        }
        this.LJIIIIZZ.LIZJ(2);
    }

    public final void LJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 65).isSupported) {
            return;
        }
        if (C79169HIt.LIZIZ(this.LJI, 2)) {
            this.LJIIIZ.LIZ(2130856400, 2130856400, 1.0f);
        } else if (this.LJJJIL == null) {
            this.LJIIIZ.LIZ(2130856072, 2130856072, 1.0f);
            if (LJJIIZI()) {
                this.LJIIJ.LIZ(1.0f);
            }
        } else {
            this.LJIIIZ.LIZ(2130856072, 2130856072, 0.34f);
            if (LJJIIZI()) {
                this.LJIIJ.LIZ(0.34f);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final boolean LJJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 80);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C3VC c3vc = this.LJJJJLL;
        if (c3vc == null || c3vc.LIZIZ == null || !((IMicRoomService) ServiceManager.getService(IMicRoomService.class)).isMicRoom(this.f26263LJ) || !this.LJJJJLL.LIZIZ.getValue().booleanValue() || this.LJFF) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final void LIZLLL() {
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 12).isSupported && !PatchProxy.proxy(new Object[0], this, LIZIZ, false, 25).isSupported) {
            LinkCrossRoomDataHolder.LJII().LJJJJLI = "bottom_message";
            int i = this.LJI;
            if ((i == 0 || i == 2) && LinkCrossRoomDataHolder.LJII().LIZLLL == 0) {
                if (this.LJI == 2 && ((IInteractService) ServiceManager.getService(IInteractService.class)).getInteractAudienceService().LIZIZ() && !C79179HJd.LIZIZ.LIZJ()) {
                    C88440Kt0.LIZ(2131584293);
                    return;
                } else if (((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).isInDrawGuessGame()) {
                    C88440Kt0.LIZ(2131586901);
                    return;
                } else if (((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).isPlayingGame()) {
                    C88440Kt0.LIZ(2131586928);
                    return;
                } else {
                    LinkCrossRoomDataHolder.LJII().LJIJJLI = 1;
                    HashMap hashMap = new HashMap();
                    hashMap.put("is_oncemore", "0");
                    hashMap.put("connection_type", "random_pk");
                    hashMap.put("request_id", LinkCrossRoomDataHolder.LJII().LJJLIIIJLLLLLLLZ);
                    hashMap.put("pk_description", "routine");
                    hashMap.put("pk_activity_type", "");
                    C4574547f LIZ = C4574547f.LIZ();
                    C8657j c8657j = new C8657j();
                    c8657j.LIZ(300);
                    LIZ.LIZ("connection_invite", hashMap, c8657j, LinkCrossRoomDataHolder.LJII().LJIIIZ(), Room.class);
                    C79615HZx.LIZ().LIZ(this.f26263LJ.getId());
                    return;
                }
            }
            C88440Kt0.LIZ(2131584418);
        }
    }

    public final void LJIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 55).isSupported) {
            return;
        }
        this.LJIILLIIL = (LinkCrossRoomNewWidget) ((BaseLinkWidget) this.LJJII.LIZ(2));
        LIZIZ(PushConstants.URI_PACKAGE_NAME, this.LJFF);
        if (this.LJFF) {
            InteractAudienceAnchorWidget interactAudienceAnchorWidget = this.LJIIL;
            if (interactAudienceAnchorWidget != null) {
                this.LJJII.LIZ(interactAudienceAnchorWidget);
                this.LJIIL = null;
            }
            if (this.LJIILJJIL == null && C79179HJd.LIZIZ.LIZ()) {
                this.LJIILJJIL = (LinkPkInteractAudienceAnchorWidget) this.LJJII.LIZ(10);
            }
            if (LJJIIZI()) {
                ALogger.m15797i("ttlive_link", "loadCrossRoomWidget, useVoiceSceneToolbar, don't show interaction");
                return;
            }
            C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION.extended());
            this.LJIIIZ.LIZ(2130856472, 2130856473, 1.0f);
            return;
        }
        InteractAudienceGuestWidget interactAudienceGuestWidget = this.LJIILIIL;
        if (interactAudienceGuestWidget != null) {
            this.LJJII.LIZ(interactAudienceGuestWidget);
            this.LJIILIIL = null;
            C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION.extended());
        } else {
            C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION.extended());
        }
        if (this.LJIILL == null && C79179HJd.LIZIZ.LIZ()) {
            this.LJIILL = (LinkPkInteractAudienceGuestWidget) this.LJJII.LIZ(11);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 68).isSupported) {
            return;
        }
        if (this.LJFF) {
            HashMap hashMap = new HashMap();
            if (C79169HIt.LIZIZ(this.LJI, 2)) {
                hashMap.put("anchor_action_type", "open");
            } else {
                hashMap.put("anchor_action_type", "close");
            }
            C4574547f.LIZ().LIZ("livesdk_guest_connection_button_anchor", hashMap, Room.class);
        }
        LJJIIZ();
        C79209HKh c79209HKh = this.LJJJJL;
        if (c79209HKh != null) {
            c79209HKh.LIZ();
        }
        this.dataCenter.removeObserver(this);
        if (LinkCrossRoomDataHolder.LJII() != LinkCrossRoomDataHolder.LIZIZ) {
            LinkCrossRoomDataHolder.LJII().removeObserver(this);
        }
        if (((IInteractService) ServiceManager.getService(IInteractService.class)).getPkService() != null) {
            ((IInteractService) ServiceManager.getService(IInteractService.class)).getPkService().LIZIZ(this.LJJJLZIJ);
        }
        if (!this.LJFF && this.LJJI == LiveMode.AUDIO) {
            C413202Xa.m24985LJ().LIZIZ(ToolbarButton.INTERACTION_AUDIENCE, this.LJJIJLIJ);
            C413202Xa.m24985LJ().LIZIZ(ToolbarButton.RADIO_INTERACTION_AUDIENCE, this.LJJIJLIJ);
        }
        this.LJJII = null;
        this.LIZLLL.LIZJ();
        LJJIL();
        C79615HZx.LIZ().LIZIZ();
        HJ8.LIZ().LIZIZ();
        Disposable disposable = this.LJJJJJ;
        if (disposable != null && !disposable.isDisposed()) {
            this.LJJJJJ.dispose();
        }
        this.LJJIIZ = null;
        CompositeDisposable compositeDisposable = this.LJJJJJL;
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            this.LJJJJJL.dispose();
            this.LJJJJJL = null;
        }
        C79864Hdy.LIZJ.LIZJ();
        this.LJJIJIIJIL.dispose();
        DialogC77846GmW dialogC77846GmW = this.LJJIJ;
        if (dialogC77846GmW != null && dialogC77846GmW.isShowing()) {
            return;
        }
        AbstractC80293Hkt.f6985aM.LIZ(0L);
        this.LJJJ.LIZJ();
        C79404HRu.LIZJ();
        if (LJJJJZ() != null) {
            LJJJJZ().LIZIZ();
        }
        C81527IBl.LIZ();
        super.onDestroy();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        C77900GnO c77900GnO;
        Widget paidProfileCardControlWidget;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 4).isSupported) {
            return;
        }
        super.onCreate();
        C79404HRu.LIZIZ();
        ((AbstractC81278I1w) ((IBrowserService) ServiceManager.getService(IBrowserService.class)).registerExternalMethodFactory(new C42923()).m151as(autoDispose())).LIZ();
        this.f26263LJ = (Room) this.dataCenter.get("data_room");
        if (this.f26263LJ.linkerDetail != null) {
            this.LJJIII = this.f26263LJ.linkerDetail.LJFF;
        }
        this.LJFF = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.LJJI = (LiveMode) this.dataCenter.get("data_live_mode");
        this.LJJIFFI = ((Boolean) this.dataCenter.get("data_is_portrait", (String) Boolean.TRUE)).booleanValue();
        this.LJJJJLL = (C3VC) ViewModelProviders.m21142of((FragmentActivity) this.context).get(C3VC.class);
        this.LJJJJLL.LIZ(this.dataCenter);
        if (this.f26263LJ != null) {
            LJJJI().LJLIIIL().LIZIZ(new C6304i(this.f26263LJ, this.dataCenter));
        }
        AbstractC6524y LIZ = C413202Xa.LIZ();
        LIZ.LIZ(ToolbarButton.INTERACTION, this.LJIIIZ);
        if (this.LJJIFFI) {
            LIZ.LIZ(ToolbarButton.f27007PK, this.LJIIIIZZ);
        }
        if (this.LJFF && this.LJJI == LiveMode.VIDEO) {
            LJJJLL();
        }
        if (!this.LJFF && this.LJJI == LiveMode.AUDIO) {
            C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION_AUDIENCE, this.LJJIJLIJ);
            C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION_AUDIENCE.extended());
            if (LJJIJIIJI()) {
                IInteractService iInteractService = (IInteractService) ServiceManager.getService(IInteractService.class);
                if (iInteractService != null && iInteractService.getCurrentScene() == 0) {
                    LJJJJZI();
                }
                C413202Xa.LIZ().LIZ(ToolbarButton.RADIO_INTERACTION_AUDIENCE, this.LJJIL);
            }
        }
        if (!this.LJFF) {
            C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION.extended());
        }
        if (LJJIIZI()) {
            if (LJJIJIIJIL()) {
                IInteractService iInteractService2 = (IInteractService) ServiceManager.getService(IInteractService.class);
                if (iInteractService2 != null && iInteractService2.getCurrentScene() == 0) {
                    LJJJLIIL();
                }
                LIZ.LIZ(ToolbarButton.RADIO_INTERACTION_SCENE, this.LJJIZ);
            } else {
                LIZ.LIZ(ToolbarButton.INTERACTION_SCENE, this.LJIIJ);
            }
            C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION.extended());
        }
        if (LJJJJL()) {
            LIZJ("onCreate");
        }
        this.LIZLLL = new HHZ(this.f26263LJ, this.LJFF, this.LJJIIJZLJL, this.LJJI, this.LJJIFFI, LJJJI(), this.LJJJLL);
        this.LIZLLL.LIZ((w$a) this);
        this.LJJJJL = new C79209HKh(this.f26263LJ, this.LIZLLL, null);
        if (LiveSettingKeys.LIVE_ENABLE_COMMON_TALK_ROOM.getValue().booleanValue() && !this.LJFF) {
            this.LJJJJLI = new HLS(this.f26263LJ, this.LJJII, null, this);
        }
        if (this.f26263LJ.isPaidLive()) {
            this.LJIIIIZZ.LIZ(0.34f);
            this.LJIIIZ.LIZIZ(0.34f);
        }
        this.dataCenter.observeForever("cmd_pk_state_change", this).observeForever("cmd_multi_state_change", this).observeForever("data_interact_debug_info", this).observeForever("data_interact_update_room", this).observe("cmd_audience_turn_off_engine", this).observe("data_pk_match_state", this).observeForever("cmd_mic_room_anchor_status", this).observe("cmd_interact_audience_invite", this).observe("CMD_VIDEO_TALK_KTV_OPEN", this).observe("data_room_video_talk_integration_accept_audience_prepare_apply", this).observe("data_room_video_talk_integration_anchor_enable_link", this).observe("cmd_init_video_talk_room_with_pending_play_mode", this).observe("cmd_init_video_talk_room_with_pending_schema_config", this).observe("cmd_init_video_ktv", this);
        if (((IInteractService) ServiceManager.getService(IInteractService.class)).getPkService() != null) {
            ((IInteractService) ServiceManager.getService(IInteractService.class)).getPkService().LIZ(this.LJJJLZIJ);
        }
        HHG.LIZ();
        Pair LIZ2 = IQV.LIZ(C78927H9l.LIZIZ);
        ((C77900GnO) LIZ2.getFirst()).LIZ().LIZIZ(this);
        IQX.LIZ((C13491f) LIZ2.getFirst(), "ILinkInternalService");
        this.LJJIIZ = (C77900GnO) LIZ2.getFirst();
        this.LJJJJJ = (Disposable) LIZ2.getSecond();
        enableSubWidgetManager();
        boolean LIZLLL = C149496fqJ.LIZLLL();
        this.LJIJJLI = new MultiAnchorControlWidget();
        this.subWidgetManager.load(this.LJIJJLI, LIZLLL, LIZLLL);
        if (this.LJFF) {
            this.subWidgetManager.load(new PkControlWidget(this.LJJII, null), LIZLLL, LIZLLL);
            this.subWidgetManager.load(new RtcLinkerWidget());
            this.subWidgetManager.load(new LinkmicReviewWidget());
            if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 7).isSupported && this.LJJJLIIL == null) {
                this.LJJJLIIL = new MultiAnchorPkLaunchControlWidget();
                enableSubWidgetManager();
                this.subWidgetManager.load(this.LJJJLIIL);
            }
            this.subWidgetManager.load(new MultiPkMatchWidget());
        }
        if (C4284f.LJIIIIZZ.LIZ()) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 8);
            if (proxy.isSupported) {
                paidProfileCardControlWidget = (Widget) proxy.result;
            } else {
                paidProfileCardControlWidget = new PaidProfileCardControlWidget();
            }
            this.subWidgetManager.load(paidProfileCardControlWidget);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 91).isSupported && C78883H7t.LIZIZ.LIZJ(this.f26263LJ) && this.LIZJ == null) {
            enableSubWidgetManager();
            this.LIZJ = new VideoTalkLinkIntegrationWidget(this.f26263LJ);
            this.subWidgetManager.load(this.LIZJ);
            if (!this.LJFF && this.LJJI == LiveMode.VIDEO) {
                if (this.LJI == 0) {
                    this.LIZJ.LIZ();
                } else {
                    this.LIZJ.LIZIZ();
                }
            }
        }
        LIZ(HA6.class);
        LIZ(HJF.class);
        LIZ(HJE.class);
        LIZ(C421882mk.class);
        LIZ(C77588GiM.class);
        LIZ(HA1.class);
        LIZ(C78941H9z.class);
        LJJIJIL();
        if (LJJJJZ() != null) {
            LJJJJZ().LIZ();
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 95).isSupported && (c77900GnO = this.LJJIIZ) != null) {
            c77900GnO.m23811LJ().LIZIZ().subscribe(new Consumer(this) { // from class: X.H9k
                public static ChangeQuickRedirect LIZ;
                public final LinkControlWidget LIZIZ;

                static {
                    Covode.recordClassIndex(26278);
                }

                {
                    this.LIZIZ = this;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    LinkControlWidget linkControlWidget = this.LIZIZ;
                    if (PatchProxy.proxy(new Object[]{obj}, linkControlWidget, LinkControlWidget.LIZIZ, false, 117).isSupported) {
                        return;
                    }
                    int linkMode = ((IInteractService) ServiceManager.getService(IInteractService.class)).getLinkMode();
                    if (!linkControlWidget.LJFF || !C79169HIt.LIZIZ(linkMode, 32)) {
                        return;
                    }
                    linkControlWidget.dataCenter.put("data_need_restore_video_interact", Boolean.TRUE);
                    if (AbstractC4766ag.LIZ.LIZ() == null) {
                        return;
                    }
                    AbstractC4766ag.LIZ.LIZ().mo15673LJ("initBiddingConfig");
                }
            });
        }
        C79404HRu.LIZ(this.f26263LJ);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkControlWidget$3 */
    /* loaded from: classes3.dex */
    public class C42923 extends AbstractC3885b {
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(25275);
        }

        public C42923() {
        }

        @Override // com.bytedance.android.live.browser.jsbridge.AbstractC3885b
        public final Map<String, PK0<?, ?>> LIZJ(AbstractC3940c abstractC3940c) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC3940c}, this, LIZ, false, 1);
            if (proxy.isSupported) {
                return (Map) proxy.result;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("interactInvite", new C437923Uc(LinkControlWidget.this.dataCenter));
            hashMap.put("interactAudienceInvite", new C437903Ua(LinkControlWidget.this.dataCenter));
            hashMap.put("interactAudioInvite", new C437913Ub(LinkControlWidget.this.dataCenter));
            hashMap.put("getPKStatus", new C80170Hiu());
            hashMap.put("getCurrentPKInfo", new C79461HTz());
            hashMap.put("updateLinkmicSettingsSucceed", new C78573GyF());
            hashMap.put("linkmicAudienceApply", new C79235HLh());
            hashMap.put("bigPartyAudienceApply", new C79236HLi());
            return hashMap;
        }

        @Override // com.bytedance.android.live.browser.jsbridge.AbstractC3885b
        public final Map<String, AbstractC13049f.AbstractC13051b> LIZ(AbstractC3940c abstractC3940c) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC3940c}, this, LIZ, false, 2);
            if (proxy.isSupported) {
                return (Map) proxy.result;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("invitePK", C81112Hy6.LIZIZ);
            hashMap.put("tryApplyLink", C81073HxT.LIZIZ);
            hashMap.put("tryOpenInvitePanel", C81123HyH.LIZIZ);
            hashMap.put("startGuestBattle", C81079HxZ.LIZIZ);
            hashMap.put("finishGuestBattle", C81080Hxa.LIZIZ);
            hashMap.put("hidePKPanel", C81125HyJ.LIZIZ);
            hashMap.put("pauseGuestBattle", C81081Hxb.LIZIZ);
            hashMap.put("resumeGuestBattle", C81082Hxc.LIZIZ);
            hashMap.put("usePKTaskCard", C81083Hxd.LIZIZ);
            hashMap.put("updateBidSetting", C81084Hxe.LIZIZ);
            hashMap.put("setTeamTaskRunning", C81074HxU.LIZIZ);
            hashMap.put("getFansClubStatus", C81114Hy8.LIZIZ);
            hashMap.put("notifyPKEvent", C81075HxV.LIZIZ);
            hashMap.put("closeBiddingLinkMic", C81076HxW.LIZIZ);
            hashMap.put("openBiddingLinkMic", C81116HyA.LIZIZ);
            hashMap.put("paidLinkMicApply", C81077HxX.LIZIZ);
            hashMap.put("openPlayModePanel", new AbstractC13049f.AbstractC13051b(this) { // from class: X.Hy2
                public static ChangeQuickRedirect LIZ;
                public final LinkControlWidget.C42923 LIZIZ;

                static {
                    Covode.recordClassIndex(25313);
                }

                {
                    this.LIZIZ = this;
                }

                @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f.AbstractC13051b
                public final AbstractC13049f provideMethod() {
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
                    if (proxy2.isSupported) {
                        return (AbstractC13049f) proxy2.result;
                    }
                    LinkControlWidget.C42923 c42923 = this.LIZIZ;
                    PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], c42923, LinkControlWidget.C42923.LIZ, false, 4);
                    return proxy3.isSupported ? (AbstractC13049f) proxy3.result : new C78313Gu3(LinkControlWidget.this.LJFF, LinkControlWidget.this.dataCenter);
                }
            });
            hashMap.put("sendQuickInteract", C81119HyD.LIZIZ);
            hashMap.put("multiAudioAudienceApply", C81078HxY.LIZIZ);
            hashMap.put("giftMessageBoardLinkmic", C81121HyF.LIZIZ);
            hashMap.put("getGiftMessageBoardPanelParam", new AbstractC13049f.AbstractC13051b(this) { // from class: X.Hy4
                public static ChangeQuickRedirect LIZ;
                public final LinkControlWidget.C42923 LIZIZ;

                static {
                    Covode.recordClassIndex(25320);
                }

                {
                    this.LIZIZ = this;
                }

                @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f.AbstractC13051b
                public final AbstractC13049f provideMethod() {
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
                    if (proxy2.isSupported) {
                        return (AbstractC13049f) proxy2.result;
                    }
                    LinkControlWidget.C42923 c42923 = this.LIZIZ;
                    PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], c42923, LinkControlWidget.C42923.LIZ, false, 3);
                    return proxy3.isSupported ? (AbstractC13049f) proxy3.result : new C81160Hys(LinkControlWidget.this.LJI, LinkControlWidget.this.LJFF, LinkControlWidget.this.f26263LJ);
                }
            });
            return hashMap;
        }
    }

    private <T> void LIZ(Class<T> cls) {
        if (PatchProxy.proxy(new Object[]{cls}, this, LIZIZ, false, 85).isSupported) {
            return;
        }
        this.LJJJJJL.add(C87010KQi.LIZ().LIZ((Class) cls).subscribe(new Consumer(this) { // from class: X.H9u
            public static ChangeQuickRedirect LIZ;
            public final LinkControlWidget LIZIZ;

            static {
                Covode.recordClassIndex(26146);
            }

            {
                this.LIZIZ = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:58:0x0115, code lost:
                if (r13 != 13) goto L86;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x01ef, code lost:
                if (r13 != 9) goto L86;
             */
            /* JADX WARN: Code restructure failed: missing block: B:81:0x0227, code lost:
                if (r12 != null) goto L80;
             */
            @Override // io.reactivex.functions.Consumer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void accept(java.lang.Object r27) {
                /*
                    Method dump skipped, instructions count: 997
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p003X.C78936H9u.accept(java.lang.Object):void");
            }
        }));
    }

    private void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 93).isSupported) {
            return;
        }
        ALogger.m15801d("LinkControlWidget", C0002O.m25086C("showAudienceInteractionIcon from :", str));
        C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION.extended());
        this.LJIIIZ.LIZ(C448383oO.LJIILL.LIZ(), C448383oO.LJIILL.LIZ(), 1.0f);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    /* renamed from: LJ */
    public final boolean mo15716LJ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 76);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C79169HIt.LIZIZ(this.LJI, i);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final LiveWidget LJFF(int i) {
        if (i != 2) {
            if (i != 4) {
                if (i != 8) {
                    if (i != 64) {
                        if (i != 128) {
                            return null;
                        }
                        return this.LJIJJ;
                    }
                    return this.LJIJI;
                } else if (this.LJFF) {
                    return this.LJIIZILJ;
                } else {
                    return this.LJIJ;
                }
            }
            return this.LJIILLIIL;
        } else if (this.LJFF) {
            return this.LJIIL;
        } else {
            return this.LJIILIIL;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final void LJI(int i) {
        C80273HkZ c80273HkZ;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 77).isSupported || (c80273HkZ = this.LJIIIIZZ) == null) {
            return;
        }
        c80273HkZ.LIZJ(i);
        this.LJJIIJ = i;
    }

    private void LIZJ(boolean z) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 67).isSupported && !this.LJFF && !z && ((Integer) C79046HEa.LIZ().LJJIIZI).intValue() == 1 && this.f26263LJ != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            HDP.LIZ("live_end");
            ((KDS) ((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).leave(this.f26263LJ.getId(), "live_end").m149as(autoDisposeWithTransformer())).LIZ(new Consumer(currentTimeMillis) { // from class: X.HIA
                public static ChangeQuickRedirect LIZ;
                public final long LIZIZ;

                static {
                    Covode.recordClassIndex(25615);
                }

                {
                    this.LIZIZ = currentTimeMillis;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    long j = this.LIZIZ;
                    C5171b c5171b = (C5171b) obj;
                    if (PatchProxy.proxy(new Object[]{new Long(j), c5171b}, null, LinkControlWidget.LIZIZ, true, OpenAuthTask.f22015g).isSupported) {
                        return;
                    }
                    HDP.LIZ("live_end", System.currentTimeMillis() - j, c5171b.f26526LJ);
                }
            }, new Consumer(this, currentTimeMillis) { // from class: X.HI9
                public static ChangeQuickRedirect LIZ;
                public final LinkControlWidget LIZIZ;
                public final long LIZJ;

                static {
                    Covode.recordClassIndex(25616);
                }

                {
                    this.LIZIZ = this;
                    this.LIZJ = currentTimeMillis;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    LinkControlWidget linkControlWidget = this.LIZIZ;
                    long j = this.LIZJ;
                    Throwable th = (Throwable) obj;
                    if (PatchProxy.proxy(new Object[]{new Long(j), th}, linkControlWidget, LinkControlWidget.LIZIZ, false, 121).isSupported) {
                        return;
                    }
                    HDP.LIZ("live_end", System.currentTimeMillis() - j, th);
                    linkControlWidget.LIZIZ(th);
                }
            });
        }
    }

    private void LJII(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 54).isSupported || LiveSettingKeys.ENABLE_LINK_PLUGIN_PRE_LOAD.getValue().intValue() != 1) {
            return;
        }
        if ((i != 2 && i != 8 && i != 32) || PluginType.LiveResource.LIZIZ()) {
            return;
        }
        PluginType.LiveResource.LIZ(this.context, "interact", (AbstractC91058Lu8) C64646Bf6.LIZ(this.LJJL), false);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.w$a
    public final void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 34).isSupported) {
            return;
        }
        C79007HCn.LJII().LIZ(Boolean.TRUE);
        LIZJ(i);
    }

    private void LJIIIIZZ(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 59).isSupported && !this.LJFF) {
            if (this.LJJI == LiveMode.AUDIO) {
                if (C79169HIt.LIZIZ(i, 8)) {
                    C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION_AUDIENCE.extended());
                    if (LJJIJIIJI()) {
                        C413202Xa.LIZ().LIZIZ(ToolbarButton.RADIO_INTERACTION_AUDIENCE.extended(), this.LJJIL);
                    }
                } else if (i == 0) {
                    if (LJJIJIIJI()) {
                        LJJJJZI();
                        C413202Xa.LIZ().LIZ(ToolbarButton.RADIO_INTERACTION_AUDIENCE.extended(), this.LJJIL);
                    }
                    C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION_AUDIENCE.extended());
                }
            } else if (this.LJJI == LiveMode.VIDEO && LJJJJL()) {
                LIZJ("configToolbarViews");
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.w$a
    public final void LIZIZ(C4284f c4284f) {
        if (!PatchProxy.proxy(new Object[]{c4284f}, this, LIZIZ, false, 21).isSupported && c4284f != null) {
            this.LJJIIZ.LIZLLL().LIZ(c4284f);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final Widget LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{9}, this, LIZIZ, false, 9);
        if (proxy.isSupported) {
            return (Widget) proxy.result;
        }
        return this.LJJII.LIZ(9);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 30).isSupported) {
            return;
        }
        this.LIZLLL.LIZ(false, str);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final void LIZJ(int i) {
        boolean z;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 51).isSupported || !isViewValid()) {
            return;
        }
        ALogger.m15800e("ttlive_link", "switchMode " + i + " " + C79169HIt.LIZIZ(this.LJI, i));
        if (C79169HIt.LIZIZ(this.LJI, i)) {
            ALogger.m15797i("ktv", "duplicate switchMode " + this.LJI + " target=" + i);
            return;
        }
        LJII(i);
        int i2 = this.LJI;
        if (i2 != 0 && (i2 != 4 || i != 2)) {
            int i3 = this.LJI;
            if (i3 != 2) {
                if (C79169HIt.LIZIZ(i3, 2)) {
                    LIZLLL(C79169HIt.LIZJ(this.LJI, 2));
                } else {
                    LIZLLL(this.LJI);
                }
            } else if (i != 4 && i != 64) {
                LIZLLL(i3);
            }
        }
        if (i == 4 || i == 64 || i == 128) {
            this.dataCenter.put("data_interact_audience_video_translation", Boolean.FALSE);
        }
        if (this.LJFF) {
            C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION.extended());
            this.LJIIIZ.LIZ(2130856072, 2130856072, 1.0f);
            if (this.LJJJIL != null) {
                if (HJG.LIZ(this.f26263LJ) && i == 4) {
                    z = true;
                } else {
                    z = false;
                }
                LinkCrossRoomDataHolder.LJII().LJJIJLIJ = false;
                if (!z) {
                    HSB hsb = new HSB(1);
                    hsb.LIZIZ = Boolean.FALSE;
                    this.dataCenter.put("cmd_pk_state_change", hsb);
                }
            }
        } else if (!C79169HIt.LIZIZ(this.LJI, 2)) {
            C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION.extended());
            LJIIIIZZ(0);
        } else {
            C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION.extended());
            this.LJIIIZ.LIZ(C448383oO.LJIILL.LIZ(), C448383oO.LJIILL.LIZ(), 1.0f);
        }
        this.LJI = C79169HIt.LIZ(this.LJI, i);
        this.dataCenter.put("data_link_state", Integer.valueOf(this.LJI));
        C79107HGj.LIZ("switch", "target: " + i + " ,current:" + this.LJI);
        if (i == 2) {
            if (this.LJFF) {
                if (C79169HIt.LIZIZ(this.LJI, 4) && C79179HJd.LIZIZ.LIZ()) {
                    if (this.LJIILJJIL == null) {
                        this.LJIILJJIL = (LinkPkInteractAudienceAnchorWidget) this.LJJII.LIZ(10);
                    }
                } else {
                    this.LJIIL = (InteractAudienceAnchorWidget) this.LJJII.LIZ(0);
                }
            } else {
                if (C79169HIt.LIZIZ(this.LJI, 4) && C79179HJd.LIZIZ.LIZ()) {
                    if (this.LJIILL == null) {
                        this.LJIILL = (LinkPkInteractAudienceGuestWidget) this.LJJII.LIZ(11);
                    }
                } else {
                    this.LJIILIIL = (InteractAudienceGuestWidget) this.LJJII.LIZ(1);
                }
                if (LJJIIJ()) {
                    this.LJIIIZ.LIZ(2130856400, 2130856400, 1.0f);
                } else {
                    this.LJIIIZ.LIZ(C448383oO.LJIILL.LIZ(), C448383oO.LJIILL.LIZ(), 1.0f);
                }
            }
            C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION.extended());
        } else if (i == 4) {
            C9078n c9078n = this.LJJIJIIJI;
            if (c9078n != null && c9078n.LJIILIIL()) {
                this.LJJIJIIJI.dismiss();
            }
            if (AbstractC4783w.LJIIL.LIZ() != null) {
                AbstractC4783w.LJIIL.LIZ().LIZIZ();
            }
            LJJIL();
            this.LJJJI = SystemClock.elapsedRealtime();
            InteractAudienceAnchorWidget interactAudienceAnchorWidget = this.LJIIL;
            if (interactAudienceAnchorWidget != null && interactAudienceAnchorWidget.LJIIIIZZ() && !((IInteractService) ServiceManager.getService(IInteractService.class)).getInteractAudienceService().LIZIZ()) {
                this.LJIIL.LIZ(new H5N() { // from class: com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkControlWidget.4
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(25276);
                    }

                    @Override // p003X.H5N
                    public final void LIZ() {
                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        LinkControlWidget.this.LJIL();
                    }

                    @Override // p003X.H5N
                    public final void LIZ(int i4) {
                        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i4)}, this, LIZ, false, 2).isSupported) {
                            return;
                        }
                        LinkControlWidget.this.LIZLLL(4);
                    }
                });
                this.LJIIL.LJIIL();
            } else {
                LJIL();
            }
        } else if (i == 8) {
            if (this.LJFF) {
                this.LJIIZILJ = (VoiceChatRoomAnchorWidget) this.LJJII.LIZ(3);
                if (LJJJJJL()) {
                    C413202Xa.LIZ().LIZ(ToolbarButton.TEAM_FIGHT.extended(), this.LJJJ);
                    C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION_SCENE.extended(), this.LJIIJ);
                    this.LJIIZILJ.LIZ(this.LJJJ);
                }
            } else {
                this.LJJIL.LIZJ();
                this.LJIJ = (VoiceChatRoomGuestWidget) this.LJJII.LIZ(3);
                C448583oi c448583oi = this.LJJIJLIJ;
                VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = this.LJIJ;
                c448583oi.LJI = voiceChatRoomGuestWidget;
                voiceChatRoomGuestWidget.LJIIL = c448583oi;
                if (this.LIZLLL.LJI) {
                    if (LJJJI() != null && LJJJI().LJJLIIIJLLLLLLLZ().LIZ().booleanValue()) {
                        C88440Kt0.LIZ(2131585506);
                    } else {
                        C88440Kt0.LIZ(2131585505);
                    }
                    this.LIZLLL.LJIIIIZZ();
                }
            }
            ALogger.m15797i("ttlive_link", "load voice chat widget");
            LJIIIIZZ(this.LJI);
            C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION.extended());
            if (LJJIIZI()) {
                C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION_SCENE.extended(), this.LJIIJ);
                C413202Xa.LIZ().LIZIZ(ToolbarButton.f27007PK.extended());
                if (LJJIJIIJIL()) {
                    C413202Xa.LIZ().LIZIZ(ToolbarButton.RADIO_INTERACTION_SCENE.extended(), this.LJJIZ);
                }
            }
        } else if (i == 64) {
            C79615HZx.LIZ().LIZIZ();
            InteractAudienceAnchorWidget interactAudienceAnchorWidget2 = this.LJIIL;
            if (interactAudienceAnchorWidget2 != null && interactAudienceAnchorWidget2.LJIIIIZZ()) {
                this.LJIIL.LIZ(new H5N() { // from class: com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkControlWidget.5
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(25277);
                    }

                    @Override // p003X.H5N
                    public final void LIZ() {
                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        LinkControlWidget.this.LJJ();
                    }

                    @Override // p003X.H5N
                    public final void LIZ(int i4) {
                        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i4)}, this, LIZ, false, 2).isSupported) {
                            return;
                        }
                        LinkControlWidget.this.LIZLLL(64);
                    }
                });
                this.LJIIL.LJIIL();
            } else {
                LJJ();
            }
        } else if (i == 128) {
            LJJJIL();
        } else if (i == 32) {
            LIZIZ("big_party", this.LJFF);
            if (this.LJFF) {
                this.LJIL = (VideoTalkRoomAnchorWidget) this.LJJII.LIZ(5);
                this.LJIIIZ.LIZ(2130858094, 2130858094, 1.0f);
                if (LJJJJJ()) {
                    C413202Xa.LIZ().LIZ(ToolbarButton.TEAM_FIGHT.extended(), this.LJJJ);
                    C413202Xa.LIZ().LIZ(ToolbarButton.TEAM_FIGHT.extended());
                    C413202Xa.LIZ().LIZIZ(ToolbarButton.f27007PK.extended());
                    this.LJIL.LIZ(this.LJJJ);
                }
            } else {
                this.LJIIIZ.LIZ(C448383oO.LJIILL.LIZ(), C448383oO.LJIILL.LIZ(), 1.0f);
                this.LJJ = (VideoTalkRoomGuestWidget) this.LJJII.LIZ(5);
                this.LJJ.LIZ(this.LJIIIZ);
                VideoTalkLinkIntegrationWidget videoTalkLinkIntegrationWidget = this.LIZJ;
                if (videoTalkLinkIntegrationWidget != null) {
                    videoTalkLinkIntegrationWidget.LIZIZ();
                }
            }
            C80273HkZ c80273HkZ = this.LJIIIIZZ;
            if (c80273HkZ != null) {
                c80273HkZ.LIZ(0.34f);
                this.LJIIIIZZ.LIZJ();
            }
            C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION.extended());
        } else if (this.LJFF) {
            C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION.extended());
            this.LJIIIZ.LIZ(2130856072, 2130856072, 1.0f);
        } else {
            C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION.extended());
            LJIIIIZZ(0);
        }
        LJJIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final void LIZLLL(int i) {
        String str;
        String str2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 58).isSupported || !C79169HIt.LIZIZ(this.LJI, i)) {
            return;
        }
        ArrayList arrayList = new ArrayList((Collection) this.dataCenter.get("data_online_changed_list", (String) new ArrayList()));
        arrayList.clear();
        this.dataCenter.put("data_online_changed_list", arrayList);
        this.LJI = C79169HIt.LIZJ(this.LJI, i);
        this.dataCenter.put("data_link_state", Integer.valueOf(this.LJI));
        float f = 1.0f;
        if (i == 2) {
            this.LJJII.LIZ(this.LJIIL);
            this.LJIIL = null;
            this.LJJII.LIZ(this.LJIILIIL);
            this.LJIILIIL = null;
            LinkPkInteractAudienceGuestWidget linkPkInteractAudienceGuestWidget = this.LJIILL;
            if (linkPkInteractAudienceGuestWidget != null) {
                linkPkInteractAudienceGuestWidget.LIZLLL("live_end");
            }
            if (!this.LJFF) {
                C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION.extended());
            }
            LJJIIZ();
        } else if (i == 32) {
            this.LJJII.LIZ(this.LJIL);
            this.LJJII.LIZ(this.LJJ);
            this.LJIL = null;
            this.LJJ = null;
            if (!this.LJFF) {
                C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION.extended());
            }
            C80273HkZ c80273HkZ = this.LJIIIIZZ;
            if (c80273HkZ != null) {
                c80273HkZ.LIZ(1.0f);
            }
            if (LJJJJJ()) {
                C413202Xa.LIZ().LIZ(ToolbarButton.f27007PK.extended());
                C413202Xa.LIZ().LIZIZ(ToolbarButton.TEAM_FIGHT.extended(), this.LJJJ);
            }
            LJJIIZ();
            if (this.LJFF && LiveSettingKeys.LIVE_INTIMATE_CHAT_USE_NEW_PANEL.getValue().booleanValue() && this.dataCenter != null && ((Boolean) this.dataCenter.get("data_need_restore_video_interact", (String) Boolean.FALSE)).booleanValue()) {
                this.dataCenter.put("data_need_restore_video_interact", Boolean.FALSE);
                HH8.LIZJ();
                LIZIZ("auto");
            }
        } else if (i == 4) {
            if (this.LJFF) {
                HashMap hashMap = new HashMap();
                C8657j c8657j = new C8657j();
                hashMap.put("event_page", "live_detail");
                hashMap.put("room_id", String.valueOf(this.f26263LJ.getId()));
                hashMap.put("anchor_id", String.valueOf(this.f26263LJ.getOwnerUserId()));
                if (this.f26263LJ.getId() == LinkCrossRoomDataHolder.LJII().LIZLLL) {
                    hashMap.put("inviter_id", String.valueOf(this.f26263LJ.getOwner().getId()));
                    hashMap.put("invitee_id", String.valueOf(LinkCrossRoomDataHolder.LJII().LJFF));
                } else {
                    hashMap.put("inviter_id", String.valueOf(LinkCrossRoomDataHolder.LJII().LJFF));
                    hashMap.put("invitee_id", String.valueOf(this.f26263LJ.getOwner().getId()));
                }
                if (LinkCrossRoomDataHolder.LJII().LJIJJLI == 1) {
                    str = "random";
                } else {
                    str = "manual";
                }
                hashMap.put("match_type", str);
                if (LinkCrossRoomDataHolder.LJII().LJIIJJI > 0) {
                    hashMap.put("pk_time", String.valueOf(LinkCrossRoomDataHolder.LJII().LJIIJJI));
                }
                if (LinkCrossRoomDataHolder.LJII().LJJI) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                hashMap.put("is_oncemore", str2);
                hashMap.put("channel_id", String.valueOf(LinkCrossRoomDataHolder.LJII().LIZLLL));
                hashMap.put("pk_id", String.valueOf(LinkCrossRoomDataHolder.LJII().f26249LJ));
                if (LinkCrossRoomDataHolder.LJII().LJIIJJI > 0 && LinkCrossRoomDataHolder.LJII().LJIJJLI == 0) {
                    c8657j.LIZ(LinkCrossRoomDataHolder.LJII().LJII);
                }
                hashMap.put("connection_time", String.valueOf((System.currentTimeMillis() - this.LJJJI) / 1000));
            }
            LinkCrossRoomNewWidget linkCrossRoomNewWidget = this.LJIILLIIL;
            if (linkCrossRoomNewWidget != null) {
                this.LJJII.LIZ(linkCrossRoomNewWidget);
                this.LJIILLIIL = null;
            }
            this.LJJII.LIZ(this.LJIILJJIL);
            this.LJJII.LIZ(this.LJIILL);
            this.LJIILL = null;
            this.LJIILJJIL = null;
            if (C79169HIt.LIZIZ(this.LJI, 2)) {
                if (this.LJFF) {
                    this.LJIIL = (InteractAudienceAnchorWidget) this.LJJII.LIZ(0);
                } else {
                    this.LJIILIIL = (InteractAudienceGuestWidget) this.LJJII.LIZ(1);
                }
            }
            LJJIIZ();
        } else if (i == 8) {
            ALogger.m15797i("ttlive_link", "unload mVoiceChatRoomGuestWidget");
            this.LJJII.LIZ(this.LJIIZILJ);
            this.LJJII.LIZ(this.LJIJ);
            this.LJIIZILJ = null;
            this.LJIJ = null;
            if (!this.LJFF) {
                C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION.extended());
                LJIIIIZZ(0);
            } else if (LJJIIZI()) {
                if (LJJIJIIJIL()) {
                    LJJJLIIL();
                    C413202Xa.LIZ().LIZ(ToolbarButton.RADIO_INTERACTION_SCENE.extended(), this.LJJIZ);
                    C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION_SCENE.extended(), this.LJIIJ);
                }
                C413202Xa.LIZ().LIZ(ToolbarButton.f27007PK.extended());
                if (LJJJJJL()) {
                    C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION_SCENE.extended(), this.LJIIJ);
                    C413202Xa.LIZ().LIZIZ(ToolbarButton.TEAM_FIGHT.extended(), this.LJJJ);
                }
            } else {
                C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION.extended());
            }
            LJJIIZ();
        } else if (i == 64) {
            this.LJJII.LIZ(this.LJIJI);
            this.LJIJI = null;
            if (LJJJI() != null) {
                LJJJI().LLJILJILJ().LIZ(Boolean.FALSE);
            }
            this.LJIJJLI.LJIIIIZZ();
            LJI(0);
            C80273HkZ c80273HkZ2 = this.LJIIIIZZ;
            if (c80273HkZ2 != null) {
                c80273HkZ2.m23721LJ();
            }
            LJJIIZ();
        } else if (i == 128) {
            this.LJJII.LIZ(this.LJIJJ);
            this.LJIJJ = null;
            LJI(0);
            C80273HkZ c80273HkZ3 = this.LJIIIIZZ;
            if (c80273HkZ3 != null) {
                c80273HkZ3.m23721LJ();
            }
            LJJIIZ();
        }
        if (this.LJIIIZ != null) {
            if (C79169HIt.LIZIZ(this.LJI, 2)) {
                if (this.LJFF || ((Integer) C79046HEa.LIZ().LJJIIZI).intValue() == 0) {
                    this.LJIIIZ.LIZ(C448383oO.LJIILL.LIZ(), C448383oO.LJIILL.LIZ(), 1.0f);
                }
            } else if (C79169HIt.LIZIZ(this.LJI, 32)) {
                if (this.LJFF) {
                    this.LJIIIZ.LIZ(2130858094, 2130858094, 1.0f);
                } else {
                    this.LJIIIZ.LIZ(C448383oO.LJIILL.LIZ(), C448383oO.LJIILL.LIZ(), 1.0f);
                }
            } else if (this.LJFF) {
                if (this.LJJI == LiveMode.VIDEO) {
                    LJJJLL();
                }
                if (LJJJJLI()) {
                    f = 0.34f;
                }
                this.LJIIIZ.LIZ(2130856072, 2130856072, f);
            } else {
                this.LJIIIZ.LIZ(C448383oO.LJIILL.LIZ(), C448383oO.LJIILL.LIZ(), 1.0f);
            }
        }
        if (i != 2 && this.LJFF && ((IMicRoomService) ServiceManager.getService(IMicRoomService.class)).isMicRoom(this.f26263LJ)) {
            C79007HCn.LJII().f6672LJ = true;
            this.LIZLLL.LIZ(true, "");
        }
        if (this.LJI == 0 && !this.LJFF && this.LJJI == LiveMode.VIDEO) {
            VideoTalkLinkIntegrationWidget videoTalkLinkIntegrationWidget = this.LIZJ;
            if (videoTalkLinkIntegrationWidget != null) {
                videoTalkLinkIntegrationWidget.LIZ();
            }
            if (LJJJJL()) {
                LIZJ("unload widget");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:252:0x0076, code lost:
        if (r4.equals("cmd_init_video_ktv") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x01a0, code lost:
        if (r4.equals("data_pk_match_state") != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x01bf, code lost:
        if (r4.equals("cmd_audience_turn_off_engine") != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0203, code lost:
        if (r4.equals("cmd_interact_audience_invite") != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x02e5, code lost:
        if (r4.equals("data_interact_update_room") != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0365, code lost:
        if (r4.equals("data_room_video_talk_integration_accept_audience_prepare_apply") != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x041d, code lost:
        if (r4.equals("cmd_init_video_talk_room_with_pending_play_mode") != false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0452, code lost:
        if (r4.equals("cmd_init_video_talk_room_with_pending_schema_config") != false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x04ba, code lost:
        if (r4.equals("cmd_multi_state_change") != false) goto L225;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0205  */
    @Override // androidx.lifecycle.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void onChanged(com.bytedance.ies.sdk.widgets.KVData r24) {
        /*
            Method dump skipped, instructions count: 1628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkControlWidget.onChanged(java.lang.Object):void");
    }

    public static void LIZIZ(String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, null, LIZIZ, true, 82).isSupported) {
            return;
        }
        LIZ(str, z, false);
    }

    private void LIZ(final C9532b c9532b, int i) {
        if (PatchProxy.proxy(new Object[]{c9532b, 2131584138}, this, LIZIZ, false, 44).isSupported) {
            return;
        }
        ((KDS) ((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).getLatestBanRecord(13L).m149as(autoDisposeWithTransformer())).LIZ(new Consumer(this, c9532b, 2131584138) { // from class: X.HIR
            public static ChangeQuickRedirect LIZ;
            public final LinkControlWidget LIZIZ;
            public final C9532b LIZJ;
            public final int LIZLLL;

            static {
                Covode.recordClassIndex(26551);
            }

            {
                this.LIZIZ = this;
                this.LIZJ = c9532b;
                this.LIZLLL = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                LinkControlWidget linkControlWidget = this.LIZIZ;
                C9532b c9532b2 = this.LIZJ;
                int i2 = this.LIZLLL;
                C5176i<C4275a> c5176i = (C5176i) obj;
                if (PatchProxy.proxy(new Object[]{c9532b2, Integer.valueOf(i2), c5176i}, linkControlWidget, LinkControlWidget.LIZIZ, false, 127).isSupported) {
                    return;
                }
                C81922IQq.LIZIZ.LIZ(linkControlWidget.context, c9532b2, i2, c5176i);
            }
        }, HJ4.LIZIZ);
    }

    private void LIZIZ(int i, DialogInterface.OnDismissListener onDismissListener) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), onDismissListener}, this, LIZIZ, false, 73).isSupported) {
            return;
        }
        LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
        HashMap hashMap = new HashMap();
        if (AbstractC4782v.LJIIL.LIZ() != null) {
            hashMap.put("anchor_connect_status", String.valueOf(AbstractC4782v.LJIIL.LIZ().mo15709LJ().LJIIL()));
        }
        if (LJII.LJJJ != null && LJII.LJIJJLI == 0 && LJII.LJII == 11) {
            hashMap.put("room_status", "best_invite_matching");
        } else if (((IInteractService) ServiceManager.getService(IInteractService.class)).getInteractAudienceService().LIZIZ()) {
            hashMap.put("room_status", "audience_connection");
        } else {
            hashMap.put("room_status", "live");
        }
        C4574547f.LIZ().LIZ("livesdk_interact_icon_click", hashMap, this.f26263LJ);
        LJII.LJJIJLIJ = false;
        if (LJII.LJJJZ) {
            this.LJII = C79220HKs.LIZ(this.dataCenter, this).LIZLLL();
            this.LJII.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
            this.LJII.setOnDismissListener(onDismissListener);
        } else if (LJII.LJJL) {
            C88440Kt0.LIZ(2131584385);
        } else if (C79615HZx.LIZ().LIZLLL()) {
            C88440Kt0.LIZ(2131586985, 1);
        } else if ((C79615HZx.LIZ().LIZJ() || LJII.LJJJ != null) && LJII.LJIJJLI != 2) {
            if (C79615HZx.LIZ().LIZJ()) {
                if (AbstractC4783w.LJIIL.LIZ() != null) {
                    try {
                        AbstractC4783w.LJIIL.LIZ().LIZ(onDismissListener);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } else {
                HOC hoc = new HOC();
                hoc.show(C439993ar.LIZIZ(getContext()).getSupportFragmentManager(), "PkCancelMatchDialog");
                this.LJJIJIIJI = hoc;
            }
            C9078n c9078n = this.LJJIJIIJI;
            if (c9078n != null) {
                c9078n.setOnDismissListener(onDismissListener);
            }
        } else if (LJJJJIZL()) {
            if (!isViewValid()) {
                return;
            }
            this.LJII = C79220HKs.LIZ(this.dataCenter, this).m23760LJ();
            C79915Hen LIZ = C79915Hen.LIZ(3, this.LJII, this.dataCenter, (AbstractC79905Hed) null);
            LIZ.LIZIZ = true;
            C79220HKs c79220HKs = this.LJII;
            c79220HKs.LIZJ = LIZ;
            c79220HKs.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
        } else if (this.LJIIIIZZ.LJIIL != 0) {
            this.LJII = C79220HKs.LIZ(this.dataCenter, this).LIZ(7);
            LIZ((DialogInterface.OnDismissListener) null);
            this.LJII.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
        } else {
            if (C79615HZx.LIZ().LIZJ()) {
                this.LJII = C79220HKs.LIZ(this.dataCenter, this).LIZ(i);
                this.LJII.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
            } else {
                if (this.f26263LJ.isLiveTypeAudio()) {
                    C4574547f.LIZ().LIZ("livesdk_pk_icon_click", this.f26263LJ);
                }
                C79864Hdy.LIZJ.LIZIZ();
                if (!isViewValid()) {
                    return;
                }
                C79220HKs c79220HKs2 = this.LJII;
                if ((c79220HKs2 == null || !c79220HKs2.isVisible()) && LJJJJ()) {
                    this.LJII = C79220HKs.LIZ(this.dataCenter, this).LIZ(i);
                    this.LJII.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
                }
            }
            this.LJII.setOnDismissListener(onDismissListener);
            LIZ(onDismissListener);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.cv$a
    public final void LIZ(int i, DialogInterface.OnDismissListener onDismissListener) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), onDismissListener}, this, LIZIZ, false, 72).isSupported) {
            return;
        }
        if (LJJJJI()) {
            C88440Kt0.LIZ(2131584305);
        } else if (this.f26263LJ.getStreamType() == LiveMode.SCREEN_RECORD && !LJIILIIL()) {
            C88440Kt0.LIZ(LK5.LIZ(2131583480));
        } else if (this.f26263LJ.isPaidLive()) {
            C88440Kt0.LIZ(LK5.LIZ(2131586754));
        } else {
            LinkCrossRoomDataHolder.LJII();
            AbstractC4256d abstractC4256d = null;
            if (IQV.LIZ("PkDataContext", PkDataContext.class) != null) {
                abstractC4256d = ((PkDataContext) IQV.LIZ("PkDataContext", PkDataContext.class)).LJIIIZ.getValue();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("current_mode", String.valueOf(this.LJI));
            if (abstractC4256d != null) {
                String str = abstractC4256d.LIZ;
                str.toString();
                hashMap.put("pk_state", str);
            }
            C2IN.LIZIZ().LIZ("ttlive_pk", hashMap);
            View view = this.LJJJIL;
            if (view != null && view.getParent() == this.LJJJJIZL) {
                C79615HZx.LIZ().LIZIZ();
                HSB hsb = new HSB(1);
                hsb.LIZIZ = Boolean.FALSE;
                LinkCrossRoomDataHolder.LJII().LJJIJLIJ = false;
                this.dataCenter.put("cmd_pk_state_change", hsb);
                return;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (!LiveConfigSettingKeys.LIVE_PK_ENABLE.getValue().booleanValue()) {
                C88440Kt0.LIZ(LiveConfigSettingKeys.LIVE_PK_DISABLE_TOAST.getValue());
                return;
            }
            Room room = this.f26263LJ;
            if (room != null && room.getMosaicStatus() == 1) {
                C88440Kt0.LIZ(2131585806);
            } else if (((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).isInDrawGuessGame()) {
                C88440Kt0.LIZ(2131586901);
            } else if (((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).isPlayingGame()) {
                C88440Kt0.LIZ(2131586928);
            } else if (HTD.LIZIZ.LIZ() != null && HTD.LIZIZ.LIZ().LJJJLIIL && !LiveSettingKeys.PK_SWITCH_ENABLE.getValue().booleanValue()) {
                C88440Kt0.LIZ(2131586936);
            } else if (((IInteractService) ServiceManager.getService(IInteractService.class)).getPkService().LIZ()) {
                if (((Integer) this.dataCenter.get("data_operational_play_invite_count_down", (String) 0)).intValue() > 0) {
                    ((IInteractService) ServiceManager.getService(IInteractService.class)).getPkService().LIZ(((Integer) this.dataCenter.get("data_operational_play_invite_count_down", (String) 0)).intValue(), 2);
                } else {
                    C88440Kt0.LIZ(2131584344);
                }
            } else {
                int i3 = this.LJI;
                if (i3 == 0) {
                    LIZIZ(i, onDismissListener);
                } else if (C79169HIt.LIZIZ(i3, 64)) {
                    this.LJIJI.LIZLLL();
                } else if (C79169HIt.LIZIZ(this.LJI, 128)) {
                    this.LJIJJ.LIZJ();
                } else if (C79169HIt.LIZIZ(this.LJI, 4)) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("room_status", "2pk");
                    if (AbstractC79154HIe.LIZIZ()) {
                        hashMap2.put("room_status", "random_npk_matching");
                    }
                    hashMap2.put("channel_id", String.valueOf(LinkCrossRoomDataHolder.LJII().LIZLLL));
                    hashMap2.put("anchor_cnt", "2");
                    C4574547f.LIZ().LIZ("livesdk_interact_icon_click", hashMap2, this.f26263LJ);
                    if (AbstractC79154HIe.LIZIZ() && C4566a.LIZJ.LIZ() != null) {
                        C4566a.LIZJ.LIZ().LIZ(false, "npk_connect");
                    } else if (abstractC4256d != null && !(abstractC4256d instanceof AbstractC4256d.C4257a)) {
                        LinkCrossRoomNewWidget linkCrossRoomNewWidget = this.LJIILLIIL;
                        if (linkCrossRoomNewWidget != null && (linkCrossRoomNewWidget instanceof LinkCrossRoomAnchorWidget)) {
                            linkCrossRoomNewWidget.LJIIIIZZ();
                        }
                    } else {
                        C88440Kt0.LIZ(2131586989);
                    }
                } else if (C79169HIt.LIZIZ(this.LJI, 16)) {
                    C88440Kt0.LIZ(2131585464);
                } else if (C79169HIt.LIZIZ(this.LJI, 32)) {
                    C88440Kt0.LIZ(2131587851);
                } else if (C79169HIt.LIZIZ(this.LJI, 2)) {
                    if (((IInteractService) ServiceManager.getService(IInteractService.class)).getInteractAudienceService().LIZIZ() && !C79179HJd.LIZIZ.LIZJ()) {
                        C88440Kt0.LIZ(2131584293);
                    } else {
                        LIZIZ(i, onDismissListener);
                    }
                } else if (C79169HIt.LIZIZ(this.LJI, 8)) {
                    C88440Kt0.LIZ(2131587850);
                }
            }
        }
    }

    public void LIZ(final int i, final C5923dp c5923dp) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c5923dp}, this, LIZIZ, false, 100).isSupported) {
            return;
        }
        v$a v_a = new v$a(this.context);
        v_a.LIZ(4);
        C116971W2r.LIZJ(v_a.mo15264LJ(2131587856).LIZLLL(2131587855).LIZIZ(0, 2131582657, new DialogInterface.OnClickListener(this, i) { // from class: X.H9s
            public static ChangeQuickRedirect LIZ;
            public final LinkControlWidget LIZIZ;
            public final int LIZJ;

            static {
                Covode.recordClassIndex(26285);
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
                LinkControlWidget linkControlWidget = this.LIZIZ;
                int i3 = this.LIZJ;
                if (PatchProxy.proxy(new Object[]{Integer.valueOf(i3), dialogInterface, Integer.valueOf(i2)}, linkControlWidget, LinkControlWidget.LIZIZ, false, 116).isSupported) {
                    return;
                }
                if (i3 == 0 || i3 == 4) {
                    linkControlWidget.LIZLLL.LIZIZ(C78883H7t.LIZIZ.LIZJ(linkControlWidget.f26263LJ));
                } else if (i3 == 13) {
                    int intValue = AbstractC80293Hkt.f6984aL.LIZ().intValue();
                    AbstractC4766ag LIZ2 = AbstractC4766ag.LIZ.LIZ();
                    if (LIZ2 != null) {
                        if (intValue == 12) {
                            LIZ2.LIZ(12, (Integer) null, (String) null);
                        } else {
                            LIZ2.LIZ(8, (Integer) null, (String) null);
                        }
                    }
                }
                dialogInterface.dismiss();
            }
        }).LIZIZ(1, 2131582403, new DialogInterface.OnClickListener(c5923dp) { // from class: X.H9n
            public static ChangeQuickRedirect LIZ;
            public final C5923dp LIZIZ;

            static {
                Covode.recordClassIndex(26287);
            }

            {
                this.LIZIZ = c5923dp;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                C5923dp c5923dp2 = this.LIZIZ;
                if (PatchProxy.proxy(new Object[]{c5923dp2, dialogInterface, Integer.valueOf(i2)}, null, LinkControlWidget.LIZIZ, true, 115).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
                if (c5923dp2 == null) {
                    return;
                }
                c5923dp2.LLLILZJ().LIZ(Integer.valueOf(OpenPanelType.NONE.value));
            }
        }).LIZLLL());
    }

    public LinkControlWidget(HIZ hiz, ViewGroup viewGroup, Boolean bool) {
        this.LJJII = hiz;
        this.LJJJJIZL = viewGroup;
        this.LJJIIJZLJL = bool.booleanValue();
        C79404HRu.LIZ();
    }

    public static void LIZ(String str, boolean z, boolean z2) {
        String str2;
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, null, LIZIZ, true, 83).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("mode", str);
        String str3 = "1";
        if (!z2) {
            str2 = "0";
        } else {
            str2 = str3;
        }
        hashMap.put("stream_mix_on_client", str2);
        if (!z && ((Integer) C79046HEa.LIZ().LJJIIZI).intValue() != 2) {
            str3 = "0";
        }
        hashMap.put("is_in", str3);
        ((IPerformanceManager) ServiceManager.getService(IPerformanceManager.class)).onModuleStart("link_mic", hashMap);
    }
}
