package com.amap.api.services.interfaces;

import com.amap.api.services.traffic.CircleTrafficQuery;
import com.amap.api.services.traffic.RoadTrafficQuery;
import com.amap.api.services.traffic.TrafficSearch;
import com.amap.api.services.traffic.TrafficStatusResult;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public interface ITrafficSearch {
    static {
        Covode.recordClassIndex(5727);
    }

    TrafficStatusResult loadTrafficByCircle(CircleTrafficQuery circleTrafficQuery);

    void loadTrafficByCircleAsyn(CircleTrafficQuery circleTrafficQuery);

    TrafficStatusResult loadTrafficByRoad(RoadTrafficQuery roadTrafficQuery);

    void loadTrafficByRoadAsyn(RoadTrafficQuery roadTrafficQuery);

    void setTrafficSearchListener(TrafficSearch.OnTrafficSearchListener onTrafficSearchListener);
}
