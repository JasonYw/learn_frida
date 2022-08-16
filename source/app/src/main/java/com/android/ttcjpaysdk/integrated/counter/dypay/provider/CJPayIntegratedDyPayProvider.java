package com.android.ttcjpaysdk.integrated.counter.dypay.provider;

import android.content.Context;
import android.view.View;
import com.android.ttcjpaysdk.base.service.ICJPayIntegratedDyPayService;
import com.android.ttcjpaysdk.integrated.counter.p154b.C2272a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C137151ccd;
import p003X.C137152cce;
import p003X.C137154ccg;
import p003X.C137178cd4;
import p003X.C137189cdF;

/* loaded from: classes17.dex */
public class CJPayIntegratedDyPayProvider implements ICJPayIntegratedDyPayService {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(7683);
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
        return new C137189cdF(context);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedStyleService
    public Object getMethodAdapter(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C137178cd4(context);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedStyleService
    public Object getMethodWrapper(View view) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C137154ccg(view);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedStyleService
    public Object getConfirmWrapper(View view) {
        boolean isOuterPay;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], null, C2272a.LIZ, true, 2);
        if (proxy2.isSupported) {
            isOuterPay = ((Boolean) proxy2.result).booleanValue();
        } else {
            isOuterPay = C2272a.LIZ().paytype_info.sub_pay_type_sum_info.isOuterPay();
        }
        if (isOuterPay) {
            return new C137151ccd(view);
        }
        return new C137152cce(view);
    }
}
