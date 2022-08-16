package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.route.RouteSearch;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class DriveRouteResult extends RouteResult implements Parcelable {
    public static final Parcelable.Creator<DriveRouteResult> CREATOR = new Parcelable.Creator<DriveRouteResult>() { // from class: com.amap.api.services.route.DriveRouteResult.1
        static {
            Covode.recordClassIndex(5782);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final DriveRouteResult[] newArray(int i) {
            return new DriveRouteResult[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final DriveRouteResult createFromParcel(Parcel parcel) {
            return new DriveRouteResult(parcel);
        }
    };

    /* renamed from: a */
    public float f25201a;

    /* renamed from: b */
    public List<DrivePath> f25202b;

    /* renamed from: c */
    public RouteSearch.DriveRouteQuery f25203c;

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RouteSearch.DriveRouteQuery getDriveQuery() {
        return this.f25203c;
    }

    public List<DrivePath> getPaths() {
        return this.f25202b;
    }

    public float getTaxiCost() {
        return this.f25201a;
    }

    static {
        Covode.recordClassIndex(5781);
    }

    public DriveRouteResult() {
        this.f25202b = new ArrayList();
    }

    public void setDriveQuery(RouteSearch.DriveRouteQuery driveRouteQuery) {
        this.f25203c = driveRouteQuery;
    }

    public void setPaths(List<DrivePath> list) {
        this.f25202b = list;
    }

    public void setTaxiCost(float f) {
        this.f25201a = f;
    }

    public DriveRouteResult(Parcel parcel) {
        super(parcel);
        this.f25202b = new ArrayList();
        this.f25201a = parcel.readFloat();
        this.f25202b = parcel.createTypedArrayList(DrivePath.CREATOR);
        this.f25203c = (RouteSearch.DriveRouteQuery) parcel.readParcelable(RouteSearch.DriveRouteQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RouteResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f25201a);
        parcel.writeTypedList(this.f25202b);
        parcel.writeParcelable(this.f25203c, i);
    }
}
