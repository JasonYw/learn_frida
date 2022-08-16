package android.support.wearable.view;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.wearable.view.WearableRecyclerView;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* loaded from: classes22.dex */
public class CurvedChildLayoutManager extends WearableRecyclerView.ChildLayoutManager {
    public int LIZ;
    public boolean LIZIZ;
    public final Path LIZJ;
    public final PathMeasure LIZLLL;

    /* renamed from: LJ */
    public int f20209LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public final float[] LJIIIZ;
    public final float[] LJIIJ;
    public final float[] LJIIJJI;
    public WearableRecyclerView LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;

    static {
        Covode.recordClassIndex(319);
    }

    @Override // android.support.wearable.view.WearableRecyclerView.ChildLayoutManager
    public final void LIZ(View view, WearableRecyclerView wearableRecyclerView) {
        boolean z;
        boolean z2;
        if (this.LJIIL != wearableRecyclerView) {
            this.LJIIL = wearableRecyclerView;
            this.LJIILIIL = this.LJIIL.getWidth();
            this.LJIILJJIL = this.LJIIL.getHeight();
        }
        if (this.LIZIZ) {
            int i = this.LJIILIIL;
            int i2 = this.LJIILJJIL;
            if (this.f20209LJ != i2) {
                this.f20209LJ = i2;
                float f = i2;
                this.LJI = (-0.048f) * f;
                this.LJII = 1.048f * f;
                this.LJIIIIZZ = 10.416667f;
                this.LIZJ.reset();
                float f2 = i;
                this.LIZJ.moveTo(0.5f * f2, this.LJI);
                float f3 = f2 * 0.34f;
                this.LIZJ.lineTo(f3, 0.075f * f);
                float f4 = 0.22f * f2;
                float f5 = 0.13f * f2;
                this.LIZJ.cubicTo(f4, f * 0.17f, f5, f * 0.32f, f5, i2 / 2);
                this.LIZJ.cubicTo(f5, f * 0.68f, f4, f * 0.83f, f3, f * 0.925f);
                this.LIZJ.lineTo(i / 2, this.LJII);
                this.LIZLLL.setPath(this.LIZJ, false);
                this.LJFF = this.LIZLLL.getLength();
            }
            float[] fArr = this.LJIIJJI;
            fArr[0] = this.LIZ;
            fArr[1] = view.getHeight() / 2.0f;
            float f6 = (-view.getHeight()) / 2.0f;
            float height = this.LJIILJJIL + (view.getHeight() / 2.0f);
            float top = view.getTop() + this.LJIIJJI[1];
            this.LIZLLL.getPosTan(((Math.abs(f6) + top) / (height - f6)) * this.LJFF, this.LJIIIZ, this.LJIIJ);
            if (Math.abs(this.LJIIIZ[1] - this.LJI) < 0.001f && f6 < this.LJIIIZ[1]) {
                z = true;
            } else {
                z = false;
            }
            if (Math.abs(this.LJIIIZ[1] - this.LJII) < 0.001f && height > this.LJIIIZ[1]) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                float[] fArr2 = this.LJIIIZ;
                fArr2[1] = top;
                fArr2[0] = Math.abs(top) * this.LJIIIIZZ;
            }
            view.offsetLeftAndRight(((int) (this.LJIIIZ[0] - this.LJIIJJI[0])) - view.getLeft());
            view.setTranslationY(this.LJIIIZ[1] - top);
        }
    }
}
