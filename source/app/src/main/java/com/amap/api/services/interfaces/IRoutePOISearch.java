package com.amap.api.services.interfaces;

import com.amap.api.services.routepoisearch.RoutePOISearch;
import com.amap.api.services.routepoisearch.RoutePOISearchQuery;
import com.amap.api.services.routepoisearch.RoutePOISearchResult;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public interface IRoutePOISearch {
    static {
        Covode.recordClassIndex(5724);
    }

    RoutePOISearchQuery getQuery();

    RoutePOISearchResult searchRoutePOI();

    void searchRoutePOIAsyn();

    void setQuery(RoutePOISearchQuery routePOISearchQuery);

    void setRoutePOISearchListener(RoutePOISearch.OnRoutePOISearchListener onRoutePOISearchListener);
}
