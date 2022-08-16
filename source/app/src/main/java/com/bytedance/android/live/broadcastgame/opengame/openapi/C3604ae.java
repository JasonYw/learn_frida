package com.bytedance.android.live.broadcastgame.opengame.openapi;

import android.content.Context;
import com.bytedance.android.live.broadcastgame.opengame.runtime.LaunchMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.openapi.ae */
/* loaded from: classes5.dex */
public final class C3604ae {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final Context LIZLLL;

    /* renamed from: LJ */
    public final LaunchMode f26073LJ;
    public final long LJFF;
    public final String LJI;

    static {
        Covode.recordClassIndex(20582);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, Long.valueOf(this.LIZJ), this.LIZLLL, this.f26073LJ, Long.valueOf(this.LJFF), this.LJI};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3604ae) {
            return C106862S5w.LIZ(((C3604ae) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("OpenApiParams:%s,%s,%s,%s,%s,%s", LIZ());
    }

    public C3604ae(String str, long j, Context context, LaunchMode launchMode, long j2, String str2) {
        C106862S5w.LIZ(str, context, launchMode, str2);
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = context;
        this.f26073LJ = launchMode;
        this.LJFF = j2;
        this.LJI = str2;
    }
}
