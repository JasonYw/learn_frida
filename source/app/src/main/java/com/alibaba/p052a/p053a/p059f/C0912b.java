package com.alibaba.p052a.p053a.p059f;

import com.bytedance.covode.number.Covode;

/* renamed from: com.alibaba.a.a.f.b */
/* loaded from: classes13.dex */
public class C0912b {
    static {
        Covode.recordClassIndex(4222);
    }

    /* renamed from: a */
    public static boolean m20337a(String str) {
        return !m20336b(str);
    }

    /* renamed from: b */
    public static boolean m20336b(String str) {
        int length;
        if (str != null && (length = str.length()) != 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
