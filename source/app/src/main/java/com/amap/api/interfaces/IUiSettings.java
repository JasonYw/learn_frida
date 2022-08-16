package com.amap.api.interfaces;

import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public interface IUiSettings {
    static {
        Covode.recordClassIndex(4983);
    }

    int getLogoPosition();

    int getZoomPosition();

    boolean isCompassEnabled();

    boolean isMyLocationButtonEnabled();

    boolean isScaleControlsEnabled();

    boolean isScrollGesturesEnabled();

    boolean isZoomControlsEnabled();

    boolean isZoomGesturesEnabled();

    boolean isZoomInByScreenCenter();

    void setAllGesturesEnabled(boolean z);

    void setCompassEnabled(boolean z);

    void setLogoCenter(int i, int i2);

    void setLogoPosition(int i);

    void setMyLocationButtonEnabled(boolean z);

    void setScaleControlsEnabled(boolean z);

    void setScrollGesturesEnabled(boolean z);

    void setZoomControlsEnabled(boolean z);

    void setZoomGesturesEnabled(boolean z);

    void setZoomInByScreenCenter(boolean z);

    void setZoomPosition(int i);
}
