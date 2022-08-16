package com.autonavi.amap.mapcore2d;

import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public interface Inner_3dMap_locationManagerBase {
    static {
        Covode.recordClassIndex(9338);
    }

    void destroy();

    Inner_3dMap_location getLastKnownLocation();

    void setLocationListener(Inner_3dMap_locationListener inner_3dMap_locationListener);

    void setLocationOption(Inner_3dMap_locationOption inner_3dMap_locationOption);

    void startLocation();

    void stopLocation();

    void unRegisterLocationListener(Inner_3dMap_locationListener inner_3dMap_locationListener);
}
