package com.alibaba.sdk.android.httpdns;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.umeng.message.proguard.C34037f;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.alibaba.sdk.android.httpdns.q */
/* loaded from: classes19.dex */
public class CallableC1100q implements Callable<String[]> {

    /* renamed from: a */
    public static Context f21671a;

    /* renamed from: a */
    public EnumC1102s f21673a;
    public String hostName;

    /* renamed from: j */
    public boolean f21677j;

    /* renamed from: k */
    public String f21678k;

    /* renamed from: l */
    public String f21679l;
    public static C1046d hostManager = C1046d.m19936a();

    /* renamed from: a */
    public static final Object f21672a = new Object();

    /* renamed from: d */
    public int f21674d = 1;

    /* renamed from: e */
    public String[] f21676e = C1071f.f21608c;
    public Map<String, String> extra = new HashMap();

    /* renamed from: d */
    public long f21675d = 0;

    static {
        Covode.recordClassIndex(4509);
    }

    public CallableC1100q(String str, EnumC1102s enumC1102s) {
        this.hostName = str;
        this.f21673a = enumC1102s;
    }

    public CallableC1100q(String str, EnumC1102s enumC1102s, Map<String, String> map, String str2) {
        this.hostName = str;
        this.f21673a = enumC1102s;
        this.f21679l = str2;
        this.extra.putAll(map);
    }

    /* renamed from: d */
    private boolean m19827d(String str) {
        return str.matches("[a-zA-Z0-9\\-_]+");
    }

    /* renamed from: e */
    private boolean m19826e(String str) {
        return str.matches("[a-zA-Z0-9\\-_=]+");
    }

    private String getExtra() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        Map<String, String> map = this.extra;
        boolean z2 = true;
        if (map != null) {
            z = true;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append("&sdns-");
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(URLEncoder.encode(entry.getValue(), C34037f.f43302f));
                if (!m19827d(entry.getKey())) {
                    C1074i.m19880f("设置自定义参数失败，自定义key不合法：" + entry.getKey());
                    z2 = false;
                }
                if (!m19826e(entry.getValue())) {
                    C1074i.m19880f("设置自定义参数失败，自定义value不合法：" + entry.getValue());
                    z = false;
                }
            }
        } else {
            z = true;
        }
        if (z2 && z) {
            String sb2 = sb.toString();
            if (sb2.getBytes(C34037f.f43302f).length <= 1000) {
                return sb2;
            }
            C1074i.m19880f("设置自定义参数失败，自定义参数过长");
        }
        return "";
    }

    public static void setContext(Context context) {
        f21671a = context;
    }

    /* renamed from: a */
    public void m19828a(int i) {
        if (i >= 0) {
            this.f21674d = i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x039d A[Catch: all -> 0x03ca, TryCatch #3 {all -> 0x03ca, blocks: (B:73:0x038f, B:75:0x039d, B:82:0x03a6), top: B:72:0x038f }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03b3 A[Catch: IOException -> 0x03bc, TRY_ENTER, TryCatch #6 {IOException -> 0x03bc, blocks: (B:27:0x036f, B:29:0x0374, B:79:0x03b3, B:81:0x03b8), top: B:19:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03b8 A[Catch: IOException -> 0x03bc, TRY_LEAVE, TryCatch #6 {IOException -> 0x03bc, blocks: (B:27:0x036f, B:29:0x0374, B:79:0x03b3, B:81:0x03b8), top: B:19:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03a6 A[Catch: all -> 0x03ca, TryCatch #3 {all -> 0x03ca, blocks: (B:73:0x038f, B:75:0x039d, B:82:0x03a6), top: B:72:0x038f }] */
    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String[] call() {
        /*
            Method dump skipped, instructions count: 992
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.CallableC1100q.call():java.lang.String[]");
    }
}
