package com.alipay.sdk.p082m.p086b0;

import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.covode.number.Covode;
import java.io.File;
import p002O.C0002O;

/* renamed from: com.alipay.sdk.m.b0.b */
/* loaded from: classes2.dex */
public final class C1229b {
    static {
        Covode.recordClassIndex(4729);
    }

    /* renamed from: a */
    public static String m19352a(String str) {
        String str2;
        try {
            str2 = C1233f.m19346a(str);
        } catch (Throwable unused) {
            str2 = "";
        }
        return C1448a.m18665a(str2) ? C1230c.m19350a(C0002O.m25085C(".SystemConfig", File.separator, str)) : str2;
    }
}
