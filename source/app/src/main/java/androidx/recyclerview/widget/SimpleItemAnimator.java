package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* loaded from: classes15.dex */
public abstract class SimpleItemAnimator extends RecyclerView.ItemAnimator {
    public boolean mSupportsChangeAnimations = true;

    static {
        Covode.recordClassIndex(1726);
    }

    public abstract boolean animateAdd(RecyclerView.ViewHolder viewHolder);

    public abstract boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4);

    public abstract boolean animateMove(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4);

    public abstract boolean animateRemove(RecyclerView.ViewHolder viewHolder);

    public void onAddFinished(RecyclerView.ViewHolder viewHolder) {
    }

    public void onAddStarting(RecyclerView.ViewHolder viewHolder) {
    }

    public void onChangeFinished(RecyclerView.ViewHolder viewHolder, boolean z) {
    }

    public void onChangeStarting(RecyclerView.ViewHolder viewHolder, boolean z) {
    }

    public void onMoveFinished(RecyclerView.ViewHolder viewHolder) {
    }

    public void onMoveStarting(RecyclerView.ViewHolder viewHolder) {
    }

    public void onRemoveFinished(RecyclerView.ViewHolder viewHolder) {
    }

    public void onRemoveStarting(RecyclerView.ViewHolder viewHolder) {
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    public final void dispatchAddStarting(RecyclerView.ViewHolder viewHolder) {
        onAddStarting(viewHolder);
    }

    public final void dispatchMoveStarting(RecyclerView.ViewHolder viewHolder) {
        onMoveStarting(viewHolder);
    }

    public final void dispatchRemoveStarting(RecyclerView.ViewHolder viewHolder) {
        onRemoveStarting(viewHolder);
    }

    public void setSupportsChangeAnimations(boolean z) {
        this.mSupportsChangeAnimations = z;
    }

    public final void dispatchAddFinished(RecyclerView.ViewHolder viewHolder) {
        onAddFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    public final void dispatchMoveFinished(RecyclerView.ViewHolder viewHolder) {
        onMoveFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    public final void dispatchRemoveFinished(RecyclerView.ViewHolder viewHolder) {
        onRemoveFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewHolder) {
        if (this.mSupportsChangeAnimations && !viewHolder.isInvalid()) {
            return false;
        }
        return true;
    }

    public final void dispatchChangeStarting(RecyclerView.ViewHolder viewHolder, boolean z) {
        onChangeStarting(viewHolder, z);
    }

    public final void dispatchChangeFinished(RecyclerView.ViewHolder viewHolder, boolean z) {
        onChangeFinished(viewHolder, z);
        dispatchAnimationFinished(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animatePersistence(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.C0376c c0376c, RecyclerView.ItemAnimator.C0376c c0376c2) {
        if (c0376c.LIZ == c0376c2.LIZ && c0376c.LIZIZ == c0376c2.LIZIZ) {
            dispatchMoveFinished(viewHolder);
            return false;
        }
        return animateMove(viewHolder, c0376c.LIZ, c0376c.LIZIZ, c0376c2.LIZ, c0376c2.LIZIZ);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateAppearance(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.C0376c c0376c, RecyclerView.ItemAnimator.C0376c c0376c2) {
        if (c0376c != null && (c0376c.LIZ != c0376c2.LIZ || c0376c.LIZIZ != c0376c2.LIZIZ)) {
            return animateMove(viewHolder, c0376c.LIZ, c0376c.LIZIZ, c0376c2.LIZ, c0376c2.LIZIZ);
        }
        return animateAdd(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateDisappearance(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.C0376c c0376c, RecyclerView.ItemAnimator.C0376c c0376c2) {
        int i;
        int i2;
        int i3 = c0376c.LIZ;
        int i4 = c0376c.LIZIZ;
        View view = viewHolder.itemView;
        if (c0376c2 == null) {
            i = view.getLeft();
        } else {
            i = c0376c2.LIZ;
        }
        if (c0376c2 == null) {
            i2 = view.getTop();
        } else {
            i2 = c0376c2.LIZIZ;
        }
        if (!viewHolder.isRemoved() && (i3 != i || i4 != i2)) {
            view.layout(i, i2, view.getWidth() + i, view.getHeight() + i2);
            return animateMove(viewHolder, i3, i4, i, i2);
        }
        return animateRemove(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, RecyclerView.ItemAnimator.C0376c c0376c, RecyclerView.ItemAnimator.C0376c c0376c2) {
        int i;
        int i2;
        int i3 = c0376c.LIZ;
        int i4 = c0376c.LIZIZ;
        if (viewHolder2.shouldIgnore()) {
            i = c0376c.LIZ;
            i2 = c0376c.LIZIZ;
        } else {
            i = c0376c2.LIZ;
            i2 = c0376c2.LIZIZ;
        }
        return animateChange(viewHolder, viewHolder2, i3, i4, i, i2);
    }
}
