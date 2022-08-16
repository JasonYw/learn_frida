package com.bytedance.android.live.core.viewholder;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class MemorySafeGridLayoutManager extends GridLayoutManager {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(24220);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemorySafeGridLayoutManager(Context context, int i) {
        super(context, 2);
        C106862S5w.LIZ(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        if (PatchProxy.proxy(new Object[]{recyclerView, recycler}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(recyclerView);
        super.onDetachedFromWindow(recyclerView, recycler);
        RecyclerView.Adapter mo25798getAdapter = recyclerView.mo25798getAdapter();
        if (mo25798getAdapter != null) {
            for (int itemCount = mo25798getAdapter.getItemCount() - 1; itemCount >= 0; itemCount--) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(itemCount);
                if (findViewHolderForAdapterPosition instanceof AbstractC4161a) {
                    ((AbstractC4161a) findViewHolderForAdapterPosition).LIZ();
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemorySafeGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C106862S5w.LIZ(context);
    }
}
