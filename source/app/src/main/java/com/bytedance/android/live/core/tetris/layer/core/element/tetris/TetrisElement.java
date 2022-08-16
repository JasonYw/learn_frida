package com.bytedance.android.live.core.tetris.layer.core.element.tetris;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.tetris.layer.AbstractC4092b;
import com.bytedance.android.live.core.tetris.layer.core.descriptor.AbstractC4101h;
import com.bytedance.android.live.core.tetris.layer.core.element.AbstractC4104d;
import com.bytedance.android.live.core.tetris.layer.core.element.Element;
import com.bytedance.android.live.core.tetris.layer.core.event.AbstractC4106a;
import com.bytedance.android.live.core.tetris.layer.core.p322a.AbstractC4094b;
import com.bytedance.android.live.core.tetris.layer.core.tetris.Tetris;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C2LT;
import p003X.C2R9;
import p003X.C412502Ui;
import p003X.C65525BtH;

/* loaded from: classes12.dex */
public final class TetrisElement extends Element<Tetris<? extends AbstractC4092b>> implements AbstractC4104d, AbstractC4569445g {
    public static ChangeQuickRedirect LJIIIIZZ;
    public final AbstractC4101h LJIIIZ;
    public final C2R9 LJIIJ;
    public final C2LT LJIIJJI;
    public final AbstractC4094b LJIIL;
    public final Lazy LJIILIIL = LazyKt__LazyJVMKt.lazy(new TetrisElement$tetris$2(this));
    public final List<Element<?>> LJIILJJIL = new ArrayList();

    static {
        Covode.recordClassIndex(23681);
    }

    private final Tetris<AbstractC4092b> LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIIIZZ, false, 1);
        return (Tetris) (proxy.isSupported ? proxy.result : this.LJIILIIL.mo27335getValue());
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.Element, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJIIIIZZ, false, 9).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.core.tetris.layer.core.tetris.Tetris<? extends com.bytedance.android.live.core.tetris.layer.b>, java.lang.Object] */
    @Override // com.bytedance.android.live.core.tetris.layer.core.element.Element
    public final /* synthetic */ Tetris<? extends AbstractC4092b> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIIIZZ, false, 8);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return LJFF();
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.Element
    public final AbstractC4106a LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIIIZZ, false, 5);
        if (proxy.isSupported) {
            return (AbstractC4106a) proxy.result;
        }
        if (LJFF() instanceof AbstractC4106a) {
            Tetris<AbstractC4092b> LJFF = LJFF();
            if (LJFF != null) {
                return (AbstractC4106a) LJFF;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.core.tetris.layer.core.event.ElementEventResolver");
        }
        return null;
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.Element
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LJIIIIZZ, false, 2).isSupported) {
            return;
        }
        super.LIZIZ();
        Tetris<AbstractC4092b> LJFF = LJFF();
        if (!PatchProxy.proxy(new Object[0], LJFF, Tetris.LIZIZ, false, 15).isSupported) {
            for (Element<?> element : LJFF.LIZJ) {
                AbstractC4104d abstractC4104d = LJFF.LJFF;
                if (abstractC4104d == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                abstractC4104d.LIZIZ(element);
                LJFF.mo29786getLifecycle().removeObserver(element);
                element.LIZ();
            }
            int i = C65525BtH.LIZ[LJFF.mo29786getLifecycle().getCurrentState().ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            LJFF.onPause();
                            LJFF.onStop();
                            LJFF.onDestroy();
                        }
                    } else {
                        LJFF.onStop();
                        LJFF.onDestroy();
                    }
                } else {
                    LJFF.onDestroy();
                }
            }
            LJFF.LIZJ.clear();
        }
        this.LJIILJJIL.clear();
        mo29786getLifecycle().removeObserver(LJFF());
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.Element
    public final void LIZ(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, LJIIIIZZ, false, 3).isSupported) {
            return;
        }
        mo29786getLifecycle().addObserver(LJFF());
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.AbstractC4104d
    public final void LIZIZ(Element<?> element) {
        if (PatchProxy.proxy(new Object[]{element}, this, LJIIIIZZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(element);
        this.LJIILJJIL.remove(element);
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.AbstractC4104d
    public final void LIZ(Element<?> element) {
        if (PatchProxy.proxy(new Object[]{element}, this, LJIIIIZZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(element);
        if (!this.LJIILJJIL.contains(element)) {
            this.LJIILJJIL.add(element);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.element.Element
    public final View LIZ(Context context, ViewGroup viewGroup) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, viewGroup}, this, LJIIIIZZ, false, 4);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(context);
        Tetris<AbstractC4092b> LJFF = LJFF();
        LayoutInflater from = LayoutInflater.from(context);
        Intrinsics.checkNotNullExpressionValue(from, "");
        View LIZ = LJFF.LIZ(new C412502Ui(from));
        Tetris<AbstractC4092b> LJFF2 = LJFF();
        if (!PatchProxy.proxy(new Object[]{LIZ}, LJFF2, Tetris.LIZIZ, false, 13).isSupported) {
            C106862S5w.LIZ(LIZ);
            LJFF2.LJIIIIZZ = LIZ;
        }
        return LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TetrisElement(AbstractC4101h abstractC4101h, C2R9 c2r9, AbstractC4092b abstractC4092b, C2LT c2lt, AbstractC4094b abstractC4094b) {
        super(abstractC4092b);
        C106862S5w.LIZ(abstractC4101h, c2r9, abstractC4092b, c2lt, abstractC4094b);
        this.LJIIIZ = abstractC4101h;
        this.LJIIJ = c2r9;
        this.LJIIJJI = c2lt;
        this.LJIIL = abstractC4094b;
    }
}
