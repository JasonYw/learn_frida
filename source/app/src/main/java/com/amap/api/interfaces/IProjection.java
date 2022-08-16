package com.amap.api.interfaces;

import android.graphics.Point;
import android.graphics.PointF;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.VisibleRegion;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public interface IProjection {
    static {
        Covode.recordClassIndex(4980);
    }

    LatLng fromScreenLocation(Point point);

    VisibleRegion getVisibleRegion();

    PointF toMapLocation(LatLng latLng);

    Point toScreenLocation(LatLng latLng);
}
