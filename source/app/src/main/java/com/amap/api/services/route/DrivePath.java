package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class DrivePath extends Path implements Parcelable {
    public static final Parcelable.Creator<DrivePath> CREATOR = new Parcelable.Creator<DrivePath>() { // from class: com.amap.api.services.route.DrivePath.1
        static {
            Covode.recordClassIndex(5774);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final DrivePath[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final DrivePath createFromParcel(Parcel parcel) {
            return new DrivePath(parcel);
        }
    };

    /* renamed from: a */
    public String f25184a;

    /* renamed from: b */
    public float f25185b;

    /* renamed from: c */
    public float f25186c;

    /* renamed from: d */
    public int f25187d;

    /* renamed from: e */
    public List<DriveStep> f25188e;

    /* renamed from: f */
    public int f25189f;

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getRestriction() {
        return this.f25189f;
    }

    public List<DriveStep> getSteps() {
        return this.f25188e;
    }

    public String getStrategy() {
        return this.f25184a;
    }

    public float getTollDistance() {
        return this.f25186c;
    }

    public float getTolls() {
        return this.f25185b;
    }

    public int getTotalTrafficlights() {
        return this.f25187d;
    }

    static {
        Covode.recordClassIndex(5773);
    }

    public DrivePath() {
        this.f25188e = new ArrayList();
    }

    public void setRestriction(int i) {
        this.f25189f = i;
    }

    public void setSteps(List<DriveStep> list) {
        this.f25188e = list;
    }

    public void setStrategy(String str) {
        this.f25184a = str;
    }

    public void setTollDistance(float f) {
        this.f25186c = f;
    }

    public void setTolls(float f) {
        this.f25185b = f;
    }

    public void setTotalTrafficlights(int i) {
        this.f25187d = i;
    }

    public DrivePath(Parcel parcel) {
        super(parcel);
        this.f25188e = new ArrayList();
        this.f25184a = parcel.readString();
        this.f25185b = parcel.readFloat();
        this.f25186c = parcel.readFloat();
        this.f25188e = parcel.createTypedArrayList(DriveStep.CREATOR);
        this.f25187d = parcel.readInt();
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f25184a);
        parcel.writeFloat(this.f25185b);
        parcel.writeFloat(this.f25186c);
        parcel.writeTypedList(this.f25188e);
        parcel.writeInt(this.f25187d);
    }
}
