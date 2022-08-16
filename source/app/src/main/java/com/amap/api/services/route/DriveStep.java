package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class DriveStep implements Parcelable {
    public static final Parcelable.Creator<DriveStep> CREATOR = new Parcelable.Creator<DriveStep>() { // from class: com.amap.api.services.route.DriveStep.1
        static {
            Covode.recordClassIndex(5784);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final DriveStep[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final DriveStep createFromParcel(Parcel parcel) {
            return new DriveStep(parcel);
        }
    };

    /* renamed from: a */
    public String f25204a;

    /* renamed from: b */
    public String f25205b;

    /* renamed from: c */
    public String f25206c;

    /* renamed from: d */
    public float f25207d;

    /* renamed from: e */
    public float f25208e;

    /* renamed from: f */
    public float f25209f;

    /* renamed from: g */
    public String f25210g;

    /* renamed from: h */
    public float f25211h;

    /* renamed from: i */
    public List<LatLonPoint> f25212i;

    /* renamed from: j */
    public String f25213j;

    /* renamed from: k */
    public String f25214k;

    /* renamed from: l */
    public List<RouteSearchCity> f25215l;

    /* renamed from: m */
    public List<TMC> f25216m;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAction() {
        return this.f25213j;
    }

    public String getAssistantAction() {
        return this.f25214k;
    }

    public float getDistance() {
        return this.f25207d;
    }

    public float getDuration() {
        return this.f25211h;
    }

    public String getInstruction() {
        return this.f25204a;
    }

    public String getOrientation() {
        return this.f25205b;
    }

    public List<LatLonPoint> getPolyline() {
        return this.f25212i;
    }

    public String getRoad() {
        return this.f25206c;
    }

    public List<RouteSearchCity> getRouteSearchCityList() {
        return this.f25215l;
    }

    public List<TMC> getTMCs() {
        return this.f25216m;
    }

    public float getTollDistance() {
        return this.f25209f;
    }

    public String getTollRoad() {
        return this.f25210g;
    }

    public float getTolls() {
        return this.f25208e;
    }

    static {
        Covode.recordClassIndex(5783);
    }

    public DriveStep() {
        this.f25212i = new ArrayList();
        this.f25215l = new ArrayList();
        this.f25216m = new ArrayList();
    }

    public void setAction(String str) {
        this.f25213j = str;
    }

    public void setAssistantAction(String str) {
        this.f25214k = str;
    }

    public void setDistance(float f) {
        this.f25207d = f;
    }

    public void setDuration(float f) {
        this.f25211h = f;
    }

    public void setInstruction(String str) {
        this.f25204a = str;
    }

    public void setOrientation(String str) {
        this.f25205b = str;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.f25212i = list;
    }

    public void setRoad(String str) {
        this.f25206c = str;
    }

    public void setRouteSearchCityList(List<RouteSearchCity> list) {
        this.f25215l = list;
    }

    public void setTMCs(List<TMC> list) {
        this.f25216m = list;
    }

    public void setTollDistance(float f) {
        this.f25209f = f;
    }

    public void setTollRoad(String str) {
        this.f25210g = str;
    }

    public void setTolls(float f) {
        this.f25208e = f;
    }

    public DriveStep(Parcel parcel) {
        this.f25212i = new ArrayList();
        this.f25215l = new ArrayList();
        this.f25216m = new ArrayList();
        this.f25204a = parcel.readString();
        this.f25205b = parcel.readString();
        this.f25206c = parcel.readString();
        this.f25207d = parcel.readFloat();
        this.f25208e = parcel.readFloat();
        this.f25209f = parcel.readFloat();
        this.f25210g = parcel.readString();
        this.f25211h = parcel.readFloat();
        this.f25212i = parcel.createTypedArrayList(LatLonPoint.CREATOR);
        this.f25213j = parcel.readString();
        this.f25214k = parcel.readString();
        this.f25215l = parcel.createTypedArrayList(RouteSearchCity.CREATOR);
        this.f25216m = parcel.createTypedArrayList(TMC.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25204a);
        parcel.writeString(this.f25205b);
        parcel.writeString(this.f25206c);
        parcel.writeFloat(this.f25207d);
        parcel.writeFloat(this.f25208e);
        parcel.writeFloat(this.f25209f);
        parcel.writeString(this.f25210g);
        parcel.writeFloat(this.f25211h);
        parcel.writeTypedList(this.f25212i);
        parcel.writeString(this.f25213j);
        parcel.writeString(this.f25214k);
        parcel.writeTypedList(this.f25215l);
        parcel.writeTypedList(this.f25216m);
    }
}
