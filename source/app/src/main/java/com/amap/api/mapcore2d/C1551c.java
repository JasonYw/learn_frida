package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Bundle;
import com.amap.api.maps2d.LocationSource;
import com.autonavi.amap.mapcore2d.Inner_3dMap_location;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationListener;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.c */
/* loaded from: classes19.dex */
public class C1551c implements LocationSource, Inner_3dMap_locationListener {

    /* renamed from: a */
    public boolean f23091a;

    /* renamed from: b */
    public long f23092b = 2000;

    /* renamed from: c */
    public Bundle f23093c;

    /* renamed from: d */
    public LocationSource.OnLocationChangedListener f23094d;

    /* renamed from: e */
    public C1570cn f23095e;

    /* renamed from: f */
    public Inner_3dMap_locationOption f23096f;

    /* renamed from: g */
    public Context f23097g;

    static {
        Covode.recordClassIndex(5099);
    }

    @Override // com.amap.api.maps2d.LocationSource
    public void deactivate() {
        this.f23094d = null;
        C1570cn c1570cn = this.f23095e;
        if (c1570cn != null) {
            c1570cn.m18137b();
            this.f23095e.m18135c();
        }
        this.f23095e = null;
    }

    public C1551c(Context context) {
        this.f23097g = context;
    }

    /* renamed from: a */
    public void m18216a(int i) {
        if (i != 1 && i != 0) {
            m18214a(false);
        } else {
            m18214a(true);
        }
    }

    /* renamed from: a */
    public void m18215a(long j) {
        Inner_3dMap_locationOption inner_3dMap_locationOption = this.f23096f;
        if (inner_3dMap_locationOption != null && this.f23095e != null && inner_3dMap_locationOption.getInterval() != j) {
            this.f23096f.setInterval(j);
            this.f23095e.m18138a(this.f23096f);
        }
        this.f23092b = j;
    }

    /* renamed from: a */
    private void m18214a(boolean z) {
        C1570cn c1570cn;
        if (this.f23096f != null && (c1570cn = this.f23095e) != null) {
            c1570cn.m18135c();
            this.f23095e = new C1570cn(this.f23097g);
            this.f23095e.m18139a(this);
            this.f23096f.setOnceLocation(z);
            if (!z) {
                this.f23096f.setInterval(this.f23092b);
            }
            this.f23095e.m18138a(this.f23096f);
            this.f23095e.m18141a();
        }
        this.f23091a = z;
    }

    @Override // com.amap.api.maps2d.LocationSource
    public void activate(LocationSource.OnLocationChangedListener onLocationChangedListener) {
        this.f23094d = onLocationChangedListener;
        if (this.f23095e == null) {
            this.f23095e = new C1570cn(this.f23097g);
            this.f23096f = new Inner_3dMap_locationOption();
            this.f23095e.m18139a(this);
            this.f23096f.setInterval(this.f23092b);
            this.f23096f.setOnceLocation(this.f23091a);
            this.f23096f.setLocationMode(Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationMode.Hight_Accuracy);
            this.f23095e.m18138a(this.f23096f);
            this.f23095e.m18141a();
        }
    }

    @Override // com.autonavi.amap.mapcore2d.Inner_3dMap_locationListener
    public void onLocationChanged(Inner_3dMap_location inner_3dMap_location) {
        try {
            if (this.f23094d != null && inner_3dMap_location != null) {
                this.f23093c = inner_3dMap_location.getExtras();
                if (this.f23093c == null) {
                    this.f23093c = new Bundle();
                }
                this.f23093c.putInt("errorCode", inner_3dMap_location.getErrorCode());
                this.f23093c.putString("errorInfo", inner_3dMap_location.getErrorInfo());
                this.f23093c.putInt("locationType", inner_3dMap_location.getLocationType());
                this.f23093c.putFloat("Accuracy", inner_3dMap_location.getAccuracy());
                this.f23093c.putString("AdCode", inner_3dMap_location.getAdCode());
                this.f23093c.putString("Address", inner_3dMap_location.getAddress());
                this.f23093c.putString("AoiName", inner_3dMap_location.getAoiName());
                this.f23093c.putString("City", inner_3dMap_location.getCity());
                this.f23093c.putString("CityCode", inner_3dMap_location.getCityCode());
                this.f23093c.putString("Country", inner_3dMap_location.getCountry());
                this.f23093c.putString("District", inner_3dMap_location.getDistrict());
                this.f23093c.putString("Street", inner_3dMap_location.getStreet());
                this.f23093c.putString("StreetNum", inner_3dMap_location.getStreetNum());
                this.f23093c.putString("PoiName", inner_3dMap_location.getPoiName());
                this.f23093c.putString("Province", inner_3dMap_location.getProvince());
                this.f23093c.putFloat("Speed", inner_3dMap_location.getSpeed());
                this.f23093c.putString("Floor", inner_3dMap_location.getFloor());
                this.f23093c.putFloat("Bearing", inner_3dMap_location.getBearing());
                this.f23093c.putString("BuildingId", inner_3dMap_location.getBuildingId());
                this.f23093c.putDouble("Altitude", inner_3dMap_location.getAltitude());
                inner_3dMap_location.setExtras(this.f23093c);
                this.f23094d.onLocationChanged(inner_3dMap_location);
            }
        } catch (Throwable unused) {
        }
    }
}
