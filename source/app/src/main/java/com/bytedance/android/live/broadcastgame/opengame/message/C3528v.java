package com.bytedance.android.live.broadcastgame.opengame.message;

import com.bytedance.android.livesdk.message.model.C8907gw;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.message.v */
/* loaded from: classes3.dex */
public final class C3528v {
    public static ChangeQuickRedirect LIZ;
    public final List<C8907gw> LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final int f26068LJ;
    public final String LJFF;

    static {
        Covode.recordClassIndex(20320);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, Integer.valueOf(this.f26068LJ), this.LJFF};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3528v) {
            return C106862S5w.LIZ(((C3528v) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("FollowAction:%s,%s,%s,%s,%s", LIZ());
    }

    public C3528v(List<C8907gw> list, String str, String str2, int i, String str3) {
        C106862S5w.LIZ(list, str, str2, str3);
        this.LIZIZ = list;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.f26068LJ = i;
        this.LJFF = str3;
    }
}
