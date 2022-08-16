package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class RouteSearchCity extends SearchCity implements Parcelable {
    public static final Parcelable.Creator<RouteSearchCity> CREATOR = new Parcelable.Creator<RouteSearchCity>() { // from class: com.amap.api.services.route.RouteSearchCity.1
        static {
            Covode.recordClassIndex(5828);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RouteSearchCity[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RouteSearchCity createFromParcel(Parcel parcel) {
            return new RouteSearchCity(parcel);
        }
    };

    /* renamed from: a */
    public List<District> f25304a;

    @Override // com.amap.api.services.route.SearchCity, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<District> getDistricts() {
        return this.f25304a;
    }

    static {
        Covode.recordClassIndex(5827);
    }

    public RouteSearchCity() {
        this.f25304a = new ArrayList();
    }

    public void setDistricts(List<District> list) {
        this.f25304a = list;
    }

    public RouteSearchCity(Parcel parcel) {
        super(parcel);
        this.f25304a = new ArrayList();
        this.f25304a = parcel.createTypedArrayList(District.CREATOR);
    }

    @Override // com.amap.api.services.route.SearchCity, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f25304a);
    }
}
