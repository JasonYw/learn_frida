package com.bytedance.android.live.effect.soundeffect;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public final class HollowCircleProgressView extends View {
    public static ChangeQuickRedirect LIZ;
    public Paint LIZIZ;
    public Paint LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public int f26228LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public final RectF LJIIL;

    static {
        Covode.recordClassIndex(24584);
    }

    public HollowCircleProgressView(Context context) {
        this(context, null, 2, null);
    }

    public final int getHeight$liveeffect_cnDouyinRelease() {
        return this.f26228LJ;
    }

    public final int getWidth$liveeffect_cnDouyinRelease() {
        return this.LIZLLL;
    }

    public final void setHeight$liveeffect_cnDouyinRelease(int i) {
        this.f26228LJ = i;
    }

    public final void setMaxProgress(int i) {
        this.LJII = i;
    }

    public final void setStartAngle(int i) {
        this.LJIIIIZZ = i;
    }

    public final void setWidth$liveeffect_cnDouyinRelease(int i) {
        this.LIZLLL = i;
    }

    public final void setProgress(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 6).isSupported) {
            return;
        }
        this.LJI = i;
        invalidate();
    }

    public final void setBgCircleColor(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        Paint paint = this.LIZIZ;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        paint.setColor(i);
    }

    public final void setCircleWidth(float f) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        Paint paint = this.LIZJ;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        paint.setStrokeWidth(f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        MethodCollector.m14708i(1681);
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 3).isSupported) {
            MethodCollector.m14707o(1681);
            return;
        }
        C106862S5w.LIZ(canvas);
        super.onDraw(canvas);
        int i = Build.VERSION.SDK_INT;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, this.LIZLLL, this.f26228LJ, null);
        if (!PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 4).isSupported) {
            float f = this.LJIIIZ;
            Paint paint = this.LIZIZ;
            if (paint == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            canvas.drawCircle(f, f, f, paint);
        }
        if (!PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 5).isSupported) {
            float f2 = this.LJIIJ;
            if (f2 > 0.0f) {
                RectF rectF = this.LJIIL;
                int i2 = this.LIZLLL;
                rectF.set((i2 / 2) - f2, (this.f26228LJ / 2) - f2, (i2 / 2) + f2, (i2 / 2) + f2);
            } else {
                RectF rectF2 = this.LJIIL;
                float f3 = this.LJIIIZ;
                rectF2.set(f3, f3, this.LIZLLL - f3, this.f26228LJ - f3);
            }
            RectF rectF3 = this.LJIIL;
            float f4 = this.LJIIIIZZ - 90;
            float f5 = ((this.LJI * 1.0f) / this.LJII) * 360.0f;
            Paint paint2 = this.LIZJ;
            if (paint2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            canvas.drawArc(rectF3, f4, f5, false, paint2);
        }
        canvas.restoreToCount(saveLayer);
        MethodCollector.m14707o(1681);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        MethodCollector.m14708i(1680);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 2).isSupported) {
            MethodCollector.m14707o(1680);
            return;
        }
        super.onMeasure(i, i2);
        this.LIZLLL = View.MeasureSpec.getSize(i);
        this.f26228LJ = View.MeasureSpec.getSize(i2);
        this.LJIIIZ = this.LIZLLL / 2.0f;
        if (this.LJIIJ == -1.0f) {
            this.LJIIJ = (this.LJIIIZ * 3.0f) / 7.0f;
        }
        if (this.LJIIJJI == -1.0f) {
            this.LJIIJJI = (this.LJIIIZ * 2.0f) / 7.0f;
            setCircleWidth(this.LJIIJJI);
        }
        MethodCollector.m14707o(1680);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HollowCircleProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1682);
        this.LJII = 100;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130774879, 2130774883, 2130774884, 2130774885, 2130774886});
            this.LJIIJ = obtainStyledAttributes.getDimension(1, -1.0f);
            this.LJIIJJI = obtainStyledAttributes.getDimension(2, -1.0f);
            this.LJFF = obtainStyledAttributes.getColor(0, 0);
            this.LJI = obtainStyledAttributes.getInteger(4, 0);
            this.LJII = obtainStyledAttributes.getInteger(3, 100);
            obtainStyledAttributes.recycle();
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            this.LIZIZ = new Paint();
            Paint paint = this.LIZIZ;
            if (paint == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            paint.setColor(this.LJFF);
            Paint paint2 = this.LIZIZ;
            if (paint2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            paint2.setAntiAlias(true);
            Paint paint3 = this.LIZIZ;
            if (paint3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            paint3.setStyle(Paint.Style.FILL);
            this.LIZJ = new Paint();
            Paint paint4 = this.LIZJ;
            if (paint4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            paint4.setColor(ViewCompat.MEASURED_STATE_MASK);
            Paint paint5 = this.LIZJ;
            if (paint5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            paint5.setStyle(Paint.Style.STROKE);
            Paint paint6 = this.LIZJ;
            if (paint6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            paint6.setStrokeWidth(this.LJIIJJI);
            Paint paint7 = this.LIZJ;
            if (paint7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            paint7.setStrokeCap(Paint.Cap.ROUND);
            Paint paint8 = this.LIZJ;
            if (paint8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        this.LJIIL = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        MethodCollector.m14707o(1682);
    }

    public /* synthetic */ HollowCircleProgressView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
