package com.alipay.sdk.p082m.p121u;

import com.alipay.sdk.p082m.p101j.EnumC1296c;
import com.alipay.sdk.p082m.p103k.C1301a;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.u.l */
/* loaded from: classes2.dex */
public class C1397l {
    static {
        Covode.recordClassIndex(4897);
    }

    /* renamed from: a */
    public static Map<String, String> m18825a() {
        EnumC1296c m19229b = EnumC1296c.m19229b(EnumC1296c.CANCELED.m19230b());
        HashMap hashMap = new HashMap();
        hashMap.put("resultStatus", Integer.toString(m19229b.m19230b()));
        hashMap.put("memo", m19229b.m19233a());
        hashMap.put("result", "");
        return hashMap;
    }

    /* renamed from: a */
    public static Map<String, String> m18823a(String str) {
        String[] split = str.split(";");
        HashMap hashMap = new HashMap();
        for (String str2 : split) {
            String substring = str2.substring(0, str2.indexOf("={"));
            hashMap.put(substring, m18821b(str2, substring));
        }
        return hashMap;
    }

    /* renamed from: a */
    public static Map<String, String> m18824a(C1376a c1376a, String str) {
        Map<String, String> m18825a = m18825a();
        try {
            m18825a = m18823a(str);
            return m18825a;
        } catch (Throwable th) {
            C1301a.m19215a(c1376a, "biz", "FormatResultEx", th);
            return m18825a;
        }
    }

    /* renamed from: b */
    public static String m18821b(String str, String str2) {
        new StringBuilder();
        String m25086C = C0002O.m25086C(str2, "={");
        return str.substring(str.indexOf(m25086C) + m25086C.length(), str.lastIndexOf("}"));
    }

    /* renamed from: a */
    public static String m18822a(String str, String str2) {
        try {
            Matcher matcher = C116971W2r.LIZJ(C0002O.m25085C("(^|;)", str2, "=\\{([^}]*?)\\}")).matcher(str);
            if (matcher.find()) {
                return matcher.group(2);
            }
            return "?";
        } catch (Throwable th) {
            C1385e.m18866a(th);
            return "?";
        }
    }
}
