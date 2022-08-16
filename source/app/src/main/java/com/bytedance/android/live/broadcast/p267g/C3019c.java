package com.bytedance.android.live.broadcast.p267g;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.g.c */
/* loaded from: classes22.dex */
public final class C3019c {
    public static ChangeQuickRedirect LIZ;
    public final List<String> LIZIZ;
    public final List<String> LIZJ;

    static {
        Covode.recordClassIndex(15906);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ, this.LIZJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3019c) {
            return C106862S5w.LIZ(((C3019c) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("RefreshPlayGroupInfoEvent:%s,%s", LIZ());
    }

    public C3019c(List<String> list, List<String> list2) {
        C106862S5w.LIZ(list, list2);
        this.LIZIZ = list;
        this.LIZJ = list2;
    }
}
