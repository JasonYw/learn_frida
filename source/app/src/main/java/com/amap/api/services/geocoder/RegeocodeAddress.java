package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.road.Crossroad;
import com.amap.api.services.road.Road;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public final class RegeocodeAddress implements Parcelable {
    public static final Parcelable.Creator<RegeocodeAddress> CREATOR = new Parcelable.Creator<RegeocodeAddress>() { // from class: com.amap.api.services.geocoder.RegeocodeAddress.1
        static {
            Covode.recordClassIndex(5703);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RegeocodeAddress[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RegeocodeAddress createFromParcel(Parcel parcel) {
            return new RegeocodeAddress(parcel);
        }
    };

    /* renamed from: a */
    public String f25036a;

    /* renamed from: b */
    public String f25037b;

    /* renamed from: c */
    public String f25038c;

    /* renamed from: d */
    public String f25039d;

    /* renamed from: e */
    public String f25040e;

    /* renamed from: f */
    public String f25041f;

    /* renamed from: g */
    public String f25042g;

    /* renamed from: h */
    public StreetNumber f25043h;

    /* renamed from: i */
    public String f25044i;

    /* renamed from: j */
    public String f25045j;

    /* renamed from: k */
    public String f25046k;

    /* renamed from: l */
    public List<RegeocodeRoad> f25047l;

    /* renamed from: m */
    public List<Crossroad> f25048m;

    /* renamed from: n */
    public List<PoiItem> f25049n;

    /* renamed from: o */
    public List<BusinessArea> f25050o;

    /* renamed from: p */
    public List<AoiItem> f25051p;

    /* renamed from: q */
    public String f25052q;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getAdCode() {
        return this.f25045j;
    }

    public final List<AoiItem> getAois() {
        return this.f25051p;
    }

    public final String getBuilding() {
        return this.f25042g;
    }

    public final List<BusinessArea> getBusinessAreas() {
        return this.f25050o;
    }

    public final String getCity() {
        return this.f25038c;
    }

    public final String getCityCode() {
        return this.f25044i;
    }

    public final String getCountry() {
        return this.f25052q;
    }

    public final List<Crossroad> getCrossroads() {
        return this.f25048m;
    }

    public final String getDistrict() {
        return this.f25039d;
    }

    public final String getFormatAddress() {
        return this.f25036a;
    }

    public final String getNeighborhood() {
        return this.f25041f;
    }

    public final List<PoiItem> getPois() {
        return this.f25049n;
    }

    public final String getProvince() {
        return this.f25037b;
    }

    public final List<RegeocodeRoad> getRoads() {
        return this.f25047l;
    }

    public final StreetNumber getStreetNumber() {
        return this.f25043h;
    }

    public final String getTowncode() {
        return this.f25046k;
    }

    public final String getTownship() {
        return this.f25040e;
    }

    static {
        Covode.recordClassIndex(5702);
    }

    public RegeocodeAddress() {
        this.f25047l = new ArrayList();
        this.f25048m = new ArrayList();
        this.f25049n = new ArrayList();
        this.f25050o = new ArrayList();
        this.f25051p = new ArrayList();
    }

    public final void setAdCode(String str) {
        this.f25045j = str;
    }

    public final void setAois(List<AoiItem> list) {
        this.f25051p = list;
    }

    public final void setBuilding(String str) {
        this.f25042g = str;
    }

    public final void setBusinessAreas(List<BusinessArea> list) {
        this.f25050o = list;
    }

    public final void setCity(String str) {
        this.f25038c = str;
    }

    public final void setCityCode(String str) {
        this.f25044i = str;
    }

    public final void setCountry(String str) {
        this.f25052q = str;
    }

    public final void setCrossroads(List<Crossroad> list) {
        this.f25048m = list;
    }

    public final void setDistrict(String str) {
        this.f25039d = str;
    }

    public final void setFormatAddress(String str) {
        this.f25036a = str;
    }

    public final void setNeighborhood(String str) {
        this.f25041f = str;
    }

    public final void setPois(List<PoiItem> list) {
        this.f25049n = list;
    }

    public final void setProvince(String str) {
        this.f25037b = str;
    }

    public final void setRoads(List<RegeocodeRoad> list) {
        this.f25047l = list;
    }

    public final void setStreetNumber(StreetNumber streetNumber) {
        this.f25043h = streetNumber;
    }

    public final void setTowncode(String str) {
        this.f25046k = str;
    }

    public final void setTownship(String str) {
        this.f25040e = str;
    }

    public RegeocodeAddress(Parcel parcel) {
        this.f25047l = new ArrayList();
        this.f25048m = new ArrayList();
        this.f25049n = new ArrayList();
        this.f25050o = new ArrayList();
        this.f25051p = new ArrayList();
        this.f25036a = parcel.readString();
        this.f25037b = parcel.readString();
        this.f25038c = parcel.readString();
        this.f25039d = parcel.readString();
        this.f25040e = parcel.readString();
        this.f25041f = parcel.readString();
        this.f25042g = parcel.readString();
        this.f25043h = (StreetNumber) parcel.readValue(StreetNumber.class.getClassLoader());
        this.f25047l = parcel.readArrayList(Road.class.getClassLoader());
        this.f25048m = parcel.readArrayList(Crossroad.class.getClassLoader());
        this.f25049n = parcel.readArrayList(PoiItem.class.getClassLoader());
        this.f25044i = parcel.readString();
        this.f25045j = parcel.readString();
        this.f25050o = parcel.readArrayList(BusinessArea.class.getClassLoader());
        this.f25051p = parcel.readArrayList(AoiItem.class.getClassLoader());
        this.f25046k = parcel.readString();
        this.f25052q = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25036a);
        parcel.writeString(this.f25037b);
        parcel.writeString(this.f25038c);
        parcel.writeString(this.f25039d);
        parcel.writeString(this.f25040e);
        parcel.writeString(this.f25041f);
        parcel.writeString(this.f25042g);
        parcel.writeValue(this.f25043h);
        parcel.writeList(this.f25047l);
        parcel.writeList(this.f25048m);
        parcel.writeList(this.f25049n);
        parcel.writeString(this.f25044i);
        parcel.writeString(this.f25045j);
        parcel.writeList(this.f25050o);
        parcel.writeList(this.f25051p);
        parcel.writeString(this.f25046k);
        parcel.writeString(this.f25052q);
    }
}
