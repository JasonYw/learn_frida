package com.alipay.sdk.p082m.p096g0;

import android.content.Context;
import com.alipay.sdk.p082m.p090d0.AbstractC1253a;
import com.alipay.sdk.p082m.p090d0.C1256d;
import com.alipay.sdk.p082m.p094f0.C1272b;
import com.alipay.sdk.p082m.p094f0.C1273c;
import com.alipay.sdk.p082m.p094f0.C1274d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.sdk.m.g0.b */
/* loaded from: classes2.dex */
public class C1279b implements AbstractC1278a {

    /* renamed from: a */
    public static AbstractC1278a f22132a;

    /* renamed from: b */
    public static AbstractC1253a f22133b;

    static {
        Covode.recordClassIndex(4779);
    }

    /* renamed from: a */
    public static AbstractC1278a m19284a(Context context, String str) {
        if (context == null) {
            return null;
        }
        if (f22132a == null) {
            f22133b = C1256d.m19316a(context, str);
            f22132a = new C1279b();
        }
        return f22132a;
    }

    @Override // com.alipay.sdk.p082m.p096g0.AbstractC1278a
    /* renamed from: a */
    public C1273c mo19283a(C1274d c1274d) {
        return C1272b.m19302a(f22133b.mo19319a(C1272b.m19303a(c1274d)));
    }

    @Override // com.alipay.sdk.p082m.p096g0.AbstractC1278a
    public boolean logCollect(String str) {
        return f22133b.logCollect(str);
    }
}
