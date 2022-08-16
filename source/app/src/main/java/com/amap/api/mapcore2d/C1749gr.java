package com.amap.api.mapcore2d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.amap.api.mapcore2d.gr */
/* loaded from: classes19.dex */
public final class C1749gr extends AbstractC1673es {

    /* renamed from: f */
    public Map<String, String> f23805f;

    /* renamed from: h */
    public byte[] f23807h;

    /* renamed from: i */
    public byte[] f23808i;

    /* renamed from: j */
    public boolean f23809j;

    /* renamed from: k */
    public String f23810k;

    /* renamed from: l */
    public Map<String, String> f23811l;

    /* renamed from: m */
    public boolean f23812m;

    /* renamed from: n */
    public String f23813n = "";

    /* renamed from: g */
    public String f23806g = "";

    static {
        Covode.recordClassIndex(5297);
    }

    public C1749gr(Context context, C1599da c1599da) {
        super(context, c1599da);
    }

    /* renamed from: a */
    public final void m17330a(String str) {
        this.f23810k = str;
    }

    /* renamed from: a */
    public final void m17329a(Map<String, String> map) {
        this.f23811l = map;
    }

    /* renamed from: b */
    public final void m17327b(String str) {
        this.f23806g = str;
    }

    /* renamed from: b */
    public final void m17326b(Map<String, String> map) {
        this.f23805f = map;
    }

    /* renamed from: b */
    public final void m17325b(byte[] bArr) {
        this.f23807h = bArr;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1673es
    /* renamed from: b */
    public final byte[] mo17328b() {
        return this.f23807h;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1673es
    /* renamed from: c */
    public final byte[] mo17324c() {
        return this.f23808i;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1673es
    /* renamed from: e */
    public final boolean mo17323e() {
        return this.f23809j;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1683ew
    /* renamed from: f */
    public final Map<String, String> mo17322f() {
        return this.f23805f;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1673es, com.amap.api.mapcore2d.AbstractC1683ew
    /* renamed from: g */
    public final Map<String, String> mo17321g() {
        return this.f23811l;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1683ew
    /* renamed from: h */
    public final String mo17320h() {
        return this.f23806g;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1673es
    /* renamed from: j */
    public final String mo17319j() {
        return this.f23810k;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1673es
    /* renamed from: k */
    public final boolean mo17318k() {
        return this.f23812m;
    }

    @Override // com.amap.api.mapcore2d.AbstractC1683ew
    /* renamed from: m */
    public final String mo17317m() {
        return this.f23813n;
    }

    /* renamed from: q */
    public final void m17316q() {
        this.f23809j = true;
    }

    /* renamed from: r */
    public final void m17315r() {
        this.f23812m = true;
    }
}
