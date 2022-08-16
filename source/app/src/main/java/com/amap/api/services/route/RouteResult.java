package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class RouteResult implements Parcelable {
    public static final Parcelable.Creator<RouteResult> CREATOR = new Parcelable.Creator<RouteResult>() { // from class: com.amap.api.services.route.RouteResult.1
        static {
            Covode.recordClassIndex(5808);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RouteResult[] newArray(int i) {
            return new RouteResult[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RouteResult createFromParcel(Parcel parcel) {
            return new RouteResult(parcel);
        }
    };

    /* renamed from: a */
    public LatLonPoint f25261a;

    /* renamed from: b */
    public LatLonPoint f25262b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RouteResult() {
    }

    public LatLonPoint getStartPos() {
        return this.f25261a;
    }

    public LatLonPoint getTargetPos() {
        return this.f25262b;
    }

    static {
        Covode.recordClassIndex(5807);
    }

    public void setStartPos(LatLonPoint latLonPoint) {
        this.f25261a = latLonPoint;
    }

    public void setTargetPos(LatLonPoint latLonPoint) {
        this.f25262b = latLonPoint;
    }

    public RouteResult(Parcel parcel) {
        this.f25261a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f25262b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f25261a, i);
        parcel.writeParcelable(this.f25262b, i);
    }
}
