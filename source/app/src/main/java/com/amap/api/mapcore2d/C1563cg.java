package com.amap.api.mapcore2d;

import com.amap.api.maps2d.model.LatLng;
import com.bytedance.covode.number.Covode;
import java.math.BigDecimal;

/* renamed from: com.amap.api.mapcore2d.cg */
/* loaded from: classes19.dex */
public class C1563cg {
    static {
        Covode.recordClassIndex(5111);
    }

    /* renamed from: b */
    public static LatLng m18170b(LatLng latLng) {
        return m18172a(latLng, 2);
    }

    /* renamed from: a */
    public static double m18177a(double d) {
        return Math.sin(d * 3000.0d * 0.017453292519943295d) * 2.0E-5d;
    }

    /* renamed from: b */
    public static double m18171b(double d) {
        return Math.cos(d * 3000.0d * 0.017453292519943295d) * 3.0E-6d;
    }

    /* renamed from: a */
    public static LatLng m18173a(LatLng latLng) {
        if (latLng != null) {
            return m18170b(latLng);
        }
        return null;
    }

    /* renamed from: a */
    public static double m18174a(double d, int i) {
        return new BigDecimal(d).setScale(i, 4).doubleValue();
    }

    /* renamed from: a */
    public static C1564ch m18176a(double d, double d2) {
        C1564ch c1564ch = new C1564ch();
        double d3 = (d * d) + (d2 * d2);
        c1564ch.f23155a = m18174a((Math.cos(m18171b(d) + Math.atan2(d2, d)) * (m18177a(d2) + Math.sqrt(d3))) + 0.0065d, 8);
        c1564ch.f23156b = m18174a((Math.sin(m18171b(d) + Math.atan2(d2, d)) * (m18177a(d2) + Math.sqrt(d3))) + 0.006d, 8);
        return c1564ch;
    }

    /* renamed from: a */
    public static LatLng m18172a(LatLng latLng, int i) {
        LatLng latLng2 = null;
        double d = 0.006401062d;
        double d2 = 0.0060424805d;
        for (int i2 = 0; i2 < i; i2++) {
            latLng2 = m18175a(latLng.longitude, latLng.latitude, d, d2);
            d = latLng.longitude - latLng2.longitude;
            d2 = latLng.latitude - latLng2.latitude;
        }
        return latLng2;
    }

    /* renamed from: a */
    public static LatLng m18175a(double d, double d2, double d3, double d4) {
        C1564ch c1564ch = new C1564ch();
        double d5 = d - d3;
        double d6 = d2 - d4;
        C1564ch m18176a = m18176a(d5, d6);
        c1564ch.f23155a = m18174a((d + d5) - m18176a.f23155a, 8);
        c1564ch.f23156b = m18174a((d2 + d6) - m18176a.f23156b, 8);
        return new LatLng(c1564ch.f23156b, c1564ch.f23155a);
    }
}
