package com.amap.api.mapcore2d;

import com.amap.api.maps2d.model.LatLng;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.ci */
/* loaded from: classes19.dex */
public class C1565ci {

    /* renamed from: a */
    public static double f23157a = 3.141592653589793d;

    static {
        Covode.recordClassIndex(5113);
    }

    /* renamed from: a */
    public static LatLng m18168a(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return C1566cj.m18165a(m18166c(latLng.longitude, latLng.latitude));
    }

    /* renamed from: a */
    public static double m18169a(double d, double d2) {
        return (Math.cos(d2 / 100000.0d) * (d / 18000.0d)) + (Math.sin(d / 100000.0d) * (d2 / 9000.0d));
    }

    /* renamed from: b */
    public static double m18167b(double d, double d2) {
        return (Math.sin(d2 / 100000.0d) * (d / 18000.0d)) + (Math.cos(d / 100000.0d) * (d2 / 9000.0d));
    }

    /* renamed from: c */
    public static LatLng m18166c(double d, double d2) {
        int i;
        double d3 = ((long) (d * 100000.0d)) % 36000000;
        double d4 = ((long) (d2 * 100000.0d)) % 36000000;
        int i2 = (int) ((-m18169a(d3, d4)) + d3);
        double d5 = (int) ((-m18167b(d3, d4)) + d4);
        double d6 = (-m18169a(i2, d5)) + d3;
        int i3 = 1;
        if (d3 > 0.0d) {
            i = 1;
        } else {
            i = -1;
        }
        double d7 = (int) (d6 + i);
        double d8 = (-m18167b(d7, d5)) + d4;
        if (d4 <= 0.0d) {
            i3 = -1;
        }
        return new LatLng(((int) (d8 + i3)) / 100000.0d, d7 / 100000.0d);
    }
}
