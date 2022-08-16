package com.bytedance.android.live.broadcast;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.live.broadcast.api.AbstractC2879d;
import com.bytedance.android.live.broadcast.api.AbstractC2891l;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.IXTBroadcastService;
import com.bytedance.android.live.broadcast.api.model.ScheduledSettingInfo;
import com.bytedance.android.live.broadcast.api.p255g.AbstractC2884d;
import com.bytedance.android.live.broadcast.api.p255g.AbstractC2885g;
import com.bytedance.android.live.broadcast.preview.LivePreviewContainerFragment;
import com.bytedance.android.live.core.broadcast.IBroadcastCoreService;
import com.bytedance.android.live.core.widget.AbstractC4165j;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdkapi.AbstractC9586k;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.android.livesdkapi.config.FastStartLiveConfig;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.depend.model.p771a.C9477q;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC100959PpR;
import p003X.AbstractC134734bzd;
import p003X.AbstractC146440f2w;
import p003X.AbstractC412322Tq;
import p003X.AbstractC426222tk;
import p003X.AbstractC80428Hn4;
import p003X.AbstractC81935IRd;
import p003X.AbstractC81939IRh;
import p003X.AbstractC81969ISl;
import p003X.AbstractC86420K3q;
import p003X.AbstractC86539K8f;
import p003X.AbstractC86584K9y;
import p003X.AbstractC86810KIq;
import p003X.AbstractC87170KWm;
import p003X.AbstractC89439LLt;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C2FC;
import p003X.C2WC;
import p003X.C427772wF;
import p003X.C86540K8g;
import p003X.C86748KGg;
import p003X.C87169KWl;
import p003X.C89046L6q;
import p003X.E78;
import p003X.GN7;
import p003X.HCC;
import p003X.HFT;
import p003X.HGX;
import p003X.HKC;
import p003X.K06;
import p003X.K2Z;
import p003X.K7G;
import p003X.K8A;
import p003X.K8Q;
import p003X.K8R;
import p003X.LKD;

/* loaded from: classes5.dex */
public class BroadcastService implements IBroadcastService, IBroadcastCoreService {
    public static final K8Q Companion;
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final AbstractC86539K8f diComponent;
    public AbstractC2862ah bgBroadcastGameService;
    public AbstractC2863ai broadcastCommonService;
    public AbstractC2864aj broadcastEffectService;
    public AbstractC2865ak broadcastFloatWindowService;
    public AbstractC2867am broadcastLiveCoreService;
    public AbstractC2868an broadcastPreviewBaseService;
    public AbstractC2872ao broadcastPreviewService;
    public AbstractC2928aq broadcastRoomCoreService;
    public AbstractC2929ar broadcastStartLiveService;
    public AbstractC2930as broadcastStartLiveVisibilityService;
    public AbstractC2931at broadcastXTMediaService;
    public AbstractC2932au gameDiscoveryService;
    public AbstractC2891l gameUnionService;

    public final AbstractC2864aj getBroadcastEffectService() {
        return this.broadcastEffectService;
    }

    public final AbstractC2865ak getBroadcastFloatWindowService() {
        return this.broadcastFloatWindowService;
    }

    public final AbstractC2868an getBroadcastPreviewBaseService() {
        return this.broadcastPreviewBaseService;
    }

    public final AbstractC2929ar getBroadcastStartLiveService() {
        return this.broadcastStartLiveService;
    }

    public final AbstractC2930as getBroadcastStartLiveVisibilityService() {
        return this.broadcastStartLiveVisibilityService;
    }

    public final AbstractC2931at getBroadcastXTMediaService() {
        return this.broadcastXTMediaService;
    }

    public final AbstractC2932au getGameDiscoveryService() {
        return this.gameDiscoveryService;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC2891l getGamePromoteService() {
        return this.gameUnionService;
    }

    public final AbstractC2891l getGameUnionService() {
        return this.gameUnionService;
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(14290);
        Companion = new K8Q((byte) 0);
        AbstractC86539K8f LIZ = C86540K8g.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        diComponent = LIZ;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC426222tk broadcastFloatWindowManager() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51);
        if (proxy.isSupported) {
            return (AbstractC426222tk) proxy.result;
        }
        AbstractC2865ak abstractC2865ak = this.broadcastFloatWindowService;
        if (abstractC2865ak != null) {
            return abstractC2865ak.LIZ();
        }
        return null;
    }

    public final AbstractC2862ah getBgBroadcastGameService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return (AbstractC2862ah) proxy.result;
        }
        AbstractC2862ah abstractC2862ah = this.bgBroadcastGameService;
        if (abstractC2862ah == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2862ah;
    }

    public final AbstractC2863ai getBroadcastCommonService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (AbstractC2863ai) proxy.result;
        }
        AbstractC2863ai abstractC2863ai = this.broadcastCommonService;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2863ai;
    }

    public final AbstractC2867am getBroadcastLiveCoreService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return (AbstractC2867am) proxy.result;
        }
        AbstractC2867am abstractC2867am = this.broadcastLiveCoreService;
        if (abstractC2867am == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2867am;
    }

    public final AbstractC2872ao getBroadcastPreviewService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (AbstractC2872ao) proxy.result;
        }
        AbstractC2872ao abstractC2872ao = this.broadcastPreviewService;
        if (abstractC2872ao == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2872ao;
    }

    public final AbstractC2928aq getBroadcastRoomCoreService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (AbstractC2928aq) proxy.result;
        }
        AbstractC2928aq abstractC2928aq = this.broadcastRoomCoreService;
        if (abstractC2928aq == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2928aq;
    }

    @Override // com.bytedance.android.live.core.broadcast.IBroadcastCoreService
    public AbstractC86420K3q getLiveEffectAbHelper() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return (AbstractC86420K3q) proxy.result;
        }
        AbstractC2864aj abstractC2864aj = this.broadcastEffectService;
        if (abstractC2864aj != null) {
            return abstractC2864aj.LIZLLL();
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC100959PpR getXTMediaBroadcastService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39);
        if (proxy.isSupported) {
            return (AbstractC100959PpR) proxy.result;
        }
        AbstractC2931at abstractC2931at = this.broadcastXTMediaService;
        if (abstractC2931at != null) {
            return abstractC2931at.LIZ();
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void init() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16).isSupported) {
            return;
        }
        AbstractC2863ai abstractC2863ai = this.broadcastCommonService;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC2863ai.LIZ();
    }

    static {
        if (ReDexClinitStringAb.abTest >= 2) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(14290);
        Companion = new K8Q((byte) 0);
        AbstractC86539K8f LIZ = C86540K8g.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        diComponent = LIZ;
    }

    public BroadcastService() {
        diComponent.LIZ(this);
        ServiceManager.registerService(IBroadcastService.class, this);
        ServiceManager.registerService(IBroadcastCoreService.class, this);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        new C89046L6q().LIZ(linkedHashMap);
        ((INetworkService) ServiceManager.getService(INetworkService.class)).injectProtoDecoders(linkedHashMap);
        K7G k7g = K7G.LIZIZ;
        k7g.LIZ();
        C86748KGg.LIZ(k7g);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public GN7 createBgBroadcastBinder() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37);
        if (proxy.isSupported) {
            return (GN7) proxy.result;
        }
        AbstractC2862ah abstractC2862ah = this.bgBroadcastGameService;
        if (abstractC2862ah == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2862ah.LIZ();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC86584K9y createStartLiveFragment() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47);
        if (proxy.isSupported) {
            return (AbstractC86584K9y) proxy.result;
        }
        AbstractC2872ao abstractC2872ao = this.broadcastPreviewService;
        if (abstractC2872ao == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        AbstractC86584K9y LIZ = abstractC2872ao.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        return LIZ;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public K8A digitAvatarEffectHelper() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 69);
        if (proxy.isSupported) {
            return (K8A) proxy.result;
        }
        AbstractC2863ai abstractC2863ai = this.broadcastCommonService;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2863ai.LJIIJ();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public String getLiveCoreVersion() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        AbstractC2863ai abstractC2863ai = this.broadcastCommonService;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2863ai.LIZIZ();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC134734bzd getMsgFilter() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23);
        if (proxy.isSupported) {
            return (AbstractC134734bzd) proxy.result;
        }
        AbstractC2928aq abstractC2928aq = this.broadcastRoomCoreService;
        if (abstractC2928aq == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2928aq.LIZIZ();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Class<? extends Widget> getStartLiveVisibilityTransformWidgetClass() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 66);
        if (proxy.isSupported) {
            return (Class) proxy.result;
        }
        AbstractC2928aq abstractC2928aq = this.broadcastRoomCoreService;
        if (abstractC2928aq == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2928aq.LIZLLL();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public IXTBroadcastService getXTBroadcastService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38);
        if (proxy.isSupported) {
            return (IXTBroadcastService) proxy.result;
        }
        AbstractC2872ao abstractC2872ao = this.broadcastPreviewService;
        if (abstractC2872ao == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2872ao.LIZIZ();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public boolean isInDrawGuessGame() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC2928aq abstractC2928aq = this.broadcastRoomCoreService;
        if (abstractC2928aq == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2928aq.LIZ();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public HKC linkEffectHelper() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 68);
        if (proxy.isSupported) {
            return (HKC) proxy.result;
        }
        AbstractC2863ai abstractC2863ai = this.broadcastCommonService;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2863ai.LJIIIZ();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Observable<Integer> loadShortVideoRes() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 53);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        AbstractC2863ai abstractC2863ai = this.broadcastCommonService;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2863ai.LIZJ();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC86810KIq startLiveManager() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return (AbstractC86810KIq) proxy.result;
        }
        AbstractC2872ao abstractC2872ao = this.broadcastPreviewService;
        if (abstractC2872ao == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        AbstractC86810KIq LIZJ = abstractC2872ao.LIZJ();
        Intrinsics.checkNotNullExpressionValue(LIZJ, "");
        return LIZJ;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC81935IRd voiceLiveThemeManager() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 55);
        if (proxy.isSupported) {
            return (AbstractC81935IRd) proxy.result;
        }
        AbstractC2863ai abstractC2863ai = this.broadcastCommonService;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2863ai.LJII();
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public boolean isPlayingGame() {
        C2WC<Boolean> LJIJJLI;
        Boolean LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C87169KWl c87169KWl = AbstractC87170KWm.LJI;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c87169KWl, C87169KWl.LIZ, false, 1);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        AbstractC87170KWm LIZ2 = c87169KWl.LIZ();
        if (LIZ2 == null || (LJIJJLI = LIZ2.LJIJJLI()) == null || (LIZ = LJIJJLI.LIZ()) == null) {
            return false;
        }
        return LIZ.booleanValue();
    }

    public final void setBroadcastEffectService(AbstractC2864aj abstractC2864aj) {
        this.broadcastEffectService = abstractC2864aj;
    }

    public final void setBroadcastFloatWindowService(AbstractC2865ak abstractC2865ak) {
        this.broadcastFloatWindowService = abstractC2865ak;
    }

    public final void setBroadcastPreviewBaseService(AbstractC2868an abstractC2868an) {
        this.broadcastPreviewBaseService = abstractC2868an;
    }

    public final void setBroadcastStartLiveService(AbstractC2929ar abstractC2929ar) {
        this.broadcastStartLiveService = abstractC2929ar;
    }

    public final void setBroadcastStartLiveVisibilityService(AbstractC2930as abstractC2930as) {
        this.broadcastStartLiveVisibilityService = abstractC2930as;
    }

    public final void setBroadcastXTMediaService(AbstractC2931at abstractC2931at) {
        this.broadcastXTMediaService = abstractC2931at;
    }

    public final void setGameDiscoveryService(AbstractC2932au abstractC2932au) {
        this.gameDiscoveryService = abstractC2932au;
    }

    public final void setGameUnionService(AbstractC2891l abstractC2891l) {
        this.gameUnionService = abstractC2891l;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void downloadRequirements(List<String> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 46).isSupported) {
            return;
        }
        AbstractC2872ao abstractC2872ao = this.broadcastPreviewService;
        if (abstractC2872ao == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC2872ao.LIZ(list);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void openPreviewSettingDialog(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 43).isSupported) {
            return;
        }
        AbstractC2872ao abstractC2872ao = this.broadcastPreviewService;
        if (abstractC2872ao == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC2872ao.LIZ(context);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void openPrivilegeDetailSettingDialog(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 44).isSupported) {
            return;
        }
        AbstractC2872ao abstractC2872ao = this.broadcastPreviewService;
        if (abstractC2872ao == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC2872ao.LIZIZ(context);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void preInitStartLiveData(String[] strArr) {
        if (PatchProxy.proxy(new Object[]{strArr}, this, changeQuickRedirect, false, 35).isSupported) {
            return;
        }
        C106862S5w.LIZ((Object) strArr);
        AbstractC2929ar abstractC2929ar = this.broadcastStartLiveService;
        if (abstractC2929ar != null) {
            abstractC2929ar.LIZ(strArr);
        }
    }

    public final void setBgBroadcastGameService(AbstractC2862ah abstractC2862ah) {
        if (PatchProxy.proxy(new Object[]{abstractC2862ah}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC2862ah);
        this.bgBroadcastGameService = abstractC2862ah;
    }

    public final void setBroadcastCommonService(AbstractC2863ai abstractC2863ai) {
        if (PatchProxy.proxy(new Object[]{abstractC2863ai}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC2863ai);
        this.broadcastCommonService = abstractC2863ai;
    }

    public final void setBroadcastLiveCoreService(AbstractC2867am abstractC2867am) {
        if (PatchProxy.proxy(new Object[]{abstractC2867am}, this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC2867am);
        this.broadcastLiveCoreService = abstractC2867am;
    }

    public final void setBroadcastPreviewService(AbstractC2872ao abstractC2872ao) {
        if (PatchProxy.proxy(new Object[]{abstractC2872ao}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC2872ao);
        this.broadcastPreviewService = abstractC2872ao;
    }

    public final void setBroadcastRoomCoreService(AbstractC2928aq abstractC2928aq) {
        if (PatchProxy.proxy(new Object[]{abstractC2928aq}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC2928aq);
        this.broadcastRoomCoreService = abstractC2928aq;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public E78 createBgMirrorFragment(Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 42);
        if (proxy.isSupported) {
            return (E78) proxy.result;
        }
        AbstractC2862ah abstractC2862ah = this.bgBroadcastGameService;
        if (abstractC2862ah == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2862ah.LIZ(bundle);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC80428Hn4 createDigitAvatarPreView(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 28);
        if (proxy.isSupported) {
            return (AbstractC80428Hn4) proxy.result;
        }
        C106862S5w.LIZ(context);
        AbstractC2863ai abstractC2863ai = this.broadcastCommonService;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2863ai.LIZ(context);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC412322Tq createEffectGestureDetector(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 15);
        if (proxy.isSupported) {
            return (AbstractC412322Tq) proxy.result;
        }
        AbstractC2864aj abstractC2864aj = this.broadcastEffectService;
        if (abstractC2864aj != null) {
            return abstractC2864aj.LIZ(context);
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC146440f2w createPreviewContainerFragment(Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 48);
        if (proxy.isSupported) {
            return (AbstractC146440f2w) proxy.result;
        }
        C106862S5w.LIZ(bundle);
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{bundle}, LivePreviewContainerFragment.LJFF, K8R.LIZ, false, 1);
        if (proxy2.isSupported) {
            return (LivePreviewContainerFragment) proxy2.result;
        }
        C106862S5w.LIZ(bundle);
        LivePreviewContainerFragment livePreviewContainerFragment = new LivePreviewContainerFragment();
        livePreviewContainerFragment.setArguments(bundle);
        return livePreviewContainerFragment;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public LiveActivityProxy createStartLiveActivityProxy(FragmentActivity fragmentActivity) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{fragmentActivity}, this, changeQuickRedirect, false, 49);
        if (proxy.isSupported) {
            return (LiveActivityProxy) proxy.result;
        }
        C106862S5w.LIZ(fragmentActivity);
        AbstractC2931at abstractC2931at = this.broadcastXTMediaService;
        if (abstractC2931at != null) {
            return abstractC2931at.LIZIZ();
        }
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public String getAuthString(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 18);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(str);
        AbstractC2867am abstractC2867am = this.broadcastLiveCoreService;
        if (abstractC2867am == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2867am.LIZ(str);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public <T> Class<T> getWidgetClass(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 13);
        if (proxy.isSupported) {
            return (Class) proxy.result;
        }
        AbstractC2863ai abstractC2863ai = this.broadcastCommonService;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2863ai.LIZ(i);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public boolean isRequirementsDownloaded(List<String> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 30);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC2864aj abstractC2864aj = this.broadcastEffectService;
        if (abstractC2864aj == null) {
            return false;
        }
        return abstractC2864aj.LIZ(list);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void markEnterSceneFromJsb(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 61).isSupported) {
            return;
        }
        AbstractC2863ai abstractC2863ai = this.broadcastCommonService;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC2863ai.LIZIZ(i);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void markPopupShown(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 62).isSupported) {
            return;
        }
        AbstractC2863ai abstractC2863ai = this.broadcastCommonService;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC2863ai.LIZJ(i);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public boolean shouldShowGuidePromptBubble(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 63);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC2863ai abstractC2863ai = this.broadcastCommonService;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2863ai.LIZLLL(i);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Observable<Integer> updateBroadcastRoomHashTag(C9477q c9477q) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c9477q}, this, changeQuickRedirect, false, 50);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        AbstractC2872ao abstractC2872ao = this.broadcastPreviewService;
        if (abstractC2872ao == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        Observable<Integer> LIZ = abstractC2872ao.LIZ(c9477q);
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        return LIZ;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Observable<String> updateForenoticeInfo(ScheduledSettingInfo scheduledSettingInfo) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{scheduledSettingInfo}, this, changeQuickRedirect, false, 36);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        C106862S5w.LIZ(scheduledSettingInfo);
        AbstractC2872ao abstractC2872ao = this.broadcastPreviewService;
        if (abstractC2872ao == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        Observable<String> LIZ = abstractC2872ao.LIZ(scheduledSettingInfo);
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        return LIZ;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void updateGameMsgViewUserCount(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 29).isSupported) {
            return;
        }
        AbstractC2862ah abstractC2862ah = this.bgBroadcastGameService;
        if (abstractC2862ah == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC2862ah.LIZ(i);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void fastStartLivePreLoad(FragmentActivity fragmentActivity, FastStartLiveConfig fastStartLiveConfig) {
        AbstractC2929ar abstractC2929ar;
        if (!PatchProxy.proxy(new Object[]{fragmentActivity, fastStartLiveConfig}, this, changeQuickRedirect, false, 72).isSupported && (abstractC2929ar = this.broadcastStartLiveService) != null) {
            abstractC2929ar.LIZ(fragmentActivity, fastStartLiveConfig);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void showLiveGameDiscoveryDialog(Context context, Bundle bundle) {
        AbstractC2932au abstractC2932au;
        if (!PatchProxy.proxy(new Object[]{context, bundle}, this, changeQuickRedirect, false, 70).isSupported && (abstractC2932au = this.gameDiscoveryService) != null) {
            abstractC2932au.LIZ(context, bundle);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Fragment createBgBroadcastFragment(K06 k06, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{k06, bundle}, this, changeQuickRedirect, false, 41);
        if (proxy.isSupported) {
            return (Fragment) proxy.result;
        }
        AbstractC2862ah abstractC2862ah = this.bgBroadcastGameService;
        if (abstractC2862ah == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2862ah.LIZ(k06, bundle);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public C2FC createCoverController(Fragment fragment, Room room) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{fragment, room}, this, changeQuickRedirect, false, 34);
        if (proxy.isSupported) {
            return (C2FC) proxy.result;
        }
        AbstractC2872ao abstractC2872ao = this.broadcastPreviewService;
        if (abstractC2872ao == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C2FC LIZ = abstractC2872ao.LIZ(fragment, room);
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        return LIZ;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public HFT createVoiceRoomVideoView(Context context, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 26);
        if (proxy.isSupported) {
            return (HFT) proxy.result;
        }
        AbstractC2863ai abstractC2863ai = this.broadcastCommonService;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2863ai.LIZ(context, str);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Fragment createXTMediaBroadcastFragment(K2Z k2z, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{k2z, bundle}, this, changeQuickRedirect, false, 24);
        if (proxy.isSupported) {
            return (Fragment) proxy.result;
        }
        AbstractC2928aq abstractC2928aq = this.broadcastRoomCoreService;
        if (abstractC2928aq == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2928aq.LIZ(k2z, bundle);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public boolean fastStartLivePreCheck(FragmentActivity fragmentActivity, LiveMode liveMode) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{fragmentActivity, liveMode}, this, changeQuickRedirect, false, 58);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(liveMode);
        AbstractC2929ar abstractC2929ar = this.broadcastStartLiveService;
        if (abstractC2929ar == null) {
            return false;
        }
        Intrinsics.checkNotNull(abstractC2929ar);
        return false;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public boolean isInterceptOnClickToolBar(DataCenter dataCenter, ToolbarButton toolbarButton) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dataCenter, toolbarButton}, this, changeQuickRedirect, false, 67);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C427772wF.LIZ(dataCenter, toolbarButton);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC4165j loadBroadcastFilterLineEntryWidget(WidgetManager widgetManager, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{widgetManager, Integer.valueOf(i)}, this, changeQuickRedirect, false, 33);
        if (proxy.isSupported) {
            return (AbstractC4165j) proxy.result;
        }
        C106862S5w.LIZ(widgetManager);
        AbstractC2928aq abstractC2928aq = this.broadcastRoomCoreService;
        if (abstractC2928aq == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2928aq.LIZ(widgetManager, i);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void openCategoryDialog(Context context, DataCenter dataCenter) {
        if (PatchProxy.proxy(new Object[]{context, dataCenter}, this, changeQuickRedirect, false, 56).isSupported) {
            return;
        }
        C106862S5w.LIZ(context, dataCenter);
        AbstractC2872ao abstractC2872ao = this.broadcastPreviewService;
        if (abstractC2872ao == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC2872ao.LIZ(context, dataCenter);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void openVideoCategoryDialog(Context context, String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 57).isSupported) {
            return;
        }
        C106862S5w.LIZ(context);
        AbstractC2872ao abstractC2872ao = this.broadcastPreviewService;
        if (abstractC2872ao == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC2872ao.LIZ(context, str);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Object provideToolbarBehavior(int i, List<? extends Object> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), list}, this, changeQuickRedirect, false, 14);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(list);
        AbstractC2863ai abstractC2863ai = this.broadcastCommonService;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2863ai.LIZ(i, list);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public HGX createLinkInRoomView(AbstractC5436a abstractC5436a, Context context, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC5436a, context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 52);
        if (proxy.isSupported) {
            return (HGX) proxy.result;
        }
        AbstractC2863ai abstractC2863ai = this.broadcastCommonService;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2863ai.LIZ(abstractC5436a, context, i);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC2884d createLinkVideoView(Context context, HCC hcc, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, hcc, str}, this, changeQuickRedirect, false, 25);
        if (proxy.isSupported) {
            return (AbstractC2884d) proxy.result;
        }
        AbstractC2863ai abstractC2863ai = this.broadcastCommonService;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2863ai.LIZ(context, hcc, str);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Fragment createLiveBroadcastFragment(K06 k06, K2Z k2z, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{k06, k2z, bundle}, this, changeQuickRedirect, false, 32);
        if (proxy.isSupported) {
            return (Fragment) proxy.result;
        }
        AbstractC2928aq abstractC2928aq = this.broadcastRoomCoreService;
        if (abstractC2928aq == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2928aq.LIZ(k06, k2z, bundle);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void openRoomChoosePVCountDialog(FragmentActivity fragmentActivity, Room room, LiveMode liveMode) {
        if (PatchProxy.proxy(new Object[]{fragmentActivity, room, liveMode}, this, changeQuickRedirect, false, 21).isSupported) {
            return;
        }
        AbstractC2863ai abstractC2863ai = this.broadcastCommonService;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC2863ai.LIZIZ(fragmentActivity, room, liveMode);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void openRoomIntroMediaDialog(FragmentActivity fragmentActivity, Room room, LiveMode liveMode) {
        if (PatchProxy.proxy(new Object[]{fragmentActivity, room, liveMode}, this, changeQuickRedirect, false, 20).isSupported) {
            return;
        }
        AbstractC2863ai abstractC2863ai = this.broadcastCommonService;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC2863ai.LIZ(fragmentActivity, room, liveMode);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void showAddAnchorShowDialog(Context context, int i, AbstractC89439LLt abstractC89439LLt) {
        if (!PatchProxy.proxy(new Object[]{context, Integer.valueOf(i), abstractC89439LLt}, this, changeQuickRedirect, false, 71).isSupported && context != null) {
            AbstractC2863ai abstractC2863ai = this.broadcastCommonService;
            if (abstractC2863ai == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            abstractC2863ai.LIZ(context, i, abstractC89439LLt);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public /* synthetic */ AbstractC81939IRh createVoiceLiveThemeDialog(Context context, Boolean bool, AbstractC81969ISl abstractC81969ISl, int i) {
        return createVoiceLiveThemeDialog(context, bool.booleanValue(), abstractC81969ISl, i);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Fragment createBroadcastStreamFragment(K06 k06, LiveMode liveMode, StreamUrlExtra streamUrlExtra, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{k06, liveMode, streamUrlExtra, str}, this, changeQuickRedirect, false, 31);
        if (proxy.isSupported) {
            return (Fragment) proxy.result;
        }
        C106862S5w.LIZ(k06, liveMode, streamUrlExtra);
        AbstractC2867am abstractC2867am = this.broadcastLiveCoreService;
        if (abstractC2867am == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        return abstractC2867am.LIZ(k06, liveMode, streamUrlExtra, str);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC2885g createVideoTalkView(Context context, String str, boolean z, AbstractC2885g.AbstractC2887b abstractC2887b) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), abstractC2887b}, this, changeQuickRedirect, false, 27);
        if (proxy.isSupported) {
            return (AbstractC2885g) proxy.result;
        }
        AbstractC2863ai abstractC2863ai = this.broadcastCommonService;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2863ai.LIZ(context, str, z, abstractC2887b);
    }

    public AbstractC81939IRh createVoiceLiveThemeDialog(Context context, boolean z, AbstractC81969ISl abstractC81969ISl, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, Byte.valueOf(z ? (byte) 1 : (byte) 0), abstractC81969ISl, Integer.valueOf(i)}, this, changeQuickRedirect, false, 54);
        if (proxy.isSupported) {
            return (AbstractC81939IRh) proxy.result;
        }
        C106862S5w.LIZ(context);
        AbstractC2863ai abstractC2863ai = this.broadcastCommonService;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2863ai.LIZ(context, z, abstractC81969ISl, i);
    }

    @Override // com.bytedance.android.livesdkapi.service.IBaseBroadcastService
    public void fastStartLive(FragmentActivity fragmentActivity, FastStartLiveConfig fastStartLiveConfig, ArrayList<AbstractC9586k> arrayList, AbstractC2879d abstractC2879d) {
        AbstractC2929ar abstractC2929ar;
        if (!PatchProxy.proxy(new Object[]{fragmentActivity, fastStartLiveConfig, arrayList, abstractC2879d}, this, changeQuickRedirect, false, 59).isSupported && (abstractC2929ar = this.broadcastStartLiveService) != null) {
            abstractC2929ar.LIZ(fragmentActivity, fastStartLiveConfig, arrayList, abstractC2879d);
        }
    }

    @Override // com.bytedance.android.livesdkapi.service.IBaseBroadcastService
    public void fastStartLiveForSchema(Context context, FastStartLiveConfig fastStartLiveConfig, ArrayList<AbstractC9586k> arrayList, AbstractC2879d abstractC2879d) {
        AbstractC2929ar abstractC2929ar;
        if (!PatchProxy.proxy(new Object[]{context, fastStartLiveConfig, arrayList, abstractC2879d}, this, changeQuickRedirect, false, 60).isSupported && (abstractC2929ar = this.broadcastStartLiveService) != null) {
            abstractC2929ar.LIZ(context, fastStartLiveConfig, arrayList, abstractC2879d);
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void justReportRoomEvent(int i, long j, int i2, String str) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), new Long(j), Integer.valueOf(i2), str}, this, changeQuickRedirect, false, 65).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        reportRoomEvent(i, j, i2, str).subscribe(C100839PnV.m22957LJ(), C100839PnV.LIZLLL());
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void openRoomIntroDialog(FragmentActivity fragmentActivity, Room room, LiveMode liveMode, Long l) {
        if (PatchProxy.proxy(new Object[]{fragmentActivity, room, liveMode, l}, this, changeQuickRedirect, false, 19).isSupported) {
            return;
        }
        AbstractC2863ai abstractC2863ai = this.broadcastCommonService;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC2863ai.LIZ(fragmentActivity, room, liveMode, l);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Observable<C5176i<Object>> reportRoomEvent(int i, long j, int i2, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), new Long(j), Integer.valueOf(i2), str}, this, changeQuickRedirect, false, 64);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        C106862S5w.LIZ(str);
        AbstractC2928aq abstractC2928aq = this.broadcastRoomCoreService;
        if (abstractC2928aq == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC2928aq.LIZ(i, j, i2, str);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void openForenoticeDialog(Context context, boolean z, boolean z2, ScheduledSettingInfo scheduledSettingInfo, LKD lkd, int i, String str) {
        if (PatchProxy.proxy(new Object[]{context, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), scheduledSettingInfo, lkd, Integer.valueOf(i), str}, this, changeQuickRedirect, false, 45).isSupported) {
            return;
        }
        C106862S5w.LIZ(context);
        AbstractC2872ao abstractC2872ao = this.broadcastPreviewService;
        if (abstractC2872ao == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC2872ao.LIZ(context, z, z2, scheduledSettingInfo, lkd, i, str);
    }
}
