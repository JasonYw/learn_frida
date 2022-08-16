package com.amap.api.services.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.poisearch.IndoorData;
import com.amap.api.services.poisearch.Photo;
import com.amap.api.services.poisearch.PoiItemExtension;
import com.amap.api.services.poisearch.SubPoiItem;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class PoiItem implements Parcelable {
    public static final Parcelable.Creator<PoiItem> CREATOR = new Parcelable.Creator<PoiItem>() { // from class: com.amap.api.services.core.PoiItem.1
        static {
            Covode.recordClassIndex(5680);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final PoiItem[] newArray(int i) {
            return new PoiItem[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final PoiItem createFromParcel(Parcel parcel) {
            return new PoiItem(parcel);
        }
    };

    /* renamed from: A */
    public String f24956A;

    /* renamed from: B */
    public String f24957B;

    /* renamed from: a */
    public String f24958a;

    /* renamed from: b */
    public String f24959b;

    /* renamed from: c */
    public String f24960c;

    /* renamed from: d */
    public String f24961d;

    /* renamed from: e */
    public String f24962e;

    /* renamed from: f */
    public int f24963f;

    /* renamed from: g */
    public final LatLonPoint f24964g;

    /* renamed from: h */
    public final String f24965h;

    /* renamed from: i */
    public final String f24966i;

    /* renamed from: j */
    public LatLonPoint f24967j;

    /* renamed from: k */
    public LatLonPoint f24968k;

    /* renamed from: l */
    public String f24969l;

    /* renamed from: m */
    public String f24970m;

    /* renamed from: n */
    public String f24971n;

    /* renamed from: o */
    public String f24972o;

    /* renamed from: p */
    public String f24973p;

    /* renamed from: q */
    public String f24974q;

    /* renamed from: r */
    public String f24975r;

    /* renamed from: s */
    public boolean f24976s;

    /* renamed from: t */
    public IndoorData f24977t;

    /* renamed from: u */
    public String f24978u;

    /* renamed from: v */
    public String f24979v;

    /* renamed from: w */
    public String f24980w;

    /* renamed from: x */
    public List<SubPoiItem> f24981x;

    /* renamed from: y */
    public List<Photo> f24982y;

    /* renamed from: z */
    public PoiItemExtension f24983z;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdCode() {
        return this.f24960c;
    }

    public String getAdName() {
        return this.f24975r;
    }

    public String getBusinessArea() {
        return this.f24979v;
    }

    public String getCityCode() {
        return this.f24961d;
    }

    public String getCityName() {
        return this.f24974q;
    }

    public String getDirection() {
        return this.f24972o;
    }

    public int getDistance() {
        return this.f24963f;
    }

    public String getEmail() {
        return this.f24971n;
    }

    public LatLonPoint getEnter() {
        return this.f24967j;
    }

    public LatLonPoint getExit() {
        return this.f24968k;
    }

    public IndoorData getIndoorData() {
        return this.f24977t;
    }

    public LatLonPoint getLatLonPoint() {
        return this.f24964g;
    }

    public String getParkingType() {
        return this.f24980w;
    }

    public List<Photo> getPhotos() {
        return this.f24982y;
    }

    public PoiItemExtension getPoiExtension() {
        return this.f24983z;
    }

    public String getPoiId() {
        return this.f24958a;
    }

    public String getPostcode() {
        return this.f24970m;
    }

    public String getProvinceCode() {
        return this.f24978u;
    }

    public String getProvinceName() {
        return this.f24973p;
    }

    public String getShopID() {
        return this.f24957B;
    }

    public String getSnippet() {
        return this.f24966i;
    }

    public List<SubPoiItem> getSubPois() {
        return this.f24981x;
    }

    public String getTel() {
        return this.f24959b;
    }

    public String getTitle() {
        return this.f24965h;
    }

    public String getTypeCode() {
        return this.f24956A;
    }

    public String getTypeDes() {
        return this.f24962e;
    }

    public String getWebsite() {
        return this.f24969l;
    }

    public boolean isIndoorMap() {
        return this.f24976s;
    }

    public String toString() {
        return this.f24965h;
    }

    static {
        Covode.recordClassIndex(5679);
    }

    public int hashCode() {
        int hashCode;
        String str = this.f24958a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode + 31;
    }

    public void setAdCode(String str) {
        this.f24960c = str;
    }

    public void setAdName(String str) {
        this.f24975r = str;
    }

    public void setBusinessArea(String str) {
        this.f24979v = str;
    }

    public void setCityCode(String str) {
        this.f24961d = str;
    }

    public void setCityName(String str) {
        this.f24974q = str;
    }

    public void setDirection(String str) {
        this.f24972o = str;
    }

    public void setDistance(int i) {
        this.f24963f = i;
    }

    public void setEmail(String str) {
        this.f24971n = str;
    }

    public void setEnter(LatLonPoint latLonPoint) {
        this.f24967j = latLonPoint;
    }

    public void setExit(LatLonPoint latLonPoint) {
        this.f24968k = latLonPoint;
    }

    public void setIndoorDate(IndoorData indoorData) {
        this.f24977t = indoorData;
    }

    public void setIndoorMap(boolean z) {
        this.f24976s = z;
    }

    public void setParkingType(String str) {
        this.f24980w = str;
    }

    public void setPhotos(List<Photo> list) {
        this.f24982y = list;
    }

    public void setPoiExtension(PoiItemExtension poiItemExtension) {
        this.f24983z = poiItemExtension;
    }

    public void setPostcode(String str) {
        this.f24970m = str;
    }

    public void setProvinceCode(String str) {
        this.f24978u = str;
    }

    public void setProvinceName(String str) {
        this.f24973p = str;
    }

    public void setShopID(String str) {
        this.f24957B = str;
    }

    public void setSubPois(List<SubPoiItem> list) {
        this.f24981x = list;
    }

    public void setTel(String str) {
        this.f24959b = str;
    }

    public void setTypeCode(String str) {
        this.f24956A = str;
    }

    public void setTypeDes(String str) {
        this.f24962e = str;
    }

    public void setWebsite(String str) {
        this.f24969l = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoiItem poiItem = (PoiItem) obj;
        String str = this.f24958a;
        if (str == null) {
            if (poiItem.f24958a != null) {
                return false;
            }
        } else if (!str.equals(poiItem.f24958a)) {
            return false;
        }
        return true;
    }

    public PoiItem(Parcel parcel) {
        this.f24962e = "";
        this.f24963f = -1;
        this.f24981x = new ArrayList();
        this.f24982y = new ArrayList();
        this.f24958a = parcel.readString();
        this.f24960c = parcel.readString();
        this.f24959b = parcel.readString();
        this.f24962e = parcel.readString();
        this.f24963f = parcel.readInt();
        this.f24964g = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.f24965h = parcel.readString();
        this.f24966i = parcel.readString();
        this.f24961d = parcel.readString();
        this.f24967j = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.f24968k = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.f24969l = parcel.readString();
        this.f24970m = parcel.readString();
        this.f24971n = parcel.readString();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.f24976s = zArr[0];
        this.f24972o = parcel.readString();
        this.f24973p = parcel.readString();
        this.f24974q = parcel.readString();
        this.f24975r = parcel.readString();
        this.f24978u = parcel.readString();
        this.f24979v = parcel.readString();
        this.f24980w = parcel.readString();
        this.f24981x = parcel.readArrayList(SubPoiItem.class.getClassLoader());
        this.f24977t = (IndoorData) parcel.readValue(IndoorData.class.getClassLoader());
        this.f24982y = parcel.createTypedArrayList(Photo.CREATOR);
        this.f24983z = (PoiItemExtension) parcel.readParcelable(PoiItemExtension.class.getClassLoader());
        this.f24956A = parcel.readString();
        this.f24957B = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f24958a);
        parcel.writeString(this.f24960c);
        parcel.writeString(this.f24959b);
        parcel.writeString(this.f24962e);
        parcel.writeInt(this.f24963f);
        parcel.writeValue(this.f24964g);
        parcel.writeString(this.f24965h);
        parcel.writeString(this.f24966i);
        parcel.writeString(this.f24961d);
        parcel.writeValue(this.f24967j);
        parcel.writeValue(this.f24968k);
        parcel.writeString(this.f24969l);
        parcel.writeString(this.f24970m);
        parcel.writeString(this.f24971n);
        parcel.writeBooleanArray(new boolean[]{this.f24976s});
        parcel.writeString(this.f24972o);
        parcel.writeString(this.f24973p);
        parcel.writeString(this.f24974q);
        parcel.writeString(this.f24975r);
        parcel.writeString(this.f24978u);
        parcel.writeString(this.f24979v);
        parcel.writeString(this.f24980w);
        parcel.writeList(this.f24981x);
        parcel.writeValue(this.f24977t);
        parcel.writeTypedList(this.f24982y);
        parcel.writeParcelable(this.f24983z, i);
        parcel.writeString(this.f24956A);
        parcel.writeString(this.f24957B);
    }

    public PoiItem(String str, LatLonPoint latLonPoint, String str2, String str3) {
        this.f24962e = "";
        this.f24963f = -1;
        this.f24981x = new ArrayList();
        this.f24982y = new ArrayList();
        this.f24958a = str;
        this.f24964g = latLonPoint;
        this.f24965h = str2;
        this.f24966i = str3;
    }
}
