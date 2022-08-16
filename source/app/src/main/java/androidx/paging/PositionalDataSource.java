package androidx.paging;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p003X.AbstractC149007fiL;
import p003X.C113537Ump;
import p003X.C113538Umq;

/* loaded from: classes11.dex */
public abstract class PositionalDataSource<T> extends AbstractC0342d<Integer, T> {

    /* loaded from: classes11.dex */
    public static abstract class LoadInitialCallback<T> {
        static {
            Covode.recordClassIndex(1525);
        }

        public abstract void LIZ(List<T> list, int i);
    }

    /* loaded from: classes11.dex */
    public static abstract class LoadRangeCallback<T> {
        static {
            Covode.recordClassIndex(1526);
        }

        public abstract void LIZ(List<T> list);
    }

    static {
        Covode.recordClassIndex(1524);
    }

    public abstract void LIZ(C0340c c0340c, LoadInitialCallback<T> loadInitialCallback);

    public abstract void LIZ(C0341e c0341e, LoadRangeCallback<T> loadRangeCallback);

    @Override // androidx.paging.AbstractC0342d
    public final boolean LIZ() {
        return false;
    }

    /* renamed from: androidx.paging.PositionalDataSource$e */
    /* loaded from: classes11.dex */
    public static class C0341e {
        public final int LIZ;
        public final int LIZIZ;

        static {
            Covode.recordClassIndex(1531);
        }

        public C0341e(int i, int i2) {
            this.LIZ = i;
            this.LIZIZ = i2;
        }
    }

    /* renamed from: androidx.paging.PositionalDataSource$c */
    /* loaded from: classes11.dex */
    public static class C0340c {
        public final int LIZ;

        static {
            Covode.recordClassIndex(1529);
        }

        public C0340c(int i, int i2, int i3, boolean z) {
            this.LIZ = i3;
        }
    }

    public final void LIZ(int i, int i2, int i3, Executor executor, AbstractC149007fiL<T> abstractC149007fiL) {
        C113538Umq c113538Umq = new C113538Umq(this, i, i2, executor, abstractC149007fiL);
        if (i3 == 0) {
            c113538Umq.LIZ(Collections.emptyList());
        } else {
            LIZ(new C0341e(i2, i3), c113538Umq);
        }
    }

    public final void LIZ(boolean z, int i, int i2, int i3, Executor executor, AbstractC149007fiL<T> abstractC149007fiL) {
        C113537Ump c113537Ump = new C113537Ump(this, z, i3, abstractC149007fiL);
        LIZ(new C0340c(i, i2, i3, z), c113537Ump);
        c113537Ump.LIZ.LIZ(executor);
    }
}
