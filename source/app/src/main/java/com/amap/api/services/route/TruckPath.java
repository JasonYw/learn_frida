package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes19.dex */
public class TruckPath implements Parcelable {
    public static final Parcelable.Creator<TruckPath> CREATOR = new Parcelable.Creator<TruckPath>() { // from class: com.amap.api.services.route.TruckPath.1
        static {
            Covode.recordClassIndex(5840);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final TruckPath[] newArray(int i) {
            return new TruckPath[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final TruckPath createFromParcel(Parcel parcel) {
            return new TruckPath(parcel);
        }
    };

    /* renamed from: a */
    public float f25324a;

    /* renamed from: b */
    public long f25325b;

    /* renamed from: c */
    public String f25326c;

    /* renamed from: d */
    public float f25327d;

    /* renamed from: e */
    public float f25328e;

    /* renamed from: f */
    public int f25329f;

    /* renamed from: g */
    public int f25330g;

    /* renamed from: h */
    public List<TruckStep> f25331h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TruckPath() {
    }

    public float getDistance() {
        return this.f25324a;
    }

    public long getDuration() {
        return this.f25325b;
    }

    public int getRestriction() {
        return this.f25330g;
    }

    public List<TruckStep> getSteps() {
        return this.f25331h;
    }

    public String getStrategy() {
        return this.f25326c;
    }

    public float getTollDistance() {
        return this.f25328e;
    }

    public float getTolls() {
        return this.f25327d;
    }

    public int getTotalTrafficlights() {
        return this.f25329f;
    }

    static {
        Covode.recordClassIndex(5839);
    }

    public void setDistance(float f) {
        this.f25324a = f;
    }

    public void setDuration(long j) {
        this.f25325b = j;
    }

    public void setRestriction(int i) {
        this.f25330g = i;
    }

    public void setSteps(List<TruckStep> list) {
        this.f25331h = list;
    }

    public void setStrategy(String str) {
        this.f25326c = str;
    }

    public void setTollDistance(float f) {
        this.f25328e = f;
    }

    public void setTolls(float f) {
        this.f25327d = f;
    }

    public void setTotalTrafficlights(int i) {
        this.f25329f = i;
    }

    public TruckPath(Parcel parcel) {
        this.f25324a = parcel.readFloat();
        this.f25325b = parcel.readLong();
        this.f25326c = parcel.readString();
        this.f25327d = parcel.readFloat();
        this.f25328e = parcel.readFloat();
        this.f25329f = parcel.readInt();
        this.f25330g = parcel.readInt();
        this.f25331h = parcel.createTypedArrayList(TruckStep.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f25324a);
        parcel.writeLong(this.f25325b);
        parcel.writeString(this.f25326c);
        parcel.writeFloat(this.f25327d);
        parcel.writeFloat(this.f25328e);
        parcel.writeInt(this.f25329f);
        parcel.writeInt(this.f25330g);
        parcel.writeTypedList(this.f25331h);
    }
}
