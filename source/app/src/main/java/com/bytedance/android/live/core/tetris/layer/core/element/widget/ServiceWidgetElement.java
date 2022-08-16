package com.bytedance.android.live.core.tetris.layer.core.element.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.tetris.layer.AbstractC4092b;
import com.bytedance.android.live.core.tetris.layer.core.descriptor.AbstractC4103l;
import com.bytedance.android.live.core.tetris.layer.core.element.service.ServiceElement;
import com.bytedance.android.live.core.tetris.layer.core.event.AbstractC4106a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.Widget;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C458454Bb;

/* loaded from: classes12.dex */
public final class ServiceWidgetElement extends ServiceElement<Widget> implements AbstractC4569445g {
    public static ChangeQuickRedirect LJIIIZ;
    public Widget LJIIJ;
    public final C458454Bb LJIIJJI;
    public final AbstractC4103l LJIIL;

    static {
        Covode.recordClassIndex(23686);
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.service.ServiceElement, com.bytedance.android.live.core.tetris.layer.core.element.Element, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJIIIZ, false, 5).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.Element
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LJIIIZ, false, 1).isSupported) {
            return;
        }
        C458454Bb c458454Bb = this.LJIIJJI;
        Widget widget = this.LJIIJ;
        if (widget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c458454Bb.unload(widget);
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.Element
    public final /* synthetic */ Object LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIIZ, false, 4);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Widget widget = this.LJIIJ;
        if (widget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return widget;
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.Element
    public final AbstractC4106a LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIIZ, false, 3);
        if (proxy.isSupported) {
            return (AbstractC4106a) proxy.result;
        }
        Widget widget = this.LJIIJ;
        if (widget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (widget instanceof AbstractC4106a) {
            Widget widget2 = this.LJIIJ;
            if (widget2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.core.tetris.layer.core.event.ElementEventResolver");
            }
            return (AbstractC4106a) widget2;
        }
        return null;
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.service.ServiceElement
    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LJIIIZ, false, 2).isSupported) {
            return;
        }
        Class<? extends Widget> LJI = this.LJIIL.LJI();
        Intrinsics.checkNotNull(LJI);
        Widget newInstance = LJI.newInstance();
        Intrinsics.checkNotNullExpressionValue(newInstance, "");
        this.LJIIJ = newInstance;
        C458454Bb c458454Bb = this.LJIIJJI;
        Widget widget = this.LJIIJ;
        if (widget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c458454Bb.load(widget);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceWidgetElement(C458454Bb c458454Bb, AbstractC4103l abstractC4103l, AbstractC4092b abstractC4092b) {
        super(abstractC4092b);
        C106862S5w.LIZ(c458454Bb, abstractC4103l, abstractC4092b);
        this.LJIIJJI = c458454Bb;
        this.LJIIL = abstractC4103l;
    }
}
