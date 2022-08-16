package com.android.ttcjpaysdk.base.gecko;

import android.content.Context;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.annotation.GeckoRegister;
import com.bytedance.geckox.settings.IGeckoRegister;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;
import p003X.C75994Fxk;

@GeckoRegister(boeAccessKey = "d8694356c0aca73481d38c00960da5a8", prodAccessKey = "c0493580c3e3829043cb33227b6e2d80", testAccessKey = "d8694356c0aca73481d38c00960da5a8")
/* loaded from: classes2.dex */
public class GeckoRegisterImpl implements IGeckoRegister {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6081);
    }

    @Override // com.bytedance.geckox.settings.IGeckoRegister
    public Map<String, OptionCheckUpdateParams.CustomValue> registerCustomParams() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("business_version", new OptionCheckUpdateParams.CustomValue(this) { // from class: com.android.ttcjpaysdk.base.gecko.GeckoRegisterImpl.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(6082);
            }

            @Override // com.bytedance.geckox.OptionCheckUpdateParams.CustomValue
            public final Object getValue() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                return CJPayBasicUtils.getRealVersion();
            }
        });
        return hashMap;
    }

    @Override // com.bytedance.geckox.settings.IGeckoRegister
    public String registerRootDir(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return C75994Fxk.LIZ.LIZ(context.getApplicationContext());
    }
}
