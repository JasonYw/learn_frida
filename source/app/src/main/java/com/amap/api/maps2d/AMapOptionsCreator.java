package com.amap.api.maps2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.maps2d.model.CameraPosition;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class AMapOptionsCreator implements Parcelable.Creator<AMapOptions> {
    static {
        Covode.recordClassIndex(5349);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    /* renamed from: newArray */
    public AMapOptions[] mo25275newArray(int i) {
        return new AMapOptions[i];
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    /* renamed from: createFromParcel */
    public AMapOptions mo25274createFromParcel(Parcel parcel) {
        AMapOptions aMapOptions = new AMapOptions();
        aMapOptions.mapType(parcel.readInt());
        aMapOptions.camera((CameraPosition) parcel.readParcelable(CameraPosition.class.getClassLoader()));
        boolean[] createBooleanArray = parcel.createBooleanArray();
        if (createBooleanArray != null && createBooleanArray.length >= 6) {
            aMapOptions.scrollGesturesEnabled(createBooleanArray[0]);
            aMapOptions.zoomGesturesEnabled(createBooleanArray[1]);
            aMapOptions.zoomControlsEnabled(createBooleanArray[2]);
            aMapOptions.zOrderOnTop(createBooleanArray[3]);
            aMapOptions.compassEnabled(createBooleanArray[4]);
            aMapOptions.scaleControlsEnabled(createBooleanArray[5]);
        }
        return aMapOptions;
    }
}
