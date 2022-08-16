package com.android.ttcjpaysdk.integrated.counter.p158e;

import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.integrated.counter.b$b;
import com.android.ttcjpaysdk.integrated.counter.p156d.C2274a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import org.json.JSONObject;
import p003X.C135543cCg;
import p003X.C136965cZc;
import p003X.C137140ccS;
import p003X.C137356cfw;

/* renamed from: com.android.ttcjpaysdk.integrated.counter.e.c */
/* loaded from: classes17.dex */
public final class C2283c extends C135543cCg<C2274a, b$b> {
    public static ChangeQuickRedirect LIZ;
    public long LIZIZ;
    public long LIZJ;

    static {
        Covode.recordClassIndex(7700);
    }

    public final void LIZ(Map<String, String> map, boolean z) {
        if (PatchProxy.proxy(new Object[]{map, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C2274a c2274a = (C2274a) this.mModel;
        if (c2274a != null) {
            c2274a.LIZ(map, new C137140ccS(this, z), new C136965cZc());
        }
        this.LIZIZ = System.currentTimeMillis();
    }

    public final void LIZ(long j, boolean z, boolean z2) {
        String str;
        if (PatchProxy.proxy(new Object[]{new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 4).isSupported) {
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
            if (z2) {
                C2118a.LIZ().LIZ("wallet_rd_trade_create_by_token_time", jSONObject);
            } else {
                C2118a.LIZ().LIZ("wallet_rd_trade_create_time", jSONObject);
            }
        } catch (Exception unused) {
        }
    }

    public final void LIZIZ(long j, boolean z, boolean z2) {
        String str;
        if (PatchProxy.proxy(new Object[]{new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 6).isSupported) {
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
            if (z2) {
                C137356cfw.LIZIZ.LIZ("wallet_rd_trade_create_by_token_time", jSONObject);
            } else {
                C137356cfw.LIZIZ.LIZ("wallet_rd_trade_create_time", jSONObject);
            }
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void LIZ(C2283c c2283c, long j, boolean z, boolean z2, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{c2283c, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 0, 4, null}, null, LIZ, true, 5).isSupported) {
            return;
        }
        c2283c.LIZ(j, z, false);
    }

    public static /* synthetic */ void LIZIZ(C2283c c2283c, long j, boolean z, boolean z2, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{c2283c, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 0, 4, null}, null, LIZ, true, 7).isSupported) {
            return;
        }
        c2283c.LIZIZ(j, z, false);
    }
}
