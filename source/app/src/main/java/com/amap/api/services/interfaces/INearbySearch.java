package com.amap.api.services.interfaces;

import com.amap.api.services.nearby.NearbySearch;
import com.amap.api.services.nearby.NearbySearchResult;
import com.amap.api.services.nearby.UploadInfo;
import com.amap.api.services.nearby.UploadInfoCallback;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public interface INearbySearch {
    static {
        Covode.recordClassIndex(5722);
    }

    void addNearbyListener(NearbySearch.NearbyListener nearbyListener);

    void clearUserInfoAsyn();

    void destroy();

    void removeNearbyListener(NearbySearch.NearbyListener nearbyListener);

    NearbySearchResult searchNearbyInfo(NearbySearch.NearbyQuery nearbyQuery);

    void searchNearbyInfoAsyn(NearbySearch.NearbyQuery nearbyQuery);

    void setUserID(String str);

    void startUploadNearbyInfoAuto(UploadInfoCallback uploadInfoCallback, int i);

    void stopUploadNearbyInfoAuto();

    void uploadNearbyInfoAsyn(UploadInfo uploadInfo);
}
