package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import com.bytedance.covode.number.Covode;
import p003X.C139133d8j;

/* loaded from: classes17.dex */
public class h$b {
    public final Matrix LIZ = new Matrix();
    public final float[] LIZIZ;
    public float LIZJ;
    public float LIZLLL;

    /* renamed from: LJ */
    public final View f20291LJ;

    static {
        Covode.recordClassIndex(2016);
    }

    public void LIZ() {
        float[] fArr = this.LIZIZ;
        fArr[2] = this.LIZJ;
        fArr[5] = this.LIZLLL;
        this.LIZ.setValues(fArr);
        C139133d8j.LIZJ(this.f20291LJ, this.LIZ);
    }

    public h$b(View view, float[] fArr) {
        this.f20291LJ = view;
        this.LIZIZ = (float[]) fArr.clone();
        float[] fArr2 = this.LIZIZ;
        this.LIZJ = fArr2[2];
        this.LIZLLL = fArr2[5];
        LIZ();
    }
}
