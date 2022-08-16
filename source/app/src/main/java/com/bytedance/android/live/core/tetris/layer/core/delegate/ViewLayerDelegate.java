package com.bytedance.android.live.core.tetris.layer.core.delegate;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.tetris.layer.AbstractC4092b;
import com.bytedance.android.live.core.tetris.layer.core.C4096c;
import com.bytedance.android.live.core.tetris.layer.core.descriptor.C4100c;
import com.bytedance.android.live.core.tetris.layer.core.element.Element;
import com.bytedance.android.live.core.tetris.layer.core.layout.C4111d;
import com.bytedance.android.live.core.tetris.layer.core.p323d.AbstractC4097a;
import com.bytedance.android.live.core.tetris.layer.view.ElementConstraint;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC411472Qj;
import p003X.AbstractC411512Qn;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public abstract class ViewLayerDelegate<C extends AbstractC4092b> extends LayerDelegate<C4096c, C> implements AbstractC4098b, AbstractC4569445g {
    public static ChangeQuickRedirect LJIIIIZZ;
    public final Map<C4100c, AbstractC411472Qj<C>> LIZ = new LinkedHashMap();
    public C4111d LJIIIZ;
    public AbstractC411512Qn LJIIJ;
    public AbstractC4097a LJIIJJI;

    static {
        Covode.recordClassIndex(23653);
    }

    /* renamed from: LJ */
    public void mo15262LJ() {
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.delegate.LayerDelegate, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJIIIIZZ, false, 14).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final AbstractC4097a LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJIIIIZZ, false, 3);
        if (proxy.isSupported) {
            return (AbstractC4097a) proxy.result;
        }
        AbstractC4097a abstractC4097a = this.LJIIJJI;
        if (abstractC4097a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC4097a;
    }

    public final void LIZ(AbstractC411512Qn abstractC411512Qn) {
        if (PatchProxy.proxy(new Object[]{abstractC411512Qn}, this, LJIIIIZZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC411512Qn);
        this.LJIIJ = abstractC411512Qn;
    }

    public final void LIZ(AbstractC411472Qj<C> abstractC411472Qj) {
        if (PatchProxy.proxy(new Object[]{abstractC411472Qj}, this, LJIIIIZZ, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC411472Qj);
        if (!this.LIZ.containsKey(abstractC411472Qj.LJI)) {
            this.LIZ.put(abstractC411472Qj.LJI, abstractC411472Qj);
            if (!PatchProxy.proxy(new Object[]{this}, abstractC411472Qj, AbstractC411472Qj.LIZ, false, 10).isSupported) {
                C106862S5w.LIZ(this);
                abstractC411472Qj.LJFF = this;
            }
        }
    }

    public final AbstractC4097a LIZJ(C4100c c4100c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4100c}, this, LJIIIIZZ, false, 5);
        if (proxy.isSupported) {
            return (AbstractC4097a) proxy.result;
        }
        C106862S5w.LIZ(c4100c);
        Element<?> LIZ = LIZ().LIZ(c4100c);
        if (LIZ != null) {
            return LIZ.m15789LJ();
        }
        return null;
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.delegate.LayerDelegate
    /* renamed from: LJ */
    public final void mo15791LJ(Element<?> element) {
        if (PatchProxy.proxy(new Object[]{element}, this, LJIIIIZZ, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(element);
        super.mo15791LJ(element);
        if (this.LIZ.containsKey(element.LIZLLL)) {
            this.LIZ.get(element.LIZLLL);
        }
    }

    public final void LIZ(C4111d c4111d) {
        if (PatchProxy.proxy(new Object[]{c4111d}, this, LJIIIIZZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4111d);
        this.LJIIIZ = c4111d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.bytedance.android.live.core.tetris.layer.b, T extends com.bytedance.android.live.core.tetris.layer.b, java.lang.Object] */
    @Override // com.bytedance.android.live.core.tetris.layer.core.delegate.LayerDelegate
    public final void LIZLLL(Element<?> element) {
        AbstractC411472Qj<C> abstractC411472Qj;
        if (PatchProxy.proxy(new Object[]{element}, this, LJIIIIZZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(element);
        super.LIZLLL(element);
        if (this.LIZ.containsKey(element.LIZLLL) && (abstractC411472Qj = this.LIZ.get(element.LIZLLL)) != null) {
            C LIZIZ = LIZIZ();
            if (!PatchProxy.proxy(new Object[]{LIZIZ}, abstractC411472Qj, AbstractC411472Qj.LIZ, false, 2).isSupported) {
                C106862S5w.LIZ(LIZIZ);
                abstractC411472Qj.LIZIZ = LIZIZ;
            }
            if (!PatchProxy.proxy(new Object[]{this}, abstractC411472Qj, AbstractC411472Qj.LIZ, false, 8).isSupported) {
                C106862S5w.LIZ(this);
                abstractC411472Qj.f527LJ = this;
            }
            if (!PatchProxy.proxy(new Object[]{this}, abstractC411472Qj, AbstractC411472Qj.LIZ, false, 6).isSupported) {
                C106862S5w.LIZ(this);
                abstractC411472Qj.LIZLLL = this;
            }
            AbstractC4097a m15789LJ = element.m15789LJ();
            if (m15789LJ != null) {
                if (!PatchProxy.proxy(new Object[]{m15789LJ}, abstractC411472Qj, AbstractC411472Qj.LIZ, false, 4).isSupported) {
                    C106862S5w.LIZ(m15789LJ);
                    abstractC411472Qj.LIZJ = m15789LJ;
                }
                abstractC411472Qj.LIZLLL();
                return;
            }
            throw new RuntimeException(element.LIZLLL + " is invalid.");
        }
    }

    public final void LIZIZ(C4100c c4100c, ElementConstraint elementConstraint) {
        if (PatchProxy.proxy(new Object[]{c4100c, elementConstraint}, this, LJIIIIZZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4100c, elementConstraint);
        C4111d c4111d = this.LJIIIZ;
        if (c4111d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c4111d.LIZ(c4100c, elementConstraint, LIZ(), LIZIZ());
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.delegate.AbstractC4098b
    public final void LIZ(C4100c c4100c, ElementConstraint elementConstraint) {
        if (PatchProxy.proxy(new Object[]{c4100c, elementConstraint}, this, LJIIIIZZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4100c, elementConstraint);
        LIZIZ(c4100c, elementConstraint);
    }
}
