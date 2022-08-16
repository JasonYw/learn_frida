package com.amap.api.services.cloud;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes11.dex */
public class CloudItem implements Parcelable {
    public static final Parcelable.Creator<CloudItem> CREATOR = new Parcelable.Creator<CloudItem>() { // from class: com.amap.api.services.cloud.CloudItem.1
        static {
            Covode.recordClassIndex(5665);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final CloudItem[] newArray(int i) {
            return new CloudItem[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final CloudItem createFromParcel(Parcel parcel) {
            return new CloudItem(parcel);
        }
    };

    /* renamed from: a */
    public String f24918a;

    /* renamed from: b */
    public int f24919b;

    /* renamed from: c */
    public String f24920c;

    /* renamed from: d */
    public String f24921d;

    /* renamed from: e */
    public HashMap<String, String> f24922e;

    /* renamed from: f */
    public List<CloudImage> f24923f;
    public final LatLonPoint mPoint;
    public final String mSnippet;
    public final String mTitle;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<CloudImage> getCloudImage() {
        return this.f24923f;
    }

    public String getCreatetime() {
        return this.f24920c;
    }

    public HashMap<String, String> getCustomfield() {
        return this.f24922e;
    }

    public int getDistance() {
        return this.f24919b;
    }

    public String getID() {
        return this.f24918a;
    }

    public LatLonPoint getLatLonPoint() {
        return this.mPoint;
    }

    public String getSnippet() {
        return this.mSnippet;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getUpdatetime() {
        return this.f24921d;
    }

    public String toString() {
        return this.mTitle;
    }

    static {
        Covode.recordClassIndex(5664);
    }

    public int hashCode() {
        int hashCode;
        String str = this.f24918a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode + 31;
    }

    public void setCreatetime(String str) {
        this.f24920c = str;
    }

    public void setCustomfield(HashMap<String, String> hashMap) {
        this.f24922e = hashMap;
    }

    public void setDistance(int i) {
        this.f24919b = i;
    }

    public void setUpdatetime(String str) {
        this.f24921d = str;
    }

    public void setmCloudImage(List<CloudImage> list) {
        this.f24923f = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CloudItem)) {
            return false;
        }
        CloudItem cloudItem = (CloudItem) obj;
        String str = this.f24918a;
        if (str == null) {
            if (cloudItem.f24918a != null) {
                return false;
            }
        } else if (!str.equals(cloudItem.f24918a)) {
            return false;
        }
        return true;
    }

    public CloudItem(Parcel parcel) {
        this.f24919b = -1;
        this.f24918a = parcel.readString();
        this.f24919b = parcel.readInt();
        this.mPoint = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.mTitle = parcel.readString();
        this.mSnippet = parcel.readString();
        this.f24920c = parcel.readString();
        this.f24921d = parcel.readString();
        this.f24922e = new HashMap<>();
        parcel.readMap(this.f24922e, HashMap.class.getClassLoader());
        this.f24923f = new ArrayList();
        parcel.readList(this.f24923f, getClass().getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f24918a);
        parcel.writeInt(this.f24919b);
        parcel.writeValue(this.mPoint);
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mSnippet);
        parcel.writeString(this.f24920c);
        parcel.writeString(this.f24921d);
        parcel.writeMap(this.f24922e);
        parcel.writeList(this.f24923f);
    }

    public CloudItem(String str, LatLonPoint latLonPoint, String str2, String str3) {
        this.f24919b = -1;
        this.f24918a = str;
        this.mPoint = latLonPoint;
        this.mTitle = str2;
        this.mSnippet = str3;
    }
}
