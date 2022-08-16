package com.amap.api.services.interfaces;

import com.amap.api.services.cloud.CloudSearch;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public interface ICloudSearch {
    static {
        Covode.recordClassIndex(5717);
    }

    void searchCloudAsyn(CloudSearch.Query query);

    void searchCloudDetailAsyn(String str, String str2);

    void setOnCloudSearchListener(CloudSearch.OnCloudSearchListener onCloudSearchListener);
}
