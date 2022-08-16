package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class DistanceItem implements Parcelable {
    public static final Parcelable.Creator<DistanceItem> CREATOR = new Parcelable.Creator<DistanceItem>() { // from class: com.amap.api.services.route.DistanceItem.1
        static {
            Covode.recordClassIndex(5762);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final DistanceItem[] newArray(int i) {
            return new DistanceItem[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final DistanceItem createFromParcel(Parcel parcel) {
            return new DistanceItem(parcel);
        }
    };
    public final int ERROR_CODE_NOT_IN_CHINA;
    public final int ERROR_CODE_NO_DRIVE;
    public final int ERROR_CODE_TOO_FAR;

    /* renamed from: a */
    public int f25168a;

    /* renamed from: b */
    public int f25169b;

    /* renamed from: c */
    public float f25170c;

    /* renamed from: d */
    public float f25171d;

    /* renamed from: e */
    public String f25172e;

    /* renamed from: f */
    public int f25173f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDestId() {
        return this.f25169b;
    }

    public float getDistance() {
        return this.f25170c;
    }

    public float getDuration() {
        return this.f25171d;
    }

    public int getErrorCode() {
        return this.f25173f;
    }

    public String getErrorInfo() {
        return this.f25172e;
    }

    public int getOriginId() {
        return this.f25168a;
    }

    static {
        Covode.recordClassIndex(5761);
    }

    public DistanceItem() {
        this.ERROR_CODE_NO_DRIVE = 1;
        this.ERROR_CODE_TOO_FAR = 2;
        this.ERROR_CODE_NOT_IN_CHINA = 3;
        this.f25168a = 1;
        this.f25169b = 1;
    }

    public void setDestId(int i) {
        this.f25169b = i;
    }

    public void setDistance(float f) {
        this.f25170c = f;
    }

    public void setDuration(float f) {
        this.f25171d = f;
    }

    public void setErrorCode(int i) {
        this.f25173f = i;
    }

    public void setErrorInfo(String str) {
        this.f25172e = str;
    }

    public void setOriginId(int i) {
        this.f25168a = i;
    }

    public DistanceItem(Parcel parcel) {
        this.ERROR_CODE_NO_DRIVE = 1;
        this.ERROR_CODE_TOO_FAR = 2;
        this.ERROR_CODE_NOT_IN_CHINA = 3;
        this.f25168a = 1;
        this.f25169b = 1;
        this.f25168a = parcel.readInt();
        this.f25169b = parcel.readInt();
        this.f25170c = parcel.readFloat();
        this.f25171d = parcel.readFloat();
        this.f25172e = parcel.readString();
        this.f25173f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f25168a);
        parcel.writeInt(this.f25169b);
        parcel.writeFloat(this.f25170c);
        parcel.writeFloat(this.f25171d);
        parcel.writeString(this.f25172e);
        parcel.writeInt(this.f25173f);
    }
}
