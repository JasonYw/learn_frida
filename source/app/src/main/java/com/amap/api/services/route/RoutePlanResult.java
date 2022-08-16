package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class RoutePlanResult implements Parcelable {
    public static final Parcelable.Creator<RoutePlanResult> CREATOR = new Parcelable.Creator<RoutePlanResult>() { // from class: com.amap.api.services.route.RoutePlanResult.1
        static {
            Covode.recordClassIndex(5804);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RoutePlanResult[] newArray(int i) {
            return new RoutePlanResult[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RoutePlanResult createFromParcel(Parcel parcel) {
            return new RoutePlanResult(parcel);
        }
    };

    /* renamed from: a */
    public LatLonPoint f25250a;

    /* renamed from: b */
    public LatLonPoint f25251b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RoutePlanResult() {
    }

    public LatLonPoint getStartPos() {
        return this.f25250a;
    }

    public LatLonPoint getTargetPos() {
        return this.f25251b;
    }

    static {
        Covode.recordClassIndex(5803);
    }

    public void setStartPos(LatLonPoint latLonPoint) {
        this.f25250a = latLonPoint;
    }

    public void setTargetPos(LatLonPoint latLonPoint) {
        this.f25251b = latLonPoint;
    }

    public RoutePlanResult(Parcel parcel) {
        this.f25250a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f25251b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f25250a, i);
        parcel.writeParcelable(this.f25251b, i);
    }
}
