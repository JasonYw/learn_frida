package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12642p;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.widget.r */
/* loaded from: classes5.dex */
public final class C3092r implements AbstractC12642p {
    public static ChangeQuickRedirect LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final boolean f25873LJ;
    public final String LJFF;
    public final boolean LJI;

    static {
        Covode.recordClassIndex(16445);
    }

    public C3092r() {
        this(0L, null, null, false, null, false, 63);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.LIZIZ), this.LIZJ, this.LIZLLL, Boolean.valueOf(this.f25873LJ), this.LJFF, Boolean.valueOf(this.LJI)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3092r) {
            return C106862S5w.LIZ(((C3092r) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("GameOfficialAccountProps:%s,%s,%s,%s,%s,%s", LIZ());
    }

    public C3092r(long j, String str, String str2, boolean z, String str3, boolean z2) {
        C106862S5w.LIZ(str, str2, str3);
        this.LIZIZ = j;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.f25873LJ = z;
        this.LJFF = str3;
        this.LJI = z2;
    }

    public /* synthetic */ C3092r(long j, String str, String str2, boolean z, String str3, boolean z2, int i) {
        this(0L, "", "", false, "", false);
    }
}
