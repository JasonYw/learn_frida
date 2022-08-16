package com.alibaba.android.vlayout;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes19.dex */
public class RangeLayoutHelperFinder extends LayoutHelperFinder {
    public List<LayoutHelperItem> mLayoutHelperItems = new LinkedList();
    public List<LayoutHelper> mLayoutHelpers = new LinkedList();
    public List<LayoutHelper> mReverseLayoutHelpers = new LinkedList();
    public LayoutHelperItem[] mSortedLayoutHelpers = null;
    public Comparator<LayoutHelperItem> mLayoutHelperItemComparator = new Comparator<LayoutHelperItem>() { // from class: com.alibaba.android.vlayout.RangeLayoutHelperFinder.1
        static {
            Covode.recordClassIndex(4350);
        }

        @Override // java.util.Comparator
        public int compare(LayoutHelperItem layoutHelperItem, LayoutHelperItem layoutHelperItem2) {
            return layoutHelperItem.getStartPosition() - layoutHelperItem2.getStartPosition();
        }
    };

    static {
        Covode.recordClassIndex(4349);
    }

    @Override // com.alibaba.android.vlayout.LayoutHelperFinder
    public List<LayoutHelper> getLayoutHelpers() {
        return this.mLayoutHelpers;
    }

    @Override // com.alibaba.android.vlayout.LayoutHelperFinder
    public List<LayoutHelper> reverse() {
        return this.mReverseLayoutHelpers;
    }

    /* loaded from: classes19.dex */
    public static class LayoutHelperItem {
        public LayoutHelper layoutHelper;

        static {
            Covode.recordClassIndex(4351);
        }

        public int getEndPosition() {
            return this.layoutHelper.getRange().getUpper().intValue();
        }

        public int getStartPosition() {
            return this.layoutHelper.getRange().getLower().intValue();
        }

        public LayoutHelperItem(LayoutHelper layoutHelper) {
            this.layoutHelper = layoutHelper;
        }
    }

    @Override // com.alibaba.android.vlayout.LayoutHelperFinder
    public LayoutHelper getLayoutHelper(int i) {
        LayoutHelperItem[] layoutHelperItemArr = this.mSortedLayoutHelpers;
        if (layoutHelperItemArr == null || layoutHelperItemArr.length == 0) {
            return null;
        }
        int length = layoutHelperItemArr.length;
        int i2 = 0;
        int i3 = length - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) / 2;
            LayoutHelperItem layoutHelperItem = this.mSortedLayoutHelpers[i4];
            if (layoutHelperItem.getStartPosition() > i) {
                i3 = i4 - 1;
            } else if (layoutHelperItem.getEndPosition() < i) {
                i2 = i4 + 1;
            } else if (layoutHelperItem.getStartPosition() <= i && layoutHelperItem.getEndPosition() >= i) {
                return layoutHelperItem.layoutHelper;
            }
        }
        return null;
    }

    @Override // com.alibaba.android.vlayout.LayoutHelperFinder
    public void setLayouts(List<LayoutHelper> list) {
        this.mLayoutHelpers.clear();
        this.mReverseLayoutHelpers.clear();
        this.mLayoutHelperItems.clear();
        if (list != null) {
            ListIterator<LayoutHelper> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                LayoutHelper next = listIterator.next();
                this.mLayoutHelpers.add(next);
                this.mLayoutHelperItems.add(new LayoutHelperItem(next));
            }
            while (listIterator.hasPrevious()) {
                this.mReverseLayoutHelpers.add(listIterator.previous());
            }
            List<LayoutHelperItem> list2 = this.mLayoutHelperItems;
            this.mSortedLayoutHelpers = (LayoutHelperItem[]) list2.toArray(new LayoutHelperItem[list2.size()]);
            Arrays.sort(this.mSortedLayoutHelpers, this.mLayoutHelperItemComparator);
        }
    }
}
