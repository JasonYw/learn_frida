package com.amap.api.services.busline;

import com.amap.api.services.core.SuggestionCity;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public final class BusStationResult {

    /* renamed from: a */
    public int f24909a;

    /* renamed from: b */
    public ArrayList<BusStationItem> f24910b;

    /* renamed from: c */
    public BusStationQuery f24911c;

    /* renamed from: d */
    public List<String> f24912d;

    /* renamed from: e */
    public List<SuggestionCity> f24913e;

    static {
        Covode.recordClassIndex(5659);
    }

    public final List<BusStationItem> getBusStations() {
        return this.f24910b;
    }

    public final int getPageCount() {
        return this.f24909a;
    }

    public final BusStationQuery getQuery() {
        return this.f24911c;
    }

    public final List<SuggestionCity> getSearchSuggestionCities() {
        return this.f24913e;
    }

    public final List<String> getSearchSuggestionKeywords() {
        return this.f24912d;
    }

    /* renamed from: a */
    private int m16242a(int i) {
        int pageSize = this.f24911c.getPageSize();
        int i2 = ((i + pageSize) - 1) / pageSize;
        if (i2 > 30) {
            return 30;
        }
        return i2;
    }

    public static BusStationResult createPagedResult(BusStationQuery busStationQuery, int i, List<SuggestionCity> list, List<String> list2, ArrayList<BusStationItem> arrayList) {
        return new BusStationResult(busStationQuery, i, list, list2, arrayList);
    }

    public BusStationResult(BusStationQuery busStationQuery, int i, List<SuggestionCity> list, List<String> list2, ArrayList<BusStationItem> arrayList) {
        this.f24910b = new ArrayList<>();
        this.f24912d = new ArrayList();
        this.f24913e = new ArrayList();
        this.f24911c = busStationQuery;
        this.f24909a = m16242a(i);
        this.f24913e = list;
        this.f24912d = list2;
        this.f24910b = arrayList;
    }
}
