package com.bytedance.android.live.browser.jsbridge.newmethods;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.C13052h;
import p003X.C3QD;
import p003X.C87010KQi;
import p003X.PK0;

/* loaded from: classes5.dex */
public final class ShowStikerMethod extends PK0<Params, Object> {
    public static ChangeQuickRedirect LIZ;

    /* loaded from: classes5.dex */
    public static final class Params {
        static {
            Covode.recordClassIndex(22621);
        }
    }

    static {
        Covode.recordClassIndex(22620);
    }

    @Override // p003X.PK0
    public final /* synthetic */ Object invoke(Params params, C13052h c13052h) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{params, c13052h}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C87010KQi.LIZ().LIZ(new C3QD());
        return null;
    }
}
