package com.alipay.sdk.p082m.p121u;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.alipay.android.app.IAlixPay;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.sdk.app.APayEntranceActivity;
import com.alipay.sdk.app.AlipayResultActivity;
import com.alipay.sdk.p082m.p101j.C1294a;
import com.alipay.sdk.p082m.p101j.C1295b;
import com.alipay.sdk.p082m.p101j.EnumC1296c;
import com.alipay.sdk.p082m.p103k.C1301a;
import com.alipay.sdk.p082m.p107m.C1328a;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.alipay.sdk.p082m.p121u.C1399n;
import com.bytedance.covode.number.Covode;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.umeng.message.proguard.C34037f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.u.h */
/* loaded from: classes2.dex */
public class C1388h {

    /* renamed from: a */
    public Activity f22411a;

    /* renamed from: b */
    public volatile IAlixPay f22412b;

    /* renamed from: d */
    public boolean f22414d;

    /* renamed from: e */
    public AbstractC1393e f22415e;

    /* renamed from: f */
    public final C1376a f22416f;

    /* renamed from: c */
    public final Object f22413c = IAlixPay.class;

    /* renamed from: g */
    public boolean f22417g = false;

    /* renamed from: h */
    public String f22418h = null;

    /* renamed from: i */
    public String f22419i = null;

    /* renamed from: com.alipay.sdk.m.u.h$e */
    /* loaded from: classes2.dex */
    public interface AbstractC1393e {
        static {
            Covode.recordClassIndex(4893);
        }

        /* renamed from: a */
        void mo18838a();

        /* renamed from: b */
        void mo18837b();
    }

    static {
        Covode.recordClassIndex(4888);
    }

    /* renamed from: a */
    public String m18847a(String str, boolean z) {
        C1399n.C1402c c1402c;
        String str2 = "";
        PackageInfo packageInfo = null;
        try {
            List<C1328a.C1330b> m19121l = C1328a.m19107z().m19121l();
            if (!C1328a.m19107z().f22239g || m19121l == null) {
                m19121l = C1294a.f22165d;
            }
            c1402c = C1399n.m18806a(this.f22416f, this.f22411a, m19121l);
        } catch (Throwable th) {
            th = th;
            c1402c = null;
        }
        if (c1402c != null) {
            try {
            } catch (Throwable th2) {
                th = th2;
                C1301a.m19215a(this.f22416f, "biz", "CheckClientSignEx", th);
                boolean m18787b = C1399n.m18787b(this.f22416f);
                if (!z) {
                }
                return m18850a(str, str2, packageInfo);
            }
            if (c1402c.m18758a(this.f22416f) || c1402c.m18759a() || C1399n.m18812a(c1402c.f22435a)) {
                return "failed";
            }
            if (c1402c.f22435a != null && !"com.eg.android.AlipayGphone".equals(c1402c.f22435a.packageName)) {
                str2 = c1402c.f22435a.packageName;
            } else {
                str2 = C1399n.m18790b();
            }
            if (c1402c.f22435a != null) {
                packageInfo = c1402c.f22435a;
            }
            String m19130c = C1328a.m19107z().m19130c();
            if (m19130c != null) {
                if (m19130c.length() > 0) {
                    try {
                        JSONObject optJSONObject = new JSONObject(m19130c).optJSONObject(str2);
                        if (optJSONObject != null && optJSONObject.length() > 0) {
                            Iterator<String> keys = optJSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                int parseInt = Integer.parseInt(next);
                                if (packageInfo != null && packageInfo.versionCode >= parseInt) {
                                    try {
                                        boolean m19140a = C1328a.m19107z().m19140a(this.f22411a, Integer.parseInt(optJSONObject.getString(next)));
                                        this.f22417g = m19140a;
                                        if (m19140a) {
                                            break;
                                        }
                                    } catch (Exception unused) {
                                        continue;
                                    }
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            boolean m18787b2 = C1399n.m18787b(this.f22416f);
            if ((!z || this.f22417g) && !m18787b2 && m18844b(str2, this.f22411a, this.f22416f)) {
                return m18850a(str, str2, packageInfo);
            }
            return m18849a(str, str2, packageInfo, c1402c);
        }
        return "failed";
    }

    /* renamed from: a */
    public void m18857a() {
        this.f22411a = null;
        this.f22415e = null;
    }

    /* renamed from: com.alipay.sdk.m.u.h$c */
    /* loaded from: classes2.dex */
    public class BinderC1391c extends IRemoteServiceCallback.Stub {
        static {
            Covode.recordClassIndex(4891);
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public int getVersion() {
            return 4;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public boolean isHideLoadingScreen() {
            return false;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void payEnd(boolean z, String str) {
        }

        public BinderC1391c() {
        }

        public /* synthetic */ BinderC1391c(C1388h c1388h, C1389a c1389a) {
            this();
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void r03(String str, String str2, Map map) {
            C1301a.m19216a(C1388h.this.f22416f, "wlt", str, str2);
            if (TextUtils.equals(str2, "ActivityStartSuccess")) {
                if (C1388h.this.f22415e != null) {
                    C1388h.this.f22415e.mo18838a();
                }
                if (C1388h.this.f22416f != null) {
                    C1388h.this.f22416f.m18936a(true);
                }
            }
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void startActivity(String str, String str2, int i, Bundle bundle) {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            if (bundle == null) {
                bundle = new Bundle();
            }
            try {
                bundle.putInt("CallingPid", i);
                intent.putExtras(bundle);
            } catch (Exception e) {
                C1301a.m19215a(C1388h.this.f22416f, "biz", "ErrIntentEx", e);
            }
            intent.setClassName(str, str2);
            try {
                int i2 = Build.VERSION.SDK_INT;
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                C1376a c1376a = C1388h.this.f22416f;
                C1301a.m19216a(c1376a, "biz", "isFg", runningAppProcessInfo.processName + "|" + runningAppProcessInfo.importance + "|");
            } catch (Throwable unused) {
            }
            try {
                if (C1388h.this.f22411a != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C116971W2r.LIZIZ(C1388h.this.f22411a, intent);
                    C1376a c1376a2 = C1388h.this.f22416f;
                    StringBuilder sb = new StringBuilder();
                    sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                    C1301a.m19216a(c1376a2, "biz", "stAct2", sb.toString());
                    return;
                }
                C1301a.m19211b(C1388h.this.f22416f, "biz", "ErrActNull", "");
                Context m18942a = C1388h.this.f22416f.m18942a();
                if (m18942a != null) {
                    C116971W2r.LIZ(m18942a, intent);
                }
            } catch (Throwable th) {
                C1301a.m19215a(C1388h.this.f22416f, "biz", "ErrActNull", th);
                throw th;
            }
        }
    }

    /* renamed from: com.alipay.sdk.m.u.h$d */
    /* loaded from: classes2.dex */
    public class ServiceConnectionC1392d implements ServiceConnection {
        static {
            Covode.recordClassIndex(4892);
        }

        public ServiceConnectionC1392d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C1301a.m19217a(C1388h.this.f22416f, "biz", "srvDis");
            C1388h.this.f22412b = null;
        }

        public /* synthetic */ ServiceConnectionC1392d(C1388h c1388h, C1389a c1389a) {
            this();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1301a.m19217a(C1388h.this.f22416f, "biz", "srvCon");
            synchronized (C1388h.this.f22413c) {
                C1388h.this.f22412b = IAlixPay.Stub.asInterface(iBinder);
                C1388h.this.f22413c.notify();
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ C1376a m18856a(C1388h c1388h) {
        return c1388h.f22416f;
    }

    /* renamed from: com.alipay.sdk.m.u.h$b */
    /* loaded from: classes2.dex */
    public class C1390b implements APayEntranceActivity.AbstractC1204a {

        /* renamed from: a */
        public final /* synthetic */ Object f22422a;

        static {
            Covode.recordClassIndex(4890);
        }

        @Override // com.alipay.sdk.app.APayEntranceActivity.AbstractC1204a
        /* renamed from: a */
        public void mo18839a(String str) {
            C1388h.this.f22419i = str;
            synchronized (this.f22422a) {
                try {
                    this.f22422a.notify();
                }
            }
        }

        public C1390b(Object obj) {
            this.f22422a = obj;
        }
    }

    /* renamed from: a */
    private void m18853a(C1399n.C1402c c1402c) {
        PackageInfo packageInfo;
        if (c1402c == null || (packageInfo = c1402c.f22435a) == null) {
            return;
        }
        String str = packageInfo.packageName;
        Intent intent = new Intent();
        intent.setClassName(str, "com.alipay.android.app.TransProcessPayActivity");
        try {
            C116971W2r.LIZIZ(this.f22411a, intent);
        } catch (Throwable th) {
            C1301a.m19215a(this.f22416f, "biz", "StartLaunchAppTransEx", th);
        }
        Thread.sleep(200L);
    }

    /* renamed from: com.alipay.sdk.m.u.h$a */
    /* loaded from: classes2.dex */
    public class C1389a implements AlipayResultActivity.AbstractC1205a {

        /* renamed from: a */
        public final /* synthetic */ CountDownLatch f22420a;

        static {
            Covode.recordClassIndex(4889);
        }

        public C1389a(CountDownLatch countDownLatch) {
            this.f22420a = countDownLatch;
        }

        @Override // com.alipay.sdk.app.AlipayResultActivity.AbstractC1205a
        /* renamed from: a */
        public void mo18840a(int i, String str, String str2) {
            C1388h.this.f22418h = C1295b.m19240a(i, str, str2);
            this.f22420a.countDown();
        }
    }

    /* renamed from: a */
    private String m18851a(String str, String str2) {
        String str3;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        String m18817a = C1399n.m18817a(32);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C1376a c1376a = this.f22416f;
        C1301a.m19216a(c1376a, "biz", "BSPStart", m18817a + "|" + elapsedRealtime);
        C1376a.C1377a.m18921a(this.f22416f, m18817a);
        AlipayResultActivity.f21999a.put(m18817a, new C1389a(countDownLatch));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sourcePid", Binder.getCallingPid());
            jSONObject.put("external_info", str);
            jSONObject.put("pkgName", this.f22411a.getPackageName());
            jSONObject.put("session", m18817a);
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(C34037f.f43302f), 2);
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("alipays").authority("platformapi").path("startapp").appendQueryParameter("appId", "20000125");
            appendQueryParameter.appendQueryParameter("mqpSchemePay", encodeToString);
            try {
                HashMap<String, String> m18941a = C1376a.m18941a(this.f22416f);
                m18941a.put("ts_scheme", String.valueOf(elapsedRealtime));
                appendQueryParameter.appendQueryParameter("mqpLoc", new JSONObject(m18941a).toString());
            } catch (Throwable th) {
                C1301a.m19215a(this.f22416f, "biz", "BSPLocEx", th);
            }
            String uri = appendQueryParameter.build().toString();
            Intent intent = new Intent();
            intent.setPackage(str2);
            intent.addFlags(268435456);
            intent.setData(Uri.parse(uri));
            C1301a.m19218a(this.f22411a, this.f22416f, str, this.f22416f.f22367d);
            C116971W2r.LIZIZ(this.f22411a, intent);
            C1385e.m18862d("mspl", "pay scheme waiting " + uri);
            countDownLatch.await();
            String str4 = this.f22418h;
            try {
                str3 = C1397l.m18824a(this.f22416f, str4).get("resultStatus");
                if (str3 == null) {
                    str3 = "null";
                }
            } catch (Throwable th2) {
                C1301a.m19215a(this.f22416f, "biz", "BSPStatEx", th2);
                str3 = LoggerUtil.UNKNOWN;
            }
            C1376a c1376a2 = this.f22416f;
            C1301a.m19217a(c1376a2, "biz", "BSPDone-" + str3);
            if (TextUtils.isEmpty(str4)) {
                C1301a.m19217a(this.f22416f, "biz", "BSPEmpty");
                return "scheme_failed";
            }
            return str4;
        } catch (InterruptedException e) {
            C1301a.m19215a(this.f22416f, "biz", "BSPWaiting", e);
            return C1295b.m19240a(EnumC1296c.PAY_WAITTING.m19230b(), EnumC1296c.PAY_WAITTING.m19233a(), "");
        } catch (Throwable th3) {
            C1301a.m19215a(this.f22416f, "biz", "BSPEx", th3);
            return "scheme_failed";
        }
    }

    /* renamed from: b */
    private String m18843b(String str, String str2) {
        Object obj = new Object();
        String m18817a = C1399n.m18817a(32);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C1376a c1376a = this.f22416f;
        C1301a.m19216a(c1376a, "biz", "BSAStart", m18817a + "|" + elapsedRealtime);
        C1376a.C1377a.m18921a(this.f22416f, m18817a);
        APayEntranceActivity.f21995h.put(m18817a, new C1390b(obj));
        try {
            HashMap<String, String> m18941a = C1376a.m18941a(this.f22416f);
            m18941a.put("ts_intent", String.valueOf(elapsedRealtime));
            JSONObject jSONObject = new JSONObject(m18941a);
            Intent intent = new Intent(this.f22411a, APayEntranceActivity.class);
            intent.putExtra("ap_order_info", str);
            intent.putExtra("ap_target_packagename", str2);
            intent.putExtra(APayEntranceActivity.f21993f, m18817a);
            if (jSONObject != null) {
                intent.putExtra(APayEntranceActivity.f21994g, jSONObject.toString());
            }
            C1301a.m19218a(this.f22411a, this.f22416f, str, this.f22416f.f22367d);
            if (this.f22411a != null) {
                C116971W2r.LIZIZ(this.f22411a, intent);
            } else {
                C1301a.m19211b(this.f22416f, "biz", "ErrActNull", "");
                Context m18942a = this.f22416f.m18942a();
                if (m18942a != null) {
                    C116971W2r.LIZ(m18942a, intent);
                }
            }
            synchronized (obj) {
                obj.wait();
            }
            String str3 = this.f22419i;
            String str4 = C1397l.m18824a(this.f22416f, str3).get("resultStatus");
            if (str4 == null) {
                str4 = "null";
            }
            C1376a c1376a2 = this.f22416f;
            C1301a.m19217a(c1376a2, "biz", "BSADone-" + str4);
            if (TextUtils.isEmpty(str3)) {
                C1301a.m19217a(this.f22416f, "biz", "BSAEmpty");
                return "scheme_failed";
            }
            return str3;
        }
    }

    public C1388h(Activity activity, C1376a c1376a, AbstractC1393e abstractC1393e) {
        this.f22411a = activity;
        this.f22416f = c1376a;
        this.f22415e = abstractC1393e;
        C1385e.m18862d("mspl", "alipaySdk");
    }

    /* renamed from: a */
    private String m18850a(String str, String str2, PackageInfo packageInfo) {
        String str3;
        if (packageInfo != null) {
            str3 = packageInfo.versionName;
        } else {
            str3 = "";
        }
        C1385e.m18862d("mspl", "pay payInvokeAct");
        C1376a c1376a = this.f22416f;
        new StringBuilder();
        C1301a.m19216a(c1376a, "biz", "PgWltVer", C0002O.m25085C(str2, "|", str3));
        Activity activity = this.f22411a;
        C1376a c1376a2 = this.f22416f;
        C1301a.m19218a(activity, c1376a2, str, c1376a2.f22367d);
        return m18843b(str, str2);
    }

    /* renamed from: b */
    public static boolean m18844b(String str, Context context, C1376a c1376a) {
        try {
            Intent intent = new Intent();
            intent.setClassName(str, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            if (intent.resolveActivityInfo(context.getPackageManager(), 0) == null) {
                C1301a.m19217a(c1376a, "biz", "BSADetectFail");
                return false;
            }
            return true;
        } catch (Throwable th) {
            C1301a.m19215a(c1376a, "biz", "BSADetectFail", th);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m18852a(String str, Context context, C1376a c1376a) {
        try {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.setClassName(str, "com.alipay.android.msp.ui.views.MspContainerActivity");
            if (intent.resolveActivityInfo(context.getPackageManager(), 0) == null) {
                C1301a.m19217a(c1376a, "biz", "BSPDetectFail");
                return false;
            }
            return true;
        } catch (Throwable th) {
            C1301a.m19215a(c1376a, "biz", "BSPDetectFail", th);
            return false;
        }
    }

    /* renamed from: a */
    private Pair<String, Boolean> m18848a(String str, String str2, C1376a c1376a) {
        int i;
        int i2;
        BinderC1391c binderC1391c;
        Activity activity;
        Activity activity2;
        String Pay;
        Activity activity3;
        Activity activity4;
        String packageName;
        Intent intent = new Intent();
        intent.setPackage(str2);
        intent.setAction(C1399n.m18779c(str2));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sb = new StringBuilder();
        sb.append(elapsedRealtime);
        sb.append("|");
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        sb.append(i);
        C1301a.m19216a(c1376a, "biz", "PgBindStarting", sb.toString());
        C1301a.m19218a(this.f22411a, c1376a, str, c1376a.f22367d);
        try {
            if (!C1328a.m19107z().m19127f()) {
                ComponentName startService = this.f22411a.getApplication().startService(intent);
                if (startService == null) {
                    packageName = "null";
                } else {
                    packageName = startService.getPackageName();
                }
                C1301a.m19216a(c1376a, "biz", "stSrv", packageName);
            } else {
                C1301a.m19216a(c1376a, "biz", "stSrv", "skipped");
            }
            if (C1328a.m19107z().m19131b()) {
                i2 = 65;
                C1301a.m19216a(c1376a, "biz", "bindFlg", "imp");
            } else {
                i2 = 1;
            }
            ServiceConnectionC1392d serviceConnectionC1392d = new ServiceConnectionC1392d(this, null);
            if (C116971W2r.LIZ(this.f22411a.getApplicationContext(), intent, serviceConnectionC1392d, i2)) {
                synchronized (this.f22413c) {
                    if (this.f22412b == null) {
                        try {
                            this.f22413c.wait(C1328a.m19107z().m19122k());
                        } catch (InterruptedException e) {
                            C1301a.m19215a(c1376a, "biz", "BindWaitTimeoutEx", e);
                        }
                    }
                }
                IAlixPay iAlixPay = this.f22412b;
                try {
                    if (iAlixPay == null) {
                        C1301a.m19211b(c1376a, "biz", "ClientBindFailed", "");
                        C1399n.m18796a("alipaySdk", "bindServiceTimeout", this.f22411a, this.f22416f);
                        Pair<String, Boolean> pair = new Pair<>("failed", Boolean.TRUE);
                        try {
                            this.f22411a.getApplicationContext().unbindService(serviceConnectionC1392d);
                        } catch (Throwable th) {
                            C1385e.m18866a(th);
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(SystemClock.elapsedRealtime());
                        C1301a.m19216a(c1376a, "biz", "PgBindEnd", sb2.toString());
                        C1301a.m19218a(this.f22411a, c1376a, str, c1376a.f22367d);
                        this.f22412b = null;
                        if (this.f22414d && (activity4 = this.f22411a) != null) {
                            activity4.setRequestedOrientation(0);
                            this.f22414d = false;
                        }
                        return pair;
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(elapsedRealtime2);
                    C1301a.m19216a(c1376a, "biz", "PgBinded", sb3.toString());
                    if (this.f22415e != null) {
                        this.f22415e.mo18837b();
                    }
                    if (this.f22411a.getRequestedOrientation() == 0) {
                        this.f22411a.setRequestedOrientation(1);
                        this.f22414d = true;
                    }
                    int version = iAlixPay.getVersion();
                    binderC1391c = new BinderC1391c(this, null);
                    try {
                        if (version >= 3) {
                            iAlixPay.registerCallback03(binderC1391c, str, null);
                        } else {
                            iAlixPay.registerCallback(binderC1391c);
                        }
                        long elapsedRealtime3 = SystemClock.elapsedRealtime();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(elapsedRealtime3);
                        C1301a.m19216a(c1376a, "biz", "PgBindPay", sb4.toString());
                        if (version >= 3) {
                            iAlixPay.r03("biz", "bind_pay", null);
                        }
                        if (version >= 2) {
                            HashMap<String, String> m18941a = C1376a.m18941a(c1376a);
                            m18941a.put("ts_bind", String.valueOf(elapsedRealtime));
                            m18941a.put("ts_bend", String.valueOf(elapsedRealtime2));
                            m18941a.put("ts_pay", String.valueOf(elapsedRealtime3));
                            Pay = iAlixPay.pay02(str, m18941a);
                        } else {
                            Pay = iAlixPay.Pay(str);
                        }
                        try {
                            iAlixPay.unregisterCallback(binderC1391c);
                        } catch (Throwable th2) {
                            C1385e.m18866a(th2);
                        }
                        try {
                            this.f22411a.getApplicationContext().unbindService(serviceConnectionC1392d);
                        } catch (Throwable th3) {
                            C1385e.m18866a(th3);
                        }
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(SystemClock.elapsedRealtime());
                        C1301a.m19216a(c1376a, "biz", "PgBindEnd", sb5.toString());
                        C1301a.m19218a(this.f22411a, c1376a, str, c1376a.f22367d);
                        this.f22412b = null;
                        if (this.f22414d && (activity3 = this.f22411a) != null) {
                            activity3.setRequestedOrientation(0);
                            this.f22414d = false;
                        }
                        return new Pair<>(Pay, Boolean.FALSE);
                    } catch (Throwable th4) {
                        th = th4;
                        try {
                            C1301a.m19214a(c1376a, "biz", "ClientBindFailed", th, "in_bind");
                            Pair<String, Boolean> pair2 = new Pair<>("failed", Boolean.TRUE);
                            if (binderC1391c != null) {
                                try {
                                    iAlixPay.unregisterCallback(binderC1391c);
                                } catch (Throwable th5) {
                                    C1385e.m18866a(th5);
                                }
                            }
                            try {
                                this.f22411a.getApplicationContext().unbindService(serviceConnectionC1392d);
                            } catch (Throwable th6) {
                                C1385e.m18866a(th6);
                            }
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(SystemClock.elapsedRealtime());
                            C1301a.m19216a(c1376a, "biz", "PgBindEnd", sb6.toString());
                            C1301a.m19218a(this.f22411a, c1376a, str, c1376a.f22367d);
                            this.f22412b = null;
                            if (this.f22414d && (activity2 = this.f22411a) != null) {
                                activity2.setRequestedOrientation(0);
                                this.f22414d = false;
                            }
                            return pair2;
                        } catch (Throwable th7) {
                            if (binderC1391c != null) {
                                try {
                                    iAlixPay.unregisterCallback(binderC1391c);
                                } catch (Throwable th8) {
                                    C1385e.m18866a(th8);
                                }
                            }
                            try {
                                this.f22411a.getApplicationContext().unbindService(serviceConnectionC1392d);
                            } catch (Throwable th9) {
                                C1385e.m18866a(th9);
                            }
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(SystemClock.elapsedRealtime());
                            C1301a.m19216a(c1376a, "biz", "PgBindEnd", sb7.toString());
                            C1301a.m19218a(this.f22411a, c1376a, str, c1376a.f22367d);
                            this.f22412b = null;
                            if (this.f22414d && (activity = this.f22411a) != null) {
                                activity.setRequestedOrientation(0);
                                this.f22414d = false;
                            }
                            throw th7;
                        }
                    }
                } catch (Throwable th10) {
                    th = th10;
                    binderC1391c = null;
                }
            } else {
                throw new Throwable("bindService fail");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e1  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m18849a(java.lang.String r9, java.lang.String r10, android.content.pm.PackageInfo r11, com.alipay.sdk.p082m.p121u.C1399n.C1402c r12) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.p082m.p121u.C1388h.m18849a(java.lang.String, java.lang.String, android.content.pm.PackageInfo, com.alipay.sdk.m.u.n$c):java.lang.String");
    }
}
