package bolts;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import p003X.C74709Fd1;

/* renamed from: bolts.e */
/* loaded from: classes18.dex */
public final class C0607e implements Closeable {
    public static ChangeQuickRedirect LIZ;
    public final Object LIZIZ = new Object();
    public final List<C0606d> LIZJ = new ArrayList();
    public ScheduledFuture<?> LIZLLL;

    /* renamed from: LJ */
    public boolean f20852LJ;
    public boolean LJFF;

    static {
        Covode.recordClassIndex(2512);
    }

    public C0607e() {
        C74709Fd1.LIZIZ();
    }

    /* renamed from: LJ */
    private void m20753LJ() {
        ScheduledFuture<?> scheduledFuture;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported && (scheduledFuture = this.LIZLLL) != null) {
            scheduledFuture.cancel(true);
            this.LIZLLL = null;
        }
    }

    public void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported || !this.LJFF) {
            return;
        }
        throw new IllegalStateException("Object already closed");
    }

    public final C0605c LIZIZ() {
        C0605c c0605c;
        MethodCollector.m14708i(135);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            C0605c c0605c2 = (C0605c) proxy.result;
            MethodCollector.m14707o(135);
            return c0605c2;
        }
        synchronized (this.LIZIZ) {
            try {
                LIZLLL();
                c0605c = new C0605c(this);
            } catch (Throwable th) {
                MethodCollector.m14707o(135);
                throw th;
            }
        }
        MethodCollector.m14707o(135);
        return c0605c;
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(LIZ()));
    }

    public final void LIZJ() {
        MethodCollector.m14708i(136);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            MethodCollector.m14707o(136);
            return;
        }
        synchronized (this.LIZIZ) {
            try {
                LIZLLL();
                if (this.f20852LJ) {
                    MethodCollector.m14707o(136);
                    return;
                }
                m20753LJ();
                this.f20852LJ = true;
                LIZ(new ArrayList(this.LIZJ));
                MethodCollector.m14707o(136);
            } catch (Throwable th) {
                MethodCollector.m14707o(136);
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        MethodCollector.m14708i(137);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            MethodCollector.m14707o(137);
            return;
        }
        synchronized (this.LIZIZ) {
            try {
                if (this.LJFF) {
                    MethodCollector.m14707o(137);
                    return;
                }
                m20753LJ();
                for (C0606d c0606d : this.LIZJ) {
                    c0606d.close();
                }
                this.LIZJ.clear();
                this.LJFF = true;
                MethodCollector.m14707o(137);
            } catch (Throwable th) {
                MethodCollector.m14707o(137);
                throw th;
            }
        }
    }

    public final boolean LIZ() {
        boolean z;
        MethodCollector.m14708i(134);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(134);
            return booleanValue;
        }
        synchronized (this.LIZIZ) {
            try {
                LIZLLL();
                z = this.f20852LJ;
            } catch (Throwable th) {
                MethodCollector.m14707o(134);
                throw th;
            }
        }
        MethodCollector.m14707o(134);
        return z;
    }

    private void LIZ(List<C0606d> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 10).isSupported) {
            return;
        }
        for (C0606d c0606d : list) {
            c0606d.LIZ();
        }
    }

    public final C0606d LIZ(Runnable runnable) {
        C0606d c0606d;
        MethodCollector.m14708i(138);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{runnable}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            C0606d c0606d2 = (C0606d) proxy.result;
            MethodCollector.m14707o(138);
            return c0606d2;
        }
        synchronized (this.LIZIZ) {
            try {
                LIZLLL();
                c0606d = new C0606d(this, runnable);
                if (this.f20852LJ) {
                    c0606d.LIZ();
                } else {
                    this.LIZJ.add(c0606d);
                }
            } finally {
                MethodCollector.m14707o(138);
            }
        }
        return c0606d;
    }
}
