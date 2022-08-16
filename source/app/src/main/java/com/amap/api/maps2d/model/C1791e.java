package com.amap.api.maps2d.model;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.mapcore2d.C1569cm;
import com.amap.api.maps2d.AMapException;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.maps2d.model.e */
/* loaded from: classes19.dex */
public class C1791e implements Parcelable.Creator<LatLngBounds> {
    static {
        Covode.recordClassIndex(5402);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LatLngBounds[] newArray(int i) {
        return new LatLngBounds[i];
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LatLngBounds createFromParcel(Parcel parcel) {
        LatLng latLng;
        LatLng latLng2;
        int readInt = parcel.readInt();
        try {
            latLng = (LatLng) parcel.readParcelable(LatLngBounds.class.getClassLoader());
        } catch (BadParcelableException e) {
            e = e;
            latLng = null;
        }
        try {
            latLng2 = (LatLng) parcel.readParcelable(LatLngBounds.class.getClassLoader());
        } catch (BadParcelableException e2) {
            e = e2;
            C1569cm.m18147a(e, "LatLngBoundsCreator", "createFromParcel");
            latLng2 = null;
            return new LatLngBounds(readInt, latLng, latLng2);
        }
        try {
            return new LatLngBounds(readInt, latLng, latLng2);
        } catch (AMapException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static void m17108a(LatLngBounds latLngBounds, Parcel parcel, int i) {
        parcel.writeInt(latLngBounds.m17131a());
        parcel.writeParcelable(latLngBounds.southwest, i);
        parcel.writeParcelable(latLngBounds.northeast, i);
    }
}
