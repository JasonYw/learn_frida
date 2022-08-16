package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.ea */
/* loaded from: classes19.dex */
public class C1637ea {

    /* renamed from: a */
    public String f23426a;

    /* renamed from: b */
    public String f23427b;

    /* renamed from: c */
    public String f23428c;

    /* renamed from: d */
    public String f23429d;

    /* renamed from: e */
    public String f23430e;

    /* renamed from: f */
    public int f23431f;

    /* renamed from: g */
    public int f23432g;

    /* renamed from: h */
    public String f23433h;

    /* renamed from: i */
    public boolean f23434i;

    /* renamed from: j */
    public boolean f23435j;

    /* renamed from: k */
    public boolean f23436k;

    static {
        Covode.recordClassIndex(5185);
    }

    /* renamed from: a */
    public String m17774a() {
        return this.f23426a;
    }

    /* renamed from: b */
    public String m17772b() {
        return this.f23433h;
    }

    /* renamed from: c */
    public String m17771c() {
        return this.f23429d;
    }

    /* renamed from: d */
    public boolean m17770d() {
        return this.f23434i;
    }

    /* renamed from: e */
    public boolean m17769e() {
        return this.f23435j;
    }

    /* renamed from: f */
    public boolean m17768f() {
        return this.f23436k;
    }

    /* renamed from: a */
    public void m17773a(boolean z) {
        this.f23435j = z;
    }

    public C1637ea(String str, String str2, String str3, boolean z) {
        this(str, str2, str3, false, z);
    }

    public C1637ea(String str, String str2, String str3, boolean z, boolean z2) {
        this.f23436k = true;
        this.f23426a = str;
        this.f23433h = str2;
        this.f23434i = z;
        this.f23436k = z2;
        try {
            String[] split = str.split("/");
            int length = split.length;
            if (length <= 1) {
                return;
            }
            this.f23427b = split[length - 1];
            String[] split2 = this.f23427b.split("_");
            this.f23428c = split2[0];
            this.f23429d = split2[2];
            this.f23430e = split2[1];
            this.f23431f = Integer.parseInt(split2[3]);
            this.f23432g = Integer.parseInt(split2[4].split("\\.")[0]);
        } catch (Throwable th) {
            C1650eh.m17694a(th, "DexDownloadItem", "DexDownloadItem");
        }
    }
}
