package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public final class ScrollerCompat {
    public OverScroller mScroller;

    static {
        Covode.recordClassIndex(1171);
    }

    public final void abortAnimation() {
        this.mScroller.abortAnimation();
    }

    public final boolean computeScrollOffset() {
        return this.mScroller.computeScrollOffset();
    }

    public final float getCurrVelocity() {
        return this.mScroller.getCurrVelocity();
    }

    public final int getCurrX() {
        return this.mScroller.getCurrX();
    }

    public final int getCurrY() {
        return this.mScroller.getCurrY();
    }

    public final int getFinalX() {
        return this.mScroller.getFinalX();
    }

    public final int getFinalY() {
        return this.mScroller.getFinalY();
    }

    public final boolean isFinished() {
        return this.mScroller.isFinished();
    }

    public final boolean isOverScrolled() {
        return this.mScroller.isOverScrolled();
    }

    public static ScrollerCompat create(Context context) {
        return create(context, null);
    }

    public static ScrollerCompat create(Context context, Interpolator interpolator) {
        return new ScrollerCompat(context, interpolator);
    }

    public ScrollerCompat(Context context, Interpolator interpolator) {
        OverScroller overScroller;
        if (interpolator != null) {
            overScroller = new OverScroller(context, interpolator);
        } else {
            overScroller = new OverScroller(context);
        }
        this.mScroller = overScroller;
    }

    public final void notifyHorizontalEdgeReached(int i, int i2, int i3) {
        this.mScroller.notifyHorizontalEdgeReached(i, i2, i3);
    }

    public final void notifyVerticalEdgeReached(int i, int i2, int i3) {
        this.mScroller.notifyVerticalEdgeReached(i, i2, i3);
    }

    public final void startScroll(int i, int i2, int i3, int i4) {
        this.mScroller.startScroll(i, i2, i3, i4);
    }

    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        this.mScroller.startScroll(i, i2, i3, i4, i5);
    }

    public final boolean springBack(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.mScroller.springBack(i, i2, i3, i4, i5, i6);
    }

    public final void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.mScroller.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    public final void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.mScroller.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }
}
