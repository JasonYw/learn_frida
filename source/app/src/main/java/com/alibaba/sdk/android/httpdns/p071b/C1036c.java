package com.alibaba.sdk.android.httpdns.p071b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.text.SimpleDateFormat;

/* renamed from: com.alibaba.sdk.android.httpdns.b.c */
/* loaded from: classes28.dex */
public class C1036c {

    /* renamed from: a */
    public static final SimpleDateFormat f21537a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    static {
        Covode.recordClassIndex(4442);
    }

    /* renamed from: a */
    public static long m19968a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return Long.valueOf(str).longValue();
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* renamed from: c */
    public static String m19967c(String str) {
        try {
            return f21537a.format(Long.valueOf(m19968a(str) * 1000));
        } catch (Exception unused) {
            return f21537a.format(Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: d */
    public static String m19966d(String str) {
        try {
            return String.valueOf(f21537a.parse(str).getTime() / 1000);
        } catch (Exception unused) {
            return String.valueOf(System.currentTimeMillis() / 1000);
        }
    }
}
