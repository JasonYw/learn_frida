package com.amap.api.mapcore2d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

@AbstractC1628du(m17804a = "a")
/* renamed from: com.amap.api.mapcore2d.da */
/* loaded from: classes19.dex */
public class C1599da {
    @AbstractC1629dv(m17802a = "a1", m17801b = 6)

    /* renamed from: a */
    public String f23313a;
    @AbstractC1629dv(m17802a = "a2", m17801b = 6)

    /* renamed from: b */
    public String f23314b;
    @AbstractC1629dv(m17802a = "a6", m17801b = 2)

    /* renamed from: c */
    public int f23315c;
    @AbstractC1629dv(m17802a = "a3", m17801b = 6)

    /* renamed from: d */
    public String f23316d;
    @AbstractC1629dv(m17802a = "a4", m17801b = 6)

    /* renamed from: e */
    public String f23317e;
    @AbstractC1629dv(m17802a = "a5", m17801b = 6)

    /* renamed from: f */
    public String f23318f;

    /* renamed from: g */
    public String f23319g;

    /* renamed from: h */
    public String f23320h;

    /* renamed from: i */
    public String f23321i;

    /* renamed from: j */
    public String f23322j;

    /* renamed from: k */
    public String f23323k;

    /* renamed from: l */
    public String[] f23324l;

    /* renamed from: com.amap.api.mapcore2d.da$1 */
    /* loaded from: classes19.dex */
    public static /* synthetic */ class C16001 {
        static {
            Covode.recordClassIndex(5148);
        }
    }

    static {
        Covode.recordClassIndex(5147);
    }

    /* renamed from: h */
    public static String m17961h() {
        return "a6=1";
    }

    /* renamed from: b */
    public String m17968b() {
        return this.f23319g;
    }

    public C1599da() {
        this.f23315c = 1;
    }

    /* renamed from: f */
    public boolean m17963f() {
        if (this.f23315c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: com.amap.api.mapcore2d.da$a */
    /* loaded from: classes19.dex */
    public static class C1601a {

        /* renamed from: a */
        public String f23325a;

        /* renamed from: b */
        public String f23326b;

        /* renamed from: c */
        public String f23327c;

        /* renamed from: d */
        public String f23328d;

        /* renamed from: e */
        public boolean f23329e = true;

        /* renamed from: f */
        public String f23330f = "standard";

        /* renamed from: g */
        public String[] f23331g;

        static {
            Covode.recordClassIndex(5149);
        }

        /* renamed from: a */
        public C1599da m17960a() {
            if (this.f23331g != null) {
                return new C1599da(this, null);
            }
            throw new C1572cp("sdk packages is null");
        }

        /* renamed from: a */
        public C1601a m17958a(String str) {
            this.f23326b = str;
            return this;
        }

        /* renamed from: a */
        public C1601a m17957a(String[] strArr) {
            if (strArr != null) {
                this.f23331g = (String[]) strArr.clone();
            }
            return this;
        }

        public C1601a(String str, String str2, String str3) {
            this.f23325a = str2;
            this.f23326b = str2;
            this.f23328d = str3;
            this.f23327c = str;
        }
    }

    /* renamed from: c */
    public String m17966c() {
        if (TextUtils.isEmpty(this.f23320h) && !TextUtils.isEmpty(this.f23314b)) {
            this.f23320h = C1602db.m17930c(this.f23314b);
        }
        return this.f23320h;
    }

    /* renamed from: d */
    public String m17965d() {
        if (TextUtils.isEmpty(this.f23321i) && !TextUtils.isEmpty(this.f23316d)) {
            this.f23321i = C1602db.m17930c(this.f23316d);
        }
        return this.f23321i;
    }

    public int hashCode() {
        C1611dk c1611dk = new C1611dk();
        c1611dk.m17903a(this.f23322j);
        c1611dk.m17903a(this.f23319g);
        c1611dk.m17903a(this.f23320h);
        c1611dk.m17894a((Object[]) this.f23324l);
        return c1611dk.m17910a();
    }

    /* renamed from: e */
    public String m17964e() {
        if (TextUtils.isEmpty(this.f23323k) && !TextUtils.isEmpty(this.f23318f)) {
            this.f23323k = C1602db.m17930c(this.f23318f);
        }
        if (TextUtils.isEmpty(this.f23323k)) {
            this.f23323k = "standard";
        }
        return this.f23323k;
    }

    /* renamed from: g */
    public String[] m17962g() {
        String[] strArr = this.f23324l;
        if ((strArr == null || strArr.length == 0) && !TextUtils.isEmpty(this.f23317e)) {
            this.f23324l = m17967b(C1602db.m17930c(this.f23317e));
        }
        return (String[]) this.f23324l.clone();
    }

    /* renamed from: a */
    public String m17972a() {
        if (TextUtils.isEmpty(this.f23322j) && !TextUtils.isEmpty(this.f23313a)) {
            this.f23322j = C1602db.m17930c(this.f23313a);
        }
        return this.f23322j;
    }

    /* renamed from: a */
    public void m17970a(boolean z) {
        this.f23315c = z ? 1 : 0;
    }

    /* renamed from: b */
    private String[] m17967b(String str) {
        try {
            return str.split(";");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m17971a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("a1", C1602db.m17933b(str));
        return C1627dt.m17809a((Map<String, String>) hashMap);
    }

    /* renamed from: a */
    private String m17969a(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
                sb.append(";");
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (getClass() != obj.getClass() || hashCode() != ((C1599da) obj).hashCode()) {
            return false;
        }
        return true;
    }

    public C1599da(C1601a c1601a) {
        this.f23315c = 1;
        this.f23319g = c1601a.f23325a;
        this.f23320h = c1601a.f23326b;
        this.f23322j = c1601a.f23327c;
        this.f23321i = c1601a.f23328d;
        this.f23315c = c1601a.f23329e ? 1 : 0;
        this.f23323k = c1601a.f23330f;
        this.f23324l = c1601a.f23331g;
        this.f23314b = C1602db.m17933b(this.f23320h);
        this.f23313a = C1602db.m17933b(this.f23322j);
        this.f23316d = C1602db.m17933b(this.f23321i);
        this.f23317e = C1602db.m17933b(m17969a(this.f23324l));
        this.f23318f = C1602db.m17933b(this.f23323k);
    }

    public /* synthetic */ C1599da(C1601a c1601a, C16001 c16001) {
        this(c1601a);
    }
}
