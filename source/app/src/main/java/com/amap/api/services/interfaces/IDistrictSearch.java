package com.amap.api.services.interfaces;

import com.amap.api.services.district.DistrictResult;
import com.amap.api.services.district.DistrictSearch;
import com.amap.api.services.district.DistrictSearchQuery;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public interface IDistrictSearch {
    static {
        Covode.recordClassIndex(5719);
    }

    DistrictSearchQuery getQuery();

    DistrictResult searchDistrict();

    void searchDistrictAnsy();

    void searchDistrictAsyn();

    void setOnDistrictSearchListener(DistrictSearch.OnDistrictSearchListener onDistrictSearchListener);

    void setQuery(DistrictSearchQuery districtSearchQuery);
}
