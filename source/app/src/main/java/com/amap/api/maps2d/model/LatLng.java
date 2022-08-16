package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* loaded from: classes19.dex */
public final class LatLng implements Parcelable, Cloneable {
    public static final C1792f CREATOR = new C1792f();

    /* renamed from: a */
    public static DecimalFormat f24133a = new DecimalFormat("0.000000", new DecimalFormatSymbols(Locale.US));
    public final double latitude;
    public final double longitude;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: clone */
    public final LatLng m25277clone() {
        return new LatLng(this.latitude, this.longitude);
    }

    static {
        Covode.recordClassIndex(5373);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "lat/lng: (" + this.latitude + Constants.ACCEPT_TIME_SEPARATOR_SP + this.longitude + ")";
    }

    /* renamed from: a */
    public static double m17132a(double d) {
        try {
            return Double.parseDouble(f24133a.format(d));
        } catch (Throwable unused) {
            return d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        if (Double.doubleToLongBits(this.latitude) == Double.doubleToLongBits(latLng.latitude) && Double.doubleToLongBits(this.longitude) == Double.doubleToLongBits(latLng.longitude)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.longitude);
        parcel.writeDouble(this.latitude);
    }

    public LatLng(double d, double d2) {
        if (-180.0d <= d2 && d2 < 180.0d) {
            this.longitude = m17132a(d2);
        } else {
            this.longitude = m17132a(((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d);
        }
        this.latitude = m17132a(Math.max(-90.0d, Math.min(90.0d, d)));
    }
}
