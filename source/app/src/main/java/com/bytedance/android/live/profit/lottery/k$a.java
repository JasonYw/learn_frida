package com.bytedance.android.live.profit.lottery;

import com.bytedance.android.live.profit.lottery.p413a.C5311b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.C449763qc;

/* loaded from: classes12.dex */
public final class k$a {
    public static ChangeQuickRedirect LIZ;
    public final JsonObject LIZIZ;
    public final C449763qc LIZJ;

    static {
        Covode.recordClassIndex(33489);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ, this.LIZJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof k$a) {
            return C106862S5w.LIZ(((k$a) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("LotteryApiDataSource$LotteryResult:%s,%s", LIZ());
    }

    public final boolean LIZ(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        List<C5311b> list = this.LIZJ.LIZJ;
        if (list == null || ((list instanceof Collection) && list.isEmpty())) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((C5311b) it.next()).LIZ == j) {
                return true;
            }
        }
        return false;
    }

    public k$a(JsonObject jsonObject, C449763qc c449763qc) {
        C106862S5w.LIZ(jsonObject, c449763qc);
        this.LIZIZ = jsonObject;
        this.LIZJ = c449763qc;
    }
}
