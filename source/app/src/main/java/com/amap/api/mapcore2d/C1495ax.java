package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import java.util.Locale;
import java.util.Random;
import p002O.C0002O;

/* renamed from: com.amap.api.mapcore2d.ax */
/* loaded from: classes19.dex */
public class C1495ax {

    /* renamed from: b */
    public static C1495ax f22754b;

    /* renamed from: a */
    public String f22755a = "http://tm.amap.com";

    static {
        Covode.recordClassIndex(5043);
    }

    /* renamed from: c */
    public String m18502c() {
        return this.f22755a;
    }

    /* renamed from: a */
    public static synchronized C1495ax m18504a() {
        C1495ax c1495ax;
        synchronized (C1495ax.class) {
            if (f22754b == null) {
                f22754b = new C1495ax();
            }
            c1495ax = f22754b;
        }
        return c1495ax;
    }

    /* renamed from: d */
    public String m18501d() {
        return "http://grid.amap.com/grid/%d/%d/%d?ds=" + C1771q.f24020i;
    }

    /* renamed from: e */
    public String m18500e() {
        return String.format(Locale.US, "http://mst0%d.is.autonavi.com", Integer.valueOf((new Random(System.currentTimeMillis()).nextInt(100000) % 4) + 1));
    }

    /* renamed from: b */
    public String m18503b() {
        String format;
        int nextInt = new Random(System.currentTimeMillis()).nextInt(100000) % 4;
        if (C1771q.f24024m == 2) {
            format = String.format(Locale.US, "http://wprd0%d.is.autonavi.com", Integer.valueOf(nextInt + 1));
        } else {
            format = String.format(Locale.US, "http://webrd0%d.is.autonavi.com", Integer.valueOf(nextInt + 1));
        }
        new StringBuilder();
        return C0002O.m25086C(format, C1771q.m17202a());
    }
}
