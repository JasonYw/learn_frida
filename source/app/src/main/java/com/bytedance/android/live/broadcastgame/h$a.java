package com.bytedance.android.live.broadcastgame;

import com.bytedance.android.live.broadcastgame.api.p283b.a$b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.C448023no;

/* loaded from: classes12.dex */
public final class h$a extends a$b {
    public static ChangeQuickRedirect LIZ;
    public static final C448023no LJIIJJI = new C448023no((byte) 0);
    public final DataCenter LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    /* renamed from: LJ */
    public final boolean f26050LJ;
    public final int LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;

    static {
        Covode.recordClassIndex(19870);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, Integer.valueOf(this.LIZJ), Boolean.valueOf(this.LIZLLL), Boolean.valueOf(this.f26050LJ), Integer.valueOf(this.LJFF), Boolean.valueOf(this.LJI), Boolean.valueOf(this.LJII), Boolean.valueOf(this.LJIIIIZZ), Integer.valueOf(this.LJIIIZ), Integer.valueOf(this.LJIIJ)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof h$a) {
            return C106862S5w.LIZ(((h$a) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("ILiveOpenFeatureSceneFilter$SceneFilterContext:%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", LIZ());
    }

    public h$a(DataCenter dataCenter, int i, boolean z, boolean z2, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4) {
        C106862S5w.LIZ(dataCenter);
        this.LIZIZ = dataCenter;
        this.LIZJ = i;
        this.LIZLLL = z;
        this.f26050LJ = z2;
        this.LJFF = i2;
        this.LJI = z3;
        this.LJII = z4;
        this.LJIIIIZZ = z5;
        this.LJIIIZ = i3;
        this.LJIIJ = i4;
    }
}
