package com.amap.api.fence;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.DPoint;
import com.bytedance.covode.number.Covode;
import com.loc.C15975ep;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class GeoFence implements Parcelable {
    public static final Parcelable.Creator<GeoFence> CREATOR = new Parcelable.Creator<GeoFence>() { // from class: com.amap.api.fence.GeoFence.1
        static {
            Covode.recordClassIndex(4967);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GeoFence createFromParcel(Parcel parcel) {
            return new GeoFence(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GeoFence[] newArray(int i) {
            return new GeoFence[i];
        }
    };

    /* renamed from: a */
    public String f22525a;

    /* renamed from: b */
    public String f22526b;

    /* renamed from: c */
    public String f22527c;

    /* renamed from: d */
    public PendingIntent f22528d;

    /* renamed from: e */
    public int f22529e;

    /* renamed from: f */
    public PoiItem f22530f;

    /* renamed from: g */
    public List<DistrictItem> f22531g;

    /* renamed from: h */
    public List<List<DPoint>> f22532h;

    /* renamed from: i */
    public float f22533i;

    /* renamed from: j */
    public long f22534j;

    /* renamed from: k */
    public int f22535k;

    /* renamed from: l */
    public float f22536l;

    /* renamed from: m */
    public float f22537m;

    /* renamed from: n */
    public DPoint f22538n;

    /* renamed from: o */
    public int f22539o;

    /* renamed from: p */
    public long f22540p;

    /* renamed from: q */
    public boolean f22541q;

    /* renamed from: r */
    public AMapLocation f22542r;

    static {
        Covode.recordClassIndex(4966);
    }

    public GeoFence() {
        this.f22534j = -1L;
        this.f22535k = 1;
        this.f22540p = -1L;
        this.f22541q = true;
    }

    public GeoFence(Parcel parcel) {
        this.f22534j = -1L;
        this.f22535k = 1;
        this.f22540p = -1L;
        this.f22541q = true;
        this.f22525a = parcel.readString();
        this.f22526b = parcel.readString();
        this.f22527c = parcel.readString();
        this.f22528d = (PendingIntent) parcel.readParcelable(PendingIntent.class.getClassLoader());
        this.f22529e = parcel.readInt();
        this.f22530f = (PoiItem) parcel.readParcelable(PoiItem.class.getClassLoader());
        this.f22531g = parcel.createTypedArrayList(DistrictItem.CREATOR);
        this.f22533i = parcel.readFloat();
        this.f22534j = parcel.readLong();
        this.f22535k = parcel.readInt();
        this.f22536l = parcel.readFloat();
        this.f22537m = parcel.readFloat();
        this.f22538n = (DPoint) parcel.readParcelable(DPoint.class.getClassLoader());
        this.f22539o = parcel.readInt();
        this.f22540p = parcel.readLong();
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt != 0) {
            this.f22532h = new ArrayList();
            for (int i = 0; i < readInt; i++) {
                this.f22532h.add(parcel.createTypedArrayList(DPoint.CREATOR));
            }
        }
        this.f22541q = parcel.readByte() != 0 ? true : z;
        this.f22542r = (AMapLocation) parcel.readParcelable(AMapLocation.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GeoFence)) {
            return false;
        }
        GeoFence geoFence = (GeoFence) obj;
        if (TextUtils.isEmpty(this.f22526b)) {
            if (!TextUtils.isEmpty(geoFence.f22526b)) {
                return false;
            }
        } else if (!this.f22526b.equals(geoFence.f22526b)) {
            return false;
        }
        DPoint dPoint = this.f22538n;
        if (dPoint == null) {
            if (geoFence.f22538n != null) {
                return false;
            }
        } else if (!dPoint.equals(geoFence.f22538n)) {
            return false;
        }
        if (this.f22533i != geoFence.f22533i) {
            return false;
        }
        List<List<DPoint>> list = this.f22532h;
        List<List<DPoint>> list2 = geoFence.f22532h;
        return list == null ? list2 == null : list.equals(list2);
    }

    public int getActivatesAction() {
        return this.f22535k;
    }

    public DPoint getCenter() {
        return this.f22538n;
    }

    public AMapLocation getCurrentLocation() {
        return this.f22542r;
    }

    public String getCustomId() {
        return this.f22526b;
    }

    public List<DistrictItem> getDistrictItemList() {
        return this.f22531g;
    }

    public long getEnterTime() {
        return this.f22540p;
    }

    public long getExpiration() {
        return this.f22534j;
    }

    public String getFenceId() {
        return this.f22525a;
    }

    public float getMaxDis2Center() {
        return this.f22537m;
    }

    public float getMinDis2Center() {
        return this.f22536l;
    }

    public PendingIntent getPendingIntent() {
        return this.f22528d;
    }

    public String getPendingIntentAction() {
        return this.f22527c;
    }

    public PoiItem getPoiItem() {
        return this.f22530f;
    }

    public List<List<DPoint>> getPointList() {
        return this.f22532h;
    }

    public float getRadius() {
        return this.f22533i;
    }

    public int getStatus() {
        return this.f22539o;
    }

    public int getType() {
        return this.f22529e;
    }

    public int hashCode() {
        return this.f22526b.hashCode() + this.f22532h.hashCode() + this.f22538n.hashCode() + ((int) (this.f22533i * 100.0f));
    }

    public boolean isAble() {
        return this.f22541q;
    }

    public void setAble(boolean z) {
        this.f22541q = z;
    }

    public void setActivatesAction(int i) {
        this.f22535k = i;
    }

    public void setCenter(DPoint dPoint) {
        this.f22538n = dPoint;
    }

    public void setCurrentLocation(AMapLocation aMapLocation) {
        this.f22542r = aMapLocation.m25271clone();
    }

    public void setCustomId(String str) {
        this.f22526b = str;
    }

    public void setDistrictItemList(List<DistrictItem> list) {
        this.f22531g = list;
    }

    public void setEnterTime(long j) {
        this.f22540p = j;
    }

    public void setExpiration(long j) {
        this.f22534j = j < 0 ? -1L : j + C15975ep.m10618b();
    }

    public void setFenceId(String str) {
        this.f22525a = str;
    }

    public void setMaxDis2Center(float f) {
        this.f22537m = f;
    }

    public void setMinDis2Center(float f) {
        this.f22536l = f;
    }

    public void setPendingIntent(PendingIntent pendingIntent) {
        this.f22528d = pendingIntent;
    }

    public void setPendingIntentAction(String str) {
        this.f22527c = str;
    }

    public void setPoiItem(PoiItem poiItem) {
        this.f22530f = poiItem;
    }

    public void setPointList(List<List<DPoint>> list) {
        this.f22532h = list;
    }

    public void setRadius(float f) {
        this.f22533i = f;
    }

    public void setStatus(int i) {
        this.f22539o = i;
    }

    public void setType(int i) {
        this.f22529e = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f22525a);
        parcel.writeString(this.f22526b);
        parcel.writeString(this.f22527c);
        parcel.writeParcelable(this.f22528d, i);
        parcel.writeInt(this.f22529e);
        parcel.writeParcelable(this.f22530f, i);
        parcel.writeTypedList(this.f22531g);
        parcel.writeFloat(this.f22533i);
        parcel.writeLong(this.f22534j);
        parcel.writeInt(this.f22535k);
        parcel.writeFloat(this.f22536l);
        parcel.writeFloat(this.f22537m);
        parcel.writeParcelable(this.f22538n, i);
        parcel.writeInt(this.f22539o);
        parcel.writeLong(this.f22540p);
        List<List<DPoint>> list = this.f22532h;
        if (list != null && !list.isEmpty()) {
            parcel.writeInt(this.f22532h.size());
            for (List<DPoint> list2 : this.f22532h) {
                parcel.writeTypedList(list2);
            }
        }
        parcel.writeByte(this.f22541q ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f22542r, i);
    }
}
