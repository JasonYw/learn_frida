package com.bytedance.android.live.misc;

import com.bytedance.android.live.profit.ProfitServiceImpl;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import p003X.AbstractC446293l1;
import p003X.QAU;

/* loaded from: classes8.dex */
public class LiveService$$liveprofitimpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            Covode.recordClassIndex(32506);
        } else {
            Covode.recordClassIndex(32506);
        }
    }

    public static void registerService() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        ProfitServiceImpl profitServiceImpl = new ProfitServiceImpl();
        ServiceManager.registerService(QAU.class, profitServiceImpl);
        ServiceManager.registerService(AbstractC446293l1.class, profitServiceImpl);
    }
}
