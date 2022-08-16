package com.bytedance.android.live.broadcast.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.widget.s */
/* loaded from: classes5.dex */
public final class C3320s {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("status")
    public final int LIZIZ;
    @SerializedName("component_type")
    public final int LIZJ;

    static {
        Covode.recordClassIndex(18975);
    }

    public C3320s() {
        this(0, 0, 3);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3320s) {
            return C106862S5w.LIZ(((C3320s) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("GroupPurchasePermission:%s,%s", LIZ());
    }

    public C3320s(int i, int i2) {
        this.LIZIZ = i;
        this.LIZJ = i2;
    }

    public /* synthetic */ C3320s(int i, int i2, int i3) {
        this(0, 0);
    }
}
