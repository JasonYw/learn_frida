package com.bytedance.android.live.broadcast.preview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.broadcast.AbstractC2863ai;
import com.bytedance.android.live.broadcast.AbstractC2868an;
import com.bytedance.android.live.broadcast.AbstractC2872ao;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.p317e.C4070a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.depend.PluginType;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import com.bytedance.scalpel.scenemanager.core.AbstractC13971f;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC146440f2w;
import p003X.AbstractC4569445g;
import p003X.AbstractC86584K9y;
import p003X.AbstractC86658KCu;
import p003X.AbstractC86662KCy;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C86583K9x;
import p003X.C86585K9z;
import p003X.C88613Kvn;
import p003X.K8Q;
import p003X.K8R;
import p003X.K9P;
import p003X.KA0;
import p003X.KDJ;

/* loaded from: classes5.dex */
public final class LivePreviewContainerFragment extends C4070a implements KDJ, AbstractC146440f2w, AbstractC13971f, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final K8R LJFF = new K8R((byte) 0);
    public AbstractC2872ao LIZIZ;
    public AbstractC2868an LIZJ;
    public AbstractC2863ai LIZLLL;

    /* renamed from: LJ */
    public int f25914LJ;
    public final Lazy LJI = LazyKt__LazyJVMKt.lazy(new LivePreviewContainerFragment$cameraWidget$2(this));
    public WidgetManager LJII;
    public AbstractC86584K9y LJIIIIZZ;
    public HashMap LJIIIZ;

    static {
        Covode.recordClassIndex(17088);
    }

    private final Widget LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (Widget) (proxy.isSupported ? proxy.result : this.LJI.mo27335getValue());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private final void onLifecyclePause() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private final void onLifecycleResume() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private final void onLifecycleStart() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private final void onLifecycleStop() {
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public final String getSceneFullName() {
        return "com/bytedance/android/live/broadcast/preview/LivePreviewContainerFragment";
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public final String getSceneSimpleName() {
        return "LivePreviewContainerFragment";
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 26).isSupported) {
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onLifecycleStart();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onLifecycleResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onLifecyclePause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onLifecycleStop();
        } else if (event != Lifecycle.Event.ON_DESTROY) {
        } else {
            onLifecycleOnDestroy();
        }
    }

    @Override // p003X.AbstractC146440f2w
    public final Fragment LIZ() {
        return this;
    }

    @Override // p003X.AbstractC146440f2w
    public final void LIZIZ() {
        AbstractC86584K9y abstractC86584K9y;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported && (abstractC86584K9y = this.LJIIIIZZ) != null) {
            abstractC86584K9y.LIZLLL();
        }
    }

    @Override // p003X.AbstractC146440f2w
    public final void LIZJ() {
        AbstractC86584K9y abstractC86584K9y;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported && (abstractC86584K9y = this.LJIIIIZZ) != null) {
            abstractC86584K9y.mo23503LJ();
        }
    }

    public LivePreviewContainerFragment() {
        AbstractC86584K9y abstractC86584K9y;
        K8Q.LIZ().LIZ(this);
        AbstractC2872ao abstractC2872ao = this.LIZIZ;
        if (abstractC2872ao != null) {
            abstractC86584K9y = abstractC2872ao.LIZ();
        } else {
            abstractC86584K9y = null;
        }
        this.LJIIIIZZ = abstractC86584K9y;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onLifecycleOnDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        AbstractC2863ai abstractC2863ai = this.LIZLLL;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC2863ai.LIZ((AbstractC86662KCy) null);
        AbstractC2868an abstractC2868an = this.LIZJ;
        if (abstractC2868an != null) {
            abstractC2868an.LIZLLL();
        }
    }

    @Override // p003X.KDJ
    /* renamed from: LJ */
    public final void mo7780LJ() {
        AbstractC2868an abstractC2868an;
        AbstractC86658KCu LIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        ALogger.m15800e("LivePreviewContainerFragment", "closeCamera is running cameraWidget: " + LJI());
        if (LJI() != null && (abstractC2868an = this.LIZJ) != null && (LIZ2 = abstractC2868an.LIZ()) != null) {
            LIZ2.LIZJ();
        }
    }

    @Override // p003X.KDJ
    public final void LJFF() {
        AbstractC2868an abstractC2868an;
        AbstractC86658KCu LIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            return;
        }
        ALogger.m15800e("LivePreviewContainerFragment", "closeCamera is running cameraWidget: " + LJI());
        if (LJI() != null && (abstractC2868an = this.LIZJ) != null && (LIZ2 = abstractC2868an.LIZ()) != null) {
            LIZ2.LIZIZ();
        }
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        HashMap hashMap;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 25).isSupported) {
            return;
        }
        super.onDestroyView();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported && (hashMap = this.LJIIIZ) != null) {
            hashMap.clear();
        }
    }

    @Override // p003X.AbstractC146440f2w
    public final AbstractC86584K9y LIZLLL() {
        AbstractC86584K9y abstractC86584K9y;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        if (proxy.isSupported) {
            return (AbstractC86584K9y) proxy.result;
        }
        LivePreviewContainerFragment$createStartLiveFragment$1 livePreviewContainerFragment$createStartLiveFragment$1 = LivePreviewContainerFragment$createStartLiveFragment$1.INSTANCE;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{livePreviewContainerFragment$createStartLiveFragment$1}, this, LIZ, false, 9);
        if (proxy2.isSupported) {
            return (AbstractC86584K9y) proxy2.result;
        }
        if (this.LJIIIIZZ == null) {
            AbstractC2872ao abstractC2872ao = this.LIZIZ;
            if (abstractC2872ao != null) {
                abstractC86584K9y = abstractC2872ao.LIZ();
            } else {
                abstractC86584K9y = null;
            }
            this.LJIIIIZZ = abstractC86584K9y;
        }
        AbstractC86584K9y abstractC86584K9y2 = this.LJIIIIZZ;
        if (abstractC86584K9y2 != null) {
            abstractC86584K9y2.LIZ(new C86583K9x());
        }
        ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).startLiveManager().LIZ(new KA0(livePreviewContainerFragment$createStartLiveFragment$1));
        return this.LJIIIIZZ;
    }

    @Override // p003X.AbstractC146440f2w
    public final void LIZ(int i) {
        AbstractC86584K9y abstractC86584K9y;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 15).isSupported && (abstractC86584K9y = this.LJIIIIZZ) != null) {
            abstractC86584K9y.LIZ(i);
        }
    }

    private final void LIZIZ(View view) {
        Widget LIZIZ;
        WidgetManager widgetManager;
        WidgetManager widgetManager2;
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 8).isSupported) {
            return;
        }
        this.LJII = WidgetManager.m14494of(this, view);
        Widget LJI = LJI();
        if (LJI != null && (widgetManager2 = this.LJII) != null) {
            widgetManager2.load(2131168947, LJI);
        }
        AbstractC2868an abstractC2868an = this.LIZJ;
        if (abstractC2868an != null && (LIZIZ = abstractC2868an.LIZIZ()) != null && (widgetManager = this.LJII) != null) {
            widgetManager.load(2131167553, LIZIZ);
        }
    }

    @Override // p003X.AbstractC146440f2w
    public final void LIZ(K9P k9p) {
        AbstractC2868an abstractC2868an;
        AbstractC86658KCu LIZ2;
        if (!PatchProxy.proxy(new Object[]{k9p}, this, LIZ, false, 19).isSupported && LJI() != null && (abstractC2868an = this.LIZJ) != null && (LIZ2 = abstractC2868an.LIZ()) != null) {
            LIZ2.LIZ(k9p);
        }
    }

    @Override // p003X.AbstractC146440f2w
    public final void LIZ(AbstractC86662KCy abstractC86662KCy) {
        if (PatchProxy.proxy(new Object[]{abstractC86662KCy}, this, LIZ, false, 18).isSupported) {
            return;
        }
        AbstractC2863ai abstractC2863ai = this.LIZLLL;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC2863ai.LIZ(abstractC86662KCy);
    }

    @Override // p003X.AbstractC146440f2w
    public final void LIZ(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(bundle);
        AbstractC86584K9y abstractC86584K9y = this.LJIIIIZZ;
        if (abstractC86584K9y != null) {
            abstractC86584K9y.LIZ(bundle);
        }
    }

    public final void LIZ(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 7).isSupported) {
            return;
        }
        AbstractC2863ai abstractC2863ai = this.LIZLLL;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            abstractC2863ai.LIZ();
        }
        LIZIZ(view);
        mo29786getLifecycle().addObserver(this);
    }

    @Override // p003X.AbstractC146440f2w
    public final void LIZ(HashMap<String, String> hashMap) {
        if (PatchProxy.proxy(new Object[]{hashMap}, this, LIZ, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(hashMap);
        AbstractC86584K9y abstractC86584K9y = this.LJIIIIZZ;
        if (abstractC86584K9y != null) {
            abstractC86584K9y.LIZ(hashMap);
        }
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        super.onViewCreated(view, bundle);
        LivePreviewContainerFragment$onViewCreated$2 livePreviewContainerFragment$onViewCreated$2 = LivePreviewContainerFragment$onViewCreated$2.INSTANCE;
        if (!PatchProxy.proxy(new Object[]{this, livePreviewContainerFragment$onViewCreated$2, null, 2, null}, null, LIZ, true, 11).isSupported) {
            LivePreviewContainerFragment$loadLiveCorePlugin$1 livePreviewContainerFragment$loadLiveCorePlugin$1 = LivePreviewContainerFragment$loadLiveCorePlugin$1.INSTANCE;
            if (!PatchProxy.proxy(new Object[]{livePreviewContainerFragment$onViewCreated$2, livePreviewContainerFragment$loadLiveCorePlugin$1}, this, LIZ, false, 10).isSupported) {
                if (!NetworkUtils.isNetworkAvailable(getContext())) {
                    C88613Kvn.LIZ(getContext(), 2131582739);
                } else if (NetworkUtils.getNetworkType(getContext()) == NetworkUtils.NetworkType.MOBILE_2G) {
                    C88613Kvn.LIZ(getContext(), 2131586496);
                } else if (this.f25914LJ <= 5) {
                    PluginType.LiveResource.LIZ(getContext(), "", new C86585K9z(this, livePreviewContainerFragment$onViewCreated$2, livePreviewContainerFragment$loadLiveCorePlugin$1), false);
                }
            }
        }
        LIZ(view);
    }

    @Override // p003X.AbstractC146440f2w
    public final void LIZ(Sticker sticker, int i) {
        if (PatchProxy.proxy(new Object[]{sticker, Integer.valueOf(i)}, this, LIZ, false, 17).isSupported) {
            return;
        }
        C106862S5w.LIZ(sticker);
        AbstractC86584K9y abstractC86584K9y = this.LJIIIIZZ;
        if (abstractC86584K9y != null) {
            abstractC86584K9y.LIZ(sticker, i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(layoutInflater);
        View LIZ2 = C116971W2r.LIZ(layoutInflater, 2131699212, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        LIZ2.setFitsSystemWindows(false);
        return LIZ2;
    }
}
