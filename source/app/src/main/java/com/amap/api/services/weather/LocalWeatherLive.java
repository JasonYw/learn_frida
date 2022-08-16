package com.amap.api.services.weather;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class LocalWeatherLive implements Parcelable {
    public static final Parcelable.Creator<LocalWeatherLive> CREATOR = new Parcelable.Creator<LocalWeatherLive>() { // from class: com.amap.api.services.weather.LocalWeatherLive.1
        static {
            Covode.recordClassIndex(5884);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final LocalWeatherLive[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final LocalWeatherLive createFromParcel(Parcel parcel) {
            return new LocalWeatherLive(parcel);
        }
    };

    /* renamed from: a */
    public String f25427a;

    /* renamed from: b */
    public String f25428b;

    /* renamed from: c */
    public String f25429c;

    /* renamed from: d */
    public String f25430d;

    /* renamed from: e */
    public String f25431e;

    /* renamed from: f */
    public String f25432f;

    /* renamed from: g */
    public String f25433g;

    /* renamed from: h */
    public String f25434h;

    /* renamed from: i */
    public String f25435i;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LocalWeatherLive() {
    }

    public String getAdCode() {
        return this.f25429c;
    }

    public String getCity() {
        return this.f25428b;
    }

    public String getHumidity() {
        return this.f25434h;
    }

    public String getProvince() {
        return this.f25427a;
    }

    public String getReportTime() {
        return this.f25435i;
    }

    public String getTemperature() {
        return this.f25431e;
    }

    public String getWeather() {
        return this.f25430d;
    }

    public String getWindDirection() {
        return this.f25432f;
    }

    public String getWindPower() {
        return this.f25433g;
    }

    static {
        Covode.recordClassIndex(5883);
    }

    public void setAdCode(String str) {
        this.f25429c = str;
    }

    public void setCity(String str) {
        this.f25428b = str;
    }

    public void setHumidity(String str) {
        this.f25434h = str;
    }

    public void setProvince(String str) {
        this.f25427a = str;
    }

    public void setReportTime(String str) {
        this.f25435i = str;
    }

    public void setTemperature(String str) {
        this.f25431e = str;
    }

    public void setWeather(String str) {
        this.f25430d = str;
    }

    public void setWindDirection(String str) {
        this.f25432f = str;
    }

    public void setWindPower(String str) {
        this.f25433g = str;
    }

    public LocalWeatherLive(Parcel parcel) {
        this.f25427a = parcel.readString();
        this.f25428b = parcel.readString();
        this.f25429c = parcel.readString();
        this.f25430d = parcel.readString();
        this.f25431e = parcel.readString();
        this.f25432f = parcel.readString();
        this.f25433g = parcel.readString();
        this.f25434h = parcel.readString();
        this.f25435i = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25427a);
        parcel.writeString(this.f25428b);
        parcel.writeString(this.f25429c);
        parcel.writeString(this.f25430d);
        parcel.writeString(this.f25431e);
        parcel.writeString(this.f25432f);
        parcel.writeString(this.f25433g);
        parcel.writeString(this.f25434h);
        parcel.writeString(this.f25435i);
    }
}
