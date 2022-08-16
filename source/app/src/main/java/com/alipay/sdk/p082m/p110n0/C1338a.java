package com.alipay.sdk.p082m.p110n0;

import android.content.Context;
import com.alipay.sdk.p082m.p106l0.C1326f;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.sdk.m.n0.a */
/* loaded from: classes13.dex */
public class C1338a {
    static {
        Covode.recordClassIndex(4838);
    }

    /* renamed from: c */
    public static String m19067c(Context context) {
        return m19069a(context);
    }

    /* renamed from: d */
    public static String m19066d(Context context) {
        return m19068b(context);
    }

    /* renamed from: a */
    public static String m19069a(Context context) {
        C1339b m19052b = C1340c.m19052b(context);
        if (m19052b != null && !C1326f.m19144a(m19052b.m19059c())) {
            return m19052b.m19059c();
        }
        return "ffffffffffffffffffffffff";
    }

    /* renamed from: b */
    public static String m19068b(Context context) {
        String m19051a = C1341d.m19050a(context).m19051a();
        if (m19051a == null || C1326f.m19144a(m19051a)) {
            return "ffffffffffffffffffffffff";
        }
        return m19051a;
    }
}
