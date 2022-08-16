package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.p082m.p101j.C1294a;
import com.alipay.sdk.p082m.p103k.C1301a;
import com.alipay.sdk.p082m.p107m.C1328a;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.alipay.sdk.p082m.p119s.C1378b;
import com.alipay.sdk.p082m.p121u.C1385e;
import com.alipay.sdk.p082m.p121u.C1399n;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bridge.p1355js.delegate.JsBridgeDelegate;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.message.proguard.C34037f;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C116971W2r;
import p003X.TFG;

/* loaded from: classes2.dex */
public final class OpenAuthTask {

    /* renamed from: e */
    public static final Map<String, Callback> f22013e = new ConcurrentHashMap();

    /* renamed from: f */
    public static long f22014f = -1;

    /* renamed from: g */
    public static final int f22015g = 122;

    /* renamed from: b */
    public final Activity f22017b;

    /* renamed from: c */
    public Callback f22018c;

    /* renamed from: a */
    public volatile boolean f22016a = false;

    /* renamed from: d */
    public final Handler f22019d = new Handler(Looper.getMainLooper());

    /* loaded from: classes2.dex */
    public interface Callback {
        static {
            Covode.recordClassIndex(4702);
        }

        void onResult(int i, String str, Bundle bundle);
    }

    /* renamed from: com.alipay.sdk.app.OpenAuthTask$b */
    /* loaded from: classes2.dex */
    public final class RunnableC1208b implements Runnable {

        /* renamed from: a */
        public final int f22021a;

        /* renamed from: b */
        public final String f22022b;

        /* renamed from: c */
        public final Bundle f22023c;

        static {
            Covode.recordClassIndex(4704);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (OpenAuthTask.this.f22018c != null) {
                OpenAuthTask.this.f22018c.onResult(this.f22021a, this.f22022b, this.f22023c);
            }
        }

        public RunnableC1208b(int i, String str, Bundle bundle) {
            this.f22021a = i;
            this.f22022b = str;
            this.f22023c = bundle;
        }

        public /* synthetic */ RunnableC1208b(OpenAuthTask openAuthTask, int i, String str, Bundle bundle, C1207a c1207a) {
            this(i, str, bundle);
        }
    }

    static {
        Covode.recordClassIndex(4700);
    }

    /* loaded from: classes2.dex */
    public enum BizType {
        Invoice("20000920"),
        AccountAuth("20000067"),
        Deduct("60000157");
        
        public String appId;

        static {
            Covode.recordClassIndex(4701);
        }

        BizType(String str) {
            this.appId = str;
        }
    }

    /* renamed from: com.alipay.sdk.app.OpenAuthTask$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C1207a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22020a;

        static {
            Covode.recordClassIndex(4703);
            int[] iArr = new int[BizType.values().length];
            f22020a = iArr;
            try {
                iArr[BizType.Deduct.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22020a[BizType.AccountAuth.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22020a[BizType.Invoice.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public OpenAuthTask(Activity activity) {
        this.f22017b = activity;
        C1378b.m18915d().m18918a(activity);
    }

    /* renamed from: a */
    private String m19462a(BizType bizType, Map<String, String> map) {
        if (bizType != null) {
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("alipays").authority("platformapi").path("startapp").appendQueryParameter("appId", bizType.appId);
            if (C1207a.f22020a[bizType.ordinal()] == 1) {
                appendQueryParameter.appendQueryParameter("appClearTop", "false").appendQueryParameter("startMultApp", "YES");
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                appendQueryParameter.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            return appendQueryParameter.build().toString();
        }
        throw new RuntimeException("missing bizType");
    }

    /* renamed from: a */
    public static void m19459a(String str, int i, String str2, Bundle bundle) {
        Callback remove = f22013e.remove(str);
        if (remove != null) {
            try {
                remove.onResult(i, str2, bundle);
            } catch (Throwable th) {
                C1385e.m18866a(th);
            }
        }
    }

    /* renamed from: a */
    private String m19463a(long j, String str, BizType bizType, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("startTime", String.valueOf(j));
        jSONObject.put("session", str);
        jSONObject.put("package", this.f22017b.getPackageName());
        if (bizType != null) {
            jSONObject.put("appId", bizType.appId);
        }
        jSONObject.put("sdkVersion", "h.a.3.8.10");
        jSONObject.put("mqpURL", str2);
        return Base64.encodeToString(jSONObject.toString().getBytes(Charset.forName(C34037f.f43302f)), 2);
    }

    public final void execute(String str, BizType bizType, Map<String, String> map, Callback callback, boolean z) {
        Activity activity = this.f22017b;
        String valueOf = String.valueOf(map);
        C1376a c1376a = new C1376a(activity, valueOf, "oa-" + bizType);
        this.f22018c = callback;
        if (m19460a(c1376a, str, bizType, map, z)) {
            C1301a.m19212b(this.f22017b, c1376a, "", c1376a.f22367d);
        }
    }

    /* renamed from: a */
    private boolean m19460a(C1376a c1376a, String str, BizType bizType, Map<String, String> map, boolean z) {
        PackageInfo packageInfo;
        if (this.f22016a) {
            this.f22019d.post(new RunnableC1208b(this, 4000, "该 OpenAuthTask 已在执行", null, null));
            return true;
        }
        this.f22016a = true;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - f22014f <= JsBridgeDelegate.GET_URL_OUT_TIME) {
            this.f22019d.post(new RunnableC1208b(this, TFG.LIZIZ, "3s 内重复支付", null, null));
            return true;
        }
        f22014f = elapsedRealtime;
        C1294a.m19243a("");
        String m18817a = C1399n.m18817a(32);
        HashMap hashMap = new HashMap(map);
        hashMap.put("mqpPkgName", this.f22017b.getPackageName());
        hashMap.put("mqpScene", "sdk");
        List<C1328a.C1330b> m19121l = C1328a.m19107z().m19121l();
        if (!C1328a.m19107z().f22239g || m19121l == null) {
            m19121l = C1294a.f22165d;
        }
        C1399n.C1402c m18806a = C1399n.m18806a(c1376a, this.f22017b, m19121l);
        if (m18806a != null && !m18806a.m18758a(c1376a) && !m18806a.m18759a() && (packageInfo = m18806a.f22435a) != null && packageInfo.versionCode >= 122) {
            try {
                HashMap<String, String> m18941a = C1376a.m18941a(c1376a);
                m18941a.put("ts_scheme", String.valueOf(SystemClock.elapsedRealtime()));
                hashMap.put("mqpLoc", new JSONObject(m18941a).toString());
                String m19462a = m19462a(bizType, hashMap);
                f22013e.put(m18817a, this.f22018c);
                String str2 = null;
                try {
                    str2 = m19463a(elapsedRealtime, m18817a, bizType, m19462a);
                } catch (JSONException e) {
                    C1301a.m19215a(c1376a, "biz", "JSONEx", e);
                }
                if (TextUtils.isEmpty(str2)) {
                    this.f22019d.post(new RunnableC1208b(this, 4000, "参数错误", null, null));
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("alipays").authority("platformapi").path("startapp").appendQueryParameter("appId", "20001129").appendQueryParameter("payload", str2).build());
                intent.addFlags(268435456);
                intent.setPackage(m18806a.f22435a.packageName);
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(elapsedRealtime);
                    C1301a.m19216a(c1376a, "biz", "PgOpenStarting", sb.toString());
                    C1376a.C1377a.m18921a(c1376a, m18817a);
                    C116971W2r.LIZIZ(this.f22017b, intent);
                    return false;
                } catch (Throwable th) {
                    C1301a.m19215a(c1376a, "biz", "StartWalletEx", th);
                    return false;
                }
            }
        } else if (z) {
            hashMap.put("mqpScheme", String.valueOf(str));
            hashMap.put("mqpNotifyName", m18817a);
            hashMap.put("mqpScene", "landing");
            String m19462a2 = m19462a(bizType, hashMap);
            Intent intent2 = new Intent(this.f22017b, H5OpenAuthActivity.class);
            intent2.putExtra(PushConstants.WEB_URL, String.format("https://render.alipay.com/p/s/i?scheme=%s", Uri.encode(m19462a2)));
            C1376a.C1377a.m18922a(c1376a, intent2);
            C116971W2r.LIZIZ(this.f22017b, intent2);
            return false;
        } else {
            this.f22019d.post(new RunnableC1208b(this, 4001, "支付宝未安装或签名错误", null, null));
            return true;
        }
    }
}
