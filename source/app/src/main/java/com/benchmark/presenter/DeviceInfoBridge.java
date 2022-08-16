package com.benchmark.presenter;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONObject;
import p003X.C108862Stc;
import p003X.C108868Sti;
import p003X.C74652Fc6;

/* loaded from: classes2.dex */
public class DeviceInfoBridge {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(9714);
    }

    public String getDeviceInfo() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject LIZ = C74652Fc6.LIZ(C108862Stc.LIZIZ().LIZIZ);
        C108868Sti.LIZ("new_device_info", LIZ);
        return LIZ.toString();
    }
}
