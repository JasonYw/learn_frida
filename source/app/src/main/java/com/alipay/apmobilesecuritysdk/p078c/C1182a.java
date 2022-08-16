package com.alipay.apmobilesecuritysdk.p078c;

import android.content.Context;
import android.os.Build;
import com.alipay.sdk.p082m.p088c0.C1248a;
import com.alipay.sdk.p082m.p088c0.C1251d;
import com.bytedance.covode.number.Covode;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: com.alipay.apmobilesecuritysdk.c.a */
/* loaded from: classes2.dex */
public final class C1182a {
    static {
        Covode.recordClassIndex(4653);
    }

    /* renamed from: a */
    public static synchronized void m19577a(Context context, String str, String str2, String str3) {
        synchronized (C1182a.class) {
            C1248a m19574b = m19574b(context, str, str2, str3);
            new StringBuilder();
            String m25086C = C0002O.m25086C(C116971W2r.LIZJ(context).getAbsolutePath(), "/log/ap");
            String format = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
            new StringBuilder();
            C1251d.m19332a(m25086C, C0002O.m25086C(format, ".log"), m19574b.toString());
        }
    }

    /* renamed from: a */
    public static synchronized void m19576a(String str) {
        synchronized (C1182a.class) {
            C1251d.m19333a(str);
        }
    }

    /* renamed from: a */
    public static synchronized void m19575a(Throwable th) {
        synchronized (C1182a.class) {
            C1251d.m19331a(th);
        }
    }

    /* renamed from: b */
    public static C1248a m19574b(Context context, String str, String str2, String str3) {
        String str4;
        try {
            str4 = context.getPackageName();
        } catch (Throwable unused) {
            str4 = "";
        }
        return new C1248a(Build.MODEL, str4, "APPSecuritySDK-ALIPAYSDK", "3.4.0.202203211140", str, str2, str3);
    }
}
