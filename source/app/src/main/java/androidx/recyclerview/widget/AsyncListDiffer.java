package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import p003X.AbstractC128776aR8;
import p003X.C5344579j;
import p003X.C6GY;

/* loaded from: classes16.dex */
public class AsyncListDiffer<T> {
    public static final Executor LJII = new Executor() { // from class: X.6GX
        public final Handler LIZ = new Handler(Looper.getMainLooper());

        static {
            Covode.recordClassIndex(1655);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.LIZ.post(runnable);
        }
    };
    public final AbstractC0392p LIZ;
    public final AsyncDifferConfig<T> LIZIZ;
    public Executor LIZJ;
    public final List<C6GY<T>> LIZLLL;

    /* renamed from: LJ */
    public List<T> f20277LJ;
    public List<T> LJFF;
    public int LJI;

    public List<T> getCurrentList() {
        return this.LJFF;
    }

    static {
        Covode.recordClassIndex(1650);
    }

    public void submitList(final List<T> list) {
        final int i = this.LJI + 1;
        this.LJI = i;
        final List<T> list2 = this.f20277LJ;
        if (list != list2) {
            List<T> list3 = this.LJFF;
            if (list == null) {
                int size = list2.size();
                this.f20277LJ = null;
                this.LJFF = Collections.emptyList();
                this.LIZ.onRemoved(0, size);
                LIZ(list3, null);
            } else if (list2 == null) {
                this.f20277LJ = list;
                this.LJFF = Collections.unmodifiableList(list);
                this.LIZ.onInserted(0, list.size());
                LIZ(list3, null);
            } else {
                this.LIZIZ.LIZIZ.execute(new Runnable() { // from class: androidx.recyclerview.widget.AsyncListDiffer.1
                    static {
                        Covode.recordClassIndex(1651);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        final DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(new DiffUtil.Callback() { // from class: androidx.recyclerview.widget.AsyncListDiffer.1.1
                            static {
                                Covode.recordClassIndex(1652);
                            }

                            @Override // androidx.recyclerview.widget.DiffUtil.Callback
                            public final int getNewListSize() {
                                return list.size();
                            }

                            @Override // androidx.recyclerview.widget.DiffUtil.Callback
                            public final int getOldListSize() {
                                return list2.size();
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // androidx.recyclerview.widget.DiffUtil.Callback
                            public final boolean areContentsTheSame(int i2, int i3) {
                                Object obj = list2.get(i2);
                                Object obj2 = list.get(i3);
                                if (obj != null) {
                                    if (obj2 != null) {
                                        return AsyncListDiffer.this.LIZIZ.LIZJ.LIZIZ(obj, obj2);
                                    }
                                } else if (obj2 == null) {
                                    return true;
                                }
                                throw new AssertionError();
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // androidx.recyclerview.widget.DiffUtil.Callback
                            public final boolean areItemsTheSame(int i2, int i3) {
                                Object obj = list2.get(i2);
                                Object obj2 = list.get(i3);
                                if (obj != null) {
                                    if (obj2 != null) {
                                        return AsyncListDiffer.this.LIZIZ.LIZJ.LIZ(obj, obj2);
                                    }
                                    return false;
                                } else if (obj2 == null) {
                                    return true;
                                } else {
                                    return false;
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // androidx.recyclerview.widget.DiffUtil.Callback
                            public final Object getChangePayload(int i2, int i3) {
                                Object obj = list2.get(i2);
                                Object obj2 = list.get(i3);
                                if (obj != null && obj2 != null) {
                                    return AsyncListDiffer.this.LIZIZ.LIZJ.LIZJ(obj, obj2);
                                }
                                throw new AssertionError();
                            }
                        });
                        AsyncListDiffer.this.LIZJ.execute(new Runnable() { // from class: androidx.recyclerview.widget.AsyncListDiffer.1.2
                            static {
                                Covode.recordClassIndex(1653);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                if (AsyncListDiffer.this.LJI == i) {
                                    AsyncListDiffer asyncListDiffer = AsyncListDiffer.this;
                                    List<T> list4 = list;
                                    DiffUtil.DiffResult diffResult = calculateDiff;
                                    Runnable runnable = r5;
                                    List<T> list5 = asyncListDiffer.LJFF;
                                    asyncListDiffer.f20277LJ = list4;
                                    asyncListDiffer.LJFF = Collections.unmodifiableList(list4);
                                    diffResult.dispatchUpdatesTo(asyncListDiffer.LIZ);
                                    asyncListDiffer.LIZ(list5, runnable);
                                }
                            }
                        });
                    }
                });
            }
        }
    }

    public AsyncListDiffer(RecyclerView.Adapter adapter, AbstractC128776aR8<T> abstractC128776aR8) {
        this(new C5344579j(adapter), new AsyncDifferConfig.Builder(abstractC128776aR8).build());
    }

    public void LIZ(List<T> list, Runnable runnable) {
        Iterator<C6GY<T>> it = this.LIZLLL.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public AsyncListDiffer(AbstractC0392p abstractC0392p, AsyncDifferConfig<T> asyncDifferConfig) {
        this.LIZLLL = new CopyOnWriteArrayList();
        this.LJFF = Collections.emptyList();
        this.LIZ = abstractC0392p;
        this.LIZIZ = asyncDifferConfig;
        if (asyncDifferConfig.LIZ != null) {
            this.LIZJ = asyncDifferConfig.LIZ;
        } else {
            this.LIZJ = LJII;
        }
    }
}
