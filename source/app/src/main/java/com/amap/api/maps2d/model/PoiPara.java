package com.amap.api.maps2d.model;

import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class PoiPara {

    /* renamed from: a */
    public LatLng f24167a;

    /* renamed from: b */
    public String f24168b;

    static {
        Covode.recordClassIndex(5382);
    }

    public LatLng getCenter() {
        return this.f24167a;
    }

    public String getKeywords() {
        return this.f24168b;
    }

    public void setCenter(LatLng latLng) {
        this.f24167a = latLng;
    }

    public void setKeywords(String str) {
        this.f24168b = str;
    }
}
