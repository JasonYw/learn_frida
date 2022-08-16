package com.android.ttcjpaysdk.bdpay.bindcard.normal.presenter;

import com.android.ttcjpaysdk.base.framework.BaseActivity;
import com.android.ttcjpaysdk.base.service.bean.NormalBindCardBean;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.p138b.C2189a;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.view.e$c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C135465cBQ;
import p003X.C135543cCg;
import p003X.C135718cFV;
import p003X.C136036cKd;

/* renamed from: com.android.ttcjpaysdk.bdpay.bindcard.normal.presenter.d */
/* loaded from: classes17.dex */
public final class C2192d extends C135543cCg<C2189a, e$c> {
    public static ChangeQuickRedirect LIZ;
    public NormalBindCardBean LIZIZ;

    static {
        Covode.recordClassIndex(6778);
    }

    public C2192d() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2192d(C2189a c2189a, e$c e_c, NormalBindCardBean normalBindCardBean) {
        super(c2189a, e_c);
        C106862S5w.LIZ(c2189a, e_c, normalBindCardBean);
        this.LIZIZ = normalBindCardBean;
    }

    public final void LIZ(BaseActivity baseActivity, String str, String str2, String str3) {
        if (!PatchProxy.proxy(new Object[]{baseActivity, str, str2, str3}, this, LIZ, false, 1).isSupported && baseActivity != null) {
            C135718cFV c135718cFV = new C135718cFV(baseActivity, this, str2, str, str3);
            JSONObject jSONObject = new JSONObject();
            C135465cBQ.LIZ(jSONObject, "ab_version", C136036cKd.LIZIZ.LIZIZ());
            C2189a c2189a = (C2189a) this.mModel;
            if (c2189a != null) {
                c2189a.LIZ(c135718cFV, str2, str, str3, jSONObject);
            }
            System.currentTimeMillis();
        }
    }
}
