package androidx.palette.graphics;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.SparseBooleanArray;
import androidx.collection.ArrayMap;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes18.dex */
public final class Palette {
    public static final AbstractC0347a LIZIZ = new AbstractC0347a() { // from class: androidx.palette.graphics.Palette.1
        static {
            Covode.recordClassIndex(1586);
        }

        @Override // androidx.palette.graphics.Palette.AbstractC0347a
        public final boolean LIZ(float[] fArr) {
            if (fArr[2] < 0.95f && fArr[2] > 0.05f && (fArr[0] < 10.0f || fArr[0] > 37.0f || fArr[1] > 0.82f)) {
                return true;
            }
            return false;
        }
    };
    public final List<Swatch> LIZ;
    public final List<Target> LIZJ;

    /* renamed from: LJ */
    public final SparseBooleanArray f20270LJ = new SparseBooleanArray();
    public final Map<Target, Swatch> LIZLLL = new ArrayMap();
    public final Swatch LJFF = LIZIZ();

    /* renamed from: androidx.palette.graphics.Palette$a */
    /* loaded from: classes18.dex */
    public interface AbstractC0347a {
        static {
            Covode.recordClassIndex(1590);
        }

        boolean LIZ(float[] fArr);
    }

    /* renamed from: androidx.palette.graphics.Palette$b */
    /* loaded from: classes15.dex */
    public interface AbstractC0348b {
        static {
            Covode.recordClassIndex(1591);
        }

        void LIZ(Palette palette);
    }

    /* loaded from: classes18.dex */
    public static final class Swatch {
        public final int LIZ;
        public final int LIZIZ;
        public final int LIZJ;
        public final int LIZLLL;

        /* renamed from: LJ */
        public final int f20272LJ;
        public boolean LJFF;
        public int LJI;
        public int LJII;
        public float[] LJIIIIZZ;

        static {
            Covode.recordClassIndex(1589);
        }

        public final int getPopulation() {
            return this.f20272LJ;
        }

        public final int getRgb() {
            return this.LIZLLL;
        }

        public final int hashCode() {
            return (this.LIZLLL * 31) + this.f20272LJ;
        }

        public final float[] getHsl() {
            if (this.LJIIIIZZ == null) {
                this.LJIIIIZZ = new float[3];
            }
            ColorUtils.RGBToHSL(this.LIZ, this.LIZIZ, this.LIZJ, this.LJIIIIZZ);
            return this.LJIIIIZZ;
        }

        private void LIZ() {
            int alphaComponent;
            int alphaComponent2;
            if (!this.LJFF) {
                int calculateMinimumAlpha = ColorUtils.calculateMinimumAlpha(-1, this.LIZLLL, 4.5f);
                int calculateMinimumAlpha2 = ColorUtils.calculateMinimumAlpha(-1, this.LIZLLL, 3.0f);
                if (calculateMinimumAlpha != -1 && calculateMinimumAlpha2 != -1) {
                    this.LJII = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha);
                    this.LJI = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha2);
                    this.LJFF = true;
                    return;
                }
                int calculateMinimumAlpha3 = ColorUtils.calculateMinimumAlpha(ViewCompat.MEASURED_STATE_MASK, this.LIZLLL, 4.5f);
                int calculateMinimumAlpha4 = ColorUtils.calculateMinimumAlpha(ViewCompat.MEASURED_STATE_MASK, this.LIZLLL, 3.0f);
                if (calculateMinimumAlpha3 != -1 && calculateMinimumAlpha4 != -1) {
                    this.LJII = ColorUtils.setAlphaComponent(ViewCompat.MEASURED_STATE_MASK, calculateMinimumAlpha3);
                    this.LJI = ColorUtils.setAlphaComponent(ViewCompat.MEASURED_STATE_MASK, calculateMinimumAlpha4);
                    this.LJFF = true;
                    return;
                }
                if (calculateMinimumAlpha != -1) {
                    alphaComponent = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha);
                } else {
                    alphaComponent = ColorUtils.setAlphaComponent(ViewCompat.MEASURED_STATE_MASK, calculateMinimumAlpha3);
                }
                this.LJII = alphaComponent;
                if (calculateMinimumAlpha2 != -1) {
                    alphaComponent2 = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha2);
                } else {
                    alphaComponent2 = ColorUtils.setAlphaComponent(ViewCompat.MEASURED_STATE_MASK, calculateMinimumAlpha4);
                }
                this.LJI = alphaComponent2;
                this.LJFF = true;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(getClass().getSimpleName());
            sb.append(" [RGB: #");
            sb.append(Integer.toHexString(getRgb()));
            sb.append(LoggerUtil.M_RIGHT_TAG);
            sb.append(" [HSL: ");
            sb.append(Arrays.toString(getHsl()));
            sb.append(LoggerUtil.M_RIGHT_TAG);
            sb.append(" [Population: ");
            sb.append(this.f20272LJ);
            sb.append(LoggerUtil.M_RIGHT_TAG);
            sb.append(" [Title Text: #");
            LIZ();
            sb.append(Integer.toHexString(this.LJI));
            sb.append(LoggerUtil.M_RIGHT_TAG);
            sb.append(" [Body Text: #");
            LIZ();
            sb.append(Integer.toHexString(this.LJII));
            sb.append(LoggerUtil.M_RIGHT_TAG);
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                Swatch swatch = (Swatch) obj;
                if (this.f20272LJ == swatch.f20272LJ && this.LIZLLL == swatch.LIZLLL) {
                    return true;
                }
            }
            return false;
        }

        public Swatch(int i, int i2) {
            this.LIZ = Color.red(i);
            this.LIZIZ = Color.green(i);
            this.LIZJ = Color.blue(i);
            this.LIZLLL = i;
            this.f20272LJ = i2;
        }
    }

    public final Swatch getDominantSwatch() {
        return this.LJFF;
    }

    public final Swatch getDarkMutedSwatch() {
        return getSwatchForTarget(Target.LJFF);
    }

    public final Swatch getDarkVibrantSwatch() {
        return getSwatchForTarget(Target.LIZJ);
    }

    public final Swatch getLightMutedSwatch() {
        return getSwatchForTarget(Target.LIZLLL);
    }

    public final Swatch getMutedSwatch() {
        return getSwatchForTarget(Target.f20273LJ);
    }

    public final Swatch getVibrantSwatch() {
        return getSwatchForTarget(Target.LIZIZ);
    }

    static {
        Covode.recordClassIndex(1585);
    }

    private Swatch LIZIZ() {
        int size = this.LIZ.size();
        int i = Integer.MIN_VALUE;
        Swatch swatch = null;
        for (int i2 = 0; i2 < size; i2++) {
            Swatch swatch2 = this.LIZ.get(i2);
            if (swatch2.getPopulation() > i) {
                i = swatch2.getPopulation();
                swatch = swatch2;
            }
        }
        return swatch;
    }

    /* loaded from: classes18.dex */
    public static final class Builder {
        public final List<Swatch> LIZ;
        public final Bitmap LIZIZ;
        public final List<Target> LIZJ = new ArrayList();
        public int LIZLLL = 16;

        /* renamed from: LJ */
        public int f20271LJ = 12544;
        public int LJFF = -1;
        public final List<AbstractC0347a> LJI = new ArrayList();
        public Rect LJII;

        static {
            Covode.recordClassIndex(1587);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.palette.graphics.Palette generate() {
            /*
                Method dump skipped, instructions count: 234
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.palette.graphics.Palette.Builder.generate():androidx.palette.graphics.Palette");
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [androidx.palette.graphics.Palette$Builder$1] */
        public final AsyncTask<Bitmap, Void, Palette> LIZ(final AbstractC0348b abstractC0348b) {
            return new AsyncTask<Bitmap, Void, Palette>() { // from class: androidx.palette.graphics.Palette.Builder.1
                static {
                    Covode.recordClassIndex(1588);
                }

                private Palette LIZ() {
                    try {
                        return Builder.this.generate();
                    } catch (Exception unused) {
                        return null;
                    }
                }

                @Override // android.os.AsyncTask
                public final /* synthetic */ Palette doInBackground(Bitmap[] bitmapArr) {
                    return LIZ();
                }

                @Override // android.os.AsyncTask
                public final /* synthetic */ void onPostExecute(Palette palette) {
                    abstractC0348b.LIZ(palette);
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.LIZIZ);
        }

        private int[] LIZ(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.LJII;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.LJII.height();
            int[] iArr2 = new int[width2 * height2];
            for (int i = 0; i < height2; i++) {
                System.arraycopy(iArr, ((this.LJII.top + i) * width) + this.LJII.left, iArr2, i * width2, width2);
            }
            return iArr2;
        }

        public Builder(Bitmap bitmap) {
            if (bitmap != null && !bitmap.isRecycled()) {
                this.LJI.add(Palette.LIZIZ);
                this.LIZIZ = bitmap;
                this.LIZ = null;
                this.LIZJ.add(Target.LIZ);
                this.LIZJ.add(Target.LIZIZ);
                this.LIZJ.add(Target.LIZJ);
                this.LIZJ.add(Target.LIZLLL);
                this.LIZJ.add(Target.f20273LJ);
                this.LIZJ.add(Target.LJFF);
                return;
            }
            throw new IllegalArgumentException("Bitmap is not valid");
        }
    }

    public final void LIZ() {
        int i;
        float f;
        float f2;
        float f3;
        int size = this.LIZJ.size();
        char c = 0;
        int i2 = 0;
        while (i2 < size) {
            Target target = this.LIZJ.get(i2);
            int length = target.LJIIIIZZ.length;
            float f4 = 0.0f;
            float f5 = 0.0f;
            for (int i3 = 0; i3 < length; i3++) {
                float f6 = target.LJIIIIZZ[i3];
                if (f6 > 0.0f) {
                    f5 += f6;
                }
            }
            if (f5 != 0.0f) {
                int length2 = target.LJIIIIZZ.length;
                for (int i4 = 0; i4 < length2; i4++) {
                    if (target.LJIIIIZZ[i4] > 0.0f) {
                        float[] fArr = target.LJIIIIZZ;
                        fArr[i4] = fArr[i4] / f5;
                    }
                }
            }
            Map<Target, Swatch> map = this.LIZLLL;
            Swatch swatch = null;
            int size2 = this.LIZ.size();
            int i5 = 0;
            float f7 = 0.0f;
            while (i5 < size2) {
                Swatch swatch2 = this.LIZ.get(i5);
                float[] hsl = swatch2.getHsl();
                if (hsl[1] >= target.LJI[c] && hsl[1] <= target.LJI[2] && hsl[2] >= target.LJII[c] && hsl[2] <= target.LJII[2] && !this.f20270LJ.get(swatch2.getRgb())) {
                    float[] hsl2 = swatch2.getHsl();
                    Swatch swatch3 = this.LJFF;
                    if (swatch3 != null) {
                        i = swatch3.getPopulation();
                    } else {
                        i = 1;
                    }
                    if (target.LIZ() > f4) {
                        f = (1.0f - Math.abs(hsl2[1] - target.LJI[1])) * target.LIZ();
                    } else {
                        f = 0.0f;
                    }
                    if (target.LIZIZ() > f4) {
                        f2 = target.LIZIZ() * (1.0f - Math.abs(hsl2[2] - target.LJII[1]));
                    } else {
                        f2 = 0.0f;
                    }
                    if (target.LIZJ() > 0.0f) {
                        f3 = target.LIZJ() * (swatch2.getPopulation() / i);
                    } else {
                        f3 = 0.0f;
                    }
                    float f8 = f + f2 + f3;
                    if (swatch == null || f8 > f7) {
                        f7 = f8;
                        swatch = swatch2;
                    }
                }
                i5++;
                c = 0;
                f4 = 0.0f;
            }
            if (swatch != null && target.LJIIIZ) {
                this.f20270LJ.append(swatch.getRgb(), true);
            }
            map.put(target, swatch);
            i2++;
            c = 0;
        }
        this.f20270LJ.clear();
    }

    public static Builder from(Bitmap bitmap) {
        return new Builder(bitmap);
    }

    public final Swatch getSwatchForTarget(Target target) {
        return this.LIZLLL.get(target);
    }

    public Palette(List<Swatch> list, List<Target> list2) {
        this.LIZ = list;
        this.LIZJ = list2;
    }
}
