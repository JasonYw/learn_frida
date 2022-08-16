package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class District implements Parcelable {
    public static final Parcelable.Creator<District> CREATOR = new Parcelable.Creator<District>() { // from class: com.amap.api.services.route.District.1
        static {
            Covode.recordClassIndex(5770);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final District[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final District createFromParcel(Parcel parcel) {
            return new District(parcel);
        }
    };

    /* renamed from: a */
    public String f25180a;

    /* renamed from: b */
    public String f25181b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public District() {
    }

    public String getDistrictAdcode() {
        return this.f25181b;
    }

    public String getDistrictName() {
        return this.f25180a;
    }

    static {
        Covode.recordClassIndex(5769);
    }

    public void setDistrictAdcode(String str) {
        this.f25181b = str;
    }

    public void setDistrictName(String str) {
        this.f25180a = str;
    }

    public District(Parcel parcel) {
        this.f25180a = parcel.readString();
        this.f25181b = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25180a);
        parcel.writeString(this.f25181b);
    }
}
