package com.amap.api.services.busline;

import android.content.Context;
import com.amap.api.services.interfaces.IBusStationSearch;
import com.amap.api.services.p126a.C1819ar;
import com.amap.api.services.p126a.C1863be;
import com.amap.api.services.p126a.C1930cr;
import com.amap.api.services.p126a.C2006i;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class BusStationSearch {

    /* renamed from: a */
    public IBusStationSearch f24914a;

    /* loaded from: classes19.dex */
    public interface OnBusStationSearchListener {
        static {
            Covode.recordClassIndex(5661);
        }

        void onBusStationSearched(BusStationResult busStationResult, int i);
    }

    static {
        Covode.recordClassIndex(5660);
    }

    public void searchBusStationAsyn() {
        IBusStationSearch iBusStationSearch = this.f24914a;
        if (iBusStationSearch != null) {
            iBusStationSearch.searchBusStationAsyn();
        }
    }

    public BusStationQuery getQuery() {
        IBusStationSearch iBusStationSearch = this.f24914a;
        if (iBusStationSearch != null) {
            return iBusStationSearch.getQuery();
        }
        return null;
    }

    public BusStationResult searchBusStation() {
        IBusStationSearch iBusStationSearch = this.f24914a;
        if (iBusStationSearch != null) {
            return iBusStationSearch.searchBusStation();
        }
        return null;
    }

    public void setOnBusStationSearchListener(OnBusStationSearchListener onBusStationSearchListener) {
        IBusStationSearch iBusStationSearch = this.f24914a;
        if (iBusStationSearch != null) {
            iBusStationSearch.setOnBusStationSearchListener(onBusStationSearchListener);
        }
    }

    public void setQuery(BusStationQuery busStationQuery) {
        IBusStationSearch iBusStationSearch = this.f24914a;
        if (iBusStationSearch != null) {
            iBusStationSearch.setQuery(busStationQuery);
        }
    }

    public BusStationSearch(Context context, BusStationQuery busStationQuery) {
        try {
            this.f24914a = (IBusStationSearch) C1930cr.m16606a(context, C2006i.m16379a(true), "com.amap.api.services.dynamic.BusStationSearchWrapper", C1819ar.class, new Class[]{Context.class, BusStationQuery.class}, new Object[]{context, busStationQuery});
        } catch (C1863be e) {
            e.printStackTrace();
        }
        if (this.f24914a == null) {
            try {
                this.f24914a = new C1819ar(context, busStationQuery);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
