package com.amap.api.mapcore2d;

import com.amap.api.mapcore2d.C1599da;
import com.autonavi.amap.mapcore2d.Inner_3dMap_location;
import com.bytedance.covode.number.Covode;
import p003X.C116971W2r;

/* renamed from: com.amap.api.mapcore2d.gk */
/* loaded from: classes19.dex */
public final class C1740gk {

    /* renamed from: a */
    public static C1599da f23727a;

    /* renamed from: b */
    public static final String[] f23728b = {"com.amap.api.maps", "com.amap.api.mapcore", "com.autonavi.amap.mapcore", "com.amap.api.3dmap.admic", "com.amap.api.trace", "com.amap.api.trace.core"};

    /* renamed from: c */
    public static final String[] f23729c = {"com.amap.api.mapcore2d", "com.amap.api.maps2d"};

    /* renamed from: d */
    public static final String[] f23730d = {"com.amap.trace"};

    static {
        Covode.recordClassIndex(5288);
    }

    /* renamed from: a */
    public static C1599da m17432a() {
        Class cls;
        C1599da m17960a;
        C1599da c1599da = f23727a;
        if (c1599da != null) {
            return c1599da;
        }
        try {
            cls = C116971W2r.LIZ("com.amap.api.maps.MapsInitializer");
        } catch (Throwable unused) {
            cls = null;
        }
        try {
            if (cls != null) {
                String str = (String) C1754gw.m17295a(cls, "getVersion", (Object[]) null, (Class<?>[]) null);
                C1599da.C1601a c1601a = new C1599da.C1601a("3dmap", str, "AMAP_SDK_Android_Map_".concat(String.valueOf(str)));
                c1601a.m17957a(f23728b);
                m17960a = c1601a.m17960a();
            } else {
                cls = C116971W2r.LIZ("com.amap.api.maps2d.MapsInitializer");
                String str2 = (String) C1754gw.m17295a(cls, "getVersion", (Object[]) null, (Class<?>[]) null);
                C1599da.C1601a c1601a2 = new C1599da.C1601a("2dmap", str2, "AMAP_SDK_Android_2DMap_".concat(String.valueOf(str2)));
                c1601a2.m17957a(f23729c);
                m17960a = c1601a2.m17960a();
            }
            f23727a = m17960a;
        } catch (Throwable unused2) {
        }
        if (cls == null) {
            try {
                Class LIZ = C116971W2r.LIZ("com.amap.trace.AMapTraceClient");
                if (LIZ != null) {
                    String str3 = (String) C1754gw.m17295a(LIZ, "getVersion", (Object[]) null, (Class<?>[]) null);
                    C1599da.C1601a c1601a3 = new C1599da.C1601a("trace", str3, "AMAP_TRACE_Android_".concat(String.valueOf(str3)));
                    c1601a3.m17957a(f23730d);
                    f23727a = c1601a3.m17960a();
                }
            } catch (Throwable unused3) {
            }
        }
        return f23727a;
    }

    /* renamed from: a */
    public static boolean m17431a(C1733gg c1733gg) {
        if (c1733gg == null || c1733gg.m17460d().equals("8") || c1733gg.m17460d().equals("5") || c1733gg.m17460d().equals("6")) {
            return false;
        }
        return m17430a((Inner_3dMap_location) c1733gg);
    }

    /* renamed from: a */
    public static boolean m17430a(Inner_3dMap_location inner_3dMap_location) {
        double longitude = inner_3dMap_location.getLongitude();
        double latitude = inner_3dMap_location.getLatitude();
        return !(longitude == 0.0d && latitude == 0.0d) && longitude <= 180.0d && latitude <= 90.0d && longitude >= -180.0d && latitude >= -90.0d;
    }
}
