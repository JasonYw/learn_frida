package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class DrivePlanStep implements Parcelable {
    public static final Parcelable.Creator<DrivePlanStep> CREATOR = new Parcelable.Creator<DrivePlanStep>() { // from class: com.amap.api.services.route.DrivePlanStep.1
        static {
            Covode.recordClassIndex(5778);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final DrivePlanStep[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final DrivePlanStep createFromParcel(Parcel parcel) {
            return new DrivePlanStep(parcel);
        }
    };

    /* renamed from: a */
    public String f25193a;

    /* renamed from: b */
    public String f25194b;

    /* renamed from: c */
    public float f25195c;

    /* renamed from: d */
    public boolean f25196d;

    /* renamed from: e */
    public List<LatLonPoint> f25197e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdCode() {
        return this.f25194b;
    }

    public float getDistance() {
        return this.f25195c;
    }

    public List<LatLonPoint> getPolyline() {
        return this.f25197e;
    }

    public String getRoad() {
        return this.f25193a;
    }

    public boolean getToll() {
        return this.f25196d;
    }

    static {
        Covode.recordClassIndex(5777);
    }

    public DrivePlanStep() {
        this.f25197e = new ArrayList();
    }

    public void setAdCode(String str) {
        this.f25194b = str;
    }

    public void setDistance(float f) {
        this.f25195c = f;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.f25197e = list;
    }

    public void setRoad(String str) {
        this.f25193a = str;
    }

    public void setToll(boolean z) {
        this.f25196d = z;
    }

    public DrivePlanStep(Parcel parcel) {
        this.f25197e = new ArrayList();
        this.f25193a = parcel.readString();
        this.f25194b = parcel.readString();
        this.f25195c = parcel.readFloat();
        this.f25196d = parcel.readInt() != 1 ? false : true;
        this.f25195c = parcel.readFloat();
        this.f25197e = parcel.createTypedArrayList(LatLonPoint.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25193a);
        parcel.writeString(this.f25194b);
        parcel.writeFloat(this.f25195c);
        parcel.writeInt(this.f25196d ? 1 : 0);
        parcel.writeFloat(this.f25195c);
        parcel.writeTypedList(this.f25197e);
    }
}
