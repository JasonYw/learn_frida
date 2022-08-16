package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class WalkStep implements Parcelable {
    public static final Parcelable.Creator<WalkStep> CREATOR = new Parcelable.Creator<WalkStep>() { // from class: com.amap.api.services.route.WalkStep.1
        static {
            Covode.recordClassIndex(5850);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final WalkStep[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final WalkStep createFromParcel(Parcel parcel) {
            return new WalkStep(parcel);
        }
    };

    /* renamed from: a */
    public String f25352a;

    /* renamed from: b */
    public String f25353b;

    /* renamed from: c */
    public String f25354c;

    /* renamed from: d */
    public float f25355d;

    /* renamed from: e */
    public float f25356e;

    /* renamed from: f */
    public List<LatLonPoint> f25357f;

    /* renamed from: g */
    public String f25358g;

    /* renamed from: h */
    public String f25359h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAction() {
        return this.f25358g;
    }

    public String getAssistantAction() {
        return this.f25359h;
    }

    public float getDistance() {
        return this.f25355d;
    }

    public float getDuration() {
        return this.f25356e;
    }

    public String getInstruction() {
        return this.f25352a;
    }

    public String getOrientation() {
        return this.f25353b;
    }

    public List<LatLonPoint> getPolyline() {
        return this.f25357f;
    }

    public String getRoad() {
        return this.f25354c;
    }

    static {
        Covode.recordClassIndex(5849);
    }

    public WalkStep() {
        this.f25357f = new ArrayList();
    }

    public void setAction(String str) {
        this.f25358g = str;
    }

    public void setAssistantAction(String str) {
        this.f25359h = str;
    }

    public void setDistance(float f) {
        this.f25355d = f;
    }

    public void setDuration(float f) {
        this.f25356e = f;
    }

    public void setInstruction(String str) {
        this.f25352a = str;
    }

    public void setOrientation(String str) {
        this.f25353b = str;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.f25357f = list;
    }

    public void setRoad(String str) {
        this.f25354c = str;
    }

    public WalkStep(Parcel parcel) {
        this.f25357f = new ArrayList();
        this.f25352a = parcel.readString();
        this.f25353b = parcel.readString();
        this.f25354c = parcel.readString();
        this.f25355d = parcel.readFloat();
        this.f25356e = parcel.readFloat();
        this.f25357f = parcel.createTypedArrayList(LatLonPoint.CREATOR);
        this.f25358g = parcel.readString();
        this.f25359h = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25352a);
        parcel.writeString(this.f25353b);
        parcel.writeString(this.f25354c);
        parcel.writeFloat(this.f25355d);
        parcel.writeFloat(this.f25356e);
        parcel.writeTypedList(this.f25357f);
        parcel.writeString(this.f25358g);
        parcel.writeString(this.f25359h);
    }
}
