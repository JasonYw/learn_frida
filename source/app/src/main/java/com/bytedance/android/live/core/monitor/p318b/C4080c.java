package com.bytedance.android.live.core.monitor.p318b;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.JvmStatic;
import p003X.C106862S5w;
import p003X.C450593rx;
import p003X.C81986ITc;

/* renamed from: com.bytedance.android.live.core.monitor.b.c */
/* loaded from: classes3.dex */
public final class C4080c {
    public static ChangeQuickRedirect LIZ;
    public static final C450593rx LJIILIIL = new C450593rx((byte) 0);
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final String f26172LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final Integer LJIIJ;
    public final String LJIIJJI;
    public final Map<String, Object> LJIIL;

    static {
        Covode.recordClassIndex(23504);
    }

    public C4080c() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095);
    }

    @JvmStatic
    public static final C81986ITc LIZ(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, null, LIZ, true, 3);
        return proxy.isSupported ? (C81986ITc) proxy.result : LJIILIIL.LIZ(str, str2);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.f26172LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4080c) {
            return C106862S5w.LIZ(((C4080c) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("TraceMeta:%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", LIZ());
    }

    public C4080c(C81986ITc c81986ITc) {
        this(c81986ITc.LJIIJJI, c81986ITc.LJIIL, c81986ITc.LIZIZ, c81986ITc.LIZJ, c81986ITc.LIZLLL, c81986ITc.f7580LJ, c81986ITc.LJFF, c81986ITc.LJI, c81986ITc.LJII, c81986ITc.LJIIIIZZ, c81986ITc.LJIIIZ, c81986ITc.LJIIJ);
    }

    public /* synthetic */ C4080c(C81986ITc c81986ITc, byte b) {
        this(c81986ITc);
    }

    public C4080c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, Map<String, Object> map) {
        C106862S5w.LIZ(str, str2);
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.f26172LJ = str4;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = str7;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = str9;
        this.LJIIJ = num;
        this.LJIIJJI = str10;
        this.LJIIL = map;
    }

    public /* synthetic */ C4080c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, Map map, int i) {
        this("", "", null, null, null, null, null, null, null, null, null, null);
    }
}
