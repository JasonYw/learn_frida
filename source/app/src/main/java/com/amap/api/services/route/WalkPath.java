package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class WalkPath extends Path implements Parcelable {
    public static final Parcelable.Creator<WalkPath> CREATOR = new Parcelable.Creator<WalkPath>() { // from class: com.amap.api.services.route.WalkPath.1
        static {
            Covode.recordClassIndex(5846);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final WalkPath[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final WalkPath createFromParcel(Parcel parcel) {
            return new WalkPath(parcel);
        }
    };

    /* renamed from: a */
    public List<WalkStep> f25349a;

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<WalkStep> getSteps() {
        return this.f25349a;
    }

    static {
        Covode.recordClassIndex(5845);
    }

    public WalkPath() {
        this.f25349a = new ArrayList();
    }

    public void setSteps(List<WalkStep> list) {
        this.f25349a = list;
    }

    public WalkPath(Parcel parcel) {
        super(parcel);
        this.f25349a = new ArrayList();
        this.f25349a = parcel.createTypedArrayList(WalkStep.CREATOR);
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f25349a);
    }
}
