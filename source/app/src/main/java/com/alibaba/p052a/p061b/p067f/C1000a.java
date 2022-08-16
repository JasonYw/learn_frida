package com.alibaba.p052a.p061b.p067f;

import com.alibaba.p052a.p061b.p065d.C0974i;
import com.alibaba.p052a.p061b.p065d.C0975j;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;

/* renamed from: com.alibaba.a.b.f.a */
/* loaded from: classes13.dex */
public class C1000a implements AbstractC1001b {

    /* renamed from: a */
    public String f21484a;

    /* renamed from: b */
    public String f21485b;

    /* renamed from: c */
    public boolean f21486c;

    static {
        Covode.recordClassIndex(4310);
    }

    public C1000a(String str, String str2, boolean z) {
        this.f21484a = str;
        this.f21485b = str2;
        this.f21486c = z;
    }

    @Override // com.alibaba.p052a.p061b.p067f.AbstractC1001b
    /* renamed from: a */
    public String mo20039a() {
        return this.f21484a;
    }

    @Override // com.alibaba.p052a.p061b.p067f.AbstractC1001b
    /* renamed from: a */
    public String mo20038a(String str) {
        if (this.f21484a == null || this.f21485b == null) {
            C0974i.m20098a("BaseRequestAuth", "There is no appkey,please check it!");
            return null;
        } else if (str == null) {
            return null;
        } else {
            new StringBuilder();
            return C0975j.m20094a(C0975j.m20092c(C0002O.m25086C(str, this.f21485b).getBytes()));
        }
    }

    /* renamed from: b */
    public boolean m20040b() {
        return this.f21486c;
    }
}
