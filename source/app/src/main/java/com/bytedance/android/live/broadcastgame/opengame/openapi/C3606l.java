package com.bytedance.android.live.broadcastgame.opengame.openapi;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Map;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.openapi.l */
/* loaded from: classes5.dex */
public final class C3606l {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("path")
    public final String LIZIZ;
    @SerializedName("envID")
    public final String LIZJ;
    @SerializedName("serviceID")
    public final String LIZLLL;
    @SerializedName("header")

    /* renamed from: LJ */
    public final Map<String, String> f26075LJ;
    @SerializedName(PushConstants.MZ_PUSH_MESSAGE_METHOD)
    public final String LJFF;
    @SerializedName("body")
    public final Object LJI;
    @SerializedName("timeout")
    public final long LJII;

    static {
        Covode.recordClassIndex(20711);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.f26075LJ, this.LJFF, this.LJI, Long.valueOf(this.LJII)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3606l) {
            return C106862S5w.LIZ(((C3606l) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("CloudRequestParam:%s,%s,%s,%s,%s,%s,%s", LIZ());
    }
}
