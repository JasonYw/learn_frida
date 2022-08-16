package com.amap.api.mapcore2d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.autonavi.amap.mapcore2d.Inner_3dMap_location;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import com.umeng.analytics.pro.C33764r;
import com.umeng.message.proguard.C34037f;
import p003X.C116971W2r;
import p003X.C140181dPd;
import p003X.C140192dPo;

/* renamed from: com.amap.api.mapcore2d.gi */
/* loaded from: classes19.dex */
public final class C1737gi {

    /* renamed from: a */
    public Context f23710a;

    /* renamed from: b */
    public boolean f23711b;

    /* renamed from: e */
    public C1746go f23714e;

    /* renamed from: f */
    public C1743gn f23715f;

    /* renamed from: g */
    public C1738a f23716g;

    /* renamed from: h */
    public C1748gq f23717h;

    /* renamed from: i */
    public ConnectivityManager f23718i;

    /* renamed from: j */
    public C1750gs f23719j;

    /* renamed from: l */
    public Inner_3dMap_locationOption f23721l;

    /* renamed from: k */
    public StringBuilder f23720k = new StringBuilder();

    /* renamed from: c */
    public String f23712c = null;

    /* renamed from: m */
    public C1733gg f23722m = null;

    /* renamed from: d */
    public long f23713d = 0;

    /* renamed from: n */
    public final String f23723n = "\"status\":\"0\"";

    /* renamed from: o */
    public final String f23724o = "</body></html>";

    static {
        Covode.recordClassIndex(5285);
    }

    public C1737gi(Context context) {
        this.f23721l = null;
        try {
            this.f23710a = context.getApplicationContext();
            C1757gy.m17261b(this.f23710a);
            m17442a(this.f23710a);
            this.f23721l = new Inner_3dMap_locationOption();
            if (this.f23714e == null) {
                this.f23714e = new C1746go(this.f23710a, (WifiManager) C1757gy.m17272a(this.f23710a, "wifi"));
                this.f23714e.m17360a(this.f23711b);
            }
            if (this.f23715f == null) {
                this.f23715f = new C1743gn(this.f23710a);
            }
            if (this.f23717h == null) {
                this.f23717h = C1748gq.m17333a(this.f23710a);
            }
            if (this.f23718i == null) {
                this.f23718i = (ConnectivityManager) C1757gy.m17272a(this.f23710a, "connectivity");
            }
            this.f23719j = new C1750gs();
            m17437c();
        } catch (Throwable th) {
            C1752gu.m17302a(th, "MapNetLocation", "<init>");
        }
    }

    /* renamed from: a */
    public static C1733gg m17441a(C1733gg c1733gg, String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return C1728gc.m17482a().m17481a(c1733gg);
        }
        if (strArr[0].equals("shake")) {
            return C1728gc.m17482a().m17481a(c1733gg);
        }
        if (strArr[0].equals("fusion")) {
            C1728gc.m17482a();
            C1728gc.m17480b(c1733gg);
        }
        return c1733gg;
    }

    /* renamed from: a */
    private void m17442a(Context context) {
        try {
            if (context.checkCallingOrSelfPermission(C1602db.m17930c("EYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX1NFQ1VSRV9TRVRUSU5HUw==")) != 0) {
                return;
            }
            this.f23711b = true;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private boolean m17443a(long j) {
        if (C1757gy.m17265b() - j < 800) {
            return !C1740gk.m17431a(this.f23722m) || C1757gy.m17279a() - this.f23722m.getTime() <= 10000;
        }
        return false;
    }

    /* renamed from: c */
    private void m17437c() {
        try {
            if (this.f23716g == null) {
                this.f23716g = new C1738a(this, (byte) 0);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            C116971W2r.LIZ(this.f23710a, this.f23716g, intentFilter);
            this.f23714e.m17358b(false);
            this.f23715f.m17381f();
        } catch (Throwable th) {
            C1752gu.m17302a(th, "MapNetLocation", "initBroadcastListener");
        }
    }

    /* renamed from: d */
    private C1733gg m17436d() {
        String str;
        StringBuilder sb;
        String str2;
        C1733gg c1733gg = new C1733gg("");
        C1746go c1746go = this.f23714e;
        if (c1746go != null && c1746go.m17349g()) {
            c1733gg.setErrorCode(15);
            return c1733gg;
        }
        try {
            if (this.f23719j == null) {
                this.f23719j = new C1750gs();
            }
            this.f23719j.m17313a(this.f23710a, this.f23721l.isNeedAddress(), this.f23721l.isOffset(), this.f23715f, this.f23714e, this.f23718i, this.f23712c);
            C1739gj c1739gj = new C1739gj();
            byte[] bArr = null;
            try {
                try {
                    C1685ey m17331a = this.f23717h.m17331a(this.f23717h.m17332a(this.f23710a, this.f23719j.m17314a(), C1752gu.m17304a()));
                    if (m17331a != null) {
                        bArr = m17331a.f23569a;
                        str = m17331a.f23571c;
                    } else {
                        str = "";
                    }
                    if (bArr == null || bArr.length == 0) {
                        c1733gg.setErrorCode(4);
                        this.f23720k.append("please check the network");
                        if (!TextUtils.isEmpty(str)) {
                            this.f23720k.append(" #csid:".concat(String.valueOf(str)));
                        }
                        c1733gg.setLocationDetail(this.f23720k.toString());
                        return c1733gg;
                    }
                    String str3 = new String(bArr, C34037f.f43302f);
                    if (str3.contains("\"status\":\"0\"")) {
                        return c1739gj.m17434a(str3, this.f23710a, m17331a);
                    }
                    if (str3.contains("</body></html>")) {
                        c1733gg.setErrorCode(5);
                        C1746go c1746go2 = this.f23714e;
                        if (c1746go2 == null || !c1746go2.m17362a(this.f23718i)) {
                            sb = this.f23720k;
                            str2 = "request may be intercepted";
                        } else {
                            sb = this.f23720k;
                            str2 = "make sure you are logged in to the network";
                        }
                        sb.append(str2);
                        if (!TextUtils.isEmpty(str)) {
                            this.f23720k.append(" #csid:".concat(String.valueOf(str)));
                        }
                        c1733gg.setLocationDetail(this.f23720k.toString());
                        return c1733gg;
                    }
                    byte[] m17335a = C1747gp.m17335a(bArr);
                    if (m17335a == null) {
                        c1733gg.setErrorCode(5);
                        this.f23720k.append("decrypt response data error");
                        if (!TextUtils.isEmpty(str)) {
                            this.f23720k.append(" #csid:".concat(String.valueOf(str)));
                        }
                        c1733gg.setLocationDetail(this.f23720k.toString());
                        return c1733gg;
                    }
                    C1733gg m17433a = c1739gj.m17433a(m17335a);
                    if (m17433a == null) {
                        C1733gg c1733gg2 = new C1733gg("");
                        c1733gg2.setErrorCode(5);
                        this.f23720k.append("location is null");
                        if (!TextUtils.isEmpty(str)) {
                            this.f23720k.append(" #csid:".concat(String.valueOf(str)));
                        }
                        c1733gg2.setLocationDetail(this.f23720k.toString());
                        return c1733gg2;
                    }
                    this.f23712c = m17433a.m17466a();
                    if (m17433a.getErrorCode() != 0) {
                        if (!TextUtils.isEmpty(str)) {
                            m17433a.setLocationDetail(m17433a.getLocationDetail() + " #csid:" + str);
                        }
                        return m17433a;
                    } else if (!C1740gk.m17431a(m17433a)) {
                        String m17464b = m17433a.m17464b();
                        m17433a.setErrorCode(6);
                        StringBuilder sb2 = this.f23720k;
                        StringBuilder sb3 = new StringBuilder("location faile retype:");
                        sb3.append(m17433a.m17460d());
                        sb3.append(" rdesc:");
                        if (m17464b == null) {
                            m17464b = "null";
                        }
                        sb3.append(m17464b);
                        sb2.append(sb3.toString());
                        if (!TextUtils.isEmpty(str)) {
                            this.f23720k.append(" #csid:".concat(String.valueOf(str)));
                        }
                        m17433a.setLocationDetail(this.f23720k.toString());
                        return m17433a;
                    } else {
                        m17433a.m17458e();
                        if (m17433a.getErrorCode() == 0 && m17433a.getLocationType() == 0) {
                            if ("-5".equals(m17433a.m17460d()) || "1".equals(m17433a.m17460d()) || "2".equals(m17433a.m17460d()) || "14".equals(m17433a.m17460d()) || "24".equals(m17433a.m17460d()) || C33764r.f42396f.equals(m17433a.m17460d())) {
                                m17433a.setLocationType(5);
                            } else {
                                m17433a.setLocationType(6);
                            }
                            this.f23720k.append(m17433a.m17460d());
                            if (!TextUtils.isEmpty(str)) {
                                this.f23720k.append(" #csid:".concat(String.valueOf(str)));
                            }
                            m17433a.setLocationDetail(this.f23720k.toString());
                        }
                        return m17433a;
                    }
                } catch (Throwable th) {
                    C1752gu.m17302a(th, "MapNetLocation", "getApsLoc req");
                    c1733gg.setErrorCode(4);
                    this.f23720k.append("please check the network");
                    c1733gg.setLocationDetail(this.f23720k.toString());
                    return c1733gg;
                }
            } catch (Throwable th2) {
                C1752gu.m17302a(th2, "MapNetLocation", "getApsLoc buildV4Dot2");
                c1733gg.setErrorCode(3);
                StringBuilder sb4 = this.f23720k;
                sb4.append("buildV4Dot2 error " + th2.getMessage());
                c1733gg.setLocationDetail(this.f23720k.toString());
                return c1733gg;
            }
        } catch (Throwable th3) {
            C1752gu.m17302a(th3, "MapNetLocation", "getApsLoc");
            StringBuilder sb5 = this.f23720k;
            sb5.append("get parames error:" + th3.getMessage());
            c1733gg.setErrorCode(3);
            c1733gg.setLocationDetail(this.f23720k.toString());
            return c1733gg;
        }
    }

    /* renamed from: a */
    public final Inner_3dMap_location m17444a() {
        if (this.f23720k.length() > 0) {
            StringBuilder sb = this.f23720k;
            sb.delete(0, sb.length());
        }
        if (!m17443a(this.f23713d) || !C1740gk.m17431a(this.f23722m)) {
            this.f23713d = C1757gy.m17265b();
            if (this.f23710a == null) {
                this.f23720k.append("context is null");
                Inner_3dMap_location inner_3dMap_location = new Inner_3dMap_location("");
                inner_3dMap_location.setErrorCode(1);
                inner_3dMap_location.setLocationDetail(this.f23720k.toString());
                return inner_3dMap_location;
            }
            try {
                this.f23715f.m17381f();
            } catch (Throwable th) {
                C1752gu.m17302a(th, "MapNetLocation", "getLocation getCgiListParam");
            }
            try {
                this.f23714e.m17358b(true);
            } catch (Throwable th2) {
                C1752gu.m17302a(th2, "MapNetLocation", "getLocation getScanResultsParam");
            }
            try {
                this.f23722m = m17436d();
                this.f23722m = m17441a(this.f23722m, new String[0]);
            } catch (Throwable th3) {
                C1752gu.m17302a(th3, "MapNetLocation", "getLocation getScanResultsParam");
            }
            return this.f23722m;
        }
        return this.f23722m;
    }

    /* renamed from: a */
    public final void m17439a(Inner_3dMap_locationOption inner_3dMap_locationOption) {
        this.f23721l = inner_3dMap_locationOption;
        if (this.f23721l == null) {
            this.f23721l = new Inner_3dMap_locationOption();
        }
        try {
            C1746go c1746go = this.f23714e;
            this.f23721l.isWifiActiveScan();
            c1746go.m17356c(this.f23721l.isWifiScan());
        } catch (Throwable unused) {
        }
        try {
            this.f23717h.m17334a(this.f23721l.getHttpTimeOut(), this.f23721l.getLocationProtocol().equals(Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationProtocol.HTTPS));
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: b */
    public final void m17438b() {
        this.f23711b = false;
        this.f23712c = null;
        try {
            if (this.f23710a != null && this.f23716g != null) {
                C116971W2r.LIZ(this.f23710a, this.f23716g);
            }
            if (this.f23715f != null) {
                this.f23715f.m17380g();
            }
            if (this.f23714e != null) {
                this.f23714e.m17348h();
            }
            this.f23716g = null;
        } catch (Throwable unused) {
            this.f23716g = null;
        }
    }

    /* renamed from: com.amap.api.mapcore2d.gi$a */
    /* loaded from: classes19.dex */
    public class C1738a extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(5286);
        }

        public C1738a() {
        }

        public /* synthetic */ C1738a(C1737gi c1737gi, byte b) {
            this();
        }

        public final void com_amap_api_mapcore2d_gi$a__onReceive$___twin___(Context context, Intent intent) {
            if (context == null || intent == null) {
                return;
            }
            try {
                String action = intent.getAction();
                if (TextUtils.isEmpty(action)) {
                    return;
                }
                if (action.equals("android.net.wifi.SCAN_RESULTS")) {
                    if (C1737gi.this.f23714e == null) {
                        return;
                    }
                    C1737gi.this.f23714e.m17357c();
                } else if (!action.equals("android.net.wifi.WIFI_STATE_CHANGED") || C1737gi.this.f23714e == null) {
                } else {
                    C1737gi.this.f23714e.m17353d();
                }
            } catch (Throwable th) {
                C1752gu.m17302a(th, "MapNetLocation", "onReceive");
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            m17435xb598b0f9(this, context, intent);
        }

        /* renamed from: com_amap_api_mapcore2d_gi$a_com_ss_android_ugc_aweme_lancet_JatoBoostLancet_onBroadcastReceiverReceive */
        public static void m17435xb598b0f9(C1738a c1738a, Context context, Intent intent) {
            if (!AppMonitor.INSTANCE.isAppBackground() && intent != null && !C140192dPo.LIZIZ.contains(intent.getAction()) && C140192dPo.LIZ("onBroadcastReceiverReceive")) {
                C140181dPd.m21607LJ();
            }
            c1738a.com_amap_api_mapcore2d_gi$a__onReceive$___twin___(context, intent);
        }
    }
}
