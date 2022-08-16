package com.alibaba.android.vlayout;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.android.vlayout.extend.InnerRecycledViewPool;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public abstract class RecyclablePagerAdapter<VH extends RecyclerView.ViewHolder> extends PagerAdapter {
    public RecyclerView.Adapter<VH> mAdapter;
    public InnerRecycledViewPool mRecycledViewPool;

    static {
        Covode.recordClassIndex(4352);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public abstract int getCount();

    public abstract int getItemViewType(int i);

    public abstract void onBindViewHolder(VH vh, int i);

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        if ((obj instanceof RecyclerView.ViewHolder) && ((RecyclerView.ViewHolder) obj).itemView == view) {
            return true;
        }
        return false;
    }

    public RecyclablePagerAdapter(RecyclerView.Adapter<VH> adapter, RecyclerView.RecycledViewPool recycledViewPool) {
        this.mAdapter = adapter;
        if (recycledViewPool instanceof InnerRecycledViewPool) {
            this.mRecycledViewPool = (InnerRecycledViewPool) recycledViewPool;
        } else {
            this.mRecycledViewPool = new InnerRecycledViewPool(recycledViewPool);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        int itemViewType = getItemViewType(i);
        RecyclerView.ViewHolder recycledView = this.mRecycledViewPool.getRecycledView(itemViewType);
        if (recycledView == null) {
            recycledView = this.mAdapter.createViewHolder(viewGroup, itemViewType);
        }
        onBindViewHolder(recycledView, i);
        ViewPager.LayoutParams layoutParams = new ViewPager.LayoutParams();
        if (recycledView.itemView.getLayoutParams() != null) {
            layoutParams.width = recycledView.itemView.getLayoutParams().width;
            layoutParams.height = recycledView.itemView.getLayoutParams().height;
        }
        viewGroup.addView(recycledView.itemView, layoutParams);
        return recycledView;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof RecyclerView.ViewHolder) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj;
            viewGroup.removeView(viewHolder.itemView);
            this.mRecycledViewPool.putRecycledView(viewHolder);
        }
    }
}
