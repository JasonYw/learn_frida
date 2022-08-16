package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.mapcore2d.C1569cm;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public final class VisibleRegion implements Parcelable {
    public static final C1798l CREATOR = new C1798l();

    /* renamed from: a */
    public final int f24220a;
    public final LatLng farLeft;
    public final LatLng farRight;
    public final LatLngBounds latLngBounds;
    public final LatLng nearLeft;
    public final LatLng nearRight;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final int m17119a() {
        return this.f24220a;
    }

    static {
        Covode.recordClassIndex(5397);
    }

    public final int hashCode() {
        return C1569cm.m18146a(new Object[]{this.nearLeft, this.nearRight, this.farLeft, this.farRight, this.latLngBounds});
    }

    public final String toString() {
        return C1569cm.m18145a(C1569cm.m18148a("nearLeft", this.nearLeft), C1569cm.m18148a("nearRight", this.nearRight), C1569cm.m18148a("farLeft", this.farLeft), C1569cm.m18148a("farRight", this.farRight), C1569cm.m18148a("latLngBounds", this.latLngBounds));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        if (this.nearLeft.equals(visibleRegion.nearLeft) && this.nearRight.equals(visibleRegion.nearRight) && this.farLeft.equals(visibleRegion.farLeft) && this.farRight.equals(visibleRegion.farRight) && this.latLngBounds.equals(visibleRegion.latLngBounds)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C1798l.m17093a(this, parcel, i);
    }

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this(1, latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    public VisibleRegion(int i, LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f24220a = i;
        this.nearLeft = latLng;
        this.nearRight = latLng2;
        this.farLeft = latLng3;
        this.farRight = latLng4;
        this.latLngBounds = latLngBounds;
    }
}
