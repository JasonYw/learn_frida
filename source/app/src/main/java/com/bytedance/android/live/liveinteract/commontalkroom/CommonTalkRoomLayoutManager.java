package com.bytedance.android.live.liveinteract.commontalkroom;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.config.ba$a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C81013HwV;
import p003X.C81038Hwu;

/* loaded from: classes3.dex */
public final class CommonTalkRoomLayoutManager extends RecyclerView.LayoutManager {
    public static ChangeQuickRedirect LIZ;
    public final C81038Hwu LIZIZ;
    public ba$a LIZJ;

    static {
        Covode.recordClassIndex(26559);
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

    public CommonTalkRoomLayoutManager(C81038Hwu c81038Hwu, ba$a ba_a) {
        C106862S5w.LIZ(c81038Hwu);
        this.LIZIZ = c81038Hwu;
        this.LIZJ = ba_a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        ba$a ba_a;
        ArrayList<ba$a.C6845b> arrayList;
        Integer num;
        C81013HwV c81013HwV;
        C81013HwV c81013HwV2;
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
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), viewForPosition}, this, LIZ, false, 5).isSupported && (ba_a = this.LIZJ) != null && (arrayList = ba_a.LIZIZ) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (((ba$a.C6845b) obj).LJI) {
                            arrayList2.add(obj);
                        }
                    }
                    ba$a.C6845b c6845b = (ba$a.C6845b) arrayList2.get(i);
                    if (c6845b != null) {
                        ViewGroup.LayoutParams layoutParams = viewForPosition.getLayoutParams();
                        float f = this.LIZIZ.LIZJ;
                        ba$a ba_a2 = this.LIZJ;
                        Integer num2 = null;
                        if (ba_a2 != null && (c81013HwV2 = ba_a2.LIZ) != null) {
                            num = Integer.valueOf(c81013HwV2.LIZ);
                        } else {
                            num = null;
                        }
                        layoutParams.width = (int) (f * c6845b.LIZIZ(num));
                        ViewGroup.LayoutParams layoutParams2 = viewForPosition.getLayoutParams();
                        float f2 = this.LIZIZ.LIZLLL;
                        ba$a ba_a3 = this.LIZJ;
                        if (ba_a3 != null && (c81013HwV = ba_a3.LIZ) != null) {
                            num2 = Integer.valueOf(c81013HwV.LIZIZ);
                        }
                        layoutParams2.height = (int) (f2 * c6845b.LIZLLL(num2));
                    }
                }
                addView(viewForPosition);
                measureChild(viewForPosition, 0, 0);
                LIZ(itemCount, i, viewForPosition);
            }
        }
    }

    private final void LIZ(int i, int i2, View view) {
        ba$a ba_a;
        ArrayList<ba$a.C6845b> arrayList;
        Integer num;
        C81013HwV c81013HwV;
        C81013HwV c81013HwV2;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), view}, this, LIZ, false, 4).isSupported && (ba_a = this.LIZJ) != null && (arrayList = ba_a.LIZIZ) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((ba$a.C6845b) obj).LJI) {
                    arrayList2.add(obj);
                }
            }
            ba$a.C6845b c6845b = (ba$a.C6845b) arrayList2.get(i2);
            if (c6845b != null) {
                float f = this.LIZIZ.LIZJ;
                ba$a ba_a2 = this.LIZJ;
                Integer num2 = null;
                if (ba_a2 != null && (c81013HwV2 = ba_a2.LIZ) != null) {
                    num = Integer.valueOf(c81013HwV2.LIZ);
                } else {
                    num = null;
                }
                int LIZ2 = (int) ((f * c6845b.LIZ(num)) + this.LIZIZ.LIZ);
                float f2 = this.LIZIZ.LIZLLL;
                ba$a ba_a3 = this.LIZJ;
                if (ba_a3 != null && (c81013HwV = ba_a3.LIZ) != null) {
                    num2 = Integer.valueOf(c81013HwV.LIZIZ);
                }
                int LIZJ = (int) (f2 * c6845b.LIZJ(num2));
                layoutDecorated(view, LIZ2, LIZJ, LIZ2 + getDecoratedMeasuredWidth(view), LIZJ + getDecoratedMeasuredHeight(view));
            }
        }
    }
}
