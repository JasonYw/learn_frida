package com.android.ttcjpaysdk.base.service;

import com.android.ttcjpaysdk.base.service.api.CJPayServiceAPI;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.util.HashMap;
import java.util.Map;
import p003X.C116971W2r;

/* loaded from: classes26.dex */
public class CJPayServiceManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static CJPayServiceManager instance;
    public Map<Class, ICJPayService> mServices = new HashMap();

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            Covode.recordClassIndex(6400);
        } else {
            Covode.recordClassIndex(6400);
        }
    }

    public static CJPayServiceManager getInstance() {
        MethodCollector.m14708i(387);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            CJPayServiceManager cJPayServiceManager = (CJPayServiceManager) proxy.result;
            MethodCollector.m14707o(387);
            return cJPayServiceManager;
        }
        if (instance == null) {
            synchronized (CJPayServiceManager.class) {
                try {
                    if (instance == null) {
                        instance = new CJPayServiceManager();
                    }
                } catch (Throwable th) {
                    MethodCollector.m14707o(387);
                    throw th;
                }
            }
        }
        CJPayServiceManager cJPayServiceManager2 = instance;
        MethodCollector.m14707o(387);
        return cJPayServiceManager2;
    }

    public <T extends ICJPayService> T getIService(Class cls) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        return (T) CJPayServiceAPI.getCJPayService(this.mServices, cls);
    }

    private ICJPayService createService(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (ICJPayService) proxy.result;
        }
        try {
            return (ICJPayService) C116971W2r.LIZ(str).newInstance();
        } catch (Exception unused) {
            return null;
        }
    }
}
