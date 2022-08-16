package com.bytedance.android.live.core.utils.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.concurrent.atomic.AtomicReference;
import org.p3070a.AbstractC35211d;

/* loaded from: classes23.dex */
public enum AutoSubscriptionHelper implements AbstractC35211d {
    CANCELLED;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // org.p3070a.AbstractC35211d
    public final void cancel() {
    }

    @Override // org.p3070a.AbstractC35211d
    public final void request(long j) {
    }

    static {
        Covode.recordClassIndex(23992);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static AutoSubscriptionHelper[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (AutoSubscriptionHelper[]) proxy.result;
        }
        return (AutoSubscriptionHelper[]) values().clone();
    }

    public static AutoSubscriptionHelper valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (AutoSubscriptionHelper) proxy.result;
        }
        return (AutoSubscriptionHelper) Enum.valueOf(AutoSubscriptionHelper.class, str);
    }

    public static boolean LIZ(AtomicReference<AbstractC35211d> atomicReference) {
        AbstractC35211d andSet;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{atomicReference}, null, changeQuickRedirect, true, 11);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC35211d abstractC35211d = atomicReference.get();
        AutoSubscriptionHelper autoSubscriptionHelper = CANCELLED;
        if (abstractC35211d == autoSubscriptionHelper || (andSet = atomicReference.getAndSet(autoSubscriptionHelper)) == CANCELLED) {
            return false;
        }
        if (andSet != null) {
            andSet.cancel();
        }
        return true;
    }
}
