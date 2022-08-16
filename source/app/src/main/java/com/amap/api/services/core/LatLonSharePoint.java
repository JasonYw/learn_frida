package com.amap.api.services.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import p002O.C0002O;

/* loaded from: classes19.dex */
public class LatLonSharePoint extends LatLonPoint implements Parcelable {
    public static final Parcelable.Creator<LatLonSharePoint> CREATOR = new Parcelable.Creator<LatLonSharePoint>() { // from class: com.amap.api.services.core.LatLonSharePoint.1
        static {
            Covode.recordClassIndex(5678);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final LatLonSharePoint[] newArray(int i) {
            return new LatLonSharePoint[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final LatLonSharePoint createFromParcel(Parcel parcel) {
            return new LatLonSharePoint(parcel);
        }
    };

    /* renamed from: a */
    public String f24955a;

    @Override // com.amap.api.services.core.LatLonPoint, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getSharePointName() {
        return this.f24955a;
    }

    static {
        Covode.recordClassIndex(5677);
    }

    @Override // com.amap.api.services.core.LatLonPoint
    public int hashCode() {
        int hashCode;
        int hashCode2 = super.hashCode() * 31;
        String str = this.f24955a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @Override // com.amap.api.services.core.LatLonPoint
    public String toString() {
        new StringBuilder();
        return C0002O.m25085C(super.toString(), Constants.ACCEPT_TIME_SEPARATOR_SP, this.f24955a);
    }

    public void setSharePointName(String str) {
        this.f24955a = str;
    }

    public LatLonSharePoint(Parcel parcel) {
        super(parcel);
        this.f24955a = parcel.readString();
    }

    @Override // com.amap.api.services.core.LatLonPoint
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        LatLonSharePoint latLonSharePoint = (LatLonSharePoint) obj;
        String str = this.f24955a;
        if (str == null) {
            if (latLonSharePoint.f24955a != null) {
                return false;
            }
        } else if (!str.equals(latLonSharePoint.f24955a)) {
            return false;
        }
        return true;
    }

    @Override // com.amap.api.services.core.LatLonPoint, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f24955a);
    }

    public LatLonSharePoint(double d, double d2, String str) {
        super(d, d2);
        this.f24955a = str;
    }
}
