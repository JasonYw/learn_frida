package com.amap.api.services.geocoder;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class GeocodeResult {

    /* renamed from: a */
    public GeocodeQuery f25033a;

    /* renamed from: b */
    public List<GeocodeAddress> f25034b;

    static {
        Covode.recordClassIndex(5699);
    }

    public List<GeocodeAddress> getGeocodeAddressList() {
        return this.f25034b;
    }

    public GeocodeQuery getGeocodeQuery() {
        return this.f25033a;
    }

    public void setGeocodeAddressList(List<GeocodeAddress> list) {
        this.f25034b = list;
    }

    public void setGeocodeQuery(GeocodeQuery geocodeQuery) {
        this.f25033a = geocodeQuery;
    }

    public GeocodeResult(GeocodeQuery geocodeQuery, List<GeocodeAddress> list) {
        this.f25034b = new ArrayList();
        this.f25033a = geocodeQuery;
        this.f25034b = list;
    }
}
