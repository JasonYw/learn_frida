package com.amap.api.services.p126a;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

@AbstractC1915cg(m16675a = "file")
/* renamed from: com.amap.api.services.a.cq */
/* loaded from: classes19.dex */
public class C1928cq {
    @AbstractC1916ch(m16673a = "fname", m16672b = 6)

    /* renamed from: a */
    public String f24630a;
    @AbstractC1916ch(m16673a = "md", m16672b = 6)

    /* renamed from: b */
    public String f24631b;
    @AbstractC1916ch(m16673a = "sname", m16672b = 6)

    /* renamed from: c */
    public String f24632c;
    @AbstractC1916ch(m16673a = "version", m16672b = 6)

    /* renamed from: d */
    public String f24633d;
    @AbstractC1916ch(m16673a = "dversion", m16672b = 6)

    /* renamed from: e */
    public String f24634e;
    @AbstractC1916ch(m16673a = "status", m16672b = 6)

    /* renamed from: f */
    public String f24635f;

    static {
        Covode.recordClassIndex(5539);
    }

    public C1928cq() {
    }

    /* renamed from: a */
    public String m16628a() {
        return this.f24630a;
    }

    /* renamed from: b */
    public String m16624b() {
        return this.f24631b;
    }

    /* renamed from: c */
    public String m16621c() {
        return this.f24632c;
    }

    /* renamed from: d */
    public String m16619d() {
        return this.f24633d;
    }

    /* renamed from: e */
    public String m16618e() {
        return this.f24634e;
    }

    /* renamed from: f */
    public String m16617f() {
        return this.f24635f;
    }

    /* renamed from: com.amap.api.services.a.cq$a */
    /* loaded from: classes19.dex */
    public static class C1929a {

        /* renamed from: a */
        public String f24636a;

        /* renamed from: b */
        public String f24637b;

        /* renamed from: c */
        public String f24638c;

        /* renamed from: d */
        public String f24639d;

        /* renamed from: e */
        public String f24640e;

        /* renamed from: f */
        public String f24641f = "copy";

        static {
            Covode.recordClassIndex(5540);
        }

        /* renamed from: a */
        public C1928cq m16616a() {
            return new C1928cq(this);
        }

        /* renamed from: a */
        public C1929a m16614a(String str) {
            this.f24641f = str;
            return this;
        }

        public C1929a(String str, String str2, String str3, String str4, String str5) {
            this.f24636a = str;
            this.f24637b = str2;
            this.f24638c = str3;
            this.f24639d = str4;
            this.f24640e = str5;
        }
    }

    /* renamed from: c */
    public void m16620c(String str) {
        this.f24635f = str;
    }

    /* renamed from: a */
    public static String m16627a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("sname", str);
        return C1914cf.m16680a((Map<String, String>) hashMap);
    }

    /* renamed from: b */
    public static String m16623b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("fname", str);
        return C1914cf.m16680a((Map<String, String>) hashMap);
    }

    public C1928cq(C1929a c1929a) {
        this.f24630a = c1929a.f24636a;
        this.f24631b = c1929a.f24637b;
        this.f24632c = c1929a.f24638c;
        this.f24633d = c1929a.f24639d;
        this.f24634e = c1929a.f24640e;
        this.f24635f = c1929a.f24641f;
    }

    /* renamed from: a */
    public static String m16626a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("sname", str);
        hashMap.put("dversion", str2);
        return C1914cf.m16680a((Map<String, String>) hashMap);
    }

    /* renamed from: b */
    public static String m16622b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("sname", str);
        hashMap.put("status", str2);
        return C1914cf.m16680a((Map<String, String>) hashMap);
    }

    /* renamed from: a */
    public static String m16625a(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("fname", str);
        hashMap.put("sname", str2);
        hashMap.put("dversion", str4);
        hashMap.put("version", str3);
        return C1914cf.m16680a((Map<String, String>) hashMap);
    }
}
