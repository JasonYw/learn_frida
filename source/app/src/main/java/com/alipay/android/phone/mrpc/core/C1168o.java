package com.alipay.android.phone.mrpc.core;

import com.bytedance.covode.number.Covode;
import com.umeng.commonsdk.vchannel.C33968a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;

/* renamed from: com.alipay.android.phone.mrpc.core.o */
/* loaded from: classes2.dex */
public final class C1168o extends AbstractC1173t {

    /* renamed from: b */
    public String f21905b;

    /* renamed from: c */
    public byte[] f21906c;

    /* renamed from: g */
    public boolean f21910g;

    /* renamed from: e */
    public ArrayList<Header> f21908e = new ArrayList<>();

    /* renamed from: f */
    public Map<String, String> f21909f = new HashMap();

    /* renamed from: d */
    public String f21907d = "application/x-www-form-urlencoded";

    static {
        Covode.recordClassIndex(4639);
    }

    public C1168o(String str) {
        this.f21905b = str;
    }

    /* renamed from: a */
    public final String m19631a() {
        return this.f21905b;
    }

    /* renamed from: a */
    public final void m19630a(String str) {
        this.f21907d = str;
    }

    /* renamed from: a */
    public final void m19629a(String str, String str2) {
        if (this.f21909f == null) {
            this.f21909f = new HashMap();
        }
        this.f21909f.put(str, str2);
    }

    /* renamed from: a */
    public final void m19628a(Header header) {
        this.f21908e.add(header);
    }

    /* renamed from: a */
    public final void m19627a(boolean z) {
        this.f21910g = z;
    }

    /* renamed from: a */
    public final void m19626a(byte[] bArr) {
        this.f21906c = bArr;
    }

    /* renamed from: b */
    public final String m19624b(String str) {
        Map<String, String> map = this.f21909f;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: b */
    public final byte[] m19625b() {
        return this.f21906c;
    }

    /* renamed from: c */
    public final String m19623c() {
        return this.f21907d;
    }

    /* renamed from: d */
    public final ArrayList<Header> m19622d() {
        return this.f21908e;
    }

    /* renamed from: e */
    public final boolean m19621e() {
        return this.f21910g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1168o.class != obj.getClass()) {
            return false;
        }
        C1168o c1168o = (C1168o) obj;
        byte[] bArr = this.f21906c;
        if (bArr == null) {
            if (c1168o.f21906c != null) {
                return false;
            }
        } else if (!bArr.equals(c1168o.f21906c)) {
            return false;
        }
        String str = this.f21905b;
        String str2 = c1168o.f21905b;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Map<String, String> map = this.f21909f;
        int hashCode = ((map == null || !map.containsKey(C33968a.f42937f)) ? 1 : this.f21909f.get(C33968a.f42937f).hashCode() + 31) * 31;
        String str = this.f21905b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return String.format("Url : %s,HttpHeader: %s", this.f21905b, this.f21908e);
    }
}
