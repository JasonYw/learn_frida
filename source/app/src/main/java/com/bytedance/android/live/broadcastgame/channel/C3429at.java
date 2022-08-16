package com.bytedance.android.live.broadcastgame.channel;

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

/* renamed from: com.bytedance.android.live.broadcastgame.channel.at */
/* loaded from: classes5.dex */
public final class C3429at {
    public static ChangeQuickRedirect LIZ;
    @SerializedName(PushConstants.MZ_PUSH_MESSAGE_METHOD)
    public final String LIZIZ;
    @SerializedName(PushConstants.WEB_URL)
    public final String LIZJ;
    @SerializedName("params")
    public final Map<String, String> LIZLLL;
    @SerializedName(C2521l.LJIIL)

    /* renamed from: LJ */
    public final Map<String, String> f26040LJ;
    @SerializedName("headers")
    public final Map<String, String> LJFF;

    static {
        Covode.recordClassIndex(19444);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.f26040LJ, this.LJFF};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3429at) {
            return C106862S5w.LIZ(((C3429at) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("RequestData:%s,%s,%s,%s,%s", LIZ());
    }
}
