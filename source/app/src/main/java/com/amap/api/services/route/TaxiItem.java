package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class TaxiItem implements Parcelable {
    public static final Parcelable.Creator<TaxiItem> CREATOR = new Parcelable.Creator<TaxiItem>() { // from class: com.amap.api.services.route.TaxiItem.1
        static {
            Covode.recordClassIndex(5834);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final TaxiItem[] newArray(int i) {
            return new TaxiItem[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final TaxiItem createFromParcel(Parcel parcel) {
            return new TaxiItem(parcel);
        }
    };

    /* renamed from: a */
    public LatLonPoint f25311a;

    /* renamed from: b */
    public LatLonPoint f25312b;

    /* renamed from: c */
    public float f25313c;

    /* renamed from: d */
    public float f25314d;

    /* renamed from: e */
    public String f25315e;

    /* renamed from: f */
    public String f25316f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TaxiItem() {
    }

    public LatLonPoint getDestination() {
        return this.f25312b;
    }

    public float getDistance() {
        return this.f25313c;
    }

    public float getDuration() {
        return this.f25314d;
    }

    public LatLonPoint getOrigin() {
        return this.f25311a;
    }

    public String getmSname() {
        return this.f25315e;
    }

    public String getmTname() {
        return this.f25316f;
    }

    static {
        Covode.recordClassIndex(5833);
    }

    public void setDestination(LatLonPoint latLonPoint) {
        this.f25312b = latLonPoint;
    }

    public void setDistance(float f) {
        this.f25313c = f;
    }

    public void setDuration(float f) {
        this.f25314d = f;
    }

    public void setOrigin(LatLonPoint latLonPoint) {
        this.f25311a = latLonPoint;
    }

    public void setSname(String str) {
        this.f25315e = str;
    }

    public void setTname(String str) {
        this.f25316f = str;
    }

    public TaxiItem(Parcel parcel) {
        this.f25311a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f25312b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f25313c = parcel.readFloat();
        this.f25314d = parcel.readFloat();
        this.f25315e = parcel.readString();
        this.f25316f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f25311a, i);
        parcel.writeParcelable(this.f25312b, i);
        parcel.writeFloat(this.f25313c);
        parcel.writeFloat(this.f25314d);
        parcel.writeString(this.f25315e);
        parcel.writeString(this.f25316f);
    }
}
