package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;

/* loaded from: classes11.dex */
public class Doorway implements Parcelable {
    public static final Parcelable.Creator<Doorway> CREATOR = new Parcelable.Creator<Doorway>() { // from class: com.amap.api.services.route.Doorway.1
        static {
            Covode.recordClassIndex(5772);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final Doorway[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final Doorway createFromParcel(Parcel parcel) {
            return new Doorway(parcel);
        }
    };

    /* renamed from: a */
    public String f25182a;

    /* renamed from: b */
    public LatLonPoint f25183b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Doorway() {
    }

    public LatLonPoint getLatLonPoint() {
        return this.f25183b;
    }

    public String getName() {
        return this.f25182a;
    }

    static {
        Covode.recordClassIndex(5771);
    }

    public void setLatLonPoint(LatLonPoint latLonPoint) {
        this.f25183b = latLonPoint;
    }

    public void setName(String str) {
        this.f25182a = str;
    }

    public Doorway(Parcel parcel) {
        this.f25182a = parcel.readString();
        this.f25183b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25182a);
        parcel.writeParcelable(this.f25183b, i);
    }
}
