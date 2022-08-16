package com.amap.api.fence;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.location.DPoint;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes19.dex */
public class DistrictItem implements Parcelable {
    public static final Parcelable.Creator<DistrictItem> CREATOR = new Parcelable.Creator<DistrictItem>() { // from class: com.amap.api.fence.DistrictItem.1
        static {
            Covode.recordClassIndex(4965);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistrictItem createFromParcel(Parcel parcel) {
            return new DistrictItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DistrictItem[] newArray(int i) {
            return new DistrictItem[i];
        }
    };

    /* renamed from: a */
    public String f22521a;

    /* renamed from: b */
    public String f22522b;

    /* renamed from: c */
    public String f22523c;

    /* renamed from: d */
    public List<DPoint> f22524d;

    static {
        Covode.recordClassIndex(4964);
    }

    public DistrictItem() {
        this.f22521a = "";
    }

    public DistrictItem(Parcel parcel) {
        this.f22521a = "";
        this.f22521a = parcel.readString();
        this.f22522b = parcel.readString();
        this.f22523c = parcel.readString();
        this.f22524d = parcel.createTypedArrayList(DPoint.CREATOR);
    }

    public static Parcelable.Creator<DistrictItem> getCreator() {
        return CREATOR;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdcode() {
        return this.f22523c;
    }

    public String getCitycode() {
        return this.f22522b;
    }

    public String getDistrictName() {
        return this.f22521a;
    }

    public List<DPoint> getPolyline() {
        return this.f22524d;
    }

    public void setAdcode(String str) {
        this.f22523c = str;
    }

    public void setCitycode(String str) {
        this.f22522b = str;
    }

    public void setDistrictName(String str) {
        this.f22521a = str;
    }

    public void setPolyline(List<DPoint> list) {
        this.f22524d = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f22521a);
        parcel.writeString(this.f22522b);
        parcel.writeString(this.f22523c);
        parcel.writeTypedList(this.f22524d);
    }
}
