package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes19.dex */
public class TruckStep implements Parcelable {
    public static final Parcelable.Creator<TruckStep> CREATOR = new Parcelable.Creator<TruckStep>() { // from class: com.amap.api.services.route.TruckStep.1
        static {
            Covode.recordClassIndex(5844);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final TruckStep[] newArray(int i) {
            return new TruckStep[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final TruckStep createFromParcel(Parcel parcel) {
            return new TruckStep(parcel);
        }
    };

    /* renamed from: a */
    public String f25336a;

    /* renamed from: b */
    public String f25337b;

    /* renamed from: c */
    public String f25338c;

    /* renamed from: d */
    public float f25339d;

    /* renamed from: e */
    public float f25340e;

    /* renamed from: f */
    public float f25341f;

    /* renamed from: g */
    public String f25342g;

    /* renamed from: h */
    public float f25343h;

    /* renamed from: i */
    public List<LatLonPoint> f25344i;

    /* renamed from: j */
    public String f25345j;

    /* renamed from: k */
    public String f25346k;

    /* renamed from: l */
    public List<RouteSearchCity> f25347l;

    /* renamed from: m */
    public List<TMC> f25348m;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TruckStep() {
    }

    public String getAction() {
        return this.f25345j;
    }

    public String getAssistantAction() {
        return this.f25346k;
    }

    public float getDistance() {
        return this.f25340e;
    }

    public float getDuration() {
        return this.f25343h;
    }

    public String getInstruction() {
        return this.f25336a;
    }

    public String getOrientation() {
        return this.f25337b;
    }

    public List<LatLonPoint> getPolyline() {
        return this.f25344i;
    }

    public String getRoad() {
        return this.f25338c;
    }

    public List<RouteSearchCity> getRouteSearchCityList() {
        return this.f25347l;
    }

    public List<TMC> getTMCs() {
        return this.f25348m;
    }

    public float getTollDistance() {
        return this.f25341f;
    }

    public String getTollRoad() {
        return this.f25342g;
    }

    public float getTolls() {
        return this.f25339d;
    }

    static {
        Covode.recordClassIndex(5843);
    }

    public void setAction(String str) {
        this.f25345j = str;
    }

    public void setAssistantAction(String str) {
        this.f25346k = str;
    }

    public void setDistance(float f) {
        this.f25340e = f;
    }

    public void setDuration(float f) {
        this.f25343h = f;
    }

    public void setInstruction(String str) {
        this.f25336a = str;
    }

    public void setOrientation(String str) {
        this.f25337b = str;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.f25344i = list;
    }

    public void setRoad(String str) {
        this.f25338c = str;
    }

    public void setRouteSearchCityList(List<RouteSearchCity> list) {
        this.f25347l = list;
    }

    public void setTMCs(List<TMC> list) {
        this.f25348m = list;
    }

    public void setTollDistance(float f) {
        this.f25341f = f;
    }

    public void setTollRoad(String str) {
        this.f25342g = str;
    }

    public void setTolls(float f) {
        this.f25339d = f;
    }

    public TruckStep(Parcel parcel) {
        this.f25336a = parcel.readString();
        this.f25337b = parcel.readString();
        this.f25338c = parcel.readString();
        this.f25339d = parcel.readFloat();
        this.f25340e = parcel.readFloat();
        this.f25341f = parcel.readFloat();
        this.f25342g = parcel.readString();
        this.f25343h = parcel.readFloat();
        this.f25344i = parcel.createTypedArrayList(LatLonPoint.CREATOR);
        this.f25345j = parcel.readString();
        this.f25346k = parcel.readString();
        this.f25347l = parcel.createTypedArrayList(RouteSearchCity.CREATOR);
        this.f25348m = parcel.createTypedArrayList(TMC.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25336a);
        parcel.writeString(this.f25337b);
        parcel.writeString(this.f25338c);
        parcel.writeFloat(this.f25339d);
        parcel.writeFloat(this.f25340e);
        parcel.writeFloat(this.f25341f);
        parcel.writeString(this.f25342g);
        parcel.writeFloat(this.f25343h);
        parcel.writeTypedList(this.f25344i);
        parcel.writeString(this.f25345j);
        parcel.writeString(this.f25346k);
        parcel.writeTypedList(this.f25347l);
        parcel.writeTypedList(this.f25348m);
    }
}
