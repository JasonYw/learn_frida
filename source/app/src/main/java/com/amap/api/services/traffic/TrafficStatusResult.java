package com.amap.api.services.traffic;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes19.dex */
public class TrafficStatusResult implements Parcelable {
    public static final Parcelable.Creator<TrafficStatusResult> CREATOR = new Parcelable.Creator<TrafficStatusResult>() { // from class: com.amap.api.services.traffic.TrafficStatusResult.1
        static {
            Covode.recordClassIndex(5876);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final TrafficStatusResult[] newArray(int i) {
            return new TrafficStatusResult[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final TrafficStatusResult createFromParcel(Parcel parcel) {
            return new TrafficStatusResult(parcel);
        }
    };

    /* renamed from: a */
    public String f25406a;

    /* renamed from: b */
    public TrafficStatusEvaluation f25407b;

    /* renamed from: c */
    public List<TrafficStatusInfo> f25408c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TrafficStatusResult() {
    }

    public String getDescription() {
        return this.f25406a;
    }

    public TrafficStatusEvaluation getEvaluation() {
        return this.f25407b;
    }

    public List<TrafficStatusInfo> getRoads() {
        return this.f25408c;
    }

    static {
        Covode.recordClassIndex(5875);
    }

    public void setDescription(String str) {
        this.f25406a = str;
    }

    public void setEvaluation(TrafficStatusEvaluation trafficStatusEvaluation) {
        this.f25407b = trafficStatusEvaluation;
    }

    public void setRoads(List<TrafficStatusInfo> list) {
        this.f25408c = list;
    }

    public TrafficStatusResult(Parcel parcel) {
        this.f25406a = parcel.readString();
        this.f25407b = (TrafficStatusEvaluation) parcel.readParcelable(TrafficStatusEvaluation.class.getClassLoader());
        this.f25408c = parcel.createTypedArrayList(TrafficStatusInfo.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25406a);
        parcel.writeParcelable(this.f25407b, i);
        parcel.writeTypedList(this.f25408c);
    }
}
