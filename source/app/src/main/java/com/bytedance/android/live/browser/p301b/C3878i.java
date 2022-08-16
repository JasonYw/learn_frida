package com.bytedance.android.live.browser.p301b;

import com.bytedance.android.live.browser.jsbridge.AbstractC3973g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C101074PrI;

/* renamed from: com.bytedance.android.live.browser.b.i */
/* loaded from: classes8.dex */
public final class C3878i {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(21977);
    }

    public final AbstractC3973g.AbstractC3976d LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (AbstractC3973g.AbstractC3976d) proxy.result;
        }
        return new C101074PrI();
    }
}
