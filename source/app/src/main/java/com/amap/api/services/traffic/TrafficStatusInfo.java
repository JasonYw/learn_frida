package com.amap.api.services.traffic;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes19.dex */
public class TrafficStatusInfo implements Parcelable {
    public static final Parcelable.Creator<TrafficStatusInfo> CREATOR = new Parcelable.Creator<TrafficStatusInfo>() { // from class: com.amap.api.services.traffic.TrafficStatusInfo.1
        static {
            Covode.recordClassIndex(5874);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final TrafficStatusInfo[] newArray(int i) {
            return new TrafficStatusInfo[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final TrafficStatusInfo createFromParcel(Parcel parcel) {
            return new TrafficStatusInfo(parcel);
        }
    };

    /* renamed from: a */
    public String f25399a;

    /* renamed from: b */
    public String f25400b;

    /* renamed from: c */
    public String f25401c;

    /* renamed from: d */
    public int f25402d;

    /* renamed from: e */
    public float f25403e;

    /* renamed from: f */
    public String f25404f;

    /* renamed from: g */
    public List<LatLonPoint> f25405g;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TrafficStatusInfo() {
    }

    public int getAngle() {
        return this.f25402d;
    }

    public List<LatLonPoint> getCoordinates() {
        return this.f25405g;
    }

    public String getDirection() {
        return this.f25401c;
    }

    public String getLcodes() {
        return this.f25404f;
    }

    public String getName() {
        return this.f25399a;
    }

    public float getSpeed() {
        return this.f25403e;
    }

    public String getStatus() {
        return this.f25400b;
    }

    static {
        Covode.recordClassIndex(5873);
    }

    public void setAngle(int i) {
        this.f25402d = i;
    }

    public void setCoordinates(List<LatLonPoint> list) {
        this.f25405g = list;
    }

    public void setDirection(String str) {
        this.f25401c = str;
    }

    public void setLcodes(String str) {
        this.f25404f = str;
    }

    public void setName(String str) {
        this.f25399a = str;
    }

    public void setSpeed(float f) {
        this.f25403e = f;
    }

    public void setStatus(String str) {
        this.f25400b = str;
    }

    public TrafficStatusInfo(Parcel parcel) {
        this.f25399a = parcel.readString();
        this.f25400b = parcel.readString();
        this.f25401c = parcel.readString();
        this.f25402d = parcel.readInt();
        this.f25403e = parcel.readFloat();
        this.f25404f = parcel.readString();
        this.f25405g = parcel.readArrayList(TrafficStatusInfo.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25399a);
        parcel.writeString(this.f25400b);
        parcel.writeString(this.f25401c);
        parcel.writeInt(this.f25402d);
        parcel.writeFloat(this.f25403e);
        parcel.writeString(this.f25404f);
        parcel.writeTypedList(this.f25405g);
    }
}
