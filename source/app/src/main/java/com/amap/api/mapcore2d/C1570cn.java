package com.amap.api.mapcore2d;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ServiceInfo;
import com.amap.api.location.AMapLocationClient;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationListener;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationManagerBase;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption;
import com.bytedance.covode.number.Covode;
import p003X.C116971W2r;

/* renamed from: com.amap.api.mapcore2d.cn */
/* loaded from: classes19.dex */
public class C1570cn {

    /* renamed from: a */
    public Context f23159a;

    /* renamed from: b */
    public Inner_3dMap_locationManagerBase f23160b;

    /* renamed from: c */
    public Object f23161c;

    /* renamed from: d */
    public boolean f23162d;

    /* renamed from: e */
    public C1726gb f23163e;

    /* renamed from: f */
    public C1599da f23164f;

    static {
        Covode.recordClassIndex(5118);
    }

    public C1570cn(Context context) {
        try {
            this.f23164f = C1740gk.m17432a();
        } catch (Throwable unused) {
        }
        this.f23163e = new C1726gb();
        m18140a(context);
    }

    /* renamed from: a */
    private void m18140a(Context context) {
        ServiceInfo serviceInfo;
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context参数不能为null");
            }
            this.f23159a = context.getApplicationContext();
            Class LIZ = C116971W2r.LIZ("com.amap.api.location.AMapLocationClient");
            try {
                serviceInfo = this.f23159a.getPackageManager().getServiceInfo(new ComponentName(this.f23159a, "com.amap.api.location.APSService"), 128);
            } catch (Throwable unused) {
            }
            if (LIZ != null && serviceInfo != null) {
                this.f23162d = true;
            }
            if (this.f23162d) {
                this.f23161c = new AMapLocationClient(this.f23159a);
            } else {
                this.f23160b = m18136b(this.f23159a);
            }
        } catch (Throwable th) {
            C1752gu.m17302a(th, "AMapLocationClient", "AMapLocationClient 1");
        }
    }

    /* renamed from: b */
    private Inner_3dMap_locationManagerBase m18136b(Context context) {
        Inner_3dMap_locationManagerBase c1729gd;
        try {
            c1729gd = (Inner_3dMap_locationManagerBase) C1645ef.m17719a(context, this.f23164f, C1602db.m17930c("YY29tLmFtYXAuYXBpLndyYXBwZXIuSW5uZXJfM2RNYXBfbG9jYXRpb25NYW5hZ2VyV3JhcHBlcg=="), C1729gd.class, new Class[]{Context.class}, new Object[]{context});
        } catch (Throwable unused) {
            c1729gd = new C1729gd(context);
        }
        return c1729gd == null ? new C1729gd(context) : c1729gd;
    }

    /* renamed from: a */
    public void m18141a() {
        try {
            if (this.f23162d) {
                ((AMapLocationClient) this.f23161c).startLocation();
            } else {
                this.f23160b.startLocation();
            }
        } catch (Throwable th) {
            C1752gu.m17302a(th, "AMapLocationClient", "startLocation");
        }
    }

    /* renamed from: a */
    public void m18139a(Inner_3dMap_locationListener inner_3dMap_locationListener) {
        try {
            if (inner_3dMap_locationListener == null) {
                throw new IllegalArgumentException("listener参数不能为null");
            }
            if (this.f23162d) {
                this.f23163e.m17484a(this.f23161c, inner_3dMap_locationListener);
            } else {
                this.f23160b.setLocationListener(inner_3dMap_locationListener);
            }
        } catch (Throwable th) {
            C1752gu.m17302a(th, "AMapLocationClient", "setLocationListener");
        }
    }

    /* renamed from: a */
    public void m18138a(Inner_3dMap_locationOption inner_3dMap_locationOption) {
        try {
            if (inner_3dMap_locationOption == null) {
                throw new IllegalArgumentException("LocationManagerOption参数不能为null");
            }
            if (this.f23162d) {
                C1726gb.m17483a(this.f23161c, inner_3dMap_locationOption);
            } else {
                this.f23160b.setLocationOption(inner_3dMap_locationOption);
            }
        } catch (Throwable th) {
            C1752gu.m17302a(th, "AMapLocationClient", "setLocationOption");
        }
    }

    /* renamed from: b */
    public void m18137b() {
        try {
            if (this.f23162d) {
                ((AMapLocationClient) this.f23161c).stopLocation();
            } else {
                this.f23160b.stopLocation();
            }
        } catch (Throwable th) {
            C1752gu.m17302a(th, "AMapLocationClient", "stopLocation");
        }
    }

    /* renamed from: c */
    public void m18135c() {
        try {
            if (this.f23162d) {
                ((AMapLocationClient) this.f23161c).onDestroy();
            } else {
                this.f23160b.destroy();
            }
            if (this.f23163e == null) {
                return;
            }
            this.f23163e = null;
        } catch (Throwable th) {
            C1752gu.m17302a(th, "AMapLocationClient", "onDestroy");
        }
    }
}
