package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p003X.C130021alI;
import p003X.C130022alJ;
import p003X.C5344579j;

/* loaded from: classes16.dex */
public class DiffUtil {
    public static final Comparator<C0366d> SNAKE_COMPARATOR = new Comparator<C0366d>() { // from class: androidx.recyclerview.widget.DiffUtil.1
        static {
            Covode.recordClassIndex(1661);
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(C0366d c0366d, C0366d c0366d2) {
            C0366d c0366d3 = c0366d;
            C0366d c0366d4 = c0366d2;
            int i = c0366d3.LIZ - c0366d4.LIZ;
            if (i == 0) {
                return c0366d3.LIZIZ - c0366d4.LIZIZ;
            }
            return i;
        }
    };

    /* loaded from: classes16.dex */
    public static abstract class Callback {
        static {
            Covode.recordClassIndex(1662);
        }

        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* renamed from: androidx.recyclerview.widget.DiffUtil$d */
    /* loaded from: classes16.dex */
    public static class C0366d {
        public int LIZ;
        public int LIZIZ;
        public int LIZJ;
        public boolean LIZLLL;

        /* renamed from: LJ */
        public boolean f20279LJ;

        static {
            Covode.recordClassIndex(1667);
        }
    }

    /* loaded from: classes16.dex */
    public static class DiffResult {
        public final Callback mCallback;
        public final boolean mDetectMoves;
        public final int[] mNewItemStatuses;
        public final int mNewListSize;
        public final int[] mOldItemStatuses;
        public final int mOldListSize;
        public final List<C0366d> mSnakes;

        static {
            Covode.recordClassIndex(1663);
        }

        public List<C0366d> getSnakes() {
            return this.mSnakes;
        }

        private void addRootSnake() {
            C0366d c0366d;
            if (this.mSnakes.isEmpty() || (c0366d = this.mSnakes.get(0)) == null || c0366d.LIZ != 0 || c0366d.LIZIZ != 0) {
                C0366d c0366d2 = new C0366d();
                c0366d2.LIZ = 0;
                c0366d2.LIZIZ = 0;
                c0366d2.LIZLLL = false;
                c0366d2.LIZJ = 0;
                c0366d2.f20279LJ = false;
                this.mSnakes.add(0, c0366d2);
            }
        }

        private void findMatchingItems() {
            int i;
            int i2 = this.mOldListSize;
            int i3 = this.mNewListSize;
            for (int size = this.mSnakes.size() - 1; size >= 0; size--) {
                C0366d c0366d = this.mSnakes.get(size);
                int i4 = c0366d.LIZ + c0366d.LIZJ;
                int i5 = c0366d.LIZIZ + c0366d.LIZJ;
                if (this.mDetectMoves) {
                    while (i2 > i4) {
                        findAddition(i2, i3, size);
                        i2--;
                    }
                    while (i3 > i5) {
                        findRemoval(i2, i3, size);
                        i3--;
                    }
                }
                for (int i6 = 0; i6 < c0366d.LIZJ; i6++) {
                    int i7 = c0366d.LIZ + i6;
                    int i8 = c0366d.LIZIZ + i6;
                    if (this.mCallback.areContentsTheSame(i7, i8)) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    this.mOldItemStatuses[i7] = (i8 << 5) | i;
                    this.mNewItemStatuses[i8] = (i7 << 5) | i;
                }
                i2 = c0366d.LIZ;
                i3 = c0366d.LIZIZ;
            }
        }

        public void dispatchUpdatesTo(RecyclerView.Adapter adapter) {
            dispatchUpdatesTo(new C5344579j(adapter));
        }

        public int convertNewPositionToOld(int i) {
            if (i >= 0 && i < this.mNewListSize) {
                int i2 = this.mNewItemStatuses[i];
                if ((i2 & 31) == 0) {
                    return -1;
                }
                return i2 >> 5;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", new list size = " + this.mNewListSize);
        }

        public int convertOldPositionToNew(int i) {
            if (i >= 0 && i < this.mOldListSize) {
                int i2 = this.mOldItemStatuses[i];
                if ((i2 & 31) == 0) {
                    return -1;
                }
                return i2 >> 5;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", old list size = " + this.mOldListSize);
        }

        public void dispatchUpdatesTo(AbstractC0392p abstractC0392p) {
            C130021alI c130021alI;
            if (abstractC0392p instanceof C130021alI) {
                c130021alI = (C130021alI) abstractC0392p;
            } else {
                c130021alI = new C130021alI(abstractC0392p);
            }
            List<C0365b> arrayList = new ArrayList<>();
            int i = this.mOldListSize;
            int i2 = this.mNewListSize;
            for (int size = this.mSnakes.size() - 1; size >= 0; size--) {
                C0366d c0366d = this.mSnakes.get(size);
                int i3 = c0366d.LIZJ;
                int i4 = c0366d.LIZ + i3;
                int i5 = c0366d.LIZIZ + i3;
                if (i4 < i) {
                    dispatchRemovals(arrayList, c130021alI, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    arrayList = arrayList;
                    c130021alI = c130021alI;
                    dispatchAdditions(arrayList, c130021alI, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    if ((this.mOldItemStatuses[c0366d.LIZ + i6] & 31) == 2) {
                        c130021alI.onChanged(c0366d.LIZ + i6, 1, this.mCallback.getChangePayload(c0366d.LIZ + i6, c0366d.LIZIZ + i6));
                    }
                }
                i = c0366d.LIZ;
                i2 = c0366d.LIZIZ;
            }
            c130021alI.LIZ();
        }

        private void findAddition(int i, int i2, int i3) {
            if (this.mOldItemStatuses[i - 1] != 0) {
                return;
            }
            findMatchingItem(i, i2, i3, false);
        }

        private void findRemoval(int i, int i2, int i3) {
            if (this.mNewItemStatuses[i2 - 1] != 0) {
                return;
            }
            findMatchingItem(i, i2, i3, true);
        }

        public static C0365b removePostponedUpdate(List<C0365b> list, int i, boolean z) {
            int i2;
            int size = list.size() - 1;
            while (size >= 0) {
                C0365b c0365b = list.get(size);
                if (c0365b.LIZ == i && c0365b.LIZJ == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        C0365b c0365b2 = list.get(size);
                        int i3 = c0365b2.LIZIZ;
                        if (z) {
                            i2 = 1;
                        } else {
                            i2 = -1;
                        }
                        c0365b2.LIZIZ = i3 + i2;
                        size++;
                    }
                    return c0365b;
                }
                size--;
            }
            return null;
        }

        private boolean findMatchingItem(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            if (z) {
                i2--;
                i4 = i;
                i5 = i2;
            } else {
                i4 = i - 1;
                i5 = i4;
            }
            while (i3 >= 0) {
                C0366d c0366d = this.mSnakes.get(i3);
                int i6 = c0366d.LIZ + c0366d.LIZJ;
                int i7 = c0366d.LIZIZ + c0366d.LIZJ;
                int i8 = 8;
                if (z) {
                    for (int i9 = i4 - 1; i9 >= i6; i9--) {
                        if (this.mCallback.areItemsTheSame(i9, i5)) {
                            if (!this.mCallback.areContentsTheSame(i9, i5)) {
                                i8 = 4;
                            }
                            this.mNewItemStatuses[i5] = (i9 << 5) | 16;
                            this.mOldItemStatuses[i9] = (i5 << 5) | i8;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i10 = i2 - 1; i10 >= i7; i10--) {
                        if (this.mCallback.areItemsTheSame(i5, i10)) {
                            if (!this.mCallback.areContentsTheSame(i5, i10)) {
                                i8 = 4;
                            }
                            int i11 = i - 1;
                            this.mOldItemStatuses[i11] = (i10 << 5) | 16;
                            this.mNewItemStatuses[i10] = (i11 << 5) | i8;
                            return true;
                        }
                    }
                    continue;
                }
                i4 = c0366d.LIZ;
                i2 = c0366d.LIZIZ;
                i3--;
            }
            return false;
        }

        public DiffResult(Callback callback, List<C0366d> list, int[] iArr, int[] iArr2, boolean z) {
            this.mSnakes = list;
            this.mOldItemStatuses = iArr;
            this.mNewItemStatuses = iArr2;
            Arrays.fill(this.mOldItemStatuses, 0);
            Arrays.fill(this.mNewItemStatuses, 0);
            this.mCallback = callback;
            this.mOldListSize = callback.getOldListSize();
            this.mNewListSize = callback.getNewListSize();
            this.mDetectMoves = z;
            addRootSnake();
            findMatchingItems();
        }

        private void dispatchAdditions(List<C0365b> list, AbstractC0392p abstractC0392p, int i, int i2, int i3) {
            if (!this.mDetectMoves) {
                abstractC0392p.onInserted(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.mNewItemStatuses[i5] & 31;
                if (i6 != 0) {
                    if (i6 != 4 && i6 != 8) {
                        if (i6 == 16) {
                            list.add(new C0365b(i5, i, false));
                        } else {
                            throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString(i6));
                        }
                    } else {
                        int i7 = this.mNewItemStatuses[i5] >> 5;
                        abstractC0392p.onMoved(removePostponedUpdate(list, i7, true).LIZIZ, i);
                        if (i6 == 4) {
                            abstractC0392p.onChanged(i, 1, this.mCallback.getChangePayload(i7, i5));
                        }
                    }
                } else {
                    abstractC0392p.onInserted(i, 1);
                    for (C0365b c0365b : list) {
                        c0365b.LIZIZ++;
                    }
                }
            }
        }

        private void dispatchRemovals(List<C0365b> list, AbstractC0392p abstractC0392p, int i, int i2, int i3) {
            if (!this.mDetectMoves) {
                abstractC0392p.onRemoved(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.mOldItemStatuses[i5] & 31;
                if (i6 != 0) {
                    if (i6 != 4 && i6 != 8) {
                        if (i6 == 16) {
                            list.add(new C0365b(i5, i + i4, true));
                        } else {
                            throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString(i6));
                        }
                    } else {
                        int i7 = this.mOldItemStatuses[i5] >> 5;
                        C0365b removePostponedUpdate = removePostponedUpdate(list, i7, false);
                        abstractC0392p.onMoved(i + i4, removePostponedUpdate.LIZIZ - 1);
                        if (i6 == 4) {
                            abstractC0392p.onChanged(removePostponedUpdate.LIZIZ - 1, 1, this.mCallback.getChangePayload(i5, i7));
                        }
                    }
                } else {
                    abstractC0392p.onRemoved(i + i4, 1);
                    for (C0365b c0365b : list) {
                        c0365b.LIZIZ--;
                    }
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(1660);
    }

    public static DiffResult calculateDiff(Callback callback) {
        return calculateDiff(callback, true);
    }

    public static DiffResult calculateDiff(Callback callback, boolean z) {
        C130022alJ c130022alJ;
        int oldListSize = callback.getOldListSize();
        int newListSize = callback.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C130022alJ(0, oldListSize, 0, newListSize));
        int abs = Math.abs(oldListSize - newListSize) + oldListSize + newListSize;
        int i = abs * 2;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C130022alJ c130022alJ2 = (C130022alJ) arrayList2.remove(arrayList2.size() - 1);
            C0366d diffPartial = diffPartial(callback, c130022alJ2.LIZ, c130022alJ2.LIZIZ, c130022alJ2.LIZJ, c130022alJ2.LIZLLL, iArr, iArr2, abs);
            if (diffPartial != null) {
                if (diffPartial.LIZJ > 0) {
                    arrayList.add(diffPartial);
                }
                diffPartial.LIZ += c130022alJ2.LIZ;
                diffPartial.LIZIZ += c130022alJ2.LIZJ;
                if (arrayList3.isEmpty()) {
                    c130022alJ = new C130022alJ();
                } else {
                    c130022alJ = (C130022alJ) arrayList3.remove(arrayList3.size() - 1);
                }
                c130022alJ.LIZ = c130022alJ2.LIZ;
                c130022alJ.LIZJ = c130022alJ2.LIZJ;
                if (diffPartial.f20279LJ) {
                    c130022alJ.LIZIZ = diffPartial.LIZ;
                    c130022alJ.LIZLLL = diffPartial.LIZIZ;
                } else if (diffPartial.LIZLLL) {
                    c130022alJ.LIZIZ = diffPartial.LIZ - 1;
                    c130022alJ.LIZLLL = diffPartial.LIZIZ;
                } else {
                    c130022alJ.LIZIZ = diffPartial.LIZ;
                    c130022alJ.LIZLLL = diffPartial.LIZIZ - 1;
                }
                arrayList2.add(c130022alJ);
                if (diffPartial.f20279LJ) {
                    if (diffPartial.LIZLLL) {
                        c130022alJ2.LIZ = diffPartial.LIZ + diffPartial.LIZJ + 1;
                        c130022alJ2.LIZJ = diffPartial.LIZIZ + diffPartial.LIZJ;
                    } else {
                        c130022alJ2.LIZ = diffPartial.LIZ + diffPartial.LIZJ;
                        c130022alJ2.LIZJ = diffPartial.LIZIZ + diffPartial.LIZJ + 1;
                    }
                } else {
                    c130022alJ2.LIZ = diffPartial.LIZ + diffPartial.LIZJ;
                    c130022alJ2.LIZJ = diffPartial.LIZIZ + diffPartial.LIZJ;
                }
                arrayList2.add(c130022alJ2);
            } else {
                arrayList3.add(c130022alJ2);
            }
        }
        Collections.sort(arrayList, SNAKE_COMPARATOR);
        return new DiffResult(callback, arrayList, iArr, iArr2, z);
    }

    /* renamed from: androidx.recyclerview.widget.DiffUtil$b */
    /* loaded from: classes16.dex */
    public static class C0365b {
        public int LIZ;
        public int LIZIZ;
        public boolean LIZJ;

        static {
            Covode.recordClassIndex(1665);
        }

        public C0365b(int i, int i2, boolean z) {
            this.LIZ = i;
            this.LIZIZ = i2;
            this.LIZJ = z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r22[r2 - 1] < r22[r2 + r3]) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bb, code lost:
        if (r23[r5 - 1] < r23[r5 + 1]) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.recyclerview.widget.DiffUtil.C0366d diffPartial(androidx.recyclerview.widget.DiffUtil.Callback r17, int r18, int r19, int r20, int r21, int[] r22, int[] r23, int r24) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.DiffUtil.diffPartial(androidx.recyclerview.widget.DiffUtil$Callback, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.DiffUtil$d");
    }
}
