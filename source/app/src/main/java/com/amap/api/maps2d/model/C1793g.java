package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.maps2d.model.g */
/* loaded from: classes19.dex */
public class C1793g implements Parcelable.Creator<MarkerOptions> {
    static {
        Covode.recordClassIndex(5404);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public MarkerOptions[] newArray(int i) {
        return new MarkerOptions[i];
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public MarkerOptions createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position((LatLng) parcel.readParcelable(LatLng.class.getClassLoader()));
        markerOptions.icon((BitmapDescriptor) parcel.readParcelable(BitmapDescriptor.class.getClassLoader()));
        markerOptions.title(parcel.readString());
        markerOptions.snippet(parcel.readString());
        markerOptions.anchor(parcel.readFloat(), parcel.readFloat());
        boolean z3 = false;
        if (parcel.readByte() == 1) {
            z = true;
        } else {
            z = false;
        }
        markerOptions.visible(z);
        if (parcel.readByte() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        markerOptions.draggable(z2);
        if (parcel.readByte() == 1) {
            z3 = true;
        }
        markerOptions.setGps(z3);
        markerOptions.f24140a = parcel.readString();
        markerOptions.zIndex(parcel.readFloat());
        markerOptions.icons(parcel.createTypedArrayList(BitmapDescriptor.f24103a));
        return markerOptions;
    }
}
