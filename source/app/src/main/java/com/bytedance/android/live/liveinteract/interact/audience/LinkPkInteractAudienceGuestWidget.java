package com.bytedance.android.live.liveinteract.interact.audience;

import android.content.Context;
import android.content.res.Configuration;
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
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.p255g.AbstractC2884d;
import com.bytedance.android.live.broadcastgame.api.C3348d;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.chatroom.model.LinkApplyType;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkControlWidget;
import com.bytedance.android.live.liveinteract.interact.audience.context.C4429e;
import com.bytedance.android.live.liveinteract.interact.audience.context.C4431g;
import com.bytedance.android.live.liveinteract.interact.audience.p359b.C4418a;
import com.bytedance.android.live.liveinteract.interact.audience.p360c.c$a;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext;
import com.bytedance.android.live.liveinteract.plantform.camera.AbstractC4788a;
import com.bytedance.android.live.liveinteract.plantform.camera.AbstractC4789b;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4770d;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4776n;
import com.bytedance.android.live.liveinteract.plantform.permission.model.C4825a;
import com.bytedance.android.live.liveinteract.plantform.permission.model.OperateType;
import com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAdminLinkWidget;
import com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget;
import com.bytedance.android.live.liveinteract.voicechat.p392b.C5001e;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.event.C5984am;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q;
import com.bytedance.android.livesdk.chatroom.model.C6094ae;
import com.bytedance.android.livesdk.chatroom.model.C6095af;
import com.bytedance.android.livesdk.chatroom.model.C6119b;
import com.bytedance.android.livesdk.chatroom.model.interact.C6160b;
import com.bytedance.android.livesdk.chatroom.model.interact.MultiAnchorLinkmicLiveCoreInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.MultiAnchorLinkmicRtcInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.MultiLiveCoreInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.MultiRtcInfo;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.log.p723a.AbstractC8644i;
import com.bytedance.android.livesdk.message.model.C8854es;
import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.android.livesdk.message.model.LinkMicGuideMessage;
import com.bytedance.android.livesdk.message.model.ReplyType;
import com.bytedance.android.livesdk.user.C9284h;
import com.bytedance.android.livesdk.widget.v$a;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.circleinfo.CircleInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.live.datacontext.C13491f;
import com.p1594ss.avframework.livestreamv2.core.ILayerControl;
import com.p1594ss.avframework.livestreamv2.core.LiveCore;
import com.p1594ss.avframework.livestreamv2.core.interact.model.Config;
import com.p1594ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC78050Gpo;
import p003X.AbstractC78986HBs;
import p003X.AbstractC80293Hkt;
import p003X.AnonymousClass479;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2WC;
import p003X.C3VF;
import p003X.C439993ar;
import p003X.C4574547f;
import p003X.C78318Gu8;
import p003X.C78403GvV;
import p003X.C78832H5u;
import p003X.C78834H5w;
import p003X.C78952HAk;
import p003X.C78994HCa;
import p003X.C78996HCc;
import p003X.C79007HCn;
import p003X.C79008HCo;
import p003X.C79046HEa;
import p003X.C79107HGj;
import p003X.C79169HIt;
import p003X.C79241HLn;
import p003X.C79242HLo;
import p003X.C80517HoV;
import p003X.C81173Hz5;
import p003X.C81280I1y;
import p003X.C87308Kak;
import p003X.C88440Kt0;
import p003X.C88469KtT;
import p003X.DialogC77881Gn5;
import p003X.H04;
import p003X.H21;
import p003X.H2G;
import p003X.H7C;
import p003X.HAU;
import p003X.HBR;
import p003X.HCC;
import p003X.HCE;
import p003X.HCG;
import p003X.HCI;
import p003X.HCJ;
import p003X.HCK;
import p003X.HCL;
import p003X.HCM;
import p003X.HCN;
import p003X.HCO;
import p003X.HCP;
import p003X.HCQ;
import p003X.HCS;
import p003X.HCT;
import p003X.HCU;
import p003X.HCV;
import p003X.HD9;
import p003X.HE3;
import p003X.HH8;
import p003X.HHA;
import p003X.HJK;
import p003X.HK5;
import p003X.HTD;
import p003X.HZR;
import p003X.IQV;
import p003X.IQX;
import p003X.LK5;
import p003X.QFD;
import p003X.View$OnClickListenerC78404GvW;

/* loaded from: classes3.dex */
public final class LinkPkInteractAudienceGuestWidget extends BasePkInteractAdminLinkWidget<LinkPlayerInfo> implements c$a, AbstractC4776n, AbstractC4789b, OnMessageListener, OnMessageListener {
    public static ChangeQuickRedirect LIZIZ;
    public C79241HLn LIZJ;
    public AbstractC2884d LIZLLL;

    /* renamed from: LJ */
    public AbstractC2884d f26318LJ;
    public int LJFF;
    public Runnable LJI;
    public boolean LJIIIIZZ;
    public boolean LJJIFFI;
    public boolean LJJII;
    public HJK LJJIII;
    public Room LJJIIJ;
    public C78952HAk LJJIIJZLJL;
    public String LJJIIZI;
    public long LJJIJ;
    public Disposable LJJIJLIJ;
    public long LJJIL;
    public DialogC77881Gn5 LJJIZ;
    public HAU LJJJ;
    public IMessageManager LJJJIL;
    public HD9 LJJJJJL;
    public HK5 LJJJJL;
    public C79008HCo LJJJJLI;
    public long LJJJJLL;
    public final String LJJI = "LinkPkInteractAudienceGuestWidget";
    public final CompositeDisposable LJJIIZ = new CompositeDisposable();
    public final int LJII = 300;
    public Long LJJIJIIJI = 0L;
    public final long LJJIJIIJIL = 180000;
    public final int LJJIJIL = 86400000;
    public final String LJJIJL = "show_bubble_tag_guest";
    public final C4418a LJJJI = new C4418a();
    public boolean LJJJJIZL = true;
    public final HE3 LJJJJJ = new HE3();
    public final Lazy LJJJJZ = LazyKt__LazyJVMKt.lazy(new C4415xc213d153(this));
    public final C5001e.AbstractC5002a LJIIIZ = new HCL(this);
    public final C78318Gu8 LJJJJZI = new C78318Gu8(this);
    public final Observer<AbstractC4256d> LJJJLIIL = new HCJ(this);
    public final Observer<Long> LJJJLL = new HCI(this);

    static {
        Covode.recordClassIndex(27031);
    }

    private final C5001e LJIJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 1);
        return (C5001e) (proxy.isSupported ? proxy.result : this.LJJJJZ.mo27335getValue());
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAdminLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4803o
    public final void LIZ(C8874fl c8874fl) {
        if (PatchProxy.proxy(new Object[]{c8874fl}, this, LIZIZ, false, 71).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8874fl);
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkWidget
    public final int LIZIZ() {
        return 1;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAdminLinkWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4803o
    public final void LIZIZ(C8874fl c8874fl) {
        if (PatchProxy.proxy(new Object[]{c8874fl}, this, LIZIZ, false, 72).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8874fl);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131700420;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAdminLinkWidget, com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 80).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4778p
    public final AbstractC2884d LJIIJJI() {
        return this.LIZLLL;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, p003X.AbstractC78977HBj
    public final void LIZ(C5176i<C6094ae> c5176i) {
        MultiAnchorLinkmicRtcInfo multiAnchorLinkmicRtcInfo;
        Map<Long, String> map;
        HHA hha;
        MultiAnchorLinkmicLiveCoreInfo multiAnchorLinkmicLiveCoreInfo;
        Map<Long, String> map2;
        HHA hha2;
        if (PatchProxy.proxy(new Object[]{c5176i}, this, LIZIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(c5176i);
        super.LIZ(c5176i);
        HAU hau = this.LJJJ;
        if (hau != null) {
            hau.LIZJ = false;
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_PK_WITH_AUDIENCE_CHANGE_RTC_PARAMS;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (!value.booleanValue()) {
            return;
        }
        MultiLiveCoreInfo multiLiveCoreInfo = LinkCrossRoomDataHolder.LJII().LJLILLLLZI;
        if (multiLiveCoreInfo != null && (multiAnchorLinkmicLiveCoreInfo = multiLiveCoreInfo.multiAnchorLiveCoreInfo) != null && (map2 = multiAnchorLinkmicLiveCoreInfo.liveCoreExtInfoMap) != null && (hha2 = this.LJIILLIIL) != null) {
            hha2.LIZ(map2.get(3L));
        }
        MultiRtcInfo multiRtcInfo = LinkCrossRoomDataHolder.LJII().LJLIL;
        if (multiRtcInfo == null || (multiAnchorLinkmicRtcInfo = multiRtcInfo.multiAnchorLinkmicRtcInfo) == null || (map = multiAnchorLinkmicRtcInfo.rtcInfoMap) == null || (hha = this.LJIILLIIL) == null) {
            return;
        }
        hha.LIZIZ(map.get(3L));
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, p003X.AbstractC78977HBj
    public final void LIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZIZ, false, 9).isSupported) {
            return;
        }
        super.LIZ(th);
        C88469KtT.LIZ(this.context, th);
    }

    public final void LIZ(String str) {
        LiveCore liveCore;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 11).isSupported) {
            return;
        }
        LIZLLL().LJIIJ();
        if (LJIL() == 3) {
            HHA hha = this.LJIILLIIL;
            if (hha != null) {
                hha.LIZIZ();
            }
            FragmentActivity fragmentActivity = (FragmentActivity) this.context;
            if (fragmentActivity != null && !fragmentActivity.isFinishing()) {
                this.LJJII = false;
                C79008HCo c79008HCo = this.LJJJJLI;
                if (c79008HCo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                c79008HCo.LIZIZ(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ());
            }
        }
        AbstractC2884d abstractC2884d = this.LIZLLL;
        if (abstractC2884d == null || (liveCore = abstractC2884d.getLiveCore()) == null) {
            return;
        }
        liveCore.startVideoCapture();
    }

    public final void LIZ(String str, boolean z) {
        LiveCore liveCore;
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 13).isSupported) {
            return;
        }
        if (LJIL() == 0) {
            HHA hha = this.LJIILLIIL;
            if (hha != null) {
                hha.LIZJ();
            }
            FragmentActivity fragmentActivity = (FragmentActivity) this.context;
            if (fragmentActivity != null && !fragmentActivity.isFinishing()) {
                this.LJJII = true;
                C79008HCo c79008HCo = this.LJJJJLI;
                if (c79008HCo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                c79008HCo.LIZ(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ(), 1);
            }
        }
        if (!this.LJIIZILJ) {
            LIZLLL().LJIIIZ();
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
        if (PatchProxy.proxy(new Object[]{interactConfig}, this, LIZIZ, false, 17).isSupported) {
            return;
        }
        C79046HEa.LIZ().f6716LJ = SystemClock.currentThreadTimeMillis();
        int i = this.LJII;
        Config.VideoQuality videoQuality2 = new Config.VideoQuality(240, 240, 15, 360);
        if (interactConfig == null || (videoQuality = interactConfig.setVideoQuality(videoQuality2)) == null) {
            return;
        }
        videoQuality.setInteractMode(Config.InteractMode.NORMAL);
        videoQuality.setCharacter(Config.Character.GUEST);
        videoQuality.setVolumeCallbackInterval(i);
        videoQuality.setType(Config.Type.VIDEO);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, TextureView textureView, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, textureView, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 22).isSupported) {
            return;
        }
        super.LIZ(str, textureView, i, i2);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, ILayerControl.ILayer iLayer, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{str, iLayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 23).isSupported) {
            return;
        }
        super.LIZ(str, iLayer, i, i2);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, SurfaceView surfaceView, int i, int i2) {
        HJK hjk;
        HHA hha;
        LiveCore liveCore;
        HHA hha2;
        HHA hha3;
        Boolean bool;
        boolean z = false;
        if (PatchProxy.proxy(new Object[]{str, surfaceView, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 24).isSupported) {
            return;
        }
        super.LIZ(str, surfaceView, i, i2);
        LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        String LIZIZ2 = LJII.LIZIZ();
        if (TextUtils.isEmpty(LIZIZ2)) {
            Object LIZLLL = LIZLLL();
            if (!(LIZLLL instanceof C79241HLn)) {
                LIZLLL = null;
            }
            C79241HLn c79241HLn = (C79241HLn) LIZLLL;
            if (c79241HLn != null) {
                Room room = this.LJJIIJ;
                LIZIZ2 = c79241HLn.LIZIZ(room != null ? room.ownerUserId : 0L);
            } else {
                LIZIZ2 = null;
            }
            LinkCrossRoomDataHolder LJII2 = LinkCrossRoomDataHolder.LJII();
            Intrinsics.checkNotNullExpressionValue(LJII2, "");
            LJII2.LIZIZ(LIZIZ2);
        }
        long j = C79046HEa.LIZ().f6716LJ;
        LinkCrossRoomDataHolder LJII3 = LinkCrossRoomDataHolder.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII3, "");
        if (TextUtils.equals(str, LJII3.LIZIZ()) && j > 0) {
            C79046HEa.LIZ().f6716LJ = 0L;
        }
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null && (bool = (Boolean) dataCenter.get("data_pk_anchor_silence_status_change", (String) Boolean.FALSE)) != null) {
            z = bool.booleanValue();
        }
        Object LIZLLL2 = LIZLLL();
        if (!(LIZLLL2 instanceof C79241HLn)) {
            LIZLLL2 = null;
        }
        C79241HLn c79241HLn2 = (C79241HLn) LIZLLL2;
        if (((c79241HLn2 != null && c79241HLn2.LIZJ(str)) || TextUtils.equals(str, LinkCrossRoomDataHolder.LJII().LJIIIIZZ)) && (hha3 = this.LJIILLIIL) != null) {
            hha3.LIZIZ(str == null ? "" : str, z);
        }
        HJK hjk2 = this.LJJIII;
        if (hjk2 != null) {
            hjk2.LIZ(str == null ? "" : str, surfaceView);
        }
        ALogger.m15797i(this.LJJI, C0002O.m25080C("onFirstRemoteVideoFrame surfaceView audienceLinkMicId = ", LinkCrossRoomDataHolder.LJII().LJIILLIIL, ", interactId = ", str, ", anchorInteractId = ", LIZIZ2, ", isMute = ", Boolean.valueOf(z), ", guestLinkMicId = ", LinkCrossRoomDataHolder.LJII().LJIIIIZZ));
        HJK hjk3 = this.LJJIII;
        if ((hjk3 == null || hjk3.LIZ(0L, LinkCrossRoomDataHolder.LJII().LJIILLIIL) == null) && this.LIZLLL != null && (hjk = this.LJJIII) != null) {
            String str2 = LinkCrossRoomDataHolder.LJII().LJIILLIIL;
            if (str2 == null) {
                str2 = "";
            }
            AbstractC2884d abstractC2884d = this.LIZLLL;
            if (abstractC2884d == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.SurfaceView");
            }
            hjk.LIZ(str2, (SurfaceView) abstractC2884d);
        }
        if (!this.LJJIFFI || (hha = this.LJIILLIIL) == null || !hha.LJI) {
            return;
        }
        if (LJIL() == 0 && (hha2 = this.LJIILLIIL) != null) {
            hha2.LIZJ();
        }
        if (!this.LJIIZILJ) {
            LIZLLL().LJIIIZ();
        }
        AbstractC2884d abstractC2884d2 = this.LIZLLL;
        if (abstractC2884d2 != null && (liveCore = abstractC2884d2.getLiveCore()) != null) {
            liveCore.stopVideoCapture();
        }
        this.LJJIJLIJ = Observable.timer(this.LJJIJIIJIL, TimeUnit.MILLISECONDS).subscribe(new HCM(this));
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String[] strArr, boolean[] zArr, int[] iArr) {
        if (PatchProxy.proxy(new Object[]{strArr, zArr, iArr}, this, LIZIZ, false, 26).isSupported) {
            return;
        }
        super.LIZ(strArr, zArr, iArr);
        this.LJJJJJ.LIZ(strArr, zArr, iArr);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(String str, long j) {
        if (PatchProxy.proxy(new Object[]{str, new Long(j)}, this, LIZIZ, false, 28).isSupported) {
            return;
        }
        super.LIZ(str, j);
        HJK hjk = this.LJJIII;
        if (hjk == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        hjk.LIZIZ(0L, str);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, p003X.AbstractC78977HBj
    public final void LIZ(C6095af c6095af) {
        if (PatchProxy.proxy(new Object[]{c6095af}, this, LIZIZ, false, 29).isSupported) {
            return;
        }
        super.LIZ(c6095af);
        LinkCrossRoomDataHolder.LJII().LJIILLIIL = "";
        if (this.dataCenter != null) {
            this.dataCenter.put("DATA_DISCONNECT_LINK", Boolean.TRUE);
        }
        if (Intrinsics.areEqual(this.LJIJI, "kick_out")) {
            C88440Kt0.LIZ(2131588237);
        } else {
            C88440Kt0.LIZ(2131585491);
        }
        C79007HCn LJII = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        LJII.LJIJI = "";
        this.LJJJJJ.LIZ();
        HK5 hk5 = this.LJJJJL;
        if (hk5 == null) {
            return;
        }
        hk5.dismiss();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4803o
    public final void LIZ(String str, Throwable th) {
        if (PatchProxy.proxy(new Object[]{str, th}, this, LIZIZ, false, 32).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (Intrinsics.areEqual(str, "paid_change")) {
            return;
        }
        C88469KtT.LIZ(getContext(), th, 2131585594);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4803o
    public final void LIZ(C6119b c6119b, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{c6119b, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZIZ, false, 33).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6119b);
        super.LIZ(c6119b, i, i2);
        this.LJJJI.LIZIZ = c6119b.f26877LJ;
        Object obj = this.dataCenter.get("data_link_mic_is_quick_invite", (String) Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        ((Boolean) obj).booleanValue();
        AbstractC78986HBs<T> LIZLLL = LIZLLL();
        String valueOf = String.valueOf((LIZLLL != 0 ? Integer.valueOf(C79242HLo.LIZ((AbstractC78986HBs<LinkPlayerInfo>) LIZLLL)) : null).intValue());
        if (valueOf == null) {
            valueOf = "0";
        }
        C78834H5w.LIZIZ.LIZ(c6119b, this.LJJJI, LJIIZILJ().circleInfo, valueOf);
        if (!C78403GvV.LIZIZ.LIZ(LJIIZILJ()) || c6119b.f26877LJ) {
            return;
        }
        LJIIIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4803o
    public final void LIZJ(Throwable th) {
        AbstractC4774i LIZ;
        if (PatchProxy.proxy(new Object[]{th}, this, LIZIZ, false, 34).isSupported) {
            return;
        }
        super.LIZJ(th);
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("data_link_mic_is_quick_invite", Boolean.FALSE);
        }
        if (th instanceof ApiServerException) {
            ApiServerException apiServerException = (ApiServerException) th;
            if (apiServerException.mErrorCode == 4004090 && (LIZ = AbstractC78050Gpo.LIZ()) != null) {
                LIZ.LJIIL();
            }
            C88440Kt0.LIZ(apiServerException.mPrompt);
            AbstractC78986HBs<T> LIZLLL = LIZLLL();
            String valueOf = String.valueOf((LIZLLL != 0 ? Integer.valueOf(C79242HLo.LIZ((AbstractC78986HBs<LinkPlayerInfo>) LIZLLL)) : null).intValue());
            if (valueOf == null) {
                valueOf = "0";
            }
            C78834H5w.LIZIZ.LIZ(apiServerException, this.LJJJI, LJIIZILJ().circleInfo, valueOf);
            return;
        }
        C88440Kt0.LIZ(2131585441);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4803o
    public final void LIZ(C6160b c6160b, int i) {
        if (PatchProxy.proxy(new Object[]{c6160b, Integer.valueOf(i)}, this, LIZIZ, false, 35).isSupported) {
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

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAdminLinkWidget, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4776n
    public final void LIZ(long j, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str, str2}, this, LIZIZ, false, 41).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        if (str2.length() == 0) {
            str2 = "admin_stop_normal";
        }
        super.LIZ(j, str, str2);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4776n
    public final void LIZ(LinkPlayerInfo linkPlayerInfo) {
        if (PatchProxy.proxy(new Object[]{linkPlayerInfo}, this, LIZIZ, false, 43).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkPlayerInfo);
        User LIZ = linkPlayerInfo.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        if (PatchProxy.proxy(new Object[]{LIZ}, this, BasePkInteractAdminLinkWidget.f26432e_, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(LIZ);
        if (!LJIILL()) {
            return;
        }
        HBR hbr = this.LJIIJJI;
        if (hbr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        hbr.LIZ(LIZ.getId(), LIZ.getSecUid());
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4776n
    public final void LIZ(long j, boolean z) {
        if (PatchProxy.proxy(new Object[]{new Long(j), (byte) 0}, this, LIZIZ, false, 44).isSupported) {
            return;
        }
        C79008HCo c79008HCo = this.LJJJJLI;
        if (c79008HCo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            c79008HCo.LIZ(j);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4803o
    public final void LIZ(LinkMicGuideMessage linkMicGuideMessage) {
        boolean z = false;
        if (PatchProxy.proxy(new Object[]{linkMicGuideMessage}, this, LIZIZ, false, 48).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkMicGuideMessage);
        if (linkMicGuideMessage.LIZJ != 1) {
            return;
        }
        Integer num = (Integer) this.dataCenter.get("data_link_state", (String) 0);
        Intrinsics.checkNotNullExpressionValue(num, "");
        boolean z2 = C79169HIt.LIZIZ(num.intValue(), 2) && LIZLLL().LJIIJJI() == 0;
        long currentTimeMillis = System.currentTimeMillis();
        C87308Kak<Long> c87308Kak = AbstractC80293Hkt.f7105ca;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Long LIZ = c87308Kak.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        if (currentTimeMillis - LIZ.longValue() > this.LJJIJIL) {
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

    public final void LIZ(boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 52).isSupported) {
            return;
        }
        this.LJJJI.LJII = this.LJJJJJ.LIZIZ;
        C78834H5w c78834H5w = C78834H5w.LIZIZ;
        Room room = this.LJJIIJ;
        C4418a c4418a = this.LJJJI;
        long j = this.LJJIJ;
        AbstractC2884d abstractC2884d = this.LIZLLL;
        long cameraDuration = abstractC2884d != null ? abstractC2884d.getCameraDuration() : 0L;
        Long l = this.LJJIJIIJI;
        c78834H5w.LIZ(room, c4418a, j, cameraDuration - (l != null ? l.longValue() : 0L), z);
        if (!z2) {
            this.LJJJJJ.LIZ();
            Long l2 = null;
            if (!TextUtils.isEmpty(LinkCrossRoomDataHolder.LJII().LJIILLIIL)) {
                HE3 he3 = this.LJJJJJ;
                String str = LinkCrossRoomDataHolder.LJII().LJIILLIIL;
                Intrinsics.checkNotNullExpressionValue(str, "");
                HE3.LIZ(he3, str, false, 2, null);
            }
            AbstractC2884d abstractC2884d2 = this.LIZLLL;
            if (abstractC2884d2 != null) {
                l2 = Long.valueOf(abstractC2884d2.getCameraDuration());
            }
            this.LJJIJIIJI = l2;
            this.LJJIJ = System.currentTimeMillis();
            return;
        }
        this.LJJIJIIJI = 0L;
    }

    public final boolean LIZ(Runnable runnable, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{runnable, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 56);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(runnable);
        C79046HEa LIZ = C79046HEa.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        Integer num = (Integer) LIZ.LJJIIZI;
        if (num != null && 2 == num.intValue()) {
            if (AbstractC78050Gpo.LIZ() != null) {
                AbstractC4774i LIZ2 = AbstractC78050Gpo.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                if (LIZ2.LJJIIJ()) {
                    this.LJIIZILJ = true;
                    return false;
                }
            }
            if (this.dataCenter != null) {
                Object obj = this.dataCenter.get("cmd_mic_room_jump", (String) Boolean.FALSE);
                Intrinsics.checkNotNullExpressionValue(obj, "");
                if (((Boolean) obj).booleanValue()) {
                    this.LJIIZILJ = true;
                    return false;
                }
            }
            new v$a(getContext(), 4).LIZLLL(2131585597).LIZIZ(0, 2131586570, new HCK(this, runnable)).LIZIZ(1, 2131582393, HCU.LIZIZ).LIZJ();
            return true;
        }
        C79046HEa LIZ3 = C79046HEa.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
        Integer num2 = (Integer) LIZ3.LJJIIZI;
        if (num2 != null && 1 == num2.intValue()) {
            this.LJIIZILJ = true;
        }
        return false;
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 60).isSupported) {
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
            Room room = this.LJJIIJ;
            if ((room != null ? room.getStreamType() : null) == LiveMode.THIRD_PARTY && num != null && num.intValue() == 0) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                HZR hzr = new HZR(context2);
                hzr.LIZ(LK5.LIZ(2131584287));
                hzr.LIZIZ(LK5.LIZ(2131584284));
                hzr.LIZ(LK5.LIZ(2131584285), HCV.LIZIZ);
                hzr.LIZIZ(LK5.LIZ(2131584286), new HCP(this));
                hzr.LIZ();
                return;
            }
        }
        C78834H5w.LIZIZ.LIZLLL("livesdk_audience_interaction_icon_click");
        this.dataCenter.put("data_link_pk_interact_show_red_dot", Boolean.TRUE);
        C79007HCn.LJII().LJIJJ = "bottom";
        if (num != null && num.intValue() == 0) {
            LIZ(2, C78832H5u.LIZJ, "interact_icon_click");
        } else if (C78403GvV.LIZIZ.LIZ(LJIIZILJ()) && num != null && 1 == num.intValue()) {
            LJIIIZ();
        } else {
            LJJ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4778p
    public final void LIZ(boolean z, List<AnchorLinkUser> list, long j) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), list, new Long(j)}, this, LIZIZ, false, 65).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        HHA hha = this.LJIILLIIL;
        if (hha == null || !hha.LJI) {
            C88440Kt0.LIZ(2131585502);
            return;
        }
        this.LJJII = false;
        HHA hha2 = this.LJIILLIIL;
        if (hha2 != null) {
            HHA.LIZ(hha2, !z ? 1 : 0, null, 2, null);
        }
        LIZLLL().LIZ(list, j, z ? "silence" : "unSilence");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.camera.AbstractC4789b
    public final void LIZ(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, AbstractC4788a abstractC4788a) {
        H7C<Object> LIZIZ2;
        LiveCore liveCore;
        LiveCore.Builder builder;
        LiveCore liveCore2;
        LiveCore.Builder builder2;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Byte.valueOf(z4 ? (byte) 1 : (byte) 0), Byte.valueOf(z5 ? (byte) 1 : (byte) 0), Byte.valueOf(z6 ? (byte) 1 : (byte) 0), abstractC4788a}, this, LIZIZ, false, 68).isSupported) {
            return;
        }
        if (z && z2) {
            AbstractC2884d abstractC2884d = this.LIZLLL;
            if (abstractC2884d != null && (liveCore2 = abstractC2884d.getLiveCore()) != null && (builder2 = liveCore2.getBuilder()) != null && builder2.getVideoCaptureDevice() == 1) {
                this.LJFF = 2;
            } else {
                AbstractC2884d abstractC2884d2 = this.LIZLLL;
                if (abstractC2884d2 != null && (liveCore = abstractC2884d2.getLiveCore()) != null && (builder = liveCore.getBuilder()) != null && builder.getVideoCaptureDevice() == 2) {
                    this.LJFF = 1;
                }
            }
            if (abstractC4788a != null) {
                abstractC4788a.LIZ();
            }
            AbstractC2884d abstractC2884d3 = this.LIZLLL;
            if (abstractC2884d3 == null) {
                return;
            }
            abstractC2884d3.LIZ(z, z2);
            return;
        }
        if (!z4) {
            C78834H5w.LIZIZ.LIZ(this.LJJJI, LJFF());
        }
        int i = z ? 1 : 2;
        Context context = this.context;
        if (context == null) {
            context = LK5.LJIIJ();
        }
        Intrinsics.checkNotNullExpressionValue(context, "");
        C4825a c4825a = new C4825a(context, 1, OperateType.APPLY, i, LJIIZILJ(), 0L, null, null, 224);
        c4825a.LJFF = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ();
        if (z3) {
            LIZIZ2 = C80517HoV.LIZ(false, 1, null);
        } else {
            LIZIZ2 = C80517HoV.LIZIZ();
        }
        LIZIZ2.LIZ(c4825a, new HCG(this, abstractC4788a, z5, z, z2, z4));
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4778p
    public final AbstractC2884d LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 66);
        if (proxy.isSupported) {
            return (AbstractC2884d) proxy.result;
        }
        LIZJ();
        return this.f26318LJ;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4804q
    public final void LJIJ() {
        HHA hha;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 73).isSupported && this.LJJIFFI && (hha = this.LJIILLIIL) != null) {
            HHA.LIZ(hha, false, null, 2, null);
        }
    }

    private int LJIL() {
        LinkPlayerInfo LIZIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C79241HLn c79241HLn = this.LIZJ;
        if (c79241HLn == null || (LIZIZ2 = c79241HLn.LIZIZ(C79242HLo.LIZ(), LinkCrossRoomDataHolder.LJII().LJIILLIIL)) == null) {
            return 0;
        }
        return LIZIZ2.LJIIL;
    }

    private void LJJ() {
        Context context;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 5).isSupported && (context = getContext()) != null && this.dataCenter != null) {
            H2G h2g = H21.LJIJI;
            DataCenter dataCenter = this.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter, "");
            C116971W2r.LIZJ(H2G.LIZ(h2g, context, dataCenter, true, "seat", false, 16, null));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4778p
    public final AbstractC78986HBs<LinkPlayerInfo> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 39);
        if (proxy.isSupported) {
            return (AbstractC78986HBs) proxy.result;
        }
        if (this.LIZJ == null) {
            Room LJIIZILJ = LJIIZILJ();
            DataCenter dataCenter = this.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter, "");
            this.LIZJ = new C79241HLn(LJIIZILJ, dataCenter, 4);
        }
        C79241HLn c79241HLn = this.LIZJ;
        if (c79241HLn != null) {
            return c79241HLn;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.plantform.base.ILinkUserInfoCenter<com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo>");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4776n
    /* renamed from: LJ */
    public final HBR mo15714LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 40);
        if (proxy.isSupported) {
            return (HBR) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, BasePkInteractAdminLinkWidget.f26432e_, false, 1);
        if (proxy2.isSupported) {
            return (HBR) proxy2.result;
        }
        HBR hbr = this.LJIIJJI;
        if (hbr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return hbr;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.camera.AbstractC4789b
    public final boolean LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 70);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC2884d abstractC2884d = this.LIZLLL;
        if (abstractC2884d == null) {
            return false;
        }
        return abstractC2884d.LIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget
    public final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 55).isSupported) {
            return;
        }
        super.LJIIIIZZ();
        HJK hjk = this.LJJIII;
        if (hjk != null) {
            hjk.LIZIZ(true);
        }
        this.LJJJJIZL = true;
        Runnable runnable = this.LJI;
        if (runnable != null) {
            runnable.run();
        }
        this.LJI = null;
    }

    public final void LJIIIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 61).isSupported) {
            return;
        }
        DialogC77881Gn5 dialogC77881Gn5 = this.LJJIZ;
        if (dialogC77881Gn5 != null && dialogC77881Gn5.isShowing()) {
            return;
        }
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        this.LJJIZ = new DialogC77881Gn5(context, dataCenter);
        DialogC77881Gn5 dialogC77881Gn52 = this.LJJIZ;
        if (dialogC77881Gn52 != null) {
            C116971W2r.LIZJ(dialogC77881Gn52);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4778p
    public final boolean LJIIJ() {
        LiveCore liveCore;
        LiveCore.Builder builder;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 64);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC2884d abstractC2884d = this.LIZLLL;
        if (abstractC2884d == null || (liveCore = abstractC2884d.getLiveCore()) == null || (builder = liveCore.getBuilder()) == null || builder.getVideoCaptureDevice() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final void onStop() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 15).isSupported) {
            return;
        }
        super.onStop();
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_PK_INTERACT_AUDIENCE_PERMISSION_GUARANTOR_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            LJIJI().LIZJ();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LinkPkInteractAudienceGuestWidget() {
        /*
            r2 = this;
            com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder r1 = com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder.LJII()
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            r2.<init>(r1)
            java.lang.String r0 = "LinkPkInteractAudienceGuestWidget"
            r2.LJJI = r0
            io.reactivex.disposables.CompositeDisposable r0 = new io.reactivex.disposables.CompositeDisposable
            r0.<init>()
            r2.LJJIIZ = r0
            r0 = 300(0x12c, float:4.2E-43)
            r2.LJII = r0
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.LJJIJIIJI = r0
            r0 = 180000(0x2bf20, double:8.8932E-319)
            r2.LJJIJIIJIL = r0
            r0 = 86400000(0x5265c00, float:7.82218E-36)
            r2.LJJIJIL = r0
            java.lang.String r0 = "show_bubble_tag_guest"
            r2.LJJIJL = r0
            com.bytedance.android.live.liveinteract.interact.audience.b.a r0 = new com.bytedance.android.live.liveinteract.interact.audience.b.a
            r0.<init>()
            r2.LJJJI = r0
            r0 = 1
            r2.LJJJJIZL = r0
            X.HE3 r0 = new X.HE3
            r0.<init>()
            r2.LJJJJJ = r0
            com.bytedance.android.live.liveinteract.interact.audience.LinkPkInteractAudienceGuestWidget$mInteractLiveCorePermissionGuarantor$2 r0 = new com.bytedance.android.live.liveinteract.interact.audience.LinkPkInteractAudienceGuestWidget$mInteractLiveCorePermissionGuarantor$2
            r0.<init>(r2)
            kotlin.Lazy r0 = kotlin.LazyKt__LazyJVMKt.lazy(r0)
            r2.LJJJJZ = r0
            X.HCL r0 = new X.HCL
            r0.<init>(r2)
            r2.LJIIIZ = r0
            X.Gu8 r0 = new X.Gu8
            r0.<init>(r2)
            r2.LJJJJZI = r0
            X.HCJ r0 = new X.HCJ
            r0.<init>(r2)
            r2.LJJJLIIL = r0
            X.HCI r0 = new X.HCI
            r0.<init>(r2)
            r2.LJJJLL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.interact.audience.LinkPkInteractAudienceGuestWidget.<init>():void");
    }

    public final AbstractC6070q LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 19);
        if (proxy.isSupported) {
            return (AbstractC6070q) proxy.result;
        }
        this.f26318LJ = null;
        HCC hcc = new HCC();
        hcc.LIZ = false;
        IBroadcastService iBroadcastService = (IBroadcastService) ServiceManager.getService(IBroadcastService.class);
        Context context = this.context;
        String str = this.LJJIIZI;
        if (str == null) {
            str = "";
        }
        this.f26318LJ = iBroadcastService.createLinkVideoView(context, hcc, str);
        AbstractC2884d abstractC2884d = this.f26318LJ;
        if (abstractC2884d != null) {
            return abstractC2884d;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.interact.LiveVideoClientFactory");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4778p
    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 53).isSupported) {
            return;
        }
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        H04 h04 = new H04(context);
        h04.LIZ(LK5.LIZ(2131584079));
        String LIZ = LK5.LIZ(2131582651);
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        H04 LIZIZ2 = h04.LIZIZ(LIZ, new HCQ(this));
        String LIZ2 = LK5.LIZ(2131582393);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        LIZIZ2.LIZ(LIZ2, HCS.LIZIZ).LIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4778p
    public final void LJII() {
        User user;
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 54).isSupported) {
            return;
        }
        Room room = this.LJJIIJ;
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
        H04 LIZIZ2 = h04.LIZIZ(LIZ, new HCO(this));
        String LIZ2 = LK5.LIZ(2131582393);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        LIZIZ2.LIZ(LIZ2, HCT.LIZIZ).LIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: W_ */
    public final void mo15659W_() {
        C2WC<Integer> LJFF;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 25).isSupported) {
            return;
        }
        super.mo15659W_();
        PkDataContext LIZ = HTD.LIZIZ.LIZ();
        if (LIZ != null && (LJFF = LIZ.LJFF()) != null) {
            LJFF.LIZ(2);
        }
        LinkControlWidget.LJJIIZ();
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("data_interact_debug_info", new HCE(false, null));
        }
        this.LIZLLL = null;
        C78996HCc c78996HCc = this.LJIILJJIL;
        if (c78996HCc != null) {
            c78996HCc.LIZ(false);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 10).isSupported) {
            return;
        }
        super.onResume();
        this.LJJIFFI = false;
        Disposable disposable = this.LJJIJLIJ;
        if (disposable != null) {
            disposable.dispose();
        }
        HHA hha = this.LJIILLIIL;
        if (hha != null && hha.LJI) {
            SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_PK_INTERACT_AUDIENCE_PERMISSION_GUARANTOR_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                LJIJI().LIZ();
            }
            SettingKey<Boolean> settingKey2 = LiveSettingKeys.LIVE_PK_INTERACT_AUDIENCE_PERMISSION_GUARANTOR_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            if (!settingKey2.getValue().booleanValue() || (!LJIJI().LJIIIIZZ && !LJIJI().f26479LJ)) {
                LIZ("resume");
            }
            this.dataCenter.put("cmd_interact_state_change", new C5984am(3));
        }
    }

    private final void LJIJJ() {
        Map<String, Object> emptyMap;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 3).isSupported) {
            return;
        }
        C79241HLn c79241HLn = this.LIZJ;
        if (c79241HLn != null) {
            c79241HLn.LIZ(LinkCrossRoomDataHolder.LJII().LJLJL);
        }
        HHA hha = this.LJIILLIIL;
        if (hha == null || (emptyMap = hha.LJIILLIIL) == null) {
            emptyMap = MapsKt__MapsKt.emptyMap();
        }
        String str = this.LJJI;
        ALogger.m15797i(str, "updateFirstVideoFrame linkerContentMap = " + LinkCrossRoomDataHolder.LJII().LJLJL + ", remoteView = " + emptyMap.size() + ", audienceLinkMicId = " + LinkCrossRoomDataHolder.LJII().LJIILLIIL);
        for (Map.Entry<String, Object> entry : emptyMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!TextUtils.equals(key, LinkCrossRoomDataHolder.LJII().LJIILLIIL)) {
                if (value instanceof SurfaceView) {
                    LIZ(key, (SurfaceView) value, 0, 0);
                } else if (value instanceof TextureView) {
                    LIZ(key, (TextureView) value, 0, 0);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onPause() {
        int i;
        boolean z;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 12).isSupported) {
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
        if (C79169HIt.LIZIZ(i, 4) && z) {
            this.LJJIFFI = true;
            HHA hha = this.LJIILLIIL;
            if (hha != null && hha.LJI) {
                SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_PK_INTERACT_AUDIENCE_PERMISSION_GUARANTOR_ENABLE;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue()) {
                    LJIJI().LIZIZ();
                }
                SettingKey<Boolean> settingKey2 = LiveSettingKeys.LIVE_PK_INTERACT_AUDIENCE_PERMISSION_GUARANTOR_ENABLE;
                Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                if ((!settingKey2.getValue().booleanValue() || !LJIJI().LJIIIIZZ) && !PatchProxy.proxy(new Object[]{this, "pause", (byte) 0, 2, null}, null, LIZIZ, true, 14).isSupported) {
                    LIZ("pause", false);
                }
                this.LJJIJLIJ = Observable.timer(this.LJJIJIIJIL, TimeUnit.MILLISECONDS).subscribe(new HCN(this));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    /* renamed from: V_ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo15660V_() {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.interact.audience.LinkPkInteractAudienceGuestWidget.mo15660V_():void");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAdminLinkWidget, com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        boolean z;
        String str;
        String str2;
        CircleInfo circleInfo;
        HK5 hk5;
        HHA hha;
        C5923dp LJJJI;
        C2WC<Boolean> LLJZ;
        long j;
        LiveData<Long> liveData;
        LiveData<AbstractC4256d> liveData2;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 16).isSupported) {
            return;
        }
        PkDataContext LIZ = HTD.LIZIZ.LIZ();
        if (LIZ != null && (liveData2 = LIZ.LJIIIZ) != null) {
            liveData2.removeObserver(this.LJJJLIIL);
        }
        PkDataContext LIZ2 = HTD.LIZIZ.LIZ();
        if (LIZ2 != null && (liveData = LIZ2.LJIIJJI) != null) {
            liveData.removeObserver(this.LJJJLL);
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_PK_INTERACT_AUDIENCE_PERMISSION_GUARANTOR_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            LJIJI().LIZLLL();
        }
        AbstractC4774i LIZ3 = AbstractC78050Gpo.LIZ();
        if (LIZ3 != null && C79169HIt.LIZIZ(LIZ3.LJJIFFI(), 2) && !this.LJIIZILJ) {
            z = true;
        } else {
            z = false;
        }
        HHA hha2 = this.LJIILLIIL;
        if (hha2 != null && hha2.LJI && !z) {
            DataCenter dataCenter = this.dataCenter;
            if (dataCenter != null) {
                dataCenter.put("data_link_mic_is_quick_invite", Boolean.FALSE);
            }
            this.LJJJI.LJII = this.LJJJJJ.LIZIZ;
            C78996HCc c78996HCc = this.LJIILJJIL;
            String str3 = "live_end";
            if ((c78996HCc == null || !c78996HCc.LJIIIZ) && ((LJJJI = LJJJI()) == null || (LLJZ = LJJJI.LLJZ()) == null || !LLJZ.LIZ().booleanValue())) {
                str3 = "leave_normally";
            }
            C78834H5w c78834H5w = C78834H5w.LIZIZ;
            Room room = this.LJJIIJ;
            C4418a c4418a = this.LJJJI;
            long j2 = this.LJJIJ;
            AbstractC2884d abstractC2884d = this.LIZLLL;
            if (abstractC2884d != null) {
                j = abstractC2884d.getCameraDuration();
            } else {
                j = 0;
            }
            c78834H5w.LIZ(room, str3, c4418a, j2, j);
        }
        HHA hha3 = this.LJIILLIIL;
        if (hha3 != null && hha3.LJI && (hha = this.LJIILLIIL) != null) {
            hha.LJII();
        }
        C79008HCo c79008HCo = this.LJJJJLI;
        if (c79008HCo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            c79008HCo.LIZJ();
        }
        HD9 hd9 = this.LJJJJJL;
        CircleInfo circleInfo2 = null;
        if (hd9 != null) {
            HD9.LIZ(hd9, 0, 1, null);
        }
        HAU hau = this.LJJJ;
        if (hau != null) {
            hau.LIZLLL();
        }
        IMessageManager iMessageManager = this.LJJJIL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 58).isSupported && (hk5 = this.LJJJJL) != null) {
            if (hk5.LJIILIIL()) {
                hk5.dismiss();
            }
            this.LJJJJL = null;
        }
        super.onDestroy();
        C78834H5w c78834H5w2 = C78834H5w.LIZIZ;
        long j3 = this.LJJIL;
        Room room2 = this.LJJIIJ;
        if (room2 != null && (circleInfo = room2.circleInfo) != null) {
            circleInfo2 = circleInfo;
        }
        long j4 = this.LJJJJLL;
        if (!PatchProxy.proxy(new Object[]{new Long(j3), circleInfo2, new Long(j4)}, c78834H5w2, C78834H5w.LIZ, false, 20).isSupported) {
            HashMap<String, String> LIZ4 = c78834H5w2.LIZ(j3, circleInfo2);
            if (!c78834H5w2.m23786LJ()) {
                str = "";
            } else {
                str = String.valueOf(j4);
            }
            LIZ4.put("pk_id", str);
            if (c78834H5w2.m23786LJ()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            LIZ4.put("is_in_pk", str2);
            C4574547f.LIZ().LIZ("livesdk_voice_room_watch_duration", LIZ4, Room.class, C8668v.class, C3348d.class);
        }
        this.LJIIZILJ = false;
        CompositeDisposable compositeDisposable = this.LJJIIZ;
        if (compositeDisposable != null) {
            compositeDisposable.dispose();
        }
        if (!z) {
            AbstractC2884d abstractC2884d2 = this.LIZLLL;
            if (abstractC2884d2 != null) {
                abstractC2884d2.LJFF();
            }
            C79046HEa LIZ5 = C79046HEa.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ5, "");
            Integer num = (Integer) LIZ5.LJJIIZI;
            if (num == null || num.intValue() != 0) {
                LJIIIIZZ();
            }
        }
        DataCenter dataCenter2 = this.dataCenter;
        if (dataCenter2 != null) {
            dataCenter2.put("data_interact_audience_video_translation", Boolean.FALSE);
        }
        this.dataCenter.put("data_pk_anchor_silence_status_change", Boolean.FALSE);
        C79007HCn.LJII().LIZ(Boolean.FALSE);
        HJK hjk = this.LJJIII;
        if (hjk != null) {
            hjk.LIZ();
        }
        this.LJJJJJ.LIZ();
        Disposable disposable = this.LJJIJLIJ;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractAdminLinkWidget, com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        long j;
        IMessageManager iMessageManager;
        Long l;
        AbstractC6070q abstractC6070q;
        Map<String, Object> map;
        boolean z;
        HHA hha;
        C3VF user;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 2).isSupported) {
            return;
        }
        super.onCreate();
        this.LJJIL = System.currentTimeMillis();
        LJIILLIIL().LIZJ(1);
        this.LJJIIJ = (Room) this.dataCenter.get("data_room");
        C78834H5w.LIZIZ.LIZLLL();
        LIZLLL().LIZ(this.LJJJJZI);
        Room room = this.LJJIIJ;
        View view = this.contentView;
        if (view != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            C79241HLn c79241HLn = this.LIZJ;
            Context context = this.context;
            if (context != null) {
                View findViewById = this.contentView.findViewById(2131197173);
                Intrinsics.checkNotNullExpressionValue(findViewById, "");
                this.LJJIII = new HJK(room, false, frameLayout, c79241HLn, (FragmentActivity) context, this, findViewById);
                HJK hjk = this.LJJIII;
                if (hjk != null) {
                    hjk.LIZ(this.dataCenter);
                }
                HJK hjk2 = this.LJJIII;
                if (hjk2 != null) {
                    hjk2.LJFF = new View$OnClickListenerC78404GvW(this);
                }
                HJK hjk3 = this.LJJIII;
                if (hjk3 != null) {
                    hjk3.LIZ(true);
                }
                C4418a c4418a = this.LJJJI;
                Room room2 = this.LJJIIJ;
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
                this.LJJJ = new HAU(context2, dataCenter, LIZLLL(), this);
                HAU hau = this.LJJJ;
                if (hau != null) {
                    hau.LIZJ();
                }
                Room room3 = this.LJJIIJ;
                if (room3 != null) {
                    room3.getId();
                }
                HJK hjk4 = this.LJJIII;
                if (hjk4 != null) {
                    hjk4.LJIILIIL = this.LJIILLIIL;
                }
                Pair LIZ = IQV.LIZ((Function0) LinkPkInteractAudienceGuestWidget$onCreate$dataPair$1.INSTANCE);
                IQX.LIZ((C13491f) LIZ.getFirst(), "linkpk_interact_guest_service");
                ((C4431g) LIZ.getFirst()).LIZ().LIZIZ(this);
                this.LJJIIZ.add((Disposable) LIZ.getSecond());
                Pair LIZ2 = IQV.LIZ((Function0) LinkPkInteractAudienceGuestWidget$onCreate$dataPair2$1.INSTANCE);
                IQX.LIZ((C13491f) LIZ2.getFirst(), "linkpk_interact_admin_service");
                ((C4429e) LIZ2.getFirst()).LIZ().LIZIZ(this);
                this.LJJIIZ.add((Disposable) LIZ2.getSecond());
                DataCenter dataCenter2 = this.dataCenter;
                if (dataCenter2 != null) {
                    iMessageManager = (IMessageManager) dataCenter2.get("data_message_manager");
                } else {
                    iMessageManager = null;
                }
                this.LJJJIL = iMessageManager;
                IMessageManager iMessageManager2 = this.LJJJIL;
                if (iMessageManager2 != null) {
                    this.LJJIIZ.add((Disposable) IQV.LIZ((Function0) new LinkPkInteractAudienceGuestWidget$onCreate$2$1(iMessageManager2)).getSecond());
                }
                IMessageManager iMessageManager3 = this.LJJJIL;
                if (iMessageManager3 != null) {
                    iMessageManager3.addMessageListener(MessageType.LINK_MIC_GUIDE_MESSAGE.LIZ(), this);
                }
                IMessageManager iMessageManager4 = this.LJJJIL;
                if (iMessageManager4 != null) {
                    iMessageManager4.addMessageListener(MessageType.LINK_MIC_SIGNAL.LIZ(), this);
                }
                IMessageManager iMessageManager5 = this.LJJJIL;
                if (iMessageManager5 != null) {
                    iMessageManager5.addMessageListener(MessageType.LINKER.LIZ(), this);
                }
                IMessageManager iMessageManager6 = this.LJJJIL;
                if (iMessageManager6 != null) {
                    iMessageManager6.addMessageListener(MessageType.LINK_MIC_DYNAMIC_EMOJI_MESSAGE.LIZ(), this);
                }
                this.LJJJJLI = new C79008HCo(LJIIZILJ(), false, this.dataCenter);
                C79008HCo c79008HCo = this.LJJJJLI;
                if (c79008HCo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                c79008HCo.LIZ((c$a) this);
                C79046HEa.LIZ().LIZ((Integer) 0);
                C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.LLLLZIL;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                if (!c87308Kak.LIZ().booleanValue()) {
                    C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.LLLLZIL;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                    c87308Kak2.LIZ(Boolean.TRUE);
                }
                IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
                if (iUserService != null && (user = iUserService.user()) != null) {
                    l = Long.valueOf(user.LIZIZ());
                } else {
                    l = null;
                }
                String str = this.LJJIJL + l;
                C87308Kak<Map<String, Boolean>> c87308Kak3 = AbstractC80293Hkt.LJIILLIIL;
                Intrinsics.checkNotNullExpressionValue(c87308Kak3, "");
                Boolean bool = c87308Kak3.LIZ().get(str);
                if (bool == null || !bool.booleanValue()) {
                    this.dataCenter.put("data_link_pk_interact_show_red_dot", Boolean.FALSE);
                    C87308Kak<Map<String, Boolean>> c87308Kak4 = AbstractC80293Hkt.LJIILLIIL;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak4, "");
                    Map<String, Boolean> LIZ3 = c87308Kak4.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                    LIZ3.put(str, Boolean.TRUE);
                }
                HJK hjk5 = this.LJJIII;
                if (hjk5 != null) {
                    if (this.LJIILLIIL == null || ((hha = this.LJIILLIIL) != null && !hha.LJI)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hjk5.LIZIZ(z);
                }
                HHA hha2 = this.LJIILLIIL;
                if (hha2 != null && hha2.LJI) {
                    AbstractC4770d LIZ4 = AbstractC4770d.LIZ.LIZ();
                    if (LIZ4 != null) {
                        abstractC6070q = LIZ4.LJIJJ();
                    } else {
                        abstractC6070q = null;
                    }
                    if (!(abstractC6070q instanceof AbstractC2884d)) {
                        abstractC6070q = null;
                    }
                    this.LIZLLL = (AbstractC2884d) abstractC6070q;
                    HHA hha3 = this.LJIILLIIL;
                    if (hha3 != null && (map = hha3.LJIILLIIL) != null) {
                        String str2 = LinkCrossRoomDataHolder.LJII().LJIILLIIL;
                        Intrinsics.checkNotNullExpressionValue(str2, "");
                        AbstractC2884d abstractC2884d = this.LIZLLL;
                        if (abstractC2884d != null) {
                            map.put(str2, abstractC2884d);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.SurfaceView");
                        }
                    }
                    DataCenter dataCenter3 = this.dataCenter;
                    if (dataCenter3 != null) {
                        dataCenter3.put("cmd_what_audience_self_join", Boolean.TRUE);
                    }
                    C79046HEa.LIZ().LIZ((Integer) 2);
                    this.LJJJJIZL = false;
                }
                if (LinkCrossRoomDataHolder.LJII().LJLJL != null) {
                    LJIJJ();
                }
                HHA hha4 = this.LJIILLIIL;
                if ((hha4 == null || !hha4.LJI) && !PatchProxy.proxy(new Object[0], this, LIZIZ, false, 6).isSupported) {
                    AbstractC8644i LIZ5 = C4574547f.LIZ().LIZ(C8668v.class);
                    if ((LIZ5 instanceof C81173Hz5) && TextUtils.equals(((C81173Hz5) LIZ5).LJIIIZ, "true")) {
                        C4418a c4418a2 = this.LJJJI;
                        c4418a2.f26320LJ = 107;
                        c4418a2.LIZ("invite_mutual");
                        BasePkInteractGuestWidget.LIZ(this, 2, -1, 16, LinkApplyType.STRONG_REACH, "auto_apply_remind", null, null, null, 224, null);
                    }
                }
                this.LJJJJJL = new HD9(LIZLLL());
                this.LJJJJLL = LinkCrossRoomDataHolder.LJII().f26249LJ;
                SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_PK_INTERACT_AUDIENCE_PERMISSION_GUARANTOR_ENABLE;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue() && (getContext() instanceof FragmentActivity)) {
                    C5001e LJIJI = LJIJI();
                    Context context3 = getContext();
                    if (context3 != null) {
                        LJIJI.LIZ((FragmentActivity) context3);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4803o
    /* renamed from: LJ */
    public final void mo15696LJ(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LIZIZ, false, 46).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        super.mo15696LJ(c8854es);
    }

    @Override // com.bytedance.android.live.liveinteract.interact.audience.p360c.c$a
    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 79).isSupported || !isViewValid()) {
            return;
        }
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i == 3) {
                    HHA hha = this.LJIILLIIL;
                    if (hha != null) {
                        HHA.LIZ(hha, false, null, 2, null);
                    }
                    C79241HLn c79241HLn = this.LIZJ;
                    if (c79241HLn != null) {
                        c79241HLn.LIZ(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ(), LinkCrossRoomDataHolder.LJII().LJIILLIIL, 3);
                        return;
                    }
                    return;
                }
                return;
            }
            HHA hha2 = this.LJIILLIIL;
            if (hha2 != null) {
                HHA.LIZ(hha2, false, null, 2, null);
            }
            C88440Kt0.LIZ(2131585611);
            if (this.LJJIFFI) {
                HH8.LJI();
                this.dataCenter.put("data_talk_room_capture_audio_notification_show_state", Boolean.FALSE);
                return;
            }
            return;
        }
        HHA hha3 = this.LJIILLIIL;
        if (hha3 != null) {
            HHA.LIZ(hha3, true, null, 2, null);
        }
        C88440Kt0.LIZ(2131585645);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget
    public final AbstractC6070q LIZIZ(String str) {
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 18);
        if (proxy.isSupported) {
            return (AbstractC6070q) proxy.result;
        }
        if (!TextUtils.isEmpty(str)) {
            this.LJJIIZI = str;
        }
        if (this.LIZLLL == null) {
            this.LJJJI.LJI = C79046HEa.LIZ().LJI;
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

    /* renamed from: LJ */
    public final void m15736LJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 57).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        HJK hjk = this.LJJIII;
        if (hjk != null) {
            hjk.LIZ(str);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final void onConfigurationChanged(Configuration configuration) {
        HJK hjk;
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{configuration}, this, LIZIZ, false, 8).isSupported) {
            return;
        }
        super.onConfigurationChanged(configuration);
        if (configuration != null && (hjk = this.LJJIII) != null && !PatchProxy.proxy(new Object[]{configuration}, hjk, HJK.LIZ, false, 19).isSupported) {
            C106862S5w.LIZ(configuration);
            if (configuration.orientation != -1 ? AnonymousClass479.LIZLLL(configuration.orientation) : AnonymousClass479.LIZJ()) {
                z = false;
            }
            hjk.LJIIIIZZ = z;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.interact.audience.p360c.c$a
    public final void LIZIZ(long j) {
        if (!PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZIZ, false, 76).isSupported && j == ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ()) {
            HHA hha = this.LJIILLIIL;
            if (hha != null) {
                HHA.LIZ(hha, false, null, 2, null);
            }
            if (!this.LJJII) {
                C88440Kt0.LIZ(LK5.LIZ(2131588249));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.interact.audience.p360c.c$a
    public final void LIZJ(long j) {
        if (!PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZIZ, false, 78).isSupported && j == ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ()) {
            HHA hha = this.LJIILLIIL;
            if (hha != null) {
                HHA.LIZ(hha, true, null, 2, null);
            }
            if (!this.LJJII) {
                C88440Kt0.LIZ(LK5.LIZ(2131588256));
            }
            this.LJJII = false;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4803o
    public final void LIZLLL(C8854es c8854es) {
        FragmentManager fragmentManager;
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LIZIZ, false, 38).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        super.LIZLLL(c8854es);
        HK5 hk5 = this.LJJJJL;
        if (hk5 != null && hk5.LJIILIIL()) {
            return;
        }
        if (c8854es.LJJLIIIJL != null) {
            this.LJJJI.LIZ("gift_message_invite");
            this.LJJJI.LJIIIZ = c8854es.LJJLIIIJL;
        } else {
            this.LJJJI.LIZ("invite");
        }
        this.LJJJI.LIZLLL = c8854es.LJJI;
        C78952HAk c78952HAk = this.LJJIIJZLJL;
        if (c78952HAk != null && c78952HAk.LJIILIIL()) {
            c78952HAk.dismiss();
        }
        C78834H5w.LIZIZ.LIZ(c8854es.LJJLIIIJL);
        this.LJJIIJZLJL = C78952HAk.LJIIIIZZ.LIZ(LJIIZILJ(), c8854es);
        C78952HAk c78952HAk2 = this.LJJIIJZLJL;
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

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, p003X.AbstractC78977HBj
    public final void LIZIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZIZ, false, 30).isSupported) {
            return;
        }
        super.LIZIZ(th);
        C88469KtT.LIZ(getContext(), th, 2131585599);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget
    public final void LIZLLL(String str) {
        long j;
        LiveData<Long> liveData;
        LiveData<AbstractC4256d> liveData2;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 51).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (this.LJJJJIZL) {
            return;
        }
        PkDataContext LIZ = HTD.LIZIZ.LIZ();
        if (LIZ != null && (liveData2 = LIZ.LJIIIZ) != null) {
            liveData2.removeObserver(this.LJJJLIIL);
        }
        PkDataContext LIZ2 = HTD.LIZIZ.LIZ();
        if (LIZ2 != null && (liveData = LIZ2.LJIIJJI) != null) {
            liveData.removeObserver(this.LJJJLL);
        }
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("data_link_mic_is_quick_invite", Boolean.FALSE);
        }
        this.LJJJI.LJII = this.LJJJJJ.LIZIZ;
        C78834H5w c78834H5w = C78834H5w.LIZIZ;
        Room room = this.LJJIIJ;
        C4418a c4418a = this.LJJJI;
        long j2 = this.LJJIJ;
        AbstractC2884d abstractC2884d = this.LIZLLL;
        if (abstractC2884d != null) {
            j = abstractC2884d.getCameraDuration();
        } else {
            j = 0;
        }
        c78834H5w.LIZ(room, str, c4418a, j2, j);
        LIZ(Intrinsics.areEqual(HTD.LIZIZ.LIZIZ(), AbstractC4256d.C4260d.LIZIZ), true);
        super.LIZLLL(str);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4803o
    public final void LIZJ(C8854es c8854es) {
        if (PatchProxy.proxy(new Object[]{c8854es}, this, LIZIZ, false, 37).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8854es);
        C79046HEa.LIZ().LJI = c8854es.LJJJJZ;
        super.LIZJ(c8854es);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4803o
    public final void LIZLLL(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZIZ, false, 36).isSupported) {
            return;
        }
        super.LIZLLL(th);
        if (isViewValid()) {
            C88469KtT.LIZ(this.context, th);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4803o
    public final void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 31).isSupported) {
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

    /* JADX WARN: Code restructure failed: missing block: B:158:0x02af, code lost:
        if (r3 != 0) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x039a, code lost:
        if (r1 != 0) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0176, code lost:
        if (r5 != 0) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017f  */
    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMessage(com.p1594ss.ugc.live.sdk.message.data.IMessage r26) {
        /*
            Method dump skipped, instructions count: 1407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.interact.audience.LinkPkInteractAudienceGuestWidget.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LIZIZ, false, 21).isSupported) {
            return;
        }
        super.LIZ(j, exc);
        C88440Kt0.LIZ(2131585641);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4776n
    public final void LIZIZ(long j, boolean z) {
        if (PatchProxy.proxy(new Object[]{new Long(j), (byte) 0}, this, LIZIZ, false, 45).isSupported) {
            return;
        }
        C79008HCo c79008HCo = this.LJJJJLI;
        if (c79008HCo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            c79008HCo.LIZIZ(j);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget, com.bytedance.android.live.liveinteract.plantform.core.AbstractC4805r
    public final void LIZJ(long j, Exception exc) {
        if (PatchProxy.proxy(new Object[]{new Long(j), exc}, this, LIZIZ, false, 27).isSupported) {
            return;
        }
        LIZLLL("leave_on_rtc_error");
        C88440Kt0.LIZ(2131585643);
    }

    @Override // com.bytedance.android.live.liveinteract.interact.audience.p360c.c$a
    public final void LIZLLL(long j, Throwable th) {
        if (!PatchProxy.proxy(new Object[]{new Long(j), th}, this, LIZIZ, false, 77).isSupported && (th instanceof ApiServerException)) {
            C88440Kt0.LIZ(((ApiServerException) th).mPrompt);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r0.LIZ().booleanValue() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        if (((java.lang.Boolean) r2.result).booleanValue() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r0.LJII != true) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r0.LJIIIIZZ != true) goto L15;
     */
    @Override // com.bytedance.android.live.liveinteract.plantform.widgt.BasePkInteractGuestWidget
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
            com.bytedance.hotfix.base.ChangeQuickRedirect r2 = com.bytedance.android.live.liveinteract.interact.audience.LinkPkInteractAudienceGuestWidget.LIZIZ
            r0 = 67
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r6, r2, r5, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L1a
            return
        L1a:
            p003X.C79242HLo.LJIIJ()
            if (r7 != r1) goto L9f
            boolean r0 = p003X.C77562Ghw.LIZ()
            java.lang.String r4 = ""
            if (r0 != 0) goto L38
            X.Kak<java.lang.Boolean> r0 = p003X.AbstractC80293Hkt.f7140dI
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            java.lang.Object r0 = r0.LIZ()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L9f
        L38:
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.bytedance.hotfix.base.ChangeQuickRedirect r2 = com.bytedance.android.live.liveinteract.interact.audience.LinkPkInteractAudienceGuestWidget.LIZIZ
            r0 = 62
            com.bytedance.hotfix.PatchProxyResult r2 = com.bytedance.hotfix.PatchProxy.proxy(r3, r6, r2, r5, r0)
            boolean r0 = r2.isSupported
            if (r0 == 0) goto L61
            java.lang.Object r0 = r2.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L9f
        L50:
            X.HEa r0 = p003X.C79046HEa.LIZ()
            r0.LJI = r7
            X.HK5 r0 = r6.LJJJJL
            if (r0 == 0) goto L7f
            boolean r0 = r0.LJIILIIL()
            if (r0 != r1) goto L7f
            return
        L61:
            X.HEa r0 = p003X.C79046HEa.LIZ()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            boolean r0 = r0.LIZLLL()
            if (r0 != 0) goto L9f
            X.HCc r0 = r6.LJIILJJIL
            if (r0 == 0) goto L76
            boolean r0 = r0.LJII
            if (r0 == r1) goto L9f
        L76:
            X.HCc r0 = r6.LJIILJJIL
            if (r0 == 0) goto L50
            boolean r0 = r0.LJIIIIZZ
            if (r0 == r1) goto L9f
            goto L50
        L7f:
            X.HFw r0 = p003X.HK5.LJIIIZ
            X.HK5 r2 = r0.LIZ(r8)
            r6.LJJJJL = r2
            android.content.Context r0 = r6.context
            if (r0 == 0) goto L97
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            androidx.fragment.app.FragmentManager r1 = r0.getSupportFragmentManager()
            java.lang.String r0 = "InteractBeautyPreviewDialog"
            r2.show(r1, r0)
            return
        L97:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r1.<init>(r0)
            throw r1
        L9f:
            r8.LIZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.interact.audience.LinkPkInteractAudienceGuestWidget.LIZ(int, X.HK9):void");
    }

    @Override // com.bytedance.android.live.liveinteract.interact.audience.p360c.c$a
    public final void LIZJ(long j, Throwable th) {
        if (PatchProxy.proxy(new Object[]{new Long(j), th}, this, LIZIZ, false, 75).isSupported) {
            return;
        }
        C88469KtT.LIZ(this.context, th, 2131585535);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4778p
    public final void LIZ(int i, int i2, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, this, LIZIZ, false, 49).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        C4418a c4418a = this.LJJJI;
        c4418a.f26320LJ = i2;
        c4418a.LIZ("apply");
        BasePkInteractGuestWidget.LIZ(this, i, -1, 1, LinkApplyType.NORMAL, str, null, null, null, 224, null);
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

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4776n
    public final void LIZ(long j, long j2, String str, int i) {
        if (PatchProxy.proxy(new Object[]{new Long(j), 0L, str, 1}, this, LIZIZ, false, 42).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (!PatchProxy.proxy(new Object[]{new Long(j), new Long(0L), str, 1, -1}, this, BasePkInteractAdminLinkWidget.f26432e_, false, 7).isSupported) {
            C106862S5w.LIZ(str);
            if (LJIILL()) {
                HBR hbr = this.LJIIJJI;
                if (hbr == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                HBR.LIZ(hbr, j, 0L, str, 1, -1, 0, 0L, 96, null);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4778p
    public final void LIZ(long j, String str, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str, Integer.valueOf(i), 2}, this, LIZIZ, false, 50).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (!PatchProxy.proxy(new Object[]{new Long(j), str, Integer.valueOf(i), 2}, this, BasePkInteractGuestWidget.LJIIL, false, 14).isSupported) {
            C106862S5w.LIZ(str);
            if (i == ReplyType.Reject.ordinal()) {
                C78996HCc c78996HCc = this.LJIILJJIL;
                if (c78996HCc != null) {
                    c78996HCc.LIZ(j, str, i, 2);
                    return;
                }
                return;
            }
            LIZ(OperateType.REPLY, 2, new C78994HCa(this, 2, j, str, i));
        }
    }
}
