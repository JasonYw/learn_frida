package com.bytedance.android.live.liveinteract.api.data;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.api.data.g */
/* loaded from: classes3.dex */
public final class C4285g {
    public static ChangeQuickRedirect LIZ;
    public final boolean LIZIZ;
    public final ImageModel LIZJ;
    public final ImageModel LIZLLL;

    /* renamed from: LJ */
    public final long f26257LJ;
    public final float LJFF;

    static {
        Covode.recordClassIndex(25165);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Boolean.valueOf(this.LIZIZ), this.LIZJ, this.LIZLLL, Long.valueOf(this.f26257LJ), Float.valueOf(this.LJFF)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4285g) {
            return C106862S5w.LIZ(((C4285g) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("PaidProfileCardData:%s,%s,%s,%s,%s", LIZ());
    }

    public C4285g(boolean z, ImageModel imageModel, ImageModel imageModel2, long j, float f) {
        this.LIZIZ = z;
        this.LIZJ = imageModel;
        this.LIZLLL = imageModel2;
        this.f26257LJ = j;
        this.LJFF = f;
    }
}
