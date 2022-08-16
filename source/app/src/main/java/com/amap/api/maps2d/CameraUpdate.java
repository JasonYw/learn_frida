package com.amap.api.maps2d;

import com.amap.api.interfaces.MapCameraMessage;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public final class CameraUpdate {

    /* renamed from: a */
    public MapCameraMessage f24087a;

    static {
        Covode.recordClassIndex(5352);
    }

    public final MapCameraMessage getCameraUpdateFactoryDelegate() {
        return this.f24087a;
    }

    public CameraUpdate(MapCameraMessage mapCameraMessage) {
        this.f24087a = mapCameraMessage;
    }
}
