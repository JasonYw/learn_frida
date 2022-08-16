package com.amap.api.services.p126a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.busline.BusStationQuery;
import com.amap.api.services.busline.BusStationResult;
import com.amap.api.services.busline.BusStationSearch;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IBusStationSearch;
import com.amap.api.services.p126a.HandlerC2019t;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.amap.api.services.a.ar */
/* loaded from: classes19.dex */
public class C1819ar implements IBusStationSearch {

    /* renamed from: a */
    public Context f24254a;

    /* renamed from: b */
    public BusStationSearch.OnBusStationSearchListener f24255b;

    /* renamed from: c */
    public BusStationQuery f24256c;

    /* renamed from: d */
    public BusStationQuery f24257d;

    /* renamed from: f */
    public int f24259f;

    /* renamed from: e */
    public ArrayList<BusStationResult> f24258e = new ArrayList<>();

    /* renamed from: g */
    public Handler f24260g = HandlerC2019t.m16280a();

    static {
        Covode.recordClassIndex(5430);
    }

    @Override // com.amap.api.services.interfaces.IBusStationSearch
    public BusStationQuery getQuery() {
        return this.f24256c;
    }

    @Override // com.amap.api.services.interfaces.IBusStationSearch
    public void searchBusStationAsyn() {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.ar.1
                static {
                    Covode.recordClassIndex(5431);
                }

                @Override // java.lang.Runnable
                public void run() {
                    Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                    try {
                        try {
                            obtainMessage.arg1 = 7;
                            HandlerC2019t.C2021b c2021b = new HandlerC2019t.C2021b();
                            c2021b.f24842b = C1819ar.this.f24255b;
                            obtainMessage.obj = c2021b;
                            BusStationResult searchBusStation = C1819ar.this.searchBusStation();
                            obtainMessage.what = 1000;
                            c2021b.f24841a = searchBusStation;
                        } catch (AMapException e) {
                            obtainMessage.what = e.getErrorCode();
                        }
                    } finally {
                        C1819ar.this.f24260g.sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private boolean m17054a() {
        BusStationQuery busStationQuery = this.f24256c;
        if (busStationQuery == null || C2007j.m16372a(busStationQuery.getQueryString())) {
            return false;
        }
        return true;
    }

    @Override // com.amap.api.services.interfaces.IBusStationSearch
    public BusStationResult searchBusStation() {
        try {
            C2015r.m16283a(this.f24254a);
            if (m17054a()) {
                if (!this.f24256c.weakEquals(this.f24257d)) {
                    this.f24257d = this.f24256c.m25283clone();
                    this.f24259f = 0;
                    if (this.f24258e != null) {
                        this.f24258e.clear();
                    }
                }
                if (this.f24259f == 0) {
                    BusStationResult busStationResult = (BusStationResult) new C1952d(this.f24254a, this.f24256c).m17087c();
                    this.f24259f = busStationResult.getPageCount();
                    m17051a(busStationResult);
                    return busStationResult;
                }
                BusStationResult m17050b = m17050b(this.f24256c.getPageNumber());
                if (m17050b == null) {
                    BusStationResult busStationResult2 = (BusStationResult) new C1952d(this.f24254a, this.f24256c).m17087c();
                    this.f24258e.set(this.f24256c.getPageNumber(), busStationResult2);
                    return busStationResult2;
                }
                return m17050b;
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            C2007j.m16371a(e, "BusStationSearch", "searchBusStation");
            throw new AMapException(e.getErrorMessage());
        } catch (Throwable th) {
            C2007j.m16371a(th, "BusStationSearch", "searchBusStation");
            return null;
        }
    }

    @Override // com.amap.api.services.interfaces.IBusStationSearch
    public void setOnBusStationSearchListener(BusStationSearch.OnBusStationSearchListener onBusStationSearchListener) {
        this.f24255b = onBusStationSearchListener;
    }

    /* renamed from: a */
    private boolean m17053a(int i) {
        if (i <= this.f24259f && i >= 0) {
            return true;
        }
        return false;
    }

    @Override // com.amap.api.services.interfaces.IBusStationSearch
    public void setQuery(BusStationQuery busStationQuery) {
        if (!busStationQuery.weakEquals(this.f24256c)) {
            this.f24256c = busStationQuery;
        }
    }

    /* renamed from: b */
    private BusStationResult m17050b(int i) {
        if (m17053a(i)) {
            return this.f24258e.get(i);
        }
        throw new IllegalArgumentException("page out of range");
    }

    /* renamed from: a */
    private void m17051a(BusStationResult busStationResult) {
        int i;
        this.f24258e = new ArrayList<>();
        int i2 = 0;
        while (true) {
            i = this.f24259f;
            if (i2 > i) {
                break;
            }
            this.f24258e.add(null);
            i2++;
        }
        if (i > 0) {
            this.f24258e.set(this.f24256c.getPageNumber(), busStationResult);
        }
    }

    public C1819ar(Context context, BusStationQuery busStationQuery) {
        this.f24254a = context.getApplicationContext();
        this.f24256c = busStationQuery;
    }
}
