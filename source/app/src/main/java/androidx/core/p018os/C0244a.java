package androidx.core.p018os;

import android.os.Build;
import android.os.CancellationSignal;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC83634Ixg;

/* renamed from: androidx.core.os.a */
/* loaded from: classes4.dex */
public final class C0244a {
    public boolean LIZ;
    public AbstractC83634Ixg LIZIZ;
    public Object LIZJ;
    public boolean LIZLLL;

    static {
        Covode.recordClassIndex(1014);
    }

    public final boolean LIZ() {
        boolean z;
        synchronized (this) {
            z = this.LIZ;
        }
        return z;
    }

    public final void LIZIZ() {
        synchronized (this) {
            if (this.LIZ) {
                return;
            }
            this.LIZ = true;
            this.LIZLLL = true;
            AbstractC83634Ixg abstractC83634Ixg = this.LIZIZ;
            Object obj = this.LIZJ;
            if (abstractC83634Ixg != null) {
                try {
                    abstractC83634Ixg.LIZ();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.LIZLLL = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                int i = Build.VERSION.SDK_INT;
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.LIZLLL = false;
                notifyAll();
            }
        }
    }

    public final Object LIZJ() {
        Object obj;
        int i = Build.VERSION.SDK_INT;
        synchronized (this) {
            if (this.LIZJ == null) {
                this.LIZJ = new CancellationSignal();
                if (this.LIZ) {
                    ((CancellationSignal) this.LIZJ).cancel();
                }
            }
            obj = this.LIZJ;
        }
        return obj;
    }

    public final void LIZ(AbstractC83634Ixg abstractC83634Ixg) {
        synchronized (this) {
            while (this.LIZLLL) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.LIZIZ == abstractC83634Ixg) {
                return;
            }
            this.LIZIZ = abstractC83634Ixg;
            if (!this.LIZ) {
                return;
            }
            abstractC83634Ixg.LIZ();
        }
    }
}
