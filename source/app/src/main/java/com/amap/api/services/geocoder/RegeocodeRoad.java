package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public final class RegeocodeRoad implements Parcelable {
    public static final Parcelable.Creator<RegeocodeRoad> CREATOR = new Parcelable.Creator<RegeocodeRoad>() { // from class: com.amap.api.services.geocoder.RegeocodeRoad.1
        static {
            Covode.recordClassIndex(5707);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RegeocodeRoad[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RegeocodeRoad createFromParcel(Parcel parcel) {
            return new RegeocodeRoad(parcel);
        }
    };

    /* renamed from: a */
    public String f25059a;

    /* renamed from: b */
    public String f25060b;

    /* renamed from: c */
    public float f25061c;

    /* renamed from: d */
    public String f25062d;

    /* renamed from: e */
    public LatLonPoint f25063e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public RegeocodeRoad() {
    }

    public final String getDirection() {
        return this.f25062d;
    }

    public final float getDistance() {
        return this.f25061c;
    }

    public final String getId() {
        return this.f25059a;
    }

    public final LatLonPoint getLatLngPoint() {
        return this.f25063e;
    }

    public final String getName() {
        return this.f25060b;
    }

    static {
        Covode.recordClassIndex(5706);
    }

    public final void setDirection(String str) {
        this.f25062d = str;
    }

    public final void setDistance(float f) {
        this.f25061c = f;
    }

    public final void setId(String str) {
        this.f25059a = str;
    }

    public final void setLatLngPoint(LatLonPoint latLonPoint) {
        this.f25063e = latLonPoint;
    }

    public final void setName(String str) {
        this.f25060b = str;
    }

    public RegeocodeRoad(Parcel parcel) {
        this.f25059a = parcel.readString();
        this.f25060b = parcel.readString();
        this.f25061c = parcel.readFloat();
        this.f25062d = parcel.readString();
        this.f25063e = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25059a);
        parcel.writeString(this.f25060b);
        parcel.writeFloat(this.f25061c);
        parcel.writeString(this.f25062d);
        parcel.writeValue(this.f25063e);
    }
}
