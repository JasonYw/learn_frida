package com.amap.api.mapcore2d;

import android.graphics.Point;
import com.amap.api.interfaces.MapCameraMessage;
import com.amap.api.maps2d.model.CameraPosition;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.LatLngBounds;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.m */
/* loaded from: classes19.dex */
public class C1764m extends MapCameraMessage {

    /* renamed from: a */
    public float f23991a;

    /* renamed from: b */
    public float f23992b;

    /* renamed from: c */
    public C1465ae f23993c;

    static {
        Covode.recordClassIndex(5312);
    }

    /* renamed from: a */
    public static C1764m m17220a(LatLng latLng, float f, float f2, float f3) {
        CameraPosition.Builder builder = CameraPosition.builder();
        builder.target(latLng);
        builder.zoom(f);
        builder.bearing(f2);
        builder.tilt(f3);
        return m17223a(builder.build());
    }

    /* renamed from: a */
    public static C1764m m17219a(LatLngBounds latLngBounds, int i) {
        C1764m m17228a = m17228a();
        m17228a.nowType = MapCameraMessage.Type.newLatLngBounds;
        m17228a.bounds = latLngBounds;
        m17228a.paddingLeft = i;
        m17228a.paddingRight = i;
        m17228a.paddingTop = i;
        m17228a.paddingBottom = i;
        return m17228a;
    }

    /* renamed from: a */
    public static C1764m m17218a(LatLngBounds latLngBounds, int i, int i2, int i3) {
        C1764m m17228a = m17228a();
        m17228a.nowType = MapCameraMessage.Type.newLatLngBoundsWithSize;
        m17228a.bounds = latLngBounds;
        m17228a.paddingLeft = i3;
        m17228a.paddingRight = i3;
        m17228a.paddingTop = i3;
        m17228a.paddingBottom = i3;
        m17228a.width = i;
        m17228a.height = i2;
        return m17228a;
    }

    /* renamed from: a */
    public static C1764m m17228a() {
        return new C1764m();
    }

    /* renamed from: b */
    public static C1764m m17216b() {
        C1764m m17228a = m17228a();
        m17228a.nowType = MapCameraMessage.Type.zoomIn;
        return m17228a;
    }

    /* renamed from: c */
    public static C1764m m17213c() {
        C1764m m17228a = m17228a();
        m17228a.nowType = MapCameraMessage.Type.zoomOut;
        return m17228a;
    }

    /* renamed from: b */
    public static C1764m m17215b(float f) {
        return m17225a(f, (Point) null);
    }

    /* renamed from: a */
    public static C1764m m17227a(float f) {
        C1764m m17228a = m17228a();
        m17228a.nowType = MapCameraMessage.Type.zoomTo;
        m17228a.zoom = f;
        return m17228a;
    }

    /* renamed from: b */
    public static C1764m m17214b(LatLng latLng) {
        CameraPosition.Builder builder = CameraPosition.builder();
        builder.target(latLng);
        return m17223a(builder.build());
    }

    /* renamed from: a */
    public static C1764m m17223a(CameraPosition cameraPosition) {
        C1764m m17228a = m17228a();
        m17228a.nowType = MapCameraMessage.Type.newCameraPosition;
        m17228a.cameraPosition = cameraPosition;
        return m17228a;
    }

    /* renamed from: a */
    public static C1764m m17222a(LatLng latLng) {
        C1764m m17228a = m17228a();
        m17228a.nowType = MapCameraMessage.Type.changeCenter;
        m17228a.cameraPosition = new CameraPosition(latLng, 0.0f, 0.0f, 0.0f);
        return m17228a;
    }

    /* renamed from: a */
    public static C1764m m17226a(float f, float f2) {
        C1764m m17228a = m17228a();
        m17228a.nowType = MapCameraMessage.Type.scrollBy;
        m17228a.xPixel = f;
        m17228a.yPixel = f2;
        return m17228a;
    }

    /* renamed from: a */
    public static C1764m m17225a(float f, Point point) {
        C1764m m17228a = m17228a();
        m17228a.nowType = MapCameraMessage.Type.zoomBy;
        m17228a.amount = f;
        m17228a.focus = point;
        return m17228a;
    }

    /* renamed from: a */
    public static C1764m m17221a(LatLng latLng, float f) {
        CameraPosition.Builder builder = CameraPosition.builder();
        builder.target(latLng);
        builder.zoom(f);
        return m17223a(builder.build());
    }

    /* renamed from: a */
    public static C1764m m17224a(C1465ae c1465ae, float f, float f2, float f3) {
        C1764m m17228a = m17228a();
        m17228a.nowType = MapCameraMessage.Type.changeGeoCenterZoomTiltBearing;
        m17228a.f23993c = c1465ae;
        m17228a.zoom = f;
        m17228a.f23992b = f2;
        m17228a.f23991a = f3;
        return m17228a;
    }

    /* renamed from: a */
    public static MapCameraMessage m17217a(LatLngBounds latLngBounds, int i, int i2, int i3, int i4) {
        C1764m m17228a = m17228a();
        m17228a.nowType = MapCameraMessage.Type.newLatLngBounds;
        m17228a.bounds = latLngBounds;
        m17228a.paddingLeft = i;
        m17228a.paddingRight = i2;
        m17228a.paddingTop = i3;
        m17228a.paddingBottom = i4;
        return m17228a;
    }
}
