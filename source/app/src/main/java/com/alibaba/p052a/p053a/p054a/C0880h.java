package com.alibaba.p052a.p053a.p054a;

import com.alibaba.p052a.p053a.p056c.AbstractC0890b;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alibaba.a.a.a.h */
/* loaded from: classes13.dex */
public class C0880h implements AbstractC0890b {

    /* renamed from: a */
    public String f21177a;

    /* renamed from: b */
    public int f21178b;

    /* renamed from: c */
    public String f21179c;

    /* renamed from: d */
    public String f21180d;

    /* renamed from: e */
    public String f21181e;

    /* renamed from: f */
    public Map<String, String> f21182f;

    static {
        Covode.recordClassIndex(4190);
    }

    @Override // com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: a */
    public void mo20254a(Object... objArr) {
        if (this.f21182f == null) {
            this.f21182f = new HashMap();
        }
    }

    @Override // com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: d */
    public void mo20252d() {
        this.f21177a = null;
        this.f21178b = 0;
        this.f21179c = null;
        this.f21180d = null;
        this.f21181e = null;
        Map<String, String> map = this.f21182f;
        if (map != null) {
            map.clear();
        }
    }
}
