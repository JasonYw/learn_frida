package com.aweme.account.toutiaoauth;

import com.aweme.account.thirdservicemanger.BundleActivator;
import com.aweme.account.thirdservicemanger.C2427b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C117739WWf;

/* loaded from: classes13.dex */
public final class ToutiaoBundleActivator implements BundleActivator {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(9365);
    }

    @Override // com.aweme.account.thirdservicemanger.BundleActivator
    public final void LIZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && !C2427b.LIZLLL.LIZ().LIZIZ("toutiao")) {
            C2427b.LIZLLL.LIZ().LIZ("toutiao", new C117739WWf());
        }
    }
}
