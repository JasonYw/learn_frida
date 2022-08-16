package com.android.ttcjpaysdk.integrated.counter.dyim.provider;

import android.content.Context;
import android.view.View;
import com.android.ttcjpaysdk.base.service.ICJPayIntegratedDyImService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C137157ccj;
import p003X.C137211cdb;
import p003X.C137214cde;
import p003X.C137291cet;

/* loaded from: classes17.dex */
public class CJPayIntegratedDyImProvider implements ICJPayIntegratedDyImService {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(7633);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public String getPackageName() {
        return null;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedStyleService
    public Object getConfirmAdapter(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C137214cde(context);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedStyleService
    public Object getConfirmWrapper(View view) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C137157ccj(view);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedStyleService
    public Object getMethodAdapter(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C137211cdb(context);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedStyleService
    public Object getMethodWrapper(View view) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C137291cet(view);
    }
}
