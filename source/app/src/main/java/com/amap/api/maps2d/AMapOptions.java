package com.amap.api.maps2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.maps2d.model.CameraPosition;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class AMapOptions implements Parcelable {
    public static final AMapOptionsCreator CREATOR = new AMapOptionsCreator();

    /* renamed from: a */
    public int f24076a = 1;

    /* renamed from: b */
    public boolean f24077b = true;

    /* renamed from: c */
    public boolean f24078c = true;

    /* renamed from: d */
    public boolean f24079d = true;

    /* renamed from: e */
    public boolean f24080e;

    /* renamed from: f */
    public CameraPosition f24081f;

    /* renamed from: g */
    public boolean f24082g;

    /* renamed from: h */
    public boolean f24083h;

    /* renamed from: i */
    public int f24084i;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CameraPosition getCamera() {
        return this.f24081f;
    }

    public int getLogoPosition() {
        return this.f24084i;
    }

    public int getMapType() {
        return this.f24076a;
    }

    public Boolean getCompassEnabled() {
        return Boolean.valueOf(this.f24082g);
    }

    public Boolean getScaleControlsEnabled() {
        return Boolean.valueOf(this.f24083h);
    }

    public Boolean getScrollGesturesEnabled() {
        return Boolean.valueOf(this.f24077b);
    }

    public Boolean getZOrderOnTop() {
        return Boolean.valueOf(this.f24080e);
    }

    public Boolean getZoomControlsEnabled() {
        return Boolean.valueOf(this.f24079d);
    }

    public Boolean getZoomGesturesEnabled() {
        return Boolean.valueOf(this.f24078c);
    }

    static {
        Covode.recordClassIndex(5348);
    }

    public AMapOptions camera(CameraPosition cameraPosition) {
        this.f24081f = cameraPosition;
        return this;
    }

    public AMapOptions compassEnabled(boolean z) {
        this.f24082g = z;
        return this;
    }

    public AMapOptions logoPosition(int i) {
        this.f24084i = i;
        return this;
    }

    public AMapOptions mapType(int i) {
        this.f24076a = i;
        return this;
    }

    public AMapOptions scaleControlsEnabled(boolean z) {
        this.f24083h = z;
        return this;
    }

    public AMapOptions scrollGesturesEnabled(boolean z) {
        this.f24077b = z;
        return this;
    }

    public AMapOptions zOrderOnTop(boolean z) {
        this.f24080e = z;
        return this;
    }

    public AMapOptions zoomControlsEnabled(boolean z) {
        this.f24079d = z;
        return this;
    }

    public AMapOptions zoomGesturesEnabled(boolean z) {
        this.f24078c = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f24081f, i);
        parcel.writeInt(this.f24076a);
        parcel.writeBooleanArray(new boolean[]{this.f24077b, this.f24078c, this.f24079d, this.f24080e, this.f24082g, this.f24083h});
    }
}
