package com.bytedance.android.live.browser.jsbridge.newmethods;

import android.os.Bundle;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.business.IHostVerify;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.C13052h;
import org.json.JSONObject;
import p003X.AbstractC88358Krg;
import p003X.C439993ar;
import p003X.PK0;

/* loaded from: classes5.dex */
public class OpenCashVerifyMethod extends PK0<JSONObject, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(22602);
    }

    @Override // p003X.PK0
    public Object invoke(JSONObject jSONObject, C13052h c13052h) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject, c13052h}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ((IHostVerify) ServiceManager.getService(IHostVerify.class)).verifyForStartLive(C439993ar.LIZ(c13052h.LIZIZ), 0, "4", (Bundle) null, (AbstractC88358Krg) null);
        return null;
    }
}
