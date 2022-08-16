package com.amap.api.interfaces;

import com.amap.api.maps2d.model.LatLng;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public interface ICircle extends IOverlay {
    static {
        Covode.recordClassIndex(4973);
    }

    boolean contains(LatLng latLng);

    LatLng getCenter();

    int getFillColor();

    double getRadius();

    int getStrokeColor();

    float getStrokeWidth();

    void setCenter(LatLng latLng);

    void setFillColor(int i);

    void setRadius(double d);

    void setStrokeColor(int i);

    void setStrokeWidth(float f);
}
