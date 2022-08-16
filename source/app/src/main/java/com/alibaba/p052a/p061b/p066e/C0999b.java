package com.alibaba.p052a.p061b.p066e;

import android.text.TextUtils;
import com.alibaba.p052a.p061b.p065d.C0961c;
import com.alibaba.p052a.p061b.p065d.C0973h;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.alibaba.p052a.p061b.p065d.C0982n;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.message.proguard.C34037f;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import p002O.C0002O;

/* renamed from: com.alibaba.a.b.e.b */
/* loaded from: classes13.dex */
public class C0999b {

    /* renamed from: a */
    public int f21473a;

    /* renamed from: b */
    public String f21474b;

    /* renamed from: c */
    public String f21475c;

    /* renamed from: d */
    public String f21476d;

    /* renamed from: e */
    public String f21477e;

    /* renamed from: f */
    public String f21478f;

    /* renamed from: g */
    public String f21479g;

    /* renamed from: h */
    public String f21480h;

    /* renamed from: i */
    public String f21481i;

    /* renamed from: j */
    public String f21482j;

    /* renamed from: k */
    public Map<String, String> f21483k;

    static {
        Covode.recordClassIndex(4309);
    }

    public C0999b() {
        this.f21475c = PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START;
        this.f21477e = "";
    }

    public C0999b(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        this.f21475c = PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START;
        this.f21477e = "";
        this.f21474b = str2;
        this.f21479g = str;
        this.f21480h = str3;
        this.f21481i = str4;
        this.f21482j = str5;
        this.f21483k = map;
        this.f21476d = String.valueOf(System.currentTimeMillis());
        m20041c();
    }

    /* renamed from: a */
    public String m20045a() {
        try {
            byte[] m20132a = C0961c.m20132a(this.f21478f.getBytes(C34037f.f43302f), 2);
            if (m20132a != null) {
                return new String(C0982n.m20074a(m20132a, "QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK"));
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public void m20044a(String str) {
        if (str != null) {
            try {
                this.f21478f = new String(C0961c.m20128c(C0982n.m20074a(str.getBytes(), "QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK"), 2), C34037f.f43302f);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public String m20043b() {
        return this.f21478f;
    }

    /* renamed from: b */
    public void m20042b(String str) {
        this.f21478f = str;
    }

    /* renamed from: c */
    public void m20041c() {
        if (TextUtils.isEmpty(this.f21476d)) {
            this.f21476d = String.valueOf(System.currentTimeMillis());
        }
        String m20106a = C0973h.m20106a(this.f21479g, this.f21474b, this.f21480h, this.f21481i, this.f21482j, this.f21483k, this.f21477e, this.f21476d);
        C0974i.m20098a("UTLog", this, m20106a);
        m20044a(m20106a);
    }

    public String toString() {
        return C0002O.m25081C("Log [id=", Integer.valueOf(this.f21473a), ", eventId=", this.f21474b, ", index=", this.f21477e, "]");
    }
}
