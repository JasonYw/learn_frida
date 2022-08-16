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

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.ui.VideoDoubleCenterLayoutManager */
/* loaded from: classes3.dex */
public final class VideoDoubleCenterLayoutManager extends RecyclerView.LayoutManager {
    public static ChangeQuickRedirect LIZ;
    public final int LIZIZ = LK5.LIZ(2.0f);
    public int LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public int f26458LJ;
    public int LJFF;

    static {
        Covode.recordClassIndex(30460);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return false;
    }

    public VideoDoubleCenterLayoutManager() {
        getWidthMode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (RecyclerView.LayoutParams) proxy.result;
        }
        return new RecyclerView.LayoutParams(-1, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (PatchProxy.proxy(new Object[]{recycler, state}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(recycler, state);
        if (state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            return;
        }
        detachAndScrapAttachedViews(recycler);
        if (!PatchProxy.proxy(new Object[]{state, recycler}, this, LIZ, false, 3).isSupported) {
            int itemCount = state.getItemCount();
            if (itemCount == 0) {
                removeAndRecycleAllViews(recycler);
                return;
            }
            this.LIZJ = (getWidth() - this.LIZIZ) / 2;
            this.LIZLLL = ((getHeight() - this.LIZIZ) / 4) * 3;
            this.f26458LJ = (getWidth() - (this.LIZIZ * 3)) / 4;
            int height = getHeight();
            int i = this.LIZIZ;
            this.LJFF = ((height - i) / 4) + (i / 2);
            for (int i2 = 0; i2 < itemCount; i2++) {
                View viewForPosition = recycler.getViewForPosition(i2);
                Intrinsics.checkNotNullExpressionValue(viewForPosition, "");
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(itemCount), Integer.valueOf(i2), viewForPosition}, this, LIZ, false, 5).isSupported) {
                    if (i2 != 4 && i2 != 5) {
                        viewForPosition.getLayoutParams().width = this.f26458LJ;
                        viewForPosition.getLayoutParams().height = this.LJFF;
                    } else {
                        viewForPosition.getLayoutParams().width = this.LIZJ;
                        viewForPosition.getLayoutParams().height = this.LIZLLL;
                    }
                }
                addView(viewForPosition);
                measureChild(viewForPosition, 0, 0);
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(itemCount), Integer.valueOf(i2), viewForPosition}, this, LIZ, false, 4).isSupported) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            int i3 = i2 % 4;
                            int i4 = this.LIZIZ;
                            int i5 = (this.f26458LJ * i3) + (i3 * i4);
                            int i6 = i4 + this.LIZLLL;
                            layoutDecorated(viewForPosition, i5, i6, i5 + getDecoratedMeasuredWidth(viewForPosition), i6 + getDecoratedMeasuredHeight(viewForPosition));
                        } else {
                            layoutDecorated(viewForPosition, this.LIZIZ + this.LIZJ, 0, getWidth(), getDecoratedMeasuredHeight(viewForPosition));
                        }
                    } else {
                        layoutDecorated(viewForPosition, 0, 0, getDecoratedMeasuredWidth(viewForPosition), getDecoratedMeasuredHeight(viewForPosition));
                    }
                }
            }
        }
    }
}
