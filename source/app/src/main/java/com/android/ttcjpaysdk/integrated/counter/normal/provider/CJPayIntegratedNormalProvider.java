package com.android.ttcjpaysdk.integrated.counter.normal.provider;

import android.content.Context;
import android.view.View;
import com.android.ttcjpaysdk.base.service.ICJPayIntegratedNormalService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C137162cco;
import p003X.C137212cdc;
import p003X.C137227cdr;
import p003X.C137292ceu;

/* loaded from: classes17.dex */
public class CJPayIntegratedNormalProvider implements ICJPayIntegratedNormalService {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(7821);
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
        return new C137227cdr(context);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedStyleService
    public Object getConfirmWrapper(View view) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C137162cco(view);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedStyleService
    public Object getMethodAdapter(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C137212cdc(context);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedStyleService
    public Object getMethodWrapper(View view) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C137292ceu(view);
    }
}
