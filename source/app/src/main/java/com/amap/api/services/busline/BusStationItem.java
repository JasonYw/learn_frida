package com.amap.api.services.busline;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p002O.C0002O;

/* loaded from: classes19.dex */
public class BusStationItem implements Parcelable {
    public static final Parcelable.Creator<BusStationItem> CREATOR = new Parcelable.Creator<BusStationItem>() { // from class: com.amap.api.services.busline.BusStationItem.1
        static {
            Covode.recordClassIndex(5657);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final BusStationItem[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final BusStationItem createFromParcel(Parcel parcel) {
            return new BusStationItem(parcel);
        }
    };

    /* renamed from: a */
    public String f24899a;

    /* renamed from: b */
    public String f24900b;

    /* renamed from: c */
    public LatLonPoint f24901c;

    /* renamed from: d */
    public String f24902d;

    /* renamed from: e */
    public String f24903e;

    /* renamed from: f */
    public List<BusLineItem> f24904f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdCode() {
        return this.f24903e;
    }

    public List<BusLineItem> getBusLineItems() {
        return this.f24904f;
    }

    public String getBusStationId() {
        return this.f24899a;
    }

    public String getBusStationName() {
        return this.f24900b;
    }

    public String getCityCode() {
        return this.f24902d;
    }

    public LatLonPoint getLatLonPoint() {
        return this.f24901c;
    }

    static {
        Covode.recordClassIndex(5656);
    }

    public BusStationItem() {
        this.f24904f = new ArrayList();
    }

    public int hashCode() {
        int hashCode;
        String str = this.f24899a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode + 31;
    }

    public String toString() {
        return C0002O.m25080C("BusStationName: ", this.f24900b, " LatLonPoint: ", this.f24901c.toString(), " BusLines: ", m16246a(this.f24904f), " CityCode: ", this.f24902d, " AdCode: ", this.f24903e);
    }

    public void setAdCode(String str) {
        this.f24903e = str;
    }

    public void setBusLineItems(List<BusLineItem> list) {
        this.f24904f = list;
    }

    public void setBusStationId(String str) {
        this.f24899a = str;
    }

    public void setBusStationName(String str) {
        this.f24900b = str;
    }

    public void setCityCode(String str) {
        this.f24902d = str;
    }

    public void setLatLonPoint(LatLonPoint latLonPoint) {
        this.f24901c = latLonPoint;
    }

    public BusStationItem(Parcel parcel) {
        this.f24904f = new ArrayList();
        this.f24900b = parcel.readString();
        this.f24899a = parcel.readString();
        this.f24901c = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.f24902d = parcel.readString();
        this.f24903e = parcel.readString();
        this.f24904f = parcel.readArrayList(BusLineItem.class.getClassLoader());
    }

    /* renamed from: a */
    private String m16246a(List<BusLineItem> list) {
        StringBuffer stringBuffer = new StringBuffer();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                stringBuffer.append(list.get(i).getBusLineName());
                if (i < list.size() - 1) {
                    stringBuffer.append("|");
                }
            }
        }
        return stringBuffer.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BusStationItem busStationItem = (BusStationItem) obj;
        String str = this.f24899a;
        if (str == null) {
            if (busStationItem.f24899a != null) {
                return false;
            }
        } else if (!str.equals(busStationItem.f24899a)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f24900b);
        parcel.writeString(this.f24899a);
        parcel.writeValue(this.f24901c);
        parcel.writeString(this.f24902d);
        parcel.writeString(this.f24903e);
        parcel.writeList(this.f24904f);
    }
}
