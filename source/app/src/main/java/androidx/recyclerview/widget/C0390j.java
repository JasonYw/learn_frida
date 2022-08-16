package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.MotionEventCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p003X.AbstractC147048fCk;
import p003X.AbstractC147148fEM;
import p003X.AbstractC147157fEV;
import p003X.C147147fEL;
import p003X.C147149fEN;
import p003X.C147152fEQ;
import p003X.RunnableC147146fEK;

/* renamed from: androidx.recyclerview.widget.j */
/* loaded from: classes20.dex */
public final class C0390j extends RecyclerView.ItemDecoration implements RecyclerView.OnChildAttachStateChangeListener {
    public float LIZJ;
    public float LIZLLL;

    /* renamed from: LJ */
    public float f20285LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public AbstractC147148fEM LJIIIZ;
    public int LJIIJ;
    public RecyclerView LJIIL;
    public VelocityTracker LJIILJJIL;
    public GestureDetectorCompat LJIIZILJ;
    public Rect LJIJ;
    public long LJIJI;
    public float LJIJJLI;
    public float LJIL;
    public int LJJI;
    public List<RecyclerView.ViewHolder> LJJIFFI;
    public List<Integer> LJJII;
    public C147149fEN LJJIIJ;
    public final List<View> LIZ = new ArrayList();
    public final float[] LJIJJ = new float[2];
    public RecyclerView.ViewHolder LIZIZ = null;
    public int LJIIIIZZ = -1;
    public int LJJ = 0;
    public List<C0391c> LJIIJJI = new ArrayList();
    public final Runnable LJIILIIL = new RunnableC147146fEK(this);
    public AbstractC147048fCk LJJIII = null;
    public View LJIILL = null;
    public int LJIILLIIL = -1;
    public final RecyclerView.OnItemTouchListener LJJIIJZLJL = new C147147fEL(this);

    static {
        Covode.recordClassIndex(1770);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewAttachedToWindow(View view) {
    }

    public final void LIZ(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.LJIIL;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.LJIIL.removeOnItemTouchListener(this.LJJIIJZLJL);
            this.LJIIL.removeOnChildAttachStateChangeListener(this);
            for (int size = this.LJIIJJI.size() - 1; size >= 0; size--) {
                this.LJIIIZ.LIZLLL(this.LJIIL, this.LJIIJJI.get(0).LJII);
            }
            this.LJIIJJI.clear();
            this.LJIILL = null;
            this.LJIILLIIL = -1;
            LIZIZ();
            C147149fEN c147149fEN = this.LJJIIJ;
            if (c147149fEN != null) {
                c147149fEN.LIZ = false;
                this.LJJIIJ = null;
            }
            if (this.LJIIZILJ != null) {
                this.LJIIZILJ = null;
            }
        }
        this.LJIIL = recyclerView;
        if (recyclerView == null) {
            return;
        }
        Resources resources = recyclerView.getResources();
        this.LJIJJLI = resources.getDimension(2131428394);
        this.LJIL = resources.getDimension(2131428393);
        this.LJJI = ViewConfiguration.get(this.LJIIL.getContext()).getScaledTouchSlop();
        this.LJIIL.addItemDecoration(this);
        this.LJIIL.addOnItemTouchListener(this.LJJIIJZLJL);
        this.LJIIL.addOnChildAttachStateChangeListener(this);
        this.LJJIIJ = new C147149fEN(this);
        this.LJIIZILJ = new GestureDetectorCompat(this.LJIIL.getContext(), this.LJJIIJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0167, code lost:
        if (r1 > 0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(androidx.recyclerview.widget.RecyclerView.ViewHolder r25, int r26) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0390j.LIZ(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public final void LIZ(RecyclerView.ViewHolder viewHolder, boolean z) {
        for (int size = this.LJIIJJI.size() - 1; size >= 0; size--) {
            C0391c c0391c = this.LJIIJJI.get(size);
            if (c0391c.LJII == viewHolder) {
                c0391c.LJIILIIL |= z;
                if (!c0391c.LJIILJJIL) {
                    c0391c.LIZ();
                }
                this.LJIIJJI.remove(size);
                return;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$c */
    /* loaded from: classes20.dex */
    public static class C0391c implements Animator.AnimatorListener {
        public final float LIZLLL;

        /* renamed from: LJ */
        public final float f20286LJ;
        public final float LJFF;
        public final float LJI;
        public final RecyclerView.ViewHolder LJII;
        public final int LJIIIIZZ;
        public boolean LJIIJ;
        public float LJIIJJI;
        public float LJIIL;
        public boolean LJIILIIL;
        public boolean LJIILJJIL;
        public final ValueAnimator LJIIIZ = ValueAnimator.ofFloat(0.0f, 1.0f);
        public float LJIILL = 0.0f;

        static {
            Covode.recordClassIndex(1780);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public final void LIZ() {
            this.LJIIIZ.cancel();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.LJIILL = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.LJIILJJIL) {
                this.LJII.setIsRecyclable(true);
            }
            this.LJIILJJIL = true;
        }

        public C0391c(RecyclerView.ViewHolder viewHolder, int i, int i2, float f, float f2, float f3, float f4) {
            this.LJIIIIZZ = i2;
            this.LJII = viewHolder;
            this.LIZLLL = f;
            this.f20286LJ = f2;
            this.LJFF = f3;
            this.LJI = f4;
            this.LJIIIZ.addUpdateListener(new C147152fEQ(this));
            this.LJIIIZ.setTarget(viewHolder.itemView);
            this.LJIIIZ.addListener(this);
        }
    }

    private void LIZIZ() {
        VelocityTracker velocityTracker = this.LJIILJJIL;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.LJIILJJIL = null;
        }
    }

    public final void LIZ() {
        VelocityTracker velocityTracker = this.LJIILJJIL;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.LJIILJJIL = VelocityTracker.obtain();
    }

    public C0390j(AbstractC147148fEM abstractC147148fEM) {
        this.LJIIIZ = abstractC147148fEM;
    }

    public final void LIZ(View view) {
        if (view == this.LJIILL) {
            this.LJIILL = null;
            if (this.LJJIII != null) {
                this.LJIIL.setChildDrawingOrderCallback(null);
            }
        }
    }

    public final void LIZIZ(RecyclerView.ViewHolder viewHolder) {
        if (!this.LJIIIZ.LIZJ(this.LJIIL, viewHolder) || viewHolder.itemView.getParent() != this.LJIIL) {
            return;
        }
        LIZ();
        this.LJFF = 0.0f;
        this.f20285LJ = 0.0f;
        LIZ(viewHolder, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewDetachedFromWindow(View view) {
        LIZ(view);
        RecyclerView.ViewHolder childViewHolder = this.LJIIL.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.LIZIZ;
        if (viewHolder != null && childViewHolder == viewHolder) {
            LIZ((RecyclerView.ViewHolder) null, 0);
            return;
        }
        LIZ(childViewHolder, false);
        if (this.LIZ.remove(childViewHolder.itemView)) {
            this.LJIIIZ.LIZLLL(this.LJIIL, childViewHolder);
        }
    }

    private void LIZ(float[] fArr) {
        if ((this.LJIIJ & 12) != 0) {
            fArr[0] = (this.LJI + this.f20285LJ) - this.LIZIZ.itemView.getLeft();
        } else {
            fArr[0] = this.LIZIZ.itemView.getTranslationX();
        }
        if ((this.LJIIJ & 3) != 0) {
            fArr[1] = (this.LJII + this.LJFF) - this.LIZIZ.itemView.getTop();
        } else {
            fArr[1] = this.LIZIZ.itemView.getTranslationY();
        }
    }

    public final View LIZ(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.ViewHolder viewHolder = this.LIZIZ;
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            if (LIZ(view, x, y, this.LJI + this.f20285LJ, this.LJII + this.LJFF)) {
                return view;
            }
        }
        for (int size = this.LJIIJJI.size() - 1; size >= 0; size--) {
            C0391c c0391c = this.LJIIJJI.get(size);
            View view2 = c0391c.LJII.itemView;
            if (LIZ(view2, x, y, c0391c.LJIIJJI, c0391c.LJIIL)) {
                return view2;
            }
        }
        return this.LJIIL.findChildViewUnder(x, y);
    }

    public final void LIZ(RecyclerView.ViewHolder viewHolder) {
        if (this.LJIIL.isLayoutRequested() || this.LJJ != 2) {
            return;
        }
        int i = (int) (this.LJI + this.f20285LJ);
        int i2 = (int) (this.LJII + this.LJFF);
        if (Math.abs(i2 - viewHolder.itemView.getTop()) < viewHolder.itemView.getHeight() * 0.5f && Math.abs(i - viewHolder.itemView.getLeft()) < viewHolder.itemView.getWidth() * 0.5f) {
            return;
        }
        List<RecyclerView.ViewHolder> list = this.LJJIFFI;
        if (list == null) {
            this.LJJIFFI = new ArrayList();
            this.LJJII = new ArrayList();
        } else {
            list.clear();
            this.LJJII.clear();
        }
        int round = Math.round(this.LJI + this.f20285LJ) - 0;
        int round2 = Math.round(this.LJII + this.LJFF) - 0;
        int width = viewHolder.itemView.getWidth() + round + 0;
        int height = viewHolder.itemView.getHeight() + round2 + 0;
        int i3 = (round + width) / 2;
        int i4 = (round2 + height) / 2;
        RecyclerView.LayoutManager mo25799getLayoutManager = this.LJIIL.mo25799getLayoutManager();
        int childCount = mo25799getLayoutManager.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = mo25799getLayoutManager.getChildAt(i5);
            if (childAt != viewHolder.itemView && childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                RecyclerView.ViewHolder childViewHolder = this.LJIIL.getChildViewHolder(childAt);
                if (this.LJIIIZ.LIZ(this.LJIIL, this.LIZIZ, childViewHolder)) {
                    int abs = Math.abs(i3 - ((childAt.getLeft() + childAt.getRight()) / 2));
                    int abs2 = Math.abs(i4 - ((childAt.getTop() + childAt.getBottom()) / 2));
                    int i6 = (abs * abs) + (abs2 * abs2);
                    int size = this.LJJIFFI.size();
                    int i7 = 0;
                    for (int i8 = 0; i8 < size && i6 > this.LJJII.get(i8).intValue(); i8++) {
                        i7++;
                    }
                    this.LJJIFFI.add(i7, childViewHolder);
                    this.LJJII.add(i7, Integer.valueOf(i6));
                }
            }
        }
        List<RecyclerView.ViewHolder> list2 = this.LJJIFFI;
        if (list2.size() == 0) {
            return;
        }
        RecyclerView.ViewHolder LIZ = AbstractC147148fEM.LIZ(viewHolder, list2, i, i2);
        if (LIZ == null) {
            this.LJJIFFI.clear();
            this.LJJII.clear();
            return;
        }
        int adapterPosition = LIZ.getAdapterPosition();
        viewHolder.getAdapterPosition();
        if (this.LJIIIZ.LIZIZ(this.LJIIL, viewHolder, LIZ)) {
            RecyclerView recyclerView = this.LJIIL;
            RecyclerView.LayoutManager mo25799getLayoutManager2 = recyclerView.mo25799getLayoutManager();
            if (mo25799getLayoutManager2 instanceof AbstractC147157fEV) {
                ((AbstractC147157fEV) mo25799getLayoutManager2).prepareForDrop(viewHolder.itemView, LIZ.itemView, i, i2);
                return;
            }
            if (mo25799getLayoutManager2.canScrollHorizontally()) {
                if (mo25799getLayoutManager2.getDecoratedLeft(LIZ.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(adapterPosition);
                }
                if (mo25799getLayoutManager2.getDecoratedRight(LIZ.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(adapterPosition);
                }
            }
            if (mo25799getLayoutManager2.canScrollVertically()) {
                if (mo25799getLayoutManager2.getDecoratedTop(LIZ.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(adapterPosition);
                }
                if (mo25799getLayoutManager2.getDecoratedBottom(LIZ.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(adapterPosition);
                }
            }
        }
    }

    private int LIZIZ(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        if ((i & 12) != 0) {
            int i3 = 8;
            if (this.f20285LJ > 0.0f) {
                i2 = 8;
            } else {
                i2 = 4;
            }
            VelocityTracker velocityTracker = this.LJIILJJIL;
            if (velocityTracker != null && this.LJIIIIZZ >= 0) {
                AbstractC147148fEM abstractC147148fEM = this.LJIIIZ;
                float f = this.LJIL;
                abstractC147148fEM.LIZIZ(f);
                velocityTracker.computeCurrentVelocity(1000, f);
                float xVelocity = this.LJIILJJIL.getXVelocity(this.LJIIIIZZ);
                float yVelocity = this.LJIILJJIL.getYVelocity(this.LJIIIIZZ);
                if (xVelocity <= 0.0f) {
                    i3 = 4;
                }
                float abs = Math.abs(xVelocity);
                if ((i3 & i) != 0 && i2 == i3 && abs >= this.LJIIIZ.LIZ(this.LJIJJLI) && abs > Math.abs(yVelocity)) {
                    return i3;
                }
            }
            float width = this.LJIIL.getWidth() * 0.5f;
            if ((i & i2) != 0 && Math.abs(this.f20285LJ) > width) {
                return i2;
            }
            return 0;
        }
        return 0;
    }

    private int LIZJ(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        if ((i & 3) != 0) {
            int i3 = 2;
            if (this.LJFF > 0.0f) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            VelocityTracker velocityTracker = this.LJIILJJIL;
            if (velocityTracker != null && this.LJIIIIZZ >= 0) {
                AbstractC147148fEM abstractC147148fEM = this.LJIIIZ;
                float f = this.LJIL;
                abstractC147148fEM.LIZIZ(f);
                velocityTracker.computeCurrentVelocity(1000, f);
                float xVelocity = this.LJIILJJIL.getXVelocity(this.LJIIIIZZ);
                float yVelocity = this.LJIILJJIL.getYVelocity(this.LJIIIIZZ);
                if (yVelocity <= 0.0f) {
                    i3 = 1;
                }
                float abs = Math.abs(yVelocity);
                if ((i3 & i) != 0 && i3 == i2 && abs >= this.LJIIIZ.LIZ(this.LJIJJLI) && abs > Math.abs(xVelocity)) {
                    return i3;
                }
            }
            float height = this.LJIIL.getHeight() * 0.5f;
            if ((i & i2) != 0 && Math.abs(this.LJFF) > height) {
                return i2;
            }
            return 0;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        boolean z = false;
        if (this.LIZIZ != null) {
            LIZ(this.LJIJJ);
            float[] fArr = this.LJIJJ;
            float f = fArr[0];
            float f2 = fArr[1];
        }
        AbstractC147148fEM abstractC147148fEM = this.LJIIIZ;
        RecyclerView.ViewHolder viewHolder = this.LIZIZ;
        List<C0391c> list = this.LJIIJJI;
        int i = this.LJJ;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2);
            canvas.restoreToCount(canvas.save());
        }
        if (viewHolder != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            C0391c c0391c = list.get(i3);
            if (c0391c.LJIILJJIL && !c0391c.LJIIJ) {
                list.remove(i3);
            } else if (!c0391c.LJIILJJIL) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f;
        float f2;
        this.LJIILLIIL = -1;
        if (this.LIZIZ != null) {
            LIZ(this.LJIJJ);
            float[] fArr = this.LJIJJ;
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        AbstractC147148fEM abstractC147148fEM = this.LJIIIZ;
        RecyclerView.ViewHolder viewHolder = this.LIZIZ;
        List<C0391c> list = this.LJIIJJI;
        int i = this.LJJ;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0391c c0391c = list.get(i2);
            if (c0391c.LIZLLL == c0391c.LJFF) {
                c0391c.LJIIJJI = c0391c.LJII.itemView.getTranslationX();
            } else {
                c0391c.LJIIJJI = c0391c.LIZLLL + (c0391c.LJIILL * (c0391c.LJFF - c0391c.LIZLLL));
            }
            if (c0391c.f20286LJ == c0391c.LJI) {
                c0391c.LJIIL = c0391c.LJII.itemView.getTranslationY();
            } else {
                c0391c.LJIIL = c0391c.f20286LJ + (c0391c.LJIILL * (c0391c.LJI - c0391c.f20286LJ));
            }
            int save = canvas.save();
            abstractC147148fEM.LIZ(canvas, recyclerView, c0391c.LJII, c0391c.LJIIJJI, c0391c.LJIIL, c0391c.LJIIIIZZ, false);
            canvas.restoreToCount(save);
        }
        if (viewHolder != null) {
            int save2 = canvas.save();
            abstractC147148fEM.LIZ(canvas, recyclerView, viewHolder, f, f2, i, true);
            canvas.restoreToCount(save2);
        }
    }

    public final void LIZ(int i, MotionEvent motionEvent, int i2) {
        View LIZ;
        RecyclerView.ViewHolder childViewHolder;
        int LIZIZ;
        if (this.LIZIZ != null || i != 2 || this.LJJ == 2 || !this.LJIIIZ.LIZIZ() || this.LJIIL.getScrollState() == 1) {
            return;
        }
        RecyclerView.LayoutManager mo25799getLayoutManager = this.LJIIL.mo25799getLayoutManager();
        int i3 = this.LJIIIIZZ;
        if (i3 != -1) {
            int findPointerIndex = motionEvent.findPointerIndex(i3);
            float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.LIZJ);
            float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.LIZLLL);
            int i4 = this.LJJI;
            if (abs < i4 && abs2 < i4) {
                return;
            }
            if (abs > abs2 && mo25799getLayoutManager.canScrollHorizontally()) {
                return;
            }
            if ((abs2 > abs && mo25799getLayoutManager.canScrollVertically()) || (LIZ = LIZ(motionEvent)) == null || (childViewHolder = this.LJIIL.getChildViewHolder(LIZ)) == null || (LIZIZ = (this.LJIIIZ.LIZIZ(this.LJIIL, childViewHolder) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8) == 0) {
                return;
            }
            float x = motionEvent.getX(i2);
            float y = motionEvent.getY(i2);
            float f = x - this.LIZJ;
            float f2 = y - this.LIZLLL;
            float abs3 = Math.abs(f);
            float abs4 = Math.abs(f2);
            int i5 = this.LJJI;
            if (abs3 < i5 && abs4 < i5) {
                return;
            }
            if (abs3 > abs4) {
                if (f < 0.0f && (LIZIZ & 4) == 0) {
                    return;
                }
                if (f > 0.0f && (LIZIZ & 8) == 0) {
                    return;
                }
            } else if (f2 < 0.0f && (LIZIZ & 1) == 0) {
                return;
            } else {
                if (f2 > 0.0f && (LIZIZ & 2) == 0) {
                    return;
                }
            }
            this.LJFF = 0.0f;
            this.f20285LJ = 0.0f;
            this.LJIIIIZZ = motionEvent.getPointerId(0);
            LIZ(childViewHolder, 1);
        }
    }

    public final void LIZ(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        this.f20285LJ = x - this.LIZJ;
        this.LJFF = y - this.LIZLLL;
        if ((i & 4) == 0) {
            this.f20285LJ = Math.max(0.0f, this.f20285LJ);
        }
        if ((i & 8) == 0) {
            this.f20285LJ = Math.min(0.0f, this.f20285LJ);
        }
        if ((i & 1) == 0) {
            this.LJFF = Math.max(0.0f, this.LJFF);
        }
        if ((i & 2) == 0) {
            this.LJFF = Math.min(0.0f, this.LJFF);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.setEmpty();
    }

    public static boolean LIZ(View view, float f, float f2, float f3, float f4) {
        if (f >= f3 && f <= f3 + view.getWidth() && f2 >= f4 && f2 <= f4 + view.getHeight()) {
            return true;
        }
        return false;
    }
}
