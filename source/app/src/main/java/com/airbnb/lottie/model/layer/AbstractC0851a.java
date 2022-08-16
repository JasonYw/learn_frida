package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.core.view.MotionEventCompat;
import com.airbnb.lottie.C0810L;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.C0848h;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.p047a.p048a.AbstractC0827c;
import com.airbnb.lottie.p047a.p049b.a$a;
import com.airbnb.lottie.value.LottieValueCallback;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p002O.C0002O;
import p003X.AbstractC145179eiV;
import p003X.AbstractC145196eim;
import p003X.AbstractC145291ekJ;
import p003X.C145174eiQ;
import p003X.C145219ej9;
import p003X.C145228ejI;
import p003X.C145273ek1;
import p003X.C145279ek7;
import p003X.C145287ekF;
import p003X.C145328eku;

/* renamed from: com.airbnb.lottie.model.layer.a */
/* loaded from: classes19.dex */
public abstract class AbstractC0851a implements AbstractC145291ekJ, a$a, AbstractC145196eim {
    public final LottieDrawable LIZIZ;
    public final Layer LIZJ;
    public C145174eiQ LIZLLL;

    /* renamed from: LJ */
    public AbstractC0851a f21091LJ;
    public AbstractC0851a LJFF;
    public final C145228ejI LJI;
    public final Paint LJIIIZ;
    public final Paint LJIIJ;
    public final Paint LJIIJJI;
    public final Paint LJIIL;
    public final Paint LJIILIIL;
    public final String LJIJ;
    public C145219ej9 LJIJI;
    public List<AbstractC0851a> LJIJJ;
    public final Path LJII = new Path();
    public final Matrix LJIIIIZZ = new Matrix();
    public final RectF LJIILJJIL = new RectF();
    public final RectF LJIILL = new RectF();
    public final RectF LJIILLIIL = new RectF();
    public final RectF LJIIZILJ = new RectF();
    public final Matrix LIZ = new Matrix();
    public final List<AbstractC145179eiV<?, ?>> LJIJJLI = new ArrayList();
    public boolean LJIL = true;

    static {
        Covode.recordClassIndex(4130);
    }

    @Override // com.airbnb.lottie.p047a.p048a.AbstractC0827c
    public final void LIZ(List<AbstractC0827c> list, List<AbstractC0827c> list2) {
    }

    public abstract void LIZIZ(Canvas canvas, Matrix matrix, int i);

    public void LIZIZ(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
    }

    @Override // com.airbnb.lottie.p047a.p049b.a$a
    public final void LIZ() {
        m20541LJ();
    }

    public final void LIZ(boolean z) {
        if (z != this.LJIL) {
            this.LJIL = z;
            m20541LJ();
        }
    }

    /* renamed from: LJ */
    private void m20541LJ() {
        this.LIZIZ.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p047a.p048a.AbstractC0827c
    public final String LIZIZ() {
        return this.LIZJ.LIZJ;
    }

    public final boolean LIZJ() {
        if (this.f21091LJ != null) {
            return true;
        }
        return false;
    }

    public final boolean LIZLLL() {
        C145219ej9 c145219ej9 = this.LJIJI;
        if (c145219ej9 != null && !c145219ej9.LIZ.isEmpty()) {
            return true;
        }
        return false;
    }

    private void LJFF() {
        if (this.LJIJJ != null) {
            return;
        }
        if (this.LJFF == null) {
            this.LJIJJ = Collections.emptyList();
            return;
        }
        this.LJIJJ = new ArrayList();
        for (AbstractC0851a abstractC0851a = this.LJFF; abstractC0851a != null; abstractC0851a = abstractC0851a.LJFF) {
            this.LJIJJ.add(abstractC0851a);
        }
    }

    public final void LIZ(AbstractC145179eiV<?, ?> abstractC145179eiV) {
        if (abstractC145179eiV == null) {
            return;
        }
        this.LJIJJLI.add(abstractC145179eiV);
    }

    public final void LIZIZ(AbstractC145179eiV<?, ?> abstractC145179eiV) {
        this.LJIJJLI.remove(abstractC145179eiV);
    }

    private void LIZIZ(float f) {
        this.LIZIZ.getComposition().getPerformanceTracker().recordRenderTime(this.LIZJ.LIZJ, f);
    }

    private void LIZ(Canvas canvas) {
        C0810L.beginSection("Layer#clearLayer");
        canvas.drawRect(this.LJIILJJIL.left - 1.0f, this.LJIILJJIL.top - 1.0f, this.LJIILJJIL.right + 1.0f, this.LJIILJJIL.bottom + 1.0f, this.LJIILIIL);
        C0810L.endSection("Layer#clearLayer");
    }

    public void LIZ(float f) {
        C145174eiQ c145174eiQ;
        C145228ejI c145228ejI = this.LJI;
        c145228ejI.LIZ.LIZ(f);
        c145228ejI.LIZIZ.LIZ(f);
        c145228ejI.LIZJ.LIZ(f);
        c145228ejI.LIZLLL.LIZ(f);
        c145228ejI.f19300LJ.LIZ(f);
        if (c145228ejI.LJFF != null) {
            c145228ejI.LJFF.LIZ(f);
        }
        if (c145228ejI.LJI != null) {
            c145228ejI.LJI.LIZ(f);
        }
        if (this.LJIJI != null) {
            for (int i = 0; i < this.LJIJI.LIZ.size(); i++) {
                this.LJIJI.LIZ.get(i).LIZ(f);
            }
        }
        if (this.LIZJ.LJIIL != 0.0f) {
            f /= this.LIZJ.LJIIL;
        }
        if (C145328eku.LIZ && (c145174eiQ = this.LIZLLL) != null) {
            c145174eiQ.LIZ(f / this.LIZJ.LJIIL);
        }
        AbstractC0851a abstractC0851a = this.f21091LJ;
        if (abstractC0851a != null) {
            this.f21091LJ.LIZ(abstractC0851a.LIZJ.LJIIL * f);
        }
        for (int i2 = 0; i2 < this.LJIJJLI.size(); i2++) {
            this.LJIJJLI.get(i2).LIZ(f);
        }
    }

    public <T> void LIZ(T t, LottieValueCallback<T> lottieValueCallback) {
        this.LJI.LIZ(t, lottieValueCallback);
    }

    private void LIZJ(RectF rectF, Matrix matrix) {
        if (!LIZJ() || this.LIZJ.LJIJI == Layer.MatteType.Invert) {
            return;
        }
        if (C145328eku.LIZ) {
            this.LJIILLIIL.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f21091LJ.LIZIZ(this.LJIILLIIL, matrix);
            if (!rectF.intersect(this.LJIILLIIL)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            return;
        }
        this.f21091LJ.LIZ(this.LJIILLIIL, matrix);
        rectF.set(Math.max(rectF.left, this.LJIILLIIL.left), Math.max(rectF.top, this.LJIILLIIL.top), Math.min(rectF.right, this.LJIILLIIL.right), Math.min(rectF.bottom, this.LJIILLIIL.bottom));
    }

    @Override // p003X.AbstractC145291ekJ
    public void LIZ(RectF rectF, Matrix matrix) {
        if (C145328eku.LIZ) {
            this.LJIILJJIL.set(0.0f, 0.0f, 0.0f, 0.0f);
            LJFF();
        }
        this.LIZ.set(matrix);
        this.LIZ.preConcat(this.LJI.LIZ());
    }

    public void LIZIZ(RectF rectF, Matrix matrix) {
        this.LJIILJJIL.set(0.0f, 0.0f, 0.0f, 0.0f);
        LJFF();
        this.LIZ.set(matrix);
        List<AbstractC0851a> list = this.LJIJJ;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.LIZ.preConcat(this.LJIJJ.get(size).LJI.LIZ());
            }
        } else {
            AbstractC0851a abstractC0851a = this.LJFF;
            if (abstractC0851a != null) {
                this.LIZ.preConcat(abstractC0851a.LJI.LIZ());
            }
        }
        this.LIZ.preConcat(this.LJI.LIZ());
    }

    public AbstractC0851a(LottieDrawable lottieDrawable, Layer layer) {
        boolean z = true;
        if (C145328eku.LIZ) {
            this.LJIIIZ = new C145287ekF(1);
            this.LJIIJ = new C145287ekF(1, PorterDuff.Mode.DST_IN);
            this.LJIIJJI = new C145287ekF(1, PorterDuff.Mode.DST_OUT);
            this.LJIIL = new C145287ekF(1);
            this.LJIILIIL = new C145287ekF(PorterDuff.Mode.CLEAR);
        } else {
            this.LJIIIZ = new Paint(1);
            this.LJIIJ = new Paint(1);
            this.LJIIJJI = new Paint(1);
            this.LJIIL = new Paint(1);
            this.LJIILIIL = new Paint();
            this.LJIILIIL.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            this.LJIIJ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.LJIIJJI.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        this.LIZIZ = lottieDrawable;
        this.LIZJ = layer;
        new StringBuilder();
        this.LJIJ = C0002O.m25086C(layer.LIZJ, "#draw");
        if (layer.LJIJI == Layer.MatteType.Invert) {
            this.LJIIL.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            this.LJIIL.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        this.LJI = layer.LJIIIIZZ.LIZ();
        this.LJI.LIZ((a$a) this);
        if (layer.LJII != null && !layer.LJII.isEmpty()) {
            this.LJIJI = new C145219ej9(layer.LJII);
            for (AbstractC145179eiV<C0848h, Path> abstractC145179eiV : this.LJIJI.LIZ) {
                abstractC145179eiV.LIZ(this);
            }
            for (AbstractC145179eiV<Integer, Integer> abstractC145179eiV2 : this.LJIJI.LIZIZ) {
                LIZ(abstractC145179eiV2);
                abstractC145179eiV2.LIZ(this);
            }
        }
        if (!this.LIZJ.LJIJ.isEmpty()) {
            this.LIZLLL = new C145174eiQ(this.LIZJ.LJIJ);
            C145174eiQ c145174eiQ = this.LIZLLL;
            c145174eiQ.LIZIZ = true;
            c145174eiQ.LIZ(new C145279ek7(this));
            LIZ(this.LIZLLL.LJFF().floatValue() != 1.0f ? false : z);
            LIZ(this.LIZLLL);
            return;
        }
        LIZ(true);
    }

    private void LIZ(Canvas canvas, Matrix matrix, Mask.MaskMode maskMode) {
        Paint paint;
        if (C145273ek1.LIZIZ[maskMode.ordinal()] != 1) {
            paint = this.LJIIJ;
        } else {
            paint = this.LJIIJJI;
        }
        int size = this.LJIJI.LIZJ.size();
        for (int i = 0; i < size; i++) {
            if (this.LJIJI.LIZJ.get(i).LIZ == maskMode) {
                C0810L.beginSection("Layer#drawMask");
                C0810L.beginSection("Layer#saveLayer");
                LIZ(canvas, this.LJIILJJIL, paint, false);
                C0810L.endSection("Layer#saveLayer");
                LIZ(canvas);
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.LJIJI.LIZJ.get(i2).LIZ == maskMode) {
                        this.LJII.set(this.LJIJI.LIZ.get(i2).LJFF());
                        this.LJII.transform(matrix);
                        int alpha = this.LJIIIZ.getAlpha();
                        this.LJIIIZ.setAlpha((int) (this.LJIJI.LIZIZ.get(i2).LJFF().intValue() * 2.55f));
                        canvas.drawPath(this.LJII, this.LJIIIZ);
                        this.LJIIIZ.setAlpha(alpha);
                    }
                }
                C0810L.beginSection("Layer#restoreLayer");
                canvas.restore();
                C0810L.endSection("Layer#restoreLayer");
                C0810L.endSection("Layer#drawMask");
                return;
            }
        }
    }

    @Override // p003X.AbstractC145291ekJ
    public final void LIZ(Canvas canvas, Matrix matrix, int i) {
        C0810L.beginSection(this.LJIJ);
        if (!this.LJIL) {
            C0810L.endSection(this.LJIJ);
            return;
        }
        LJFF();
        C0810L.beginSection("Layer#parentMatrix");
        this.LJIIIIZZ.reset();
        this.LJIIIIZZ.set(matrix);
        int i2 = 1;
        for (int size = this.LJIJJ.size() - 1; size >= 0; size--) {
            this.LJIIIIZZ.preConcat(this.LJIJJ.get(size).LJI.LIZ());
        }
        C0810L.endSection("Layer#parentMatrix");
        int intValue = (int) ((((i / 255.0f) * this.LJI.f19300LJ.LJFF().intValue()) / 100.0f) * 255.0f);
        if (!LIZJ() && !LIZLLL()) {
            this.LJIIIIZZ.preConcat(this.LJI.LIZ());
            C0810L.beginSection("Layer#drawLayer");
            LIZIZ(canvas, this.LJIIIIZZ, intValue);
            C0810L.endSection("Layer#drawLayer");
            LIZIZ(C0810L.endSection(this.LJIJ));
            return;
        }
        C0810L.beginSection("Layer#computeBounds");
        this.LJIILJJIL.set(0.0f, 0.0f, 0.0f, 0.0f);
        LIZ(this.LJIILJJIL, this.LJIIIIZZ);
        if (C145328eku.LIZ) {
            LIZJ(this.LJIILJJIL, matrix);
        } else {
            LIZJ(this.LJIILJJIL, this.LJIIIIZZ);
        }
        this.LJIIIIZZ.preConcat(this.LJI.LIZ());
        RectF rectF = this.LJIILJJIL;
        Matrix matrix2 = this.LJIIIIZZ;
        this.LJIILL.set(0.0f, 0.0f, 0.0f, 0.0f);
        boolean z = false;
        if (LIZLLL()) {
            int size2 = this.LJIJI.LIZJ.size();
            int i3 = 0;
            while (true) {
                if (i3 < size2) {
                    this.LJII.set(this.LJIJI.LIZ.get(i3).LJFF());
                    this.LJII.transform(matrix2);
                    int i4 = C145273ek1.LIZIZ[this.LJIJI.LIZJ.get(i3).LIZ.ordinal()];
                    if (i4 == i2 || i4 == 2) {
                        break;
                    }
                    this.LJII.computeBounds(this.LJIIZILJ, z);
                    if (i3 == 0) {
                        this.LJIILL.set(this.LJIIZILJ);
                    } else {
                        RectF rectF2 = this.LJIILL;
                        rectF2.set(Math.min(rectF2.left, this.LJIIZILJ.left), Math.min(this.LJIILL.top, this.LJIIZILJ.top), Math.max(this.LJIILL.right, this.LJIIZILJ.right), Math.max(this.LJIILL.bottom, this.LJIIZILJ.bottom));
                    }
                    i3++;
                    i2 = 1;
                    z = false;
                } else if (C145328eku.LIZ) {
                    if (!rectF.intersect(this.LJIILL)) {
                        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                } else {
                    rectF.set(Math.max(rectF.left, this.LJIILL.left), Math.max(rectF.top, this.LJIILL.top), Math.min(rectF.right, this.LJIILL.right), Math.min(rectF.bottom, this.LJIILL.bottom));
                }
            }
        }
        if (C145328eku.LIZ) {
            if (!this.LJIILJJIL.intersect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight())) {
                this.LJIILJJIL.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        } else {
            this.LJIILJJIL.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        C0810L.endSection("Layer#computeBounds");
        if (C145328eku.LIZ) {
            if (this.LJIILJJIL.width() >= 1.0f && this.LJIILJJIL.height() >= 1.0f) {
                this.LJIIIZ.setAlpha(MotionEventCompat.ACTION_MASK);
            } else {
                LIZIZ(C0810L.endSection(this.LJIJ));
                return;
            }
        }
        C0810L.beginSection("Layer#saveLayer");
        LIZ(canvas, this.LJIILJJIL, this.LJIIIZ, true);
        C0810L.endSection("Layer#saveLayer");
        LIZ(canvas);
        C0810L.beginSection("Layer#drawLayer");
        LIZIZ(canvas, this.LJIIIIZZ, intValue);
        C0810L.endSection("Layer#drawLayer");
        if (LIZLLL()) {
            Matrix matrix3 = this.LJIIIIZZ;
            LIZ(canvas, matrix3, Mask.MaskMode.MaskModeAdd);
            LIZ(canvas, matrix3, Mask.MaskMode.MaskModeIntersect);
            LIZ(canvas, matrix3, Mask.MaskMode.MaskModeSubtract);
        }
        if (LIZJ()) {
            C0810L.beginSection("Layer#drawMatte");
            C0810L.beginSection("Layer#saveLayer");
            LIZ(canvas, this.LJIILJJIL, this.LJIIL, false);
            C0810L.endSection("Layer#saveLayer");
            LIZ(canvas);
            this.f21091LJ.LIZ(canvas, matrix, intValue);
            C0810L.beginSection("Layer#restoreLayer");
            canvas.restore();
            C0810L.endSection("Layer#restoreLayer");
            C0810L.endSection("Layer#drawMatte");
        }
        C0810L.beginSection("Layer#restoreLayer");
        canvas.restore();
        C0810L.endSection("Layer#restoreLayer");
        LIZIZ(C0810L.endSection(this.LJIJ));
    }

    public static void LIZ(Canvas canvas, RectF rectF, Paint paint, boolean z) {
        int i;
        if (Build.VERSION.SDK_INT < 23) {
            if (z) {
                i = 31;
            } else {
                i = 19;
            }
            canvas.saveLayer(rectF, paint, i);
            return;
        }
        canvas.saveLayer(rectF, paint);
    }

    @Override // p003X.AbstractC145196eim
    public final void LIZ(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        if (!keyPath.matches(LIZIZ(), i)) {
            return;
        }
        if (!"__container".equals(LIZIZ())) {
            keyPath2 = keyPath2.addKey(LIZIZ());
            if (keyPath.fullyResolvesTo(LIZIZ(), i)) {
                list.add(keyPath2.resolve(this));
            }
        }
        if (keyPath.propagateToChildren(LIZIZ(), i)) {
            LIZIZ(keyPath, i + keyPath.incrementDepthBy(LIZIZ(), i), list, keyPath2);
        }
    }
}
