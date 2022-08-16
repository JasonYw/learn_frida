package com.amap.api.maps2d.model;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.mapcore2d.C1569cm;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.maps2d.model.l */
/* loaded from: classes19.dex */
public class C1798l implements Parcelable.Creator<VisibleRegion> {
    static {
        Covode.recordClassIndex(5409);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public VisibleRegion[] newArray(int i) {
        return new VisibleRegion[i];
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public VisibleRegion createFromParcel(Parcel parcel) {
        LatLng latLng;
        LatLng latLng2;
        LatLng latLng3;
        LatLng latLng4;
        LatLngBounds latLngBounds;
        int readInt = parcel.readInt();
        try {
            latLng = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
            try {
                latLng2 = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
                try {
                    latLng3 = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
                    try {
                        latLng4 = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
                    } catch (BadParcelableException e) {
                        e = e;
                        latLng4 = null;
                    }
                } catch (BadParcelableException e2) {
                    e = e2;
                    latLng3 = null;
                    latLng4 = latLng3;
                    C1569cm.m18147a(e, "VisibleRegionCreator", "createFromParcel");
                    latLngBounds = null;
                    return new VisibleRegion(readInt, latLng, latLng2, latLng3, latLng4, latLngBounds);
                }
            } catch (BadParcelableException e3) {
                e = e3;
                latLng2 = null;
                latLng3 = latLng2;
                latLng4 = latLng3;
                C1569cm.m18147a(e, "VisibleRegionCreator", "createFromParcel");
                latLngBounds = null;
                return new VisibleRegion(readInt, latLng, latLng2, latLng3, latLng4, latLngBounds);
            }
            try {
                latLngBounds = (LatLngBounds) parcel.readParcelable(LatLngBounds.class.getClassLoader());
            } catch (BadParcelableException e4) {
                e = e4;
                C1569cm.m18147a(e, "VisibleRegionCreator", "createFromParcel");
                latLngBounds = null;
                return new VisibleRegion(readInt, latLng, latLng2, latLng3, latLng4, latLngBounds);
            }
        } catch (BadParcelableException e5) {
            e = e5;
            latLng = null;
            latLng2 = null;
        }
        return new VisibleRegion(readInt, latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    /* renamed from: a */
    public static void m17093a(VisibleRegion visibleRegion, Parcel parcel, int i) {
        parcel.writeInt(visibleRegion.m17119a());
        parcel.writeParcelable(visibleRegion.nearLeft, i);
        parcel.writeParcelable(visibleRegion.nearRight, i);
        parcel.writeParcelable(visibleRegion.farLeft, i);
        parcel.writeParcelable(visibleRegion.farRight, i);
        parcel.writeParcelable(visibleRegion.latLngBounds, i);
    }
}
