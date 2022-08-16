package com.bytedance.android.live.core.tetris.layer.core.element.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.tetris.layer.AbstractC4092b;
import com.bytedance.android.live.core.tetris.layer.core.descriptor.AbstractC4102j;
import com.bytedance.android.live.core.tetris.layer.core.element.Element;
import com.bytedance.android.live.core.tetris.layer.core.event.AbstractC4106a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C116971W2r;

/* loaded from: classes12.dex */
public final class ViewElement extends Element<View> implements AbstractC4569445g {
    public static ChangeQuickRedirect LJIIIIZZ;
    public final AbstractC4102j LJIIIZ;
    public View LJIIJ;

    static {
        Covode.recordClassIndex(23684);
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.Element
    public final void LIZIZ() {
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.Element, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJIIIIZZ, false, 5).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.android.live.core.tetris.layer.core.element.Element
    /* renamed from: LJI */
    public View LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIIIZZ, false, 3);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        View view = this.LJIIJ;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return view;
    }

    public final View LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIIIZZ, false, 4);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        View view = this.LJIIJ;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return view;
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.Element
    public final AbstractC4106a LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIIIZZ, false, 2);
        if (proxy.isSupported) {
            return (AbstractC4106a) proxy.result;
        }
        if (LIZLLL() instanceof AbstractC4106a) {
            View LIZLLL = LIZLLL();
            if (LIZLLL != null) {
                return (AbstractC4106a) LIZLLL;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.core.tetris.layer.core.event.ElementEventResolver");
        }
        return null;
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.Element
    public final void LIZ(View view) {
        if (view != null) {
            this.LJIIJ = view;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewElement(AbstractC4092b abstractC4092b, AbstractC4102j abstractC4102j) {
        super(abstractC4092b);
        C106862S5w.LIZ(abstractC4092b, abstractC4102j);
        this.LJIIIZ = abstractC4102j;
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.Element
    public final View LIZ(Context context, ViewGroup viewGroup) {
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, viewGroup}, this, LJIIIIZZ, false, 1);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(context);
        View LIZ = this.LJIIIZ.LIZ(context);
        if (LIZ != null) {
            return LIZ;
        }
        Integer valueOf = Integer.valueOf(this.LJIIIZ.LIZ());
        if (valueOf.intValue() == 0) {
            z = false;
        }
        if (!z || valueOf == null) {
            return null;
        }
        return C116971W2r.LIZ(LayoutInflater.from(context), valueOf.intValue(), viewGroup, false);
    }
}
