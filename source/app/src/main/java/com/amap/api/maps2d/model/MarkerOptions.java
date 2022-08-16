package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* loaded from: classes19.dex */
public final class MarkerOptions implements Parcelable {
    public static final C1793g CREATOR = new C1793g();

    /* renamed from: a */
    public String f24140a;

    /* renamed from: b */
    public LatLng f24141b;

    /* renamed from: c */
    public String f24142c;

    /* renamed from: d */
    public String f24143d;

    /* renamed from: g */
    public boolean f24146g;

    /* renamed from: i */
    public boolean f24148i;

    /* renamed from: j */
    public float f24149j;

    /* renamed from: e */
    public float f24144e = 0.5f;

    /* renamed from: f */
    public float f24145f = 1.0f;

    /* renamed from: h */
    public boolean f24147h = true;

    /* renamed from: k */
    public ArrayList<BitmapDescriptor> f24150k = new ArrayList<>();

    /* renamed from: l */
    public int f24151l = 20;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float getAnchorU() {
        return this.f24144e;
    }

    public final float getAnchorV() {
        return this.f24145f;
    }

    public final ArrayList<BitmapDescriptor> getIcons() {
        return this.f24150k;
    }

    public final int getPeriod() {
        return this.f24151l;
    }

    public final LatLng getPosition() {
        return this.f24141b;
    }

    public final String getSnippet() {
        return this.f24143d;
    }

    public final String getTitle() {
        return this.f24142c;
    }

    public final float getZIndex() {
        return this.f24149j;
    }

    public final boolean isDraggable() {
        return this.f24146g;
    }

    public final boolean isGps() {
        return this.f24148i;
    }

    public final boolean isVisible() {
        return this.f24147h;
    }

    static {
        Covode.recordClassIndex(5377);
    }

    /* renamed from: a */
    private void m17122a() {
        if (this.f24150k == null) {
            this.f24150k = new ArrayList<>();
        }
    }

    public final BitmapDescriptor getIcon() {
        ArrayList<BitmapDescriptor> arrayList = this.f24150k;
        if (arrayList != null && arrayList.size() != 0) {
            return this.f24150k.get(0);
        }
        return null;
    }

    public final MarkerOptions draggable(boolean z) {
        this.f24146g = z;
        return this;
    }

    public final MarkerOptions icons(ArrayList<BitmapDescriptor> arrayList) {
        this.f24150k = arrayList;
        return this;
    }

    public final MarkerOptions position(LatLng latLng) {
        this.f24141b = latLng;
        return this;
    }

    public final MarkerOptions setGps(boolean z) {
        this.f24148i = z;
        return this;
    }

    public final MarkerOptions snippet(String str) {
        this.f24143d = str;
        return this;
    }

    public final MarkerOptions title(String str) {
        this.f24142c = str;
        return this;
    }

    public final MarkerOptions visible(boolean z) {
        this.f24147h = z;
        return this;
    }

    public final MarkerOptions zIndex(float f) {
        this.f24149j = f;
        return this;
    }

    public final MarkerOptions icon(BitmapDescriptor bitmapDescriptor) {
        try {
            m17122a();
            this.f24150k.clear();
            this.f24150k.add(bitmapDescriptor);
        } catch (Throwable unused) {
        }
        return this;
    }

    public final MarkerOptions period(int i) {
        if (i <= 1) {
            this.f24151l = 1;
            return this;
        }
        this.f24151l = i;
        return this;
    }

    public final MarkerOptions anchor(float f, float f2) {
        this.f24144e = f;
        this.f24145f = f2;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f24141b, i);
        ArrayList<BitmapDescriptor> arrayList = this.f24150k;
        if (arrayList != null && arrayList.size() != 0) {
            parcel.writeParcelable(this.f24150k.get(0), i);
        }
        parcel.writeString(this.f24142c);
        parcel.writeString(this.f24143d);
        parcel.writeFloat(this.f24144e);
        parcel.writeFloat(this.f24145f);
        parcel.writeByte(this.f24147h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f24146g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f24148i ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f24140a);
        parcel.writeFloat(this.f24149j);
        parcel.writeList(this.f24150k);
    }
}
