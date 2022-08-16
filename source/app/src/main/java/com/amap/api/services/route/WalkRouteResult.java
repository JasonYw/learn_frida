package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.route.RouteSearch;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class WalkRouteResult extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<WalkRouteResult> CREATOR = new Parcelable.Creator<WalkRouteResult>() { // from class: com.amap.api.services.route.WalkRouteResult.1
        static {
            Covode.recordClassIndex(5848);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final WalkRouteResult[] newArray(int i) {
            return new WalkRouteResult[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final WalkRouteResult createFromParcel(Parcel parcel) {
            return new WalkRouteResult(parcel);
        }
    };

    /* renamed from: a */
    public List<WalkPath> f25350a;

    /* renamed from: b */
    public RouteSearch.WalkRouteQuery f25351b;

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<WalkPath> getPaths() {
        return this.f25350a;
    }

    public RouteSearch.WalkRouteQuery getWalkQuery() {
        return this.f25351b;
    }

    static {
        Covode.recordClassIndex(5847);
    }

    public WalkRouteResult() {
        this.f25350a = new ArrayList();
    }

    public void setPaths(List<WalkPath> list) {
        this.f25350a = list;
    }

    public void setWalkQuery(RouteSearch.WalkRouteQuery walkRouteQuery) {
        this.f25351b = walkRouteQuery;
    }

    public WalkRouteResult(Parcel parcel) {
        super(parcel);
        this.f25350a = new ArrayList();
        this.f25350a = parcel.createTypedArrayList(WalkPath.CREATOR);
        this.f25351b = (RouteSearch.WalkRouteQuery) parcel.readParcelable(RouteSearch.WalkRouteQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f25350a);
        parcel.writeParcelable(this.f25351b, i);
    }
}
