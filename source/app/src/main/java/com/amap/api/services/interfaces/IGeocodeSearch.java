package com.amap.api.services.interfaces;

import com.amap.api.services.geocoder.GeocodeAddress;
import com.amap.api.services.geocoder.GeocodeQuery;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.amap.api.services.geocoder.RegeocodeAddress;
import com.amap.api.services.geocoder.RegeocodeQuery;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes19.dex */
public interface IGeocodeSearch {
    static {
        Covode.recordClassIndex(5720);
    }

    RegeocodeAddress getFromLocation(RegeocodeQuery regeocodeQuery);

    void getFromLocationAsyn(RegeocodeQuery regeocodeQuery);

    List<GeocodeAddress> getFromLocationName(GeocodeQuery geocodeQuery);

    void getFromLocationNameAsyn(GeocodeQuery geocodeQuery);

    void setOnGeocodeSearchListener(GeocodeSearch.OnGeocodeSearchListener onGeocodeSearchListener);
}
