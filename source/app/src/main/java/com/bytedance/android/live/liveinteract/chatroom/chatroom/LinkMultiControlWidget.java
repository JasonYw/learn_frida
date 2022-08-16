package com.bytedance.android.live.liveinteract.chatroom.chatroom;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
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
import com.bytedance.android.live.liveinteract.api.BaseLinkMultiControlWidget;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.chatroom.model.C4275a;
import com.bytedance.android.live.liveinteract.api.chatroom.model.OpenPanelType;
import com.bytedance.android.live.liveinteract.api.chatroom.p339b.C4272o;
import com.bytedance.android.live.liveinteract.api.chatroom.p339b.C4273p;
import com.bytedance.android.live.liveinteract.api.data.C4284f;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkMultiControlWidget;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.bf$a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p354vm.C4378a;
import com.bytedance.android.live.liveinteract.interact.audience.InteractAudienceAnchorWidget;
import com.bytedance.android.live.liveinteract.interact.audience.InteractAudienceGuestWidget;
import com.bytedance.android.live.liveinteract.paidlink.profilecard.C4722a;
import com.bytedance.android.live.liveinteract.paidlink.profilecard.PaidProfileCardControlWidget;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4760aa;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4765af;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4775l;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4779q;
import com.bytedance.android.live.liveinteract.videotalk.prepareapply.VideoTalkLinkIntegrationWidget;
import com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomAnchorWidget;
import com.bytedance.android.live.liveinteract.videotalk.widget.VideoTalkRoomGuestWidget;
import com.bytedance.android.live.liveinteract.voicechat.VoiceChatRoomAnchorWidget;
import com.bytedance.android.live.liveinteract.voicechat.VoiceChatRoomGuestWidget;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.room.IMicRoomService;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.depend.PluginType;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.p517u.C6304i;
import com.bytedance.android.livesdk.chatroom.p517u.C6306l;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.message.linker.C8690o;
import com.bytedance.android.livesdk.message.model.C8854es;
import com.bytedance.android.livesdk.widget.v$a;
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
import com.p3021tt.miniapp.debug.devtool.BdpDebugHttpRequest;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import p002O.C0002O;
import p003X.AbstractC416582eC;
import p003X.AbstractC419782jM;
import p003X.AbstractC4569445g;
import p003X.AbstractC77996Gow;
import p003X.AbstractC78050Gpo;
import p003X.AbstractC79168HIs;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC81278I1w;
import p003X.AbstractC90419Ljp;
import p003X.AbstractC91058Lu8;
import p003X.C116971W2r;
import p003X.C138182ctN;
import p003X.C2IN;
import p003X.C2W3;
import p003X.C3VC;
import p003X.C413202Xa;
import p003X.C419012i7;
import p003X.C421882mk;
import p003X.C424272qb;
import p003X.C437903Ua;
import p003X.C437913Ub;
import p003X.C437923Uc;
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
import p003X.C78922H9g;
import p003X.C78941H9z;
import p003X.C79007HCn;
import p003X.C79046HEa;
import p003X.C79107HGj;
import p003X.C79169HIt;
import p003X.C79171HIv;
import p003X.C79174HIy;
import p003X.C79175HIz;
import p003X.C79179HJd;
import p003X.C79220HKs;
import p003X.C79235HLh;
import p003X.C79236HLi;
import p003X.C79242HLo;
import p003X.C79461HTz;
import p003X.C79615HZx;
import p003X.C80170Hiu;
import p003X.C81085Hxf;
import p003X.C81086Hxg;
import p003X.C81087Hxh;
import p003X.C81088Hxi;
import p003X.C81089Hxj;
import p003X.C81090Hxk;
import p003X.C81091Hxl;
import p003X.C81092Hxm;
import p003X.C81093Hxn;
import p003X.C81094Hxo;
import p003X.C81095Hxp;
import p003X.C81096Hxq;
import p003X.C81113Hy7;
import p003X.C81115Hy9;
import p003X.C81117HyB;
import p003X.C81120HyE;
import p003X.C81122HyG;
import p003X.C81124HyI;
import p003X.C81127HyL;
import p003X.C81527IBl;
import p003X.C81922IQq;
import p003X.C87010KQi;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.C88469KtT;
import p003X.DialogC77846GmW;
import p003X.DialogC77852Gmc;
import p003X.DialogInterface$OnClickListenerC79155HIf;
import p003X.HA1;
import p003X.HH8;
import p003X.HHG;
import p003X.HHY;
import p003X.HIE;
import p003X.HJ0;
import p003X.HLS;
import p003X.IQV;
import p003X.IQX;
import p003X.KDS;
import p003X.LK5;
import p003X.PK0;

/* loaded from: classes3.dex */
public class LinkMultiControlWidget extends BaseLinkMultiControlWidget implements Observer<KVData>, do$b, bf$a, AbstractC4775l, AbstractC4569445g {
    public static ChangeQuickRedirect LIZIZ;
    public VideoTalkLinkIntegrationWidget LIZJ;
    public HHY LIZLLL;

    /* renamed from: LJ */
    public Room f26264LJ;
    public boolean LJFF;
    public int LJI;
    public C79220HKs LJII;
    public int LJIIJ;
    public InteractAudienceAnchorWidget LJIIJJI;
    public InteractAudienceGuestWidget LJIIL;
    public VoiceChatRoomAnchorWidget LJIILIIL;
    public VoiceChatRoomGuestWidget LJIILJJIL;
    public VideoTalkRoomAnchorWidget LJIILL;
    public VideoTalkRoomGuestWidget LJIILLIIL;
    public LiveMode LJIIZILJ;
    public boolean LJIJ;
    public AbstractC79168HIs LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public C77900GnO LJIL;
    public C79220HKs LJJ;
    public DialogC77846GmW LJJI;
    public Disposable LJJIIJZLJL;
    public HLS LJJIIZI;
    public C3VC LJJIJ;
    public String LJJIJIIJI;
    public C448583oi LJJIFFI = new C448583oi(this);
    public C448653op LJJII = new C448653op(this);
    public C448383oO LJIIIIZZ = new C448383oO(this, this);
    public C448493oZ LJIIIZ = new C448493oZ(this, this);
    public C448573oh LJJIII = new C448573oh();
    public C78377Gv5 LJJIIJ = new C78377Gv5();
    public CompositeDisposable LJJIIZ = new CompositeDisposable();
    public boolean LJJIJIIJIL = false;
    public CompositeDisposable LJJIJIL = new CompositeDisposable();
    public AbstractC419782jM LJJIJL = new AbstractC419782jM(this) { // from class: com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkMultiControlWidget.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(25280);
        }

        @Override // p003X.AbstractC419782jM
        public final void LIZ(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
                return;
            }
            C88440Kt0.LIZ(str);
        }
    };
    public Observer<AbstractC4256d> LJJIJLIJ = new Observer<AbstractC4256d>() { // from class: com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkMultiControlWidget.2
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(25281);
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(AbstractC4256d abstractC4256d) {
            if (!PatchProxy.proxy(new Object[]{abstractC4256d}, this, LIZ, false, 1).isSupported) {
                LinkMultiControlWidget linkMultiControlWidget = LinkMultiControlWidget.this;
                if (!PatchProxy.proxy(new Object[]{abstractC4256d}, linkMultiControlWidget, LinkMultiControlWidget.LIZIZ, false, 2).isSupported && linkMultiControlWidget.LJFF) {
                    C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION.extended());
                    if (linkMultiControlWidget.LJIILLIIL()) {
                        C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION.extended());
                    }
                    if (LinkCrossRoomDataHolder.LJII().LIZJ) {
                        if (!(abstractC4256d instanceof AbstractC4256d.C4257a)) {
                            if (((Boolean) linkMultiControlWidget.dataCenter.get("cmd_what_audience_join_self_link", (String) Boolean.FALSE)).booleanValue()) {
                                linkMultiControlWidget.LJIIIIZZ.LIZ(2130856400, 2130856400, 1.0f);
                            } else {
                                linkMultiControlWidget.LJIIIIZZ.LIZ(2130856069, 2130856069, 1.0f);
                            }
                            linkMultiControlWidget.LJIIIZ.LIZ(0.34f);
                            return;
                        }
                        linkMultiControlWidget.LJIIIIZZ.LIZ(2130856472, 2130856473, 1.0f);
                        return;
                    }
                    linkMultiControlWidget.LJIILIIL();
                }
            }
        }
    };
    public final int LJJIL = LiveSettingKeys.LIVE_SEI_LOG_FREQUENCY.getValue().intValue();
    public AbstractC91058Lu8 LJJIZ = new AbstractC91058Lu8(this) { // from class: com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkMultiControlWidget.4
        static {
            Covode.recordClassIndex(25283);
        }

        @Override // p003X.AbstractC91058Lu8
        public final void LIZ(String str) {
        }

        @Override // p003X.AbstractC91058Lu8
        public final void LIZIZ(String str) {
        }
    };

    static {
        Covode.recordClassIndex(25279);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final void LIZIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZIZ, false, 104).isSupported) {
            return;
        }
        AbstractC416582eC.LIZ(this, th);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final String LJJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 103);
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

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkMultiControlWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 105).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.do$b, com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.w$a, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i
    public final int LJJIFFI() {
        return this.LJI;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4775l
    public final void LIZ(Widget widget) {
        if (PatchProxy.proxy(new Object[]{widget}, this, LIZIZ, false, 10).isSupported) {
            return;
        }
        this.LJIJI.LIZ(widget);
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkMultiControlWidget
    public final void LIZ(Room room) {
        if (PatchProxy.proxy(new Object[]{room}, this, LIZIZ, false, 13).isSupported) {
            return;
        }
        this.f26264LJ = room;
        HHY hhy = this.LIZLLL;
        if (hhy == null) {
            return;
        }
        hhy.LIZ(room);
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkMultiControlWidget
    public final void LIZ(View view, MotionEvent motionEvent) {
        if (PatchProxy.proxy(new Object[]{view, motionEvent}, this, LIZIZ, false, 15).isSupported) {
            return;
        }
        super.LIZ(view, motionEvent);
        VideoTalkRoomGuestWidget videoTalkRoomGuestWidget = this.LJIILLIIL;
        if (videoTalkRoomGuestWidget != null) {
            videoTalkRoomGuestWidget.LIZ(view, motionEvent);
        }
        VideoTalkRoomAnchorWidget videoTalkRoomAnchorWidget = this.LJIILL;
        if (videoTalkRoomAnchorWidget == null) {
            return;
        }
        videoTalkRoomAnchorWidget.LIZ(view, motionEvent);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.bf$a
    public final void LIZ(C8690o c8690o) {
        if (PatchProxy.proxy(new Object[]{c8690o}, this, LIZIZ, false, 17).isSupported) {
            return;
        }
        VideoTalkRoomAnchorWidget videoTalkRoomAnchorWidget = this.LJIILL;
        if (videoTalkRoomAnchorWidget != null) {
            videoTalkRoomAnchorWidget.LJJIJL();
        }
        VoiceChatRoomAnchorWidget voiceChatRoomAnchorWidget = this.LJIILIIL;
        if (voiceChatRoomAnchorWidget == null) {
            return;
        }
        voiceChatRoomAnchorWidget.LIZ(c8690o.LIZIZ, c8690o);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.bf$a
    public final void LIZ(C4284f c4284f) {
        if (!PatchProxy.proxy(new Object[]{c4284f}, this, LIZIZ, false, 18).isSupported && c4284f != null) {
            this.LJIL.LIZJ().LIZ(c4284f);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4775l
    public final void LIZ(String str, int i, DialogInterface.OnDismissListener onDismissListener) {
        if (!PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), onDismissListener}, this, LIZIZ, false, 25).isSupported && this.isViewValid) {
            this.LJJ = C79220HKs.LIZ(this.dataCenter, this).LIZ(0, str, i);
            this.LJJ.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
            if (onDismissListener == null) {
                return;
            }
            this.LJJ.setOnDismissListener(onDismissListener);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.bf$a
    public final void LIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZIZ, false, 31).isSupported) {
            return;
        }
        if ((th instanceof ApiServerException) && ((ApiException) th).mErrorCode == 31011) {
            final WeakReference weakReference = new WeakReference(getContext());
            ((KDS) ((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).getLatestBanRecord(13L).m149as(autoDisposeWithTransformer())).LIZ(new Consumer(this, weakReference) { // from class: X.HA8
                public static ChangeQuickRedirect LIZ;
                public final LinkMultiControlWidget LIZIZ;
                public final WeakReference LIZJ;

                static {
                    Covode.recordClassIndex(25351);
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
                    LinkMultiControlWidget linkMultiControlWidget = this.LIZIZ;
                    WeakReference weakReference2 = this.LIZJ;
                    C5176i<C4275a> c5176i = (C5176i) obj;
                    if (PatchProxy.proxy(new Object[]{weakReference2, c5176i}, linkMultiControlWidget, LinkMultiControlWidget.LIZIZ, false, 100).isSupported) {
                        return;
                    }
                    C81922IQq.LIZIZ.LIZ((Context) weakReference2.get(), c5176i, 2131584030, 2131584138, linkMultiControlWidget.f26264LJ.isLiveTypeAudio() ? "radio_live_link" : "video_live_link");
                }
            }, C79174HIy.LIZIZ);
            return;
        }
        C88469KtT.LIZ(this.context, th, 2131585640);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.bf$a
    public final void LIZ(C8854es c8854es) {
        boolean z;
        boolean z2;
        if (!PatchProxy.proxy(new Object[]{c8854es}, this, LIZIZ, false, 33).isSupported && isViewValid() && c8854es != null) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c8854es}, this, LIZIZ, false, 34);
            if (proxy.isSupported) {
                z = ((Boolean) proxy.result).booleanValue();
            } else {
                C9532b c9532b = c8854es.LJJJZ;
                z = c9532b != null && c9532b.LIZ(this.LJFF);
            }
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c8854es}, this, LIZIZ, false, 35);
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
                    mo15715LJ(8);
                }
                if (!this.LJFF || !z2) {
                    return;
                }
                LIZ(c8854es.LJJJZ, 2131584138);
                mo15715LJ(8);
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
                mo15715LJ(2);
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
                    mo15715LJ(32);
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
                mo15715LJ(32);
            }
        }
    }

    @Override // p003X.AbstractC412722Ve
    public final void LIZ(String str) {
        VideoTalkRoomGuestWidget videoTalkRoomGuestWidget;
        VoiceChatRoomGuestWidget voiceChatRoomGuestWidget;
        InteractAudienceGuestWidget interactAudienceGuestWidget;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 38).isSupported && !this.LJFF) {
            if (TextUtils.equals(str, this.LJJIJIIJI) && LiveConfigSettingKeys.SEI_DUPLICATE_REMOVE_ENABLE.getValue().booleanValue()) {
                return;
            }
            if (this.LJIIJ % this.LJJIL == 0) {
                C2IN.LIZIZ().LIZ("ttlive_pk", str);
            }
            this.LJIIJ++;
            if (this.LJJIIZI != null && !this.f26264LJ.isLiveTypeAudio()) {
                this.LJJIIZI.LIZ(str);
            }
            if (this.LJI == 2 && (interactAudienceGuestWidget = this.LJIIL) != null) {
                interactAudienceGuestWidget.m15737LJ(str);
                this.LJJIJIIJI = str;
            }
            if (C79169HIt.LIZIZ(this.LJI, 8) && (voiceChatRoomGuestWidget = this.LJIILJJIL) != null) {
                voiceChatRoomGuestWidget.LJI(str);
                this.LJJIJIIJI = str;
            }
            if (!C79169HIt.LIZIZ(this.LJI, 32) || (videoTalkRoomGuestWidget = this.LJIILLIIL) == null) {
                return;
            }
            videoTalkRoomGuestWidget.m15666LJ(str);
            this.LJJIJIIJI = str;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.bf$a
    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 47).isSupported) {
            return;
        }
        this.LJIJJ = z;
        if (AbstractC78050Gpo.LIZ().LJI()) {
            return;
        }
        if (LJIIZILJ()) {
            if (!this.LJFF) {
                LJJIJIIJI();
                C413202Xa.LIZ().LIZ(ToolbarButton.RADIO_INTERACTION_AUDIENCE.extended(), this.LJJII);
                return;
            }
            this.LJJIII.LIZ(2130856072);
        } else if (!this.LJFF) {
            this.LJJII.LIZJ();
            C413202Xa.LIZ().LIZIZ(ToolbarButton.RADIO_INTERACTION_AUDIENCE.extended(), this.LJJII);
            C79046HEa.LIZ().LIZ((Integer) 0);
        } else {
            if (this.dataCenter != null) {
                this.dataCenter.put("data_radio_talk_dot_with_number_show", "0");
            }
            this.LJJIII.LIZ(2130856402);
        }
    }

    @Override // com.bytedance.android.livesdk.p697l.AbstractC8447a
    public final boolean LIZ(Runnable runnable, boolean z) {
        VoiceChatRoomGuestWidget voiceChatRoomGuestWidget;
        InteractAudienceGuestWidget interactAudienceGuestWidget;
        VideoTalkRoomGuestWidget videoTalkRoomGuestWidget;
        boolean z2 = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{runnable, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 49);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.LJFF && (videoTalkRoomGuestWidget = this.LJIILLIIL) != null) {
            boolean LIZ = videoTalkRoomGuestWidget.LIZ(runnable, z);
            LIZJ(LIZ);
            return LIZ;
        }
        if (!this.LJFF && (interactAudienceGuestWidget = this.LJIIL) != null) {
            z2 = interactAudienceGuestWidget.LIZ(runnable, z);
        } else if (!this.LJFF && (voiceChatRoomGuestWidget = this.LJIILJJIL) != null) {
            z2 = voiceChatRoomGuestWidget.LIZ(runnable, z);
        } else {
            VideoTalkRoomGuestWidget videoTalkRoomGuestWidget2 = this.LJIILLIIL;
            if (videoTalkRoomGuestWidget2 != null) {
                z2 = videoTalkRoomGuestWidget2.LIZ(runnable, z);
            }
        }
        LIZJ(z2);
        return z2;
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.bf$a
    public final void LIZ(String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 54).isSupported) {
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

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4775l
    public final boolean LIZ(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZIZ, false, 59);
        return proxy.isSupported ? ((Boolean) proxy.result).booleanValue() : this.LJJIJ != null && ((IMicRoomService) ServiceManager.getService(IMicRoomService.class)).isMicRoom(this.f26264LJ) && this.LJJIJ.LIZ(j);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4775l
    public final boolean LIZIZ() {
        if (this.LJI == 2) {
            return true;
        }
        return false;
    }

    private void LJIJJLI() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 41).isSupported) {
            return;
        }
        LJIL();
        AbstractC4760aa LIZIZ2 = C4722a.LIZJ.LIZIZ();
        if (LIZIZ2 != null) {
            LIZIZ2.LIZIZ();
        }
    }

    public static void LJJI() {
        if (PatchProxy.proxy(new Object[0], null, LIZIZ, true, 62).isSupported) {
            return;
        }
        ((IPerformanceManager) ServiceManager.getService(IPerformanceManager.class)).onModuleStop("link_mic");
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkMultiControlWidget
    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 14).isSupported) {
            return;
        }
        this.LJJIJIIJIL = true;
        LJIJI();
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.bf$a
    /* renamed from: LJ */
    public final void mo15757LJ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 20).isSupported && this.LJI == 2) {
            this.LJIIIIZZ.LIZJ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4775l
    public final void LJIIIIZZ() {
        C79220HKs c79220HKs;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 26).isSupported && (c79220HKs = this.LJJ) != null && c79220HKs.LJIILIIL()) {
            this.LJJ.dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4775l
    public final void LJIIIZ() {
        HHY hhy;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 28).isSupported && (hhy = this.LIZLLL) != null) {
            hhy.LIZ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4775l
    public final void LJIILJJIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 56).isSupported) {
            return;
        }
        LIZIZ(false);
    }

    private boolean LJIIZILJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.LJIJJ || !LJIJ() || !LiveConfigSettingKeys.LIVE_CURRENT_HOST_ENABLE_RADIO_ROOM_PREAPPLY.getValue().booleanValue()) {
            return false;
        }
        return true;
    }

    private boolean LJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Room room = this.f26264LJ;
        if (room == null || room.anchorAbMap == null || this.f26264LJ.anchorAbMap.get("radio_prepare_apply") == null || !this.f26264LJ.anchorAbMap.get("radio_prepare_apply").equals("1")) {
            return false;
        }
        return true;
    }

    private void LJIJI() {
        HHY hhy;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 16).isSupported && this.LJJIJIIJIL && (hhy = this.LIZLLL) != null) {
            hhy.LIZ(this.f26264LJ.getRoomId());
            this.LJJIJIIJIL = false;
        }
    }

    private void LJIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 42).isSupported) {
            return;
        }
        boolean LIZIZ2 = LIZIZ();
        if (this.LJFF) {
            InteractAudienceAnchorWidget interactAudienceAnchorWidget = this.LJIIJJI;
            if (interactAudienceAnchorWidget != null) {
                interactAudienceAnchorWidget.LIZ(LIZIZ2);
                return;
            }
            return;
        }
        InteractAudienceGuestWidget interactAudienceGuestWidget = this.LJIIL;
        if (interactAudienceGuestWidget != null) {
            interactAudienceGuestWidget.LIZIZ(LIZIZ2);
        }
    }

    private boolean LJJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 52);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C2W3 c2w3 = (C2W3) this.dataCenter.get("data_broadcast_pause_state");
        if (c2w3 == null || (c2w3.LIZ != 1 && c2w3.LIZ != 2)) {
            return false;
        }
        return true;
    }

    private boolean LJJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 66);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.LJFF || !LiveConfigSettingKeys.LIVE_ENABLE_VIDEO_TEAM_FIGHT_TOOLBAR.getValue().booleanValue()) {
            return false;
        }
        return true;
    }

    private boolean LJJIII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 67);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.LJFF || !LiveConfigSettingKeys.LIVE_ENABLE_AUDIO_TEAM_FIGHT_TOOLBAR.getValue().booleanValue()) {
            return false;
        }
        return true;
    }

    private boolean LJJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 68);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        IInteractService iInteractService = (IInteractService) ServiceManager.getService(IInteractService.class);
        if (iInteractService == null || this.LJFF || this.LJIIZILJ != LiveMode.VIDEO || iInteractService.getCurrentScene() != 0 || !C78883H7t.LIZIZ.m23784LJ(this.f26264LJ)) {
            return false;
        }
        return true;
    }

    private boolean LJJIIJZLJL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 70);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        IInteractService iInteractService = (IInteractService) ServiceManager.getService(IInteractService.class);
        if (iInteractService == null || !this.LJFF || this.LJIIZILJ != LiveMode.VIDEO || iInteractService.getCurrentScene() != 0 || C78883H7t.LIZIZ.LIZ(this.f26264LJ, true)) {
            return false;
        }
        return true;
    }

    private C6304i LJJIIZI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 74);
        if (proxy.isSupported) {
            return (C6304i) proxy.result;
        }
        if (LJJJI() != null && LJJJI().LJLIIIL() != null) {
            return LJJJI().LJLIIIL().LIZIZ();
        }
        return null;
    }

    private void LJJIJIIJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 80).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", "show");
        hashMap.put("live_type", "voice_live");
        hashMap.put("function_type", "live");
        C4574547f.LIZ().LIZ("livesdk_guest_connection_apply_icon", hashMap, Room.class, C8668v.class);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4775l
    public final boolean LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C79169HIt.LIZIZ(this.LJI, 8);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.bf$a, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4775l
    public final C4378a LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 21);
        if (proxy.isSupported) {
            return (C4378a) proxy.result;
        }
        InteractAudienceAnchorWidget interactAudienceAnchorWidget = this.LJIIJJI;
        if (interactAudienceAnchorWidget != null) {
            return interactAudienceAnchorWidget.LIZJ();
        }
        InteractAudienceGuestWidget interactAudienceGuestWidget = this.LJIIL;
        if (interactAudienceGuestWidget != null) {
            return interactAudienceGuestWidget.m15738LJ();
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4775l
    public final void LJII() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 24).isSupported || !this.isViewValid) {
            return;
        }
        DialogC77846GmW dialogC77846GmW = this.LJJI;
        if (dialogC77846GmW != null && dialogC77846GmW.isShowing()) {
            return;
        }
        this.LJJI = new DialogC77846GmW(this.LJI, this.context, LJJJI(), this.dataCenter, this.LJJIJIL, null, this.LIZLLL);
        C116971W2r.LIZJ(this.LJJI);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4775l
    public final boolean LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 29);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (C4284f.LJIIIIZZ.LIZ()) {
            return AbstractC80293Hkt.f6971Z.LIZ().booleanValue();
        }
        C4378a LJFF = LJFF();
        if (LJFF == null) {
            return false;
        }
        return LJFF.LIZIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.bf$a
    public final void LJIIL() {
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 37).isSupported && isViewValid() && C79169HIt.LIZIZ(this.LJI, 32) && !this.LJFF) {
            mo15715LJ(32);
        }
    }

    public boolean LJIILLIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 65);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.LJFF || !this.f26264LJ.isLiveTypeAudio()) {
            return false;
        }
        return true;
    }

    private void LJIJJ() {
        Dialog dialogC77852Gmc;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 23).isSupported) {
            return;
        }
        if (LJIILLIIL()) {
            LJII();
            dialogC77852Gmc = this.LJJI;
        } else {
            dialogC77852Gmc = new DialogC77852Gmc(this.context, null, this.LIZLLL);
            C116971W2r.LIZJ(dialogC77852Gmc);
        }
        final IBroadcastService iBroadcastService = (IBroadcastService) ServiceManager.getService(IBroadcastService.class);
        if (dialogC77852Gmc != null && iBroadcastService != null) {
            if (iBroadcastService.shouldShowGuidePromptBubble(19)) {
                C116971W2r.LIZ(dialogC77852Gmc, new DialogInterface.OnDismissListener(iBroadcastService) { // from class: X.HIP
                    public static ChangeQuickRedirect LIZ;
                    public final IBroadcastService LIZIZ;

                    static {
                        Covode.recordClassIndex(25329);
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
                        if (PatchProxy.proxy(new Object[]{iBroadcastService2, dialogInterface}, null, LinkMultiControlWidget.LIZIZ, true, BdpDebugHttpRequest.HTTP_SWITCHING_PROTOCOLS).isSupported) {
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

    private boolean LJJIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 72);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C77900GnO c77900GnO = this.LJIL;
        if (c77900GnO == null || c77900GnO.m23811LJ().LIZ() == null || this.LJIL.m23811LJ().LIZ().LIZIZ == null || this.LJIL.m23811LJ().LIZ().LIZIZ.intValue() != 1) {
            return false;
        }
        return true;
    }

    private void LJJIJIIJIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 81).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", "show");
        hashMap.put("live_type", "voice_live");
        hashMap.put("function_type", "live");
        hashMap.put("source", "bottom");
        C4574547f.LIZ().LIZ("livesdk_anchor_function_icon", hashMap, Room.class, C8668v.class);
    }

    private void LJJIJIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 82).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", "show");
        hashMap.put("live_type", "video_live");
        hashMap.put("function_type", "live");
        hashMap.put("source", "bottom");
        C4574547f.LIZ().LIZ("livesdk_anchor_function_icon", hashMap, Room.class, C8668v.class);
    }

    private void LJJIJL() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 83).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", "click");
        hashMap.put("live_type", "video_live");
        hashMap.put("function_type", "live");
        hashMap.put("source", "bottom");
        C4574547f.LIZ().LIZ("livesdk_anchor_function_icon", hashMap, Room.class, C8668v.class);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.bf$a
    public final void LJI() {
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 22).isSupported && this.LJIIJJI != null && LJJIIZ()) {
            this.LJIIJJI.LIZJ().LIZIZ(this.LJIL.m23811LJ().LIZ().LIZJ.intValue(), this.LJIL.m23811LJ().LIZ().LIZLLL.intValue());
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.bf$a
    public final void LJIIJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 32).isSupported) {
            return;
        }
        C79007HCn.LJII().LIZ(Boolean.FALSE);
        if (C79169HIt.LIZIZ(this.LJI, 2)) {
            mo15715LJ(2);
        }
        if (C79169HIt.LIZIZ(this.LJI, 8)) {
            mo15715LJ(8);
        }
        if (C79169HIt.LIZIZ(this.LJI, 32)) {
            mo15715LJ(32);
        }
        if (!this.LJFF) {
            C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION.extended());
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4775l
    public final void LJIILIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 48).isSupported) {
            return;
        }
        if (C79169HIt.LIZIZ(this.LJI, 2)) {
            this.LJIIIIZZ.LIZ(2130856400, 2130856400, 1.0f);
        } else if (AbstractC4779q.LIZ.LIZ() != null && !AbstractC4779q.LIZ.LIZ().LJIILIIL()) {
            this.LJIIIIZZ.LIZ(2130856072, 2130856072, 1.0f);
            if (LJIILLIIL()) {
                this.LJIIIZ.LIZ(1.0f);
            }
        } else {
            this.LJIIIIZZ.LIZ(2130856072, 2130856072, 0.34f);
            if (LJIILLIIL()) {
                this.LJIIIZ.LIZ(0.34f);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4775l
    public final boolean LJIILL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 58);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C3VC c3vc = this.LJJIJ;
        if (c3vc == null || c3vc.LIZIZ == null || !((IMicRoomService) ServiceManager.getService(IMicRoomService.class)).isMicRoom(this.f26264LJ) || !this.LJJIJ.LIZIZ.getValue().booleanValue() || this.LJFF) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4775l
    public final boolean LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 11);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C79169HIt.LIZIZ(this.LJI, 32);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 51).isSupported) {
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
        LJJI();
        this.dataCenter.removeObserver(this);
        if (LinkCrossRoomDataHolder.LJII() != LinkCrossRoomDataHolder.LIZIZ) {
            LinkCrossRoomDataHolder.LJII().removeObserver(this);
        }
        if (((IInteractService) ServiceManager.getService(IInteractService.class)).getPkService() != null) {
            ((IInteractService) ServiceManager.getService(IInteractService.class)).getPkService().LIZIZ(this.LJJIJLIJ);
        }
        if (!this.LJFF && this.LJIIZILJ == LiveMode.AUDIO) {
            C413202Xa.m24985LJ().LIZIZ(ToolbarButton.INTERACTION_AUDIENCE, this.LJJIFFI);
            C413202Xa.m24985LJ().LIZIZ(ToolbarButton.RADIO_INTERACTION_AUDIENCE, this.LJJIFFI);
        }
        this.LJIJI = null;
        this.LIZLLL.LIZJ();
        Disposable disposable = this.LJJIIJZLJL;
        if (disposable != null && !disposable.isDisposed()) {
            this.LJJIIJZLJL.dispose();
        }
        this.LJIL = null;
        CompositeDisposable compositeDisposable = this.LJJIIZ;
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            this.LJJIIZ.dispose();
            this.LJJIIZ = null;
        }
        this.LJJIJIL.dispose();
        DialogC77846GmW dialogC77846GmW = this.LJJI;
        if (dialogC77846GmW != null && dialogC77846GmW.isShowing()) {
            return;
        }
        AbstractC80293Hkt.f6985aM.LIZ(0L);
        this.LJJIIJ.LIZJ();
        if (LJJIIZI() != null) {
            LJJIIZI().LIZIZ();
        }
        C81527IBl.LIZ();
        super.onDestroy();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        C77900GnO c77900GnO;
        Widget paidProfileCardControlWidget;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 5).isSupported) {
            return;
        }
        super.onCreate();
        ((AbstractC81278I1w) ((IBrowserService) ServiceManager.getService(IBrowserService.class)).registerExternalMethodFactory(new C42983()).m151as(autoDispose())).LIZ();
        this.f26264LJ = (Room) this.dataCenter.get("data_room");
        if (this.f26264LJ.linkerDetail != null) {
            this.LJIJJ = this.f26264LJ.linkerDetail.LJFF;
        }
        this.LJFF = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.LJIIZILJ = (LiveMode) this.dataCenter.get("data_live_mode");
        this.LJIJ = ((Boolean) this.dataCenter.get("data_is_portrait", (String) Boolean.TRUE)).booleanValue();
        this.LJJIJ = (C3VC) ViewModelProviders.m21142of((FragmentActivity) this.context).get(C3VC.class);
        this.LJJIJ.LIZ(this.dataCenter);
        if (this.f26264LJ != null) {
            LJJJI().LJLIIIL().LIZIZ(new C6304i(this.f26264LJ, this.dataCenter));
        }
        Pair LIZ = IQV.LIZ(C78922H9g.LIZIZ);
        ((C77900GnO) LIZ.getFirst()).LIZIZ().LIZIZ(this);
        IQX.LIZ((C13491f) LIZ.getFirst(), "ILinkInternalService");
        this.LJIL = (C77900GnO) LIZ.getFirst();
        this.LJJIIJZLJL = (Disposable) LIZ.getSecond();
        if (((IInteractService) ServiceManager.getService(IInteractService.class)).getPkService() != null) {
            ((IInteractService) ServiceManager.getService(IInteractService.class)).getPkService().LIZ(this.LJJIJLIJ);
        }
        AbstractC6524y LIZ2 = C413202Xa.LIZ();
        LIZ2.LIZ(ToolbarButton.INTERACTION, this.LJIIIIZZ);
        if (this.LJFF && this.LJIIZILJ == LiveMode.VIDEO) {
            LJJIJIL();
        }
        if (!this.LJFF && this.LJIIZILJ == LiveMode.AUDIO) {
            C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION_AUDIENCE, this.LJJIFFI);
            C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION_AUDIENCE.extended());
            if (LJIIZILJ()) {
                IInteractService iInteractService = (IInteractService) ServiceManager.getService(IInteractService.class);
                if (iInteractService != null && iInteractService.getCurrentScene() == 0) {
                    LJJIJIIJI();
                }
                C413202Xa.LIZ().LIZ(ToolbarButton.RADIO_INTERACTION_AUDIENCE, this.LJJII);
            }
        }
        if (!this.LJFF) {
            C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION.extended());
        }
        if (LJIILLIIL()) {
            if (LJIJ()) {
                IInteractService iInteractService2 = (IInteractService) ServiceManager.getService(IInteractService.class);
                if (iInteractService2 != null && iInteractService2.getCurrentScene() == 0) {
                    LJJIJIIJIL();
                }
                LIZ2.LIZ(ToolbarButton.RADIO_INTERACTION_SCENE, this.LJJIII);
            } else {
                LIZ2.LIZ(ToolbarButton.INTERACTION_SCENE, this.LJIIIZ);
            }
            C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION.extended());
        }
        if (LJJIIJ()) {
            LIZJ("onCreate");
        }
        this.LIZLLL = new HHY(this.f26264LJ, this.LJFF, this.LJIJJLI, this.LJIIZILJ, this.LJIJ, LJJJI(), this.LJJIJL);
        this.LIZLLL.LIZ((bf$a) this);
        if (LiveSettingKeys.LIVE_ENABLE_COMMON_TALK_ROOM.getValue().booleanValue() && !this.LJFF) {
            this.LJJIIZI = new HLS(this.f26264LJ, null, this.LJIJI, this);
        }
        this.dataCenter.observeForever("data_interact_debug_info", this).observeForever("data_interact_update_room", this).observeForever("cmd_mic_room_anchor_status", this).observe("cmd_interact_audience_invite", this).observe("CMD_VIDEO_TALK_KTV_OPEN", this).observe("data_room_video_talk_integration_accept_audience_prepare_apply", this).observe("data_room_video_talk_integration_anchor_enable_link", this).observe("cmd_init_video_talk_room_with_pending_play_mode", this).observe("cmd_init_video_talk_room_with_pending_schema_config", this).observe("cmd_init_video_ktv", this);
        HHG.LIZ();
        enableSubWidgetManager();
        if (this.f26264LJ.isPaidLive()) {
            this.LJIIIIZZ.LIZIZ(0.34f);
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
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 69).isSupported && C78883H7t.LIZIZ.LIZJ(this.f26264LJ) && this.LIZJ == null) {
            enableSubWidgetManager();
            this.LIZJ = new VideoTalkLinkIntegrationWidget(this.f26264LJ);
            this.subWidgetManager.load(this.LIZJ);
            if (!this.LJFF && this.LJIIZILJ == LiveMode.VIDEO) {
                if (this.LJI == 0) {
                    this.LIZJ.LIZ();
                } else {
                    this.LIZJ.LIZIZ();
                }
            }
        }
        LIZ(C421882mk.class);
        LIZ(C77588GiM.class);
        LIZ(HA1.class);
        LIZ(C78941H9z.class);
        LJIJI();
        if (LJJIIZI() != null) {
            LJJIIZI().LIZ();
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 73).isSupported && (c77900GnO = this.LJIL) != null) {
            c77900GnO.m23811LJ().LIZIZ().subscribe(new Consumer(this) { // from class: X.H9j
                public static ChangeQuickRedirect LIZ;
                public final LinkMultiControlWidget LIZIZ;

                static {
                    Covode.recordClassIndex(25343);
                }

                {
                    this.LIZIZ = this;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    LinkMultiControlWidget linkMultiControlWidget = this.LIZIZ;
                    if (PatchProxy.proxy(new Object[]{obj}, linkMultiControlWidget, LinkMultiControlWidget.LIZIZ, false, 95).isSupported) {
                        return;
                    }
                    int linkMode = ((IInteractService) ServiceManager.getService(IInteractService.class)).getLinkMode();
                    if (!linkMultiControlWidget.LJFF || !C79169HIt.LIZIZ(linkMode, 32)) {
                        return;
                    }
                    linkMultiControlWidget.dataCenter.put("data_need_restore_video_interact", Boolean.TRUE);
                    if (AbstractC4766ag.LIZ.LIZ() == null) {
                        return;
                    }
                    AbstractC4766ag.LIZ.LIZ().mo15673LJ("initBiddingConfig");
                }
            });
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkMultiControlWidget$3 */
    /* loaded from: classes3.dex */
    public class C42983 extends AbstractC3885b {
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(25282);
        }

        public C42983() {
        }

        @Override // com.bytedance.android.live.browser.jsbridge.AbstractC3885b
        public final Map<String, PK0<?, ?>> LIZJ(AbstractC3940c abstractC3940c) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC3940c}, this, LIZ, false, 1);
            if (proxy.isSupported) {
                return (Map) proxy.result;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("interactInvite", new C437923Uc(LinkMultiControlWidget.this.dataCenter));
            hashMap.put("interactAudienceInvite", new C437903Ua(LinkMultiControlWidget.this.dataCenter));
            hashMap.put("interactAudioInvite", new C437913Ub(LinkMultiControlWidget.this.dataCenter));
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
            hashMap.put("invitePK", C81113Hy7.LIZIZ);
            hashMap.put("tryApplyLink", C81085Hxf.LIZIZ);
            hashMap.put("tryOpenInvitePanel", C81124HyI.LIZIZ);
            hashMap.put("startGuestBattle", C81091Hxl.LIZIZ);
            hashMap.put("finishGuestBattle", C81092Hxm.LIZIZ);
            hashMap.put("hidePKPanel", C81127HyL.LIZIZ);
            hashMap.put("pauseGuestBattle", C81093Hxn.LIZIZ);
            hashMap.put("resumeGuestBattle", C81094Hxo.LIZIZ);
            hashMap.put("usePKTaskCard", C81095Hxp.LIZIZ);
            hashMap.put("updateBidSetting", C81096Hxq.LIZIZ);
            hashMap.put("setTeamTaskRunning", C81086Hxg.LIZIZ);
            hashMap.put("getFansClubStatus", C81115Hy9.LIZIZ);
            hashMap.put("notifyPKEvent", C81087Hxh.LIZIZ);
            hashMap.put("closeBiddingLinkMic", C81088Hxi.LIZIZ);
            hashMap.put("openBiddingLinkMic", C81117HyB.LIZIZ);
            hashMap.put("paidLinkMicApply", C81089Hxj.LIZIZ);
            hashMap.put("openPlayModePanel", new AbstractC13049f.AbstractC13051b(this) { // from class: X.Hy3
                public static ChangeQuickRedirect LIZ;
                public final LinkMultiControlWidget.C42983 LIZIZ;

                static {
                    Covode.recordClassIndex(25380);
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
                    LinkMultiControlWidget.C42983 c42983 = this.LIZIZ;
                    PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], c42983, LinkMultiControlWidget.C42983.LIZ, false, 4);
                    return proxy3.isSupported ? (AbstractC13049f) proxy3.result : new C78313Gu3(LinkMultiControlWidget.this.LJFF, LinkMultiControlWidget.this.dataCenter);
                }
            });
            hashMap.put("sendQuickInteract", C81120HyE.LIZIZ);
            hashMap.put("multiAudioAudienceApply", C81090Hxk.LIZIZ);
            hashMap.put("giftMessageBoardLinkmic", C81122HyG.LIZIZ);
            hashMap.put("getGiftMessageBoardPanelParam", new AbstractC13049f.AbstractC13051b(this) { // from class: X.Hy5
                public static ChangeQuickRedirect LIZ;
                public final LinkMultiControlWidget.C42983 LIZIZ;

                static {
                    Covode.recordClassIndex(25385);
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
                    LinkMultiControlWidget.C42983 c42983 = this.LIZIZ;
                    PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], c42983, LinkMultiControlWidget.C42983.LIZ, false, 3);
                    return proxy3.isSupported ? (AbstractC13049f) proxy3.result : new C81160Hys(LinkMultiControlWidget.this.LJI, LinkMultiControlWidget.this.LJFF, LinkMultiControlWidget.this.f26264LJ);
                }
            });
            return hashMap;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4775l
    public final LiveWidget LJII(int i) {
        if (i != 2) {
            if (i != 8) {
                return null;
            }
            if (this.LJFF) {
                return this.LJIILIIL;
            }
            return this.LJIILJJIL;
        } else if (this.LJFF) {
            return this.LJIIJJI;
        } else {
            return this.LJIIL;
        }
    }

    private <T> void LIZ(Class<T> cls) {
        if (PatchProxy.proxy(new Object[]{cls}, this, LIZIZ, false, 63).isSupported) {
            return;
        }
        this.LJJIIZ.add(C87010KQi.LIZ().LIZ((Class) cls).subscribe(new Consumer(this) { // from class: X.H9t
            public static ChangeQuickRedirect LIZ;
            public final LinkMultiControlWidget LIZIZ;

            static {
                Covode.recordClassIndex(25342);
            }

            {
                this.LIZIZ = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:44:0x00ee, code lost:
                if (r13 != 13) goto L72;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x01c8, code lost:
                if (r13 != 9) goto L72;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x0200, code lost:
                if (r12 != null) goto L66;
             */
            @Override // io.reactivex.functions.Consumer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void accept(java.lang.Object r27) {
                /*
                    Method dump skipped, instructions count: 938
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p003X.C78935H9t.accept(java.lang.Object):void");
            }
        }));
    }

    private void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 71).isSupported) {
            return;
        }
        ALogger.m15801d("LinkControlWidget", C0002O.m25086C("showAudienceInteractionIcon from :", str));
        C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION.extended());
        this.LJIIIIZZ.LIZ(C448383oO.LJIILL.LIZ(), C448383oO.LJIILL.LIZ(), 1.0f);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.bf$a
    public final void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 30).isSupported) {
            return;
        }
        C79007HCn.LJII().LIZ(Boolean.TRUE);
        LIZJ(i);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4775l
    public final boolean LJI(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 55);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C79169HIt.LIZIZ(this.LJI, i);
    }

    private void LIZJ(boolean z) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 50).isSupported && !this.LJFF && !z && ((Integer) C79046HEa.LIZ().LJJIIZI).intValue() == 1 && this.f26264LJ != null) {
            ((KDS) ((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).leave(this.f26264LJ.getId(), "live_end").m149as(autoDisposeWithTransformer())).LIZ(HJ0.LIZIZ, new Consumer(this) { // from class: X.HIn
                public static ChangeQuickRedirect LIZ;
                public final LinkMultiControlWidget LIZIZ;

                static {
                    Covode.recordClassIndex(25357);
                }

                {
                    this.LIZIZ = this;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    this.LIZIZ.LIZIZ((Throwable) obj);
                }
            });
        }
    }

    private void LJIIIIZZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 43).isSupported || LiveSettingKeys.ENABLE_LINK_PLUGIN_PRE_LOAD.getValue().intValue() != 1) {
            return;
        }
        if ((i != 2 && i != 8 && i != 32) || PluginType.LiveResource.LIZIZ()) {
            return;
        }
        PluginType.LiveResource.LIZ(this.context, "interact", (AbstractC91058Lu8) C64646Bf6.LIZ(this.LJJIZ), false);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.presenter.bf$a
    public final void LIZIZ(C4284f c4284f) {
        if (!PatchProxy.proxy(new Object[]{c4284f}, this, LIZIZ, false, 19).isSupported && c4284f != null) {
            this.LJIL.LIZLLL().LIZ(c4284f);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4775l
    public final void LJFF(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 45).isSupported && i == 4 && C79169HIt.LIZIZ(this.LJI, 2)) {
            if (this.LJFF) {
                this.LJIIJJI = (InteractAudienceAnchorWidget) this.LJIJI.LIZ(0);
            } else {
                this.LJIIL = (InteractAudienceGuestWidget) this.LJIJI.LIZ(1);
            }
        }
    }

    private void LJIIIZ(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 46).isSupported && !this.LJFF) {
            if (this.LJIIZILJ == LiveMode.AUDIO) {
                if (C79169HIt.LIZIZ(i, 8)) {
                    C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION_AUDIENCE.extended());
                    if (LJIIZILJ()) {
                        C413202Xa.LIZ().LIZIZ(ToolbarButton.RADIO_INTERACTION_AUDIENCE.extended(), this.LJJII);
                    }
                } else if (i == 0) {
                    if (LJIIZILJ()) {
                        LJJIJIIJI();
                        C413202Xa.LIZ().LIZ(ToolbarButton.RADIO_INTERACTION_AUDIENCE.extended(), this.LJJII);
                    }
                    C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION_AUDIENCE.extended());
                }
            } else if (this.LJIIZILJ == LiveMode.VIDEO && LJJIIJ()) {
                LIZJ("configToolbarViews");
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4775l
    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 27).isSupported) {
            return;
        }
        this.LIZLLL.LIZ(false, str);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4775l
    public final Widget LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 9);
        if (proxy.isSupported) {
            return (Widget) proxy.result;
        }
        return this.LJIJI.LIZ(i);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4775l
    public final void LIZLLL(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 40).isSupported) {
            return;
        }
        if (this.LJI != 2 || (i != 4 && i != 64)) {
            mo15715LJ(this.LJI);
        }
        if (this.LJFF) {
            C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION.extended());
            this.LJIIIIZZ.LIZ(2130856072, 2130856072, 1.0f);
        } else if (!C79169HIt.LIZIZ(this.LJI, 2)) {
            C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION.extended());
            LJIIIZ(0);
        } else {
            C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION.extended());
            this.LJIIIIZZ.LIZ(C448383oO.LJIILL.LIZ(), C448383oO.LJIILL.LIZ(), 1.0f);
        }
        if (i == 4) {
            if (this.LJFF) {
                InteractAudienceAnchorWidget interactAudienceAnchorWidget = this.LJIIJJI;
                if (interactAudienceAnchorWidget != null) {
                    if (interactAudienceAnchorWidget.LJIIIIZZ() && !((IInteractService) ServiceManager.getService(IInteractService.class)).getInteractAudienceService().LIZIZ() && !LinkCrossRoomDataHolder.LJII().LJLJLJ) {
                        this.LJIIJJI.LJIIL();
                    }
                    this.LJIJI.LIZ(this.LJIIJJI);
                    this.LJIIJJI = null;
                }
                this.LJIIIIZZ.LIZ(2130856472, 2130856473, 1.0f);
            } else {
                InteractAudienceGuestWidget interactAudienceGuestWidget = this.LJIIL;
                if (interactAudienceGuestWidget != null) {
                    this.LJIJI.LIZ(interactAudienceGuestWidget);
                    this.LJIIL = null;
                    C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION.extended());
                } else {
                    C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION.extended());
                }
            }
        } else if (i == 64) {
            InteractAudienceAnchorWidget interactAudienceAnchorWidget2 = this.LJIIJJI;
            if (interactAudienceAnchorWidget2 != null && interactAudienceAnchorWidget2.LJIIIIZZ()) {
                this.LJIIJJI.LJIIL();
            }
            if (this.LJFF) {
                this.LJIIIIZZ.LIZ(2130856072, 2130856072, 0.34f);
                if (LJIILLIIL()) {
                    this.LJIIIZ.LIZ(0.34f);
                }
            } else {
                this.LJIIIIZZ.LIZ(2130856069, 2130856069, 0.34f);
            }
        }
        LJIJJLI();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4775l
    public final void LIZJ(int i) {
        int i2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 39).isSupported || !isViewValid()) {
            return;
        }
        ALogger.m15800e("ttlive_link", "switchMode " + i + " " + C79169HIt.LIZIZ(this.LJI, i));
        if (C79169HIt.LIZIZ(this.LJI, i)) {
            ALogger.m15797i("ktv", "duplicate switchMode " + this.LJI + " target=" + i);
            return;
        }
        LJIIIIZZ(i);
        if (this.LJFF) {
            C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION.extended());
            this.LJIIIIZZ.LIZ(2130856072, 2130856072, 1.0f);
        } else if (!C79169HIt.LIZIZ(this.LJI, 2)) {
            C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION.extended());
            LJIIIZ(0);
        } else {
            C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION.extended());
            this.LJIIIIZZ.LIZ(C448383oO.LJIILL.LIZ(), C448383oO.LJIILL.LIZ(), 1.0f);
        }
        this.LJI = C79169HIt.LIZ(this.LJI, i);
        if (this.dataCenter != null) {
            this.dataCenter.put("data_link_state", Integer.valueOf(HIE.LIZIZ.LJJIFFI()));
        }
        C79107HGj.LIZ("switch", "target: " + i + " ,current:" + this.LJI);
        if (AbstractC4779q.LIZ.LIZ() != null) {
            AbstractC4779q.LIZ.LIZ().LIZIZ(i);
        }
        if (i == 2) {
            if (AbstractC4779q.LIZ.LIZ() != null) {
                i2 = AbstractC4779q.LIZ.LIZ().LJIIJ();
            } else {
                i2 = 0;
            }
            if (this.LJFF) {
                if (!C79169HIt.LIZIZ(i2, 4) || !C79179HJd.LIZIZ.LIZ()) {
                    this.LJIIJJI = (InteractAudienceAnchorWidget) this.LJIJI.LIZ(0);
                }
            } else {
                if (!C79169HIt.LIZIZ(i2, 4) || !C79179HJd.LIZIZ.LIZ()) {
                    this.LJIIL = (InteractAudienceGuestWidget) this.LJIJI.LIZ(1);
                }
                if (LJIILL()) {
                    this.LJIIIIZZ.LIZ(2130856400, 2130856400, 1.0f);
                } else {
                    this.LJIIIIZZ.LIZ(C448383oO.LJIILL.LIZ(), C448383oO.LJIILL.LIZ(), 1.0f);
                }
            }
            C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION.extended());
        } else if (i == 8) {
            if (this.LJFF) {
                this.LJIILIIL = (VoiceChatRoomAnchorWidget) this.LJIJI.LIZ(3);
                if (LJJIII()) {
                    C413202Xa.LIZ().LIZ(ToolbarButton.TEAM_FIGHT.extended(), this.LJJIIJ);
                    C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION_SCENE.extended(), this.LJIIIZ);
                    this.LJIILIIL.LIZ(this.LJJIIJ);
                }
            } else {
                this.LJJII.LIZJ();
                this.LJIILJJIL = (VoiceChatRoomGuestWidget) this.LJIJI.LIZ(3);
                C448583oi c448583oi = this.LJJIFFI;
                VoiceChatRoomGuestWidget voiceChatRoomGuestWidget = this.LJIILJJIL;
                c448583oi.LJI = voiceChatRoomGuestWidget;
                voiceChatRoomGuestWidget.LJIIL = c448583oi;
                if (this.LIZLLL.LJFF) {
                    if (LJJJI() != null && LJJJI().LJJLIIIJLLLLLLLZ().LIZ().booleanValue()) {
                        C88440Kt0.LIZ(2131585506);
                    } else {
                        C88440Kt0.LIZ(2131585505);
                    }
                    this.LIZLLL.LJIIIIZZ();
                }
            }
            ALogger.m15797i("ttlive_link", "load voice chat widget");
            LJIIIZ(this.LJI);
            C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION.extended());
            if (LJIILLIIL()) {
                C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION_SCENE.extended(), this.LJIIIZ);
                if (LJIJ()) {
                    C413202Xa.LIZ().LIZIZ(ToolbarButton.RADIO_INTERACTION_SCENE.extended(), this.LJJIII);
                }
            }
        } else if (i == 32) {
            if (LJJJI() != null && LJJJI().LJJIJL() && !LJJJI().LJJJ()) {
                this.LJIIIIZZ.LIZ(new C424272qb(8));
                return;
            }
            LIZIZ("big_party", this.LJFF);
            if (this.LJFF) {
                this.LJIILL = (VideoTalkRoomAnchorWidget) this.LJIJI.LIZ(5);
                this.LJIIIIZZ.LIZ(2130858094, 2130858094, 1.0f);
                if (LJJII()) {
                    C413202Xa.LIZ().LIZ(ToolbarButton.TEAM_FIGHT.extended(), this.LJJIIJ);
                    C413202Xa.LIZ().LIZ(ToolbarButton.TEAM_FIGHT.extended());
                    C413202Xa.LIZ().LIZIZ(ToolbarButton.f27007PK.extended());
                    this.LJIILL.LIZ(this.LJJIIJ);
                }
            } else {
                this.LJIIIIZZ.LIZ(C448383oO.LJIILL.LIZ(), C448383oO.LJIILL.LIZ(), 1.0f);
                this.LJIILLIIL = (VideoTalkRoomGuestWidget) this.LJIJI.LIZ(5);
                this.LJIILLIIL.LIZ(this.LJIIIIZZ);
                VideoTalkLinkIntegrationWidget videoTalkLinkIntegrationWidget = this.LIZJ;
                if (videoTalkLinkIntegrationWidget != null) {
                    videoTalkLinkIntegrationWidget.LIZIZ();
                }
            }
            C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION.extended());
        } else if (this.LJFF) {
            C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION.extended());
            this.LJIIIIZZ.LIZ(2130856072, 2130856072, 1.0f);
        } else {
            C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION.extended());
            LJIIIZ(0);
        }
        LJIJJLI();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4775l
    /* renamed from: LJ */
    public final void mo15715LJ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 44).isSupported || !C79169HIt.LIZIZ(this.LJI, i)) {
            return;
        }
        ArrayList arrayList = new ArrayList((Collection) this.dataCenter.get("data_online_changed_list", (String) new ArrayList()));
        arrayList.clear();
        this.dataCenter.put("data_online_changed_list", arrayList);
        this.LJI = C79169HIt.LIZJ(this.LJI, i);
        if (this.dataCenter != null) {
            this.dataCenter.put("data_link_state", Integer.valueOf(HIE.LIZIZ.LJJIFFI()));
        }
        if (i == 2) {
            this.LJIJI.LIZ(this.LJIIJJI);
            this.LJIIJJI = null;
            this.LJIJI.LIZ(this.LJIIL);
            this.LJIIL = null;
            if (!this.LJFF) {
                C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION.extended());
            }
            LJJI();
        } else if (i == 32) {
            this.LJIJI.LIZ(this.LJIILL);
            this.LJIJI.LIZ(this.LJIILLIIL);
            this.LJIILL = null;
            this.LJIILLIIL = null;
            if (!this.LJFF) {
                C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION.extended());
            }
            if (LJJII()) {
                C413202Xa.LIZ().LIZ(ToolbarButton.f27007PK.extended());
                C413202Xa.LIZ().LIZIZ(ToolbarButton.TEAM_FIGHT.extended(), this.LJJIIJ);
            }
            LJJI();
            if (this.LJFF && LiveSettingKeys.LIVE_INTIMATE_CHAT_USE_NEW_PANEL.getValue().booleanValue() && this.dataCenter != null && ((Boolean) this.dataCenter.get("data_need_restore_video_interact", (String) Boolean.FALSE)).booleanValue()) {
                this.dataCenter.put("data_need_restore_video_interact", Boolean.FALSE);
                HH8.LIZJ();
                LIZIZ("auto");
            }
        } else if (i == 8) {
            ALogger.m15797i("ttlive_link", "unload mVoiceChatRoomGuestWidget");
            this.LJIJI.LIZ(this.LJIILIIL);
            this.LJIJI.LIZ(this.LJIILJJIL);
            this.LJIILIIL = null;
            this.LJIILJJIL = null;
            if (!this.LJFF) {
                C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION.extended());
                LJIIIZ(0);
            } else if (LJIILLIIL()) {
                if (LJIJ()) {
                    LJJIJIIJIL();
                    C413202Xa.LIZ().LIZ(ToolbarButton.RADIO_INTERACTION_SCENE.extended(), this.LJJIII);
                    C413202Xa.LIZ().LIZIZ(ToolbarButton.INTERACTION_SCENE.extended(), this.LJIIIZ);
                }
                C413202Xa.LIZ().LIZ(ToolbarButton.f27007PK.extended());
                if (LJJIII()) {
                    C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION_SCENE.extended(), this.LJIIIZ);
                    C413202Xa.LIZ().LIZIZ(ToolbarButton.TEAM_FIGHT.extended(), this.LJJIIJ);
                }
            } else {
                C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION.extended());
            }
            LJJI();
        }
        if (this.LJIIIIZZ != null) {
            float f = 1.0f;
            if (C79169HIt.LIZIZ(this.LJI, 2)) {
                if (this.LJFF || ((Integer) C79046HEa.LIZ().LJJIIZI).intValue() == 0) {
                    this.LJIIIIZZ.LIZ(C448383oO.LJIILL.LIZ(), C448383oO.LJIILL.LIZ(), 1.0f);
                }
            } else if (C79169HIt.LIZIZ(this.LJI, 32)) {
                if (this.LJFF) {
                    this.LJIIIIZZ.LIZ(2130858094, 2130858094, 1.0f);
                } else {
                    this.LJIIIIZZ.LIZ(C448383oO.LJIILL.LIZ(), C448383oO.LJIILL.LIZ(), 1.0f);
                }
            } else if (this.LJFF) {
                if (this.LJIIZILJ == LiveMode.VIDEO) {
                    LJJIJIL();
                }
                if (LJJIIJZLJL()) {
                    f = 0.34f;
                }
                this.LJIIIIZZ.LIZ(2130856072, 2130856072, f);
            } else {
                this.LJIIIIZZ.LIZ(C448383oO.LJIILL.LIZ(), C448383oO.LJIILL.LIZ(), 1.0f);
            }
        }
        if (i != 2 && this.LJFF && ((IMicRoomService) ServiceManager.getService(IMicRoomService.class)).isMicRoom(this.f26264LJ)) {
            C79007HCn.LJII().f6672LJ = true;
            this.LIZLLL.LIZ(true, "");
        }
        if (this.LJI == 0 && !this.LJFF && this.LJIIZILJ == LiveMode.VIDEO) {
            VideoTalkLinkIntegrationWidget videoTalkLinkIntegrationWidget = this.LIZJ;
            if (videoTalkLinkIntegrationWidget != null) {
                videoTalkLinkIntegrationWidget.LIZ();
            }
            if (LJJIIJ()) {
                LIZJ("unload widget");
            }
        }
        if (AbstractC4779q.LIZ.LIZ() != null) {
            AbstractC4779q.LIZ.LIZ().LIZLLL(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a4  */
    @Override // androidx.lifecycle.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void onChanged(com.bytedance.ies.sdk.widgets.KVData r16) {
        /*
            Method dump skipped, instructions count: 868
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkMultiControlWidget.onChanged(java.lang.Object):void");
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.do$b
    public final void LIZIZ(boolean z) {
        VideoTalkLinkIntegrationWidget videoTalkLinkIntegrationWidget;
        int i;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 57).isSupported) {
            return;
        }
        if (LJJ()) {
            C88440Kt0.LIZ(2131584305);
        } else if (this.f26264LJ.isPaidLive()) {
            C88440Kt0.LIZ(LK5.LIZ(2131586754));
        } else if (AbstractC4779q.LIZ.LIZ() != null && !AbstractC4779q.LIZ.LIZ().LJIIJJI()) {
        } else {
            int i2 = Build.VERSION.SDK_INT;
            if (!C138182ctN.LIZIZ && this.LJIIZILJ == LiveMode.VIDEO && !LiveConfigSettingKeys.ENABLE_LIVE_INTERACT.getValue().booleanValue()) {
                C88440Kt0.LIZ(this.context.getString(2131585543));
                return;
            }
            Room room = this.f26264LJ;
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
            } else if (LJIILL() && (i = this.LJI) != 0 && i != 2) {
                C88440Kt0.LIZ(2131584269);
            } else if (this.LJFF && ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).isPlayingGame()) {
                C88440Kt0.LIZ(2131584176);
            } else if (this.LJIIZILJ == LiveMode.AUDIO) {
                AbstractC4779q LIZ = AbstractC4779q.LIZ.LIZ();
                if (this.LJI == 0) {
                    if (((IInteractService) ServiceManager.getService(IInteractService.class)).getPkService().LJII()) {
                        if (z) {
                            C88440Kt0.LIZ(2131584449);
                            return;
                        } else {
                            C88440Kt0.LIZ(2131585464);
                            return;
                        }
                    }
                    LJIJJ();
                } else if (LIZ != null && C79169HIt.LIZIZ(LIZ.LJIIJ(), 4)) {
                    C88440Kt0.LIZ(2131585463);
                } else {
                    VoiceChatRoomAnchorWidget voiceChatRoomAnchorWidget = this.LJIILIIL;
                    if (voiceChatRoomAnchorWidget != null) {
                        voiceChatRoomAnchorWidget.LJJIII();
                    }
                }
            } else {
                if (AbstractC4779q.LIZ.LIZ() != null) {
                    AbstractC4779q.LIZ.LIZ().LJIIL();
                }
                if (AbstractC78050Gpo.LIZ().LJJIFFI() == 0) {
                    if (C79615HZx.LIZ().LIZJ()) {
                        C88440Kt0.LIZ(2131585464);
                    } else if (this.LJFF) {
                        if (C78883H7t.LIZIZ.LIZ(this.f26264LJ)) {
                            if (LJJIIZ() && C79242HLo.LJIILJJIL()) {
                                this.LJII = C79220HKs.LIZ(this.dataCenter, this).LIZIZ();
                                this.LJII.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
                            } else if (C78883H7t.LIZIZ.LIZ(this.f26264LJ, true)) {
                                this.dataCenter.put("data_room_video_talk_log_open_success_for_enter_from", "link_icon");
                                this.LIZLLL.LIZIZ(true);
                            } else {
                                C419012i7.LIZ().LIZ(getContext(), 4).mo15264LJ(2131588232).LIZLLL(2131588231).LIZIZ(0, 2131588230, new DialogInterface.OnClickListener(this) { // from class: X.H9q
                                    public static ChangeQuickRedirect LIZ;
                                    public final LinkMultiControlWidget LIZIZ;

                                    static {
                                        Covode.recordClassIndex(25359);
                                    }

                                    {
                                        this.LIZIZ = this;
                                    }

                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i3) {
                                        if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i3)}, this, LIZ, false, 1).isSupported) {
                                            return;
                                        }
                                        LinkMultiControlWidget linkMultiControlWidget = this.LIZIZ;
                                        if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i3)}, linkMultiControlWidget, LinkMultiControlWidget.LIZIZ, false, 97).isSupported) {
                                            return;
                                        }
                                        linkMultiControlWidget.dataCenter.put("data_room_video_talk_log_open_success_for_enter_from", "chat_room_alert");
                                        linkMultiControlWidget.LIZLLL.LIZIZ(true);
                                        dialogInterface.dismiss();
                                    }
                                }).LIZIZ(1, 2131588229, DialogInterface$OnClickListenerC79155HIf.LIZIZ).LIZJ();
                            }
                        } else {
                            this.LJII = C79220HKs.LIZ(this.dataCenter, this).LIZJ();
                            this.LJII.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
                        }
                        LJJIJL();
                    } else if (C78883H7t.LIZIZ.LIZ(this.f26264LJ) && (videoTalkLinkIntegrationWidget = this.LIZJ) != null) {
                        videoTalkLinkIntegrationWidget.LIZJ();
                    }
                } else if (C79169HIt.LIZIZ(AbstractC4779q.LIZ.LIZ().LJIIJ(), 64)) {
                    C88440Kt0.LIZ(2131585514);
                } else if (C79169HIt.LIZIZ(this.LJI, 16)) {
                    C88440Kt0.LIZ(2131585465);
                } else {
                    String str = "1";
                    if (C79169HIt.LIZIZ(AbstractC4779q.LIZ.LIZ().LJIIJ(), 4)) {
                        if (!this.LJFF && ((IUserService) ServiceManager.getService(IUserService.class)).user().LJI()) {
                            if (LiveSettingKeys.LIVE_INTIMATE_CHAT_USE_NEW_PANEL.getValue().booleanValue()) {
                                this.LJII = C79220HKs.LIZ(this.dataCenter, this).LIZIZ();
                            } else {
                                this.LJII = C79220HKs.LIZ(this.dataCenter, this).LIZ();
                            }
                            this.LJII.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
                        } else if (!this.LJFF && C79169HIt.LIZIZ(this.LJI, 2)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("action_type", "click");
                            if (!LJIILL()) {
                                str = "0";
                            }
                            hashMap.put("is_carousel_room_host", str);
                            hashMap.put("request_page", C79007HCn.LJII().LJIILL);
                            C4574547f.LIZ().LIZ("livesdk_guest_connection", hashMap, Room.class, C8668v.class);
                            InteractAudienceGuestWidget interactAudienceGuestWidget = this.LJIIL;
                            if (interactAudienceGuestWidget != null) {
                                interactAudienceGuestWidget.LIZ(false);
                            }
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
                                } else if (C78883H7t.LIZIZ.LIZ(this.f26264LJ)) {
                                    if (LJJIIZ() && C79242HLo.LJIILJJIL() && LiveSettingKeys.LIVE_INTIMATE_CHAT_USE_NEW_PANEL.getValue().booleanValue()) {
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
                            if (c79220HKs != null) {
                                c79220HKs.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
                            }
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
                            if (!LJIILL()) {
                                str = "0";
                            }
                            hashMap2.put("is_carousel_room_host", str);
                            C4574547f.LIZ().LIZ("livesdk_guest_connection", hashMap2, Room.class, C8668v.class);
                            InteractAudienceGuestWidget interactAudienceGuestWidget2 = this.LJIIL;
                            if (interactAudienceGuestWidget2 != null) {
                                interactAudienceGuestWidget2.LIZ(true);
                            }
                        }
                    } else if (C79169HIt.LIZIZ(this.LJI, 32)) {
                        if (this.LJFF) {
                            if (C78531GxZ.LIZ()) {
                                C78531GxZ.LIZIZ();
                            } else if (AbstractC4766ag.LIZ.LIZ() != null) {
                                AbstractC4766ag.LIZ.LIZ().LIZ(0, "bottom", -1, "");
                            }
                        } else if (((IUserService) ServiceManager.getService(IUserService.class)).user().LJI()) {
                            if (C78531GxZ.LIZ()) {
                                C78531GxZ.LIZIZ();
                            } else if (AbstractC4765af.LIZ.LIZ() != null) {
                                AbstractC4765af.LIZ.LIZ().LIZ(0, "bottom", -1, "");
                            }
                        } else {
                            this.LJIILLIIL.LJJJ();
                        }
                    }
                }
            }
        }
    }

    public static void LIZIZ(String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, null, LIZIZ, true, 60).isSupported) {
            return;
        }
        LIZ(str, z, false);
    }

    public LinkMultiControlWidget(AbstractC79168HIs abstractC79168HIs, Boolean bool) {
        this.LJIJI = abstractC79168HIs;
        this.LJIJJLI = bool.booleanValue();
    }

    private void LIZ(final C9532b c9532b, int i) {
        if (PatchProxy.proxy(new Object[]{c9532b, 2131584138}, this, LIZIZ, false, 36).isSupported) {
            return;
        }
        ((KDS) ((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).getLatestBanRecord(13L).m149as(autoDisposeWithTransformer())).LIZ(new Consumer(this, c9532b, 2131584138) { // from class: X.HIO
            public static ChangeQuickRedirect LIZ;
            public final LinkMultiControlWidget LIZIZ;
            public final C9532b LIZJ;
            public final int LIZLLL;

            static {
                Covode.recordClassIndex(25354);
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
                LinkMultiControlWidget linkMultiControlWidget = this.LIZIZ;
                C9532b c9532b2 = this.LIZJ;
                int i2 = this.LIZLLL;
                C5176i<C4275a> c5176i = (C5176i) obj;
                if (PatchProxy.proxy(new Object[]{c9532b2, Integer.valueOf(i2), c5176i}, linkMultiControlWidget, LinkMultiControlWidget.LIZIZ, false, 99).isSupported) {
                    return;
                }
                C81922IQq.LIZIZ.LIZ(linkMultiControlWidget.context, c9532b2, i2, c5176i);
            }
        }, C79175HIz.LIZIZ);
    }

    public void LIZ(final int i, final C5923dp c5923dp) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c5923dp}, this, LIZIZ, false, 78).isSupported) {
            return;
        }
        v$a v_a = new v$a(this.context);
        v_a.LIZ(4);
        C116971W2r.LIZJ(v_a.mo15264LJ(2131587856).LIZLLL(2131587855).LIZIZ(0, 2131582657, new DialogInterface.OnClickListener(this, i) { // from class: X.H9p
            public static ChangeQuickRedirect LIZ;
            public final LinkMultiControlWidget LIZIZ;
            public final int LIZJ;

            static {
                Covode.recordClassIndex(25344);
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
                LinkMultiControlWidget linkMultiControlWidget = this.LIZIZ;
                int i3 = this.LIZJ;
                if (PatchProxy.proxy(new Object[]{Integer.valueOf(i3), dialogInterface, Integer.valueOf(i2)}, linkMultiControlWidget, LinkMultiControlWidget.LIZIZ, false, 94).isSupported) {
                    return;
                }
                if (i3 == 0 || i3 == 4) {
                    linkMultiControlWidget.LIZLLL.LIZIZ(C78883H7t.LIZIZ.LIZJ(linkMultiControlWidget.f26264LJ));
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
        }).LIZIZ(1, 2131582403, new DialogInterface.OnClickListener(c5923dp) { // from class: X.H9h
            public static ChangeQuickRedirect LIZ;
            public final C5923dp LIZIZ;

            static {
                Covode.recordClassIndex(25345);
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
                if (PatchProxy.proxy(new Object[]{c5923dp2, dialogInterface, Integer.valueOf(i2)}, null, LinkMultiControlWidget.LIZIZ, true, 93).isSupported) {
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

    public void LIZ(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        if (PatchProxy.proxy(new Object[]{onClickListener, onClickListener2}, this, LIZIZ, false, 86).isSupported) {
            return;
        }
        v$a v_a = new v$a(this.context);
        v_a.LIZ(4);
        AbstractC77996Gow LIZIZ2 = v_a.LIZLLL(2131584187).LIZ(2.0f).LIZIZ(0, 2131584188, onClickListener).LIZIZ(1, 2131584186, onClickListener2);
        LIZIZ2.mo15263LJ(false);
        LIZIZ2.LIZJ();
    }

    public static void LIZ(String str, boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 0}, null, LIZIZ, true, 61).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("mode", str);
        String str2 = "0";
        hashMap.put("stream_mix_on_client", str2);
        if (z || ((Integer) C79046HEa.LIZ().LJJIIZI).intValue() == 2) {
            str2 = "1";
        }
        hashMap.put("is_in", str2);
        ((IPerformanceManager) ServiceManager.getService(IPerformanceManager.class)).onModuleStart("link_mic", hashMap);
    }
}
