package com.alibaba.p052a.p053a.p056c;

import com.bytedance.covode.number.Covode;
import org.json.JSONArray;

/* renamed from: com.alibaba.a.a.c.d */
/* loaded from: classes10.dex */
public class C0892d extends JSONArray implements AbstractC0890b {
    static {
        Covode.recordClassIndex(4202);
    }

    @Override // com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: a */
    public void mo20254a(Object... objArr) {
    }

    @Override // com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: d */
    public void mo20252d() {
        for (int i = 0; i < length(); i++) {
            Object opt = opt(i);
            if (opt != null && (opt instanceof AbstractC0890b)) {
                C0889a.m20418a().m20417a((C0889a) ((AbstractC0890b) opt));
            }
        }
    }
}
