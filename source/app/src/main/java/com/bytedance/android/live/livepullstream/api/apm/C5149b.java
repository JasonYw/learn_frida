package com.bytedance.android.live.livepullstream.api.apm;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: com.bytedance.android.live.livepullstream.api.apm.b */
/* loaded from: classes12.dex */
public final class C5149b {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;
    public String LIZJ;
    public String LIZLLL;

    static {
        Covode.recordClassIndex(32116);
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "{error_code=" + this.LIZIZ + ", error_desc='" + this.LIZJ + "', log_id='" + this.LIZLLL + "'}";
    }
}
