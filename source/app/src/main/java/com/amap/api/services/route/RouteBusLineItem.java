package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.busline.BusLineItem;
import com.amap.api.services.busline.BusStationItem;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class RouteBusLineItem extends BusLineItem implements Parcelable {
    public static final Parcelable.Creator<RouteBusLineItem> CREATOR = new Parcelable.Creator<RouteBusLineItem>() { // from class: com.amap.api.services.route.RouteBusLineItem.1
        static {
            Covode.recordClassIndex(5800);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RouteBusLineItem[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RouteBusLineItem createFromParcel(Parcel parcel) {
            return new RouteBusLineItem(parcel);
        }
    };

    /* renamed from: a */
    public BusStationItem f25242a;

    /* renamed from: b */
    public BusStationItem f25243b;

    /* renamed from: c */
    public List<LatLonPoint> f25244c;

    /* renamed from: d */
    public int f25245d;

    /* renamed from: e */
    public List<BusStationItem> f25246e;

    /* renamed from: f */
    public float f25247f;

    @Override // com.amap.api.services.busline.BusLineItem, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BusStationItem getArrivalBusStation() {
        return this.f25243b;
    }

    public BusStationItem getDepartureBusStation() {
        return this.f25242a;
    }

    public float getDuration() {
        return this.f25247f;
    }

    public int getPassStationNum() {
        return this.f25245d;
    }

    public List<BusStationItem> getPassStations() {
        return this.f25246e;
    }

    public List<LatLonPoint> getPolyline() {
        return this.f25244c;
    }

    static {
        Covode.recordClassIndex(5799);
    }

    public RouteBusLineItem() {
        this.f25244c = new ArrayList();
        this.f25246e = new ArrayList();
    }

    @Override // com.amap.api.services.busline.BusLineItem
    public int hashCode() {
        int hashCode;
        int hashCode2 = super.hashCode() * 31;
        BusStationItem busStationItem = this.f25243b;
        int i = 0;
        if (busStationItem == null) {
            hashCode = 0;
        } else {
            hashCode = busStationItem.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        BusStationItem busStationItem2 = this.f25242a;
        if (busStationItem2 != null) {
            i = busStationItem2.hashCode();
        }
        return i2 + i;
    }

    public void setArrivalBusStation(BusStationItem busStationItem) {
        this.f25243b = busStationItem;
    }

    public void setDepartureBusStation(BusStationItem busStationItem) {
        this.f25242a = busStationItem;
    }

    public void setDuration(float f) {
        this.f25247f = f;
    }

    public void setPassStationNum(int i) {
        this.f25245d = i;
    }

    public void setPassStations(List<BusStationItem> list) {
        this.f25246e = list;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.f25244c = list;
    }

    @Override // com.amap.api.services.busline.BusLineItem
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        RouteBusLineItem routeBusLineItem = (RouteBusLineItem) obj;
        BusStationItem busStationItem = this.f25243b;
        if (busStationItem == null) {
            if (routeBusLineItem.f25243b != null) {
                return false;
            }
        } else if (!busStationItem.equals(routeBusLineItem.f25243b)) {
            return false;
        }
        BusStationItem busStationItem2 = this.f25242a;
        if (busStationItem2 == null) {
            if (routeBusLineItem.f25242a != null) {
                return false;
            }
        } else if (!busStationItem2.equals(routeBusLineItem.f25242a)) {
            return false;
        }
        return true;
    }

    public RouteBusLineItem(Parcel parcel) {
        super(parcel);
        this.f25244c = new ArrayList();
        this.f25246e = new ArrayList();
        this.f25242a = (BusStationItem) parcel.readParcelable(BusStationItem.class.getClassLoader());
        this.f25243b = (BusStationItem) parcel.readParcelable(BusStationItem.class.getClassLoader());
        this.f25244c = parcel.createTypedArrayList(LatLonPoint.CREATOR);
        this.f25245d = parcel.readInt();
        this.f25246e = parcel.createTypedArrayList(BusStationItem.CREATOR);
        this.f25247f = parcel.readFloat();
    }

    @Override // com.amap.api.services.busline.BusLineItem, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f25242a, i);
        parcel.writeParcelable(this.f25243b, i);
        parcel.writeTypedList(this.f25244c);
        parcel.writeInt(this.f25245d);
        parcel.writeTypedList(this.f25246e);
        parcel.writeFloat(this.f25247f);
    }
}
