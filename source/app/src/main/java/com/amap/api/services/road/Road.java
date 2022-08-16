package com.amap.api.services.road;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class Road implements Parcelable {
    public static final Parcelable.Creator<Road> CREATOR = new Parcelable.Creator<Road>() { // from class: com.amap.api.services.road.Road.1
        static {
            Covode.recordClassIndex(5754);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final Road[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final Road createFromParcel(Parcel parcel) {
            return new Road(parcel);
        }
    };

    /* renamed from: a */
    public String f25148a;

    /* renamed from: b */
    public String f25149b;

    /* renamed from: c */
    public String f25150c;

    /* renamed from: d */
    public float f25151d;

    /* renamed from: e */
    public String f25152e;

    /* renamed from: f */
    public LatLonPoint f25153f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Road() {
    }

    public LatLonPoint getCenterPoint() {
        return this.f25153f;
    }

    public String getCityCode() {
        return this.f25150c;
    }

    public String getId() {
        return this.f25148a;
    }

    public String getName() {
        return this.f25149b;
    }

    public float getRoadWidth() {
        return this.f25151d;
    }

    public String getType() {
        return this.f25152e;
    }

    static {
        Covode.recordClassIndex(5753);
    }

    public void setCenterPoint(LatLonPoint latLonPoint) {
        this.f25153f = latLonPoint;
    }

    public void setCityCode(String str) {
        this.f25150c = str;
    }

    public void setId(String str) {
        this.f25148a = str;
    }

    public void setName(String str) {
        this.f25149b = str;
    }

    public void setRoadWidth(float f) {
        this.f25151d = f;
    }

    public void setType(String str) {
        this.f25152e = str;
    }

    public Road(Parcel parcel) {
        this.f25148a = parcel.readString();
        this.f25149b = parcel.readString();
        this.f25150c = parcel.readString();
        this.f25151d = parcel.readFloat();
        this.f25152e = parcel.readString();
        this.f25153f = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
    }

    public Road(String str, String str2) {
        this.f25148a = str;
        this.f25149b = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25148a);
        parcel.writeString(this.f25149b);
        parcel.writeString(this.f25150c);
        parcel.writeFloat(this.f25151d);
        parcel.writeString(this.f25152e);
        parcel.writeValue(this.f25153f);
    }
}
