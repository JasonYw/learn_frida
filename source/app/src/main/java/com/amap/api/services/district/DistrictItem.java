package com.amap.api.services.district;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes18.dex */
public final class DistrictItem implements Parcelable {
    public static final Parcelable.Creator<DistrictItem> CREATOR = new Parcelable.Creator<DistrictItem>() { // from class: com.amap.api.services.district.DistrictItem.1
        static {
            Covode.recordClassIndex(5685);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final DistrictItem[] newArray(int i) {
            return new DistrictItem[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final DistrictItem createFromParcel(Parcel parcel) {
            return new DistrictItem(parcel);
        }
    };

    /* renamed from: a */
    public String f24993a;

    /* renamed from: b */
    public String f24994b;

    /* renamed from: c */
    public String f24995c;

    /* renamed from: d */
    public LatLonPoint f24996d;

    /* renamed from: e */
    public String f24997e;

    /* renamed from: f */
    public List<DistrictItem> f24998f;

    /* renamed from: g */
    public String[] f24999g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String[] districtBoundary() {
        return this.f24999g;
    }

    public final String getAdcode() {
        return this.f24994b;
    }

    public final LatLonPoint getCenter() {
        return this.f24996d;
    }

    public final String getCitycode() {
        return this.f24993a;
    }

    public final String getLevel() {
        return this.f24997e;
    }

    public final String getName() {
        return this.f24995c;
    }

    public final List<DistrictItem> getSubDistrict() {
        return this.f24998f;
    }

    static {
        Covode.recordClassIndex(5684);
    }

    public DistrictItem() {
        this.f24998f = new ArrayList();
        this.f24999g = new String[0];
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.f24994b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        LatLonPoint latLonPoint = this.f24996d;
        if (latLonPoint == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = latLonPoint.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.f24993a;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int hashCode6 = (((i3 + hashCode3) * 31) + Arrays.hashCode(this.f24999g)) * 31;
        List<DistrictItem> list = this.f24998f;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i4 = (hashCode6 + hashCode4) * 31;
        String str3 = this.f24997e;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        String str4 = this.f24995c;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "DistrictItem [mCitycode=" + this.f24993a + ", mAdcode=" + this.f24994b + ", mName=" + this.f24995c + ", mCenter=" + this.f24996d + ", mLevel=" + this.f24997e + ", mDistricts=" + this.f24998f + "]";
    }

    public final void setAdcode(String str) {
        this.f24994b = str;
    }

    public final void setCenter(LatLonPoint latLonPoint) {
        this.f24996d = latLonPoint;
    }

    public final void setCitycode(String str) {
        this.f24993a = str;
    }

    public final void setDistrictBoundary(String[] strArr) {
        this.f24999g = strArr;
    }

    public final void setLevel(String str) {
        this.f24997e = str;
    }

    public final void setName(String str) {
        this.f24995c = str;
    }

    public final void setSubDistrict(ArrayList<DistrictItem> arrayList) {
        this.f24998f = arrayList;
    }

    public DistrictItem(Parcel parcel) {
        this.f24998f = new ArrayList();
        this.f24999g = new String[0];
        this.f24993a = parcel.readString();
        this.f24994b = parcel.readString();
        this.f24995c = parcel.readString();
        this.f24996d = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.f24997e = parcel.readString();
        this.f24998f = parcel.createTypedArrayList(CREATOR);
        this.f24999g = new String[parcel.readInt()];
        parcel.readStringArray(this.f24999g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DistrictItem districtItem = (DistrictItem) obj;
        String str = this.f24994b;
        if (str == null) {
            if (districtItem.f24994b != null) {
                return false;
            }
        } else if (!str.equals(districtItem.f24994b)) {
            return false;
        }
        LatLonPoint latLonPoint = this.f24996d;
        if (latLonPoint == null) {
            if (districtItem.f24996d != null) {
                return false;
            }
        } else if (!latLonPoint.equals(districtItem.f24996d)) {
            return false;
        }
        String str2 = this.f24993a;
        if (str2 == null) {
            if (districtItem.f24993a != null) {
                return false;
            }
        } else if (!str2.equals(districtItem.f24993a)) {
            return false;
        }
        if (!Arrays.equals(this.f24999g, districtItem.f24999g)) {
            return false;
        }
        List<DistrictItem> list = this.f24998f;
        if (list == null) {
            if (districtItem.f24998f != null) {
                return false;
            }
        } else if (!list.equals(districtItem.f24998f)) {
            return false;
        }
        String str3 = this.f24997e;
        if (str3 == null) {
            if (districtItem.f24997e != null) {
                return false;
            }
        } else if (!str3.equals(districtItem.f24997e)) {
            return false;
        }
        String str4 = this.f24995c;
        if (str4 == null) {
            if (districtItem.f24995c != null) {
                return false;
            }
        } else if (!str4.equals(districtItem.f24995c)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f24993a);
        parcel.writeString(this.f24994b);
        parcel.writeString(this.f24995c);
        parcel.writeParcelable(this.f24996d, i);
        parcel.writeString(this.f24997e);
        parcel.writeTypedList(this.f24998f);
        parcel.writeInt(this.f24999g.length);
        parcel.writeStringArray(this.f24999g);
    }

    public DistrictItem(String str, String str2, String str3, LatLonPoint latLonPoint, String str4) {
        this.f24998f = new ArrayList();
        this.f24999g = new String[0];
        this.f24995c = str;
        this.f24993a = str2;
        this.f24994b = str3;
        this.f24996d = latLonPoint;
        this.f24997e = str4;
    }
}
