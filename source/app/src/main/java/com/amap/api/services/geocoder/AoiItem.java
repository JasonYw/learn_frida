package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class AoiItem implements Parcelable {
    public static final Parcelable.Creator<AoiItem> CREATOR = new Parcelable.Creator<AoiItem>() { // from class: com.amap.api.services.geocoder.AoiItem.1
        static {
            Covode.recordClassIndex(5693);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final AoiItem[] newArray(int i) {
            return new AoiItem[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final AoiItem createFromParcel(Parcel parcel) {
            return new AoiItem(parcel);
        }
    };

    /* renamed from: a */
    public String f25014a;

    /* renamed from: b */
    public String f25015b;

    /* renamed from: c */
    public String f25016c;

    /* renamed from: d */
    public LatLonPoint f25017d;

    /* renamed from: e */
    public Float f25018e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AoiItem() {
    }

    public String getAdCode() {
        return this.f25016c;
    }

    public Float getAoiArea() {
        return this.f25018e;
    }

    public LatLonPoint getAoiCenterPoint() {
        return this.f25017d;
    }

    public String getAoiId() {
        return this.f25014a;
    }

    public String getAoiName() {
        return this.f25015b;
    }

    static {
        Covode.recordClassIndex(5692);
    }

    public void setAdcode(String str) {
        this.f25016c = str;
    }

    public void setArea(Float f) {
        this.f25018e = f;
    }

    public void setId(String str) {
        this.f25014a = str;
    }

    public void setLocation(LatLonPoint latLonPoint) {
        this.f25017d = latLonPoint;
    }

    public void setName(String str) {
        this.f25015b = str;
    }

    public AoiItem(Parcel parcel) {
        this.f25014a = parcel.readString();
        this.f25015b = parcel.readString();
        this.f25016c = parcel.readString();
        this.f25017d = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f25018e = Float.valueOf(parcel.readFloat());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25014a);
        parcel.writeString(this.f25015b);
        parcel.writeString(this.f25016c);
        parcel.writeParcelable(this.f25017d, i);
        parcel.writeFloat(this.f25018e.floatValue());
    }
}
