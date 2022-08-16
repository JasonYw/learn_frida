package com.bytedance.android.live.liveinteract.api.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import kotlin.jvm.JvmStatic;
import p003X.C106862S5w;
import p003X.C78539Gxh;

/* renamed from: com.bytedance.android.live.liveinteract.api.data.f */
/* loaded from: classes3.dex */
public final class C4284f {
    public static ChangeQuickRedirect LIZ;
    public static final C78539Gxh LJIIIIZZ = new C78539Gxh((byte) 0);
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    /* renamed from: LJ */
    public final boolean f26256LJ;
    public final boolean LJFF;
    public final String LJI;
    public final String LJII;

    static {
        Covode.recordClassIndex(25163);
    }

    @JvmStatic
    public static final C4284f LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 3);
        return proxy.isSupported ? (C4284f) proxy.result : LJIIIIZZ.LIZIZ();
    }

    @JvmStatic
    public static final C4284f LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 4);
        return proxy.isSupported ? (C4284f) proxy.result : LJIIIIZZ.LIZJ();
    }

    @JvmStatic
    public static final C4284f LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 5);
        return proxy.isSupported ? (C4284f) proxy.result : LJIIIIZZ.LIZLLL();
    }

    @JvmStatic
    public static final int LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 13);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : LJIIIIZZ.LJII();
    }

    @JvmStatic
    /* renamed from: LJ */
    public static final int m15776LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 14);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : LJIIIIZZ.LJIIIIZZ();
    }

    private Object[] LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ), Boolean.valueOf(this.LIZLLL), Boolean.valueOf(this.f26256LJ), Boolean.valueOf(this.LJFF), this.LJI, this.LJII};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 17);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4284f) {
            return C106862S5w.LIZ(((C4284f) obj).LJFF(), LJFF());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 18);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LJFF());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 19);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("PaidLinkConfig:%s,%s,%s,%s,%s,%s,%s", LJFF());
    }

    public C4284f(int i, int i2, boolean z, boolean z2, boolean z3, String str, String str2) {
        C106862S5w.LIZ(str, str2);
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = z;
        this.f26256LJ = z2;
        this.LJFF = z3;
        this.LJI = str;
        this.LJII = str2;
    }

    public /* synthetic */ C4284f(int i, int i2, boolean z, boolean z2, boolean z3, String str, String str2, int i3) {
        this(i, i2, z, z2, true, "", "");
    }
}
