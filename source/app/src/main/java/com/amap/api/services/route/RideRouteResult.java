package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.route.RouteSearch;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class RideRouteResult extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<RideRouteResult> CREATOR = new Parcelable.Creator<RideRouteResult>() { // from class: com.amap.api.services.route.RideRouteResult.1
        static {
            Covode.recordClassIndex(5796);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RideRouteResult[] newArray(int i) {
            return new RideRouteResult[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RideRouteResult createFromParcel(Parcel parcel) {
            return new RideRouteResult(parcel);
        }
    };

    /* renamed from: a */
    public List<RidePath> f25232a;

    /* renamed from: b */
    public RouteSearch.RideRouteQuery f25233b;

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<RidePath> getPaths() {
        return this.f25232a;
    }

    public RouteSearch.RideRouteQuery getRideQuery() {
        return this.f25233b;
    }

    static {
        Covode.recordClassIndex(5795);
    }

    public RideRouteResult() {
        this.f25232a = new ArrayList();
    }

    public void setPaths(List<RidePath> list) {
        this.f25232a = list;
    }

    public void setRideQuery(RouteSearch.RideRouteQuery rideRouteQuery) {
        this.f25233b = rideRouteQuery;
    }

    public RideRouteResult(Parcel parcel) {
        super(parcel);
        this.f25232a = new ArrayList();
        this.f25232a = parcel.createTypedArrayList(RidePath.CREATOR);
        this.f25233b = (RouteSearch.RideRouteQuery) parcel.readParcelable(RouteSearch.RideRouteQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f25232a);
        parcel.writeParcelable(this.f25233b, i);
    }
}
