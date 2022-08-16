package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;

/* loaded from: classes11.dex */
public class SubPoiItem implements Parcelable {
    public static final Parcelable.Creator<SubPoiItem> CREATOR = new Parcelable.Creator<SubPoiItem>() { // from class: com.amap.api.services.poisearch.SubPoiItem.1
        static {
            Covode.recordClassIndex(5750);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final SubPoiItem[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final SubPoiItem createFromParcel(Parcel parcel) {
            return new SubPoiItem(parcel);
        }
    };

    /* renamed from: a */
    public String f25135a;

    /* renamed from: b */
    public String f25136b;

    /* renamed from: c */
    public String f25137c;

    /* renamed from: d */
    public int f25138d;

    /* renamed from: e */
    public LatLonPoint f25139e;

    /* renamed from: f */
    public String f25140f;

    /* renamed from: g */
    public String f25141g;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDistance() {
        return this.f25138d;
    }

    public LatLonPoint getLatLonPoint() {
        return this.f25139e;
    }

    public String getPoiId() {
        return this.f25135a;
    }

    public String getSnippet() {
        return this.f25140f;
    }

    public String getSubName() {
        return this.f25137c;
    }

    public String getSubTypeDes() {
        return this.f25141g;
    }

    public String getTitle() {
        return this.f25136b;
    }

    static {
        Covode.recordClassIndex(5749);
    }

    public void setDistance(int i) {
        this.f25138d = i;
    }

    public void setLatLonPoint(LatLonPoint latLonPoint) {
        this.f25139e = latLonPoint;
    }

    public void setPoiId(String str) {
        this.f25135a = str;
    }

    public void setSnippet(String str) {
        this.f25140f = str;
    }

    public void setSubName(String str) {
        this.f25137c = str;
    }

    public void setSubTypeDes(String str) {
        this.f25141g = str;
    }

    public void setTitle(String str) {
        this.f25136b = str;
    }

    public SubPoiItem(Parcel parcel) {
        this.f25135a = parcel.readString();
        this.f25136b = parcel.readString();
        this.f25137c = parcel.readString();
        this.f25138d = parcel.readInt();
        this.f25139e = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.f25140f = parcel.readString();
        this.f25141g = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25135a);
        parcel.writeString(this.f25136b);
        parcel.writeString(this.f25137c);
        parcel.writeInt(this.f25138d);
        parcel.writeValue(this.f25139e);
        parcel.writeString(this.f25140f);
        parcel.writeString(this.f25141g);
    }

    public SubPoiItem(String str, LatLonPoint latLonPoint, String str2, String str3) {
        this.f25135a = str;
        this.f25139e = latLonPoint;
        this.f25136b = str2;
        this.f25140f = str3;
    }
}
