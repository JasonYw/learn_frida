package com.amap.api.interfaces;

import com.amap.api.maps2d.model.LatLng;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes19.dex */
public interface IPolygon extends IOverlay {
    static {
        Covode.recordClassIndex(4978);
    }

    boolean contains(LatLng latLng);

    int getFillColor();

    List<LatLng> getPoints();

    int getStrokeColor();

    float getStrokeWidth();

    void setFillColor(int i);

    void setPoints(List<LatLng> list);

    void setStrokeColor(int i);

    void setStrokeWidth(float f);
}
