package com.bytedance.android.live.liveinteract.p382pk;

import com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.pk.c */
/* loaded from: classes3.dex */
public final class C4728c {
    public static ChangeQuickRedirect LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final AbstractC6070q LIZLLL;

    /* renamed from: LJ */
    public final boolean f26408LJ;

    static {
        Covode.recordClassIndex(28924);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Boolean.valueOf(this.LIZIZ), Boolean.valueOf(this.LIZJ), this.LIZLLL, Boolean.valueOf(this.f26408LJ)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4728c) {
            return C106862S5w.LIZ(((C4728c) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("PKAdvanceEvent:%s,%s,%s,%s", LIZ());
    }

    public C4728c(boolean z, boolean z2, AbstractC6070q abstractC6070q, boolean z3) {
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = abstractC6070q;
        this.f26408LJ = z3;
    }

    public /* synthetic */ C4728c(boolean z, boolean z2, AbstractC6070q abstractC6070q, boolean z3, int i) {
        this(z, z2, (i & 4) != 0 ? null : abstractC6070q, false);
    }
}
