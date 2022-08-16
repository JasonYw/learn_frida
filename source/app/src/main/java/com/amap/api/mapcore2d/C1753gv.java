package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import com.heytap.mcssdk.constant.C15151a;
import java.util.Calendar;
import java.util.Date;

/* renamed from: com.amap.api.mapcore2d.gv */
/* loaded from: classes25.dex */
public final class C1753gv {
    static {
        Covode.recordClassIndex(5301);
    }

    /* renamed from: a */
    public static long m17299a(long j) {
        return j - m17297b(j);
    }

    /* renamed from: a */
    public static long m17298a(long j, long j2) {
        try {
            return Math.abs(j - j2) > 31536000000L ? m17296b(j, j2) : j;
        } catch (Throwable unused) {
            return j;
        }
    }

    /* renamed from: b */
    public static long m17297b(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* renamed from: b */
    public static long m17296b(long j, long j2) {
        long m17297b = m17297b(j2) + m17299a(j);
        long abs = Math.abs(m17297b - j2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(m17297b));
        int i = calendar.get(11);
        return i == 23 ? abs >= 82800000 ? m17297b - C15151a.f30809f : m17297b : (i != 0 || abs < 82800000) ? m17297b : m17297b + C15151a.f30809f;
    }
}
