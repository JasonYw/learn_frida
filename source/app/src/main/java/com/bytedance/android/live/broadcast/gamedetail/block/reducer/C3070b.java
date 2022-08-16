package com.bytedance.android.live.broadcast.gamedetail.block.reducer;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12643t;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.reducer.b */
/* loaded from: classes5.dex */
public final class C3070b implements AbstractC12643t {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    /* renamed from: LJ */
    public final int f25853LJ;
    public final int LJFF;
    public final boolean LJI;

    static {
        Covode.recordClassIndex(16277);
    }

    public C3070b() {
        this(null, 0, 0, 0, 0, false, 63);
    }

    public static /* synthetic */ C3070b LIZ(C3070b c3070b, String str, int i, int i2, int i3, int i4, boolean z, int i5, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3070b, str, 0, Integer.valueOf(i2), 0, Integer.valueOf(i4), Byte.valueOf(b), Integer.valueOf(i5), null}, null, LIZ, true, 2);
        if (proxy.isSupported) {
            return (C3070b) proxy.result;
        }
        if ((i5 & 1) != 0) {
            str = c3070b.LIZIZ;
        }
        if ((i5 & 2) != 0) {
            i = c3070b.LIZJ;
        }
        if ((i5 & 4) != 0) {
            i2 = c3070b.LIZLLL;
        }
        if ((i5 & 8) != 0) {
            i3 = c3070b.f25853LJ;
        }
        if ((i5 & 16) != 0) {
            i4 = c3070b.LJFF;
        }
        if ((i5 & 32) != 0) {
            z = c3070b.LJI;
        }
        return c3070b.LIZ(str, i, i2, i3, i4, z);
    }

    private C3070b LIZ(String str, int i, int i2, int i3, int i4, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C3070b) proxy.result;
        }
        C106862S5w.LIZ(str);
        return new C3070b(str, i, i2, i3, i4, z);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL), Integer.valueOf(this.f25853LJ), Integer.valueOf(this.LJFF), Boolean.valueOf(this.LJI)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3070b) {
            return C106862S5w.LIZ(((C3070b) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("AudienceGameDetailPageState:%s,%s,%s,%s,%s,%s", LIZ());
    }

    public C3070b(String str, int i, int i2, int i3, int i4, boolean z) {
        C106862S5w.LIZ(str);
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.f25853LJ = i3;
        this.LJFF = i4;
        this.LJI = z;
    }

    public /* synthetic */ C3070b(String str, int i, int i2, int i3, int i4, boolean z, int i5) {
        this((i5 & 1) != 0 ? "tab_game_detail" : str, (i5 & 2) != 0 ? 2 : i, (i5 & 4) != 0 ? 1 : i2, (i5 & 8) != 0 ? 1 : i3, (i5 & 16) != 0 ? 1 : i4, (i5 & 32) != 0 ? true : z);
    }
}
