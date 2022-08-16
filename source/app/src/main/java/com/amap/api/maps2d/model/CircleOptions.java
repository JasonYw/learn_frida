package com.amap.api.maps2d.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.ViewCompat;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public final class CircleOptions implements Parcelable {
    public static final C1789c CREATOR = new C1789c();

    /* renamed from: a */
    public String f24112a;

    /* renamed from: b */
    public LatLng f24113b;

    /* renamed from: c */
    public double f24114c;

    /* renamed from: f */
    public int f24117f;

    /* renamed from: g */
    public float f24118g;

    /* renamed from: d */
    public float f24115d = 10.0f;

    /* renamed from: e */
    public int f24116e = ViewCompat.MEASURED_STATE_MASK;

    /* renamed from: h */
    public boolean f24119h = true;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final LatLng getCenter() {
        return this.f24113b;
    }

    public final int getFillColor() {
        return this.f24117f;
    }

    public final double getRadius() {
        return this.f24114c;
    }

    public final int getStrokeColor() {
        return this.f24116e;
    }

    public final float getStrokeWidth() {
        return this.f24115d;
    }

    public final float getZIndex() {
        return this.f24118g;
    }

    public final boolean isVisible() {
        return this.f24119h;
    }

    static {
        Covode.recordClassIndex(5370);
    }

    public final CircleOptions center(LatLng latLng) {
        this.f24113b = latLng;
        return this;
    }

    public final CircleOptions fillColor(int i) {
        this.f24117f = i;
        return this;
    }

    public final CircleOptions radius(double d) {
        this.f24114c = d;
        return this;
    }

    public final CircleOptions strokeColor(int i) {
        this.f24116e = i;
        return this;
    }

    public final CircleOptions strokeWidth(float f) {
        this.f24115d = f;
        return this;
    }

    public final CircleOptions visible(boolean z) {
        this.f24119h = z;
        return this;
    }

    public final CircleOptions zIndex(float f) {
        this.f24118g = f;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        LatLng latLng = this.f24113b;
        if (latLng != null) {
            bundle.putDouble("lat", latLng.latitude);
            bundle.putDouble("lng", this.f24113b.longitude);
        }
        parcel.writeBundle(bundle);
        parcel.writeDouble(this.f24114c);
        parcel.writeFloat(this.f24115d);
        parcel.writeInt(this.f24116e);
        parcel.writeInt(this.f24117f);
        parcel.writeFloat(this.f24118g);
        parcel.writeByte(this.f24119h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f24112a);
    }
}
