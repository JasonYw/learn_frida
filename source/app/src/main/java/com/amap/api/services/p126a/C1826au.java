package com.amap.api.services.p126a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.district.DistrictResult;
import com.amap.api.services.district.DistrictSearch;
import com.amap.api.services.district.DistrictSearchQuery;
import com.amap.api.services.interfaces.IDistrictSearch;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.amap.api.services.a.au */
/* loaded from: classes19.dex */
public class C1826au implements IDistrictSearch {

    /* renamed from: f */
    public static HashMap<Integer, DistrictResult> f24279f;

    /* renamed from: a */
    public Context f24280a;

    /* renamed from: b */
    public DistrictSearchQuery f24281b;

    /* renamed from: c */
    public DistrictSearch.OnDistrictSearchListener f24282c;

    /* renamed from: d */
    public DistrictSearchQuery f24283d;

    /* renamed from: e */
    public int f24284e;

    /* renamed from: g */
    public Handler f24285g = HandlerC2019t.m16280a();

    static {
        Covode.recordClassIndex(5437);
    }

    @Override // com.amap.api.services.interfaces.IDistrictSearch
    public DistrictSearchQuery getQuery() {
        return this.f24281b;
    }

    @Override // com.amap.api.services.interfaces.IDistrictSearch
    public void searchDistrictAnsy() {
        searchDistrictAsyn();
    }

    /* renamed from: a */
    private boolean m17035a() {
        if (this.f24281b == null) {
            return false;
        }
        return true;
    }

    @Override // com.amap.api.services.interfaces.IDistrictSearch
    public void searchDistrictAsyn() {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.au.1
                static {
                    Covode.recordClassIndex(5438);
                }

                @Override // java.lang.Runnable
                public void run() {
                    Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                    DistrictResult districtResult = new DistrictResult();
                    districtResult.setQuery(C1826au.this.f24281b);
                    try {
                        try {
                            districtResult = C1826au.this.searchDistrict();
                            if (districtResult != null) {
                                districtResult.setAMapException(new AMapException());
                            }
                        } finally {
                            obtainMessage.arg1 = 4;
                            obtainMessage.obj = C1826au.this.f24282c;
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("result", districtResult);
                            obtainMessage.setData(bundle);
                            if (C1826au.this.f24285g != null) {
                                C1826au.this.f24285g.sendMessage(obtainMessage);
                            }
                        }
                    } catch (AMapException e) {
                        districtResult.setAMapException(e);
                        obtainMessage.arg1 = 4;
                        obtainMessage.obj = C1826au.this.f24282c;
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("result", districtResult);
                        obtainMessage.setData(bundle2);
                        if (C1826au.this.f24285g != null) {
                            C1826au.this.f24285g.sendMessage(obtainMessage);
                        }
                    } catch (Throwable th) {
                        C2007j.m16371a(th, "DistrictSearch", "searchDistrictAnsyThrowable");
                        obtainMessage.arg1 = 4;
                        obtainMessage.obj = C1826au.this.f24282c;
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("result", districtResult);
                        obtainMessage.setData(bundle3);
                        if (C1826au.this.f24285g != null) {
                            C1826au.this.f24285g.sendMessage(obtainMessage);
                        }
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.amap.api.services.interfaces.IDistrictSearch
    public DistrictResult searchDistrict() {
        try {
            DistrictResult districtResult = new DistrictResult();
            C2015r.m16283a(this.f24280a);
            if (!m17035a()) {
                this.f24281b = new DistrictSearchQuery();
            }
            districtResult.setQuery(this.f24281b.m25286clone());
            if (!this.f24281b.weakEquals(this.f24283d)) {
                this.f24284e = 0;
                this.f24283d = this.f24281b.m25286clone();
                if (f24279f != null) {
                    f24279f.clear();
                }
            }
            if (this.f24284e == 0) {
                DistrictResult m17087c = new C2009l(this.f24280a, this.f24281b.m25286clone()).m17087c();
                if (m17087c == null) {
                    return m17087c;
                }
                this.f24284e = m17087c.getPageCount();
                m17032a(m17087c);
                return m17087c;
            }
            DistrictResult m17034a = m17034a(this.f24281b.getPageNum());
            if (m17034a == null) {
                m17034a = new C2009l(this.f24280a, this.f24281b.m25286clone()).m17087c();
                if (this.f24281b != null && m17034a != null && this.f24284e > 0 && this.f24284e > this.f24281b.getPageNum()) {
                    f24279f.put(Integer.valueOf(this.f24281b.getPageNum()), m17034a);
                }
            }
            return m17034a;
        } catch (AMapException e) {
            C2007j.m16371a(e, "DistrictSearch", "searchDistrict");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IDistrictSearch
    public void setOnDistrictSearchListener(DistrictSearch.OnDistrictSearchListener onDistrictSearchListener) {
        this.f24282c = onDistrictSearchListener;
    }

    @Override // com.amap.api.services.interfaces.IDistrictSearch
    public void setQuery(DistrictSearchQuery districtSearchQuery) {
        this.f24281b = districtSearchQuery;
    }

    public C1826au(Context context) {
        this.f24280a = context.getApplicationContext();
    }

    /* renamed from: b */
    private boolean m17031b(int i) {
        if (i < this.f24284e && i >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public DistrictResult m17034a(int i) {
        if (m17031b(i)) {
            return f24279f.get(Integer.valueOf(i));
        }
        throw new AMapException("无效的参数 - IllegalArgumentException");
    }

    /* renamed from: a */
    private void m17032a(DistrictResult districtResult) {
        int i;
        f24279f = new HashMap<>();
        DistrictSearchQuery districtSearchQuery = this.f24281b;
        if (districtSearchQuery != null && districtResult != null && (i = this.f24284e) > 0 && i > districtSearchQuery.getPageNum()) {
            f24279f.put(Integer.valueOf(this.f24281b.getPageNum()), districtResult);
        }
    }
}
