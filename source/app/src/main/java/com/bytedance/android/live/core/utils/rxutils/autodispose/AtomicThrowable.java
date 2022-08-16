package com.bytedance.android.live.core.utils.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes23.dex */
public final class AtomicThrowable extends AtomicReference<Throwable> {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static final long serialVersionUID = 3949248817947090603L;

    static {
        Covode.recordClassIndex(23986);
    }

    public final Throwable LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Throwable) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{this}, null, ExceptionHelper.LIZ, true, 2);
        if (proxy2.isSupported) {
            return (Throwable) proxy2.result;
        }
        Throwable th = get();
        if (th != ExceptionHelper.LIZIZ) {
            return getAndSet(ExceptionHelper.LIZIZ);
        }
        return th;
    }

    public final boolean LIZ(Throwable th) {
        Throwable th2;
        Throwable compositeException;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{th}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{this, th}, null, ExceptionHelper.LIZ, true, 1);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        do {
            th2 = get();
            if (th2 == ExceptionHelper.LIZIZ) {
                return false;
            }
            if (th2 == null) {
                compositeException = th;
            } else {
                compositeException = new CompositeException(th2, th);
            }
        } while (!compareAndSet(th2, compositeException));
        return true;
    }
}
