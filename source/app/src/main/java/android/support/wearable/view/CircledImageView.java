package android.support.wearable.view;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p003X.C472884mo;

/* loaded from: classes22.dex */
public class CircledImageView extends View {
    public static final ArgbEvaluator LIZLLL = new ArgbEvaluator();
    public final RectF LIZ;
    public final Rect LIZIZ;
    public int LIZJ;

    /* renamed from: LJ */
    public final Paint f20208LJ;
    public final C472884mo LJFF;
    public ColorStateList LJI;
    public Drawable LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public int LJIILIIL;
    public Paint.Cap LJIILJJIL;
    public float LJIILL;
    public boolean LJIILLIIL;
    public final float LJIIZILJ;
    public float LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public final C0161j LJJ;
    public long LJJI;
    public float LJJIFFI;
    public float LJJII;
    public Integer LJJIII;
    public Integer LJJIIJ;
    public final Drawable.Callback LJJIIJZLJL;
    public final ValueAnimator.AnimatorUpdateListener LJJIIZ;
    public ValueAnimator LJJIIZI;

    @Override // android.view.View
    public boolean onSetAlpha(int i) {
        return true;
    }

    public ColorStateList getCircleColorStateList() {
        return this.LJI;
    }

    public float getCircleRadiusPercent() {
        return this.LJIIIZ;
    }

    public float getCircleRadiusPressedPercent() {
        return this.LJIIJJI;
    }

    public long getColorChangeAnimationDuration() {
        return this.LJJI;
    }

    public Drawable getImageDrawable() {
        return this.LJII;
    }

    public float getInitialCircleRadius() {
        return this.LJIIZILJ;
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        LIZ();
    }

    public int getDefaultCircleColor() {
        return this.LJI.getDefaultColor();
    }

    static {
        Covode.recordClassIndex(315);
    }

    public float getCircleRadius() {
        float f = this.LJIIIIZZ;
        if (f <= 0.0f && this.LJIIIZ > 0.0f) {
            f = Math.max(getMeasuredHeight(), getMeasuredWidth()) * this.LJIIIZ;
        }
        return f - this.LJIIL;
    }

    public float getCircleRadiusPressed() {
        float f = this.LJIIJ;
        if (f <= 0.0f && this.LJIIJJI > 0.0f) {
            f = Math.max(getMeasuredHeight(), getMeasuredWidth()) * this.LJIIJJI;
        }
        return f - this.LJIIL;
    }

    private void LIZ() {
        int colorForState = this.LJI.getColorForState(getDrawableState(), this.LJI.getDefaultColor());
        if (this.LJJI > 0) {
            ValueAnimator valueAnimator = this.LJJIIZI;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            } else {
                this.LJJIIZI = new ValueAnimator();
            }
            this.LJJIIZI.setIntValues(this.LIZJ, colorForState);
            this.LJJIIZI.setEvaluator(LIZLLL);
            this.LJJIIZI.setDuration(this.LJJI);
            this.LJJIIZI.addUpdateListener(this.LJJIIZ);
            this.LJJIIZI.start();
        } else if (colorForState != this.LIZJ) {
            this.LIZJ = colorForState;
            invalidate();
        }
    }

    public void setCircleBorderColor(int i) {
        this.LJIILIIL = i;
    }

    public void setColorChangeAnimationDuration(long j) {
        this.LJJI = j;
    }

    public CircledImageView(Context context) {
        this(context, null);
    }

    public void setCircleColor(int i) {
        setCircleColorStateList(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJIL = z;
        LIZ(this.LJIJJ);
    }

    public void setCircleBorderCap(Paint.Cap cap) {
        if (cap != this.LJIILJJIL) {
            this.LJIILJJIL = cap;
            invalidate();
        }
    }

    public void setCircleHidden(boolean z) {
        if (z != this.LJIILLIIL) {
            this.LJIILLIIL = z;
            invalidate();
        }
    }

    public void setCircleRadiusPressed(float f) {
        if (f != this.LJIIJ) {
            this.LJIIJ = f;
            invalidate();
        }
    }

    public void setImageHorizontalOffcenterPercentage(float f) {
        if (f != this.LJJII) {
            this.LJJII = f;
            invalidate();
        }
    }

    public void setImageResource(int i) {
        Drawable drawable;
        if (i == 0) {
            drawable = null;
        } else {
            drawable = getContext().getDrawable(i);
        }
        setImageDrawable(drawable);
    }

    public void setProgress(float f) {
        if (f != this.LJIJ) {
            this.LJIJ = f;
            invalidate();
        }
    }

    public void setCircleBorderWidth(float f) {
        if (f != this.LJIILL) {
            this.LJIILL = f;
            C472884mo c472884mo = this.LJFF;
            c472884mo.LJFF = f;
            c472884mo.LIZ();
            invalidate();
        }
    }

    public void setCircleColorStateList(ColorStateList colorStateList) {
        if (!Objects.equals(colorStateList, this.LJI)) {
            this.LJI = colorStateList;
            LIZ();
            invalidate();
        }
    }

    public void setCircleRadius(float f) {
        float circleRadius;
        if (f != this.LJIIIIZZ) {
            this.LJIIIIZZ = f;
            C472884mo c472884mo = this.LJFF;
            if (this.LJIJI) {
                circleRadius = getCircleRadiusPressed();
            } else {
                circleRadius = getCircleRadius();
            }
            c472884mo.LIZ(circleRadius);
            invalidate();
        }
    }

    public void setCircleRadiusPercent(float f) {
        float circleRadius;
        if (f != this.LJIIIZ) {
            this.LJIIIZ = f;
            C472884mo c472884mo = this.LJFF;
            if (this.LJIJI) {
                circleRadius = getCircleRadiusPressed();
            } else {
                circleRadius = getCircleRadius();
            }
            c472884mo.LIZ(circleRadius);
            invalidate();
        }
    }

    public void setCircleRadiusPressedPercent(float f) {
        float circleRadius;
        if (f != this.LJIIJJI) {
            this.LJIIJJI = f;
            C472884mo c472884mo = this.LJFF;
            if (this.LJIJI) {
                circleRadius = getCircleRadiusPressed();
            } else {
                circleRadius = getCircleRadius();
            }
            c472884mo.LIZ(circleRadius);
            invalidate();
        }
    }

    public void setImageCirclePercentage(float f) {
        float max = Math.max(0.0f, Math.min(1.0f, f));
        if (max != this.LJJIFFI) {
            this.LJJIFFI = max;
            invalidate();
        }
    }

    public void setImageTint(int i) {
        Integer num = this.LJJIII;
        if (num == null || i != num.intValue()) {
            this.LJJIII = Integer.valueOf(i);
            invalidate();
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        float circleRadius;
        super.setPressed(z);
        if (z != this.LJIJI) {
            this.LJIJI = z;
            C472884mo c472884mo = this.LJFF;
            if (this.LJIJI) {
                circleRadius = getCircleRadiusPressed();
            } else {
                circleRadius = getCircleRadius();
            }
            c472884mo.LIZ(circleRadius);
            invalidate();
        }
    }

    public void setShadowVisibility(float f) {
        if (f != this.LJFF.f1359LJ) {
            C472884mo c472884mo = this.LJFF;
            c472884mo.f1359LJ = f;
            c472884mo.LIZ();
            invalidate();
        }
    }

    private void LIZ(boolean z) {
        this.LJIJJ = z;
        C0161j c0161j = this.LJJ;
        if (c0161j != null) {
            if (z && this.LJIJJLI && this.LJIL) {
                if (!c0161j.LIZ.isStarted()) {
                    c0161j.LIZ.start();
                    return;
                }
                return;
            }
            this.LJJ.LIZ.cancel();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2 = this.LJII;
        if (drawable != drawable2) {
            this.LJII = drawable;
            Drawable drawable3 = this.LJII;
            if (drawable3 != null && drawable3.getConstantState() != null) {
                this.LJII = this.LJII.getConstantState().newDrawable(getResources(), getContext().getTheme()).mutate();
            }
            if (drawable != null && drawable2 != null && drawable2.getIntrinsicHeight() == drawable.getIntrinsicHeight() && drawable2.getIntrinsicWidth() == drawable.getIntrinsicWidth()) {
                this.LJII.setBounds(drawable2.getBounds());
            } else {
                requestLayout();
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float circleRadius;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        if (this.LJIJI) {
            circleRadius = getCircleRadiusPressed();
        } else {
            circleRadius = getCircleRadius();
        }
        C472884mo c472884mo = this.LJFF;
        float alpha = getAlpha();
        if (c472884mo.LIZIZ > 0.0f && c472884mo.f1359LJ > 0.0f) {
            c472884mo.LIZJ.setAlpha(Math.round(c472884mo.LIZJ.getAlpha() * alpha));
            canvas.drawCircle(c472884mo.LIZ.centerX(), c472884mo.LIZ.centerY(), c472884mo.LIZLLL, c472884mo.LIZJ);
        }
        this.LIZ.set(paddingLeft, paddingTop, getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        RectF rectF = this.LIZ;
        rectF.set(rectF.centerX() - circleRadius, this.LIZ.centerY() - circleRadius, this.LIZ.centerX() + circleRadius, this.LIZ.centerY() + circleRadius);
        if (this.LJIILL > 0.0f) {
            this.f20208LJ.setColor(this.LJIILIIL);
            Paint paint = this.f20208LJ;
            paint.setAlpha(Math.round(paint.getAlpha() * getAlpha()));
            this.f20208LJ.setStyle(Paint.Style.STROKE);
            this.f20208LJ.setStrokeWidth(this.LJIILL);
            this.f20208LJ.setStrokeCap(this.LJIILJJIL);
            if (this.LJIJJ) {
                this.LIZ.roundOut(this.LIZIZ);
                Rect rect = this.LIZIZ;
                float f = this.LJIILL;
                rect.inset((int) ((-f) / 2.0f), (int) ((-f) / 2.0f));
                this.LJJ.setBounds(this.LIZIZ);
                C0161j c0161j = this.LJJ;
                c0161j.LIZJ = this.LJIILIIL;
                c0161j.LIZIZ = this.LJIILL;
                c0161j.draw(canvas);
            } else {
                canvas.drawArc(this.LIZ, -90.0f, this.LJIJ * 360.0f, false, this.f20208LJ);
            }
        }
        if (!this.LJIILLIIL) {
            this.f20208LJ.setColor(this.LIZJ);
            Paint paint2 = this.f20208LJ;
            paint2.setAlpha(Math.round(paint2.getAlpha() * getAlpha()));
            this.f20208LJ.setStyle(Paint.Style.FILL);
            canvas.drawCircle(this.LIZ.centerX(), this.LIZ.centerY(), circleRadius, this.f20208LJ);
        }
        Drawable drawable = this.LJII;
        if (drawable != null) {
            drawable.setAlpha(Math.round(getAlpha() * 255.0f));
            Integer num = this.LJJIII;
            if (num != null) {
                this.LJII.setTint(num.intValue());
            }
            this.LJII.draw(canvas);
        }
        super.onDraw(canvas);
    }

    public CircledImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJIJJLI = z;
        LIZ(this.LJIJJ);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        float circleRadius = (getCircleRadius() + this.LJIILL + (this.LJFF.LIZIZ * this.LJFF.f1359LJ)) * 2.0f;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                size = (int) Math.min(circleRadius, size);
            } else {
                size = (int) circleRadius;
            }
        }
        if (mode2 != 1073741824) {
            if (mode2 == Integer.MIN_VALUE) {
                size2 = (int) Math.min(circleRadius, size2);
            } else {
                size2 = (int) circleRadius;
            }
        }
        Integer num = this.LJJIIJ;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue == 2) {
                    size2 = size;
                }
            } else {
                size = size2;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public CircledImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LIZIZ = new Rect();
        this.LJIILLIIL = false;
        this.LJIJ = 1.0f;
        this.LJIJI = false;
        this.LJJI = 0L;
        this.LJJIFFI = 1.0f;
        this.LJJII = 0.0f;
        this.LJJIIJZLJL = new Drawable.Callback() { // from class: android.support.wearable.view.CircledImageView.1
            static {
                Covode.recordClassIndex(316);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public final void invalidateDrawable(Drawable drawable) {
                CircledImageView.this.invalidate();
            }
        };
        this.LJJIIZ = new ValueAnimator.AnimatorUpdateListener() { // from class: android.support.wearable.view.CircledImageView.2
            static {
                Covode.recordClassIndex(317);
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (intValue != CircledImageView.this.LIZJ) {
                    CircledImageView circledImageView = CircledImageView.this;
                    circledImageView.LIZJ = intValue;
                    circledImageView.invalidate();
                }
            }
        };
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16843033, 2130772598, 2130772599, 2130772600, 2130772601, 2130772609, 2130772610, 2130772611, 2130772612, 2130772613, 2130773336, 2130773337, 2130773340, 2130774371, 2130774457});
        this.LJII = obtainStyledAttributes.getDrawable(0);
        Drawable drawable = this.LJII;
        if (drawable != null && drawable.getConstantState() != null) {
            int i2 = Build.VERSION.SDK_INT;
            this.LJII = this.LJII.getConstantState().newDrawable(context.getResources(), context.getTheme());
            this.LJII = this.LJII.mutate();
        }
        this.LJI = obtainStyledAttributes.getColorStateList(4);
        if (this.LJI == null) {
            this.LJI = ColorStateList.valueOf(17170432);
        }
        this.LJIIIIZZ = obtainStyledAttributes.getDimension(6, 0.0f);
        float f = this.LJIIIIZZ;
        this.LJIIZILJ = f;
        this.LJIIJ = obtainStyledAttributes.getDimension(8, f);
        this.LJIILIIL = obtainStyledAttributes.getColor(2, ViewCompat.MEASURED_STATE_MASK);
        this.LJIILJJIL = Paint.Cap.values()[obtainStyledAttributes.getInt(1, 0)];
        this.LJIILL = obtainStyledAttributes.getDimension(3, 0.0f);
        float f2 = this.LJIILL;
        if (f2 > 0.0f) {
            this.LJIIL += f2 / 2.0f;
        }
        float dimension = obtainStyledAttributes.getDimension(5, 0.0f);
        if (dimension > 0.0f) {
            this.LJIIL += dimension;
        }
        this.LJJIFFI = obtainStyledAttributes.getFloat(10, 0.0f);
        this.LJJII = obtainStyledAttributes.getFloat(11, 0.0f);
        if (obtainStyledAttributes.hasValue(12)) {
            this.LJJIII = Integer.valueOf(obtainStyledAttributes.getColor(12, 0));
        }
        if (obtainStyledAttributes.hasValue(14)) {
            this.LJJIIJ = Integer.valueOf(obtainStyledAttributes.getInt(14, 0));
        }
        this.LJIIIZ = obtainStyledAttributes.getFraction(7, 1, 1, 0.0f);
        this.LJIIJJI = obtainStyledAttributes.getFraction(9, 1, 1, this.LJIIIZ);
        float dimension2 = obtainStyledAttributes.getDimension(13, 0.0f);
        obtainStyledAttributes.recycle();
        this.LIZ = new RectF();
        this.f20208LJ = new Paint();
        this.f20208LJ.setAntiAlias(true);
        this.LJFF = new C472884mo(dimension2, 0.0f, getCircleRadius(), this.LJIILL);
        this.LJJ = new C0161j();
        this.LJJ.setCallback(this.LJJIIJZLJL);
        setWillNotDraw(false);
        LIZ();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i != i3 || i2 != i4) {
            this.LJFF.LIZ(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        }
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        if (i != getPaddingLeft() || i2 != getPaddingTop() || i3 != getPaddingRight() || i4 != getPaddingBottom()) {
            this.LJFF.LIZ(i, i2, getWidth() - i3, getHeight() - i4);
        }
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        Drawable drawable = this.LJII;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.LJII.getIntrinsicHeight();
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f3 = this.LJJIFFI;
            if (f3 <= 0.0f) {
                f3 = 1.0f;
            }
            float f4 = intrinsicWidth;
            if (f4 != 0.0f) {
                f = (measuredWidth * f3) / f4;
            } else {
                f = 1.0f;
            }
            float f5 = intrinsicHeight;
            if (f5 != 0.0f) {
                f2 = (f3 * measuredHeight) / f5;
            } else {
                f2 = 1.0f;
            }
            float min = Math.min(1.0f, Math.min(f, f2));
            int round = Math.round(f4 * min);
            int round2 = Math.round(min * f5);
            int round3 = ((measuredWidth - round) / 2) + Math.round(this.LJJII * round);
            int i5 = (measuredHeight - round2) / 2;
            this.LJII.setBounds(round3, i5, round + round3, round2 + i5);
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}
