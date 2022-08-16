package com.amap.api.services.p126a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.services.a.cm */
/* loaded from: classes19.dex */
public class C1922cm {

    /* renamed from: a */
    public String f24611a;

    /* renamed from: b */
    public String f24612b;

    /* renamed from: c */
    public String f24613c;

    /* renamed from: d */
    public String f24614d;

    /* renamed from: e */
    public String f24615e;

    /* renamed from: f */
    public int f24616f;

    /* renamed from: g */
    public int f24617g;

    /* renamed from: h */
    public String f24618h;

    /* renamed from: i */
    public boolean f24619i;

    /* renamed from: j */
    public boolean f24620j;

    /* renamed from: k */
    public boolean f24621k;

    static {
        Covode.recordClassIndex(5533);
    }

    /* renamed from: a */
    public String m16661a() {
        return this.f24611a;
    }

    /* renamed from: b */
    public String m16659b() {
        return this.f24618h;
    }

    /* renamed from: c */
    public String m16658c() {
        return this.f24614d;
    }

    /* renamed from: d */
    public boolean m16657d() {
        return this.f24619i;
    }

    /* renamed from: e */
    public boolean m16656e() {
        return this.f24620j;
    }

    /* renamed from: f */
    public boolean m16655f() {
        return this.f24621k;
    }

    /* renamed from: a */
    public void m16660a(boolean z) {
        this.f24620j = z;
    }

    public C1922cm(String str, String str2, String str3, boolean z) {
        this(str, str2, str3, false, z);
    }

    public C1922cm(String str, String str2, String str3, boolean z, boolean z2) {
        this.f24621k = true;
        this.f24611a = str;
        this.f24618h = str2;
        this.f24619i = z;
        this.f24621k = z2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String[] split = str.split("/");
            int length = split.length;
            if (length <= 1) {
                return;
            }
            this.f24612b = split[length - 1];
            String[] split2 = this.f24612b.split("_");
            this.f24613c = split2[0];
            this.f24614d = split2[2];
            this.f24615e = split2[1];
            this.f24616f = Integer.parseInt(split2[3]);
            this.f24617g = Integer.parseInt(split2[4].split("\\.")[0]);
        } catch (Throwable th) {
            C1935ct.m16581a(th, "DexDownloadItem", "DexDownloadItem");
        }
    }
}
