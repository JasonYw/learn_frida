package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class SearchCity implements Parcelable {
    public static final Parcelable.Creator<SearchCity> CREATOR = new Parcelable.Creator<SearchCity>() { // from class: com.amap.api.services.route.SearchCity.1
        static {
            Covode.recordClassIndex(5830);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final SearchCity[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final SearchCity createFromParcel(Parcel parcel) {
            return new SearchCity(parcel);
        }
    };

    /* renamed from: a */
    public String f25305a;

    /* renamed from: b */
    public String f25306b;

    /* renamed from: c */
    public String f25307c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SearchCity() {
    }

    public String getSearchCityAdCode() {
        return this.f25307c;
    }

    public String getSearchCityName() {
        return this.f25305a;
    }

    public String getSearchCitycode() {
        return this.f25306b;
    }

    static {
        Covode.recordClassIndex(5829);
    }

    public void setSearchCityName(String str) {
        this.f25305a = str;
    }

    public void setSearchCitycode(String str) {
        this.f25306b = str;
    }

    public void setSearchCityhAdCode(String str) {
        this.f25307c = str;
    }

    public SearchCity(Parcel parcel) {
        this.f25305a = parcel.readString();
        this.f25306b = parcel.readString();
        this.f25307c = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25305a);
        parcel.writeString(this.f25306b);
        parcel.writeString(this.f25307c);
    }
}
