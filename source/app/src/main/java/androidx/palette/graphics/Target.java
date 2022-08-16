package androidx.palette.graphics;

import com.bytedance.covode.number.Covode;

/* loaded from: classes18.dex */
public final class Target {
    public static final Target LIZ;
    public static final Target LIZIZ;
    public static final Target LIZJ;
    public static final Target LIZLLL;

    /* renamed from: LJ */
    public static final Target f20273LJ;
    public static final Target LJFF;
    public final float[] LJI = new float[3];
    public final float[] LJII = new float[3];
    public final float[] LJIIIIZZ = new float[3];
    public boolean LJIIIZ = true;

    public final float LIZ() {
        return this.LJIIIIZZ[0];
    }

    public final float LIZIZ() {
        return this.LJIIIIZZ[1];
    }

    public final float LIZJ() {
        return this.LJIIIIZZ[2];
    }

    public Target() {
        LIZ(this.LJI);
        LIZ(this.LJII);
        float[] fArr = this.LJIIIIZZ;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    static {
        Covode.recordClassIndex(1592);
        Target target = new Target();
        LIZ = target;
        LIZJ(target);
        LIZLLL(LIZ);
        Target target2 = new Target();
        LIZIZ = target2;
        LIZIZ(target2);
        LIZLLL(LIZIZ);
        Target target3 = new Target();
        LIZJ = target3;
        LIZ(target3);
        LIZLLL(LIZJ);
        Target target4 = new Target();
        LIZLLL = target4;
        LIZJ(target4);
        m21128LJ(LIZLLL);
        Target target5 = new Target();
        f20273LJ = target5;
        LIZIZ(target5);
        m21128LJ(f20273LJ);
        Target target6 = new Target();
        LJFF = target6;
        LIZ(target6);
        m21128LJ(LJFF);
    }

    public static void LIZ(Target target) {
        float[] fArr = target.LJII;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    public static void LIZJ(Target target) {
        float[] fArr = target.LJII;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    public static void LIZLLL(Target target) {
        float[] fArr = target.LJI;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    /* renamed from: LJ */
    public static void m21128LJ(Target target) {
        float[] fArr = target.LJI;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    public static void LIZ(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public static void LIZIZ(Target target) {
        float[] fArr = target.LJII;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }
}
