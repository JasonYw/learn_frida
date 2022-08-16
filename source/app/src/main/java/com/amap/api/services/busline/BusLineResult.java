package com.amap.api.services.busline;

import com.amap.api.services.core.SuggestionCity;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public final class BusLineResult {

    /* renamed from: a */
    public int f24893a;

    /* renamed from: b */
    public ArrayList<BusLineItem> f24894b;

    /* renamed from: c */
    public BusLineQuery f24895c;

    /* renamed from: d */
    public List<String> f24896d;

    /* renamed from: e */
    public List<SuggestionCity> f24897e;

    static {
        Covode.recordClassIndex(5653);
    }

    public final List<BusLineItem> getBusLines() {
        return this.f24894b;
    }

    public final int getPageCount() {
        return this.f24893a;
    }

    public final BusLineQuery getQuery() {
        return this.f24895c;
    }

    public final List<SuggestionCity> getSearchSuggestionCities() {
        return this.f24897e;
    }

    public final List<String> getSearchSuggestionKeywords() {
        return this.f24896d;
    }

    /* renamed from: a */
    private int m16247a(int i) {
        int pageSize = this.f24895c.getPageSize();
        int i2 = ((i + pageSize) - 1) / pageSize;
        if (i2 > 30) {
            return 30;
        }
        return i2;
    }

    public static BusLineResult createPagedResult(BusLineQuery busLineQuery, int i, List<SuggestionCity> list, List<String> list2, ArrayList<BusLineItem> arrayList) {
        return new BusLineResult(busLineQuery, i, list, list2, arrayList);
    }

    public BusLineResult(BusLineQuery busLineQuery, int i, List<SuggestionCity> list, List<String> list2, ArrayList<BusLineItem> arrayList) {
        this.f24894b = new ArrayList<>();
        this.f24896d = new ArrayList();
        this.f24897e = new ArrayList();
        this.f24895c = busLineQuery;
        this.f24893a = m16247a(i);
        this.f24897e = list;
        this.f24896d = list2;
        this.f24894b = arrayList;
    }
}
