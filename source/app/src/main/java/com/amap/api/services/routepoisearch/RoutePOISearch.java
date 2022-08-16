package com.amap.api.services.routepoisearch;

import android.content.Context;
import com.amap.api.services.interfaces.IRoutePOISearch;
import com.amap.api.services.p126a.C1841az;
import com.amap.api.services.p126a.C1863be;
import com.amap.api.services.p126a.C1930cr;
import com.amap.api.services.p126a.C2006i;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class RoutePOISearch {

    /* renamed from: a */
    public IRoutePOISearch f25365a;

    /* loaded from: classes19.dex */
    public interface OnRoutePOISearchListener {
        static {
            Covode.recordClassIndex(5854);
        }

        void onRoutePoiSearched(RoutePOISearchResult routePOISearchResult, int i);
    }

    static {
        Covode.recordClassIndex(5853);
    }

    public void searchRoutePOIAsyn() {
        IRoutePOISearch iRoutePOISearch = this.f25365a;
        if (iRoutePOISearch != null) {
            iRoutePOISearch.searchRoutePOIAsyn();
        }
    }

    public RoutePOISearchResult searchRoutePOI() {
        IRoutePOISearch iRoutePOISearch = this.f25365a;
        if (iRoutePOISearch != null) {
            return iRoutePOISearch.searchRoutePOI();
        }
        return null;
    }

    /* loaded from: classes19.dex */
    public enum RoutePOISearchType {
        TypeGasStation,
        TypeMaintenanceStation,
        TypeATM,
        TypeToilet,
        TypeFillingStation,
        TypeServiceArea;

        static {
            Covode.recordClassIndex(5855);
        }
    }

    public void setPoiSearchListener(OnRoutePOISearchListener onRoutePOISearchListener) {
        IRoutePOISearch iRoutePOISearch = this.f25365a;
        if (iRoutePOISearch != null) {
            iRoutePOISearch.setRoutePOISearchListener(onRoutePOISearchListener);
        }
    }

    public void setQuery(RoutePOISearchQuery routePOISearchQuery) {
        IRoutePOISearch iRoutePOISearch = this.f25365a;
        if (iRoutePOISearch != null) {
            iRoutePOISearch.setQuery(routePOISearchQuery);
        }
    }

    public RoutePOISearch(Context context, RoutePOISearchQuery routePOISearchQuery) {
        try {
            this.f25365a = (IRoutePOISearch) C1930cr.m16606a(context, C2006i.m16379a(true), "com.amap.api.services.dynamic.RoutePOISearchWrapper", C1841az.class, new Class[]{Context.class, RoutePOISearchQuery.class}, new Object[]{context, routePOISearchQuery});
        } catch (C1863be e) {
            e.printStackTrace();
        }
        if (this.f25365a == null) {
            try {
                this.f25365a = new C1841az(context, routePOISearchQuery);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
