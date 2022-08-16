package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC148138fUK;
import p003X.C116971W2r;
import p003X.TG8;
import p003X.TG9;

/* loaded from: classes20.dex */
public class CardView extends FrameLayout {
    public static final int[] COLOR_BACKGROUND_ATTR = {16842801};
    public static final AbstractC148138fUK IMPL = new TG9();
    public final TG8 mCardViewDelegate;
    public boolean mCompatPadding;
    public final Rect mContentPadding;
    public boolean mPreventCornerOverlap;
    public final Rect mShadowBounds;
    public int mUserSetMinHeight;
    public int mUserSetMinWidth;

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public ColorStateList getCardBackgroundColor() {
        return IMPL.LJIIIIZZ(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return IMPL.mo21314LJ(this.mCardViewDelegate);
    }

    public float getMaxCardElevation() {
        return IMPL.LIZ(this.mCardViewDelegate);
    }

    public float getRadius() {
        return IMPL.LIZLLL(this.mCardViewDelegate);
    }

    static {
        Covode.recordClassIndex(783);
        int i = Build.VERSION.SDK_INT;
        IMPL.LIZ();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        IMPL.LIZ(this.mCardViewDelegate, colorStateList);
    }

    public void setCardElevation(float f) {
        IMPL.LIZJ(this.mCardViewDelegate, f);
    }

    public void setMaxCardElevation(float f) {
        IMPL.LIZIZ(this.mCardViewDelegate, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.mUserSetMinHeight = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.mUserSetMinWidth = i;
        super.setMinimumWidth(i);
    }

    public void setRadius(float f) {
        IMPL.LIZ(this.mCardViewDelegate, f);
    }

    public void setCardBackgroundColor(int i) {
        IMPL.LIZ(this.mCardViewDelegate, ColorStateList.valueOf(i));
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z;
            IMPL.LJII(this.mCardViewDelegate);
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.mCompatPadding != z) {
            this.mCompatPadding = z;
            IMPL.LJI(this.mCardViewDelegate);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130772546);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (!(IMPL instanceof TG9)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(IMPL.LIZIZ(this.mCardViewDelegate)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(IMPL.LIZJ(this.mCardViewDelegate)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int LIZ;
        ColorStateList valueOf;
        this.mContentPadding = new Rect();
        this.mShadowBounds = new Rect();
        this.mCardViewDelegate = new TG8() { // from class: androidx.cardview.widget.CardView.1
            public Drawable LIZIZ;

            static {
                Covode.recordClassIndex(784);
            }

            @Override // p003X.TG8
            public final Drawable LIZJ() {
                return this.LIZIZ;
            }

            @Override // p003X.TG8
            public final View LIZLLL() {
                return CardView.this;
            }

            @Override // p003X.TG8
            public final boolean LIZIZ() {
                return CardView.this.getPreventCornerOverlap();
            }

            @Override // p003X.TG8
            public final boolean LIZ() {
                return CardView.this.getUseCompatPadding();
            }

            @Override // p003X.TG8
            public final void LIZ(Drawable drawable) {
                this.LIZIZ = drawable;
                CardView.this.setBackgroundDrawable(drawable);
            }

            @Override // p003X.TG8
            public final void LIZ(int i2, int i3) {
                if (i2 > CardView.this.mUserSetMinWidth) {
                    CardView.super.setMinimumWidth(i2);
                }
                if (i3 > CardView.this.mUserSetMinHeight) {
                    CardView.super.setMinimumHeight(i3);
                }
            }

            @Override // p003X.TG8
            public final void LIZ(int i2, int i3, int i4, int i5) {
                CardView.this.mShadowBounds.set(i2, i3, i4, i5);
                CardView cardView = CardView.this;
                CardView.super.setPadding(i2 + cardView.mContentPadding.left, i3 + CardView.this.mContentPadding.top, i4 + CardView.this.mContentPadding.right, i5 + CardView.this.mContentPadding.bottom);
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843071, 16843072, 2130772011, 2130772135, 2130772136, 2130772139, 2130772140, 2130772545, 2130772789, 2130772790, 2130772791, 2130772792, 2130772793}, i, 2131493180);
        if (obtainStyledAttributes.hasValue(3)) {
            valueOf = obtainStyledAttributes.getColorStateList(3);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                LIZ = C116971W2r.LIZ(getResources(), 2131624763);
            } else {
                LIZ = C116971W2r.LIZ(getResources(), 2131624762);
            }
            valueOf = ColorStateList.valueOf(LIZ);
        }
        float dimension = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(2, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(7, 0.0f);
        this.mCompatPadding = obtainStyledAttributes.getBoolean(6, false);
        this.mPreventCornerOverlap = obtainStyledAttributes.getBoolean(5, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.mContentPadding.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        this.mContentPadding.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        this.mContentPadding.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        this.mContentPadding.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.mUserSetMinHeight = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        IMPL.LIZ(this.mCardViewDelegate, context, valueOf, dimension, dimension2, dimension3);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.mContentPadding.set(i, i2, i3, i4);
        IMPL.LJFF(this.mCardViewDelegate);
    }
}
