package com.bytedance.android.live.broadcastgame.api.openplatform;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.api.openplatform.a */
/* loaded from: classes5.dex */
public final class C3397a {
    public static ChangeQuickRedirect LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final String f26029LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final Long LJIIJ;
    public final int LJIIJJI;
    public final boolean LJIIL;

    static {
        Covode.recordClassIndex(19236);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Boolean.valueOf(this.LIZIZ), this.LIZJ, this.LIZLLL, this.f26029LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, Integer.valueOf(this.LJIIJJI), Boolean.valueOf(this.LJIIL)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3397a) {
            return C106862S5w.LIZ(((C3397a) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("GameIntroCardInfo:%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", LIZ());
    }

    public C3397a(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, int i, boolean z2) {
        this.LIZIZ = z;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.f26029LJ = str3;
        this.LJFF = str4;
        this.LJI = str5;
        this.LJII = str6;
        this.LJIIIIZZ = str7;
        this.LJIIIZ = str8;
        this.LJIIJ = l;
        this.LJIIJJI = i;
        this.LJIIL = z2;
    }

    public static /* synthetic */ C3397a LIZ(C3397a c3397a, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, int i, boolean z2, int i2, Object obj) {
        boolean z3 = z2;
        int i3 = i;
        Long l2 = l;
        String str9 = str8;
        String str10 = str7;
        String str11 = str6;
        String str12 = str;
        boolean z4 = z;
        String str13 = str2;
        String str14 = str3;
        String str15 = str4;
        String str16 = str5;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3397a, (byte) 0, str12, null, str14, null, null, null, null, str9, null, Integer.valueOf(i3), (byte) 0, Integer.valueOf(i2), null}, null, LIZ, true, 2);
        if (proxy.isSupported) {
            return (C3397a) proxy.result;
        }
        if ((i2 & 1) != 0) {
            z4 = c3397a.LIZIZ;
        }
        if ((i2 & 2) != 0) {
            str12 = c3397a.LIZJ;
        }
        if ((i2 & 4) != 0) {
            str13 = c3397a.LIZLLL;
        }
        if ((i2 & 8) != 0) {
            str14 = c3397a.f26029LJ;
        }
        if ((i2 & 16) != 0) {
            str15 = c3397a.LJFF;
        }
        if ((i2 & 32) != 0) {
            str16 = c3397a.LJI;
        }
        if ((i2 & 64) != 0) {
            str11 = c3397a.LJII;
        }
        if ((i2 & 128) != 0) {
            str10 = c3397a.LJIIIIZZ;
        }
        if ((i2 & 256) != 0) {
            str9 = c3397a.LJIIIZ;
        }
        if ((i2 & 512) != 0) {
            l2 = c3397a.LJIIJ;
        }
        if ((i2 & AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END) != 0) {
            i3 = c3397a.LJIIJJI;
        }
        if ((i2 & AccessibilityEventCompat.TYPE_WINDOW_CONTENT_CHANGED) != 0) {
            z3 = c3397a.LJIIL;
        }
        byte b = z4 ? (byte) 1 : (byte) 0;
        byte b2 = z4 ? (byte) 1 : (byte) 0;
        byte b3 = z3 ? (byte) 1 : (byte) 0;
        byte b4 = z3 ? (byte) 1 : (byte) 0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{Byte.valueOf(b), str12, str13, str14, str15, str16, str11, str10, str9, l2, Integer.valueOf(i3), Byte.valueOf(b3)}, c3397a, LIZ, false, 1);
        if (proxy2.isSupported) {
            return (C3397a) proxy2.result;
        }
        boolean z5 = z3 ? 1 : 0;
        Object[] objArr = z3 ? 1 : 0;
        boolean z6 = z4 ? 1 : 0;
        Object[] objArr2 = z4 ? 1 : 0;
        return new C3397a(z6, str12, str13, str14, str15, str16, str11, str10, str9, l2, i3, z5);
    }
}
