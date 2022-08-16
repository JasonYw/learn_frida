package android.support.wearable.view;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.bytedance.covode.number.Covode;
import p003X.TNG;
import p003X.TNH;

/* loaded from: classes10.dex */
public class ActionPage extends ViewGroup {
    public final TNG LIZ;
    public TNH LIZIZ;
    public int LIZJ;
    public float LIZLLL;

    /* renamed from: LJ */
    public final Point f20203LJ;
    public int LJFF;
    public int LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;

    static {
        Covode.recordClassIndex(312);
    }

    public TNH getButton() {
        return this.LIZIZ;
    }

    public TNG getLabel() {
        return this.LIZ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.LJIIIZ) {
            requestApplyInsets();
        }
    }

    public ActionPage(Context context) {
        this(context, null);
    }

    public void setColor(int i) {
        this.LIZIZ.setColor(i);
    }

    public void setImageDrawable(Drawable drawable) {
        this.LIZIZ.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        this.LIZIZ.setImageResource(i);
    }

    public void setImageScaleMode(int i) {
        this.LIZIZ.setImageScaleMode(i);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        TNH tnh = this.LIZIZ;
        if (tnh != null) {
            tnh.setOnClickListener(onClickListener);
        }
    }

    @Override // android.view.View
    public void setStateListAnimator(StateListAnimator stateListAnimator) {
        TNH tnh = this.LIZIZ;
        if (tnh != null) {
            tnh.setStateListAnimator(stateListAnimator);
        }
    }

    public void setText(CharSequence charSequence) {
        this.LIZ.setText(charSequence);
    }

    public void setColor(ColorStateList colorStateList) {
        this.LIZIZ.setColor(colorStateList);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        TNH tnh = this.LIZIZ;
        if (tnh != null) {
            tnh.setEnabled(z);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.LJIIIZ = true;
        if (this.LJII != windowInsets.isRound()) {
            this.LJII = windowInsets.isRound();
            requestLayout();
        }
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        if (this.LJIIIIZZ != systemWindowInsetBottom) {
            this.LJIIIIZZ = systemWindowInsetBottom;
            requestLayout();
        }
        if (this.LJII) {
            this.LJIIIIZZ = (int) Math.max(this.LJIIIIZZ, getMeasuredHeight() * 0.09375f);
        }
        return windowInsets;
    }

    public ActionPage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        if (this.LIZIZ.getImageScaleMode() == 1 && this.LIZIZ.getImageDrawable() != null) {
            this.LIZIZ.measure(0, 0);
            this.LIZJ = Math.min(this.LIZIZ.getMeasuredWidth(), this.LIZIZ.getMeasuredHeight());
            this.LIZLLL = this.LIZJ / 2.0f;
        } else {
            this.LIZJ = (int) (Math.min(measuredWidth, measuredHeight) * 0.45f);
            int i3 = this.LIZJ;
            this.LIZLLL = i3 / 2.0f;
            this.LIZIZ.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LIZJ, 1073741824));
        }
        if (this.LJII) {
            this.f20203LJ.set(measuredWidth / 2, measuredHeight / 2);
            this.LJFF = (int) (measuredWidth * 0.625f);
            this.LJIIIIZZ = (int) (measuredHeight * 0.09375f);
        } else {
            this.f20203LJ.set(measuredWidth / 2, (int) (measuredHeight * 0.43f));
            this.LJFF = (int) (measuredWidth * 0.892f);
        }
        this.LJI = (int) ((measuredHeight - (this.f20203LJ.y + this.LIZLLL)) - this.LJIIIIZZ);
        this.LIZ.measure(View.MeasureSpec.makeMeasureSpec(this.LJFF, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LJI, 1073741824));
    }

    public ActionPage(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 2131493771);
    }

    public ActionPage(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f20203LJ = new Point();
        this.LIZIZ = new TNH(context);
        this.LIZ = new TNG(context);
        this.LIZ.setGravity(17);
        this.LIZ.setMaxLines(2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842902, 16842903, 16842904, 16842927, 16843033, 16843087, 16843091, 16843173, 16843287, 16843288, 16843692, 16843840, 16843848, 2130772526, 2130773334, 2130773743, 2130773773, 2130773963}, i, i2);
        float f = 0.0f;
        float f2 = 1.0f;
        int i3 = 1;
        int i4 = 0;
        String str = null;
        for (int i5 = 0; i5 < obtainStyledAttributes.getIndexCount(); i5++) {
            int index = obtainStyledAttributes.getIndex(i5);
            if (index == 7) {
                this.LIZIZ.setColor(obtainStyledAttributes.getColorStateList(index));
            } else if (index == 4) {
                this.LIZIZ.setImageDrawable(obtainStyledAttributes.getDrawable(index));
            } else if (index == 14) {
                this.LIZIZ.setImageScaleMode(obtainStyledAttributes.getInt(index, 0));
            } else if (index == 13) {
                this.LIZIZ.setRippleColor(obtainStyledAttributes.getColor(index, -1));
            } else if (index == 17) {
                this.LIZIZ.setPressedTranslationZ(obtainStyledAttributes.getDimension(index, 0.0f));
            } else if (index == 5) {
                this.LIZ.setText(obtainStyledAttributes.getText(index));
            } else if (index == 16) {
                this.LIZ.LIZ(0, obtainStyledAttributes.getDimension(index, 10.0f));
            } else if (index == 15) {
                this.LIZ.LIZIZ(0, obtainStyledAttributes.getDimension(index, 60.0f));
            } else if (index == 2) {
                this.LIZ.setTextColor(obtainStyledAttributes.getColorStateList(index));
            } else if (index == 6) {
                this.LIZ.setMaxLines(obtainStyledAttributes.getInt(index, 2));
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
            } else if (index == 0) {
                i3 = obtainStyledAttributes.getInt(index, i3);
            } else if (index == 1) {
                i4 = obtainStyledAttributes.getInt(index, i4);
            } else if (index == 3) {
                this.LIZ.setGravity(obtainStyledAttributes.getInt(index, 17));
            } else if (index == 8) {
                f = obtainStyledAttributes.getDimension(index, f);
            } else if (index == 9) {
                f2 = obtainStyledAttributes.getDimension(index, f2);
            } else if (index == 12) {
                this.LIZIZ.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, obtainStyledAttributes.getResourceId(index, 0)));
            }
        }
        obtainStyledAttributes.recycle();
        TNG tng = this.LIZ;
        if (tng.LIZJ != f || tng.LIZIZ != f2) {
            tng.LIZJ = f;
            tng.LIZIZ = f2;
            if (tng.LIZ != null) {
                tng.LIZ = null;
                tng.requestLayout();
                tng.invalidate();
            }
        }
        this.LIZ.LIZ(str, i3, i4);
        addView(this.LIZ);
        addView(this.LIZIZ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.LIZIZ.layout((int) (this.f20203LJ.x - this.LIZLLL), (int) (this.f20203LJ.y - this.LIZLLL), (int) (this.f20203LJ.x + this.LIZLLL), (int) (this.f20203LJ.y + this.LIZLLL));
        int i5 = (int) (((i3 - i) - this.LJFF) / 2.0f);
        this.LIZ.layout(i5, this.LIZIZ.getBottom(), this.LJFF + i5, this.LIZIZ.getBottom() + this.LJI);
    }
}
