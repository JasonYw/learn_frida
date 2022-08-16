package com.amap.api.services.weather;

import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class LocalWeatherForecastResult {

    /* renamed from: a */
    public WeatherSearchQuery f25425a;

    /* renamed from: b */
    public LocalWeatherForecast f25426b;

    static {
        Covode.recordClassIndex(5882);
    }

    public LocalWeatherForecast getForecastResult() {
        return this.f25426b;
    }

    public WeatherSearchQuery getWeatherForecastQuery() {
        return this.f25425a;
    }

    public LocalWeatherForecastResult(WeatherSearchQuery weatherSearchQuery, LocalWeatherForecast localWeatherForecast) {
        this.f25425a = weatherSearchQuery;
        this.f25426b = localWeatherForecast;
    }

    public static LocalWeatherForecastResult createPagedResult(WeatherSearchQuery weatherSearchQuery, LocalWeatherForecast localWeatherForecast) {
        return new LocalWeatherForecastResult(weatherSearchQuery, localWeatherForecast);
    }
}
