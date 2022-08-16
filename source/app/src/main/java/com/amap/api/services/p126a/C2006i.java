package com.amap.api.services.p126a;

import com.amap.api.services.core.ServiceSettings;
import com.amap.api.services.p126a.C1889bo;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.services.a.i */
/* loaded from: classes19.dex */
public class C2006i {

    /* renamed from: a */
    public static final String[] f24823a = {"com.amap.api.services", "com.amap.api.search.admic"};

    static {
        Covode.recordClassIndex(5617);
    }

    /* renamed from: a */
    public static String m16380a() {
        if (ServiceSettings.getInstance().getProtocol() == 1) {
            return "http://restapi.amap.com/v3";
        }
        return "https://restapi.amap.com/v3";
    }

    /* renamed from: b */
    public static String m16378b() {
        if (ServiceSettings.getInstance().getProtocol() == 1) {
            return "http://restapi.amap.com/v4";
        }
        return "https://restapi.amap.com/v4";
    }

    /* renamed from: c */
    public static String m16377c() {
        if (ServiceSettings.getInstance().getProtocol() == 1) {
            return "http://yuntuapi.amap.com";
        }
        return "https://yuntuapi.amap.com";
    }

    /* renamed from: d */
    public static String m16376d() {
        if (ServiceSettings.getInstance().getProtocol() == 1) {
            return "http://m5.amap.com/ws/mapapi/shortaddress/transform";
        }
        return "https://m5.amap.com/ws/mapapi/shortaddress/transform";
    }

    /* renamed from: a */
    public static C1889bo m16379a(boolean z) {
        try {
            C1889bo.C1891a c1891a = new C1889bo.C1891a("sea", "7.1.0", "AMAP SDK Android Search 7.1.0");
            c1891a.m16803a(f24823a);
            c1891a.m16804a(z);
            c1891a.m16805a("7.1.0");
            return c1891a.m16807a();
        } catch (C1863be e) {
            C2007j.m16371a(e, "ConfigableConst", "getSDKInfo");
            return null;
        }
    }
}
