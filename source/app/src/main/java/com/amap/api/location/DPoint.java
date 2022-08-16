package com.amap.api.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class DPoint implements Parcelable {
    public static final Parcelable.Creator<DPoint> CREATOR = new Parcelable.Creator<DPoint>() { // from class: com.amap.api.location.DPoint.1
        static {
            Covode.recordClassIndex(5004);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DPoint createFromParcel(Parcel parcel) {
            return new DPoint(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DPoint[] newArray(int i) {
            return new DPoint[i];
        }
    };

    /* renamed from: a */
    public double f22649a;

    /* renamed from: b */
    public double f22650b;

    static {
        Covode.recordClassIndex(5003);
    }

    public DPoint() {
    }

    public DPoint(double d, double d2) {
        if (d2 > 180.0d) {
            d2 = 180.0d;
        } else if (d2 < -180.0d) {
            d2 = -180.0d;
        }
        if (d > 90.0d) {
            d = 90.0d;
        } else if (d < -90.0d) {
            d = -90.0d;
        }
        this.f22649a = d2;
        this.f22650b = d;
    }

    public DPoint(Parcel parcel) {
        this.f22649a = parcel.readDouble();
        this.f22650b = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DPoint)) {
            return false;
        }
        DPoint dPoint = (DPoint) obj;
        return this.f22650b == dPoint.f22650b && this.f22649a == dPoint.f22649a;
    }

    public double getLatitude() {
        return this.f22650b;
    }

    public double getLongitude() {
        return this.f22649a;
    }

    public int hashCode() {
        return Double.valueOf((this.f22650b + this.f22649a) * 1000000.0d).intValue();
    }

    public void setLatitude(double d) {
        if (d > 90.0d) {
            d = 90.0d;
        } else if (d < -90.0d) {
            d = -90.0d;
        }
        this.f22650b = d;
    }

    public void setLongitude(double d) {
        if (d > 180.0d) {
            d = 180.0d;
        } else if (d < -180.0d) {
            d = -180.0d;
        }
        this.f22649a = d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f22649a);
        parcel.writeDouble(this.f22650b);
    }
}
