package com.amap.api.maps2d.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public final class TileOverlayOptions implements Parcelable {
    public static final C1797k CREATOR = new C1797k();

    /* renamed from: a */
    public final int f24209a;

    /* renamed from: b */
    public TileProvider f24210b;

    /* renamed from: c */
    public boolean f24211c;

    /* renamed from: d */
    public float f24212d;

    /* renamed from: e */
    public int f24213e;

    /* renamed from: f */
    public int f24214f;

    /* renamed from: g */
    public String f24215g;

    /* renamed from: h */
    public boolean f24216h;

    /* renamed from: i */
    public boolean f24217i;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getDiskCacheDir() {
        return this.f24215g;
    }

    public final boolean getDiskCacheEnabled() {
        return this.f24217i;
    }

    public final int getDiskCacheSize() {
        return this.f24214f;
    }

    public final int getMemCacheSize() {
        return this.f24213e;
    }

    public final boolean getMemoryCacheEnabled() {
        return this.f24216h;
    }

    public final TileProvider getTileProvider() {
        return this.f24210b;
    }

    public final float getZIndex() {
        return this.f24212d;
    }

    public final boolean isVisible() {
        return this.f24211c;
    }

    static {
        Covode.recordClassIndex(5394);
    }

    public TileOverlayOptions() {
        this.f24211c = true;
        this.f24213e = 5120;
        this.f24214f = 20480;
        this.f24216h = true;
        this.f24217i = true;
        this.f24209a = 1;
    }

    public final TileOverlayOptions diskCacheDir(String str) {
        this.f24215g = str;
        return this;
    }

    public final TileOverlayOptions diskCacheEnabled(boolean z) {
        this.f24217i = z;
        return this;
    }

    public final TileOverlayOptions memCacheSize(int i) {
        this.f24213e = i;
        return this;
    }

    public final TileOverlayOptions memoryCacheEnabled(boolean z) {
        this.f24216h = z;
        return this;
    }

    public final TileOverlayOptions tileProvider(TileProvider tileProvider) {
        this.f24210b = tileProvider;
        return this;
    }

    public final TileOverlayOptions visible(boolean z) {
        this.f24211c = z;
        return this;
    }

    public final TileOverlayOptions zIndex(float f) {
        this.f24212d = f;
        return this;
    }

    public final TileOverlayOptions diskCacheSize(int i) {
        this.f24214f = i * AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f24209a);
        parcel.writeValue(this.f24210b);
        parcel.writeByte(this.f24211c ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.f24212d);
        parcel.writeInt(this.f24213e);
        parcel.writeInt(this.f24214f);
        parcel.writeString(this.f24215g);
        parcel.writeByte(this.f24216h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f24217i ? (byte) 1 : (byte) 0);
    }

    public TileOverlayOptions(int i, IBinder iBinder, boolean z, float f) {
        this.f24211c = true;
        this.f24213e = 5120;
        this.f24214f = 20480;
        this.f24216h = true;
        this.f24217i = true;
        this.f24209a = i;
        this.f24211c = z;
        this.f24212d = f;
    }
}
