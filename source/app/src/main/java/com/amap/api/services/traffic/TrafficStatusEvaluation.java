package com.amap.api.services.traffic;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class TrafficStatusEvaluation implements Parcelable {
    public static final Parcelable.Creator<TrafficStatusEvaluation> CREATOR = new Parcelable.Creator<TrafficStatusEvaluation>() { // from class: com.amap.api.services.traffic.TrafficStatusEvaluation.1
        static {
            Covode.recordClassIndex(5872);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final TrafficStatusEvaluation[] newArray(int i) {
            return new TrafficStatusEvaluation[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final TrafficStatusEvaluation createFromParcel(Parcel parcel) {
            return new TrafficStatusEvaluation(parcel);
        }
    };

    /* renamed from: a */
    public String f25393a;

    /* renamed from: b */
    public String f25394b;

    /* renamed from: c */
    public String f25395c;

    /* renamed from: d */
    public String f25396d;

    /* renamed from: e */
    public String f25397e;

    /* renamed from: f */
    public String f25398f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TrafficStatusEvaluation() {
    }

    public String getBlocked() {
        return this.f25395c;
    }

    public String getCongested() {
        return this.f25394b;
    }

    public String getDescription() {
        return this.f25398f;
    }

    public String getExpedite() {
        return this.f25393a;
    }

    public String getStatus() {
        return this.f25397e;
    }

    public String getUnknown() {
        return this.f25396d;
    }

    static {
        Covode.recordClassIndex(5871);
    }

    public void setBlocked(String str) {
        this.f25395c = str;
    }

    public void setCongested(String str) {
        this.f25394b = str;
    }

    public void setDescription(String str) {
        this.f25398f = str;
    }

    public void setExpedite(String str) {
        this.f25393a = str;
    }

    public void setStatus(String str) {
        this.f25397e = str;
    }

    public void setUnknown(String str) {
        this.f25396d = str;
    }

    public TrafficStatusEvaluation(Parcel parcel) {
        this.f25393a = parcel.readString();
        this.f25394b = parcel.readString();
        this.f25395c = parcel.readString();
        this.f25396d = parcel.readString();
        this.f25397e = parcel.readString();
        this.f25398f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25393a);
        parcel.writeString(this.f25394b);
        parcel.writeString(this.f25395c);
        parcel.writeString(this.f25396d);
        parcel.writeString(this.f25397e);
        parcel.writeString(this.f25398f);
    }
}
