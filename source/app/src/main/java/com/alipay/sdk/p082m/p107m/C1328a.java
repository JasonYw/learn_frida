package com.alipay.sdk.p082m.p107m;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.p082m.p103k.C1301a;
import com.alipay.sdk.p082m.p113p.C1351b;
import com.alipay.sdk.p082m.p115q.C1362b;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.alipay.sdk.p082m.p119s.C1378b;
import com.alipay.sdk.p082m.p121u.C1381a;
import com.alipay.sdk.p082m.p121u.C1385e;
import com.alipay.sdk.p082m.p121u.C1395j;
import com.alipay.sdk.p082m.p121u.C1399n;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.analytics.pro.C33764r;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.alipay.sdk.m.m.a */
/* loaded from: classes2.dex */
public final class C1328a {

    /* renamed from: y0 */
    public static C1328a f22232y0;

    /* renamed from: w */
    public JSONObject f22255w;

    /* renamed from: a */
    public int f22233a = 10000;

    /* renamed from: b */
    public boolean f22234b = false;

    /* renamed from: c */
    public String f22235c = "https://h5.m.taobao.com/mlapp/olist.html";

    /* renamed from: d */
    public int f22236d = 10;

    /* renamed from: e */
    public boolean f22237e = true;

    /* renamed from: f */
    public boolean f22238f = true;

    /* renamed from: g */
    public boolean f22239g = false;

    /* renamed from: h */
    public boolean f22240h = false;

    /* renamed from: i */
    public boolean f22241i = true;

    /* renamed from: j */
    public boolean f22242j = true;

    /* renamed from: k */
    public String f22243k = "";

    /* renamed from: l */
    public boolean f22244l = false;

    /* renamed from: m */
    public boolean f22245m = false;

    /* renamed from: n */
    public boolean f22246n = false;

    /* renamed from: o */
    public boolean f22247o = false;

    /* renamed from: p */
    public boolean f22248p = true;

    /* renamed from: q */
    public String f22249q = "";

    /* renamed from: r */
    public String f22250r = "";

    /* renamed from: s */
    public boolean f22251s = false;

    /* renamed from: t */
    public boolean f22252t = false;

    /* renamed from: u */
    public int f22253u = 1000;

    /* renamed from: v */
    public boolean f22254v = false;

    /* renamed from: x */
    public boolean f22256x = true;

    /* renamed from: y */
    public List<C1330b> f22257y = null;

    /* renamed from: z */
    public int f22258z = -1;

    static {
        Covode.recordClassIndex(4828);
    }

    /* renamed from: y */
    private int m19108y() {
        return this.f22253u;
    }

    /* renamed from: b */
    public final boolean m19131b() {
        return this.f22244l;
    }

    /* renamed from: c */
    public final String m19130c() {
        return this.f22250r;
    }

    /* renamed from: d */
    public final int m19129d() {
        return this.f22236d;
    }

    /* renamed from: e */
    public final boolean m19128e() {
        return this.f22240h;
    }

    /* renamed from: f */
    public final boolean m19127f() {
        return this.f22241i;
    }

    /* renamed from: g */
    public final String m19126g() {
        return this.f22243k;
    }

    /* renamed from: h */
    public final boolean m19125h() {
        return this.f22238f;
    }

    /* renamed from: i */
    public final boolean m19124i() {
        return this.f22237e;
    }

    /* renamed from: j */
    public final String m19123j() {
        return this.f22249q;
    }

    /* renamed from: l */
    public final List<C1330b> m19121l() {
        return this.f22257y;
    }

    /* renamed from: m */
    public final boolean m19120m() {
        return this.f22242j;
    }

    /* renamed from: n */
    public final boolean m19119n() {
        return this.f22245m;
    }

    /* renamed from: o */
    public final boolean m19118o() {
        return this.f22251s;
    }

    /* renamed from: p */
    public final boolean m19117p() {
        return this.f22246n;
    }

    /* renamed from: q */
    public final String m19116q() {
        return this.f22235c;
    }

    /* renamed from: r */
    public final boolean m19115r() {
        return this.f22248p;
    }

    /* renamed from: t */
    public final boolean m19113t() {
        return this.f22254v;
    }

    /* renamed from: u */
    public final boolean m19112u() {
        return this.f22256x;
    }

    /* renamed from: v */
    public final boolean m19111v() {
        return this.f22234b;
    }

    /* renamed from: w */
    public final boolean m19110w() {
        return this.f22252t;
    }

    /* renamed from: x */
    public final boolean m19109x() {
        return this.f22247o;
    }

    /* renamed from: com.alipay.sdk.m.m.a$b */
    /* loaded from: classes2.dex */
    public static final class C1330b {

        /* renamed from: a */
        public final String f22264a;

        /* renamed from: b */
        public final int f22265b;

        /* renamed from: c */
        public final String f22266c;

        static {
            Covode.recordClassIndex(4830);
        }

        public final String toString() {
            return String.valueOf(m19106a(this));
        }

        /* renamed from: a */
        public static C1330b m19103a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            return new C1330b(jSONObject.optString("pn"), jSONObject.optInt("v", 0), jSONObject.optString(PushConstants.URI_PACKAGE_NAME));
        }

        /* renamed from: a */
        public static List<C1330b> m19104a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                C1330b m19103a = m19103a(jSONArray.optJSONObject(i));
                if (m19103a != null) {
                    arrayList.add(m19103a);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        public static JSONArray m19105a(List<C1330b> list) {
            if (list == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (C1330b c1330b : list) {
                jSONArray.put(m19106a(c1330b));
            }
            return jSONArray;
        }

        /* renamed from: a */
        public static JSONObject m19106a(C1330b c1330b) {
            if (c1330b == null) {
                return null;
            }
            try {
                return new JSONObject().put("pn", c1330b.f22264a).put("v", c1330b.f22265b).put(PushConstants.URI_PACKAGE_NAME, c1330b.f22266c);
            } catch (JSONException e) {
                C1385e.m18866a(e);
                return null;
            }
        }

        public C1330b(String str, int i, String str2) {
            this.f22264a = str;
            this.f22265b = i;
            this.f22266c = str2;
        }
    }

    /* renamed from: a */
    public final JSONObject m19141a() {
        return this.f22255w;
    }

    /* renamed from: z */
    public static C1328a m19107z() {
        if (f22232y0 == null) {
            C1328a c1328a = new C1328a();
            f22232y0 = c1328a;
            c1328a.m19114s();
        }
        return f22232y0;
    }

    /* renamed from: k */
    public final int m19122k() {
        int i = this.f22233a;
        if (i >= 1000 && i <= 20000) {
            C1385e.m18865b("DynCon", "time = " + this.f22233a);
            return this.f22233a;
        }
        C1385e.m18865b("DynCon", "time(def) = 10000");
        return 10000;
    }

    /* renamed from: s */
    public final void m19114s() {
        Context m18917b = C1378b.m18915d().m18917b();
        String m18831a = C1395j.m18831a(C1376a.m18925f(), m18917b, "alipay_cashier_dynamic_config", null);
        try {
            this.f22258z = Integer.parseInt(C1395j.m18831a(C1376a.m18925f(), m18917b, "utdid_factor", C33764r.f42396f));
        } catch (Exception unused) {
        }
        m19134a(m18831a);
    }

    /* renamed from: com.alipay.sdk.m.m.a$a */
    /* loaded from: classes2.dex */
    public class RunnableC1329a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C1376a f22259a;

        /* renamed from: b */
        public final /* synthetic */ Context f22260b;

        /* renamed from: c */
        public final /* synthetic */ boolean f22261c;

        /* renamed from: d */
        public final /* synthetic */ int f22262d;

        static {
            Covode.recordClassIndex(4829);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C1351b m19006a = new C1362b().m19006a(this.f22259a, this.f22260b);
                if (m19006a == null) {
                    return;
                }
                C1328a.this.m19135a(this.f22259a, m19006a.m19021a());
                C1328a.this.m19137a(C1376a.m18925f());
                C1376a c1376a = this.f22259a;
                C1301a.m19217a(c1376a, "biz", "offcfg|" + this.f22261c + "|" + this.f22262d);
            } catch (Throwable th) {
                C1385e.m18866a(th);
            }
        }

        public RunnableC1329a(C1376a c1376a, Context context, boolean z, int i) {
            this.f22259a = c1376a;
            this.f22260b = context;
            this.f22261c = z;
            this.f22262d = i;
        }
    }

    /* renamed from: A */
    private JSONObject m19142A() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timeout", m19122k());
        jSONObject.put("h5_port_degrade", m19111v());
        jSONObject.put("tbreturl", m19116q());
        jSONObject.put("configQueryInterval", m19129d());
        jSONObject.put("launchAppSwitch", C1330b.m19105a(m19121l()));
        jSONObject.put("scheme_pay_2", m19124i());
        jSONObject.put("intercept_batch", m19125h());
        jSONObject.put("deg_log_mcgw", m19128e());
        jSONObject.put("deg_start_srv_first", m19127f());
        jSONObject.put("prev_jump_dual", m19120m());
        jSONObject.put("use_sc_only", m19126g());
        jSONObject.put("bind_use_imp", m19131b());
        jSONObject.put("retry_bnd_once", m19119n());
        jSONObject.put("skip_trans", m19117p());
        jSONObject.put("start_trans", m19109x());
        jSONObject.put("up_before_pay", m19115r());
        jSONObject.put("use_sc_lck_a", m19118o());
        jSONObject.put("lck_k", m19123j());
        jSONObject.put("bind_with_startActivity", m19130c());
        jSONObject.put("retry_aidl_activity_not_start", m19110w());
        jSONObject.put("cfg_max_time", m19108y());
        jSONObject.put("get_oa_id", m19112u());
        jSONObject.put("notifyFailApp", m19113t());
        jSONObject.put("ap_args", m19141a());
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m19137a(C1376a c1376a) {
        try {
            JSONObject m19142A = m19142A();
            C1395j.m18829b(c1376a, C1378b.m18915d().m18917b(), "alipay_cashier_dynamic_config", m19142A.toString());
        } catch (Exception e) {
            C1385e.m18866a(e);
        }
    }

    /* renamed from: a */
    private void m19134a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            m19133a(new JSONObject(str));
        } catch (Throwable th) {
            C1385e.m18866a(th);
        }
    }

    /* renamed from: a */
    private void m19133a(JSONObject jSONObject) {
        this.f22233a = jSONObject.optInt("timeout", 10000);
        this.f22234b = jSONObject.optBoolean("h5_port_degrade", false);
        this.f22235c = jSONObject.optString("tbreturl", "https://h5.m.taobao.com/mlapp/olist.html").trim();
        this.f22236d = jSONObject.optInt("configQueryInterval", 10);
        this.f22257y = C1330b.m19104a(jSONObject.optJSONArray("launchAppSwitch"));
        this.f22237e = jSONObject.optBoolean("scheme_pay_2", true);
        this.f22238f = jSONObject.optBoolean("intercept_batch", true);
        this.f22240h = jSONObject.optBoolean("deg_log_mcgw", false);
        this.f22241i = jSONObject.optBoolean("deg_start_srv_first", true);
        this.f22242j = jSONObject.optBoolean("prev_jump_dual", true);
        this.f22243k = jSONObject.optString("use_sc_only", "");
        this.f22244l = jSONObject.optBoolean("bind_use_imp", false);
        this.f22245m = jSONObject.optBoolean("retry_bnd_once", false);
        this.f22246n = jSONObject.optBoolean("skip_trans", false);
        this.f22247o = jSONObject.optBoolean("start_trans", false);
        this.f22248p = jSONObject.optBoolean("up_before_pay", true);
        this.f22249q = jSONObject.optString("lck_k", "");
        this.f22251s = jSONObject.optBoolean("use_sc_lck_a", false);
        this.f22252t = jSONObject.optBoolean("retry_aidl_activity_not_start", false);
        this.f22254v = jSONObject.optBoolean("notifyFailApp", false);
        this.f22250r = jSONObject.optString("bind_with_startActivity", "");
        this.f22253u = jSONObject.optInt("cfg_max_time", 1000);
        this.f22256x = jSONObject.optBoolean("get_oa_id", true);
        this.f22255w = jSONObject.optJSONObject("ap_args");
    }

    /* renamed from: a */
    public final void m19132a(boolean z) {
        this.f22239g = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m19135a(C1376a c1376a, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("st_sdk_config");
            C1381a.m18881a(c1376a, optJSONObject, C1381a.m18882a(c1376a, jSONObject));
            if (optJSONObject != null) {
                m19133a(optJSONObject);
            } else {
                C1385e.m18861e("DynCon", "empty config");
            }
        } catch (Throwable th) {
            C1385e.m18866a(th);
        }
    }

    /* renamed from: a */
    public final boolean m19140a(Context context, int i) {
        if (this.f22258z == -1) {
            this.f22258z = C1399n.m18818a();
            C1395j.m18829b(C1376a.m18925f(), context, "utdid_factor", String.valueOf(this.f22258z));
        }
        if (this.f22258z < i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void m19136a(C1376a c1376a, Context context, boolean z, int i) {
        C1301a.m19217a(c1376a, "biz", "oncfg|" + z + "|" + i);
        RunnableC1329a runnableC1329a = new RunnableC1329a(c1376a, context, z, i);
        if (z && !C1399n.m18764h()) {
            int m19108y = m19108y();
            if (!C1399n.m18816a(m19108y, runnableC1329a, "AlipayDCPBlok")) {
                StringBuilder sb = new StringBuilder();
                sb.append(m19108y);
                C1301a.m19211b(c1376a, "biz", "LogAppFetchConfigTimeout", sb.toString());
                return;
            }
            return;
        }
        Thread thread = new Thread(runnableC1329a);
        thread.setName("AlipayDCP");
        thread.start();
    }
}
