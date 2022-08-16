package com.amap.api.services.busline;

import android.content.Context;
import com.amap.api.services.interfaces.IBusLineSearch;
import com.amap.api.services.p126a.C1817aq;
import com.amap.api.services.p126a.C1863be;
import com.amap.api.services.p126a.C1930cr;
import com.amap.api.services.p126a.C2006i;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class BusLineSearch {

    /* renamed from: a */
    public IBusLineSearch f24898a;

    /* loaded from: classes19.dex */
    public interface OnBusLineSearchListener {
        static {
            Covode.recordClassIndex(5655);
        }

        void onBusLineSearched(BusLineResult busLineResult, int i);
    }

    static {
        Covode.recordClassIndex(5654);
    }

    public void searchBusLineAsyn() {
        IBusLineSearch iBusLineSearch = this.f24898a;
        if (iBusLineSearch != null) {
            iBusLineSearch.searchBusLineAsyn();
        }
    }

    public BusLineQuery getQuery() {
        IBusLineSearch iBusLineSearch = this.f24898a;
        if (iBusLineSearch != null) {
            return iBusLineSearch.getQuery();
        }
        return null;
    }

    public BusLineResult searchBusLine() {
        IBusLineSearch iBusLineSearch = this.f24898a;
        if (iBusLineSearch != null) {
            return iBusLineSearch.searchBusLine();
        }
        return null;
    }

    public void setOnBusLineSearchListener(OnBusLineSearchListener onBusLineSearchListener) {
        IBusLineSearch iBusLineSearch = this.f24898a;
        if (iBusLineSearch != null) {
            iBusLineSearch.setOnBusLineSearchListener(onBusLineSearchListener);
        }
    }

    public void setQuery(BusLineQuery busLineQuery) {
        IBusLineSearch iBusLineSearch = this.f24898a;
        if (iBusLineSearch != null) {
            iBusLineSearch.setQuery(busLineQuery);
        }
    }

    public BusLineSearch(Context context, BusLineQuery busLineQuery) {
        try {
            this.f24898a = (IBusLineSearch) C1930cr.m16606a(context, C2006i.m16379a(true), "com.amap.api.services.dynamic.BusLineSearchWrapper", C1817aq.class, new Class[]{Context.class, BusLineQuery.class}, new Object[]{context, busLineQuery});
        } catch (C1863be e) {
            e.printStackTrace();
        }
        if (this.f24898a == null) {
            try {
                this.f24898a = new C1817aq(context, busLineQuery);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
