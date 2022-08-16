package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.app.PayResultActivity;
import com.alipay.sdk.p082m.p099i.C1287a;
import com.alipay.sdk.p082m.p101j.C1294a;
import com.alipay.sdk.p082m.p101j.C1295b;
import com.alipay.sdk.p082m.p101j.EnumC1296c;
import com.alipay.sdk.p082m.p103k.C1301a;
import com.alipay.sdk.p082m.p105l.C1313a;
import com.alipay.sdk.p082m.p107m.C1328a;
import com.alipay.sdk.p082m.p109n.C1333a;
import com.alipay.sdk.p082m.p115q.C1366f;
import com.alipay.sdk.p082m.p117r.C1371b;
import com.alipay.sdk.p082m.p117r.EnumC1370a;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.alipay.sdk.p082m.p119s.C1378b;
import com.alipay.sdk.p082m.p120t.C1379a;
import com.alipay.sdk.p082m.p121u.C1382b;
import com.alipay.sdk.p082m.p121u.C1385e;
import com.alipay.sdk.p082m.p121u.C1388h;
import com.alipay.sdk.p082m.p121u.C1394i;
import com.alipay.sdk.p082m.p121u.C1397l;
import com.alipay.sdk.p082m.p121u.C1399n;
import com.alipay.sdk.p082m.p123x.C1417a;
import com.alipay.sdk.util.H5PayResultModel;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.C116971W2r;

/* loaded from: classes2.dex */
public class PayTask {

    /* renamed from: h */
    public static final Object f22032h = C1388h.class;

    /* renamed from: i */
    public static long f22033i;

    /* renamed from: a */
    public Activity f22034a;

    /* renamed from: b */
    public C1417a f22035b;

    /* renamed from: c */
    public final String f22036c = "wappaygw.alipay.com/service/rest.htm";

    /* renamed from: d */
    public final String f22037d = "mclient.alipay.com/service/rest.htm";

    /* renamed from: e */
    public final String f22038e = "mclient.alipay.com/home/exterfaceAssign.htm";

    /* renamed from: f */
    public final String f22039f = "mclient.alipay.com/cashier/mobilepay.htm";

    /* renamed from: g */
    public Map<String, C1213c> f22040g = new HashMap();

    public String getVersion() {
        return C1287a.f22143g;
    }

    /* renamed from: com.alipay.sdk.app.PayTask$c */
    /* loaded from: classes2.dex */
    public class C1213c {

        /* renamed from: a */
        public String f22046a;

        /* renamed from: b */
        public String f22047b;

        /* renamed from: c */
        public String f22048c;

        /* renamed from: d */
        public String f22049d;

        static {
            Covode.recordClassIndex(4711);
        }

        /* renamed from: a */
        public String m19437a() {
            return this.f22048c;
        }

        /* renamed from: b */
        public String m19435b() {
            return this.f22046a;
        }

        /* renamed from: c */
        public String m19433c() {
            return this.f22047b;
        }

        /* renamed from: d */
        public String m19431d() {
            return this.f22049d;
        }

        /* renamed from: a */
        public void m19436a(String str) {
            this.f22048c = str;
        }

        /* renamed from: b */
        public void m19434b(String str) {
            this.f22046a = str;
        }

        /* renamed from: c */
        public void m19432c(String str) {
            this.f22047b = str;
        }

        /* renamed from: d */
        public void m19430d(String str) {
            this.f22049d = str;
        }

        public C1213c() {
            this.f22046a = "";
            this.f22047b = "";
            this.f22048c = "";
            this.f22049d = "";
        }

        public /* synthetic */ C1213c(PayTask payTask, RunnableC1211a runnableC1211a) {
            this();
        }
    }

    /* renamed from: a */
    private synchronized String m19444a(C1376a c1376a, String str, boolean z) {
        String m19442a;
        if (z) {
            showLoading();
        }
        if (str.contains("payment_inst=")) {
            String substring = str.substring(str.indexOf("payment_inst=") + 13);
            int indexOf = substring.indexOf(38);
            if (indexOf > 0) {
                substring = substring.substring(0, indexOf);
            }
            C1294a.m19243a(substring.replaceAll(C1394i.f22426f, "").toLowerCase(Locale.getDefault()).replaceAll("alipay", ""));
        } else {
            C1294a.m19243a("");
        }
        if (str.contains("service=alipay.acquire.mr.ord.createandpay")) {
            C1313a.f22205w = true;
        }
        if (C1313a.f22205w) {
            if (str.startsWith("https://wappaygw.alipay.com/home/exterfaceAssign.htm?")) {
                str = str.substring(str.indexOf("https://wappaygw.alipay.com/home/exterfaceAssign.htm?") + 53);
            } else if (str.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm?")) {
                str = str.substring(str.indexOf("https://mclient.alipay.com/home/exterfaceAssign.htm?") + 52);
            }
        }
        C1385e.m18862d("mspl", "pay prepared: " + str);
        m19442a = m19442a(str, c1376a);
        C1385e.m18862d("mspl", "pay raw result: " + m19442a);
        C1394i.m18835a(c1376a, this.f22034a.getApplicationContext(), m19442a);
        StringBuilder sb = new StringBuilder();
        sb.append(SystemClock.elapsedRealtime());
        C1301a.m19216a(c1376a, "biz", "PgReturn", sb.toString());
        C1301a.m19216a(c1376a, "biz", "PgReturnV", C1397l.m18822a(m19442a, "resultStatus") + "|" + C1397l.m18822a(m19442a, "memo"));
        if (!C1328a.m19107z().m19115r()) {
            C1328a.m19107z().m19136a(c1376a, this.f22034a.getApplicationContext(), false, 3);
        }
        dismissLoading();
        C1301a.m19212b(this.f22034a.getApplicationContext(), c1376a, str, c1376a.f22367d);
        C1385e.m18862d("mspl", "pay returning: " + m19442a);
        return m19442a;
    }

    /* renamed from: a */
    private boolean m19439a(boolean z, boolean z2, String str, StringBuilder sb, Map<String, String> map, String... strArr) {
        String str2;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str2 = "";
                break;
            }
            String str3 = strArr[i];
            if (!TextUtils.isEmpty(map.get(str3))) {
                str2 = map.get(str3);
                break;
            }
            i++;
        }
        if (TextUtils.isEmpty(str2)) {
            return !z2;
        } else if (z) {
            sb.append("&");
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append(C1394i.f22426f);
            return true;
        } else {
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append(C1394i.f22426f);
            return true;
        }
    }

    /* renamed from: a */
    private String m19440a(String str, Map<String, String> map) {
        boolean equals = "9000".equals(map.get("resultStatus"));
        String str2 = map.get("result");
        C1213c remove = this.f22040g.remove(str);
        String[] strArr = new String[2];
        strArr[0] = remove != null ? remove.m19437a() : "";
        strArr[1] = remove != null ? remove.m19431d() : "";
        m19438a(strArr);
        if (map.containsKey("callBackUrl")) {
            return map.get("callBackUrl");
        }
        if (str2.length() > 15) {
            String m19438a = m19438a(C1399n.m18795a("&callBackUrl=\"", C1394i.f22426f, str2), C1399n.m18795a("&call_back_url=\"", C1394i.f22426f, str2), C1399n.m18795a("&return_url=\"", C1394i.f22426f, str2), URLDecoder.decode(C1399n.m18795a("&return_url=", "&", str2), "utf-8"), URLDecoder.decode(C1399n.m18795a("&callBackUrl=", "&", str2), "utf-8"), C1399n.m18795a("call_back_url=\"", C1394i.f22426f, str2));
            if (!TextUtils.isEmpty(m19438a)) {
                return m19438a;
            }
        }
        if (remove == null) {
            return "";
        }
        String m19435b = equals ? remove.m19435b() : remove.m19433c();
        return !TextUtils.isEmpty(m19435b) ? m19435b : C1328a.m19107z().m19116q();
    }

    /* renamed from: a */
    private String m19442a(String str, C1376a c1376a) {
        String m18940a = c1376a.m18940a(str);
        if (m18940a.contains("paymethod=\"expressGateway\"")) {
            return m19446a(c1376a, m18940a);
        }
        List<C1328a.C1330b> m19121l = C1328a.m19107z().m19121l();
        if (!C1328a.m19107z().f22239g || m19121l == null) {
            m19121l = C1294a.f22165d;
        }
        if (C1399n.m18805a(c1376a, (Context) this.f22034a, m19121l, true)) {
            C1388h c1388h = new C1388h(this.f22034a, c1376a, m19451a());
            C1385e.m18862d("mspl", "pay inner started: " + m18940a);
            String m18847a = c1388h.m18847a(m18940a, false);
            if (!TextUtils.isEmpty(m18847a)) {
                if (m18847a.contains("resultStatus={" + EnumC1296c.ACTIVITY_NOT_START_EXIT.m19230b() + "}")) {
                    C1399n.m18796a("alipaySdk", "startActivityEx", this.f22034a, c1376a);
                    if (C1328a.m19107z().m19110w()) {
                        m18847a = c1388h.m18847a(m18940a, true);
                    } else {
                        m18847a = m18847a.replace("resultStatus={" + EnumC1296c.ACTIVITY_NOT_START_EXIT.m19230b() + "}", "resultStatus={" + EnumC1296c.CANCELED.m19230b() + "}");
                    }
                }
            }
            C1385e.m18862d("mspl", "pay inner raw result: " + m18847a);
            c1388h.m18857a();
            if (!TextUtils.equals(m18847a, "failed") && !TextUtils.equals(m18847a, "scheme_failed")) {
                if (TextUtils.isEmpty(m18847a)) {
                    return C1295b.m19241a();
                }
                if (!m18847a.contains("{\"isLogin\":\"false\"}")) {
                    return m18847a;
                }
                C1301a.m19217a(c1376a, "biz", "LogHkLoginByIntent");
                return m19445a(c1376a, m18940a, m19121l, m18847a, this.f22034a);
            }
            C1301a.m19217a(c1376a, "biz", "LogBindCalledH5");
            return m19446a(c1376a, m18940a);
        }
        C1301a.m19217a(c1376a, "biz", "LogCalledH5");
        return m19446a(c1376a, m18940a);
    }

    /* renamed from: a */
    private void m19443a(C1376a c1376a, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("tid");
            String optString2 = jSONObject.optString("client_key");
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
                return;
            }
            C1379a.m18912a(C1378b.m18915d().m18917b()).m18911a(optString, optString2);
        } catch (Throwable th) {
            C1301a.m19215a(c1376a, "biz", "ParserTidClientKeyEx", th);
        }
    }

    /* renamed from: com.alipay.sdk.app.PayTask$b */
    /* loaded from: classes2.dex */
    public class C1212b implements C1388h.AbstractC1393e {
        static {
            Covode.recordClassIndex(4710);
        }

        @Override // com.alipay.sdk.p082m.p121u.C1388h.AbstractC1393e
        /* renamed from: b */
        public void mo18837b() {
        }

        @Override // com.alipay.sdk.p082m.p121u.C1388h.AbstractC1393e
        /* renamed from: a */
        public void mo18838a() {
            PayTask.this.dismissLoading();
        }

        public C1212b() {
        }
    }

    /* renamed from: a */
    private C1388h.AbstractC1393e m19451a() {
        return new C1212b();
    }

    public void showLoading() {
        C1417a c1417a = this.f22035b;
        if (c1417a != null) {
            c1417a.m18736d();
        }
    }

    static {
        Covode.recordClassIndex(4708);
    }

    public void dismissLoading() {
        C1417a c1417a = this.f22035b;
        if (c1417a != null) {
            c1417a.m18745a();
            this.f22035b = null;
        }
    }

    public synchronized String fetchTradeToken() {
        return C1394i.m18836a(new C1376a(this.f22034a, "", "fetchTradeToken"), this.f22034a.getApplicationContext());
    }

    /* renamed from: com.alipay.sdk.app.PayTask$a */
    /* loaded from: classes2.dex */
    public class RunnableC1211a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f22041a;

        /* renamed from: b */
        public final /* synthetic */ boolean f22042b;

        /* renamed from: c */
        public final /* synthetic */ H5PayCallback f22043c;

        static {
            Covode.recordClassIndex(4709);
        }

        @Override // java.lang.Runnable
        public void run() {
            H5PayResultModel h5Pay = PayTask.this.h5Pay(new C1376a(PayTask.this.f22034a, this.f22041a, "payInterceptorWithUrl"), this.f22041a, this.f22042b);
            C1385e.m18862d("mspl", C0002O.m25086C("inc finished: ", h5Pay.getResultCode()));
            this.f22043c.onPayResult(h5Pay);
        }

        public RunnableC1211a(String str, boolean z, H5PayCallback h5PayCallback) {
            this.f22041a = str;
            this.f22042b = z;
            this.f22043c = h5PayCallback;
        }
    }

    public PayTask(Activity activity) {
        this.f22034a = activity;
        C1378b.m18915d().m18918a(this.f22034a);
        this.f22035b = new C1417a(activity, "去支付宝付款");
    }

    /* renamed from: a */
    public static final String m19438a(String... strArr) {
        if (strArr == null) {
            return "";
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051 A[Catch: all -> 0x005b, TryCatch #2 {all -> 0x005b, blocks: (B:9:0x001e, B:11:0x0044, B:13:0x0051, B:14:0x0056), top: B:8:0x001e }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m19450a(android.content.Context r7) {
        /*
            java.lang.String r4 = "sc"
            java.lang.String r6 = ""
            android.content.pm.PackageManager r2 = r7.getPackageManager()     // Catch: java.lang.Exception -> L18
            java.lang.String r1 = r7.getPackageName()     // Catch: java.lang.Exception -> L18
            r0 = 0
            android.content.pm.PackageInfo r0 = r2.getPackageInfo(r1, r0)     // Catch: java.lang.Exception -> L18
            java.lang.String r5 = r0.versionName     // Catch: java.lang.Exception -> L18
            java.lang.String r2 = r0.packageName     // Catch: java.lang.Exception -> L16
            goto L1e
        L16:
            r0 = move-exception
            goto L1a
        L18:
            r0 = move-exception
            r5 = r6
        L1a:
            com.alipay.sdk.p082m.p121u.C1385e.m18866a(r0)
            r2 = r6
        L1e:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5b
            r3.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = "appkey"
            java.lang.String r0 = "2014052600006128"
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = "ty"
            java.lang.String r0 = "and_lite"
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = "sv"
            java.lang.String r0 = "h.a.3.8.10"
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = "an"
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = "av"
            r3.put(r0, r5)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = "sdk_start_time"
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5b
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> L5b
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L56
            java.lang.String r0 = "h5tonative"
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> L5b
        L56:
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L5b
            return r0
        L5b:
            r0 = move-exception
            com.alipay.sdk.p082m.p121u.C1385e.m18866a(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.PayTask.m19450a(android.content.Context):java.lang.String");
    }

    public static synchronized boolean fetchSdkConfig(Context context) {
        synchronized (PayTask.class) {
            try {
                C1378b.m18915d().m18918a(context);
                long elapsedRealtime = SystemClock.elapsedRealtime() / 1000;
                if (elapsedRealtime - f22033i < C1328a.m19107z().m19129d()) {
                    return false;
                }
                f22033i = elapsedRealtime;
                C1328a.m19107z().m19136a(C1376a.m18925f(), context.getApplicationContext(), false, 4);
                return true;
            } catch (Exception e) {
                C1385e.m18866a(e);
                return false;
            }
        }
    }

    public synchronized String fetchOrderInfoFromH5PayUrl(String str) {
        String str2;
        String str3;
        String str4;
        try {
            if (!TextUtils.isEmpty(str)) {
                String trim = str.trim();
                if (trim.startsWith("https://wappaygw.alipay.com/service/rest.htm") || trim.startsWith("http://wappaygw.alipay.com/service/rest.htm")) {
                    String trim2 = trim.replaceFirst("(http|https)://wappaygw.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(trim2)) {
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + C1399n.m18795a("<request_token>", "</request_token>", C1399n.m18784b(trim2).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + m19450a(this.f22034a) + C1394i.f22426f;
                    }
                }
                if (trim.startsWith("https://mclient.alipay.com/service/rest.htm") || trim.startsWith("http://mclient.alipay.com/service/rest.htm")) {
                    String trim3 = trim.replaceFirst("(http|https)://mclient.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(trim3)) {
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + C1399n.m18795a("<request_token>", "</request_token>", C1399n.m18784b(trim3).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + m19450a(this.f22034a) + C1394i.f22426f;
                    }
                }
                if ((trim.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm") || trim.startsWith("http://mclient.alipay.com/home/exterfaceAssign.htm")) && ((trim.contains("alipay.wap.create.direct.pay.by.user") || trim.contains("create_forex_trade_wap")) && !TextUtils.isEmpty(trim.replaceFirst("(http|https)://mclient.alipay.com/home/exterfaceAssign.htm\\?", "").trim()))) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(PushConstants.WEB_URL, str);
                    jSONObject.put("bizcontext", m19450a(this.f22034a));
                    return "new_external_info==" + jSONObject.toString();
                }
                if (C116971W2r.LIZJ("^(http|https)://(maliprod\\.alipay\\.com/w/trade_pay\\.do.?|mali\\.alipay\\.com/w/trade_pay\\.do.?|mclient\\.alipay\\.com/w/trade_pay\\.do.?)").matcher(str).find()) {
                    String m18795a = C1399n.m18795a("?", "", str);
                    if (!TextUtils.isEmpty(m18795a)) {
                        Map<String, String> m18784b = C1399n.m18784b(m18795a);
                        StringBuilder sb = new StringBuilder();
                        if (m19439a(false, true, "trade_no", sb, m18784b, "trade_no", "alipay_trade_no")) {
                            m19439a(true, false, "pay_phase_id", sb, m18784b, "payPhaseId", "pay_phase_id", "out_relation_id");
                            sb.append("&biz_sub_type=\"TRADE\"");
                            sb.append("&biz_type=\"trade\"");
                            String str5 = m18784b.get("app_name");
                            if (TextUtils.isEmpty(str5) && !TextUtils.isEmpty(m18784b.get("cid"))) {
                                str5 = "ali1688";
                            } else if (TextUtils.isEmpty(str5) && (!TextUtils.isEmpty(m18784b.get("sid")) || !TextUtils.isEmpty(m18784b.get("s_id")))) {
                                str5 = "tb";
                            }
                            sb.append("&app_name=\"" + str5 + C1394i.f22426f);
                            if (!m19439a(true, true, "extern_token", sb, m18784b, "extern_token", "cid", "sid", "s_id")) {
                                return "";
                            }
                            m19439a(true, false, "appenv", sb, m18784b, "appenv");
                            sb.append("&pay_channel_id=\"alipay_sdk\"");
                            C1213c c1213c = new C1213c(this, null);
                            c1213c.m19434b(m18784b.get("return_url"));
                            c1213c.m19432c(m18784b.get("show_url"));
                            c1213c.m19436a(m18784b.get("pay_order_id"));
                            String str6 = sb.toString() + "&bizcontext=\"" + m19450a(this.f22034a) + C1394i.f22426f;
                            this.f22040g.put(str6, c1213c);
                            return str6;
                        }
                    }
                }
                if (!trim.startsWith("https://mclient.alipay.com/cashier/mobilepay.htm") && !trim.startsWith("http://mclient.alipay.com/cashier/mobilepay.htm") && (!EnvUtils.isSandBox() || !trim.contains("mobileclientgw.alipaydev.com/cashier/mobilepay.htm"))) {
                    if (C1328a.m19107z().m19125h() && C116971W2r.LIZJ("^https?://(maliprod\\.alipay\\.com|mali\\.alipay\\.com)/batch_payment\\.do\\?").matcher(trim).find()) {
                        Uri parse = Uri.parse(trim);
                        String queryParameter = parse.getQueryParameter("return_url");
                        String queryParameter2 = parse.getQueryParameter("show_url");
                        String queryParameter3 = parse.getQueryParameter("pay_order_id");
                        String m19438a = m19438a(parse.getQueryParameter("trade_nos"), parse.getQueryParameter("alipay_trade_no"));
                        String m19438a2 = m19438a(parse.getQueryParameter("payPhaseId"), parse.getQueryParameter("pay_phase_id"), parse.getQueryParameter("out_relation_id"));
                        String[] strArr = new String[4];
                        strArr[0] = parse.getQueryParameter("app_name");
                        if (!TextUtils.isEmpty(parse.getQueryParameter("cid"))) {
                            str2 = "ali1688";
                        } else {
                            str2 = "";
                        }
                        strArr[1] = str2;
                        if (!TextUtils.isEmpty(parse.getQueryParameter("sid"))) {
                            str3 = "tb";
                        } else {
                            str3 = "";
                        }
                        strArr[2] = str3;
                        if (!TextUtils.isEmpty(parse.getQueryParameter("s_id"))) {
                            str4 = "tb";
                        } else {
                            str4 = "";
                        }
                        strArr[3] = str4;
                        String m19438a3 = m19438a(strArr);
                        String m19438a4 = m19438a(parse.getQueryParameter("extern_token"), parse.getQueryParameter("cid"), parse.getQueryParameter("sid"), parse.getQueryParameter("s_id"));
                        String m19438a5 = m19438a(parse.getQueryParameter("appenv"));
                        if (!TextUtils.isEmpty(m19438a) && !TextUtils.isEmpty(m19438a3) && !TextUtils.isEmpty(m19438a4)) {
                            String format = String.format("trade_no=\"%s\"&pay_phase_id=\"%s\"&biz_type=\"trade\"&biz_sub_type=\"TRADE\"&app_name=\"%s\"&extern_token=\"%s\"&appenv=\"%s\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"%s\"", m19438a, m19438a2, m19438a3, m19438a4, m19438a5, m19450a(this.f22034a));
                            C1213c c1213c2 = new C1213c(this, null);
                            c1213c2.m19434b(queryParameter);
                            c1213c2.m19432c(queryParameter2);
                            c1213c2.m19436a(queryParameter3);
                            c1213c2.m19430d(m19438a);
                            this.f22040g.put(format, c1213c2);
                            return format;
                        }
                    }
                } else {
                    String m19450a = m19450a(this.f22034a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(PushConstants.WEB_URL, trim);
                    jSONObject2.put("bizcontext", m19450a);
                    return String.format("new_external_info==%s", jSONObject2.toString());
                }
            }
        } catch (Throwable th) {
            C1385e.m18866a(th);
        }
        return "";
    }

    /* renamed from: a */
    private String m19441a(String str, String str2) {
        new StringBuilder();
        String m25086C = C0002O.m25086C(str2, "={");
        return str.substring(str.indexOf(m25086C) + m25086C.length(), str.lastIndexOf("}"));
    }

    public synchronized String pay(String str, boolean z) {
        if (C1382b.m18880a()) {
            return C1295b.m19237b();
        }
        return m19444a(new C1376a(this.f22034a, str, "pay"), str, z);
    }

    public synchronized Map<String, String> payV2(String str, boolean z) {
        C1376a c1376a;
        String m19444a;
        if (C1382b.m18880a()) {
            m19444a = C1295b.m19237b();
            c1376a = null;
        } else {
            c1376a = new C1376a(this.f22034a, str, "payV2");
            m19444a = m19444a(c1376a, str, z);
        }
        return C1397l.m18824a(c1376a, m19444a);
    }

    /* renamed from: a */
    private String m19448a(C1376a c1376a, C1371b c1371b) {
        String[] m18957c = c1371b.m18957c();
        Intent intent = new Intent(this.f22034a, H5PayActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(PushConstants.WEB_URL, m18957c[0]);
        if (m18957c.length == 2) {
            bundle.putString("cookie", m18957c[1]);
        }
        intent.putExtras(bundle);
        C1376a.C1377a.m18922a(c1376a, intent);
        C116971W2r.LIZIZ(this.f22034a, intent);
        synchronized (f22032h) {
            try {
                f22032h.wait();
            } catch (InterruptedException e) {
                C1385e.m18866a(e);
                return C1295b.m19241a();
            }
        }
        String m19235d = C1295b.m19235d();
        if (TextUtils.isEmpty(m19235d)) {
            return C1295b.m19241a();
        }
        return m19235d;
    }

    /* renamed from: a */
    private String m19446a(C1376a c1376a, String str) {
        showLoading();
        EnumC1296c enumC1296c = null;
        try {
            try {
                JSONObject m19019c = new C1366f().mo18977a(c1376a, this.f22034a.getApplicationContext(), str).m19019c();
                String optString = m19019c.optString("end_code", null);
                List<C1371b> m18960a = C1371b.m18960a(m19019c.optJSONObject("form").optJSONObject("onload"));
                for (int i = 0; i < m18960a.size(); i++) {
                    if (m18960a.get(i).m18963a() == EnumC1370a.Update) {
                        C1371b.m18962a(m18960a.get(i));
                    }
                }
                m19443a(c1376a, m19019c);
                dismissLoading();
                C1301a.m19218a(this.f22034a, c1376a, str, c1376a.f22367d);
                for (int i2 = 0; i2 < m18960a.size(); i2++) {
                    C1371b c1371b = m18960a.get(i2);
                    if (c1371b.m18963a() == EnumC1370a.WapPay) {
                        String m19448a = m19448a(c1376a, c1371b);
                        dismissLoading();
                        C1301a.m19218a(this.f22034a, c1376a, str, c1376a.f22367d);
                        return m19448a;
                    } else if (c1371b.m18963a() == EnumC1370a.OpenWeb) {
                        String m19447a = m19447a(c1376a, c1371b, optString);
                        dismissLoading();
                        C1301a.m19218a(this.f22034a, c1376a, str, c1376a.f22367d);
                        return m19447a;
                    }
                }
                dismissLoading();
                C1301a.m19218a(this.f22034a, c1376a, str, c1376a.f22367d);
            } catch (IOException e) {
                enumC1296c = EnumC1296c.m19229b(EnumC1296c.NETWORK_ERROR.m19230b());
                C1301a.m19213a(c1376a, "net", e);
                dismissLoading();
                C1301a.m19218a(this.f22034a, c1376a, str, c1376a.f22367d);
            }
            if (enumC1296c == null) {
                enumC1296c = EnumC1296c.m19229b(EnumC1296c.FAILED.m19230b());
            }
            return C1295b.m19240a(enumC1296c.m19230b(), enumC1296c.m19233a(), "");
        }
    }

    public synchronized boolean payInterceptorWithUrl(String str, boolean z, H5PayCallback h5PayCallback) {
        String fetchOrderInfoFromH5PayUrl;
        fetchOrderInfoFromH5PayUrl = fetchOrderInfoFromH5PayUrl(str);
        if (!TextUtils.isEmpty(fetchOrderInfoFromH5PayUrl)) {
            C1385e.m18862d("mspl", C0002O.m25086C("intercepted: ", fetchOrderInfoFromH5PayUrl));
            new Thread(new RunnableC1211a(fetchOrderInfoFromH5PayUrl, z, h5PayCallback)).start();
        }
        return !TextUtils.isEmpty(fetchOrderInfoFromH5PayUrl);
    }

    public synchronized H5PayResultModel h5Pay(C1376a c1376a, String str, boolean z) {
        H5PayResultModel h5PayResultModel;
        h5PayResultModel = new H5PayResultModel();
        String[] split = m19444a(c1376a, str, z).split(";");
        HashMap hashMap = new HashMap();
        for (String str2 : split) {
            int indexOf = str2.indexOf("={");
            if (indexOf >= 0) {
                String substring = str2.substring(0, indexOf);
                hashMap.put(substring, m19441a(str2, substring));
            }
        }
        if (hashMap.containsKey("resultStatus")) {
            h5PayResultModel.setResultCode(hashMap.get("resultStatus"));
        }
        h5PayResultModel.setReturnUrl(m19440a(str, hashMap));
        if (TextUtils.isEmpty(h5PayResultModel.getReturnUrl())) {
            C1301a.m19211b(c1376a, "biz", "H5CbUrlEmpty", "");
        }
        return h5PayResultModel;
    }

    /* renamed from: a */
    private String m19447a(C1376a c1376a, C1371b c1371b, String str) {
        boolean m19236c;
        String m19235d;
        String m19240a;
        String[] m18957c = c1371b.m18957c();
        Intent intent = new Intent(this.f22034a, H5PayActivity.class);
        try {
            JSONObject m18762h = C1399n.m18762h(new String(C1333a.m19083a(m18957c[2])));
            intent.putExtra(PushConstants.WEB_URL, m18957c[0]);
            intent.putExtra("title", m18957c[1]);
            intent.putExtra("version", "v2");
            intent.putExtra(PushConstants.MZ_PUSH_MESSAGE_METHOD, m18762h.optString(PushConstants.MZ_PUSH_MESSAGE_METHOD, "POST"));
            C1295b.m19238a(false);
            C1295b.m19239a((String) null);
            C1376a.C1377a.m18922a(c1376a, intent);
            C116971W2r.LIZIZ(this.f22034a, intent);
            synchronized (f22032h) {
                try {
                    f22032h.wait();
                    m19236c = C1295b.m19236c();
                    m19235d = C1295b.m19235d();
                    C1295b.m19238a(false);
                    C1295b.m19239a((String) null);
                } catch (InterruptedException e) {
                    C1385e.m18866a(e);
                    return C1295b.m19241a();
                }
            }
            if (m19236c) {
                try {
                    List<C1371b> m18960a = C1371b.m18960a(C1399n.m18762h(new String(C1333a.m19083a(m19235d))));
                    for (int i = 0; i < m18960a.size(); i++) {
                        C1371b c1371b2 = m18960a.get(i);
                        if (c1371b2.m18963a() == EnumC1370a.SetResult) {
                            String[] m18957c2 = c1371b2.m18957c();
                            m19240a = C1295b.m19240a(Integer.valueOf(m18957c2[1]).intValue(), m18957c2[0], C1399n.m18772e(c1376a, m18957c2[2]));
                            break;
                        }
                    }
                } catch (Throwable th) {
                    C1385e.m18866a(th);
                    C1301a.m19214a(c1376a, "biz", "H5PayDataAnalysisError", th, m19235d);
                }
            }
            m19240a = "";
            if (TextUtils.isEmpty(m19240a)) {
                try {
                    return C1295b.m19240a(Integer.valueOf(str).intValue(), "", "");
                } catch (Throwable th2) {
                    C1301a.m19214a(c1376a, "biz", "H5PayDataAnalysisError", th2, C0002O.m25086C("endCode: ", str));
                    return C1295b.m19240a(8000, "", "");
                }
            }
            return m19240a;
        } catch (Throwable th3) {
            C1385e.m18866a(th3);
            C1301a.m19214a(c1376a, "biz", "H5PayDataAnalysisError", th3, Arrays.toString(m18957c));
            return C1295b.m19241a();
        }
    }

    /* renamed from: a */
    public static String m19445a(C1376a c1376a, String str, List<C1328a.C1330b> list, String str2, Activity activity) {
        C1399n.C1402c m18806a = C1399n.m18806a(c1376a, activity, list);
        if (m18806a != null && !m18806a.m18758a(c1376a) && !m18806a.m18759a() && TextUtils.equals(m18806a.f22435a.packageName, "hk.alipay.wallet")) {
            C1385e.m18865b("mspl", "PayTask not_login");
            String valueOf = String.valueOf(str.hashCode());
            PayResultActivity.f22025c.put(valueOf, new Object());
            Intent intent = new Intent(activity, PayResultActivity.class);
            intent.putExtra(PayResultActivity.f22026f, str);
            intent.putExtra(PayResultActivity.f22027g, activity.getPackageName());
            intent.putExtra("phonecashier.pay.hash", valueOf);
            C1376a.C1377a.m18922a(c1376a, intent);
            C116971W2r.LIZIZ(activity, intent);
            synchronized (PayResultActivity.f22025c.get(valueOf)) {
                try {
                    C1385e.m18865b("mspl", "PayTask wait");
                    PayResultActivity.f22025c.get(valueOf).wait();
                } catch (InterruptedException unused) {
                    C1385e.m18865b("mspl", "PayTask interrupted");
                    return C1295b.m19241a();
                }
            }
            String str3 = PayResultActivity.C1210b.f22031b;
            C1385e.m18865b("mspl", C0002O.m25086C("PayTask ret: ", str3));
            return str3;
        }
        return str2;
    }
}
