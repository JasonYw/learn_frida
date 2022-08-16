package com.amap.api.services.routepoisearch;

import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.p126a.C2007j;
import com.amap.api.services.routepoisearch.RoutePOISearch;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes19.dex */
public class RoutePOISearchQuery implements Cloneable {

    /* renamed from: a */
    public LatLonPoint f25367a;

    /* renamed from: b */
    public LatLonPoint f25368b;

    /* renamed from: c */
    public int f25369c;

    /* renamed from: d */
    public RoutePOISearch.RoutePOISearchType f25370d;

    /* renamed from: e */
    public int f25371e;

    /* renamed from: f */
    public List<LatLonPoint> f25372f;

    static {
        Covode.recordClassIndex(5856);
    }

    public LatLonPoint getFrom() {
        return this.f25367a;
    }

    public int getMode() {
        return this.f25369c;
    }

    public List<LatLonPoint> getPolylines() {
        return this.f25372f;
    }

    public int getRange() {
        return this.f25371e;
    }

    public RoutePOISearch.RoutePOISearchType getSearchType() {
        return this.f25370d;
    }

    public LatLonPoint getTo() {
        return this.f25368b;
    }

    /* renamed from: clone */
    public RoutePOISearchQuery m25297clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            C2007j.m16371a(e, "RoutePOISearchQuery", "RoutePOISearchQueryclone");
        }
        List<LatLonPoint> list = this.f25372f;
        if (list != null && list.size() > 0) {
            return new RoutePOISearchQuery(this.f25372f, this.f25370d, this.f25371e);
        }
        return new RoutePOISearchQuery(this.f25367a, this.f25368b, this.f25369c, this.f25370d, this.f25371e);
    }

    public RoutePOISearchQuery(List<LatLonPoint> list, RoutePOISearch.RoutePOISearchType routePOISearchType, int i) {
        this.f25371e = 250;
        this.f25372f = list;
        this.f25370d = routePOISearchType;
        this.f25371e = i;
    }

    public RoutePOISearchQuery(LatLonPoint latLonPoint, LatLonPoint latLonPoint2, int i, RoutePOISearch.RoutePOISearchType routePOISearchType, int i2) {
        this.f25371e = 250;
        this.f25367a = latLonPoint;
        this.f25368b = latLonPoint2;
        this.f25369c = i;
        this.f25370d = routePOISearchType;
        this.f25371e = i2;
    }
}
