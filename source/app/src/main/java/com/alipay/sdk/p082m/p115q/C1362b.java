package com.alipay.sdk.p082m.p115q;

import com.alipay.sdk.p082m.p113p.AbstractC1354e;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.alipay.sdk.p082m.p121u.C1381a;
import com.alipay.sdk.p082m.p121u.C1385e;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.alipay.sdk.m.q.b */
/* loaded from: classes2.dex */
public class C1362b extends AbstractC1354e {
    static {
        Covode.recordClassIndex(4862);
    }

    @Override // com.alipay.sdk.p082m.p113p.AbstractC1354e
    /* renamed from: b */
    public String mo18979b() {
        return "5.0.0";
    }

    @Override // com.alipay.sdk.p082m.p113p.AbstractC1354e
    /* renamed from: c */
    public boolean mo18973c() {
        return true;
    }

    @Override // com.alipay.sdk.p082m.p113p.AbstractC1354e
    /* renamed from: a */
    public JSONObject mo18974a() {
        return AbstractC1354e.m19002a("sdkConfig", "obtain");
    }

    @Override // com.alipay.sdk.p082m.p113p.AbstractC1354e
    /* renamed from: a */
    public String mo18980a(C1376a c1376a, HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
        }
        hashMap2.putAll(C1381a.m18884a(c1376a));
        C1385e.m18862d("mspl", "cf " + hashMap2);
        return super.mo18980a(c1376a, hashMap, hashMap2);
    }
}
