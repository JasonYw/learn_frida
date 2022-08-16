package com.amap.api.services.weather;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class LocalWeatherForecast implements Parcelable {
    public static final Parcelable.Creator<LocalWeatherForecast> CREATOR = new Parcelable.Creator<LocalWeatherForecast>() { // from class: com.amap.api.services.weather.LocalWeatherForecast.1
        static {
            Covode.recordClassIndex(5881);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final LocalWeatherForecast[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final LocalWeatherForecast createFromParcel(Parcel parcel) {
            return new LocalWeatherForecast(parcel);
        }
    };

    /* renamed from: a */
    public String f25420a;

    /* renamed from: b */
    public String f25421b;

    /* renamed from: c */
    public String f25422c;

    /* renamed from: d */
    public String f25423d;

    /* renamed from: e */
    public List<LocalDayWeatherForecast> f25424e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdCode() {
        return this.f25422c;
    }

    public String getCity() {
        return this.f25421b;
    }

    public String getProvince() {
        return this.f25420a;
    }

    public String getReportTime() {
        return this.f25423d;
    }

    public List<LocalDayWeatherForecast> getWeatherForecast() {
        return this.f25424e;
    }

    static {
        Covode.recordClassIndex(5880);
    }

    public LocalWeatherForecast() {
        this.f25424e = new ArrayList();
    }

    public void setAdCode(String str) {
        this.f25422c = str;
    }

    public void setCity(String str) {
        this.f25421b = str;
    }

    public void setProvince(String str) {
        this.f25420a = str;
    }

    public void setReportTime(String str) {
        this.f25423d = str;
    }

    public void setWeatherForecast(List<LocalDayWeatherForecast> list) {
        this.f25424e = list;
    }

    public LocalWeatherForecast(Parcel parcel) {
        this.f25424e = new ArrayList();
        this.f25420a = parcel.readString();
        this.f25421b = parcel.readString();
        this.f25422c = parcel.readString();
        this.f25423d = parcel.readString();
        this.f25424e = parcel.readArrayList(LocalWeatherForecast.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25420a);
        parcel.writeString(this.f25421b);
        parcel.writeString(this.f25422c);
        parcel.writeString(this.f25423d);
        parcel.writeList(this.f25424e);
    }
}
