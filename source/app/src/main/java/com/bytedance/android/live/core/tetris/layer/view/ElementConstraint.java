package com.bytedance.android.live.core.tetris.layer.view;

import com.bytedance.android.live.core.tetris.layer.core.descriptor.C4100c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p003X.C106862S5w;
import p003X.C2N8;
import p003X.C2NT;
import p003X.C2QX;
import p003X.C2QY;

/* loaded from: classes12.dex */
public final class ElementConstraint {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;
    public int LIZJ;
    public float LIZLLL;

    /* renamed from: LJ */
    public float f26192LJ;
    public float LJFF;
    public float LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public final List<C4116c> LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;
    public static final C2N8 LJIILL = new C2N8((byte) 0);
    public static final ElementConstraint LJIILJJIL = new ElementConstraint(-2.0f, -2.0f);

    /* renamed from: com.bytedance.android.live.core.tetris.layer.view.ElementConstraint$d */
    /* loaded from: classes12.dex */
    public static final class C4117d {
        public float LIZ = -2.0f;
        public float LIZIZ = -2.0f;
        public int LIZJ;
        public int LIZLLL;

        static {
            Covode.recordClassIndex(23736);
        }
    }

    public ElementConstraint() {
        this(0.0f, 0.0f, 3);
    }

    /* renamed from: com.bytedance.android.live.core.tetris.layer.view.ElementConstraint$c */
    /* loaded from: classes12.dex */
    public static final class C4116c {
        public static ChangeQuickRedirect LIZ;
        public final int LIZIZ;
        public final C2QX LIZJ;
        public final int LIZLLL;

        /* renamed from: LJ */
        public float f26193LJ;
        public int LJFF;

        static {
            Covode.recordClassIndex(23735);
        }

        private Object[] LIZJ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
            return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.LIZIZ), this.LIZJ, Integer.valueOf(this.LIZLLL), Float.valueOf(this.f26193LJ), Integer.valueOf(this.LJFF)};
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 5);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof C4116c) {
                return C106862S5w.LIZ(((C4116c) obj).LIZJ(), LIZJ());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZJ());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("ElementConstraint$Rule:%s,%s,%s,%s,%s", LIZJ());
        }

        public final boolean LIZIZ() {
            return this.LIZJ.LIZJ instanceof C2NT;
        }

        public final C4116c LIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
            if (proxy.isSupported) {
                return (C4116c) proxy.result;
            }
            int i = this.LIZIZ;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return new C4116c(i, new C2QX(C2QY.LIZ()), 4, 0.0f, 0, 16);
                    }
                    return new C4116c(i, new C2QX(C2QY.LIZ()), 3, 0.0f, 0, 16);
                }
                return new C4116c(i, new C2QX(C2QY.LIZ()), 2, 0.0f, 0, 16);
            }
            return new C4116c(i, new C2QX(C2QY.LIZ()), 1, 0.0f, 0, 16);
        }

        public C4116c(int i, C2QX c2qx, int i2, float f, int i3) {
            C106862S5w.LIZ(c2qx);
            this.LIZIZ = i;
            this.LIZJ = c2qx;
            this.LIZLLL = i2;
            this.f26193LJ = f;
            this.LJFF = i3;
        }

        public /* synthetic */ C4116c(int i, C2QX c2qx, int i2, float f, int i3, int i4) {
            this(i, c2qx, i2, (i4 & 8) != 0 ? 0.0f : f, (i4 & 16) != 0 ? 0 : i3);
        }
    }

    static {
        Covode.recordClassIndex(23731);
    }

    /* loaded from: classes12.dex */
    public enum Side {
        LEFT(1),
        RIGHT(2),
        TOP(3),
        BOTTOM(4);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int value;

        public static Side valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (Side) (proxy.isSupported ? proxy.result : Enum.valueOf(Side.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Side[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (Side[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(23732);
        }

        Side(int i) {
            this.value = i;
        }
    }

    public final ElementConstraint LIZ(int i) {
        this.LJIIJ = i;
        return this;
    }

    public final ElementConstraint LIZIZ(boolean z) {
        this.LJIIIIZZ = true;
        return this;
    }

    public final ElementConstraint LIZ(boolean z) {
        this.LJII = z;
        return this;
    }

    public ElementConstraint(float f, float f2) {
        this.LJIIL = f;
        this.LJIILIIL = f2;
        this.LJIIJ = -1;
        this.LJIIJJI = new ArrayList();
    }

    public ElementConstraint(int i, int i2) {
        this(0.0f, 0.0f);
        this.LIZIZ = i;
        this.LIZJ = i2;
    }

    public /* synthetic */ ElementConstraint(float f, float f2, int i) {
        this(-2.0f, -2.0f);
    }

    @Deprecated(message = "建议使用诸如 leftToLeft 之类的调用", replaceWith = @ReplaceWith(expression = "leftToLeft,leftToRight...", imports = {}))
    public final ElementConstraint LIZ(Side side, Side side2, int i) {
        C106862S5w.LIZ(side, side2);
        this.LJIIJJI.add(new C4116c(side.value, new C2QX(C2QY.LIZ()), side2.value, 0.0f, i, 8));
        return this;
    }

    public final ElementConstraint LIZ(Side side, Side side2, float f) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{side, side2, Float.valueOf(f)}, this, LIZ, false, 23);
        if (proxy.isSupported) {
            return (ElementConstraint) proxy.result;
        }
        C106862S5w.LIZ(side, side2);
        LIZ(side, C2QY.LIZ(), side2, f);
        return this;
    }

    public final ElementConstraint LIZ(Side side, C4100c c4100c, Side side2, float f) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{side, c4100c, side2, Float.valueOf(f)}, this, LIZ, false, 21);
        if (proxy.isSupported) {
            return (ElementConstraint) proxy.result;
        }
        C106862S5w.LIZ(side, c4100c, side2);
        this.LJIIJJI.add(new C4116c(side.value, new C2QX(c4100c), side2.value, f, 0, 16));
        return this;
    }

    public final ElementConstraint LIZ(Side side, C4100c c4100c, Side side2, Function1<? super C4116c, Unit> function1) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{side, c4100c, side2, function1}, this, LIZ, false, 19);
        if (proxy.isSupported) {
            return (ElementConstraint) proxy.result;
        }
        C4116c c4116c = new C4116c(side.value, new C2QX(c4100c), side2.value, 0.0f, 0, 24);
        if (function1 != null) {
            function1.invoke(c4116c);
        }
        this.LJIIJJI.add(c4116c);
        return this;
    }

    public static /* synthetic */ ElementConstraint LIZ(ElementConstraint elementConstraint, Side side, Side side2, float f, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{elementConstraint, side, side2, Float.valueOf(0.0f), 4, null}, null, LIZ, true, 24);
        if (proxy.isSupported) {
            return (ElementConstraint) proxy.result;
        }
        return elementConstraint.LIZ(side, side2, 0.0f);
    }

    public static /* synthetic */ ElementConstraint LIZ(ElementConstraint elementConstraint, Side side, C4100c c4100c, Side side2, float f, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{elementConstraint, side, c4100c, side2, Float.valueOf(0.0f), 8, null}, null, LIZ, true, 22);
        if (proxy.isSupported) {
            return (ElementConstraint) proxy.result;
        }
        return elementConstraint.LIZ(side, c4100c, side2, 0.0f);
    }
}
