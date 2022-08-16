package com.amap.api.services.nearby;

import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class NearbyInfo {

    /* renamed from: a */
    public String f25083a;

    /* renamed from: b */
    public LatLonPoint f25084b;

    /* renamed from: c */
    public long f25085c;

    /* renamed from: d */
    public int f25086d;

    /* renamed from: e */
    public int f25087e;

    static {
        Covode.recordClassIndex(5729);
    }

    public int getDistance() {
        return this.f25086d;
    }

    public int getDrivingDistance() {
        return this.f25087e;
    }

    public LatLonPoint getPoint() {
        return this.f25084b;
    }

    public long getTimeStamp() {
        return this.f25085c;
    }

    public String getUserID() {
        return this.f25083a;
    }

    public void setDistance(int i) {
        this.f25086d = i;
    }

    public void setDrivingDistance(int i) {
        this.f25087e = i;
    }

    public void setPoint(LatLonPoint latLonPoint) {
        this.f25084b = latLonPoint;
    }

    public void setTimeStamp(long j) {
        this.f25085c = j;
    }

    public void setUserID(String str) {
        this.f25083a = str;
    }
}
