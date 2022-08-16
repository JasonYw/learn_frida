package com.byted.mgl.service.api.location;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.minigame.serviceapi.defaults.map.model.BdpLatLng;
import com.bytedance.minigame.serviceapi.defaults.map.model.BdpLocation;
import com.bytedance.minigame.serviceapi.defaults.map.model.BdpLocator;

/* loaded from: classes19.dex */
public interface Locator {
    static {
        Covode.recordClassIndex(9791);
    }

    BdpLocation getLastKnownLocation();

    BdpLocator.ISearchTask searchPoiListByKeyword(Context context, BdpLatLng bdpLatLng, String str, String str2, int i, int i2, BdpLocator.PoiResultCallback poiResultCallback);

    BdpLocator.ISearchTask searchPoiListByLatLng(Context context, BdpLatLng bdpLatLng, int i, int i2, int i3, BdpLocator.PoiResultCallback poiResultCallback);

    void setLocationChangeListener(BdpLocator.ILocationListener iLocationListener);

    void startLocate(boolean z);

    void stopLocate();
}
