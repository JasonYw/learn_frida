package com.amap.api.services.interfaces;

import com.amap.api.services.core.LatLonSharePoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.share.ShareSearch;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public interface IShareSearch {
    static {
        Covode.recordClassIndex(5726);
    }

    String searchBusRouteShareUrl(ShareSearch.ShareBusRouteQuery shareBusRouteQuery);

    void searchBusRouteShareUrlAsyn(ShareSearch.ShareBusRouteQuery shareBusRouteQuery);

    String searchDrivingRouteShareUrl(ShareSearch.ShareDrivingRouteQuery shareDrivingRouteQuery);

    void searchDrivingRouteShareUrlAsyn(ShareSearch.ShareDrivingRouteQuery shareDrivingRouteQuery);

    String searchLocationShareUrl(LatLonSharePoint latLonSharePoint);

    void searchLocationShareUrlAsyn(LatLonSharePoint latLonSharePoint);

    String searchNaviShareUrl(ShareSearch.ShareNaviQuery shareNaviQuery);

    void searchNaviShareUrlAsyn(ShareSearch.ShareNaviQuery shareNaviQuery);

    String searchPoiShareUrl(PoiItem poiItem);

    void searchPoiShareUrlAsyn(PoiItem poiItem);

    String searchWalkRouteShareUrl(ShareSearch.ShareWalkRouteQuery shareWalkRouteQuery);

    void searchWalkRouteShareUrlAsyn(ShareSearch.ShareWalkRouteQuery shareWalkRouteQuery);

    void setOnShareSearchListener(ShareSearch.OnShareSearchListener onShareSearchListener);
}
