package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC0851a;
import com.airbnb.lottie.model.p051a.C0833a;
import com.airbnb.lottie.model.p051a.C0834b;
import com.airbnb.lottie.model.p051a.C0836d;
import com.airbnb.lottie.p047a.p048a.AbstractC0827c;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.util.List;
import p003X.C145239ejT;

/* loaded from: classes19.dex */
public final class ShapeStroke implements AbstractC0846b {
    public final String LIZ;
    public final C0834b LIZIZ;
    public final List<C0834b> LIZJ;
    public final C0833a LIZLLL;

    /* renamed from: LJ */
    public final C0836d f21087LJ;
    public final C0834b LJFF;
    public final LineCapType LJI;
    public final LineJoinType LJII;
    public final float LJIIIIZZ;

    static {
        Covode.recordClassIndex(4107);
    }

    /* loaded from: classes19.dex */
    public enum LineCapType {
        Butt,
        Round,
        Unknown;

        public final Paint.Cap LIZ() {
            int i = C08451.LIZ[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }

        static {
            Covode.recordClassIndex(4109);
        }
    }

    /* loaded from: classes19.dex */
    public enum LineJoinType {
        Miter,
        Round,
        Bevel;

        public final Paint.Join LIZ() {
            int i = C08451.LIZIZ[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return Paint.Join.ROUND;
                }
                return Paint.Join.MITER;
            }
            return Paint.Join.BEVEL;
        }

        static {
            Covode.recordClassIndex(4110);
        }
    }

    /* renamed from: com.airbnb.lottie.model.content.ShapeStroke$1 */
    /* loaded from: classes19.dex */
    public static /* synthetic */ class C08451 {
        public static final /* synthetic */ int[] LIZ;
        public static final /* synthetic */ int[] LIZIZ;

        static {
            if (ReDexClinitStringAb.abTest >= 4) {
                clinit$r$fake();
                return;
            }
            Covode.recordClassIndex(4108);
            LIZIZ = new int[LineJoinType.values().length];
            try {
                LIZIZ[LineJoinType.Bevel.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LIZIZ[LineJoinType.Miter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LIZIZ[LineJoinType.Round.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            LIZ = new int[LineCapType.values().length];
            try {
                LIZ[LineCapType.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                LIZ[LineCapType.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                LIZ[LineCapType.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }

        private static void clinit$r$fake() {
            Covode.recordClassIndex(4108);
            LIZIZ = new int[LineJoinType.values().length];
            try {
                LIZIZ[LineJoinType.Bevel.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LIZIZ[LineJoinType.Miter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LIZIZ[LineJoinType.Round.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            LIZ = new int[LineCapType.values().length];
            try {
                LIZ[LineCapType.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                LIZ[LineCapType.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                LIZ[LineCapType.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.airbnb.lottie.model.content.AbstractC0846b
    public final AbstractC0827c LIZ(LottieDrawable lottieDrawable, AbstractC0851a abstractC0851a) {
        return new C145239ejT(lottieDrawable, abstractC0851a, this);
    }

    public ShapeStroke(String str, C0834b c0834b, List<C0834b> list, C0833a c0833a, C0836d c0836d, C0834b c0834b2, LineCapType lineCapType, LineJoinType lineJoinType, float f) {
        this.LIZ = str;
        this.LIZIZ = c0834b;
        this.LIZJ = list;
        this.LIZLLL = c0833a;
        this.f21087LJ = c0836d;
        this.LJFF = c0834b2;
        this.LJI = lineCapType;
        this.LJII = lineJoinType;
        this.LJIIIIZZ = f;
    }
}
