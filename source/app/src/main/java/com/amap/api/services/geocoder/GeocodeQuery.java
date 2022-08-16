package com.amap.api.services.geocoder;

import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class GeocodeQuery {

    /* renamed from: a */
    public String f25031a;

    /* renamed from: b */
    public String f25032b;

    static {
        Covode.recordClassIndex(5698);
    }

    public String getCity() {
        return this.f25032b;
    }

    public String getLocationName() {
        return this.f25031a;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f25032b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        String str2 = this.f25031a;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public void setCity(String str) {
        this.f25032b = str;
    }

    public void setLocationName(String str) {
        this.f25031a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeocodeQuery geocodeQuery = (GeocodeQuery) obj;
        String str = this.f25032b;
        if (str == null) {
            if (geocodeQuery.f25032b != null) {
                return false;
            }
        } else if (!str.equals(geocodeQuery.f25032b)) {
            return false;
        }
        String str2 = this.f25031a;
        if (str2 == null) {
            if (geocodeQuery.f25031a != null) {
                return false;
            }
        } else if (!str2.equals(geocodeQuery.f25031a)) {
            return false;
        }
        return true;
    }

    public GeocodeQuery(String str, String str2) {
        this.f25031a = str;
        this.f25032b = str2;
    }
}
