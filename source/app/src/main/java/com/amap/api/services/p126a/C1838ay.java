package com.amap.api.services.p126a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.interfaces.IPoiSearch;
import com.amap.api.services.p126a.HandlerC2019t;
import com.amap.api.services.poisearch.PoiResult;
import com.amap.api.services.poisearch.PoiSearch;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.amap.api.services.a.ay */
/* loaded from: classes19.dex */
public class C1838ay implements IPoiSearch {

    /* renamed from: i */
    public static HashMap<Integer, PoiResult> f24317i;

    /* renamed from: a */
    public PoiSearch.SearchBound f24318a;

    /* renamed from: b */
    public PoiSearch.Query f24319b;

    /* renamed from: c */
    public Context f24320c;

    /* renamed from: d */
    public PoiSearch.OnPoiSearchListener f24321d;

    /* renamed from: f */
    public PoiSearch.Query f24323f;

    /* renamed from: g */
    public PoiSearch.SearchBound f24324g;

    /* renamed from: h */
    public int f24325h;

    /* renamed from: e */
    public String f24322e = "zh-CN";

    /* renamed from: j */
    public Handler f24326j = HandlerC2019t.m16280a();

    static {
        Covode.recordClassIndex(5449);
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public PoiSearch.SearchBound getBound() {
        return this.f24318a;
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public String getLanguage() {
        return this.f24322e;
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public PoiSearch.Query getQuery() {
        return this.f24319b;
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public void searchPOIAsyn() {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.ay.1
                static {
                    Covode.recordClassIndex(5450);
                }

                @Override // java.lang.Runnable
                public void run() {
                    HandlerC2019t.C2027h c2027h;
                    Message obtainMessage = C1838ay.this.f24326j.obtainMessage();
                    obtainMessage.arg1 = 6;
                    obtainMessage.what = 600;
                    Bundle bundle = new Bundle();
                    PoiResult poiResult = null;
                    try {
                        try {
                            poiResult = C1838ay.this.searchPOI();
                            bundle.putInt("errorCode", 1000);
                            c2027h = new HandlerC2019t.C2027h();
                        } catch (AMapException e) {
                            bundle.putInt("errorCode", e.getErrorCode());
                            c2027h = new HandlerC2019t.C2027h();
                        }
                        c2027h.f24854b = C1838ay.this.f24321d;
                        c2027h.f24853a = poiResult;
                        obtainMessage.obj = c2027h;
                        obtainMessage.setData(bundle);
                        C1838ay.this.f24326j.sendMessage(obtainMessage);
                    } catch (Throwable th) {
                        HandlerC2019t.C2027h c2027h2 = new HandlerC2019t.C2027h();
                        c2027h2.f24854b = C1838ay.this.f24321d;
                        c2027h2.f24853a = poiResult;
                        obtainMessage.obj = c2027h2;
                        obtainMessage.setData(bundle);
                        C1838ay.this.f24326j.sendMessage(obtainMessage);
                        throw th;
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private boolean m17009a() {
        PoiSearch.Query query = this.f24319b;
        if (query == null) {
            return false;
        }
        if (C2007j.m16372a(query.getQueryString()) && C2007j.m16372a(this.f24319b.getCategory())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m17005b() {
        PoiSearch.SearchBound bound = getBound();
        if (bound == null || !bound.getShape().equals("Bound")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private boolean m17002c() {
        PoiSearch.SearchBound bound = getBound();
        if (bound != null) {
            if (bound.getShape().equals("Bound")) {
                if (bound.getCenter() == null) {
                    return false;
                }
                return true;
            } else if (bound.getShape().equals("Polygon")) {
                List<LatLonPoint> polyGonList = bound.getPolyGonList();
                if (polyGonList == null || polyGonList.size() == 0) {
                    return false;
                }
                for (int i = 0; i < polyGonList.size(); i++) {
                    if (polyGonList.get(i) == null) {
                        return false;
                    }
                }
                return true;
            } else if (bound.getShape().equals("Rectangle")) {
                LatLonPoint lowerLeft = bound.getLowerLeft();
                LatLonPoint upperRight = bound.getUpperRight();
                if (lowerLeft == null || upperRight == null || lowerLeft.getLatitude() >= upperRight.getLatitude() || lowerLeft.getLongitude() >= upperRight.getLongitude()) {
                    return false;
                }
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public PoiResult searchPOI() {
        try {
            C2015r.m16283a(this.f24320c);
            if (!m17005b() && !m17009a()) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (m17002c()) {
                if (this.f24319b != null) {
                    if ((!this.f24319b.queryEquals(this.f24323f) && this.f24318a == null) || (!this.f24319b.queryEquals(this.f24323f) && !this.f24318a.equals(this.f24324g))) {
                        this.f24325h = 0;
                        this.f24323f = this.f24319b.m25287clone();
                        if (this.f24318a != null) {
                            this.f24324g = this.f24318a.m25288clone();
                        }
                        if (f24317i != null) {
                            f24317i.clear();
                        }
                    }
                    PoiSearch.SearchBound searchBound = null;
                    if (this.f24318a != null) {
                        searchBound = this.f24318a.m25288clone();
                    }
                    if (this.f24325h == 0) {
                        PoiResult m17087c = new C2037z(this.f24320c, new C1802ac(this.f24319b.m25287clone(), searchBound)).m17087c();
                        m17006a(m17087c);
                        return m17087c;
                    }
                    PoiResult m17008a = m17008a(this.f24319b.getPageNum());
                    if (m17008a == null) {
                        PoiResult m17087c2 = new C2037z(this.f24320c, new C1802ac(this.f24319b.m25287clone(), searchBound)).m17087c();
                        f24317i.put(Integer.valueOf(this.f24319b.getPageNum()), m17087c2);
                        return m17087c2;
                    }
                    return m17008a;
                }
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            C2007j.m16371a(e, "PoiSearch", "searchPOI");
            throw new AMapException(e.getErrorMessage());
        }
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public void setBound(PoiSearch.SearchBound searchBound) {
        this.f24318a = searchBound;
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public void setOnPoiSearchListener(PoiSearch.OnPoiSearchListener onPoiSearchListener) {
        this.f24321d = onPoiSearchListener;
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public void setQuery(PoiSearch.Query query) {
        this.f24319b = query;
    }

    /* renamed from: b */
    private boolean m17004b(int i) {
        if (i <= this.f24325h && i >= 0) {
            return true;
        }
        return false;
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public void searchPOIIdAsyn(final String str) {
        C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.ay.2
            static {
                Covode.recordClassIndex(5451);
            }

            @Override // java.lang.Runnable
            public void run() {
                HandlerC2019t.C2026g c2026g;
                Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                obtainMessage.arg1 = 6;
                obtainMessage.what = 602;
                Bundle bundle = new Bundle();
                PoiItem poiItem = null;
                try {
                    try {
                        poiItem = C1838ay.this.searchPOIId(str);
                        bundle.putInt("errorCode", 1000);
                        c2026g = new HandlerC2019t.C2026g();
                    } catch (AMapException e) {
                        C2007j.m16371a(e, "PoiSearch", "searchPOIIdAsyn");
                        bundle.putInt("errorCode", e.getErrorCode());
                        c2026g = new HandlerC2019t.C2026g();
                    }
                    c2026g.f24852b = C1838ay.this.f24321d;
                    c2026g.f24851a = poiItem;
                    obtainMessage.obj = c2026g;
                    obtainMessage.setData(bundle);
                    C1838ay.this.f24326j.sendMessage(obtainMessage);
                } catch (Throwable th) {
                    HandlerC2019t.C2026g c2026g2 = new HandlerC2019t.C2026g();
                    c2026g2.f24852b = C1838ay.this.f24321d;
                    c2026g2.f24851a = poiItem;
                    obtainMessage.obj = c2026g2;
                    obtainMessage.setData(bundle);
                    C1838ay.this.f24326j.sendMessage(obtainMessage);
                    throw th;
                }
            }
        });
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public void setLanguage(String str) {
        if ("en".equals(str)) {
            this.f24322e = "en";
        } else {
            this.f24322e = "zh-CN";
        }
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public PoiItem searchPOIId(String str) {
        C2015r.m16283a(this.f24320c);
        return new C2036y(this.f24320c, str).m17087c();
    }

    /* renamed from: a */
    private void m17006a(PoiResult poiResult) {
        int i;
        f24317i = new HashMap<>();
        PoiSearch.Query query = this.f24319b;
        if (query != null && poiResult != null && (i = this.f24325h) > 0 && i > query.getPageNum()) {
            f24317i.put(Integer.valueOf(this.f24319b.getPageNum()), poiResult);
        }
    }

    /* renamed from: a */
    public PoiResult m17008a(int i) {
        if (m17004b(i)) {
            return f24317i.get(Integer.valueOf(i));
        }
        throw new IllegalArgumentException("page out of range");
    }

    public C1838ay(Context context, PoiSearch.Query query) {
        this.f24320c = context.getApplicationContext();
        setQuery(query);
    }
}
