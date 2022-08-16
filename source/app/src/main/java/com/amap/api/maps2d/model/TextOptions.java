package com.amap.api.maps2d.model;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.ViewCompat;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class TextOptions implements Parcelable {
    public static final TextOptionsCreator CREATOR = new TextOptionsCreator();

    /* renamed from: a */
    public String f24193a;

    /* renamed from: d */
    public float f24196d;

    /* renamed from: e */
    public LatLng f24197e;

    /* renamed from: f */
    public float f24198f;

    /* renamed from: g */
    public int f24199g;

    /* renamed from: h */
    public Object f24200h;

    /* renamed from: b */
    public Typeface f24194b = Typeface.DEFAULT;

    /* renamed from: c */
    public boolean f24195c = true;

    /* renamed from: i */
    public int f24201i = ViewCompat.MEASURED_STATE_MASK;

    /* renamed from: j */
    public int f24202j = 20;

    /* renamed from: k */
    public int f24203k = 3;

    /* renamed from: l */
    public int f24204l = 6;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAlignX() {
        return this.f24203k;
    }

    public int getAlignY() {
        return this.f24204l;
    }

    public int getBackgroundColor() {
        return this.f24199g;
    }

    public int getFontColor() {
        return this.f24201i;
    }

    public int getFontSize() {
        return this.f24202j;
    }

    public Object getObject() {
        return this.f24200h;
    }

    public LatLng getPosition() {
        return this.f24197e;
    }

    public float getRotate() {
        return this.f24198f;
    }

    public String getText() {
        return this.f24193a;
    }

    public Typeface getTypeface() {
        return this.f24194b;
    }

    public float getZIndex() {
        return this.f24196d;
    }

    public boolean isVisible() {
        return this.f24195c;
    }

    static {
        Covode.recordClassIndex(5390);
    }

    public TextOptions backgroundColor(int i) {
        this.f24199g = i;
        return this;
    }

    public TextOptions fontColor(int i) {
        this.f24201i = i;
        return this;
    }

    public TextOptions fontSize(int i) {
        this.f24202j = i;
        return this;
    }

    public TextOptions position(LatLng latLng) {
        this.f24197e = latLng;
        return this;
    }

    public TextOptions rotate(float f) {
        this.f24198f = f;
        return this;
    }

    public TextOptions setObject(Object obj) {
        this.f24200h = obj;
        return this;
    }

    public TextOptions text(String str) {
        this.f24193a = str;
        return this;
    }

    public TextOptions typeface(Typeface typeface) {
        this.f24194b = typeface;
        return this;
    }

    public TextOptions visible(boolean z) {
        this.f24195c = z;
        return this;
    }

    public TextOptions zIndex(float f) {
        this.f24196d = f;
        return this;
    }

    public TextOptions align(int i, int i2) {
        this.f24203k = i;
        this.f24204l = i2;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        LatLng latLng = this.f24197e;
        if (latLng != null) {
            bundle.putDouble("lat", latLng.latitude);
            bundle.putDouble("lng", this.f24197e.longitude);
        }
        parcel.writeBundle(bundle);
        parcel.writeString(this.f24193a);
        parcel.writeInt(this.f24194b.getStyle());
        parcel.writeFloat(this.f24198f);
        parcel.writeInt(this.f24203k);
        parcel.writeInt(this.f24204l);
        parcel.writeInt(this.f24199g);
        parcel.writeInt(this.f24201i);
        parcel.writeInt(this.f24202j);
        parcel.writeFloat(this.f24196d);
        parcel.writeByte(this.f24195c ? (byte) 1 : (byte) 0);
        if (this.f24200h instanceof Parcelable) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("obj", (Parcelable) this.f24200h);
            parcel.writeBundle(bundle2);
        }
    }
}
