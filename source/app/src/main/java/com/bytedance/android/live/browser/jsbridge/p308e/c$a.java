package com.bytedance.android.live.browser.jsbridge.p308e;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC144460eWs;

/* renamed from: com.bytedance.android.live.browser.jsbridge.e.c$a */
/* loaded from: classes19.dex */
public class c$a {
    public static ChangeQuickRedirect LIZ;
    public String[] LIZIZ;
    public String[] LIZJ = new String[0];
    public AbstractC144460eWs LIZLLL;

    static {
        Covode.recordClassIndex(22266);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LIZLLL.LIZ(this.LIZIZ);
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LIZLLL.LIZJ(this.LIZIZ);
    }

    public c$a(String[] strArr, AbstractC144460eWs abstractC144460eWs) {
        this.LIZIZ = strArr;
        this.LIZLLL = abstractC144460eWs;
    }
}
