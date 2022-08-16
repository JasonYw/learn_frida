package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.mapcore2d.C1568cl;
import com.amap.api.mapcore2d.C1569cm;
import com.bytedance.covode.number.Covode;
import p003X.C64859BiX;

/* loaded from: classes19.dex */
public final class CameraPosition implements Parcelable {
    public static final C1788b CREATOR = new C1788b();
    public final float bearing;
    public final boolean isAbroad;
    public final LatLng target;
    public final float tilt;
    public final float zoom;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* loaded from: classes19.dex */
    public static final class Builder {

        /* renamed from: a */
        public LatLng f24107a;

        /* renamed from: b */
        public float f24108b;

        /* renamed from: c */
        public float f24109c;

        /* renamed from: d */
        public float f24110d;

        static {
            Covode.recordClassIndex(5368);
        }

        public Builder() {
        }

        public final CameraPosition build() {
            try {
                if (this.f24107a == null) {
                    return null;
                }
                return new CameraPosition(this.f24107a, this.f24108b, this.f24109c, this.f24110d);
            } catch (Throwable th) {
                C1569cm.m18147a(th, "CameraPosition", "build");
                return null;
            }
        }

        public final Builder bearing(float f) {
            this.f24110d = f;
            return this;
        }

        public final Builder target(LatLng latLng) {
            this.f24107a = latLng;
            return this;
        }

        public final Builder tilt(float f) {
            this.f24109c = f;
            return this;
        }

        public final Builder zoom(float f) {
            this.f24108b = f;
            return this;
        }

        public Builder(CameraPosition cameraPosition) {
            target(cameraPosition.target);
            bearing(cameraPosition.bearing);
            tilt(cameraPosition.tilt);
            zoom(cameraPosition.zoom);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public final int hashCode() {
        return super.hashCode();
    }

    static {
        Covode.recordClassIndex(5367);
    }

    public final String toString() {
        return C1569cm.m18145a(C1569cm.m18148a(C64859BiX.LIZLLL, this.target), C1569cm.m18148a("zoom", Float.valueOf(this.zoom)), C1569cm.m18148a("tilt", Float.valueOf(this.tilt)), C1569cm.m18148a("bearing", Float.valueOf(this.bearing)));
    }

    public static Builder builder(CameraPosition cameraPosition) {
        return new Builder(cameraPosition);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        if (this.target.equals(cameraPosition.target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(cameraPosition.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(cameraPosition.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(cameraPosition.bearing)) {
            return true;
        }
        return false;
    }

    public static final CameraPosition fromLatLngZoom(LatLng latLng, float f) {
        return new CameraPosition(latLng, f, 0.0f, 0.0f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.bearing);
        LatLng latLng = this.target;
        if (latLng != null) {
            parcel.writeFloat((float) latLng.latitude);
            parcel.writeFloat((float) this.target.longitude);
        }
        parcel.writeFloat(this.tilt);
        parcel.writeFloat(this.zoom);
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        this.target = latLng;
        this.zoom = C1569cm.m18143b(f);
        this.tilt = C1569cm.m18158a(f2);
        this.bearing = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        if (latLng != null) {
            this.isAbroad = !C1568cl.m18163a(latLng.latitude, latLng.longitude);
        } else {
            this.isAbroad = false;
        }
    }
}
