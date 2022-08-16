package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public final class GeocodeAddress implements Parcelable {
    public static final Parcelable.Creator<GeocodeAddress> CREATOR = new Parcelable.Creator<GeocodeAddress>() { // from class: com.amap.api.services.geocoder.GeocodeAddress.1
        static {
            Covode.recordClassIndex(5697);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final GeocodeAddress[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final GeocodeAddress createFromParcel(Parcel parcel) {
            return new GeocodeAddress(parcel);
        }
    };

    /* renamed from: a */
    public String f25021a;

    /* renamed from: b */
    public String f25022b;

    /* renamed from: c */
    public String f25023c;

    /* renamed from: d */
    public String f25024d;

    /* renamed from: e */
    public String f25025e;

    /* renamed from: f */
    public String f25026f;

    /* renamed from: g */
    public String f25027g;

    /* renamed from: h */
    public String f25028h;

    /* renamed from: i */
    public LatLonPoint f25029i;

    /* renamed from: j */
    public String f25030j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public GeocodeAddress() {
    }

    public final String getAdcode() {
        return this.f25028h;
    }

    public final String getBuilding() {
        return this.f25027g;
    }

    public final String getCity() {
        return this.f25023c;
    }

    public final String getDistrict() {
        return this.f25024d;
    }

    public final String getFormatAddress() {
        return this.f25021a;
    }

    public final LatLonPoint getLatLonPoint() {
        return this.f25029i;
    }

    public final String getLevel() {
        return this.f25030j;
    }

    public final String getNeighborhood() {
        return this.f25026f;
    }

    public final String getProvince() {
        return this.f25022b;
    }

    public final String getTownship() {
        return this.f25025e;
    }

    static {
        Covode.recordClassIndex(5696);
    }

    public final void setAdcode(String str) {
        this.f25028h = str;
    }

    public final void setBuilding(String str) {
        this.f25027g = str;
    }

    public final void setCity(String str) {
        this.f25023c = str;
    }

    public final void setDistrict(String str) {
        this.f25024d = str;
    }

    public final void setFormatAddress(String str) {
        this.f25021a = str;
    }

    public final void setLatLonPoint(LatLonPoint latLonPoint) {
        this.f25029i = latLonPoint;
    }

    public final void setLevel(String str) {
        this.f25030j = str;
    }

    public final void setNeighborhood(String str) {
        this.f25026f = str;
    }

    public final void setProvince(String str) {
        this.f25022b = str;
    }

    public final void setTownship(String str) {
        this.f25025e = str;
    }

    public GeocodeAddress(Parcel parcel) {
        this.f25021a = parcel.readString();
        this.f25022b = parcel.readString();
        this.f25023c = parcel.readString();
        this.f25024d = parcel.readString();
        this.f25025e = parcel.readString();
        this.f25026f = parcel.readString();
        this.f25027g = parcel.readString();
        this.f25028h = parcel.readString();
        this.f25029i = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.f25030j = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25021a);
        parcel.writeString(this.f25022b);
        parcel.writeString(this.f25023c);
        parcel.writeString(this.f25024d);
        parcel.writeString(this.f25025e);
        parcel.writeString(this.f25026f);
        parcel.writeString(this.f25027g);
        parcel.writeString(this.f25028h);
        parcel.writeValue(this.f25029i);
        parcel.writeString(this.f25030j);
    }
}
