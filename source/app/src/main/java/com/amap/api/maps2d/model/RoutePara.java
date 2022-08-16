package com.amap.api.maps2d.model;

import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class RoutePara {

    /* renamed from: a */
    public int f24186a;

    /* renamed from: b */
    public int f24187b;

    /* renamed from: c */
    public LatLng f24188c;

    /* renamed from: d */
    public LatLng f24189d;

    /* renamed from: e */
    public String f24190e;

    /* renamed from: f */
    public String f24191f;

    static {
        Covode.recordClassIndex(5387);
    }

    public int getDrivingRouteStyle() {
        return this.f24186a;
    }

    public String getEndName() {
        return this.f24191f;
    }

    public LatLng getEndPoint() {
        return this.f24189d;
    }

    public String getStartName() {
        return this.f24190e;
    }

    public LatLng getStartPoint() {
        return this.f24188c;
    }

    public int getTransitRouteStyle() {
        return this.f24187b;
    }

    public void setEndName(String str) {
        this.f24191f = str;
    }

    public void setEndPoint(LatLng latLng) {
        this.f24189d = latLng;
    }

    public void setStartName(String str) {
        this.f24190e = str;
    }

    public void setStartPoint(LatLng latLng) {
        this.f24188c = latLng;
    }

    public void setTransitRouteStyle(int i) {
        if (i >= 0 && i < 6) {
            this.f24187b = i;
        }
    }

    public void setDrivingRouteStyle(int i) {
        if (i >= 0 && i < 9) {
            this.f24186a = i;
        }
    }
}
