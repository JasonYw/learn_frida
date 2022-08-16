package com.bytedance.android.live.core.tetris.layer.core.element.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.tetris.layer.AbstractC4092b;
import com.bytedance.android.live.core.tetris.layer.core.descriptor.AbstractC4103l;
import com.bytedance.android.live.core.tetris.layer.core.element.Element;
import com.bytedance.android.live.core.tetris.layer.core.event.AbstractC4106a;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.Widget;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C2M1;
import p003X.C458454Bb;

/* loaded from: classes12.dex */
public final class WidgetElement extends Element<Widget> implements AbstractC4569445g {
    public static ChangeQuickRedirect LJIIIIZZ;
    public Widget LJIIIZ;
    public final C458454Bb LJIIJ;
    public final AbstractC4103l LJIIJJI;

    static {
        Covode.recordClassIndex(23687);
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.Element, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJIIIIZZ, false, 9).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.Element
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LJIIIIZZ, false, 3).isSupported) {
            return;
        }
        super.LIZIZ();
        LJFF();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.ies.sdk.widgets.Widget, java.lang.Object] */
    @Override // com.bytedance.android.live.core.tetris.layer.core.element.Element
    public final /* synthetic */ Widget LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIIIZZ, false, 8);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Widget widget = this.LJIIIZ;
        if (widget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return widget;
    }

    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LJIIIIZZ, false, 4).isSupported) {
            return;
        }
        C458454Bb c458454Bb = this.LJIIJ;
        Widget widget = this.LJIIIZ;
        if (widget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c458454Bb.unload(widget);
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.Element
    public final AbstractC4106a LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIIIZZ, false, 7);
        if (proxy.isSupported) {
            return (AbstractC4106a) proxy.result;
        }
        Widget widget = this.LJIIIZ;
        if (widget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (widget instanceof AbstractC4106a) {
            Widget widget2 = this.LJIIIZ;
            if (widget2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.core.tetris.layer.core.event.ElementEventResolver");
            }
            return (AbstractC4106a) widget2;
        }
        return null;
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.Element
    public final void LIZ(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, LJIIIIZZ, false, 5).isSupported && (view instanceof ViewGroup)) {
            C2M1<? extends AbstractC4092b> LIZLLL = this.LJIIJJI.LIZLLL();
            Widget widget = null;
            if ((LIZLLL instanceof C2M1) && LIZLLL != null) {
                widget = LIZLLL.LIZ(this.LJII);
            }
            if (widget != null) {
                this.LJIIIZ = widget;
                C458454Bb c458454Bb = this.LJIIJ;
                ViewGroup viewGroup = (ViewGroup) view;
                Widget widget2 = this.LJIIIZ;
                if (widget2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                c458454Bb.LIZ(viewGroup, widget2, this.LJIIJJI.LIZ(), this.LJIIJJI.LIZIZ());
            } else if (LiveRecyclableWidget.class.isAssignableFrom(this.LJIIJJI.LJI())) {
                C458454Bb c458454Bb2 = this.LJIIJ;
                ViewGroup viewGroup2 = (ViewGroup) view;
                Class<? extends Widget> LJI = this.LJIIJJI.LJI();
                if (LJI != null) {
                    LiveRecyclableWidget LIZ = c458454Bb2.LIZ(viewGroup2, (Class<LiveRecyclableWidget>) LJI, this.LJIIJJI.LIZ(), this.LJIIJJI.LIZIZ(), this.LJIIJJI.mo15790LJ());
                    Intrinsics.checkNotNullExpressionValue(LIZ, "");
                    this.LJIIIZ = LIZ;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget>");
            } else {
                Class<? extends Widget> LJI2 = this.LJIIJJI.LJI();
                Intrinsics.checkNotNull(LJI2);
                Widget newInstance = LJI2.newInstance();
                Intrinsics.checkNotNullExpressionValue(newInstance, "");
                this.LJIIIZ = newInstance;
                C458454Bb c458454Bb3 = this.LJIIJ;
                ViewGroup viewGroup3 = (ViewGroup) view;
                Widget widget3 = this.LJIIIZ;
                if (widget3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                c458454Bb3.LIZ(viewGroup3, widget3, this.LJIIJJI.LIZ(), this.LJIIJJI.LIZIZ());
            }
        }
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.Element
    public final View LIZ(Context context, ViewGroup viewGroup) {
        MethodCollector.m14708i(1590);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, viewGroup}, this, LJIIIIZZ, false, 6);
        if (proxy.isSupported) {
            View view = (View) proxy.result;
            MethodCollector.m14707o(1590);
            return view;
        }
        C106862S5w.LIZ(context);
        ViewGroup LIZ = this.LJIIJJI.LIZ(context);
        if (LIZ != null) {
            MethodCollector.m14707o(1590);
            return LIZ;
        } else if (viewGroup != null) {
            Object newInstance = viewGroup.getClass().getConstructor(Context.class).newInstance(context);
            Intrinsics.checkNotNullExpressionValue(newInstance, "");
            View view2 = (View) newInstance;
            MethodCollector.m14707o(1590);
            return view2;
        } else {
            FrameLayout frameLayout = new FrameLayout(context);
            MethodCollector.m14707o(1590);
            return frameLayout;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetElement(C458454Bb c458454Bb, AbstractC4103l abstractC4103l, AbstractC4092b abstractC4092b) {
        super(abstractC4092b);
        C106862S5w.LIZ(c458454Bb, abstractC4103l, abstractC4092b);
        this.LJIIJ = c458454Bb;
        this.LJIIJJI = abstractC4103l;
        this.LIZIZ = this.LJIIJJI.LJFF();
    }
}
