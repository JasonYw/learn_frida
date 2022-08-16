package com.bytedance.android.live.liveinteract.videotalk.p391ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.ui.CEqualLayoutManager */
/* loaded from: classes3.dex */
public final class CEqualLayoutManager extends RecyclerView.LayoutManager {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;
    public final int LIZJ = LK5.LIZ(2.0f);
    public int LIZLLL;

    /* renamed from: LJ */
    public int f26456LJ;
    public int LJFF;

    static {
        Covode.recordClassIndex(30437);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return false;
    }

    public CEqualLayoutManager() {
        getWidthMode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (RecyclerView.LayoutParams) proxy.result;
        }
        return new RecyclerView.LayoutParams(-1, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (PatchProxy.proxy(new Object[]{recycler, state}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(recycler, state);
        if (state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            return;
        }
        detachAndScrapAttachedViews(recycler);
        if (!PatchProxy.proxy(new Object[]{state, recycler}, this, LIZ, false, 5).isSupported) {
            int itemCount = state.getItemCount();
            if (itemCount == 0) {
                removeAndRecycleAllViews(recycler);
                return;
            }
            for (int i = 0; i < itemCount; i++) {
                View viewForPosition = recycler.getViewForPosition(i);
                Intrinsics.checkNotNullExpressionValue(viewForPosition, "");
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(itemCount), Integer.valueOf(i), viewForPosition}, this, LIZ, false, 7).isSupported) {
                    if (i == this.LIZIZ) {
                        this.LIZLLL = (getWidth() - (this.LIZJ * 2)) / 2;
                        viewForPosition.getLayoutParams().width = this.LIZLLL;
                        viewForPosition.getLayoutParams().height = -1;
                    } else {
                        this.f26456LJ = ((getWidth() - (this.LIZJ * 2)) / 2) / 2;
                        this.LJFF = (getHeight() - (this.LIZJ * 3)) / 4;
                        viewForPosition.getLayoutParams().width = this.f26456LJ;
                        viewForPosition.getLayoutParams().height = this.LJFF;
                    }
                }
                addView(viewForPosition);
                measureChild(viewForPosition, 0, 0);
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(itemCount), Integer.valueOf(i), viewForPosition}, this, LIZ, false, 6).isSupported) {
                    if (i == this.LIZIZ) {
                        layoutDecorated(viewForPosition, 0, 0, getDecoratedMeasuredWidth(viewForPosition), getDecoratedMeasuredHeight(viewForPosition));
                    } else {
                        int i2 = i - 1;
                        int i3 = i2 % 2;
                        int i4 = i2 / 2;
                        int i5 = this.LIZLLL;
                        int i6 = this.LIZJ;
                        int i7 = i5 + i6 + (this.f26456LJ * i3) + (i3 * i6);
                        int i8 = (this.LJFF * i4) + (i4 * i6);
                        layoutDecorated(viewForPosition, i7, i8, i7 + getDecoratedMeasuredWidth(viewForPosition), i8 + getDecoratedMeasuredHeight(viewForPosition));
                    }
                }
            }
        }
    }
}
