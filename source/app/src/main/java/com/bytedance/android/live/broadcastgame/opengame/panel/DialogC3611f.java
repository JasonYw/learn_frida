package com.bytedance.android.live.broadcastgame.opengame.panel;

import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.live.broadcastgame.opengame.service.CommercialService;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.chatroom.p518ui.DoubleColorBallAnimationView;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC87833KjD;
import p003X.AbstractC88010Km4;
import p003X.C106862S5w;
import p003X.C422912oP;
import p003X.C438153Uz;
import p003X.C596569go;
import p003X.C87831KjB;
import p003X.C87836KjG;
import p003X.C87993Kln;
import p003X.C88031KmP;
import p003X.C88035KmT;
import p003X.DialogInterface$OnDismissListenerC88032KmQ;
import p003X.LK1;
import p003X.LK5;
import p003X.RunnableC88030KmO;
import p003X.View$OnClickListenerC88037KmV;
import p003X.View$OnClickListenerC88040KmY;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.panel.f */
/* loaded from: classes5.dex */
public final class DialogC3611f extends Dialog implements AbstractC3609d, AbstractC87833KjD<AbstractC3610e> {
    public static ChangeQuickRedirect LIZ;
    public View LIZIZ;
    public ViewGroup LIZJ;
    public DoubleColorBallAnimationView LIZLLL;

    /* renamed from: LJ */
    public ViewGroup f26078LJ;
    public C87993Kln LJFF;
    public boolean LJI;
    public DialogInterface.OnDismissListener LJII;
    public View.OnClickListener LJIIIIZZ;
    public Runnable LJIIIZ;
    public boolean LJIIJ;
    public final C3682x LJIIJJI;
    public final /* synthetic */ C87831KjB<AbstractC3610e> LJIIL;
    public ViewGroup LJIILIIL;
    public TextView LJIILJJIL;
    public ViewGroup LJIILL;
    public ViewGroup LJIILLIIL;
    public ValueAnimator LJIIZILJ;
    public final DialogInterface.OnDismissListener LJIJ;
    public final AbstractC88010Km4 LJIJI;
    public PanelType LJIJJ;

    static {
        Covode.recordClassIndex(20786);
    }

    public static /* synthetic */ void LIZ(Dialog dialog) {
        if (PatchProxy.proxy(new Object[]{dialog}, null, LIZ, true, 14).isSupported) {
            return;
        }
        super.show();
    }

    public final AbstractC3610e LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 37);
        return (AbstractC3610e) (proxy.isSupported ? proxy.result : this.LJIIL.LIZ());
    }

    @Override // p003X.AbstractC87833KjD
    public final List<AbstractC3610e> getListeners() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 38);
        return proxy.isSupported ? (List) proxy.result : this.LJIIL.getListeners();
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final ViewGroup LIZJ() {
        return this.LJIILIIL;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    /* renamed from: LJ */
    public final PanelType mo15844LJ() {
        return this.LJIJJ;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void LIZ(boolean z) {
        C87993Kln c87993Kln;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 9).isSupported && (c87993Kln = this.LJFF) != null) {
            c87993Kln.setTopRightTheme(z);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void LIZ(PanelType panelType) {
        if (PatchProxy.proxy(new Object[]{panelType}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(panelType);
        int i = panelType.height;
        this.LJIJJ = panelType;
        ((CommercialService) this.LJIIJJI.LIZ((Class<AbstractC3719c>) CommercialService.class)).LIZ(this.LJIJJ);
        View view = this.LIZIZ;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, i));
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final Window LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (Window) proxy.result;
        }
        return getWindow();
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        super.create();
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void LJII() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        LK1.LIZ(0L, false, false, new OpenPanel$showDoubleBallLoading$1(this), 7, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            return;
        }
        LK1.LIZ(0L, false, false, new OpenPanel$hideDoubleBallLoading$1(this), 7, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final Context LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 34);
        if (proxy.isSupported) {
            return (Context) proxy.result;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return context;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        AbstractC3610e LIZ2;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 27).isSupported && (LIZ2 = LIZ()) != null) {
            LIZ2.LJIIJ();
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        AbstractC3610e LIZ2;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 26).isSupported && (LIZ2 = LIZ()) != null) {
            LIZ2.LJIIJJI();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 33).isSupported) {
            return;
        }
        ValueAnimator valueAnimator = this.LJIIZILJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onDetachedFromWindow();
    }

    private final int LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 24);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int screenHeight = (int) (UIUtils.getScreenHeight(getContext()) - UIUtils.dip2Px(getContext(), 40.0f));
        if (screenHeight <= 0) {
            return (int) UIUtils.dip2Px(getContext(), 300.0f);
        }
        return screenHeight;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        LJIIIIZZ();
        ViewGroup viewGroup = this.LIZJ;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        LK1.LIZJ(viewGroup);
        TextView textView = this.LJIILJJIL;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        LK1.LIZJ(textView);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final int LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 25);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return (int) (LIZIZ() / 0.92f);
    }

    @Override // android.app.Dialog, com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void hide() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported && !PatchProxy.proxy(new Object[0], this, LIZ, false, 28).isSupported) {
            C422912oP.LIZIZ(this.LJIIIZ);
            LK1.LIZ(0L, false, false, new OpenPanel$fakeHide$1(this), 7, null);
        }
    }

    @Override // android.app.Dialog, com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final boolean isShowing() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 19);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!super.isShowing() || !this.LJI) {
            return false;
        }
        return true;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        Window window;
        WindowManager.LayoutParams attributes;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onStart();
        if (this.LJIJI.LIZ() && (window = getWindow()) != null && (attributes = window.getAttributes()) != null) {
            attributes.height = LIZIZ();
            attributes.width = LJIIIZ();
            attributes.gravity = 8388693;
            attributes.dimAmount = 0.0f;
            View view = this.LIZIZ;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LIZ(view, new OpenPanel$onStart$$inlined$let$lambda$1(attributes, this));
        }
    }

    @Override // android.app.Dialog, com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void show() {
        int i;
        WindowManager.LayoutParams attributes;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        Window window = getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            attributes.width = -1;
            View view = this.LIZIZ;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LIZ(view, new OpenPanel$show$$inlined$let$lambda$1(attributes, this));
        }
        LIZIZ((Dialog) this);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 30).isSupported && !this.LJI) {
            this.LJI = true;
            LK1.LIZ(100L, false, false, new OpenPanel$restoreFakeHide$1(this), 6, null);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_AUDIENCE_COLLECT_GAME;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            if (settingKey.getValue().booleanValue() && !this.LJIIJJI.LJIIJ && !this.LJIIJJI.LJIIIIZZ.LIZLLL && !C438153Uz.LIZIZ().getBoolean("live.key.AUDIENCE_HAS_COLLECTED", false) && (i = C438153Uz.LIZIZ().getInt("live.key.SHOW_START_GAME_TIP_COUNT", 0)) < 5) {
                this.LJIIIZ = new RunnableC88030KmO(this, i);
                if (i == 0) {
                    Runnable runnable = this.LJIIIZ;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                DataCenter dataCenter = this.LJIIJJI.f26082LJ;
                if (dataCenter != null) {
                    dataCenter.observe("key_live_game_pay_success", new C88035KmT(this), false);
                }
                C422912oP.LIZ(this.LJIIIZ, 180000L);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.LJII = onDismissListener;
    }

    public static void LIZIZ(Dialog dialog) {
        if (PatchProxy.proxy(new Object[]{dialog}, null, LIZ, true, 15).isSupported) {
            return;
        }
        LIZ(dialog);
        C596569go.LIZ(dialog, null);
    }

    @Override // p003X.AbstractC87833KjD
    public final /* synthetic */ void bindDelegate(AbstractC3610e abstractC3610e) {
        if (!PatchProxy.proxy(new Object[]{abstractC3610e}, this, LIZ, false, 36).isSupported) {
            C106862S5w.LIZ(abstractC3610e);
            this.LJIIL.bindDelegate(abstractC3610e);
        }
    }

    @Override // p003X.AbstractC87833KjD
    public final /* synthetic */ void registerListener(AbstractC3610e abstractC3610e) {
        if (!PatchProxy.proxy(new Object[]{abstractC3610e}, this, LIZ, false, 39).isSupported) {
            C106862S5w.LIZ(abstractC3610e);
            this.LJIIL.registerListener(abstractC3610e);
        }
    }

    public static final /* synthetic */ ViewGroup LIZ(DialogC3611f dialogC3611f) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dialogC3611f}, null, LIZ, true, 42);
        if (proxy.isSupported) {
            return (ViewGroup) proxy.result;
        }
        ViewGroup viewGroup = dialogC3611f.LIZJ;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return viewGroup;
    }

    public static final /* synthetic */ DoubleColorBallAnimationView LIZJ(DialogC3611f dialogC3611f) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dialogC3611f}, null, LIZ, true, 44);
        if (proxy.isSupported) {
            return (DoubleColorBallAnimationView) proxy.result;
        }
        DoubleColorBallAnimationView doubleColorBallAnimationView = dialogC3611f.LIZLLL;
        if (doubleColorBallAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return doubleColorBallAnimationView;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void addTopMessageView(View view) {
        MethodCollector.m14708i(1467);
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 10).isSupported) {
            MethodCollector.m14707o(1467);
            return;
        }
        C106862S5w.LIZ(view);
        ViewGroup viewGroup = this.LJIILLIIL;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        viewGroup.addView(view);
        MethodCollector.m14707o(1467);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void addTopRightBtnView(View view) {
        View view2;
        MethodCollector.m14708i(1466);
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 7).isSupported) {
            MethodCollector.m14707o(1466);
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
        ViewGroup viewGroup = this.LJIILL;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        viewGroup.addView(view);
        MethodCollector.m14707o(1466);
    }

    public static final /* synthetic */ ViewGroup LIZIZ(DialogC3611f dialogC3611f) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dialogC3611f}, null, LIZ, true, 43);
        if (proxy.isSupported) {
            return (ViewGroup) proxy.result;
        }
        ViewGroup viewGroup = dialogC3611f.f26078LJ;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return viewGroup;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void LIZJ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) findViewById(2131176953);
            int i = Build.VERSION.SDK_INT;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setClipToOutline(true);
            frameLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: X.4i2
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(20788);
                }

                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    if (!PatchProxy.proxy(new Object[]{view, outline}, this, LIZ, false, 1).isSupported && view != null) {
                        float LIZJ = LK5.LIZJ(12.0f);
                        Rect rect = new Rect();
                        view.getGlobalVisibleRect(rect);
                        Rect rect2 = new Rect(0, 0, rect.right - rect.left, (int) ((rect.bottom - rect.top) + LIZJ));
                        if (outline != null) {
                            outline.setRoundRect(rect2, LIZJ);
                        }
                    }
                }
            });
            this.LJIILIIL = frameLayout;
            return;
        }
        ViewGroup viewGroup = this.LJIILIIL;
        if (viewGroup != null) {
            viewGroup.setClipToOutline(false);
        }
        ViewGroup viewGroup2 = this.LJIILIIL;
        if (viewGroup2 != null) {
            viewGroup2.setOutlineProvider(null);
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        if (i == 0) {
            ViewGroup viewGroup = this.LJIILL;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            UIUtils.setViewVisibility(viewGroup, 0);
            return;
        }
        ViewGroup viewGroup2 = this.LJIILL;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        UIUtils.setViewVisibility(viewGroup2, 8);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 11).isSupported) {
            return;
        }
        if (i == 0) {
            ViewGroup viewGroup = this.LJIILLIIL;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            UIUtils.setViewVisibility(viewGroup, 0);
            return;
        }
        ViewGroup viewGroup2 = this.LJIILLIIL;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        UIUtils.setViewVisibility(viewGroup2, 8);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        MethodCollector.m14708i(1465);
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 2).isSupported) {
            MethodCollector.m14707o(1465);
            return;
        }
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
            window.setGravity(80);
            window.setFlags(512, 512);
        }
        setContentView(2131700076);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(2131175908);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        this.LIZIZ = constraintLayout;
        LIZ(this.LJIJJ);
        LIZJ(true);
        Intrinsics.checkNotNullExpressionValue(findViewById(2131190496), "");
        FrameLayout frameLayout = (FrameLayout) findViewById(2131182121);
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        this.LIZJ = frameLayout;
        DoubleColorBallAnimationView doubleColorBallAnimationView = (DoubleColorBallAnimationView) findViewById(2131172767);
        Intrinsics.checkNotNullExpressionValue(doubleColorBallAnimationView, "");
        this.LIZLLL = doubleColorBallAnimationView;
        FrameLayout frameLayout2 = (FrameLayout) findViewById(2131172768);
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
        this.f26078LJ = frameLayout2;
        ViewGroup viewGroup = this.f26078LJ;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        viewGroup.setOnClickListener(View$OnClickListenerC88040KmY.LIZ);
        TextView textView = (TextView) findViewById(2131187853);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        this.LJIILJJIL = textView;
        TextView textView2 = this.LJIILJJIL;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        textView2.setOnClickListener(new View$OnClickListenerC88037KmV(this));
        FrameLayout frameLayout3 = (FrameLayout) findViewById(2131192555);
        Intrinsics.checkNotNullExpressionValue(frameLayout3, "");
        this.LJIILL = frameLayout3;
        ViewGroup viewGroup2 = this.LJIILL;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        viewGroup2.setVisibility(8);
        FrameLayout frameLayout4 = (FrameLayout) findViewById(2131192541);
        Intrinsics.checkNotNullExpressionValue(frameLayout4, "");
        this.LJIILLIIL = frameLayout4;
        ViewGroup viewGroup3 = this.LJIILLIIL;
        if (viewGroup3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        viewGroup3.setVisibility(8);
        LJII();
        super.setOnDismissListener(this.LJIJ);
        AbstractC3610e LIZ2 = LIZ();
        if (LIZ2 != null) {
            LIZ2.LJIIIZ();
            MethodCollector.m14707o(1465);
            return;
        }
        MethodCollector.m14707o(1465);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void LIZIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 23).isSupported) {
            return;
        }
        if (z) {
            View view = this.LIZIZ;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            view.setBackground(LK5.LIZJ(2130855005));
            return;
        }
        View view2 = this.LIZIZ;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        view2.setBackground(new ColorDrawable(ViewCompat.MEASURED_STATE_MASK));
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d
    public final void LIZ(View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(onClickListener);
        this.LJIIIIZZ = onClickListener;
    }

    public final void LIZ(View view, Function0<Unit> function0) {
        if (!PatchProxy.proxy(new Object[]{view, function0}, this, LIZ, false, 32).isSupported && ViewCompat.isAttachedToWindow(view)) {
            function0.mo30099invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC3611f(C3682x c3682x, AbstractC88010Km4 abstractC88010Km4, PanelType panelType) {
        super(c3682x.LIZLLL, 2131495003);
        C106862S5w.LIZ(c3682x, abstractC88010Km4, panelType);
        this.LJIIL = new C87831KjB<>();
        this.LJIIJJI = c3682x;
        this.LJIJI = abstractC88010Km4;
        this.LJIJJ = panelType;
        C87836KjG.LIZ(this, AbstractC3610e.class);
        this.LJIJ = new DialogInterface$OnDismissListenerC88032KmQ(this);
    }

    public final void LIZ(int i, int i2, boolean z) {
        ValueAnimator duration;
        ValueAnimator valueAnimator;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 31).isSupported) {
            return;
        }
        ValueAnimator valueAnimator2 = this.LJIIZILJ;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.LJIIZILJ) != null) {
            valueAnimator.cancel();
        }
        this.LJIIZILJ = ValueAnimator.ofInt(1, 60);
        IntEvaluator intEvaluator = new IntEvaluator();
        ValueAnimator valueAnimator3 = this.LJIIZILJ;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new C88031KmP(this, intEvaluator, i, i2));
        }
        View view = this.LIZIZ;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        LIZ(view, new OpenPanel$performPanelAnimation$2(this, z));
        ValueAnimator valueAnimator4 = this.LJIIZILJ;
        if (valueAnimator4 != null) {
            valueAnimator4.setInterpolator(new AccelerateDecelerateInterpolator());
        }
        ValueAnimator valueAnimator5 = this.LJIIZILJ;
        if (valueAnimator5 != null && (duration = valueAnimator5.setDuration(200L)) != null) {
            duration.start();
        }
    }

    public /* synthetic */ DialogC3611f(C3682x c3682x, AbstractC88010Km4 abstractC88010Km4, PanelType panelType, int i) {
        this(c3682x, abstractC88010Km4, PanelType.PANEL_TYPE_X_SCREEN_LOW);
    }
}
