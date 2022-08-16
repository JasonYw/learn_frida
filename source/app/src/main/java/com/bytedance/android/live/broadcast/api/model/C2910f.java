package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;

/* renamed from: com.bytedance.android.live.broadcast.api.model.f */
/* loaded from: classes5.dex */
public class C2910f {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("enable_live_audio")
    public boolean LIZIZ;
    @SerializedName("enable_live_third_party")
    public boolean LIZJ;
    @SerializedName("enable_live_screenshot")
    public boolean LIZLLL;
    @SerializedName("toast")

    /* renamed from: LJ */
    public C2911a f25779LJ;

    /* renamed from: com.bytedance.android.live.broadcast.api.model.f$a */
    /* loaded from: classes5.dex */
    public static class C2911a {
        @SerializedName("new_anchor")
        public boolean LIZ;

        static {
            Covode.recordClassIndex(14557);
        }
    }

    static {
        Covode.recordClassIndex(14556);
    }

    public int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return super.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2910f) {
            C2910f c2910f = (C2910f) obj;
            if (this.LIZIZ == c2910f.LIZIZ && this.LIZJ == c2910f.LIZJ && this.LIZLLL == c2910f.LIZLLL) {
                return true;
            }
        }
        return false;
    }
}
