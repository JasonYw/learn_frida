package com.alibaba.android.vlayout;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;

/* loaded from: classes19.dex */
public class SortedList<T> {
    public BatchedCallback mBatchedCallback;
    public Callback mCallback;
    public T[] mData;
    public int mSize;
    public final Class<T> mTClass;

    /* loaded from: classes19.dex */
    public static abstract class Callback<T2> {
        static {
            Covode.recordClassIndex(4355);
        }

        public abstract boolean areContentsTheSame(T2 t2, T2 t22);

        public abstract boolean areItemsTheSame(T2 t2, T2 t22);

        public abstract int compare(T2 t2, T2 t22);

        public abstract void onChanged(int i, int i2);

        public abstract void onInserted(int i, int i2);

        public abstract void onMoved(int i, int i2);

        public abstract void onRemoved(int i, int i2);
    }

    static {
        Covode.recordClassIndex(4353);
    }

    public int size() {
        return this.mSize;
    }

    public void beginBatchedUpdates() {
        Callback callback = this.mCallback;
        if (callback instanceof BatchedCallback) {
            return;
        }
        if (this.mBatchedCallback == null) {
            this.mBatchedCallback = new BatchedCallback(callback);
        }
        this.mCallback = this.mBatchedCallback;
    }

    public void endBatchedUpdates() {
        Callback callback = this.mCallback;
        if (callback instanceof BatchedCallback) {
            ((BatchedCallback) callback).dispatchLastEvent();
        }
        Callback callback2 = this.mCallback;
        BatchedCallback batchedCallback = this.mBatchedCallback;
        if (callback2 == batchedCallback) {
            this.mCallback = batchedCallback.mWrappedCallback;
        }
    }

    /* loaded from: classes19.dex */
    public static class BatchedCallback<T2> extends Callback<T2> {
        public int mLastEventType;
        public final Callback<T2> mWrappedCallback;
        public int mLastEventPosition = -1;
        public int mLastEventCount = -1;

        static {
            Covode.recordClassIndex(4354);
        }

        public void dispatchLastEvent() {
            int i = this.mLastEventType;
            if (i == 0) {
                return;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.mWrappedCallback.onChanged(this.mLastEventPosition, this.mLastEventCount);
                    }
                } else {
                    this.mWrappedCallback.onRemoved(this.mLastEventPosition, this.mLastEventCount);
                }
            } else {
                this.mWrappedCallback.onInserted(this.mLastEventPosition, this.mLastEventCount);
            }
            this.mLastEventType = 0;
        }

        public BatchedCallback(Callback<T2> callback) {
            this.mWrappedCallback = callback;
        }

        @Override // com.alibaba.android.vlayout.SortedList.Callback
        public boolean areContentsTheSame(T2 t2, T2 t22) {
            return this.mWrappedCallback.areContentsTheSame(t2, t22);
        }

        @Override // com.alibaba.android.vlayout.SortedList.Callback
        public boolean areItemsTheSame(T2 t2, T2 t22) {
            return this.mWrappedCallback.areItemsTheSame(t2, t22);
        }

        @Override // com.alibaba.android.vlayout.SortedList.Callback
        public int compare(T2 t2, T2 t22) {
            return this.mWrappedCallback.compare(t2, t22);
        }

        @Override // com.alibaba.android.vlayout.SortedList.Callback
        public void onMoved(int i, int i2) {
            dispatchLastEvent();
            this.mWrappedCallback.onMoved(i, i2);
        }

        @Override // com.alibaba.android.vlayout.SortedList.Callback
        public void onRemoved(int i, int i2) {
            if (this.mLastEventType == 2 && this.mLastEventPosition == i) {
                this.mLastEventCount += i2;
                return;
            }
            dispatchLastEvent();
            this.mLastEventPosition = i;
            this.mLastEventCount = i2;
            this.mLastEventType = 2;
        }

        @Override // com.alibaba.android.vlayout.SortedList.Callback
        public void onChanged(int i, int i2) {
            int i3;
            if (this.mLastEventType == 3) {
                int i4 = this.mLastEventPosition;
                int i5 = this.mLastEventCount;
                if (i <= i4 + i5 && (i3 = i + i2) >= i4) {
                    this.mLastEventPosition = Math.min(i, i4);
                    this.mLastEventCount = Math.max(i5 + i4, i3) - this.mLastEventPosition;
                    return;
                }
            }
            dispatchLastEvent();
            this.mLastEventPosition = i;
            this.mLastEventCount = i2;
            this.mLastEventType = 3;
        }

        @Override // com.alibaba.android.vlayout.SortedList.Callback
        public void onInserted(int i, int i2) {
            int i3;
            if (this.mLastEventType == 1 && i >= (i3 = this.mLastEventPosition)) {
                int i4 = this.mLastEventCount;
                if (i <= i3 + i4) {
                    this.mLastEventCount = i4 + i2;
                    this.mLastEventPosition = Math.min(i, i3);
                    return;
                }
            }
            dispatchLastEvent();
            this.mLastEventPosition = i;
            this.mLastEventCount = i2;
            this.mLastEventType = 1;
        }
    }

    public int add(T t) {
        return add(t, true);
    }

    public int indexOf(T t) {
        return findIndexOf(t, 4);
    }

    public boolean remove(T t) {
        return remove(t, true);
    }

    public T removeItemAt(int i) {
        T t = get(i);
        removeItemAtIndex(i, true);
        return t;
    }

    public void recalculatePositionOfItemAt(int i) {
        T t = get(i);
        removeItemAtIndex(i, false);
        int add = add(t, false);
        if (i != add) {
            this.mCallback.onMoved(i, add);
        }
    }

    public T get(int i) {
        if (i < this.mSize && i >= 0) {
            return this.mData[i];
        }
        throw new IndexOutOfBoundsException("Asked to get item at " + i + " but size is " + this.mSize);
    }

    public SortedList(Class<T> cls, Callback<T> callback) {
        this(cls, callback, 10);
    }

    private boolean remove(T t, boolean z) {
        int findIndexOf = findIndexOf(t, 2);
        if (findIndexOf == -1) {
            return false;
        }
        removeItemAtIndex(findIndexOf, z);
        return true;
    }

    private void removeItemAtIndex(int i, boolean z) {
        T[] tArr = this.mData;
        System.arraycopy(tArr, i + 1, tArr, i, (this.mSize - i) - 1);
        this.mSize--;
        this.mData[this.mSize] = null;
        if (z) {
            this.mCallback.onRemoved(i, 1);
        }
    }

    private int add(T t, boolean z) {
        int findIndexOf = findIndexOf(t, 1);
        if (findIndexOf == -1) {
            findIndexOf = 0;
        } else if (findIndexOf < this.mSize) {
            T t2 = this.mData[findIndexOf];
            if (this.mCallback.areItemsTheSame(t2, t)) {
                if (this.mCallback.areContentsTheSame(t2, t)) {
                    this.mData[findIndexOf] = t;
                    return findIndexOf;
                }
                this.mData[findIndexOf] = t;
                this.mCallback.onChanged(findIndexOf, 1);
                return findIndexOf;
            }
        }
        addToData(findIndexOf, t);
        if (z) {
            this.mCallback.onInserted(findIndexOf, 1);
        }
        return findIndexOf;
    }

    private int findIndexOf(T t, int i) {
        int i2 = this.mSize;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = (i3 + i2) / 2;
            T t2 = this.mData[i4];
            int compare = this.mCallback.compare(t2, t);
            if (compare < 0) {
                i3 = i4 + 1;
            } else if (compare == 0) {
                if (this.mCallback.areItemsTheSame(t2, t)) {
                    return i4;
                }
                int linearEqualitySearch = linearEqualitySearch(t, i4, i3, i2);
                if (i == 1 && linearEqualitySearch == -1) {
                    return i4;
                }
                return linearEqualitySearch;
            } else {
                i2 = i4;
            }
        }
        if (i != 1) {
            return -1;
        }
        return i3;
    }

    public void updateItemAt(int i, T t) {
        boolean z;
        T t2 = get(i);
        if (t2 != t && this.mCallback.areContentsTheSame(t2, t)) {
            z = false;
        } else {
            z = true;
        }
        if (t2 != t && this.mCallback.compare(t2, t) == 0) {
            this.mData[i] = t;
            if (z) {
                this.mCallback.onChanged(i, 1);
                return;
            }
            return;
        }
        if (z) {
            this.mCallback.onChanged(i, 1);
        }
        removeItemAtIndex(i, false);
        int add = add(t, false);
        if (i != add) {
            this.mCallback.onMoved(i, add);
        }
    }

    private void addToData(int i, T t) {
        int i2 = this.mSize;
        if (i <= i2) {
            T[] tArr = this.mData;
            if (i2 == tArr.length) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, tArr.length + 10));
                System.arraycopy(this.mData, 0, tArr2, 0, i);
                tArr2[i] = t;
                System.arraycopy(this.mData, i, tArr2, i + 1, this.mSize - i);
                this.mData = tArr2;
            } else {
                System.arraycopy(tArr, i, tArr, i + 1, i2 - i);
                this.mData[i] = t;
            }
            this.mSize++;
            return;
        }
        throw new IndexOutOfBoundsException("cannot add item to " + i + " because size is " + this.mSize);
    }

    public SortedList(Class<T> cls, Callback<T> callback, int i) {
        this.mTClass = cls;
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i));
        this.mCallback = callback;
        this.mSize = 0;
    }

    private int linearEqualitySearch(T t, int i, int i2, int i3) {
        T t2;
        for (int i4 = i - 1; i4 >= i2; i4--) {
            T t3 = this.mData[i4];
            if (this.mCallback.compare(t3, t) != 0) {
                break;
            } else if (this.mCallback.areItemsTheSame(t3, t)) {
                return i4;
            }
        }
        do {
            i++;
            if (i < i3) {
                t2 = this.mData[i];
                if (this.mCallback.compare(t2, t) != 0) {
                    return -1;
                }
            } else {
                return -1;
            }
        } while (!this.mCallback.areItemsTheSame(t2, t));
        return i;
    }
}
