package android.support.wearable.view.drawer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import p003X.C5MI;

/* loaded from: classes22.dex */
public class PageIndicatorView extends View implements ViewPager.OnPageChangeListener {
    public int LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public float f20212LJ;
    public float LJFF;
    public int LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public int LJIILIIL;
    public PagerAdapter LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public final Paint LJIJ;
    public final Paint LJIJI;
    public final Paint LJIJJ;
    public final Paint LJIJJLI;

    static {
        Covode.recordClassIndex(340);
    }

    public float getDotSpacing() {
        return this.LIZLLL;
    }

    public int getDotColor() {
        return this.LJI;
    }

    public int getDotColorSelected() {
        return this.LJII;
    }

    public int getDotFadeInDuration() {
        return this.LJIIIZ;
    }

    public int getDotFadeOutDelay() {
        return this.LIZ;
    }

    public int getDotFadeOutDuration() {
        return this.LIZIZ;
    }

    public boolean getDotFadeWhenIdle() {
        return this.LJIIIIZZ;
    }

    public float getDotRadius() {
        return this.f20212LJ;
    }

    public float getDotRadiusSelected() {
        return this.LJFF;
    }

    public int getDotShadowColor() {
        return this.LJIILIIL;
    }

    public float getDotShadowDx() {
        return this.LJIIJ;
    }

    public float getDotShadowDy() {
        return this.LJIIJJI;
    }

    public float getDotShadowRadius() {
        return this.LJIIL;
    }

    private void LIZ() {
        LIZ(this.LJIJ, this.LJIJI, this.f20212LJ, this.LJIIL, this.LJI, this.LJIILIIL);
        LIZ(this.LJIJJ, this.LJIJJLI, this.LJFF, this.LJIIL, this.LJII, this.LJIILIIL);
    }

    private void LIZIZ() {
        this.LIZJ = true;
        animate().cancel();
        animate().alpha(1.0f).setStartDelay(0L).setDuration(this.LJIIIZ).start();
    }

    private void LIZJ() {
        this.LIZJ = true;
        animate().cancel();
        animate().alpha(1.0f).setStartDelay(0L).setDuration(this.LJIIIZ).setListener(new C5MI() { // from class: android.support.wearable.view.drawer.PageIndicatorView.1
            static {
                Covode.recordClassIndex(341);
            }

            @Override // p003X.C5MI
            public final void LIZ() {
                PageIndicatorView pageIndicatorView = PageIndicatorView.this;
                pageIndicatorView.LIZJ = false;
                pageIndicatorView.animate().alpha(0.0f).setListener(null).setStartDelay(PageIndicatorView.this.LIZ).setDuration(PageIndicatorView.this.LIZIZ).start();
            }
        }).start();
    }

    public void setDotFadeOutDelay(int i) {
        this.LIZ = i;
    }

    public PageIndicatorView(Context context) {
        this(context, null);
    }

    private void LIZ(int i) {
        this.LJIILLIIL = i;
        invalidate();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        if (i != this.LJIILLIIL) {
            LIZ(i);
        }
    }

    public void setDotFadeWhenIdle(boolean z) {
        this.LJIIIIZZ = z;
        if (!z) {
            LIZIZ();
        }
    }

    public void setDotShadowDx(float f) {
        this.LJIIJ = f;
        invalidate();
    }

    public void setDotShadowDy(float f) {
        this.LJIIJJI = f;
        invalidate();
    }

    public void setDotColor(int i) {
        if (this.LJI != i) {
            this.LJI = i;
            invalidate();
        }
    }

    public void setDotColorSelected(int i) {
        if (this.LJII != i) {
            this.LJII = i;
            invalidate();
        }
    }

    public void setDotRadius(int i) {
        float f = i;
        if (this.f20212LJ != f) {
            this.f20212LJ = f;
            LIZ();
            invalidate();
        }
    }

    public void setDotRadiusSelected(int i) {
        float f = i;
        if (this.LJFF != f) {
            this.LJFF = f;
            LIZ();
            invalidate();
        }
    }

    public void setDotShadowColor(int i) {
        this.LJIILIIL = i;
        LIZ();
        invalidate();
    }

    public void setDotShadowRadius(float f) {
        if (this.LJIIL != f) {
            this.LJIIL = f;
            LIZ();
            invalidate();
        }
    }

    public void setDotSpacing(int i) {
        if (this.LIZLLL != i) {
            this.LIZLLL = i;
            requestLayout();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        if (this.LJIIZILJ != i) {
            this.LJIIZILJ = i;
            if (this.LJIIIIZZ && i == 0) {
                if (this.LIZJ) {
                    LIZ(this.LIZ);
                } else {
                    LIZJ();
                }
            }
        }
    }

    public void setPager(ViewPager viewPager) {
        viewPager.addOnPageChangeListener(this);
        setPagerAdapter(viewPager.getAdapter());
        this.LJIILJJIL = viewPager.getAdapter();
        PagerAdapter pagerAdapter = this.LJIILJJIL;
        if (pagerAdapter != null && pagerAdapter.getCount() > 0) {
            LIZ(0);
        }
    }

    public void setPagerAdapter(PagerAdapter pagerAdapter) {
        this.LJIILJJIL = pagerAdapter;
        PagerAdapter pagerAdapter2 = this.LJIILJJIL;
        if (pagerAdapter2 != null) {
            int count = pagerAdapter2.getCount();
            if (count != this.LJIILL) {
                this.LJIILL = count;
                requestLayout();
            }
            if (this.LJIIIIZZ) {
                LIZJ();
            }
        }
    }

    private void LIZ(long j) {
        this.LIZJ = false;
        animate().cancel();
        animate().alpha(0.0f).setStartDelay(j).setDuration(this.LIZIZ).start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LJIILL > 1) {
            canvas.save();
            canvas.translate(getPaddingLeft() + (this.LIZLLL / 2.0f), getHeight() / 2.0f);
            for (int i = 0; i < this.LJIILL; i++) {
                if (i == this.LJIILLIIL) {
                    canvas.drawCircle(this.LJIIJ, this.LJIIJJI, this.LJFF + this.LJIIL, this.LJIJJLI);
                    canvas.drawCircle(0.0f, 0.0f, this.LJFF, this.LJIJJ);
                } else {
                    canvas.drawCircle(this.LJIIJ, this.LJIIJJI, this.f20212LJ + this.LJIIL, this.LJIJI);
                    canvas.drawCircle(0.0f, 0.0f, this.f20212LJ, this.LJIJ);
                }
                canvas.translate(this.LIZLLL, 0.0f);
            }
            canvas.restore();
        }
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int paddingLeft;
        int ceil;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            paddingLeft = View.MeasureSpec.getSize(i);
        } else {
            paddingLeft = (this.LJIILL * this.LIZLLL) + getPaddingLeft() + getPaddingRight();
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            ceil = View.MeasureSpec.getSize(i2);
        } else {
            float f = this.f20212LJ;
            float f2 = this.LJIIL;
            ceil = ((int) (((int) Math.ceil(Math.max(f + f2, this.LJFF + f2) * 2.0f)) + this.LJIIJJI)) + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(resolveSizeAndState(paddingLeft, i, 0), resolveSizeAndState(ceil, i2, 0));
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        if (this.LJIIIIZZ && this.LJIIZILJ == 1) {
            if (f != 0.0f) {
                if (!this.LIZJ) {
                    LIZIZ();
                }
            } else if (this.LIZJ) {
                LIZ(0L);
            }
        }
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{2130773852, 2130773853, 2130773854, 2130773855, 2130773856, 2130773857, 2130773858, 2130773859, 2130773860, 2130773861, 2130773862, 2130773863, 2130773864}, i, 2131493521);
        this.LIZLLL = obtainStyledAttributes.getDimensionPixelOffset(12, 0);
        this.f20212LJ = obtainStyledAttributes.getDimension(6, 0.0f);
        this.LJFF = obtainStyledAttributes.getDimension(7, 0.0f);
        this.LJI = obtainStyledAttributes.getColor(0, 0);
        this.LJII = obtainStyledAttributes.getColor(1, 0);
        this.LIZ = obtainStyledAttributes.getInt(3, 0);
        this.LIZIZ = obtainStyledAttributes.getInt(4, 0);
        this.LJIIIZ = obtainStyledAttributes.getInt(2, 0);
        this.LJIIIIZZ = obtainStyledAttributes.getBoolean(5, false);
        this.LJIIJ = obtainStyledAttributes.getDimension(9, 0.0f);
        this.LJIIJJI = obtainStyledAttributes.getDimension(10, 0.0f);
        this.LJIIL = obtainStyledAttributes.getDimension(11, 0.0f);
        this.LJIILIIL = obtainStyledAttributes.getColor(8, 0);
        obtainStyledAttributes.recycle();
        this.LJIJ = new Paint(1);
        this.LJIJ.setColor(this.LJI);
        this.LJIJ.setStyle(Paint.Style.FILL);
        this.LJIJJ = new Paint(1);
        this.LJIJJ.setColor(this.LJII);
        this.LJIJJ.setStyle(Paint.Style.FILL);
        this.LJIJI = new Paint(1);
        this.LJIJJLI = new Paint(1);
        this.LJIIZILJ = 0;
        if (isInEditMode()) {
            this.LJIILL = 5;
            this.LJIILLIIL = 2;
            this.LJIIIIZZ = false;
        }
        if (this.LJIIIIZZ) {
            this.LIZJ = false;
            animate().alpha(0.0f).setStartDelay(2000L).setDuration(this.LIZIZ).start();
        } else {
            animate().cancel();
            setAlpha(1.0f);
        }
        LIZ();
    }

    public static void LIZ(Paint paint, Paint paint2, float f, float f2, int i, int i2) {
        float f3 = f + f2;
        paint2.setShader(new RadialGradient(0.0f, 0.0f, f3, new int[]{i2, i2, 0}, new float[]{0.0f, f / f3, 1.0f}, Shader.TileMode.CLAMP));
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
    }
}
