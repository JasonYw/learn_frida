package com.amap.api.mapcore2d;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.lang.Thread;

/* renamed from: com.amap.api.mapcore2d.ec */
/* loaded from: classes19.dex */
public class C1641ec implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public static C1641ec f23440a;

    /* renamed from: b */
    public Thread.UncaughtExceptionHandler f23441b = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: c */
    public Context f23442c;

    /* renamed from: d */
    public C1599da f23443d;

    static {
        Covode.recordClassIndex(5189);
    }

    /* renamed from: a */
    public void m17747a(Throwable th) {
        String m17939a = C1602db.m17939a(th);
        try {
            if (!TextUtils.isEmpty(m17939a)) {
                if ((m17939a.contains("amapdynamic") || m17939a.contains("admic")) && m17939a.contains("com.amap.api")) {
                    C1627dt c1627dt = new C1627dt(this.f23442c, C1642ed.m17742c());
                    if (m17939a.contains("loc")) {
                        C1638eb.m17758a(c1627dt, this.f23442c, "loc");
                    }
                    if (m17939a.contains("navi")) {
                        C1638eb.m17758a(c1627dt, this.f23442c, "navi");
                    }
                    if (m17939a.contains("sea")) {
                        C1638eb.m17758a(c1627dt, this.f23442c, "sea");
                    }
                    if (m17939a.contains("2dmap")) {
                        C1638eb.m17758a(c1627dt, this.f23442c, "2dmap");
                    }
                    if (m17939a.contains("3dmap")) {
                        C1638eb.m17758a(c1627dt, this.f23442c, "3dmap");
                    }
                } else if (m17939a.contains("com.autonavi.aps.amapapi.offline")) {
                    C1638eb.m17758a(new C1627dt(this.f23442c, C1642ed.m17742c()), this.f23442c, "OfflineLocation");
                } else if (m17939a.contains("com.data.carrier_v4")) {
                    C1638eb.m17758a(new C1627dt(this.f23442c, C1642ed.m17742c()), this.f23442c, "Collection");
                } else if (!m17939a.contains("com.autonavi.aps.amapapi.httpdns") && !m17939a.contains("com.autonavi.httpdns")) {
                    if (m17939a.contains("com.amap.api.aiunet")) {
                        C1638eb.m17758a(new C1627dt(this.f23442c, C1642ed.m17742c()), this.f23442c, "aiu");
                    } else if (m17939a.contains("com.amap.co") || m17939a.contains("com.amap.opensdk.co") || m17939a.contains("com.amap.location")) {
                        C1638eb.m17758a(new C1627dt(this.f23442c, C1642ed.m17742c()), this.f23442c, "co");
                    }
                } else {
                    C1638eb.m17758a(new C1627dt(this.f23442c, C1642ed.m17742c()), this.f23442c, "HttpDNS");
                }
            }
        } catch (Throwable th2) {
            C1612dl.m17891a(th2, "DynamicExceptionHandler", "uncaughtException");
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        m17747a(th);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f23441b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    public C1641ec(Context context, C1599da c1599da) {
        this.f23442c = context.getApplicationContext();
        this.f23443d = c1599da;
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* renamed from: a */
    public static synchronized C1641ec m17748a(Context context, C1599da c1599da) {
        C1641ec c1641ec;
        synchronized (C1641ec.class) {
            if (f23440a == null) {
                f23440a = new C1641ec(context, c1599da);
            }
            c1641ec = f23440a;
        }
        return c1641ec;
    }
}
