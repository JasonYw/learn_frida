package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class RouteBusWalkItem extends WalkPath implements Parcelable {
    public static final Parcelable.Creator<RouteBusWalkItem> CREATOR = new Parcelable.Creator<RouteBusWalkItem>() { // from class: com.amap.api.services.route.RouteBusWalkItem.1
        static {
            Covode.recordClassIndex(5802);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RouteBusWalkItem[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RouteBusWalkItem createFromParcel(Parcel parcel) {
            return new RouteBusWalkItem(parcel);
        }
    };

    /* renamed from: a */
    public LatLonPoint f25248a;

    /* renamed from: b */
    public LatLonPoint f25249b;

    @Override // com.amap.api.services.route.WalkPath, com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RouteBusWalkItem() {
    }

    public LatLonPoint getDestination() {
        return this.f25249b;
    }

    public LatLonPoint getOrigin() {
        return this.f25248a;
    }

    static {
        Covode.recordClassIndex(5801);
    }

    public void setDestination(LatLonPoint latLonPoint) {
        this.f25249b = latLonPoint;
    }

    public void setOrigin(LatLonPoint latLonPoint) {
        this.f25248a = latLonPoint;
    }

    public RouteBusWalkItem(Parcel parcel) {
        super(parcel);
        this.f25248a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f25249b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.WalkPath, com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f25248a, i);
        parcel.writeParcelable(this.f25249b, i);
    }
}
