package com.alipay.sdk.p082m.p087c;

import android.content.Context;
import com.alipay.sdk.p082m.p085b.AbstractC1226b;
import com.alipay.sdk.p082m.p089d.C1252a;
import com.alipay.sdk.p082m.p118r0.C1373b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.sdk.m.c.c */
/* loaded from: classes2.dex */
public class C1239c implements AbstractC1226b {

    /* renamed from: a */
    public C1373b f22079a;

    /* renamed from: b */
    public boolean f22080b = false;

    /* renamed from: c */
    public boolean f22081c = false;

    static {
        Covode.recordClassIndex(4739);
    }

    @Override // com.alipay.sdk.p082m.p085b.AbstractC1226b
    /* renamed from: a */
    public String mo19338a(Context context) {
        boolean z;
        if (context == null) {
            return null;
        }
        if (!this.f22080b) {
            C1373b c1373b = new C1373b();
            this.f22079a = c1373b;
            if (c1373b.m18955a(context, (C1373b.AbstractC1375b<String>) null) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f22081c = z;
            this.f22080b = true;
        }
        C1252a.m19326b("getOAID", "isSupported", Boolean.valueOf(this.f22081c));
        if (!this.f22081c || !this.f22079a.m18945e()) {
            return null;
        }
        return this.f22079a.m18949b();
    }
}
