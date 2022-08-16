package com.alipay.sdk.p082m.p113p;

import android.text.TextUtils;
import com.alipay.sdk.p082m.p121u.C1394i;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.sdk.m.p.a */
/* loaded from: classes.dex */
public class C1350a {
    static {
        Covode.recordClassIndex(4850);
    }

    /* renamed from: c */
    public static String m19025c(String str) {
        if (!str.contains("app_userid")) {
            return null;
        }
        return m19026b(str);
    }

    /* renamed from: d */
    public static String m19024d(String str) {
        if (!str.contains("biz_no")) {
            return null;
        }
        return m19026b(str);
    }

    /* renamed from: e */
    public static String m19023e(String str) {
        if (!str.contains("biz_type")) {
            return null;
        }
        return m19026b(str);
    }

    /* renamed from: b */
    public static String m19026b(String str) {
        String[] split = str.split("=");
        if (split.length > 1) {
            String str2 = split[1];
            if (str2.contains(C1394i.f22426f)) {
                return str2.replaceAll(C1394i.f22426f, "");
            }
            return str2;
        }
        return null;
    }

    /* renamed from: f */
    public static String m19022f(String str) {
        if (str.contains("trade_no") && !str.startsWith("out_trade_no")) {
            return m19026b(str);
        }
        return null;
    }

    /* renamed from: a */
    public static String m19027a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split("&");
        if (split.length == 0) {
            return "";
        }
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        for (String str6 : split) {
            if (TextUtils.isEmpty(str2)) {
                str2 = m19023e(str6);
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = m19024d(str6);
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = m19022f(str6);
            }
            if (TextUtils.isEmpty(str5)) {
                str5 = m19025c(str6);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str2)) {
            sb.append("biz_type=" + str2 + ";");
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append("biz_no=" + str3 + ";");
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append("trade_no=" + str4 + ";");
        }
        if (!TextUtils.isEmpty(str5)) {
            sb.append("app_userid=" + str5 + ";");
        }
        String sb2 = sb.toString();
        if (sb2.endsWith(";")) {
            return sb2.substring(0, sb2.length() - 1);
        }
        return sb2;
    }
}
