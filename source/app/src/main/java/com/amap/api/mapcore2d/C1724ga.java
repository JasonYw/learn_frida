package com.amap.api.mapcore2d;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import com.autonavi.amap.mapcore2d.Inner_3dMap_location;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import p003X.C116971W2r;

/* renamed from: com.amap.api.mapcore2d.ga */
/* loaded from: classes19.dex */
public final class C1724ga {

    /* renamed from: a */
    public Context f23651a;

    /* renamed from: b */
    public LocationManager f23652b;

    /* renamed from: c */
    public volatile long f23653c;

    /* renamed from: d */
    public volatile boolean f23654d;

    /* renamed from: e */
    public boolean f23655e;

    /* renamed from: f */
    public volatile Inner_3dMap_location f23656f;

    /* renamed from: g */
    public Object f23657g;

    /* renamed from: h */
    public boolean f23658h;

    /* renamed from: i */
    public boolean f23659i;

    /* renamed from: j */
    public LocationListener f23660j = new LocationListener() { // from class: com.amap.api.mapcore2d.ga.1
        static {
            Covode.recordClassIndex(5273);
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            if (location == null) {
                return;
            }
            try {
                Inner_3dMap_location inner_3dMap_location = new Inner_3dMap_location(location);
                inner_3dMap_location.setProvider("gps");
                inner_3dMap_location.setLocationType(1);
                Bundle extras = location.getExtras();
                int i = 0;
                if (extras != null) {
                    i = extras.getInt("satellites");
                }
                inner_3dMap_location.setSatellites(i);
                inner_3dMap_location.setTime(C1753gv.m17298a(inner_3dMap_location.getTime(), System.currentTimeMillis()));
                C1724ga.this.f23656f = inner_3dMap_location;
                C1724ga.this.f23653c = C1757gy.m17265b();
                C1724ga.this.f23654d = true;
            } catch (Throwable th) {
                C1752gu.m17302a(th, "MAPGPSLocation", "onLocationChanged");
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            try {
                if (!"gps".equals(str)) {
                    return;
                }
                C1724ga.this.f23654d = false;
            } catch (Throwable th) {
                C1752gu.m17302a(th, "MAPGPSLocation", "onProviderDisabled");
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i, Bundle bundle) {
        }
    };

    static {
        Covode.recordClassIndex(5272);
    }

    public C1724ga(Context context) {
        if (context == null) {
            return;
        }
        this.f23651a = context;
        m17489e();
        try {
            if (this.f23657g == null && !this.f23659i) {
                this.f23657g = this.f23658h ? C116971W2r.LIZ("com.amap.api.maps.CoordinateConverter").getConstructor(Context.class).newInstance(context) : C116971W2r.LIZ("com.amap.api.maps2d.CoordinateConverter").getConstructor(new Class[0]).newInstance(new Object[0]);
            }
        } catch (Throwable unused) {
        }
        if (this.f23652b != null) {
            return;
        }
        this.f23652b = (LocationManager) this.f23651a.getSystemService("location");
    }

    /* renamed from: com_amap_api_mapcore2d_ga_android_location_LocationManager_requestLocationUpdates */
    public static void m17491xd407685f(LocationManager locationManager, String str, long j, float f, LocationListener locationListener, Looper looper) {
        ActionInvokeEntrance.setEventUuid(100001);
        if (((Boolean) ActionInvokeEntrance.actionIntercept(locationManager, new Object[]{str, Long.valueOf(j), Float.valueOf(f), locationListener, looper}, 100001, "void", false, null, false).first).booleanValue()) {
            return;
        }
        ActionInvokeEntrance.actionInvoke(null, locationManager, new Object[]{str, Long.valueOf(j), Float.valueOf(f), locationListener, looper}, 100001, "com_amap_api_mapcore2d_ga_android_location_LocationManager_requestLocationUpdates(Landroid/location/LocationManager;Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V");
        C116971W2r.LIZ(locationManager, str, j, f, locationListener, looper);
    }

    /* renamed from: e */
    private void m17489e() {
        try {
            if (C116971W2r.LIZ("com.amap.api.maps.CoordinateConverter") == null) {
                return;
            }
            this.f23658h = true;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f */
    private void m17488f() {
        try {
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                myLooper = this.f23651a.getMainLooper();
            }
            try {
                this.f23652b.sendExtraCommand("gps", "force_xtra_injection", new Bundle());
            } catch (Throwable unused) {
            }
            m17491xd407685f(this.f23652b, "gps", 800L, 0.0f, this.f23660j, myLooper);
        } catch (SecurityException unused2) {
        } catch (Throwable th) {
            C1752gu.m17302a(th, "MAPGPSLocation", "requestLocationUpdates");
        }
    }

    /* renamed from: g */
    private void m17487g() {
        this.f23654d = false;
        this.f23653c = 0L;
        this.f23656f = null;
    }

    /* renamed from: a */
    public final void m17494a() {
        if (!this.f23655e) {
            m17488f();
            this.f23655e = true;
        }
    }

    /* renamed from: b */
    public final void m17493b() {
        LocationListener locationListener;
        this.f23655e = false;
        m17487g();
        LocationManager locationManager = this.f23652b;
        if (locationManager == null || (locationListener = this.f23660j) == null) {
            return;
        }
        locationManager.removeUpdates(locationListener);
    }

    /* renamed from: c */
    public final boolean m17492c() {
        if (this.f23654d) {
            if (C1757gy.m17265b() - this.f23653c <= 10000) {
                return true;
            }
            this.f23656f = null;
            return false;
        }
        return false;
    }

    /* renamed from: d */
    public final Inner_3dMap_location m17490d() {
        double[] m17497a;
        Object m17291a;
        Object newInstance;
        if (this.f23656f == null) {
            return null;
        }
        Inner_3dMap_location m25305clone = this.f23656f.m25305clone();
        if (m25305clone != null && m25305clone.getErrorCode() == 0) {
            try {
                if (this.f23657g != null) {
                    if (C1752gu.m17303a(m25305clone.getLatitude(), m25305clone.getLongitude())) {
                        Object[] objArr = {"GPS"};
                        Class[] clsArr = {String.class};
                        if (this.f23658h) {
                            m17291a = C1754gw.m17291a("com.amap.api.maps.CoordinateConverter$CoordType", "valueOf", objArr, clsArr);
                            newInstance = C116971W2r.LIZ("com.amap.api.maps.model.LatLng").getConstructor(Double.TYPE, Double.TYPE).newInstance(Double.valueOf(m25305clone.getLatitude()), Double.valueOf(m25305clone.getLongitude()));
                        } else {
                            m17291a = C1754gw.m17291a("com.amap.api.maps2d.CoordinateConverter$CoordType", "valueOf", objArr, clsArr);
                            newInstance = C116971W2r.LIZ("com.amap.api.maps2d.model.LatLng").getConstructor(Double.TYPE, Double.TYPE).newInstance(Double.valueOf(m25305clone.getLatitude()), Double.valueOf(m25305clone.getLongitude()));
                        }
                        C1754gw.m17293a(this.f23657g, "coord", newInstance);
                        C1754gw.m17293a(this.f23657g, "from", m17291a);
                        Object m17293a = C1754gw.m17293a(this.f23657g, "convert", new Object[0]);
                        double doubleValue = ((Double) m17293a.getClass().getDeclaredField("latitude").get(m17293a)).doubleValue();
                        double doubleValue2 = ((Double) m17293a.getClass().getDeclaredField("longitude").get(m17293a)).doubleValue();
                        m25305clone.setLatitude(doubleValue);
                        m25305clone.setLongitude(doubleValue2);
                        return m25305clone;
                    }
                } else if (this.f23659i && C1752gu.m17303a(m25305clone.getLatitude(), m25305clone.getLongitude()) && (m17497a = C1721fy.m17497a(m25305clone.getLongitude(), m25305clone.getLatitude())) != null) {
                    m25305clone.setLatitude(m17497a[1]);
                    m25305clone.setLongitude(m17497a[0]);
                }
            } catch (Throwable unused) {
            }
        }
        return m25305clone;
    }
}
