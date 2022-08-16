package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public final class StreetNumber implements Parcelable {
    public static final Parcelable.Creator<StreetNumber> CREATOR = new Parcelable.Creator<StreetNumber>() { // from class: com.amap.api.services.geocoder.StreetNumber.1
        static {
            Covode.recordClassIndex(5709);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final StreetNumber[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final StreetNumber createFromParcel(Parcel parcel) {
            return new StreetNumber(parcel);
        }
    };

    /* renamed from: a */
    public String f25064a;

    /* renamed from: b */
    public String f25065b;

    /* renamed from: c */
    public LatLonPoint f25066c;

    /* renamed from: d */
    public String f25067d;

    /* renamed from: e */
    public float f25068e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public StreetNumber() {
    }

    public final String getDirection() {
        return this.f25067d;
    }

    public final float getDistance() {
        return this.f25068e;
    }

    public final LatLonPoint getLatLonPoint() {
        return this.f25066c;
    }

    public final String getNumber() {
        return this.f25065b;
    }

    public final String getStreet() {
        return this.f25064a;
    }

    static {
        Covode.recordClassIndex(5708);
    }

    public final void setDirection(String str) {
        this.f25067d = str;
    }

    public final void setDistance(float f) {
        this.f25068e = f;
    }

    public final void setLatLonPoint(LatLonPoint latLonPoint) {
        this.f25066c = latLonPoint;
    }

    public final void setNumber(String str) {
        this.f25065b = str;
    }

    public final void setStreet(String str) {
        this.f25064a = str;
    }

    public StreetNumber(Parcel parcel) {
        this.f25064a = parcel.readString();
        this.f25065b = parcel.readString();
        this.f25066c = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.f25067d = parcel.readString();
        this.f25068e = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25064a);
        parcel.writeString(this.f25065b);
        parcel.writeValue(this.f25066c);
        parcel.writeString(this.f25067d);
        parcel.writeFloat(this.f25068e);
    }
}
