package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.mapcore2d.C1569cm;
import com.amap.api.maps2d.AMapException;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public final class LatLngBounds implements Parcelable {
    public static final C1791e CREATOR = new C1791e();

    /* renamed from: a */
    public final int f24134a;
    public final LatLng northeast;
    public final LatLng southwest;

    /* renamed from: c */
    public static double m17125c(double d, double d2) {
        return ((d - d2) + 360.0d) % 360.0d;
    }

    /* renamed from: d */
    public static double m17124d(double d, double d2) {
        return ((d2 - d) + 360.0d) % 360.0d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final int m17131a() {
        return this.f24134a;
    }

    public static Builder builder() {
        return new Builder();
    }

    static {
        Covode.recordClassIndex(5374);
    }

    public final int hashCode() {
        return C1569cm.m18146a(new Object[]{this.southwest, this.northeast});
    }

    public final String toString() {
        return C1569cm.m18145a(C1569cm.m18148a("southwest", this.southwest), C1569cm.m18148a("northeast", this.northeast));
    }

    /* loaded from: classes19.dex */
    public static final class Builder {

        /* renamed from: a */
        public double f24135a = Double.POSITIVE_INFINITY;

        /* renamed from: b */
        public double f24136b = Double.NEGATIVE_INFINITY;

        /* renamed from: c */
        public double f24137c = Double.NaN;

        /* renamed from: d */
        public double f24138d = Double.NaN;

        static {
            Covode.recordClassIndex(5375);
        }

        public final LatLngBounds build() {
            try {
                if (Double.isNaN(this.f24137c)) {
                    return null;
                }
                if (this.f24137c > this.f24138d) {
                    double d = this.f24137c;
                    this.f24137c = this.f24138d;
                    this.f24138d = d;
                }
                if (this.f24135a > this.f24136b) {
                    double d2 = this.f24135a;
                    this.f24135a = this.f24136b;
                    this.f24136b = d2;
                }
                return new LatLngBounds(new LatLng(this.f24135a, this.f24137c), new LatLng(this.f24136b, this.f24138d));
            } catch (Throwable th) {
                C1569cm.m18147a(th, "LatLngBounds", "build");
                return null;
            }
        }

        /* renamed from: a */
        private boolean m17123a(double d) {
            double d2 = this.f24137c;
            double d3 = this.f24138d;
            if (d2 <= d3) {
                if (d2 > d || d > d3) {
                    return false;
                }
                return true;
            } else if (d2 > d && d > d3) {
                return false;
            } else {
                return true;
            }
        }

        public final Builder include(LatLng latLng) {
            if (latLng == null) {
                return this;
            }
            this.f24135a = Math.min(this.f24135a, latLng.latitude);
            this.f24136b = Math.max(this.f24136b, latLng.latitude);
            double d = latLng.longitude;
            if (Double.isNaN(this.f24137c)) {
                this.f24137c = d;
            } else {
                if (!m17123a(d)) {
                    if (LatLngBounds.m17125c(this.f24137c, d) < LatLngBounds.m17124d(this.f24138d, d)) {
                        this.f24137c = d;
                        return this;
                    }
                }
                return this;
            }
            this.f24138d = d;
            return this;
        }
    }

    /* renamed from: a */
    private boolean m17130a(double d) {
        if (this.southwest.latitude <= d && d <= this.northeast.latitude) {
            return true;
        }
        return false;
    }

    public final boolean contains(LatLng latLng) {
        if (latLng == null || !m17130a(latLng.latitude) || !m17127b(latLng.longitude)) {
            return false;
        }
        return true;
    }

    public final boolean intersects(LatLngBounds latLngBounds) {
        if (latLngBounds == null) {
            return false;
        }
        if (!m17128a(latLngBounds) && !latLngBounds.m17128a(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m17127b(double d) {
        if (this.southwest.longitude <= this.northeast.longitude) {
            if (this.southwest.longitude > d || d > this.northeast.longitude) {
                return false;
            }
            return true;
        } else if (this.southwest.longitude > d && d > this.northeast.longitude) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean contains(LatLngBounds latLngBounds) {
        if (latLngBounds == null || !contains(latLngBounds.southwest) || !contains(latLngBounds.northeast)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        if (this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast)) {
            return true;
        }
        return false;
    }

    public final LatLngBounds including(LatLng latLng) {
        if (latLng == null) {
            return this;
        }
        double min = Math.min(this.southwest.latitude, latLng.latitude);
        double max = Math.max(this.northeast.latitude, latLng.latitude);
        double d = this.northeast.longitude;
        double d2 = this.southwest.longitude;
        double d3 = latLng.longitude;
        if (!m17127b(d3)) {
            m17125c(d2, d3);
            m17124d(d, d3);
        }
        try {
            return new LatLngBounds(new LatLng(min, d3), new LatLng(max, d3));
        } catch (Throwable unused) {
            return this;
        }
    }

    /* renamed from: a */
    private boolean m17128a(LatLngBounds latLngBounds) {
        LatLng latLng;
        if (latLngBounds != null && (latLng = latLngBounds.northeast) != null && latLngBounds.southwest != null && this.northeast != null && this.southwest != null) {
            double d = ((latLng.longitude + latLngBounds.southwest.longitude) - this.northeast.longitude) - this.southwest.longitude;
            double d2 = ((this.northeast.longitude - this.southwest.longitude) + latLngBounds.northeast.longitude) - this.southwest.longitude;
            double d3 = ((latLngBounds.northeast.latitude + latLngBounds.southwest.latitude) - this.northeast.latitude) - this.southwest.latitude;
            double d4 = ((this.northeast.latitude - this.southwest.latitude) + latLngBounds.northeast.latitude) - latLngBounds.southwest.latitude;
            if (Math.abs(d) < d2 && Math.abs(d3) < d4) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C1791e.m17108a(this, parcel, i);
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        this(1, latLng, latLng2);
    }

    public LatLngBounds(int i, LatLng latLng, LatLng latLng2) {
        if (latLng != null) {
            if (latLng2 != null) {
                if (latLng2.latitude >= latLng.latitude) {
                    this.f24134a = i;
                    this.southwest = latLng;
                    this.northeast = latLng2;
                    return;
                }
                throw new AMapException("southern latitude exceeds northern latitude (" + latLng.latitude + " > " + latLng2.latitude + ")");
            }
            throw new AMapException("null northeast");
        }
        throw new AMapException("null southwest");
    }
}
