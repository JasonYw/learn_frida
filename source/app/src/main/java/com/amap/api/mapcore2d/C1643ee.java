package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

@AbstractC1628du(m17804a = "file")
/* renamed from: com.amap.api.mapcore2d.ee */
/* loaded from: classes19.dex */
public class C1643ee {
    @AbstractC1629dv(m17802a = "fname", m17801b = 6)

    /* renamed from: a */
    public String f23445a;
    @AbstractC1629dv(m17802a = "md", m17801b = 6)

    /* renamed from: b */
    public String f23446b;
    @AbstractC1629dv(m17802a = "sname", m17801b = 6)

    /* renamed from: c */
    public String f23447c;
    @AbstractC1629dv(m17802a = "version", m17801b = 6)

    /* renamed from: d */
    public String f23448d;
    @AbstractC1629dv(m17802a = "dversion", m17801b = 6)

    /* renamed from: e */
    public String f23449e;
    @AbstractC1629dv(m17802a = "status", m17801b = 6)

    /* renamed from: f */
    public String f23450f;

    static {
        Covode.recordClassIndex(5191);
    }

    public C1643ee() {
    }

    /* renamed from: a */
    public String m17741a() {
        return this.f23445a;
    }

    /* renamed from: b */
    public String m17737b() {
        return this.f23446b;
    }

    /* renamed from: c */
    public String m17734c() {
        return this.f23447c;
    }

    /* renamed from: d */
    public String m17732d() {
        return this.f23448d;
    }

    /* renamed from: e */
    public String m17731e() {
        return this.f23449e;
    }

    /* renamed from: f */
    public String m17730f() {
        return this.f23450f;
    }

    /* renamed from: com.amap.api.mapcore2d.ee$a */
    /* loaded from: classes19.dex */
    public static class C1644a {

        /* renamed from: a */
        public String f23451a;

        /* renamed from: b */
        public String f23452b;

        /* renamed from: c */
        public String f23453c;

        /* renamed from: d */
        public String f23454d;

        /* renamed from: e */
        public String f23455e;

        /* renamed from: f */
        public String f23456f = "copy";

        static {
            Covode.recordClassIndex(5192);
        }

        /* renamed from: a */
        public C1643ee m17729a() {
            return new C1643ee(this);
        }

        /* renamed from: a */
        public C1644a m17727a(String str) {
            this.f23456f = str;
            return this;
        }

        public C1644a(String str, String str2, String str3, String str4, String str5) {
            this.f23451a = str;
            this.f23452b = str2;
            this.f23453c = str3;
            this.f23454d = str4;
            this.f23455e = str5;
        }
    }

    /* renamed from: c */
    public void m17733c(String str) {
        this.f23450f = str;
    }

    /* renamed from: a */
    public static String m17740a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("sname", str);
        return C1627dt.m17809a((Map<String, String>) hashMap);
    }

    /* renamed from: b */
    public static String m17736b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("fname", str);
        return C1627dt.m17809a((Map<String, String>) hashMap);
    }

    public C1643ee(C1644a c1644a) {
        this.f23445a = c1644a.f23451a;
        this.f23446b = c1644a.f23452b;
        this.f23447c = c1644a.f23453c;
        this.f23448d = c1644a.f23454d;
        this.f23449e = c1644a.f23455e;
        this.f23450f = c1644a.f23456f;
    }

    /* renamed from: a */
    public static String m17739a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("sname", str);
        hashMap.put("dversion", str2);
        return C1627dt.m17809a((Map<String, String>) hashMap);
    }

    /* renamed from: b */
    public static String m17735b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("sname", str);
        hashMap.put("status", str2);
        return C1627dt.m17809a((Map<String, String>) hashMap);
    }

    /* renamed from: a */
    public static String m17738a(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("fname", str);
        hashMap.put("sname", str2);
        hashMap.put("dversion", str4);
        hashMap.put("version", str3);
        return C1627dt.m17809a((Map<String, String>) hashMap);
    }
}
