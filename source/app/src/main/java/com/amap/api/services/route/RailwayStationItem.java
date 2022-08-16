package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class RailwayStationItem implements Parcelable {
    public static final Parcelable.Creator<RailwayStationItem> CREATOR = new Parcelable.Creator<RailwayStationItem>() { // from class: com.amap.api.services.route.RailwayStationItem.1
        static {
            Covode.recordClassIndex(5792);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RailwayStationItem[] newArray(int i) {
            return new RailwayStationItem[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RailwayStationItem createFromParcel(Parcel parcel) {
            return new RailwayStationItem(parcel);
        }
    };

    /* renamed from: a */
    public String f25223a;

    /* renamed from: b */
    public String f25224b;

    /* renamed from: c */
    public LatLonPoint f25225c;

    /* renamed from: d */
    public String f25226d;

    /* renamed from: e */
    public String f25227e;

    /* renamed from: f */
    public boolean f25228f;

    /* renamed from: g */
    public boolean f25229g;

    /* renamed from: h */
    public float f25230h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RailwayStationItem() {
    }

    public String getAdcode() {
        return this.f25226d;
    }

    public String getID() {
        return this.f25223a;
    }

    public LatLonPoint getLocation() {
        return this.f25225c;
    }

    public String getName() {
        return this.f25224b;
    }

    public String getTime() {
        return this.f25227e;
    }

    public float getWait() {
        return this.f25230h;
    }

    public boolean isEnd() {
        return this.f25229g;
    }

    public boolean isStart() {
        return this.f25228f;
    }

    static {
        Covode.recordClassIndex(5791);
    }

    public void setAdcode(String str) {
        this.f25226d = str;
    }

    public void setID(String str) {
        this.f25223a = str;
    }

    public void setLocation(LatLonPoint latLonPoint) {
        this.f25225c = latLonPoint;
    }

    public void setName(String str) {
        this.f25224b = str;
    }

    public void setTime(String str) {
        this.f25227e = str;
    }

    public void setWait(float f) {
        this.f25230h = f;
    }

    public void setisEnd(boolean z) {
        this.f25229g = z;
    }

    public void setisStart(boolean z) {
        this.f25228f = z;
    }

    public RailwayStationItem(Parcel parcel) {
        this.f25223a = parcel.readString();
        this.f25224b = parcel.readString();
        this.f25225c = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f25226d = parcel.readString();
        this.f25227e = parcel.readString();
        boolean[] zArr = new boolean[2];
        parcel.readBooleanArray(zArr);
        this.f25228f = zArr[0];
        this.f25229g = zArr[1];
        this.f25230h = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25223a);
        parcel.writeString(this.f25224b);
        parcel.writeParcelable(this.f25225c, i);
        parcel.writeString(this.f25226d);
        parcel.writeString(this.f25227e);
        parcel.writeBooleanArray(new boolean[]{this.f25228f, this.f25229g});
        parcel.writeFloat(this.f25230h);
    }
}
