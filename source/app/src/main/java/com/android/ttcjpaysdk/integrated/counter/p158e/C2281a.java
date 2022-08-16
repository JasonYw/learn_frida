package com.android.ttcjpaysdk.integrated.counter.p158e;

import com.android.ttcjpaysdk.integrated.counter.b$c;
import com.android.ttcjpaysdk.integrated.counter.p156d.C2274a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONObject;
import p003X.C135543cCg;
import p003X.C137356cfw;

/* renamed from: com.android.ttcjpaysdk.integrated.counter.e.a */
/* loaded from: classes17.dex */
public final class C2281a extends C135543cCg<C2274a, b$c> {
    public static ChangeQuickRedirect LIZ;
    public long LIZIZ;

    static {
        Covode.recordClassIndex(7695);
    }

    public final void LIZ(long j, boolean z) {
        String str;
        if (PatchProxy.proxy(new Object[]{new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str = "0";
            } else {
                str = "1";
            }
            jSONObject.put("is_success", str);
            jSONObject.put("time", j);
            C137356cfw.LIZIZ.LIZ("wallet_rd_trade_query_time", jSONObject);
        } catch (Exception unused) {
        }
    }
}
