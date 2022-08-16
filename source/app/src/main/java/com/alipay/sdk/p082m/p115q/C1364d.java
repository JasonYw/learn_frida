package com.alipay.sdk.p082m.p115q;

import android.content.Context;
import com.alipay.sdk.p082m.p113p.AbstractC1354e;
import com.alipay.sdk.p082m.p113p.C1351b;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.alipay.sdk.m.q.d */
/* loaded from: classes2.dex */
public class C1364d extends AbstractC1354e {
    static {
        Covode.recordClassIndex(4864);
    }

    @Override // com.alipay.sdk.p082m.p113p.AbstractC1354e
    /* renamed from: a */
    public String mo18976a(C1376a c1376a, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // com.alipay.sdk.p082m.p113p.AbstractC1354e
    /* renamed from: a */
    public JSONObject mo18974a() {
        return null;
    }

    @Override // com.alipay.sdk.p082m.p113p.AbstractC1354e
    /* renamed from: c */
    public boolean mo18973c() {
        return false;
    }

    @Override // com.alipay.sdk.p082m.p113p.AbstractC1354e
    /* renamed from: a */
    public String mo18978a(C1376a c1376a) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("api_name", "/sdk/log");
        hashMap.put("api_version", "1.0.0");
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("log_v", "1.0");
        return mo18980a(c1376a, hashMap, hashMap2);
    }

    @Override // com.alipay.sdk.p082m.p113p.AbstractC1354e
    /* renamed from: a */
    public Map<String, String> mo18975a(boolean z, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("msp-gzip", String.valueOf(z));
        hashMap.put(AbstractC1354e.f22314f, "application/octet-stream");
        hashMap.put("des-mode", "CBC");
        return hashMap;
    }

    @Override // com.alipay.sdk.p082m.p113p.AbstractC1354e
    /* renamed from: a */
    public C1351b mo18977a(C1376a c1376a, Context context, String str) {
        return m19004a(c1376a, context, str, "https://mcgw.alipay.com/sdklog.do", true);
    }
}
