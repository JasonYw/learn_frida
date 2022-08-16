package com.amap.api.interfaces;

import com.amap.api.maps2d.model.BitmapDescriptor;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.LatLngBounds;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public interface IGroundOverlay {
    static {
        Covode.recordClassIndex(4974);
    }

    float getBearing();

    LatLngBounds getBounds();

    float getHeight();

    LatLng getPosition();

    float getTransparency();

    float getWidth();

    void setAnchor(float f, float f2);

    void setBearing(float f);

    void setDimensions(float f);

    void setDimensions(float f, float f2);

    void setImage(BitmapDescriptor bitmapDescriptor);

    void setPosition(LatLng latLng);

    void setPositionFromBounds(LatLngBounds latLngBounds);

    void setTransparency(float f);
}
