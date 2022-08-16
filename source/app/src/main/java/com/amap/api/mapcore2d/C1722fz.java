package com.amap.api.mapcore2d;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationListener;
import com.autonavi.amap.mapcore2d.Inner_3dMap_location;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationListener;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.fz */
/* loaded from: classes19.dex */
public final class C1722fz implements AMapLocationListener {

    /* renamed from: a */
    public Inner_3dMap_locationListener f23648a;

    static {
        Covode.recordClassIndex(5270);
    }

    /* renamed from: a */
    public final void m17495a(Inner_3dMap_locationListener inner_3dMap_locationListener) {
        this.f23648a = inner_3dMap_locationListener;
    }

    @Override // com.amap.api.location.AMapLocationListener
    public final void onLocationChanged(AMapLocation aMapLocation) {
        try {
            Inner_3dMap_location m17486a = C1726gb.m17486a(aMapLocation);
            if (C1740gk.m17430a(m17486a)) {
                C1726gb.f23662a = m17486a;
            }
            if (this.f23648a == null) {
                return;
            }
            this.f23648a.onLocationChanged(m17486a);
        } catch (Throwable th) {
            C1752gu.m17302a(th, "LocationListener", "onLocationChanged");
        }
    }
}
