package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class BusPath extends Path implements Parcelable {
    public static final Parcelable.Creator<BusPath> CREATOR = new Parcelable.Creator<BusPath>() { // from class: com.amap.api.services.route.BusPath.1
        static {
            Covode.recordClassIndex(5756);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final BusPath[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final BusPath createFromParcel(Parcel parcel) {
            return new BusPath(parcel);
        }
    };

    /* renamed from: a */
    public float f25154a;

    /* renamed from: b */
    public boolean f25155b;

    /* renamed from: c */
    public float f25156c;

    /* renamed from: d */
    public float f25157d;

    /* renamed from: e */
    public List<BusStep> f25158e;

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getBusDistance() {
        return this.f25157d;
    }

    public float getCost() {
        return this.f25154a;
    }

    public List<BusStep> getSteps() {
        return this.f25158e;
    }

    public float getWalkDistance() {
        return this.f25156c;
    }

    public boolean isNightBus() {
        return this.f25155b;
    }

    static {
        Covode.recordClassIndex(5755);
    }

    public BusPath() {
        this.f25158e = new ArrayList();
    }

    public void setBusDistance(float f) {
        this.f25157d = f;
    }

    public void setCost(float f) {
        this.f25154a = f;
    }

    public void setNightBus(boolean z) {
        this.f25155b = z;
    }

    public void setSteps(List<BusStep> list) {
        this.f25158e = list;
    }

    public void setWalkDistance(float f) {
        this.f25156c = f;
    }

    public BusPath(Parcel parcel) {
        super(parcel);
        this.f25158e = new ArrayList();
        this.f25154a = parcel.readFloat();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.f25155b = zArr[0];
        this.f25156c = parcel.readFloat();
        this.f25157d = parcel.readFloat();
        this.f25158e = parcel.createTypedArrayList(BusStep.CREATOR);
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f25154a);
        parcel.writeBooleanArray(new boolean[]{this.f25155b});
        parcel.writeFloat(this.f25156c);
        parcel.writeFloat(this.f25157d);
        parcel.writeTypedList(this.f25158e);
    }
}
