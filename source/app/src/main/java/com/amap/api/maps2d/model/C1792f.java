package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.maps2d.model.f */
/* loaded from: classes19.dex */
public class C1792f implements Parcelable.Creator<LatLng> {
    static {
        Covode.recordClassIndex(5403);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LatLng[] newArray(int i) {
        return new LatLng[i];
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LatLng createFromParcel(Parcel parcel) {
        return new LatLng(parcel.readDouble(), parcel.readDouble());
    }
}
