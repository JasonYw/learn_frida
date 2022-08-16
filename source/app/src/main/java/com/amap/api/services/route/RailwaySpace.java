package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class RailwaySpace implements Parcelable {
    public static final Parcelable.Creator<RailwaySpace> CREATOR = new Parcelable.Creator<RailwaySpace>() { // from class: com.amap.api.services.route.RailwaySpace.1
        static {
            Covode.recordClassIndex(5790);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RailwaySpace[] newArray(int i) {
            return new RailwaySpace[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RailwaySpace createFromParcel(Parcel parcel) {
            return new RailwaySpace(parcel);
        }
    };

    /* renamed from: a */
    public String f25221a;

    /* renamed from: b */
    public float f25222b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCode() {
        return this.f25221a;
    }

    public float getCost() {
        return this.f25222b;
    }

    static {
        Covode.recordClassIndex(5789);
    }

    public RailwaySpace(Parcel parcel) {
        this.f25221a = parcel.readString();
        this.f25222b = parcel.readFloat();
    }

    public RailwaySpace(String str, float f) {
        this.f25221a = str;
        this.f25222b = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25221a);
        parcel.writeFloat(this.f25222b);
    }
}
