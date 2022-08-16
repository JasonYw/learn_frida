package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.covode.number.Covode;
import p003X.C138313cvV;
import p003X.C138332cvo;

/* loaded from: classes17.dex */
public class ActionBarContainer extends FrameLayout {
    public Drawable LIZ;
    public Drawable LIZIZ;
    public Drawable LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public boolean f20225LJ;
    public boolean LJFF;
    public View LJI;
    public View LJII;
    public View LJIIIIZZ;
    public int LJIIIZ;

    static {
        Covode.recordClassIndex(580);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public View getTabContainer() {
        return this.LJI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.LIZ;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.LIZIZ;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.LIZJ;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.LJII = findViewById(2131165209);
        this.LJIIIIZZ = findViewById(2131165797);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.LIZ;
        if (drawable != null && drawable.isStateful()) {
            this.LIZ.setState(getDrawableState());
        }
        Drawable drawable2 = this.LIZIZ;
        if (drawable2 != null && drawable2.isStateful()) {
            this.LIZIZ.setState(getDrawableState());
        }
        Drawable drawable3 = this.LIZJ;
        if (drawable3 != null && drawable3.isStateful()) {
            this.LIZJ.setState(getDrawableState());
        }
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LJFF && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setTransitioning(boolean z) {
        int i;
        this.LJFF = z;
        if (z) {
            i = 393216;
        } else {
            i = 262144;
        }
        setDescendantFocusability(i);
    }

    public static boolean LIZ(View view) {
        if (view != null && view.getVisibility() != 8 && view.getMeasuredHeight() != 0) {
            return false;
        }
        return true;
    }

    public static int LIZIZ(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public void setTabContainer(C138313cvV c138313cvV) {
        View view = this.LJI;
        if (view != null) {
            removeView(view);
        }
        this.LJI = c138313cvV;
        if (c138313cvV != null) {
            addView(c138313cvV);
            ViewGroup.LayoutParams layoutParams = c138313cvV.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c138313cvV.setAllowCollapse(false);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.LIZ;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.LIZIZ;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.LIZJ;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.LIZ || this.LIZLLL) {
            if (drawable != this.LIZIZ || !this.f20225LJ) {
                if ((drawable != this.LIZJ || !this.LIZLLL) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.LIZ;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.LIZ);
        }
        this.LIZ = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.LJII;
            if (view != null) {
                this.LIZ.setBounds(view.getLeft(), this.LJII.getTop(), this.LJII.getRight(), this.LJII.getBottom());
            }
        }
        boolean z = true;
        if (!this.LIZLLL ? this.LIZ != null || this.LIZIZ != null : this.LIZJ != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        int i = Build.VERSION.SDK_INT;
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.LIZJ;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.LIZJ);
        }
        this.LIZJ = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.LIZLLL && (drawable2 = this.LIZJ) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.LIZLLL ? !(this.LIZ != null || this.LIZIZ != null) : this.LIZJ == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        int i = Build.VERSION.SDK_INT;
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.LIZIZ;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.LIZIZ);
        }
        this.LIZIZ = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f20225LJ && (drawable2 = this.LIZIZ) != null) {
                drawable2.setBounds(this.LJI.getLeft(), this.LJI.getTop(), this.LJI.getRight(), this.LJI.getBottom());
            }
        }
        boolean z = true;
        if (!this.LIZLLL ? this.LIZ != null || this.LIZIZ != null : this.LIZJ != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        int i = Build.VERSION.SDK_INT;
        invalidateOutline();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.LJII == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i5 = this.LJIIIZ) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.LJII == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View view = this.LJI;
        if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
            if (!LIZ(this.LJII)) {
                i3 = LIZIZ(this.LJII);
            } else if (!LIZ(this.LJIIIIZZ)) {
                i3 = LIZIZ(this.LJIIIIZZ);
            } else {
                i3 = 0;
            }
            if (mode == Integer.MIN_VALUE) {
                i4 = View.MeasureSpec.getSize(i2);
            } else {
                i4 = Integer.MAX_VALUE;
            }
            setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + LIZIZ(this.LJI), i4));
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewCompat.setBackground(this, new C138332cvo(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130772073, 2130772074, 2130772075, 2130772076, 2130772079, 2130772256, 2130772259, 2130772260, 2130772787, 2130772788, 2130772856, 2130772929, 2130772930, 2130773218, 2130773226, 2130773244, 2130773245, 2130773255, 2130773343, 2130773422, 2130773664, 2130773792, 2130773940, 2130773987, 2130773988, 2130774597, 2130774600, 2130774753, 2130774767});
        this.LIZ = obtainStyledAttributes.getDrawable(5);
        this.LIZIZ = obtainStyledAttributes.getDrawable(7);
        this.LJIIIZ = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == 2131190299) {
            this.LIZLLL = true;
            this.LIZJ = obtainStyledAttributes.getDrawable(6);
        }
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (!this.LIZLLL ? !(this.LIZ != null || this.LIZIZ != null) : this.LIZJ == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
        if (r6 != null) goto L6;
     */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            super.onLayout(r8, r9, r10, r11, r12)
            android.view.View r6 = r7.LJI
            r1 = 8
            r0 = 1
            r3 = 0
            if (r6 == 0) goto Lbf
            int r0 = r6.getVisibility()
            if (r0 == r1) goto Lbf
            r5 = 1
        L12:
            int r0 = r6.getVisibility()
            if (r0 == r1) goto L31
            int r4 = r7.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r6.getMeasuredHeight()
            int r1 = r4 - r0
            int r0 = r2.bottomMargin
            int r1 = r1 - r0
            int r0 = r2.bottomMargin
            int r4 = r4 - r0
            r6.layout(r9, r1, r11, r4)
        L31:
            boolean r0 = r7.LIZLLL
            if (r0 == 0) goto L48
            android.graphics.drawable.Drawable r2 = r7.LIZJ
            if (r2 == 0) goto L47
            int r1 = r7.getMeasuredWidth()
            int r0 = r7.getMeasuredHeight()
            r2.setBounds(r3, r3, r1, r0)
        L44:
            r7.invalidate()
        L47:
            return
        L48:
            android.graphics.drawable.Drawable r0 = r7.LIZ
            if (r0 == 0) goto L72
            android.view.View r0 = r7.LJII
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L8e
            android.graphics.drawable.Drawable r4 = r7.LIZ
            android.view.View r0 = r7.LJII
            int r3 = r0.getLeft()
            android.view.View r0 = r7.LJII
            int r2 = r0.getTop()
            android.view.View r0 = r7.LJII
            int r1 = r0.getRight()
            android.view.View r0 = r7.LJII
            int r0 = r0.getBottom()
            r4.setBounds(r3, r2, r1, r0)
        L71:
            r3 = 1
        L72:
            r7.f20225LJ = r5
            if (r5 == 0) goto Lbc
            android.graphics.drawable.Drawable r4 = r7.LIZIZ
            if (r4 == 0) goto Lbc
            int r3 = r6.getLeft()
            int r2 = r6.getTop()
            int r1 = r6.getRight()
            int r0 = r6.getBottom()
            r4.setBounds(r3, r2, r1, r0)
            goto L44
        L8e:
            android.view.View r0 = r7.LJIIIIZZ
            if (r0 == 0) goto Lb6
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lb6
            android.graphics.drawable.Drawable r4 = r7.LIZ
            android.view.View r0 = r7.LJIIIIZZ
            int r3 = r0.getLeft()
            android.view.View r0 = r7.LJIIIIZZ
            int r2 = r0.getTop()
            android.view.View r0 = r7.LJIIIIZZ
            int r1 = r0.getRight()
            android.view.View r0 = r7.LJIIIIZZ
            int r0 = r0.getBottom()
            r4.setBounds(r3, r2, r1, r0)
            goto L71
        Lb6:
            android.graphics.drawable.Drawable r0 = r7.LIZ
            r0.setBounds(r3, r3, r3, r3)
            goto L71
        Lbc:
            if (r3 == 0) goto L47
            goto L44
        Lbf:
            r5 = 0
            if (r6 == 0) goto L31
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }
}
