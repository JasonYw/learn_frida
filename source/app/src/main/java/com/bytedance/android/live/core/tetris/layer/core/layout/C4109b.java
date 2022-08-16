package com.bytedance.android.live.core.tetris.layer.core.layout;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.tetris.layer.core.C4096c;
import com.bytedance.android.live.core.tetris.layer.core.descriptor.C4100c;
import com.bytedance.android.live.core.tetris.layer.core.element.Element;
import com.bytedance.android.live.core.tetris.layer.view.ElementConstraint;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC411552Qr;
import p003X.AbstractC411582Qu;
import p003X.C106862S5w;
import p003X.C2NT;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.core.tetris.layer.core.layout.b */
/* loaded from: classes12.dex */
public final class C4109b implements AbstractC411552Qr, AbstractC411582Qu {
    public static ChangeQuickRedirect LIZ;
    public final Map<C4096c, HashSet<Element<?>>> LIZIZ = new LinkedHashMap();
    public final Map<C4100c, Element<?>> LIZJ = new LinkedHashMap();
    public final Map<C4096c, Set<a$a>> LIZLLL = new LinkedHashMap();

    /* renamed from: LJ */
    public final Map<View, C4110a> f26188LJ = new LinkedHashMap();
    public final Map<C4100c, HashSet<Element<?>>> LJFF = new LinkedHashMap();

    static {
        Covode.recordClassIndex(23706);
    }

    @Override // p003X.AbstractC411552Qr
    public final boolean LIZ(C4096c c4096c) {
        Integer valueOf;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4096c}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(c4096c);
        HashSet<Element<?>> hashSet = this.LIZIZ.get(c4096c);
        if (hashSet != null && (valueOf = Integer.valueOf(hashSet.size())) != null && valueOf.intValue() > 0) {
            return true;
        }
        return false;
    }

    @Override // p003X.AbstractC411552Qr
    public final boolean LIZIZ(C4096c c4096c) {
        Integer valueOf;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4096c}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(c4096c);
        Set<a$a> set = this.LIZLLL.get(c4096c);
        if (set != null && (valueOf = Integer.valueOf(set.size())) != null && valueOf.intValue() > 0) {
            return true;
        }
        return false;
    }

    @Override // p003X.AbstractC411582Qu
    public final void LIZLLL(C4096c c4096c) {
        ViewParent parent;
        if (PatchProxy.proxy(new Object[]{c4096c}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4096c);
        HashSet<Element<?>> hashSet = this.LIZIZ.get(c4096c);
        if (hashSet != null) {
            Iterator<T> it = hashSet.iterator();
            while (it.hasNext()) {
                Element element = (Element) it.next();
                View view = element.LIZJ;
                if (view != null) {
                    ConstraintWidget viewWidget = c4096c.getViewWidget(view);
                    C4110a c4110a = this.f26188LJ.get(view);
                    if (c4110a != null) {
                        Intrinsics.checkNotNullExpressionValue(viewWidget, "");
                        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewWidget, c4110a}, this, LIZ, false, 9);
                        if (!proxy.isSupported ? viewWidget.LJIILLIIL() != c4110a.LIZIZ || viewWidget.LJIJ() != c4110a.LIZJ || viewWidget.LJIIZILJ() != c4110a.LIZLLL || viewWidget.LJIJI() != c4110a.f26189LJ : ((Boolean) proxy.result).booleanValue()) {
                            if (!PatchProxy.proxy(new Object[]{element}, this, LIZ, false, 8).isSupported) {
                                HashSet<Element<?>> hashSet2 = this.LJFF.get(element.LIZLLL);
                                if (hashSet2 != null) {
                                    Iterator<T> it2 = hashSet2.iterator();
                                    while (it2.hasNext()) {
                                        View view2 = ((Element) it2.next()).LIZJ;
                                        if (view2 != null) {
                                            view2.requestLayout();
                                        }
                                    }
                                }
                                View view3 = element.LIZJ;
                                if (view3 != null && (parent = view3.getParent()) != null) {
                                    parent.requestLayout();
                                }
                            }
                        }
                    }
                    Map<View, C4110a> map = this.f26188LJ;
                    Intrinsics.checkNotNullExpressionValue(viewWidget, "");
                    map.put(view, new C4110a(viewWidget.LJIILLIIL(), viewWidget.LJIJ(), viewWidget.LJIIZILJ(), viewWidget.LJIJI()));
                }
            }
        }
    }

    @Override // p003X.AbstractC411582Qu
    public final void LIZJ(C4096c c4096c) {
        Element<?> element;
        C4109b c4109b = this;
        if (PatchProxy.proxy(new Object[]{c4096c}, c4109b, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4096c);
        Set<a$a> set = c4109b.LIZLLL.get(c4096c);
        if (set != null) {
            for (a$a a_a : set) {
                View view = a_a.LIZIZ.LIZJ;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                        int i = layoutParams2.leftMargin;
                        int i2 = layoutParams2.rightMargin;
                        int i3 = layoutParams2.topMargin;
                        int i4 = layoutParams2.bottomMargin;
                        for (ElementConstraint.C4116c c4116c : a_a.LIZJ) {
                            if ((c4116c.LIZJ.LIZJ instanceof C2NT) && (element = c4109b.LIZJ.get(c4116c.LIZJ.LIZJ)) != null) {
                                View view2 = element.LIZJ;
                                if (view2 == null) {
                                    return;
                                }
                                ViewParent parent = view2.getParent();
                                if (parent != null) {
                                    C4096c c4096c2 = (C4096c) parent;
                                    ConstraintWidget viewWidget = c4096c2.getViewWidget(view2);
                                    if (viewWidget != null) {
                                        int LIZJ = (int) LK5.LIZJ(c4116c.f26193LJ);
                                        if (LIZJ < 0) {
                                            LIZJ = 0;
                                        }
                                        int i5 = c4116c.LIZIZ;
                                        if (i5 != 1) {
                                            if (i5 != 2) {
                                                if (i5 != 3) {
                                                    if (i5 == 4) {
                                                        if (c4116c.LIZLLL == 3) {
                                                            layoutParams2.bottomMargin = (c4096c2.getMeasuredHeight() - viewWidget.LJIJI()) + view2.getHeight() + LIZJ;
                                                        } else if (c4116c.LIZLLL == 4) {
                                                            layoutParams2.bottomMargin = (c4096c2.getMeasuredHeight() - viewWidget.LJIJI()) + LIZJ;
                                                        }
                                                    }
                                                } else if (c4116c.LIZLLL == 3) {
                                                    layoutParams2.topMargin = viewWidget.LJIIZILJ() + LIZJ;
                                                } else if (c4116c.LIZLLL == 4) {
                                                    layoutParams2.topMargin = viewWidget.LJIIZILJ() + viewWidget.LJIIJJI() + LIZJ;
                                                }
                                            } else if (c4116c.LIZLLL == 1) {
                                                layoutParams2.rightMargin = (c4096c2.getMeasuredWidth() - viewWidget.LJIJ()) + viewWidget.LJIIJ() + LIZJ;
                                            } else if (c4116c.LIZLLL == 2) {
                                                layoutParams2.rightMargin = (c4096c2.getMeasuredWidth() - viewWidget.LJIJ()) + LIZJ;
                                            }
                                        } else if (c4116c.LIZLLL == 1) {
                                            layoutParams2.leftMargin = viewWidget.LJIILLIIL() + LIZJ;
                                        } else if (c4116c.LIZLLL == 2) {
                                            layoutParams2.leftMargin = viewWidget.LJIILLIIL() + viewWidget.LJIIJ() + LIZJ;
                                        }
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.core.tetris.layer.core.ViewLayer");
                                }
                            }
                            c4109b = this;
                        }
                        if (layoutParams2.leftMargin != i || layoutParams2.rightMargin != i2 || layoutParams2.topMargin != i3 || layoutParams2.bottomMargin != i4) {
                            view.requestLayout();
                            c4096c.requestLayout();
                        }
                        c4109b = this;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
                    }
                }
            }
        }
    }

    @Override // p003X.AbstractC411552Qr
    public final void LIZ(C4096c c4096c, Element<?> element) {
        HashSet<Element<?>> hashSet;
        if (PatchProxy.proxy(new Object[]{c4096c, element}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4096c, element);
        if (element.LIZLLL instanceof C2NT) {
            this.LIZJ.put(element.LIZLLL, element);
            if (this.LIZIZ.containsKey(c4096c)) {
                HashSet<Element<?>> hashSet2 = this.LIZIZ.get(c4096c);
                Intrinsics.checkNotNull(hashSet2);
                hashSet = hashSet2;
            } else {
                hashSet = new HashSet<>();
                this.LIZIZ.put(c4096c, hashSet);
            }
            hashSet.add(element);
        }
    }

    @Override // p003X.AbstractC411552Qr
    public final void LIZ(C4096c c4096c, a$a a_a) {
        Set<a$a> hashSet;
        HashSet<Element<?>> hashSet2;
        if (PatchProxy.proxy(new Object[]{c4096c, a_a}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4096c, a_a);
        if (this.LIZLLL.containsKey(c4096c)) {
            Set<a$a> set = this.LIZLLL.get(c4096c);
            Intrinsics.checkNotNull(set);
            hashSet = set;
        } else {
            hashSet = new HashSet<>();
            this.LIZLLL.put(c4096c, hashSet);
        }
        for (ElementConstraint.C4116c c4116c : a_a.LIZJ) {
            if (c4116c.LIZIZ()) {
                C4100c c4100c = c4116c.LIZJ.LIZJ;
                if (c4100c != null) {
                    if (this.LJFF.containsKey(c4100c)) {
                        HashSet<Element<?>> hashSet3 = this.LJFF.get(c4100c);
                        Intrinsics.checkNotNull(hashSet3);
                        hashSet2 = hashSet3;
                    } else {
                        hashSet2 = new HashSet<>();
                        this.LJFF.put(c4100c, hashSet2);
                    }
                    hashSet2.add(a_a.LIZIZ);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.core.tetris.layer.core.descriptor.GlobalElementType");
                }
            }
        }
        hashSet.add(a_a);
    }

    @Override // p003X.AbstractC411552Qr
    public final void LIZ(Element<?> element, C4096c c4096c) {
        if (PatchProxy.proxy(new Object[]{element, c4096c}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(element, c4096c);
        Set<a$a> set = this.LIZLLL.get(c4096c);
        if (set != null) {
            Iterator<a$a> it = set.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(it.next().LIZIZ, element)) {
                    it.remove();
                }
            }
        }
        if (element.LIZLLL instanceof C2NT) {
            HashSet<Element<?>> hashSet = this.LIZIZ.get(c4096c);
            if (hashSet != null) {
                hashSet.remove(element);
            }
            this.LIZJ.remove(element.LIZLLL);
            View view = element.LIZJ;
            if (view != null) {
                this.f26188LJ.remove(view);
            }
            this.LJFF.remove(element.LIZLLL);
        }
    }

    /* renamed from: com.bytedance.android.live.core.tetris.layer.core.layout.b$a */
    /* loaded from: classes12.dex */
    public static final class C4110a {
        public static ChangeQuickRedirect LIZ;
        public final int LIZIZ;
        public final int LIZJ;
        public final int LIZLLL;

        /* renamed from: LJ */
        public final int f26189LJ;

        static {
            Covode.recordClassIndex(23707);
        }

        private Object[] LIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
            return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL), Integer.valueOf(this.f26189LJ)};
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof C4110a) {
                return C106862S5w.LIZ(((C4110a) obj).LIZ(), LIZ());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("GlobalElementLayoutManager$WidgetInfo:%s,%s,%s,%s", LIZ());
        }

        public C4110a(int i, int i2, int i3, int i4) {
            this.LIZIZ = i;
            this.LIZJ = i2;
            this.LIZLLL = i3;
            this.f26189LJ = i4;
        }
    }
}
