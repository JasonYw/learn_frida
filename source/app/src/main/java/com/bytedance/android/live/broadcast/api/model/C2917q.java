package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.C116971W2r;

/* renamed from: com.bytedance.android.live.broadcast.api.model.q */
/* loaded from: classes5.dex */
public final class C2917q implements Comparable<C2917q> {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public String f25781LJ;
    public String LJFF;
    public String LJI;
    public long LJII;
    public int LJIIIIZZ = -1;
    public int LJIIIZ = -1;
    public long LJIIJ;

    static {
        Covode.recordClassIndex(14568);
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return C116971W2r.LIZ(this.LJIIJ);
    }

    public C2917q(long j) {
        this.LJIIJ = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C2917q) && this.LJIIJ == ((C2917q) obj).LJIIJ) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C2917q c2917q) {
        C2917q c2917q2 = c2917q;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c2917q2}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C106862S5w.LIZ(c2917q2);
        long j = this.LJII;
        long j2 = c2917q2.LJII;
        if (j > j2) {
            return -1;
        }
        if (j < j2) {
            return 1;
        }
        return 0;
    }
}
