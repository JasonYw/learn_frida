package com.bytedance.android.live.broadcast.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.vchannel.C33968a;
import p003X.C116971W2r;
import p003X.C419562j0;

/* renamed from: com.bytedance.android.live.broadcast.model.b */
/* loaded from: classes12.dex */
public final class C3156b {
    public static ChangeQuickRedirect LIZ;
    @SerializedName(C33968a.f42937f)
    public final long LIZIZ;
    @SerializedName("task_stats")
    public final C419562j0 LIZJ;
    @SerializedName("task_version")
    public final String LIZLLL;

    static {
        Covode.recordClassIndex(16988);
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return C116971W2r.LIZ(this.LIZIZ);
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return String.valueOf(this.LIZIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3156b)) {
            obj = null;
        }
        C3156b c3156b = (C3156b) obj;
        if (c3156b != null && c3156b.LIZIZ == this.LIZIZ) {
            return true;
        }
        return false;
    }
}
