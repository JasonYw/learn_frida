package com.amap.api.services.p126a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IDistanceSearch;
import com.amap.api.services.route.DistanceResult;
import com.amap.api.services.route.DistanceSearch;
import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitor;

/* renamed from: com.amap.api.services.a.at */
/* loaded from: classes19.dex */
public class C1824at implements IDistanceSearch {

    /* renamed from: a */
    public static final String f24273a = C1824at.class.getSimpleName();

    /* renamed from: b */
    public Context f24274b;

    /* renamed from: c */
    public Handler f24275c = HandlerC2019t.m16280a();

    /* renamed from: d */
    public DistanceSearch.OnDistanceSearchListener f24276d;

    static {
        Covode.recordClassIndex(5435);
    }

    @Override // com.amap.api.services.interfaces.IDistanceSearch
    public void setDistanceSearchListener(DistanceSearch.OnDistanceSearchListener onDistanceSearchListener) {
        this.f24276d = onDistanceSearchListener;
    }

    public C1824at(Context context) {
        this.f24274b = context.getApplicationContext();
    }

    @Override // com.amap.api.services.interfaces.IDistanceSearch
    public void calculateRouteDistanceAsyn(final DistanceSearch.DistanceQuery distanceQuery) {
        C1810aj.m17072a().m17071a(new Runnable() { // from class: com.amap.api.services.a.at.1
            static {
                Covode.recordClassIndex(5436);
            }

            @Override // java.lang.Runnable
            public void run() {
                Message obtainMessage = HandlerC2019t.m16280a().obtainMessage();
                obtainMessage.what = SDKMonitor.SDK_VERSION;
                obtainMessage.arg1 = 16;
                Bundle bundle = new Bundle();
                DistanceResult distanceResult = null;
                try {
                    try {
                        distanceResult = C1824at.this.calculateRouteDistance(distanceQuery);
                        bundle.putInt("errorCode", 1000);
                    } catch (AMapException e) {
                        bundle.putInt("errorCode", e.getErrorCode());
                    }
                } finally {
                    obtainMessage.obj = C1824at.this.f24276d;
                    bundle.putParcelable("result", distanceResult);
                    obtainMessage.setData(bundle);
                    C1824at.this.f24275c.sendMessage(obtainMessage);
                }
            }
        });
    }

    /* renamed from: a */
    private boolean m17037a(DistanceSearch.DistanceQuery distanceQuery) {
        if (distanceQuery.getDestination() == null || distanceQuery.getOrigins() == null || distanceQuery.getOrigins().size() <= 0) {
            return true;
        }
        return false;
    }

    @Override // com.amap.api.services.interfaces.IDistanceSearch
    public DistanceResult calculateRouteDistance(DistanceSearch.DistanceQuery distanceQuery) {
        try {
            C2015r.m16283a(this.f24274b);
            if (distanceQuery != null) {
                if (!m17037a(distanceQuery)) {
                    DistanceSearch.DistanceQuery m25289clone = distanceQuery.m25289clone();
                    DistanceResult m17087c = new C2008k(this.f24274b, m25289clone).m17087c();
                    if (m17087c != null) {
                        m17087c.setDistanceQuery(m25289clone);
                    }
                    return m17087c;
                }
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            C2007j.m16371a(e, f24273a, "calculateWalkRoute");
            throw e;
        }
    }
}
