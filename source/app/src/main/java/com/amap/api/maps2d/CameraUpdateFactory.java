package com.amap.api.maps2d;

import android.graphics.Point;
import com.amap.api.mapcore2d.C1764m;
import com.amap.api.maps2d.model.CameraPosition;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.LatLngBounds;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public final class CameraUpdateFactory {
    static {
        Covode.recordClassIndex(5353);
    }

    public static CameraUpdate zoomIn() {
        return new CameraUpdate(C1764m.m17216b());
    }

    public static CameraUpdate zoomOut() {
        return new CameraUpdate(C1764m.m17213c());
    }

    public static CameraUpdate changeLatLng(LatLng latLng) {
        return new CameraUpdate(C1764m.m17222a(latLng));
    }

    public static CameraUpdate newCameraPosition(CameraPosition cameraPosition) {
        return new CameraUpdate(C1764m.m17223a(cameraPosition));
    }

    public static CameraUpdate newLatLng(LatLng latLng) {
        return new CameraUpdate(C1764m.m17214b(latLng));
    }

    public static CameraUpdate zoomBy(float f) {
        return new CameraUpdate(C1764m.m17215b(f));
    }

    public static CameraUpdate zoomTo(float f) {
        return new CameraUpdate(C1764m.m17227a(f));
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds latLngBounds, int i) {
        return new CameraUpdate(C1764m.m17219a(latLngBounds, i));
    }

    public static CameraUpdate newLatLngZoom(LatLng latLng, float f) {
        return new CameraUpdate(C1764m.m17221a(latLng, f));
    }

    public static CameraUpdate scrollBy(float f, float f2) {
        return new CameraUpdate(C1764m.m17226a(f, f2));
    }

    public static CameraUpdate zoomBy(float f, Point point) {
        return new CameraUpdate(C1764m.m17225a(f, point));
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds latLngBounds, int i, int i2, int i3) {
        return new CameraUpdate(C1764m.m17218a(latLngBounds, i, i2, i3));
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds latLngBounds, int i, int i2, int i3, int i4) {
        return new CameraUpdate(C1764m.m17217a(latLngBounds, i, i2, i3, i4));
    }
}
