package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.autonavi.amap.mapcore2d.Inner_3dMap_location;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption;
import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.amap.api.mapcore2d.gh */
/* loaded from: classes19.dex */
public final class C1734gh {

    /* renamed from: m */
    public static int f23694m = 200;

    /* renamed from: n */
    public static boolean f23695n = true;

    /* renamed from: a */
    public Context f23696a;

    /* renamed from: b */
    public C1724ga f23697b;

    /* renamed from: c */
    public C1737gi f23698c;

    /* renamed from: d */
    public HandlerThreadC1736b f23699d;

    /* renamed from: e */
    public Handler f23700e;

    /* renamed from: f */
    public Handler f23701f;

    /* renamed from: g */
    public boolean f23702g;

    /* renamed from: h */
    public boolean f23703h;

    /* renamed from: i */
    public Inner_3dMap_locationOption f23704i;

    /* renamed from: j */
    public final int f23705j = 500;

    /* renamed from: k */
    public final int f23706k = 30;

    /* renamed from: l */
    public Object f23707l = new Object();

    /* renamed from: o */
    public JSONArray f23708o;

    /* renamed from: com.amap.api.mapcore2d.gh$a */
    /* loaded from: classes19.dex */
    public class HandlerC1735a extends Handler {
        static {
            Covode.recordClassIndex(5283);
        }

        public HandlerC1735a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what == 1) {
                C1734gh.this.m17453b();
            }
        }
    }

    /* renamed from: com.amap.api.mapcore2d.gh$b */
    /* loaded from: classes19.dex */
    public static class HandlerThreadC1736b extends HandlerThread {
        static {
            Covode.recordClassIndex(5284);
        }

        public HandlerThreadC1736b(String str) {
            super(str);
        }

        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            super.onLooperPrepared();
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                super.run();
            } catch (Throwable unused) {
            }
        }
    }

    static {
        Covode.recordClassIndex(5282);
    }

    public C1734gh(Context context, Handler handler) {
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context参数不能为null");
            }
            this.f23696a = context.getApplicationContext();
            this.f23701f = handler;
            this.f23704i = new Inner_3dMap_locationOption();
            m17449f();
            m17450e();
        } catch (Throwable th) {
            C1752gu.m17302a(th, "LocationService", "<init>");
        }
    }

    /* renamed from: a */
    private void m17455a(Inner_3dMap_location inner_3dMap_location) {
        try {
            if (!f23695n || inner_3dMap_location == null || inner_3dMap_location.getErrorCode() != 0 || inner_3dMap_location.getLocationType() != 1) {
                return;
            }
            if (this.f23708o == null) {
                this.f23708o = new JSONArray();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("lon", inner_3dMap_location.getLongitude());
            jSONObject.put("lat", inner_3dMap_location.getLatitude());
            jSONObject.put("type", 0);
            jSONObject.put("timestamp", C1757gy.m17279a());
            this.f23708o = this.f23708o.put(jSONObject);
            if (this.f23708o.length() < f23694m) {
                return;
            }
            m17447h();
        } catch (Throwable th) {
            C1752gu.m17302a(th, "LocationService", "recordOfflineLocLog");
        }
    }

    /* renamed from: e */
    private void m17450e() {
        this.f23699d = new HandlerThreadC1736b("locServiceAction");
        this.f23699d.setPriority(5);
        this.f23699d.start();
        this.f23700e = new HandlerC1735a(this.f23699d.getLooper());
    }

    /* renamed from: f */
    private void m17449f() {
        try {
            if (this.f23704i == null) {
                this.f23704i = new Inner_3dMap_locationOption();
            }
            if (this.f23703h) {
                return;
            }
            this.f23697b = new C1724ga(this.f23696a);
            this.f23698c = new C1737gi(this.f23696a);
            this.f23698c.m17439a(this.f23704i);
            m17448g();
            this.f23703h = true;
        } catch (Throwable th) {
            C1752gu.m17302a(th, "LocationService", "init");
        }
    }

    /* renamed from: g */
    private void m17448g() {
        try {
            f23695n = C1755gx.m17283b(this.f23696a, "maploc", "ue");
            int m17286a = C1755gx.m17286a(this.f23696a, "maploc", "opn");
            f23694m = m17286a;
            if (m17286a > 500) {
                f23694m = 500;
            }
            if (f23694m >= 30) {
                return;
            }
            f23694m = 30;
        } catch (Throwable th) {
            C1752gu.m17302a(th, "LocationService", "getSPConfig");
        }
    }

    /* renamed from: h */
    private synchronized void m17447h() {
        try {
            if (this.f23708o != null && this.f23708o.length() > 0) {
                C1695fe.m17536a(new C1694fd(this.f23696a, C1752gu.m17301b(), this.f23708o.toString()), this.f23696a);
                this.f23708o = null;
            }
        } catch (Throwable th) {
            C1752gu.m17302a(th, "LocationService", "writeOfflineLog");
        }
    }

    /* renamed from: i */
    private void m17446i() {
        synchronized (this.f23707l) {
            if (this.f23700e != null) {
                this.f23700e.removeCallbacksAndMessages(null);
            }
            this.f23700e = null;
        }
    }

    /* renamed from: j */
    private void m17445j() {
        synchronized (this.f23707l) {
            if (this.f23700e != null) {
                this.f23700e.removeMessages(1);
            }
        }
    }

    /* renamed from: a */
    public final void m17456a() {
        try {
            m17449f();
            if (!this.f23704i.getLocationMode().equals(Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationMode.Battery_Saving) && !this.f23702g) {
                this.f23702g = true;
                this.f23697b.m17494a();
            }
            if (this.f23700e == null) {
                return;
            }
            this.f23700e.sendEmptyMessage(1);
        } catch (Throwable th) {
            C1752gu.m17302a(th, "LocationService", "getLocation");
        }
    }

    /* renamed from: a */
    public final void m17454a(Inner_3dMap_locationOption inner_3dMap_locationOption) {
        this.f23704i = inner_3dMap_locationOption;
        if (this.f23704i == null) {
            this.f23704i = new Inner_3dMap_locationOption();
        }
        C1737gi c1737gi = this.f23698c;
        if (c1737gi != null) {
            c1737gi.m17439a(inner_3dMap_locationOption);
        }
    }

    /* renamed from: b */
    public final void m17453b() {
        Inner_3dMap_location inner_3dMap_location = null;
        try {
            if (this.f23704i.getLocationMode().equals(Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationMode.Battery_Saving) && this.f23702g) {
                this.f23697b.m17493b();
                this.f23702g = false;
            }
            if (this.f23697b.m17492c()) {
                inner_3dMap_location = this.f23697b.m17490d();
            } else if (!this.f23704i.getLocationMode().equals(Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationMode.Device_Sensors)) {
                inner_3dMap_location = this.f23698c.m17444a();
            }
            if (this.f23701f != null && inner_3dMap_location != null) {
                Message obtain = Message.obtain();
                obtain.obj = inner_3dMap_location;
                obtain.what = 1;
                this.f23701f.sendMessage(obtain);
            }
            m17455a(inner_3dMap_location);
        } catch (Throwable th) {
            C1752gu.m17302a(th, "LocationService", "doGetLocation");
        }
    }

    /* renamed from: c */
    public final void m17452c() {
        this.f23702g = false;
        try {
            m17445j();
            if (this.f23697b == null) {
                return;
            }
            this.f23697b.m17493b();
        } catch (Throwable th) {
            C1752gu.m17302a(th, "LocationService", "stopLocation");
        }
    }

    /* renamed from: d */
    public final void m17451d() {
        try {
            m17452c();
            m17446i();
            if (this.f23699d != null) {
                int i = Build.VERSION.SDK_INT;
                C1754gw.m17294a(this.f23699d, HandlerThread.class, "quitSafely", new Object[0]);
            }
            this.f23699d = null;
            this.f23698c.m17438b();
            this.f23702g = false;
            this.f23703h = false;
            m17447h();
        } catch (Throwable th) {
            C1752gu.m17302a(th, "LocationService", "destroy");
        }
    }
}
