package com.amap.api.services.geocoder;

import android.content.Context;
import com.amap.api.services.interfaces.IGeocodeSearch;
import com.amap.api.services.p126a.C1828av;
import com.amap.api.services.p126a.C1863be;
import com.amap.api.services.p126a.C1930cr;
import com.amap.api.services.p126a.C2006i;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes19.dex */
public final class GeocodeSearch {

    /* renamed from: a */
    public IGeocodeSearch f25035a;

    /* loaded from: classes19.dex */
    public interface OnGeocodeSearchListener {
        static {
            Covode.recordClassIndex(5701);
        }

        void onGeocodeSearched(GeocodeResult geocodeResult, int i);

        void onRegeocodeSearched(RegeocodeResult regeocodeResult, int i);
    }

    static {
        Covode.recordClassIndex(5700);
    }

    public final void getFromLocationAsyn(RegeocodeQuery regeocodeQuery) {
        IGeocodeSearch iGeocodeSearch = this.f25035a;
        if (iGeocodeSearch != null) {
            iGeocodeSearch.getFromLocationAsyn(regeocodeQuery);
        }
    }

    public final void getFromLocationNameAsyn(GeocodeQuery geocodeQuery) {
        IGeocodeSearch iGeocodeSearch = this.f25035a;
        if (iGeocodeSearch != null) {
            iGeocodeSearch.getFromLocationNameAsyn(geocodeQuery);
        }
    }

    public final void setOnGeocodeSearchListener(OnGeocodeSearchListener onGeocodeSearchListener) {
        IGeocodeSearch iGeocodeSearch = this.f25035a;
        if (iGeocodeSearch != null) {
            iGeocodeSearch.setOnGeocodeSearchListener(onGeocodeSearchListener);
        }
    }

    public final RegeocodeAddress getFromLocation(RegeocodeQuery regeocodeQuery) {
        IGeocodeSearch iGeocodeSearch = this.f25035a;
        if (iGeocodeSearch != null) {
            return iGeocodeSearch.getFromLocation(regeocodeQuery);
        }
        return null;
    }

    public final List<GeocodeAddress> getFromLocationName(GeocodeQuery geocodeQuery) {
        IGeocodeSearch iGeocodeSearch = this.f25035a;
        if (iGeocodeSearch != null) {
            return iGeocodeSearch.getFromLocationName(geocodeQuery);
        }
        return null;
    }

    public GeocodeSearch(Context context) {
        try {
            this.f25035a = (IGeocodeSearch) C1930cr.m16606a(context, C2006i.m16379a(true), "com.amap.api.services.dynamic.GeocodeSearchWrapper", C1828av.class, new Class[]{Context.class}, new Object[]{context});
        } catch (C1863be e) {
            e.printStackTrace();
        }
        if (this.f25035a == null) {
            try {
                this.f25035a = new C1828av(context);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
