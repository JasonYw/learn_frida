package com.bytedance.android.live.broadcastgame.opengame.message;

import com.bytedance.android.live.broadcastgame.AbstractC3404c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.message.at */
/* loaded from: classes22.dex */
public final class C3518at implements AbstractC3404c {
    public static ChangeQuickRedirect LIZ;
    public final long LIZIZ = System.currentTimeMillis();
    public final String LIZJ;
    public final long LIZLLL;

    /* renamed from: LJ */
    public final int f26062LJ;
    public final int LJFF;
    public final int LJI;
    public final String LJII;

    static {
        Covode.recordClassIndex(20284);
    }

    private Object[] LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZJ, Long.valueOf(this.LIZLLL), Integer.valueOf(this.f26062LJ), Integer.valueOf(this.LJFF), Integer.valueOf(this.LJI), this.LJII};
    }

    @Override // com.bytedance.android.live.broadcastgame.AbstractC3404c
    public final long LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        return -1L;
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3518at) {
            return C106862S5w.LIZ(((C3518at) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("OpenReward:%s,%s,%s,%s,%s,%s", LIZIZ());
    }

    public final String LIZ(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        try {
            String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j));
            Intrinsics.checkNotNullExpressionValue(format, "");
            String substring = format.substring(11, 16);
            Intrinsics.checkNotNullExpressionValue(substring, "");
            return substring;
        } catch (Exception unused) {
            return "";
        }
    }

    public C3518at(String str, long j, int i, int i2, int i3, String str2) {
        this.LIZJ = str;
        this.LIZLLL = j;
        this.f26062LJ = i;
        this.LJFF = i2;
        this.LJI = i3;
        this.LJII = str2;
    }
}
