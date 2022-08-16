package com.amap.api.services.road;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public final class Crossroad extends Road implements Parcelable {
    public static final Parcelable.Creator<Crossroad> CREATOR = new Parcelable.Creator<Crossroad>() { // from class: com.amap.api.services.road.Crossroad.1
        static {
            Covode.recordClassIndex(5752);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final Crossroad[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final Crossroad createFromParcel(Parcel parcel) {
            return new Crossroad(parcel);
        }
    };

    /* renamed from: a */
    public float f25142a;

    /* renamed from: b */
    public String f25143b;

    /* renamed from: c */
    public String f25144c;

    /* renamed from: d */
    public String f25145d;

    /* renamed from: e */
    public String f25146e;

    /* renamed from: f */
    public String f25147f;

    @Override // com.amap.api.services.road.Road, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public Crossroad() {
    }

    public final String getDirection() {
        return this.f25143b;
    }

    public final float getDistance() {
        return this.f25142a;
    }

    public final String getFirstRoadId() {
        return this.f25144c;
    }

    public final String getFirstRoadName() {
        return this.f25145d;
    }

    public final String getSecondRoadId() {
        return this.f25146e;
    }

    public final String getSecondRoadName() {
        return this.f25147f;
    }

    static {
        Covode.recordClassIndex(5751);
    }

    public final void setDirection(String str) {
        this.f25143b = str;
    }

    public final void setDistance(float f) {
        this.f25142a = f;
    }

    public final void setFirstRoadId(String str) {
        this.f25144c = str;
    }

    public final void setFirstRoadName(String str) {
        this.f25145d = str;
    }

    public final void setSecondRoadId(String str) {
        this.f25146e = str;
    }

    public final void setSecondRoadName(String str) {
        this.f25147f = str;
    }

    public Crossroad(Parcel parcel) {
        super(parcel);
        this.f25142a = parcel.readFloat();
        this.f25143b = parcel.readString();
        this.f25144c = parcel.readString();
        this.f25145d = parcel.readString();
        this.f25146e = parcel.readString();
        this.f25147f = parcel.readString();
    }

    @Override // com.amap.api.services.road.Road, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f25142a);
        parcel.writeString(this.f25143b);
        parcel.writeString(this.f25144c);
        parcel.writeString(this.f25145d);
        parcel.writeString(this.f25146e);
        parcel.writeString(this.f25147f);
    }
}
