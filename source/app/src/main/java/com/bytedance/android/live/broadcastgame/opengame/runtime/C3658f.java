package com.bytedance.android.live.broadcastgame.opengame.runtime;

import com.bytedance.android.live.broadcastgame.opengame.network.C3531a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.f */
/* loaded from: classes5.dex */
public final class C3658f {
    public static ChangeQuickRedirect LIZ;
    public final List<C3531a.C3532a> LIZIZ;
    public final List<C3531a.C3534c> LIZJ;
    public final boolean LIZLLL;

    /* renamed from: LJ */
    public final boolean f26081LJ;
    public final List<Integer> LJFF;
    public final String LJI;

    static {
        Covode.recordClassIndex(20909);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, this.LIZJ, Boolean.valueOf(this.LIZLLL), Boolean.valueOf(this.f26081LJ), this.LJFF, this.LJI};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3658f) {
            return C106862S5w.LIZ(((C3658f) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("GameScopeInfo:%s,%s,%s,%s,%s,%s", LIZ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3658f(List<? extends C3531a.C3532a> list, List<? extends C3531a.C3534c> list2, boolean z, boolean z2, List<Integer> list3, String str) {
        C106862S5w.LIZ(list, list2, str);
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = z;
        this.f26081LJ = z2;
        this.LJFF = list3;
        this.LJI = str;
    }
}
