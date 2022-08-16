package com.bytedance.android.live.core.tetris.layer.core.layout;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.android.live.core.tetris.layer.AbstractC4092b;
import com.bytedance.android.live.core.tetris.layer.core.C4096c;
import com.bytedance.android.live.core.tetris.layer.core.descriptor.C4100c;
import com.bytedance.android.live.core.tetris.layer.initialization.LayerIndex;
import com.bytedance.android.live.core.tetris.layer.view.ElementConstraint;
import com.bytedance.android.live.core.view.LightView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC411282Pq;
import p003X.AbstractC411552Qr;
import p003X.C106862S5w;
import p003X.C146239ezh;
import p003X.C2NT;
import p003X.C2QT;
import p003X.C411592Qv;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.core.tetris.layer.core.layout.d */
/* loaded from: classes12.dex */
public final class C4111d {
    public static ChangeQuickRedirect LIZ;
    public final Map<C4100c, C4112a> LIZIZ = new LinkedHashMap();
    public final Map<C4100c, Map<C4096c, Integer>> LIZJ = new LinkedHashMap();
    public final Map<C4100c, ElementConstraint> LIZLLL = new LinkedHashMap();

    /* renamed from: LJ */
    public final Map<Integer, ElementConstraint> f26190LJ = new LinkedHashMap();
    public final AbstractC411552Qr LJFF;

    static {
        Covode.recordClassIndex(23710);
    }

    public final void LIZ(C4096c c4096c, AbstractC4092b abstractC4092b) {
        int LIZIZ;
        ElementConstraint LIZLLL;
        if (PatchProxy.proxy(new Object[]{c4096c, abstractC4092b}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4096c, abstractC4092b);
        for (C2QT c2qt : c4096c.getDescriptorSet()) {
            this.LIZIZ.put(c2qt.LIZJ(abstractC4092b), new C4112a(c4096c.LIZIZ(c2qt.LIZJ(abstractC4092b)), c4096c.getLayerIndex()));
        }
        C146239ezh c146239ezh = new C146239ezh();
        c146239ezh.LIZ(c4096c);
        Iterator<T> it = c4096c.getDescriptorSet().iterator();
        while (it.hasNext()) {
            AbstractC411282Pq abstractC411282Pq = (AbstractC411282Pq) it.next();
            if (!PatchProxy.proxy(new Object[]{c4096c, abstractC4092b, abstractC411282Pq, c146239ezh}, this, LIZ, false, 4).isSupported && (LIZIZ = c4096c.LIZIZ(abstractC411282Pq.LIZJ(abstractC4092b))) != -1) {
                if (this.f26190LJ.containsKey(Integer.valueOf(LIZIZ))) {
                    ElementConstraint elementConstraint = this.f26190LJ.get(Integer.valueOf(LIZIZ));
                    Intrinsics.checkNotNull(elementConstraint);
                    LIZLLL = elementConstraint;
                } else {
                    LIZLLL = abstractC411282Pq.LIZLLL(abstractC4092b);
                }
                LIZ(abstractC411282Pq.LIZJ(abstractC4092b), LIZLLL, c4096c, c146239ezh);
            }
        }
        try {
            c146239ezh.LIZIZ(c4096c);
        } catch (ClassCastException unused) {
        }
    }

    public final void LIZ(C4096c c4096c) {
        if (PatchProxy.proxy(new Object[]{c4096c}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4096c);
        C146239ezh c146239ezh = new C146239ezh();
        c146239ezh.LIZ(c4096c);
        Map<C4100c, Map<C4096c, Integer>> map = this.LIZJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<C4100c, Map<C4096c, Integer>> entry : map.entrySet()) {
            if (entry.getValue().containsKey(c4096c)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Object obj = ((Map) entry2.getValue()).get(c4096c);
            Intrinsics.checkNotNull(obj);
            int intValue = ((Number) obj).intValue();
            ElementConstraint elementConstraint = this.LIZLLL.get(key);
            Intrinsics.checkNotNull(elementConstraint);
            ElementConstraint elementConstraint2 = elementConstraint;
            LIZ(intValue, c146239ezh, elementConstraint2);
            for (ElementConstraint.C4116c c4116c : elementConstraint2.LJIIJJI) {
                LIZ(c146239ezh, c4116c, intValue);
            }
            try {
                c146239ezh.LIZIZ(c4096c);
            } catch (ClassCastException unused) {
            }
        }
    }

    public final void LIZ(C4100c c4100c, ElementConstraint elementConstraint, C4096c c4096c, AbstractC4092b abstractC4092b) {
        if (PatchProxy.proxy(new Object[]{c4100c, elementConstraint, c4096c, abstractC4092b}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4100c, elementConstraint, c4096c, abstractC4092b);
        C146239ezh c146239ezh = new C146239ezh();
        c146239ezh.LIZ(c4096c);
        LIZ(c4100c, elementConstraint, c4096c, c146239ezh);
        c146239ezh.LIZIZ(c4096c);
        if (C411592Qv.LIZ().getValue().booleanValue() || !(c4100c instanceof C2NT)) {
            return;
        }
        LIZIZ(c4100c, elementConstraint);
    }

    public C4111d(AbstractC411552Qr abstractC411552Qr) {
        C106862S5w.LIZ(abstractC411552Qr);
        this.LJFF = abstractC411552Qr;
    }

    /* renamed from: com.bytedance.android.live.core.tetris.layer.core.layout.d$a */
    /* loaded from: classes12.dex */
    public static final class C4112a {
        public static ChangeQuickRedirect LIZ;
        public final int LIZIZ;
        public final LayerIndex LIZJ;

        static {
            Covode.recordClassIndex(23711);
        }

        private Object[] LIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
            return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.LIZIZ), this.LIZJ};
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof C4112a) {
                return C106862S5w.LIZ(((C4112a) obj).LIZ(), LIZ());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("LayoutManager$IdAndLayerIndexPair:%s,%s", LIZ());
        }

        public C4112a(int i, LayerIndex layerIndex) {
            C106862S5w.LIZ(layerIndex);
            this.LIZIZ = i;
            this.LIZJ = layerIndex;
        }
    }

    private final void LIZIZ(C4100c c4100c, ElementConstraint elementConstraint) {
        Map<C4096c, Integer> map;
        if (!PatchProxy.proxy(new Object[]{c4100c, elementConstraint}, this, LIZ, false, 12).isSupported && (map = this.LIZJ.get(c4100c)) != null) {
            for (Map.Entry<C4096c, Integer> entry : map.entrySet()) {
                C4096c key = entry.getKey();
                int intValue = entry.getValue().intValue();
                C146239ezh c146239ezh = new C146239ezh();
                c146239ezh.LIZ(key);
                LIZ(intValue, c146239ezh, elementConstraint);
                for (ElementConstraint.C4116c c4116c : elementConstraint.LJIIJJI) {
                    LIZ(c146239ezh, c4116c, intValue);
                }
                try {
                    c146239ezh.LIZIZ(key);
                } catch (ClassCastException unused) {
                }
            }
        }
    }

    public final void LIZIZ(C4096c c4096c, AbstractC4092b abstractC4092b) {
        if (PatchProxy.proxy(new Object[]{c4096c, abstractC4092b}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4096c, abstractC4092b);
        Set<AbstractC411282Pq<AbstractC4092b>> descriptorSet = c4096c.getDescriptorSet();
        ArrayList<AbstractC411282Pq> arrayList = new ArrayList();
        for (Object obj : descriptorSet) {
            if (((C2QT) obj).LIZJ(abstractC4092b) instanceof C2NT) {
                arrayList.add(obj);
            }
        }
        for (AbstractC411282Pq abstractC411282Pq : arrayList) {
            this.LIZLLL.put(abstractC411282Pq.LIZJ(abstractC4092b), abstractC411282Pq.LIZLLL(abstractC4092b));
        }
    }

    private final void LIZ(C4100c c4100c, ElementConstraint elementConstraint) {
        if (!PatchProxy.proxy(new Object[]{c4100c, elementConstraint}, this, LIZ, false, 8).isSupported && (c4100c instanceof C2NT)) {
            for (ElementConstraint.C4116c c4116c : elementConstraint.LJIIJJI) {
                if (!c4116c.LIZJ.LIZIZ) {
                    throw new RuntimeException(c4100c + " 是 global，所以只能 connect Parent.");
                }
            }
        }
    }

    private final void LIZ(C146239ezh c146239ezh, ElementConstraint.C4116c c4116c, int i) {
        if (PatchProxy.proxy(new Object[]{c146239ezh, c4116c, Integer.valueOf(i)}, this, LIZ, false, 9).isSupported) {
            return;
        }
        if (c4116c.f26193LJ != 0.0f) {
            c146239ezh.LIZ(i, c4116c.LIZIZ, 0, c4116c.LIZLLL, LK5.LIZ(c4116c.f26193LJ));
        } else {
            c146239ezh.LIZ(i, c4116c.LIZIZ, 0, c4116c.LIZLLL, c4116c.LJFF);
        }
    }

    private final void LIZ(int i, C146239ezh c146239ezh, ElementConstraint elementConstraint) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), c146239ezh, elementConstraint}, this, LIZ, false, 6).isSupported) {
            return;
        }
        if (elementConstraint.LJIIL < 0.0f) {
            c146239ezh.m21402LJ(i, (int) elementConstraint.LJIIL);
        } else if (elementConstraint.LJIIL > 0.0f) {
            c146239ezh.m21402LJ(i, LK5.LIZ(elementConstraint.LJIIL));
        } else {
            c146239ezh.m21402LJ(i, elementConstraint.LIZIZ);
        }
        if (elementConstraint.LJIILIIL < 0.0f) {
            c146239ezh.LIZLLL(i, (int) elementConstraint.LJIILIIL);
        } else if (elementConstraint.LJIILIIL > 0.0f) {
            c146239ezh.LIZLLL(i, LK5.LIZ(elementConstraint.LJIILIIL));
        } else {
            c146239ezh.LIZLLL(i, elementConstraint.LIZJ);
        }
    }

    private final void LIZ(C146239ezh c146239ezh, int i, Integer num, ElementConstraint.C4116c c4116c) {
        if (!PatchProxy.proxy(new Object[]{c146239ezh, Integer.valueOf(i), num, c4116c}, this, LIZ, false, 10).isSupported && num != null) {
            num.intValue();
            if (c4116c.f26193LJ != 0.0f) {
                c146239ezh.LIZ(i, c4116c.LIZIZ, num.intValue(), c4116c.LIZLLL, LK5.LIZ(c4116c.f26193LJ));
            } else {
                c146239ezh.LIZ(i, c4116c.LIZIZ, num.intValue(), c4116c.LIZLLL, c4116c.LJFF);
            }
        }
    }

    private final void LIZ(C146239ezh c146239ezh, ElementConstraint.C4116c c4116c, int i, C4096c c4096c) {
        Map<C4096c, Integer> map;
        Integer valueOf;
        if (PatchProxy.proxy(new Object[]{c146239ezh, c4116c, Integer.valueOf(i), c4096c}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C4100c c4100c = c4116c.LIZJ.LIZJ;
        Intrinsics.checkNotNull(c4100c);
        if (this.LIZJ.get(c4100c) == null) {
            map = new LinkedHashMap<>();
            this.LIZJ.put(c4100c, map);
        } else {
            Map<C4096c, Integer> map2 = this.LIZJ.get(c4116c.LIZJ.LIZJ);
            Intrinsics.checkNotNull(map2);
            map = map2;
        }
        if (map.containsKey(c4096c)) {
            valueOf = map.get(c4096c);
        } else {
            Context context = c4096c.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            LightView lightView = new LightView(context, null, 0, 6, null);
            c4096c.addView(lightView, 0, new ConstraintLayout.LayoutParams(-2, -2));
            lightView.setId(ViewCompat.generateViewId());
            map.put(c4096c, Integer.valueOf(lightView.getId()));
            valueOf = Integer.valueOf(lightView.getId());
        }
        LIZ(c146239ezh, i, valueOf, c4116c);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void LIZ(com.bytedance.android.live.core.tetris.layer.core.descriptor.C4100c r17, com.bytedance.android.live.core.tetris.layer.view.ElementConstraint r18, com.bytedance.android.live.core.tetris.layer.core.C4096c r19, p003X.C146239ezh r20) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.tetris.layer.core.layout.C4111d.LIZ(com.bytedance.android.live.core.tetris.layer.core.descriptor.c, com.bytedance.android.live.core.tetris.layer.view.ElementConstraint, com.bytedance.android.live.core.tetris.layer.core.c, X.ezh):void");
    }
}
