package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class TMC implements Parcelable {
    public static final Parcelable.Creator<TMC> CREATOR = new Parcelable.Creator<TMC>() { // from class: com.amap.api.services.route.TMC.1
        static {
            Covode.recordClassIndex(5832);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final TMC[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final TMC createFromParcel(Parcel parcel) {
            return new TMC(parcel);
        }
    };

    /* renamed from: a */
    public int f25308a;

    /* renamed from: b */
    public String f25309b;

    /* renamed from: c */
    public List<LatLonPoint> f25310c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDistance() {
        return this.f25308a;
    }

    public List<LatLonPoint> getPolyline() {
        return this.f25310c;
    }

    public String getStatus() {
        return this.f25309b;
    }

    static {
        Covode.recordClassIndex(5831);
    }

    public TMC() {
        this.f25310c = new ArrayList();
    }

    public void setDistance(int i) {
        this.f25308a = i;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.f25310c = list;
    }

    public void setStatus(String str) {
        this.f25309b = str;
    }

    public TMC(Parcel parcel) {
        this.f25310c = new ArrayList();
        this.f25308a = parcel.readInt();
        this.f25309b = parcel.readString();
        this.f25310c = parcel.createTypedArrayList(LatLonPoint.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f25308a);
        parcel.writeString(this.f25309b);
        parcel.writeTypedList(this.f25310c);
    }
}
