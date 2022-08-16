package com.android.ttcjpaysdk.integrated.counter.game.provider;

import android.content.Context;
import android.view.View;
import com.android.ttcjpaysdk.base.service.ICJPayIntegratedGameService;
import com.android.ttcjpaysdk.integrated.counter.p154b.C2272a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C137170ccw;
import p003X.C137171ccx;
import p003X.C137226cdq;

/* loaded from: classes17.dex */
public class CJPayIntegratedGameProvider implements ICJPayIntegratedGameService {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(7810);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedStyleService
    public Object getMethodAdapter(Context context) {
        return null;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedStyleService
    public Object getMethodWrapper(View view) {
        return null;
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
        return new C137226cdq(context);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayIntegratedStyleService
    public Object getConfirmWrapper(View view) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (C2272a.LIZJ != null && C2272a.LIZJ.isGameNewStyle) {
            return new C137170ccw(view);
        }
        return new C137171ccx(view);
    }
}
