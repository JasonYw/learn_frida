package com.amap.api.interfaces;

import com.amap.api.maps2d.model.LatLng;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes19.dex */
public interface IPolyline extends IOverlay {
    static {
        Covode.recordClassIndex(4979);
    }

    int getColor();

    List<LatLng> getPoints();

    float getWidth();

    boolean isDottedLine();

    boolean isGeodesic();

    void setColor(int i);

    void setDottedLine(boolean z);

    void setGeodesic(boolean z);

    void setPoints(List<LatLng> list);

    void setWidth(float f);
}
