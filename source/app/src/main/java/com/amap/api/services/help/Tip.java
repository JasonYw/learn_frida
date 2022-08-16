package com.amap.api.services.help;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;

/* loaded from: classes19.dex */
public class Tip implements Parcelable {
    public static final Parcelable.Creator<Tip> CREATOR = new Parcelable.Creator<Tip>() { // from class: com.amap.api.services.help.Tip.1
        static {
            Covode.recordClassIndex(5714);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final Tip[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final Tip createFromParcel(Parcel parcel) {
            return new Tip(parcel);
        }
    };

    /* renamed from: a */
    public String f25075a;

    /* renamed from: b */
    public LatLonPoint f25076b;

    /* renamed from: c */
    public String f25077c;

    /* renamed from: d */
    public String f25078d;

    /* renamed from: e */
    public String f25079e;

    /* renamed from: f */
    public String f25080f;

    /* renamed from: g */
    public String f25081g;

    /* renamed from: h */
    public String f25082h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdcode() {
        return this.f25079e;
    }

    public String getAddress() {
        return this.f25080f;
    }

    public String getDistrict() {
        return this.f25078d;
    }

    public String getName() {
        return this.f25077c;
    }

    public String getPoiID() {
        return this.f25075a;
    }

    public LatLonPoint getPoint() {
        return this.f25076b;
    }

    public String getTypeCode() {
        return this.f25081g;
    }

    public Tip() {
        this.f25082h = "";
    }

    static {
        Covode.recordClassIndex(5713);
    }

    public String toString() {
        return C0002O.m25082C("name:", this.f25077c, " district:", this.f25078d, " adcode:", this.f25079e);
    }

    public void setAdcode(String str) {
        this.f25079e = str;
    }

    public void setAddress(String str) {
        this.f25080f = str;
    }

    public void setDistrict(String str) {
        this.f25078d = str;
    }

    public void setID(String str) {
        this.f25075a = str;
    }

    public void setName(String str) {
        this.f25077c = str;
    }

    public void setPostion(LatLonPoint latLonPoint) {
        this.f25076b = latLonPoint;
    }

    public void setTypeCode(String str) {
        this.f25081g = str;
    }

    public Tip(Parcel parcel) {
        this.f25082h = "";
        this.f25077c = parcel.readString();
        this.f25079e = parcel.readString();
        this.f25078d = parcel.readString();
        this.f25075a = parcel.readString();
        this.f25076b = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.f25080f = parcel.readString();
        this.f25081g = parcel.readString();
        this.f25082h = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25077c);
        parcel.writeString(this.f25079e);
        parcel.writeString(this.f25078d);
        parcel.writeString(this.f25075a);
        parcel.writeValue(this.f25076b);
        parcel.writeString(this.f25080f);
        parcel.writeString(this.f25081g);
        parcel.writeString(this.f25082h);
    }
}
