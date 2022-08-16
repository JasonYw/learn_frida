package com.bytedance.android.live.playtogether.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.playtogether.viewmodel.b */
/* loaded from: classes.dex */
public final class C5243b {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final C5244c LIZLLL;

    static {
        Covode.recordClassIndex(33198);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, Long.valueOf(this.LIZJ), this.LIZLLL};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5243b) {
            return C106862S5w.LIZ(((C5243b) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("InvitedEvent:%s,%s,%s", LIZ());
    }

    public C5243b(String str, long j, C5244c c5244c) {
        C106862S5w.LIZ(str, c5244c);
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = c5244c;
    }
}
