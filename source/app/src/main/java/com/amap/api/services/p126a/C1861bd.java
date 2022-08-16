package com.amap.api.services.p126a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IWeatherSearch;
import com.amap.api.services.p126a.HandlerC2019t;
import com.amap.api.services.weather.LocalWeatherForecastResult;
import com.amap.api.services.weather.LocalWeatherLiveResult;
import com.amap.api.services.weather.WeatherSearch;
import com.amap.api.services.weather.WeatherSearchQuery;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.services.a.bd */
/* loaded from: classes19.dex */
public class C1861bd implements IWeatherSearch {

    /* renamed from: a */
    public Context f24379a;

    /* renamed from: b */
    public WeatherSearchQuery f24380b;

    /* renamed from: c */
    public WeatherSearch.OnWeatherSearchListener f24381c;

    /* renamed from: d */
    public LocalWeatherLiveResult f24382d;

    /* renamed from: e */
    public LocalWeatherForecastResult f24383e;

    /* renamed from: f */
    public Handler f24384f = HandlerC2019t.m16280a();

    static {
        Covode.recordClassIndex(5472);
    }

    @Override // com.amap.api.services.interfaces.IWeatherSearch
    public WeatherSearchQuery getQuery() {
        return this.f24380b;
    }

    @Override // com.amap.api.services.interfaces.IWeatherSearch
    public void searchWeatherAsyn() {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.bd.1
                static {
                    Covode.recordClassIndex(5473);
                }

                @Override // java.lang.Runnable
                public void run() {
                    HandlerC2019t.C2030k c2030k;
                    HandlerC2019t.C2031l c2031l;
                    Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                    obtainMessage.arg1 = 13;
                    Bundle bundle = new Bundle();
                    if (C1861bd.this.f24380b != null) {
                        if (C1861bd.this.f24380b.getType() == 1) {
                            try {
                                try {
                                    C1861bd.this.f24382d = C1861bd.this.m16986a();
                                    bundle.putInt("errorCode", 1000);
                                    c2031l = new HandlerC2019t.C2031l();
                                } catch (Throwable th) {
                                    HandlerC2019t.C2031l c2031l2 = new HandlerC2019t.C2031l();
                                    obtainMessage.what = 1301;
                                    c2031l2.f24862b = C1861bd.this.f24381c;
                                    c2031l2.f24861a = C1861bd.this.f24382d;
                                    obtainMessage.obj = c2031l2;
                                    obtainMessage.setData(bundle);
                                    C1861bd.this.f24384f.sendMessage(obtainMessage);
                                    throw th;
                                }
                            } catch (AMapException e) {
                                bundle.putInt("errorCode", e.getErrorCode());
                                C2007j.m16371a(e, "WeatherSearch", "searchWeatherAsyn");
                                c2031l = new HandlerC2019t.C2031l();
                                obtainMessage.what = 1301;
                                c2031l.f24862b = C1861bd.this.f24381c;
                                c2031l.f24861a = C1861bd.this.f24382d;
                                obtainMessage.obj = c2031l;
                                obtainMessage.setData(bundle);
                                C1861bd.this.f24384f.sendMessage(obtainMessage);
                                return;
                            } catch (Throwable th2) {
                                C2007j.m16371a(th2, "WeatherSearch", "searchWeatherAnsyThrowable");
                                c2031l = new HandlerC2019t.C2031l();
                                obtainMessage.what = 1301;
                                c2031l.f24862b = C1861bd.this.f24381c;
                                c2031l.f24861a = C1861bd.this.f24382d;
                                obtainMessage.obj = c2031l;
                                obtainMessage.setData(bundle);
                                C1861bd.this.f24384f.sendMessage(obtainMessage);
                                return;
                            }
                            obtainMessage.what = 1301;
                            c2031l.f24862b = C1861bd.this.f24381c;
                            c2031l.f24861a = C1861bd.this.f24382d;
                            obtainMessage.obj = c2031l;
                            obtainMessage.setData(bundle);
                            C1861bd.this.f24384f.sendMessage(obtainMessage);
                            return;
                        } else if (C1861bd.this.f24380b.getType() == 2) {
                            try {
                                try {
                                    C1861bd.this.f24383e = C1861bd.this.m16982b();
                                    bundle.putInt("errorCode", 1000);
                                    c2030k = new HandlerC2019t.C2030k();
                                } catch (Throwable th3) {
                                    HandlerC2019t.C2030k c2030k2 = new HandlerC2019t.C2030k();
                                    obtainMessage.what = 1302;
                                    c2030k2.f24860b = C1861bd.this.f24381c;
                                    c2030k2.f24859a = C1861bd.this.f24383e;
                                    obtainMessage.obj = c2030k2;
                                    obtainMessage.setData(bundle);
                                    C1861bd.this.f24384f.sendMessage(obtainMessage);
                                    throw th3;
                                }
                            } catch (AMapException e2) {
                                bundle.putInt("errorCode", e2.getErrorCode());
                                C2007j.m16371a(e2, "WeatherSearch", "searchWeatherAsyn");
                                c2030k = new HandlerC2019t.C2030k();
                                obtainMessage.what = 1302;
                                c2030k.f24860b = C1861bd.this.f24381c;
                                c2030k.f24859a = C1861bd.this.f24383e;
                                obtainMessage.obj = c2030k;
                                obtainMessage.setData(bundle);
                                C1861bd.this.f24384f.sendMessage(obtainMessage);
                                return;
                            } catch (Throwable th4) {
                                C2007j.m16371a(th4, "WeatherSearch", "searchWeatherAnsyThrowable");
                                c2030k = new HandlerC2019t.C2030k();
                                obtainMessage.what = 1302;
                                c2030k.f24860b = C1861bd.this.f24381c;
                                c2030k.f24859a = C1861bd.this.f24383e;
                                obtainMessage.obj = c2030k;
                                obtainMessage.setData(bundle);
                                C1861bd.this.f24384f.sendMessage(obtainMessage);
                                return;
                            }
                            obtainMessage.what = 1302;
                            c2030k.f24860b = C1861bd.this.f24381c;
                            c2030k.f24859a = C1861bd.this.f24383e;
                            obtainMessage.obj = c2030k;
                            obtainMessage.setData(bundle);
                            C1861bd.this.f24384f.sendMessage(obtainMessage);
                            return;
                        } else {
                            return;
                        }
                    }
                    try {
                        throw new AMapException("无效的参数 - IllegalArgumentException");
                    } catch (AMapException e3) {
                        C2007j.m16371a(e3, "WeatherSearch", "searchWeatherAsyn");
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public LocalWeatherLiveResult m16986a() {
        C2015r.m16283a(this.f24379a);
        WeatherSearchQuery weatherSearchQuery = this.f24380b;
        if (weatherSearchQuery != null) {
            C1814an c1814an = new C1814an(this.f24379a, weatherSearchQuery);
            return LocalWeatherLiveResult.createPagedResult(c1814an.m17065j(), c1814an.m17087c());
        }
        throw new AMapException("无效的参数 - IllegalArgumentException");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public LocalWeatherForecastResult m16982b() {
        C2015r.m16283a(this.f24379a);
        WeatherSearchQuery weatherSearchQuery = this.f24380b;
        if (weatherSearchQuery != null) {
            C1813am c1813am = new C1813am(this.f24379a, weatherSearchQuery);
            return LocalWeatherForecastResult.createPagedResult(c1813am.m17065j(), c1813am.m17087c());
        }
        throw new AMapException("无效的参数 - IllegalArgumentException");
    }

    @Override // com.amap.api.services.interfaces.IWeatherSearch
    public void setOnWeatherSearchListener(WeatherSearch.OnWeatherSearchListener onWeatherSearchListener) {
        this.f24381c = onWeatherSearchListener;
    }

    @Override // com.amap.api.services.interfaces.IWeatherSearch
    public void setQuery(WeatherSearchQuery weatherSearchQuery) {
        this.f24380b = weatherSearchQuery;
    }

    public C1861bd(Context context) {
        this.f24379a = context.getApplicationContext();
    }
}
