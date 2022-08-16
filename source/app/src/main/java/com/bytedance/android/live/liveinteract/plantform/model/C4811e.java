package com.bytedance.android.live.liveinteract.plantform.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.plantform.model.e */
/* loaded from: classes3.dex */
public final class C4811e {
    public static ChangeQuickRedirect LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    /* renamed from: LJ */
    public final boolean f26420LJ;
    public final boolean LJFF;
    public final String LJI;

    static {
        Covode.recordClassIndex(29427);
    }

    public C4811e() {
        this(0, 0, 0, false, false, null, 63);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL), Boolean.valueOf(this.f26420LJ), Boolean.valueOf(this.LJFF), this.LJI};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4811e) {
            return C106862S5w.LIZ(((C4811e) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("AnchorReplyParams:%s,%s,%s,%s,%s,%s", LIZ());
    }

    public C4811e(int i, int i2, int i3, boolean z, boolean z2, String str) {
        C106862S5w.LIZ(str);
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.f26420LJ = z;
        this.LJFF = z2;
        this.LJI = str;
    }

    public /* synthetic */ C4811e(int i, int i2, int i3, boolean z, boolean z2, String str, int i4) {
        this(0, 0, 0, false, false, "");
    }
}
