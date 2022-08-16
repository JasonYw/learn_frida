package com.alipay.sdk.p082m.p097h;

import com.alipay.sdk.p082m.p095g.C1275a;
import com.alipay.sdk.p082m.p095g.C1277c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.sdk.m.h.a */
/* loaded from: classes2.dex */
public class C1280a extends C1275a {

    /* renamed from: d */
    public static final /* synthetic */ boolean f22134d = !C1280a.class.desiredAssertionStatus();

    static {
        Covode.recordClassIndex(4780);
    }

    /* renamed from: c */
    public static C1280a m19281c() {
        try {
            return m19282a("EX", 0L, new C1282c(""), (short) 0, new C1285f());
        } catch (Exception unused) {
            return null;
        }
    }

    public C1280a(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: a */
    public static C1280a m19282a(String str, long j, AbstractC1281b abstractC1281b, short s, AbstractC1284e abstractC1284e) {
        byte[] m19295a = C1277c.m19295a((byte) 1);
        if (!f22134d && m19295a.length != 1) {
            throw new AssertionError();
        }
        byte[] m19293a = C1277c.m19293a(str.charAt(0), str.charAt(1));
        if (!f22134d && m19293a.length != 2) {
            throw new AssertionError();
        }
        byte[] m19291a = C1277c.m19291a(j);
        if (!f22134d && m19291a.length != 8) {
            throw new AssertionError();
        }
        byte[] m19287b = C1277c.m19287b();
        if (!f22134d && m19287b.length != 2) {
            throw new AssertionError();
        }
        abstractC1281b.mo19280a();
        byte[] m19295a2 = C1277c.m19295a(abstractC1281b.f22135a);
        if (!f22134d && m19295a2.length != 1) {
            throw new AssertionError();
        }
        byte[] m19295a3 = C1277c.m19295a(abstractC1281b.f22136b);
        if (!f22134d && m19295a3.length != 1) {
            throw new AssertionError();
        }
        byte[] bArr = (byte[]) abstractC1281b.f22137c.clone();
        if (!f22134d && bArr.length != (abstractC1281b.f22136b & 255)) {
            throw new AssertionError();
        }
        byte[] m19290a = C1277c.m19290a(s);
        if (!f22134d && m19290a.length != 2) {
            throw new AssertionError();
        }
        byte[] m19287b2 = C1277c.m19287b();
        if (!f22134d && m19287b2.length != 2) {
            throw new AssertionError();
        }
        abstractC1284e.mo19279a();
        byte[] m19295a4 = C1277c.m19295a(abstractC1284e.f22139a);
        if (!f22134d && m19295a4.length != 1) {
            throw new AssertionError();
        }
        byte[] bArr2 = (byte[]) abstractC1284e.f22140b.clone();
        if (!f22134d && bArr2.length != (abstractC1284e.f22139a & 255)) {
            throw new AssertionError();
        }
        byte[] m19285c = C1277c.m19285c();
        if (!f22134d && m19285c.length != 4) {
            throw new AssertionError();
        }
        return new C1280a(C1277c.m19288a(m19295a, m19293a, m19291a, m19287b, m19295a2, m19295a3, bArr, m19290a, m19287b2, m19295a4, bArr2, m19285c));
    }
}
