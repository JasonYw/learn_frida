package com.amap.api.services.routepoisearch;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class RoutePOISearchResult {

    /* renamed from: a */
    public List<RoutePOIItem> f25373a;

    /* renamed from: b */
    public RoutePOISearchQuery f25374b;

    static {
        Covode.recordClassIndex(5857);
    }

    public RoutePOISearchQuery getQuery() {
        return this.f25374b;
    }

    public List<RoutePOIItem> getRoutePois() {
        return this.f25373a;
    }

    public RoutePOISearchResult(ArrayList<RoutePOIItem> arrayList, RoutePOISearchQuery routePOISearchQuery) {
        this.f25373a = new ArrayList();
        this.f25373a = arrayList;
        this.f25374b = routePOISearchQuery;
    }
}
