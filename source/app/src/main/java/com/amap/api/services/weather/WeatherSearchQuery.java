package com.amap.api.services.weather;

import com.amap.api.services.p126a.C2007j;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class WeatherSearchQuery implements Cloneable {

    /* renamed from: a */
    public String f25439a;

    /* renamed from: b */
    public int f25440b;

    static {
        Covode.recordClassIndex(5888);
    }

    public String getCity() {
        return this.f25439a;
    }

    public int getType() {
        return this.f25440b;
    }

    public WeatherSearchQuery() {
        this.f25440b = 1;
    }

    /* renamed from: clone */
    public WeatherSearchQuery m25300clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            C2007j.m16371a(e, "WeatherSearchQuery", "clone");
        }
        return new WeatherSearchQuery(this.f25439a, this.f25440b);
    }

    public WeatherSearchQuery(String str, int i) {
        this.f25440b = 1;
        this.f25439a = str;
        this.f25440b = i;
    }
}
