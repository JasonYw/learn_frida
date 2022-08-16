package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.api.model.c */
/* loaded from: classes3.dex */
public final class C2907c {
    public static ChangeQuickRedirect LIZ;
    @SerializedName(PushConstants.TASK_ID)
    public final String LIZIZ;
    @SerializedName("task_url")
    public final String LIZJ;
    @SerializedName("task_status")
    public final int LIZLLL;

    static {
        Covode.recordClassIndex(14553);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, this.LIZJ, Integer.valueOf(this.LIZLLL)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2907c) {
            return C106862S5w.LIZ(((C2907c) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("AnchorStarTask:%s,%s,%s", LIZ());
    }
}
