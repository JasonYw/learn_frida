package com.aweme.account.wxauth;

import com.aweme.account.thirdservicemanger.BundleActivator;
import com.aweme.account.thirdservicemanger.C2427b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C125196ZPa;

/* loaded from: classes13.dex */
public final class WXBundleActivator implements BundleActivator {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(9373);
    }

    @Override // com.aweme.account.thirdservicemanger.BundleActivator
    public final void LIZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && !C2427b.LIZLLL.LIZ().LIZIZ("weixin")) {
            C2427b.LIZLLL.LIZ().LIZ("weixin", new C125196ZPa());
        }
    }
}
