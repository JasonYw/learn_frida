package com.alipay.sdk.p082m.p087c;

import android.content.Context;
import com.alipay.sdk.p082m.p085b.AbstractC1226b;
import com.alipay.sdk.p082m.p089d.C1252a;
import com.alipay.sdk.p082m.p114p0.C1360e;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.sdk.m.c.h */
/* loaded from: classes2.dex */
public class C1246h implements AbstractC1226b {
    static {
        Covode.recordClassIndex(4746);
    }

    @Override // com.alipay.sdk.p082m.p085b.AbstractC1226b
    /* renamed from: a */
    public String mo19338a(Context context) {
        if (context == null) {
            return null;
        }
        boolean m18981c = C1360e.m18981c(context);
        C1252a.m19326b("getOAID", "isSupported", Boolean.valueOf(m18981c));
        if (!m18981c) {
            return null;
        }
        return C1360e.m18985a(context);
    }
}
