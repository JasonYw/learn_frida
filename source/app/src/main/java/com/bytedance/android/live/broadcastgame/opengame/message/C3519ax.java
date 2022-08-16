package com.bytedance.android.live.broadcastgame.opengame.message;

import com.bytedance.android.live.broadcastgame.AbstractC3404c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.message.ax */
/* loaded from: classes5.dex */
public final class C3519ax implements AbstractC3404c {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;

    /* renamed from: LJ */
    public final String f26063LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;

    static {
        Covode.recordClassIndex(20289);
    }

    public C3519ax() {
        this(null, null, 0, null, null, null, null, 127);
    }

    private Object[] LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, this.LIZJ, Integer.valueOf(this.LIZLLL), this.f26063LJ, this.LJFF, this.LJI, this.LJII};
    }

    @Override // com.bytedance.android.live.broadcastgame.AbstractC3404c
    public final long LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        return -1L;
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3519ax) {
            return C106862S5w.LIZ(((C3519ax) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("ViolateMessage:%s,%s,%s,%s,%s,%s,%s", LIZIZ());
    }

    public C3519ax(String str, String str2, int i, String str3, String str4, String str5, String str6) {
        C106862S5w.LIZ(str, str2, str3, str4, str5, str6);
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i;
        this.f26063LJ = str3;
        this.LJFF = str4;
        this.LJI = str5;
        this.LJII = str6;
    }

    public /* synthetic */ C3519ax(String str, String str2, int i, String str3, String str4, String str5, String str6, int i2) {
        this("", "", 0, "", "", "", "");
    }
}
