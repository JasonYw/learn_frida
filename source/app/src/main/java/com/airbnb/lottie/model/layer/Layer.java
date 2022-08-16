package com.airbnb.lottie.model.layer;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.content.AbstractC0846b;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.p051a.C0834b;
import com.airbnb.lottie.model.p051a.C0840j;
import com.airbnb.lottie.model.p051a.C0841k;
import com.airbnb.lottie.model.p051a.C0842l;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.util.List;
import java.util.Locale;
import p003X.C145133ehl;

/* loaded from: classes19.dex */
public final class Layer {
    public final List<AbstractC0846b> LIZ;
    public final LottieComposition LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;

    /* renamed from: LJ */
    public final LayerType f21090LJ;
    public final long LJFF;
    public final String LJI;
    public final List<Mask> LJII;
    public final C0842l LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final float LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public final C0840j LJIILL;
    public final C0841k LJIILLIIL;
    public final C0834b LJIIZILJ;
    public final List<C145133ehl<Float>> LJIJ;
    public final MatteType LJIJI;
    public final float LJIJJ;

    static {
        Covode.recordClassIndex(4127);
    }

    public final String toString() {
        return LIZ("");
    }

    public final float LIZ() {
        return this.LJIJJ / this.LIZIZ.getDurationFrames();
    }

    /* loaded from: classes19.dex */
    public enum LayerType {
        PreComp,
        Solid,
        Image,
        Null,
        Shape,
        Text,
        Unknown;

        static {
            if (ReDexClinitStringAb.abTest >= 4) {
                clinit$r$fake();
                return;
            }
            Covode.recordClassIndex(4128);
        }

        private static void clinit$r$fake() {
            Covode.recordClassIndex(4128);
            PreComp = new LayerType();
            Solid = new LayerType();
            Image = new LayerType();
            Null = new LayerType();
            Shape = new LayerType();
            Text = new LayerType();
            Unknown = new LayerType();
            $VALUES = new LayerType[]{PreComp, Solid, Image, Null, Shape, Text, Unknown};
        }
    }

    /* loaded from: classes19.dex */
    public enum MatteType {
        None,
        Add,
        Invert,
        Unknown;

        static {
            if (ReDexClinitStringAb.abTest >= 5) {
                clinit$r$fake();
                return;
            }
            Covode.recordClassIndex(4129);
        }

        private static void clinit$r$fake() {
            Covode.recordClassIndex(4129);
            None = new MatteType();
            Add = new MatteType();
            Invert = new MatteType();
            Unknown = new MatteType();
            $VALUES = new MatteType[]{None, Add, Invert, Unknown};
        }
    }

    public final String LIZ(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.LIZJ);
        sb.append("\n");
        Layer layerModelForId = this.LIZIZ.layerModelForId(this.LJFF);
        if (layerModelForId != null) {
            sb.append("\t\tParents: ");
            sb.append(layerModelForId.LIZJ);
            Layer layerModelForId2 = this.LIZIZ.layerModelForId(layerModelForId.LJFF);
            while (layerModelForId2 != null) {
                sb.append("->");
                sb.append(layerModelForId2.LIZJ);
                layerModelForId2 = this.LIZIZ.layerModelForId(layerModelForId2.LJFF);
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!this.LJII.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(this.LJII.size());
            sb.append("\n");
        }
        if (this.LJIIIZ != 0 && this.LJIIJ != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(this.LJIIIZ), Integer.valueOf(this.LJIIJ), Integer.valueOf(this.LJIIJJI)));
        }
        if (!this.LIZ.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (AbstractC0846b abstractC0846b : this.LIZ) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(abstractC0846b);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public Layer(List<AbstractC0846b> list, LottieComposition lottieComposition, String str, long j, LayerType layerType, long j2, String str2, List<Mask> list2, C0842l c0842l, int i, int i2, int i3, float f, float f2, int i4, int i5, C0840j c0840j, C0841k c0841k, List<C145133ehl<Float>> list3, MatteType matteType, C0834b c0834b) {
        this.LIZ = list;
        this.LIZIZ = lottieComposition;
        this.LIZJ = str;
        this.LIZLLL = j;
        this.f21090LJ = layerType;
        this.LJFF = j2;
        this.LJI = str2;
        this.LJII = list2;
        this.LJIIIIZZ = c0842l;
        this.LJIIIZ = i;
        this.LJIIJ = i2;
        this.LJIIJJI = i3;
        this.LJIIL = f;
        this.LJIJJ = f2;
        this.LJIILIIL = i4;
        this.LJIILJJIL = i5;
        this.LJIILL = c0840j;
        this.LJIILLIIL = c0841k;
        this.LJIJ = list3;
        this.LJIJI = matteType;
        this.LJIIZILJ = c0834b;
    }
}
