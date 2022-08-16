package com.amap.api.services.traffic;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.p126a.C2007j;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class CircleTrafficQuery extends AbstractC2114a implements Parcelable, Cloneable {
    public static final Parcelable.Creator<CircleTrafficQuery> CREATOR = new Parcelable.Creator<CircleTrafficQuery>() { // from class: com.amap.api.services.traffic.CircleTrafficQuery.1
        static {
            Covode.recordClassIndex(5866);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final CircleTrafficQuery[] newArray(int i) {
            return new CircleTrafficQuery[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final CircleTrafficQuery createFromParcel(Parcel parcel) {
            return new CircleTrafficQuery(parcel);
        }
    };

    /* renamed from: b */
    public LatLonPoint f25388b;

    /* renamed from: c */
    public int f25389c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getCenterPoint() {
        return this.f25388b;
    }

    public int getRadius() {
        return this.f25389c;
    }

    @Override // com.amap.api.services.traffic.AbstractC2114a
    public /* bridge */ /* synthetic */ int getLevel() {
        return super.getLevel();
    }

    static {
        Covode.recordClassIndex(5865);
    }

    /* renamed from: clone */
    public CircleTrafficQuery m25298clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            C2007j.m16371a(e, "CircleTrafficQuery", "CircleTrafficQueryClone");
        }
        return new CircleTrafficQuery(this.f25388b, this.f25389c, this.f25409a);
    }

    public void setCenterPoint(LatLonPoint latLonPoint) {
        this.f25388b = latLonPoint;
    }

    @Override // com.amap.api.services.traffic.AbstractC2114a
    public /* bridge */ /* synthetic */ void setLevel(int i) {
        super.setLevel(i);
    }

    public void setRadius(int i) {
        this.f25389c = i;
    }

    public CircleTrafficQuery(Parcel parcel) {
        this.f25389c = 1000;
        this.f25388b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f25389c = parcel.readInt();
        this.f25409a = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f25388b, i);
        parcel.writeInt(this.f25389c);
        parcel.writeInt(this.f25409a);
    }

    public CircleTrafficQuery(LatLonPoint latLonPoint, int i, int i2) {
        this.f25389c = 1000;
        this.f25388b = latLonPoint;
        this.f25389c = i;
        this.f25409a = i2;
    }
}
