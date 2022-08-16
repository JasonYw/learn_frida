package com.alipay.sdk.p082m.p103k;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.p082m.p099i.C1287a;
import com.alipay.sdk.p082m.p103k.C1301a;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.alipay.sdk.p082m.p119s.C1378b;
import com.alipay.sdk.p082m.p120t.C1379a;
import com.alipay.sdk.p082m.p121u.C1383c;
import com.alipay.sdk.p082m.p121u.C1385e;
import com.alipay.sdk.p082m.p121u.C1394i;
import com.alipay.sdk.p082m.p121u.C1399n;
import com.alipay.sdk.p082m.p122w.C1405b;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: com.alipay.sdk.m.k.b */
/* loaded from: classes2.dex */
public class C1309b {

    /* renamed from: a */
    public String f22190a;

    /* renamed from: b */
    public String f22191b;

    /* renamed from: c */
    public String f22192c;

    /* renamed from: d */
    public String f22193d;

    /* renamed from: e */
    public String f22194e;

    /* renamed from: f */
    public String f22195f;

    /* renamed from: g */
    public String f22196g;

    /* renamed from: h */
    public String f22197h = "";

    /* renamed from: i */
    public String f22198i = "";

    /* renamed from: j */
    public String f22199j;

    static {
        Covode.recordClassIndex(4809);
    }

    /* renamed from: a */
    public void m19188a(String str, String str2, Throwable th, String str3) {
        String m19187a = m19187a(th);
        new StringBuilder();
        m19177d(str, str2, C0002O.m25085C(str3, ": ", m19187a));
    }

    /* renamed from: d */
    private boolean m19179d() {
        return TextUtils.isEmpty(this.f22198i);
    }

    /* renamed from: e */
    public static String m19176e() {
        try {
            return UUID.randomUUID().toString();
        } catch (Throwable unused) {
            return "12345678uuid";
        }
    }

    /* renamed from: c */
    public static String m19182c() {
        return new SimpleDateFormat("HH:mm:ss:SSS", Locale.getDefault()).format(new Date());
    }

    /* renamed from: a */
    public static String m19196a() {
        return String.format("%s,%s,-,-,-", m19181c(C1379a.m18912a(C1378b.m18915d().m18917b()).m18905d()), m19181c(C1378b.m18915d().m18916c()));
    }

    /* renamed from: b */
    public static String m19186b() {
        return String.format("%s,%s", m19176e(), new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date()));
    }

    /* renamed from: d */
    public static String m19178d(String str) {
        if (TextUtils.isEmpty(str)) {
            return Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
        return str;
    }

    /* renamed from: a */
    public static String m19195a(long j) {
        String m19181c = m19181c(C1287a.f22143g);
        String m19181c2 = m19181c("h.a.3.8.10");
        return String.format("android,3,%s,%s,com.alipay.mcpay,5.0,-,%s,-", m19181c, m19181c2, Constants.WAVE_SEPARATOR + j);
    }

    /* renamed from: b */
    public static String m19185b(Context context) {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,-", m19181c(C1383c.m18874c(context)), "android", m19181c(Build.VERSION.RELEASE), m19181c(Build.MODEL), Constants.ACCEPT_TIME_SEPARATOR_SERVER, "0", m19181c(C1383c.m18872d(context).m18858b()), "gw", m19181c(C1405b.m18750b(null, context)));
    }

    /* renamed from: c */
    public static String m19181c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.replace("[", "【").replace("]", "】").replace("(", "（").replace(")", "）").replace(Constants.ACCEPT_TIME_SEPARATOR_SP, "，").replace("^", Constants.WAVE_SEPARATOR).replace("#", "＃");
    }

    /* renamed from: a */
    public static String m19194a(Context context) {
        String packageName;
        String str = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                packageName = applicationContext.getPackageName();
                try {
                    PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 64);
                    String str2 = packageInfo.versionName;
                    String m19193a = m19193a(packageInfo);
                    new StringBuilder();
                    str = C0002O.m25085C(str2, "|", m19193a);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
            return String.format("%s,%s,-,-,-", m19181c(packageName), m19181c(str));
        }
        packageName = str;
        return String.format("%s,%s,-,-,-", m19181c(packageName), m19181c(str));
    }

    /* renamed from: b */
    public static String m19184b(String str) {
        String str2;
        String str3;
        if (str == null) {
            str = "";
        }
        String[] split = str.split("&");
        String str4 = null;
        if (split != null) {
            str2 = null;
            str3 = null;
            for (String str5 : split) {
                String[] split2 = str5.split("=");
                if (split2 != null && split2.length == 2) {
                    if (split2[0].equalsIgnoreCase("partner")) {
                        str4 = split2[1].replace(C1394i.f22426f, "");
                    } else if (split2[0].equalsIgnoreCase("out_trade_no")) {
                        str2 = split2[1].replace(C1394i.f22426f, "");
                    } else if (split2[0].equalsIgnoreCase("trade_no")) {
                        str3 = split2[1].replace(C1394i.f22426f, "");
                    } else if (split2[0].equalsIgnoreCase("biz_content")) {
                        try {
                            JSONObject jSONObject = new JSONObject(C1399n.m18772e(C1376a.m18925f(), split2[1]));
                            if (TextUtils.isEmpty(str2)) {
                                str2 = jSONObject.getString("out_trade_no");
                            }
                        } catch (Throwable unused) {
                        }
                    } else if (split2[0].equalsIgnoreCase(Constants.APP_ID) && TextUtils.isEmpty(str4)) {
                        str4 = split2[1];
                    }
                }
            }
        } else {
            str2 = null;
            str3 = null;
        }
        return String.format("%s,%s,-,%s,-,-,-", m19181c(str3), m19181c(str2), m19181c(str4));
    }

    /* renamed from: a */
    public static String m19193a(PackageInfo packageInfo) {
        Signature[] signatureArr;
        String str;
        String m18801a;
        if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length != 0) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(packageInfo.signatures.length);
                for (Signature signature : packageInfo.signatures) {
                    try {
                        m18801a = C1399n.m18801a((C1376a) null, signature.toByteArray());
                    } catch (Throwable unused) {
                    }
                    if (!TextUtils.isEmpty(m18801a)) {
                        str = C1399n.m18765g(m18801a).substring(0, 8);
                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                        sb.append(str);
                    }
                    str = "?";
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                    sb.append(str);
                }
                return sb.toString();
            } catch (Throwable unused2) {
                return "?";
            }
        }
        return "0";
    }

    /* renamed from: a */
    public static String m19187a(Throwable th) {
        if (th == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append(th.getClass().getName());
            stringBuffer.append(Constants.COLON_SEPARATOR);
            stringBuffer.append(th.getMessage());
            stringBuffer.append(" 》 ");
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                int i = 0;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stringBuffer.append(stackTraceElement.toString());
                    stringBuffer.append(" 》 ");
                    i++;
                    if (i > 5) {
                        break;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public String m19192a(String str) {
        String m19184b = m19184b(str);
        this.f22191b = m19184b;
        return String.format("[(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s)]", this.f22190a, m19184b, this.f22192c, this.f22193d, this.f22194e, this.f22195f, this.f22196g, m19178d(this.f22197h), m19178d(this.f22198i), this.f22199j);
    }

    /* renamed from: a */
    public void m19191a(String str, String str2) {
        m19180c("", str, str2);
    }

    public C1309b(Context context, boolean z) {
        long m19197a;
        context = context != null ? context.getApplicationContext() : context;
        this.f22190a = m19186b();
        this.f22192c = m19194a(context);
        if (z) {
            m19197a = 0;
        } else {
            m19197a = C1301a.C1308e.m19197a(context);
        }
        this.f22193d = m19195a(m19197a);
        this.f22194e = m19196a();
        this.f22195f = m19185b(context);
        this.f22196g = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        this.f22199j = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    }

    /* renamed from: b */
    public void m19183b(String str, String str2, String str3) {
        m19177d(str, str2, str3);
    }

    /* renamed from: a */
    public void m19189a(String str, String str2, Throwable th) {
        m19177d(str, str2, m19187a(th));
    }

    /* renamed from: a */
    public void m19190a(String str, String str2, String str3) {
        new StringBuilder();
        m19180c("", str, C0002O.m25085C(str2, "|", str3));
    }

    /* renamed from: d */
    private synchronized void m19177d(String str, String str2, String str3) {
        String m19181c;
        C1385e.m18863c("mspl", String.format("err %s %s %s", str, str2, str3));
        String str4 = "";
        if (!TextUtils.isEmpty(this.f22198i)) {
            new StringBuilder();
            str4 = C0002O.m25086C(str4, "^");
        }
        new StringBuilder();
        Object[] objArr = new Object[4];
        objArr[0] = str;
        objArr[1] = str2;
        if (TextUtils.isEmpty(str3)) {
            m19181c = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        } else {
            m19181c = m19181c(str3);
        }
        objArr[2] = m19181c;
        objArr[3] = m19181c(m19182c());
        String m25086C = C0002O.m25086C(str4, String.format("%s,%s,%s,%s", objArr));
        new StringBuilder();
        this.f22198i = C0002O.m25086C(this.f22198i, m25086C);
    }

    /* renamed from: c */
    private synchronized void m19180c(String str, String str2, String str3) {
        String m19181c;
        C1385e.m18862d("mspl", String.format("event %s %s %s", str, str2, str3));
        String str4 = "";
        if (!TextUtils.isEmpty(this.f22197h)) {
            new StringBuilder();
            str4 = C0002O.m25086C(str4, "^");
        }
        new StringBuilder();
        Object[] objArr = new Object[4];
        if (TextUtils.isEmpty(str)) {
            m19181c = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        } else {
            m19181c = m19181c(str);
        }
        objArr[0] = m19181c;
        objArr[1] = m19181c(str2);
        objArr[2] = m19181c(str3);
        objArr[3] = m19181c(m19182c());
        String m25086C = C0002O.m25086C(str4, String.format("%s,%s,%s,-,-,-,-,-,-,-,-,-,-,%s", objArr));
        new StringBuilder();
        this.f22197h = C0002O.m25086C(this.f22197h, m25086C);
    }
}
