package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class BusStep implements Parcelable {
    public static final Parcelable.Creator<BusStep> CREATOR = new Parcelable.Creator<BusStep>() { // from class: com.amap.api.services.route.BusStep.1
        static {
            Covode.recordClassIndex(5760);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final BusStep[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final BusStep createFromParcel(Parcel parcel) {
            return new BusStep(parcel);
        }
    };

    /* renamed from: a */
    public RouteBusWalkItem f25162a;

    /* renamed from: b */
    public List<RouteBusLineItem> f25163b;

    /* renamed from: c */
    public Doorway f25164c;

    /* renamed from: d */
    public Doorway f25165d;

    /* renamed from: e */
    public RouteRailwayItem f25166e;

    /* renamed from: f */
    public TaxiItem f25167f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<RouteBusLineItem> getBusLines() {
        return this.f25163b;
    }

    public Doorway getEntrance() {
        return this.f25164c;
    }

    public Doorway getExit() {
        return this.f25165d;
    }

    public RouteRailwayItem getRailway() {
        return this.f25166e;
    }

    public TaxiItem getTaxi() {
        return this.f25167f;
    }

    public RouteBusWalkItem getWalk() {
        return this.f25162a;
    }

    static {
        Covode.recordClassIndex(5759);
    }

    public BusStep() {
        this.f25163b = new ArrayList();
    }

    public RouteBusLineItem getBusLine() {
        List<RouteBusLineItem> list = this.f25163b;
        if (list != null && list.size() != 0) {
            return this.f25163b.get(0);
        }
        return null;
    }

    public void setBusLines(List<RouteBusLineItem> list) {
        this.f25163b = list;
    }

    public void setEntrance(Doorway doorway) {
        this.f25164c = doorway;
    }

    public void setExit(Doorway doorway) {
        this.f25165d = doorway;
    }

    public void setRailway(RouteRailwayItem routeRailwayItem) {
        this.f25166e = routeRailwayItem;
    }

    public void setTaxi(TaxiItem taxiItem) {
        this.f25167f = taxiItem;
    }

    public void setWalk(RouteBusWalkItem routeBusWalkItem) {
        this.f25162a = routeBusWalkItem;
    }

    public void setBusLine(RouteBusLineItem routeBusLineItem) {
        List<RouteBusLineItem> list = this.f25163b;
        if (list == null) {
            return;
        }
        if (list.size() == 0) {
            this.f25163b.add(routeBusLineItem);
        }
        this.f25163b.set(0, routeBusLineItem);
    }

    public BusStep(Parcel parcel) {
        this.f25163b = new ArrayList();
        this.f25162a = (RouteBusWalkItem) parcel.readParcelable(RouteBusWalkItem.class.getClassLoader());
        this.f25163b = parcel.createTypedArrayList(RouteBusLineItem.CREATOR);
        this.f25164c = (Doorway) parcel.readParcelable(Doorway.class.getClassLoader());
        this.f25165d = (Doorway) parcel.readParcelable(Doorway.class.getClassLoader());
        this.f25166e = (RouteRailwayItem) parcel.readParcelable(RouteRailwayItem.class.getClassLoader());
        this.f25167f = (TaxiItem) parcel.readParcelable(TaxiItem.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f25162a, i);
        parcel.writeTypedList(this.f25163b);
        parcel.writeParcelable(this.f25164c, i);
        parcel.writeParcelable(this.f25165d, i);
        parcel.writeParcelable(this.f25166e, i);
        parcel.writeParcelable(this.f25167f, i);
    }
}
