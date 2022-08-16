package android.support.wearable.view;

import android.content.Context;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.google.android.wearable.input.RotaryEncoderHelper;
import p003X.AbstractC488865Ua;
import p003X.C145679eqd;
import p003X.V46;

/* loaded from: classes19.dex */
public class WearableRecyclerView extends RecyclerView {
    public AbstractC488865Ua LIZ;
    public boolean LIZIZ;
    public final C145679eqd LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public int f20211LJ;
    public int LJFF;
    public final ViewTreeObserver.OnPreDrawListener LJI;

    public boolean getCenterEdgeItems() {
        return this.LIZLLL;
    }

    public AbstractC488865Ua getOffsettingHelper() {
        return this.LIZ;
    }

    public float getBezelWidth() {
        return 1.0f - this.LIZJ.LIZ;
    }

    public float getScrollDegreesPerScreen() {
        return this.LIZJ.LIZJ;
    }

    static {
        Covode.recordClassIndex(331);
        WearableRecyclerView.class.getSimpleName();
    }

    /* loaded from: classes22.dex */
    public static abstract class ChildLayoutManager extends LinearLayoutManager {
        static {
            Covode.recordClassIndex(332);
        }

        public abstract void LIZ(View view, WearableRecyclerView wearableRecyclerView);

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
            return LIZ(this, i, recycler, state);
        }

        private void LIZ() {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                LIZ(childAt, (WearableRecyclerView) childAt.getParent());
            }
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
            super.onLayoutChildren(recycler, state);
            if (getChildCount() == 0) {
                return;
            }
            LIZ();
        }

        public static int LIZ(ChildLayoutManager childLayoutManager, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
            try {
                int scrollVerticallyBy = super.scrollVerticallyBy(i, recycler, state);
                childLayoutManager.LIZ();
                return scrollVerticallyBy;
            } catch (NullPointerException unused) {
                return 0;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LIZJ.LJIIJ = null;
        getViewTreeObserver().removeOnPreDrawListener(this.LJI);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C145679eqd c145679eqd = this.LIZJ;
        c145679eqd.LJIIJ = this;
        Point point = new Point();
        c145679eqd.LJIIJ.getDisplay().getSize(point);
        c145679eqd.f19432LJ = Math.max(point.x, point.y) / 2.0f;
        c145679eqd.LJFF = c145679eqd.f19432LJ * c145679eqd.f19432LJ;
        c145679eqd.LJI = point.y / c145679eqd.LIZLLL;
        c145679eqd.LJIIJJI = VelocityTracker.obtain();
        getViewTreeObserver().addOnPreDrawListener(this.LJI);
    }

    public void setCircularScrollingGestureEnabled(boolean z) {
        this.LIZIZ = z;
    }

    public void setOffsettingHelper(AbstractC488865Ua abstractC488865Ua) {
        this.LIZ = abstractC488865Ua;
    }

    public void setBezelWidth(float f) {
        C145679eqd c145679eqd = this.LIZJ;
        c145679eqd.LIZ = 1.0f - f;
        c145679eqd.LIZIZ = c145679eqd.LIZ * c145679eqd.LIZ;
    }

    public void setScrollDegreesPerScreen(float f) {
        C145679eqd c145679eqd = this.LIZJ;
        c145679eqd.LIZJ = f;
        c145679eqd.LIZLLL = (float) Math.toRadians(c145679eqd.LIZJ);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        RecyclerView.LayoutManager mo25799getLayoutManager = mo25799getLayoutManager();
        if (mo25799getLayoutManager == null || isLayoutFrozen()) {
            return false;
        }
        if (motionEvent.getAction() == 8 && V46.LIZ() && RotaryEncoderHelper.isFromRotaryEncoder(motionEvent)) {
            if (V46.LIZ()) {
                f = RotaryEncoderHelper.getRotaryAxisValue(motionEvent);
            } else {
                f = 0.0f;
            }
            float f3 = -f;
            Context context = getContext();
            if (V46.LIZ()) {
                f2 = RotaryEncoderHelper.getScaledScrollFactor(context);
            } else {
                f2 = 64.0f;
            }
            int round = Math.round(f3 * f2);
            if (mo25799getLayoutManager.canScrollVertically()) {
                scrollBy(0, round);
                return true;
            } else if (mo25799getLayoutManager.canScrollHorizontally()) {
                scrollBy(round, 0);
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public void setCenterEdgeItems(boolean z) {
        this.LIZLLL = z;
        if (this.LIZLLL) {
            if (getChildCount() > 0 && this.LIZLLL && getChildCount() > 0) {
                int i = 0;
                int height = (int) ((getHeight() * 0.5f) - (getChildAt(0).getHeight() * 0.5f));
                if (getPaddingTop() != height) {
                    this.f20211LJ = getPaddingTop();
                    this.LJFF = getPaddingBottom();
                    setPadding(getPaddingLeft(), height, getPaddingRight(), height);
                    View focusedChild = getFocusedChild();
                    if (focusedChild != null) {
                        i = mo25799getLayoutManager().getPosition(focusedChild);
                    }
                    mo25799getLayoutManager().scrollToPosition(i);
                }
            }
        } else if (this.f20211LJ != Integer.MIN_VALUE) {
            setPadding(getPaddingLeft(), this.f20211LJ, getPaddingRight(), this.LJFF);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float hypot;
        if (this.LIZIZ) {
            C145679eqd c145679eqd = this.LIZJ;
            float rawX = motionEvent.getRawX() - c145679eqd.f19432LJ;
            float rawY = motionEvent.getRawY() - c145679eqd.f19432LJ;
            float f = (rawX * rawX) + (rawY * rawY);
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            c145679eqd.LJIIJJI.addMovement(obtain);
            obtain.recycle();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3 && c145679eqd.LJII) {
                            c145679eqd.LJII = false;
                            c145679eqd.LJIIIIZZ = false;
                            c145679eqd.LJIIJ.invalidate();
                            return true;
                        }
                    } else if (c145679eqd.LJIIIIZZ) {
                        int round = Math.round(C145679eqd.LIZ(((float) Math.atan2(rawY, rawX)) - c145679eqd.LJIIIZ) * c145679eqd.LJI);
                        if (round != 0) {
                            c145679eqd.LJIIJ.scrollBy(0, round);
                            c145679eqd.LJIIIZ += round / c145679eqd.LJI;
                            c145679eqd.LJIIIZ = C145679eqd.LIZ(c145679eqd.LJIIIZ);
                            return true;
                        }
                        return true;
                    } else if (c145679eqd.LJII) {
                        float rawX2 = motionEvent.getRawX() - c145679eqd.f19432LJ;
                        float rawY2 = motionEvent.getRawY() - c145679eqd.f19432LJ;
                        c145679eqd.LJIIIIZZ = true;
                        c145679eqd.LJIIJ.invalidate();
                        c145679eqd.LJIIIZ = (float) Math.atan2(rawY2 / ((float) Math.hypot(rawX2, rawY2)), rawX2 / hypot);
                        return true;
                    } else if (f / c145679eqd.LJFF > c145679eqd.LIZIZ) {
                        c145679eqd.LJII = true;
                        return true;
                    }
                } else {
                    c145679eqd.LJII = false;
                    c145679eqd.LJIIIIZZ = false;
                    c145679eqd.LJIIJJI.computeCurrentVelocity(1000, c145679eqd.LJIIJ.getMaxFlingVelocity());
                    int yVelocity = (int) c145679eqd.LJIIJJI.getYVelocity();
                    if (motionEvent.getX() < c145679eqd.f19432LJ * 1.5f) {
                        yVelocity = -yVelocity;
                    }
                    c145679eqd.LJIIJJI.clear();
                    if (Math.abs(yVelocity) > c145679eqd.LJIIJ.getMinFlingVelocity() && c145679eqd.LJIIJ.fling(0, (int) (yVelocity * 1.5f))) {
                        return true;
                    }
                }
            } else if (f / c145679eqd.LJFF > c145679eqd.LIZIZ) {
                c145679eqd.LJII = true;
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
