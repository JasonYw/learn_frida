package com.amap.api.services.interfaces;

import com.amap.api.services.core.PoiItem;
import com.amap.api.services.poisearch.PoiResult;
import com.amap.api.services.poisearch.PoiSearch;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public interface IPoiSearch {
    static {
        Covode.recordClassIndex(5723);
    }

    PoiSearch.SearchBound getBound();

    String getLanguage();

    PoiSearch.Query getQuery();

    PoiResult searchPOI();

    void searchPOIAsyn();

    PoiItem searchPOIId(String str);

    void searchPOIIdAsyn(String str);

    void setBound(PoiSearch.SearchBound searchBound);

    void setLanguage(String str);

    void setOnPoiSearchListener(PoiSearch.OnPoiSearchListener onPoiSearchListener);

    void setQuery(PoiSearch.Query query);
}
