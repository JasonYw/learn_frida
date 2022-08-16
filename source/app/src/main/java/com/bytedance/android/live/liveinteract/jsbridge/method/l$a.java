package com.bytedance.android.live.liveinteract.jsbridge.method;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class l$a {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("to_user_id")
    public final long LIZIZ;
    @SerializedName("to_room_id")
    public final long LIZJ;
    @SerializedName("sec_to_user_id")
    public final String LIZLLL;
    @SerializedName("sign_extra")

    /* renamed from: LJ */
    public final String f26329LJ;

    static {
        Covode.recordClassIndex(27479);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.LIZIZ), Long.valueOf(this.LIZJ), this.LIZLLL, this.f26329LJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof l$a) {
            return C106862S5w.LIZ(((l$a) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("InvitePkMethod$Params:%s,%s,%s,%s", LIZ());
    }
}
