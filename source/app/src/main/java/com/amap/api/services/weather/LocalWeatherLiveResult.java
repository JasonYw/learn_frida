package com.amap.api.services.weather;

import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class LocalWeatherLiveResult {

    /* renamed from: a */
    public WeatherSearchQuery f25436a;

    /* renamed from: b */
    public LocalWeatherLive f25437b;

    static {
        Covode.recordClassIndex(5885);
    }

    public LocalWeatherLive getLiveResult() {
        return this.f25437b;
    }

    public WeatherSearchQuery getWeatherLiveQuery() {
        return this.f25436a;
    }

    public LocalWeatherLiveResult(WeatherSearchQuery weatherSearchQuery, LocalWeatherLive localWeatherLive) {
        this.f25436a = weatherSearchQuery;
        this.f25437b = localWeatherLive;
    }

    public static LocalWeatherLiveResult createPagedResult(WeatherSearchQuery weatherSearchQuery, LocalWeatherLive localWeatherLive) {
        return new LocalWeatherLiveResult(weatherSearchQuery, localWeatherLive);
    }
}
