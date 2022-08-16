package com.alibaba.sdk.android.httpdns.p073d;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.sdk.android.utils.AlicloudTracker;
import com.alibaba.sdk.android.utils.AlicloudTrackerManager;
import com.alibaba.sdk.android.utils.crashdefend.SDKMessageCallback;
import com.alipay.sdk.p082m.p105l.C1315c;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.lego.experiment.LegoCommitOptExperiment;
import com.p3021tt.miniapp.audio.background.BgAudioManagerClient;
import java.util.HashMap;

/* renamed from: com.alibaba.sdk.android.httpdns.d.b */
/* loaded from: classes19.dex */
public class C1051b {

    /* renamed from: b */
    public static volatile C1051b f21564b;

    /* renamed from: a */
    public AlicloudTracker f21565a;

    /* renamed from: a */
    public AlicloudTrackerManager f21566a;

    /* renamed from: r */
    public boolean f21569r;

    /* renamed from: q */
    public boolean f21568q = true;

    /* renamed from: b */
    public C1049a f21567b = new C1049a();

    static {
        Covode.recordClassIndex(4457);
    }

    public C1051b(Context context) {
        if (context == null || !(context.getApplicationContext() instanceof Application)) {
            return;
        }
        this.f21566a = AlicloudTrackerManager.getInstance((Application) context.getApplicationContext());
        AlicloudTrackerManager alicloudTrackerManager = this.f21566a;
        if (alicloudTrackerManager == null) {
            return;
        }
        this.f21565a = alicloudTrackerManager.getTracker("httpdns", "1.3.2.3-no-bssid");
    }

    /* renamed from: a */
    public static C1051b m19921a() {
        return f21564b;
    }

    /* renamed from: a */
    public static C1051b m19920a(Context context) {
        if (f21564b == null) {
            synchronized (C1051b.class) {
                if (f21564b == null) {
                    f21564b = new C1051b(context);
                }
            }
        }
        return f21564b;
    }

    /* renamed from: a */
    public void m19917a(String str, int i, int i2, int i3) {
        if (this.f21568q && this.f21565a != null && !TextUtils.isEmpty(str)) {
            if (i != 0 && i != 1) {
                return;
            }
            if (i2 != 0 && i2 != 1) {
                return;
            }
            if (i3 != 0 && i3 != 1) {
                return;
            }
            final HashMap hashMap = new HashMap();
            hashMap.put(C1315c.f22208f, str);
            hashMap.put("success", String.valueOf(i));
            hashMap.put("ipv6", String.valueOf(i2));
            hashMap.put("cacheOpen", String.valueOf(i3));
            this.f21567b.m19922b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.5
                static {
                    Covode.recordClassIndex(4467);
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C1051b.this.f21565a.sendCustomHit("perf_getip", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void m19916a(String str, long j, int i) {
        if (this.f21568q && this.f21565a != null && !TextUtils.isEmpty(str) && j > 0) {
            if (i != 0 && i != 1) {
                return;
            }
            if (j > 30000) {
                j = 30000;
            }
            final HashMap hashMap = new HashMap();
            hashMap.put("scAddr", str);
            hashMap.put("cost", String.valueOf(j));
            hashMap.put("ipv6", String.valueOf(i));
            this.f21567b.m19922b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.3
                static {
                    Covode.recordClassIndex(4465);
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C1051b.this.f21565a.sendCustomHit("perf_sc", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void m19915a(String str, String str2, String str3) {
        if (this.f21568q && this.f21565a != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            final HashMap hashMap = new HashMap();
            hashMap.put(C1315c.f22208f, str);
            hashMap.put("scAddr", str2);
            hashMap.put("srvAddr", str3);
            this.f21567b.m19922b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.8
                static {
                    Covode.recordClassIndex(4470);
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C1051b.this.f21565a.sendCustomHit("biz_sniffer", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void m19914a(String str, String str2, String str3, int i) {
        if (this.f21568q && this.f21565a != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            if (i != 0 && i != 1) {
                return;
            }
            final HashMap hashMap = new HashMap();
            hashMap.put("scAddr", str);
            hashMap.put("errCode", str2);
            hashMap.put("errMsg", str3);
            hashMap.put("ipv6", String.valueOf(i));
            this.f21567b.m19922b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.13
                static {
                    Covode.recordClassIndex(4462);
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C1051b.this.f21565a.sendCustomHit("err_sc", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void m19913a(String str, String str2, String str3, int i, int i2) {
        try {
            if (!this.f21568q || this.f21565a == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return;
            }
            if (i != 0 && i != 1) {
                return;
            }
            if (i2 != 0 && i2 != 1) {
                return;
            }
            final HashMap hashMap = new HashMap();
            hashMap.put("srvAddr", str);
            hashMap.put("errCode", str2);
            hashMap.put("errMsg", str3);
            hashMap.put("ipv6", String.valueOf(i));
            hashMap.put("ipv6_srv", String.valueOf(i2));
            this.f21567b.m19922b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.14
                static {
                    Covode.recordClassIndex(4463);
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C1051b.this.f21565a.sendCustomHit("err_srv", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m19912a(String str, String str2, String str3, long j, long j2, int i) {
        if (this.f21568q && this.f21565a != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && i > 0) {
            if (j > LegoCommitOptExperiment.BOOT_FINISH_DELAY_TIME) {
                j = LegoCommitOptExperiment.BOOT_FINISH_DELAY_TIME;
            }
            if (j2 > LegoCommitOptExperiment.BOOT_FINISH_DELAY_TIME) {
                j2 = LegoCommitOptExperiment.BOOT_FINISH_DELAY_TIME;
            }
            final HashMap hashMap = new HashMap();
            hashMap.put(C1315c.f22208f, str);
            hashMap.put("defaultIp", str2);
            hashMap.put("selectedIp", str3);
            hashMap.put("defaultIpCost", String.valueOf(j));
            hashMap.put("selectedIpCost", String.valueOf(j2));
            hashMap.put("ipCount", String.valueOf(i));
            this.f21567b.m19922b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.7
                static {
                    Covode.recordClassIndex(4469);
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C1051b.this.f21565a.sendCustomHit("perf_ipselection", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public boolean m19918a(SDKMessageCallback sDKMessageCallback) {
        try {
            if (this.f21566a == null) {
                return false;
            }
            return this.f21566a.registerCrashDefend("httpdns", "1.3.2.3-no-bssid", 2, 7, sDKMessageCallback);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public void m19911b(String str, int i, int i2, int i3) {
        if (this.f21568q && this.f21565a != null && !TextUtils.isEmpty(str)) {
            if (i != 0 && i != 1) {
                return;
            }
            if (i2 != 0 && i2 != 1) {
                return;
            }
            if (i3 != 0 && i3 != 1) {
                return;
            }
            final HashMap hashMap = new HashMap();
            hashMap.put(C1315c.f22208f, str);
            hashMap.put("success", String.valueOf(i));
            hashMap.put("ipv6", String.valueOf(i2));
            hashMap.put("cacheOpen", String.valueOf(i3));
            this.f21567b.m19922b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.6
                static {
                    Covode.recordClassIndex(4468);
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C1051b.this.f21565a.sendCustomHit("perf_user_getip", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void m19910b(String str, long j, int i) {
        if (this.f21568q && this.f21565a != null && !TextUtils.isEmpty(str) && j > 0) {
            if (i != 0 && i != 1) {
                return;
            }
            if (j > 30000) {
                j = 30000;
            }
            final HashMap hashMap = new HashMap();
            hashMap.put("srvAddr", str);
            hashMap.put("cost", String.valueOf(j));
            hashMap.put("ipv6", String.valueOf(i));
            this.f21567b.m19922b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.4
                static {
                    Covode.recordClassIndex(4466);
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C1051b.this.f21565a.sendCustomHit("perf_srv", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void m19909b(String str, String str2, String str3) {
        if (this.f21568q && this.f21565a != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            final HashMap hashMap = new HashMap();
            hashMap.put(C1315c.f22208f, str);
            hashMap.put("scAddr", str2);
            hashMap.put("srvAddr", str3);
            this.f21567b.m19922b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.9
                static {
                    Covode.recordClassIndex(4471);
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C1051b.this.f21565a.sendCustomHit("biz_local_disable", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public void m19908c(int i) {
        if (this.f21568q && this.f21565a != null) {
            if (i != 0 && i != 1) {
                return;
            }
            final HashMap hashMap = new HashMap();
            hashMap.put("enable", String.valueOf(i));
            this.f21567b.m19922b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.10
                static {
                    Covode.recordClassIndex(4459);
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C1051b.this.f21565a.sendCustomHit("biz_cache", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public void m19907d(int i) {
        if (this.f21568q && this.f21565a != null) {
            if (i != 0 && i != 1) {
                return;
            }
            final HashMap hashMap = new HashMap();
            hashMap.put("enable", String.valueOf(i));
            this.f21567b.m19922b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.11
                static {
                    Covode.recordClassIndex(4460);
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C1051b.this.f21565a.sendCustomHit("biz_expired_ip", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: e */
    public void m19906e(int i) {
        try {
            if (!this.f21568q || this.f21565a == null) {
                return;
            }
            if (i != 0 && i != 1) {
                return;
            }
            final HashMap hashMap = new HashMap();
            hashMap.put("enable", String.valueOf(i));
            this.f21567b.m19922b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.12
                static {
                    Covode.recordClassIndex(4461);
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C1051b.this.f21565a.sendCustomHit("biz_ipv6_enable", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public void m19905e(boolean z) {
        synchronized (C1051b.class) {
            if (!this.f21569r) {
                this.f21568q = z;
            }
        }
    }

    /* renamed from: k */
    public void m19904k() {
        synchronized (C1051b.class) {
            this.f21569r = true;
            this.f21568q = false;
        }
    }

    /* renamed from: k */
    public void m19903k(String str) {
        if (this.f21568q && this.f21565a != null && !TextUtils.isEmpty(str)) {
            final HashMap hashMap = new HashMap();
            hashMap.put(BgAudioManagerClient.API_CALLBACK_EXCEPTION, str);
            this.f21567b.m19922b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.2
                static {
                    Covode.recordClassIndex(4464);
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C1051b.this.f21565a.sendCustomHit("err_uncaught_exception", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: l */
    public void m19902l() {
        if (this.f21568q && this.f21565a != null) {
            this.f21567b.m19922b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.1
                static {
                    Covode.recordClassIndex(4458);
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C1051b.this.f21565a.sendCustomHit("biz_active", null);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public void setAccountId(String str) {
        AlicloudTracker alicloudTracker = this.f21565a;
        if (alicloudTracker != null) {
            alicloudTracker.setGlobalProperty("accountId", str);
        }
    }
}
