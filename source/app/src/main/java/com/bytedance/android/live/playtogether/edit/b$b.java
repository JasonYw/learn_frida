package com.bytedance.android.live.playtogether.edit;

import com.bytedance.android.live.playtogether.p409c.C5213m;
import com.bytedance.android.live.playtogether.p409c.C5215o;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class b$b {
    public static ChangeQuickRedirect LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final C5213m LIZLLL;

    /* renamed from: LJ */
    public final C5215o f26544LJ;
    public final int LJFF;
    public final long LJI;
    public final String LJII;
    public final Throwable LJIIIIZZ;

    static {
        Covode.recordClassIndex(32974);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Boolean.valueOf(this.LIZIZ), this.LIZJ, this.LIZLLL, this.f26544LJ, Integer.valueOf(this.LJFF), Long.valueOf(this.LJI), this.LJII, this.LJIIIIZZ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof b$b) {
            return C106862S5w.LIZ(((b$b) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("PlayTogetherEditViewModel$PlayTogetherEntranceInfo:%s,%s,%s,%s,%s,%s,%s,%s", LIZ());
    }

    public b$b(boolean z, String str, C5213m c5213m, C5215o c5215o, int i, long j, String str2, Throwable th) {
        this.LIZIZ = z;
        this.LIZJ = str;
        this.LIZLLL = c5213m;
        this.f26544LJ = c5215o;
        this.LJFF = i;
        this.LJI = j;
        this.LJII = str2;
        this.LJIIIIZZ = th;
    }
}
