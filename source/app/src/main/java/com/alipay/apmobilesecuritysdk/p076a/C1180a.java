package com.alipay.apmobilesecuritysdk.p076a;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.apmobilesecuritysdk.p077b.C1181a;
import com.alipay.apmobilesecuritysdk.p078c.C1182a;
import com.alipay.apmobilesecuritysdk.p079d.C1189e;
import com.alipay.apmobilesecuritysdk.p080e.C1190a;
import com.alipay.apmobilesecuritysdk.p080e.C1191b;
import com.alipay.apmobilesecuritysdk.p080e.C1192c;
import com.alipay.apmobilesecuritysdk.p080e.C1193d;
import com.alipay.apmobilesecuritysdk.p080e.C1196g;
import com.alipay.apmobilesecuritysdk.p080e.C1197h;
import com.alipay.apmobilesecuritysdk.p080e.C1198i;
import com.alipay.sdk.p082m.p090d0.C1256d;
import com.alipay.sdk.p082m.p094f0.C1273c;
import com.alipay.sdk.p082m.p094f0.C1274d;
import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: com.alipay.apmobilesecuritysdk.a.a */
/* loaded from: classes2.dex */
public final class C1180a {

    /* renamed from: a */
    public Context f21949a;

    /* renamed from: b */
    public C1181a f21950b = C1181a.m19582a();

    /* renamed from: c */
    public int f21951c = 4;

    static {
        Covode.recordClassIndex(4651);
    }

    public C1180a(Context context) {
        this.f21949a = context;
    }

    /* renamed from: a */
    public static String m19588a(Context context) {
        String m19584b = m19584b(context);
        return C1448a.m18665a(m19584b) ? C1197h.m19519f(context) : m19584b;
    }

    /* renamed from: a */
    public static String m19587a(Context context, String str) {
        try {
            m19585b();
            String m19511a = C1198i.m19511a(str);
            if (!C1448a.m18665a(m19511a)) {
                return m19511a;
            }
            String m19534a = C1196g.m19534a(context, str);
            C1198i.m19510a(str, m19534a);
            return !C1448a.m18665a(m19534a) ? m19534a : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static boolean m19589a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String[] strArr = {"2017-01-27 2017-01-28", "2017-11-10 2017-11-11", "2017-12-11 2017-12-12"};
        int random = ((int) (Math.random() * 24.0d * 60.0d * 60.0d)) * 1;
        int i = 0;
        while (true) {
            try {
                String[] split = strArr[i].split(" ");
                if (split != null && split.length == 2) {
                    Date date = new Date();
                    new StringBuilder();
                    Date parse = simpleDateFormat.parse(C0002O.m25086C(split[0], " 00:00:00"));
                    new StringBuilder();
                    Date parse2 = simpleDateFormat.parse(C0002O.m25086C(split[1], " 23:59:59"));
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(parse2);
                    calendar.add(13, random);
                    Date time = calendar.getTime();
                    if (date.after(parse) && date.before(time)) {
                        return true;
                    }
                }
                i++;
                if (i >= 3) {
                    break;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private C1273c m19583b(Map<String, String> map) {
        String str;
        String str2;
        String str3;
        C1191b m19557b;
        C1191b m19555c;
        String str4 = "";
        try {
            Context context = this.f21949a;
            C1274d c1274d = new C1274d();
            String m18662a = C1448a.m18662a(map, "appName", str4);
            String m18662a2 = C1448a.m18662a(map, "sessionId", str4);
            String m18662a3 = C1448a.m18662a(map, "rpcVersion", str4);
            String m19587a = m19587a(context, m18662a);
            String securityToken = UmidSdkWrapper.getSecurityToken(context);
            String m19523d = C1197h.m19523d(context);
            if (C1448a.m18661b(m18662a2)) {
                c1274d.f22121c = m18662a2;
            } else {
                c1274d.f22121c = m19587a;
            }
            c1274d.f22122d = securityToken;
            c1274d.f22123e = m19523d;
            c1274d.f22119a = "android";
            C1192c m19548c = C1193d.m19548c(context);
            if (m19548c != null) {
                str2 = m19548c.f21959a;
                str = m19548c.f21961c;
            } else {
                str = str4;
                str2 = str;
            }
            if (C1448a.m18665a(str2) && (m19555c = C1190a.m19555c(context)) != null) {
                str2 = m19555c.f21956a;
                str = m19555c.f21958c;
            }
            C1192c m19550b = C1193d.m19550b();
            if (m19550b != null) {
                str4 = m19550b.f21959a;
                str3 = m19550b.f21961c;
            } else {
                str3 = str4;
            }
            if (C1448a.m18665a(str4) && (m19557b = C1190a.m19557b()) != null) {
                str4 = m19557b.f21956a;
                str3 = m19557b.f21958c;
            }
            c1274d.f22126h = str2;
            c1274d.f22125g = str4;
            c1274d.f22128j = m18662a3;
            if (C1448a.m18665a(str2)) {
                c1274d.f22120b = str4;
                str = str3;
            } else {
                c1274d.f22120b = str2;
            }
            c1274d.f22127i = str;
            c1274d.f22124f = C1189e.m19565a(context, map);
            return C1256d.m19315b(this.f21949a, this.f21950b.m19578c()).mo19283a(c1274d);
        } catch (Throwable th) {
            C1182a.m19575a(th);
            return null;
        }
    }

    /* renamed from: b */
    public static String m19584b(Context context) {
        try {
            String m19509b = C1198i.m19509b();
            if (!C1448a.m18665a(m19509b)) {
                return m19509b;
            }
            C1192c m19549b = C1193d.m19549b(context);
            if (m19549b != null) {
                C1198i.m19512a(m19549b);
                String str = m19549b.f21959a;
                if (C1448a.m18661b(str)) {
                    return str;
                }
            }
            C1191b m19556b = C1190a.m19556b(context);
            if (m19556b == null) {
                return "";
            }
            C1198i.m19513a(m19556b);
            String str2 = m19556b.f21956a;
            return C1448a.m18661b(str2) ? str2 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static void m19585b() {
        try {
            String[] strArr = {"device_feature_file_name", "wallet_times", "wxcasxx_v3", "wxcasxx_v4", "wxxzyy_v1"};
            int i = 0;
            while (true) {
                File file = new File(C116971W2r.LIZIZ(), C0002O.m25086C(".SystemConfig/", strArr[i]));
                if (file.exists() && file.canWrite()) {
                    C116971W2r.LIZ(file);
                }
                i++;
                if (i >= 5) {
                    return;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
        if (com.alipay.sdk.p082m.p125z.C1448a.m18664a(r7, com.alipay.apmobilesecuritysdk.p080e.C1198i.m19505d()) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
        if (com.alipay.sdk.p082m.p125z.C1448a.m18664a(r1, com.alipay.apmobilesecuritysdk.p080e.C1198i.m19503e()) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00b1, code lost:
        if (com.alipay.sdk.p082m.p125z.C1448a.m18665a(m19584b(r8.f21949a)) == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e9 A[Catch: Exception -> 0x021d, TryCatch #0 {Exception -> 0x021d, blocks: (B:3:0x0006, B:5:0x0036, B:7:0x003e, B:9:0x0052, B:11:0x0060, B:13:0x006a, B:15:0x0070, B:17:0x007a, B:19:0x0082, B:21:0x008e, B:25:0x00b6, B:27:0x00c8, B:29:0x00e0, B:35:0x01b5, B:36:0x01bd, B:39:0x01cf, B:41:0x01e9, B:43:0x01ef, B:45:0x01f5, B:47:0x01fb, B:49:0x0201, B:55:0x00f0, B:57:0x0140, B:59:0x014a, B:60:0x014d, B:62:0x015a, B:64:0x0164, B:65:0x0167, B:66:0x01a8, B:67:0x01ad, B:71:0x009b, B:73:0x00a7), top: B:2:0x0006 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m19586a(java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.apmobilesecuritysdk.p076a.C1180a.m19586a(java.util.Map):int");
    }
}
