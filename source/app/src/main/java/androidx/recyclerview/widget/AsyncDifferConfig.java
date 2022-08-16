package androidx.recyclerview.widget;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;
import p003X.AbstractC128776aR8;
import p003X.C116971W2r;

/* loaded from: classes16.dex */
public final class AsyncDifferConfig<T> {
    public final Executor LIZ;
    public final Executor LIZIZ;
    public final AbstractC128776aR8<T> LIZJ;

    static {
        Covode.recordClassIndex(1648);
    }

    /* loaded from: classes16.dex */
    public static final class Builder<T> {
        public static final Object LIZLLL = new Object();

        /* renamed from: LJ */
        public static Executor f20276LJ = null;
        public Executor LIZ;
        public Executor LIZIZ;
        public final AbstractC128776aR8<T> LIZJ;

        static {
            Covode.recordClassIndex(1649);
        }

        public final AsyncDifferConfig<T> build() {
            if (this.LIZIZ == null) {
                synchronized (LIZLLL) {
                    if (f20276LJ == null) {
                        f20276LJ = C116971W2r.LIZIZ(2);
                    }
                }
                this.LIZIZ = f20276LJ;
            }
            return new AsyncDifferConfig<>(this.LIZ, this.LIZIZ, this.LIZJ);
        }

        public Builder(AbstractC128776aR8<T> abstractC128776aR8) {
            this.LIZJ = abstractC128776aR8;
        }
    }

    public AsyncDifferConfig(Executor executor, Executor executor2, AbstractC128776aR8<T> abstractC128776aR8) {
        this.LIZ = executor;
        this.LIZIZ = executor2;
        this.LIZJ = abstractC128776aR8;
    }
}
