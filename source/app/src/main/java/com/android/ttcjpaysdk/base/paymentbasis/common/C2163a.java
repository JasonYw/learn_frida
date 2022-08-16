package com.android.ttcjpaysdk.base.paymentbasis.common;

import com.bytedance.covode.number.Covode;

/* renamed from: com.android.ttcjpaysdk.base.paymentbasis.common.a */
/* loaded from: classes17.dex */
public final class C2163a implements Cloneable {
    public final String LIZ;
    public final String LIZIZ;

    static {
        Covode.recordClassIndex(6355);
    }

    public C2163a(String str, String str2) {
        if (str != null) {
            this.LIZ = str;
            this.LIZIZ = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
