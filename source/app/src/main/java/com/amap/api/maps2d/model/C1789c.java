package com.amap.api.maps2d.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.maps2d.model.c */
/* loaded from: classes19.dex */
public class C1789c implements Parcelable.Creator<CircleOptions> {
    static {
        Covode.recordClassIndex(5400);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CircleOptions[] newArray(int i) {
        return new CircleOptions[i];
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CircleOptions createFromParcel(Parcel parcel) {
        CircleOptions circleOptions = new CircleOptions();
        Bundle readBundle = parcel.readBundle();
        circleOptions.center(new LatLng(readBundle.getDouble("lat"), readBundle.getDouble("lng")));
        circleOptions.radius(parcel.readDouble());
        circleOptions.strokeWidth(parcel.readFloat());
        circleOptions.strokeColor(parcel.readInt());
        circleOptions.fillColor(parcel.readInt());
        circleOptions.zIndex(parcel.readInt());
        boolean z = true;
        if (parcel.readByte() != 1) {
            z = false;
        }
        circleOptions.visible(z);
        circleOptions.f24112a = parcel.readString();
        return circleOptions;
    }
}
