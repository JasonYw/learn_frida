package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;

/* loaded from: classes11.dex */
public class BusinessArea implements Parcelable {
    public static final Parcelable.Creator<BusinessArea> CREATOR = new Parcelable.Creator<BusinessArea>() { // from class: com.amap.api.services.geocoder.BusinessArea.1
        static {
            Covode.recordClassIndex(5695);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final BusinessArea[] newArray(int i) {
            return new BusinessArea[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final BusinessArea createFromParcel(Parcel parcel) {
            return new BusinessArea(parcel);
        }
    };

    /* renamed from: a */
    public LatLonPoint f25019a;

    /* renamed from: b */
    public String f25020b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BusinessArea() {
    }

    public LatLonPoint getCenterPoint() {
        return this.f25019a;
    }

    public String getName() {
        return this.f25020b;
    }

    static {
        Covode.recordClassIndex(5694);
    }

    public void setCenterPoint(LatLonPoint latLonPoint) {
        this.f25019a = latLonPoint;
    }

    public void setName(String str) {
        this.f25020b = str;
    }

    public BusinessArea(Parcel parcel) {
        this.f25019a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f25020b = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f25019a, i);
        parcel.writeString(this.f25020b);
    }
}
