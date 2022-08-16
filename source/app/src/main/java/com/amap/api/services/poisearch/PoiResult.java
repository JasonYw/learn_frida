package com.amap.api.services.poisearch;

import com.amap.api.services.core.PoiItem;
import com.amap.api.services.core.SuggestionCity;
import com.amap.api.services.poisearch.PoiSearch;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public final class PoiResult {

    /* renamed from: a */
    public int f25109a;

    /* renamed from: b */
    public ArrayList<PoiItem> f25110b;

    /* renamed from: c */
    public PoiSearch.Query f25111c;

    /* renamed from: d */
    public PoiSearch.SearchBound f25112d;

    /* renamed from: e */
    public List<String> f25113e;

    /* renamed from: f */
    public List<SuggestionCity> f25114f;

    /* renamed from: g */
    public int f25115g;

    static {
        Covode.recordClassIndex(5744);
    }

    public final PoiSearch.SearchBound getBound() {
        return this.f25112d;
    }

    public final int getPageCount() {
        return this.f25109a;
    }

    public final ArrayList<PoiItem> getPois() {
        return this.f25110b;
    }

    public final PoiSearch.Query getQuery() {
        return this.f25111c;
    }

    public final List<SuggestionCity> getSearchSuggestionCitys() {
        return this.f25114f;
    }

    public final List<String> getSearchSuggestionKeywords() {
        return this.f25113e;
    }

    /* renamed from: a */
    private int m16191a(int i) {
        int i2 = this.f25115g;
        return ((i + i2) - 1) / i2;
    }

    public static PoiResult createPagedResult(PoiSearch.Query query, PoiSearch.SearchBound searchBound, List<String> list, List<SuggestionCity> list2, int i, int i2, ArrayList<PoiItem> arrayList) {
        return new PoiResult(query, searchBound, list, list2, i, i2, arrayList);
    }

    public PoiResult(PoiSearch.Query query, PoiSearch.SearchBound searchBound, List<String> list, List<SuggestionCity> list2, int i, int i2, ArrayList<PoiItem> arrayList) {
        this.f25110b = new ArrayList<>();
        this.f25111c = query;
        this.f25112d = searchBound;
        this.f25113e = list;
        this.f25114f = list2;
        this.f25115g = i;
        this.f25109a = m16191a(i2);
        this.f25110b = arrayList;
    }
}
