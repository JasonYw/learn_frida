package androidx.loader.p019a;

import android.os.Bundle;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC145696equ;
import p003X.AbstractC145698eqw;
import p003X.C145691eqp;
import p003X.C145695eqt;
import p003X.C65357BqZ;

/* renamed from: androidx.loader.a.b$a */
/* loaded from: classes19.dex */
public class b$a<D> extends MutableLiveData<D> implements AbstractC145698eqw<D> {
    public final int LIZ;
    public final Bundle LIZIZ;
    public final C145691eqp<D> LIZJ;
    public C145695eqt<D> LIZLLL;

    /* renamed from: LJ */
    public LifecycleOwner f20265LJ;
    public C145691eqp<D> LJFF;

    static {
        Covode.recordClassIndex(1426);
    }

    @Override // androidx.lifecycle.LiveData
    public final void onActive() {
        this.LIZJ.LJIIIZ();
    }

    @Override // androidx.lifecycle.LiveData
    public final void onInactive() {
        this.LIZJ.LJIIL();
    }

    public final void LIZ() {
        LifecycleOwner lifecycleOwner = this.f20265LJ;
        C145695eqt<D> c145695eqt = this.LIZLLL;
        if (lifecycleOwner != null && c145695eqt != null) {
            super.removeObserver(c145695eqt);
            observe(lifecycleOwner, c145695eqt);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.LIZ);
        sb.append(" : ");
        C65357BqZ.LIZ(this.LIZJ, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.LiveData
    public final void removeObserver(Observer<? super D> observer) {
        super.removeObserver(observer);
        this.f20265LJ = null;
        this.LIZLLL = null;
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public final void setValue(D d) {
        super.setValue(d);
        C145691eqp<D> c145691eqp = this.LJFF;
        if (c145691eqp != null) {
            c145691eqp.LJIILJJIL();
            this.LJFF = null;
        }
    }

    public final C145691eqp<D> LIZ(boolean z) {
        this.LIZJ.LJIIJ();
        this.LIZJ.LJIILIIL();
        C145695eqt<D> c145695eqt = this.LIZLLL;
        if (c145695eqt != null) {
            removeObserver(c145695eqt);
            if (z) {
                c145695eqt.LIZ();
            }
        }
        this.LIZJ.LIZ(this);
        if ((c145695eqt == null || c145695eqt.LIZ) && !z) {
            return this.LIZJ;
        }
        this.LIZJ.LJIILJJIL();
        return this.LJFF;
    }

    @Override // p003X.AbstractC145698eqw
    public final void LIZ(D d) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            setValue(d);
        } else {
            postValue(d);
        }
    }

    public final C145691eqp<D> LIZ(LifecycleOwner lifecycleOwner, AbstractC145696equ<D> abstractC145696equ) {
        C145695eqt<D> c145695eqt = new C145695eqt<>(this.LIZJ, abstractC145696equ);
        observe(lifecycleOwner, c145695eqt);
        C145695eqt<D> c145695eqt2 = this.LIZLLL;
        if (c145695eqt2 != null) {
            removeObserver(c145695eqt2);
        }
        this.f20265LJ = lifecycleOwner;
        this.LIZLLL = c145695eqt;
        return this.LIZJ;
    }

    public b$a(int i, Bundle bundle, C145691eqp<D> c145691eqp, C145691eqp<D> c145691eqp2) {
        this.LIZ = i;
        this.LIZIZ = bundle;
        this.LIZJ = c145691eqp;
        this.LJFF = c145691eqp2;
        C145691eqp<D> c145691eqp3 = this.LIZJ;
        if (c145691eqp3.LJIILJJIL == null) {
            c145691eqp3.LJIILJJIL = this;
            c145691eqp3.LJIILIIL = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }
}
