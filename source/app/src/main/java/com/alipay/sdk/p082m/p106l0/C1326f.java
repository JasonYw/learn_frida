package com.alipay.sdk.p082m.p106l0;

import com.bytedance.covode.number.Covode;
import java.util.regex.Pattern;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.l0.f */
/* loaded from: classes13.dex */
public class C1326f {

    /* renamed from: a */
    public static final Pattern f22231a = C116971W2r.LIZJ("([\t\r\n])+");

    static {
        Covode.recordClassIndex(4826);
    }

    /* renamed from: a */
    public static boolean m19144a(String str) {
        if (str != null && str.length() > 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int m19145a(String str) {
        if (str.length() > 0) {
            int i = 0;
            for (char c : str.toCharArray()) {
                i = (i * 31) + c;
            }
            return i;
        }
        return 0;
    }
}
