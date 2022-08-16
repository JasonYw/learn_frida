package com.bytedance.android.live.core.utils.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes23.dex */
public enum AutoDisposableHelper implements Disposable {
    DISPOSED;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return true;
    }

    static {
        Covode.recordClassIndex(23987);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static AutoDisposableHelper[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (AutoDisposableHelper[]) proxy.result;
        }
        return (AutoDisposableHelper[]) values().clone();
    }

    public static AutoDisposableHelper valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (AutoDisposableHelper) proxy.result;
        }
        return (AutoDisposableHelper) Enum.valueOf(AutoDisposableHelper.class, str);
    }

    public static boolean LIZ(AtomicReference<Disposable> atomicReference) {
        Disposable andSet;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{atomicReference}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Disposable disposable = atomicReference.get();
        AutoDisposableHelper autoDisposableHelper = DISPOSED;
        if (disposable == autoDisposableHelper || (andSet = atomicReference.getAndSet(autoDisposableHelper)) == autoDisposableHelper) {
            return false;
        }
        if (andSet != null) {
            andSet.dispose();
        }
        return true;
    }
}
