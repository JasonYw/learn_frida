package com.aweme.account.weiboauth;

import com.aweme.account.thirdservicemanger.BundleActivator;
import com.aweme.account.thirdservicemanger.C2427b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes13.dex */
public final class WeiboBundleActivator implements BundleActivator {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(9369);
    }

    @Override // com.aweme.account.thirdservicemanger.BundleActivator
    public final void LIZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && !C2427b.LIZLLL.LIZ().LIZIZ("sina_weibo")) {
            C2427b.LIZLLL.LIZ().LIZ("sina_weibo", new C2428a());
        }
    }
}
