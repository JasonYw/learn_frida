package com.bytedance.android.live.profit.lottery;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.profit.lottery.t */
/* loaded from: classes12.dex */
public final class C5339t {
    public static ChangeQuickRedirect LIZ;
    public final long LIZIZ;
    public final List<Long> LIZJ;
    public final String LIZLLL;

    static {
        Covode.recordClassIndex(33539);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.LIZIZ), this.LIZJ, this.LIZLLL};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5339t) {
            return C106862S5w.LIZ(((C5339t) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("LotteryNewDrawResult:%s,%s,%s", LIZ());
    }

    public C5339t(long j, List<Long> list, String str) {
        C106862S5w.LIZ(list, str);
        this.LIZIZ = j;
        this.LIZJ = list;
        this.LIZLLL = str;
    }
}
