package androidx.recyclerview.widget;

import androidx.core.p018os.TraceCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p003X.C147041fCd;
import p003X.C147046fCi;

/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: classes20.dex */
public final class RunnableC0388i implements Runnable {
    public static final ThreadLocal<RunnableC0388i> LIZ = new ThreadLocal<>();

    /* renamed from: LJ */
    public static Comparator<C0389b> f20283LJ = new C147046fCi();
    public long LIZJ;
    public long LIZLLL;
    public ArrayList<RecyclerView> LIZIZ = new ArrayList<>();
    public ArrayList<C0389b> LJFF = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.i$b */
    /* loaded from: classes20.dex */
    public static class C0389b {
        public boolean LIZ;
        public int LIZIZ;
        public int LIZJ;
        public RecyclerView LIZLLL;

        /* renamed from: LJ */
        public int f20284LJ;

        static {
            Covode.recordClassIndex(1769);
        }
    }

    static {
        Covode.recordClassIndex(1766);
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        RecyclerView recyclerView;
        C0389b c0389b;
        boolean z;
        long j2 = 0;
        try {
            TraceCompat.beginSection("RV Prefetch");
            if (!this.LIZIZ.isEmpty()) {
                int size = this.LIZIZ.size();
                long j3 = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView2 = this.LIZIZ.get(i);
                    if (recyclerView2.getWindowVisibility() == 0) {
                        j3 = Math.max(recyclerView2.getDrawingTime(), j3);
                    }
                }
                if (j3 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j3) + this.LIZLLL;
                    int size2 = this.LIZIZ.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size2; i3++) {
                        RecyclerView recyclerView3 = this.LIZIZ.get(i3);
                        if (recyclerView3.getWindowVisibility() == 0) {
                            recyclerView3.mPrefetchRegistry.LIZ(recyclerView3, false);
                            i2 += recyclerView3.mPrefetchRegistry.LIZLLL;
                        }
                    }
                    this.LJFF.ensureCapacity(i2);
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < size2) {
                        RecyclerView recyclerView4 = this.LIZIZ.get(i4);
                        if (recyclerView4.getWindowVisibility() == 0) {
                            C147041fCd c147041fCd = recyclerView4.mPrefetchRegistry;
                            int abs = Math.abs(c147041fCd.LIZ) + Math.abs(c147041fCd.LIZIZ);
                            for (int i6 = 0; i6 < c147041fCd.LIZLLL * 2; i6 += 2) {
                                if (i5 >= this.LJFF.size()) {
                                    c0389b = new C0389b();
                                    this.LJFF.add(c0389b);
                                } else {
                                    c0389b = this.LJFF.get(i5);
                                }
                                int i7 = c147041fCd.LIZJ[i6 + 1];
                                if (i7 <= abs) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                try {
                                    c0389b.LIZ = z;
                                    c0389b.LIZIZ = abs;
                                    c0389b.LIZJ = i7;
                                    c0389b.LIZLLL = recyclerView4;
                                    c0389b.f20284LJ = c147041fCd.LIZJ[i6];
                                    i5++;
                                } catch (Throwable th) {
                                    th = th;
                                    j2 = 0;
                                    this.LIZJ = j2;
                                    TraceCompat.endSection();
                                    throw th;
                                }
                            }
                        }
                        i4++;
                        j2 = 0;
                    }
                    Collections.sort(this.LJFF, f20283LJ);
                    for (int i8 = 0; i8 < this.LJFF.size(); i8++) {
                        C0389b c0389b2 = this.LJFF.get(i8);
                        if (c0389b2.LIZLLL == null) {
                            break;
                        }
                        if (c0389b2.LIZ) {
                            j = Long.MAX_VALUE;
                        } else {
                            j = nanos;
                        }
                        RecyclerView.ViewHolder LIZ2 = LIZ(c0389b2.LIZLLL, c0389b2.f20284LJ, j);
                        if (LIZ2 != null && LIZ2.mNestedRecyclerView != null && LIZ2.isBound() && !LIZ2.isInvalid() && (recyclerView = LIZ2.mNestedRecyclerView.get()) != null) {
                            if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.getUnfilteredChildCount() != 0) {
                                recyclerView.removeAndRecycleViews();
                            }
                            C147041fCd c147041fCd2 = recyclerView.mPrefetchRegistry;
                            c147041fCd2.LIZ(recyclerView, true);
                            if (c147041fCd2.LIZLLL != 0) {
                                TraceCompat.beginSection("RV Nested Prefetch");
                                recyclerView.mState.prepareForNestedPrefetch(recyclerView.mAdapter);
                                for (int i9 = 0; i9 < c147041fCd2.LIZLLL * 2; i9 += 2) {
                                    LIZ(recyclerView, c147041fCd2.LIZJ[i9], nanos);
                                }
                                TraceCompat.endSection();
                            }
                        }
                        c0389b2.LIZ = false;
                        c0389b2.LIZIZ = 0;
                        c0389b2.LIZJ = 0;
                        c0389b2.LIZLLL = null;
                        c0389b2.f20284LJ = 0;
                    }
                    j2 = 0;
                }
            }
            this.LIZJ = j2;
            TraceCompat.endSection();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void LIZ(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.LIZJ == 0) {
            this.LIZJ = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C147041fCd c147041fCd = recyclerView.mPrefetchRegistry;
        c147041fCd.LIZ = i;
        c147041fCd.LIZIZ = i2;
    }

    public static RecyclerView.ViewHolder LIZ(RecyclerView recyclerView, int i, long j) {
        int unfilteredChildCount = recyclerView.mChildHelper.getUnfilteredChildCount();
        for (int i2 = 0; i2 < unfilteredChildCount; i2++) {
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.getUnfilteredChildAt(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        RecyclerView.Recycler recycler = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.ViewHolder tryGetViewHolderForPositionByDeadline = recycler.tryGetViewHolderForPositionByDeadline(i, false, j);
            if (tryGetViewHolderForPositionByDeadline != null) {
                if (tryGetViewHolderForPositionByDeadline.isBound() && !tryGetViewHolderForPositionByDeadline.isInvalid()) {
                    recycler.recycleView(tryGetViewHolderForPositionByDeadline.itemView);
                } else {
                    recycler.addViewHolderToRecycledViewPool(tryGetViewHolderForPositionByDeadline, false);
                }
            }
            return tryGetViewHolderForPositionByDeadline;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }
}
