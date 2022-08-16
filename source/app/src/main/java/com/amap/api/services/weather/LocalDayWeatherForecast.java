package com.amap.api.services.weather;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class LocalDayWeatherForecast implements Parcelable {
    public static final Parcelable.Creator<LocalDayWeatherForecast> CREATOR = new Parcelable.Creator<LocalDayWeatherForecast>() { // from class: com.amap.api.services.weather.LocalDayWeatherForecast.1
        static {
            Covode.recordClassIndex(5879);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final LocalDayWeatherForecast[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final LocalDayWeatherForecast createFromParcel(Parcel parcel) {
            return new LocalDayWeatherForecast(parcel);
        }
    };

    /* renamed from: a */
    public String f25410a;

    /* renamed from: b */
    public String f25411b;

    /* renamed from: c */
    public String f25412c;

    /* renamed from: d */
    public String f25413d;

    /* renamed from: e */
    public String f25414e;

    /* renamed from: f */
    public String f25415f;

    /* renamed from: g */
    public String f25416g;

    /* renamed from: h */
    public String f25417h;

    /* renamed from: i */
    public String f25418i;

    /* renamed from: j */
    public String f25419j;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LocalDayWeatherForecast() {
    }

    public String getDate() {
        return this.f25410a;
    }

    public String getDayTemp() {
        return this.f25414e;
    }

    public String getDayWeather() {
        return this.f25412c;
    }

    public String getDayWindDirection() {
        return this.f25416g;
    }

    public String getDayWindPower() {
        return this.f25418i;
    }

    public String getNightTemp() {
        return this.f25415f;
    }

    public String getNightWeather() {
        return this.f25413d;
    }

    public String getNightWindDirection() {
        return this.f25417h;
    }

    public String getNightWindPower() {
        return this.f25419j;
    }

    public String getWeek() {
        return this.f25411b;
    }

    static {
        Covode.recordClassIndex(5878);
    }

    public void setDate(String str) {
        this.f25410a = str;
    }

    public void setDayTemp(String str) {
        this.f25414e = str;
    }

    public void setDayWeather(String str) {
        this.f25412c = str;
    }

    public void setDayWindDirection(String str) {
        this.f25416g = str;
    }

    public void setDayWindPower(String str) {
        this.f25418i = str;
    }

    public void setNightTemp(String str) {
        this.f25415f = str;
    }

    public void setNightWeather(String str) {
        this.f25413d = str;
    }

    public void setNightWindDirection(String str) {
        this.f25417h = str;
    }

    public void setNightWindPower(String str) {
        this.f25419j = str;
    }

    public void setWeek(String str) {
        this.f25411b = str;
    }

    public LocalDayWeatherForecast(Parcel parcel) {
        this.f25410a = parcel.readString();
        this.f25411b = parcel.readString();
        this.f25412c = parcel.readString();
        this.f25413d = parcel.readString();
        this.f25414e = parcel.readString();
        this.f25415f = parcel.readString();
        this.f25416g = parcel.readString();
        this.f25417h = parcel.readString();
        this.f25418i = parcel.readString();
        this.f25419j = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25410a);
        parcel.writeString(this.f25411b);
        parcel.writeString(this.f25412c);
        parcel.writeString(this.f25413d);
        parcel.writeString(this.f25414e);
        parcel.writeString(this.f25415f);
        parcel.writeString(this.f25416g);
        parcel.writeString(this.f25417h);
        parcel.writeString(this.f25418i);
        parcel.writeString(this.f25419j);
    }
}
