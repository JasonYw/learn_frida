package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.maps2d.model.d */
/* loaded from: classes19.dex */
public class C1790d implements Parcelable.Creator<GroundOverlayOptions> {
    static {
        Covode.recordClassIndex(5401);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GroundOverlayOptions[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GroundOverlayOptions createFromParcel(Parcel parcel) {
        boolean z;
        int readInt = parcel.readInt();
        BitmapDescriptor bitmapDescriptor = (BitmapDescriptor) parcel.readParcelable(BitmapDescriptor.class.getClassLoader());
        LatLng latLng = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        float readFloat = parcel.readFloat();
        float readFloat2 = parcel.readFloat();
        LatLngBounds latLngBounds = (LatLngBounds) parcel.readParcelable(LatLngBounds.class.getClassLoader());
        float readFloat3 = parcel.readFloat();
        float readFloat4 = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions(readInt, null, latLng, readFloat, readFloat2, latLngBounds, readFloat3, readFloat4, z, parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        groundOverlayOptions.image(bitmapDescriptor);
        return groundOverlayOptions;
    }
}
