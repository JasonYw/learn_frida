package com.amap.api.services.routepoisearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class RoutePOIItem implements Parcelable {
    public static final Parcelable.Creator<RoutePOIItem> CREATOR = new Parcelable.Creator<RoutePOIItem>() { // from class: com.amap.api.services.routepoisearch.RoutePOIItem.1
        static {
            Covode.recordClassIndex(5852);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RoutePOIItem[] newArray(int i) {
            return new RoutePOIItem[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RoutePOIItem createFromParcel(Parcel parcel) {
            return new RoutePOIItem(parcel);
        }
    };

    /* renamed from: a */
    public String f25360a;

    /* renamed from: b */
    public String f25361b;

    /* renamed from: c */
    public LatLonPoint f25362c;

    /* renamed from: d */
    public float f25363d;

    /* renamed from: e */
    public float f25364e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RoutePOIItem() {
    }

    public float getDistance() {
        return this.f25363d;
    }

    public float getDuration() {
        return this.f25364e;
    }

    public String getID() {
        return this.f25360a;
    }

    public LatLonPoint getPoint() {
        return this.f25362c;
    }

    public String getTitle() {
        return this.f25361b;
    }

    static {
        Covode.recordClassIndex(5851);
    }

    public void setDistance(float f) {
        this.f25363d = f;
    }

    public void setDuration(float f) {
        this.f25364e = f;
    }

    public void setID(String str) {
        this.f25360a = str;
    }

    public void setPoint(LatLonPoint latLonPoint) {
        this.f25362c = latLonPoint;
    }

    public void setTitle(String str) {
        this.f25361b = str;
    }

    public RoutePOIItem(Parcel parcel) {
        this.f25360a = parcel.readString();
        this.f25361b = parcel.readString();
        this.f25362c = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f25363d = parcel.readFloat();
        this.f25364e = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25360a);
        parcel.writeString(this.f25361b);
        parcel.writeParcelable(this.f25362c, i);
        parcel.writeFloat(this.f25363d);
        parcel.writeFloat(this.f25364e);
    }
}
