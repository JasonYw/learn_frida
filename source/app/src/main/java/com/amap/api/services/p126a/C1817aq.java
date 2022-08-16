package com.amap.api.services.p126a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.busline.BusLineQuery;
import com.amap.api.services.busline.BusLineResult;
import com.amap.api.services.busline.BusLineSearch;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IBusLineSearch;
import com.amap.api.services.p126a.HandlerC2019t;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.amap.api.services.a.aq */
/* loaded from: classes19.dex */
public class C1817aq implements IBusLineSearch {

    /* renamed from: a */
    public Context f24246a;

    /* renamed from: b */
    public BusLineSearch.OnBusLineSearchListener f24247b;

    /* renamed from: c */
    public BusLineQuery f24248c;

    /* renamed from: d */
    public BusLineQuery f24249d;

    /* renamed from: e */
    public int f24250e;

    /* renamed from: f */
    public ArrayList<BusLineResult> f24251f = new ArrayList<>();

    /* renamed from: g */
    public Handler f24252g;

    static {
        Covode.recordClassIndex(5428);
    }

    @Override // com.amap.api.services.interfaces.IBusLineSearch
    public BusLineQuery getQuery() {
        return this.f24248c;
    }

    @Override // com.amap.api.services.interfaces.IBusLineSearch
    public void searchBusLineAsyn() {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.aq.1
                static {
                    Covode.recordClassIndex(5429);
                }

                @Override // java.lang.Runnable
                public void run() {
                    Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                    try {
                        try {
                            obtainMessage.arg1 = 3;
                            obtainMessage.what = 1000;
                            HandlerC2019t.C2020a c2020a = new HandlerC2019t.C2020a();
                            obtainMessage.obj = c2020a;
                            c2020a.f24840b = C1817aq.this.f24247b;
                            c2020a.f24839a = C1817aq.this.searchBusLine();
                        } catch (AMapException e) {
                            obtainMessage.what = e.getErrorCode();
                        }
                    } finally {
                        C1817aq.this.f24252g.sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private boolean m17060a() {
        BusLineQuery busLineQuery = this.f24248c;
        if (busLineQuery == null || C2007j.m16372a(busLineQuery.getQueryString())) {
            return false;
        }
        return true;
    }

    @Override // com.amap.api.services.interfaces.IBusLineSearch
    public BusLineResult searchBusLine() {
        try {
            C2015r.m16283a(this.f24246a);
            if (this.f24249d != null && m17060a()) {
                if (!this.f24248c.weakEquals(this.f24249d)) {
                    this.f24249d = this.f24248c.m25282clone();
                    this.f24250e = 0;
                    if (this.f24251f != null) {
                        this.f24251f.clear();
                    }
                }
                if (this.f24250e == 0) {
                    BusLineResult busLineResult = (BusLineResult) new C1952d(this.f24246a, this.f24248c.m25282clone()).m17087c();
                    m17057a(busLineResult);
                    return busLineResult;
                }
                BusLineResult m17056b = m17056b(this.f24248c.getPageNumber());
                if (m17056b == null) {
                    BusLineResult busLineResult2 = (BusLineResult) new C1952d(this.f24246a, this.f24248c).m17087c();
                    this.f24251f.set(this.f24248c.getPageNumber(), busLineResult2);
                    return busLineResult2;
                }
                return m17056b;
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            C2007j.m16371a(e, "BusLineSearch", "searchBusLine");
            throw new AMapException(e.getErrorMessage());
        }
    }

    @Override // com.amap.api.services.interfaces.IBusLineSearch
    public void setOnBusLineSearchListener(BusLineSearch.OnBusLineSearchListener onBusLineSearchListener) {
        this.f24247b = onBusLineSearchListener;
    }

    /* renamed from: a */
    private boolean m17059a(int i) {
        if (i < this.f24250e && i >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private BusLineResult m17056b(int i) {
        if (m17059a(i)) {
            return this.f24251f.get(i);
        }
        throw new IllegalArgumentException("page out of range");
    }

    @Override // com.amap.api.services.interfaces.IBusLineSearch
    public void setQuery(BusLineQuery busLineQuery) {
        if (!this.f24248c.weakEquals(busLineQuery)) {
            this.f24248c = busLineQuery;
            this.f24249d = busLineQuery.m25282clone();
        }
    }

    /* renamed from: a */
    private void m17057a(BusLineResult busLineResult) {
        int i;
        this.f24251f = new ArrayList<>();
        int i2 = 0;
        while (true) {
            i = this.f24250e;
            if (i2 >= i) {
                break;
            }
            this.f24251f.add(null);
            i2++;
        }
        if (i >= 0 && m17059a(this.f24248c.getPageNumber())) {
            this.f24251f.set(this.f24248c.getPageNumber(), busLineResult);
        }
    }

    public C1817aq(Context context, BusLineQuery busLineQuery) {
        this.f24252g = null;
        this.f24246a = context.getApplicationContext();
        this.f24248c = busLineQuery;
        if (busLineQuery != null) {
            this.f24249d = busLineQuery.m25282clone();
        }
        this.f24252g = HandlerC2019t.m16280a();
    }
}
