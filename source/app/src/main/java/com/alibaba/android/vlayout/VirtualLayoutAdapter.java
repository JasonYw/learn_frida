package com.alibaba.android.vlayout;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes19.dex */
public abstract class VirtualLayoutAdapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    public VirtualLayoutManager mLayoutManager;

    static {
        Covode.recordClassIndex(4356);
    }

    public List<LayoutHelper> getLayoutHelpers() {
        return this.mLayoutManager.getLayoutHelpers();
    }

    public VirtualLayoutAdapter(VirtualLayoutManager virtualLayoutManager) {
        this.mLayoutManager = virtualLayoutManager;
    }

    public void setLayoutHelpers(List<LayoutHelper> list) {
        this.mLayoutManager.setLayoutHelpers(list);
    }
}
