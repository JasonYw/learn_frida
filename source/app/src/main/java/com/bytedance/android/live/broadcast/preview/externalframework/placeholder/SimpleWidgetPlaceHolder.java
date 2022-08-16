package com.bytedance.android.live.broadcast.preview.externalframework.placeholder;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.broadcast.preview.externalframework.placeholder.SimpleWidgetPlaceHolder;
import com.bytedance.android.live.room.IExternalFunctionInjector;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.event.C5988as;
import com.bytedance.android.livesdkapi.room.handler.viewinterface.AbstractC9673f;
import com.bytedance.android.livesdkapi.room.p781a.AbstractC9661d;
import com.bytedance.android.livesdkapi.room.p783c.C9664b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import p003X.AbstractC445813kF;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C147670fMm;
import p003X.C4324439a;
import p003X.C87010KQi;

@AbstractC445813kF(LIZ = "COMMODITY")
/* loaded from: classes12.dex */
public final class SimpleWidgetPlaceHolder extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public ViewGroup LIZIZ;
    public AbstractC9673f LIZJ;
    public AbstractC9673f LIZLLL;

    /* renamed from: LJ */
    public CompositeDisposable f25916LJ;
    public final Function0<C9664b> LJFF;

    static {
        Covode.recordClassIndex(17261);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "SimpleWidgetPlaceHolder";
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131700229;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onDestroy();
        AbstractC9673f abstractC9673f = this.LIZJ;
        if (abstractC9673f != null) {
            abstractC9673f.LJFF();
        }
        CompositeDisposable compositeDisposable = this.f25916LJ;
        if (compositeDisposable != null) {
            compositeDisposable.clear();
        }
        this.LIZJ = null;
    }

    public final C147670fMm LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (C147670fMm) proxy.result;
        }
        ViewGroup viewGroup = this.LIZIZ;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        int roundToInt = MathKt__MathJVMKt.roundToInt(viewGroup.getX());
        ViewGroup viewGroup2 = this.LIZIZ;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        int roundToInt2 = MathKt__MathJVMKt.roundToInt(viewGroup2.getY());
        ViewGroup viewGroup3 = this.LIZIZ;
        if (viewGroup3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        int width = viewGroup3.getWidth();
        ViewGroup viewGroup4 = this.LIZIZ;
        if (viewGroup4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return new C147670fMm(roundToInt, roundToInt2, width, viewGroup4.getHeight());
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        CompositeDisposable compositeDisposable;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        LJIILL();
        View view = this.contentView;
        if (view != null) {
            this.LIZIZ = (ViewGroup) view;
            CompositeDisposable compositeDisposable2 = this.f25916LJ;
            if (compositeDisposable2 != null && !compositeDisposable2.isDisposed() && (compositeDisposable = this.f25916LJ) != null) {
                compositeDisposable.clear();
            }
            if (this.f25916LJ == null) {
                this.f25916LJ = new CompositeDisposable();
            }
            CompositeDisposable compositeDisposable3 = this.f25916LJ;
            if (compositeDisposable3 != null) {
                compositeDisposable3.add(C87010KQi.LIZ().LIZ(C5988as.class).subscribe(new Consumer<C5988as>() { // from class: X.39e
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(17262);
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final /* synthetic */ void accept(C5988as c5988as) {
                        C5988as c5988as2 = c5988as;
                        if (!PatchProxy.proxy(new Object[]{c5988as2}, this, LIZ, false, 1).isSupported) {
                            SimpleWidgetPlaceHolder simpleWidgetPlaceHolder = SimpleWidgetPlaceHolder.this;
                            Intrinsics.checkNotNullExpressionValue(c5988as2, "");
                            simpleWidgetPlaceHolder.onEvent(c5988as2);
                        }
                    }
                }));
            }
            AbstractC9673f abstractC9673f = this.LIZJ;
            if (abstractC9673f != null) {
                abstractC9673f.mo15245LJ();
            }
            AbstractC9673f abstractC9673f2 = this.LIZLLL;
            if (abstractC9673f2 != null) {
                LIZ(abstractC9673f2);
            }
            ViewGroup viewGroup = this.LIZIZ;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (!(viewGroup instanceof InterceptFrameLayout)) {
                viewGroup = null;
            }
            InterceptFrameLayout interceptFrameLayout = (InterceptFrameLayout) viewGroup;
            if (interceptFrameLayout != null) {
                interceptFrameLayout.setIntercept(false);
            }
            Disposable subscribe = LJIIJJI().m15893LJ().LIZIZ().subscribe(new C4324439a(this));
            Intrinsics.checkNotNullExpressionValue(subscribe, "");
            LIZ(subscribe);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public SimpleWidgetPlaceHolder(Function0<C9664b> function0) {
        C106862S5w.LIZ(function0);
        this.LJFF = function0;
    }

    public static final /* synthetic */ ViewGroup LIZ(SimpleWidgetPlaceHolder simpleWidgetPlaceHolder) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{simpleWidgetPlaceHolder}, null, LIZ, true, 8);
        if (proxy.isSupported) {
            return (ViewGroup) proxy.result;
        }
        ViewGroup viewGroup = simpleWidgetPlaceHolder.LIZIZ;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return viewGroup;
    }

    public final void onEvent(C5988as c5988as) {
        if (PatchProxy.proxy(new Object[]{c5988as}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(c5988as);
        IExternalFunctionInjector iExternalFunctionInjector = (IExternalFunctionInjector) ServiceManager.getService(IExternalFunctionInjector.class);
        if (iExternalFunctionInjector != null) {
            AbstractC9661d startLivePreviewController = iExternalFunctionInjector.getStartLivePreviewController();
            C9664b mo30099invoke = this.LJFF.mo30099invoke();
            if (mo30099invoke != null) {
                startLivePreviewController.LIZ(mo30099invoke);
            }
        }
    }

    public final void LIZ(final AbstractC9673f abstractC9673f) {
        MethodCollector.m14708i(1301);
        if (PatchProxy.proxy(new Object[]{abstractC9673f}, this, LIZ, false, 5).isSupported) {
            MethodCollector.m14707o(1301);
            return;
        }
        C106862S5w.LIZ(abstractC9673f);
        if (this.isViewValid) {
            if (Intrinsics.areEqual(abstractC9673f, this.LIZJ)) {
                ViewGroup viewGroup = this.LIZIZ;
                if (viewGroup == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                if (viewGroup.getChildCount() > 0) {
                    LIZIZ(abstractC9673f);
                }
                abstractC9673f.LIZ(LIZIZ());
                ViewGroup viewGroup2 = this.LIZIZ;
                if (viewGroup2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                viewGroup2.addView(abstractC9673f.LIZJ());
                ViewGroup viewGroup3 = this.LIZIZ;
                if (viewGroup3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                viewGroup3.post(new Runnable() { // from class: X.39d
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(17265);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        abstractC9673f.LIZIZ(SimpleWidgetPlaceHolder.this.LIZIZ());
                    }
                });
                if (Intrinsics.areEqual(this.LIZLLL, abstractC9673f)) {
                    this.LIZLLL = null;
                }
            }
        } else {
            this.LIZLLL = abstractC9673f;
        }
        LJIILJJIL();
        MethodCollector.m14707o(1301);
    }

    public final void LIZIZ(AbstractC9673f abstractC9673f) {
        MethodCollector.m14708i(1302);
        if (PatchProxy.proxy(new Object[]{abstractC9673f}, this, LIZ, false, 6).isSupported) {
            MethodCollector.m14707o(1302);
            return;
        }
        C106862S5w.LIZ(abstractC9673f);
        if (Intrinsics.areEqual(this.LIZLLL, abstractC9673f)) {
            this.LIZLLL = null;
        }
        if (this.isViewValid && Intrinsics.areEqual(abstractC9673f, this.LIZJ)) {
            abstractC9673f.LJII();
            ViewGroup viewGroup = this.LIZIZ;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            viewGroup.removeAllViews();
            abstractC9673f.LJI();
        }
        LJIILL();
        MethodCollector.m14707o(1302);
    }
}
