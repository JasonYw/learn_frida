package com.alibaba.android.vlayout.extend;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.io.Closeable;

/* loaded from: classes19.dex */
public final class InnerRecycledViewPool extends RecyclerView.RecycledViewPool {
    public static int DEFAULT_MAX_SIZE = 20;
    public RecyclerView.RecycledViewPool mInnerPool;
    public SparseIntArray mMaxScrap;
    public SparseIntArray mScrapLength;

    static {
        Covode.recordClassIndex(4367);
    }

    public InnerRecycledViewPool() {
        this(new RecyclerView.RecycledViewPool());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final int size() {
        int size = this.mScrapLength.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.mScrapLength.valueAt(i2);
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final void clear() {
        int size = this.mScrapLength.size();
        for (int i = 0; i < size; i++) {
            int keyAt = this.mScrapLength.keyAt(i);
            RecyclerView.ViewHolder recycledView = this.mInnerPool.getRecycledView(keyAt);
            while (recycledView != null) {
                destroyViewHolder(recycledView);
                recycledView = this.mInnerPool.getRecycledView(keyAt);
            }
        }
        this.mScrapLength.clear();
        super.clear();
    }

    public final void setDefaultMaxSize(int i) {
        DEFAULT_MAX_SIZE = i;
    }

    public InnerRecycledViewPool(RecyclerView.RecycledViewPool recycledViewPool) {
        this.mScrapLength = new SparseIntArray();
        this.mMaxScrap = new SparseIntArray();
        this.mInnerPool = recycledViewPool;
    }

    private void destroyViewHolder(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        if (view instanceof Closeable) {
            try {
                ((Closeable) view).close();
            } catch (Exception unused) {
            }
        }
        if (viewHolder instanceof Closeable) {
            try {
                ((Closeable) viewHolder).close();
            } catch (Exception unused2) {
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final RecyclerView.ViewHolder getRecycledView(int i) {
        int i2;
        RecyclerView.ViewHolder recycledView = this.mInnerPool.getRecycledView(i);
        if (recycledView != null && this.mScrapLength.indexOfKey(i) >= 0 && (i2 = this.mScrapLength.get(i)) > 0) {
            this.mScrapLength.put(i, i2 - 1);
        }
        return recycledView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final void putRecycledView(RecyclerView.ViewHolder viewHolder) {
        int i;
        int itemViewType = viewHolder.getItemViewType();
        if (this.mMaxScrap.indexOfKey(itemViewType) < 0) {
            this.mMaxScrap.put(itemViewType, DEFAULT_MAX_SIZE);
            setMaxRecycledViews(itemViewType, DEFAULT_MAX_SIZE);
        }
        if (this.mScrapLength.indexOfKey(itemViewType) >= 0) {
            i = this.mScrapLength.get(itemViewType);
        } else {
            i = 0;
        }
        if (this.mMaxScrap.get(itemViewType) > i) {
            this.mInnerPool.putRecycledView(viewHolder);
            this.mScrapLength.put(itemViewType, i + 1);
            return;
        }
        destroyViewHolder(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final void setMaxRecycledViews(int i, int i2) {
        RecyclerView.ViewHolder recycledView = this.mInnerPool.getRecycledView(i);
        while (recycledView != null) {
            destroyViewHolder(recycledView);
            recycledView = this.mInnerPool.getRecycledView(i);
        }
        this.mMaxScrap.put(i, i2);
        this.mScrapLength.put(i, 0);
        this.mInnerPool.setMaxRecycledViews(i, i2);
    }
}
