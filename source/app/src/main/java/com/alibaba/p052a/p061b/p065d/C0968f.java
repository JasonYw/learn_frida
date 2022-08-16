package com.alibaba.p052a.p061b.p065d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.alibaba.a.b.d.f */
/* loaded from: classes13.dex */
public class C0968f {
    static {
        Covode.recordClassIndex(4278);
    }

    /* renamed from: a */
    public static byte[] m20112a(int i) {
        byte[] bArr = {(byte) ((r2 >> 8) % 256), (byte) (r2 % 256), (byte) (r2 % 256), (byte) (i % 256)};
        int i2 = i >> 8;
        int i3 = i2 >> 8;
        return bArr;
    }
}
