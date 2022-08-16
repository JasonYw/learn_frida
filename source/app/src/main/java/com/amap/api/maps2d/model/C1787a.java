package com.amap.api.maps2d.model;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.maps2d.model.a */
/* loaded from: classes19.dex */
public class C1787a implements Parcelable.Creator<BitmapDescriptor> {
    static {
        Covode.recordClassIndex(5398);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public BitmapDescriptor[] newArray(int i) {
        return new BitmapDescriptor[i];
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public BitmapDescriptor createFromParcel(Parcel parcel) {
        BitmapDescriptor bitmapDescriptor = new BitmapDescriptor(null);
        bitmapDescriptor.f24106d = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        bitmapDescriptor.f24104b = parcel.readInt();
        bitmapDescriptor.f24105c = parcel.readInt();
        return bitmapDescriptor;
    }
}
