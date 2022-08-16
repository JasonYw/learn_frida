package com.bytedance.android.live.liveinteract.plantform.model;

import com.bytedance.android.livesdk.chatroom.model.interact.NormalPaidLinkmicAddPriceStrategy;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.plantform.model.i */
/* loaded from: classes3.dex */
public final class C4815i {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("add_price_value")
    public final long LIZIZ;
    @SerializedName("add_price_strategy")
    public final int LIZJ;
    @SerializedName("add_price_multiple")
    public final long LIZLLL;
    @SerializedName("rank_after_add_price")

    /* renamed from: LJ */
    public final long f26421LJ;

    static {
        Covode.recordClassIndex(29431);
    }

    public C4815i() {
        this(0L, 0, 0L, 0L, 15);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ), Long.valueOf(this.LIZLLL), Long.valueOf(this.f26421LJ)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4815i) {
            return C106862S5w.LIZ(((C4815i) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("GetInfoBeforeAddPriceResponse:%s,%s,%s,%s", LIZ());
    }

    public C4815i(long j, int i, long j2, long j3) {
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = j2;
        this.f26421LJ = j3;
    }

    public /* synthetic */ C4815i(long j, int i, long j2, long j3, int i2) {
        this(0L, NormalPaidLinkmicAddPriceStrategy.Unkown.ordinal(), 0L, 0L);
    }
}
