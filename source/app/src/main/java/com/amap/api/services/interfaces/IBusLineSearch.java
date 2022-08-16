package com.amap.api.services.interfaces;

import com.amap.api.services.busline.BusLineQuery;
import com.amap.api.services.busline.BusLineResult;
import com.amap.api.services.busline.BusLineSearch;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public interface IBusLineSearch {
    static {
        Covode.recordClassIndex(5715);
    }

    BusLineQuery getQuery();

    BusLineResult searchBusLine();

    void searchBusLineAsyn();

    void setOnBusLineSearchListener(BusLineSearch.OnBusLineSearchListener onBusLineSearchListener);

    void setQuery(BusLineQuery busLineQuery);
}
