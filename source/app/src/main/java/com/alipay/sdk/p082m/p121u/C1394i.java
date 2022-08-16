package com.alipay.sdk.p082m.p121u;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.p082m.p103k.C1301a;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;

/* renamed from: com.alipay.sdk.m.u.i */
/* loaded from: classes2.dex */
public class C1394i {

    /* renamed from: f */
    public static final String f22426f = "\"";

    /* renamed from: g */
    public static final String f22427g = "trade_token=";

    static {
        Covode.recordClassIndex(4894);
    }

    /* renamed from: a */
    public static String m18834a(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(";");
        for (int i = 0; i < split.length; i++) {
            if (split[i].startsWith("result={") && split[i].endsWith("}")) {
                String[] split2 = split[i].substring(8, split[i].length() - 1).split("&");
                int i2 = 0;
                while (true) {
                    if (i2 >= split2.length) {
                        break;
                    } else if (split2[i2].startsWith("trade_token=\"") && split2[i2].endsWith(f22426f)) {
                        str2 = split2[i2].substring(13, split2[i2].length() - 1);
                        break;
                    } else if (split2[i2].startsWith(f22427g)) {
                        str2 = split2[i2].substring(12);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        return str2;
    }

    /* renamed from: a */
    public static String m18836a(C1376a c1376a, Context context) {
        String m18831a = C1395j.m18831a(c1376a, context, "pref_trade_token", "");
        C1385e.m18865b("mspl", C0002O.m25086C("get trade token: ", m18831a));
        return m18831a;
    }

    /* renamed from: a */
    public static void m18835a(C1376a c1376a, Context context, String str) {
        try {
            String m18834a = m18834a(str);
            C1385e.m18865b("mspl", C0002O.m25086C("trade token: ", m18834a));
            if (!TextUtils.isEmpty(m18834a)) {
                C1395j.m18829b(c1376a, context, "pref_trade_token", m18834a);
            }
        } catch (Throwable th) {
            C1301a.m19215a(c1376a, "biz", "SaveTradeTokenError", th);
            C1385e.m18866a(th);
        }
    }
}
