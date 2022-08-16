package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.route.DistanceSearch;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes19.dex */
public class DistanceResult implements Parcelable {
    public static final Parcelable.Creator<DistanceResult> CREATOR = new Parcelable.Creator<DistanceResult>() { // from class: com.amap.api.services.route.DistanceResult.1
        static {
            Covode.recordClassIndex(5764);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final DistanceResult[] newArray(int i) {
            return new DistanceResult[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final DistanceResult createFromParcel(Parcel parcel) {
            return new DistanceResult(parcel);
        }
    };

    /* renamed from: a */
    public DistanceSearch.DistanceQuery f25174a;

    /* renamed from: b */
    public List<DistanceItem> f25175b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DistanceResult() {
    }

    public DistanceSearch.DistanceQuery getDistanceQuery() {
        return this.f25174a;
    }

    public List<DistanceItem> getDistanceResults() {
        return this.f25175b;
    }

    static {
        Covode.recordClassIndex(5763);
    }

    public void setDistanceQuery(DistanceSearch.DistanceQuery distanceQuery) {
        this.f25174a = distanceQuery;
    }

    public void setDistanceResults(List<DistanceItem> list) {
        this.f25175b = list;
    }

    public DistanceResult(Parcel parcel) {
        this.f25175b = parcel.createTypedArrayList(DistanceItem.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f25175b);
    }
}
