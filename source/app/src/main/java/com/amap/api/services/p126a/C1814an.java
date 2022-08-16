package com.amap.api.services.p126a;

import android.content.Context;
import com.amap.api.services.weather.LocalWeatherLive;
import com.amap.api.services.weather.WeatherSearchQuery;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.an */
/* loaded from: classes19.dex */
public class C1814an extends AbstractC1815ao<WeatherSearchQuery, LocalWeatherLive> {

    /* renamed from: i */
    public LocalWeatherLive f24244i = new LocalWeatherLive();

    static {
        Covode.recordClassIndex(5425);
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
        stringBuffer.append("&extensions=base");
        stringBuffer.append(C0002O.m25086C("&key=", C1864bf.m16960f(this.f24224d)));
        return stringBuffer.toString();
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: e */
    public LocalWeatherLive mo16254a(String str) {
        this.f24244i = C2014q.m16326d(str);
        return this.f24244i;
    }

    public C1814an(Context context, WeatherSearchQuery weatherSearchQuery) {
        super(context, weatherSearchQuery);
    }
}
