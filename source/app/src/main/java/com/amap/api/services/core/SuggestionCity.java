package com.amap.api.services.core;

import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class SuggestionCity {

    /* renamed from: a */
    public String f24989a;

    /* renamed from: b */
    public String f24990b;

    /* renamed from: c */
    public String f24991c;

    /* renamed from: d */
    public int f24992d;

    static {
        Covode.recordClassIndex(5683);
    }

    public SuggestionCity() {
    }

    public String getAdCode() {
        return this.f24991c;
    }

    public String getCityCode() {
        return this.f24990b;
    }

    public String getCityName() {
        return this.f24989a;
    }

    public int getSuggestionNum() {
        return this.f24992d;
    }

    public void setAdCode(String str) {
        this.f24991c = str;
    }

    public void setCityCode(String str) {
        this.f24990b = str;
    }

    public void setCityName(String str) {
        this.f24989a = str;
    }

    public void setSuggestionNum(int i) {
        this.f24992d = i;
    }

    public SuggestionCity(String str, String str2, String str3, int i) {
        this.f24989a = str;
        this.f24990b = str2;
        this.f24991c = str3;
        this.f24992d = i;
    }
}
