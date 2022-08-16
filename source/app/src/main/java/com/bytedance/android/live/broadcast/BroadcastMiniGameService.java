package com.bytedance.android.live.broadcast;

import android.content.Context;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.minigame.AuthorizeCallback;
import com.bytedance.android.livesdkapi.minigame.CanStartLiveCallback;
import com.bytedance.android.livesdkapi.minigame.IAudienceModule;
import com.bytedance.android.livesdkapi.minigame.IBroadcastMiniGameService;
import com.bytedance.android.livesdkapi.minigame.IMessageModule;
import com.bytedance.android.livesdkapi.minigame.IPushStream;
import com.bytedance.android.livesdkapi.minigame.InitLiveSDKCallback;
import com.bytedance.android.livesdkapi.minigame.TwoElementAuthCallback;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC86539K8f;
import p003X.C106862S5w;
import p003X.C86540K8g;
import p003X.KBU;

/* loaded from: classes5.dex */
public class BroadcastMiniGameService implements IBroadcastMiniGameService {
    public static final KBU Companion;
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final AbstractC86539K8f diComponent;
    public IBroadcastMiniGameService delegate;

    public BroadcastMiniGameService() {
        diComponent.LJII().LIZ(this);
        ServiceManager.registerService(IBroadcastMiniGameService.class, this);
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(14288);
        Companion = new KBU((byte) 0);
        AbstractC86539K8f LIZ = C86540K8g.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        diComponent = LIZ;
    }

    public final IBroadcastMiniGameService getDelegate() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (IBroadcastMiniGameService) proxy.result;
        }
        IBroadcastMiniGameService iBroadcastMiniGameService = this.delegate;
        if (iBroadcastMiniGameService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return iBroadcastMiniGameService;
    }

    @Override // com.bytedance.android.livesdkapi.minigame.IBroadcastMiniGameService
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        IBroadcastMiniGameService iBroadcastMiniGameService = this.delegate;
        if (iBroadcastMiniGameService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        iBroadcastMiniGameService.onDestroy();
    }

    static {
        if (ReDexClinitStringAb.abTest >= 2) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(14288);
        Companion = new KBU((byte) 0);
        AbstractC86539K8f LIZ = C86540K8g.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        diComponent = LIZ;
    }

    @Override // com.bytedance.android.livesdkapi.minigame.IBroadcastMiniGameService
    public IAudienceModule getAudienceModule() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return (IAudienceModule) proxy.result;
        }
        IBroadcastMiniGameService iBroadcastMiniGameService = this.delegate;
        if (iBroadcastMiniGameService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return iBroadcastMiniGameService.getAudienceModule();
    }

    @Override // com.bytedance.android.livesdkapi.minigame.IBroadcastMiniGameService
    public IMessageModule getMessageModule() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return (IMessageModule) proxy.result;
        }
        IBroadcastMiniGameService iBroadcastMiniGameService = this.delegate;
        if (iBroadcastMiniGameService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return iBroadcastMiniGameService.getMessageModule();
    }

    @Override // com.bytedance.android.livesdkapi.minigame.IBroadcastMiniGameService
    public IPushStream getPushStream() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return (IPushStream) proxy.result;
        }
        IBroadcastMiniGameService iBroadcastMiniGameService = this.delegate;
        if (iBroadcastMiniGameService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return iBroadcastMiniGameService.getPushStream();
    }

    public final void setDelegate(IBroadcastMiniGameService iBroadcastMiniGameService) {
        if (PatchProxy.proxy(new Object[]{iBroadcastMiniGameService}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(iBroadcastMiniGameService);
        this.delegate = iBroadcastMiniGameService;
    }

    @Override // com.bytedance.android.livesdkapi.minigame.IBroadcastMiniGameService
    public void canStartLive(CanStartLiveCallback canStartLiveCallback) {
        if (PatchProxy.proxy(new Object[]{canStartLiveCallback}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(canStartLiveCallback);
        IBroadcastMiniGameService iBroadcastMiniGameService = this.delegate;
        if (iBroadcastMiniGameService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        iBroadcastMiniGameService.canStartLive(canStartLiveCallback);
    }

    @Override // com.bytedance.android.livesdkapi.minigame.IBroadcastMiniGameService
    public void initTTLiveSDK(InitLiveSDKCallback initLiveSDKCallback) {
        if (PatchProxy.proxy(new Object[]{initLiveSDKCallback}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(initLiveSDKCallback);
        IBroadcastMiniGameService iBroadcastMiniGameService = this.delegate;
        if (iBroadcastMiniGameService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        iBroadcastMiniGameService.initTTLiveSDK(initLiveSDKCallback);
    }

    @Override // com.bytedance.android.livesdkapi.minigame.IBroadcastMiniGameService
    public void twoElementAuth(TwoElementAuthCallback twoElementAuthCallback) {
        if (PatchProxy.proxy(new Object[]{twoElementAuthCallback}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(twoElementAuthCallback);
        IBroadcastMiniGameService iBroadcastMiniGameService = this.delegate;
        if (iBroadcastMiniGameService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        iBroadcastMiniGameService.twoElementAuth(twoElementAuthCallback);
    }

    @Override // com.bytedance.android.livesdkapi.minigame.IBroadcastMiniGameService
    public void authorize(Context context, AuthorizeCallback authorizeCallback) {
        if (PatchProxy.proxy(new Object[]{context, authorizeCallback}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(context, authorizeCallback);
        IBroadcastMiniGameService iBroadcastMiniGameService = this.delegate;
        if (iBroadcastMiniGameService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        iBroadcastMiniGameService.authorize(context, authorizeCallback);
    }
}
