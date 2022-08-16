package com.bytedance.android.live.profit.lottery;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.profit.lottery.g */
/* loaded from: classes12.dex */
public final class C5329g {
    public static ChangeQuickRedirect LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;

    /* renamed from: LJ */
    public final int f26567LJ;
    public final boolean LJFF;

    static {
        Covode.recordClassIndex(33478);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ), Long.valueOf(this.LIZLLL), Integer.valueOf(this.f26567LJ), Boolean.valueOf(this.LJFF)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5329g) {
            return C106862S5w.LIZ(((C5329g) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("LocalLotteryInfo:%s,%s,%s,%s,%s", LIZ());
    }

    public C5329g(long j, int i, long j2, int i2, boolean z) {
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = j2;
        this.f26567LJ = i2;
        this.LJFF = z;
    }
}
