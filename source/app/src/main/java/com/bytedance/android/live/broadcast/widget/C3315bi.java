package com.bytedance.android.live.broadcast.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.widget.bi */
/* loaded from: classes.dex */
public final class C3315bi {
    public static ChangeQuickRedirect LIZ;
    @SerializedName(PushConstants.WEB_URL)
    public final String LIZIZ;
    @SerializedName("status_msg")
    public final String LIZJ;
    @SerializedName("status_code")
    public final int LIZLLL;

    static {
        Covode.recordClassIndex(18928);
    }

    public C3315bi() {
        this(null, null, 0, 7);
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
        if (obj instanceof C3315bi) {
            return C106862S5w.LIZ(((C3315bi) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("QianChuanSchemaResponse:%s,%s,%s", LIZ());
    }

    public C3315bi(String str, String str2, int i) {
        C106862S5w.LIZ(str, str2);
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i;
    }

    public /* synthetic */ C3315bi(String str, String str2, int i, int i2) {
        this("", "", -1);
    }
}
