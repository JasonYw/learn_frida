package com.amap.api.fence;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes19.dex */
public interface GeoFenceListener {
    static {
        Covode.recordClassIndex(4969);
    }

    void onGeoFenceCreateFinished(List<GeoFence> list, int i, String str);
}
