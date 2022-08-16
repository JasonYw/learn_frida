package android.support.wearable.view;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.wearable.view.C0161j;
import android.util.Property;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import p003X.C4FW;

/* renamed from: android.support.wearable.view.j */
/* loaded from: classes22.dex */
public final class C0161j extends Drawable {
    public static final Property<C0161j, Integer> LIZLLL = new Property<C0161j, Integer>(Integer.class, "level") { // from class: X.4YH
        static {
            Covode.recordClassIndex(350);
        }

        @Override // android.util.Property
        public final /* synthetic */ Integer get(C0161j c0161j) {
            return Integer.valueOf(c0161j.getLevel());
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(C0161j c0161j, Integer num) {
            C0161j c0161j2 = c0161j;
            c0161j2.setLevel(num.intValue());
            c0161j2.invalidateSelf();
        }
    };

    /* renamed from: LJ */
    public static final TimeInterpolator f20213LJ = C4FW.LIZ;
    public float LIZIZ;
    public int LIZJ;
    public final RectF LJFF = new RectF();
    public final Paint LJI = new Paint();
    public final ObjectAnimator LIZ = ObjectAnimator.ofInt(this, LIZLLL, 0, 10000);

    public static float LIZ(float f, float f2, float f3) {
        if (f != f2) {
            return (f3 - f) / (f2 - f);
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    static {
        Covode.recordClassIndex(349);
    }

    public C0161j() {
        this.LJI.setAntiAlias(true);
        this.LJI.setStyle(Paint.Style.STROKE);
        this.LIZ.setRepeatCount(-1);
        this.LIZ.setRepeatMode(1);
        this.LIZ.setDuration(6000L);
        this.LIZ.setInterpolator(new LinearInterpolator());
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        float interpolation;
        float f;
        canvas.save();
        this.LJFF.set(getBounds());
        RectF rectF = this.LJFF;
        float f2 = this.LIZIZ;
        rectF.inset(f2 / 2.0f, f2 / 2.0f);
        this.LJI.setStrokeWidth(this.LIZIZ);
        this.LJI.setColor(this.LIZJ);
        int level = getLevel();
        float f3 = (level - ((level / Constants.ASSEMBLE_PUSH_RETRY_INTERVAL) * Constants.ASSEMBLE_PUSH_RETRY_INTERVAL)) / 2000.0f;
        if (f3 < 0.5f) {
            z = true;
        } else {
            z = false;
        }
        float f4 = 54.0f * f3;
        if (z) {
            interpolation = f20213LJ.getInterpolation(LIZ(0.0f, 0.5f, f3));
        } else {
            interpolation = 1.0f - f20213LJ.getInterpolation(LIZ(0.5f, 1.0f, f3));
        }
        float max = Math.max(1.0f, interpolation * 306.0f);
        canvas.rotate(((((level * 1.0E-4f) * 2.0f) * 360.0f) - 90.0f) + f4, this.LJFF.centerX(), this.LJFF.centerY());
        RectF rectF2 = this.LJFF;
        if (z) {
            f = 0.0f;
        } else {
            f = 306.0f - max;
        }
        canvas.drawArc(rectF2, f, max, false, this.LJI);
        canvas.restore();
    }
}
