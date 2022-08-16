package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.autonavi.amap.mapcore2d.Inner_3dMap_location;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationListener;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationManagerBase;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.amap.api.mapcore2d.gd */
/* loaded from: classes19.dex */
public class C1729gd implements Inner_3dMap_locationManagerBase {

    /* renamed from: a */
    public Context f23670a;

    /* renamed from: b */
    public ArrayList<Inner_3dMap_locationListener> f23671b = new ArrayList<>();

    /* renamed from: c */
    public Object f23672c = new Object();

    /* renamed from: d */
    public Handler f23673d = null;

    /* renamed from: e */
    public HandlerThreadC1730a f23674e = null;

    /* renamed from: f */
    public Handler f23675f = null;

    /* renamed from: g */
    public Inner_3dMap_locationOption f23676g = new Inner_3dMap_locationOption();

    /* renamed from: h */
    public C1734gh f23677h = null;

    /* renamed from: i */
    public Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationMode f23678i = Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationMode.Hight_Accuracy;

    /* renamed from: j */
    public boolean f23679j = false;

    /* renamed from: com.amap.api.mapcore2d.gd$a */
    /* loaded from: classes19.dex */
    public static class HandlerThreadC1730a extends HandlerThread {

        /* renamed from: a */
        public C1729gd f23680a;

        static {
            Covode.recordClassIndex(5278);
        }

        public HandlerThreadC1730a(String str, C1729gd c1729gd) {
            super(str);
            this.f23680a = c1729gd;
        }

        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            try {
                this.f23680a.f23677h = new C1734gh(this.f23680a.f23670a, this.f23680a.f23673d);
                super.onLooperPrepared();
            } catch (Throwable unused) {
            }
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
        Covode.recordClassIndex(5277);
    }

    public C1729gd(Context context) {
        if (context != null) {
            this.f23670a = context.getApplicationContext();
            m17468e();
            return;
        }
        throw new IllegalArgumentException("Context参数不能为null");
    }

    /* renamed from: a */
    private Handler m17476a(Looper looper) {
        Handler handler;
        synchronized (this.f23672c) {
            this.f23675f = new HandlerC1731ge(looper, this);
            handler = this.f23675f;
        }
        return handler;
    }

    /* renamed from: a */
    private void m17478a(int i) {
        synchronized (this.f23672c) {
            if (this.f23675f != null) {
                this.f23675f.removeMessages(i);
            }
        }
    }

    /* renamed from: a */
    private void m17477a(int i, Object obj, long j) {
        synchronized (this.f23672c) {
            if (this.f23675f != null) {
                Message obtain = Message.obtain();
                obtain.what = i;
                obtain.obj = obj;
                this.f23675f.sendMessageDelayed(obtain, j);
            }
        }
    }

    /* renamed from: e */
    private void m17468e() {
        try {
            this.f23673d = Looper.myLooper() == null ? new HandlerC1732gf(this.f23670a.getMainLooper(), this) : new HandlerC1732gf(this);
        } catch (Throwable th) {
            C1752gu.m17302a(th, "MapLocationManager", "initResultHandler");
        }
        try {
            this.f23674e = new HandlerThreadC1730a("locaitonClientActionThread", this);
            this.f23674e.setPriority(5);
            this.f23674e.start();
            this.f23675f = m17476a(this.f23674e.getLooper());
        } catch (Throwable th2) {
            C1752gu.m17302a(th2, "MapLocationManager", "initActionThreadAndActionHandler");
        }
    }

    /* renamed from: f */
    private void m17467f() {
        synchronized (this.f23672c) {
            if (this.f23675f != null) {
                this.f23675f.removeCallbacksAndMessages(null);
            }
            this.f23675f = null;
        }
    }

    /* renamed from: a */
    public final void m17479a() {
        try {
            if (this.f23679j) {
                return;
            }
            this.f23679j = true;
            m17477a(1005, null, 0L);
        } catch (Throwable th) {
            C1752gu.m17302a(th, "MapLocationManager", "doStartLocation");
        }
    }

    /* renamed from: a */
    public final void m17475a(Inner_3dMap_location inner_3dMap_location) {
        if (inner_3dMap_location != null) {
            try {
                if (C1740gk.m17430a(inner_3dMap_location)) {
                    C1726gb.f23662a = inner_3dMap_location;
                }
            } catch (Throwable th) {
                C1752gu.m17302a(th, "MapLocationManager", "callBackLocation");
                return;
            }
        }
        if (this.f23679j) {
            if (!"gps".equalsIgnoreCase(inner_3dMap_location.getProvider())) {
                inner_3dMap_location.setProvider("lbs");
            }
            inner_3dMap_location.setAltitude(C1757gy.m17264b(inner_3dMap_location.getAltitude()));
            inner_3dMap_location.setBearing(C1757gy.m17277a(inner_3dMap_location.getBearing()));
            inner_3dMap_location.setSpeed(C1757gy.m17277a(inner_3dMap_location.getSpeed()));
            Iterator<Inner_3dMap_locationListener> it = this.f23671b.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onLocationChanged(inner_3dMap_location);
                } catch (Throwable unused) {
                }
            }
        }
        if (this.f23676g.isOnceLocation()) {
            m17470c();
        }
    }

    /* renamed from: a */
    public final void m17474a(Inner_3dMap_locationListener inner_3dMap_locationListener) {
        try {
            if (inner_3dMap_locationListener == null) {
                throw new IllegalArgumentException("listener参数不能为null");
            }
            if (this.f23671b == null) {
                this.f23671b = new ArrayList<>();
            }
            if (this.f23671b.contains(inner_3dMap_locationListener)) {
                return;
            }
            this.f23671b.add(inner_3dMap_locationListener);
        } catch (Throwable th) {
            C1752gu.m17302a(th, "MapLocationManager", "doSetLocationListener");
        }
    }

    /* renamed from: a */
    public final void m17473a(Inner_3dMap_locationOption inner_3dMap_locationOption) {
        this.f23676g = inner_3dMap_locationOption;
        if (this.f23676g == null) {
            this.f23676g = new Inner_3dMap_locationOption();
        }
        C1734gh c1734gh = this.f23677h;
        if (c1734gh != null) {
            c1734gh.m17454a(this.f23676g);
        }
        if (this.f23679j && !this.f23678i.equals(inner_3dMap_locationOption.getLocationMode())) {
            m17470c();
            m17479a();
        }
        this.f23678i = this.f23676g.getLocationMode();
    }

    /* renamed from: b */
    public final void m17472b() {
        long j = 1000;
        try {
            if (this.f23677h != null) {
                this.f23677h.m17456a();
            }
        } catch (Throwable th) {
            try {
                C1752gu.m17302a(th, "MapLocationManager", "doGetLocation");
                if (this.f23676g.isOnceLocation()) {
                    return;
                }
                if (this.f23676g.getInterval() >= 1000) {
                    j = this.f23676g.getInterval();
                }
                m17477a(1005, null, j);
            } finally {
                if (!this.f23676g.isOnceLocation()) {
                    if (this.f23676g.getInterval() >= 1000) {
                        j = this.f23676g.getInterval();
                    }
                    m17477a(1005, null, j);
                }
            }
        }
    }

    /* renamed from: b */
    public final void m17471b(Inner_3dMap_locationListener inner_3dMap_locationListener) {
        if (inner_3dMap_locationListener != null) {
            try {
                if (!this.f23671b.isEmpty() && this.f23671b.contains(inner_3dMap_locationListener)) {
                    this.f23671b.remove(inner_3dMap_locationListener);
                }
            } catch (Throwable th) {
                C1752gu.m17302a(th, "MapLocationManager", "doUnregisterListener");
                return;
            }
        }
        if (this.f23671b.isEmpty()) {
            m17470c();
        }
    }

    /* renamed from: c */
    public final void m17470c() {
        try {
            this.f23679j = false;
            m17478a(1004);
            m17478a(1005);
            if (this.f23677h == null) {
                return;
            }
            this.f23677h.m17452c();
        } catch (Throwable th) {
            C1752gu.m17302a(th, "MapLocationManager", "doStopLocation");
        }
    }

    /* renamed from: d */
    public final void m17469d() {
        m17470c();
        C1734gh c1734gh = this.f23677h;
        if (c1734gh != null) {
            c1734gh.m17451d();
        }
        ArrayList<Inner_3dMap_locationListener> arrayList = this.f23671b;
        if (arrayList != null) {
            arrayList.clear();
            this.f23671b = null;
        }
        m17467f();
        if (this.f23674e != null) {
            int i = Build.VERSION.SDK_INT;
            try {
                C1754gw.m17294a(this.f23674e, HandlerThread.class, "quitSafely", new Object[0]);
            } catch (Throwable unused) {
                this.f23674e.quit();
            }
        }
        this.f23674e = null;
        Handler handler = this.f23673d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f23673d = null;
        }
    }

    @Override // com.autonavi.amap.mapcore2d.Inner_3dMap_locationManagerBase
    public void destroy() {
        try {
            m17477a(1007, null, 0L);
        } catch (Throwable th) {
            C1752gu.m17302a(th, "MapLocationManager", "stopLocation");
        }
    }

    @Override // com.autonavi.amap.mapcore2d.Inner_3dMap_locationManagerBase
    public Inner_3dMap_location getLastKnownLocation() {
        return C1726gb.f23662a;
    }

    @Override // com.autonavi.amap.mapcore2d.Inner_3dMap_locationManagerBase
    public void setLocationListener(Inner_3dMap_locationListener inner_3dMap_locationListener) {
        try {
            m17477a(1002, inner_3dMap_locationListener, 0L);
        } catch (Throwable th) {
            C1752gu.m17302a(th, "MapLocationManager", "setLocationListener");
        }
    }

    @Override // com.autonavi.amap.mapcore2d.Inner_3dMap_locationManagerBase
    public void setLocationOption(Inner_3dMap_locationOption inner_3dMap_locationOption) {
        try {
            m17477a(1001, inner_3dMap_locationOption, 0L);
        } catch (Throwable th) {
            C1752gu.m17302a(th, "LocationClientManager", "setLocationOption");
        }
    }

    @Override // com.autonavi.amap.mapcore2d.Inner_3dMap_locationManagerBase
    public void startLocation() {
        try {
            m17477a(1004, null, 0L);
        } catch (Throwable th) {
            C1752gu.m17302a(th, "MapLocationManager", "startLocation");
        }
    }

    @Override // com.autonavi.amap.mapcore2d.Inner_3dMap_locationManagerBase
    public void stopLocation() {
        try {
            m17477a(1006, null, 0L);
        } catch (Throwable th) {
            C1752gu.m17302a(th, "MapLocationManager", "stopLocation");
        }
    }

    @Override // com.autonavi.amap.mapcore2d.Inner_3dMap_locationManagerBase
    public void unRegisterLocationListener(Inner_3dMap_locationListener inner_3dMap_locationListener) {
        try {
            m17477a(1003, inner_3dMap_locationListener, 0L);
        } catch (Throwable th) {
            C1752gu.m17302a(th, "MapLocationManager", "stopLocation");
        }
    }
}
