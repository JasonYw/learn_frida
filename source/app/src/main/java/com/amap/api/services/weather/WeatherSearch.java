package com.amap.api.services.weather;

import android.content.Context;
import com.amap.api.services.interfaces.IWeatherSearch;
import com.amap.api.services.p126a.C1861bd;
import com.amap.api.services.p126a.C1863be;
import com.amap.api.services.p126a.C1930cr;
import com.amap.api.services.p126a.C2006i;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class WeatherSearch {

    /* renamed from: a */
    public IWeatherSearch f25438a;

    /* loaded from: classes19.dex */
    public interface OnWeatherSearchListener {
        static {
            Covode.recordClassIndex(5887);
        }

        void onWeatherForecastSearched(LocalWeatherForecastResult localWeatherForecastResult, int i);

        void onWeatherLiveSearched(LocalWeatherLiveResult localWeatherLiveResult, int i);
    }

    static {
        Covode.recordClassIndex(5886);
    }

    public void searchWeatherAsyn() {
        IWeatherSearch iWeatherSearch = this.f25438a;
        if (iWeatherSearch != null) {
            iWeatherSearch.searchWeatherAsyn();
        }
    }

    public WeatherSearchQuery getQuery() {
        IWeatherSearch iWeatherSearch = this.f25438a;
        if (iWeatherSearch != null) {
            return iWeatherSearch.getQuery();
        }
        return null;
    }

    public void setOnWeatherSearchListener(OnWeatherSearchListener onWeatherSearchListener) {
        IWeatherSearch iWeatherSearch = this.f25438a;
        if (iWeatherSearch != null) {
            iWeatherSearch.setOnWeatherSearchListener(onWeatherSearchListener);
        }
    }

    public void setQuery(WeatherSearchQuery weatherSearchQuery) {
        IWeatherSearch iWeatherSearch = this.f25438a;
        if (iWeatherSearch != null) {
            iWeatherSearch.setQuery(weatherSearchQuery);
        }
    }

    public WeatherSearch(Context context) {
        try {
            this.f25438a = (IWeatherSearch) C1930cr.m16606a(context, C2006i.m16379a(true), "com.amap.api.services.dynamic.WeatherSearchWrapper", C1861bd.class, new Class[]{Context.class}, new Object[]{context});
        } catch (C1863be e) {
            e.printStackTrace();
        }
        if (this.f25438a == null) {
            try {
                this.f25438a = new C1861bd(context);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
