package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class DrivePlanPath implements Parcelable {
    public static final Parcelable.Creator<DrivePlanPath> CREATOR = new Parcelable.Creator<DrivePlanPath>() { // from class: com.amap.api.services.route.DrivePlanPath.1
        static {
            Covode.recordClassIndex(5776);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final DrivePlanPath[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final DrivePlanPath createFromParcel(Parcel parcel) {
            return new DrivePlanPath(parcel);
        }
    };

    /* renamed from: a */
    public float f25190a;

    /* renamed from: b */
    public int f25191b;

    /* renamed from: c */
    public List<DrivePlanStep> f25192c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getTrafficLights() {
        return this.f25191b;
    }

    public float getDistance() {
        return this.f25190a;
    }

    public List<DrivePlanStep> getSteps() {
        return this.f25192c;
    }

    static {
        Covode.recordClassIndex(5775);
    }

    public DrivePlanPath() {
        this.f25192c = new ArrayList();
    }

    public void setDistance(float f) {
        this.f25190a = f;
    }

    public void setSteps(List<DrivePlanStep> list) {
        this.f25192c = list;
    }

    public void setTrafficLights(int i) {
        this.f25191b = i;
    }

    public DrivePlanPath(Parcel parcel) {
        this.f25192c = new ArrayList();
        this.f25190a = parcel.readFloat();
        this.f25191b = parcel.readInt();
        this.f25192c = parcel.createTypedArrayList(DrivePlanStep.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f25190a);
        parcel.writeInt(this.f25191b);
        parcel.writeTypedList(this.f25192c);
    }
}
