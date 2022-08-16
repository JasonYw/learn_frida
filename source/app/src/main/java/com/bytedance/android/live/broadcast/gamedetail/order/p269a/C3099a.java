package com.bytedance.android.live.broadcast.gamedetail.order.p269a;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.order.a.a */
/* loaded from: classes5.dex */
public final class C3099a {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    /* renamed from: LJ */
    public final int f25875LJ;

    static {
        Covode.recordClassIndex(16487);
    }

    public C3099a() {
        this(null, null, false, 0, 15);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, this.LIZJ, Boolean.valueOf(this.LIZLLL), Integer.valueOf(this.f25875LJ)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3099a) {
            return C106862S5w.LIZ(((C3099a) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("OrderEvent:%s,%s,%s,%s", LIZ());
    }

    public C3099a(String str, String str2, boolean z, int i) {
        C106862S5w.LIZ(str, str2);
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = z;
        this.f25875LJ = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C3099a(java.lang.String r3, java.lang.String r4, boolean r5, int r6, int r7) {
        /*
            r2 = this;
            r0 = r7 & 1
            java.lang.String r1 = ""
            if (r0 == 0) goto L7
            r3 = r1
        L7:
            r0 = r7 & 2
            if (r0 == 0) goto Lc
            r4 = r1
        Lc:
            r0 = r7 & 4
            if (r0 == 0) goto L11
            r5 = 0
        L11:
            r0 = r7 & 8
            if (r0 == 0) goto L16
            r6 = r5
        L16:
            r2.<init>(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.gamedetail.order.p269a.C3099a.<init>(java.lang.String, java.lang.String, boolean, int, int):void");
    }
}
