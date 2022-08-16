package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class RidePath extends Path implements Parcelable {
    public static final Parcelable.Creator<RidePath> CREATOR = new Parcelable.Creator<RidePath>() { // from class: com.amap.api.services.route.RidePath.1
        static {
            Covode.recordClassIndex(5794);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RidePath[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RidePath createFromParcel(Parcel parcel) {
            return new RidePath(parcel);
        }
    };

    /* renamed from: a */
    public List<RideStep> f25231a;

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<RideStep> getSteps() {
        return this.f25231a;
    }

    static {
        Covode.recordClassIndex(5793);
    }

    public RidePath() {
        this.f25231a = new ArrayList();
    }

    public void setSteps(List<RideStep> list) {
        this.f25231a = list;
    }

    public RidePath(Parcel parcel) {
        super(parcel);
        this.f25231a = new ArrayList();
        this.f25231a = parcel.createTypedArrayList(RideStep.CREATOR);
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f25231a);
    }
}
