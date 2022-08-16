package com.amap.api.services.cloud;

import com.amap.api.services.cloud.CloudSearch;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* loaded from: classes19.dex */
public final class CloudResult {

    /* renamed from: a */
    public int f24924a;

    /* renamed from: b */
    public ArrayList<CloudItem> f24925b;

    /* renamed from: c */
    public int f24926c;

    /* renamed from: d */
    public int f24927d;

    /* renamed from: e */
    public CloudSearch.Query f24928e;

    /* renamed from: f */
    public CloudSearch.SearchBound f24929f;

    static {
        Covode.recordClassIndex(5668);
    }

    public final CloudSearch.SearchBound getBound() {
        return this.f24929f;
    }

    public final ArrayList<CloudItem> getClouds() {
        return this.f24925b;
    }

    public final int getPageCount() {
        return this.f24924a;
    }

    public final CloudSearch.Query getQuery() {
        return this.f24928e;
    }

    public final int getTotalCount() {
        return this.f24926c;
    }

    /* renamed from: a */
    private int m16235a(int i) {
        int i2 = this.f24927d;
        return ((i + i2) - 1) / i2;
    }

    public static CloudResult createPagedResult(CloudSearch.Query query, int i, CloudSearch.SearchBound searchBound, int i2, ArrayList<CloudItem> arrayList) {
        return new CloudResult(query, i, searchBound, i2, arrayList);
    }

    public CloudResult(CloudSearch.Query query, int i, CloudSearch.SearchBound searchBound, int i2, ArrayList<CloudItem> arrayList) {
        this.f24928e = query;
        this.f24926c = i;
        this.f24927d = i2;
        this.f24924a = m16235a(this.f24926c);
        this.f24925b = arrayList;
        this.f24929f = searchBound;
    }
}
