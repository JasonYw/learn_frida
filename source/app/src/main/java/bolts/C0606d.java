package bolts;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Closeable;

/* renamed from: bolts.d */
/* loaded from: classes18.dex */
public final class C0606d implements Closeable {
    public static ChangeQuickRedirect LIZ;
    public final Object LIZIZ = new Object();
    public C0607e LIZJ;
    public Runnable LIZLLL;

    /* renamed from: LJ */
    public boolean f20851LJ;

    static {
        Covode.recordClassIndex(2511);
    }

    public final void LIZ() {
        MethodCollector.m14708i(133);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            MethodCollector.m14707o(133);
            return;
        }
        synchronized (this.LIZIZ) {
            try {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported && this.f20851LJ) {
                    IllegalStateException illegalStateException = new IllegalStateException("Object already closed");
                    MethodCollector.m14707o(133);
                    throw illegalStateException;
                }
                this.LIZLLL.run();
                close();
            } catch (Throwable th) {
                MethodCollector.m14707o(133);
                throw th;
            }
        }
        MethodCollector.m14707o(133);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        MethodCollector.m14708i(132);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(132);
            return;
        }
        synchronized (this.LIZIZ) {
            try {
                if (this.f20851LJ) {
                    MethodCollector.m14707o(132);
                    return;
                }
                this.f20851LJ = true;
                C0607e c0607e = this.LIZJ;
                if (!PatchProxy.proxy(new Object[]{this}, c0607e, C0607e.LIZ, false, 9).isSupported) {
                    synchronized (c0607e.LIZIZ) {
                        c0607e.LIZLLL();
                        c0607e.LIZJ.remove(this);
                    }
                }
                this.LIZJ = null;
                this.LIZLLL = null;
                MethodCollector.m14707o(132);
            } catch (Throwable th) {
                MethodCollector.m14707o(132);
                throw th;
            }
        }
    }

    public C0606d(C0607e c0607e, Runnable runnable) {
        this.LIZJ = c0607e;
        this.LIZLLL = runnable;
    }
}
