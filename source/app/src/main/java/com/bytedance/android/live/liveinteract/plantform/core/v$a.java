package com.bytedance.android.live.liveinteract.plantform.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class v$a {
    public static ChangeQuickRedirect LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final String f26412LJ;

    static {
        Covode.recordClassIndex(29330);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.LIZIZ), this.LIZJ, this.LIZLLL, this.f26412LJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof v$a) {
            return C106862S5w.LIZ(((v$a) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("LinkPkUserInfoCenter$RefreshInfo:%s,%s,%s,%s", LIZ());
    }

    public v$a(long j, String str, String str2, String str3) {
        C106862S5w.LIZ(str);
        this.LIZIZ = j;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.f26412LJ = str3;
    }

    public /* synthetic */ v$a(long j, String str, String str2, String str3, int i) {
        this(j, str, str2, null);
    }
}
