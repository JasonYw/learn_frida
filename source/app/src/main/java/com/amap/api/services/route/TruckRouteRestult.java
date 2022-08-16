package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.route.RouteSearch;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes19.dex */
public class TruckRouteRestult implements Parcelable {
    public static final Parcelable.Creator<TruckRouteRestult> CREATOR = new Parcelable.Creator<TruckRouteRestult>() { // from class: com.amap.api.services.route.TruckRouteRestult.1
        static {
            Covode.recordClassIndex(5842);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final TruckRouteRestult[] newArray(int i) {
            return new TruckRouteRestult[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final TruckRouteRestult createFromParcel(Parcel parcel) {
            return new TruckRouteRestult(parcel);
        }
    };

    /* renamed from: a */
    public RouteSearch.TruckRouteQuery f25332a;

    /* renamed from: b */
    public List<TruckPath> f25333b;

    /* renamed from: c */
    public LatLonPoint f25334c;

    /* renamed from: d */
    public LatLonPoint f25335d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TruckRouteRestult() {
    }

    public List<TruckPath> getPaths() {
        return this.f25333b;
    }

    public LatLonPoint getStartPos() {
        return this.f25334c;
    }

    public LatLonPoint getTargetPos() {
        return this.f25335d;
    }

    public RouteSearch.TruckRouteQuery getTruckQuery() {
        return this.f25332a;
    }

    static {
        Covode.recordClassIndex(5841);
    }

    public void setPaths(List<TruckPath> list) {
        this.f25333b = list;
    }

    public void setStartPos(LatLonPoint latLonPoint) {
        this.f25334c = latLonPoint;
    }

    public void setTargetPos(LatLonPoint latLonPoint) {
        this.f25335d = latLonPoint;
    }

    public void setTruckQuery(RouteSearch.TruckRouteQuery truckRouteQuery) {
        this.f25332a = truckRouteQuery;
    }

    public TruckRouteRestult(Parcel parcel) {
        this.f25333b = parcel.createTypedArrayList(TruckPath.CREATOR);
        this.f25334c = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f25335d = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f25333b);
        parcel.writeParcelable(this.f25334c, i);
        parcel.writeParcelable(this.f25335d, i);
    }
}
