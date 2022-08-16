package com.amap.api.maps2d;

import android.graphics.Point;
import android.graphics.PointF;
import android.os.RemoteException;
import com.amap.api.interfaces.IProjection;
import com.amap.api.mapcore2d.C1569cm;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.RuntimeRemoteException;
import com.amap.api.maps2d.model.VisibleRegion;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class Projection {

    /* renamed from: a */
    public final IProjection f24099a;

    static {
        Covode.recordClassIndex(5362);
    }

    public VisibleRegion getVisibleRegion() {
        try {
            return this.f24099a.getVisibleRegion();
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Projection", "getVisibleRegion");
            throw new RuntimeRemoteException(e);
        }
    }

    public Projection(IProjection iProjection) {
        this.f24099a = iProjection;
    }

    public LatLng fromScreenLocation(Point point) {
        try {
            return this.f24099a.fromScreenLocation(point);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Projection", "fromScreenLocation");
            throw new RuntimeRemoteException(e);
        }
    }

    public PointF toMapLocation(LatLng latLng) {
        try {
            return this.f24099a.toMapLocation(latLng);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Projection", "toMapLocation");
            throw new RuntimeRemoteException(e);
        }
    }

    public Point toScreenLocation(LatLng latLng) {
        try {
            return this.f24099a.toScreenLocation(latLng);
        } catch (RemoteException e) {
            C1569cm.m18147a(e, "Projection", "toScreenLocation");
            throw new RuntimeRemoteException(e);
        }
    }
}
