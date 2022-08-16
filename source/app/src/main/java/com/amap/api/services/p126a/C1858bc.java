package com.amap.api.services.p126a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.ITrafficSearch;
import com.amap.api.services.traffic.CircleTrafficQuery;
import com.amap.api.services.traffic.RoadTrafficQuery;
import com.amap.api.services.traffic.TrafficSearch;
import com.amap.api.services.traffic.TrafficStatusResult;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.services.a.bc */
/* loaded from: classes19.dex */
public class C1858bc implements ITrafficSearch {

    /* renamed from: a */
    public static final String f24371a = C1858bc.class.getSimpleName();

    /* renamed from: b */
    public TrafficSearch.OnTrafficSearchListener f24372b;

    /* renamed from: c */
    public Context f24373c;

    /* renamed from: d */
    public Handler f24374d = HandlerC2019t.m16280a();

    static {
        Covode.recordClassIndex(5469);
    }

    @Override // com.amap.api.services.interfaces.ITrafficSearch
    public void setTrafficSearchListener(TrafficSearch.OnTrafficSearchListener onTrafficSearchListener) {
        this.f24372b = onTrafficSearchListener;
    }

    public C1858bc(Context context) {
        this.f24373c = context.getApplicationContext();
    }

    @Override // com.amap.api.services.interfaces.ITrafficSearch
    public void loadTrafficByCircleAsyn(final CircleTrafficQuery circleTrafficQuery) {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.bc.2
                static {
                    Covode.recordClassIndex(5471);
                }

                @Override // java.lang.Runnable
                public void run() {
                    Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                    obtainMessage.what = 301;
                    obtainMessage.arg1 = 15;
                    Bundle bundle = new Bundle();
                    TrafficStatusResult trafficStatusResult = null;
                    try {
                        try {
                            trafficStatusResult = C1858bc.this.loadTrafficByCircle(circleTrafficQuery);
                            bundle.putInt("errorCode", 1000);
                        } catch (AMapException e) {
                            bundle.putInt("errorCode", e.getErrorCode());
                        }
                    } finally {
                        obtainMessage.obj = C1858bc.this.f24372b;
                        bundle.putParcelable("result", trafficStatusResult);
                        obtainMessage.setData(bundle);
                        C1858bc.this.f24374d.sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            C2007j.m16371a(th, f24371a, "loadTrafficByCircleAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.ITrafficSearch
    public void loadTrafficByRoadAsyn(final RoadTrafficQuery roadTrafficQuery) {
        try {
            C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.bc.1
                static {
                    Covode.recordClassIndex(5470);
                }

                @Override // java.lang.Runnable
                public void run() {
                    Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                    obtainMessage.what = 300;
                    obtainMessage.arg1 = 15;
                    Bundle bundle = new Bundle();
                    TrafficStatusResult trafficStatusResult = null;
                    try {
                        try {
                            trafficStatusResult = C1858bc.this.loadTrafficByRoad(roadTrafficQuery);
                            bundle.putInt("errorCode", 1000);
                        } catch (AMapException e) {
                            bundle.putInt("errorCode", e.getErrorCode());
                        }
                    } finally {
                        obtainMessage.obj = C1858bc.this.f24372b;
                        bundle.putParcelable("result", trafficStatusResult);
                        obtainMessage.setData(bundle);
                        C1858bc.this.f24374d.sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            C2007j.m16371a(th, f24371a, "loadTrafficByRoadAsyn");
        }
    }

    @Override // com.amap.api.services.interfaces.ITrafficSearch
    public TrafficStatusResult loadTrafficByCircle(CircleTrafficQuery circleTrafficQuery) {
        try {
            C2015r.m16283a(this.f24373c);
            if (circleTrafficQuery != null) {
                return new C1991e(this.f24373c, circleTrafficQuery.m25298clone()).m17087c();
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            C2007j.m16371a(e, f24371a, "loadTrafficByCircle");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.ITrafficSearch
    public TrafficStatusResult loadTrafficByRoad(RoadTrafficQuery roadTrafficQuery) {
        try {
            C2015r.m16283a(this.f24373c);
            if (roadTrafficQuery != null) {
                return new C1805af(this.f24373c, roadTrafficQuery.m25299clone()).m17087c();
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            C2007j.m16371a(e, f24371a, "loadTrafficByRoad");
            throw e;
        }
    }
}
