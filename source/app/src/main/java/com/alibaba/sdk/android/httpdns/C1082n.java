package com.alibaba.sdk.android.httpdns;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.sdk.android.httpdns.p073d.C1051b;
import com.alibaba.sdk.android.httpdns.p073d.C1066c;
import com.alibaba.sdk.android.httpdns.p074e.C1068a;
import com.bytedance.covode.number.Covode;
import com.heytap.mcssdk.constant.C15151a;
import com.xiaomi.mipush.sdk.Constants;
import p002O.C0002O;
import p003X.G4Y;

/* renamed from: com.alibaba.sdk.android.httpdns.n */
/* loaded from: classes19.dex */
public class C1082n {

    /* renamed from: a */
    public static volatile C1082n f21625a;

    /* renamed from: d */
    public static boolean f21626d;

    /* renamed from: e */
    public static long f21627e;

    /* renamed from: g */
    public static String f21628g = "https://";

    /* renamed from: h */
    public static String f21629h;

    /* renamed from: h */
    public static boolean f21630h;

    /* renamed from: a */
    public SharedPreferences f21631a;

    /* renamed from: a */
    public Handler f21632a;

    /* renamed from: c */
    public String f21633c;

    /* renamed from: e */
    public int f21634e;

    /* renamed from: e */
    public boolean f21635e;

    /* renamed from: f */
    public int f21636f;

    /* renamed from: f */
    public long f21637f;

    /* renamed from: f */
    public boolean f21638f;

    /* renamed from: g */
    public long f21639g;

    /* renamed from: g */
    public boolean f21640g = true;

    /* renamed from: i */
    public String f21641i;

    static {
        Covode.recordClassIndex(4488);
    }

    /* renamed from: a */
    public static C1082n m19871a() {
        if (f21625a == null) {
            synchronized (C1082n.class) {
                if (f21625a == null) {
                    f21625a = new C1082n();
                }
            }
        }
        return f21625a;
    }

    /* renamed from: a */
    private void m19867a(String str, long j) {
        try {
            C1051b m19921a = C1051b.m19921a();
            if (m19921a == null) {
                return;
            }
            m19921a.m19916a(str, j, C1066c.m19901a());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m19861d() {
        C1074i.m19882d("update server ips from StartIp schedule center.");
        this.f21639g = System.currentTimeMillis();
        this.f21634e = 0;
        this.f21636f = 0;
        this.f21638f = false;
        this.f21635e = true;
        this.f21640g = true;
        f21630h = false;
        CallableC1079m.m19874a().m19872a(C1071f.f21606b.length - 1);
        C1041c.m19946a().submit(CallableC1079m.m19874a());
        this.f21632a = null;
    }

    /* renamed from: d */
    private void m19860d(Throwable th) {
        try {
            C1051b m19921a = C1051b.m19921a();
            if (m19921a == null) {
                return;
            }
            int m19900a = C1066c.m19900a(th);
            m19921a.m19914a(m19862d(), String.valueOf(m19900a), th.getMessage(), C1066c.m19901a());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    private String m19859e() {
        return (this.f21635e || this.f21638f) ? C1071f.f21606b[this.f21636f] : C1071f.f21605a[this.f21634e];
    }

    /* renamed from: e */
    private void m19858e() {
        this.f21634e = this.f21634e < C1071f.f21605a.length + (-1) ? this.f21634e + 1 : 0;
    }

    /* renamed from: f */
    private void m19857f() {
        this.f21636f = this.f21636f < C1071f.f21606b.length + (-1) ? this.f21636f + 1 : 0;
    }

    /* renamed from: a */
    public synchronized void m19870a(Context context, String str) {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!f21626d) {
            synchronized (C1082n.class) {
                if (!f21626d) {
                    setAccountId(str);
                    if (context != null) {
                        this.f21631a = G4Y.LIZ(context, "httpdns_config_cache", 0);
                    }
                    this.f21635e = this.f21631a.getBoolean("httpdns_first_start", true);
                    f21629h = this.f21631a.getString("httpdns_server_ips", null);
                    this.f21641i = this.f21631a.getString("httpdns_region", null);
                    if (f21629h != null) {
                        C1071f.m19887a(f21629h.split(";"));
                    }
                    long j = this.f21631a.getLong("schedule_center_last_request_time", 0L);
                    f21627e = j;
                    if (j == 0 || System.currentTimeMillis() - f21627e >= C15151a.f30809f) {
                        C1103t.m19825a().m19823c(false);
                        m19864c();
                    }
                    f21626d = true;
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized void m19868a(C1088o c1088o, long j) {
        try {
            m19867a(m19862d(), j);
            this.f21634e = 0;
            this.f21636f = 0;
            this.f21638f = false;
            this.f21640g = true;
            HttpDns.switchDnsService(c1088o.isEnabled());
            if (m19866a(c1088o.m19850b())) {
                C1074i.m19882d("StartIp Scheduler center update success    StartIp isFirstStart：" + this.f21635e);
                f21630h = true;
                this.f21637f = System.currentTimeMillis();
                C1104u.m19807i();
                if (this.f21635e) {
                    SharedPreferences.Editor edit = this.f21631a.edit();
                    edit.putBoolean("httpdns_first_start", false);
                    edit.commit();
                    this.f21635e = false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public synchronized boolean m19866a(String[] strArr) {
        try {
            if (!C1071f.m19887a(strArr)) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
                sb.append(";");
            }
            sb.deleteCharAt(sb.length() - 1);
            if (this.f21631a == null) {
                return false;
            }
            SharedPreferences.Editor edit = this.f21631a.edit();
            edit.putString("httpdns_server_ips", sb.toString());
            edit.putLong("schedule_center_last_request_time", System.currentTimeMillis());
            edit.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public synchronized void m19865b(Context context, String str) {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (str.equals(this.f21641i)) {
            C1074i.m19881e("region should be different");
            return;
        }
        this.f21641i = str;
        if (System.currentTimeMillis() - this.f21639g >= Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL) {
            m19861d();
        } else {
            long currentTimeMillis = Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL - (System.currentTimeMillis() - this.f21639g);
            C1074i.m19881e("The call time should be greater than 5 minutes. SDK will initiate an update request after " + (currentTimeMillis / 60000) + " minutes.");
            if (this.f21632a == null) {
                this.f21632a = new Handler();
                this.f21632a.postDelayed(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.n.1
                    static {
                        Covode.recordClassIndex(4489);
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        C1082n.this.m19861d();
                    }
                }, currentTimeMillis);
            }
        }
        if (this.f21631a == null) {
            if (context == null) {
                C1074i.m19880f("sp failed to save, does not affect the current settings");
                return;
            }
            this.f21631a = G4Y.LIZ(context, "httpdns_config_cache", 0);
        }
        SharedPreferences.Editor edit = this.f21631a.edit();
        edit.putString("httpdns_region", this.f21641i);
        edit.putBoolean("httpdns_first_start", true);
        edit.putLong("schedule_center_last_request_time", 0L);
        edit.commit();
    }

    /* renamed from: c */
    public synchronized void m19864c() {
        CallableC1079m m19874a;
        int length;
        if (System.currentTimeMillis() - this.f21637f < Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL) {
            C1074i.m19882d("update server ips from StartIp schedule center too often, give up. ");
            C1104u.m19806j();
            return;
        }
        C1074i.m19882d("update server ips from StartIp schedule center.");
        this.f21634e = 0;
        this.f21636f = 0;
        this.f21638f = false;
        this.f21640g = true;
        f21630h = false;
        if (this.f21635e) {
            m19874a = CallableC1079m.m19874a();
            length = C1071f.f21606b.length;
        } else {
            m19874a = CallableC1079m.m19874a();
            length = C1071f.f21605a.length;
        }
        m19874a.m19872a(length - 1);
        C1041c.m19946a().submit(CallableC1079m.m19874a());
    }

    /* renamed from: c */
    public synchronized void m19863c(Throwable th) {
        try {
            f21630h = false;
            m19860d(th);
            if (!this.f21635e) {
                if (!this.f21638f) {
                    m19858e();
                }
                if (this.f21634e == 0) {
                    this.f21638f = true;
                    if (this.f21640g) {
                        this.f21640g = false;
                        this.f21636f = 0;
                        C1074i.m19882d("StartIp Scheduler center update from StartIp");
                        CallableC1079m.m19874a().m19872a(C1071f.f21606b.length - 1);
                        C1041c.m19946a().submit(CallableC1079m.m19874a());
                    } else {
                        m19857f();
                        if (this.f21636f == 0) {
                            this.f21637f = System.currentTimeMillis();
                            C1074i.m19880f("StartIp Scheduler center update failed");
                            C1104u.m19806j();
                        }
                    }
                }
                return;
            }
            m19857f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public synchronized String m19862d() {
        try {
            new StringBuilder();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
        return C0002O.m25080C(f21628g, m19859e(), "/", this.f21633c == null ? C1071f.f21607c : this.f21633c, "/ss?platform=android&sdk_version=1.3.2.3-no-bssid", "&sid=", C1068a.m19891a().getSessionId(), "&net=", C1068a.m19891a().m19890l(), TextUtils.isEmpty(this.f21641i) ? "" : C0002O.m25086C("&region=", this.f21641i));
    }

    public void setAccountId(String str) {
        this.f21633c = str;
    }
}
