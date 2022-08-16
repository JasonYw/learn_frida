package com.amap.api.services.geocoder;

import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class RegeocodeQuery {

    /* renamed from: a */
    public LatLonPoint f25053a;

    /* renamed from: b */
    public float f25054b;

    /* renamed from: c */
    public String f25055c = "autonavi";

    /* renamed from: d */
    public String f25056d = "";

    static {
        Covode.recordClassIndex(5704);
    }

    public String getLatLonType() {
        return this.f25055c;
    }

    public String getPoiType() {
        return this.f25056d;
    }

    public LatLonPoint getPoint() {
        return this.f25053a;
    }

    public float getRadius() {
        return this.f25054b;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f25055c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        LatLonPoint latLonPoint = this.f25053a;
        if (latLonPoint != null) {
            i = latLonPoint.hashCode();
        }
        return ((i2 + i) * 31) + Float.floatToIntBits(this.f25054b);
    }

    public void setPoiType(String str) {
        this.f25056d = str;
    }

    public void setPoint(LatLonPoint latLonPoint) {
        this.f25053a = latLonPoint;
    }

    public void setRadius(float f) {
        this.f25054b = f;
    }

    public void setLatLonType(String str) {
        if (str != null) {
            if (str.equals("autonavi") || str.equals("gps")) {
                this.f25055c = str;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RegeocodeQuery regeocodeQuery = (RegeocodeQuery) obj;
        String str = this.f25055c;
        if (str == null) {
            if (regeocodeQuery.f25055c != null) {
                return false;
            }
        } else if (!str.equals(regeocodeQuery.f25055c)) {
            return false;
        }
        LatLonPoint latLonPoint = this.f25053a;
        if (latLonPoint == null) {
            if (regeocodeQuery.f25053a != null) {
                return false;
            }
        } else if (!latLonPoint.equals(regeocodeQuery.f25053a)) {
            return false;
        }
        if (Float.floatToIntBits(this.f25054b) == Float.floatToIntBits(regeocodeQuery.f25054b)) {
            return true;
        }
        return false;
    }

    public RegeocodeQuery(LatLonPoint latLonPoint, float f, String str) {
        this.f25054b = 1000.0f;
        this.f25053a = latLonPoint;
        this.f25054b = f;
        setLatLonType(str);
    }
}
