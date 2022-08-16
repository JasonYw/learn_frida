package com.bytedance.android.live.core.arch.mvvm;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class PropertyOwner$1 extends Lambda implements Function2<T, T, T> {
    public static final PropertyOwner$1 INSTANCE = new PropertyOwner$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(23306);
    }

    public PropertyOwner$1() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final T invoke(T t, T t2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{t, t2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(t, t2);
        return t2;
    }
}
