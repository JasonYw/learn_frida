package com.bytedance.android.live.core.tetris.layer.core.tetris;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.tetris.layer.AbstractC4092b;
import com.bytedance.android.live.core.tetris.layer.core.element.AbstractC4104d;
import com.bytedance.android.live.core.tetris.layer.core.element.Element;
import com.bytedance.android.live.core.tetris.layer.core.element.widget.WidgetElement;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.Widget;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.AbstractC81278I1w;
import p003X.C106862S5w;
import p003X.C148062fT6;
import p003X.C2R6;
import p003X.C2R9;
import p003X.C87010KQi;

/* loaded from: classes12.dex */
public abstract class LiveTetris<T extends AbstractC4092b> extends Tetris<T> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(23715);
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.tetris.Tetris, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LIZ(WidgetElement widgetElement) {
        if (PatchProxy.proxy(new Object[]{widgetElement}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(widgetElement);
        if (!PatchProxy.proxy(new Object[]{widgetElement}, this, Tetris.LIZIZ, false, 19).isSupported) {
            C106862S5w.LIZ(widgetElement);
            this.LIZJ.remove(widgetElement);
            AbstractC4104d abstractC4104d = this.LJFF;
            if (abstractC4104d == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            abstractC4104d.LIZ(widgetElement);
            widgetElement.LIZ();
        }
        widgetElement.LJFF();
    }

    public <T> void LIZ(Class<T> cls, final Function1<? super T, Unit> function1) {
        if (PatchProxy.proxy(new Object[]{cls, function1}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(cls, function1);
        ((AbstractC81278I1w) C87010KQi.LIZ().LIZ((Class) cls).observeOn(AndroidSchedulers.mainThread()).m151as(C148062fT6.LIZ(this))).LIZ(new Consumer() { // from class: X.2RB
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(23717);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(Function1.this.invoke(obj), "");
            }
        });
    }

    public final WidgetElement LIZ(Class<? extends Widget> cls, ViewGroup viewGroup, boolean z, Object[] objArr, boolean z2) {
        Element<?> LIZ2;
        View view;
        MethodCollector.m14708i(1593);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls, viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0), objArr, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            WidgetElement widgetElement = (WidgetElement) proxy.result;
            MethodCollector.m14707o(1593);
            return widgetElement;
        }
        C106862S5w.LIZ(cls, viewGroup);
        C2R6 c2r6 = new C2R6(z, z2, cls, null, 8);
        if (objArr != null && !PatchProxy.proxy(new Object[]{objArr}, c2r6, C2R6.LIZ, false, 1).isSupported) {
            C106862S5w.LIZ((Object) objArr);
            c2r6.LIZIZ = objArr;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c2r6, viewGroup}, this, Tetris.LIZIZ, false, 18);
        if (proxy2.isSupported) {
            LIZ2 = (Element) proxy2.result;
            if (LIZ2 == null) {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.core.tetris.layer.core.element.widget.WidgetElement");
                MethodCollector.m14707o(1593);
                throw nullPointerException;
            }
        } else {
            C106862S5w.LIZ(c2r6, viewGroup);
            C2R9 c2r9 = this.LIZLLL;
            if (c2r9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LIZ2 = c2r9.LIZ(c2r6);
            this.LIZJ.add(LIZ2);
            if (LIZ2.LIZIZ) {
                T t = this.f26191LJ;
                if (t == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                view = LIZ2.LIZ(t.LIZJ, viewGroup);
                if (view != null) {
                    viewGroup.addView(view);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("buildView here shouldn't be null.");
                    MethodCollector.m14707o(1593);
                    throw illegalStateException;
                }
            } else {
                view = viewGroup;
            }
            LIZ2.LIZJ = view;
            mo29786getLifecycle().addObserver(LIZ2);
            AbstractC4104d abstractC4104d = this.LJFF;
            if (abstractC4104d == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            abstractC4104d.LIZ(LIZ2);
        }
        WidgetElement widgetElement2 = (WidgetElement) LIZ2;
        MethodCollector.m14707o(1593);
        return widgetElement2;
    }

    public static /* synthetic */ WidgetElement LIZ(LiveTetris liveTetris, Class cls, ViewGroup viewGroup, boolean z, Object[] objArr, boolean z2, int i, Object obj) {
        boolean z3 = z;
        byte b = z3 ? (byte) 1 : (byte) 0;
        byte b2 = z3 ? (byte) 1 : (byte) 0;
        Object[] objArr2 = null;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{liveTetris, cls, viewGroup, Byte.valueOf(b), objArr, (byte) 0, Integer.valueOf(i), null}, null, LIZ, true, 2);
        if (proxy.isSupported) {
            return (WidgetElement) proxy.result;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        if ((i & 8) == 0) {
            objArr2 = objArr;
        }
        return liveTetris.LIZ(cls, viewGroup, z3, objArr2, false);
    }
}
