package com.alipay.android.phone.mrpc.core;

import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.android.phone.mrpc.core.p */
/* loaded from: classes2.dex */
public final class C1169p extends C1174u {

    /* renamed from: c */
    public int f21911c;

    /* renamed from: d */
    public String f21912d;

    /* renamed from: e */
    public long f21913e;

    /* renamed from: f */
    public long f21914f;

    /* renamed from: g */
    public String f21915g;

    /* renamed from: h */
    public HttpUrlHeader f21916h;

    static {
        Covode.recordClassIndex(4640);
    }

    public C1169p(HttpUrlHeader httpUrlHeader, int i, String str, byte[] bArr) {
        this.f21916h = httpUrlHeader;
        this.f21911c = i;
        this.f21912d = str;
        this.f21937a = bArr;
    }

    /* renamed from: a */
    public final HttpUrlHeader m19620a() {
        return this.f21916h;
    }

    /* renamed from: a */
    public final void m19619a(long j) {
        this.f21913e = j;
    }

    /* renamed from: a */
    public final void m19618a(String str) {
        this.f21915g = str;
    }

    /* renamed from: b */
    public final void m19617b(long j) {
        this.f21914f = j;
    }
}
