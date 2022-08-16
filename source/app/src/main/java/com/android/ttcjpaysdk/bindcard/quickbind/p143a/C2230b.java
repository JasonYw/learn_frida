package com.android.ttcjpaysdk.bindcard.quickbind.p143a;

import com.android.ttcjpaysdk.bindcard.base.C2208b;
import com.android.ttcjpaysdk.bindcard.quickbind.C2229a;
import com.android.ttcjpaysdk.bindcard.quickbind.b$b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import org.json.JSONObject;
import p003X.AbstractC137673cl3;
import p003X.C106862S5w;
import p003X.C135543cCg;
import p003X.C135949cJE;

/* renamed from: com.android.ttcjpaysdk.bindcard.quickbind.a.b */
/* loaded from: classes17.dex */
public final class C2230b extends C135543cCg<C2229a, b$b> {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(7216);
    }

    public final void LIZ(Map<String, Object> map, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{map, str, str2}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C2208b c2208b = (C2208b) this.mModel;
        C135949cJE c135949cJE = new C135949cJE(this);
        if (!PatchProxy.proxy(new Object[]{map, str, str2, c135949cJE}, c2208b, C2229a.LIZIZ, false, 6).isSupported) {
            C106862S5w.LIZ(c135949cJE);
            c2208b.LIZ(new JSONObject(map), "bytepay.member_product.send_sign_sms", str, str2, false, (AbstractC137673cl3) c135949cJE);
        }
    }
}
