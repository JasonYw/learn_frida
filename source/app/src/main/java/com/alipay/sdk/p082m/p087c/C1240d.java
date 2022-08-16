package com.alipay.sdk.p082m.p087c;

import android.content.Context;
import com.alipay.sdk.p082m.p085b.AbstractC1226b;
import com.alipay.sdk.p082m.p089d.C1252a;
import com.alipay.sdk.p082m.p100i0.C1289b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.sdk.m.c.d */
/* loaded from: classes2.dex */
public class C1240d implements AbstractC1226b {
    static {
        Covode.recordClassIndex(4740);
    }

    @Override // com.alipay.sdk.p082m.p085b.AbstractC1226b
    /* renamed from: a */
    public String mo19338a(Context context) {
        if (context == null) {
            return null;
        }
        boolean m19267a = C1289b.m19267a();
        C1252a.m19326b("getOAID", "isSupported", Boolean.valueOf(m19267a));
        if (!m19267a) {
            return null;
        }
        return C1289b.m19264b(context);
    }
}
