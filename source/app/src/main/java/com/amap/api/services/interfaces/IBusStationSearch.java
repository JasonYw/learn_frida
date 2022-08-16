package com.amap.api.services.interfaces;

import com.amap.api.services.busline.BusStationQuery;
import com.amap.api.services.busline.BusStationResult;
import com.amap.api.services.busline.BusStationSearch;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public interface IBusStationSearch {
    static {
        Covode.recordClassIndex(5716);
    }

    BusStationQuery getQuery();

    BusStationResult searchBusStation();

    void searchBusStationAsyn();

    void setOnBusStationSearchListener(BusStationSearch.OnBusStationSearchListener onBusStationSearchListener);

    void setQuery(BusStationQuery busStationQuery);
}
