package com.alibaba.android.vlayout;

import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.vlayout.layout.SingleLayoutHelper;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes19.dex */
public class DelegateAdapter extends VirtualLayoutAdapter<RecyclerView.ViewHolder> {
    public long[] cantorReverse;
    public final List<Pair<AdapterDataObserver, Adapter>> mAdapters;
    public final boolean mHasConsistItemType;
    public int mIndex;
    public final SparseArray<Pair<AdapterDataObserver, Adapter>> mIndexAry;
    public AtomicInteger mIndexGen;
    public SparseArray<Adapter> mItemTypeAry;
    public int mTotal;

    static {
        Covode.recordClassIndex(4328);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z) {
    }

    /* loaded from: classes19.dex */
    public class AdapterDataObserver extends RecyclerView.AdapterDataObserver {
        public int mIndex;
        public int mStartPosition;

        static {
            Covode.recordClassIndex(4330);
        }

        public int getIndex() {
            return this.mIndex;
        }

        public int getStartPosition() {
            return this.mStartPosition;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            if (!updateLayoutHelper()) {
                return;
            }
            DelegateAdapter.this.notifyDataSetChanged();
        }

        private boolean updateLayoutHelper() {
            int findAdapterPositionByIndex;
            int i = this.mIndex;
            if (i < 0 || (findAdapterPositionByIndex = DelegateAdapter.this.findAdapterPositionByIndex(i)) < 0) {
                return false;
            }
            Pair<AdapterDataObserver, Adapter> pair = DelegateAdapter.this.mAdapters.get(findAdapterPositionByIndex);
            LinkedList linkedList = new LinkedList(DelegateAdapter.this.getLayoutHelpers());
            LayoutHelper layoutHelper = (LayoutHelper) linkedList.get(findAdapterPositionByIndex);
            if (layoutHelper.getItemCount() != ((RecyclerView.Adapter) pair.second).getItemCount()) {
                layoutHelper.setItemCount(((RecyclerView.Adapter) pair.second).getItemCount());
                DelegateAdapter.this.mTotal = this.mStartPosition + ((RecyclerView.Adapter) pair.second).getItemCount();
                for (int i2 = findAdapterPositionByIndex + 1; i2 < DelegateAdapter.this.mAdapters.size(); i2++) {
                    Pair<AdapterDataObserver, Adapter> pair2 = DelegateAdapter.this.mAdapters.get(i2);
                    ((AdapterDataObserver) pair2.first).mStartPosition = DelegateAdapter.this.mTotal;
                    DelegateAdapter.access$112(DelegateAdapter.this, ((RecyclerView.Adapter) pair2.second).getItemCount());
                }
                DelegateAdapter.super.setLayoutHelpers(linkedList);
            }
            return true;
        }

        public void updateStartPositionAndIndex(int i, int i2) {
            this.mStartPosition = i;
            this.mIndex = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            if (!updateLayoutHelper()) {
                return;
            }
            DelegateAdapter.this.notifyItemRangeChanged(this.mStartPosition + i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            if (!updateLayoutHelper()) {
                return;
            }
            DelegateAdapter.this.notifyItemRangeInserted(this.mStartPosition + i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            if (!updateLayoutHelper()) {
                return;
            }
            DelegateAdapter.this.notifyItemRangeRemoved(this.mStartPosition + i, i2);
        }

        public AdapterDataObserver(int i, int i2) {
            this.mIndex = -1;
            this.mStartPosition = i;
            this.mIndex = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            if (!updateLayoutHelper()) {
                return;
            }
            DelegateAdapter.this.notifyItemRangeChanged(this.mStartPosition + i, i2, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            if (!updateLayoutHelper()) {
                return;
            }
            DelegateAdapter delegateAdapter = DelegateAdapter.this;
            int i4 = this.mStartPosition;
            delegateAdapter.notifyItemMoved(i + i4, i4 + i2);
        }
    }

    /* loaded from: classes19.dex */
    public static class SimpleViewAdapter extends Adapter<RecyclerView.ViewHolder> {
        public LayoutHelper mLayoutHelper;
        public View mView;

        static {
            Covode.recordClassIndex(4331);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        }

        @Override // com.alibaba.android.vlayout.DelegateAdapter.Adapter
        public LayoutHelper onCreateLayoutHelper() {
            return this.mLayoutHelper;
        }

        public SimpleViewAdapter(View view) {
            this(view, new SingleLayoutHelper());
        }

        public SimpleViewAdapter(View view, LayoutHelper layoutHelper) {
            this.mView = view;
            this.mLayoutHelper = layoutHelper;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new SimpleViewHolder(this.mView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mTotal;
    }

    public int getAdaptersCount() {
        List<Pair<AdapterDataObserver, Adapter>> list = this.mAdapters;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void removeFirstAdapter() {
        List<Pair<AdapterDataObserver, Adapter>> list = this.mAdapters;
        if (list != null && !list.isEmpty()) {
            removeAdapter((Adapter) this.mAdapters.get(0).second);
        }
    }

    public void removeLastAdapter() {
        List<Pair<AdapterDataObserver, Adapter>> list = this.mAdapters;
        if (list != null && !list.isEmpty()) {
            List<Pair<AdapterDataObserver, Adapter>> list2 = this.mAdapters;
            removeAdapter((Adapter) list2.get(list2.size() - 1).second);
        }
    }

    public void clear() {
        this.mTotal = 0;
        this.mIndex = 0;
        AtomicInteger atomicInteger = this.mIndexGen;
        if (atomicInteger != null) {
            atomicInteger.set(0);
        }
        this.mLayoutManager.setLayoutHelpers(null);
        for (Pair<AdapterDataObserver, Adapter> pair : this.mAdapters) {
            ((RecyclerView.Adapter) pair.second).unregisterAdapterDataObserver((RecyclerView.AdapterDataObserver) pair.first);
        }
        this.mItemTypeAry.clear();
        this.mAdapters.clear();
        this.mIndexAry.clear();
    }

    /* loaded from: classes19.dex */
    public static class SimpleViewHolder extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(4332);
        }

        public SimpleViewHolder(View view) {
            super(view);
        }
    }

    public DelegateAdapter(VirtualLayoutManager virtualLayoutManager) {
        this(virtualLayoutManager, false, false);
    }

    public static Adapter<? extends RecyclerView.ViewHolder> simpleAdapter(View view) {
        return new SimpleViewAdapter(view);
    }

    @Override // com.alibaba.android.vlayout.VirtualLayoutAdapter
    public void setLayoutHelpers(List<LayoutHelper> list) {
        throw new UnsupportedOperationException("DelegateAdapter doesn't support setLayoutHelpers directly");
    }

    public void addAdapter(Adapter adapter) {
        addAdapters(Collections.singletonList(adapter));
    }

    public void addAdapters(List<Adapter> list) {
        addAdapters(this.mAdapters.size(), list);
    }

    public Adapter findAdapterByIndex(int i) {
        return (Adapter) this.mIndexAry.get(i).second;
    }

    public int findOffsetPosition(int i) {
        Pair<AdapterDataObserver, Adapter> findAdapterByPosition = findAdapterByPosition(i);
        if (findAdapterByPosition == null) {
            return -1;
        }
        return i - ((AdapterDataObserver) findAdapterByPosition.first).mStartPosition;
    }

    public void removeAdapter(Adapter adapter) {
        if (adapter == null) {
            return;
        }
        removeAdapters(Collections.singletonList(adapter));
    }

    public int findAdapterPositionByIndex(int i) {
        Pair<AdapterDataObserver, Adapter> pair = this.mIndexAry.get(i);
        if (pair == null) {
            return -1;
        }
        return this.mAdapters.indexOf(pair);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        Pair<AdapterDataObserver, Adapter> findAdapterByPosition;
        super.onViewAttachedToWindow(viewHolder);
        int position = viewHolder.getPosition();
        if (position >= 0 && (findAdapterByPosition = findAdapterByPosition(position)) != null) {
            ((RecyclerView.Adapter) findAdapterByPosition.second).onViewAttachedToWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        Pair<AdapterDataObserver, Adapter> findAdapterByPosition;
        super.onViewDetachedFromWindow(viewHolder);
        int position = viewHolder.getPosition();
        if (position >= 0 && (findAdapterByPosition = findAdapterByPosition(position)) != null) {
            ((RecyclerView.Adapter) findAdapterByPosition.second).onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        Pair<AdapterDataObserver, Adapter> findAdapterByPosition;
        super.onViewRecycled(viewHolder);
        int position = viewHolder.getPosition();
        if (position >= 0 && (findAdapterByPosition = findAdapterByPosition(position)) != null) {
            ((RecyclerView.Adapter) findAdapterByPosition.second).onViewRecycled(viewHolder);
        }
    }

    public void removeAdapter(int i) {
        if (i >= 0 && i < this.mAdapters.size()) {
            removeAdapter((Adapter) this.mAdapters.get(i).second);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        Pair<AdapterDataObserver, Adapter> findAdapterByPosition = findAdapterByPosition(i);
        if (findAdapterByPosition == null) {
            return -1L;
        }
        long itemId = ((RecyclerView.Adapter) findAdapterByPosition.second).getItemId(i - ((AdapterDataObserver) findAdapterByPosition.first).mStartPosition);
        if (itemId < 0) {
            return -1L;
        }
        return Cantor.getCantor(((AdapterDataObserver) findAdapterByPosition.first).mIndex, itemId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        Pair<AdapterDataObserver, Adapter> findAdapterByPosition = findAdapterByPosition(i);
        if (findAdapterByPosition == null) {
            return -1;
        }
        int itemViewType = ((RecyclerView.Adapter) findAdapterByPosition.second).getItemViewType(i - ((AdapterDataObserver) findAdapterByPosition.first).mStartPosition);
        if (itemViewType < 0) {
            return itemViewType;
        }
        if (this.mHasConsistItemType) {
            this.mItemTypeAry.put(itemViewType, findAdapterByPosition.second);
            return itemViewType;
        }
        return (int) Cantor.getCantor(itemViewType, ((AdapterDataObserver) findAdapterByPosition.first).mIndex);
    }

    public Pair<AdapterDataObserver, Adapter> findAdapterByPosition(int i) {
        int size = this.mAdapters.size();
        if (size == 0) {
            return null;
        }
        int i2 = 0;
        int i3 = size - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) / 2;
            Pair<AdapterDataObserver, Adapter> pair = this.mAdapters.get(i4);
            int itemCount = (((AdapterDataObserver) pair.first).mStartPosition + ((RecyclerView.Adapter) pair.second).getItemCount()) - 1;
            if (((AdapterDataObserver) pair.first).mStartPosition > i) {
                i3 = i4 - 1;
            } else if (itemCount < i) {
                i2 = i4 + 1;
            } else if (((AdapterDataObserver) pair.first).mStartPosition <= i && itemCount >= i) {
                return pair;
            }
        }
        return null;
    }

    public void removeAdapters(List<Adapter> list) {
        if (list != null && !list.isEmpty()) {
            LinkedList linkedList = new LinkedList(super.getLayoutHelpers());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Adapter adapter = list.get(i);
                Iterator<Pair<AdapterDataObserver, Adapter>> it = this.mAdapters.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Pair<AdapterDataObserver, Adapter> next = it.next();
                        RecyclerView.Adapter adapter2 = (RecyclerView.Adapter) next.second;
                        if (adapter2.equals(adapter)) {
                            adapter2.unregisterAdapterDataObserver((RecyclerView.AdapterDataObserver) next.first);
                            int findAdapterPositionByIndex = findAdapterPositionByIndex(((AdapterDataObserver) next.first).mIndex);
                            if (findAdapterPositionByIndex >= 0 && findAdapterPositionByIndex < linkedList.size()) {
                                linkedList.remove(findAdapterPositionByIndex);
                            }
                            it.remove();
                        }
                    }
                }
            }
            List<Adapter> arrayList = new ArrayList<>();
            for (Pair<AdapterDataObserver, Adapter> pair : this.mAdapters) {
                arrayList.add(pair.second);
            }
            setAdapters(arrayList);
        }
    }

    public void setAdapters(List<Adapter> list) {
        int incrementAndGet;
        clear();
        if (list == null) {
            list = Collections.emptyList();
        }
        LinkedList linkedList = new LinkedList();
        this.mTotal = 0;
        boolean z = true;
        for (Adapter adapter : list) {
            int i = this.mTotal;
            AtomicInteger atomicInteger = this.mIndexGen;
            if (atomicInteger == null) {
                incrementAndGet = this.mIndex;
                this.mIndex = incrementAndGet + 1;
            } else {
                incrementAndGet = atomicInteger.incrementAndGet();
            }
            AdapterDataObserver adapterDataObserver = new AdapterDataObserver(i, incrementAndGet);
            adapter.registerAdapterDataObserver(adapterDataObserver);
            if (z && adapter.hasStableIds()) {
                z = true;
            } else {
                z = false;
            }
            LayoutHelper onCreateLayoutHelper = adapter.onCreateLayoutHelper();
            onCreateLayoutHelper.setItemCount(adapter.getItemCount());
            this.mTotal += onCreateLayoutHelper.getItemCount();
            linkedList.add(onCreateLayoutHelper);
            Pair<AdapterDataObserver, Adapter> create = Pair.create(adapterDataObserver, adapter);
            this.mIndexAry.put(adapterDataObserver.mIndex, create);
            this.mAdapters.add(create);
        }
        if (!hasObservers()) {
            super.setHasStableIds(z);
        }
        super.setLayoutHelpers(linkedList);
    }

    public static /* synthetic */ int access$112(DelegateAdapter delegateAdapter, int i) {
        int i2 = delegateAdapter.mTotal + i;
        delegateAdapter.mTotal = i2;
        return i2;
    }

    public void addAdapter(int i, Adapter adapter) {
        addAdapters(i, Collections.singletonList(adapter));
    }

    public DelegateAdapter(VirtualLayoutManager virtualLayoutManager, boolean z) {
        this(virtualLayoutManager, z, false);
    }

    public static Adapter<? extends RecyclerView.ViewHolder> simpleAdapter(View view, LayoutHelper layoutHelper) {
        return new SimpleViewAdapter(view, layoutHelper);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Pair<AdapterDataObserver, Adapter> findAdapterByPosition = findAdapterByPosition(i);
        if (findAdapterByPosition == null) {
            return;
        }
        ((RecyclerView.Adapter) findAdapterByPosition.second).onBindViewHolder(viewHolder, i - ((AdapterDataObserver) findAdapterByPosition.first).mStartPosition);
        ((Adapter) findAdapterByPosition.second).onBindViewHolderWithOffset(viewHolder, i - ((AdapterDataObserver) findAdapterByPosition.first).mStartPosition, i);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.mHasConsistItemType) {
            Adapter adapter = this.mItemTypeAry.get(i);
            if (adapter == null) {
                return null;
            }
            return adapter.onCreateViewHolder(viewGroup, i);
        }
        Cantor.reverseCantor(i, this.cantorReverse);
        long[] jArr = this.cantorReverse;
        int i2 = (int) jArr[0];
        Adapter findAdapterByIndex = findAdapterByIndex((int) jArr[1]);
        if (findAdapterByIndex == null) {
            return null;
        }
        return findAdapterByIndex.onCreateViewHolder(viewGroup, i2);
    }

    public void addAdapters(int i, List<Adapter> list) {
        if (list != null && list.size() != 0) {
            if (i < 0) {
                i = 0;
            }
            if (i > this.mAdapters.size()) {
                i = this.mAdapters.size();
            }
            List<Adapter> arrayList = new ArrayList<>();
            for (Pair<AdapterDataObserver, Adapter> pair : this.mAdapters) {
                arrayList.add(pair.second);
            }
            for (Adapter adapter : list) {
                arrayList.add(i, adapter);
                i++;
            }
            setAdapters(arrayList);
        }
    }

    public DelegateAdapter(VirtualLayoutManager virtualLayoutManager, boolean z, boolean z2) {
        super(virtualLayoutManager);
        this.mItemTypeAry = new SparseArray<>();
        this.mAdapters = new ArrayList();
        this.mTotal = 0;
        this.mIndexAry = new SparseArray<>();
        this.cantorReverse = new long[2];
        if (z2) {
            this.mIndexGen = new AtomicInteger(0);
        }
        this.mHasConsistItemType = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        Pair<AdapterDataObserver, Adapter> findAdapterByPosition = findAdapterByPosition(i);
        if (findAdapterByPosition == null) {
            return;
        }
        ((RecyclerView.Adapter) findAdapterByPosition.second).onBindViewHolder(viewHolder, i - ((AdapterDataObserver) findAdapterByPosition.first).mStartPosition, list);
        ((Adapter) findAdapterByPosition.second).onBindViewHolderWithOffset(viewHolder, i - ((AdapterDataObserver) findAdapterByPosition.first).mStartPosition, i, list);
    }

    /* loaded from: classes19.dex */
    public static abstract class Adapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
        static {
            Covode.recordClassIndex(4329);
        }

        public void onBindViewHolderWithOffset(VH vh, int i, int i2) {
        }

        public abstract LayoutHelper onCreateLayoutHelper();

        public void onBindViewHolderWithOffset(VH vh, int i, int i2, List<Object> list) {
            onBindViewHolderWithOffset(vh, i, i2);
        }
    }
}
