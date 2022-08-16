package com.bytedance.android.live.broadcastgame.opengame.panel;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.live.broadcastgame.opengame.C3607p;
import com.bytedance.android.live.broadcastgame.opengame.p292b.C3483a;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.live.broadcastgame.opengame.service.TrackMiniGameService;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.event.C5986ap;
import com.bytedance.android.livesdk.chatroom.p518ui.DoubleColorBallAnimationView;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.widget.roundcorner.RoundCornerConstraintLayout;
import com.bytedance.android.livesdkapi.service.ILiveVideoFloatWindowService;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import com.p1594ss.android.ugc.playerkit.exp.PlayerSettingCenter;
import io.reactivex.subjects.PublishSubject;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC536287Gk;
import p003X.AbstractC87170KWm;
import p003X.AbstractC87833KjD;
import p003X.AnonymousClass425;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2ZW;
import p003X.C3Q0;
import p003X.C422912oP;
import p003X.C438153Uz;
import p003X.C4581449w;
import p003X.C63065Auh;
import p003X.C65365Bqh;
import p003X.C87010KQi;
import p003X.C87658KgO;
import p003X.C87713KhH;
import p003X.C87831KjB;
import p003X.C87836KjG;
import p003X.C87911KkT;
import p003X.C87993Kln;
import p003X.C88017KmB;
import p003X.C88034KmS;
import p003X.C89019L5p;
import p003X.GOY;
import p003X.IUM;
import p003X.LK1;
import p003X.LK5;
import p003X.RunnableC88020KmE;
import p003X.RunnableC88021KmF;
import p003X.RunnableC88029KmN;
import p003X.View$OnClickListenerC88036KmU;
import p003X.View$OnClickListenerC88038KmW;
import p003X.View$OnClickListenerC88039KmX;
import p003X.animation.Animation$AnimationListenerC88027KmL;
import p003X.animation.Animation$AnimationListenerC88028KmM;

/* loaded from: classes5.dex */
public final class FullScreenOpenPanel extends FragmentActivity implements AbstractC3608c, AbstractC87833KjD<AbstractC3610e> {
    public static ChangeQuickRedirect LIZ;
    public static final AbstractC536287Gk<Pair<Integer, FullScreenOpenPanel>> LJIL;
    public RoundCornerConstraintLayout LIZIZ;
    public ViewGroup LIZJ;
    public DoubleColorBallAnimationView LIZLLL;

    /* renamed from: LJ */
    public ViewGroup f26077LJ;
    public C87993Kln LJFF;
    public boolean LJI;
    public boolean LJII;
    public C3682x LJIILIIL;
    public boolean LJIILJJIL;
    public View.OnClickListener LJIILL;
    public Runnable LJIILLIIL;
    public boolean LJIIZILJ;
    public PanelType LJIJ;
    public TextView LJJIII;
    public ViewGroup LJJIIJ;
    public ViewGroup LJJIIJZLJL;
    public boolean LJJIIZ;
    public long LJJIIZI;
    public HashMap LJJIJIL;
    public static final C87713KhH LJJ = new C87713KhH((byte) 0);
    public static final AtomicInteger LJIJI = new AtomicInteger(0);
    public static final HashMap<Integer, WeakReference<FullScreenOpenPanel>> LJIJJ = new HashMap<>();
    public static final HashSet<Integer> LJIJJLI = new HashSet<>();
    public final /* synthetic */ C87831KjB<AbstractC3610e> LJJIJIIJIL = new C87831KjB<>();
    public final Lazy LJJI = LazyKt__LazyJVMKt.lazy(new FullScreenOpenPanel$token$2(this));
    public final Lazy LJJIFFI = LazyKt__LazyJVMKt.lazy(new FullScreenOpenPanel$roomId$2(this));
    public final Lazy LJJII = LazyKt__LazyJVMKt.lazy(new FullScreenOpenPanel$isAnchor$2(this));
    public String LJIIIIZZ = "";
    public String LJIIIZ = "";
    public String LJIIJ = "";
    public String LJIIJJI = "";
    public String LJIIL = "";
    public final Lazy LJJIJ = LazyKt__LazyJVMKt.lazy(new FullScreenOpenPanel$enterAnimation$2(this));
    public final Lazy LJJIJIIJI = LazyKt__LazyJVMKt.lazy(new FullScreenOpenPanel$outAnimation$2(this));

    private View LIZJ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 79);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJJIJIL == null) {
            this.LJJIJIL = new HashMap();
        }
        View view = (View) this.LJJIJIL.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJJIJIL.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private final boolean LJIILIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return ((Boolean) (proxy.isSupported ? proxy.result : this.LJJII.mo27335getValue())).booleanValue();
    }

    private final Animation LJIILJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        return (Animation) (proxy.isSupported ? proxy.result : this.LJJIJ.mo27335getValue());
    }

    private final Animation LJIILL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        return (Animation) (proxy.isSupported ? proxy.result : this.LJJIJIIJI.mo27335getValue());
    }

    public final int LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : ((Number) this.LJJI.mo27335getValue()).intValue();
    }

    public final long LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return proxy.isSupported ? ((Long) proxy.result).longValue() : ((Number) this.LJJIFFI.mo27335getValue()).longValue();
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void LJFF() {
    }

    public final AbstractC3610e LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 70);
        return (AbstractC3610e) (proxy.isSupported ? proxy.result : this.LJJIJIIJIL.LIZ());
    }

    @Override // p003X.AbstractC87833KjD
    public final List<AbstractC3610e> getListeners() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 71);
        return proxy.isSupported ? (List) proxy.result : this.LJJIJIIJIL.getListeners();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 81).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final Context LJIIJ() {
        return this;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final boolean isShowing() {
        return this.LJI;
    }

    private final void LIZ(Float f, boolean z) {
        if (PatchProxy.proxy(new Object[]{f, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 22).isSupported) {
            return;
        }
        RoundCornerConstraintLayout roundCornerConstraintLayout = this.LIZIZ;
        if (roundCornerConstraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        roundCornerConstraintLayout.post(new RunnableC88021KmF(this, f, z));
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 35).isSupported) {
            return;
        }
        if (i == 0) {
            ViewGroup viewGroup = this.LJJIIJ;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            UIUtils.setViewVisibility(viewGroup, 0);
            return;
        }
        ViewGroup viewGroup2 = this.LJJIIJ;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        UIUtils.setViewVisibility(viewGroup2, 8);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void LIZ(boolean z) {
        C87993Kln c87993Kln;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 36).isSupported && (c87993Kln = this.LJFF) != null) {
            c87993Kln.setTopRightTheme(z);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void LIZ(PanelType panelType) {
        if (PatchProxy.proxy(new Object[]{panelType}, this, LIZ, false, 39).isSupported) {
            return;
        }
        C106862S5w.LIZ(panelType);
        C87658KgO.LIZ(this, panelType, null, 2, null);
    }

    public final Boolean LIZ(boolean z, boolean z2, Function0<Unit> function0) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), function0}, this, LIZ, false, 54);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        if (z != z2) {
            return null;
        }
        function0.mo30099invoke();
        return Boolean.FALSE;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3608c
    public final void LIZ(PanelType panelType, Function1<? super PanelType, Unit> function1) {
        if (PatchProxy.proxy(new Object[]{panelType, function1}, this, LIZ, false, 59).isSupported) {
            return;
        }
        C106862S5w.LIZ(panelType);
        PanelType panelType2 = this.LJIJ;
        if (panelType2 == panelType) {
            if (function1 == null) {
                return;
            }
            function1.invoke(panelType);
            return;
        }
        C87010KQi.LIZ().LIZ(new C3483a(panelType2 == null ? mo15844LJ() : panelType2, panelType));
        int i = C88017KmB.LIZ[panelType.ordinal()];
        if (i == 1) {
            LIZ(panelType2, panelType);
        } else if (i == 2 || i == 3) {
            LIZ(panelType2, panelType);
        } else if (i == 4) {
            LIZ(this, panelType, false, 2, (Object) null);
        }
        this.LJIJ = panelType;
        if (function1 == null) {
            return;
        }
        function1.invoke(panelType);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    /* renamed from: LJ */
    public final PanelType mo15844LJ() {
        PanelType panelType = this.LJIJ;
        if (panelType == null) {
            return PanelType.PANEL_TYPE_X_SCREEN;
        }
        return panelType;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final ViewGroup LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 32);
        if (proxy.isSupported) {
            return (ViewGroup) proxy.result;
        }
        return (ViewGroup) LIZJ(2131176953);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final Window LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 33);
        if (proxy.isSupported) {
            return (Window) proxy.result;
        }
        return getWindow();
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void LJII() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 43).isSupported) {
            return;
        }
        LK1.LIZ(0L, false, false, new FullScreenOpenPanel$showDoubleBallLoading$1(this), 7, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 44).isSupported) {
            return;
        }
        LK1.LIZ(0L, false, false, new FullScreenOpenPanel$hideDoubleBallLoading$1(this), 7, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void dismiss() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 50).isSupported) {
            return;
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        this.LJI = true;
        AbstractC3610e LJIIL = LJIIL();
        if (LJIIL != null) {
            LJIIL.LJIIJJI();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        C87911KkT.LIZIZ.LIZ("onPause", "FullScreenOpenPanel$$");
        super.onPause();
    }

    static {
        Covode.recordClassIndex(20743);
        PublishSubject create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "");
        LJIL = create;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 42).isSupported) {
            return;
        }
        LJIIIIZZ();
        ViewGroup viewGroup = this.LIZJ;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        LK1.LIZJ(viewGroup);
        TextView textView = this.LJJIII;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        LK1.LIZJ(textView);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final int LJIIIZ() {
        int screenHeight;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 46);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 45);
        if (proxy2.isSupported) {
            screenHeight = ((Integer) proxy2.result).intValue();
        } else {
            screenHeight = (int) (UIUtils.getScreenHeight(this) - UIUtils.dip2Px(this, 40.0f));
            if (screenHeight <= 0) {
                screenHeight = (int) UIUtils.dip2Px(this, 300.0f);
            }
        }
        return (int) (screenHeight / 0.92f);
    }

    public final void LJIIJJI() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 55).isSupported && !LJIILIIL() && !this.LJJIIZ) {
            this.LJJIIZ = true;
            C4581449w c4581449w = new C4581449w();
            c4581449w.LIZ("open_game_page");
            c4581449w.LIZJ = Long.valueOf(LIZIZ());
            c4581449w.LJII = false;
            c4581449w.LJIIIIZZ = new FullScreenOpenPanel$showFloatWindow$$inlined$apply$lambda$1(this);
            ((ILiveVideoFloatWindowService) ServiceManager.getService(ILiveVideoFloatWindowService.class)).startShowFloat(this, c4581449w);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void hide() {
        Boolean LIZ2;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 41).isSupported && (LIZ2 = LIZ(this.LJI, true, new FullScreenOpenPanel$hide$1(this))) != null) {
            LIZ2.booleanValue();
            if (this.LJIJ == PanelType.PANEL_TYPE_LANDSCAPE) {
                setRequestedOrientation(1);
            }
            LIZ(this, false, 1, null);
            LIZIZ(this, false, 1, null);
            LIZ(this, (Float) null, true, 1, (Object) null);
            if (LJIILL().hasStarted() && !LJIILL().hasEnded()) {
                return;
            }
            LIZ(this, (Float) null, true, 1, (Object) null);
            LJIILL().reset();
            LJIILL().setAnimationListener(new animation.Animation$AnimationListenerC88027KmL(this));
            RoundCornerConstraintLayout roundCornerConstraintLayout = this.LIZIZ;
            if (roundCornerConstraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            roundCornerConstraintLayout.startAnimation(LJIILL());
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 31).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        C87911KkT.LIZIZ.LIZ("onDestroy", "FullScreenOpenPanel$$");
        C87713KhH c87713KhH = LJJ;
        int LIZ2 = LIZ();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(LIZ2)}, c87713KhH, C87713KhH.LIZ, false, 5).isSupported) {
            LJIJJLI.add(Integer.valueOf(LIZ2));
            LJIJJ.remove(Integer.valueOf(LIZ2));
        }
        AbstractC3610e LJIIL = LJIIL();
        if (LJIIL != null) {
            LJIIL.LJII();
        }
        RoundCornerConstraintLayout roundCornerConstraintLayout = this.LIZIZ;
        if (roundCornerConstraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        roundCornerConstraintLayout.clearAnimation();
        LIZIZ(this, false, 1, null);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        PanelType panelType;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
        RoundCornerConstraintLayout roundCornerConstraintLayout = this.LIZIZ;
        if (roundCornerConstraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        LK1.LIZ((View) roundCornerConstraintLayout, true);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 64);
        if (proxy.isSupported) {
            ((Boolean) proxy.result).booleanValue();
        } else if (this.LJIJ == PanelType.PANEL_TYPE_LANDSCAPE && getRequestedOrientation() != 0) {
            LIZ(PanelType.PANEL_TYPE_LANDSCAPE, true);
        } else if (this.LJIJ != PanelType.PANEL_TYPE_LANDSCAPE && getRequestedOrientation() != 1 && (panelType = this.LJIJ) != null) {
            LIZ(panelType, true);
        }
        LIZLLL(this.LJIJ);
        this.LJII = false;
        LIZ(this.LJI, false, new FullScreenOpenPanel$onResume$1(this));
        this.LJI = true;
        C87911KkT.LIZIZ.LIZ("onResume", "FullScreenOpenPanel$$");
        if (LJIILJJIL().hasStarted() && !LJIILJJIL().hasEnded()) {
            return;
        }
        LIZ(this, (Float) null, true, 1, (Object) null);
        LJIILJJIL().reset();
        Animation LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null) {
            LJIILJJIL.setAnimationListener(new animation.Animation$AnimationListenerC88028KmM(this));
        }
        LJIILJJIL().reset();
        RoundCornerConstraintLayout roundCornerConstraintLayout2 = this.LIZIZ;
        if (roundCornerConstraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        roundCornerConstraintLayout2.startAnimation(LJIILJJIL());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        AbstractC87170KWm LIZ2;
        AbstractC87170KWm LIZ3;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 29).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 28).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 27).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 30).isSupported) {
                    GOY.LIZLLL(this);
                    C87911KkT c87911KkT = C87911KkT.LIZIZ;
                    c87911KkT.LIZ("onStop " + this.LJI, "FullScreenOpenPanel$$");
                    LIZ(this.LJI, true, new FullScreenOpenPanel$onStop$1(this));
                    LIZ(this, (Float) null, true, 1, (Object) null);
                    this.LJI = false;
                    this.LJIILJJIL = false;
                    if (!isFinishing() && (LIZ3 = AbstractC87170KWm.LJI.LIZ()) != null) {
                        LIZ3.LJFF = false;
                    }
                    super.onStop();
                    if (isFinishing() && (LIZ2 = AbstractC87170KWm.LJI.LIZ()) != null) {
                        LIZ2.LJFF = false;
                    }
                }
                if (EnterTransitionCrashOptimizer.getContext() != null) {
                    int i = Build.VERSION.SDK_INT;
                    try {
                        getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                    } catch (Throwable unused) {
                    }
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void show() {
        Boolean LIZ2;
        int i;
        DataCenter dataCenter;
        C3607p c3607p;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 40).isSupported && (LIZ2 = LIZ(this.LJI, false, new FullScreenOpenPanel$show$1(this))) != null) {
            LIZ2.booleanValue();
            if (!isDestroyed()) {
                Lifecycle mo29786getLifecycle = mo29786getLifecycle();
                Intrinsics.checkNotNullExpressionValue(mo29786getLifecycle, "");
                if (mo29786getLifecycle.getCurrentState() != Lifecycle.State.RESUMED) {
                    AbstractC87170KWm LIZ3 = AbstractC87170KWm.LJI.LIZ();
                    if (LIZ3 != null) {
                        LIZ3.LJFF = true;
                    }
                    C87713KhH c87713KhH = LJJ;
                    Application LIZ4 = AnonymousClass425.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                    FullScreenOpenPanel$show$2 fullScreenOpenPanel$show$2 = new FullScreenOpenPanel$show$2(this);
                    if (!PatchProxy.proxy(new Object[]{LIZ4, FullScreenOpenPanel.class, fullScreenOpenPanel$show$2}, c87713KhH, C87713KhH.LIZ, false, 8).isSupported) {
                        Intent intent = new Intent(LIZ4, FullScreenOpenPanel.class);
                        intent.addFlags(268435456);
                        fullScreenOpenPanel$show$2.invoke(intent);
                        C116971W2r.LIZ(LIZ4, intent);
                    }
                    if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 58).isSupported) {
                        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_AUDIENCE_COLLECT_GAME;
                        Intrinsics.checkNotNullExpressionValue(settingKey, "");
                        if (settingKey.getValue().booleanValue() && !LJIILIIL()) {
                            C3682x c3682x = this.LJIILIIL;
                            if ((c3682x != null && (c3607p = c3682x.LJIIIIZZ) != null && c3607p.LIZLLL) || C438153Uz.LIZIZ().getBoolean("live.key.AUDIENCE_HAS_COLLECTED", false) || (i = C438153Uz.LIZIZ().getInt("live.key.SHOW_START_GAME_TIP_COUNT", 0)) >= 5) {
                                return;
                            }
                            this.LJIILLIIL = new RunnableC88029KmN(this, i);
                            if (i == 0) {
                                Runnable runnable = this.LJIILLIIL;
                                if (runnable != null) {
                                    runnable.run();
                                    return;
                                }
                                return;
                            }
                            C3682x c3682x2 = this.LJIILIIL;
                            if (c3682x2 != null && (dataCenter = c3682x2.f26082LJ) != null) {
                                dataCenter.observe("key_live_game_pay_success", new C88034KmS(this), false);
                            }
                            C422912oP.LIZ(this.LJIILLIIL, 180000L);
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void LIZ(View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, LIZ, false, 48).isSupported) {
            return;
        }
        C106862S5w.LIZ(onClickListener);
        this.LJIILL = onClickListener;
    }

    @Override // p003X.AbstractC87833KjD
    public final /* synthetic */ void bindDelegate(AbstractC3610e abstractC3610e) {
        if (!PatchProxy.proxy(new Object[]{abstractC3610e}, this, LIZ, false, 69).isSupported) {
            C106862S5w.LIZ(abstractC3610e);
            this.LJJIJIIJIL.bindDelegate(abstractC3610e);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, LIZ, false, 25).isSupported) {
            return;
        }
        C87911KkT.LIZIZ.LIZ("FullScreenOpenPanel$$", "onNewIntent");
        super.onNewIntent(intent);
    }

    @Override // p003X.AbstractC87833KjD
    public final /* synthetic */ void registerListener(AbstractC3610e abstractC3610e) {
        if (!PatchProxy.proxy(new Object[]{abstractC3610e}, this, LIZ, false, 72).isSupported) {
            C106862S5w.LIZ(abstractC3610e);
            this.LJJIJIIJIL.registerListener(abstractC3610e);
        }
    }

    public static final /* synthetic */ ViewGroup LIZ(FullScreenOpenPanel fullScreenOpenPanel) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{fullScreenOpenPanel}, null, LIZ, true, 75);
        if (proxy.isSupported) {
            return (ViewGroup) proxy.result;
        }
        ViewGroup viewGroup = fullScreenOpenPanel.LIZJ;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return viewGroup;
    }

    public static final /* synthetic */ ViewGroup LIZIZ(FullScreenOpenPanel fullScreenOpenPanel) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{fullScreenOpenPanel}, null, LIZ, true, 77);
        if (proxy.isSupported) {
            return (ViewGroup) proxy.result;
        }
        ViewGroup viewGroup = fullScreenOpenPanel.f26077LJ;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return viewGroup;
    }

    public static final /* synthetic */ DoubleColorBallAnimationView LIZJ(FullScreenOpenPanel fullScreenOpenPanel) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{fullScreenOpenPanel}, null, LIZ, true, 78);
        if (proxy.isSupported) {
            return (DoubleColorBallAnimationView) proxy.result;
        }
        DoubleColorBallAnimationView doubleColorBallAnimationView = fullScreenOpenPanel.LIZLLL;
        if (doubleColorBallAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return doubleColorBallAnimationView;
    }

    private final void LIZLLL(PanelType panelType) {
        if (PatchProxy.proxy(new Object[]{panelType}, this, LIZ, false, 65).isSupported || panelType == null) {
            return;
        }
        if (panelType != PanelType.PANEL_TYPE_LANDSCAPE && panelType != PanelType.PANEL_TYPE_PORTRAIT) {
            C89019L5p.LIZ(this);
        } else {
            C89019L5p.LIZ(getWindow());
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void addTopMessageView(View view) {
        MethodCollector.m14708i(1463);
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 37).isSupported) {
            MethodCollector.m14707o(1463);
            return;
        }
        C106862S5w.LIZ(view);
        ViewGroup viewGroup = this.LJJIIJZLJL;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        viewGroup.addView(view);
        MethodCollector.m14707o(1463);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void addTopRightBtnView(View view) {
        View view2;
        MethodCollector.m14708i(1462);
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 34).isSupported) {
            MethodCollector.m14707o(1462);
            return;
        }
        C106862S5w.LIZ(view);
        if (!(view instanceof C87993Kln)) {
            view2 = null;
        } else {
            view2 = view;
        }
        C87993Kln c87993Kln = (C87993Kln) view2;
        if (c87993Kln != null) {
            this.LJFF = c87993Kln;
        }
        ViewGroup viewGroup = this.LJJIIJ;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        viewGroup.addView(view);
        MethodCollector.m14707o(1462);
    }

    public final void LIZLLL(boolean z) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 56).isSupported && !LJIILIIL() && this.LJJIIZ) {
            ((ILiveVideoFloatWindowService) ServiceManager.getService(ILiveVideoFloatWindowService.class)).stopShowFloat();
            if (z) {
                C87010KQi.LIZ().LIZ(new C5986ap(42));
            }
            this.LJJIIZ = false;
        }
    }

    /* renamed from: LJ */
    public final void m15845LJ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 67).isSupported) {
            return;
        }
        if (z || this.LJIJ == PanelType.PANEL_TYPE_LANDSCAPE || this.LJIJ == PanelType.PANEL_TYPE_PORTRAIT) {
            TrackMiniGameService.f26093LJ.LIZ(String.valueOf(LIZIZ()), LJIILIIL(), this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, String.valueOf((System.currentTimeMillis() - this.LJJIIZI) / 1000));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.proxy(new Object[]{configuration}, this, LIZ, false, 51).isSupported) {
            return;
        }
        C106862S5w.LIZ(configuration);
        if (!PatchProxy.proxy(new Object[]{this, configuration}, null, LIZ, true, 53).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, configuration}, null, LIZ, true, 52).isSupported) {
                super.onConfigurationChanged(configuration);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, configuration);
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
        if (configuration.orientation == 2) {
            LJIIJJI();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 19).isSupported && !PatchProxy.proxy(new Object[]{this, Byte.valueOf((byte) z)}, null, LIZ, true, 18).isSupported) {
            if (PlayerSettingCenter.INSTANCE.LJIILL()) {
                C63065Auh.LIZ().LIZ(this, z);
            }
            if (!PatchProxy.proxy(new Object[]{Byte.valueOf((byte) z)}, this, LIZ, false, 20).isSupported) {
                super.onWindowFocusChanged(z);
                if (z != 0) {
                    LIZLLL(this.LJIJ);
                }
            }
        }
    }

    public final void LIZJ(PanelType panelType) {
        if (PatchProxy.proxy(new Object[]{panelType}, this, LIZ, false, 66).isSupported) {
            return;
        }
        int i = C88017KmB.LIZJ[panelType.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                return;
            }
            TrackMiniGameService.f26093LJ.LIZ(String.valueOf(LIZIZ()), LJIILIIL(), this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL);
            return;
        }
        this.LJJIIZI = System.currentTimeMillis();
        TrackMiniGameService.f26093LJ.LIZIZ(String.valueOf(LIZIZ()), LJIILIIL(), this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 38).isSupported) {
            return;
        }
        if (i == 0) {
            ViewGroup viewGroup = this.LJJIIJZLJL;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            UIUtils.setViewVisibility(viewGroup, 0);
            return;
        }
        ViewGroup viewGroup2 = this.LJJIIJZLJL;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        UIUtils.setViewVisibility(viewGroup2, 8);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void LIZJ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 49).isSupported) {
            return;
        }
        C87911KkT.LIZIZ.LIZ("FullScreenOpenPanel$$", "全屏的面板不需要处理圆角的变化 -- 因为圆角要一直展示");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 11).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 13).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 12).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
        C87836KjG.LIZ(this, AbstractC3610e.class);
        overridePendingTransition(0, 0);
        setContentView(2131700073);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            getWindow().setGravity(80);
            getWindow().setLayout(-1, -1);
            getWindow().setDimAmount(0.0f);
            if (Build.VERSION.SDK_INT >= 28) {
                Window window = getWindow();
                Intrinsics.checkNotNullExpressionValue(window, "");
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                Window window2 = getWindow();
                Intrinsics.checkNotNullExpressionValue(window2, "");
                window2.setAttributes(attributes);
            }
            Window window3 = getWindow();
            Intrinsics.checkNotNullExpressionValue(window3, "");
            window3.getDecorView().post(new RunnableC88020KmE(this));
            C65365Bqh.LIZ(this);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            RoundCornerConstraintLayout roundCornerConstraintLayout = (RoundCornerConstraintLayout) LIZJ(2131175908);
            Intrinsics.checkNotNullExpressionValue(roundCornerConstraintLayout, "");
            this.LIZIZ = roundCornerConstraintLayout;
            LIZJ(2131176953);
            Intrinsics.checkNotNullExpressionValue(LIZJ(2131190496), "");
            FrameLayout frameLayout = (FrameLayout) LIZJ(2131182121);
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            this.LIZJ = frameLayout;
            DoubleColorBallAnimationView doubleColorBallAnimationView = (DoubleColorBallAnimationView) LIZJ(2131172767);
            Intrinsics.checkNotNullExpressionValue(doubleColorBallAnimationView, "");
            this.LIZLLL = doubleColorBallAnimationView;
            FrameLayout frameLayout2 = (FrameLayout) LIZJ(2131172768);
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
            this.f26077LJ = frameLayout2;
            ViewGroup viewGroup = this.f26077LJ;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            viewGroup.setOnClickListener(View$OnClickListenerC88039KmX.LIZ);
            TextView textView = (TextView) LIZJ(2131187853);
            Intrinsics.checkNotNullExpressionValue(textView, "");
            this.LJJIII = textView;
            TextView textView2 = this.LJJIII;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textView2.setOnClickListener(new View$OnClickListenerC88036KmU(this));
            FrameLayout frameLayout3 = (FrameLayout) LIZJ(2131192555);
            Intrinsics.checkNotNullExpressionValue(frameLayout3, "");
            this.LJJIIJ = frameLayout3;
            ViewGroup viewGroup2 = this.LJJIIJ;
            if (viewGroup2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            C3Q0.LJFF(viewGroup2);
            ViewGroup viewGroup3 = this.LJJIIJ;
            if (viewGroup3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            viewGroup3.setVisibility(8);
            FrameLayout frameLayout4 = (FrameLayout) LIZJ(2131192541);
            Intrinsics.checkNotNullExpressionValue(frameLayout4, "");
            this.LJJIIJZLJL = frameLayout4;
            ViewGroup viewGroup4 = this.LJJIIJZLJL;
            if (viewGroup4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            viewGroup4.setVisibility(8);
            ((LinearLayout) LIZJ(2131175284)).setOnClickListener(new View$OnClickListenerC88038KmW(this));
            LIZ(PanelType.PANEL_TYPE_X_SCREEN);
        }
        C87713KhH c87713KhH = LJJ;
        int LIZ2 = LIZ();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(LIZ2), this}, c87713KhH, C87713KhH.LIZ, false, 4).isSupported) {
            LJIJJ.put(Integer.valueOf(LIZ2), new WeakReference<>(this));
            LJIL.onNext(TuplesKt.m137to(Integer.valueOf(LIZ2), this));
        }
        LJII();
        AbstractC3610e LJIIL = LJIIL();
        if (LJIIL != null) {
            LJIIL.LJIIIZ();
        }
    }

    public final void LIZIZ(PanelType panelType) {
        if (PatchProxy.proxy(new Object[]{panelType}, this, LIZ, false, 61).isSupported) {
            return;
        }
        int LIZLLL = LK1.LIZLLL(12);
        ViewGroup viewGroup = this.LJJIIJ;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        int i = C88017KmB.LIZIZ[panelType.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    LIZ(this, (Float) null, false, 3, (Object) null);
                    RoundCornerConstraintLayout roundCornerConstraintLayout = this.LIZIZ;
                    if (roundCornerConstraintLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    roundCornerConstraintLayout.LIZ(0, 0, 0, 0);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                LIZ(this, Float.valueOf(LK1.LIZJ(12)), false, 2, (Object) null);
                RoundCornerConstraintLayout roundCornerConstraintLayout2 = this.LIZIZ;
                if (roundCornerConstraintLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                roundCornerConstraintLayout2.LIZ(LK1.LIZLLL(12), 0, LK1.LIZLLL(12), 0);
            }
        } else {
            RoundCornerConstraintLayout roundCornerConstraintLayout3 = this.LIZIZ;
            if (roundCornerConstraintLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            roundCornerConstraintLayout3.LIZ(0, 0, 0, 0);
            LIZ(this, (Float) null, false, 3, (Object) null);
            LIZLLL += LK5.m23418LJ();
        }
        C3Q0.m24913LJ(viewGroup, LIZLLL);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void LIZIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 47).isSupported) {
            return;
        }
        if (z) {
            RoundCornerConstraintLayout roundCornerConstraintLayout = this.LIZIZ;
            if (roundCornerConstraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            roundCornerConstraintLayout.setBackground(new ColorDrawable(CastProtectorUtils.parseColor("#161616")));
            return;
        }
        RoundCornerConstraintLayout roundCornerConstraintLayout2 = this.LIZIZ;
        if (roundCornerConstraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        roundCornerConstraintLayout2.setBackground(new ColorDrawable(ViewCompat.MEASURED_STATE_MASK));
    }

    private void LIZ(PanelType panelType, PanelType panelType2) {
        int i;
        if (PatchProxy.proxy(new Object[]{panelType, panelType2}, this, LIZ, false, 60).isSupported) {
            return;
        }
        C106862S5w.LIZ(panelType2);
        if (panelType == panelType2) {
            return;
        }
        if (panelType == PanelType.PANEL_TYPE_LANDSCAPE) {
            if (panelType2 != PanelType.PANEL_TYPE_PORTRAIT) {
                LIZLLL(true);
            }
            LIZJ(panelType2);
            LIZLLL(panelType2);
            LIZ(this, panelType2, false, 2, (Object) null);
            if (PanelType.Companion.LIZ(panelType2)) {
                LIZ(this, (Float) null, false, 3, (Object) null);
            } else {
                LIZ(this, Float.valueOf(LK1.LIZJ(12)), false, 2, (Object) null);
            }
            RoundCornerConstraintLayout roundCornerConstraintLayout = this.LIZIZ;
            if (roundCornerConstraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            roundCornerConstraintLayout.setLayoutParams(new LinearLayout.LayoutParams(panelType2.width, panelType2.height));
            return;
        }
        LIZLLL(panelType2);
        LJII();
        LIZ(this, (Float) null, true, 1, (Object) null);
        C2ZW c2zw = C2ZW.LIZIZ;
        RoundCornerConstraintLayout roundCornerConstraintLayout2 = this.LIZIZ;
        if (roundCornerConstraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        PanelType panelType3 = this.LJIJ;
        if (panelType3 != null) {
            i = panelType3.height;
        } else {
            i = panelType2.height;
        }
        IUM.LIZIZ(c2zw.LIZ(roundCornerConstraintLayout2, i, panelType2.height, 500L), new FullScreenOpenPanel$switchPortraitScreen$1(this, panelType2, panelType));
    }

    private final void LIZ(PanelType panelType, boolean z) {
        int i = 0;
        if (PatchProxy.proxy(new Object[]{panelType, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 62).isSupported) {
            return;
        }
        if (panelType != PanelType.PANEL_TYPE_LANDSCAPE) {
            i = 1;
        }
        setRequestedOrientation(i);
        if (panelType == PanelType.PANEL_TYPE_LANDSCAPE) {
            LIZIZ(panelType);
            LIZLLL(panelType);
            RoundCornerConstraintLayout roundCornerConstraintLayout = this.LIZIZ;
            if (roundCornerConstraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            roundCornerConstraintLayout.setLayoutParams(new LinearLayout.LayoutParams(PanelType.PANEL_TYPE_LANDSCAPE.width, PanelType.PANEL_TYPE_LANDSCAPE.height));
            if (!z) {
                LIZJ(panelType);
                return;
            }
            return;
        }
        if (panelType != PanelType.PANEL_TYPE_LANDSCAPE) {
            m15845LJ(true);
        }
        LIZLLL(panelType);
        LIZIZ(panelType);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{intent, Integer.valueOf(i), bundle}, this, LIZ, false, 26).isSupported) {
            return;
        }
        this.LJIILJJIL = true;
        super.startActivityForResult(intent, i, bundle);
    }

    public static /* synthetic */ void LIZIZ(FullScreenOpenPanel fullScreenOpenPanel, boolean z, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{fullScreenOpenPanel, (byte) 0, 1, null}, null, LIZ, true, 57).isSupported) {
            return;
        }
        fullScreenOpenPanel.LIZLLL(false);
    }

    public static /* synthetic */ void LIZ(FullScreenOpenPanel fullScreenOpenPanel, boolean z, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{fullScreenOpenPanel, (byte) 0, 1, null}, null, LIZ, true, 68).isSupported) {
            return;
        }
        fullScreenOpenPanel.m15845LJ(false);
    }

    public static /* synthetic */ void LIZ(FullScreenOpenPanel fullScreenOpenPanel, PanelType panelType, boolean z, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{fullScreenOpenPanel, panelType, (byte) 0, 2, null}, null, LIZ, true, 63).isSupported) {
            return;
        }
        fullScreenOpenPanel.LIZ(panelType, false);
    }

    public static /* synthetic */ void LIZ(FullScreenOpenPanel fullScreenOpenPanel, Float f, boolean z, int i, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        if (PatchProxy.proxy(new Object[]{fullScreenOpenPanel, f, Byte.valueOf(b), Integer.valueOf(i), null}, null, LIZ, true, 23).isSupported) {
            return;
        }
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        fullScreenOpenPanel.LIZ(f, z);
    }
}
