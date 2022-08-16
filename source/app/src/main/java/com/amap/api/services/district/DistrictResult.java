package com.amap.api.services.district;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.AMapException;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* loaded from: classes19.dex */
public final class DistrictResult implements Parcelable {
    public Parcelable.Creator<DistrictResult> CREATOR;

    /* renamed from: a */
    public DistrictSearchQuery f25000a;

    /* renamed from: b */
    public ArrayList<DistrictItem> f25001b;

    /* renamed from: c */
    public int f25002c;

    /* renamed from: d */
    public AMapException f25003d;

    static {
        Covode.recordClassIndex(5686);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AMapException getAMapException() {
        return this.f25003d;
    }

    public final ArrayList<DistrictItem> getDistrict() {
        return this.f25001b;
    }

    public final int getPageCount() {
        return this.f25002c;
    }

    public final DistrictSearchQuery getQuery() {
        return this.f25000a;
    }

    public DistrictResult() {
        this.f25001b = new ArrayList<>();
        this.CREATOR = new Parcelable.Creator<DistrictResult>() { // from class: com.amap.api.services.district.DistrictResult.1
            static {
                Covode.recordClassIndex(5687);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public DistrictResult[] newArray(int i) {
                return new DistrictResult[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public DistrictResult createFromParcel(Parcel parcel) {
                return new DistrictResult(parcel);
            }
        };
    }

    public final int hashCode() {
        int hashCode;
        DistrictSearchQuery districtSearchQuery = this.f25000a;
        int i = 0;
        if (districtSearchQuery == null) {
            hashCode = 0;
        } else {
            hashCode = districtSearchQuery.hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        ArrayList<DistrictItem> arrayList = this.f25001b;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "DistrictResult [mDisQuery=" + this.f25000a + ", mDistricts=" + this.f25001b + "]";
    }

    public final void setAMapException(AMapException aMapException) {
        this.f25003d = aMapException;
    }

    public final void setDistrict(ArrayList<DistrictItem> arrayList) {
        this.f25001b = arrayList;
    }

    public final void setPageCount(int i) {
        this.f25002c = i;
    }

    public final void setQuery(DistrictSearchQuery districtSearchQuery) {
        this.f25000a = districtSearchQuery;
    }

    public DistrictResult(Parcel parcel) {
        this.f25001b = new ArrayList<>();
        this.CREATOR = new Parcelable.Creator<DistrictResult>() { // from class: com.amap.api.services.district.DistrictResult.1
            static {
                Covode.recordClassIndex(5687);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public DistrictResult[] newArray(int i) {
                return new DistrictResult[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public DistrictResult createFromParcel(Parcel parcel2) {
                return new DistrictResult(parcel2);
            }
        };
        this.f25000a = (DistrictSearchQuery) parcel.readParcelable(DistrictSearchQuery.class.getClassLoader());
        this.f25001b = parcel.createTypedArrayList(DistrictItem.CREATOR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DistrictResult districtResult = (DistrictResult) obj;
        DistrictSearchQuery districtSearchQuery = this.f25000a;
        if (districtSearchQuery == null) {
            if (districtResult.f25000a != null) {
                return false;
            }
        } else if (!districtSearchQuery.equals(districtResult.f25000a)) {
            return false;
        }
        ArrayList<DistrictItem> arrayList = this.f25001b;
        if (arrayList == null) {
            if (districtResult.f25001b != null) {
                return false;
            }
        } else if (!arrayList.equals(districtResult.f25001b)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f25000a, i);
        parcel.writeTypedList(this.f25001b);
    }

    public DistrictResult(DistrictSearchQuery districtSearchQuery, ArrayList<DistrictItem> arrayList) {
        this.f25001b = new ArrayList<>();
        this.CREATOR = new Parcelable.Creator<DistrictResult>() { // from class: com.amap.api.services.district.DistrictResult.1
            static {
                Covode.recordClassIndex(5687);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public DistrictResult[] newArray(int i) {
                return new DistrictResult[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public DistrictResult createFromParcel(Parcel parcel2) {
                return new DistrictResult(parcel2);
            }
        };
        this.f25000a = districtSearchQuery;
        this.f25001b = arrayList;
    }
}
