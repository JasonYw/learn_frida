package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.maps2d.model.k */
/* loaded from: classes19.dex */
public class C1797k implements Parcelable.Creator<TileOverlayOptions> {
    static {
        Covode.recordClassIndex(5408);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public TileOverlayOptions[] newArray(int i) {
        return new TileOverlayOptions[i];
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public TileOverlayOptions createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        int readInt = parcel.readInt();
        TileProvider tileProvider = (TileProvider) parcel.readValue(TileProvider.class.getClassLoader());
        boolean z3 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        float readFloat = parcel.readFloat();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        String readString = parcel.readString();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (parcel.readByte() == 0) {
            z3 = false;
        }
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions(readInt, null, z, readFloat);
        if (tileProvider != null) {
            tileOverlayOptions.tileProvider(tileProvider);
        }
        tileOverlayOptions.memCacheSize(readInt2);
        tileOverlayOptions.diskCacheSize(readInt3);
        tileOverlayOptions.diskCacheDir(readString);
        tileOverlayOptions.memoryCacheEnabled(z2);
        tileOverlayOptions.diskCacheEnabled(z3);
        return tileOverlayOptions;
    }
}
