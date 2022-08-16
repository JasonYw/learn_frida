package com.amap.api.mapcore2d;

import android.location.Location;
import com.amap.api.maps2d.LocationSource;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.d */
/* loaded from: classes19.dex */
public class C1598d implements LocationSource.OnLocationChangedListener {

    /* renamed from: a */
    public Location f23311a;

    /* renamed from: b */
    public AbstractC1783y f23312b;

    static {
        Covode.recordClassIndex(5146);
    }

    public C1598d(AbstractC1783y abstractC1783y) {
        this.f23312b = abstractC1783y;
    }

    @Override // com.amap.api.maps2d.LocationSource.OnLocationChangedListener
    public void onLocationChanged(Location location) {
        this.f23311a = location;
        try {
            if (this.f23312b.isMyLocationEnabled()) {
                this.f23312b.showMyLocationOverlay(location);
            }
        } catch (Throwable th) {
            C1569cm.m18147a(th, "AMapOnLocationChangedListener", "onLocationChanged");
        }
    }
}
