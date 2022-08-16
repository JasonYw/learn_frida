package com.alipay.sdk.p082m.p087c;

import android.content.Context;
import com.alipay.sdk.p082m.p085b.AbstractC1226b;
import com.alipay.sdk.p082m.p089d.C1252a;
import com.alipay.sdk.p082m.p098h0.C1286a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.sdk.m.c.f */
/* loaded from: classes2.dex */
public class C1242f implements AbstractC1226b {

    /* renamed from: a */
    public boolean f22082a = false;

    static {
        Covode.recordClassIndex(4742);
    }

    @Override // com.alipay.sdk.p082m.p085b.AbstractC1226b
    /* renamed from: a */
    public String mo19338a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.f22082a) {
            C1286a.m19273e(context);
            this.f22082a = true;
        }
        boolean m19278a = C1286a.m19278a();
        C1252a.m19326b("getOAID", "isSupported", Boolean.valueOf(m19278a));
        if (!m19278a) {
            return null;
        }
        return C1286a.m19276b(context);
    }
}
