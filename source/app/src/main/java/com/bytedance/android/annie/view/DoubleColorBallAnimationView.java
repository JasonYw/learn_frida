package com.bytedance.android.annie.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C116971W2r;

/* loaded from: classes12.dex */
public class DoubleColorBallAnimationView extends View {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public Paint f25635LJ;
    public final PorterDuffXfermode LJFF;
    public float LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public long LJIIJ;
    public int LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;
    public float LJIILJJIL;
    public float LJIILL;

    static {
        Covode.recordClassIndex(11237);
    }

    private void LIZ() {
        this.LIZIZ = false;
        this.LJIIIIZZ = false;
        this.LJI = 0.0f;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        LIZ();
    }

    private Paint LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (Paint) proxy.result;
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }

    private void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        this.LJIIJ = -1L;
        if (this.LJIIJJI <= 0) {
            setProgressBarInfo(getContext().getResources().getDimensionPixelSize(2131427481));
        }
        int min = Math.min(getMeasuredHeight(), getMeasuredWidth());
        if (this.LJIIJJI > min && min > 0) {
            setProgressBarInfo(min);
        }
        if (this.f25635LJ == null) {
            this.f25635LJ = LIZIZ();
        }
        this.LJIIIIZZ = true;
    }

    public void setCycleBias(int i) {
        this.LJIIIZ = i;
    }

    public DoubleColorBallAnimationView(Context context) {
        this(context, null);
        LIZ(context);
    }

    private void LIZ(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZJ = C116971W2r.LIZ(context, 2131624354);
        this.LIZLLL = C116971W2r.LIZ(context, 2131624355);
    }

    public void setProgress(float f) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        if (!this.LJIIIIZZ) {
            LIZJ();
        }
        this.LJI = f;
        this.LIZIZ = false;
        this.LJII = false;
        postInvalidate();
    }

    public void setProgressBarInfo(int i) {
        if (i > 0) {
            this.LJIIJJI = i;
            int i2 = this.LJIIJJI;
            this.LJIIL = i2 / 2.0f;
            this.LJIILIIL = (i2 >> 1) * 0.32f;
            this.LJIILJJIL = (i2 * 0.16f) + this.LJIILIIL;
            this.LJIILL = i2 - (this.LJIILJJIL * 2.0f);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        super.setVisibility(i);
        if (i == 0) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
                LIZJ();
                this.LIZIZ = true;
                this.LJII = true;
                postInvalidate();
                return;
            }
            return;
        }
        LIZ();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        MethodCollector.m14708i(950);
        boolean z = false;
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 9).isSupported) {
            MethodCollector.m14707o(950);
            return;
        }
        super.onDraw(canvas);
        if ((this.LIZIZ || !this.LJII) && this.LJIIIIZZ) {
            if (this.LJII) {
                long nanoTime = System.nanoTime() / 1000000;
                if (this.LJIIJ < 0) {
                    this.LJIIJ = nanoTime;
                }
                this.LJI = ((float) (nanoTime - this.LJIIJ)) / 400.0f;
                int i3 = (int) this.LJI;
                if (((this.LJIIIZ + i3) & 1) == 1) {
                    z = true;
                }
                this.LJI -= i3;
            }
            float f3 = this.LJI;
            if (f3 < 0.5f) {
                f = f3 * 2.0f * f3;
            } else {
                f = ((f3 * 2.0f) * (2.0f - f3)) - 1.0f;
            }
            int i4 = this.LJIIJJI;
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, i4, i4, this.f25635LJ, 31);
            float f4 = (this.LJIILL * f) + this.LJIILJJIL;
            if (f < 0.5f) {
                f2 = f * 2.0f;
            } else {
                f2 = 2.0f - (f * 2.0f);
            }
            float f5 = this.LJIILIIL;
            float f6 = (0.25f * f2 * f5) + f5;
            Paint paint = this.f25635LJ;
            if (z) {
                i = this.LIZLLL;
            } else {
                i = this.LIZJ;
            }
            paint.setColor(i);
            canvas.drawCircle(f4, this.LJIIL, f6, this.f25635LJ);
            float f7 = this.LJIIJJI - f4;
            float f8 = this.LJIILIIL;
            float f9 = f8 - ((f2 * 0.375f) * f8);
            Paint paint2 = this.f25635LJ;
            if (z) {
                i2 = this.LIZJ;
            } else {
                i2 = this.LIZLLL;
            }
            paint2.setColor(i2);
            this.f25635LJ.setXfermode(this.LJFF);
            canvas.drawCircle(f7, this.LJIIL, f9, this.f25635LJ);
            this.f25635LJ.setXfermode(null);
            canvas.restoreToCount(saveLayer);
            postInvalidateDelayed(17L);
            MethodCollector.m14707o(950);
            return;
        }
        MethodCollector.m14707o(950);
    }

    public DoubleColorBallAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        LIZ(context);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        MethodCollector.m14708i(949);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 7).isSupported) {
            MethodCollector.m14707o(949);
            return;
        }
        super.onMeasure(i, i2);
        int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (this.LJIIJJI > min && min > 0) {
            setProgressBarInfo(min);
        }
        MethodCollector.m14707o(949);
    }

    public DoubleColorBallAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(948);
        this.LJFF = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        this.LJII = false;
        this.LJIIIIZZ = false;
        this.LJIIIZ = 0;
        this.LIZIZ = false;
        this.LJIIJ = -1L;
        this.LJIIJJI = -1;
        LIZ(context);
        MethodCollector.m14707o(948);
    }
}
