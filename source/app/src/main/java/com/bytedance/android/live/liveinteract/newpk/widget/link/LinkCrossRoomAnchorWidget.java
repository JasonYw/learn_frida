package com.bytedance.android.live.liveinteract.newpk.widget.link;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.chatroom.p339b.C4271i;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkControlWidget;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.api.LinkPKApi;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p353ui.LinkInRoomMuteView;
import com.bytedance.android.live.liveinteract.newpk.p379vm.C4688b;
import com.bytedance.android.live.liveinteract.newpk.widget.PkAnchorWidget;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4763ad;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4769b;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.android.livesdk.chatroom.event.C5984am;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q;
import com.bytedance.android.livesdk.chatroom.model.C6089a;
import com.bytedance.android.livesdk.chatroom.model.interact.C6173m;
import com.bytedance.android.livesdk.chatroom.model.interact.MultiAnchorLinkmicLiveCoreInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.MultiLiveCoreInfo;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.degrade.IDegradeManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.TeamTaskItemCardInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.Widget;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.p1594ss.avframework.livestreamv2.core.ILayerControl;
import com.p1594ss.avframework.livestreamv2.core.LiveCore;
import com.p1594ss.avframework.livestreamv2.core.interact.model.Config;
import com.p1594ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.p1594ss.avframework.mixer.VideoMixer;
import com.p1594ss.ttm.player.MediaPlayer;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC4569445g;
import p003X.AbstractC78050Gpo;
import p003X.AbstractC79338HPg;
import p003X.AbstractC80293Hkt;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C3BL;
import p003X.C79112HGo;
import p003X.C79169HIt;
import p003X.C79179HJd;
import p003X.C79199HJx;
import p003X.C79204HKc;
import p003X.C79313HOh;
import p003X.C79351HPt;
import p003X.C79398HRo;
import p003X.C79401HRr;
import p003X.C79402HRs;
import p003X.C79405HRv;
import p003X.C79406HRw;
import p003X.C79409HRz;
import p003X.C79417HSh;
import p003X.C79419HSj;
import p003X.C79462HUa;
import p003X.C81921IQp;
import p003X.C87010KQi;
import p003X.C87308Kak;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.HK3;
import p003X.HKK;
import p003X.HKL;
import p003X.HLL;
import p003X.HQ3;
import p003X.HQ9;
import p003X.HS7;
import p003X.HS8;
import p003X.HS9;
import p003X.HSB;
import p003X.HSC;
import p003X.HSD;
import p003X.HSE;
import p003X.HSF;
import p003X.HSH;
import p003X.HTB;
import p003X.LK5;
import p003X.M0Q;
import p003X.M0W;
import p003X.QB4;
import p003X.QKF;
import p003X.View$OnClickListenerC79376HQs;

/* loaded from: classes3.dex */
public final class LinkCrossRoomAnchorWidget extends LinkCrossRoomNewWidget implements AbstractC4769b, AbstractC4569445g {
    public static ChangeQuickRedirect LIZIZ;
    public final C79199HJx LIZJ;
    public final HKK LIZLLL;

    /* renamed from: LJ */
    public HQ9 f26401LJ;
    public final String LJFF;
    public PkAnchorWidget LJI;
    public boolean LJII;
    public final MutableLiveData<LinkCrossRoomDataHolder.LinkState> LJIIIIZZ;
    public final AbstractC6070q LJIIIZ;
    public ViewGroup LJJIIJ;
    public HQ3 LJJIIJZLJL;
    public final HKL LJJIIZ;
    public final C79398HRo LJJIIZI;

    static {
        Covode.recordClassIndex(28862);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4769b
    public final void LIZ(C5176i<C6173m> c5176i, boolean z) {
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4769b
    public final void LIZ(Throwable th, String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{th, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 20).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomNewWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 32).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomNewWidget, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4762ac
    public final void LJII() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 12).isSupported) {
            return;
        }
        super.LJII();
        PkAnchorWidget pkAnchorWidget = this.LJI;
        if (pkAnchorWidget != null) {
            pkAnchorWidget.LIZIZ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4769b
    public final void aa_() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 21).isSupported) {
            return;
        }
        this.LJIIIIZZ.setValue(LinkCrossRoomDataHolder.LinkState.FINISH_SUCCEED);
        LJIIL();
    }

    private final void LJJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 24).isSupported) {
            return;
        }
        if (!LJJI()) {
            C79199HJx c79199HJx = this.LIZJ;
            if (c79199HJx != null) {
                c79199HJx.LJIIIIZZ();
                return;
            }
            return;
        }
        C79199HJx c79199HJx2 = this.LIZJ;
        if (c79199HJx2 != null) {
            c79199HJx2.LJII();
        }
        C79199HJx c79199HJx3 = this.LIZJ;
        if (c79199HJx3 != null) {
            c79199HJx3.LJIIL();
        }
    }

    public final void LIZLLL() {
        Config config;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 4).isSupported) {
            return;
        }
        C79199HJx c79199HJx = this.LIZJ;
        if (c79199HJx != null) {
            config = c79199HJx.LJIIJ();
            if (config != null) {
                config.setSeiVersion(2);
            }
        } else {
            config = null;
        }
        this.LIZLLL.LJI = config;
        if (!(config instanceof InteractConfig)) {
            config = null;
        }
        InteractConfig interactConfig = (InteractConfig) config;
        if (interactConfig != null) {
            interactConfig.setStreamMixer(this.LIZJ);
        }
    }

    /* renamed from: LJ */
    public final void m15720LJ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 5).isSupported && this.LJI == null) {
            enableSubWidgetManager();
            this.LJI = new PkAnchorWidget(this.LJJII, this.LJJIII, LJIILJJIL());
            this.subWidgetManager.load(2131185178, (Widget) this.LJI, false);
        }
    }

    public final void LJI() {
        User user;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 7).isSupported && (user = this.LJIILIIL.LJJJJL) != null) {
            M0Q.LIZ(LJIJJLI(), user.getAvatarMedium(), LK5.LIZJ() / 2, LK5.LIZIZ() / 2, new M0W(8));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomNewWidget, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4762ac
    public final void LJIIIZ() {
        int i = 0;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 15).isSupported) {
            return;
        }
        super.LJIIIZ();
        AbstractC4774i LIZ = AbstractC78050Gpo.LIZ();
        if (LIZ != null) {
            i = LIZ.LJJIFFI();
        }
        boolean LIZIZ2 = C79169HIt.LIZIZ(i, 2);
        HQ9 hq9 = this.f26401LJ;
        if (hq9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            hq9.LIZ(this.LJJII, LIZIZ2 ? 1 : 0);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomNewWidget, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4762ac
    public final void LJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 16).isSupported) {
            return;
        }
        super.LJIIJ();
        PkAnchorWidget pkAnchorWidget = this.LJI;
        if (pkAnchorWidget != null && !PatchProxy.proxy(new Object[0], pkAnchorWidget, PkAnchorWidget.LIZ, false, 12).isSupported) {
            pkAnchorWidget.LIZLLL().m15722LJ();
        }
    }

    public final void LJIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 23).isSupported) {
            return;
        }
        this.LJIIIIZZ.setValue(LinkCrossRoomDataHolder.LinkState.TURN_OFF_ENGINE);
        LJJ();
        this.LJIIIIZZ.setValue(LinkCrossRoomDataHolder.LinkState.TURN_OFF_ENGINE_SUCCEED);
        LJIL();
    }

    private final boolean LJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 25);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (C79179HJd.LIZIZ.LIZ()) {
            IService service = ServiceManager.getService(IInteractService.class);
            Intrinsics.checkNotNullExpressionValue(service, "");
            C3BL interactAudienceService = ((IInteractService) service).getInteractAudienceService();
            Intrinsics.checkNotNullExpressionValue(interactAudienceService, "");
            if (interactAudienceService.LIZIZ()) {
                LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
                Intrinsics.checkNotNullExpressionValue(LJII, "");
                if (LJII.LJLJJLL != null) {
                    LinkCrossRoomDataHolder LJII2 = LinkCrossRoomDataHolder.LJII();
                    Intrinsics.checkNotNullExpressionValue(LJII2, "");
                    C79112HGo c79112HGo = LJII2.LJLJJLL;
                    if (c79112HGo != null && c79112HGo.LIZIZ) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void LIZJ() {
        boolean z;
        LiveCore liveCore;
        ILayerControl layerControl;
        ILayerControl.ILayer localOriginLayer;
        Boolean bool;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 1).isSupported) {
            return;
        }
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null && (bool = (Boolean) dataCenter.get("cmd_what_audience_join_self_link", (String) Boolean.FALSE)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        float f = 1.0f - ((float) (HKK.LIZLLL / HKK.LIZJ));
        AbstractC6070q abstractC6070q = this.LJIIIZ;
        if (abstractC6070q != null && (liveCore = abstractC6070q.getLiveCore()) != null && (layerControl = liveCore.getLayerControl()) != null && (localOriginLayer = layerControl.getLocalOriginLayer()) != null) {
            VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
            videoMixerDescription.setLeft(0.0f);
            videoMixerDescription.setTop(0.0f);
            videoMixerDescription.setRight(0.5f);
            if (!z) {
                f = 1.0f;
            }
            videoMixerDescription.setBottom(f);
            videoMixerDescription.setzOrder(0);
            videoMixerDescription.setVisibility(true);
            videoMixerDescription.setMode(2);
            localOriginLayer.updateDescription(videoMixerDescription);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomNewWidget, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4762ac
    public final void LJIIJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 17).isSupported) {
            return;
        }
        super.LJIIJ();
        PkAnchorWidget pkAnchorWidget = this.LJI;
        if (pkAnchorWidget != null && !PatchProxy.proxy(new Object[0], pkAnchorWidget, PkAnchorWidget.LIZ, false, 13).isSupported) {
            C4688b LIZLLL = pkAnchorWidget.LIZLLL();
            if (!PatchProxy.proxy(new Object[0], LIZLLL, C4688b.LIZ, false, 18).isSupported && !LIZLLL.LIZJ) {
                C4688b.LIZ(LIZLLL, 0, 1, null);
                LIZLLL.LIZJ = true;
            }
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onPause() {
        Object obj;
        C79199HJx c79199HJx;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 10).isSupported) {
            return;
        }
        super.onPause();
        C79199HJx c79199HJx2 = this.LIZJ;
        if (c79199HJx2 != null) {
            c79199HJx2.LIZIZ(false);
        }
        if (!this.LJII) {
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.PK_ANCHOR_BACKGROUND_OPT;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                DataCenter dataCenter = this.dataCenter;
                if (dataCenter != null) {
                    obj = dataCenter.get("cmd_what_audience_join_self_link", (String) Boolean.FALSE);
                } else {
                    obj = null;
                }
                if ((!Intrinsics.areEqual(obj, Boolean.TRUE)) && (c79199HJx = this.LIZJ) != null) {
                    c79199HJx.LIZ(true);
                }
            }
            LJIILL().LIZ(false, this.LJIILIIL.LJIILL);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        C79199HJx c79199HJx;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 9).isSupported) {
            return;
        }
        super.onResume();
        C79199HJx c79199HJx2 = this.LIZJ;
        if (c79199HJx2 != null) {
            c79199HJx2.LIZIZ(true);
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.PK_ANCHOR_BACKGROUND_OPT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue() && (c79199HJx = this.LIZJ) != null) {
            c79199HJx.LIZ(false);
        }
        LJIILL().LIZ(true, this.LJIILIIL.LJIILL);
    }

    private final void LJIL() {
        boolean z;
        boolean z2 = false;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 11).isSupported) {
            return;
        }
        HSB hsb = new HSB(1);
        PkAnchorWidget pkAnchorWidget = this.LJI;
        ViewGroup viewGroup = null;
        if (pkAnchorWidget != null) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], pkAnchorWidget, PkAnchorWidget.LIZ, false, 15);
            if (proxy.isSupported) {
                viewGroup = (ViewGroup) proxy.result;
            } else if (pkAnchorWidget.LJIILIIL.LJIJJLI == 1 && pkAnchorWidget.LJIILIIL.LJIIJJI > 0) {
                if ((pkAnchorWidget.LJIILIIL.LJIIJJI * 1000) + pkAnchorWidget.LJIILIIL.LJIILIIL > System.currentTimeMillis()) {
                    z = true;
                } else {
                    z = false;
                }
                if (pkAnchorWidget.LJIILIIL.LJJIII) {
                    if (pkAnchorWidget.LJIILIIL.LJJIJL) {
                        Context context = pkAnchorWidget.context;
                        Room room = pkAnchorWidget.LJIILJJIL;
                        DataCenter dataCenter = pkAnchorWidget.dataCenter;
                        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
                        viewGroup = new C79419HSj(context, room, dataCenter);
                    }
                } else if (z) {
                    C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.f6946C;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                    Integer LIZ = c87308Kak.LIZ();
                    if (LIZ == null || LIZ.intValue() != 1) {
                        Context context2 = pkAnchorWidget.getContext();
                        Room room2 = pkAnchorWidget.LJIILJJIL;
                        DataCenter dataCenter2 = pkAnchorWidget.dataCenter;
                        Intrinsics.checkNotNullExpressionValue(dataCenter2, "");
                        viewGroup = new C79417HSh(context2, room2, dataCenter2);
                    }
                }
            }
        }
        this.LJJIIJ = viewGroup;
        if (this.LJJIIJ != null) {
            z2 = true;
        }
        hsb.LIZIZ = Boolean.valueOf(z2);
        this.dataCenter.put("cmd_pk_state_change", hsb);
        C87010KQi.LIZ().LIZ(new C4271i(2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00eb, code lost:
        if (r4 != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LJFF() {
        /*
            r6 = this;
            r5 = 0
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomAnchorWidget.LIZIZ
            r0 = 6
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r6, r1, r5, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto Lf
            return
        Lf:
            android.view.View r0 = r6.contentView
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            p003X.LK1.LIZJ(r0)
            androidx.constraintlayout.widget.Guideline r3 = r6.LJIILLIIL()
            if (r3 == 0) goto L29
            int r1 = r6.LJIILLIIL
            int r0 = p003X.LK5.m23418LJ()
            int r1 = r1 + r0
            r3.setGuidelineBegin(r1)
        L29:
            android.view.View r0 = r6.LJIIZILJ()
            if (r0 == 0) goto L37
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r0 = r6.LJIIZILJ
            r1.height = r0
        L37:
            X.HK2 r0 = com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4763ad.LIZ
            com.bytedance.android.live.liveinteract.plantform.a.ad r1 = r0.LIZ()
            if (r1 == 0) goto Le5
            X.HJx r0 = r1.LIZ()
            if (r0 == 0) goto Le5
            boolean r0 = r0.LJIIIIZZ
            r4 = 1
            if (r0 != r4) goto Le5
            X.HJx r0 = r1.LIZ()
            if (r0 == 0) goto Le2
            com.ss.avframework.livestreamv2.core.interact.model.Config r0 = r0.LJIIJ()
            if (r0 == 0) goto Le2
            boolean r0 = r0.isSingleViewMode()
            if (r0 != r4) goto Le2
        L5c:
            r6.LIZJ()
        L5f:
            com.bytedance.android.live.liveinteract.newpk.widget.PkAnchorWidget r3 = r6.LJI
            if (r3 == 0) goto L6f
            int r1 = r6.LJIILLIIL
            int r0 = p003X.LK5.m23418LJ()
            int r1 = r1 + r0
            int r0 = r6.LJIIZILJ
            r3.LIZ(r1, r0)
        L6f:
            X.HSB r3 = new X.HSB
            r3.<init>(r5)
            X.4Br r0 = r6.LJIILJJIL()
            if (r0 == 0) goto Le0
            boolean r0 = r0.LIZIZ()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L82:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lcd
            int r1 = r6.LJIIZILJ
            int r0 = r6.LJIILLIIL
            int r1 = r1 + r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.LIZIZ = r0
        L93:
            r3.LIZJ = r4
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r6.dataCenter
            if (r1 == 0) goto L9e
            java.lang.String r0 = "cmd_pk_state_change"
            r1.put(r0, r3)
        L9e:
            boolean r0 = p003X.G22.LIZLLL()
            if (r0 == 0) goto Lad
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r6.dataCenter
            if (r1 == 0) goto Lad
            java.lang.String r0 = "cmd_pk_state_change_fold_screen"
            r1.put(r0, r2)
        Lad:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "marginTop: "
            r1.<init>(r0)
            int r0 = r6.LJIILLIIL
            r1.append(r0)
            java.lang.String r0 = ", streamHeight: "
            r1.append(r0)
            int r0 = r6.LJIIZILJ
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "adjustUiToVideoPosition"
            r6.LIZ(r0, r1)
            return
        Lcd:
            int r1 = r6.LJIIZILJ
            int r0 = r6.LJIILLIIL
            int r1 = r1 + r0
            r0 = 48
            int r0 = p003X.LK1.LIZLLL(r0)
            int r1 = r1 + r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.LIZIZ = r0
            goto L93
        Le0:
            r0 = 0
            goto L82
        Le2:
            r4 = 0
            goto L5f
        Le5:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r6.LJIIJJI
            boolean r4 = p003X.HJG.LIZ(r0)
            if (r4 == 0) goto L5f
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomAnchorWidget.LJFF():void");
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomNewWidget, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4762ac
    public final void LJIIIIZZ() {
        String str;
        Room room;
        HTB htb;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 14).isSupported) {
            return;
        }
        super.LJIIIIZZ();
        PkAnchorWidget pkAnchorWidget = this.LJI;
        if (pkAnchorWidget != null && !PatchProxy.proxy(new Object[0], pkAnchorWidget, PkAnchorWidget.LIZ, false, 4).isSupported && (!Intrinsics.areEqual(pkAnchorWidget.LIZLLL().LJIIIZ.getValue(), AbstractC4256d.C4257a.LIZIZ))) {
            SettingKey<Boolean> settingKey = LiveSettingKeys.PK_SWITCH_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue() && (room = pkAnchorWidget.LJIILJJIL) != null && !room.isLiveTypeAudio()) {
                HSH hsh = HTB.LJIILLIIL;
                Room room2 = pkAnchorWidget.LJIILJJIL;
                DataCenter dataCenter = pkAnchorWidget.dataCenter;
                boolean z = pkAnchorWidget.LIZLLL().f26381LJ;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{room2, dataCenter, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, hsh, HSH.LIZ, false, 1);
                if (proxy.isSupported) {
                    htb = (HTB) proxy.result;
                } else {
                    htb = new HTB();
                    htb.LJI = room2;
                    htb.LJIIIIZZ = dataCenter;
                    htb.LJIIJ = z;
                }
                htb.LIZLLL = new HSC(pkAnchorWidget);
                htb.LIZJ = new HSE(pkAnchorWidget);
                htb.LIZIZ = new HS8(pkAnchorWidget);
                htb.f6819LJ = View$OnClickListenerC79376HQs.LIZIZ;
                htb.LJFF = new HS7(pkAnchorWidget);
                pkAnchorWidget.LIZIZ = htb;
            } else {
                if (pkAnchorWidget.LJIILIIL.LJIIJJI == 0) {
                    str = C79462HUa.LJIIL;
                } else {
                    str = C79462HUa.LJIIJJI;
                }
                C79462HUa LIZ = C79462HUa.LJIILIIL.LIZ(true, pkAnchorWidget.LJIILJJIL, str, pkAnchorWidget.dataCenter, null);
                if (LIZ != null) {
                    LIZ.LIZIZ = new HS9(pkAnchorWidget);
                    LIZ.LIZJ = new HSF(pkAnchorWidget);
                    LIZ.LIZLLL = new HSD(pkAnchorWidget);
                }
                pkAnchorWidget.LIZIZ = LIZ;
            }
            C9078n c9078n = pkAnchorWidget.LIZIZ;
            if (c9078n != null) {
                Context context = pkAnchorWidget.context;
                if (context != null) {
                    c9078n.show(((FragmentActivity) context).getSupportFragmentManager(), C79462HUa.LJIIJ);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomNewWidget, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4762ac
    public final void LJIILIIL() {
        boolean z;
        int i;
        String str;
        TeamTaskItemCardInfo teamTaskItemCardInfo;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 27).isSupported) {
            return;
        }
        super.LJIILIIL();
        PkAnchorWidget pkAnchorWidget = this.LJI;
        if (pkAnchorWidget != null && !PatchProxy.proxy(new Object[0], pkAnchorWidget, PkAnchorWidget.LIZ, false, 16).isSupported) {
            C4688b LIZLLL = pkAnchorWidget.LIZLLL();
            if (!PatchProxy.proxy(new Object[0], LIZLLL, C4688b.LIZ, false, 20).isSupported && LIZLLL.LJJJJJ != null) {
                SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_MESSAGE_STREAM_ENABLE;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                int i2 = 1;
                if (value.booleanValue() && (teamTaskItemCardInfo = LIZLLL.LJJJJJ) != null && teamTaskItemCardInfo.LIZ == TeamTaskItemCardInfo.ItemCardType.TypeEffect.ordinal()) {
                    z = true;
                } else {
                    z = false;
                }
                JSONObject jSONObject = new JSONObject();
                if (!z) {
                    i2 = 0;
                }
                try {
                    jSONObject.put("need_cache", i2);
                    jSONObject.put("time_stamp", QKF.LIZ());
                } catch (JSONException unused) {
                    ALogger.m15801d("PkDataContext", "requestUseCard");
                }
                long currentTimeMillis = System.currentTimeMillis();
                LinkPKApi linkPKApi = (LinkPKApi) C88306Kqq.LIZ().LIZ(LinkPKApi.class);
                long j = LIZLLL.LJII.LIZLLL;
                long j2 = LIZLLL.LJII.f26249LJ;
                TeamTaskItemCardInfo teamTaskItemCardInfo2 = LIZLLL.LJJJJJ;
                if (teamTaskItemCardInfo2 != null) {
                    i = teamTaskItemCardInfo2.LIZ;
                } else {
                    i = 0;
                }
                TeamTaskItemCardInfo teamTaskItemCardInfo3 = LIZLLL.LJJJJJ;
                if (teamTaskItemCardInfo3 != null) {
                    str = teamTaskItemCardInfo3.LIZJ;
                } else {
                    str = null;
                }
                QB4.LIZ(linkPKApi.useRewardCard(j, j2, i, str, jSONObject.toString()).compose(C100839PnV.LIZJ()).subscribe(new C79406HRw(currentTimeMillis), new C79401HRr<>(currentTimeMillis)), LIZLLL.LJJLIIIJJI);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomNewWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        AbstractC6070q abstractC6070q;
        LiveCore liveCore;
        ILayerControl layerControl;
        ILayerControl.ILayer localOriginLayer;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 8).isSupported) {
            return;
        }
        HKK hkk = this.LIZLLL;
        if (hkk != null) {
            hkk.LIZ();
        }
        super.onDestroy();
        HQ3 hq3 = this.LJJIIJZLJL;
        if (hq3 != null && !PatchProxy.proxy(new Object[0], hq3, HQ3.LIZ, false, 2).isSupported) {
            hq3.LIZLLL.LIZIZ(hq3);
            C79199HJx c79199HJx = hq3.f6793LJ;
            if (c79199HJx != null) {
                c79199HJx.LIZIZ(hq3.LIZJ);
            }
        }
        this.dataCenter.put("cmd_interact_state_change", new C5984am(8));
        HQ9 hq9 = this.f26401LJ;
        if (hq9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            hq9.LIZIZ(this);
        }
        HQ9 hq92 = this.f26401LJ;
        if (hq92 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            hq92.LIZ();
        }
        C79199HJx c79199HJx2 = this.LIZJ;
        if (c79199HJx2 != null) {
            c79199HJx2.LIZIZ(this.LJJIIZI);
        }
        C79199HJx c79199HJx3 = this.LIZJ;
        if (c79199HJx3 != null && c79199HJx3.LJIIIIZZ && !this.LJII) {
            LJJ();
            this.LJIIIIZZ.setValue(LinkCrossRoomDataHolder.LinkState.TURN_OFF_ENGINE_SUCCEED);
        }
        if (LinkCrossRoomDataHolder.LinkState.FINISH_SUCCEED.compareTo(this.LJIIIIZZ.getValue()) <= 0 && !this.LJII) {
            LIZ("finish_pk");
        }
        IDegradeManager iDegradeManager = (IDegradeManager) ServiceManager.getService(IDegradeManager.class);
        if (iDegradeManager != null) {
            iDegradeManager.unregisterDegradeTask(MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_DIR);
        }
        HSB hsb = new HSB(3);
        if (!this.LJII) {
            hsb.LIZIZ = this.LJJIIJ;
            this.LJIILIIL.LJI();
            AbstractC79338HPg LIZ = AbstractC79338HPg.LIZ.LIZ();
            if (LIZ != null) {
                LIZ.LJFF();
            }
        }
        LIZ("LinkCrossRoomAnchorWidget onDestroy", "isSwitchToAnchor: " + this.LJII + ", object: " + hsb.LIZIZ);
        if (hsb.LIZIZ == null && (abstractC6070q = this.LJIIIZ) != null && (liveCore = abstractC6070q.getLiveCore()) != null && (layerControl = liveCore.getLayerControl()) != null && (localOriginLayer = layerControl.getLocalOriginLayer()) != null) {
            VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
            videoMixerDescription.setLeft(0.0f);
            videoMixerDescription.setTop(0.0f);
            videoMixerDescription.setRight(1.0f);
            videoMixerDescription.setBottom(1.0f);
            videoMixerDescription.setzOrder(0);
            videoMixerDescription.setVisibility(true);
            videoMixerDescription.setMode(2);
            localOriginLayer.updateDescription(videoMixerDescription);
        }
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("cmd_pk_state_change", hsb);
        }
        this.dataCenter.put("data_pk_match_state", 0);
        this.LJJIFFI.dispose();
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomNewWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        LinkInRoomMuteView LJIJJ;
        Map<String, Object> map;
        Map<String, Object> LIZJ;
        int i = 0;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 2).isSupported) {
            return;
        }
        super.onCreate();
        C79199HJx c79199HJx = this.LIZJ;
        if (c79199HJx != null && c79199HJx.LJIIIIZZ) {
            this.LIZLLL.LJI = this.LIZJ.LJIIJ();
            HKK hkk = this.LIZLLL;
            if (!PatchProxy.proxy(new Object[0], hkk, HKK.LIZ, false, 1).isSupported) {
                hkk.LJII = new HLL();
            }
        }
        MutableLiveData<LinkCrossRoomDataHolder.LinkState> mutableLiveData = this.LJIIIIZZ;
        if (mutableLiveData != null) {
            mutableLiveData.observeForever(new C79409HRz(this));
        }
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        this.f26401LJ = new HQ9(dataCenter, 1);
        HQ9 hq9 = this.f26401LJ;
        if (hq9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            hq9.LIZ(this);
        }
        DataCenter dataCenter2 = this.dataCenter;
        if (dataCenter2 != null) {
            dataCenter2.put("cmd_link_cross_room_before_start_pk", "");
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 3).isSupported) {
            QB4.LIZ(LJIILL().LIZ().LIZIZ().subscribe(new C79204HKc(this)), this.LJJIFFI);
            QB4.LIZ(LJIILL().LIZIZ().LIZIZ().subscribe(new C79405HRv(this)), this.LJJIFFI);
            QB4.LIZ(LJIILL().LIZJ().LIZIZ().subscribe(new C81921IQp(this)), this.LJJIFFI);
            QB4.LIZ(LJIILL().LIZLLL().LIZIZ().subscribe(new C79351HPt(this)), this.LJJIFFI);
        }
        HQ9 hq92 = this.f26401LJ;
        if (hq92 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        this.LJJIIJZLJL = new HQ3(hq92, this.LIZJ);
        HQ3 hq3 = this.LJJIIJZLJL;
        if (hq3 != null && !PatchProxy.proxy(new Object[0], hq3, HQ3.LIZ, false, 1).isSupported) {
            hq3.LIZLLL.LIZ(hq3);
            C79199HJx c79199HJx2 = hq3.f6793LJ;
            if (c79199HJx2 != null) {
                c79199HJx2.LIZ(hq3.LIZJ);
            }
        }
        C79199HJx c79199HJx3 = this.LIZJ;
        if (c79199HJx3 != null) {
            c79199HJx3.LIZ(this.LJJIIZI);
        }
        this.LJIILLIIL = (int) (((LJIILJJIL().LIZJ * 1.0f) / 360.0f) * 108.0d);
        this.LJIIZILJ = (int) (((LJIILJJIL().LIZJ * 0.5f) / 9.0f) * 13.0f);
        if (this.LJIILIIL.LJIIIZ || this.LJIILIIL.LJJZ) {
            LJIJJ().setAnchorAndInit(true);
            LJI();
            m15720LJ();
            LJFF();
        }
        C79199HJx c79199HJx4 = this.LIZJ;
        Boolean bool = null;
        if (c79199HJx4 != null && c79199HJx4.LJIIIIZZ) {
            this.LIZJ.LIZ(Config.InteractMode.PK);
            this.LJJIIZI.mo15698Z_();
            C79199HJx c79199HJx5 = this.LIZJ;
            if (c79199HJx5 != null && (LIZJ = c79199HJx5.LIZJ()) != null && LIZJ.containsKey(LinkCrossRoomDataHolder.LJII().LJIIIIZZ)) {
                LIZLLL();
            }
            this.LIZJ.LIZ(this.LIZLLL);
            C79199HJx c79199HJx6 = this.LIZJ;
            if (c79199HJx6 != null) {
                map = c79199HJx6.LIZJ();
            } else {
                map = null;
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (!TextUtils.equals(entry.getKey(), this.LJFF)) {
                    this.LJJIIZI.LIZIZ(entry.getKey());
                    if (entry.getValue() instanceof SurfaceView) {
                        this.LJJIIZI.LIZIZ(entry.getKey(), (SurfaceView) entry.getValue(), 0, 0);
                    } else if (entry.getValue() instanceof ILayerControl.ILayer) {
                        this.LJJIIZI.LIZ(entry.getKey(), (ILayerControl.ILayer) entry.getValue(), 0, 0);
                    } else if (entry.getValue() instanceof TextureView) {
                        this.LJJIIZI.LIZIZ(entry.getKey(), (TextureView) entry.getValue(), 0, 0);
                    }
                }
            }
        } else {
            this.LJIIIIZZ.setValue(LinkCrossRoomDataHolder.LinkState.SELF_JOIN);
            AbstractC4774i LIZ = AbstractC78050Gpo.LIZ();
            if (LIZ != null) {
                i = LIZ.LJJIFFI();
            }
            boolean LIZIZ2 = C79169HIt.LIZIZ(i, 2);
            HQ9 hq93 = this.f26401LJ;
            if (hq93 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                hq93.LIZ(this.LJJII, LIZIZ2 ? 1 : 0);
            }
        }
        DataCenter dataCenter3 = this.dataCenter;
        if (dataCenter3 != null) {
            dataCenter3.observeForever("data_interact_anchor_param_change", this);
        }
        DataCenter dataCenter4 = this.dataCenter;
        if (dataCenter4 != null) {
            dataCenter4.observeForever("cmd_what_audience_join_self_link", this);
        }
        DataCenter dataCenter5 = this.dataCenter;
        if (dataCenter5 != null) {
            dataCenter5.observeForever("cmd_what_audience_join_guest_link", this);
        }
        C79199HJx c79199HJx7 = this.LIZJ;
        if (c79199HJx7 != null && c79199HJx7.LJIIIIZZ) {
            C79199HJx c79199HJx8 = this.LIZJ;
            if (c79199HJx8 != null) {
                String str = this.LJIILIIL.LJIIIIZZ;
                if (str == null) {
                    str = "";
                }
                bool = Boolean.valueOf(c79199HJx8.LIZLLL(str));
            }
            if (bool.booleanValue() && (LJIJJ = LJIJJ()) != null) {
                LJIJJ.setMute(true);
            }
        }
        LinkInRoomMuteView LJIJJ2 = LJIJJ();
        if (LJIJJ2 != null) {
            LJIJJ2.setMuteStateChangeListener(new HK3(this));
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_PK_MIX_TYPE_DEGRADE_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            IDegradeManager iDegradeManager = (IDegradeManager) ServiceManager.getService(IDegradeManager.class);
            C79402HRs c79402HRs = new C79402HRs();
            if (iDegradeManager != null) {
                iDegradeManager.registerDegradeTask(MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_DIR, c79402HRs);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomNewWidget, androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        onChanged((KVData) obj);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4769b
    public final void LIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZIZ, false, 19).isSupported) {
            return;
        }
        LJIL();
    }

    public static final /* synthetic */ HQ9 LIZ(LinkCrossRoomAnchorWidget linkCrossRoomAnchorWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{linkCrossRoomAnchorWidget}, null, LIZIZ, true, 31);
        if (proxy.isSupported) {
            return (HQ9) proxy.result;
        }
        HQ9 hq9 = linkCrossRoomAnchorWidget.f26401LJ;
        if (hq9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return hq9;
    }

    public final void LIZ(Integer num) {
        MultiLiveCoreInfo multiLiveCoreInfo;
        MultiAnchorLinkmicLiveCoreInfo multiAnchorLinkmicLiveCoreInfo;
        Map<Long, String> map;
        String str;
        C79199HJx c79199HJx;
        if (PatchProxy.proxy(new Object[]{num}, this, LIZIZ, false, 30).isSupported) {
            return;
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.PK_PUSH_STREAM_OPT_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (settingKey.getValue().booleanValue() && (multiLiveCoreInfo = this.LJIILIIL.LJLILLLLZI) != null && (multiAnchorLinkmicLiveCoreInfo = multiLiveCoreInfo.multiAnchorLiveCoreInfo) != null && (map = multiAnchorLinkmicLiveCoreInfo.liveCoreExtInfoMap) != null && (str = map.get(2L)) != null && (c79199HJx = this.LIZJ) != null) {
            c79199HJx.LIZ(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4769b
    /* renamed from: a_ */
    public final void mo15701a_(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZIZ, false, 22).isSupported) {
            return;
        }
        if (th instanceof ApiServerException) {
            ApiServerException apiServerException = (ApiServerException) th;
            if (apiServerException.mErrorCode == 4004266) {
                C88440Kt0.LIZ(apiServerException.mPrompt);
                C79313HOh c79313HOh = C79313HOh.f6779LJ;
                Exception exc = (Exception) th;
                if (!PatchProxy.proxy(new Object[]{c79313HOh, exc, (byte) 0, null, 6, null}, null, C79313HOh.LIZLLL, true, 37).isSupported) {
                    c79313HOh.LIZ(exc, true, (String) null);
                    return;
                }
                return;
            }
        }
        this.LJIIIIZZ.setValue(LinkCrossRoomDataHolder.LinkState.FINISH_SUCCEED);
        LJIIL();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4769b
    public final void LIZ(C5176i<C6089a> c5176i) {
        PkAnchorWidget pkAnchorWidget;
        if (PatchProxy.proxy(new Object[]{c5176i}, this, LIZIZ, false, 18).isSupported) {
            return;
        }
        C106862S5w.LIZ(c5176i);
        this.LJIIIIZZ.setValue(LinkCrossRoomDataHolder.LinkState.SELF_JOIN_SUCCEED);
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            dataCenter.put("cmd_interact_state_change", new C5984am(7));
        }
        C79199HJx c79199HJx = this.LIZJ;
        if (c79199HJx != null) {
            c79199HJx.LIZ(this.LJIIIZ, this.LJJIIZ, true, true);
        }
        this.LJIIIIZZ.setValue(LinkCrossRoomDataHolder.LinkState.TURN_ON_ENGINE);
        this.dataCenter.put("data_join_channel_finished", LinkCrossRoomDataHolder.LinkState.TURN_ON_ENGINE);
        Boolean bool = null;
        if (this.LJIILIIL.LJLJLJ && (pkAnchorWidget = this.LJI) != null && !PatchProxy.proxy(new Object[0], pkAnchorWidget, PkAnchorWidget.LIZ, false, 14).isSupported) {
            C4688b LIZLLL = pkAnchorWidget.LIZLLL();
            if (!PatchProxy.proxy(new Object[0], LIZLLL, C4688b.LIZ, false, 19).isSupported && LIZLLL.LJII.LJL) {
                if (!LIZLLL.LIZJ) {
                    C4688b.LIZ(LIZLLL, 0, 1, null);
                    LIZLLL.LIZJ = true;
                }
                LIZLLL.LJII.LJL = false;
            }
        }
        boolean z = this.LJIIL;
        C79199HJx c79199HJx2 = this.LIZJ;
        if (c79199HJx2 != null) {
            bool = c79199HJx2.LJIIJJI();
        }
        LinkControlWidget.LIZ(PushConstants.URI_PACKAGE_NAME, z, Intrinsics.areEqual(bool, Boolean.TRUE));
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomNewWidget
    public final void LIZ(KVData kVData) {
        String key;
        String str;
        C79199HJx c79199HJx;
        Boolean bool;
        int i;
        int i2;
        Boolean bool2;
        int i3;
        int i4 = 0;
        if (PatchProxy.proxy(new Object[]{kVData}, this, LIZIZ, false, 26).isSupported) {
            return;
        }
        super.onChanged(kVData);
        if (kVData != null && (key = kVData.getKey()) != null) {
            int hashCode = key.hashCode();
            if (hashCode != -861452840) {
                if (hashCode != 1080946897) {
                    if (hashCode == 2140954685 && key.equals("cmd_what_audience_join_self_link")) {
                        if (kVData == null || (bool2 = (Boolean) kVData.getData(Boolean.FALSE)) == null) {
                            bool2 = Boolean.FALSE;
                        }
                        Intrinsics.checkNotNullExpressionValue(bool2, "");
                        boolean booleanValue = bool2.booleanValue();
                        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 29).isSupported) {
                            View view = this.contentView;
                            Intrinsics.checkNotNullExpressionValue(view, "");
                            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                            if (layoutParams.width == -1) {
                                i3 = LK5.LIZJ();
                            } else {
                                i3 = layoutParams.width;
                            }
                            ViewGroup.LayoutParams layoutParams2 = LJIJ().getLayoutParams();
                            if (layoutParams2 != null) {
                                ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
                                if (booleanValue) {
                                    i4 = i3 / 4;
                                }
                                layoutParams3.bottomMargin = i4;
                                LJIJ().setLayoutParams(layoutParams3);
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
                        }
                    }
                } else if (key.equals("cmd_what_audience_join_guest_link")) {
                    if (kVData == null || (bool = (Boolean) kVData.getData(Boolean.FALSE)) == null) {
                        bool = Boolean.FALSE;
                    }
                    Intrinsics.checkNotNullExpressionValue(bool, "");
                    boolean booleanValue2 = bool.booleanValue();
                    if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue2 ? (byte) 1 : (byte) 0)}, this, LIZIZ, false, 28).isSupported) {
                        View view2 = this.contentView;
                        Intrinsics.checkNotNullExpressionValue(view2, "");
                        ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                        if (layoutParams4.width == -1) {
                            i = LK5.LIZJ();
                        } else {
                            i = layoutParams4.width;
                        }
                        ViewGroup.LayoutParams layoutParams5 = LJIJI().getLayoutParams();
                        if (layoutParams5 != null) {
                            ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                            if (booleanValue2) {
                                i2 = i / 4;
                            } else {
                                i2 = 0;
                            }
                            layoutParams6.bottomMargin = i2;
                            LJIJI().setLayoutParams(layoutParams6);
                            View view3 = this.contentView;
                            Intrinsics.checkNotNullExpressionValue(view3, "");
                            View findViewById = view3.findViewById(2131196958);
                            Intrinsics.checkNotNullExpressionValue(findViewById, "");
                            ViewGroup.LayoutParams layoutParams7 = findViewById.getLayoutParams();
                            if (layoutParams7 != null) {
                                ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
                                if (booleanValue2) {
                                    i4 = i / 4;
                                }
                                layoutParams8.bottomMargin = i4;
                                findViewById.setLayoutParams(layoutParams8);
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
                    }
                }
            } else if (key.equals("data_interact_anchor_param_change") && kVData != null && (str = (String) kVData.getData()) != null && (c79199HJx = this.LIZJ) != null) {
                c79199HJx.LIZJ(str);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.widget.link.LinkCrossRoomNewWidget, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4762ac
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (this.LJIIIIZZ.getValue() == LinkCrossRoomDataHolder.LinkState.FINISH) {
            return;
        }
        this.LJIIIIZZ.setValue(LinkCrossRoomDataHolder.LinkState.FINISH);
        HQ9 hq9 = this.f26401LJ;
        if (hq9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            hq9.LIZ(this.LJJII, str);
        }
    }

    public LinkCrossRoomAnchorWidget(AbstractC6070q abstractC6070q, long j, long j2) {
        super(j, j2);
        C79199HJx c79199HJx;
        this.LJIIIZ = abstractC6070q;
        AbstractC4763ad LIZ = AbstractC4763ad.LIZ.LIZ();
        if (LIZ != null) {
            c79199HJx = LIZ.LIZ();
        } else {
            c79199HJx = null;
        }
        this.LIZJ = c79199HJx;
        this.LIZLLL = new HKK(Config.VideoQuality.ANCHOR_NORMAL);
        this.LJFF = LinkCrossRoomDataHolder.LJII().LJIILL;
        this.LJIIIIZZ = new MutableLiveData<>();
        this.LJJIIZ = new HKL(this);
        this.LJJIIZI = new C79398HRo(this, j);
    }
}
