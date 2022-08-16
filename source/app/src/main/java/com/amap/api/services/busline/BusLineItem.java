package com.amap.api.services.busline;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.p126a.C2007j;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import p002O.C0002O;

/* loaded from: classes19.dex */
public class BusLineItem implements Parcelable {
    public static final Parcelable.Creator<BusLineItem> CREATOR = new Parcelable.Creator<BusLineItem>() { // from class: com.amap.api.services.busline.BusLineItem.1
        static {
            Covode.recordClassIndex(5650);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final BusLineItem[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final BusLineItem createFromParcel(Parcel parcel) {
            return new BusLineItem(parcel);
        }
    };

    /* renamed from: a */
    public float f24872a;

    /* renamed from: b */
    public String f24873b;

    /* renamed from: c */
    public String f24874c;

    /* renamed from: d */
    public String f24875d;

    /* renamed from: e */
    public List<LatLonPoint> f24876e;

    /* renamed from: f */
    public List<LatLonPoint> f24877f;

    /* renamed from: g */
    public String f24878g;

    /* renamed from: h */
    public String f24879h;

    /* renamed from: i */
    public String f24880i;

    /* renamed from: j */
    public Date f24881j;

    /* renamed from: k */
    public Date f24882k;

    /* renamed from: l */
    public String f24883l;

    /* renamed from: m */
    public float f24884m;

    /* renamed from: n */
    public float f24885n;

    /* renamed from: o */
    public List<BusStationItem> f24886o;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getBasicPrice() {
        return this.f24884m;
    }

    public List<LatLonPoint> getBounds() {
        return this.f24877f;
    }

    public String getBusCompany() {
        return this.f24883l;
    }

    public String getBusLineId() {
        return this.f24878g;
    }

    public String getBusLineName() {
        return this.f24873b;
    }

    public String getBusLineType() {
        return this.f24874c;
    }

    public List<BusStationItem> getBusStations() {
        return this.f24886o;
    }

    public String getCityCode() {
        return this.f24875d;
    }

    public List<LatLonPoint> getDirectionsCoordinates() {
        return this.f24876e;
    }

    public float getDistance() {
        return this.f24872a;
    }

    public String getOriginatingStation() {
        return this.f24879h;
    }

    public String getTerminalStation() {
        return this.f24880i;
    }

    public float getTotalPrice() {
        return this.f24885n;
    }

    static {
        Covode.recordClassIndex(5649);
    }

    public Date getFirstBusTime() {
        Date date = this.f24881j;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public Date getLastBusTime() {
        Date date = this.f24882k;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public int hashCode() {
        int hashCode;
        String str = this.f24878g;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode + 31;
    }

    public BusLineItem() {
        this.f24876e = new ArrayList();
        this.f24877f = new ArrayList();
        this.f24886o = new ArrayList();
    }

    public String toString() {
        new StringBuilder();
        return C0002O.m25083C(this.f24873b, " ", C2007j.m16370a(this.f24881j), Constants.ACCEPT_TIME_SEPARATOR_SERVER, C2007j.m16370a(this.f24882k));
    }

    public void setBasicPrice(float f) {
        this.f24884m = f;
    }

    public void setBounds(List<LatLonPoint> list) {
        this.f24877f = list;
    }

    public void setBusCompany(String str) {
        this.f24883l = str;
    }

    public void setBusLineId(String str) {
        this.f24878g = str;
    }

    public void setBusLineName(String str) {
        this.f24873b = str;
    }

    public void setBusLineType(String str) {
        this.f24874c = str;
    }

    public void setBusStations(List<BusStationItem> list) {
        this.f24886o = list;
    }

    public void setCityCode(String str) {
        this.f24875d = str;
    }

    public void setDirectionsCoordinates(List<LatLonPoint> list) {
        this.f24876e = list;
    }

    public void setDistance(float f) {
        this.f24872a = f;
    }

    public void setOriginatingStation(String str) {
        this.f24879h = str;
    }

    public void setTerminalStation(String str) {
        this.f24880i = str;
    }

    public void setTotalPrice(float f) {
        this.f24885n = f;
    }

    public void setFirstBusTime(Date date) {
        if (date == null) {
            this.f24881j = null;
        } else {
            this.f24881j = (Date) date.clone();
        }
    }

    public void setLastBusTime(Date date) {
        if (date == null) {
            this.f24882k = null;
        } else {
            this.f24882k = (Date) date.clone();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BusLineItem busLineItem = (BusLineItem) obj;
        String str = this.f24878g;
        if (str == null) {
            if (busLineItem.f24878g != null) {
                return false;
            }
        } else if (!str.equals(busLineItem.f24878g)) {
            return false;
        }
        return true;
    }

    public BusLineItem(Parcel parcel) {
        this.f24876e = new ArrayList();
        this.f24877f = new ArrayList();
        this.f24886o = new ArrayList();
        this.f24872a = parcel.readFloat();
        this.f24873b = parcel.readString();
        this.f24874c = parcel.readString();
        this.f24875d = parcel.readString();
        this.f24876e = parcel.readArrayList(LatLonPoint.class.getClassLoader());
        this.f24877f = parcel.readArrayList(LatLonPoint.class.getClassLoader());
        this.f24878g = parcel.readString();
        this.f24879h = parcel.readString();
        this.f24880i = parcel.readString();
        this.f24881j = C2007j.m16365d(parcel.readString());
        this.f24882k = C2007j.m16365d(parcel.readString());
        this.f24883l = parcel.readString();
        this.f24884m = parcel.readFloat();
        this.f24885n = parcel.readFloat();
        this.f24886o = parcel.readArrayList(BusStationItem.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f24872a);
        parcel.writeString(this.f24873b);
        parcel.writeString(this.f24874c);
        parcel.writeString(this.f24875d);
        parcel.writeList(this.f24876e);
        parcel.writeList(this.f24877f);
        parcel.writeString(this.f24878g);
        parcel.writeString(this.f24879h);
        parcel.writeString(this.f24880i);
        parcel.writeString(C2007j.m16370a(this.f24881j));
        parcel.writeString(C2007j.m16370a(this.f24882k));
        parcel.writeString(this.f24883l);
        parcel.writeFloat(this.f24884m);
        parcel.writeFloat(this.f24885n);
        parcel.writeList(this.f24886o);
    }
}
