package com.bytedance.android.live.broadcast.viewmodel;

import com.bytedance.android.live.broadcast.model.PreInitState;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p003X.C106862S5w;
import p003X.C2WC;

/* renamed from: com.bytedance.android.live.broadcast.viewmodel.b */
/* loaded from: classes12.dex */
public final class C3256b {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final C2WC<PreInitState> LIZJ;
    public final Function1<Boolean, Unit> LIZLLL;

    /* renamed from: LJ */
    public final Function0<Unit> f25956LJ;

    static {
        Covode.recordClassIndex(18129);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.f25956LJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3256b) {
            return C106862S5w.LIZ(((C3256b) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("PreInitDataItem:%s,%s,%s,%s", LIZ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3256b(String str, C2WC<PreInitState> c2wc, Function1<? super Boolean, Unit> function1, Function0<Unit> function0) {
        C106862S5w.LIZ(str, c2wc, function1, function0);
        this.LIZIZ = str;
        this.LIZJ = c2wc;
        this.LIZLLL = function1;
        this.f25956LJ = function0;
    }
}
