package com.amap.api.services.p126a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.lang.Thread;

/* renamed from: com.amap.api.services.a.co */
/* loaded from: classes19.dex */
public class C1926co implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public static C1926co f24625a;

    /* renamed from: b */
    public Thread.UncaughtExceptionHandler f24626b = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: c */
    public Context f24627c;

    /* renamed from: d */
    public C1889bo f24628d;

    static {
        Covode.recordClassIndex(5537);
    }

    /* renamed from: a */
    public void m16634a(Throwable th) {
        String m16785a = C1892bp.m16785a(th);
        try {
            if (!TextUtils.isEmpty(m16785a)) {
                if ((m16785a.contains("amapdynamic") || m16785a.contains("admic")) && m16785a.contains("com.amap.api")) {
                    C1914cf c1914cf = new C1914cf(this.f24627c, C1927cp.m16629c());
                    if (m16785a.contains("loc")) {
                        C1923cn.m16645a(c1914cf, this.f24627c, "loc");
                    }
                    if (m16785a.contains("navi")) {
                        C1923cn.m16645a(c1914cf, this.f24627c, "navi");
                    }
                    if (m16785a.contains("sea")) {
                        C1923cn.m16645a(c1914cf, this.f24627c, "sea");
                    }
                    if (m16785a.contains("2dmap")) {
                        C1923cn.m16645a(c1914cf, this.f24627c, "2dmap");
                    }
                    if (m16785a.contains("3dmap")) {
                        C1923cn.m16645a(c1914cf, this.f24627c, "3dmap");
                    }
                } else if (m16785a.contains("com.autonavi.aps.amapapi.offline")) {
                    C1923cn.m16645a(new C1914cf(this.f24627c, C1927cp.m16629c()), this.f24627c, "OfflineLocation");
                } else if (m16785a.contains("com.data.carrier_v4")) {
                    C1923cn.m16645a(new C1914cf(this.f24627c, C1927cp.m16629c()), this.f24627c, "Collection");
                } else if (!m16785a.contains("com.autonavi.aps.amapapi.httpdns") && !m16785a.contains("com.autonavi.httpdns")) {
                    if (m16785a.contains("com.amap.api.aiunet")) {
                        C1923cn.m16645a(new C1914cf(this.f24627c, C1927cp.m16629c()), this.f24627c, "aiu");
                    } else if (m16785a.contains("com.amap.co") || m16785a.contains("com.amap.opensdk.co") || m16785a.contains("com.amap.location")) {
                        C1923cn.m16645a(new C1914cf(this.f24627c, C1927cp.m16629c()), this.f24627c, "co");
                    }
                } else {
                    C1923cn.m16645a(new C1914cf(this.f24627c, C1927cp.m16629c()), this.f24627c, "HttpDNS");
                }
            }
        } catch (Throwable th2) {
            C1901by.m16742a(th2, "DynamicExceptionHandler", "uncaughtException");
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        m16634a(th);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f24626b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    public C1926co(Context context, C1889bo c1889bo) {
        this.f24627c = context.getApplicationContext();
        this.f24628d = c1889bo;
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* renamed from: a */
    public static synchronized C1926co m16635a(Context context, C1889bo c1889bo) {
        C1926co c1926co;
        synchronized (C1926co.class) {
            if (f24625a == null) {
                f24625a = new C1926co(context, c1889bo);
            }
            c1926co = f24625a;
        }
        return c1926co;
    }
}
