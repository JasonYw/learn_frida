package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.maps2d.model.j */
/* loaded from: classes19.dex */
public class C1796j implements Parcelable.Creator<Tile> {
    static {
        Covode.recordClassIndex(5407);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Tile[] newArray(int i) {
        return new Tile[i];
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Tile createFromParcel(Parcel parcel) {
        return new Tile(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createByteArray());
    }
}
