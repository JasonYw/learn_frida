package com.android.ttcjpaysdk.integrated.counter.p158e;

import com.android.ttcjpaysdk.integrated.counter.b$a;
import com.android.ttcjpaysdk.integrated.counter.p156d.C2274a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C135543cCg;
import p003X.C137242ce6;
import p003X.C137243ce7;
import p003X.C137356cfw;

/* renamed from: com.android.ttcjpaysdk.integrated.counter.e.b */
/* loaded from: classes17.dex */
public final class C2282b extends C135543cCg<C2274a, b$a> {
    public static ChangeQuickRedirect LIZ;
    public long LIZIZ;

    static {
        Covode.recordClassIndex(7697);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        C2274a c2274a = (C2274a) this.mModel;
        if (c2274a != null) {
            c2274a.LIZ((Map<String, String>) null, (JSONObject) null, new C137242ce6(this));
        }
        this.LIZIZ = System.currentTimeMillis();
    }

    public final void LIZ(HashMap<String, String> hashMap) {
        if (PatchProxy.proxy(new Object[]{hashMap}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(hashMap);
        C2274a c2274a = (C2274a) this.mModel;
        if (c2274a != null) {
            c2274a.LIZ(hashMap, new C137243ce7(this));
        }
        this.LIZIZ = System.currentTimeMillis();
    }

    public final void LIZIZ(long j, boolean z) {
        String str;
        if (PatchProxy.proxy(new Object[]{new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 6).isSupported) {
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

    public final void LIZ(long j, boolean z) {
        String str;
        if (PatchProxy.proxy(new Object[]{new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 4).isSupported) {
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
            C137356cfw.LIZIZ.LIZ("wallet_rd_trade_confirm_time", jSONObject);
        } catch (Exception unused) {
        }
    }
}
