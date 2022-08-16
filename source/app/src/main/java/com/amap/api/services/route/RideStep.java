package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class RideStep implements Parcelable {
    public static final Parcelable.Creator<RideStep> CREATOR = new Parcelable.Creator<RideStep>() { // from class: com.amap.api.services.route.RideStep.1
        static {
            Covode.recordClassIndex(5798);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RideStep[] newArray(int i) {
            return new RideStep[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RideStep createFromParcel(Parcel parcel) {
            return new RideStep(parcel);
        }
    };

    /* renamed from: a */
    public String f25234a;

    /* renamed from: b */
    public String f25235b;

    /* renamed from: c */
    public String f25236c;

    /* renamed from: d */
    public float f25237d;

    /* renamed from: e */
    public float f25238e;

    /* renamed from: f */
    public List<LatLonPoint> f25239f;

    /* renamed from: g */
    public String f25240g;

    /* renamed from: h */
    public String f25241h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAction() {
        return this.f25240g;
    }

    public String getAssistantAction() {
        return this.f25241h;
    }

    public float getDistance() {
        return this.f25237d;
    }

    public float getDuration() {
        return this.f25238e;
    }

    public String getInstruction() {
        return this.f25234a;
    }

    public String getOrientation() {
        return this.f25235b;
    }

    public List<LatLonPoint> getPolyline() {
        return this.f25239f;
    }

    public String getRoad() {
        return this.f25236c;
    }

    static {
        Covode.recordClassIndex(5797);
    }

    public RideStep() {
        this.f25239f = new ArrayList();
    }

    public void setAction(String str) {
        this.f25240g = str;
    }

    public void setAssistantAction(String str) {
        this.f25241h = str;
    }

    public void setDistance(float f) {
        this.f25237d = f;
    }

    public void setDuration(float f) {
        this.f25238e = f;
    }

    public void setInstruction(String str) {
        this.f25234a = str;
    }

    public void setOrientation(String str) {
        this.f25235b = str;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.f25239f = list;
    }

    public void setRoad(String str) {
        this.f25236c = str;
    }

    public RideStep(Parcel parcel) {
        this.f25239f = new ArrayList();
        this.f25234a = parcel.readString();
        this.f25235b = parcel.readString();
        this.f25236c = parcel.readString();
        this.f25237d = parcel.readFloat();
        this.f25238e = parcel.readFloat();
        this.f25239f = parcel.createTypedArrayList(LatLonPoint.CREATOR);
        this.f25240g = parcel.readString();
        this.f25241h = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25234a);
        parcel.writeString(this.f25235b);
        parcel.writeString(this.f25236c);
        parcel.writeFloat(this.f25237d);
        parcel.writeFloat(this.f25238e);
        parcel.writeTypedList(this.f25239f);
        parcel.writeString(this.f25240g);
        parcel.writeString(this.f25241h);
    }
}
