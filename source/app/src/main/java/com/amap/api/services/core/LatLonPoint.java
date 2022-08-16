package com.amap.api.services.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes19.dex */
public class LatLonPoint implements Parcelable {
    public static final Parcelable.Creator<LatLonPoint> CREATOR = new Parcelable.Creator<LatLonPoint>() { // from class: com.amap.api.services.core.LatLonPoint.1
        static {
            Covode.recordClassIndex(5676);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final LatLonPoint[] newArray(int i) {
            return new LatLonPoint[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final LatLonPoint createFromParcel(Parcel parcel) {
            return new LatLonPoint(parcel);
        }
    };

    /* renamed from: a */
    public double f24953a;

    /* renamed from: b */
    public double f24954b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double getLatitude() {
        return this.f24953a;
    }

    public double getLongitude() {
        return this.f24954b;
    }

    static {
        Covode.recordClassIndex(5675);
    }

    public LatLonPoint copy() {
        return new LatLonPoint(this.f24953a, this.f24954b);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f24953a);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f24954b);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return this.f24953a + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f24954b;
    }

    public void setLatitude(double d) {
        this.f24953a = d;
    }

    public void setLongitude(double d) {
        this.f24954b = d;
    }

    public LatLonPoint(Parcel parcel) {
        this.f24953a = parcel.readDouble();
        this.f24954b = parcel.readDouble();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LatLonPoint latLonPoint = (LatLonPoint) obj;
        if (Double.doubleToLongBits(this.f24953a) == Double.doubleToLongBits(latLonPoint.f24953a) && Double.doubleToLongBits(this.f24954b) == Double.doubleToLongBits(latLonPoint.f24954b)) {
            return true;
        }
        return false;
    }

    public LatLonPoint(double d, double d2) {
        this.f24953a = d;
        this.f24954b = d2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f24953a);
        parcel.writeDouble(this.f24954b);
    }
}
