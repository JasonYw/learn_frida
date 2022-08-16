package com.bytedance.android.live.liveinteract.videotalk.p391ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.ui.VideoTeamFightLayoutManager */
/* loaded from: classes3.dex */
public final class VideoTeamFightLayoutManager extends RecyclerView.LayoutManager {
    public static ChangeQuickRedirect LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    static {
        Covode.recordClassIndex(30465);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (RecyclerView.LayoutParams) proxy.result;
        }
        return new RecyclerView.LayoutParams(-2, -2);
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
            for (int i = 0; i < itemCount; i++) {
                View viewForPosition = recycler.getViewForPosition(i);
                Intrinsics.checkNotNullExpressionValue(viewForPosition, "");
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), viewForPosition}, this, LIZ, false, 5).isSupported) {
                    if (i != 0) {
                        viewForPosition.getLayoutParams().width = this.LIZJ;
                        viewForPosition.getLayoutParams().height = this.LIZLLL;
                    } else {
                        viewForPosition.getLayoutParams().width = -1;
                        viewForPosition.getLayoutParams().height = this.LIZIZ;
                    }
                }
                addView(viewForPosition);
                measureChild(viewForPosition, 0, 0);
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), viewForPosition}, this, LIZ, false, 4).isSupported) {
                    if (i != 0) {
                        int i2 = i - 1;
                        int i3 = this.LIZJ;
                        int i4 = (i2 % 4) * i3;
                        int i5 = this.LIZIZ;
                        int i6 = this.LIZLLL;
                        int i7 = i5 + ((i2 / 4) * i6);
                        layoutDecorated(viewForPosition, i4, i7, i3 + i4, i7 + i6);
                    } else {
                        layoutDecorated(viewForPosition, 0, 0, getDecoratedMeasuredWidth(viewForPosition), this.LIZIZ);
                    }
                }
            }
        }
    }

    public VideoTeamFightLayoutManager(int i, int i2, int i3) {
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
    }
}
