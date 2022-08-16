package com.bytedance.android.live.broadcast.gamedetail.order;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12638e;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.order.d */
/* loaded from: classes5.dex */
public final class C3100d implements AbstractC12638e {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final String f25876LJ;
    public final String LJFF;
    public final String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final long LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final int LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;

    static {
        Covode.recordClassIndex(16499);
    }

    public C3100d() {
        this(null, null, null, null, null, null, null, null, null, null, 0L, null, null, 0, null, null, null, null, 262143);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.f25876LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, Long.valueOf(this.LJIIJJI), this.LJIIL, this.LJIILIIL, Integer.valueOf(this.LJIILJJIL), this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3100d) {
            return C106862S5w.LIZ(((C3100d) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("GameDetailLaunchParams:%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", LIZ());
    }

    public C3100d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j, String str11, String str12, int i, String str13, String str14, String str15, String str16) {
        C106862S5w.LIZ(str14, str15);
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.f25876LJ = str4;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = str7;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = str9;
        this.LJIIJ = str10;
        this.LJIIJJI = j;
        this.LJIIL = str11;
        this.LJIILIIL = str12;
        this.LJIILJJIL = i;
        this.LJIILL = str13;
        this.LJIILLIIL = str14;
        this.LJIIZILJ = str15;
        this.LJIJ = str16;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C3100d(java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, long r39, java.lang.String r41, java.lang.String r42, int r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, int r48) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.gamedetail.order.C3100d.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
