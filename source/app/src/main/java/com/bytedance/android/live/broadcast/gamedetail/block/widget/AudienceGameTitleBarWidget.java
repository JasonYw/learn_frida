package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.download.C3002c;
import com.bytedance.android.live.broadcast.download.DownloadView;
import com.bytedance.android.live.broadcast.gamedetail.order.view.AudienceTitleReverseBtnConfig;
import com.bytedance.android.live.broadcast.gamedetail.order.view.ReserveButton;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12642p;
import com.bytedance.ies.sve_core.PureWidget;
import io.reactivex.disposables.Disposable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.AnonymousClass479;
import p003X.C106862S5w;
import p003X.C89019L5p;
import p003X.L7U;
import p003X.LE4;
import p003X.LHO;
import p003X.LK5;
import p003X.View$OnClickListenerC89084L8c;
import p003X.View$OnClickListenerC89085L8d;

/* loaded from: classes5.dex */
public final class AudienceGameTitleBarWidget extends PureWidget<C3086g> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public LinearLayout LIZJ;
    public ImageView LIZLLL;

    /* renamed from: LJ */
    public HSImageView f25863LJ;
    public TextView LJFF;
    public DownloadView LJI;
    public ObjectAnimator LJII;
    public ReserveButton LJIIIIZZ;
    public Disposable LJIIIZ;
    public ImageView LJIIJJI;
    public C3002c LJIIL;
    public View LJIILIIL;
    public final boolean LIZIZ = true ^ AnonymousClass479.LIZJ();
    public int LJIILL = LK5.LIZIZ(2131624626);
    public Function0<Unit> LJIIJ = AudienceGameTitleBarWidget$closeClickAction$1.INSTANCE;

    static {
        Covode.recordClassIndex(16339);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699248;
    }

    @Override // com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 14).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public AudienceGameTitleBarWidget() {
        super(null, 1);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        Context context;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onResume();
        LinearLayout linearLayout = this.LIZJ;
        if (linearLayout != null && linearLayout.getVisibility() == 0 && this.LIZIZ && (context = this.context) != null && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            View view = this.LJIILIIL;
            if (view != null) {
                view.setVisibility(8);
            }
            C89019L5p.LIZIZ(activity, LK5.LIZIZ(2131626090));
        }
    }

    @Override // com.bytedance.ies.sve_core.PureWidget
    /* renamed from: r_ */
    public final void mo14489r_() {
        View view;
        MethodCollector.m14708i(1271);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            MethodCollector.m14707o(1271);
            return;
        }
        super.mo14489r_();
        ObjectAnimator objectAnimator = this.LJII;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (this.LJIIL != null) {
            LE4.LIZIZ.LIZ(this.context, this.LJIIL);
        }
        Context context = this.context;
        if (context != null && (context instanceof Activity)) {
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null) {
                if (!PatchProxy.proxy(new Object[]{activity}, this, LIZ, false, 10).isSupported && (view = this.LJIILIIL) != null && view.getParent() != null) {
                    Window window = activity.getWindow();
                    Intrinsics.checkNotNullExpressionValue(window, "");
                    View decorView = window.getDecorView();
                    if (decorView != null) {
                        ((ViewGroup) decorView).removeView(view);
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                        MethodCollector.m14707o(1271);
                        throw nullPointerException;
                    }
                }
                C89019L5p.LIZIZ(activity, this.LJIILL);
            }
        }
        Disposable disposable = this.LJIIIZ;
        if (disposable != null) {
            disposable.dispose();
            MethodCollector.m14707o(1271);
            return;
        }
        MethodCollector.m14707o(1271);
    }

    @Override // com.bytedance.ies.sve_core.PureWidget
    public final void LIZLLL() {
        ReserveButton reserveButton;
        LinearLayout linearLayout;
        ImageView imageView;
        ImageView imageView2;
        HSImageView hSImageView;
        TextView textView;
        DownloadView downloadView;
        Context context;
        MethodCollector.m14708i(1270);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1270);
            return;
        }
        super.LIZLLL();
        View view = this.contentView;
        if (view != null) {
            reserveButton = (ReserveButton) view.findViewById(2131168696);
        } else {
            reserveButton = null;
        }
        this.LJIIIIZZ = reserveButton;
        View view2 = this.contentView;
        if (view2 != null) {
            linearLayout = (LinearLayout) view2.findViewById(2131181645);
        } else {
            linearLayout = null;
        }
        this.LIZJ = linearLayout;
        LinearLayout linearLayout2 = this.LIZJ;
        if (linearLayout2 != null) {
            imageView = (ImageView) linearLayout2.findViewById(2131179011);
        } else {
            imageView = null;
        }
        this.LJIIJJI = imageView;
        View view3 = this.contentView;
        if (view3 != null) {
            imageView2 = (ImageView) view3.findViewById(2131179012);
        } else {
            imageView2 = null;
        }
        this.LIZLLL = imageView2;
        ImageView imageView3 = this.LJIIJJI;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View$OnClickListenerC89084L8c(this));
        }
        ImageView imageView4 = this.LIZLLL;
        if (imageView4 != null) {
            imageView4.setOnClickListener(new View$OnClickListenerC89085L8d(this));
        }
        LinearLayout linearLayout3 = this.LIZJ;
        if (linearLayout3 != null) {
            hSImageView = (HSImageView) linearLayout3.findViewById(2131179013);
        } else {
            hSImageView = null;
        }
        this.f25863LJ = hSImageView;
        LinearLayout linearLayout4 = this.LIZJ;
        if (linearLayout4 != null) {
            textView = (TextView) linearLayout4.findViewById(2131194200);
        } else {
            textView = null;
        }
        this.LJFF = textView;
        LinearLayout linearLayout5 = this.LIZJ;
        if (linearLayout5 != null) {
            downloadView = (DownloadView) linearLayout5.findViewById(2131194199);
        } else {
            downloadView = null;
        }
        this.LJI = downloadView;
        LinearLayout linearLayout6 = this.LIZJ;
        if (linearLayout6 != null) {
            this.LJII = ObjectAnimator.ofFloat(linearLayout6, "alpha", 0.0f, 1.0f);
            ObjectAnimator objectAnimator = this.LJII;
            if (objectAnimator != null) {
                objectAnimator.setDuration(200L);
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported && (context = this.context) != null && (context instanceof Activity)) {
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null) {
                if (!PatchProxy.proxy(new Object[]{activity}, this, LIZ, false, 11).isSupported && this.LJIILIIL == null) {
                    this.LJIILIIL = new View(activity);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, LHO.LIZLLL.LIZ((Context) activity));
                    View view4 = this.LJIILIIL;
                    if (view4 != null) {
                        view4.setLayoutParams(layoutParams);
                    }
                    View view5 = this.LJIILIIL;
                    if (view5 != null) {
                        view5.setBackgroundResource(2130854572);
                    }
                    Window window = activity.getWindow();
                    Intrinsics.checkNotNullExpressionValue(window, "");
                    View decorView = window.getDecorView();
                    if (decorView != null) {
                        ((ViewGroup) decorView).addView(this.LJIILIIL);
                        View view6 = this.LJIILIIL;
                        if (view6 != null) {
                            view6.setVisibility(8);
                        }
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                        MethodCollector.m14707o(1270);
                        throw nullPointerException;
                    }
                }
                this.LJIILL = C89019L5p.LIZIZ(activity);
            } else {
                MethodCollector.m14707o(1270);
                return;
            }
        }
        MethodCollector.m14707o(1270);
    }

    @Override // p003X.LAL
    public final /* synthetic */ void LIZ(AbstractC12642p abstractC12642p) {
        if (!PatchProxy.proxy(new Object[]{abstractC12642p}, this, LIZ, false, 4).isSupported) {
            C106862S5w.LIZ(abstractC12642p);
            L7U.LIZ(this, abstractC12642p, AudienceGameTitleBarWidget$onUpdate$1.INSTANCE, null, new AudienceGameTitleBarWidget$onUpdate$2(this), 2, null);
            L7U.LIZ(this, abstractC12642p, AudienceGameTitleBarWidget$onUpdate$3.INSTANCE, null, new AudienceGameTitleBarWidget$onUpdate$4(this), 2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x015c, code lost:
        if (r40 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0172, code lost:
        if (r40 != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(com.bytedance.android.live.broadcast.gamedetailv2.data.C3119b r40) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.gamedetail.block.widget.AudienceGameTitleBarWidget.LIZ(com.bytedance.android.live.broadcast.gamedetailv2.data.b):void");
    }

    public final void LIZ(Integer num) {
        if (PatchProxy.proxy(new Object[]{num}, this, LIZ, false, 6).isSupported) {
            return;
        }
        if (num != null && num.intValue() == 1) {
            ReserveButton reserveButton = this.LJIIIIZZ;
            if (reserveButton != null) {
                reserveButton.setConfig(new AudienceTitleReverseBtnConfig(AudienceTitleReverseBtnConfig.State.CANCEL_RESERVE));
                return;
            }
            return;
        }
        ReserveButton reserveButton2 = this.LJIIIIZZ;
        if (reserveButton2 != null) {
            reserveButton2.setConfig(new AudienceTitleReverseBtnConfig(AudienceTitleReverseBtnConfig.State.IMMEDIATE_RESERVE));
        }
    }

    public final void LIZ(Boolean bool, Boolean bool2) {
        Context context;
        if (!PatchProxy.proxy(new Object[]{bool, bool2}, this, LIZ, false, 12).isSupported && (context = this.context) != null && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            if (Intrinsics.areEqual(bool2, Boolean.TRUE)) {
                View view = this.LJIILIIL;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (this.LIZIZ) {
                    C89019L5p.LIZIZ(activity, LK5.LIZIZ(2131626090));
                }
            } else if (Intrinsics.areEqual(bool, Boolean.TRUE) && this.LIZIZ) {
                View view2 = this.LJIILIIL;
                if (view2 == null) {
                    return;
                }
                view2.setVisibility(0);
            } else {
                View view3 = this.LJIILIIL;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                C89019L5p.LIZIZ(activity, this.LJIILL);
            }
        }
    }

    public static /* synthetic */ void LIZ(AudienceGameTitleBarWidget audienceGameTitleBarWidget, Boolean bool, Boolean bool2, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{audienceGameTitleBarWidget, bool, bool2, Integer.valueOf(i), null}, null, LIZ, true, 13).isSupported) {
            return;
        }
        if ((i & 1) != 0) {
            bool = Boolean.FALSE;
        }
        if ((i & 2) != 0) {
            bool2 = Boolean.FALSE;
        }
        audienceGameTitleBarWidget.LIZ(bool, bool2);
    }
}
