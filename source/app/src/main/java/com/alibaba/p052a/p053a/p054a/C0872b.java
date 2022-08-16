package com.alibaba.p052a.p053a.p054a;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.alibaba.a.a.a.b */
/* loaded from: classes13.dex */
public class C0872b extends AbstractC0874d {

    /* renamed from: a */
    public int f21138a;

    /* renamed from: b */
    public double f21139b;

    static {
        Covode.recordClassIndex(4182);
    }

    /* renamed from: a */
    public synchronized void m20512a(double d) {
        this.f21139b += d;
        this.f21138a++;
    }

    @Override // com.alibaba.p052a.p053a.p054a.AbstractC0874d, com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: a */
    public synchronized void mo20254a(Object... objArr) {
        super.mo20254a(objArr);
        this.f21139b = 0.0d;
        this.f21138a = 0;
    }

    @Override // com.alibaba.p052a.p053a.p054a.AbstractC0874d
    /* renamed from: c */
    public synchronized JSONObject mo20471c() {
        JSONObject mo20471c;
        mo20471c = super.mo20471c();
        try {
            mo20471c.put("count", this.f21138a);
            mo20471c.put("value", this.f21139b);
        } catch (Exception unused) {
        }
        return mo20471c;
    }
}
