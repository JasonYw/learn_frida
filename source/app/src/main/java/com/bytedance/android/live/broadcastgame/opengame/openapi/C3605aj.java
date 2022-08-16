package com.bytedance.android.live.broadcastgame.opengame.openapi;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Map;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.openapi.aj */
/* loaded from: classes5.dex */
public final class C3605aj {
    public static ChangeQuickRedirect LIZ;
    @SerializedName(PushConstants.WEB_URL)
    public final String LIZIZ;
    @SerializedName(PushConstants.MZ_PUSH_MESSAGE_METHOD)
    public final String LIZJ;
    @SerializedName("header")
    public final Map<String, String> LIZLLL;
    @SerializedName(C2521l.LJIIL)

    /* renamed from: LJ */
    public final Object f26074LJ;
    @SerializedName("dataType")
    public final String LJFF;
    @SerializedName("responseType")
    public final String LJI;
    @SerializedName("timeout")
    public final long LJII;

    static {
        Covode.recordClassIndex(20606);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.f26074LJ, this.LJFF, this.LJI, Long.valueOf(this.LJII)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3605aj) {
            return C106862S5w.LIZ(((C3605aj) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("RequestParam:%s,%s,%s,%s,%s,%s,%s", LIZ());
    }
}
