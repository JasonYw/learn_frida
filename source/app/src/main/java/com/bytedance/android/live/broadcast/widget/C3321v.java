package com.bytedance.android.live.broadcast.widget;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.KLX;

/* renamed from: com.bytedance.android.live.broadcast.widget.v */
/* loaded from: classes5.dex */
public final class C3321v {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("status_code")
    public final int LIZIZ;
    @SerializedName("status_msg")
    public final String LIZJ;
    @SerializedName(C2521l.LJIIL)
    public final KLX LIZLLL;

    static {
        Covode.recordClassIndex(18978);
    }

    public C3321v() {
        this(0, null, null, 7);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.LIZIZ), this.LIZJ, this.LIZLLL};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3321v) {
            return C106862S5w.LIZ(((C3321v) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("GrouponEntryResponse:%s,%s,%s", LIZ());
    }

    public C3321v(int i, String str, KLX klx) {
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = klx;
    }

    public /* synthetic */ C3321v(int i, String str, KLX klx, int i2) {
        this(-1, null, null);
    }
}
