package com.bytedance.android.live.liveinteract.api.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.api.data.c */
/* loaded from: classes3.dex */
public final class C4282c {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("m_speed_shake_mill_seconds")
    public final double LIZIZ;
    @SerializedName("accelerameter_threshold")
    public final Double LIZJ;
    @SerializedName("min_shake_interval")
    public final double LIZLLL;
    @SerializedName("shake_end_time_interval_threshold")

    /* renamed from: LJ */
    public final Double f26255LJ;
    @SerializedName("shake_interval_millsecond")
    public final double LJFF;

    static {
        Covode.recordClassIndex(25160);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Double.valueOf(this.LIZIZ), this.LIZJ, Double.valueOf(this.LIZLLL), this.f26255LJ, Double.valueOf(this.LJFF)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4282c) {
            return C106862S5w.LIZ(((C4282c) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("GalileoResponse:%s,%s,%s,%s,%s", LIZ());
    }
}
