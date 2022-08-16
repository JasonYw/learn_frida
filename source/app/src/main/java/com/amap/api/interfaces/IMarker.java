package com.amap.api.interfaces;

import com.amap.api.maps2d.model.BitmapDescriptor;
import com.amap.api.maps2d.model.LatLng;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* loaded from: classes19.dex */
public interface IMarker {
    static {
        Covode.recordClassIndex(4976);
    }

    void destroy();

    boolean equalsRemote(IMarker iMarker);

    int getHeight();

    ArrayList<BitmapDescriptor> getIcons();

    String getId();

    Object getObject();

    int getPeriod();

    LatLng getPosition();

    LatLng getRealPosition();

    String getSnippet();

    String getTitle();

    int getWidth();

    float getZIndex();

    int hashCodeRemote();

    void hideInfoWindow();

    boolean isDraggable();

    boolean isInfoWindowShown();

    boolean isViewMode();

    boolean isVisible();

    boolean remove();

    void setAnchor(float f, float f2);

    void setDraggable(boolean z);

    void setIcon(BitmapDescriptor bitmapDescriptor);

    void setIcons(ArrayList<BitmapDescriptor> arrayList);

    void setObject(Object obj);

    void setPeriod(int i);

    void setPosition(LatLng latLng);

    void setPositionByPixels(int i, int i2);

    void setRotateAngle(float f);

    void setSnippet(String str);

    void setTitle(String str);

    void setVisible(boolean z);

    void setZIndex(float f);

    void showInfoWindow();
}
