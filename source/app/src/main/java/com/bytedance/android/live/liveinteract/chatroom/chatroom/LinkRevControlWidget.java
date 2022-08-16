package com.bytedance.android.live.liveinteract.chatroom.chatroom;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.tetris.widgets.LiveWidget;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.BaseLinkRevControlWidget;
import com.bytedance.android.live.liveinteract.api.BaseLinkWidget;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.PkLayoutData;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.b$b;
import com.bytedance.android.live.liveinteract.interact.audience.LinkPkInteractAudienceAnchorWidget;
import com.bytedance.android.live.liveinteract.interact.audience.LinkPkInteractAudienceGuestWidget;
import com.bytedance.android.live.liveinteract.multianchor.MultiAnchorControlWidget;
import com.bytedance.android.live.liveinteract.multianchor.MultiAnchorLinkWidget;
import com.bytedance.android.live.liveinteract.multianchor.livescreen.ScreenLiveLinkWidget;
import com.bytedance.android.live.liveinteract.multianchor.match.AbstractC4530a;
import com.bytedance.android.live.liveinteract.multianchor.match.MultiPkMatchWidget;
import com.bytedance.android.live.liveinteract.multianchor.p368f.C4520a;
import com.bytedance.android.live.liveinteract.multianchor.pklaunch.C4566a;
import com.bytedance.android.live.liveinteract.multianchor.pklaunch.MultiAnchorPkLaunchControlWidget;
import com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext;
import com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomAnchorWidget;
import com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomAudienceWidget;
import com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomNewWidget;
import com.bytedance.android.live.liveinteract.p382pk.PkControlWidget;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4762ac;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4775l;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4776n;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4777o;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4779q;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4781u;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4783w;
import com.bytedance.android.live.liveinteract.plantform.p385a.C4768aj;
import com.bytedance.android.live.liveinteract.plantform.widgt.RtcLinkerWidget;
import com.bytedance.android.live.liveinteract.review.LinkmicReviewWidget;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.AbstractC6524y;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.model.C8657j;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.audio.VoiceLiveTheme;
import com.bytedance.android.livesdkapi.service.IPerformanceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.live.datacontext.C13491f;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.p1594ss.avframework.livestreamv2.core.ILayerControl;
import com.p1594ss.avframework.livestreamv2.core.LiveCore;
import com.p1594ss.avframework.mixer.VideoMixer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413392Xt;
import p003X.AbstractC416582eC;
import p003X.AbstractC4569445g;
import p003X.AbstractC77921Gnj;
import p003X.AbstractC78050Gpo;
import p003X.AbstractC79150HIa;
import p003X.AbstractC79905Hed;
import p003X.C106862S5w;
import p003X.C149496fqJ;
import p003X.C2IN;
import p003X.C2W3;
import p003X.C2WC;
import p003X.C3BK;
import p003X.C3BL;
import p003X.C3VF;
import p003X.C413202Xa;
import p003X.C439993ar;
import p003X.C4574547f;
import p003X.C79046HEa;
import p003X.C79107HGj;
import p003X.C79130HHg;
import p003X.C79145HHv;
import p003X.C79169HIt;
import p003X.C79179HJd;
import p003X.C79209HKh;
import p003X.C79220HKs;
import p003X.C79404HRu;
import p003X.C79615HZx;
import p003X.C79864Hdy;
import p003X.C79876HeA;
import p003X.C79915Hen;
import p003X.C79916Heo;
import p003X.C80273HkZ;
import p003X.C87010KQi;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.DialogInterface$OnDismissListenerC79151HIb;
import p003X.HA6;
import p003X.HIE;
import p003X.HIS;
import p003X.HIX;
import p003X.HIY;
import p003X.HJ8;
import p003X.HJE;
import p003X.HJF;
import p003X.HJG;
import p003X.HOC;
import p003X.HR4;
import p003X.HSB;
import p003X.HTD;
import p003X.IQV;
import p003X.IQX;
import p003X.KDS;
import p003X.LK5;
import p003X.QB4;
import p003X.RunnableC79153HId;
import p003X.View$OnClickListenerC79860Hdu;

/* loaded from: classes3.dex */
public final class LinkRevControlWidget extends BaseLinkRevControlWidget implements Observer<KVData>, co$a, cv$a, AbstractC4779q, AbstractC4569445g {
    public static ChangeQuickRedirect LIZIZ;
    public int LIZLLL;

    /* renamed from: LJ */
    public C79130HHg f26265LJ;
    public C79220HKs LJFF;
    public boolean LJI;
    public AbstractC79150HIa LJII;
    public ViewGroup LJIIIIZZ;
    public boolean LJIIIZ;
    public LinkCrossRoomNewWidget LJIIJ;
    public LinkPkInteractAudienceAnchorWidget LJIIJJI;
    public LinkPkInteractAudienceGuestWidget LJIIL;
    public MultiAnchorLinkWidget LJIILIIL;
    public MultiAnchorControlWidget LJIILJJIL;
    public ScreenLiveLinkWidget LJIILL;
    public C9078n LJIILLIIL;
    public Disposable LJIIZILJ;
    public Disposable LJIJ;
    public int LJIJI;
    public View LJIJJ;
    public C79209HKh LJIJJLI;
    public MultiAnchorPkLaunchControlWidget LJIL;
    public String LJJ;
    public int LJJI;
    public final Integer LJJIFFI;
    public Room LJJIII;
    public LiveMode LJJIIJ;
    public boolean LJJIIJZLJL;
    public long LJJIJIIJI;
    public final C80273HkZ LIZJ = new C80273HkZ(this, this);
    public final Observer<AbstractC4256d> LJJII = new C79145HHv(this);
    public final CompositeDisposable LJJIIZ = new CompositeDisposable();
    public final long LJJIIZI = 20;
    public final long LJJIJ = 10;

    static {
        Covode.recordClassIndex(25284);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final void LIZIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZIZ, false, 46).isSupported) {
            return;
        }
        AbstractC416582eC.LIZ(this, th);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final String LJJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 45);
        return proxy.isSupported ? (String) proxy.result : AbstractC416582eC.LIZ(this);
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkRevControlWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 47).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4779q
    public final int LJFF() {
        return this.LJIJI;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4779q
    public final C79220HKs LJI() {
        return this.LJFF;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4779q
    public final C9078n LJIIIIZZ() {
        return this.LJIILLIIL;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4779q
    public final int LJIIJ() {
        return this.LIZLLL;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4779q
    public final View LJIILJJIL() {
        return this.LJIJJ;
    }

    @Override // com.bytedance.android.livesdk.p697l.AbstractC8447a
    public final boolean LIZ(Runnable runnable, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{runnable, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        LinkPkInteractAudienceGuestWidget linkPkInteractAudienceGuestWidget = this.LJIIL;
        boolean LIZ = (linkPkInteractAudienceGuestWidget == null || runnable == null) ? false : linkPkInteractAudienceGuestWidget.LIZ(runnable, z);
        byte b = LIZ ? (byte) 1 : (byte) 0;
        byte b2 = LIZ ? (byte) 1 : (byte) 0;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(b)}, this, LIZIZ, false, 9).isSupported && !this.LJI && !LIZ) {
            C79046HEa LIZ2 = C79046HEa.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            Integer num = (Integer) LIZ2.LJJIIZI;
            if (num != null && num.intValue() == 1 && this.LJJIII != null) {
                LinkApi linkApi = (LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class);
                Room room = this.LJJIII;
                ((KDS) linkApi.leave(room != null ? room.getId() : 0L, "live_end").m149as(autoDisposeWithTransformer())).LIZ(HIY.LIZ, new HIS(this));
            }
        }
        return LIZ;
    }

    @Override // p003X.AbstractC412722Ve
    public final void LIZ(String str) {
        C79209HKh c79209HKh;
        ScreenLiveLinkWidget screenLiveLinkWidget;
        MultiAnchorLinkWidget multiAnchorLinkWidget;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 37).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (this.LJI) {
            return;
        }
        if (TextUtils.equals(str, this.LJJ)) {
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.SEI_DUPLICATE_REMOVE_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                return;
            }
        }
        Integer num = this.LJJIFFI;
        Intrinsics.checkNotNullExpressionValue(num, "");
        if (this.LJJI % num.intValue() == 0) {
            C2IN.LIZIZ().LIZ("ttlive_pk", str);
        }
        this.LJJI++;
        if (C79169HIt.LIZIZ(this.LIZLLL, 4)) {
            LinkCrossRoomNewWidget linkCrossRoomNewWidget = this.LJIIJ;
            if (linkCrossRoomNewWidget instanceof LinkCrossRoomAudienceWidget) {
                if (linkCrossRoomNewWidget != null) {
                    ((LinkCrossRoomAudienceWidget) linkCrossRoomNewWidget).LIZIZ(str);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomAudienceWidget");
                }
            }
            this.LJJ = str;
            LinkPkInteractAudienceGuestWidget linkPkInteractAudienceGuestWidget = this.LJIIL;
            if (linkPkInteractAudienceGuestWidget != null) {
                linkPkInteractAudienceGuestWidget.m15736LJ(str);
                this.LJJ = str;
            }
        }
        if (C79169HIt.LIZIZ(this.LIZLLL, 64) && (multiAnchorLinkWidget = this.LJIILIIL) != null) {
            multiAnchorLinkWidget.LIZ(str);
            this.LJJ = str;
        }
        if (C79169HIt.LIZIZ(this.LIZLLL, 128) && (screenLiveLinkWidget = this.LJIILL) != null) {
            screenLiveLinkWidget.LIZ(str);
            this.LJJ = str;
        }
        if (this.LJIJJLI == null) {
            return;
        }
        SettingKey<Boolean> settingKey2 = LiveConfigSettingKeys.LIVE_PK_OPT_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
        Boolean value2 = settingKey2.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "");
        if (!value2.booleanValue() || (c79209HKh = this.LJIJJLI) == null) {
            return;
        }
        c79209HKh.LIZ(str);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4779q
    public final boolean LJIILIIL() {
        if (this.LJIJJ != null) {
            return true;
        }
        return false;
    }

    private final boolean LJIIZILJ() {
        if (this.LJI && this.LJJIIJ == LiveMode.SCREEN_RECORD) {
            return true;
        }
        return false;
    }

    private final boolean LJIILLIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 17);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.co$a
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 30).isSupported) {
            return;
        }
        LIZJ(4);
    }

    private final void LJIILL() {
        C79220HKs c79220HKs;
        C79220HKs c79220HKs2;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 10).isSupported) {
            return;
        }
        try {
            if (this.LJFF != null && (c79220HKs = this.LJFF) != null && c79220HKs.isVisible() && (c79220HKs2 = this.LJFF) != null) {
                c79220HKs2.dismiss();
            }
        } catch (Throwable unused) {
            ALogger.m15800e("LinkRevControlWidget", "dismissAnchorInteractDialog error");
        }
    }

    private final boolean LJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 19);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C2W3 c2w3 = (C2W3) this.dataCenter.get("data_broadcast_pause_state");
        if (c2w3 == null || (c2w3.LIZ != 1 && c2w3.LIZ != 2)) {
            return false;
        }
        return true;
    }

    private final boolean LJIJI() {
        Room room;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 22);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.LJI || (room = this.LJJIII) == null || !room.isLiveTypeAudio()) {
            return false;
        }
        return true;
    }

    private final void LJIJJLI() {
        C2WC<Boolean> LLJILJILJ;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 25).isSupported) {
            return;
        }
        this.LJIILIIL = (MultiAnchorLinkWidget) this.LJII.LIZ(6);
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LLJILJILJ = LJJJI.LLJILJILJ()) != null) {
            LLJILJILJ.LIZ(Boolean.TRUE);
        }
        LinkControlWidget.LIZIZ("multi_linker", this.LJI);
        this.LIZJ.LIZJ(2);
    }

    private final void LJIL() {
        Disposable disposable;
        Disposable disposable2;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 28).isSupported && (disposable = this.LJIIZILJ) != null && !disposable.isDisposed() && (disposable2 = this.LJIIZILJ) != null) {
            disposable2.dispose();
        }
    }

    private final void LJJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 42).isSupported) {
            return;
        }
        Widget LIZ = this.LJII.LIZ(8);
        if (!(LIZ instanceof ScreenLiveLinkWidget)) {
            LIZ = null;
        }
        this.LJIILL = (ScreenLiveLinkWidget) LIZ;
        LinkControlWidget.LIZIZ("screen_live_multi_linker", this.LJI);
        this.LIZJ.LIZJ(2);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.co$a
    public final void LIZJ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 31).isSupported && !this.LJI && LinkCrossRoomDataHolder.LJII().LIZLLL != 0) {
            LIZ(64);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.co$a
    public final void LIZLLL() {
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 32).isSupported && !this.LJI && LinkCrossRoomDataHolder.LJII().LIZLLL != 0) {
            LIZ(128);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4779q
    /* renamed from: LJ */
    public final boolean mo15712LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LJI && this.LJII.LIZ() == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4779q
    public final int LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 13);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        Object obj = this.dataCenter.get("data_member_count", (String) 0);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        return ((Number) obj).intValue();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4779q
    public final boolean LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 40);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        View view = this.LJIJJ;
        if (view != null && view.getParent() == this.LJIIIIZZ) {
            C88440Kt0.LIZ(2131585464);
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.co$a
    public final void LIZ() {
        C79220HKs c79220HKs;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 29).isSupported) {
            return;
        }
        C79220HKs c79220HKs2 = this.LJFF;
        if (c79220HKs2 != null && c79220HKs2.isVisible() && (c79220HKs = this.LJFF) != null) {
            c79220HKs.dismiss();
        }
        if (!this.LJI || LinkCrossRoomDataHolder.LJII().LIZLLL != 0) {
            LIZ(4);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        C3BK pkService;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 7).isSupported) {
            return;
        }
        super.onDestroy();
        C79209HKh c79209HKh = this.LJIJJLI;
        if (c79209HKh != null) {
            c79209HKh.LIZ();
        }
        this.dataCenter.removeObserver(this);
        C79130HHg c79130HHg = this.f26265LJ;
        if (c79130HHg != null) {
            c79130HHg.LIZJ();
        }
        C79615HZx.LIZ().LIZIZ();
        HJ8.LIZ().LIZIZ();
        this.LJJIIZ.dispose();
        C79864Hdy.LIZJ.LIZJ();
        C79404HRu.LIZJ();
        LJIILL();
        if (LinkCrossRoomDataHolder.LJII() != LinkCrossRoomDataHolder.LIZIZ) {
            LinkCrossRoomDataHolder.LJII().removeObserver(this);
        }
        IInteractService iInteractService = (IInteractService) ServiceManager.getService(IInteractService.class);
        if (iInteractService != null && (pkService = iInteractService.getPkService()) != null) {
            pkService.LIZIZ(this.LJJII);
        }
    }

    private final void LJIJJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 24).isSupported) {
            return;
        }
        Widget LIZ = this.LJII.LIZ(2);
        if (LIZ != null) {
            BaseLinkWidget baseLinkWidget = (BaseLinkWidget) LIZ;
            if (baseLinkWidget != null) {
                this.LJIIJ = (LinkCrossRoomNewWidget) baseLinkWidget;
                LinkControlWidget.LIZIZ(PushConstants.URI_PACKAGE_NAME, this.LJI);
                if (this.LJI) {
                    if (this.LJIIJJI == null && C79179HJd.LIZIZ.LIZ()) {
                        this.LJIIJJI = (LinkPkInteractAudienceAnchorWidget) this.LJII.LIZ(10);
                    }
                    if (LJIJI()) {
                        ALogger.m15797i("ttlive_link", "loadCrossRoomWidget, useVoiceSceneToolbar, don't show interaction");
                        return;
                    } else {
                        C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION.extended());
                        return;
                    }
                } else if (this.LJIIL == null && C79179HJd.LIZIZ.LIZ()) {
                    this.LJIIL = (LinkPkInteractAudienceGuestWidget) this.LJII.LIZ(11);
                    return;
                } else {
                    return;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomNewWidget");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.api.BaseLinkWidget");
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4779q
    public final boolean LJIIL() {
        int i;
        IUserService iUserService;
        C3VF user;
        LinkPkInteractAudienceGuestWidget linkPkInteractAudienceGuestWidget;
        C3VF user2;
        int i2;
        LinkPkInteractAudienceGuestWidget linkPkInteractAudienceGuestWidget2;
        PkDataContext pkDataContext;
        LiveData<AbstractC4256d> liveData;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 41);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (C79169HIt.LIZIZ(this.LIZLLL, 4)) {
            AbstractC4256d abstractC4256d = null;
            if (IQV.LIZ("PkDataContext", PkDataContext.class) != null && (pkDataContext = (PkDataContext) IQV.LIZ("PkDataContext", PkDataContext.class)) != null && (liveData = pkDataContext.LJIIIZ) != null) {
                abstractC4256d = liveData.getValue();
            }
            if (this.LJI) {
                if (abstractC4256d != null && !(abstractC4256d instanceof AbstractC4256d.C4257a)) {
                    if (C79179HJd.LIZIZ.LIZ()) {
                        this.dataCenter.put("data_link_pk_interact_show_red_dot", Boolean.TRUE);
                        this.LJFF = C79220HKs.LIZ(this.dataCenter, this).LIZIZ();
                        C79220HKs c79220HKs = this.LJFF;
                        if (c79220HKs != null) {
                            Context context = this.context;
                            if (context != null) {
                                c79220HKs.show(((FragmentActivity) context).getSupportFragmentManager(), "LinkDialog");
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                            }
                        }
                    } else {
                        C88440Kt0.LIZ(C79179HJd.LIZIZ.LIZIZ());
                        return false;
                    }
                } else {
                    LinkCrossRoomNewWidget linkCrossRoomNewWidget = this.LJIIJ;
                    if (linkCrossRoomNewWidget != null) {
                        linkCrossRoomNewWidget.LJIIIIZZ();
                        return false;
                    }
                }
            } else {
                IUserService iUserService2 = (IUserService) ServiceManager.getService(IUserService.class);
                if (iUserService2 != null && (user2 = iUserService2.user()) != null && !user2.LJI()) {
                    AbstractC4774i LIZ = AbstractC78050Gpo.LIZ();
                    if (LIZ != null) {
                        i2 = LIZ.LJJIFFI();
                    } else {
                        i2 = 0;
                    }
                    if (C79169HIt.LIZIZ(i2, 2) && (linkPkInteractAudienceGuestWidget2 = this.LJIIL) != null) {
                        linkPkInteractAudienceGuestWidget2.LIZ(false);
                        return false;
                    }
                }
            }
        } else {
            AbstractC4774i LIZ2 = AbstractC78050Gpo.LIZ();
            if (LIZ2 != null) {
                i = LIZ2.LJJIFFI();
            } else {
                i = 0;
            }
            if (C79169HIt.LIZIZ(i, 2) && !this.LJI && (iUserService = (IUserService) ServiceManager.getService(IUserService.class)) != null && (user = iUserService.user()) != null && !user.LJI() && (linkPkInteractAudienceGuestWidget = this.LJIIL) != null) {
                linkPkInteractAudienceGuestWidget.LIZ(true);
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
        if (r0.LJJIFFI() == 2) goto L13;
     */
    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4779q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LJIIIZ() {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkRevControlWidget.LJIIIZ():void");
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        boolean z;
        int LJJIFFI;
        C79130HHg c79130HHg;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 2).isSupported) {
            return;
        }
        super.onCreate();
        C79404HRu.LIZIZ();
        this.LJJIII = (Room) this.dataCenter.get("data_room");
        Boolean bool = (Boolean) this.dataCenter.get("data_is_anchor", (String) Boolean.FALSE);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJI = z;
        this.LJJIIJ = (LiveMode) this.dataCenter.get("data_live_mode");
        Object obj = this.dataCenter.get("data_is_portrait", (String) Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        this.LJJIIJZLJL = ((Boolean) obj).booleanValue();
        Pair LIZ = IQV.LIZ((Function0) LinkRevControlWidget$onCreate$pair$1.INSTANCE);
        ((C4768aj) LIZ.getFirst()).LIZ().LIZIZ(this);
        IQX.LIZ((C13491f) LIZ.getFirst(), "ILinkRevInternalService");
        QB4.LIZ((Disposable) LIZ.getSecond(), this.LJJIIZ);
        AbstractC6524y LIZ2 = C413202Xa.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        if (this.LJJIIJZLJL) {
            LIZ2.LIZ(ToolbarButton.f27007PK, this.LIZJ);
        }
        this.f26265LJ = new C79130HHg(this.LJJIII, this.LJI, this.LJIIIZ, this.LJJIIJ, this.LJJIIJZLJL, LJJJI());
        C79130HHg c79130HHg2 = this.f26265LJ;
        if (c79130HHg2 != null) {
            c79130HHg2.LIZ((co$a) this);
        }
        Room room = this.LJJIII;
        if (room != null && (c79130HHg = this.f26265LJ) != null) {
            this.LJIJJLI = new C79209HKh(room, null, c79130HHg);
        }
        Room room2 = this.LJJIII;
        if (room2 != null && room2.isPaidLive()) {
            this.LIZJ.LIZ(0.34f);
        }
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        C3BK pkService = ((IInteractService) service).getPkService();
        if (pkService != null) {
            pkService.LIZ(this.LJJII);
        }
        enableSubWidgetManager();
        boolean LIZLLL = C149496fqJ.LIZLLL();
        this.LJIILJJIL = new MultiAnchorControlWidget();
        this.subWidgetManager.load(this.LJIILJJIL, LIZLLL, LIZLLL);
        if (this.LJI) {
            this.subWidgetManager.load(new PkControlWidget(null, this.LJII), LIZLLL, LIZLLL);
            this.subWidgetManager.load(new RtcLinkerWidget());
            this.subWidgetManager.load(new LinkmicReviewWidget());
            if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 6).isSupported && this.LJIL == null) {
                this.LJIL = new MultiAnchorPkLaunchControlWidget();
                enableSubWidgetManager();
                this.subWidgetManager.load(this.LJIL);
            }
            this.subWidgetManager.load(new MultiPkMatchWidget());
        }
        this.dataCenter.observeForever("cmd_pk_state_change", this).observeForever("cmd_multi_state_change", this).observeForever("cmd_mic_room_anchor_status", this).observe("cmd_audience_turn_off_engine", this).observe("data_pk_match_state", this).observe("cmd_interact_audience_invite", this);
        LIZ(HA6.class);
        LIZ(HJF.class);
        LIZ(HJE.class);
        C79404HRu.LIZ(this.LJJIII);
        AbstractC4775l LIZ3 = AbstractC77921Gnj.LIZ();
        if (LIZ3 != null && (LJJIFFI = LIZ3.LJJIFFI()) != 0) {
            LIZIZ(LJJIFFI);
        }
    }

    private final boolean LJII(int i) {
        int i2 = this.LIZLLL;
        if ((i2 == 4 || i2 == 64) && i == 2) {
            return true;
        }
        return false;
    }

    private final void LIZ(DialogInterface.OnDismissListener onDismissListener) {
        C79220HKs c79220HKs;
        if (!PatchProxy.proxy(new Object[]{onDismissListener}, this, LIZIZ, false, 5).isSupported && (c79220HKs = this.LJFF) != null) {
            c79220HKs.setOnDismissListener(new DialogInterface$OnDismissListenerC79151HIb(this, onDismissListener));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4779q
    /* renamed from: LJ */
    public final LiveWidget mo15711LJ(int i) {
        if (i != 4) {
            if (i != 64) {
                if (i != 128) {
                    return null;
                }
                return this.LJIILL;
            }
            return this.LJIILIIL;
        }
        return this.LJIIJ;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4779q
    public final void LJI(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 43).isSupported) {
            return;
        }
        this.LIZJ.LIZJ(i);
        this.LJIJI = i;
    }

    private final <T> void LIZ(Class<T> cls) {
        if (PatchProxy.proxy(new Object[]{cls}, this, LIZIZ, false, 3).isSupported) {
            return;
        }
        this.LJJIIZ.add(C87010KQi.LIZ().LIZ((Class) cls).subscribe(new HIX(this)));
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4779q
    public final boolean LJFF(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 39);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C79169HIt.LIZIZ(this.LIZLLL, i);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4779q
    public final void LIZLLL(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 36).isSupported) {
            return;
        }
        if (i == 2) {
            LinkPkInteractAudienceGuestWidget linkPkInteractAudienceGuestWidget = this.LJIIL;
            if (linkPkInteractAudienceGuestWidget != null) {
                linkPkInteractAudienceGuestWidget.LIZLLL("live_end");
            }
        } else if (i == 32) {
            this.LIZJ.LIZ(1.0f);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.BaseLinkRevControlWidget
    public final void LIZ(Room room) {
        if (PatchProxy.proxy(new Object[]{room}, this, LIZIZ, false, 38).isSupported) {
            return;
        }
        C106862S5w.LIZ(room);
        this.LJJIII = room;
        C79130HHg c79130HHg = this.f26265LJ;
        if (c79130HHg != null && !PatchProxy.proxy(new Object[]{room}, c79130HHg, C79130HHg.LIZ, false, 11).isSupported) {
            C106862S5w.LIZ(room);
            if (!c79130HHg.LJFF) {
                c79130HHg.LIZ(room, false);
                if (c79130HHg.LJJ != null) {
                    c79130HHg.LJJ.put("data_interact_update_room_done", room);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4779q
    public final void LIZIZ(int i) {
        boolean z;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 34).isSupported) {
            return;
        }
        if (!LJII(i)) {
            LIZJ(this.LIZLLL);
        }
        if (this.LJI && this.LJIJJ != null) {
            if (HJG.LIZ(this.LJJIII) && i == 4) {
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
        if (i == 2) {
            if (this.LJI) {
                if (C79169HIt.LIZIZ(this.LIZLLL, 4) && C79179HJd.LIZIZ.LIZ() && this.LJIIJJI == null) {
                    Widget LIZ = this.LJII.LIZ(10);
                    if (LIZ != null) {
                        this.LJIIJJI = (LinkPkInteractAudienceAnchorWidget) LIZ;
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.liveinteract.interact.audience.LinkPkInteractAudienceAnchorWidget");
                }
            } else if (C79169HIt.LIZIZ(this.LIZLLL, 4) && C79179HJd.LIZIZ.LIZ() && this.LJIIL == null) {
                Widget LIZ2 = this.LJII.LIZ(11);
                if (!(LIZ2 instanceof LinkPkInteractAudienceGuestWidget)) {
                    LIZ2 = null;
                }
                this.LJIIL = (LinkPkInteractAudienceGuestWidget) LIZ2;
            }
        } else if (i == 32) {
            this.LIZJ.LIZ(0.34f);
            this.LIZJ.LIZJ();
        } else if (i == 8 && LJIJI()) {
            C413202Xa.LIZ().LIZIZ(ToolbarButton.f27007PK.extended());
        }
    }

    public final void onEvent(Object obj) {
        b$b b_b;
        if (PatchProxy.proxy(new Object[]{obj}, this, LIZIZ, false, 4).isSupported) {
            return;
        }
        if (!this.LJI) {
            C88440Kt0.LIZ(2131586939);
            return;
        }
        this.LJFF = C79220HKs.LIZ(this.dataCenter, this).m23760LJ();
        if (obj instanceof HA6) {
            if (((HA6) obj).LIZ) {
                LIZ(7, (DialogInterface.OnDismissListener) null);
                return;
            }
            b_b = C79916Heo.LIZ(this.LJFF, this.dataCenter);
        } else {
            b_b = null;
        }
        if (obj instanceof HJE) {
            Room room = this.LJJIII;
            if (room != null && room.isLiveTypeAudio()) {
                b_b = View$OnClickListenerC79860Hdu.LIZ(this.LJFF, this.dataCenter, null, null, true);
            } else {
                b_b = C79876HeA.LIZ(this.LJFF, this.dataCenter, 2);
            }
        }
        if (obj instanceof HJF) {
            Room room2 = this.LJJIII;
            if (room2 != null && room2.isLiveTypeAudio()) {
                b_b = View$OnClickListenerC79860Hdu.LIZ(this.LJFF, this.dataCenter, null, null, true);
            } else {
                b_b = C79876HeA.LIZ(this.LJFF, this.dataCenter, 0);
            }
        }
        if (b_b != null) {
            C79220HKs c79220HKs = this.LJFF;
            if (c79220HKs != null) {
                c79220HKs.LIZJ = b_b;
            }
            LIZ((DialogInterface.OnDismissListener) null);
            C79220HKs c79220HKs2 = this.LJFF;
            if (c79220HKs2 != null) {
                Context context = this.context;
                if (context != null) {
                    c79220HKs2.show(((FragmentActivity) context).getSupportFragmentManager(), "LinkDialog");
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4779q
    public final void LIZ(int i) {
        DataCenter dataCenter;
        C9078n c9078n;
        boolean z;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 33).isSupported) {
            return;
        }
        ALogger.m15800e("ttlive_link", "switchMode " + i + " " + C79169HIt.LIZIZ(this.LIZLLL, i));
        if (C79169HIt.LIZIZ(this.LIZLLL, i)) {
            ALogger.m15797i("LinkRevControlWidget", "duplicate switchMode " + this.LIZLLL + " target=" + i);
            return;
        }
        int i2 = this.LIZLLL;
        if (i2 != 0) {
            LIZJ(i2);
        }
        if ((i == 4 || i == 64 || i == 128) && (dataCenter = this.dataCenter) != null) {
            dataCenter.put("data_interact_audience_video_translation", Boolean.FALSE);
        }
        this.LIZLLL = C79169HIt.LIZ(this.LIZLLL, i);
        DataCenter dataCenter2 = this.dataCenter;
        if (dataCenter2 != null) {
            dataCenter2.put("data_link_state", Integer.valueOf(HIE.LIZIZ.LJJIFFI()));
        }
        C79107HGj.LIZ("switch", "target: " + i + " ,current:" + this.LIZLLL);
        if (i == 4 || i == 64 || i == 128) {
            this.dataCenter.put("data_interact_audience_video_translation", Boolean.FALSE);
        }
        if (this.LJI && this.LJIJJ != null) {
            if (HJG.LIZ(this.LJJIII) && i == 4) {
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
        AbstractC4775l LIZ = AbstractC77921Gnj.LIZ();
        if (LIZ != null) {
            LIZ.LIZLLL(i);
        }
        if (i == 4) {
            C9078n c9078n2 = this.LJIILLIIL;
            if (c9078n2 != null && c9078n2.LJIILIIL() && (c9078n = this.LJIILLIIL) != null) {
                c9078n.dismiss();
            }
            AbstractC4783w LIZ2 = AbstractC4783w.LJIIL.LIZ();
            if (LIZ2 != null) {
                LIZ2.LIZIZ();
            }
            LJIILL();
            this.LJJIJIIJI = SystemClock.elapsedRealtime();
            LJIJJ();
        } else if (i == 64) {
            C79615HZx.LIZ().LIZIZ();
            LJIJJLI();
        } else if (i == 128) {
            LJJ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4779q
    public final void LIZJ(int i) {
        String str;
        String str2;
        String str3;
        User owner;
        String str4;
        String str5;
        String str6;
        User owner2;
        C2WC<Boolean> LLJILJILJ;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 35).isSupported || !C79169HIt.LIZIZ(this.LIZLLL, i)) {
            return;
        }
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("data_online_changed_list", new ArrayList());
        }
        this.LIZLLL = C79169HIt.LIZJ(this.LIZLLL, i);
        DataCenter dataCenter2 = this.dataCenter;
        if (dataCenter2 != null) {
            dataCenter2.put("data_link_state", Integer.valueOf(HIE.LIZIZ.LJJIFFI()));
        }
        if (i != 4) {
            if (i != 64) {
                if (i == 128) {
                    this.LJII.LIZ(this.LJIILL);
                    this.LJIILL = null;
                    LJI(0);
                    this.LIZJ.m23721LJ();
                    LinkControlWidget.LJJIIZ();
                }
            } else {
                this.LJII.LIZ(this.LJIILIIL);
                this.LJIILIIL = null;
                C5923dp LJJJI = LJJJI();
                if (LJJJI != null && (LLJILJILJ = LJJJI.LLJILJILJ()) != null) {
                    LLJILJILJ.LIZ(Boolean.FALSE);
                }
                MultiAnchorControlWidget multiAnchorControlWidget = this.LJIILJJIL;
                if (multiAnchorControlWidget != null) {
                    multiAnchorControlWidget.LJIIIIZZ();
                }
                LJI(0);
                this.LIZJ.m23721LJ();
                LinkControlWidget.LJJIIZ();
            }
        } else {
            if (this.LJI) {
                HashMap hashMap = new HashMap();
                C8657j c8657j = new C8657j();
                hashMap.put("event_page", "live_detail");
                Room room = this.LJJIII;
                if (room == null || (str = String.valueOf(room.getId())) == null) {
                    str = "";
                }
                hashMap.put("room_id", str);
                Room room2 = this.LJJIII;
                if (room2 == null || (str2 = String.valueOf(room2.getOwnerUserId())) == null) {
                    str2 = "";
                }
                hashMap.put("anchor_id", str2);
                Room room3 = this.LJJIII;
                if (room3 != null && room3.getId() == LinkCrossRoomDataHolder.LJII().LIZLLL) {
                    Room room4 = this.LJJIII;
                    if (room4 == null || (owner2 = room4.getOwner()) == null || (str6 = String.valueOf(owner2.getId())) == null) {
                        str6 = "";
                    }
                    hashMap.put("inviter_id", str6);
                    hashMap.put("invitee_id", String.valueOf(LinkCrossRoomDataHolder.LJII().LJFF));
                } else {
                    hashMap.put("inviter_id", String.valueOf(LinkCrossRoomDataHolder.LJII().LJFF));
                    Room room5 = this.LJJIII;
                    if (room5 == null || (owner = room5.getOwner()) == null || (str3 = String.valueOf(owner.getId())) == null) {
                        str3 = "";
                    }
                    hashMap.put("invitee_id", str3);
                }
                if (LinkCrossRoomDataHolder.LJII().LJIJJLI == 1) {
                    str4 = "random";
                } else {
                    str4 = "manual";
                }
                hashMap.put("match_type", str4);
                if (LinkCrossRoomDataHolder.LJII().LJIIJJI > 0) {
                    hashMap.put("pk_time", String.valueOf(LinkCrossRoomDataHolder.LJII().LJIIJJI));
                }
                if (LinkCrossRoomDataHolder.LJII().LJJI) {
                    str5 = "1";
                } else {
                    str5 = "0";
                }
                hashMap.put("is_oncemore", str5);
                hashMap.put("channel_id", String.valueOf(LinkCrossRoomDataHolder.LJII().LIZLLL));
                hashMap.put("pk_id", String.valueOf(LinkCrossRoomDataHolder.LJII().f26249LJ));
                if (LinkCrossRoomDataHolder.LJII().LJIIJJI > 0 && LinkCrossRoomDataHolder.LJII().LJIJJLI == 0) {
                    c8657j.LIZ(LinkCrossRoomDataHolder.LJII().LJII);
                }
                hashMap.put("connection_time", String.valueOf((System.currentTimeMillis() - this.LJJIJIIJI) / 1000));
            }
            LinkCrossRoomNewWidget linkCrossRoomNewWidget = this.LJIIJ;
            if (linkCrossRoomNewWidget != null) {
                this.LJII.LIZ(linkCrossRoomNewWidget);
                this.LJIIJ = null;
            }
            this.LJII.LIZ(this.LJIIJJI);
            this.LJII.LIZ(this.LJIIL);
            this.LJIIL = null;
            this.LJIIJJI = null;
            LinkControlWidget.LJJIIZ();
        }
        AbstractC4775l LIZ = AbstractC77921Gnj.LIZ();
        if (LIZ != null) {
            LIZ.LJFF(i);
        }
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        AbstractC4776n LIZ;
        AbstractC4775l LIZ2;
        AbstractC4762ac LIZ3;
        PkLayoutData LIZ4;
        AbstractC413392Xt<AbstractC5436a> LJJLIIIJL;
        AbstractC5436a LIZIZ2;
        MethodCollector.m14708i(1713);
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZIZ, false, 1).isSupported) {
            if (isViewValid() && kVData2 != null && kVData2.getData() != null) {
                String key = kVData2.getKey();
                switch (key.hashCode()) {
                    case -1540323875:
                        if (key.equals("cmd_pk_state_change")) {
                            HSB hsb = (HSB) kVData2.getData();
                            if (hsb != null) {
                                if (!PatchProxy.proxy(new Object[]{hsb}, this, LIZIZ, false, 18).isSupported) {
                                    if (hsb.LIZ == 5) {
                                        this.LIZJ.LJIIIIZZ();
                                        break;
                                    } else {
                                        String str = null;
                                        if (hsb.LIZ == 1) {
                                            this.LIZJ.LJIIIZ();
                                            if (this.LJI) {
                                                if (this.LJIIIIZZ != null) {
                                                    View view = this.LJIJJ;
                                                    if (view != null) {
                                                        ViewParent parent = view.getParent();
                                                        ViewGroup viewGroup = this.LJIIIIZZ;
                                                        if (parent == viewGroup) {
                                                            if (viewGroup != null) {
                                                                viewGroup.removeView(this.LJIJJ);
                                                            }
                                                            this.LJIJJ = null;
                                                            C5923dp LJJJI = LJJJI();
                                                            if (LJJJI != null && (LJJLIIIJL = LJJJI.LJJLIIIJL()) != null && (LIZIZ2 = LJJLIIIJL.LIZIZ()) != null && LIZIZ2.LJIILL() != null) {
                                                                LiveCore LJIILL = LIZIZ2.LJIILL();
                                                                Intrinsics.checkNotNullExpressionValue(LJIILL, "");
                                                                ILayerControl layerControl = LJIILL.getLayerControl();
                                                                Intrinsics.checkNotNullExpressionValue(layerControl, "");
                                                                ILayerControl.ILayer localOriginLayer = layerControl.getLocalOriginLayer();
                                                                VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
                                                                videoMixerDescription.setVisibility(true);
                                                                videoMixerDescription.setLeft(0.0f);
                                                                videoMixerDescription.setTop(0.0f);
                                                                videoMixerDescription.setRight(1.0f);
                                                                videoMixerDescription.setBottom(1.0f);
                                                                videoMixerDescription.setMode(2);
                                                                localOriginLayer.updateDescription(videoMixerDescription);
                                                            }
                                                            this.LIZJ.m23721LJ();
                                                        }
                                                    }
                                                    AbstractC4775l LIZ5 = AbstractC77921Gnj.LIZ();
                                                    if (LIZ5 != null) {
                                                        LIZ5.LJIILIIL();
                                                    }
                                                }
                                            }
                                            Room room = this.LJJIII;
                                            if (room != null && room.getStreamType() == LiveMode.AUDIO) {
                                                HashMap hashMap = new HashMap();
                                                if (((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).voiceLiveThemeManager() != null && ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).voiceLiveThemeManager().LIZ(2) != null) {
                                                    VoiceLiveTheme LIZ6 = ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).voiceLiveThemeManager().LIZ(2);
                                                    if (LIZ6 != null) {
                                                        str = String.valueOf(LIZ6.LIZJ);
                                                    }
                                                    if (str == null) {
                                                        str = "";
                                                    }
                                                    hashMap.put("theme_id", str);
                                                    ((IPerformanceManager) ServiceManager.getService(IPerformanceManager.class)).onModuleStart("audio_animated_bg", hashMap);
                                                    break;
                                                }
                                            }
                                        } else if (hsb.LIZ == 0) {
                                            View view2 = this.LJIJJ;
                                            if (view2 != null) {
                                                ViewParent parent2 = view2.getParent();
                                                ViewGroup viewGroup2 = this.LJIIIIZZ;
                                                if (parent2 == viewGroup2) {
                                                    if (viewGroup2 != null) {
                                                        viewGroup2.removeView(this.LJIJJ);
                                                    }
                                                    this.LJIJJ = null;
                                                }
                                            }
                                            Room room2 = this.LJJIII;
                                            if (room2 != null && room2.getStreamType() == LiveMode.AUDIO) {
                                                ((IPerformanceManager) ServiceManager.getService(IPerformanceManager.class)).onModuleStop("audio_animated_bg");
                                                break;
                                            }
                                        } else if (hsb.LIZ == 3 && this.LJI) {
                                            if (hsb.LIZIZ instanceof ViewGroup) {
                                                Object obj = hsb.LIZIZ;
                                                if (!(obj instanceof View)) {
                                                    obj = null;
                                                }
                                                this.LJIJJ = (View) obj;
                                                Object obj2 = hsb.LIZIZ;
                                                if (obj2 != null) {
                                                    View view3 = (View) obj2;
                                                    if (!PatchProxy.proxy(new Object[]{view3}, this, LIZIZ, false, 21).isSupported && AbstractC4762ac.LIZ.LIZ() != null && (LIZ3 = AbstractC4762ac.LIZ.LIZ()) != null && (LIZ4 = LIZ3.LIZ()) != null) {
                                                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LIZ4.getWidth(), LIZ4.getHeight());
                                                        layoutParams.topMargin = LIZ4.getMarginTop() + LK5.m23418LJ();
                                                        layoutParams.leftMargin = LIZ4.getWidth();
                                                        view3.setLayoutParams(layoutParams);
                                                        ViewGroup viewGroup3 = this.LJIIIIZZ;
                                                        if (viewGroup3 != null) {
                                                            viewGroup3.addView(view3, 0);
                                                        }
                                                        Object obj3 = this.dataCenter.get("cmd_what_audience_join_self_link", (String) Boolean.FALSE);
                                                        Intrinsics.checkNotNullExpressionValue(obj3, "");
                                                        if (((Boolean) obj3).booleanValue()) {
                                                            this.dataCenter.put("cmd_what_adjust_preview_4_random_rematch", Integer.valueOf(LIZ4.getHeight()));
                                                        }
                                                    }
                                                    View view4 = this.LJIJJ;
                                                    if (view4 != null) {
                                                        view4.post(new RunnableC79153HId(this));
                                                    }
                                                } else {
                                                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.View");
                                                    MethodCollector.m14707o(1713);
                                                    throw nullPointerException;
                                                }
                                            }
                                            AbstractC4775l LIZ7 = AbstractC77921Gnj.LIZ();
                                            if (LIZ7 != null) {
                                                LIZ7.LJIILIIL();
                                                break;
                                            }
                                        }
                                    }
                                }
                                MethodCollector.m14707o(1713);
                                return;
                            }
                            MethodCollector.m14707o(1713);
                            return;
                        }
                        break;
                    case -1091008631:
                        if (key.equals("cmd_multi_state_change")) {
                            HR4 hr4 = (HR4) kVData2.getData();
                            if (hr4 != null) {
                                if (!PatchProxy.proxy(new Object[]{hr4}, this, LIZIZ, false, 20).isSupported && this.LJI && hr4.LIZJ == 2 && this.LJIIIIZZ != null && (LIZ2 = AbstractC77921Gnj.LIZ()) != null) {
                                    LIZ2.LJIILIIL();
                                    break;
                                } else {
                                    MethodCollector.m14707o(1713);
                                    return;
                                }
                            } else {
                                MethodCollector.m14707o(1713);
                                return;
                            }
                        }
                        break;
                    case -793150208:
                        if (key.equals("cmd_interact_audience_invite")) {
                            User user = (User) kVData2.getData();
                            if (user == null) {
                                MethodCollector.m14707o(1713);
                                return;
                            }
                            long j = 0;
                            if (this.LJI) {
                                AbstractC4777o LIZ8 = AbstractC4777o.LIZ.LIZ();
                                if (LIZ8 != null) {
                                    Room room3 = this.LJJIII;
                                    if (room3 != null) {
                                        j = room3.getId();
                                    }
                                    String secUid = user.getSecUid();
                                    Intrinsics.checkNotNullExpressionValue(secUid, "");
                                    LIZ8.LIZ(j, 0L, secUid, 1, 0L);
                                    MethodCollector.m14707o(1713);
                                    return;
                                }
                                MethodCollector.m14707o(1713);
                                return;
                            } else if (((IUserService) ServiceManager.getService(IUserService.class)).user().LJI() && AbstractC4776n.LIZ.LIZ() != null && (LIZ = AbstractC4776n.LIZ.LIZ()) != null) {
                                Room room4 = this.LJJIII;
                                if (room4 != null) {
                                    j = room4.getId();
                                }
                                String secUid2 = user.getSecUid();
                                Intrinsics.checkNotNullExpressionValue(secUid2, "");
                                LIZ.LIZ(j, 0L, secUid2, 1);
                                MethodCollector.m14707o(1713);
                                return;
                            }
                        }
                        break;
                    case 45161096:
                        if (key.equals("data_pk_match_state") && this.LJI) {
                            Integer num = (Integer) kVData2.getData(0);
                            if (num != null) {
                                num.intValue();
                                this.LIZJ.LIZ(num.intValue());
                                MethodCollector.m14707o(1713);
                                return;
                            }
                            MethodCollector.m14707o(1713);
                            return;
                        }
                        break;
                    case 674788158:
                        if (key.equals("cmd_audience_turn_off_engine")) {
                            AbstractC4774i LIZ9 = AbstractC78050Gpo.LIZ();
                            Intrinsics.checkNotNullExpressionValue(LIZ9, "");
                            if (C79169HIt.LIZIZ(LIZ9.LJJIFFI(), 4)) {
                                if (Intrinsics.areEqual(kVData2.getData(Boolean.FALSE), Boolean.TRUE)) {
                                    LJIJJ();
                                } else {
                                    LIZJ(4);
                                }
                            }
                            AbstractC4774i LIZ10 = AbstractC78050Gpo.LIZ();
                            Intrinsics.checkNotNullExpressionValue(LIZ10, "");
                            if (C79169HIt.LIZIZ(LIZ10.LJJIFFI(), 64)) {
                                if (Intrinsics.areEqual(kVData2.getData(Boolean.FALSE), Boolean.TRUE)) {
                                    LJIJJLI();
                                    MethodCollector.m14707o(1713);
                                    return;
                                }
                                LIZJ(64);
                                MethodCollector.m14707o(1713);
                                return;
                            }
                        }
                        break;
                    case 757444085:
                        if (key.equals("cmd_mic_room_anchor_status")) {
                            Integer num2 = (Integer) kVData2.getData(0);
                            if (num2 != null && num2.intValue() == 1) {
                                this.LIZJ.LIZ(0.5f);
                                MethodCollector.m14707o(1713);
                                return;
                            }
                            this.LIZJ.LIZ(1.0f);
                            MethodCollector.m14707o(1713);
                            return;
                        }
                        break;
                }
            } else {
                MethodCollector.m14707o(1713);
                return;
            }
        }
        MethodCollector.m14707o(1713);
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0344, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02d4, code lost:
        com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder.LJII().LJJLIIIJLJLI = r31.LIZ.f28181LJ;
        com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder.LJII().LJJJZ = true;
        com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder.LJII().LJJL = false;
        r30.LJFF = p003X.C79220HKs.LIZ(r30.dataCenter, r30).LIZ(r31);
        r2 = r30.LJFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02f8, code lost:
        if (r2 == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02fa, code lost:
        r0 = r30.context;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02fc, code lost:
        if (r0 == null) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02fe, code lost:
        r2.show(((androidx.fragment.app.FragmentActivity) r0).getSupportFragmentManager(), "LinkDialog");
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03e2, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0309, code lost:
        p003X.HJ8.LIZ().LIZ(r31);
        LJIL();
        r30.LJIIZILJ = ((p003X.AbstractC81278I1w) io.reactivex.Observable.timer(r30.LJJIIZI, java.util.concurrent.TimeUnit.SECONDS).m151as(autoDisposeWithTransformer())).LIZ(p003X.C79144HHu.LIZIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x032d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0399, code lost:
        if (p003X.C79179HJd.LIZIZ.LIZJ() == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02d2, code lost:
        if (r30.LJIJI == 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03d7, code lost:
        if (r1.intValue() != 5) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.co$a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(com.bytedance.android.livesdk.message.model.C8845ej r31) {
        /*
            Method dump skipped, instructions count: 995
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkRevControlWidget.LIZ(com.bytedance.android.livesdk.message.model.ej):void");
    }

    private final void LIZIZ(int i, DialogInterface.OnDismissListener onDismissListener) {
        Integer num;
        String str;
        C4520a mo15709LJ;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), onDismissListener}, this, LIZIZ, false, 16).isSupported) {
            return;
        }
        LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
        HashMap hashMap = new HashMap();
        FragmentManager fragmentManager = null;
        if (AbstractC4782v.LJIIL.LIZ() != null) {
            AbstractC4782v LIZ = AbstractC4782v.LJIIL.LIZ();
            if (LIZ != null && (mo15709LJ = LIZ.mo15709LJ()) != null) {
                num = Integer.valueOf(mo15709LJ.LJIIL());
            } else {
                num = null;
            }
            if (num == null || (str = String.valueOf(num.intValue())) == null) {
                str = "";
            }
            hashMap.put("anchor_connect_status", str);
        }
        if (LJII.LJJJ != null && LJII.LJIJJLI == 0 && ((int) LJII.LJII) == 11) {
            hashMap.put("room_status", "best_invite_matching");
        } else {
            IService service = ServiceManager.getService(IInteractService.class);
            Intrinsics.checkNotNullExpressionValue(service, "");
            C3BL interactAudienceService = ((IInteractService) service).getInteractAudienceService();
            if (interactAudienceService != null && interactAudienceService.LIZIZ()) {
                hashMap.put("room_status", "audience_connection");
            } else {
                hashMap.put("room_status", "live");
            }
        }
        C4574547f.LIZ().LIZ("livesdk_interact_icon_click", hashMap, this.LJJIII);
        LJII.LJJIJLIJ = false;
        if (LJII.LJJJZ) {
            this.LJFF = C79220HKs.LIZ(this.dataCenter, this).LIZLLL();
            C79220HKs c79220HKs = this.LJFF;
            if (c79220HKs != null) {
                Context context = this.context;
                if (context != null) {
                    c79220HKs.show(((FragmentActivity) context).getSupportFragmentManager(), "LinkDialog");
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
            }
            C79220HKs c79220HKs2 = this.LJFF;
            if (c79220HKs2 != null) {
                c79220HKs2.setOnDismissListener(onDismissListener);
            }
        } else if (LJII.LJJL) {
            C88440Kt0.LIZ(2131584385);
        } else {
            C79615HZx LIZ2 = C79615HZx.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            if (LIZ2.LIZLLL()) {
                C88440Kt0.LIZ(2131586985, 1);
                return;
            }
            C79615HZx LIZ3 = C79615HZx.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
            if ((LIZ3.LIZJ() || LJII.LJJJ != null) && LJII.LJIJJLI != 2) {
                C79615HZx LIZ4 = C79615HZx.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                if (LIZ4.LIZJ()) {
                    if (AbstractC4783w.LJIIL.LIZ() != null) {
                        try {
                            AbstractC4783w LIZ5 = AbstractC4783w.LJIIL.LIZ();
                            if (LIZ5 != null) {
                                LIZ5.LIZ(onDismissListener);
                            }
                        } catch (Exception unused) {
                            ALogger.m15800e("LinkRevControlWidget", "PKAutoMatch handleToolbarPkClick error");
                        }
                    }
                } else {
                    HOC hoc = new HOC();
                    FragmentActivity LIZIZ2 = C439993ar.LIZIZ(getContext());
                    if (LIZIZ2 != null) {
                        fragmentManager = LIZIZ2.getSupportFragmentManager();
                    }
                    hoc.show(fragmentManager, "PkCancelMatchDialog");
                    this.LJIILLIIL = hoc;
                }
                C9078n c9078n = this.LJIILLIIL;
                if (c9078n != null) {
                    c9078n.setOnDismissListener(onDismissListener);
                }
            } else if (LJIIZILJ()) {
                if (!isViewValid()) {
                    return;
                }
                this.LJFF = C79220HKs.LIZ(this.dataCenter, this).m23760LJ();
                C79915Hen LIZ6 = C79915Hen.LIZ(3, this.LJFF, this.dataCenter, (AbstractC79905Hed) null);
                LIZ6.LIZIZ = true;
                C79220HKs c79220HKs3 = this.LJFF;
                if (c79220HKs3 != null) {
                    c79220HKs3.LIZJ = LIZ6;
                }
                C79220HKs c79220HKs4 = this.LJFF;
                if (c79220HKs4 != null) {
                    Context context2 = this.context;
                    if (context2 != null) {
                        c79220HKs4.show(((FragmentActivity) context2).getSupportFragmentManager(), "LinkDialog");
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
            } else if (this.LIZJ.LJIIL != 0) {
                this.LJFF = C79220HKs.LIZ(this.dataCenter, this).LIZ(7);
                LIZ((DialogInterface.OnDismissListener) null);
                C79220HKs c79220HKs5 = this.LJFF;
                if (c79220HKs5 != null) {
                    Context context3 = this.context;
                    if (context3 != null) {
                        c79220HKs5.show(((FragmentActivity) context3).getSupportFragmentManager(), "LinkDialog");
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
            } else {
                C79615HZx LIZ7 = C79615HZx.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ7, "");
                if (LIZ7.LIZJ()) {
                    this.LJFF = C79220HKs.LIZ(this.dataCenter, this).LIZ(i);
                    C79220HKs c79220HKs6 = this.LJFF;
                    if (c79220HKs6 != null) {
                        Context context4 = this.context;
                        if (context4 != null) {
                            c79220HKs6.show(((FragmentActivity) context4).getSupportFragmentManager(), "LinkDialog");
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                    }
                } else {
                    Room room = this.LJJIII;
                    if (room != null && room.isLiveTypeAudio()) {
                        C4574547f.LIZ().LIZ("livesdk_pk_icon_click", this.LJJIII);
                    }
                    C79864Hdy.LIZJ.LIZIZ();
                    if (!isViewValid()) {
                        return;
                    }
                    C79220HKs c79220HKs7 = this.LJFF;
                    if ((c79220HKs7 == null || !c79220HKs7.isVisible()) && LJIILLIIL()) {
                        this.LJFF = C79220HKs.LIZ(this.dataCenter, this).LIZ(i);
                        C79220HKs c79220HKs8 = this.LJFF;
                        if (c79220HKs8 != null) {
                            Context context5 = this.context;
                            if (context5 != null) {
                                c79220HKs8.show(((FragmentActivity) context5).getSupportFragmentManager(), "LinkDialog");
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                            }
                        }
                    }
                }
                C79220HKs c79220HKs9 = this.LJFF;
                if (c79220HKs9 != null) {
                    c79220HKs9.setOnDismissListener(onDismissListener);
                }
                LIZ(onDismissListener);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.cv$a
    public final void LIZ(int i, DialogInterface.OnDismissListener onDismissListener) {
        LiveMode liveMode;
        AbstractC4256d abstractC4256d;
        int i2;
        int i3;
        int i4;
        PkDataContext LIZ;
        PkDataContext pkDataContext;
        LiveData<AbstractC4256d> liveData;
        int i5 = 0;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), onDismissListener}, this, LIZIZ, false, 15).isSupported) {
            return;
        }
        if (LJIJ()) {
            C88440Kt0.LIZ(2131584305);
            return;
        }
        Room room = this.LJJIII;
        String str = null;
        if (room != null) {
            liveMode = room.getStreamType();
        } else {
            liveMode = null;
        }
        if (liveMode == LiveMode.SCREEN_RECORD && !mo15712LJ()) {
            C88440Kt0.LIZ(LK5.LIZ(2131583480));
            return;
        }
        Room room2 = this.LJJIII;
        if (room2 != null && room2.isPaidLive()) {
            C88440Kt0.LIZ(LK5.LIZ(2131586754));
            return;
        }
        LinkCrossRoomDataHolder.LJII();
        if (IQV.LIZ("PkDataContext", PkDataContext.class) != null && (pkDataContext = (PkDataContext) IQV.LIZ("PkDataContext", PkDataContext.class)) != null && (liveData = pkDataContext.LJIIIZ) != null) {
            abstractC4256d = liveData.getValue();
        } else {
            abstractC4256d = null;
        }
        HashMap hashMap = new HashMap();
        AbstractC4774i LIZ2 = AbstractC78050Gpo.LIZ();
        if (LIZ2 != null) {
            str = String.valueOf(LIZ2.LJJIFFI());
        }
        hashMap.put("current_mode", str);
        if (abstractC4256d != null) {
            hashMap.put("pk_state", abstractC4256d.LIZ);
        }
        C2IN.LIZIZ().LIZ("ttlive_pk", hashMap);
        View view = this.LJIJJ;
        if (view != null && view.getParent() == this.LJIIIIZZ) {
            C79615HZx.LIZ().LIZIZ();
            HSB hsb = new HSB(1);
            hsb.LIZIZ = Boolean.FALSE;
            LinkCrossRoomDataHolder.LJII().LJJIJLIJ = false;
            this.dataCenter.put("cmd_pk_state_change", hsb);
            return;
        }
        int i6 = Build.VERSION.SDK_INT;
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_PK_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (!settingKey.getValue().booleanValue()) {
            SettingKey<String> settingKey2 = LiveConfigSettingKeys.LIVE_PK_DISABLE_TOAST;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            C88440Kt0.LIZ(settingKey2.getValue());
            return;
        }
        Room room3 = this.LJJIII;
        if (room3 != null && room3.getMosaicStatus() == 1) {
            C88440Kt0.LIZ(2131585806);
            return;
        }
        IService service = ServiceManager.getService(IBroadcastService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        if (((IBroadcastService) service).isInDrawGuessGame()) {
            C88440Kt0.LIZ(2131586901);
            return;
        }
        IService service2 = ServiceManager.getService(IBroadcastService.class);
        Intrinsics.checkNotNullExpressionValue(service2, "");
        if (((IBroadcastService) service2).isPlayingGame()) {
            C88440Kt0.LIZ(2131586928);
            return;
        }
        if (HTD.LIZIZ.LIZ() != null && (LIZ = HTD.LIZIZ.LIZ()) != null && LIZ.LJJJLIIL) {
            SettingKey<Boolean> settingKey3 = LiveSettingKeys.PK_SWITCH_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey3, "");
            if (!settingKey3.getValue().booleanValue()) {
                C88440Kt0.LIZ(2131586936);
                return;
            }
        }
        IService service3 = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service3, "");
        if (((IInteractService) service3).getPkService().LIZ()) {
            if (((Number) this.dataCenter.get("data_operational_play_invite_count_down", (String) 0)).intValue() > 0) {
                IService service4 = ServiceManager.getService(IInteractService.class);
                Intrinsics.checkNotNullExpressionValue(service4, "");
                C3BK pkService = ((IInteractService) service4).getPkService();
                Object obj = this.dataCenter.get("data_operational_play_invite_count_down", (String) 0);
                Intrinsics.checkNotNullExpressionValue(obj, "");
                pkService.LIZ(((Number) obj).intValue(), 2);
                return;
            }
            C88440Kt0.LIZ(2131584344);
            return;
        }
        AbstractC4774i LIZ3 = AbstractC78050Gpo.LIZ();
        if (LIZ3 != null && LIZ3.LJJIFFI() == 0) {
            LIZIZ(i, onDismissListener);
        } else if (C79169HIt.LIZIZ(this.LIZLLL, 64)) {
            MultiAnchorLinkWidget multiAnchorLinkWidget = this.LJIILIIL;
            if (multiAnchorLinkWidget != null) {
                multiAnchorLinkWidget.LIZLLL();
            }
        } else if (C79169HIt.LIZIZ(this.LIZLLL, 128)) {
            ScreenLiveLinkWidget screenLiveLinkWidget = this.LJIILL;
            if (screenLiveLinkWidget != null) {
                screenLiveLinkWidget.LIZJ();
            }
        } else if (C79169HIt.LIZIZ(this.LIZLLL, 4)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("room_status", "2pk");
            if (AbstractC4530a.LIZ.LIZIZ()) {
                hashMap2.put("room_status", "random_npk_matching");
            }
            hashMap2.put("channel_id", String.valueOf(LinkCrossRoomDataHolder.LJII().LIZLLL));
            hashMap2.put("anchor_cnt", "2");
            C4574547f.LIZ().LIZ("livesdk_interact_icon_click", hashMap2, this.LJJIII);
            if (AbstractC4530a.LIZ.LIZIZ() && C4566a.LIZJ.LIZ() != null) {
                AbstractC4781u LIZ4 = C4566a.LIZJ.LIZ();
                if (LIZ4 != null) {
                    LIZ4.LIZ(false, "npk_connect");
                }
            } else if (abstractC4256d != null && !(abstractC4256d instanceof AbstractC4256d.C4257a)) {
                LinkCrossRoomNewWidget linkCrossRoomNewWidget = this.LJIIJ;
                if (linkCrossRoomNewWidget != null && (linkCrossRoomNewWidget instanceof LinkCrossRoomAnchorWidget)) {
                    linkCrossRoomNewWidget.LJIIIIZZ();
                }
            } else {
                C88440Kt0.LIZ(2131586989);
            }
        } else {
            AbstractC4774i LIZ5 = AbstractC78050Gpo.LIZ();
            if (LIZ5 != null) {
                i2 = LIZ5.LJJIFFI();
            } else {
                i2 = 0;
            }
            if (C79169HIt.LIZIZ(i2, 16)) {
                C88440Kt0.LIZ(2131585464);
                return;
            }
            AbstractC4775l LIZ6 = AbstractC77921Gnj.LIZ();
            if (LIZ6 != null) {
                i3 = LIZ6.LJJIFFI();
            } else {
                i3 = 0;
            }
            if (C79169HIt.LIZIZ(i3, 32)) {
                C88440Kt0.LIZ(2131587851);
                return;
            }
            AbstractC4774i LIZ7 = AbstractC78050Gpo.LIZ();
            if (LIZ7 != null) {
                i4 = LIZ7.LJJIFFI();
            } else {
                i4 = 0;
            }
            if (C79169HIt.LIZIZ(i4, 2)) {
                IService service5 = ServiceManager.getService(IInteractService.class);
                Intrinsics.checkNotNullExpressionValue(service5, "");
                C3BL interactAudienceService = ((IInteractService) service5).getInteractAudienceService();
                Intrinsics.checkNotNullExpressionValue(interactAudienceService, "");
                if (interactAudienceService.LIZIZ() && !C79179HJd.LIZIZ.LIZJ()) {
                    C88440Kt0.LIZ(2131584293);
                    return;
                } else {
                    LIZIZ(i, onDismissListener);
                    return;
                }
            }
            AbstractC4775l LIZ8 = AbstractC77921Gnj.LIZ();
            if (LIZ8 != null) {
                i5 = LIZ8.LJJIFFI();
            }
            if (C79169HIt.LIZIZ(i5, 8)) {
                C88440Kt0.LIZ(2131587850);
            }
        }
    }

    public LinkRevControlWidget(AbstractC79150HIa abstractC79150HIa, ViewGroup viewGroup, boolean z) {
        C106862S5w.LIZ(abstractC79150HIa);
        this.LJII = abstractC79150HIa;
        this.LJIIIIZZ = viewGroup;
        this.LJIIIZ = z;
        SettingKey<Integer> settingKey = LiveSettingKeys.LIVE_SEI_LOG_FREQUENCY;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        this.LJJIFFI = settingKey.getValue();
        C79404HRu.LIZ();
    }
}
