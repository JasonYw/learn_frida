package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.maps2d.model.b */
/* loaded from: classes19.dex */
public class C1788b implements Parcelable.Creator<CameraPosition> {
    static {
        Covode.recordClassIndex(5399);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CameraPosition[] newArray(int i) {
        return new CameraPosition[i];
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CameraPosition createFromParcel(Parcel parcel) {
        float readFloat = parcel.readFloat();
        float readFloat2 = parcel.readFloat();
        float readFloat3 = parcel.readFloat();
        float readFloat4 = parcel.readFloat();
        return new CameraPosition(new LatLng(readFloat2, readFloat3), parcel.readFloat(), readFloat4, readFloat);
    }
}
