package com.amap.api.fence;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class PoiItem implements Parcelable {
    public static final Parcelable.Creator<PoiItem> CREATOR = new Parcelable.Creator<PoiItem>() { // from class: com.amap.api.fence.PoiItem.1
        static {
            Covode.recordClassIndex(4971);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PoiItem createFromParcel(Parcel parcel) {
            return new PoiItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PoiItem[] newArray(int i) {
            return new PoiItem[i];
        }
    };

    /* renamed from: a */
    public String f22545a;

    /* renamed from: b */
    public String f22546b;

    /* renamed from: c */
    public String f22547c;

    /* renamed from: d */
    public String f22548d;

    /* renamed from: e */
    public String f22549e;

    /* renamed from: f */
    public double f22550f;

    /* renamed from: g */
    public double f22551g;

    /* renamed from: h */
    public String f22552h;

    /* renamed from: i */
    public String f22553i;

    /* renamed from: j */
    public String f22554j;

    /* renamed from: k */
    public String f22555k;

    static {
        Covode.recordClassIndex(4970);
    }

    public PoiItem() {
        this.f22545a = "";
        this.f22546b = "";
        this.f22547c = "";
        this.f22548d = "";
        this.f22549e = "";
        this.f22552h = "";
        this.f22553i = "";
        this.f22554j = "";
        this.f22555k = "";
    }

    public PoiItem(Parcel parcel) {
        this.f22545a = "";
        this.f22546b = "";
        this.f22547c = "";
        this.f22548d = "";
        this.f22549e = "";
        this.f22552h = "";
        this.f22553i = "";
        this.f22554j = "";
        this.f22555k = "";
        this.f22545a = parcel.readString();
        this.f22546b = parcel.readString();
        this.f22547c = parcel.readString();
        this.f22548d = parcel.readString();
        this.f22549e = parcel.readString();
        this.f22550f = parcel.readDouble();
        this.f22551g = parcel.readDouble();
        this.f22552h = parcel.readString();
        this.f22553i = parcel.readString();
        this.f22554j = parcel.readString();
        this.f22555k = parcel.readString();
    }

    public static Parcelable.Creator<PoiItem> getCreator() {
        return CREATOR;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAddress() {
        return this.f22549e;
    }

    public String getAdname() {
        return this.f22555k;
    }

    public String getCity() {
        return this.f22554j;
    }

    public double getLatitude() {
        return this.f22550f;
    }

    public double getLongitude() {
        return this.f22551g;
    }

    public String getPoiId() {
        return this.f22546b;
    }

    public String getPoiName() {
        return this.f22545a;
    }

    public String getPoiType() {
        return this.f22547c;
    }

    public String getProvince() {
        return this.f22553i;
    }

    public String getTel() {
        return this.f22552h;
    }

    public String getTypeCode() {
        return this.f22548d;
    }

    public void setAddress(String str) {
        this.f22549e = str;
    }

    public void setAdname(String str) {
        this.f22555k = str;
    }

    public void setCity(String str) {
        this.f22554j = str;
    }

    public void setLatitude(double d) {
        this.f22550f = d;
    }

    public void setLongitude(double d) {
        this.f22551g = d;
    }

    public void setPoiId(String str) {
        this.f22546b = str;
    }

    public void setPoiName(String str) {
        this.f22545a = str;
    }

    public void setPoiType(String str) {
        this.f22547c = str;
    }

    public void setProvince(String str) {
        this.f22553i = str;
    }

    public void setTel(String str) {
        this.f22552h = str;
    }

    public void setTypeCode(String str) {
        this.f22548d = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f22545a);
        parcel.writeString(this.f22546b);
        parcel.writeString(this.f22547c);
        parcel.writeString(this.f22548d);
        parcel.writeString(this.f22549e);
        parcel.writeDouble(this.f22550f);
        parcel.writeDouble(this.f22551g);
        parcel.writeString(this.f22552h);
        parcel.writeString(this.f22553i);
        parcel.writeString(this.f22554j);
        parcel.writeString(this.f22555k);
    }
}
