package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class RouteRailwayItem extends Railway implements Parcelable {
    public static final Parcelable.Creator<RouteRailwayItem> CREATOR = new Parcelable.Creator<RouteRailwayItem>() { // from class: com.amap.api.services.route.RouteRailwayItem.1
        static {
            Covode.recordClassIndex(5806);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RouteRailwayItem[] newArray(int i) {
            return new RouteRailwayItem[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RouteRailwayItem createFromParcel(Parcel parcel) {
            return new RouteRailwayItem(parcel);
        }
    };

    /* renamed from: a */
    public String f25252a;

    /* renamed from: b */
    public String f25253b;

    /* renamed from: c */
    public float f25254c;

    /* renamed from: d */
    public String f25255d;

    /* renamed from: e */
    public RailwayStationItem f25256e;

    /* renamed from: f */
    public RailwayStationItem f25257f;

    /* renamed from: g */
    public List<RailwayStationItem> f25258g;

    /* renamed from: h */
    public List<Railway> f25259h;

    /* renamed from: i */
    public List<RailwaySpace> f25260i;

    @Override // com.amap.api.services.route.Railway, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<Railway> getAlters() {
        return this.f25259h;
    }

    public RailwayStationItem getArrivalstop() {
        return this.f25257f;
    }

    public RailwayStationItem getDeparturestop() {
        return this.f25256e;
    }

    public float getDistance() {
        return this.f25254c;
    }

    public List<RailwaySpace> getSpaces() {
        return this.f25260i;
    }

    public String getTime() {
        return this.f25252a;
    }

    public String getTrip() {
        return this.f25253b;
    }

    public String getType() {
        return this.f25255d;
    }

    public List<RailwayStationItem> getViastops() {
        return this.f25258g;
    }

    static {
        Covode.recordClassIndex(5805);
    }

    public RouteRailwayItem() {
        this.f25258g = new ArrayList();
        this.f25259h = new ArrayList();
        this.f25260i = new ArrayList();
    }

    public void setAlters(List<Railway> list) {
        this.f25259h = list;
    }

    public void setArrivalstop(RailwayStationItem railwayStationItem) {
        this.f25257f = railwayStationItem;
    }

    public void setDeparturestop(RailwayStationItem railwayStationItem) {
        this.f25256e = railwayStationItem;
    }

    public void setDistance(float f) {
        this.f25254c = f;
    }

    public void setSpaces(List<RailwaySpace> list) {
        this.f25260i = list;
    }

    public void setTime(String str) {
        this.f25252a = str;
    }

    public void setTrip(String str) {
        this.f25253b = str;
    }

    public void setType(String str) {
        this.f25255d = str;
    }

    public void setViastops(List<RailwayStationItem> list) {
        this.f25258g = list;
    }

    public RouteRailwayItem(Parcel parcel) {
        super(parcel);
        this.f25258g = new ArrayList();
        this.f25259h = new ArrayList();
        this.f25260i = new ArrayList();
        this.f25252a = parcel.readString();
        this.f25253b = parcel.readString();
        this.f25254c = parcel.readFloat();
        this.f25255d = parcel.readString();
        this.f25256e = (RailwayStationItem) parcel.readParcelable(RailwayStationItem.class.getClassLoader());
        this.f25257f = (RailwayStationItem) parcel.readParcelable(RailwayStationItem.class.getClassLoader());
        this.f25258g = parcel.createTypedArrayList(RailwayStationItem.CREATOR);
        this.f25259h = parcel.createTypedArrayList(Railway.CREATOR);
        this.f25260i = parcel.createTypedArrayList(RailwaySpace.CREATOR);
    }

    @Override // com.amap.api.services.route.Railway, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f25252a);
        parcel.writeString(this.f25253b);
        parcel.writeFloat(this.f25254c);
        parcel.writeString(this.f25255d);
        parcel.writeParcelable(this.f25256e, i);
        parcel.writeParcelable(this.f25257f, i);
        parcel.writeTypedList(this.f25258g);
        parcel.writeTypedList(this.f25259h);
        parcel.writeTypedList(this.f25260i);
    }
}
