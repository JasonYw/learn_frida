package com.amap.api.services.p126a;

import android.content.Context;
import com.amap.api.services.weather.LocalWeatherForecast;
import com.amap.api.services.weather.WeatherSearchQuery;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.am */
/* loaded from: classes19.dex */
public class C1813am extends AbstractC1815ao<WeatherSearchQuery, LocalWeatherForecast> {

    /* renamed from: i */
    public LocalWeatherForecast f24243i = new LocalWeatherForecast();

    static {
        Covode.recordClassIndex(5424);
    }

    @Override // com.amap.api.services.p126a.AbstractC1815ao, com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public /* bridge */ /* synthetic */ String mo16250i() {
        return super.mo16250i();
    }

    @Override // com.amap.api.services.p126a.AbstractC1843b
    /* renamed from: g */
    public String mo16251g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("output=json");
        String city = ((WeatherSearchQuery) this.f24221a).getCity();
        if (!C2014q.m16314i(city)) {
            String m16997c = m16997c(city);
            stringBuffer.append("&city=");
            stringBuffer.append(m16997c);
        }
        stringBuffer.append("&extensions=all");
        stringBuffer.append(C0002O.m25086C("&key=", C1864bf.m16960f(this.f24224d)));
        return stringBuffer.toString();
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: e */
    public LocalWeatherForecast mo16254a(String str) {
        this.f24243i = C2014q.m16323e(str);
        return this.f24243i;
    }

    public C1813am(Context context, WeatherSearchQuery weatherSearchQuery) {
        super(context, weatherSearchQuery);
    }
}
