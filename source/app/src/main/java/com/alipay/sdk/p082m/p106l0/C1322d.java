package com.alipay.sdk.p082m.p106l0;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Random;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.l0.d */
/* loaded from: classes13.dex */
public class C1322d {
    static {
        Covode.recordClassIndex(4822);
    }

    /* renamed from: b */
    public static String m19150b(Context context) {
        return "";
    }

    /* renamed from: b */
    public static String m19151b() {
        String m19143a = C1327g.m19143a("ro.aliyun.clouduuid", "");
        if (TextUtils.isEmpty(m19143a)) {
            m19143a = C1327g.m19143a("ro.sys.aliyun.clouduuid", "");
        }
        if (TextUtils.isEmpty(m19143a)) {
            return m19149c();
        }
        return m19143a;
    }

    /* renamed from: c */
    public static String m19149c() {
        try {
            return (String) C116971W2r.LIZ("com.yunos.baseservice.clouduuid.CloudUUID").getMethod("getCloudUUID", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m19153a() {
        int nanoTime = (int) System.nanoTime();
        int nextInt = new Random().nextInt();
        int nextInt2 = new Random().nextInt();
        byte[] m19154a = C1321c.m19154a((int) (System.currentTimeMillis() / 1000));
        byte[] m19154a2 = C1321c.m19154a(nanoTime);
        byte[] m19154a3 = C1321c.m19154a(nextInt);
        byte[] m19154a4 = C1321c.m19154a(nextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(m19154a, 0, bArr, 0, 4);
        System.arraycopy(m19154a2, 0, bArr, 4, 4);
        System.arraycopy(m19154a3, 0, bArr, 8, 4);
        System.arraycopy(m19154a4, 0, bArr, 12, 4);
        return C1317b.m19157c(bArr, 2);
    }

    /* renamed from: a */
    public static String m19152a(Context context) {
        String str = null;
        if (C1326f.m19144a((String) null)) {
            str = m19151b();
        }
        if (C1326f.m19144a(str)) {
            return m19153a();
        }
        return str;
    }
}
