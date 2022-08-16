package com.bytedance.android.live.misc;

import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.rank.RankService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import p003X.AbstractC410912Of;
import p003X.AbstractC440163b8;

/* loaded from: classes12.dex */
public class LiveService$$liverankimpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            Covode.recordClassIndex(32509);
        } else {
            Covode.recordClassIndex(32509);
        }
    }

    public static void registerService() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        RankService rankService = new RankService();
        ServiceManager.registerService(AbstractC440163b8.class, rankService);
        ServiceManager.registerService(AbstractC410912Of.class, rankService);
    }
}
