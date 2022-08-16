package com.amap.api.interfaces;

import android.graphics.Point;
import com.amap.api.maps2d.model.CameraPosition;
import com.amap.api.maps2d.model.LatLngBounds;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public abstract class MapCameraMessage {
    public float amount;
    public LatLngBounds bounds;
    public CameraPosition cameraPosition;
    public Point focus;
    public int height;
    public boolean isChangeFinished;
    public Type nowType = Type.none;
    public int paddingBottom;
    public int paddingLeft;
    public int paddingRight;
    public int paddingTop;
    public int width;
    public float xPixel;
    public float yPixel;
    public float zoom;

    static {
        Covode.recordClassIndex(4984);
    }

    /* loaded from: classes19.dex */
    public enum Type {
        none,
        zoomIn,
        changeCenter,
        changeGeoCenterZoom,
        zoomOut,
        zoomTo,
        zoomBy,
        scrollBy,
        newCameraPosition,
        newLatLngBounds,
        newLatLngBoundsWithSize,
        changeGeoCenterZoomTiltBearing;

        static {
            Covode.recordClassIndex(4985);
        }
    }
}
