package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class IndoorData implements Parcelable {
    public static final Parcelable.Creator<IndoorData> CREATOR = new Parcelable.Creator<IndoorData>() { // from class: com.amap.api.services.poisearch.IndoorData.1
        static {
            Covode.recordClassIndex(5739);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final IndoorData[] newArray(int i) {
            return new IndoorData[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final IndoorData createFromParcel(Parcel parcel) {
            return new IndoorData(parcel);
        }
    };

    /* renamed from: a */
    public String f25102a;

    /* renamed from: b */
    public int f25103b;

    /* renamed from: c */
    public String f25104c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getFloor() {
        return this.f25103b;
    }

    public String getFloorName() {
        return this.f25104c;
    }

    public String getPoiId() {
        return this.f25102a;
    }

    static {
        Covode.recordClassIndex(5738);
    }

    public void setFloor(int i) {
        this.f25103b = i;
    }

    public void setFloorName(String str) {
        this.f25104c = str;
    }

    public void setPoiId(String str) {
        this.f25102a = str;
    }

    public IndoorData(Parcel parcel) {
        this.f25102a = parcel.readString();
        this.f25103b = parcel.readInt();
        this.f25104c = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25102a);
        parcel.writeInt(this.f25103b);
        parcel.writeString(this.f25104c);
    }

    public IndoorData(String str, int i, String str2) {
        this.f25102a = str;
        this.f25103b = i;
        this.f25104c = str2;
    }
}
