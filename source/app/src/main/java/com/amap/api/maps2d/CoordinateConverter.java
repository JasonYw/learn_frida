package com.amap.api.maps2d;

import com.amap.api.mapcore2d.C1563cg;
import com.amap.api.mapcore2d.C1565ci;
import com.amap.api.mapcore2d.C1566cj;
import com.amap.api.mapcore2d.C1568cl;
import com.amap.api.maps2d.model.LatLng;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class CoordinateConverter {

    /* renamed from: a */
    public CoordType f24088a;

    /* renamed from: b */
    public LatLng f24089b;

    static {
        Covode.recordClassIndex(5354);
    }

    /* loaded from: classes19.dex */
    public enum CoordType {
        BAIDU,
        MAPBAR,
        MAPABC,
        SOSOMAP,
        ALIYUN,
        GOOGLE,
        GPS;

        static {
            Covode.recordClassIndex(5356);
        }
    }

    public LatLng convert() {
        if (this.f24088a == null || this.f24089b == null) {
            return null;
        }
        try {
            switch (this.f24088a) {
                case BAIDU:
                    return C1563cg.m18173a(this.f24089b);
                case MAPBAR:
                    return C1565ci.m18168a(this.f24089b);
                case MAPABC:
                case SOSOMAP:
                case ALIYUN:
                case GOOGLE:
                    return this.f24089b;
                case GPS:
                    return C1566cj.m18165a(this.f24089b);
                default:
                    return null;
            }
        } catch (Throwable unused) {
            return this.f24089b;
        }
    }

    public CoordinateConverter coord(LatLng latLng) {
        this.f24089b = latLng;
        return this;
    }

    public CoordinateConverter from(CoordType coordType) {
        this.f24088a = coordType;
        return this;
    }

    public static boolean isAMapDataAvailable(double d, double d2) {
        return C1568cl.m18163a(d, d2);
    }
}
