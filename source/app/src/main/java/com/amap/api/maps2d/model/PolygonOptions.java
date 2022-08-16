package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.ViewCompat;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes19.dex */
public final class PolygonOptions implements Parcelable {
    public static final C1794h CREATOR = new C1794h();

    /* renamed from: a */
    public String f24170a;

    /* renamed from: f */
    public float f24175f;

    /* renamed from: c */
    public float f24172c = 10.0f;

    /* renamed from: d */
    public int f24173d = ViewCompat.MEASURED_STATE_MASK;

    /* renamed from: e */
    public int f24174e = ViewCompat.MEASURED_STATE_MASK;

    /* renamed from: g */
    public boolean f24176g = true;

    /* renamed from: b */
    public final List<LatLng> f24171b = new ArrayList();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int getFillColor() {
        return this.f24174e;
    }

    public final List<LatLng> getPoints() {
        return this.f24171b;
    }

    public final int getStrokeColor() {
        return this.f24173d;
    }

    public final float getStrokeWidth() {
        return this.f24172c;
    }

    public final float getZIndex() {
        return this.f24175f;
    }

    public final boolean isVisible() {
        return this.f24176g;
    }

    static {
        Covode.recordClassIndex(5384);
    }

    public final PolygonOptions fillColor(int i) {
        this.f24174e = i;
        return this;
    }

    public final PolygonOptions strokeColor(int i) {
        this.f24173d = i;
        return this;
    }

    public final PolygonOptions strokeWidth(float f) {
        this.f24172c = f;
        return this;
    }

    public final PolygonOptions visible(boolean z) {
        this.f24176g = z;
        return this;
    }

    public final PolygonOptions zIndex(float f) {
        this.f24175f = f;
        return this;
    }

    public final PolygonOptions add(LatLng latLng) {
        this.f24171b.add(latLng);
        return this;
    }

    public final PolygonOptions add(LatLng... latLngArr) {
        this.f24171b.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public final PolygonOptions addAll(Iterable<LatLng> iterable) {
        if (iterable == null) {
            return this;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<LatLng> it = iterable.iterator();
            if (it != null) {
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            this.f24171b.addAll(arrayList);
        } catch (Throwable unused) {
        }
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f24171b);
        parcel.writeFloat(this.f24172c);
        parcel.writeInt(this.f24173d);
        parcel.writeInt(this.f24174e);
        parcel.writeFloat(this.f24175f);
        parcel.writeByte((byte) (!this.f24176g ? 1 : 0));
        parcel.writeString(this.f24170a);
    }
}
