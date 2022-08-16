package com.amap.api.services.district;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.p126a.C2007j;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class DistrictSearchQuery implements Parcelable, Cloneable {
    public static final Parcelable.Creator<DistrictSearchQuery> CREATOR = new Parcelable.Creator<DistrictSearchQuery>() { // from class: com.amap.api.services.district.DistrictSearchQuery.1
        static {
            Covode.recordClassIndex(5691);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final DistrictSearchQuery[] newArray(int i) {
            return new DistrictSearchQuery[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final DistrictSearchQuery createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            DistrictSearchQuery districtSearchQuery = new DistrictSearchQuery();
            districtSearchQuery.setKeywords(parcel.readString());
            districtSearchQuery.setKeywordsLevel(parcel.readString());
            districtSearchQuery.setPageNum(parcel.readInt());
            districtSearchQuery.setPageSize(parcel.readInt());
            boolean z3 = false;
            if (parcel.readByte() == 1) {
                z = true;
            } else {
                z = false;
            }
            districtSearchQuery.setShowChild(z);
            if (parcel.readByte() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            districtSearchQuery.setShowBoundary(z2);
            if (parcel.readByte() == 1) {
                z3 = true;
            }
            districtSearchQuery.setShowBusinessArea(z3);
            districtSearchQuery.setSubDistrict(parcel.readInt());
            return districtSearchQuery;
        }
    };

    /* renamed from: a */
    public int f25006a;

    /* renamed from: b */
    public int f25007b;

    /* renamed from: c */
    public String f25008c;

    /* renamed from: d */
    public String f25009d;

    /* renamed from: e */
    public boolean f25010e;

    /* renamed from: f */
    public boolean f25011f;

    /* renamed from: g */
    public boolean f25012g;

    /* renamed from: h */
    public int f25013h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getKeywords() {
        return this.f25008c;
    }

    public String getKeywordsLevel() {
        return this.f25009d;
    }

    public int getPageSize() {
        return this.f25007b;
    }

    public int getSubDistrict() {
        return this.f25013h;
    }

    public boolean isShowBoundary() {
        return this.f25012g;
    }

    public boolean isShowBusinessArea() {
        return this.f25011f;
    }

    public boolean isShowChild() {
        return this.f25010e;
    }

    public int getPageNum() {
        int i = this.f25006a;
        if (i <= 0) {
            return 1;
        }
        return i;
    }

    static {
        Covode.recordClassIndex(5690);
    }

    public DistrictSearchQuery() {
        this.f25006a = 1;
        this.f25007b = 20;
        this.f25010e = true;
        this.f25013h = 1;
    }

    public boolean checkKeyWords() {
        String str = this.f25008c;
        if (str == null || str.trim().equalsIgnoreCase("")) {
            return false;
        }
        return true;
    }

    /* renamed from: clone */
    public DistrictSearchQuery m25286clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            C2007j.m16371a(e, "DistrictSearchQuery", "clone");
        }
        DistrictSearchQuery districtSearchQuery = new DistrictSearchQuery();
        districtSearchQuery.setKeywords(this.f25008c);
        districtSearchQuery.setKeywordsLevel(this.f25009d);
        districtSearchQuery.setPageNum(this.f25006a);
        districtSearchQuery.setPageSize(this.f25007b);
        districtSearchQuery.setShowChild(this.f25010e);
        districtSearchQuery.setSubDistrict(this.f25013h);
        districtSearchQuery.setShowBoundary(this.f25012g);
        districtSearchQuery.setShowBusinessArea(this.f25011f);
        return districtSearchQuery;
    }

    public boolean checkLevels() {
        String str = this.f25009d;
        if (str == null) {
            return false;
        }
        if (!str.trim().equals("country") && !this.f25009d.trim().equals("province") && !this.f25009d.trim().equals("city") && !this.f25009d.trim().equals("district") && !this.f25009d.trim().equals("biz_area")) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode;
        int i2 = 1231;
        if (this.f25012g) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = (i + 31) * 31;
        String str = this.f25008c;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (i3 + hashCode) * 31;
        String str2 = this.f25009d;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        int i6 = (((((i5 + i4) * 31) + this.f25006a) * 31) + this.f25007b) * 31;
        if (!this.f25010e) {
            i2 = 1237;
        }
        return ((i6 + i2) * 31) + this.f25013h;
    }

    public void setKeywords(String str) {
        this.f25008c = str;
    }

    public void setKeywordsLevel(String str) {
        this.f25009d = str;
    }

    public void setPageNum(int i) {
        this.f25006a = i;
    }

    public void setPageSize(int i) {
        this.f25007b = i;
    }

    public void setShowBoundary(boolean z) {
        this.f25012g = z;
    }

    public void setShowBusinessArea(boolean z) {
        this.f25011f = z;
    }

    public void setShowChild(boolean z) {
        this.f25010e = z;
    }

    public void setSubDistrict(int i) {
        this.f25013h = i;
    }

    public boolean weakEquals(DistrictSearchQuery districtSearchQuery) {
        if (this == districtSearchQuery) {
            return true;
        }
        if (districtSearchQuery == null) {
            return false;
        }
        String str = this.f25008c;
        if (str == null) {
            if (districtSearchQuery.f25008c != null) {
                return false;
            }
        } else if (!str.equals(districtSearchQuery.f25008c)) {
            return false;
        }
        if (this.f25007b == districtSearchQuery.f25007b && this.f25010e == districtSearchQuery.f25010e && this.f25012g == districtSearchQuery.f25012g && this.f25013h == districtSearchQuery.f25013h) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DistrictSearchQuery districtSearchQuery = (DistrictSearchQuery) obj;
        if (this.f25012g != districtSearchQuery.f25012g) {
            return false;
        }
        String str = this.f25008c;
        if (str == null) {
            if (districtSearchQuery.f25008c != null) {
                return false;
            }
        } else if (!str.equals(districtSearchQuery.f25008c)) {
            return false;
        }
        if (this.f25006a == districtSearchQuery.f25006a && this.f25007b == districtSearchQuery.f25007b && this.f25010e == districtSearchQuery.f25010e && this.f25013h == districtSearchQuery.f25013h) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25008c);
        parcel.writeString(this.f25009d);
        parcel.writeInt(this.f25006a);
        parcel.writeInt(this.f25007b);
        parcel.writeByte(this.f25010e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25012g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25011f ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f25013h);
    }

    public DistrictSearchQuery(String str, String str2, int i) {
        this.f25006a = 1;
        this.f25007b = 20;
        this.f25010e = true;
        this.f25013h = 1;
        this.f25008c = str;
        this.f25009d = str2;
        this.f25006a = i;
    }

    public DistrictSearchQuery(String str, String str2, int i, boolean z, int i2) {
        this(str, str2, i);
        this.f25010e = z;
        this.f25007b = i2;
    }
}
