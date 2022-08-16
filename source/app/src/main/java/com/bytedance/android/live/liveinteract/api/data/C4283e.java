package com.bytedance.android.live.liveinteract.api.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.api.data.e */
/* loaded from: classes3.dex */
public final class C4283e {
    public static ChangeQuickRedirect LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;

    static {
        Covode.recordClassIndex(25162);
    }

    public C4283e() {
        this(null, null, null, 7);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4283e) {
            return C106862S5w.LIZ(((C4283e) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("PaidBiddingConfig:%s,%s,%s", LIZ());
    }

    public C4283e(Integer num, Integer num2, Integer num3) {
        this.LIZIZ = num;
        this.LIZJ = num2;
        this.LIZLLL = num3;
    }

    public /* synthetic */ C4283e(Integer num, Integer num2, Integer num3, int i) {
        this(0, 0, 0);
    }
}
