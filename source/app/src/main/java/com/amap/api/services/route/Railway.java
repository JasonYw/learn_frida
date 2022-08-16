package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class Railway implements Parcelable {
    public static final Parcelable.Creator<Railway> CREATOR = new Parcelable.Creator<Railway>() { // from class: com.amap.api.services.route.Railway.1
        static {
            Covode.recordClassIndex(5788);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final Railway[] newArray(int i) {
            return new Railway[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final Railway createFromParcel(Parcel parcel) {
            return new Railway(parcel);
        }
    };

    /* renamed from: a */
    public String f25219a;

    /* renamed from: b */
    public String f25220b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Railway() {
    }

    public String getID() {
        return this.f25219a;
    }

    public String getName() {
        return this.f25220b;
    }

    static {
        Covode.recordClassIndex(5787);
    }

    public void setID(String str) {
        this.f25219a = str;
    }

    public void setName(String str) {
        this.f25220b = str;
    }

    public Railway(Parcel parcel) {
        this.f25219a = parcel.readString();
        this.f25220b = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25219a);
        parcel.writeString(this.f25220b);
    }
}
