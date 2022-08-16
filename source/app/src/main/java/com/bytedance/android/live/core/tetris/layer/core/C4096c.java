package com.bytedance.android.live.core.tetris.layer.core;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.tetris.layer.AbstractC4092b;
import com.bytedance.android.live.core.tetris.layer.core.delegate.LayerDelegate;
import com.bytedance.android.live.core.tetris.layer.core.delegate.ViewLayerDelegate;
import com.bytedance.android.live.core.tetris.layer.core.descriptor.C4100c;
import com.bytedance.android.live.core.tetris.layer.core.element.Element;
import com.bytedance.android.live.core.tetris.layer.initialization.LayerIndex;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p003X.AbstractC411282Pq;
import p003X.AbstractC411552Qr;
import p003X.AbstractC411582Qu;
import p003X.C106862S5w;
import p003X.C2NT;
import p003X.C2QT;
import p003X.C411562Qs;

/* renamed from: com.bytedance.android.live.core.tetris.layer.core.c */
/* loaded from: classes12.dex */
public final class C4096c extends ConstraintLayout implements AbstractC4093a {
    public static ChangeQuickRedirect LIZ;
    public ViewLayerDelegate<AbstractC4092b> LIZIZ;
    public AbstractC411552Qr LIZJ;
    public AbstractC411582Qu LIZLLL;

    /* renamed from: LJ */
    public final LayerIndex f26185LJ;
    public final AbstractC4092b LJFF;
    public final Class<ViewLayerDelegate<AbstractC4092b>> LJI;

    static {
        Covode.recordClassIndex(23645);
    }

    public final AbstractC411552Qr getGlobalElementCenter$infrastructure_cnDouyinRelease() {
        return this.LIZJ;
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.AbstractC4093a
    public final LayerDelegate<? extends AbstractC4093a, ? extends AbstractC4092b> getLayerDelegate() {
        return this.LIZIZ;
    }

    public final ViewLayerDelegate<AbstractC4092b> getLayerDelegate$infrastructure_cnDouyinRelease() {
        return this.LIZIZ;
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.AbstractC4093a
    public final LayerIndex getLayerIndex() {
        return this.f26185LJ;
    }

    public final AbstractC411582Qu getLayoutListener$infrastructure_cnDouyinRelease() {
        return this.LIZLLL;
    }

    public final Set<AbstractC411282Pq<AbstractC4092b>> getDescriptorSet() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (Set) proxy.result;
        }
        Set set = this.LIZIZ.LJI;
        if (set != null) {
            return set;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<com.bytedance.android.live.core.tetris.layer.core.descriptor.LayerDescriptor<com.bytedance.android.live.core.tetris.layer.LayerContext>>");
    }

    public final void setGlobalElementCenter$infrastructure_cnDouyinRelease(AbstractC411552Qr abstractC411552Qr) {
        this.LIZJ = abstractC411552Qr;
    }

    public final void setLayoutListener$infrastructure_cnDouyinRelease(AbstractC411582Qu abstractC411582Qu) {
        this.LIZLLL = abstractC411582Qu;
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.AbstractC4093a
    public final Element<?> LIZ(C4100c c4100c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4100c}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (Element) proxy.result;
        }
        C106862S5w.LIZ(c4100c);
        return this.LIZIZ.LIZ(c4100c);
    }

    public final void LIZIZ(Element<?> element) {
        if (PatchProxy.proxy(new Object[]{element}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(element);
        this.LIZIZ.LIZLLL(element);
    }

    public final void setLayerDelegate$infrastructure_cnDouyinRelease(ViewLayerDelegate<AbstractC4092b> viewLayerDelegate) {
        if (PatchProxy.proxy(new Object[]{viewLayerDelegate}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(viewLayerDelegate);
        this.LIZIZ = viewLayerDelegate;
    }

    public final List<AbstractC411282Pq<AbstractC4092b>> LIZ(AbstractC4092b abstractC4092b) {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC4092b}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        C106862S5w.LIZ(abstractC4092b);
        List<AbstractC411282Pq<AbstractC4092b>> LIZ2 = C411562Qs.LIZIZ.LIZ(this, abstractC4092b);
        Iterator<T> it = LIZ2.iterator();
        while (it.hasNext()) {
            ((AbstractC411282Pq) it.next()).LIZIZ = i;
            i++;
        }
        return LIZ2;
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.AbstractC4093a
    public final void LIZ(C2QT<AbstractC4092b> c2qt) {
        if (PatchProxy.proxy(new Object[]{c2qt}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(c2qt);
        this.LIZIZ.LIZ(c2qt);
    }

    public final int LIZIZ(C4100c c4100c) {
        View view;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4100c}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C106862S5w.LIZ(c4100c);
        ViewLayerDelegate<AbstractC4092b> viewLayerDelegate = this.LIZIZ;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c4100c}, viewLayerDelegate, ViewLayerDelegate.LJIIIIZZ, false, 8);
        if (proxy2.isSupported) {
            return ((Integer) proxy2.result).intValue();
        }
        C106862S5w.LIZ(c4100c);
        Element<?> element = viewLayerDelegate.LJFF.get(c4100c);
        if (element != null && (view = element.LIZJ) != null) {
            return view.getId();
        }
        return -1;
    }

    public final void LIZ(Element<?> element) {
        AbstractC411552Qr abstractC411552Qr;
        if (PatchProxy.proxy(new Object[]{element}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(element);
        if ((element.LIZLLL instanceof C2NT) && (abstractC411552Qr = this.LIZJ) != null) {
            abstractC411552Qr.LIZ(this, element);
        }
        this.LIZIZ.LIZJ(element);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC411582Qu abstractC411582Qu;
        AbstractC411582Qu abstractC411582Qu2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 11).isSupported) {
            return;
        }
        AbstractC411552Qr abstractC411552Qr = this.LIZJ;
        if (abstractC411552Qr != null && abstractC411552Qr.LIZIZ(this) && (abstractC411582Qu2 = this.LIZLLL) != null) {
            abstractC411582Qu2.LIZJ(this);
        }
        super.onMeasure(i, i2);
        AbstractC411552Qr abstractC411552Qr2 = this.LIZJ;
        if (abstractC411552Qr2 != null && abstractC411552Qr2.LIZ(this) && (abstractC411582Qu = this.LIZLLL) != null) {
            abstractC411582Qu.LIZLLL(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r4 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4096c(com.bytedance.android.live.core.tetris.layer.initialization.LayerIndex r7, com.bytedance.android.live.core.tetris.layer.AbstractC4092b r8, android.content.Context r9, java.lang.Class<com.bytedance.android.live.core.tetris.layer.core.delegate.ViewLayerDelegate<com.bytedance.android.live.core.tetris.layer.AbstractC4092b>> r10) {
        /*
            r6 = this;
            p003X.C106862S5w.LIZ(r7, r8, r9)
            r6.<init>(r9)
            r6.f26185LJ = r7
            r6.LJFF = r8
            r6.LJI = r10
            r5 = 0
            r6.setClipChildren(r5)
            r6.setClipToPadding(r5)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.core.tetris.layer.core.C4096c.LIZ
            r0 = 10
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r6, r1, r5, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L28
            java.lang.Object r4 = r1.result
            com.bytedance.android.live.core.tetris.layer.core.delegate.ViewLayerDelegate r4 = (com.bytedance.android.live.core.tetris.layer.core.delegate.ViewLayerDelegate) r4
        L25:
            r6.LIZIZ = r4
            return
        L28:
            java.lang.Class<com.bytedance.android.live.core.tetris.layer.core.delegate.ViewLayerDelegate<com.bytedance.android.live.core.tetris.layer.b>> r0 = r6.LJI
            if (r0 == 0) goto L36
            java.lang.Object r4 = r0.newInstance()
            if (r4 == 0) goto L63
            com.bytedance.android.live.core.tetris.layer.core.delegate.ViewLayerDelegate r4 = (com.bytedance.android.live.core.tetris.layer.core.delegate.ViewLayerDelegate) r4
            if (r4 != 0) goto L3b
        L36:
            com.bytedance.android.live.core.tetris.layer.core.delegate.DefaultViewLayerDelegate r4 = new com.bytedance.android.live.core.tetris.layer.core.delegate.DefaultViewLayerDelegate
            r4.<init>()
        L3b:
            r0 = r6
            r4.LIZ(r0)
            X.2Qt r3 = new X.2Qt
            r0 = r6
            r3.<init>(r0)
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r5] = r3
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.core.tetris.layer.core.delegate.ViewLayerDelegate.LJIIIIZZ
            r0 = 4
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r4, r1, r5, r0)
            boolean r0 = r0.isSupported
            if (r0 != 0) goto L5a
            p003X.C106862S5w.LIZ(r3)
            r4.LJIIJJI = r3
        L5a:
            com.bytedance.android.live.core.tetris.layer.b r0 = r6.LJFF
            r4.LIZ(r0)
            r4.mo15262LJ()
            goto L25
        L63:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.bytedance.android.live.core.tetris.layer.core.delegate.ViewLayerDelegate<com.bytedance.android.live.core.tetris.layer.LayerContext>"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.tetris.layer.core.C4096c.<init>(com.bytedance.android.live.core.tetris.layer.initialization.LayerIndex, com.bytedance.android.live.core.tetris.layer.b, android.content.Context, java.lang.Class):void");
    }
}
