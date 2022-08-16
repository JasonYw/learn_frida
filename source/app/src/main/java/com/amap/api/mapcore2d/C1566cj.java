package com.amap.api.mapcore2d;

import com.amap.api.maps2d.model.LatLng;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.cj */
/* loaded from: classes19.dex */
public class C1566cj {
    static {
        Covode.recordClassIndex(5114);
    }

    /* renamed from: a */
    public static LatLng m18165a(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        if (C1568cl.m18163a(latLng.latitude, latLng.longitude)) {
            double[] m17497a = C1721fy.m17497a(latLng.longitude, latLng.latitude);
            return new LatLng(m17497a[1], m17497a[0]);
        }
        return latLng;
    }
}
