package com.bytedance.android.live.browser.jsbridge.newmethods;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class cz$a {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("type")
    public final String LIZIZ;
    @SerializedName("enter_from")
    public final String LIZJ;
    @SerializedName("extra")
    public final JsonObject LIZLLL;

    static {
        Covode.recordClassIndex(22766);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof cz$a) {
            return C106862S5w.LIZ(((cz$a) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("OpenPanelMethod$Param:%s,%s,%s", LIZ());
    }
}
