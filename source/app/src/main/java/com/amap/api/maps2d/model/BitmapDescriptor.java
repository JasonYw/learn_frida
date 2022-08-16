package com.amap.api.maps2d.model;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.mapcore2d.C1569cm;
import com.bytedance.covode.number.Covode;
import p003X.C116971W2r;

/* loaded from: classes19.dex */
public final class BitmapDescriptor implements Parcelable, Cloneable {

    /* renamed from: a */
    public static final C1787a f24103a = new C1787a();

    /* renamed from: b */
    public int f24104b;

    /* renamed from: c */
    public int f24105c;

    /* renamed from: d */
    public Bitmap f24106d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Bitmap getBitmap() {
        return this.f24106d;
    }

    public final int getHeight() {
        return this.f24105c;
    }

    public final int getWidth() {
        return this.f24104b;
    }

    static {
        Covode.recordClassIndex(5365);
    }

    /* renamed from: clone */
    public final BitmapDescriptor m25276clone() {
        try {
            return new BitmapDescriptor(C116971W2r.LIZ(this.f24106d), this.f24104b, this.f24105c);
        } catch (Throwable th) {
            C1569cm.m18147a(th, "BitmapDescriptor", "clone");
            return null;
        }
    }

    public final void recycle() {
        Bitmap bitmap = this.f24106d;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f24106d.recycle();
            this.f24106d = null;
        }
    }

    public BitmapDescriptor(Bitmap bitmap) {
        if (bitmap != null) {
            this.f24104b = bitmap.getWidth();
            this.f24105c = bitmap.getHeight();
            this.f24106d = bitmap;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f24106d, i);
        parcel.writeInt(this.f24104b);
        parcel.writeInt(this.f24105c);
    }

    public BitmapDescriptor(Bitmap bitmap, int i, int i2) {
        this.f24104b = i;
        this.f24105c = i2;
        this.f24106d = bitmap;
    }
}
