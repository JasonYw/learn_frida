package com.alipay.sdk.p082m.p087c;

import android.content.Context;
import com.alipay.sdk.p082m.p085b.AbstractC1226b;
import com.alipay.sdk.p082m.p089d.C1252a;
import com.alipay.sdk.p082m.p102j0.C1300b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.sdk.m.c.i */
/* loaded from: classes2.dex */
public class C1247i implements AbstractC1226b {
    static {
        Covode.recordClassIndex(4747);
    }

    @Override // com.alipay.sdk.p082m.p085b.AbstractC1226b
    /* renamed from: a */
    public String mo19338a(Context context) {
        if (context == null) {
            return null;
        }
        boolean m19225a = C1300b.m19225a();
        C1252a.m19326b("getOAID", "isSupported", Boolean.valueOf(m19225a));
        if (!m19225a) {
            return null;
        }
        return C1300b.m19222b(context);
    }
}
