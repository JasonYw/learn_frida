package com.amap.api.services.geocoder;

import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class RegeocodeResult {

    /* renamed from: a */
    public RegeocodeQuery f25057a;

    /* renamed from: b */
    public RegeocodeAddress f25058b;

    static {
        Covode.recordClassIndex(5705);
    }

    public RegeocodeAddress getRegeocodeAddress() {
        return this.f25058b;
    }

    public RegeocodeQuery getRegeocodeQuery() {
        return this.f25057a;
    }

    public void setRegeocodeAddress(RegeocodeAddress regeocodeAddress) {
        this.f25058b = regeocodeAddress;
    }

    public void setRegeocodeQuery(RegeocodeQuery regeocodeQuery) {
        this.f25057a = regeocodeQuery;
    }

    public RegeocodeResult(RegeocodeQuery regeocodeQuery, RegeocodeAddress regeocodeAddress) {
        this.f25057a = regeocodeQuery;
        this.f25058b = regeocodeAddress;
    }
}
