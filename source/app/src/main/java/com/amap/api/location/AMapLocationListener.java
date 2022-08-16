package com.amap.api.location;

import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public interface AMapLocationListener {
    static {
        Covode.recordClassIndex(4996);
    }

    void onLocationChanged(AMapLocation aMapLocation);
}
