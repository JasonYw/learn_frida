package com.bytedance.android.live.broadcastgame.opengame.message;

import com.bytedance.android.livesdk.message.model.C8907gw;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.message.n */
/* loaded from: classes3.dex */
public final class C3524n {
    public static ChangeQuickRedirect LIZ;
    public final List<C8907gw> LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final String f26067LJ;
    public final String LJFF;

    static {
        Covode.recordClassIndex(20309);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.f26067LJ, this.LJFF};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3524n) {
            return C106862S5w.LIZ(((C3524n) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("Comment:%s,%s,%s,%s,%s", LIZ());
    }

    public C3524n(List<C8907gw> list, String str, String str2, String str3, String str4) {
        C106862S5w.LIZ(list, str, str2, str3, str4);
        this.LIZIZ = list;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.f26067LJ = str3;
        this.LJFF = str4;
    }
}
