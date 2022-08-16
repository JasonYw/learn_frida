package com.bytedance.android.live.core.tetris.layer.core;

import com.bytedance.android.live.core.tetris.layer.AbstractC4092b;
import com.bytedance.android.live.core.tetris.layer.core.delegate.LayerDelegate;
import com.bytedance.android.live.core.tetris.layer.core.delegate.ServiceLayerDelegate;
import com.bytedance.android.live.core.tetris.layer.core.descriptor.C4100c;
import com.bytedance.android.live.core.tetris.layer.core.element.Element;
import com.bytedance.android.live.core.tetris.layer.initialization.LayerIndex;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.C2QT;

/* renamed from: com.bytedance.android.live.core.tetris.layer.core.b */
/* loaded from: classes12.dex */
public final class C4095b implements AbstractC4093a {
    public static ChangeQuickRedirect LIZ;
    public LayerDelegate<C4095b, AbstractC4092b> LIZIZ;
    public final AbstractC4092b LIZJ;
    public final Class<ServiceLayerDelegate<AbstractC4092b>> LIZLLL;

    static {
        Covode.recordClassIndex(23641);
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.AbstractC4093a
    public final LayerDelegate<? extends AbstractC4093a, ? extends AbstractC4092b> getLayerDelegate() {
        return this.LIZIZ;
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.AbstractC4093a
    public final LayerIndex getLayerIndex() {
        return LayerIndex.INDEX_SERVICE;
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.AbstractC4093a
    public final Element<?> LIZ(C4100c c4100c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4100c}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (Element) proxy.result;
        }
        C106862S5w.LIZ(c4100c);
        return this.LIZIZ.LIZ(c4100c);
    }

    public final void LIZIZ(Element<?> element) {
        if (PatchProxy.proxy(new Object[]{element}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(element);
        this.LIZIZ.LIZLLL(element);
    }

    @Override // com.bytedance.android.live.core.tetris.layer.core.AbstractC4093a
    public final void LIZ(C2QT<AbstractC4092b> c2qt) {
        if (PatchProxy.proxy(new Object[]{c2qt}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(c2qt);
        this.LIZIZ.LIZ(c2qt);
    }

    public final void LIZ(Element<?> element) {
        if (PatchProxy.proxy(new Object[]{element}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(element);
        this.LIZIZ.LIZJ(element);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r1 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4095b(com.bytedance.android.live.core.tetris.layer.AbstractC4092b r5, java.lang.Class<com.bytedance.android.live.core.tetris.layer.core.delegate.ServiceLayerDelegate<com.bytedance.android.live.core.tetris.layer.AbstractC4092b>> r6) {
        /*
            r4 = this;
            p003X.C106862S5w.LIZ(r5)
            r4.<init>()
            r4.LIZJ = r5
            r4.LIZLLL = r6
            r3 = 0
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.core.tetris.layer.core.C4095b.LIZ
            r0 = 7
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r4, r1, r3, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1f
            java.lang.Object r1 = r1.result
            com.bytedance.android.live.core.tetris.layer.core.delegate.ServiceLayerDelegate r1 = (com.bytedance.android.live.core.tetris.layer.core.delegate.ServiceLayerDelegate) r1
        L1c:
            r4.LIZIZ = r1
            return
        L1f:
            java.lang.Class<com.bytedance.android.live.core.tetris.layer.core.delegate.ServiceLayerDelegate<com.bytedance.android.live.core.tetris.layer.b>> r0 = r4.LIZLLL
            if (r0 == 0) goto L2d
            java.lang.Object r1 = r0.newInstance()
            if (r1 == 0) goto L3c
            com.bytedance.android.live.core.tetris.layer.core.delegate.ServiceLayerDelegate r1 = (com.bytedance.android.live.core.tetris.layer.core.delegate.ServiceLayerDelegate) r1
            if (r1 != 0) goto L32
        L2d:
            com.bytedance.android.live.core.tetris.layer.core.delegate.DefaultServiceLayerDelegate r1 = new com.bytedance.android.live.core.tetris.layer.core.delegate.DefaultServiceLayerDelegate
            r1.<init>()
        L32:
            r0 = r4
            r1.LIZ(r0)
            com.bytedance.android.live.core.tetris.layer.b r0 = r4.LIZJ
            r1.LIZ(r0)
            goto L1c
        L3c:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.bytedance.android.live.core.tetris.layer.core.delegate.ServiceLayerDelegate<com.bytedance.android.live.core.tetris.layer.LayerContext>"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.tetris.layer.core.C4095b.<init>(com.bytedance.android.live.core.tetris.layer.b, java.lang.Class):void");
    }
}
