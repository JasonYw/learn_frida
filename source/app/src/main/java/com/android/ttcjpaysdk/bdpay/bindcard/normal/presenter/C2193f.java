package com.android.ttcjpaysdk.bdpay.bindcard.normal.presenter;

import com.android.ttcjpaysdk.base.network.ICJPayCallback;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.p138b.C2189a;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.view.e$b;
import com.android.ttcjpaysdk.bindcard.base.C2208b;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayRealNameBean;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.C135543cCg;
import p003X.C136095cLa;

/* renamed from: com.android.ttcjpaysdk.bdpay.bindcard.normal.presenter.f */
/* loaded from: classes17.dex */
public final class C2193f extends C135543cCg<C2189a, e$b> {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(6782);
    }

    public final void LIZ(ICJPayCallback iCJPayCallback) {
        C2189a c2189a;
        if (!PatchProxy.proxy(new Object[]{iCJPayCallback}, this, LIZ, false, 1).isSupported && (c2189a = (C2189a) this.mModel) != null) {
            c2189a.LIZ(iCJPayCallback);
        }
    }

    public final void LIZ(CJPayRealNameBean cJPayRealNameBean) {
        if (PatchProxy.proxy(new Object[]{cJPayRealNameBean}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(cJPayRealNameBean);
        C2208b c2208b = (C2208b) this.mModel;
        if (c2208b != null) {
            c2208b.LIZ(cJPayRealNameBean, new C136095cLa(this, cJPayRealNameBean));
        }
    }
}
