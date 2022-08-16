package androidx.lifecycle;

import androidx.arch.core.util.Function;
import com.bytedance.covode.number.Covode;
import p003X.C116341Vqx;
import p003X.C116342Vqy;

/* loaded from: classes28.dex */
public class Transformations {
    static {
        Covode.recordClassIndex(1384);
    }

    public static <X> LiveData<X> distinctUntilChanged(LiveData<X> liveData) {
        final C116341Vqx c116341Vqx = new C116341Vqx();
        c116341Vqx.LIZ(liveData, new Observer<X>() { // from class: androidx.lifecycle.Transformations.3
            public boolean LIZ = true;

            static {
                Covode.recordClassIndex(1388);
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(X x) {
                T value = C116341Vqx.this.getValue();
                if (!this.LIZ) {
                    if (value == 0) {
                        if (x == 0) {
                            return;
                        }
                    } else if (value.equals(x)) {
                        return;
                    }
                }
                this.LIZ = false;
                C116341Vqx.this.setValue(x);
            }
        });
        return c116341Vqx;
    }

    public static <X, Y> LiveData<Y> map(LiveData<X> liveData, final Function<X, Y> function) {
        final C116341Vqx c116341Vqx = new C116341Vqx();
        c116341Vqx.LIZ(liveData, new Observer<X>() { // from class: androidx.lifecycle.Transformations.1
            static {
                Covode.recordClassIndex(1385);
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(X x) {
                C116341Vqx.this.setValue(function.apply(x));
            }
        });
        return c116341Vqx;
    }

    public static <X, Y> LiveData<Y> switchMap(LiveData<X> liveData, final Function<X, LiveData<Y>> function) {
        final C116341Vqx c116341Vqx = new C116341Vqx();
        c116341Vqx.LIZ(liveData, new Observer<X>() { // from class: androidx.lifecycle.Transformations.2
            public LiveData<Y> LIZ;

            static {
                Covode.recordClassIndex(1386);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(X x) {
                C116342Vqy c116342Vqy;
                LiveData<Y> liveData2 = (LiveData) Function.this.apply(x);
                Object obj = this.LIZ;
                if (obj == liveData2) {
                    return;
                }
                if (obj != null && (c116342Vqy = (C116342Vqy) c116341Vqx.LIZ.remove(obj)) != null) {
                    c116342Vqy.LIZIZ();
                }
                this.LIZ = liveData2;
                Object obj2 = this.LIZ;
                if (obj2 != null) {
                    c116341Vqx.LIZ(obj2, new Observer<Y>() { // from class: androidx.lifecycle.Transformations.2.1
                        static {
                            Covode.recordClassIndex(1387);
                        }

                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Y y) {
                            c116341Vqx.setValue(y);
                        }
                    });
                }
            }
        });
        return c116341Vqx;
    }
}
