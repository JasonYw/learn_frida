package com.bytedance.android.live.core.tetris.layer.core.tetris.priority;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.core.tetris.layer.core.tetris.priority.a */
/* loaded from: classes12.dex */
public final class C4113a {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    static {
        Covode.recordClassIndex(23723);
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C0002O.m25083C("MutexPair(identify1=", this.LIZIZ, ", identify2=", this.LIZJ, ")");
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return (this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode();
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C4113a c4113a = (C4113a) obj;
        if (c4113a != null && ((Intrinsics.areEqual(c4113a.LIZIZ, this.LIZIZ) && Intrinsics.areEqual(c4113a.LIZJ, this.LIZJ)) || (Intrinsics.areEqual(c4113a.LIZIZ, this.LIZJ) && Intrinsics.areEqual(this.LIZJ, this.LIZIZ)))) {
            return true;
        }
        return false;
    }

    public C4113a(String str, String str2) {
        C106862S5w.LIZ(str, str2);
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
