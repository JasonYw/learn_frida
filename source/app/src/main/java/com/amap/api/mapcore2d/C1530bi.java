package com.amap.api.mapcore2d;

import android.graphics.Point;
import android.graphics.PointF;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.LatLngBounds;
import com.amap.api.maps2d.model.VisibleRegion;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.bi */
/* loaded from: classes19.dex */
public class C1530bi implements AbstractC1468ah {

    /* renamed from: a */
    public String f23009a = "ProjectionDelegateImp";

    /* renamed from: b */
    public AbstractC1783y f23010b;

    static {
        Covode.recordClassIndex(5078);
    }

    @Override // com.amap.api.interfaces.IProjection
    public VisibleRegion getVisibleRegion() {
        LatLng latLng;
        LatLng latLng2;
        LatLng latLng3;
        LatLng latLng4;
        int mapWidth;
        int mapHeight;
        LatLngBounds latLngBounds = null;
        try {
            mapWidth = this.f23010b.getMapWidth();
            mapHeight = this.f23010b.getMapHeight();
            latLng2 = fromScreenLocation(new Point(0, 0));
        } catch (Throwable th) {
            th = th;
            latLng = null;
            latLng2 = null;
            latLng3 = null;
        }
        try {
            latLng4 = fromScreenLocation(new Point(mapWidth, 0));
            try {
                latLng3 = fromScreenLocation(new Point(0, mapHeight));
                try {
                    latLng = fromScreenLocation(new Point(mapWidth, mapHeight));
                    try {
                        LatLngBounds.Builder builder = LatLngBounds.builder();
                        builder.include(latLng3);
                        builder.include(latLng);
                        builder.include(latLng2);
                        builder.include(latLng4);
                        latLngBounds = builder.build();
                    } catch (Throwable th2) {
                        th = th2;
                        C1569cm.m18147a(th, this.f23009a, "getVisibleRegion");
                        return new VisibleRegion(latLng3, latLng, latLng2, latLng4, latLngBounds);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    latLng = null;
                }
            } catch (Throwable th4) {
                th = th4;
                latLng = null;
                latLng3 = null;
            }
        } catch (Throwable th5) {
            th = th5;
            latLng = null;
            latLng3 = null;
            latLng4 = latLng3;
            C1569cm.m18147a(th, this.f23009a, "getVisibleRegion");
            return new VisibleRegion(latLng3, latLng, latLng2, latLng4, latLngBounds);
        }
        return new VisibleRegion(latLng3, latLng, latLng2, latLng4, latLngBounds);
    }

    public C1530bi(AbstractC1783y abstractC1783y) {
        this.f23010b = abstractC1783y;
    }

    @Override // com.amap.api.interfaces.IProjection
    public LatLng fromScreenLocation(Point point) {
        C1774s c1774s = new C1774s();
        this.f23010b.mo17145a(point.x, point.y, c1774s);
        return new LatLng(c1774s.f24038b, c1774s.f24037a);
    }

    @Override // com.amap.api.interfaces.IProjection
    public PointF toMapLocation(LatLng latLng) {
        C1774s c1774s = new C1774s();
        this.f23010b.mo17147a(latLng.latitude, latLng.longitude, c1774s);
        return new PointF((float) c1774s.f24037a, (float) c1774s.f24038b);
    }

    @Override // com.amap.api.interfaces.IProjection
    public Point toScreenLocation(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        C1465ae c1465ae = new C1465ae();
        this.f23010b.mo17144b(latLng.latitude, latLng.longitude, c1465ae);
        return new Point(c1465ae.f22658a, c1465ae.f22659b);
    }
}
