package androidx.recyclerview.widget;

import android.util.Pair;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p003X.C72876EoY;

/* loaded from: classes28.dex */
public abstract class AvatarLayoutManager extends RecyclerView.LayoutManager {
    public C72876EoY LIZ;

    static {
        Covode.recordClassIndex(1656);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return LIZ(this, i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return LIZIZ(this, i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setRecyclerView(RecyclerView recyclerView) {
        if (recyclerView instanceof C72876EoY) {
            super.setRecyclerView(recyclerView);
            this.LIZ = (C72876EoY) recyclerView;
            return;
        }
        throw new IllegalArgumentException("AvatarLayoutManager only support AvatarRecyclerView");
    }

    public final void LIZ(View view, int i) {
        this.LIZ.LIZ(view, i);
    }

    public final void LIZ(View view, int i, int i2) {
        if (this.LIZ != null) {
            view.offsetLeftAndRight(i);
            view.offsetTopAndBottom(i2);
        }
    }

    public static int LIZ(AvatarLayoutManager avatarLayoutManager, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            throw new IllegalAccessError("scrollHorizontallyBy not support please use scrollHorAndVerBy");
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    public static int LIZIZ(AvatarLayoutManager avatarLayoutManager, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            throw new IllegalAccessError("scrollVerticallyBy not support please use scrollHorAndVerBy");
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    public Pair<Integer, Integer> LIZ(int i, int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return new Pair<>(0, 0);
    }
}
