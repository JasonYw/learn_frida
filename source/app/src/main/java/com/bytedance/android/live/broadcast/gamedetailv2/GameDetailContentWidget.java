package com.bytedance.android.live.broadcast.gamedetailv2;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.comment.data.C2990g;
import com.bytedance.android.live.broadcast.download.C3002c;
import com.bytedance.android.live.broadcast.download.DownloadView;
import com.bytedance.android.live.broadcast.gamedetail.VideoRotation;
import com.bytedance.android.live.broadcast.gamedetailv2.template.C3130k;
import com.bytedance.android.live.broadcast.gamedetailv2.view.NestedParentRecyclerView;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.jsbridge.event.C3952am;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.PureWidget;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.AnonymousClass479;
import p003X.C106862S5w;
import p003X.C88999L4v;
import p003X.C89019L5p;
import p003X.C89045L6p;
import p003X.C89051L6v;
import p003X.L46;
import p003X.L5Z;
import p003X.L7E;
import p003X.LE4;
import p003X.LHO;
import p003X.LK5;
import p003X.QB4;
import p003X.View$OnClickListenerC89087L8f;
import p003X.View$OnClickListenerC89088L8g;

/* loaded from: classes5.dex */
public final class GameDetailContentWidget extends PureWidget<C3122g> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public C89045L6p LIZIZ;
    public C2990g LIZJ;
    public NestedParentRecyclerView LIZLLL;

    /* renamed from: LJ */
    public C89051L6v f25883LJ;
    public LinearLayout LJFF;
    public View LJIIJ;
    public VideoRotation LJIIL;
    public ImageView LJIILL;
    public ImageView LJIILLIIL;
    public HSImageView LJIIZILJ;
    public TextView LJIJ;
    public DownloadView LJIJI;
    public C3002c LJIJJ;
    public View LJIJJLI;
    public ObjectAnimator LJIL;
    public ObjectAnimator LJJ;
    public long LJJIFFI;
    public int LJIIIZ = LK5.LIZIZ(2131624626);
    public final ArrayList<C3130k> LJIIJJI = new ArrayList<>();
    public final boolean LJI = true ^ AnonymousClass479.LIZJ();
    public int LJIILIIL = LK5.LIZIZ(2131624626);
    public Function0<Unit> LJII = GameDetailContentWidget$closeClickAction$1.INSTANCE;
    public String LJJI = "";
    public final CompositeDisposable LJJII = new CompositeDisposable();
    public final Lazy LJJIII = LazyKt__LazyJVMKt.lazy(new GameDetailContentWidget$loadingWidget$2(this));
    public Function1<? super Boolean, Unit> LJIIIIZZ = GameDetailContentWidget$showBottomDownloadBtn$1.INSTANCE;

    static {
        Covode.recordClassIndex(16567);
    }

    public final GameDetailLoadingWidget LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (GameDetailLoadingWidget) (proxy.isSupported ? proxy.result : this.LJJIII.mo27335getValue());
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699804;
    }

    @Override // com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 26).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public GameDetailContentWidget() {
        super(null, 1);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        LinearLayout linearLayout;
        Context context;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        super.onResume();
        if (!C88999L4v.LIZIZ.LIZ() && (linearLayout = this.LJFF) != null && linearLayout.getVisibility() == 0 && (context = this.context) != null && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            View view = this.LJIIJ;
            if (view != null) {
                view.setVisibility(8);
            }
            C89019L5p.LIZIZ(activity, LK5.LIZIZ(2131626090));
        }
    }

    @Override // com.bytedance.ies.sve_core.PureWidget
    /* renamed from: r_ */
    public final void mo14489r_() {
        String str;
        View view;
        MethodCollector.m14708i(1281);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            MethodCollector.m14707o(1281);
            return;
        }
        super.mo14489r_();
        L46 l46 = L46.LIZIZ;
        C89045L6p c89045L6p = this.LIZIZ;
        if (c89045L6p == null || (str = c89045L6p.LJII) == null) {
            str = "";
        }
        long currentTimeMillis = (System.currentTimeMillis() - this.LJJIFFI) / 1000;
        if (!PatchProxy.proxy(new Object[]{str, new Long(currentTimeMillis)}, l46, L46.LIZ, false, 14).isSupported) {
            C106862S5w.LIZ(str);
            l46.LIZ("livesdk_game_promote_user_promote_detail_duration", MapsKt__MapsKt.mutableMapOf(TuplesKt.m137to("enter_from", str), TuplesKt.m137to("duration", String.valueOf(currentTimeMillis))), Room.class, C8668v.class);
        }
        ObjectAnimator objectAnimator = this.LJIL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.LJJ;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        C89051L6v c89051L6v = this.f25883LJ;
        if (c89051L6v != null) {
            c89051L6v.LIZ();
        }
        if (this.LJIJJ != null) {
            LE4.LIZIZ.LIZ(this.context, this.LJIJJ);
        }
        NestedParentRecyclerView nestedParentRecyclerView = this.LIZLLL;
        if (nestedParentRecyclerView != null) {
            nestedParentRecyclerView.setAdapter(null);
        }
        if (!this.LJJII.isDisposed()) {
            this.LJJII.dispose();
        }
        if (!C88999L4v.LIZIZ.LIZ()) {
            Context context = this.context;
            if (context != null && (context instanceof Activity)) {
                if (!(context instanceof Activity)) {
                    context = null;
                }
                Activity activity = (Activity) context;
                if (activity != null) {
                    if (!PatchProxy.proxy(new Object[]{activity}, this, LIZ, false, 22).isSupported && (view = this.LJIIJ) != null && view.getParent() != null) {
                        Window window = activity.getWindow();
                        Intrinsics.checkNotNullExpressionValue(window, "");
                        View decorView = window.getDecorView();
                        if (decorView != null) {
                            ((ViewGroup) decorView).removeView(view);
                        } else {
                            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                            MethodCollector.m14707o(1281);
                            throw nullPointerException;
                        }
                    }
                    C89019L5p.LIZIZ(activity, this.LJIIIZ);
                } else {
                    MethodCollector.m14707o(1281);
                    return;
                }
            } else {
                MethodCollector.m14707o(1281);
                return;
            }
        } else {
            Context context2 = this.context;
            if (context2 != null && (context2 instanceof Activity)) {
                if (!(context2 instanceof Activity)) {
                    context2 = null;
                }
                Activity activity2 = (Activity) context2;
                if (activity2 != null) {
                    Window window2 = activity2.getWindow();
                    Intrinsics.checkNotNullExpressionValue(window2, "");
                    window2.setNavigationBarColor(this.LJIILIIL);
                } else {
                    MethodCollector.m14707o(1281);
                    return;
                }
            }
        }
        MethodCollector.m14707o(1281);
    }

    @Override // com.bytedance.ies.sve_core.PureWidget
    public final void LIZLLL() {
        LinearLayout linearLayout;
        ImageView imageView;
        ImageView imageView2;
        HSImageView hSImageView;
        TextView textView;
        DownloadView downloadView;
        NestedParentRecyclerView nestedParentRecyclerView;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        int i;
        MethodCollector.m14708i(1280);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            MethodCollector.m14707o(1280);
            return;
        }
        super.LIZLLL();
        this.LJJIFFI = System.currentTimeMillis();
        View view = this.contentView;
        if (view != null) {
            linearLayout = (LinearLayout) view.findViewById(2131181645);
        } else {
            linearLayout = null;
        }
        this.LJFF = linearLayout;
        LinearLayout linearLayout2 = this.LJFF;
        if (linearLayout2 != null) {
            imageView = (ImageView) linearLayout2.findViewById(2131179011);
        } else {
            imageView = null;
        }
        this.LJIILL = imageView;
        View view2 = this.contentView;
        if (view2 != null) {
            imageView2 = (ImageView) view2.findViewById(2131179012);
        } else {
            imageView2 = null;
        }
        this.LJIILLIIL = imageView2;
        ImageView imageView3 = this.LJIILL;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View$OnClickListenerC89087L8f(this));
        }
        ImageView imageView4 = this.LJIILLIIL;
        if (imageView4 != null) {
            imageView4.setOnClickListener(new View$OnClickListenerC89088L8g(this));
        }
        LinearLayout linearLayout3 = this.LJFF;
        if (linearLayout3 != null) {
            hSImageView = (HSImageView) linearLayout3.findViewById(2131179013);
        } else {
            hSImageView = null;
        }
        this.LJIIZILJ = hSImageView;
        LinearLayout linearLayout4 = this.LJFF;
        if (linearLayout4 != null) {
            textView = (TextView) linearLayout4.findViewById(2131194200);
        } else {
            textView = null;
        }
        this.LJIJ = textView;
        LinearLayout linearLayout5 = this.LJFF;
        if (linearLayout5 != null) {
            downloadView = (DownloadView) linearLayout5.findViewById(2131194199);
        } else {
            downloadView = null;
        }
        this.LJIJI = downloadView;
        LinearLayout linearLayout6 = this.LJFF;
        if (linearLayout6 != null) {
            this.LJIL = ObjectAnimator.ofFloat(linearLayout6, "alpha", 0.0f, 1.0f);
            ObjectAnimator objectAnimator = this.LJIL;
            if (objectAnimator != null) {
                objectAnimator.setDuration(200L);
            }
        }
        this.LJIJJLI = this.contentView.findViewById(2131196397);
        if (C88999L4v.LIZIZ.LIZ()) {
            View view3 = this.LJIJJLI;
            if (view3 != null) {
                view3.setBackgroundColor(LK5.LIZIZ(2131626090));
            }
            View view4 = this.LJIJJLI;
            if (view4 != null) {
                view4.setAlpha(0.0f);
            }
            View view5 = this.LJIJJLI;
            if (view5 != null) {
                this.LJJ = ObjectAnimator.ofFloat(view5, "alpha", 0.0f, 1.0f);
                ObjectAnimator objectAnimator2 = this.LJJ;
                if (objectAnimator2 != null) {
                    objectAnimator2.setDuration(200L);
                }
            }
        }
        this.f25883LJ = new C89051L6v(this.LJIIJJI);
        View view6 = this.contentView;
        if (view6 != null) {
            nestedParentRecyclerView = (NestedParentRecyclerView) view6.findViewById(2131188496);
        } else {
            nestedParentRecyclerView = null;
        }
        this.LIZLLL = nestedParentRecyclerView;
        NestedParentRecyclerView nestedParentRecyclerView2 = this.LIZLLL;
        if (nestedParentRecyclerView2 != null) {
            nestedParentRecyclerView2.LIZIZ();
        }
        NestedParentRecyclerView nestedParentRecyclerView3 = this.LIZLLL;
        if (nestedParentRecyclerView3 != null) {
            nestedParentRecyclerView3.setAdapter(this.f25883LJ);
        }
        NestedParentRecyclerView nestedParentRecyclerView4 = this.LIZLLL;
        if (nestedParentRecyclerView4 != null) {
            nestedParentRecyclerView4.addItemDecoration(new L5Z());
        }
        NestedParentRecyclerView nestedParentRecyclerView5 = this.LIZLLL;
        if (nestedParentRecyclerView5 != null) {
            nestedParentRecyclerView5.addOnScrollListener(new L7E(this));
        }
        if (!C88999L4v.LIZIZ.LIZ()) {
            if (this.LJI) {
                this.contentView.findViewById(2131175197).setPadding(0, LK5.LIZ(44.0f), 0, 0);
            }
            View findViewById = this.contentView.findViewById(2131180395);
            if (findViewById != null) {
                findViewById.setVisibility(0);
                View findViewById2 = findViewById.findViewById(2131196399);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(0);
                }
            }
            FrameLayout frameLayout = (FrameLayout) this.contentView.findViewById(2131188131);
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            Context context = this.context;
            if (context != null && (context instanceof Activity)) {
                if (!(context instanceof Activity)) {
                    context = null;
                }
                Activity activity = (Activity) context;
                if (activity != null) {
                    if (!PatchProxy.proxy(new Object[]{activity}, this, LIZ, false, 23).isSupported && this.LJIIJ == null) {
                        this.LJIIJ = new View(activity);
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, LHO.LIZLLL.LIZ((Context) activity));
                        View view7 = this.LJIIJ;
                        if (view7 != null) {
                            view7.setLayoutParams(layoutParams3);
                        }
                        View view8 = this.LJIIJ;
                        if (view8 != null) {
                            view8.setBackgroundResource(2130854572);
                        }
                        Window window = activity.getWindow();
                        Intrinsics.checkNotNullExpressionValue(window, "");
                        View decorView = window.getDecorView();
                        if (decorView != null) {
                            ((ViewGroup) decorView).addView(this.LJIIJ);
                            View view9 = this.LJIIJ;
                            if (view9 != null) {
                                view9.setVisibility(8);
                            }
                        } else {
                            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                            MethodCollector.m14707o(1280);
                            throw nullPointerException;
                        }
                    }
                    this.LJIIIZ = C89019L5p.LIZIZ(activity);
                }
            }
        } else {
            View findViewById3 = this.contentView.findViewById(2131196399);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "");
            findViewById3.setVisibility(8);
            Context context2 = this.context;
            if (context2 != null && (context2 instanceof Activity)) {
                if (!(context2 instanceof Activity)) {
                    context2 = null;
                }
                Activity activity2 = (Activity) context2;
                if (activity2 != null) {
                    Window window2 = activity2.getWindow();
                    if (window2 != null) {
                        i = window2.getNavigationBarColor();
                    } else {
                        i = ViewCompat.MEASURED_STATE_MASK;
                    }
                    this.LJIILIIL = i;
                    Window window3 = activity2.getWindow();
                    Intrinsics.checkNotNullExpressionValue(window3, "");
                    window3.setNavigationBarColor(LK5.LIZIZ(2131626090));
                }
            }
            View findViewById4 = this.contentView.findViewById(2131180395);
            if (findViewById4 != null) {
                findViewById4.setVisibility(8);
            }
            NestedParentRecyclerView nestedParentRecyclerView6 = this.LIZLLL;
            if (nestedParentRecyclerView6 != null) {
                nestedParentRecyclerView6.setBackground(LK5.LIZJ(2130855878));
            }
            FrameLayout frameLayout2 = (FrameLayout) this.contentView.findViewById(2131188131);
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
            }
            ImageView imageView5 = this.LJIILL;
            if (imageView5 != null) {
                imageView5.setVisibility(8);
            }
            HSImageView hSImageView2 = this.LJIIZILJ;
            if (hSImageView2 != null && (layoutParams = hSImageView2.getLayoutParams()) != null) {
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams4.setMarginStart(LK5.LIZ(18.0f));
                ImageView imageView6 = this.LJIILL;
                if (imageView6 != null) {
                    imageView6.setLayoutParams(layoutParams4);
                }
                LinearLayout linearLayout7 = this.LJFF;
                if (linearLayout7 != null && (layoutParams2 = linearLayout7.getLayoutParams()) != null) {
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams2;
                    layoutParams5.topMargin = LK5.LIZ(28.0f);
                    LinearLayout linearLayout8 = this.LJFF;
                    if (linearLayout8 != null) {
                        linearLayout8.setLayoutParams(layoutParams5);
                    }
                } else {
                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    MethodCollector.m14707o(1280);
                    throw nullPointerException2;
                }
            } else {
                NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                MethodCollector.m14707o(1280);
                throw nullPointerException3;
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            Observable<C3952am> observeOn = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).registerJsEventSubscriber("gamecpGameDetailTabToggle").observeOn(AndroidSchedulers.mainThread());
            Intrinsics.checkNotNullExpressionValue(observeOn, "");
            QB4.LIZ(QB4.LIZ(observeOn, new GameDetailContentWidget$initJSB$1(this)), this.LJJII);
            Observable<C3952am> observeOn2 = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).registerJsEventSubscriber("gamecpOpenPropOrder").observeOn(AndroidSchedulers.mainThread());
            Intrinsics.checkNotNullExpressionValue(observeOn2, "");
            QB4.LIZ(QB4.LIZ(observeOn2, new GameDetailContentWidget$initJSB$2(this)), this.LJJII);
        }
        MethodCollector.m14707o(1280);
    }

    public final void LIZ(int i) {
        ImageView imageView;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 11).isSupported) {
            return;
        }
        ImageView imageView2 = this.LJIILLIIL;
        if ((imageView2 == null || imageView2.getVisibility() != i) && (imageView = this.LJIILLIIL) != null) {
            imageView.setVisibility(i);
        }
    }

    public final void LIZIZ(boolean z) {
        View view;
        ObjectAnimator objectAnimator;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 9).isSupported) {
            return;
        }
        if (z) {
            LinearLayout linearLayout = this.LJFF;
            if (linearLayout != null && linearLayout.getVisibility() == 0) {
                return;
            }
            LinearLayout linearLayout2 = this.LJFF;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            ObjectAnimator objectAnimator2 = this.LJIL;
            if (objectAnimator2 != null) {
                objectAnimator2.start();
            }
            ImageView imageView = this.LJIILLIIL;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            LinearLayout linearLayout3 = this.LJFF;
            if (linearLayout3 != null) {
                linearLayout3.setBackgroundColor(LK5.LIZIZ(2131626090));
            }
            if (C88999L4v.LIZIZ.LIZ() && (objectAnimator = this.LJJ) != null) {
                objectAnimator.start();
            }
            LIZ(this, null, Boolean.TRUE, 1, null);
            if (!this.LJI) {
                this.LJIIIIZZ.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        LinearLayout linearLayout4 = this.LJFF;
        if (linearLayout4 != null && linearLayout4.getVisibility() == 8) {
            return;
        }
        LinearLayout linearLayout5 = this.LJFF;
        if (linearLayout5 != null) {
            linearLayout5.setVisibility(8);
        }
        if (this.LJI && !C88999L4v.LIZIZ.LIZ()) {
            ImageView imageView2 = this.LJIILLIIL;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        } else {
            ImageView imageView3 = this.LJIILLIIL;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            this.LJIIIIZZ.invoke(Boolean.TRUE);
        }
        LinearLayout linearLayout6 = this.LJFF;
        if (linearLayout6 != null) {
            linearLayout6.setBackgroundColor(LK5.LIZIZ(2131623937));
        }
        LIZ(Boolean.TRUE, Boolean.FALSE);
        if (C88999L4v.LIZIZ.LIZ() && (view = this.LJIJJLI) != null) {
            view.setAlpha(0.0f);
        }
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        if (z) {
            LIZ().LJIIJJI();
        } else {
            LIZ().LJIIL();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x0472, code lost:
        if (r1 != null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0486, code lost:
        if (r1 != null) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x046e  */
    @Override // p003X.LAL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void LIZ(com.bytedance.ies.sve_core.AbstractC12642p r44) {
        /*
            Method dump skipped, instructions count: 1174
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.gamedetailv2.GameDetailContentWidget.LIZ(com.bytedance.ies.sve_core.p):void");
    }

    private final void LIZ(Boolean bool, Boolean bool2) {
        Context context;
        if (!PatchProxy.proxy(new Object[]{bool, bool2}, this, LIZ, false, 18).isSupported && !C88999L4v.LIZIZ.LIZ() && (context = this.context) != null && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            if (Intrinsics.areEqual(bool2, Boolean.TRUE)) {
                View view = this.LJIIJ;
                if (view != null) {
                    view.setVisibility(8);
                }
                C89019L5p.LIZIZ(activity, LK5.LIZIZ(2131626090));
            } else if (Intrinsics.areEqual(bool, Boolean.TRUE) && this.LJI) {
                View view2 = this.LJIIJ;
                if (view2 == null) {
                    return;
                }
                view2.setVisibility(0);
            } else {
                View view3 = this.LJIIJ;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                C89019L5p.LIZIZ(activity, this.LJIIIZ);
            }
        }
    }

    public final void LIZ(String str, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{str, bool}, this, LIZ, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            this.LJJI = str;
        }
        C89051L6v c89051L6v = this.f25883LJ;
        if (c89051L6v != null) {
            c89051L6v.LIZ(str, bool);
        }
    }

    public static /* synthetic */ void LIZ(GameDetailContentWidget gameDetailContentWidget, Boolean bool, Boolean bool2, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{gameDetailContentWidget, bool, bool2, Integer.valueOf(i), null}, null, LIZ, true, 19).isSupported) {
            return;
        }
        if ((i & 1) != 0) {
            bool = Boolean.FALSE;
        }
        if ((i & 2) != 0) {
            bool2 = Boolean.FALSE;
        }
        gameDetailContentWidget.LIZ(bool, bool2);
    }
}
