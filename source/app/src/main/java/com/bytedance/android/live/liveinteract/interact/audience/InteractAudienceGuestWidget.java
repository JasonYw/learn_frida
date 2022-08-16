package com.bytedance.android.live.liveinteract.interact.audience;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.p255g.AbstractC2884d;
import com.bytedance.android.live.broadcastgame.api.C3348d;
import com.bytedance.android.live.browser.webview.fragment.AbstractC4054j;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.chatroom.model.LinkApplyType;
import com.bytedance.android.live.liveinteract.api.chatroom.p339b.C4266a;
import com.bytedance.android.live.liveinteract.api.chatroom.p339b.C4267b;
import com.bytedance.android.live.liveinteract.api.data.C4284f;
import com.bytedance.android.live.liveinteract.bid.AbstractC4289e;
import com.bytedance.android.live.liveinteract.bid.BidLinkMicWidget;
import com.bytedance.android.live.liveinteract.bid.C4287a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkControlWidget;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p354vm.C4378a;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.C4369e;
import com.bytedance.android.live.liveinteract.digitavatar.videoavatar.VideoShowMode;
import com.bytedance.android.live.liveinteract.interact.audience.context.C4425a;
import com.bytedance.android.live.liveinteract.interact.audience.context.C4427c;
import com.bytedance.android.live.liveinteract.interact.audience.p359b.C4418a;
import com.bytedance.android.live.liveinteract.interact.audience.paid.InteractPaidLinkWidget;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.p356e.AbstractC4409d;
import com.bytedance.android.live.liveinteract.plantform.api.LinkAudienceApi;
import com.bytedance.android.live.liveinteract.plantform.api.LinkPaidLinkApi;
import com.bytedance.android.live.liveinteract.plantform.camera.AbstractC4791d;
import com.bytedance.android.live.liveinteract.plantform.camera.AbstractC4792e;
import com.bytedance.android.live.liveinteract.plantform.core.C4806x;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4770d;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4771e;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i;
import com.bytedance.android.live.liveinteract.plantform.permission.model.C4825a;
import com.bytedance.android.live.liveinteract.plantform.permission.model.OperateType;
import com.bytedance.android.live.liveinteract.plantform.widgt.BaseAdminLinkWidget;
import com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget;
import com.bytedance.android.live.liveinteract.view.C4985a;
import com.bytedance.android.live.liveinteract.voicechat.dialog.C5011d;
import com.bytedance.android.live.liveinteract.voicechat.dialog.C5012e;
import com.bytedance.android.live.liveinteract.voicechat.p392b.C5001e;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.event.C5984am;
import com.bytedance.android.livesdk.chatroom.event.C5986ap;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q;
import com.bytedance.android.livesdk.chatroom.model.C6094ae;
import com.bytedance.android.livesdk.chatroom.model.C6095af;
import com.bytedance.android.livesdk.chatroom.model.C6119b;
import com.bytedance.android.livesdk.chatroom.model.interact.C6160b;
import com.bytedance.android.livesdk.chatroom.model.interact.C6179t;
import com.bytedance.android.livesdk.chatroom.p517u.C6305j;
import com.bytedance.android.livesdk.config.C6858bo;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.log.p723a.AbstractC8644i;
import com.bytedance.android.livesdk.message.model.C8854es;
import com.bytedance.android.livesdk.message.model.C8870fj;
import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.android.livesdk.message.model.C9030z;
import com.bytedance.android.livesdk.message.model.LinkMicGuideMessage;
import com.bytedance.android.livesdk.message.model.ReplyType;
import com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler;
import com.bytedance.android.livesdk.user.C9284h;
import com.bytedance.android.livesdk.widget.AbstractDialogC9363b;
import com.bytedance.android.livesdk.widget.v$a;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.circleinfo.CircleInfo;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9518ac;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9523ai;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9544q;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.live.datacontext.C13491f;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.p1594ss.avframework.livestreamv2.core.ILayerControl;
import com.p1594ss.avframework.livestreamv2.core.LiveCore;
import com.p1594ss.avframework.livestreamv2.core.interact.model.Config;
import com.p1594ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC413392Xt;
import p003X.AbstractC426192th;
import p003X.AbstractC78050Gpo;
import p003X.AbstractC78986HBs;
import p003X.AbstractC80293Hkt;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2WC;
import p003X.C3VF;
import p003X.C409882Kg;
import p003X.C414642b4;
import p003X.C439993ar;
import p003X.C4574547f;
import p003X.C77679Gjp;
import p003X.C77680Gjq;
import p003X.C77917Gnf;
import p003X.C78317Gu7;
import p003X.C78403GvV;
import p003X.C78505Gx9;
import p003X.C78531GxZ;
import p003X.C78536Gxe;
import p003X.C78537Gxf;
import p003X.C78538Gxg;
import p003X.C78541Gxj;
import p003X.C78828H5q;
import p003X.C78832H5u;
import p003X.C78834H5w;
import p003X.C78952HAk;
import p003X.C78987HBt;
import p003X.C78988HBu;
import p003X.C78999HCf;
import p003X.C79007HCn;
import p003X.C79046HEa;
import p003X.C79107HGj;
import p003X.C79112HGo;
import p003X.C79169HIt;
import p003X.C79242HLo;
import p003X.C80517HoV;
import p003X.C81173Hz5;
import p003X.C81280I1y;
import p003X.C87010KQi;
import p003X.C87308Kak;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.C88469KtT;
import p003X.DialogC77881Gn5;
import p003X.DialogC78238Gsq;
import p003X.DialogC78477Gwh;
import p003X.DialogC78493Gwx;
import p003X.DialogInterface$OnClickListenerC78989HBv;
import p003X.DialogInterface$OnClickListenerC78990HBw;
import p003X.DialogInterface$OnClickListenerC78991HBx;
import p003X.DialogInterface$OnClickListenerC78992HBy;
import p003X.DialogInterface$OnClickListenerC78993HBz;
import p003X.GY2;
import p003X.GY3;
import p003X.GYV;
import p003X.H04;
import p003X.H65;
import p003X.H7C;
import p003X.HAY;
import p003X.HBQ;
import p003X.HC0;
import p003X.HC2;
import p003X.HC3;
import p003X.HC4;
import p003X.HC7;
import p003X.HC8;
import p003X.HC9;
import p003X.HCA;
import p003X.HCB;
import p003X.HCC;
import p003X.HCE;
import p003X.HD9;
import p003X.HDG;
import p003X.HE3;
import p003X.HEV;
import p003X.HHA;
import p003X.HZR;
import p003X.IQV;
import p003X.IQX;
import p003X.LK5;
import p003X.QB4;
import p003X.QFD;
import p003X.View$OnClickListenerC78405GvX;

/* loaded from: classes3.dex */
public final class InteractAudienceGuestWidget extends BaseAdminLinkWidget<LinkPlayerInfo> implements AbstractC4771e, AbstractC4792e, OnMessageListener, OnMessageListener {
    public static ChangeQuickRedirect LIZIZ;
    public HEV LIZJ;
    public AbstractC2884d LIZLLL;

    /* renamed from: LJ */
    public Runnable f26317LJ;
    public IMessageManager LJFF;
    public C4378a LJIIIZ;
    public boolean LJJI;
    public C4806x LJJIFFI;
    public boolean LJJII;
    public Room LJJIII;
    public InteractPaidLinkWidget LJJIIJ;
    public BidLinkMicWidget LJJIIJZLJL;
    public C78952HAk LJJIIZ;
    public long LJJIJIIJIL;
    public Disposable LJJIJLIJ;
    public int LJJIL;
    public boolean LJJIZ;
    public long LJJJ;
    public DialogC77881Gn5 LJJJI;
    public AbstractC4054j LJJJIL;
    public HAY LJJJJIZL;
    public HD9 LJJJJLL;
    public AbstractDialogC9363b LJJJLZIJ;
    public final CompositeDisposable LJJIIZI = new CompositeDisposable();
    public C4369e LJJIJ = new C4369e(null, null, 0, 7);
    public String LJI = "";
    public String LJII = "";
    public final int LJIIIIZZ = 300;
    public final Lazy LJJIJIIJI = LazyKt__LazyJVMKt.lazy(new InteractAudienceGuestWidget$mLinkBidCardView$2(this));
    public final long LJJIJIL = 180000;
    public final int LJJIJL = 86400000;
    public final C4418a LJJJJJ = new C4418a();
    public final Lazy LJJJJJL = LazyKt__LazyJVMKt.lazy(new InteractAudienceGuestWidget$mGuestApplyDialog$2(this));
    public final Lazy LJJJJL = LazyKt__LazyJVMKt.lazy(new InteractAudienceGuestWidget$bidViewModel$2(this));
    public final HE3 LJJJJLI = new HE3();
    public final Lazy LJJJJZ = LazyKt__LazyJVMKt.lazy(new C4413xdd3b82de(this));
    public final C5001e.AbstractC5002a LJIIJ = new HC0(this);
    public final C78317Gu7 LJJJJZI = new C78317Gu7(this);
    public final HDG LJJJLIIL = new HDG(this);
    public final Observer<Boolean> LJJJLL = new C78988HBu(this);

    static {
        Covode.recordClassIndex(26989);
    }

    private final C5011d LJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 2);
        return (C5011d) (proxy.isSupported ? proxy.result : this.LJJJJJL.mo27335getValue());
    }

    private final C5001e LJJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 4);
        return (C5001e) (proxy.isSupported ? proxy.result : this.LJJJJZ.mo27335getValue());
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.camera.AbstractC4792e
    public final void LIZ(VideoShowMode videoShowMode, VideoShowMode videoShowMode2, AbstractC4791d abstractC4791d) {
        if (PatchProxy.proxy(new Object[]{videoShowMode, videoShowMode2, abstractC4791d}, this, LIZIZ, false, 76).isSupported) {
            return;
        }
        C106862S5w.LIZ(videoShowMode, videoShowMode2);
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget
    public final int LIZIZ() {
        return 4;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget
    public final int LIZJ() {
        return 1;
    }

    public final C4985a LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 1);
        return (C4985a) (proxy.isSupported ? proxy.result : this.LJJIJIIJI.mo27335getValue());
    }

    /* renamed from: LJ */
    public final C4378a m15738LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 3);
        return (C4378a) (proxy.isSupported ? proxy.result : this.LJJJJL.mo27335getValue());
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131700420;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAdminLinkWidget, com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 85).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    private int LJJI() {
        return this.LJJIL;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4773g
    public final C78999HCf LJFF() {
        return this.LJIILL;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4773g
    public final HEV LJII() {
        return this.LIZJ;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, p003X.AbstractC78977HBj
    public final void LIZ(C5176i<C6094ae> c5176i) {
        if (PatchProxy.proxy(new Object[]{c5176i}, this, LIZIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(c5176i);
        super.LIZ(c5176i);
        C77680Gjq c77680Gjq = C77679Gjp.LIZJ;
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        c77680Gjq.LIZ(context, c5176i.LIZJ.LIZIZ);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, p003X.AbstractC78977HBj
    public final void LIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZIZ, false, 13).isSupported) {
            return;
        }
        super.LIZ(th);
        C88469KtT.LIZ(this.context, th);
    }

    public final void LIZ(String str) {
        LiveCore liveCore;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 15).isSupported) {
            return;
        }
        LIZ().LJIIJ();
        if (LJJI() == 3) {
            HHA hha = this.LJIIZILJ;
            if (hha != null) {
                hha.LIZIZ();
            }
            this.LJJIL = 0;
        }
        AbstractC2884d abstractC2884d = this.LIZLLL;
        if (abstractC2884d == null || (liveCore = abstractC2884d.getLiveCore()) == null) {
            return;
        }
        liveCore.startVideoCapture();
    }

    public final void LIZ(String str, boolean z) {
        LiveCore liveCore;
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 17).isSupported) {
            return;
        }
        if (LJJI() == 0) {
            HHA hha = this.LJIIZILJ;
            if (hha != null) {
                hha.LIZJ();
            }
            this.LJJIL = 3;
        }
        if (!this.LJJIZ) {
            LIZ().LJIIIZ();
        }
        AbstractC2884d abstractC2884d = this.LIZLLL;
        if (abstractC2884d == null || (liveCore = abstractC2884d.getLiveCore()) == null) {
            return;
        }
        liveCore.stopVideoCapture();
    }

    @Override // p003X.HHU
    public final void LIZ(InteractConfig interactConfig) {
        Config videoQuality;
        if (PatchProxy.proxy(new Object[]{interactConfig}, this, LIZIZ, false, 21).isSupported) {
            return;
        }
        C79046HEa.LIZ().f6716LJ = SystemClock.currentThreadTimeMillis();
        int i = this.LJIIIIZZ;
        Config.VideoQuality videoQuality2 = new Config.VideoQuality(240, 240, 15, 360);
        if (interactConfig == null || (videoQuality = interactConfig.setVideoQuality(videoQuality2)) == null) {
            return;
        }
        videoQuality.setInteractMode(Config.InteractMode.NORMAL);
        videoQuality.setCharacter(Config.Character.GUEST);
        videoQuality.setVolumeCallbackInterval(i);
        videoQuality.setType(Config.Type.VIDEO);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LIZIZ, false, 24).isSupported) {
            return;
        }
        super.LIZ(j, exc);
        C88440Kt0.LIZ(2131585641);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, TextureView textureView, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, textureView, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 25).isSupported) {
            return;
        }
        super.LIZ(str, textureView, i, i2);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, ILayerControl.ILayer iLayer, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, iLayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 26).isSupported) {
            return;
        }
        super.LIZ(str, iLayer, i, i2);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, SurfaceView surfaceView, int i, int i2) {
        AbstractC2884d abstractC2884d;
        HEV hev;
        HHA hha;
        LiveCore liveCore;
        if (PatchProxy.proxy(new Object[]{str, surfaceView, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 27).isSupported) {
            return;
        }
        super.LIZ(str, surfaceView, i, i2);
        String str2 = C79007HCn.LJII().LIZLLL;
        if (TextUtils.isEmpty(str2)) {
            str2 = LinkCrossRoomDataHolder.LJII().LJIILLIIL;
        }
        long j = C79046HEa.LIZ().f6716LJ;
        C79007HCn LJII = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        if (TextUtils.equals(str, LJII.LIZJ) && j > 0) {
            C79046HEa.LIZ().f6716LJ = 0L;
        }
        HEV hev2 = this.LIZJ;
        if (hev2 != null) {
            hev2.LIZ(str, surfaceView, i, i2);
        }
        HEV hev3 = this.LIZJ;
        if ((hev3 == null || hev3.LIZ(0L, str2) == null) && (abstractC2884d = this.LIZLLL) != null && (hev = this.LIZJ) != null) {
            hev.LIZ(str2, (SurfaceView) abstractC2884d, 0, 0);
        }
        if (!this.LJJI || (hha = this.LJIIZILJ) == null || !hha.LJI) {
            return;
        }
        if (LJJI() == 0) {
            HHA hha2 = this.LJIIZILJ;
            if (hha2 != null) {
                hha2.LIZJ();
            }
            this.LJJIL = 3;
        }
        if (!this.LJJIZ) {
            LIZ().LJIIIZ();
        }
        AbstractC2884d abstractC2884d2 = this.LIZLLL;
        if (abstractC2884d2 != null && (liveCore = abstractC2884d2.getLiveCore()) != null) {
            liveCore.stopVideoCapture();
        }
        this.LJJIJLIJ = Observable.timer(this.LJJIJIL, TimeUnit.MILLISECONDS).subscribe(new HC2(this));
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String[] strArr, boolean[] zArr, int[] iArr) {
        if (PatchProxy.proxy(new Object[]{strArr, zArr, iArr}, this, LIZIZ, false, 29).isSupported) {
            return;
        }
        super.LIZ(strArr, zArr, iArr);
        this.LJJJJLI.LIZ(strArr, zArr, iArr);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, long j) {
        if (PatchProxy.proxy(new Object[]{str, new Long(j)}, this, LIZIZ, false, 31).isSupported) {
            return;
        }
        super.LIZ(str, j);
        HEV hev = this.LIZJ;
        if (hev == null) {
            return;
        }
        hev.LIZIZ(0L, str);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, p003X.AbstractC78977HBj
    public final void LIZ(C6095af c6095af) {
        if (PatchProxy.proxy(new Object[]{c6095af}, this, LIZIZ, false, 32).isSupported) {
            return;
        }
        super.LIZ(c6095af);
        StringBuilder sb = new StringBuilder();
        sb.append(c6095af != null ? Integer.valueOf(c6095af.f26867LJ) : "");
        this.LJI = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c6095af != null ? Integer.valueOf(c6095af.LIZLLL) : "");
        this.LJII = sb2.toString();
        if (this.dataCenter != null) {
            this.dataCenter.put("DATA_DISCONNECT_LINK", Boolean.TRUE);
        }
        if (Intrinsics.areEqual(this.LJIJJ, "limit_time_up")) {
            C88440Kt0.LIZ(2131585492);
        } else if (Intrinsics.areEqual(this.LJIJJ, "kick_out")) {
            if (C78538Gxg.LIZIZ.LJIILJJIL()) {
                C88440Kt0.LIZ(LK5.LIZ(2131585438));
            } else {
                C88440Kt0.LIZ(2131588237);
            }
        } else {
            C88440Kt0.LIZ(2131585491);
        }
        if (c6095af != null && c6095af.LIZ == 1) {
            LJI("leave");
        }
        C79007HCn LJII = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        LJII.LJIJI = "";
        this.LJJJJLI.LIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    public final void LIZ(String str, Throwable th) {
        if (PatchProxy.proxy(new Object[]{str, th}, this, LIZIZ, false, 35).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (Intrinsics.areEqual(str, "paid_change")) {
            return;
        }
        C88469KtT.LIZ(getContext(), th, 2131585594);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    public final void LIZ(C6119b c6119b, int i, int i2) {
        String valueOf;
        C3VF user;
        if (PatchProxy.proxy(new Object[]{c6119b, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 36).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6119b);
        super.LIZ(c6119b, i, i2);
        String str = "";
        if (!C78538Gxg.LIZIZ()) {
            C79007HCn LJII = C79007HCn.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII, str);
            LJII.LJIJI = str;
        }
        Long l = null;
        if (m15738LJ().LIZJ()) {
            if (C4378a.LJJIJIL.LIZJ()) {
                BidLinkMicWidget bidLinkMicWidget = this.LJJIIJZLJL;
                if (bidLinkMicWidget != null) {
                    bidLinkMicWidget.LJIILJJIL();
                }
            } else {
                C9030z value = m15738LJ().LJIJI.getValue();
                if (value != null) {
                    Long l2 = value.LIZJ;
                    IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
                    if (Intrinsics.areEqual(l2, (iUserService == null || (user = iUserService.user()) == null) ? null : Long.valueOf(user.LIZIZ()))) {
                        ((LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class)).applyCallbackReq(LJJIIJZLJL().getRoomId(), 1).compose(C100839PnV.LIZJ()).subscribe(GY2.LIZIZ, GY3.LIZIZ);
                    }
                }
            }
        }
        this.LJJJJJ.LIZIZ = c6119b.f26877LJ;
        Object obj = this.dataCenter.get("data_link_mic_is_quick_invite", (String) Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(obj, str);
        ((Boolean) obj).booleanValue();
        AbstractC78986HBs<T> LIZ = LIZ();
        String valueOf2 = String.valueOf((LIZ != 0 ? Integer.valueOf(C79242HLo.LIZ((AbstractC78986HBs<LinkPlayerInfo>) LIZ)) : null).intValue());
        String str2 = "0";
        if (valueOf2 == null) {
            valueOf2 = str2;
        }
        if (C78536Gxe.LIZ().LIZLLL && C78538Gxg.LIZIZ()) {
            this.LJJJJJ.LJIIIIZZ.put("recharge_mode", "normal");
        } else if (m15738LJ().LIZJ()) {
            this.LJJJJJ.LJIIIIZZ.put("recharge_mode", "auction");
        }
        if (m15738LJ().LIZJ()) {
            Map<String, String> map = this.LJJJJJ.LJIIIIZZ;
            Integer value2 = m15738LJ().LJII.getValue();
            if (value2 != null && (valueOf = String.valueOf(value2.intValue())) != null) {
                str = valueOf;
            }
            map.put("recharge_price", str);
        } else if (C78538Gxg.LIZIZ()) {
            Map<String, String> map2 = this.LJJJJJ.LJIIIIZZ;
            if (C78536Gxe.LIZ().LIZLLL) {
                str2 = String.valueOf(C4284f.LJIIIIZZ.LJII());
            }
            map2.put("recharge_price", str2);
        }
        BidLinkMicWidget bidLinkMicWidget2 = this.LJJIIJZLJL;
        if (bidLinkMicWidget2 != null && bidLinkMicWidget2.LIZJ() && C78531GxZ.m23800LJ()) {
            Map<String, String> map3 = this.LJJJJJ.LJIIIIZZ;
            AbstractC4289e LIZIZ2 = C4287a.LIZJ.LIZIZ();
            if (LIZIZ2 != null) {
                l = Long.valueOf(LIZIZ2.LJIIIIZZ());
            }
            map3.put("time", String.valueOf(l));
        }
        C78834H5w.LIZIZ.LIZ(c6119b, this.LJJJJJ, LJJIIJZLJL().circleInfo, valueOf2);
        if (!C78403GvV.LIZIZ.LIZ(LJJIIJZLJL()) || c6119b.f26877LJ) {
            return;
        }
        if (C77917Gnf.LIZ(LJJIIJZLJL())) {
            LJIILL();
        } else {
            LJIILJJIL();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    public final void LIZ(C6160b c6160b, int i) {
        if (PatchProxy.proxy(new Object[]{c6160b, Integer.valueOf(i)}, this, LIZIZ, false, 38).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6160b);
        C79046HEa.LIZ().LJI = 2;
        super.LIZ(c6160b, i);
        if (i != ReplyType.Agree.ordinal()) {
            return;
        }
        C88440Kt0.LIZ(2131584456);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    public final void LIZ(C8870fj c8870fj) {
        if (PatchProxy.proxy(new Object[]{c8870fj}, this, LIZIZ, false, 42).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8870fj);
        ALogger.m15797i("ttlive_link_paid", "onPaidLinkConfigChanged " + c8870fj);
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
        AbstractC4054j abstractC4054j = this.LJJJIL;
        if (abstractC4054j == null) {
            return;
        }
        abstractC4054j.dismiss();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4773g
    public final void LIZ(SurfaceView surfaceView) {
        if (PatchProxy.proxy(new Object[]{surfaceView}, this, LIZIZ, false, 44).isSupported) {
            return;
        }
        C106862S5w.LIZ(surfaceView);
        HEV hev = this.LIZJ;
        if (hev == null) {
            return;
        }
        C79007HCn LJII = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        hev.LIZ(LJII.LIZJ, surfaceView, hev.LJIIJJI, hev.LJIIL);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAdminLinkWidget, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4771e
    public final void LIZ(long j, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str, str2}, this, LIZIZ, false, 47).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        if (str2.length() == 0) {
            str2 = "admin_stop_normal";
        }
        super.LIZ(j, str, str2);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4771e
    public final void LIZ(long j, long j2, String str, int i) {
        if (PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), str, 1}, this, LIZIZ, false, 48).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), str, 1, -1}, this, BaseAdminLinkWidget.f26429d_, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (!LJJIII()) {
            return;
        }
        HBQ hbq = this.LJIIL;
        if (hbq == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        HBQ.LIZ(hbq, j, j2, str, 1, -1, 0, 0L, 96, null);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4771e
    public final void LIZ(LinkPlayerInfo linkPlayerInfo) {
        if (PatchProxy.proxy(new Object[]{linkPlayerInfo}, this, LIZIZ, false, 49).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkPlayerInfo);
        User LIZ = linkPlayerInfo.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        LIZ(LIZ);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    public final void LIZ(C8874fl c8874fl) {
        if (PatchProxy.proxy(new Object[]{c8874fl}, this, LIZIZ, false, 51).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8874fl);
        C9518ac c9518ac = c8874fl.LJIIJJI;
        String str = null;
        this.LJI = c9518ac != null ? String.valueOf(c9518ac.LIZJ) : null;
        C9518ac c9518ac2 = c8874fl.LJIIJJI;
        if (c9518ac2 != null) {
            str = String.valueOf(c9518ac2.LIZIZ);
        }
        this.LJII = str;
        super.LIZ(c8874fl);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    public final void LIZ(LinkMicGuideMessage linkMicGuideMessage) {
        boolean z = false;
        if (PatchProxy.proxy(new Object[]{linkMicGuideMessage}, this, LIZIZ, false, 53).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkMicGuideMessage);
        if (linkMicGuideMessage.LIZJ != 1) {
            return;
        }
        Integer num = (Integer) this.dataCenter.get("data_link_state", (String) 0);
        Intrinsics.checkNotNullExpressionValue(num, "");
        boolean z2 = C79169HIt.LIZIZ(num.intValue(), 2) && LIZ().LJIIJJI() == 0;
        long currentTimeMillis = System.currentTimeMillis();
        C87308Kak<Long> c87308Kak = AbstractC80293Hkt.f7105ca;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Long LIZ = c87308Kak.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        if (currentTimeMillis - LIZ.longValue() > this.LJJIJL) {
            z = true;
        }
        boolean booleanValue = true ^ ((Boolean) this.dataCenter.get("data_promotion_right_card_container_show", (String) Boolean.FALSE)).booleanValue();
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_BUBBLE_REMOVE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (settingKey.getValue().booleanValue() || !z2 || !z || !booleanValue) {
            return;
        }
        this.dataCenter.put("cmd_apply_tips", Boolean.TRUE);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4773g
    public final void LIZ(int i, int i2, boolean z, boolean z2, int i3) {
        boolean z3 = false;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i3)}, this, LIZIZ, false, 56).isSupported) {
            return;
        }
        C78537Gxf LIZ = C78536Gxe.LIZ();
        if (i > 0) {
            z3 = true;
        }
        LIZ.LIZLLL = z3;
        C78536Gxe.LIZ().LIZ(z2, i3);
        BaseGuestLinkWidget.LIZ(this, 2, -1, 1, LinkApplyType.NORMAL, "paid_link", Integer.valueOf(i), Integer.valueOf(i2), null, z, z2, i3, null, 2176, null);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4773g
    public final void LIZ(long j, String str, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str, Integer.valueOf(i), 2}, this, LIZIZ, false, 57).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        LIZIZ(j, str, i, 2);
    }

    public final boolean LIZ(Runnable runnable, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{runnable, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 63);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(runnable);
        if (m15738LJ().LIZJ() && m15738LJ().LIZLLL()) {
            new v$a(getContext(), 4).mo15264LJ(2131585457).LIZLLL(2131585456).LIZIZ(0, 2131586570, new DialogInterface$OnClickListenerC78989HBv(this, runnable)).LIZIZ(1, 2131582393, HC9.LIZIZ).LIZJ();
            return true;
        }
        C79046HEa LIZ = C79046HEa.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        Integer num = (Integer) LIZ.LJJIIZI;
        if (num == null || 2 != num.intValue()) {
            return false;
        }
        if (AbstractC78050Gpo.LIZ() != null) {
            AbstractC4774i LIZ2 = AbstractC78050Gpo.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            if (LIZ2.LJJIIJ()) {
                this.LJJIZ = true;
                return false;
            }
        }
        if (this.dataCenter != null) {
            Object obj = this.dataCenter.get("cmd_mic_room_jump", (String) Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            if (((Boolean) obj).booleanValue()) {
                this.LJJIZ = true;
                return false;
            }
        }
        new v$a(getContext(), 4).LIZLLL(2131585597).LIZIZ(0, 2131586570, new DialogInterface$OnClickListenerC78990HBw(this, runnable)).LIZIZ(1, 2131582393, HCA.LIZIZ).LIZJ();
        return true;
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 65).isSupported) {
            return;
        }
        IService service = ServiceManager.getService(IUserService.class);
        Intrinsics.checkNotNull(service);
        if (!((IUserService) service).user().LIZLLL()) {
            IService service2 = ServiceManager.getService(IUserService.class);
            Intrinsics.checkNotNull(service2);
            C3VF user = ((IUserService) service2).user();
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
        if (z) {
            Room room = this.LJJIII;
            if ((room != null ? room.getStreamType() : null) == LiveMode.THIRD_PARTY && num != null && num.intValue() == 0) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                HZR hzr = new HZR(context2);
                hzr.LIZ(LK5.LIZ(2131584287));
                hzr.LIZIZ(LK5.LIZ(2131584284));
                hzr.LIZ(LK5.LIZ(2131584285), HCB.LIZIZ);
                hzr.LIZIZ(LK5.LIZ(2131584286), new DialogInterface$OnClickListenerC78993HBz(this));
                hzr.LIZ();
                return;
            }
        }
        C78834H5w.LIZIZ.LIZLLL("livesdk_audience_interaction_icon_click");
        C79007HCn.LJII().LJIJJ = "bottom";
        if (num != null && num.intValue() == 0) {
            if (m15738LJ().LIZJ()) {
                LIZ(C78832H5u.LIZJ);
                return;
            } else if (C78538Gxg.LIZIZ()) {
                this.LJJJJJ.f26320LJ = C78832H5u.LIZJ;
                this.LJJJJJ.LIZ("apply");
                LIZJ(C78832H5u.LIZJ);
                return;
            } else {
                C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.f7180dw;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                Integer LIZ3 = c87308Kak.LIZ();
                if (LIZ3 == null || LIZ3.intValue() != 0) {
                    LIZ(C78403GvV.LIZIZ.LIZ(2), C78832H5u.LIZJ, "interact_icon_click");
                    return;
                }
            }
        } else if (C78403GvV.LIZIZ.LIZ(LJJIIJZLJL()) && num != null && 1 == num.intValue()) {
            if (C77917Gnf.LIZ(LJJIIJZLJL())) {
                LJIILL();
                return;
            } else {
                LJIILJJIL();
                return;
            }
        }
        LJJIFFI();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.camera.AbstractC4792e
    public final void LIZ(boolean z, boolean z2, boolean z3, boolean z4, AbstractC4791d abstractC4791d) {
        H7C<Object> LIZIZ2;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Byte.valueOf(z4 ? (byte) 1 : (byte) 0), abstractC4791d}, this, LIZIZ, false, 75).isSupported) {
            return;
        }
        if (z && z2) {
            if (abstractC4791d != null) {
                abstractC4791d.LIZ();
            }
            AbstractC2884d abstractC2884d = this.LIZLLL;
            if (abstractC2884d == null) {
                return;
            }
            abstractC2884d.LIZ(z, z2);
            return;
        }
        if (!z4) {
            C78834H5w.LIZIZ.LIZ(this.LJJJJJ, LJIIZILJ());
        }
        int i = z ? 1 : 2;
        Context context = this.context;
        if (context == null) {
            context = LK5.LJIIJ();
        }
        Intrinsics.checkNotNullExpressionValue(context, "");
        C4825a c4825a = new C4825a(context, 1, OperateType.APPLY, i, LJJIIJZLJL(), 0L, null, null, 224);
        c4825a.LJFF = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ();
        if (z3) {
            LIZIZ2 = C80517HoV.LIZ(false, 1, null);
        } else {
            LIZIZ2 = C80517HoV.LIZIZ();
        }
        LIZIZ2.LIZ(c4825a, new C78987HBt(this, abstractC4791d, z));
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4773g
    public final SurfaceView LJI() {
        HEV hev = this.LIZJ;
        if (hev != null) {
            return hev.LJII;
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4773g
    public final boolean LJIILIIL() {
        HHA hha = this.LJIIZILJ;
        if (hha != null) {
            return hha.LJI;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4773g
    public final void LJIIIIZZ() {
        AbstractC4054j abstractC4054j;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 45).isSupported && (abstractC4054j = this.LJJJIL) != null) {
            abstractC4054j.dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4771e
    public final HBQ LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 46);
        if (proxy.isSupported) {
            return (HBQ) proxy.result;
        }
        return LJJII();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4804q
    public final void LJIJ() {
        HHA hha;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 78).isSupported && this.LJJI && (hha = this.LJIIZILJ) != null) {
            hha.LIZ(false, "audience is in background");
        }
    }

    private void LJJIFFI() {
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 11).isSupported && getContext() != null && this.dataCenter != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C116971W2r.LIZJ(new DialogC78238Gsq(context, this.dataCenter));
        }
    }

    public final void LJIILJJIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 66).isSupported) {
            return;
        }
        DialogC77881Gn5 dialogC77881Gn5 = this.LJJJI;
        if (dialogC77881Gn5 != null && dialogC77881Gn5.isShowing()) {
            return;
        }
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        this.LJJJI = new DialogC77881Gn5(context, dataCenter);
        DialogC77881Gn5 dialogC77881Gn52 = this.LJJJI;
        if (dialogC77881Gn52 != null) {
            C116971W2r.LIZJ(dialogC77881Gn52);
        }
    }

    public final void LJIILL() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 67).isSupported) {
            return;
        }
        C5011d LJIL = LJIL();
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        LJIL.LIZ(context, C78828H5q.LIZIZ(this.LJJJJJ.f26320LJ));
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4773g
    public final int LJIILLIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 72);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return LIZ().LJIIJJI();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.camera.AbstractC4792e
    public final boolean LJIIZILJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 77);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC2884d abstractC2884d = this.LIZLLL;
        if (abstractC2884d == null) {
            return false;
        }
        return abstractC2884d.LIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: W_ */
    public final void mo15659W_() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 28).isSupported) {
            return;
        }
        super.mo15659W_();
        LinkControlWidget.LJJIIZ();
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("data_interact_debug_info", new HCE(false, null));
        }
        this.LIZLLL = null;
        C78999HCf LJFF = LJFF();
        if (LJFF != null) {
            LJFF.LIZ(false);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget
    public final void ak_() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 62).isSupported) {
            return;
        }
        super.ak_();
        HEV hev = this.LIZJ;
        if (hev != null) {
            hev.LIZIZ(true);
        }
        Runnable runnable = this.f26317LJ;
        if (runnable != null) {
            runnable.run();
        }
        this.f26317LJ = null;
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final void onStop() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 19).isSupported) {
            return;
        }
        super.onStop();
        SettingKey<Boolean> settingKey = LiveSettingKeys.INTERACT_AUDIENCE_PERMISSION_GUARANTOR_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            LJJ().LIZJ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget
    public final AbstractC78986HBs<LinkPlayerInfo> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 43);
        if (proxy.isSupported) {
            return (AbstractC78986HBs) proxy.result;
        }
        if (this.LJJIFFI == null) {
            Room LJJIIJZLJL = LJJIIJZLJL();
            DataCenter dataCenter = this.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter, "");
            this.LJJIFFI = new C4806x(LJJIIJZLJL, dataCenter, 4);
        }
        C4806x c4806x = this.LJJIFFI;
        if (c4806x != null) {
            return c4806x;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.plantform.base.ILinkUserInfoCenter<com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo>");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4773g
    public final void LJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 59).isSupported) {
            return;
        }
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        H04 h04 = new H04(context);
        h04.LIZ(LK5.LIZ(2131584079));
        String LIZ = LK5.LIZ(2131582651);
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        H04 LIZIZ2 = h04.LIZIZ(LIZ, new DialogInterface$OnClickListenerC78991HBx(this));
        String LIZ2 = LK5.LIZ(2131582393);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        LIZIZ2.LIZ(LIZ2, HC7.LIZIZ).LIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4773g
    public final void LJIIJJI() {
        User user;
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 60).isSupported) {
            return;
        }
        Room room = this.LJJIII;
        if (room != null) {
            user = room.getOwner();
        } else {
            user = null;
        }
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        H04 h04 = new H04(context);
        Object[] objArr = new Object[1];
        if (user == null) {
            str = "";
        } else {
            str = user.getNickName();
        }
        objArr[0] = str;
        h04.LIZ(LK5.LIZ(2131584082, objArr));
        String LIZ = LK5.LIZ(2131582915);
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        H04 LIZIZ2 = h04.LIZIZ(LIZ, new DialogInterface$OnClickListenerC78992HBy(this));
        String LIZ2 = LK5.LIZ(2131582393);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        LIZIZ2.LIZ(LIZ2, HC8.LIZIZ).LIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 14).isSupported) {
            return;
        }
        super.onResume();
        this.LJJI = false;
        Disposable disposable = this.LJJIJLIJ;
        if (disposable != null) {
            disposable.dispose();
        }
        HHA hha = this.LJIIZILJ;
        if (hha != null && hha.LJI) {
            SettingKey<Boolean> settingKey = LiveSettingKeys.INTERACT_AUDIENCE_PERMISSION_GUARANTOR_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                LJJ().LIZ();
            }
            SettingKey<Boolean> settingKey2 = LiveSettingKeys.INTERACT_AUDIENCE_PERMISSION_GUARANTOR_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            if (!settingKey2.getValue().booleanValue() || (!LJJ().LJIIIIZZ && !LJJ().f26479LJ)) {
                LIZ("resume");
            }
            this.dataCenter.put("cmd_interact_state_change", new C5984am(3));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public InteractAudienceGuestWidget() {
        /*
            r5 = this;
            X.HCn r0 = p003X.C79007HCn.LJII()
            java.lang.String r4 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r5.<init>(r0)
            io.reactivex.disposables.CompositeDisposable r0 = new io.reactivex.disposables.CompositeDisposable
            r0.<init>()
            r5.LJJIIZI = r0
            com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.e r3 = new com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.e
            r2 = 0
            r1 = 0
            r0 = 7
            r3.<init>(r2, r2, r1, r0)
            r5.LJJIJ = r3
            r5.LJI = r4
            r5.LJII = r4
            r0 = 300(0x12c, float:4.2E-43)
            r5.LJIIIIZZ = r0
            com.bytedance.android.live.liveinteract.interact.audience.InteractAudienceGuestWidget$mLinkBidCardView$2 r0 = new com.bytedance.android.live.liveinteract.interact.audience.InteractAudienceGuestWidget$mLinkBidCardView$2
            r0.<init>(r5)
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r0)
            r5.LJJIJIIJI = r0
            r0 = 180000(0x2bf20, double:8.8932E-319)
            r5.LJJIJIL = r0
            r0 = 86400000(0x5265c00, float:7.82218E-36)
            r5.LJJIJL = r0
            com.bytedance.android.live.liveinteract.interact.audience.b.a r0 = new com.bytedance.android.live.liveinteract.interact.audience.b.a
            r0.<init>()
            r5.LJJJJJ = r0
            com.bytedance.android.live.liveinteract.interact.audience.InteractAudienceGuestWidget$mGuestApplyDialog$2 r0 = new com.bytedance.android.live.liveinteract.interact.audience.InteractAudienceGuestWidget$mGuestApplyDialog$2
            r0.<init>(r5)
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r0)
            r5.LJJJJJL = r0
            com.bytedance.android.live.liveinteract.interact.audience.InteractAudienceGuestWidget$bidViewModel$2 r0 = new com.bytedance.android.live.liveinteract.interact.audience.InteractAudienceGuestWidget$bidViewModel$2
            r0.<init>(r5)
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r0)
            r5.LJJJJL = r0
            X.HE3 r0 = new X.HE3
            r0.<init>()
            r5.LJJJJLI = r0
            com.bytedance.android.live.liveinteract.interact.audience.InteractAudienceGuestWidget$mInteractLiveCorePermissionGuarantor$2 r0 = new com.bytedance.android.live.liveinteract.interact.audience.InteractAudienceGuestWidget$mInteractLiveCorePermissionGuarantor$2
            r0.<init>(r5)
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r0)
            r5.LJJJJZ = r0
            X.HC0 r0 = new X.HC0
            r0.<init>(r5)
            r5.LJIIJ = r0
            X.Gu7 r0 = new X.Gu7
            r0.<init>(r5)
            r5.LJJJJZI = r0
            X.HDG r0 = new X.HDG
            r0.<init>(r5)
            r5.LJJJLIIL = r0
            X.HBu r0 = new X.HBu
            r0.<init>(r5)
            r5.LJJJLL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.interact.audience.InteractAudienceGuestWidget.<init>():void");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onPause() {
        int i;
        boolean z;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 16).isSupported) {
            return;
        }
        super.onPause();
        AbstractC4774i LIZ = AbstractC78050Gpo.LIZ();
        if (LIZ != null) {
            i = LIZ.LJJIFFI();
        } else {
            i = 0;
        }
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        if (((IInteractService) service).getPkService().LJIIIZ() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!C79169HIt.LIZIZ(i, 4) && !z) {
            this.LJJI = true;
            HHA hha = this.LJIIZILJ;
            if (hha != null && hha.LJI) {
                SettingKey<Boolean> settingKey = LiveSettingKeys.INTERACT_AUDIENCE_PERMISSION_GUARANTOR_ENABLE;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue()) {
                    LJJ().LIZIZ();
                }
                SettingKey<Boolean> settingKey2 = LiveSettingKeys.INTERACT_AUDIENCE_PERMISSION_GUARANTOR_ENABLE;
                Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                if ((!settingKey2.getValue().booleanValue() || !LJJ().LJIIIIZZ) && !PatchProxy.proxy(new Object[]{this, "pause", (byte) 0, 2, null}, null, LIZIZ, true, 18).isSupported) {
                    LIZ("pause", false);
                }
                this.LJJIJLIJ = Observable.timer(this.LJJIJIL, TimeUnit.MILLISECONDS).subscribe(new HC3(this));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: V_ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo15660V_() {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.interact.audience.InteractAudienceGuestWidget.mo15660V_():void");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAdminLinkWidget, com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        long j;
        IMessageManager iMessageManager;
        boolean z;
        C5923dp LIZ;
        AbstractC426192th<Unit> LJJJJZI;
        Observable<Unit> LIZIZ2;
        AbstractC6070q abstractC6070q;
        boolean z2;
        HHA hha;
        Integer num = 0;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 5).isSupported) {
            return;
        }
        super.onCreate();
        this.LJJJ = System.currentTimeMillis();
        LJJIIJ().LIZJ(4);
        C79007HCn.LJII();
        this.LJJIII = (Room) this.dataCenter.get("data_room");
        C78834H5w.LIZIZ.LIZLLL();
        List<AnchorLinkUser> list = null;
        if (!PatchProxy.proxy(new Object[0], C78834H5w.LIZIZ, C78834H5w.LIZ, false, 22).isSupported) {
            C78828H5q.LIZ((String) null, (String) null, 3, (Object) null);
        }
        LIZ().LIZ(this.LJJJJZI);
        LIZ().LIZ(this.LJJJLIIL);
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 6).isSupported && C78531GxZ.LIZJ() && this.LJJIIJZLJL == null) {
            enableSubWidgetManager();
            this.LJJIIJZLJL = new BidLinkMicWidget();
            this.subWidgetManager.load(this.LJJIIJZLJL);
        }
        Room room = this.LJJIII;
        View view = this.contentView;
        if (view != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            C4806x c4806x = this.LJJIFFI;
            Context context = this.context;
            if (context != null) {
                this.LIZJ = new HEV(room, false, frameLayout, c4806x, (FragmentActivity) context, this, this.LJJIJ);
                HEV hev = this.LIZJ;
                if (hev != null) {
                    hev.LIZ(this.dataCenter);
                }
                HEV hev2 = this.LIZJ;
                if (hev2 != null) {
                    hev2.LJI = new View$OnClickListenerC78405GvX(this);
                }
                HEV hev3 = this.LIZJ;
                if (hev3 != null) {
                    hev3.m23777LJ(this.LJJII);
                }
                HEV hev4 = this.LIZJ;
                if (hev4 != null) {
                    hev4.LIZ(true);
                }
                C4418a c4418a = this.LJJJJJ;
                Room room2 = this.LJJIII;
                if (room2 != null) {
                    j = room2.ownerUserId;
                } else {
                    j = 0;
                }
                c4418a.LJFF = j;
                Context context2 = this.context;
                Intrinsics.checkNotNullExpressionValue(context2, "");
                DataCenter dataCenter = this.dataCenter;
                Intrinsics.checkNotNullExpressionValue(dataCenter, "");
                this.LJJJJIZL = new HAY(context2, dataCenter, LIZ(), this);
                HAY hay = this.LJJJJIZL;
                if (hay != null) {
                    hay.LIZJ();
                }
                Room room3 = this.LJJIII;
                if (room3 != null) {
                    room3.getId();
                }
                Pair LIZ2 = IQV.LIZ((Function0) InteractAudienceGuestWidget$onCreate$dataPair$1.INSTANCE);
                IQX.LIZ((C13491f) LIZ2.getFirst(), "interact_guest_service");
                ((C4427c) LIZ2.getFirst()).LIZ().LIZIZ(this);
                this.LJJIIZI.add((Disposable) LIZ2.getSecond());
                Pair LIZ3 = IQV.LIZ((Function0) InteractAudienceGuestWidget$onCreate$dataPair2$1.INSTANCE);
                IQX.LIZ((C13491f) LIZ3.getFirst(), "interact_admin_service");
                ((C4425a) LIZ3.getFirst()).LIZ().LIZIZ(this);
                this.LJJIIZI.add((Disposable) LIZ3.getSecond());
                Pair LIZ4 = IQV.LIZ((Function0) InteractAudienceGuestWidget$onCreate$2.INSTANCE);
                IQX.LIZ((C5012e) LIZ4.component1(), "GuestApplyViewModel");
                this.LJJIIZI.add((Disposable) LIZ4.component2());
                DataCenter dataCenter2 = this.dataCenter;
                if (dataCenter2 != null) {
                    iMessageManager = (IMessageManager) dataCenter2.get("data_message_manager");
                } else {
                    iMessageManager = null;
                }
                this.LJFF = iMessageManager;
                IMessageManager iMessageManager2 = this.LJFF;
                if (iMessageManager2 != null) {
                    iMessageManager2.addMessageListener(MessageType.LINK_MIC_GUIDE_MESSAGE.LIZ(), this);
                }
                IMessageManager iMessageManager3 = this.LJFF;
                if (iMessageManager3 != null) {
                    iMessageManager3.addMessageListener(MessageType.LINKER.LIZ(), this);
                }
                if (this.LJFF != null) {
                    this.LJJIIZI.add((Disposable) IQV.LIZ((Function0) new InteractAudienceGuestWidget$onCreate$3(this)).getSecond());
                }
                HEV hev5 = this.LIZJ;
                if (hev5 != null) {
                    if (this.LJIIZILJ == null || ((hha = this.LJIIZILJ) != null && !hha.LJI)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hev5.LIZIZ(z2);
                }
                HHA hha2 = this.LJIIZILJ;
                if (hha2 != null && hha2.LJI) {
                    AbstractC4770d LIZ5 = AbstractC4770d.LIZ.LIZ();
                    if (LIZ5 != null) {
                        abstractC6070q = LIZ5.LJIJJ();
                    } else {
                        abstractC6070q = null;
                    }
                    if (!(abstractC6070q instanceof AbstractC2884d)) {
                        abstractC6070q = null;
                    }
                    this.LIZLLL = (AbstractC2884d) abstractC6070q;
                    C79046HEa.LIZ().LIZ((Integer) 2);
                    HHA hha3 = this.LJIIZILJ;
                    if (hha3 != null) {
                        HHA.LIZ(hha3, true, null, 2, null);
                    }
                } else {
                    C79046HEa.LIZ().LIZ(num);
                    ak_();
                    LinkCrossRoomDataHolder.LJII().LJIILLIIL = "";
                }
                HHA hha4 = this.LJIIZILJ;
                if (hha4 != null && hha4.LJI && C79007HCn.LJII().LJJII != null) {
                    C9523ai c9523ai = C79007HCn.LJII().LJJII;
                    if (c9523ai != null) {
                        list = c9523ai.LIZLLL;
                    }
                    LIZ(list);
                }
                C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.LLLLZIL;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                if (!c87308Kak.LIZ().booleanValue()) {
                    C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.LLLLZIL;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                    c87308Kak2.LIZ(Boolean.TRUE);
                }
                SettingKey<Boolean> settingKey = LiveSettingKeys.INTERACT_AUDIENCE_PERMISSION_GUARANTOR_ENABLE;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue() && (getContext() instanceof FragmentActivity)) {
                    C5001e LJJ = LJJ();
                    Context context3 = getContext();
                    if (context3 != null) {
                        LJJ.LIZ((FragmentActivity) context3);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                }
                this.LJJIIZI.add(C87010KQi.LIZ().LIZ(C5986ap.class).subscribe(new HC4(this)));
                if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 7).isSupported) {
                    this.LJJIIZI.add(C87010KQi.LIZ().LIZ(C4267b.class).subscribe(new H65(this)));
                    m15738LJ().LJI.observe(this, this.LJJJLL);
                    if (!C4378a.LJJIJIL.LIZJ()) {
                        this.LJJIIZI.add(C87010KQi.LIZ().LIZ(C4266a.class).subscribe(new C78505Gx9(this)));
                    }
                }
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 73);
                if (proxy.isSupported) {
                    num = (Integer) proxy.result;
                } else {
                    AbstractC4774i LIZ6 = AbstractC78050Gpo.LIZ();
                    if (LIZ6 != null) {
                        z = LIZ6.LJJIIJ();
                    } else {
                        z = false;
                    }
                    HashMap<String, Integer> hashMap = IInteractService.micRoomHostStateMap;
                    if (hashMap != null && hashMap.containsKey("is_host_auto_apply") && z) {
                        num = hashMap.get("is_host_auto_apply");
                        hashMap.remove("is_host_auto_apply");
                    }
                }
                if (num != null) {
                    int intValue = num.intValue();
                    HHA hha5 = this.LJIIZILJ;
                    if (hha5 != null && hha5.LJI) {
                        return;
                    }
                    C78536Gxe.LIZ().LJIIJ();
                    if (intValue > 0) {
                        LIZ(intValue, C78832H5u.LIZ, "host_auto_apply");
                    } else if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 74).isSupported) {
                        AbstractC8644i LIZ7 = C4574547f.LIZ().LIZ(C8668v.class);
                        if ((LIZ7 instanceof C81173Hz5) && TextUtils.equals(((C81173Hz5) LIZ7).LJIIIZ, "true")) {
                            C4418a c4418a2 = this.LJJJJJ;
                            c4418a2.f26320LJ = 107;
                            c4418a2.LIZ("invite_mutual");
                            BaseGuestLinkWidget.LIZ(this, 2, -1, 16, LinkApplyType.STRONG_REACH, "auto_apply_remind", null, null, null, false, false, 0, null, 4064, null);
                        }
                    }
                }
                this.LJJJJLL = new HD9(LIZ());
                if (this.LJJIIJ == null) {
                    enableSubWidgetManager();
                    this.LJJIIJ = new InteractPaidLinkWidget();
                    InteractPaidLinkWidget interactPaidLinkWidget = this.LJJIIJ;
                    if (interactPaidLinkWidget != null) {
                        interactPaidLinkWidget.LIZIZ(this.LJJII);
                    }
                    this.subWidgetManager.load(this.LJJIIJ);
                }
                C4369e c4369e = this.LJJIJ;
                if (c4369e != null) {
                    c4369e.LIZ(LJJIIJZLJL());
                }
                SettingKey<Boolean> settingKey2 = LiveSettingKeys.RELEASE_AV_PERMISSION_WHEN_CLOSE_NOTIFICATION_ON_BACKGROUND;
                Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                Boolean value2 = settingKey2.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "");
                if (value2.booleanValue() && (LIZ = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null)) != null && (LJJJJZI = LIZ.LJJJJZI()) != null && (LIZIZ2 = LJJJJZI.LIZIZ()) != null) {
                    QB4.LIZ(LIZIZ2, "interact_admin_service", new InteractAudienceGuestWidget$onCreate$8(this));
                }
                C78828H5q.LJI();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseAdminLinkWidget, com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        boolean z;
        CircleInfo circleInfo;
        AbstractC413392Xt<C6305j> LJJJJZ;
        C6305j LIZIZ2;
        AbstractDialogC9363b abstractDialogC9363b;
        C5923dp LJJJI;
        C2WC<Boolean> LLJZ;
        String str;
        long j;
        Long l;
        String str2;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 20).isSupported) {
            return;
        }
        if (LJIL().LJIILIIL()) {
            LJIL().dismiss();
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.INTERACT_AUDIENCE_PERMISSION_GUARANTOR_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            LJJ().LIZLLL();
        }
        AbstractC4774i LIZ = AbstractC78050Gpo.LIZ();
        if (LIZ != null) {
            z = C79169HIt.LIZIZ(LIZ.LJJIFFI(), 4);
        } else {
            z = false;
        }
        C79007HCn.LJII().LJJII = null;
        HHA hha = this.LJIIZILJ;
        if (hha != null && hha.LJI && !z) {
            DataCenter dataCenter = this.dataCenter;
            if (dataCenter != null) {
                dataCenter.put("data_link_mic_is_quick_invite", Boolean.FALSE);
            }
            this.LJJJJJ.LJII = this.LJJJJLI.LIZIZ;
            C78999HCf c78999HCf = this.LJIILL;
            String str3 = "live_end";
            if ((c78999HCf == null || !c78999HCf.LJIIIZ) && ((LJJJI = LJJJI()) == null || (LLJZ = LJJJI.LLJZ()) == null || !LLJZ.LIZ().booleanValue())) {
                str3 = "leave_normally";
            }
            if (C78536Gxe.LIZ().LIZLLL && C78538Gxg.LIZIZ()) {
                this.LJJJJJ.LJIIIIZZ.put("recharge_mode", "normal");
            } else if (m15738LJ().LIZJ()) {
                this.LJJJJJ.LJIIIIZZ.put("recharge_mode", "auction");
            }
            if (m15738LJ().LIZJ()) {
                Map<String, String> map = this.LJJJJJ.LJIIIIZZ;
                Integer value2 = m15738LJ().LJII.getValue();
                if (value2 == null || (str2 = String.valueOf(value2.intValue())) == null) {
                    str2 = "";
                }
                map.put("recharge_price", str2);
            } else if (C78538Gxg.LIZIZ()) {
                Map<String, String> map2 = this.LJJJJJ.LJIIIIZZ;
                if (C78536Gxe.LIZ().LIZLLL) {
                    str = String.valueOf(C4284f.LJIIIIZZ.LJII());
                } else {
                    str = "0";
                }
                map2.put("recharge_price", str);
                if (C78538Gxg.LIZ(LJJIIJZLJL())) {
                    this.LJJJJJ.LJIIIIZZ.put("add_price", String.valueOf(C78538Gxg.LIZIZ.LJIILIIL()));
                }
                this.LJJJJJ.LJIIIIZZ.put("time", String.valueOf(C78536Gxe.LIZ().LIZLLL()));
                C87308Kak<C6179t> c87308Kak = AbstractC80293Hkt.f7010al;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                C6179t LIZ2 = c87308Kak.LIZ();
                this.LJJJJJ.LJIIIIZZ.put("rechargeable_label", C78536Gxe.LIZJ.LIZ(LIZ2.LIZIZ));
                this.LJJJJJ.LJIIIIZZ.put("rechargeable_intro", LIZ2.LIZJ);
            }
            BidLinkMicWidget bidLinkMicWidget = this.LJJIIJZLJL;
            if (bidLinkMicWidget != null && bidLinkMicWidget.LJIILL()) {
                Map<String, String> map3 = this.LJJJJJ.LJIIIIZZ;
                BidLinkMicWidget bidLinkMicWidget2 = this.LJJIIJZLJL;
                if (bidLinkMicWidget2 != null) {
                    l = bidLinkMicWidget2.LJIIZILJ();
                } else {
                    l = null;
                }
                map3.put("time", String.valueOf(l));
            }
            C78834H5w c78834H5w = C78834H5w.LIZIZ;
            Room room = this.LJJIII;
            C4418a c4418a = this.LJJJJJ;
            long j2 = this.LJJIJIIJIL;
            AbstractC2884d abstractC2884d = this.LIZLLL;
            if (abstractC2884d != null) {
                j = abstractC2884d.getCameraDuration();
            } else {
                j = 0;
            }
            c78834H5w.LIZ(room, str3, c4418a, j2, j);
            C78538Gxg.LIZIZ.LIZIZ(false);
            C78536Gxe.LIZ().LJIIJ();
        }
        m15738LJ().LJI.removeObserver(this.LJJJLL);
        HD9 hd9 = this.LJJJJLL;
        if (hd9 != null) {
            HD9.LIZ(hd9, 0, 1, null);
        }
        HAY hay = this.LJJJJIZL;
        if (hay != null) {
            hay.LIZLLL();
        }
        IMessageManager iMessageManager = this.LJFF;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        super.onDestroy();
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        AbstractC78986HBs<LinkPlayerInfo> linkUserInfoCenter = ((IInteractService) service).getLinkUserInfoCenter();
        if (linkUserInfoCenter != null) {
            linkUserInfoCenter.LIZIZ(this.LJJJLIIL);
        }
        AbstractDialogC9363b abstractDialogC9363b2 = this.LJJJLZIJ;
        if (abstractDialogC9363b2 != null && abstractDialogC9363b2.isShowing() && (abstractDialogC9363b = this.LJJJLZIJ) != null) {
            C116971W2r.LIZ(abstractDialogC9363b);
        }
        m15738LJ().LJIIJ();
        if (m15738LJ().LIZJ()) {
            m15738LJ().LJIILJJIL.setValue(2);
        }
        C4378a c4378a = this.LJIIIZ;
        if (c4378a != null && !PatchProxy.proxy(new Object[0], c4378a, C4378a.LIZ, false, 40).isSupported) {
            c4378a.onCleared();
        }
        this.LJIIIZ = null;
        if (!PatchProxy.proxy(new Object[0], C78834H5w.LIZIZ, C78834H5w.LIZ, false, 23).isSupported) {
            C78828H5q.LIZIZ((String) null, (String) null, 3, (Object) null);
        }
        C78834H5w c78834H5w2 = C78834H5w.LIZIZ;
        long j3 = this.LJJJ;
        Room room2 = this.LJJIII;
        if (room2 == null || (circleInfo = room2.circleInfo) == null) {
            circleInfo = null;
        }
        if (!PatchProxy.proxy(new Object[]{new Long(j3), circleInfo}, c78834H5w2, C78834H5w.LIZ, false, 21).isSupported) {
            C4574547f.LIZ().LIZ("livesdk_voice_room_watch_duration", c78834H5w2.LIZ(j3, circleInfo), Room.class, C8668v.class, C3348d.class);
        }
        this.LJJIZ = false;
        this.LJJIIZI.dispose();
        if (!z) {
            AbstractC2884d abstractC2884d2 = this.LIZLLL;
            if (abstractC2884d2 != null) {
                abstractC2884d2.LJFF();
            }
            C79046HEa LIZ3 = C79046HEa.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
            Integer num = (Integer) LIZ3.LJJIIZI;
            if (num == null || num.intValue() != 0) {
                ak_();
            }
        }
        DataCenter dataCenter2 = this.dataCenter;
        if (dataCenter2 != null) {
            dataCenter2.put("data_interact_audience_video_translation", Boolean.FALSE);
        }
        C79007HCn.LJII().LIZ(Boolean.FALSE);
        HEV hev = this.LIZJ;
        if (hev != null) {
            hev.LIZ();
        }
        if (!z) {
            C87010KQi.LIZ().LIZ(new C5984am(15));
        }
        AbstractC4054j abstractC4054j = this.LJJJIL;
        if (abstractC4054j != null) {
            abstractC4054j.dismiss();
        }
        this.LJJJJLI.LIZ();
        Disposable disposable = this.LJJIJLIJ;
        if (disposable != null) {
            disposable.dispose();
        }
        C4369e c4369e = this.LJJIJ;
        if (c4369e != null) {
            c4369e.m15749LJ();
        }
        AbstractC4409d interactPaidLinkService = ((IInteractService) ServiceManager.getService(IInteractService.class)).interactPaidLinkService();
        if (interactPaidLinkService != null) {
            interactPaidLinkService.LIZ((ImageModel) null);
        }
        C5923dp LIZ4 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ4 != null && (LJJJJZ = LIZ4.LJJJJZ()) != null && (LIZIZ2 = LJJJJZ.LIZIZ()) != null) {
            LIZIZ2.LIZJ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    public final void LIZIZ(C8874fl c8874fl) {
        String str;
        if (PatchProxy.proxy(new Object[]{c8874fl}, this, LIZIZ, false, 52).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8874fl);
        C9518ac c9518ac = c8874fl.LJIIJJI;
        String str2 = null;
        if (c9518ac != null) {
            str = String.valueOf(c9518ac.LIZJ);
        } else {
            str = null;
        }
        this.LJI = str;
        C9518ac c9518ac2 = c8874fl.LJIIJJI;
        if (c9518ac2 != null) {
            str2 = String.valueOf(c9518ac2.LIZIZ);
        }
        this.LJII = str2;
        super.LIZIZ(c8874fl);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    public final void LIZLLL(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZIZ, false, 39).isSupported) {
            return;
        }
        super.LIZLLL(th);
        if (isViewValid()) {
            C88469KtT.LIZ(this.context, th);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    /* renamed from: LJ */
    public final void mo15668LJ(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LIZIZ, false, 50).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        if (c8854es.LJJJLZIJ == 1) {
            LJI("kickout");
        }
        super.mo15668LJ(c8854es);
    }

    private final void LIZLLL(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 70).isSupported) {
            return;
        }
        AbstractC4054j abstractC4054j = this.LJJJIL;
        if (abstractC4054j != null && abstractC4054j.LJIILIIL()) {
            return;
        }
        SettingKey<C6858bo> settingKey = LiveSettingKeys.LINK_PAYMENT_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        String str = settingKey.getValue().LIZJ;
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("live_type", "video_live");
            if (i == C78832H5u.LIZIZ) {
                hashMap.put("request_page", "seat");
            } else if (i == C78832H5u.LIZJ) {
                hashMap.put("request_page", "bottom");
            } else if (i == 113) {
                hashMap.put("request_page", "card");
            }
            String LIZIZ2 = C414642b4.LIZIZ(str, hashMap);
            ALogger.m15797i("ttlive_link_paid", C0002O.m25086C("applySchema: ", LIZIZ2));
            ((ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class)).handle(this.context, LIZIZ2);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget
    public final AbstractC6070q LIZIZ(String str) {
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 22);
        if (proxy.isSupported) {
            return (AbstractC6070q) proxy.result;
        }
        if (this.LIZLLL == null) {
            this.LJJJJJ.LJI = C79046HEa.LIZ().LJI;
            HCC hcc = new HCC();
            if (C79046HEa.LIZ().LJI != 1) {
                z = false;
            }
            hcc.LIZ = z;
            this.LIZLLL = ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).createLinkVideoView(this.context, hcc, str);
        }
        AbstractC2884d abstractC2884d = this.LIZLLL;
        if (abstractC2884d != null) {
            return abstractC2884d;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.interact.LiveVideoClientFactory");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    public final void LIZJ(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LIZIZ, false, 40).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        C79046HEa.LIZ().LJI = c8854es.LJJJJZ;
        super.LIZJ(c8854es);
    }

    /* renamed from: LJ */
    public final void m15737LJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 64).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        HEV hev = this.LIZJ;
        if (hev != null) {
            hev.LIZ(str);
        }
    }

    private void LIZ(List<? extends AnchorLinkUser> list) {
        Map<String, Object> emptyMap;
        Integer num;
        if (PatchProxy.proxy(new Object[]{list}, this, LIZIZ, false, 84).isSupported) {
            return;
        }
        String str = "";
        if (list != null) {
            Iterator<? extends AnchorLinkUser> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnchorLinkUser next = it.next();
                if (!TextUtils.equals(next.LIZLLL, LinkCrossRoomDataHolder.LJII().LJIILLIIL)) {
                    String str2 = next.LIZLLL;
                    Intrinsics.checkNotNullExpressionValue(str2, str);
                    str = str2;
                    break;
                }
            }
        }
        HHA hha = this.LJIIZILJ;
        if (hha == null || (emptyMap = hha.LJIILLIIL) == null) {
            emptyMap = MapsKt__MapsKt.emptyMap();
        }
        StringBuilder sb = new StringBuilder("InteractAudienceGuest updateFirstvideoFrame anchorLinkid = ");
        sb.append(str);
        sb.append(", remoteViews = ");
        sb.append(emptyMap);
        sb.append(", size = ");
        sb.append(emptyMap.size());
        sb.append(',');
        sb.append("linkUsers = ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        sb.append(num);
        ALogger.m15797i("ttlive_pk", sb.toString());
        for (Map.Entry<String, Object> entry : emptyMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!TextUtils.equals(key, LinkCrossRoomDataHolder.LJII().LJIILLIIL) && LIZ(key, list)) {
                if (value instanceof SurfaceView) {
                    LIZ(key, (SurfaceView) value, 0, 0);
                } else if (value instanceof TextureView) {
                    LIZ(key, (TextureView) value, 0, 0);
                } else if (value instanceof ILayerControl.ILayer) {
                    LIZ(key, (ILayerControl.ILayer) value, 0, 0);
                }
            }
        }
    }

    private final void LIZJ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 68).isSupported) {
            return;
        }
        AbstractC4054j abstractC4054j = this.LJJJIL;
        if (abstractC4054j != null && abstractC4054j.LJIILIIL()) {
            return;
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_LYNX_PAYFORLINK_APPLY_PAYINFO_REQUEST;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            LIZLLL(i);
        } else if (C4284f.LJIIIIZZ.LIZ()) {
            this.LJJIIZI.add(((LinkPaidLinkApi) C88306Kqq.LIZ().LIZ(LinkPaidLinkApi.class)).getPaidInfoBeforeApply(LJJIIJZLJL().getId()).compose(C100839PnV.LIZJ()).subscribe(new C78541Gxj(this), GYV.LIZIZ));
        } else {
            LIZ(C4284f.LJIIIIZZ.LJII(), C4284f.LJIIIIZZ.LJIIIIZZ(), (List<String>) null, (String) null);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    public final void LIZLLL(C8854es c8854es) {
        FragmentManager fragmentManager;
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LIZIZ, false, 41).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        super.LIZLLL(c8854es);
        if (c8854es.LJJLIIIJL != null) {
            this.LJJJJJ.LIZ("gift_message_invite");
            this.LJJJJJ.LJIIIZ = c8854es.LJJLIIIJL;
        } else {
            this.LJJJJJ.LIZ("invite");
        }
        this.LJJJJJ.LIZLLL = c8854es.LJJI;
        C78952HAk c78952HAk = this.LJJIIZ;
        if (c78952HAk != null && c78952HAk.LJIILIIL()) {
            c78952HAk.dismiss();
        }
        C78536Gxe.LIZ().LJIIJ();
        C78834H5w.LIZIZ.LIZ(c8854es.LJJLIIIJL);
        this.LJJIIZ = C78952HAk.LJIIIIZZ.LIZ(LJJIIJZLJL(), c8854es);
        C78952HAk c78952HAk2 = this.LJJIIZ;
        if (c78952HAk2 != null) {
            FragmentActivity LIZIZ2 = C439993ar.LIZIZ(getContext());
            if (LIZIZ2 != null) {
                fragmentManager = LIZIZ2.getSupportFragmentManager();
            } else {
                fragmentManager = null;
            }
            c78952HAk2.show(fragmentManager, "InteractAudienceInvitedDialog");
        }
    }

    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        String str;
        String str2;
        LinkMicGuideMessage.C8709i c8709i;
        C4369e c4369e;
        if (PatchProxy.proxy(new Object[]{iMessage}, this, LIZIZ, false, 82).isSupported) {
            return;
        }
        if (iMessage instanceof LinkMicGuideMessage) {
            LinkMicGuideMessage linkMicGuideMessage = (LinkMicGuideMessage) iMessage;
            if (linkMicGuideMessage.LIZJ == 11 && (c8709i = linkMicGuideMessage.LJIILIIL) != null && (c4369e = this.LJJIJ) != null) {
                c4369e.LIZ(c8709i);
            }
        } else if (!(iMessage instanceof C8874fl)) {
        } else {
            C8874fl c8874fl = (C8874fl) iMessage;
            if (c8874fl.LIZIZ == 47) {
                C9544q c9544q = c8874fl.LJJJJJL;
                if (c9544q != null) {
                    LinkCrossRoomDataHolder.LJII().LJLJL = c9544q.LIZLLL;
                    C79112HGo c79112HGo = c9544q.f28176LJ;
                    if (c79112HGo == null || !c79112HGo.LIZIZ) {
                        return;
                    }
                    HHA hha = this.LJIIZILJ;
                    if (hha != null) {
                        hha.LIZIZ(c9544q.LIZJ);
                    }
                    HHA hha2 = this.LJIIZILJ;
                    if (hha2 != null) {
                        hha2.LIZ(c9544q.LIZIZ);
                    }
                    HHA hha3 = this.LJIIZILJ;
                    if (hha3 == null) {
                        return;
                    }
                    hha3.LIZ(c79112HGo.LIZJ);
                }
            } else if (c8874fl.LIZIZ != 46) {
            } else {
                C79007HCn.LJII().LJJII = c8874fl.LJJJJIZL;
                HHA hha4 = this.LJIIZILJ;
                if (hha4 == null || !hha4.LJI) {
                    return;
                }
                HHA hha5 = this.LJIIZILJ;
                List<AnchorLinkUser> list = null;
                if (hha5 != null) {
                    C9523ai c9523ai = c8874fl.LJJJJIZL;
                    if (c9523ai != null) {
                        str2 = c9523ai.LIZIZ;
                    } else {
                        str2 = null;
                    }
                    hha5.LIZIZ(str2);
                }
                HHA hha6 = this.LJIIZILJ;
                if (hha6 != null) {
                    C9523ai c9523ai2 = c8874fl.LJJJJIZL;
                    if (c9523ai2 != null) {
                        str = c9523ai2.LIZJ;
                    } else {
                        str = null;
                    }
                    hha6.LIZ(str);
                }
                C9523ai c9523ai3 = c8874fl.LJJJJIZL;
                if (c9523ai3 != null) {
                    list = c9523ai3.LIZLLL;
                }
                LIZ(list);
            }
        }
    }

    private final void LJI(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 71).isSupported) {
            return;
        }
        SettingKey<C6858bo> settingKey = LiveSettingKeys.LINK_PAYMENT_CONFIG;
        String str2 = "";
        Intrinsics.checkNotNullExpressionValue(settingKey, str2);
        String str3 = settingKey.getValue().f27217LJ;
        AbstractC8644i LIZ = C4574547f.LIZ().LIZ(C8668v.class);
        Intrinsics.checkNotNullExpressionValue(LIZ, str2);
        String str4 = LIZ.LIZ().get("enter_from_merge");
        if (str4 == null) {
            str4 = str2;
        }
        String str5 = LIZ.LIZ().get("enter_method");
        if (str5 == null) {
            str5 = str2;
        }
        String str6 = LIZ.LIZ().get("action_type");
        if (str6 != null) {
            str2 = str6;
        }
        String LIZIZ2 = C414642b4.LIZIZ(str3, MapsKt__MapsKt.plus(MapsKt__MapsKt.plus(MapsKt__MapsKt.mapOf(TuplesKt.m137to("service_provider_id", String.valueOf(LJJIIJZLJL().ownerUserId)), TuplesKt.m137to("service_order_id", this.LJIJ), TuplesKt.m137to("room_id", String.valueOf(LJJIIJZLJL().getId())), TuplesKt.m137to("anchor_id", String.valueOf(LJJIIJZLJL().ownerUserId)), TuplesKt.m137to("live_type", "video_live"), TuplesKt.m137to("enter_from_merge", str4), TuplesKt.m137to("enter_method", str5), TuplesKt.m137to("action_type", str2), TuplesKt.m137to("function_type", "audience"), TuplesKt.m137to("limited_time", String.valueOf(C4284f.LJIIIIZZ.LIZIZ().LIZJ))), TuplesKt.m137to("connection_time", String.valueOf(this.LJI))), TuplesKt.m137to("connection_cost", String.valueOf(this.LJII))));
        boolean handle = ((ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class)).handle(this.context, LIZIZ2);
        ALogger.m15797i("ttlive_link_paid", "showPaidLinkCommentDialog from=" + str + " handle=" + handle + LoggerUtil.BLANK_TAG + LIZIZ2);
    }

    public final void LIZ(int i) {
        AbstractC413392Xt<C4378a> LIZIZ2;
        C4378a LIZIZ3;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 8).isSupported) {
            return;
        }
        AbstractDialogC9363b abstractDialogC9363b = this.LJJJLZIJ;
        if (abstractDialogC9363b == null || !abstractDialogC9363b.isShowing()) {
            if (C78531GxZ.LIZJ()) {
                C4287a LIZ = C4287a.LIZJ.LIZ();
                if (LIZ != null && (LIZIZ2 = LIZ.LIZIZ()) != null && (LIZIZ3 = LIZIZ2.LIZIZ()) != null) {
                    Context context = this.context;
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    DialogC78477Gwh dialogC78477Gwh = new DialogC78477Gwh(context, LIZIZ3);
                    this.LJJJLZIJ = dialogC78477Gwh;
                    C116971W2r.LIZJ(dialogC78477Gwh);
                    return;
                }
                return;
            }
            Context context2 = this.context;
            Intrinsics.checkNotNullExpressionValue(context2, "");
            DialogC78493Gwx dialogC78493Gwx = new DialogC78493Gwx(context2, m15738LJ(), i);
            this.LJJJLZIJ = dialogC78493Gwx;
            C116971W2r.LIZJ(dialogC78493Gwx);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, p003X.AbstractC78977HBj
    public final void LIZIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZIZ, false, 33).isSupported) {
            return;
        }
        super.LIZIZ(th);
        C88469KtT.LIZ(getContext(), th, 2131585599);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    public final void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 34).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        C79046HEa.LIZ().LIZ((Integer) 0);
        C79007HCn LJII = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        LJII.LJIJI = "";
        if (!Intrinsics.areEqual(str, "paid_change") && !Intrinsics.areEqual(str, "low_balance_for_paid_link")) {
            C88440Kt0.LIZ(2131584550);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4773g
    public final void LIZLLL(String str) {
        String str2;
        Long l;
        String valueOf;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 58).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("data_link_mic_is_quick_invite", Boolean.FALSE);
        }
        this.LJJJJJ.LJII = this.LJJJJLI.LIZIZ;
        if (C78536Gxe.LIZ().LIZLLL && C78538Gxg.LIZIZ()) {
            this.LJJJJJ.LJIIIIZZ.put("recharge_mode", "normal");
        } else if (m15738LJ().LIZJ()) {
            this.LJJJJJ.LJIIIIZZ.put("recharge_mode", "auction");
        }
        long j = 0;
        String str3 = "";
        if (m15738LJ().LIZJ()) {
            Map<String, String> map = this.LJJJJJ.LJIIIIZZ;
            Integer value = m15738LJ().LJII.getValue();
            if (value != null && (valueOf = String.valueOf(value.intValue())) != null) {
                str3 = valueOf;
            }
            map.put("recharge_price", str3);
        } else if (C78538Gxg.LIZIZ()) {
            Map<String, String> map2 = this.LJJJJJ.LJIIIIZZ;
            if (C78536Gxe.LIZ().LIZLLL) {
                str2 = String.valueOf(C4284f.LJIIIIZZ.LJII());
            } else {
                str2 = "0";
            }
            map2.put("recharge_price", str2);
            if (C78538Gxg.LIZ(LJJIIJZLJL())) {
                this.LJJJJJ.LJIIIIZZ.put("add_price", String.valueOf(C78538Gxg.LIZIZ.LJIILIIL()));
                C78538Gxg.LIZIZ.LIZ(0L);
            }
            this.LJJJJJ.LJIIIIZZ.put("time", String.valueOf(C78536Gxe.LIZ().LIZLLL()));
            C87308Kak<C6179t> c87308Kak = AbstractC80293Hkt.f7010al;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, str3);
            C6179t LIZ = c87308Kak.LIZ();
            this.LJJJJJ.LJIIIIZZ.put("rechargeable_label", C78536Gxe.LIZJ.LIZ(LIZ.LIZIZ));
            this.LJJJJJ.LJIIIIZZ.put("rechargeable_intro", LIZ.LIZJ);
        }
        BidLinkMicWidget bidLinkMicWidget = this.LJJIIJZLJL;
        if (bidLinkMicWidget != null && bidLinkMicWidget.LJIILL()) {
            Map<String, String> map3 = this.LJJJJJ.LJIIIIZZ;
            BidLinkMicWidget bidLinkMicWidget2 = this.LJJIIJZLJL;
            if (bidLinkMicWidget2 != null) {
                l = bidLinkMicWidget2.LJIIZILJ();
            } else {
                l = null;
            }
            map3.put("time", String.valueOf(l));
        }
        C78834H5w c78834H5w = C78834H5w.LIZIZ;
        Room room = this.LJJIII;
        C4418a c4418a = this.LJJJJJ;
        long j2 = this.LJJIJIIJIL;
        AbstractC2884d abstractC2884d = this.LIZLLL;
        if (abstractC2884d != null) {
            j = abstractC2884d.getCameraDuration();
        }
        c78834H5w.LIZ(room, str, c4418a, j2, j);
        super.LIZLLL(str);
    }

    public final void LIZIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 79).isSupported) {
            return;
        }
        this.LJJII = z;
        HEV hev = this.LIZJ;
        if (hev != null) {
            hev.m23777LJ(z);
        }
        InteractPaidLinkWidget interactPaidLinkWidget = this.LJJIIJ;
        if (interactPaidLinkWidget != null) {
            interactPaidLinkWidget.LIZIZ(z);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4799k
    public final void LIZJ(Throwable th) {
        Integer num;
        AbstractC4774i LIZ;
        if (PatchProxy.proxy(new Object[]{th}, this, LIZIZ, false, 37).isSupported) {
            return;
        }
        super.LIZJ(th);
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("data_link_mic_is_quick_invite", Boolean.FALSE);
        }
        if (th instanceof ApiServerException) {
            ApiServerException apiServerException = (ApiServerException) th;
            if (apiServerException.mErrorCode == 4004091 && C78538Gxg.LIZIZ()) {
                LIZJ(0);
                return;
            }
            if (apiServerException.mErrorCode == 4004090 && (LIZ = AbstractC78050Gpo.LIZ()) != null) {
                LIZ.LJIIL();
            }
            C88440Kt0.LIZ(apiServerException.mPrompt);
            AbstractC78986HBs<T> LIZ2 = LIZ();
            Long l = null;
            if (LIZ2 != 0) {
                num = Integer.valueOf(C79242HLo.LIZ((AbstractC78986HBs<LinkPlayerInfo>) LIZ2));
            } else {
                num = null;
            }
            String valueOf = String.valueOf(num.intValue());
            if (valueOf == null) {
                valueOf = "0";
            }
            C4418a c4418a = this.LJJJJJ;
            HashMap<String, String> LJIIJJI = m15738LJ().LJIIJJI();
            if (!PatchProxy.proxy(new Object[]{LJIIJJI}, c4418a, C4418a.LIZ, false, 2).isSupported) {
                C106862S5w.LIZ(LJIIJJI);
                c4418a.LJIIIIZZ = LJIIJJI;
            }
            BidLinkMicWidget bidLinkMicWidget = this.LJJIIJZLJL;
            if (bidLinkMicWidget != null && bidLinkMicWidget.LIZJ() && C78531GxZ.m23800LJ()) {
                Map<String, String> map = this.LJJJJJ.LJIIIIZZ;
                AbstractC4289e LIZIZ2 = C4287a.LIZJ.LIZIZ();
                if (LIZIZ2 != null) {
                    l = Long.valueOf(LIZIZ2.LJIIIIZZ());
                }
                map.put("time", String.valueOf(l));
            }
            C78834H5w.LIZIZ.LIZ(apiServerException, this.LJJJJJ, LJJIIJZLJL().circleInfo, valueOf);
            return;
        }
        C88440Kt0.LIZ(2131585441);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4773g
    public final boolean LIZIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{112}, this, LIZIZ, false, 61);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (m15738LJ() == null || !m15738LJ().LIZJ()) {
            return false;
        }
        LIZ(112);
        return true;
    }

    private boolean LIZ(String str, List<? extends AnchorLinkUser> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, list}, this, LIZIZ, false, 83);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(str);
        if (list != null) {
            for (AnchorLinkUser anchorLinkUser : list) {
                if (TextUtils.equals(str, anchorLinkUser.LIZLLL)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BaseGuestLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZJ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LIZIZ, false, 30).isSupported) {
            return;
        }
        LIZLLL("leave_on_rtc_error");
        C88440Kt0.LIZ(2131585643);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4773g
    public final void LIZIZ(int i, int i2, String str) {
        if (PatchProxy.proxy(new Object[]{2, 113, str}, this, LIZIZ, false, 81).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        C79046HEa LIZ = C79046HEa.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        Integer num = (Integer) LIZ.LJJIIZI;
        if (num == null) {
            return;
        }
        if (num.intValue() == 0) {
            if (m15738LJ().LIZJ()) {
                LIZ(113);
            } else {
                LIZ(2, 113, str);
            }
        } else if (num.intValue() == 1) {
            if (C78403GvV.LIZIZ.LIZ(LJJIIJZLJL())) {
                if (C77917Gnf.LIZ(LJJIIJZLJL())) {
                    LJIILL();
                } else {
                    LJIILJJIL();
                }
            }
        } else if (num.intValue() == 2) {
            C88440Kt0.LIZ(2131584123);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4773g
    public final void LIZ(int i, int i2, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, this, LIZIZ, false, 55).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        C4418a c4418a = this.LJJJJJ;
        c4418a.f26320LJ = i2;
        c4418a.LIZ("apply");
        if (C78538Gxg.LIZIZ()) {
            LIZJ(i2);
            return;
        }
        BaseGuestLinkWidget.LIZ(this, i, -1, 1, LinkApplyType.NORMAL, str, null, null, null, false, false, 0, null, 4064, null);
        if (TextUtils.equals(str, "video_apply_container_click")) {
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_LINK_GUEST_CLEAN_SCREEN_OPTIMIZE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                C79107HGj.LIZ(LJJJI());
            }
        }
    }

    public final void LIZ(int i, int i2, List<String> list, String str) {
        String str2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), list, str}, this, LIZIZ, false, 69).isSupported) {
            return;
        }
        AbstractC4054j abstractC4054j = this.LJJJIL;
        if (abstractC4054j != null && abstractC4054j.LJIILIIL()) {
            return;
        }
        SettingKey<C6858bo> settingKey = LiveSettingKeys.LINK_PAYMENT_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        String str3 = settingKey.getValue().LIZJ;
        if (!TextUtils.isEmpty(str3)) {
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
            if (list != null) {
                str2 = CollectionsKt___CollectionsKt.joinToString$default(list, "|", null, null, 0, null, null, 62, null);
            } else {
                str2 = null;
            }
            if (String.valueOf(str2).length() > 0) {
                hashMap.put("linkmic_tag", String.valueOf(str2));
            }
            if (str != null && str.length() > 0) {
                hashMap.put("paid_desc", str);
            }
            if (C78538Gxg.LIZ()) {
                hashMap.put("live_anonymous_paid_link_mic", "1");
            }
            String LIZIZ2 = C414642b4.LIZIZ(str3, hashMap);
            ALogger.m15797i("ttlive_link_paid", C0002O.m25086C("applySchema: ", LIZIZ2));
            ((ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class)).handle(this.context, LIZIZ2);
        }
    }
}
