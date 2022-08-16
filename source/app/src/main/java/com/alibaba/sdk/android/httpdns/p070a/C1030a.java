package com.alibaba.sdk.android.httpdns.p070a;

import android.content.Context;
import com.alibaba.sdk.android.beacon.Beacon;
import com.alibaba.sdk.android.httpdns.C1033b;
import com.alibaba.sdk.android.httpdns.C1074i;
import com.alibaba.sdk.android.httpdns.p073d.C1051b;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.alibaba.sdk.android.httpdns.a.a */
/* loaded from: classes19.dex */
public class C1030a {

    /* renamed from: a */
    public static volatile C1030a f21521a;

    /* renamed from: a */
    public Beacon f21524a;

    /* renamed from: a */
    public C1051b f21525a;
    public Context mContext;

    /* renamed from: m */
    public boolean f21526m = true;

    /* renamed from: a */
    public final Beacon.OnUpdateListener f21523a = new Beacon.OnUpdateListener() { // from class: com.alibaba.sdk.android.httpdns.a.a.1
        static {
            Covode.recordClassIndex(4437);
        }

        @Override // com.alibaba.sdk.android.beacon.Beacon.OnUpdateListener
        public void onUpdate(List<Beacon.Config> list) {
            try {
                C1030a.this.m19988b(list);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

    /* renamed from: a */
    public final Beacon.OnServiceErrListener f21522a = new Beacon.OnServiceErrListener() { // from class: com.alibaba.sdk.android.httpdns.a.a.2
        static {
            Covode.recordClassIndex(4438);
        }

        @Override // com.alibaba.sdk.android.beacon.Beacon.OnServiceErrListener
        public void onErr(Beacon.Error error) {
        }
    };

    static {
        Covode.recordClassIndex(4436);
    }

    /* renamed from: a */
    public static C1030a m19992a() {
        if (f21521a == null) {
            synchronized (C1030a.class) {
                if (f21521a == null) {
                    f21521a = new C1030a();
                }
            }
        }
        return f21521a;
    }

    /* renamed from: a */
    private boolean m19991a(Beacon.Config config) {
        if (config == null || !config.key.equalsIgnoreCase("___httpdns_service___")) {
            return false;
        }
        String str = config.value;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("ut")) {
                    m19985f(jSONObject.getString("ut"));
                }
                if (jSONObject.has("ip-ranking")) {
                    m19984i(jSONObject.getString("ip-ranking"));
                }
                if (jSONObject.has("status")) {
                    m19983j(jSONObject.getString("status"));
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m19988b(List<Beacon.Config> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (Beacon.Config config : list) {
            if (config.key.equalsIgnoreCase("___httpdns_service___")) {
                m19991a(config);
            }
        }
    }

    /* renamed from: f */
    private boolean m19985f(String str) {
        if (str == null || this.f21525a == null) {
            return false;
        }
        if (str.equalsIgnoreCase("disabled")) {
            this.f21525a.m19905e(false);
        } else {
            this.f21525a.m19905e(true);
        }
        return true;
    }

    /* renamed from: i */
    private void m19984i(String str) {
        if (str != null) {
            if (str.equalsIgnoreCase("disabled")) {
                this.f21526m = false;
            } else {
                this.f21526m = true;
            }
        }
    }

    /* renamed from: j */
    private void m19983j(String str) {
        if (str != null) {
            C1033b.m19980a(!"disabled".equals(str));
            C1074i.m19881e("[beacon] httpdns enable: " + C1033b.m19982a());
        }
    }

    /* renamed from: a */
    public void m19989a(C1051b c1051b) {
        this.f21525a = c1051b;
    }

    /* renamed from: c */
    public void m19987c(Context context, String str) {
        this.mContext = context;
        if (this.mContext != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("sdkId", "httpdns");
            hashMap.put("accountId", str);
            Beacon.Builder builder = new Beacon.Builder();
            builder.appKey("24657847");
            builder.appSecret("f30fc0937f2b1e9e50a1b7134f1ddb10");
            builder.loopInterval(7200000L);
            builder.extras(hashMap);
            this.f21524a = builder.build();
            this.f21524a.addUpdateListener(this.f21523a);
            this.f21524a.addServiceErrListener(this.f21522a);
            this.f21524a.start(this.mContext.getApplicationContext());
        }
    }

    /* renamed from: f */
    public boolean m19986f() {
        return this.f21526m;
    }
}
