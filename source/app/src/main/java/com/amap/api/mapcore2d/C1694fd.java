package com.amap.api.mapcore2d;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.fd */
/* loaded from: classes19.dex */
public class C1694fd {

    /* renamed from: a */
    public Context f23594a;

    /* renamed from: b */
    public C1599da f23595b;

    /* renamed from: c */
    public String f23596c;

    static {
        Covode.recordClassIndex(5242);
    }

    /* renamed from: a */
    public byte[] m17540a() {
        return C1602db.m17940a(m17539a(this.f23594a, this.f23595b, this.f23596c));
    }

    public C1694fd(Context context, C1599da c1599da, String str) {
        this.f23594a = context.getApplicationContext();
        this.f23595b = c1599da;
        this.f23596c = str;
    }

    /* renamed from: a */
    public static String m17539a(Context context, C1599da c1599da, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("\"sdkversion\":\"");
            sb.append(c1599da.m17966c());
            sb.append("\",\"product\":\"");
            sb.append(c1599da.m17972a());
            sb.append("\",\"nt\":\"");
            sb.append(C1587cu.m18048e(context));
            sb.append("\",\"details\":");
            sb.append(str);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }
}
