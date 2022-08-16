package com.amap.api.services.interfaces;

import com.amap.api.services.route.DistanceResult;
import com.amap.api.services.route.DistanceSearch;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public interface IDistanceSearch {
    static {
        Covode.recordClassIndex(5718);
    }

    DistanceResult calculateRouteDistance(DistanceSearch.DistanceQuery distanceQuery);

    void calculateRouteDistanceAsyn(DistanceSearch.DistanceQuery distanceQuery);

    void setDistanceSearchListener(DistanceSearch.OnDistanceSearchListener onDistanceSearchListener);
}
