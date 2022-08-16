package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.amap.api.maps2d.model.h */
/* loaded from: classes19.dex */
public class C1794h implements Parcelable.Creator<PolygonOptions> {
    static {
        Covode.recordClassIndex(5405);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PolygonOptions[] newArray(int i) {
        return new PolygonOptions[i];
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PolygonOptions createFromParcel(Parcel parcel) {
        boolean z;
        PolygonOptions polygonOptions = new PolygonOptions();
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, LatLng.CREATOR);
        float readFloat = parcel.readFloat();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        float readFloat2 = parcel.readFloat();
        if (parcel.readByte() == 0) {
            z = true;
        } else {
            z = false;
        }
        polygonOptions.add((LatLng[]) arrayList.toArray(new LatLng[arrayList.size()]));
        polygonOptions.strokeWidth(readFloat);
        polygonOptions.strokeColor(readInt);
        polygonOptions.fillColor(readInt2);
        polygonOptions.zIndex(readFloat2);
        polygonOptions.visible(z);
        polygonOptions.f24170a = parcel.readString();
        return polygonOptions;
    }
}
