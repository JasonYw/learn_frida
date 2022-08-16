package com.amap.api.services.p126a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

@AbstractC1915cg(m16675a = "a")
/* renamed from: com.amap.api.services.a.bo */
/* loaded from: classes19.dex */
public class C1889bo {
    @AbstractC1916ch(m16673a = "a1", m16672b = 6)

    /* renamed from: a */
    public String f24521a;
    @AbstractC1916ch(m16673a = "a2", m16672b = 6)

    /* renamed from: b */
    public String f24522b;
    @AbstractC1916ch(m16673a = "a6", m16672b = 2)

    /* renamed from: c */
    public int f24523c;
    @AbstractC1916ch(m16673a = "a3", m16672b = 6)

    /* renamed from: d */
    public String f24524d;
    @AbstractC1916ch(m16673a = "a4", m16672b = 6)

    /* renamed from: e */
    public String f24525e;
    @AbstractC1916ch(m16673a = "a5", m16672b = 6)

    /* renamed from: f */
    public String f24526f;

    /* renamed from: g */
    public String f24527g;

    /* renamed from: h */
    public String f24528h;

    /* renamed from: i */
    public String f24529i;

    /* renamed from: j */
    public String f24530j;

    /* renamed from: k */
    public String f24531k;

    /* renamed from: l */
    public String[] f24532l;

    /* renamed from: com.amap.api.services.a.bo$1 */
    /* loaded from: classes19.dex */
    public static /* synthetic */ class C18901 {
        static {
            Covode.recordClassIndex(5501);
        }
    }

    static {
        Covode.recordClassIndex(5500);
    }

    /* renamed from: g */
    public static String m16808g() {
        return "a6=1";
    }

    /* renamed from: b */
    public String m16814b() {
        return this.f24527g;
    }

    public C1889bo() {
        this.f24523c = 1;
    }

    /* renamed from: e */
    public boolean m16810e() {
        if (this.f24523c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public String m16812c() {
        if (TextUtils.isEmpty(this.f24528h) && !TextUtils.isEmpty(this.f24522b)) {
            this.f24528h = C1892bp.m16776c(this.f24522b);
        }
        return this.f24528h;
    }

    public int hashCode() {
        C1900bx c1900bx = new C1900bx();
        c1900bx.m16754a(this.f24530j);
        c1900bx.m16754a(this.f24527g);
        c1900bx.m16754a(this.f24528h);
        c1900bx.m16745a((Object[]) this.f24532l);
        return c1900bx.m16761a();
    }

    /* renamed from: com.amap.api.services.a.bo$a */
    /* loaded from: classes19.dex */
    public static class C1891a {

        /* renamed from: a */
        public String f24533a;

        /* renamed from: b */
        public String f24534b;

        /* renamed from: c */
        public String f24535c;

        /* renamed from: d */
        public String f24536d;

        /* renamed from: e */
        public boolean f24537e = true;

        /* renamed from: f */
        public String f24538f = "standard";

        /* renamed from: g */
        public String[] f24539g;

        static {
            Covode.recordClassIndex(5502);
        }

        /* renamed from: a */
        public C1889bo m16807a() {
            if (this.f24539g != null) {
                return new C1889bo(this, null);
            }
            throw new C1863be("sdk packages is null");
        }

        /* renamed from: a */
        public C1891a m16805a(String str) {
            this.f24534b = str;
            return this;
        }

        /* renamed from: a */
        public C1891a m16804a(boolean z) {
            this.f24537e = z;
            return this;
        }

        /* renamed from: a */
        public C1891a m16803a(String[] strArr) {
            if (strArr != null) {
                this.f24539g = (String[]) strArr.clone();
            }
            return this;
        }

        public C1891a(String str, String str2, String str3) {
            this.f24533a = str2;
            this.f24534b = str2;
            this.f24536d = str3;
            this.f24535c = str;
        }
    }

    /* renamed from: d */
    public String m16811d() {
        if (TextUtils.isEmpty(this.f24531k) && !TextUtils.isEmpty(this.f24526f)) {
            this.f24531k = C1892bp.m16776c(this.f24526f);
        }
        if (TextUtils.isEmpty(this.f24531k)) {
            this.f24531k = "standard";
        }
        return this.f24531k;
    }

    /* renamed from: f */
    public String[] m16809f() {
        String[] strArr = this.f24532l;
        if ((strArr == null || strArr.length == 0) && !TextUtils.isEmpty(this.f24525e)) {
            this.f24532l = m16813b(C1892bp.m16776c(this.f24525e));
        }
        return (String[]) this.f24532l.clone();
    }

    /* renamed from: a */
    public String m16818a() {
        if (TextUtils.isEmpty(this.f24530j) && !TextUtils.isEmpty(this.f24521a)) {
            this.f24530j = C1892bp.m16776c(this.f24521a);
        }
        return this.f24530j;
    }

    /* renamed from: a */
    public void m16816a(boolean z) {
        this.f24523c = z ? 1 : 0;
    }

    /* renamed from: b */
    private String[] m16813b(String str) {
        try {
            return str.split(";");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m16817a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("a1", C1892bp.m16779b(str));
        return C1914cf.m16680a((Map<String, String>) hashMap);
    }

    /* renamed from: a */
    private String m16815a(String[] strArr) {
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
        if (getClass() != obj.getClass() || hashCode() != ((C1889bo) obj).hashCode()) {
            return false;
        }
        return true;
    }

    public C1889bo(C1891a c1891a) {
        this.f24523c = 1;
        this.f24527g = c1891a.f24533a;
        this.f24528h = c1891a.f24534b;
        this.f24530j = c1891a.f24535c;
        this.f24529i = c1891a.f24536d;
        this.f24523c = c1891a.f24537e ? 1 : 0;
        this.f24531k = c1891a.f24538f;
        this.f24532l = c1891a.f24539g;
        this.f24522b = C1892bp.m16779b(this.f24528h);
        this.f24521a = C1892bp.m16779b(this.f24530j);
        this.f24524d = C1892bp.m16779b(this.f24529i);
        this.f24525e = C1892bp.m16779b(m16815a(this.f24532l));
        this.f24526f = C1892bp.m16779b(this.f24531k);
    }

    public /* synthetic */ C1889bo(C1891a c1891a, C18901 c18901) {
        this(c1891a);
    }
}
