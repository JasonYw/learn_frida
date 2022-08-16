package com.amap.api.services.cloud;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* loaded from: classes11.dex */
public class CloudImage implements Parcelable {
    public static final Parcelable.Creator<CloudImage> CREATOR = new Parcelable.Creator<CloudImage>() { // from class: com.amap.api.services.cloud.CloudImage.1
        static {
            Covode.recordClassIndex(5663);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final CloudImage[] newArray(int i) {
            return new CloudImage[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final CloudImage createFromParcel(Parcel parcel) {
            return new CloudImage(parcel);
        }
    };

    /* renamed from: a */
    public String f24915a;

    /* renamed from: b */
    public String f24916b;

    /* renamed from: c */
    public String f24917c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getId() {
        return this.f24915a;
    }

    public String getPreurl() {
        return this.f24916b;
    }

    public String getUrl() {
        return this.f24917c;
    }

    static {
        Covode.recordClassIndex(5662);
    }

    public void setId(String str) {
        this.f24915a = str;
    }

    public void setPreurl(String str) {
        this.f24916b = str;
    }

    public void setUrl(String str) {
        this.f24917c = str;
    }

    public CloudImage(Parcel parcel) {
        this.f24915a = parcel.readString();
        this.f24916b = parcel.readString();
        this.f24917c = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f24915a);
        parcel.writeString(this.f24916b);
        parcel.writeString(this.f24917c);
    }

    public CloudImage(String str, String str2, String str3) {
        this.f24915a = str;
        this.f24916b = str2;
        this.f24917c = str3;
    }
}
