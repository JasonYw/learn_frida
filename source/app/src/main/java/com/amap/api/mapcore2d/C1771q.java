package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;

/* renamed from: com.amap.api.mapcore2d.q */
/* loaded from: classes19.dex */
public class C1771q {

    /* renamed from: a */
    public static float f24012a;

    /* renamed from: b */
    public static String f24013b;

    /* renamed from: c */
    public static int f24014c;

    /* renamed from: d */
    public static int f24015d;

    /* renamed from: e */
    public static final EnumC1772a f24016e;

    /* renamed from: f */
    public static final String[] f24017f;

    /* renamed from: g */
    public static String f24018g;

    /* renamed from: h */
    public static String f24019h;

    /* renamed from: i */
    public static int f24020i;

    /* renamed from: j */
    public static int f24021j;

    /* renamed from: k */
    public static int f24022k;

    /* renamed from: l */
    public static int f24023l;

    /* renamed from: m */
    public static int f24024m;

    /* renamed from: n */
    public static int f24025n;

    /* renamed from: o */
    public static int f24026o;

    /* renamed from: p */
    public static volatile C1599da f24027p;

    /* renamed from: q */
    public static int f24028q;

    /* renamed from: r */
    public static boolean f24029r;

    /* renamed from: s */
    public static boolean f24030s;

    /* renamed from: t */
    public static boolean f24031t;

    /* renamed from: b */
    public static boolean m17199b() {
        return f24031t;
    }

    /* renamed from: a */
    public static String m17202a() {
        if (f24014c == 18) {
            return "/appmaptile?z=%d&x=%d&y=%d&lang=%s&size=1&scale=1&style=8";
        }
        return "/appmaptile?z=%d&x=%d&y=%d&lang=%s&size=1&scale=1&style=7";
    }

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(5319);
        f24012a = 0.9f;
        f24013b = "";
        f24014c = 19;
        f24015d = 3;
        f24016e = EnumC1772a.PUBLIC;
        f24017f = new String[]{"com.amap.api.mapcore2d", "com.amap.api.maps2d"};
        f24020i = 1;
        f24021j = 256;
        f24022k = 21;
        f24028q = 7;
        f24029r = true;
        f24030s = true;
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(5319);
        f24012a = 0.9f;
        f24013b = "";
        f24014c = 19;
        f24015d = 3;
        f24016e = EnumC1772a.PUBLIC;
        f24017f = new String[]{"com.amap.api.mapcore2d", "com.amap.api.maps2d"};
        f24020i = 1;
        f24021j = 256;
        f24022k = 21;
        f24028q = 7;
        f24029r = true;
        f24030s = true;
    }

    /* renamed from: com.amap.api.mapcore2d.q$a */
    /* loaded from: classes8.dex */
    public enum EnumC1772a {
        PUBLIC,
        ALIBABA,
        CHELIANWAGN,
        U116114;

        static {
            Covode.recordClassIndex(5320);
        }
    }

    /* renamed from: a */
    public static void m17201a(int i) {
        f24014c = i;
    }

    /* renamed from: b */
    public static void m17198b(int i) {
        f24015d = i;
    }

    /* renamed from: a */
    public static void m17200a(boolean z) {
        f24031t = z;
    }
}
