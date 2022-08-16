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
public final class PolylineOptions implements Parcelable {
    public static final C1795i CREATOR = new C1795i();

    /* renamed from: a */
    public String f24178a;

    /* renamed from: e */
    public float f24182e;

    /* renamed from: g */
    public boolean f24184g;

    /* renamed from: h */
    public boolean f24185h;

    /* renamed from: c */
    public float f24180c = 10.0f;

    /* renamed from: d */
    public int f24181d = ViewCompat.MEASURED_STATE_MASK;

    /* renamed from: f */
    public boolean f24183f = true;

    /* renamed from: b */
    public final List<LatLng> f24179b = new ArrayList();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int getColor() {
        return this.f24181d;
    }

    public final List<LatLng> getPoints() {
        return this.f24179b;
    }

    public final float getWidth() {
        return this.f24180c;
    }

    public final float getZIndex() {
        return this.f24182e;
    }

    public final boolean isDottedLine() {
        return this.f24185h;
    }

    public final boolean isGeodesic() {
        return this.f24184g;
    }

    public final boolean isVisible() {
        return this.f24183f;
    }

    static {
        Covode.recordClassIndex(5386);
    }

    public final PolylineOptions color(int i) {
        this.f24181d = i;
        return this;
    }

    public final PolylineOptions geodesic(boolean z) {
        this.f24184g = z;
        return this;
    }

    public final PolylineOptions setDottedLine(boolean z) {
        this.f24185h = z;
        return this;
    }

    public final PolylineOptions visible(boolean z) {
        this.f24183f = z;
        return this;
    }

    public final PolylineOptions width(float f) {
        this.f24180c = f;
        return this;
    }

    public final PolylineOptions zIndex(float f) {
        this.f24182e = f;
        return this;
    }

    public final PolylineOptions add(LatLng latLng) {
        this.f24179b.add(latLng);
        return this;
    }

    public final PolylineOptions add(LatLng... latLngArr) {
        this.f24179b.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public final PolylineOptions addAll(Iterable<LatLng> iterable) {
        if (iterable != null) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<LatLng> it = iterable.iterator();
                if (it != null) {
                    while (it.hasNext()) {
                        arrayList.add(it.next());
                    }
                }
                this.f24179b.addAll(arrayList);
            } catch (Throwable unused) {
            }
        }
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(getPoints());
        parcel.writeFloat(getWidth());
        parcel.writeInt(getColor());
        parcel.writeFloat(getZIndex());
        parcel.writeByte(isVisible() ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f24178a);
        parcel.writeByte(isGeodesic() ? (byte) 1 : (byte) 0);
        parcel.writeByte(isDottedLine() ? (byte) 1 : (byte) 0);
    }
}
