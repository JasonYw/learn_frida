package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p002O.C0002O;
import p003X.AbstractC147043fCf;

/* loaded from: classes20.dex */
public class ChildHelper {
    public final AbstractC147043fCf mCallback;
    public final Bucket mBucket = new Bucket();
    public final List<View> mHiddenViews = new ArrayList();

    static {
        Covode.recordClassIndex(1657);
    }

    public int getUnfilteredChildCount() {
        return this.mCallback.LIZ();
    }

    /* loaded from: classes20.dex */
    public static class Bucket {
        public long mData;
        public Bucket mNext;

        static {
            Covode.recordClassIndex(1658);
        }

        private void ensureNext() {
            if (this.mNext == null) {
                this.mNext = new Bucket();
            }
        }

        public void reset() {
            this.mData = 0L;
            Bucket bucket = this.mNext;
            if (bucket != null) {
                bucket.reset();
            }
        }

        public String toString() {
            if (this.mNext == null) {
                return Long.toBinaryString(this.mData);
            }
            new StringBuilder();
            return C0002O.m25085C(this.mNext.toString(), "xx", Long.toBinaryString(this.mData));
        }

        public void clear(int i) {
            if (i >= 64) {
                Bucket bucket = this.mNext;
                if (bucket != null) {
                    bucket.clear(i - 64);
                    return;
                }
                return;
            }
            this.mData &= ~(1 << i);
        }

        public boolean get(int i) {
            if (i >= 64) {
                ensureNext();
                return this.mNext.get(i - 64);
            } else if ((this.mData & (1 << i)) != 0) {
                return true;
            } else {
                return false;
            }
        }

        public void set(int i) {
            if (i >= 64) {
                ensureNext();
                this.mNext.set(i - 64);
                return;
            }
            this.mData |= 1 << i;
        }

        public int countOnesBefore(int i) {
            Bucket bucket = this.mNext;
            if (bucket == null) {
                if (i >= 64) {
                    return Long.bitCount(this.mData);
                }
                return Long.bitCount(this.mData & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.mData & ((1 << i) - 1));
            } else {
                return bucket.countOnesBefore(i - 64) + Long.bitCount(this.mData);
            }
        }

        public boolean remove(int i) {
            boolean z;
            if (i >= 64) {
                ensureNext();
                return this.mNext.remove(i - 64);
            }
            long j = 1 << i;
            if ((this.mData & j) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.mData &= ~j;
            long j2 = j - 1;
            long j3 = this.mData;
            this.mData = Long.rotateRight(j3 & (~j2), 1) | (j3 & j2);
            Bucket bucket = this.mNext;
            if (bucket != null) {
                if (bucket.get(0)) {
                    set(63);
                }
                this.mNext.remove(0);
            }
            return z;
        }

        public void insert(int i, boolean z) {
            boolean z2;
            if (i >= 64) {
                ensureNext();
                this.mNext.insert(i - 64, z);
                return;
            }
            if ((this.mData & Long.MIN_VALUE) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            long j = (1 << i) - 1;
            long j2 = this.mData;
            this.mData = ((j2 & (~j)) << 1) | (j2 & j);
            if (z) {
                set(i);
            } else {
                clear(i);
            }
            if (z2 || this.mNext != null) {
                ensureNext();
                this.mNext.insert(0, z2);
            }
        }
    }

    public int getChildCount() {
        return this.mCallback.LIZ() - this.mHiddenViews.size();
    }

    public void removeAllViewsUnfiltered() {
        this.mBucket.reset();
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            this.mCallback.LIZLLL(this.mHiddenViews.get(size));
            this.mHiddenViews.remove(size);
        }
        this.mCallback.LIZIZ();
    }

    public String toString() {
        return this.mBucket.toString() + ", hidden list:" + this.mHiddenViews.size();
    }

    public View getUnfilteredChildAt(int i) {
        return this.mCallback.LIZIZ(i);
    }

    public boolean isHidden(View view) {
        return this.mHiddenViews.contains(view);
    }

    private void hideViewInternal(View view) {
        this.mHiddenViews.add(view);
        this.mCallback.LIZJ(view);
    }

    public void detachViewFromParent(int i) {
        int offset = getOffset(i);
        this.mBucket.remove(offset);
        this.mCallback.LIZJ(offset);
    }

    public View getChildAt(int i) {
        return this.mCallback.LIZIZ(getOffset(i));
    }

    public ChildHelper(AbstractC147043fCf abstractC147043fCf) {
        this.mCallback = abstractC147043fCf;
    }

    private boolean unhideViewInternal(View view) {
        if (this.mHiddenViews.remove(view)) {
            this.mCallback.LIZLLL(view);
            return true;
        }
        return false;
    }

    public int indexOfChild(View view) {
        int LIZ = this.mCallback.LIZ(view);
        if (LIZ == -1 || this.mBucket.get(LIZ)) {
            return -1;
        }
        return LIZ - this.mBucket.countOnesBefore(LIZ);
    }

    public void removeView(View view) {
        int LIZ = this.mCallback.LIZ(view);
        if (LIZ < 0) {
            return;
        }
        if (this.mBucket.remove(LIZ)) {
            unhideViewInternal(view);
        }
        this.mCallback.LIZ(LIZ);
    }

    public void removeViewAt(int i) {
        int offset = getOffset(i);
        View LIZIZ = this.mCallback.LIZIZ(offset);
        if (LIZIZ == null) {
            return;
        }
        if (this.mBucket.remove(offset)) {
            unhideViewInternal(LIZIZ);
        }
        this.mCallback.LIZ(offset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r4.mBucket.get(r1) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int getOffset(int r5) {
        /*
            r4 = this;
            r3 = -1
            if (r5 >= 0) goto L4
            return r3
        L4:
            X.fCf r0 = r4.mCallback
            int r2 = r0.LIZ()
            r1 = r5
        Lb:
            if (r1 >= r2) goto L27
            androidx.recyclerview.widget.ChildHelper$Bucket r0 = r4.mBucket
            int r0 = r0.countOnesBefore(r1)
            int r0 = r1 - r0
            int r0 = r5 - r0
            if (r0 == 0) goto L1b
            int r1 = r1 + r0
            goto Lb
        L1b:
            androidx.recyclerview.widget.ChildHelper$Bucket r0 = r4.mBucket
            boolean r0 = r0.get(r1)
            if (r0 == 0) goto L26
            int r1 = r1 + 1
            goto L1b
        L26:
            return r1
        L27:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.ChildHelper.getOffset(int):int");
    }

    public View findHiddenNonRemovedView(int i) {
        int size = this.mHiddenViews.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.mHiddenViews.get(i2);
            RecyclerView.ViewHolder LIZIZ = this.mCallback.LIZIZ(view);
            if (LIZIZ.getLayoutPosition() == i && !LIZIZ.isInvalid() && !LIZIZ.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    public void hide(View view) {
        int LIZ = this.mCallback.LIZ(view);
        if (LIZ >= 0) {
            this.mBucket.set(LIZ);
            hideViewInternal(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public boolean removeViewIfHidden(View view) {
        int LIZ = this.mCallback.LIZ(view);
        if (LIZ == -1) {
            unhideViewInternal(view);
            return true;
        } else if (this.mBucket.get(LIZ)) {
            this.mBucket.remove(LIZ);
            unhideViewInternal(view);
            this.mCallback.LIZ(LIZ);
            return true;
        } else {
            return false;
        }
    }

    public void unhide(View view) {
        int LIZ = this.mCallback.LIZ(view);
        if (LIZ >= 0) {
            if (this.mBucket.get(LIZ)) {
                this.mBucket.clear(LIZ);
                unhideViewInternal(view);
                return;
            }
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public void addView(View view, boolean z) {
        addView(view, -1, z);
    }

    public void addView(View view, int i, boolean z) {
        int offset;
        if (i < 0) {
            offset = this.mCallback.LIZ();
        } else {
            offset = getOffset(i);
        }
        this.mBucket.insert(offset, z);
        if (z) {
            hideViewInternal(view);
        }
        this.mCallback.LIZ(view, offset);
    }

    public void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int offset;
        if (i < 0) {
            offset = this.mCallback.LIZ();
        } else {
            offset = getOffset(i);
        }
        this.mBucket.insert(offset, z);
        if (z) {
            hideViewInternal(view);
        }
        this.mCallback.LIZ(view, offset, layoutParams);
    }
}
