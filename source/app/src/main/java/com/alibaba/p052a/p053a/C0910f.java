package com.alibaba.p052a.p053a;

import com.alibaba.p052a.p061b.C0941a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alibaba.a.a.f */
/* loaded from: classes13.dex */
public class C0910f {

    /* renamed from: a */
    public static final Map<String, String> f21227a;

    static {
        Covode.recordClassIndex(4220);
        HashMap hashMap = new HashMap();
        f21227a = hashMap;
        hashMap.put("sdk-version", "2.6.4.8_for_bc_dns");
    }

    /* renamed from: a */
    public static Map<String, String> m20339a() {
        C0941a.m20233c();
        if (!f21227a.containsKey("sdk-version")) {
            f21227a.put("sdk-version", "2.6.4.8_for_bc_dns");
        }
        return f21227a;
    }
}
