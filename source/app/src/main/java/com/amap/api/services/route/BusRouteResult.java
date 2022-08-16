package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.route.RouteSearch;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class BusRouteResult extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<BusRouteResult> CREATOR = new Parcelable.Creator<BusRouteResult>() { // from class: com.amap.api.services.route.BusRouteResult.1
        static {
            Covode.recordClassIndex(5758);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final BusRouteResult[] newArray(int i) {
            return new BusRouteResult[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final BusRouteResult createFromParcel(Parcel parcel) {
            return new BusRouteResult(parcel);
        }
    };

    /* renamed from: a */
    public float f25159a;

    /* renamed from: b */
    public List<BusPath> f25160b;

    /* renamed from: c */
    public RouteSearch.BusRouteQuery f25161c;

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RouteSearch.BusRouteQuery getBusQuery() {
        return this.f25161c;
    }

    public List<BusPath> getPaths() {
        return this.f25160b;
    }

    public float getTaxiCost() {
        return this.f25159a;
    }

    static {
        Covode.recordClassIndex(5757);
    }

    public BusRouteResult() {
        this.f25160b = new ArrayList();
    }

    public void setBusQuery(RouteSearch.BusRouteQuery busRouteQuery) {
        this.f25161c = busRouteQuery;
    }

    public void setPaths(List<BusPath> list) {
        this.f25160b = list;
    }

    public void setTaxiCost(float f) {
        this.f25159a = f;
    }

    public BusRouteResult(Parcel parcel) {
        super(parcel);
        this.f25160b = new ArrayList();
        this.f25159a = parcel.readFloat();
        this.f25160b = parcel.createTypedArrayList(BusPath.CREATOR);
        this.f25161c = (RouteSearch.BusRouteQuery) parcel.readParcelable(RouteSearch.BusRouteQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f25159a);
        parcel.writeTypedList(this.f25160b);
        parcel.writeParcelable(this.f25161c, i);
    }
}
