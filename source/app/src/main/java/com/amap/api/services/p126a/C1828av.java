package com.amap.api.services.p126a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.geocoder.GeocodeAddress;
import com.amap.api.services.geocoder.GeocodeQuery;
import com.amap.api.services.geocoder.GeocodeResult;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.amap.api.services.geocoder.RegeocodeAddress;
import com.amap.api.services.geocoder.RegeocodeQuery;
import com.amap.api.services.geocoder.RegeocodeResult;
import com.amap.api.services.interfaces.IGeocodeSearch;
import com.amap.api.services.p126a.HandlerC2019t;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.amap.api.services.a.av */
/* loaded from: classes19.dex */
public final class C1828av implements IGeocodeSearch {

    /* renamed from: a */
    public Context f24287a;

    /* renamed from: b */
    public GeocodeSearch.OnGeocodeSearchListener f24288b;

    /* renamed from: c */
    public Handler f24289c = HandlerC2019t.m16280a();

    static {
        Covode.recordClassIndex(5439);
    }

    @Override // com.amap.api.services.interfaces.IGeocodeSearch
    public final void setOnGeocodeSearchListener(GeocodeSearch.OnGeocodeSearchListener onGeocodeSearchListener) {
        this.f24288b = onGeocodeSearchListener;
    }

    public C1828av(Context context) {
        this.f24287a = context.getApplicationContext();
    }

    /* renamed from: a */
    private boolean m17027a(RegeocodeQuery regeocodeQuery) {
        if (regeocodeQuery == null || regeocodeQuery.getPoint() == null || regeocodeQuery.getLatLonType() == null) {
            return false;
        }
        return true;
    }

    @Override // com.amap.api.services.interfaces.IGeocodeSearch
    public final void getFromLocationAsyn(final RegeocodeQuery regeocodeQuery) {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.av.1
                static {
                    Covode.recordClassIndex(5440);
                }

                @Override // java.lang.Runnable
                public void run() {
                    Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                    try {
                        try {
                            obtainMessage.arg1 = 2;
                            obtainMessage.what = 201;
                            HandlerC2019t.C2028i c2028i = new HandlerC2019t.C2028i();
                            c2028i.f24856b = C1828av.this.f24288b;
                            obtainMessage.obj = c2028i;
                            c2028i.f24855a = new RegeocodeResult(regeocodeQuery, C1828av.this.getFromLocation(regeocodeQuery));
                            obtainMessage.arg2 = 1000;
                        } catch (AMapException e) {
                            obtainMessage.arg2 = e.getErrorCode();
                        }
                    } finally {
                        C1828av.this.f24289c.sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            C2007j.m16371a(th, "GeocodeSearch", "getFromLocationAsyn_threadcreate");
        }
    }

    @Override // com.amap.api.services.interfaces.IGeocodeSearch
    public final void getFromLocationNameAsyn(final GeocodeQuery geocodeQuery) {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.av.2
                static {
                    Covode.recordClassIndex(5441);
                }

                @Override // java.lang.Runnable
                public void run() {
                    Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                    try {
                        try {
                            obtainMessage.what = 200;
                            obtainMessage.arg1 = 2;
                            obtainMessage.arg2 = 1000;
                            HandlerC2019t.C2024e c2024e = new HandlerC2019t.C2024e();
                            c2024e.f24848b = C1828av.this.f24288b;
                            obtainMessage.obj = c2024e;
                            c2024e.f24847a = new GeocodeResult(geocodeQuery, C1828av.this.getFromLocationName(geocodeQuery));
                        } catch (AMapException e) {
                            obtainMessage.arg2 = e.getErrorCode();
                        }
                    } finally {
                        C1828av.this.f24289c.sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            C2007j.m16371a(th, "GeocodeSearch", "getFromLocationNameAsynThrowable");
        }
    }

    @Override // com.amap.api.services.interfaces.IGeocodeSearch
    public final RegeocodeAddress getFromLocation(RegeocodeQuery regeocodeQuery) {
        try {
            C2015r.m16283a(this.f24287a);
            if (m17027a(regeocodeQuery)) {
                return new C1803ad(this.f24287a, regeocodeQuery).m17087c();
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            C2007j.m16371a(e, "GeocodeSearch", "getFromLocationAsyn");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IGeocodeSearch
    public final List<GeocodeAddress> getFromLocationName(GeocodeQuery geocodeQuery) {
        try {
            C2015r.m16283a(this.f24287a);
            if (geocodeQuery != null) {
                return new C2012o(this.f24287a, geocodeQuery).m17087c();
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            C2007j.m16371a(e, "GeocodeSearch", "getFromLocationName");
            throw e;
        }
    }
}
