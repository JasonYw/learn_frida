package com.amap.api.maps2d.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.mapcore2d.C1569cm;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public final class GroundOverlayOptions implements Parcelable {
    public static final C1790d CREATOR = new C1790d();

    /* renamed from: a */
    public final int f24121a;

    /* renamed from: b */
    public BitmapDescriptor f24122b;

    /* renamed from: c */
    public LatLng f24123c;

    /* renamed from: d */
    public float f24124d;

    /* renamed from: e */
    public float f24125e;

    /* renamed from: f */
    public LatLngBounds f24126f;

    /* renamed from: g */
    public float f24127g;

    /* renamed from: h */
    public float f24128h;

    /* renamed from: i */
    public boolean f24129i;

    /* renamed from: j */
    public float f24130j;

    /* renamed from: k */
    public float f24131k;

    /* renamed from: l */
    public float f24132l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float getAnchorU() {
        return this.f24131k;
    }

    public final float getAnchorV() {
        return this.f24132l;
    }

    public final float getBearing() {
        return this.f24127g;
    }

    public final LatLngBounds getBounds() {
        return this.f24126f;
    }

    public final float getHeight() {
        return this.f24125e;
    }

    public final BitmapDescriptor getImage() {
        return this.f24122b;
    }

    public final LatLng getLocation() {
        return this.f24123c;
    }

    public final float getTransparency() {
        return this.f24130j;
    }

    public final float getWidth() {
        return this.f24124d;
    }

    public final float getZIndex() {
        return this.f24128h;
    }

    public final boolean isVisible() {
        return this.f24129i;
    }

    static {
        Covode.recordClassIndex(5372);
    }

    public GroundOverlayOptions() {
        this.f24129i = true;
        this.f24131k = 0.5f;
        this.f24132l = 0.5f;
        this.f24121a = 1;
    }

    public final GroundOverlayOptions bearing(float f) {
        this.f24127g = f;
        return this;
    }

    public final GroundOverlayOptions image(BitmapDescriptor bitmapDescriptor) {
        this.f24122b = bitmapDescriptor;
        return this;
    }

    public final GroundOverlayOptions visible(boolean z) {
        this.f24129i = z;
        return this;
    }

    public final GroundOverlayOptions zIndex(float f) {
        this.f24128h = f;
        return this;
    }

    public final GroundOverlayOptions positionFromBounds(LatLngBounds latLngBounds) {
        try {
            this.f24126f = latLngBounds;
            return this;
        } catch (Exception e) {
            C1569cm.m18147a(e, "GroundOverlayOptions", "positionFromBounds");
            return null;
        }
    }

    public final GroundOverlayOptions transparency(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        try {
            this.f24130j = f;
            return this;
        } catch (Exception e) {
            C1569cm.m18147a(e, "GroundOverlayOptions", "transparency");
            return null;
        }
    }

    public final GroundOverlayOptions anchor(float f, float f2) {
        this.f24131k = f;
        this.f24132l = f2;
        return this;
    }

    public final GroundOverlayOptions position(LatLng latLng, float f) {
        try {
            m17133a(latLng, f, f);
            return this;
        } catch (Exception e) {
            C1569cm.m18147a(e, "GroundOverlayOptions", "position");
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f24121a);
        parcel.writeParcelable(this.f24122b, i);
        parcel.writeParcelable(this.f24123c, i);
        parcel.writeFloat(this.f24124d);
        parcel.writeFloat(this.f24125e);
        parcel.writeParcelable(this.f24126f, i);
        parcel.writeFloat(this.f24127g);
        parcel.writeFloat(this.f24128h);
        parcel.writeByte(this.f24129i ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.f24130j);
        parcel.writeFloat(this.f24131k);
        parcel.writeFloat(this.f24132l);
    }

    /* renamed from: a */
    private GroundOverlayOptions m17133a(LatLng latLng, float f, float f2) {
        this.f24123c = latLng;
        this.f24124d = f;
        this.f24125e = f2;
        return this;
    }

    public final GroundOverlayOptions position(LatLng latLng, float f, float f2) {
        try {
            m17133a(latLng, f, f2);
            return this;
        } catch (Exception e) {
            C1569cm.m18147a(e, "GroundOverlayOptions", "position");
            return null;
        }
    }

    public GroundOverlayOptions(int i, IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7) {
        this.f24129i = true;
        this.f24131k = 0.5f;
        this.f24132l = 0.5f;
        this.f24121a = i;
        this.f24122b = BitmapDescriptorFactory.fromBitmap(null);
        this.f24123c = latLng;
        this.f24124d = f;
        this.f24125e = f2;
        this.f24126f = latLngBounds;
        this.f24127g = f3;
        this.f24128h = f4;
        this.f24129i = z;
        this.f24130j = f5;
        this.f24131k = f6;
        this.f24132l = f7;
    }
}
