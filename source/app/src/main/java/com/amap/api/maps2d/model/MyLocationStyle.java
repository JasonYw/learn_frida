package com.amap.api.maps2d.model;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.MotionEventCompat;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class MyLocationStyle implements Parcelable {
    public static final MyLocationStyleCreator CREATOR = new MyLocationStyleCreator();

    /* renamed from: a */
    public BitmapDescriptor f24152a;

    /* renamed from: b */
    public float f24153b = 0.5f;

    /* renamed from: c */
    public float f24154c = 0.5f;

    /* renamed from: d */
    public int f24155d = Color.argb(100, 0, 0, 180);

    /* renamed from: e */
    public int f24156e = Color.argb((int) MotionEventCompat.ACTION_MASK, 0, 0, 220);

    /* renamed from: f */
    public float f24157f = 1.0f;

    /* renamed from: g */
    public int f24158g = 1;

    /* renamed from: h */
    public long f24159h = 2000;

    /* renamed from: i */
    public boolean f24160i = true;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getAnchorU() {
        return this.f24153b;
    }

    public float getAnchorV() {
        return this.f24154c;
    }

    public long getInterval() {
        return this.f24159h;
    }

    public BitmapDescriptor getMyLocationIcon() {
        return this.f24152a;
    }

    public int getMyLocationType() {
        return this.f24158g;
    }

    public int getRadiusFillColor() {
        return this.f24155d;
    }

    public int getStrokeColor() {
        return this.f24156e;
    }

    public float getStrokeWidth() {
        return this.f24157f;
    }

    public boolean isMyLocationShowing() {
        return this.f24160i;
    }

    static {
        Covode.recordClassIndex(5378);
    }

    public MyLocationStyle interval(long j) {
        this.f24159h = j;
        return this;
    }

    public MyLocationStyle myLocationIcon(BitmapDescriptor bitmapDescriptor) {
        this.f24152a = bitmapDescriptor;
        return this;
    }

    public MyLocationStyle myLocationType(int i) {
        this.f24158g = i;
        return this;
    }

    public MyLocationStyle radiusFillColor(int i) {
        this.f24155d = i;
        return this;
    }

    public MyLocationStyle showMyLocation(boolean z) {
        this.f24160i = z;
        return this;
    }

    public MyLocationStyle strokeColor(int i) {
        this.f24156e = i;
        return this;
    }

    public MyLocationStyle strokeWidth(float f) {
        this.f24157f = f;
        return this;
    }

    public MyLocationStyle anchor(float f, float f2) {
        this.f24153b = f;
        this.f24154c = f2;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f24152a, i);
        parcel.writeFloat(this.f24153b);
        parcel.writeFloat(this.f24154c);
        parcel.writeInt(this.f24155d);
        parcel.writeInt(this.f24156e);
        parcel.writeFloat(this.f24157f);
        parcel.writeInt(this.f24158g);
        parcel.writeLong(this.f24159h);
        parcel.writeBooleanArray(new boolean[]{this.f24160i});
    }
}
