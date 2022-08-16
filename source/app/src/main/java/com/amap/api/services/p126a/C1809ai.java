package com.amap.api.services.p126a;

import android.content.Context;
import com.alipay.sdk.p082m.p121u.C1394i;
import com.amap.api.services.core.AMapException;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.ai */
/* loaded from: classes19.dex */
public class C1809ai {

    /* renamed from: a */
    public static C1979dq f24236a;

    static {
        Covode.recordClassIndex(5420);
    }

    /* renamed from: a */
    public static String m17075a(AMapException aMapException) {
        if (aMapException != null) {
            if (aMapException.getErrorLevel() == 0) {
                int errorCode = aMapException.getErrorCode();
                if (errorCode == 0) {
                    return "4";
                }
                int pow = (int) Math.pow(10.0d, Math.floor(Math.log10(errorCode)));
                int i = (errorCode % pow) + (pow * 4);
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aMapException.getErrorCode());
            return sb2.toString();
        }
        return null;
    }

    /* renamed from: a */
    public static void m17073a(String str, String str2, AMapException aMapException) {
        if (str != null && aMapException != null) {
            String errorType = aMapException.getErrorType();
            String m17075a = m17075a(aMapException);
            if (m17075a != null && m17075a.length() > 0) {
                C1906cb.m16725a(C2006i.m16379a(true), str, errorType, str2, m17075a);
            }
        }
    }

    /* renamed from: a */
    public static String m17074a(String str, long j, boolean z) {
        try {
            new StringBuilder();
            return C0002O.m25080C("{", "\"RequestPath\":\"", str, C1394i.f22426f, Constants.ACCEPT_TIME_SEPARATOR_SP, "\"ResponseTime\":", Long.valueOf(j), Constants.ACCEPT_TIME_SEPARATOR_SP, "\"Success\":", Boolean.valueOf(z), "}");
        } catch (Throwable th) {
            C2007j.m16371a(th, "StatisticsUtil", "generateNetWorkResponseStatisticsEntity");
            return null;
        }
    }

    /* renamed from: a */
    public static void m17076a(Context context, String str, long j, boolean z) {
        try {
            String m17074a = m17074a(str, j, z);
            if (m17074a != null && m17074a.length() > 0) {
                if (f24236a == null) {
                    f24236a = new C1979dq(context, "sea", "7.1.0", "O002");
                }
                f24236a.m16426a(m17074a);
                C1980dr.m16421a(f24236a, context);
            }
        } catch (Throwable th) {
            C2007j.m16371a(th, "StatisticsUtil", "recordResponseAction");
        }
    }
}
