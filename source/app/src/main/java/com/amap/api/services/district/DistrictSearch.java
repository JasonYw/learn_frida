package com.amap.api.services.district;

import android.content.Context;
import com.amap.api.services.interfaces.IDistrictSearch;
import com.amap.api.services.p126a.C1826au;
import com.amap.api.services.p126a.C1863be;
import com.amap.api.services.p126a.C1930cr;
import com.amap.api.services.p126a.C2006i;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class DistrictSearch {

    /* renamed from: a */
    public IDistrictSearch f25005a;

    /* loaded from: classes19.dex */
    public interface OnDistrictSearchListener {
        static {
            Covode.recordClassIndex(5689);
        }

        void onDistrictSearched(DistrictResult districtResult);
    }

    static {
        Covode.recordClassIndex(5688);
    }

    public void searchDistrictAnsy() {
        IDistrictSearch iDistrictSearch = this.f25005a;
        if (iDistrictSearch != null) {
            iDistrictSearch.searchDistrictAnsy();
        }
    }

    public void searchDistrictAsyn() {
        IDistrictSearch iDistrictSearch = this.f25005a;
        if (iDistrictSearch != null) {
            iDistrictSearch.searchDistrictAsyn();
        }
    }

    public DistrictSearchQuery getQuery() {
        IDistrictSearch iDistrictSearch = this.f25005a;
        if (iDistrictSearch != null) {
            return iDistrictSearch.getQuery();
        }
        return null;
    }

    public DistrictResult searchDistrict() {
        IDistrictSearch iDistrictSearch = this.f25005a;
        if (iDistrictSearch != null) {
            return iDistrictSearch.searchDistrict();
        }
        return null;
    }

    public void setOnDistrictSearchListener(OnDistrictSearchListener onDistrictSearchListener) {
        IDistrictSearch iDistrictSearch = this.f25005a;
        if (iDistrictSearch != null) {
            iDistrictSearch.setOnDistrictSearchListener(onDistrictSearchListener);
        }
    }

    public void setQuery(DistrictSearchQuery districtSearchQuery) {
        IDistrictSearch iDistrictSearch = this.f25005a;
        if (iDistrictSearch != null) {
            iDistrictSearch.setQuery(districtSearchQuery);
        }
    }

    public DistrictSearch(Context context) {
        try {
            this.f25005a = (IDistrictSearch) C1930cr.m16606a(context, C2006i.m16379a(true), "com.amap.api.services.dynamic.DistrictSearchWrapper", C1826au.class, new Class[]{Context.class}, new Object[]{context});
        } catch (C1863be e) {
            e.printStackTrace();
        }
        if (this.f25005a == null) {
            try {
                this.f25005a = new C1826au(context);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
