package com.amap.api.services.p126a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IRoutePOISearch;
import com.amap.api.services.p126a.HandlerC2019t;
import com.amap.api.services.routepoisearch.RoutePOISearch;
import com.amap.api.services.routepoisearch.RoutePOISearchQuery;
import com.amap.api.services.routepoisearch.RoutePOISearchResult;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.services.a.az */
/* loaded from: classes19.dex */
public class C1841az implements IRoutePOISearch {

    /* renamed from: a */
    public RoutePOISearchQuery f24330a;

    /* renamed from: b */
    public Context f24331b;

    /* renamed from: c */
    public RoutePOISearch.OnRoutePOISearchListener f24332c;

    /* renamed from: d */
    public Handler f24333d = HandlerC2019t.m16280a();

    static {
        Covode.recordClassIndex(5452);
    }

    @Override // com.amap.api.services.interfaces.IRoutePOISearch
    public RoutePOISearchQuery getQuery() {
        return this.f24330a;
    }

    @Override // com.amap.api.services.interfaces.IRoutePOISearch
    public void searchRoutePOIAsyn() {
        C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.az.1
            static {
                Covode.recordClassIndex(5453);
            }

            @Override // java.lang.Runnable
            public void run() {
                HandlerC2019t.C2029j c2029j;
                Message obtainMessage = C1841az.this.f24333d.obtainMessage();
                obtainMessage.arg1 = 14;
                Bundle bundle = new Bundle();
                RoutePOISearchResult routePOISearchResult = null;
                try {
                    try {
                        routePOISearchResult = C1841az.this.searchRoutePOI();
                        bundle.putInt("errorCode", 1000);
                        c2029j = new HandlerC2019t.C2029j();
                    } catch (AMapException e) {
                        bundle.putInt("errorCode", e.getErrorCode());
                        c2029j = new HandlerC2019t.C2029j();
                    }
                    c2029j.f24858b = C1841az.this.f24332c;
                    c2029j.f24857a = routePOISearchResult;
                    obtainMessage.obj = c2029j;
                    obtainMessage.setData(bundle);
                    C1841az.this.f24333d.sendMessage(obtainMessage);
                } catch (Throwable th) {
                    HandlerC2019t.C2029j c2029j2 = new HandlerC2019t.C2029j();
                    c2029j2.f24858b = C1841az.this.f24332c;
                    c2029j2.f24857a = routePOISearchResult;
                    obtainMessage.obj = c2029j2;
                    obtainMessage.setData(bundle);
                    C1841az.this.f24333d.sendMessage(obtainMessage);
                    throw th;
                }
            }
        });
    }

    /* renamed from: a */
    private boolean m17001a() {
        RoutePOISearchQuery routePOISearchQuery = this.f24330a;
        if (routePOISearchQuery == null || routePOISearchQuery.getSearchType() == null) {
            return false;
        }
        if (this.f24330a.getFrom() == null && this.f24330a.getTo() == null && this.f24330a.getPolylines() == null) {
            return false;
        }
        return true;
    }

    @Override // com.amap.api.services.interfaces.IRoutePOISearch
    public RoutePOISearchResult searchRoutePOI() {
        try {
            C2015r.m16283a(this.f24331b);
            if (m17001a()) {
                return new C1806ag(this.f24331b, this.f24330a.m25297clone()).m17087c();
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            C2007j.m16371a(e, "RoutePOISearchCore", "searchRoutePOI");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IRoutePOISearch
    public void setQuery(RoutePOISearchQuery routePOISearchQuery) {
        this.f24330a = routePOISearchQuery;
    }

    @Override // com.amap.api.services.interfaces.IRoutePOISearch
    public void setRoutePOISearchListener(RoutePOISearch.OnRoutePOISearchListener onRoutePOISearchListener) {
        this.f24332c = onRoutePOISearchListener;
    }

    public C1841az(Context context, RoutePOISearchQuery routePOISearchQuery) {
        this.f24331b = context;
        this.f24330a = routePOISearchQuery;
    }
}
