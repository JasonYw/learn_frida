package bolts;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Locale;

/* renamed from: bolts.c */
/* loaded from: classes18.dex */
public final class C0605c {
    public static ChangeQuickRedirect LIZ;
    public final C0607e LIZIZ;

    static {
        Covode.recordClassIndex(2510);
    }

    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return this.LIZIZ.LIZ();
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(this.LIZIZ.LIZ()));
    }

    public C0605c(C0607e c0607e) {
        this.LIZIZ = c0607e;
    }

    public final C0606d LIZ(Runnable runnable) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{runnable}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (C0606d) proxy.result;
        }
        return this.LIZIZ.LIZ(runnable);
    }
}
