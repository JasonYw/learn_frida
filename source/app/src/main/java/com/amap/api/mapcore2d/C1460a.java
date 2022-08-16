package com.amap.api.mapcore2d;

import android.graphics.Point;
import com.amap.api.interfaces.MapCameraMessage;
import com.amap.api.maps2d.model.CameraPosition;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.a */
/* loaded from: classes19.dex */
public class C1460a {

    /* renamed from: a */
    public GestureDetector$OnDoubleTapListenerC1507b f22656a;

    /* renamed from: b */
    public int f22657b;

    static {
        Covode.recordClassIndex(5008);
    }

    public C1460a(GestureDetector$OnDoubleTapListenerC1507b gestureDetector$OnDoubleTapListenerC1507b) {
        this.f22656a = gestureDetector$OnDoubleTapListenerC1507b;
    }

    /* renamed from: a */
    public void m18620a(MapCameraMessage mapCameraMessage) {
        try {
            if (this.f22656a != null && this.f22656a.m18377i() != null) {
                float zoomLevel = this.f22656a.getZoomLevel();
                if (mapCameraMessage.nowType == MapCameraMessage.Type.scrollBy) {
                    if (this.f22656a.f22880b != null) {
                        this.f22656a.f22880b.m18574d((int) mapCameraMessage.xPixel, (int) mapCameraMessage.yPixel);
                    }
                    this.f22656a.postInvalidate();
                } else if (mapCameraMessage.nowType == MapCameraMessage.Type.zoomIn) {
                    this.f22656a.m18377i().m18588a(true);
                } else if (mapCameraMessage.nowType == MapCameraMessage.Type.zoomOut) {
                    this.f22656a.m18377i().m18588a(false);
                } else if (mapCameraMessage.nowType == MapCameraMessage.Type.zoomTo) {
                    this.f22656a.m18377i().m18579c(mapCameraMessage.zoom);
                } else if (mapCameraMessage.nowType == MapCameraMessage.Type.zoomBy) {
                    float m18418a = this.f22656a.m18418a(mapCameraMessage.amount + zoomLevel);
                    Point point = mapCameraMessage.focus;
                    float f = m18418a - zoomLevel;
                    if (point != null) {
                        this.f22656a.m18416a(f, point, false, 0L);
                    } else {
                        this.f22656a.m18377i().m18579c(m18418a);
                    }
                } else if (mapCameraMessage.nowType == MapCameraMessage.Type.newCameraPosition) {
                    CameraPosition cameraPosition = mapCameraMessage.cameraPosition;
                    if (cameraPosition != null) {
                        this.f22656a.m18377i().m18590a(new C1781w((int) (cameraPosition.target.latitude * 1000000.0d), (int) (cameraPosition.target.longitude * 1000000.0d)), cameraPosition.zoom);
                    }
                } else if (mapCameraMessage.nowType == MapCameraMessage.Type.changeCenter) {
                    CameraPosition cameraPosition2 = mapCameraMessage.cameraPosition;
                    this.f22656a.m18377i().m18591a(new C1781w((int) (cameraPosition2.target.latitude * 1000000.0d), (int) (cameraPosition2.target.longitude * 1000000.0d)));
                } else if (mapCameraMessage.nowType != MapCameraMessage.Type.newLatLngBounds && mapCameraMessage.nowType != MapCameraMessage.Type.newLatLngBoundsWithSize) {
                    mapCameraMessage.isChangeFinished = true;
                } else {
                    this.f22656a.m18410a(mapCameraMessage, false, -1L);
                }
                if (zoomLevel != this.f22657b && this.f22656a.m18390c().isScaleControlsEnabled()) {
                    this.f22656a.m18361s();
                }
                C1762l.m17233a().m17231b();
            }
        } catch (Exception e) {
            C1569cm.m18147a(e, "AMapCallback", "runCameraUpdate");
        }
    }
}
