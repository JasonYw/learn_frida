package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public final class Photo implements Parcelable {
    public static final Parcelable.Creator<Photo> CREATOR = new Parcelable.Creator<Photo>() { // from class: com.amap.api.services.poisearch.Photo.1
        static {
            Covode.recordClassIndex(5741);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final Photo[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final Photo createFromParcel(Parcel parcel) {
            return new Photo(parcel);
        }
    };

    /* renamed from: a */
    public String f25105a;

    /* renamed from: b */
    public String f25106b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public Photo() {
    }

    public final String getTitle() {
        return this.f25105a;
    }

    public final String getUrl() {
        return this.f25106b;
    }

    static {
        Covode.recordClassIndex(5740);
    }

    public final void setTitle(String str) {
        this.f25105a = str;
    }

    public final void setUrl(String str) {
        this.f25106b = str;
    }

    public Photo(Parcel parcel) {
        this.f25105a = parcel.readString();
        this.f25106b = parcel.readString();
    }

    public Photo(String str, String str2) {
        this.f25105a = str;
        this.f25106b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25105a);
        parcel.writeString(this.f25106b);
    }
}
